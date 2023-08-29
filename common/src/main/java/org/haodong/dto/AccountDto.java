package org.haodong.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//开启链式返回 new AccountDto().setId().setName().setBalance();
public class AccountDto {
    private Integer id;
    private String name;
    private BigDecimal balance;
}
