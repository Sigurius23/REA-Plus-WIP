package p163g1;

import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import bc3.InterfaceC2994c0;
import ep1.C13412g;
import l83.C23454a0;
import p180h0.AbstractC16434o3;
import p180h0.InterfaceC16427n1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p512u2.InterfaceC34476v;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: g1.e6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14997e6 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC2994c0 f56099E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC16427n1 f56100F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC28601c1 f56101G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f56102w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f56103x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f56104y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28670t2 f56105z;

    public C14997e6(boolean z4, float f13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, InterfaceC2994c0 interfaceC2994c0, InterfaceC16427n1 interfaceC16427n1, InterfaceC28601c1 interfaceC28601c2) {
        this.f56102w = z4;
        this.f56103x = f13;
        this.f56104y = interfaceC28601c1;
        this.f56105z = interfaceC28670t2;
        this.f56099E = interfaceC2994c0;
        this.f56100F = interfaceC16427n1;
        this.f56101G = interfaceC28601c2;
    }

    @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d interfaceC30057d) {
        Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, new C14986d6(this.f56102w, this.f56103x, this.f56104y, this.f56105z, null), new C13412g(this.f56099E, this.f56100F, this.f56101G, 14), interfaceC30057d, 3);
        return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
    }
}
