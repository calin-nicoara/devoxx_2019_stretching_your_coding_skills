package org.cni.salaryslip;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class SalarySlipGeneratorShould {

    @Test
    public void task1() {
        String name = "John Doe";
        BigDecimal annualGrossSalary = BigDecimal.valueOf(24000);

        final SalarySlipGenerator salarySlipGenerator = new SalarySlipGenerator();

        final SalarySlip salarySlip = salarySlipGenerator.generateMonthlyPaySlip(name, annualGrossSalary);

        Assert.assertEquals(salarySlip.getId(), Long.valueOf(12345L));
        Assert.assertEquals(salarySlip.getName(), name);
        Assert.assertEquals(salarySlip.getGrossSalary(), BigDecimal.valueOf(2000));
        Assert.assertEquals(salarySlip.getNationInsuranceContributions(), BigDecimal.valueOf(159.40));
        Assert.assertEquals(salarySlip.getTaxFreeAlowance(), BigDecimal.valueOf(916.67));
        Assert.assertEquals(salarySlip.getTaxableIncome(), BigDecimal.valueOf(1083.33));
        Assert.assertEquals(salarySlip.getTaxPayable(), BigDecimal.valueOf(216.67));
    }
}
