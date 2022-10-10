package com.market.company.commands;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeleteCompanyCommand {

	private Long id;
	private String companyCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public DeleteCompanyCommand(Long id,String companyCode) {
		super();
		this.id = id;
		this.companyCode = companyCode;
	}

	
	
}
