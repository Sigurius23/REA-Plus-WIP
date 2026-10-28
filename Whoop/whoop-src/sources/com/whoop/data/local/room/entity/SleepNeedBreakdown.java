package com.whoop.data.local.room.entity;

import or2.C28221z1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\bR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R$\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013¨\u0006 "}, m65681d2 = {"Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;", "", "<init>", "()V", "sleepNeedBreakdown", "(Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;)V", "Lor2/z1;", "getBaselineDuration", "()Lor2/z1;", "getDebtDuration", "getNapsDuration", "getStrainDuration", "getTotalDuration", "", "baseline", "Ljava/lang/Double;", "getBaseline", "()Ljava/lang/Double;", "setBaseline", "(Ljava/lang/Double;)V", "debt", "getDebt", "setDebt", "naps", "getNaps", "setNaps", "strain", "getStrain", "setStrain", "total", "getTotal", "setTotal", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SleepNeedBreakdown {
    private Double baseline;
    private Double debt;
    private Double naps;
    private Double strain;
    private Double total;

    public SleepNeedBreakdown() {
    }

    public final Double getBaseline() {
        return this.baseline;
    }

    public final C28221z1 getBaselineDuration() {
        Double d3 = this.baseline;
        if (d3 != null) {
            return new C28221z1(d3.doubleValue()).m85450a();
        }
        return null;
    }

    public final Double getDebt() {
        return this.debt;
    }

    public final C28221z1 getDebtDuration() {
        Double d3 = this.debt;
        if (d3 != null) {
            return new C28221z1(d3.doubleValue()).m85450a();
        }
        return null;
    }

    public final Double getNaps() {
        return this.naps;
    }

    public final C28221z1 getNapsDuration() {
        Double d3 = this.naps;
        if (d3 != null) {
            return new C28221z1(d3.doubleValue()).m85450a();
        }
        return null;
    }

    public final Double getStrain() {
        return this.strain;
    }

    public final C28221z1 getStrainDuration() {
        Double d3 = this.strain;
        if (d3 != null) {
            return new C28221z1(d3.doubleValue()).m85450a();
        }
        return null;
    }

    public final Double getTotal() {
        return this.total;
    }

    public final C28221z1 getTotalDuration() {
        Double d3 = this.total;
        if (d3 != null) {
            return new C28221z1(d3.doubleValue()).m85450a();
        }
        return null;
    }

    public final void setBaseline(Double d3) {
        this.baseline = d3;
    }

    public final void setDebt(Double d3) {
        this.debt = d3;
    }

    public final void setNaps(Double d3) {
        this.naps = d3;
    }

    public final void setStrain(Double d3) {
        this.strain = d3;
    }

    public final void setTotal(Double d3) {
        this.total = d3;
    }

    public SleepNeedBreakdown(SleepNeedBreakdown sleepNeedBreakdown) {
        AbstractC22676k.m65750j(sleepNeedBreakdown, "sleepNeedBreakdown");
        this.baseline = sleepNeedBreakdown.baseline;
        this.debt = sleepNeedBreakdown.debt;
        this.naps = sleepNeedBreakdown.naps;
        this.strain = sleepNeedBreakdown.strain;
        this.total = sleepNeedBreakdown.total;
    }
}
