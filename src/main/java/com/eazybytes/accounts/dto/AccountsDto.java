package com.eazybytes.accounts.dto;
import com.eazybytes.accounts.entity.BaseEntity;
import lombok.Data;

@Data
public class AccountsDto extends BaseEntity {
    private Long customerId;
    private Long accountNumber;
    private String accountType;
    private String branchAddress;

}
