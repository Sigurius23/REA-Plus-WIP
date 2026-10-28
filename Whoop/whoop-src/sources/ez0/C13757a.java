package ez0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import f51.AbstractC14093d;
import f51.C14090a;
import i91.AbstractC18247a;
import k91.C22302a;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import w71.AbstractC36900s;

/* JADX INFO: renamed from: ez0.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C13757a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f49070E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f49071F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f49072G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f49073H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49074w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f49075x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f49076y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f49077z;

    public /* synthetic */ C13757a(float f13, int i13, int i14, Integer num, boolean z4, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f49077z = f13;
        this.f49070E = i13;
        this.f49071F = i14;
        this.f49075x = num;
        this.f49076y = z4;
        this.f49072G = function1;
        this.f49073H = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49074w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13758b.m39109e((Modifier) this.f49075x, (AbstractC18247a) this.f49072G, (C22302a) this.f49073H, this.f49076y, this.f49077z, this.f49070E, this.f49071F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC14093d.m40135g((Modifier) this.f49075x, (C14090a) this.f49072G, this.f49076y, this.f49077z, (InterfaceC4339a) this.f49073H, this.f49070E, this.f49071F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC36900s.m118478m(this.f49077z, this.f49070E, this.f49071F, (Integer) this.f49075x, this.f49076y, (Function1) this.f49072G, (InterfaceC28601c1) this.f49073H, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C13757a(Modifier modifier, C14090a c14090a, boolean z4, float f13, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f49075x = modifier;
        this.f49072G = c14090a;
        this.f49076y = z4;
        this.f49077z = f13;
        this.f49073H = interfaceC4339a;
        this.f49070E = i13;
        this.f49071F = i14;
    }

    public /* synthetic */ C13757a(Modifier modifier, AbstractC18247a abstractC18247a, C22302a c22302a, boolean z4, float f13, int i13, int i14) {
        this.f49075x = modifier;
        this.f49072G = abstractC18247a;
        this.f49073H = c22302a;
        this.f49076y = z4;
        this.f49077z = f13;
        this.f49070E = i13;
        this.f49071F = i14;
    }
}
