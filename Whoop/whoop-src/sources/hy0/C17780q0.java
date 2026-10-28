package hy0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.List;
import l01.AbstractC23041m;
import p331n2.AbstractC26165a;
import p635y2.InterfaceC39105k;
import p715kotlin.jvm.functions.Function3;
import p745y81.EnumC39333f;
import y11.AbstractC39061n;

/* JADX INFO: renamed from: hy0.q0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17780q0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f69144E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f69145F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f69146G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f69147H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69148w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f69149x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f69150y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f69151z;

    public /* synthetic */ C17780q0(Modifier modifier, float f13, float f14, List list, Function3 function3, int i13, int i14) {
        this.f69149x = modifier;
        this.f69150y = f13;
        this.f69151z = f14;
        this.f69146G = list;
        this.f69147H = function3;
        this.f69144E = i13;
        this.f69145F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69148w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17783r0.m51103e((AbstractC26165a) this.f69146G, this.f69150y, this.f69151z, this.f69149x, (InterfaceC39105k) this.f69147H, this.f69144E, this.f69145F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC23041m.m66861X(this.f69149x, this.f69150y, this.f69151z, (List) this.f69146G, (Function3) this.f69147H, this.f69144E, this.f69145F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC39061n.m124561n(this.f69149x, (EnumC39333f) this.f69146G, this.f69150y, (TextResource) this.f69147H, this.f69151z, this.f69144E, this.f69145F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C17780q0(Modifier modifier, EnumC39333f enumC39333f, float f13, TextResource textResource, float f14, int i13, int i14) {
        this.f69149x = modifier;
        this.f69146G = enumC39333f;
        this.f69150y = f13;
        this.f69147H = textResource;
        this.f69151z = f14;
        this.f69144E = i13;
        this.f69145F = i14;
    }

    public /* synthetic */ C17780q0(AbstractC26165a abstractC26165a, float f13, float f14, Modifier modifier, InterfaceC39105k interfaceC39105k, int i13, int i14) {
        this.f69146G = abstractC26165a;
        this.f69150y = f13;
        this.f69151z = f14;
        this.f69149x = modifier;
        this.f69147H = interfaceC39105k;
        this.f69144E = i13;
        this.f69145F = i14;
    }
}
