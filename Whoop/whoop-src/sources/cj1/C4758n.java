package cj1;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cj1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lcj1/n;", "", "", "shepherdHighWaterMark", "labradorHighWaterMark", "Lcj1/w;", "shepherdState", "Lcj1/s;", "labradorState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcj1/w;Lcj1/s;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getShepherdHighWaterMark", "b", "getLabradorHighWaterMark", "c", "Lcj1/w;", "getShepherdState", "()Lcj1/w;", "d", "Lcj1/s;", "getLabradorState", "()Lcj1/s;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4758n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String shepherdHighWaterMark;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String labradorHighWaterMark;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC4767w shepherdState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC4763s labradorState;

    public C4758n(String str, String str2, EnumC4767w enumC4767w, EnumC4763s enumC4763s) {
        this.shepherdHighWaterMark = str;
        this.labradorHighWaterMark = str2;
        this.shepherdState = enumC4767w;
        this.labradorState = enumC4763s;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4758n)) {
            return false;
        }
        C4758n c4758n = (C4758n) other;
        return AbstractC22676k.m65745e(this.shepherdHighWaterMark, c4758n.shepherdHighWaterMark) && AbstractC22676k.m65745e(this.labradorHighWaterMark, c4758n.labradorHighWaterMark) && this.shepherdState == c4758n.shepherdState && this.labradorState == c4758n.labradorState;
    }

    public int hashCode() {
        String str = this.shepherdHighWaterMark;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.labradorHighWaterMark;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC4767w enumC4767w = this.shepherdState;
        int iHashCode3 = (iHashCode2 + (enumC4767w == null ? 0 : enumC4767w.hashCode())) * 31;
        EnumC4763s enumC4763s = this.labradorState;
        return iHashCode3 + (enumC4763s != null ? enumC4763s.hashCode() : 0);
    }

    public String toString() {
        String str = this.shepherdHighWaterMark;
        String str2 = this.labradorHighWaterMark;
        EnumC4767w enumC4767w = this.shepherdState;
        EnumC4763s enumC4763s = this.labradorState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HeartScreenerUpdatedAtInfoViewState(shepherdHighWaterMark=", str, ", labradorHighWaterMark=", str2, ", shepherdState=");
        sbM32001t.append(enumC4767w);
        sbM32001t.append(", labradorState=");
        sbM32001t.append(enumC4763s);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
