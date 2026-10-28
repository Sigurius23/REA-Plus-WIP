package w23;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32309k;
import x23.EnumC37870f;

/* JADX INFO: renamed from: w23.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C36750h {

    /* JADX INFO: renamed from: a */
    public final AbstractC32309k f157281a;

    /* JADX INFO: renamed from: b */
    public final String f157282b;

    /* JADX INFO: renamed from: c */
    public final String f157283c;

    /* JADX INFO: renamed from: d */
    public final EnumC37870f f157284d;

    /* JADX INFO: renamed from: e */
    public final String f157285e;

    public C36750h(AbstractC32309k abstractC32309k, String str, String str2, EnumC37870f joinStage, String str3) {
        AbstractC22676k.m65750j(joinStage, "joinStage");
        this.f157281a = abstractC32309k;
        this.f157282b = str;
        this.f157283c = str2;
        this.f157284d = joinStage;
        this.f157285e = str3;
    }

    /* JADX INFO: renamed from: a */
    public static C36750h m117871a(C36750h c36750h, AbstractC32309k abstractC32309k, String str, String str2, EnumC37870f enumC37870f, String str3, int i13) {
        if ((i13 & 1) != 0) {
            abstractC32309k = c36750h.f157281a;
        }
        AbstractC32309k abstractC32309k2 = abstractC32309k;
        if ((i13 & 2) != 0) {
            str = c36750h.f157282b;
        }
        String str4 = str;
        if ((i13 & 4) != 0) {
            str2 = c36750h.f157283c;
        }
        String stageId = str2;
        if ((i13 & 8) != 0) {
            enumC37870f = c36750h.f157284d;
        }
        EnumC37870f joinStage = enumC37870f;
        if ((i13 & 16) != 0) {
            str3 = c36750h.f157285e;
        }
        c36750h.getClass();
        AbstractC22676k.m65750j(stageId, "stageId");
        AbstractC22676k.m65750j(joinStage, "joinStage");
        return new C36750h(abstractC32309k2, str4, stageId, joinStage, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36750h)) {
            return false;
        }
        C36750h c36750h = (C36750h) obj;
        return AbstractC22676k.m65745e(this.f157281a, c36750h.f157281a) && AbstractC22676k.m65745e(this.f157282b, c36750h.f157282b) && AbstractC22676k.m65745e(this.f157283c, c36750h.f157283c) && this.f157284d == c36750h.f157284d && AbstractC22676k.m65745e(this.f157285e, c36750h.f157285e);
    }

    public final int hashCode() {
        AbstractC32309k abstractC32309k = this.f157281a;
        int iHashCode = (abstractC32309k == null ? 0 : abstractC32309k.hashCode()) * 31;
        String str = this.f157282b;
        return this.f157285e.hashCode() + ((this.f157284d.hashCode() + AbstractC11266d.m30450d((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f157283c)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("JoinTelemetryState(joinReason=");
        sb4.append(this.f157281a);
        sb4.append(", joinStageAttemptId=");
        sb4.append(this.f157282b);
        sb4.append(", stageId=");
        sb4.append(this.f157283c);
        sb4.append(", joinStage=");
        sb4.append(this.f157284d);
        sb4.append(", callSessionId=");
        return AbstractC25012a.m73376i(this.f157285e, ")", sb4);
    }
}
