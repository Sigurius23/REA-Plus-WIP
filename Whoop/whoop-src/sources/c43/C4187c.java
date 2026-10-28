package c43;

import hc3.AbstractC17176i;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: c43.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4187c implements Serializable {

    /* JADX INFO: renamed from: E */
    public final boolean f17028E;

    /* JADX INFO: renamed from: F */
    public final boolean f17029F;

    /* JADX INFO: renamed from: G */
    public final Date f17030G;

    /* JADX INFO: renamed from: H */
    public final Date f17031H;

    /* JADX INFO: renamed from: I */
    public final Map f17032I;

    /* JADX INFO: renamed from: w */
    public final String f17033w;

    /* JADX INFO: renamed from: x */
    public final String f17034x;

    /* JADX INFO: renamed from: y */
    public final String f17035y;

    /* JADX INFO: renamed from: z */
    public final String f17036z;

    public C4187c(String cid, String type, String id4, String createdByUserId, boolean z4, boolean z13, Date date, Date date2, Map custom) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(createdByUserId, "createdByUserId");
        AbstractC22676k.m65750j(custom, "custom");
        this.f17033w = cid;
        this.f17034x = type;
        this.f17035y = id4;
        this.f17036z = createdByUserId;
        this.f17028E = z4;
        this.f17029F = z13;
        this.f17030G = date;
        this.f17031H = date2;
        this.f17032I = custom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4187c)) {
            return false;
        }
        C4187c c4187c = (C4187c) obj;
        return AbstractC22676k.m65745e(this.f17033w, c4187c.f17033w) && AbstractC22676k.m65745e(this.f17034x, c4187c.f17034x) && AbstractC22676k.m65745e(this.f17035y, c4187c.f17035y) && AbstractC22676k.m65745e(this.f17036z, c4187c.f17036z) && this.f17028E == c4187c.f17028E && this.f17029F == c4187c.f17029F && AbstractC22676k.m65745e(this.f17030G, c4187c.f17030G) && AbstractC22676k.m65745e(this.f17031H, c4187c.f17031H) && AbstractC22676k.m65745e(this.f17032I, c4187c.f17032I);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f17033w.hashCode() * 31, 31, this.f17034x), 31, this.f17035y), 31, this.f17036z), 31, this.f17028E), 31, this.f17029F);
        Date date = this.f17030G;
        int iHashCode = (iM8289b + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f17031H;
        return this.f17032I.hashCode() + ((iHashCode + (date2 != null ? date2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CallInfo(cid=", this.f17033w, ", type=", this.f17034x, ", id=");
        AbstractC11266d.m30444B(sbM32001t, this.f17035y, ", createdByUserId=", this.f17036z, ", broadcastingEnabled=");
        AbstractC38963t7.m124392v(sbM32001t, this.f17028E, ", recordingEnabled=", this.f17029F, ", createdAt=");
        AbstractC17176i.m48512n(sbM32001t, this.f17030G, ", updatedAt=", this.f17031H, ", custom=");
        return AbstractC13673n.m38565l(sbM32001t, this.f17032I, ")");
    }
}
