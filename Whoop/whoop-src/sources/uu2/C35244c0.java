package uu2;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.video.VideoActivity;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import re1.C31324k;
import tu1.C34190c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: uu2.c0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Luu2/c0;", "Lm91/f;", "Luu2/h0;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Luu2/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35244c0 implements InterfaceC25297f<C35254h0> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m111672d(C35254h0 c35254h0, Function1 function1, Context context) {
        String videoUrl = c35254h0.getVideoUrl();
        if (videoUrl != null) {
            function1.invoke(C35251g.f149955a);
            Intent intent = new Intent(context, (Class<?>) VideoActivity.class);
            intent.putExtra("videoUrl", videoUrl);
            context.startActivity(intent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m111673e(C35244c0 c35244c0, Modifier modifier, C35254h0 c35254h0, Function1 function1, int i13, Composer composer, int i14) {
        c35244c0.Compose(modifier, c35254h0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C35254h0 itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1087960745);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3411h = AbstractC1102d.m3411h(2 * f13, c2314t);
            float f14 = ((float) 0.5d) * f13;
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(f14, c2314t);
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifier, f14, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22403o image = itemState.getImage();
            String videoUrl = itemState.getVideoUrl();
            String name = itemState.getName();
            boolean zM87157i = ((i14 & 896) == 256) | c28655q.m87157i(itemState) | c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C31324k(itemState, onViewEvent, context, 11);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC35248e0.m111685h(image, videoUrl, name, (InterfaceC4339a) objM87133R, c28655q, AbstractC22403o.f87638a);
            AbstractC22953f.m66715b(c28655q, modifierM3411h);
            AbstractC35248e0.m111687j(itemState.getInstructionText(), c28655q, 0);
            AbstractC22953f.m66715b(c28655q, modifierM3411h2);
            AbstractC35248e0.m111683f(itemState.getEquipmentLabel(), itemState.getEquipmentValue(), modifierM3411h, modifierM3411h2, c28655q, 3456);
            AbstractC35248e0.m111691n(itemState.getMuscleGroupsLabel(), itemState.getMuscleGroupsValue(), modifierM3411h, modifierM3411h2, c28655q, 3456);
            AbstractC35248e0.m111689l(itemState.getLinkedExerciseLabel(), itemState.getLinkedExerciseValue(), modifierM3411h2, c28655q, 384);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34190c(this, modifier, itemState, onViewEvent, i13, 20);
        }
    }
}
