package p426qi;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: qi.h */
/* JADX INFO: loaded from: classes.dex */
public final class C30385h implements InterfaceC30405z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124679a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f124680b;

    public C30385h(LottieAnimationView lottieAnimationView, int i13) {
        this.f124679a = i13;
        switch (i13) {
            case 1:
                this.f124680b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f124680b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // p426qi.InterfaceC30405z
    public final void onResult(Object obj) {
        switch (this.f124679a) {
            case 0:
                Throwable th3 = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f124680b.get();
                if (lottieAnimationView != null) {
                    int i13 = lottieAnimationView.f20257z;
                    if (i13 != 0) {
                        lottieAnimationView.setImageResource(i13);
                    }
                    InterfaceC30405z interfaceC30405z = lottieAnimationView.f20256y;
                    if (interfaceC30405z == null) {
                        interfaceC30405z = LottieAnimationView.f20244N;
                    }
                    interfaceC30405z.onResult(th3);
                    break;
                }
                break;
            default:
                C30387i c30387i = (C30387i) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f124680b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(c30387i);
                    break;
                }
                break;
        }
    }
}
