package qc3;

import p715kotlin.jvm.internal.AbstractC22676k;
import uc3.InterfaceC34764b;

/* JADX INFO: renamed from: qc3.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C30278w implements InterfaceC30239f1, InterfaceC34764b {

    /* JADX INFO: renamed from: a */
    public Integer f123834a;

    /* JADX INFO: renamed from: b */
    public Integer f123835b;

    public C30278w(Integer num, Integer num2) {
        this.f123834a = num;
        this.f123835b = num2;
    }

    @Override // uc3.InterfaceC34764b
    /* JADX INFO: renamed from: a */
    public final Object mo92535a() {
        return new C30278w(this.f123834a, this.f123835b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C30278w)) {
            return false;
        }
        C30278w c30278w = (C30278w) obj;
        return AbstractC22676k.m65745e(this.f123834a, c30278w.f123834a) && AbstractC22676k.m65745e(this.f123835b, c30278w.f123835b);
    }

    @Override // qc3.InterfaceC30239f1
    public final Integer getYear() {
        return this.f123834a;
    }

    public final int hashCode() {
        Integer num = this.f123834a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f123835b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // qc3.InterfaceC30239f1
    /* JADX INFO: renamed from: m */
    public final void mo92510m(Integer num) {
        this.f123835b = num;
    }

    @Override // qc3.InterfaceC30239f1
    /* JADX INFO: renamed from: r */
    public final void mo92511r(Integer num) {
        this.f123834a = num;
    }

    @Override // qc3.InterfaceC30239f1
    /* JADX INFO: renamed from: s */
    public final Integer mo92512s() {
        return this.f123835b;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        Object obj = this.f123834a;
        if (obj == null) {
            obj = "??";
        }
        sb4.append(obj);
        sb4.append('-');
        Integer num = this.f123835b;
        sb4.append(num != null ? num : "??");
        return sb4.toString();
    }
}
