package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import j21.C21245d;
import jp2.C21881l;
import l83.C23454a0;
import p078d1.C11457j;
import p353o0.C27325i;
import p389p0.AbstractC28513c1;
import p389p0.AbstractC28537m0;
import p389p0.C28506a0;
import p389p0.C28535l0;
import p389p0.InterfaceC28507a1;
import p389p0.InterfaceC28512c0;
import p389p0.ViewOnAttachStateChangeListenerC28505a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p634y1.InterfaceC39030c;
import p635y2.AbstractC39125q1;
import p635y2.C39137u1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C1107c implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C28535l0 f4624w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f4625x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28512c0 f4626y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f4627z;

    public C1107c(C28535l0 c28535l0, Modifier modifier, InterfaceC28512c0 interfaceC28512c0, InterfaceC28601c1 interfaceC28601c1) {
        this.f4624w = c28535l0;
        this.f4625x = modifier;
        this.f4626y = interfaceC28512c0;
        this.f4627z = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifierMo3471e;
        InterfaceC39030c interfaceC39030c = (InterfaceC39030c) obj;
        ((Number) obj3).intValue();
        C28655q c28655q = (C28655q) ((Composer) obj2);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C28506a0(interfaceC39030c, new C27325i(3, this.f4627z));
            c28655q.m87172p0(objM87133R);
        }
        C28506a0 c28506a0 = (C28506a0) objM87133R;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C39137u1(new C11457j(c28506a0));
            c28655q.m87172p0(objM87133R2);
        }
        C39137u1 c39137u1 = (C39137u1) objM87133R2;
        C28535l0 c28535l0 = this.f4624w;
        if (c28535l0 != null) {
            c28655q.m87150e0(1743490539);
            c28655q.m87150e0(887527095);
            Object obj4 = AbstractC28513c1.f115409a;
            if (obj4 != null) {
                c28655q.m87150e0(1345648624);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1345697697);
                View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
                boolean zM87153g = c28655q.m87153g(view);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                    objM87133R3 = tag instanceof InterfaceC28507a1 ? (InterfaceC28507a1) tag : null;
                    if (objM87133R3 == null) {
                        objM87133R3 = new ViewOnAttachStateChangeListenerC28505a(view);
                        view.setTag(R.id.compose_prefetch_scheduler, objM87133R3);
                    }
                    c28655q.m87172p0(objM87133R3);
                }
                obj4 = (InterfaceC28507a1) objM87133R3;
                c28655q.m87173q(false);
            }
            Object obj5 = obj4;
            c28655q.m87173q(false);
            Object[] objArr = {c28535l0, c28506a0, c39137u1, obj5};
            boolean zM87153g2 = c28655q.m87153g(c28535l0) | c28655q.m87157i(c28506a0) | c28655q.m87157i(c39137u1) | c28655q.m87157i(obj5);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g2 || objM87133R4 == c28676v0) {
                C21881l c21881l = new C21881l(c28535l0, c28506a0, c39137u1, obj5, 20);
                c28655q.m87172p0(c21881l);
                objM87133R4 = c21881l;
            }
            AbstractC28683x.m87252f(objArr, (Function1) objM87133R4, c28655q);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1744076749);
            c28655q.m87173q(false);
        }
        int i13 = AbstractC28537m0.f115456a;
        Modifier modifier = this.f4625x;
        if (c28535l0 != null && (modifierMo3471e = modifier.mo3471e(new TraversablePrefetchStateModifierElement(c28535l0))) != null) {
            modifier = modifierMo3471e;
        }
        boolean zM87153g3 = c28655q.m87153g(c28506a0);
        InterfaceC28512c0 interfaceC28512c0 = this.f4626y;
        boolean zM87153g4 = zM87153g3 | c28655q.m87153g(interfaceC28512c0);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87153g4 || objM87133R5 == c28676v0) {
            objM87133R5 = new C21245d(27, c28506a0, interfaceC28512c0);
            c28655q.m87172p0(objM87133R5);
        }
        AbstractC39125q1.m124657c(c39137u1, modifier, (InterfaceC4351m) objM87133R5, c28655q, 8);
        return C23454a0.f92919a;
    }
}
