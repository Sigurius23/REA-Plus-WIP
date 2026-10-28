package p254jj;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Nudge;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.crypto.tink.internal.C5101l0;
import gm.C15981i;
import gm.C15990r;
import java.util.LinkedHashMap;
import java.util.Objects;
import mm.C25680d;
import om.InterfaceC28023b;
import p028b4.C2696g;
import p031b9.C2873x;
import p127ev.C13668i;
import p197hj.C17338u;
import p328mj.C25594a;
import p328mj.C25609p;
import p344nm.C26827i;
import p344nm.InterfaceC26822d;
import p525uj.C35035m;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: jj.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC21737c implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f83584E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f83585w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f83586x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f83587y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f83588z;

    public /* synthetic */ RunnableC21737c(Object obj, Object obj2, int i13, Object obj3, int i14) {
        this.f83585w = i14;
        this.f83587y = obj;
        this.f83588z = obj2;
        this.f83586x = i13;
        this.f83584E = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2696g c2696g;
        int i13 = this.f83585w;
        Object obj = this.f83584E;
        Object obj2 = this.f83588z;
        Object obj3 = this.f83587y;
        switch (i13) {
            case 0:
                Nudge nudge = (Nudge) obj3;
                C4861a c4861a = (C4861a) obj2;
                C22669g0 c22669g0 = (C22669g0) obj;
                LinkedHashMap linkedHashMap = c4861a.f20266g;
                LinkedHashMap linkedHashMap2 = c4861a.f20265f;
                C5101l0 c5101l0 = C4861a.f20259o;
                c5101l0.m16047a0("RenderNudgeHandler", "Rendering nudge using NudgeViewManager");
                boolean zIsCarousel = nudge.isCarousel();
                int i14 = this.f83586x;
                if (zIsCarousel && linkedHashMap.get(Integer.valueOf(nudge.getVariantId())) != null && linkedHashMap2.get(Integer.valueOf(nudge.getVariantId())) != null) {
                    C25609p c25609p = (C25609p) linkedHashMap2.get(Integer.valueOf(nudge.getVariantId()));
                    if (c25609p != null) {
                        c25609p.f100463c = i14;
                    }
                    C25594a c25594a = (C25594a) linkedHashMap.get(Integer.valueOf(nudge.getVariantId()));
                    if (c25594a == null || (c2696g = c25594a.f100414a) == null) {
                        return;
                    }
                    c2696g.invoke(Integer.valueOf(i14));
                    return;
                }
                C25609p c25609p2 = (C25609p) linkedHashMap2.get(Integer.valueOf(nudge.getVariantId()));
                if (c25609p2 != null) {
                    c5101l0.m16067m0("Unexpected existing view manager for Nudge; unmounting it. variantId=" + nudge.getVariantId());
                    c25609p2.m75334d();
                }
                C25594a c25594a2 = new C25594a();
                linkedHashMap.put(Integer.valueOf(nudge.getVariantId()), c25594a2);
                C17338u c17338u = C17338u.f67142w;
                C25609p c25609p3 = new C25609p(c4861a, nudge, i14, (C35035m) c22669g0.f89336w, c25594a2);
                linkedHashMap2.put(Integer.valueOf(nudge.getVariantId()), c25609p3);
                c25609p3.m75333c();
                return;
            default:
                C13668i c13668i = (C13668i) obj3;
                C15981i c15981i = (C15981i) obj2;
                int i15 = this.f83586x;
                Runnable runnable = (Runnable) obj;
                InterfaceC28023b interfaceC28023b = (InterfaceC28023b) c13668i.f48459f;
                try {
                    try {
                        InterfaceC26822d interfaceC26822d = (InterfaceC26822d) c13668i.f48456c;
                        Objects.requireNonNull(interfaceC26822d);
                        ((C26827i) interfaceC28023b).m80062s(new C25680d(interfaceC26822d, 0));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) c13668i.f48454a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((C26827i) interfaceC28023b).m80062s(new C2873x(c13668i, c15981i, i15));
                        } else {
                            c13668i.m38536g(c15981i, i15);
                        }
                        break;
                    } catch (SynchronizationException unused) {
                        ((C15990r) c13668i.f48457d).m45149O(c15981i, i15 + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }
}
