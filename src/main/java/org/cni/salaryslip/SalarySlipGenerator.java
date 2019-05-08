package org.cni.salaryslip;

import java.math.BigDecimal;

public class SalarySlipGenerator {

    public SalarySlip generateMonthlyPaySlip(final String name, final BigDecimal annualGrossSalary) {
        final SalarySlip salarySlip = new SalarySlip();
        salarySlip.setId(12345L);
        salarySlip.setName(name);
        salarySlip.setGrossSalary(BigDecimal.valueOf(2000));
        salarySlip.setNationInsuranceContributions(BigDecimal.valueOf(159.40));
        salarySlip.setTaxFreeAlowance(BigDecimal.valueOf(916.67));
        salarySlip.setTaxableIncome(BigDecimal.valueOf(1083.33));
        salarySlip.setTaxPayable(BigDecimal.valueOf(216.67));

        return salarySlip;
    }
}
