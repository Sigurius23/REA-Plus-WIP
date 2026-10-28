package p532ur;

import p073cq.C11040i;
import p087db.C11856j0;
import p229ip.AbstractBinderC20797h;

/* JADX INFO: renamed from: ur.f */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC35177f extends AbstractBinderC20797h {

    /* JADX INFO: renamed from: g */
    public final C11856j0 f149287g;

    /* JADX INFO: renamed from: h */
    public final C11040i f149288h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C35178g f149289i;

    public BinderC35177f(C35178g c35178g, C11040i c11040i) {
        C11856j0 c11856j0 = new C11856j0("OnRequestInstallCallback", 13);
        this.f149289i = c35178g;
        super(4);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f149287g = c11856j0;
        this.f149288h = c11040i;
    }
}
