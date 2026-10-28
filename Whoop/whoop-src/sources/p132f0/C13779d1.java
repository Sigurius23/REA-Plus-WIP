package p132f0;

import android.view.View;
import android.widget.Magnifier;
import e10.C12554k0;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: f0.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13779d1 implements InterfaceC13791h1 {

    /* JADX INFO: renamed from: b */
    public static final C13779d1 f49162b = new C13779d1(0);

    /* JADX INFO: renamed from: c */
    public static final C13779d1 f49163c = new C13779d1(1);

    /* JADX INFO: renamed from: d */
    public static final C13779d1 f49164d = new C13779d1(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49165a;

    public /* synthetic */ C13779d1(int i13) {
        this.f49165a = i13;
    }

    @Override // p132f0.InterfaceC13791h1
    /* JADX INFO: renamed from: a */
    public C12554k0 mo39138a(View view, InterfaceC39171c interfaceC39171c) {
        switch (this.f49165a) {
            case 1:
                return new C12554k0(new Magnifier(view), 12);
            default:
                return new C13794i1(new Magnifier(view), 12);
        }
    }

    @Override // p132f0.InterfaceC13791h1
    /* JADX INFO: renamed from: b */
    public boolean mo39139b() {
        switch (this.f49165a) {
            case 1:
                return false;
            default:
                return true;
        }
    }
}
