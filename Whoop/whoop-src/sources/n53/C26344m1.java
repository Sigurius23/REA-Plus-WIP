package n53;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.m1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26344m1 {

    /* JADX INFO: renamed from: a */
    public final String f104674a;

    /* JADX INFO: renamed from: b */
    public final String f104675b;

    /* JADX INFO: renamed from: c */
    public final String f104676c;

    /* JADX INFO: renamed from: d */
    public final String f104677d;

    /* JADX INFO: renamed from: e */
    public final String f104678e;

    public C26344m1(String filterMode, String netType, String addressTypes, String destAddress, String srcList) {
        AbstractC22676k.m65750j(filterMode, "filterMode");
        AbstractC22676k.m65750j(netType, "netType");
        AbstractC22676k.m65750j(addressTypes, "addressTypes");
        AbstractC22676k.m65750j(destAddress, "destAddress");
        AbstractC22676k.m65750j(srcList, "srcList");
        this.f104674a = filterMode;
        this.f104675b = netType;
        this.f104676c = addressTypes;
        this.f104677d = destAddress;
        this.f104678e = srcList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26344m1)) {
            return false;
        }
        C26344m1 c26344m1 = (C26344m1) obj;
        return AbstractC22676k.m65745e(this.f104674a, c26344m1.f104674a) && AbstractC22676k.m65745e(this.f104675b, c26344m1.f104675b) && AbstractC22676k.m65745e(this.f104676c, c26344m1.f104676c) && AbstractC22676k.m65745e(this.f104677d, c26344m1.f104677d) && AbstractC22676k.m65745e(this.f104678e, c26344m1.f104678e);
    }

    public final int hashCode() {
        return this.f104678e.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f104674a.hashCode() * 31, 31, this.f104675b), 31, this.f104676c), 31, this.f104677d);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SdpSourcefilter(filterMode=", this.f104674a, ", netType=", this.f104675b, ", addressTypes=");
        AbstractC11266d.m30444B(sbM32001t, this.f104676c, ", destAddress=", this.f104677d, ", srcList=");
        return AbstractC25012a.m73376i(this.f104678e, ")", sbM32001t);
    }
}
