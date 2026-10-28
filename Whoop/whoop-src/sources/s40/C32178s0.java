package s40;

import m30.C24991g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s40.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32178s0 {

    /* JADX INFO: renamed from: a */
    public final String f133265a;

    /* JADX INFO: renamed from: b */
    public final C24991g f133266b;

    public C32178s0(String str, C24991g toolbarCustomization) {
        AbstractC22676k.m65750j(toolbarCustomization, "toolbarCustomization");
        this.f133265a = str;
        this.f133266b = toolbarCustomization;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32178s0)) {
            return false;
        }
        C32178s0 c32178s0 = (C32178s0) obj;
        return AbstractC22676k.m65745e(this.f133265a, c32178s0.f133265a) && AbstractC22676k.m65745e(this.f133266b, c32178s0.f133266b);
    }

    public final int hashCode() {
        return this.f133266b.hashCode() + (this.f133265a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolbarTitleData(text=" + this.f133265a + ", toolbarCustomization=" + this.f133266b + ")";
    }
}
