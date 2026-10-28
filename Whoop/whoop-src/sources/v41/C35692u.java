package v41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p715kotlin.jvm.functions.Function1;
import z51.AbstractC40104o;
import z51.EnumC40108s;

/* JADX INFO: renamed from: v41.u */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C35692u implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f151824E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f151825F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f151826G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f151827H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f151828I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151829w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f151830x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f151831y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f151832z;

    public /* synthetic */ C35692u(Modifier modifier, float f13, float f14, boolean z4, Function1 function1, InterfaceC4351m interfaceC4351m, int i13, int i14) {
        this.f151827H = modifier;
        this.f151830x = f13;
        this.f151832z = f14;
        this.f151831y = z4;
        this.f151824E = function1;
        this.f151828I = interfaceC4351m;
        this.f151825F = i13;
        this.f151826G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f151829w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC35661d0.m112896L((Modifier) this.f151827H, this.f151830x, this.f151832z, this.f151831y, this.f151824E, (InterfaceC4351m) this.f151828I, this.f151825F, this.f151826G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40104o.m128649n((EnumC40108s) this.f151827H, this.f151830x, (TextResource) this.f151828I, this.f151831y, this.f151832z, this.f151824E, this.f151825F, this.f151826G, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C35692u(EnumC40108s enumC40108s, float f13, TextResource textResource, boolean z4, float f14, Function1 function1, int i13, int i14) {
        this.f151827H = enumC40108s;
        this.f151830x = f13;
        this.f151828I = textResource;
        this.f151831y = z4;
        this.f151832z = f14;
        this.f151824E = function1;
        this.f151825F = i13;
        this.f151826G = i14;
    }
}
