package org.cni.salaryslip;

import java.math.BigDecimal;
import java.util.Objects;

public class SalarySlip {
    private Long id;
    private String name;
    private BigDecimal grossSalary;
    private BigDecimal nationInsuranceContributions;
    private BigDecimal taxFreeAlowance;
    private BigDecimal taxableIncome;
    private BigDecimal taxPayable;

    public SalarySlip(final Long id, final String name,
                      final BigDecimal grossSalary,
                      final BigDecimal nationInsuranceContributions,
                      final BigDecimal taxFreeAlowance,
                      final BigDecimal taxableIncome, final BigDecimal taxPayable) {
        this.id = id;
        this.name = name;
        this.grossSalary = grossSalary;
        this.nationInsuranceContributions = nationInsuranceContributions;
        this.taxFreeAlowance = taxFreeAlowance;
        this.taxableIncome = taxableIncome;
        this.taxPayable = taxPayable;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(final BigDecimal grossSalary) {
        this.grossSalary = grossSalary;
    }

    public BigDecimal getNationInsuranceContributions() {
        return nationInsuranceContributions;
    }

    public void setNationInsuranceContributions(final BigDecimal nationInsuranceContributions) {
        this.nationInsuranceContributions = nationInsuranceContributions;
    }

    public BigDecimal getTaxFreeAlowance() {
        return taxFreeAlowance;
    }

    public void setTaxFreeAlowance(final BigDecimal taxFreeAlowance) {
        this.taxFreeAlowance = taxFreeAlowance;
    }

    public BigDecimal getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(final BigDecimal taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public BigDecimal getTaxPayable() {
        return taxPayable;
    }

    public void setTaxPayable(final BigDecimal taxPayable) {
        this.taxPayable = taxPayable;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final SalarySlip that = (SalarySlip) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(grossSalary, that.grossSalary) &&
                Objects.equals(nationInsuranceContributions, that.nationInsuranceContributions) &&
                Objects.equals(taxFreeAlowance, that.taxFreeAlowance) &&
                Objects.equals(taxableIncome, that.taxableIncome) &&
                Objects.equals(taxPayable, that.taxPayable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grossSalary, nationInsuranceContributions, taxFreeAlowance, taxableIncome, taxPayable);
    }
}
