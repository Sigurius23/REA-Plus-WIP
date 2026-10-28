package ja3;

import j93.InterfaceC21493z;
import lb3.AbstractC23811y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import u93.C34697q0;
import x93.AbstractC38130v;

/* JADX INFO: renamed from: ja3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C21517m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82535w;

    /* JADX INFO: renamed from: x */
    public static final C21517m f82532x = new C21517m(0);

    /* JADX INFO: renamed from: y */
    public static final C21517m f82533y = new C21517m(1);

    /* JADX INFO: renamed from: z */
    public static final C21517m f82534z = new C21517m(2);

    /* JADX INFO: renamed from: E */
    public static final C21517m f82530E = new C21517m(3);

    /* JADX INFO: renamed from: F */
    public static final C21517m f82531F = new C21517m(4);

    public /* synthetic */ C21517m(int i13) {
        this.f82535w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f82535w) {
            case 0:
                AbstractC38130v it = (AbstractC38130v) obj;
                int i13 = C21519o.f82538v;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.valueOf(!it.m122124i());
            case 1:
                C34697q0 selectMostSpecificInEachOverridableGroup = (C34697q0) obj;
                InterfaceC21493z[] interfaceC21493zArr = AbstractC21500a0.f82464m;
                AbstractC22676k.m65750j(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 2:
                AbstractC38130v it3 = (AbstractC38130v) obj;
                int i14 = C21506d0.f82486p;
                AbstractC22676k.m65750j(it3, "it");
                return Boolean.valueOf(it3.m122124i());
            case 3:
                InterfaceC22712o it4 = (InterfaceC22712o) obj;
                int i15 = C21506d0.f82486p;
                AbstractC22676k.m65750j(it4, "it");
                return it4.getVariableNames();
            default:
                int i16 = C21506d0.f82486p;
                InterfaceC31126h interfaceC31126hMo1784d = ((AbstractC23811y) obj).mo69844i0().mo1784d();
                if (interfaceC31126hMo1784d instanceof InterfaceC31117e) {
                    return (InterfaceC31117e) interfaceC31126hMo1784d;
                }
                return null;
        }
    }
}
