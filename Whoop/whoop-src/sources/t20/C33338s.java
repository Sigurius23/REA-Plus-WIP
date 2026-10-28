package t20;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: t20.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C33338s implements InterfaceC33340u {

    /* JADX INFO: renamed from: a */
    public final String f139080a;

    /* JADX INFO: renamed from: b */
    public final String f139081b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38802c8 f139082c;

    public C33338s(String str, String str2, InterfaceC38802c8 interfaceC38802c8) {
        this.f139080a = str;
        this.f139081b = str2;
        this.f139082c = interfaceC38802c8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33338s)) {
            return false;
        }
        C33338s c33338s = (C33338s) obj;
        return AbstractC22676k.m65745e(this.f139080a, c33338s.f139080a) && AbstractC22676k.m65745e(this.f139081b, c33338s.f139081b) && AbstractC22676k.m65745e(this.f139082c, c33338s.f139082c);
    }

    public final int hashCode() {
        int iHashCode = this.f139080a.hashCode() * 31;
        String str = this.f139081b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC38802c8 interfaceC38802c8 = this.f139082c;
        return iHashCode2 + (interfaceC38802c8 != null ? interfaceC38802c8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Finished(result=", this.f139080a, ", linkAccountSessionId=", this.f139081b, ", intent=");
        sbM32001t.append(this.f139082c);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
