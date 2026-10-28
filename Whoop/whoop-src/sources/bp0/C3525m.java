package bp0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.coacheverywherecommon.models.CoachEntry;
import ep0.C13402h;
import ep0.C13404j;
import p636y3.InterfaceC39171c;
import p702ch0.C4656v0;
import p702ch0.EnumC4612d0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p734sl0.C32645n0;
import q12.AbstractC29803d;

/* JADX INFO: renamed from: bp0.m */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3525m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f14037E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f14038F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f14039G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f14040H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f14041I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f14042J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f14043K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f14044L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14045w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f14046x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f14047y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f14048z;

    public /* synthetic */ C3525m(C32645n0 c32645n0, Modifier modifier, boolean z4, float f13, EnumC4612d0 enumC4612d0, C4656v0 c4656v0, InterfaceC4351m interfaceC4351m, Function3 function3, Function1 function1, int i13, int i14) {
        this.f14039G = c32645n0;
        this.f14040H = modifier;
        this.f14046x = z4;
        this.f14047y = f13;
        this.f14041I = enumC4612d0;
        this.f14042J = c4656v0;
        this.f14048z = interfaceC4351m;
        this.f14043K = function3;
        this.f14044L = function1;
        this.f14037E = i13;
        this.f14038F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14045w) {
            case 0:
                return AbstractC3531s.m10438P((InterfaceC39171c) this.f14039G, (C13402h) this.f14040H, this.f14047y, this.f14046x, this.f14048z, (InterfaceC4339a) this.f14042J, (InterfaceC4351m) this.f14041I, (C13404j) this.f14043K, (CoachEntry) this.f14044L, this.f14037E, this.f14038F, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC29803d.m91311m((C32645n0) this.f14039G, (Modifier) this.f14040H, this.f14046x, this.f14047y, (EnumC4612d0) this.f14041I, (C4656v0) this.f14042J, this.f14048z, (Function3) this.f14043K, (Function1) this.f14044L, this.f14037E, this.f14038F, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C3525m(InterfaceC39171c interfaceC39171c, C13402h c13402h, float f13, boolean z4, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m2, C13404j c13404j, CoachEntry coachEntry, int i13, int i14) {
        this.f14039G = interfaceC39171c;
        this.f14040H = c13402h;
        this.f14047y = f13;
        this.f14046x = z4;
        this.f14048z = interfaceC4351m;
        this.f14042J = interfaceC4339a;
        this.f14041I = interfaceC4351m2;
        this.f14043K = c13404j;
        this.f14044L = coachEntry;
        this.f14037E = i13;
        this.f14038F = i14;
    }
}
