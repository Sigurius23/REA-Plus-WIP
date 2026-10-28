package qc3;

import p715kotlin.jvm.internal.AbstractC22676k;
import uc3.InterfaceC34764b;

/* JADX INFO: renamed from: qc3.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C30276v implements InterfaceC34764b {

    /* JADX INFO: renamed from: a */
    public Boolean f123829a;

    /* JADX INFO: renamed from: b */
    public Integer f123830b;

    /* JADX INFO: renamed from: c */
    public Integer f123831c;

    /* JADX INFO: renamed from: d */
    public Integer f123832d;

    public C30276v(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.f123829a = bool;
        this.f123830b = num;
        this.f123831c = num2;
        this.f123832d = num3;
    }

    @Override // uc3.InterfaceC34764b
    /* JADX INFO: renamed from: a */
    public final Object mo92535a() {
        return new C30276v(this.f123829a, this.f123830b, this.f123831c, this.f123832d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C30276v)) {
            return false;
        }
        C30276v c30276v = (C30276v) obj;
        return AbstractC22676k.m65745e(this.f123829a, c30276v.f123829a) && AbstractC22676k.m65745e(this.f123830b, c30276v.f123830b) && AbstractC22676k.m65745e(this.f123831c, c30276v.f123831c) && AbstractC22676k.m65745e(this.f123832d, c30276v.f123832d);
    }

    public final int hashCode() {
        Boolean bool = this.f123829a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.f123830b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.f123831c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.f123832d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder();
        Boolean bool = this.f123829a;
        if (bool != null) {
            str = bool.booleanValue() ? "-" : "+";
        } else {
            str = " ";
        }
        sb4.append(str);
        Object obj = this.f123830b;
        if (obj == null) {
            obj = "??";
        }
        sb4.append(obj);
        sb4.append(':');
        Object obj2 = this.f123831c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb4.append(obj2);
        sb4.append(':');
        Integer num = this.f123832d;
        sb4.append(num != null ? num : "??");
        return sb4.toString();
    }
}
