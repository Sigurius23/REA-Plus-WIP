package p087db;

import android.animation.ValueAnimator;
import android.view.View;
import com.mapbox.maps.threading.AnimationThreadController;
import com.whoop.coaching.sleepcoach.wizard.C6242d;
import com.whoop.community.presentation.p059ui.SimpleDial;
import com.whoop.realtime.presentation.StartActivityActivity;
import com.whoop.realtime.presentation.views.StrainCoachGoalPicker;
import g23.ViewOnTouchListenerC15285a;
import io.getstream.chat.android.p226ui.common.internal.AnimationUtilsKt;
import jo.C21816e;
import m52.AbstractC25093m;
import p289kv.C22839b;
import p289kv.C22841d;
import p289kv.InterfaceC22838a;
import p450r5.C30929c;
import p467rq.C31647c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q52.AbstractC29983a;
import rq0.C31672i;
import sv.AbstractC33028d;

/* JADX INFO: renamed from: db.e */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C11845e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38627a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f38628b;

    public /* synthetic */ C11845e(Object obj, int i13) {
        this.f38627a = i13;
        this.f38628b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.f38627a) {
            case 0:
                C11847f c11847f = (C11847f) this.f38628b;
                c11847f.getClass();
                c11847f.f38659i0 = ((Float) it.getAnimatedValue()).floatValue();
                c11847f.invalidate(c11847f.f38669w);
                return;
            case 1:
                ViewOnTouchListenerC15285a viewOnTouchListenerC15285a = (ViewOnTouchListenerC15285a) this.f38628b;
                AbstractC22676k.m65750j(it, "it");
                viewOnTouchListenerC15285a.f57427y.invoke(Float.valueOf(viewOnTouchListenerC15285a.f57425w.getTranslationY()), Integer.valueOf(viewOnTouchListenerC15285a.f57422E));
                return;
            case 2:
                AnimationUtilsKt.animateHighlight$lambda$2$lambda$0((View) this.f38628b, it);
                return;
            case 3:
                C21816e c21816e = (C21816e) this.f38628b;
                c21816e.getClass();
                c21816e.f84117i0 = ((Float) it.getAnimatedValue()).floatValue();
                c21816e.invalidate(c21816e.f84127w);
                return;
            case 4:
                C22841d this$0 = (C22841d) this.f38628b;
                AbstractC22676k.m65750j(this$0, "this$0");
                AbstractC22676k.m65750j(it, "it");
                Object animatedValue = it.getAnimatedValue();
                AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                if (fFloatValue < this$0.f90049H.f96811G) {
                    InterfaceC22838a interfaceC22838a = this$0.f90053y;
                    if (interfaceC22838a != null) {
                        ((C22839b) interfaceC22838a).setCompassAlpha(fFloatValue);
                        return;
                    } else {
                        AbstractC22676k.m65757q("compassView");
                        throw null;
                    }
                }
                return;
            case 5:
                C6242d.m18683e0((C6242d) this.f38628b, it);
                return;
            case 6:
                StartActivityActivity.m23880I0((AbstractC25093m) this.f38628b, it);
                return;
            case 7:
                AbstractC29983a.m91707c((Function1) this.f38628b, it);
                return;
            case 8:
                StrainCoachGoalPicker.m24194w((StrainCoachGoalPicker) this.f38628b, it);
                return;
            case 9:
                C31647c c31647c = (C31647c) this.f38628b;
                c31647c.getClass();
                float fFloatValue2 = ((Float) it.getAnimatedValue()).floatValue();
                c31647c.f130796j.setAlpha((int) (255.0f * fFloatValue2));
                c31647c.f130810x = fFloatValue2;
                return;
            case 10:
                C31672i.b.m98066i((SimpleDial) this.f38628b, it);
                return;
            default:
                AbstractC33028d abstractC33028d = (AbstractC33028d) this.f38628b;
                AbstractC22676k.m65750j(it, "it");
                AnimationThreadController.INSTANCE.postOnMainThread(new C30929c(5, it, abstractC33028d));
                return;
        }
    }
}
