package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31108b;
import r93.InterfaceC31145n0;
import u93.C34697q0;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C22718u implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C22718u f89391x = new C22718u(0);

    /* JADX INFO: renamed from: y */
    public static final C22718u f89392y = new C22718u(1);

    /* JADX INFO: renamed from: z */
    public static final C22718u f89393z = new C22718u(2);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f89394w;

    public /* synthetic */ C22718u(int i13) {
        this.f89394w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f89394w) {
            case 0:
                C34697q0 selectMostSpecificInEachOverridableGroup = (C34697q0) obj;
                AbstractC22676k.m65750j(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 1:
                InterfaceC31145n0 selectMostSpecificInEachOverridableGroup2 = (InterfaceC31145n0) obj;
                AbstractC22676k.m65750j(selectMostSpecificInEachOverridableGroup2, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup2;
            default:
                InterfaceC31108b selectMostSpecificInEachOverridableGroup3 = (InterfaceC31108b) obj;
                AbstractC22676k.m65750j(selectMostSpecificInEachOverridableGroup3, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup3;
        }
    }
}
