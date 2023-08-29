package org.haodong.account.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.haodong.dto.AccountDto;

import java.util.List;

@Mapper
public interface AccountMapper {
    @Select("select * from accounts")
    List<AccountDto> findAllAccounts();

}
