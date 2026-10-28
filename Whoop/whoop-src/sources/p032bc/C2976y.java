package p032bc;

import java.util.ArrayList;
import p002a0.C0022g;

/* JADX INFO: renamed from: bc.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C2976y extends AbstractC2975x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0022g f11937a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC2977z f11938b;

    public C2976y(ViewTreeObserverOnPreDrawListenerC2977z viewTreeObserverOnPreDrawListenerC2977z, C0022g c0022g) {
        this.f11938b = viewTreeObserverOnPreDrawListenerC2977z;
        this.f11937a = c0022g;
    }

    @Override // p032bc.AbstractC2975x, p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: c */
    public final void mo8572c(AbstractC2974w abstractC2974w) {
        ((ArrayList) this.f11937a.get(this.f11938b.f11940x)).remove(abstractC2974w);
        abstractC2974w.mo8576C(this);
    }
}
