package p426qi;

import android.animation.ValueAnimator;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import java.io.UnsupportedEncodingException;
import p682zi.C40653c;

/* JADX INFO: renamed from: qi.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C30398s implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f124725b;

    public /* synthetic */ C30398s(Object obj, int i13) {
        this.f124724a = i13;
        this.f124725b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) throws UnsupportedEncodingException {
        switch (this.f124724a) {
            case 0:
                C30402w c30402w = (C30402w) this.f124725b;
                EnumC30371a enumC30371a = c30402w.f124764l0;
                if (enumC30371a == null) {
                    enumC30371a = EnumC30371a.f124606w;
                }
                if (enumC30371a != EnumC30371a.f124607x) {
                    C40653c c40653c = c30402w.f124741O;
                    if (c40653c != null) {
                        c40653c.mo131935p(c30402w.f124770x.m33241a());
                    }
                } else {
                    c30402w.invalidateSelf();
                }
                break;
            default:
                MainActivity.m27285a1((MainActivity) this.f124725b, valueAnimator);
                break;
        }
    }
}
