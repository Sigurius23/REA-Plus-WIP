package p108e4;

import f93.AbstractC14290b;
import j93.InterfaceC21493z;
import p005a3.C0237p;
import p210i4.AbstractC18061c;
import p210i4.C18063e;
import p210i4.C18065g;
import p636y3.C39174f;
import p715kotlin.jvm.internal.AbstractC22676k;
import xa3.C38151l;

/* JADX INFO: renamed from: e4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12669c extends AbstractC14290b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43319w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f43320x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12669c(Object obj, C38151l c38151l) {
        super(obj);
        this.f43320x = c38151l;
    }

    @Override // f93.AbstractC14290b
    public void afterChange(InterfaceC21493z interfaceC21493z, Object obj, Object obj2) {
        AbstractC18061c abstractC18061cM698c;
        switch (this.f43319w) {
            case 0:
                C12680n c12680n = (C12680n) obj2;
                C18065g c18065g = ((C12671e) this.f43320x).f43325b;
                String name = interfaceC21493z.getName();
                AbstractC22676k.m65748h(c12680n, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
                C0237p c0237p = c12680n.f43363a;
                C0237p c0237p2 = c12680n.f43365c;
                C0237p c0237p3 = c12680n.f43364b;
                if (((C39174f) c0237p3.f812x) == null && ((String) c0237p3.f813y) == null && ((C39174f) c0237p2.f812x) == null && ((String) c0237p2.f813y) == null) {
                    abstractC18061cM698c = c0237p.m698c();
                } else {
                    C18065g c18065g2 = new C18065g(new char[0]);
                    if (((C39174f) c0237p3.f812x) != null || ((String) c0237p3.f813y) != null) {
                        c18065g2.m51891B("min", c0237p3.m698c());
                    }
                    if (((C39174f) c0237p2.f812x) != null || ((String) c0237p2.f813y) != null) {
                        c18065g2.m51891B("max", c0237p2.m698c());
                    }
                    c18065g2.m51891B("value", c0237p.m698c());
                    abstractC18061cM698c = c18065g2;
                }
                c18065g.m51891B(name, abstractC18061cM698c);
                break;
            case 1:
                float f13 = ((C39174f) obj).f168413w;
                float f14 = ((C39174f) obj2).f168413w;
                if (!Float.isNaN(f14)) {
                    ((C12671e) this.f43320x).f43325b.m51891B(interfaceC21493z.getName(), new C18063e(f14));
                }
                break;
            default:
                super.afterChange(interfaceC21493z, obj, obj2);
                break;
        }
    }

    @Override // f93.AbstractC14290b
    public boolean beforeChange(InterfaceC21493z property, Object obj, Object obj2) {
        switch (this.f43319w) {
            case 2:
                AbstractC22676k.m65750j(property, "property");
                if (((C38151l) this.f43320x).f163366a) {
                    throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
                }
                return true;
            default:
                return super.beforeChange(property, obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12669c(C12671e c12671e, C12680n c12680n) {
        super(c12680n);
        this.f43320x = c12671e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12669c(C12671e c12671e, float f13) {
        super(new C39174f(f13));
        this.f43320x = c12671e;
    }
}
