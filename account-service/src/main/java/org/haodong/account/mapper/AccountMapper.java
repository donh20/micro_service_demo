package org.haodong.account.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.haodong.dto.AccountDto;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface AccountMapper {
    @Select("select * from accounts")
    List<AccountDto> findAllAccounts();

    @Select("select * from accounts where id = #{id}")
    AccountDto findAccountById(@Param("id") Integer id);

    @Update("update accounts set balance = balance - #{value} where id = #{id}")
    int processBalance(@Param("id") int id, @Param("value") BigDecimal value);

}
