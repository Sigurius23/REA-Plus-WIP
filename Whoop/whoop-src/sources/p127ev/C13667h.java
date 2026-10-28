package p127ev;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import ar.C1916d;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.types.ButtonMeta;
import com.amplitude.android.engagement.types.NudgeStep;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import io.sentry.android.core.RunnableC20151r0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import l83.C23454a0;
import m83.C25271y;
import p027b3.C2354b2;
import p027b3.C2391j;
import p027b3.InterfaceC2438s1;
import p157fv.C14802h;
import p157fv.EnumC14804j;
import p176gv.AbstractC16218d;
import p208i2.C17919x;
import p208i2.C17924z0;
import p294l3.C23250e;
import p294l3.C23254g;
import p294l3.C23267m0;
import p305lj.AbstractC24425e0;
import p320m5.InterfaceC25063g;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p571w3.InterfaceC36779o;
import p636y3.C39183o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: ev.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C13667h extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48449w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f48450x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f48451y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f48452z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13667h(Object obj, Object obj2, Object obj3, int i13) {
        super(0);
        this.f48449w = i13;
        this.f48450x = obj;
        this.f48451y = obj2;
        this.f48452z = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f48449w) {
            case 0:
                return new C13665f((MapboxMap) ((C13668i) this.f48450x).f48454a, (MapTelemetry) this.f48451y, (MapGeofencingConsent) this.f48452z);
            case 1:
                C14802h c14802h = (C14802h) this.f48450x;
                AbstractC16218d abstractC16218d = (AbstractC16218d) this.f48451y;
                ValueAnimator valueAnimator = (ValueAnimator) this.f48452z;
                c14802h.f54951x.add(abstractC16218d);
                C14802h.m42547m(abstractC16218d, abstractC16218d.getAnimatedValue(), c14802h.f54944Q);
                if (abstractC16218d.mo45908k() == EnumC14804j.f54957E) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type com.mapbox.maps.ScreenCoordinate");
                    c14802h.m42553k((ScreenCoordinate) animatedValue);
                }
                c14802h.m42549e();
                return C23454a0.f92919a;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f48450x;
                animatorSet.addListener(new C1916d((C14802h) this.f48452z, 9));
                animatorSet.addListener((Animator.AnimatorListener) this.f48451y);
                return C23454a0.f92919a;
            case 3:
                return "AmplitudeEngagement.sdk[internal]#determineAction(step=" + ((NudgeStep) this.f48450x) + ", buttonMeta=" + ((ButtonMeta) this.f48451y) + ", surveyResponse=" + ((AbstractC24425e0) this.f48452z) + ')';
            case 4:
                InterfaceC2438s1 interfaceC2438s1 = (InterfaceC2438s1) this.f48450x;
                String str = (String) this.f48451y;
                C23254g c23254g = new C23254g(6, str, null);
                ClipboardManager clipboardManager = ((C2391j) interfaceC2438s1).f9446a;
                List list = C25271y.f99162w;
                ArrayList arrayList = c23254g.f92136y;
                CharSequence charSequence = str;
                if (!(arrayList == null ? list : arrayList).isEmpty()) {
                    SpannableString spannableString = new SpannableString(str);
                    C2354b2 c2354b2 = new C2354b2(0);
                    c2354b2.f9307b = Parcel.obtain();
                    if (arrayList != null) {
                        list = arrayList;
                    }
                    int i13 = 0;
                    for (int size = list.size(); i13 < size; size = size) {
                        C23250e c23250e = (C23250e) list.get(i13);
                        C23267m0 c23267m0 = (C23267m0) c23250e.f92125a;
                        int i14 = c23250e.f92126b;
                        int i15 = c23250e.f92127c;
                        c2354b2.f9307b.recycle();
                        c2354b2.f9307b = Parcel.obtain();
                        InterfaceC36779o interfaceC36779o = c23267m0.f92191a;
                        long j7 = c23267m0.f92202l;
                        int i16 = i13;
                        long j13 = c23267m0.f92198h;
                        List list2 = list;
                        long j14 = c23267m0.f92192b;
                        ClipboardManager clipboardManager2 = clipboardManager;
                        long jMo117875b = interfaceC36779o.mo117875b();
                        long j15 = C17919x.f69637n;
                        if (!C17919x.m51542d(jMo117875b, j15)) {
                            c2354b2.m7275c((byte) 1);
                            c2354b2.m7278f(c23267m0.f92191a.mo117875b());
                        }
                        long j16 = C39183o.f168428c;
                        byte b = 2;
                        if (!C39183o.m124803a(j14, j16)) {
                            c2354b2.m7275c((byte) 2);
                            c2354b2.m7277e(j14);
                        }
                        C28780r c28780r = c23267m0.f92193c;
                        if (c28780r != null) {
                            c2354b2.m7275c((byte) 3);
                            c2354b2.f9307b.writeInt(c28780r.f116547w);
                        }
                        C28776n c28776n = c23267m0.f92194d;
                        if (c28776n != null) {
                            int i17 = c28776n.f116535a;
                            c2354b2.m7275c((byte) 4);
                            c2354b2.m7275c((i17 != 0 && i17 == 1) ? (byte) 1 : (byte) 0);
                        }
                        C28777o c28777o = c23267m0.f92195e;
                        if (c28777o != null) {
                            int i18 = c28777o.f116536a;
                            c2354b2.m7275c((byte) 5);
                            if (i18 == 0) {
                                b = 0;
                            } else if (i18 == 65535) {
                                b = 1;
                            } else if (i18 != 1) {
                                if (i18 == 2) {
                                    b = 3;
                                } else {
                                    b = 0;
                                }
                            }
                            c2354b2.m7275c(b);
                        }
                        String str2 = c23267m0.f92197g;
                        if (str2 != null) {
                            c2354b2.m7275c((byte) 6);
                            c2354b2.f9307b.writeString(str2);
                        }
                        if (!C39183o.m124803a(j13, j16)) {
                            c2354b2.m7275c((byte) 7);
                            c2354b2.m7277e(j13);
                        }
                        C36765a c36765a = c23267m0.f92199i;
                        if (c36765a != null) {
                            float f13 = c36765a.f157332a;
                            c2354b2.m7275c((byte) 8);
                            c2354b2.m7276d(f13);
                        }
                        C36780p c36780p = c23267m0.f92200j;
                        if (c36780p != null) {
                            c2354b2.m7275c((byte) 9);
                            c2354b2.m7276d(c36780p.f157358a);
                            c2354b2.m7276d(c36780p.f157359b);
                        }
                        if (!C17919x.m51542d(j7, j15)) {
                            c2354b2.m7275c((byte) 10);
                            c2354b2.m7278f(j7);
                        }
                        C36776l c36776l = c23267m0.f92203m;
                        if (c36776l != null) {
                            c2354b2.m7275c((byte) 11);
                            c2354b2.f9307b.writeInt(c36776l.f157354a);
                        }
                        C17924z0 c17924z0 = c23267m0.f92204n;
                        if (c17924z0 != null) {
                            c2354b2.m7275c((byte) 12);
                            c2354b2.m7278f(c17924z0.f69669a);
                            long j17 = c17924z0.f69670b;
                            c2354b2.m7276d(Float.intBitsToFloat((int) (j17 >> 32)));
                            c2354b2.m7276d(Float.intBitsToFloat((int) (j17 & 4294967295L)));
                            c2354b2.m7276d(c17924z0.f69671c);
                        }
                        spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(c2354b2.f9307b.marshall(), 0)), i14, i15, 33);
                        i13 = i16 + 1;
                        list = list2;
                        clipboardManager = clipboardManager2;
                    }
                    charSequence = spannableString;
                }
                clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
                Toast.makeText((Context) this.f48452z, "Copied!", 0).show();
                return C23454a0.f92919a;
            case 5:
                StringBuilder sb4 = new StringBuilder("During clear credential sign out failed with ");
                Exception exc = (Exception) this.f48450x;
                sb4.append(exc);
                Log.w("PlayServicesImpl", sb4.toString());
                ((Executor) this.f48451y).execute(new RunnableC20151r0(25, (InterfaceC25063g) this.f48452z, exc));
                return C23454a0.f92919a;
            default:
                ((Executor) this.f48450x).execute(new RunnableC20151r0(27, (InterfaceC25063g) this.f48451y, this.f48452z));
                return C23454a0.f92919a;
        }
    }
}
