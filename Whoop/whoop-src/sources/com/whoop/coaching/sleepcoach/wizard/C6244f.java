package com.whoop.coaching.sleepcoach.wizard;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/f;", "", "", "entryPoint", "clickType", "sourceId", "sourcePillar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C6244f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String entryPoint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String clickType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String sourceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String sourcePillar;

    public C6244f(String entryPoint, String clickType, String str, String str2) {
        AbstractC22676k.m65750j(entryPoint, "entryPoint");
        AbstractC22676k.m65750j(clickType, "clickType");
        this.entryPoint = entryPoint;
        this.clickType = clickType;
        this.sourceId = str;
        this.sourcePillar = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClickType() {
        return this.clickType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSourcePillar() {
        return this.sourcePillar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C6244f)) {
            return false;
        }
        C6244f c6244f = (C6244f) other;
        return AbstractC22676k.m65745e(this.entryPoint, c6244f.entryPoint) && AbstractC22676k.m65745e(this.clickType, c6244f.clickType) && AbstractC22676k.m65745e(this.sourceId, c6244f.sourceId) && AbstractC22676k.m65745e(this.sourcePillar, c6244f.sourcePillar);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.entryPoint.hashCode() * 31, 31, this.clickType);
        String str = this.sourceId;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourcePillar;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.entryPoint;
        String str2 = this.clickType;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("SleepCoachWizardConductorArgs(entryPoint=", str, ", clickType=", str2, ", sourceId="), this.sourceId, ", sourcePillar=", this.sourcePillar, ")");
    }
}
