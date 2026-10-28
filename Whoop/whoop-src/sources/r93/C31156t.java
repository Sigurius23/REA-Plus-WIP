package r93;

import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import u93.AbstractC34677g0;
import va3.C35845c;

/* JADX INFO: renamed from: r93.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C31156t implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128376w;

    /* JADX INFO: renamed from: x */
    public static final C31156t f128373x = new C31156t(0);

    /* JADX INFO: renamed from: y */
    public static final C31156t f128374y = new C31156t(1);

    /* JADX INFO: renamed from: z */
    public static final C31156t f128375z = new C31156t(2);

    /* JADX INFO: renamed from: E */
    public static final C31156t f128371E = new C31156t(3);

    /* JADX INFO: renamed from: F */
    public static final C31156t f128372F = new C31156t(4);

    public /* synthetic */ C31156t(int i13) {
        this.f128376w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f128376w) {
            case 0:
                AbstractC22676k.m65750j((C35845c) obj, "it");
                return 0;
            case 1:
                InterfaceC31124g0 it = (InterfaceC31124g0) obj;
                AbstractC22676k.m65750j(it, "it");
                return ((AbstractC34677g0) it).f146067F;
            case 2:
                InterfaceC31135k it3 = (InterfaceC31135k) obj;
                AbstractC22676k.m65750j(it3, "it");
                return Boolean.valueOf(it3 instanceof InterfaceC31108b);
            case 3:
                InterfaceC31135k it4 = (InterfaceC31135k) obj;
                AbstractC22676k.m65750j(it4, "it");
                return Boolean.valueOf(!(it4 instanceof InterfaceC31132j));
            default:
                InterfaceC31135k it5 = (InterfaceC31135k) obj;
                AbstractC22676k.m65750j(it5, "it");
                List typeParameters = ((InterfaceC31108b) it5).getTypeParameters();
                AbstractC22676k.m65749i(typeParameters, "getTypeParameters(...)");
                return AbstractC25265s.m74145r0(typeParameters);
        }
    }
}
