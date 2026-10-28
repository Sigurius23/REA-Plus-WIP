package uz2;

import android.util.Pair;
import bh3.InterfaceC3255b;
import com.whoop.whooplive.selfie.OverlayView;
import rz2.EnumC31928a;

/* JADX INFO: renamed from: uz2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C35446c implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150946w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ OverlayView f150947x;

    public /* synthetic */ C35446c(OverlayView overlayView, int i13) {
        this.f150946w = i13;
        this.f150947x = overlayView;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f150946w) {
            case 0:
                this.f150947x.m28725p((EnumC35444a) obj);
                break;
            case 1:
                this.f150947x.m28726q((EnumC31928a) obj);
                break;
            case 2:
                this.f150947x.m28723n((Pair) obj);
                break;
            default:
                this.f150947x.m28724o((Float) obj);
                break;
        }
    }
}
