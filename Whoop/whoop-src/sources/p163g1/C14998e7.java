package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import java.util.Map;
import js1.AbstractC21916g;
import m83.AbstractC25247g0;
import p31.AbstractC28795f;
import p31.C28792c;
import p390p1.InterfaceC28601c1;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g1.e7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14998e7 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56106w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f56107x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f56108y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56109z;

    public /* synthetic */ C14998e7(Object obj, Object obj2, Object obj3, int i13) {
        this.f56106w = i13;
        this.f56107x = obj;
        this.f56108y = obj2;
        this.f56109z = obj3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56106w) {
            case 0:
                Map map = (Map) this.f56107x;
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f56108y;
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) this.f56109z;
                Float f13 = (Float) obj;
                Float f14 = (Float) obj2;
                return Float.valueOf(((InterfaceC15022g9) interfaceC4351m.invoke(AbstractC25247g0.m73986U(f13, map), AbstractC25247g0.m73986U(f14, map))).mo43095a(f13.floatValue(), f14.floatValue(), interfaceC39171c));
            case 1:
                return AbstractC21916g.m62363f((Modifier) this.f56107x, (List) this.f56108y, (Function1) this.f56109z, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC28795f.m87549E((C28792c) this.f56107x, (Function1) this.f56108y, (InterfaceC28601c1) this.f56109z, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
