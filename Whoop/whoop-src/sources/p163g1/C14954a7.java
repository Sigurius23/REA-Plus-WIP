package p163g1;

import c93.InterfaceC4351m;
import p250jf.C21632a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.a7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14954a7 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55787w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f55788x;

    public /* synthetic */ C14954a7(Function1 function1, int i13) {
        this.f55787w = i13;
        this.f55788x = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f55787w;
        EnumC15207z1 enumC15207z1 = null;
        Function1 function1 = this.f55788x;
        switch (i13) {
            case 0:
                EnumC14960b2 enumC14960b2 = (EnumC14960b2) obj;
                EnumC14960b2 enumC14960b3 = (EnumC14960b2) obj2;
                int i14 = AbstractC14976c7.f55960a;
                if (enumC14960b2 != enumC14960b3 || enumC14960b2 != EnumC14960b2.f55823w) {
                    if (enumC14960b2 == enumC14960b3 && enumC14960b2 == EnumC14960b2.f55824x) {
                        enumC15207z1 = EnumC15207z1.f57096w;
                    } else if (enumC14960b2 == enumC14960b3 && enumC14960b2 == EnumC14960b2.f55825y) {
                        enumC15207z1 = EnumC15207z1.f57097x;
                    } else {
                        EnumC14960b2 enumC14960b4 = EnumC14960b2.f55823w;
                        if (enumC14960b2 == enumC14960b4 && enumC14960b3 == EnumC14960b2.f55824x) {
                            enumC15207z1 = EnumC15207z1.f57096w;
                        } else if (enumC14960b2 == enumC14960b4 && enumC14960b3 == EnumC14960b2.f55825y) {
                            enumC15207z1 = EnumC15207z1.f57097x;
                        } else if (enumC14960b2 == EnumC14960b2.f55824x && enumC14960b3 == enumC14960b4) {
                            enumC15207z1 = EnumC15207z1.f57096w;
                        } else if (enumC14960b2 == EnumC14960b2.f55825y && enumC14960b3 == enumC14960b4) {
                            enumC15207z1 = EnumC15207z1.f57097x;
                        }
                    }
                }
                AbstractC22676k.m65747g(enumC15207z1);
                return (InterfaceC15022g9) function1.invoke(enumC15207z1);
            default:
                String sysProp = (String) obj;
                String envVar = (String) obj2;
                AbstractC22676k.m65750j(sysProp, "sysProp");
                AbstractC22676k.m65750j(envVar, "envVar");
                return new C21632a(function1, sysProp, envVar, null);
        }
    }
}
