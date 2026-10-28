package androidx.compose.p018ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import l83.C23454a0;
import p005a3.C0227m1;
import p005a3.C0231n1;
import p027b3.AbstractC2379g2;
import p027b3.AbstractC2453v1;
import p027b3.C2349a2;
import p027b3.C2368e1;
import p027b3.C2416o;
import p027b3.C2422p0;
import p027b3.C2429q2;
import p027b3.C2431r;
import p027b3.C2432r0;
import p027b3.C2442t0;
import p027b3.C2458w1;
import p027b3.C2468y1;
import p027b3.C2472z1;
import p027b3.ComponentCallbacks2C2447u0;
import p027b3.ComponentCallbacks2C2452v0;
import p165g3.C15288c;
import p165g3.C15289d;
import p245j8.AbstractC21412c;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p399pb.C29047d;
import p399pb.InterfaceC29049f;
import p411q2.InterfaceC29805a;
import p419qb.AbstractC30178a;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39035h;
import p634y1.C39034g;
import p634y1.InterfaceC39033f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003¨\u0006\r²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lp1/t1;", "Landroidx/lifecycle/g0;", "getLocalLifecycleOwner", "()Lp1/t1;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Lpb/f;", "getLocalSavedStateRegistryOwner", "getLocalSavedStateRegistryOwner$annotations", "LocalSavedStateRegistryOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, m65682k = 2, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a */
    public static final C28596b0 f4975a = new C28596b0(C2422p0.f9505x);

    /* JADX INFO: renamed from: b */
    public static final C28674u2 f4976b = new C28674u2(C2422p0.f9506y);

    /* JADX INFO: renamed from: c */
    public static final C28596b0 f4977c = new C28596b0(C2431r.f9524z);

    /* JADX INFO: renamed from: d */
    public static final C28674u2 f4978d = new C28674u2(C2422p0.f9507z);

    /* JADX INFO: renamed from: e */
    public static final C28674u2 f4979e = new C28674u2(C2422p0.f9478E);

    /* JADX INFO: renamed from: f */
    public static final C28674u2 f4980f = new C28674u2(C2422p0.f9479F);

    /* JADX INFO: renamed from: a */
    public static final void m3595a(AndroidComposeView androidComposeView, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c1;
        LinkedHashMap linkedHashMap;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-520299287);
        int i14 = (c28655q.m87157i(androidComposeView) ? 4 : 2) | i13 | (c28655q.m87157i(interfaceC4351m) ? 32 : 16);
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Context context = androidComposeView.getContext();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(new Configuration(context.getResources().getConfiguration()));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C0227m1(interfaceC28601c2, 3);
                c28655q.m87172p0(objM87133R2);
            }
            androidComposeView.setConfigurationChangeObserver((Function1) objM87133R2);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C2368e1(context);
                c28655q.m87172p0(objM87133R3);
            }
            C2368e1 c2368e1 = (C2368e1) objM87133R3;
            C2416o viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            InterfaceC29049f interfaceC29049f = viewTreeOwners.f9473b;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                Object parent = androidComposeView.getParent();
                AbstractC22676k.m65748h(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = InterfaceC39033f.class.getSimpleName() + ':' + strValueOf;
                C29047d savedStateRegistry = interfaceC29049f.getSavedStateRegistry();
                Bundle bundleM88291a = savedStateRegistry.m88291a(str);
                if (bundleM88291a != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleM88291a.keySet()) {
                        ArrayList parcelableArrayList = bundleM88291a.getParcelableArrayList(str2);
                        AbstractC22676k.m65748h(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str2, parcelableArrayList);
                        interfaceC28601c2 = interfaceC28601c2;
                    }
                } else {
                    linkedHashMap = null;
                }
                interfaceC28601c1 = interfaceC28601c2;
                C2431r c2431r = C2431r.f9520E;
                C28674u2 c28674u2 = AbstractC39035h.f168004a;
                C39034g c39034g = new C39034g(linkedHashMap, c2431r);
                try {
                    savedStateRegistry.m88293c(str, new C2472z1(c39034g, 0));
                    z4 = true;
                } catch (IllegalArgumentException unused) {
                    z4 = false;
                }
                C2468y1 c2468y1 = new C2468y1(c39034g, new C2349a2(z4, savedStateRegistry, str));
                c28655q.m87172p0(c2468y1);
                objM87133R4 = c2468y1;
            } else {
                interfaceC28601c1 = interfaceC28601c2;
            }
            C2468y1 c2468y2 = (C2468y1) objM87133R4;
            boolean zM87157i = c28655q.m87157i(c2468y2);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                objM87133R5 = new C0227m1(c2468y2, 4);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R5, c28655q);
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC2379g2.m7352a(context) ? new C2458w1(androidComposeView.getView(), 0) : new C2429q2();
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC29805a interfaceC29805a = (InterfaceC29805a) objM87133R6;
            Configuration configuration = (Configuration) interfaceC28601c1.getValue();
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C15288c();
                c28655q.m87172p0(objM87133R7);
            }
            C15288c c15288c = (C15288c) objM87133R7;
            Object objM87133R8 = c28655q.m87133R();
            Object obj = objM87133R8;
            if (objM87133R8 == c28676v0) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c28655q.m87172p0(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new ComponentCallbacks2C2447u0(configuration3, c15288c);
                c28655q.m87172p0(objM87133R9);
            }
            ComponentCallbacks2C2447u0 componentCallbacks2C2447u0 = (ComponentCallbacks2C2447u0) objM87133R9;
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R10 = c28655q.m87133R();
            if (zM87157i2 || objM87133R10 == c28676v0) {
                objM87133R10 = new C2442t0(0, context, componentCallbacks2C2447u0);
                c28655q.m87172p0(objM87133R10);
            }
            AbstractC28683x.m87251e(c15288c, (Function1) objM87133R10, c28655q);
            Object objM87133R11 = c28655q.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = new C15289d();
                c28655q.m87172p0(objM87133R11);
            }
            C15289d c15289d = (C15289d) objM87133R11;
            Object objM87133R12 = c28655q.m87133R();
            if (objM87133R12 == c28676v0) {
                objM87133R12 = new ComponentCallbacks2C2452v0(c15289d);
                c28655q.m87172p0(objM87133R12);
            }
            ComponentCallbacks2C2452v0 componentCallbacks2C2452v0 = (ComponentCallbacks2C2452v0) objM87133R12;
            boolean zM87157i3 = c28655q.m87157i(context);
            Object objM87133R13 = c28655q.m87133R();
            if (zM87157i3 || objM87133R13 == c28676v0) {
                objM87133R13 = new C2442t0(1, context, componentCallbacks2C2452v0);
                c28655q.m87172p0(objM87133R13);
            }
            AbstractC28683x.m87251e(c15289d, (Function1) objM87133R13, c28655q);
            C28596b0 c28596b0 = AbstractC2453v1.f9583v;
            AbstractC28683x.m87248b(new C28673u1[]{f4975a.mo86977a((Configuration) interfaceC28601c1.getValue()), f4976b.mo86977a(context), AbstractC21412c.f82093a.mo86977a(viewTreeOwners.f9472a), AbstractC30178a.f123552a.mo86977a(interfaceC29049f), AbstractC39035h.f168004a.mo86977a(c2468y2), f4980f.mo86977a(androidComposeView.getView()), f4978d.mo86977a(c15288c), f4979e.mo86977a(c15289d), c28596b0.mo86977a(Boolean.valueOf(((Boolean) c28655q.m87161k(c28596b0)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), AbstractC2453v1.f9573l.mo86977a(interfaceC29805a)}, AbstractC37817c.m121344e(1059770793, c28655q, new C2432r0((Object) androidComposeView, (Object) c2368e1, (Object) interfaceC4351m, 0)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0231n1(androidComposeView, interfaceC4351m, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3596b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX INFO: renamed from: c */
    public static final C28596b0 m3597c() {
        return f4975a;
    }

    public static final AbstractC28669t1 getLocalLifecycleOwner() {
        return AbstractC21412c.f82093a;
    }

    public static final AbstractC28669t1 getLocalSavedStateRegistryOwner() {
        return AbstractC30178a.f123552a;
    }
}
