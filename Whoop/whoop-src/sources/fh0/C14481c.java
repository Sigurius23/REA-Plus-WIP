package fh0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import l83.InterfaceC23459e;
import nl0.C26804f;
import p291l0.InterfaceC23013y;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32673s3;

/* JADX INFO: renamed from: fh0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C14481c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f52868E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f52869F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f52870G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f52871H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f52872I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f52873J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC23459e f52874K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52875w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f52876x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f52877y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f52878z;

    public /* synthetic */ C14481c(Modifier modifier, TextResource textResource, TextResource textResource2, boolean z4, boolean z13, TextResource textResource3, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f52870G = modifier;
        this.f52871H = textResource;
        this.f52872I = textResource2;
        this.f52876x = z4;
        this.f52877y = z13;
        this.f52873J = textResource3;
        this.f52878z = z14;
        this.f52874K = interfaceC4339a;
        this.f52868E = i13;
        this.f52869F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52875w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC14482d.m41364g((Modifier) this.f52870G, (TextResource) this.f52871H, (TextResource) this.f52872I, this.f52876x, this.f52877y, (TextResource) this.f52873J, this.f52878z, (InterfaceC4339a) this.f52874K, this.f52868E, this.f52869F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC32673s3.m102298D((InterfaceC23013y) this.f52870G, (C26804f) this.f52871H, (InterfaceC4351m) this.f52872I, (Function1) this.f52873J, (Function1) this.f52874K, this.f52876x, this.f52877y, this.f52878z, this.f52868E, this.f52869F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C14481c(InterfaceC23013y interfaceC23013y, C26804f c26804f, InterfaceC4351m interfaceC4351m, Function1 function1, Function1 function2, boolean z4, boolean z13, boolean z14, int i13, int i14) {
        this.f52870G = interfaceC23013y;
        this.f52871H = c26804f;
        this.f52872I = interfaceC4351m;
        this.f52873J = function1;
        this.f52874K = function2;
        this.f52876x = z4;
        this.f52877y = z13;
        this.f52878z = z14;
        this.f52868E = i13;
        this.f52869F = i14;
    }
}
