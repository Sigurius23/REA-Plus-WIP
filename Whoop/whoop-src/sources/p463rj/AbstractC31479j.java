package p463rj;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextPaint;
import android.util.Log;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2552j5;
import com.amplitude.android.engagement.types.ContentBlock;
import com.amplitude.android.engagement.types.SurveyListBlock;
import com.amplitude.android.engagement.types.SurveyListOther;
import com.amplitude.android.engagement.types.SurveyRatingBlock;
import com.amplitude.android.engagement.types.SurveyRatingType;
import com.amplitude.android.engagement.types.SurveyResponseEmoji;
import com.amplitude.android.engagement.types.SurveyResponseMultiSelect;
import com.amplitude.android.engagement.types.SurveyResponseNPS;
import com.amplitude.android.engagement.types.SurveyResponseNumber;
import com.amplitude.android.engagement.types.SurveyResponseSelect;
import com.amplitude.android.engagement.types.SurveyResponseText;
import com.amplitude.android.engagement.types.SurveyTextBlock;
import com.amplitude.android.engagement.types.SurveyTextShortBlock;
import com.google.android.gms.common.AbstractC4988e;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.stripe.android.uicore.elements.IdentifierSpec;
import d40.AbstractC11673r;
import eu.C13630q;
import g40.InterfaceC15361h1;
import gb.C15657r;
import gb.C15665z;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import j43.C21317a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25263q;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p026b2.C2320z;
import p031b9.AbstractC2875y;
import p043c4.C3951c;
import p043c4.C3955e;
import p043c4.C3967k;
import p072cp.BinderC10935b;
import p095dp.C12238b;
import p133f1.AbstractC13923a2;
import p133f1.C13995y1;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23076c3;
import p292l1.AbstractC23119j4;
import p292l1.AbstractC23138n;
import p292l1.AbstractC23146o1;
import p292l1.AbstractC23149o4;
import p292l1.AbstractC23215z4;
import p292l1.C23089e4;
import p292l1.C23107h4;
import p292l1.C23132m;
import p292l1.C23177t2;
import p292l1.C23209y4;
import p294l3.C23285v0;
import p305lj.AbstractC24425e0;
import p305lj.C24427f0;
import p305lj.C24429g0;
import p315m0.AbstractC24868a;
import p342nj.C26741f;
import p375op.AbstractC28076h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p401pj.C29257a;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p510u0.C34351r0;
import p525uj.AbstractC35032j;
import p525uj.AbstractC35033k;
import p525uj.C35031i;
import p525uj.C35035m;
import p529uo.AbstractC35135w;
import p530up.AbstractC35148d;
import p558vp.C36260d;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import rq2.C31755w;
import se.AbstractC32410a;
import wb3.AbstractC37056f;
import x30.C37901k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rj.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31479j {

    /* JADX INFO: renamed from: a */
    public static Context f129710a;

    /* JADX INFO: renamed from: b */
    public static C36260d f129711b;

    /* JADX INFO: renamed from: A */
    public static C36260d m96921A(Context context, int i13) {
        Log.i("j", "Making Creator dynamically");
        ClassLoader classLoader = m96947z(context, i13).getClassLoader();
        try {
            AbstractC35135w.m111094f(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) clsLoadClass.newInstance();
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                return iInterfaceQueryLocalInterface instanceof C36260d ? (C36260d) iInterfaceQueryLocalInterface : new C36260d(iBinder, "com.google.android.gms.maps.internal.ICreator", 3);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(clsLoadClass.getName()), e5);
            } catch (InstantiationException e13) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(clsLoadClass.getName()), e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e14);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m96922a(boolean z4, C37901k element, IdentifierSpec identifierSpec, Modifier modifier, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        AbstractC22676k.m65750j(element, "element");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-263409033);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(element) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(identifierSpec) : c28655q.m87157i(identifierSpec) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            modifier2 = modifier;
            i14 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            modifier2 = modifier;
        }
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(element.f162282c.f57610c.mo43544f(), c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(element.f162283d, c28655q, 0);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            AbstractC32410a.m101045o(null, (InterfaceC15361h1) interfaceC28601c1M83597t.getValue(), modifier2, false, AbstractC37817c.m121344e(920625571, c28655q, new C2552j5(element, z4, identifierSpec, 5)), c28655q, ((i14 >> 3) & 896) | 24582, 8);
            String str = (String) interfaceC28601c1M83597t2.getValue();
            c28655q.m87150e0(-1061128660);
            if (str != null) {
                AbstractC15011f9.m43114b(str, null, AbstractC11673r.m31082k(c28655q).f37672e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 0, 0, 131066);
                c28655q = c28655q;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31755w(z4, element, identifierSpec, modifier, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m96923b(String str, String str2, Function1 function1, Composer composer, int i13) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(777839254);
        if ((((c28655q2.m87153g(str) ? 4 : 2) | i13 | (c28655q2.m87153g(str2) ? 32 : 16) | (c28655q2.m87157i(function1) ? 256 : 128)) & 731) == 146 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            String str3 = str == null ? "" : str;
            C23285v0 c23285v0 = ((C23209y4) c28655q2.m87161k(AbstractC23215z4.f91921a)).f91880k;
            C23107h4 c23107h4 = C23107h4.f91269a;
            long j7 = AbstractC35032j.m110704f(c28655q2).f148347i0.f148283e;
            long j13 = AbstractC35032j.m110704f(c28655q2).f148347i0.f148283e;
            long j14 = AbstractC35032j.m110704f(c28655q2).f148347i0.f148285g;
            long j15 = AbstractC35032j.m110704f(c28655q2).f148347i0.f148285g;
            C17919x c17919x = AbstractC35032j.m110704f(c28655q2).f148347i0.f148289k;
            String str4 = str3;
            c28655q2.m87152f0(1703668997);
            long j16 = c17919x == null ? AbstractC35032j.m110704f(c28655q2).f148359p : c17919x.f69639a;
            int i14 = 0;
            c28655q2.m87173q(false);
            C17919x c17919x2 = AbstractC35032j.m110704f(c28655q2).f148347i0.f148289k;
            c28655q2.m87152f0(1703669168);
            long j17 = c17919x2 == null ? AbstractC35032j.m110704f(c28655q2).f148359p : c17919x2.f69639a;
            c28655q2.m87173q(false);
            long j18 = C17919x.f69636m;
            long j19 = C17919x.f69637n;
            C23089e4 c23089e4M67063a = C23107h4.m67086c((C23132m) c28655q2.m87161k(AbstractC23138n.f91494a), (C13995y1) c28655q2.m87161k(AbstractC13923a2.f49638a)).m67063a(j14, j15, j19, j19, j7, j13, j19, j19, j19, j19, null, j18, j18, j19, j19, j19, j19, j19, j19, j19, j19, j19, j19, j19, j19, j19, j19, j16, j17, j19, j19, j19, j19, j19, j19, j19, j19, j19, j19, j19, j19, j19, j19);
            C33252i c33252iM105485a = AbstractC33253j.m105485a(AbstractC35032j.m110704f(c28655q2).f148306C);
            Modifier modifierM44455h = AbstractC15751g.m44455h(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 1, AbstractC35032j.m110704f(c28655q2).f148364u, AbstractC33253j.m105485a(AbstractC35032j.m110704f(c28655q2).f148306C));
            int i15 = 7;
            C34351r0 c34351r0 = new C34351r0(i14, i14, i15, 119);
            boolean zM87153g = c28655q2.m87153g(function1);
            Object objM87133R = c28655q2.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C21317a(function1);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC23119j4.m67095a(str4, (Function1) objM87133R, modifierM44455h, false, c23285v0, AbstractC37817c.m121341b(-279783727, c28655q2, new C3955e(str2, i15)), null, c34351r0, null, true, 0, 0, c33252iM105485a, c23089e4M67063a, c28655q, 12582912);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C15657r(i13, str, str2, function1);
    }

    /* JADX INFO: renamed from: c */
    public static final void m96924c(ContentBlock block, AbstractC24425e0 abstractC24425e0, Function1 onResponseChanged, Composer composer, int i13) {
        AbstractC22676k.m65750j(block, "block");
        AbstractC22676k.m65750j(onResponseChanged, "onResponseChanged");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-766895504);
        int i14 = (c28655q.m87153g(block) ? 4 : 2) | i13 | (c28655q.m87153g(abstractC24425e0) ? 32 : 16) | (c28655q.m87157i(onResponseChanged) ? 256 : 128);
        if ((i14 & 731) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else if (block instanceof SurveyRatingBlock) {
            c28655q.m87152f0(-1770641449);
            m96929h((SurveyRatingBlock) block, abstractC24425e0, onResponseChanged, c28655q, (i14 & 896) | (i14 & 112) | 8);
            c28655q.m87173q(false);
        } else if (block instanceof SurveyListBlock) {
            c28655q.m87152f0(-1770641291);
            m96925d((SurveyListBlock) block, abstractC24425e0, onResponseChanged, c28655q, (i14 & 896) | (i14 & 112) | 8);
            c28655q.m87173q(false);
        } else {
            if (block instanceof SurveyTextBlock) {
                c28655q.m87152f0(-1770641135);
                m96935n((SurveyTextBlock) block, abstractC24425e0 instanceof SurveyResponseText ? (SurveyResponseText) abstractC24425e0 : null, onResponseChanged, c28655q, i14 & 896);
                c28655q.m87173q(false);
            } else if (block instanceof SurveyTextShortBlock) {
                c28655q.m87152f0(-1770640951);
                m96934m((SurveyTextShortBlock) block, abstractC24425e0 instanceof SurveyResponseText ? (SurveyResponseText) abstractC24425e0 : null, onResponseChanged, c28655q, i14 & 896);
                c28655q.m87173q(false);
            } else {
                c28655q.m87152f0(-1770640718);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C15657r(block, abstractC24425e0, onResponseChanged, i13, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final void m96925d(SurveyListBlock surveyListBlock, AbstractC24425e0 abstractC24425e0, Function1 function1, Composer composer, int i13) {
        Object obj;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(445086230);
        boolean zM87153g = c28655q.m87153g(surveyListBlock.getUuid());
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            obj = objM87133R;
            C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(surveyListBlock.getMeta().getOptions());
            Iterable<C25239c0> iterable = c25263qM74105J1;
            if (surveyListBlock.getMeta().isOrderRandom()) {
                List listM74099G1 = AbstractC25265s.m74099G1(c25263qM74105J1);
                Collections.shuffle(listM74099G1);
                iterable = listM74099G1;
            }
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (C25239c0 c25239c0 : iterable) {
                arrayList.add(new C23465k(Integer.valueOf(c25239c0.f99117a), new C31485p((String) c25239c0.f99118b, false, null)));
            }
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(arrayList);
            SurveyListOther otherOption = surveyListBlock.getMeta().getOtherOption();
            if (otherOption != null && AbstractC22676k.m65745e(otherOption.getEnabled(), Boolean.TRUE)) {
                String label = otherOption.getLabel();
                arrayListM74097F1.add(new C23465k(Integer.valueOf(arrayListM74097F1.size()), new C31485p((label == null || AbstractC39414r.m125890i0(label)) ? "Other" : otherOption.getLabel(), true, otherOption.getPlaceholderLabel())));
            }
            c28655q.m87172p0(arrayListM74097F1);
            obj = arrayListM74097F1;
        }
        obj = objM87133R;
        List list = (List) obj;
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
        if (AbstractC22676k.m65745e(surveyListBlock.getMeta().getDisplayType(), "dropdown")) {
            c28655q.m87152f0(1284235969);
            m96926e(surveyListBlock, list, abstractC24425e0 instanceof SurveyResponseSelect ? (SurveyResponseSelect) abstractC24425e0 : null, function1, c28655q, ((i13 << 3) & 7168) | 72);
            c28655q.m87173q(false);
        } else if (AbstractC22676k.m65745e(surveyListBlock.getMeta().getListType(), "multiple")) {
            c28655q.m87152f0(1284236288);
            m96927f(surveyListBlock, list, abstractC24425e0 instanceof SurveyResponseMultiSelect ? (SurveyResponseMultiSelect) abstractC24425e0 : null, function1, c28655q, ((i13 << 3) & 7168) | 584);
            c28655q.m87173q(false);
        } else {
            c28655q.m87152f0(1284236576);
            m96928g(surveyListBlock, list, abstractC24425e0 instanceof SurveyResponseSelect ? (SurveyResponseSelect) abstractC24425e0 : null, function1, c28655q, ((i13 << 3) & 7168) | 72);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3951c(surveyListBlock, abstractC24425e0, function1, i13, 3);
    }

    /* JADX INFO: renamed from: e */
    public static final void m96926e(SurveyListBlock surveyListBlock, List list, SurveyResponseSelect surveyResponseSelect, Function1 function1, Composer composer, int i13) {
        Object next;
        boolean z4;
        C24427f0 c24427f0M111194y;
        C24427f0 c24427f0M111194y2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-116363805);
        Integer numValueOf = (surveyResponseSelect == null || (c24427f0M111194y2 = AbstractC35148d.m111194y(surveyResponseSelect, surveyListBlock.getUuid())) == null) ? null : Integer.valueOf(c24427f0M111194y2.f95315a);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue = ((Number) ((C23465k) next).f92937w).intValue();
            if (numValueOf != null && iIntValue == numValueOf.intValue()) {
                break;
            }
        }
        C23465k c23465k = (C23465k) next;
        C31485p c31485p = c23465k != null ? (C31485p) c23465k.f92938x : null;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
        boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
        boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g || objM87133R3 == c28676v0) {
            objM87133R3 = new C29257a(2, interfaceC28601c1);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC23146o1.ExposedDropdownMenuBox(zBooleanValue, (Function1) objM87133R3, null, AbstractC37817c.m121341b(847198831, c28655q, new C26741f(c31485p, interfaceC28601c1, list, function1, surveyListBlock, interfaceC28601c2)), c28655q, 3072, 4);
        c28655q.m87152f0(624897056);
        if (((Boolean) interfaceC28601c2.getValue()).booleanValue()) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 8, 0.0f, 0.0f, 13);
            z4 = false;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            m96923b((surveyResponseSelect == null || (c24427f0M111194y = AbstractC35148d.m111194y(surveyResponseSelect, surveyListBlock.getUuid())) == null) ? null : c24427f0M111194y.f95317c, c31485p != null ? c31485p.f129730c : null, new C3967k(function1, surveyListBlock, numValueOf, list, c31485p, 4), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            z4 = false;
        }
        c28655q.m87173q(z4);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C31470a(surveyListBlock, list, surveyResponseSelect, function1, i13, 0);
    }

    /* JADX INFO: renamed from: f */
    public static final void m96927f(SurveyListBlock surveyListBlock, List list, SurveyResponseMultiSelect surveyResponseMultiSelect, Function1 function1, Composer composer, int i13) {
        C24429g0 c24429g0;
        List list2;
        List list3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-227437116);
        if (surveyResponseMultiSelect != null) {
            String blockId = surveyListBlock.getUuid();
            AbstractC22676k.m65750j(blockId, "blockId");
            c24429g0 = !AbstractC22676k.m65745e(surveyResponseMultiSelect.getBlockId(), blockId) ? null : new C24429g0(surveyResponseMultiSelect.getValue(), surveyResponseMultiSelect.getStringResponse(), surveyResponseMultiSelect.getOtherText());
        } else {
            c24429g0 = null;
        }
        C25271y c25271y = C25271y.f99162w;
        List list4 = (c24429g0 == null || (list3 = c24429g0.f95318a) == null) ? c25271y : list3;
        List list5 = (c24429g0 == null || (list2 = c24429g0.f95319b) == null) ? c25271y : list2;
        float f13 = 1.0f;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
        C22949e c22949e = AbstractC22977m.f90650a;
        int i14 = -412521741;
        c28655q.m87152f0(-412521741);
        C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
        boolean z4 = false;
        c28655q.m87173q(false);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(c35035m.f148317N), C2299e.f9110M, c28655q, 0);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
        c28655q.m87152f0(-492530596);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23465k c23465k = (C23465k) it.next();
            int iIntValue = ((Number) c23465k.f92937w).intValue();
            C31485p c31485p = (C31485p) c23465k.f92938x;
            boolean zContains = list4.contains(Integer.valueOf(iIntValue));
            C2314t c2314t2 = c2314t;
            String str = c31485p.f129728a;
            C31471b c31471b = new C31471b(list4, iIntValue, list5, c31485p, function1, surveyListBlock);
            c28655q.m87152f0(i14);
            C35035m c35035m2 = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
            c28655q.m87173q(z4);
            boolean z13 = z4;
            float f14 = f13;
            int i15 = i14;
            AbstractC31484o.m96950b(zContains, str, "multiple", c31471b, c35035m2.f148355m0, null, c28655q, 384);
            if (c31485p.f129729b && list4.contains(Integer.valueOf(iIntValue))) {
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(f14, c2314t2), 0.0f, 4, 0.0f, 0.0f, 13);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z13);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                String str2 = c24429g0 != null ? c24429g0.f95320c : null;
                String str3 = c31485p.f129730c;
                List list6 = list5;
                List list7 = list4;
                C13630q c13630q = new C13630q(function1, surveyListBlock, list7, list6, 1);
                list4 = list7;
                list5 = list6;
                m96923b(str2, str3, c13630q, c28655q, z13 ? 1 : 0);
                c28655q.m87173q(true);
            }
            c2314t = c2314t2;
            z4 = z13 ? 1 : 0;
            i14 = i15;
            f13 = f14;
        }
        c28655q.m87173q(z4);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C15665z(i13, 2, surveyListBlock, list, surveyResponseMultiSelect, function1);
    }

    /* JADX INFO: renamed from: g */
    public static final void m96928g(SurveyListBlock surveyListBlock, List list, SurveyResponseSelect surveyResponseSelect, Function1 function1, Composer composer, int i13) {
        C24427f0 c24427f0M111194y;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1886840600);
        Integer numValueOf = (surveyResponseSelect == null || (c24427f0M111194y = AbstractC35148d.m111194y(surveyResponseSelect, surveyListBlock.getUuid())) == null) ? null : Integer.valueOf(c24427f0M111194y.f95315a);
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
        C22949e c22949e = AbstractC22977m.f90650a;
        int i14 = -412521741;
        c28655q.m87152f0(-412521741);
        C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
        c28655q.m87173q(false);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(c35035m.f148317N), C2299e.f9110M, c28655q, 0);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
        c28655q.m87152f0(-1189416127);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23465k c23465k = (C23465k) it.next();
            int iIntValue = ((Number) c23465k.f92937w).intValue();
            C31485p c31485p = (C31485p) c23465k.f92938x;
            boolean z4 = numValueOf != null && numValueOf.intValue() == iIntValue;
            String str = c31485p.f129728a;
            C31472c c31472c = new C31472c(function1, surveyListBlock, iIntValue, c31485p, 0);
            c28655q.m87152f0(i14);
            C35035m c35035m2 = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
            c28655q.m87173q(false);
            AbstractC31484o.m96950b(z4, str, "single", c31472c, c35035m2.f148353l0, null, c28655q, 384);
            if (c31485p.f129729b && numValueOf != null && numValueOf.intValue() == iIntValue) {
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 4, 0.0f, 0.0f, 13);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                C24427f0 c24427f0M111194y2 = AbstractC35148d.m111194y(surveyResponseSelect, surveyListBlock.getUuid());
                m96923b(c24427f0M111194y2 != null ? c24427f0M111194y2.f95317c : null, c31485p.f129730c, new C31472c(function1, surveyListBlock, iIntValue, c31485p, 1), c28655q, 0);
                c28655q.m87173q(true);
            }
            i14 = -412521741;
        }
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C31470a(surveyListBlock, list, surveyResponseSelect, function1, i13, 1);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x013e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0142  */
    /* JADX WARN: Code duplicated, block: B:35:0x0161  */
    /* JADX WARN: Code duplicated, block: B:38:0x017c  */
    /* JADX WARN: Code duplicated, block: B:40:0x017f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0182  */
    /* JADX WARN: Code duplicated, block: B:44:0x018c  */
    /* JADX WARN: Code duplicated, block: B:47:0x019b  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0249  */
    /* JADX WARN: Code duplicated, block: B:71:0x024d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0268  */
    /* JADX WARN: Code duplicated, block: B:79:0x02ec A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x02ed  */
    /* JADX INFO: renamed from: h */
    public static final void m96929h(SurveyRatingBlock surveyRatingBlock, AbstractC24425e0 abstractC24425e0, Function1 function1, Composer composer, int i13) {
        C35031i c35031i;
        int[] iArr;
        int iHashCode;
        int i14;
        int iHashCode2;
        C28677v1 c28677v1M87180u;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2097969162);
        int i15 = c28655q.f115903S ? -c28655q.f115893I.f115802v : c28655q.f115891G.f115746i;
        SurveyRatingType type = surveyRatingBlock.getMeta().getType();
        int[] iArr2 = AbstractC31478i.f129709a;
        int i16 = iArr2[type.ordinal()];
        if (i16 == 1) {
            c28655q.m87152f0(381207818);
            c28655q.m87152f0(-412521741);
            C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
            c28655q.m87173q(false);
            c35031i = c35035m.f148341f0;
            c28655q.m87173q(false);
        } else if (i16 == 2) {
            c28655q.m87152f0(381207885);
            c28655q.m87152f0(-412521741);
            C35035m c35035m2 = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
            c28655q.m87173q(false);
            c35031i = c35035m2.f148345h0;
            c28655q.m87173q(false);
        } else if (i16 != 3) {
            c28655q.m87152f0(381207999);
            c28655q.m87152f0(-412521741);
            C35035m c35035m3 = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
            c28655q.m87173q(false);
            c35031i = c35035m3.f148343g0;
            c28655q.m87173q(false);
        } else {
            c28655q.m87152f0(381207949);
            c28655q.m87152f0(-412521741);
            C35035m c35035m4 = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
            c28655q.m87173q(false);
            c35031i = c35035m4.f148343g0;
            c28655q.m87173q(false);
        }
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC35032j.m110704f(c28655q).f148366w, AbstractC17918w0.f69621a);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
        int iHashCode3 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (!c28655q.f115903S) {
            iArr = iArr2;
            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(4);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l = C2299e.f9107J;
            C35031i c35031i2 = c35031i;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            i14 = iArr[surveyRatingBlock.getMeta().getType().ordinal()];
            if (i14 != 1) {
                c28655q.m87152f0(2030158901);
                m96930i(surveyRatingBlock, abstractC24425e0 instanceof SurveyResponseEmoji ? (SurveyResponseEmoji) abstractC24425e0 : null, function1, c28655q, (i13 & 896) | 8);
                c28655q.m87173q(false);
            } else if (i14 != 2) {
                c28655q.m87152f0(2030159212);
                m96933l(surveyRatingBlock, abstractC24425e0 instanceof SurveyResponseNumber ? (SurveyResponseNumber) abstractC24425e0 : null, function1, c28655q, (i13 & 896) | 8);
                c28655q.m87173q(false);
            } else if (i14 != 3) {
                c28655q.m87152f0(2030159809);
                m96932k(surveyRatingBlock, abstractC24425e0 instanceof SurveyResponseNumber ? (SurveyResponseNumber) abstractC24425e0 : null, function1, c28655q, (i13 & 896) | 8);
                c28655q.m87173q(false);
            } else {
                c28655q.m87152f0(2030159521);
                m96931j(surveyRatingBlock, abstractC24425e0 instanceof SurveyResponseNPS ? (SurveyResponseNPS) abstractC24425e0 : null, function1, c28655q, (i13 & 896) | 8);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (surveyRatingBlock.getMeta().getLowerLabel().length() != 0 && surveyRatingBlock.getMeta().getUpperLabel().length() == 0) {
                c28655q.m87183x(i15);
                C28677v1 c28677v1M87180u2 = c28655q.m87180u();
                if (c28677v1M87180u2 == null) {
                    return;
                }
                c28677v1M87180u2.f115982d = new C31473d(surveyRatingBlock, abstractC24425e0, function1, i13, 0);
                return;
            }
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 8, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC23149o4.m67127b(surveyRatingBlock.getMeta().getLowerLabel(), null, AbstractC35032j.m110704f(c28655q).f148359p, 0L, null, 0L, null, 0L, 0, false, 0, 0, AbstractC35032j.m110704f(c28655q).m110712b(Integer.valueOf(c35031i2.f148286h), c28655q, 0), c28655q, 0, 0, 65530);
            AbstractC23149o4.m67127b(surveyRatingBlock.getMeta().getUpperLabel(), null, AbstractC35032j.m110704f(c28655q).f148359p, 0L, null, 0L, null, 0L, 0, false, 0, 0, AbstractC35032j.m110704f(c28655q).m110712b(Integer.valueOf(c35031i2.f148286h), c28655q, 0), c28655q, 0, 0, 65530);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u == null) {
                return;
            }
            c28677v1M87180u.f115982d = new C31473d(surveyRatingBlock, abstractC24425e0, function1, i13, 1);
        }
        iArr = iArr2;
        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
        C0209i c0209i5 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
        C22971k c22971kM66746i2 = AbstractC22977m.m66746i(4);
        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
        C2306l c2306l2 = C2299e.f9107J;
        C35031i c35031i3 = c35031i;
        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l2, c28655q, 6);
        iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        } else {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
        i14 = iArr[surveyRatingBlock.getMeta().getType().ordinal()];
        if (i14 != 1) {
            c28655q.m87152f0(2030158901);
            m96930i(surveyRatingBlock, abstractC24425e0 instanceof SurveyResponseEmoji ? (SurveyResponseEmoji) abstractC24425e0 : null, function1, c28655q, (i13 & 896) | 8);
            c28655q.m87173q(false);
        } else if (i14 != 2) {
            c28655q.m87152f0(2030159212);
            m96933l(surveyRatingBlock, abstractC24425e0 instanceof SurveyResponseNumber ? (SurveyResponseNumber) abstractC24425e0 : null, function1, c28655q, (i13 & 896) | 8);
            c28655q.m87173q(false);
        } else if (i14 != 3) {
            c28655q.m87152f0(2030159809);
            m96932k(surveyRatingBlock, abstractC24425e0 instanceof SurveyResponseNumber ? (SurveyResponseNumber) abstractC24425e0 : null, function1, c28655q, (i13 & 896) | 8);
            c28655q.m87173q(false);
        } else {
            c28655q.m87152f0(2030159521);
            m96931j(surveyRatingBlock, abstractC24425e0 instanceof SurveyResponseNPS ? (SurveyResponseNPS) abstractC24425e0 : null, function1, c28655q, (i13 & 896) | 8);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        if (surveyRatingBlock.getMeta().getLowerLabel().length() != 0) {
        }
        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 8, 0.0f, 0.0f, 13);
        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l2, c28655q, 6);
        iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        } else {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        }
        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
        AbstractC23149o4.m67127b(surveyRatingBlock.getMeta().getLowerLabel(), null, AbstractC35032j.m110704f(c28655q).f148359p, 0L, null, 0L, null, 0L, 0, false, 0, 0, AbstractC35032j.m110704f(c28655q).m110712b(Integer.valueOf(c35031i3.f148286h), c28655q, 0), c28655q, 0, 0, 65530);
        AbstractC23149o4.m67127b(surveyRatingBlock.getMeta().getUpperLabel(), null, AbstractC35032j.m110704f(c28655q).f148359p, 0L, null, 0L, null, 0L, 0, false, 0, 0, AbstractC35032j.m110704f(c28655q).m110712b(Integer.valueOf(c35031i3.f148286h), c28655q, 0), c28655q, 0, 0, 65530);
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C31473d(surveyRatingBlock, abstractC24425e0, function1, i13, 1);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX INFO: renamed from: i */
    public static final void m96930i(SurveyRatingBlock surveyRatingBlock, SurveyResponseEmoji surveyResponseEmoji, Function1 function1, Composer composer, int i13) {
        Integer num;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1557149060);
        if (surveyResponseEmoji != null) {
            String blockId = surveyRatingBlock.getUuid();
            AbstractC22676k.m65750j(blockId, "blockId");
            C23465k c23465k = !AbstractC22676k.m65745e(surveyResponseEmoji.getBlockId(), blockId) ? null : new C23465k(Integer.valueOf(surveyResponseEmoji.getValue()), surveyResponseEmoji.getStringResponse());
            if (c23465k != null) {
                num = (Integer) c23465k.f92937w;
            } else {
                num = null;
            }
        } else {
            num = null;
        }
        c28655q.m87152f0(-412521741);
        C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
        c28655q.m87173q(false);
        C35031i c35031i = c35035m.f148341f0;
        C22971k c22971kM66746i = AbstractC22977m.m66746i(4);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, C2299e.f9107J, c28655q, 6);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        List<String> emojis = surveyRatingBlock.getMeta().getEmojis();
        c28655q.m87152f0(1841928270);
        if (emojis != null) {
            int i14 = 0;
            for (Object obj : emojis) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                String str = (String) obj;
                boolean z4 = num != null && num.intValue() == i15;
                C31474e c31474e = new C31474e(function1, z4, surveyRatingBlock, i15, str);
                Float f13 = c35031i.f148280b;
                float fFloatValue = f13 != null ? f13.floatValue() : 1.0f / surveyRatingBlock.getMeta().getOptions();
                Integer num2 = num;
                if (fFloatValue <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (fFloatValue > Float.MAX_VALUE) {
                    fFloatValue = Float.MAX_VALUE;
                }
                AbstractC31484o.m96951c(str, z4, c31474e, c35031i, new LayoutWeightElement(fFloatValue, true), c28655q, 0);
                num = num2;
                i14 = i15;
            }
        }
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3951c(surveyRatingBlock, surveyResponseEmoji, function1, i13, 4);
    }

    /* JADX INFO: renamed from: j */
    public static final void m96931j(SurveyRatingBlock surveyRatingBlock, SurveyResponseNPS surveyResponseNPS, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2061509286);
        Integer numValueOf = null;
        if (surveyResponseNPS != null) {
            String blockId = surveyRatingBlock.getUuid();
            AbstractC22676k.m65750j(blockId, "blockId");
            if (AbstractC22676k.m65745e(surveyResponseNPS.getBlockId(), blockId)) {
                numValueOf = Integer.valueOf(surveyResponseNPS.getValue());
            }
        }
        Integer num = numValueOf;
        c28655q.m87152f0(-412521741);
        C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
        c28655q.m87173q(false);
        C35031i c35031i = c35035m.f148343g0;
        C22971k c22971kM66746i = AbstractC22977m.m66746i(4);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, C2299e.f9107J, c28655q, 6);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        c28655q.m87152f0(538479498);
        int options = surveyRatingBlock.getMeta().getOptions() + 1;
        int i14 = 0;
        while (i14 < options) {
            boolean z4 = num != null && num.intValue() == i14;
            int i15 = i14;
            String strValueOf = String.valueOf(i15);
            C31475f c31475f = new C31475f(function1, z4, surveyRatingBlock, i15, 0);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC31484o.m96951c(strValueOf, z4, c31475f, c35031i, new LayoutWeightElement(1.0f, true), c28655q, 0);
            i14 = i15 + 1;
        }
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3951c(surveyRatingBlock, surveyResponseNPS, function1, i13, 5);
    }

    /* JADX INFO: renamed from: k */
    public static final void m96932k(SurveyRatingBlock surveyRatingBlock, SurveyResponseNumber surveyResponseNumber, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(555448618);
        Integer numM111193x = surveyResponseNumber != null ? AbstractC35148d.m111193x(surveyResponseNumber, surveyRatingBlock.getUuid()) : null;
        c28655q.m87152f0(-412521741);
        C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
        c28655q.m87173q(false);
        C35031i c35031i = c35035m.f148343g0;
        C22971k c22971kM66746i = AbstractC22977m.m66746i(4);
        float f13 = 1.0f;
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, C2299e.f9107J, c28655q, 6);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        c28655q.m87152f0(-421327564);
        int options = surveyRatingBlock.getMeta().getOptions();
        int i14 = 0;
        while (i14 < options) {
            int i15 = i14 + 1;
            boolean z4 = numM111193x != null && numM111193x.intValue() == i15;
            String strValueOf = String.valueOf(i15);
            C31475f c31475f = new C31475f(function1, z4, surveyRatingBlock, i15, 1);
            Float f14 = c35031i.f148280b;
            float fFloatValue = f14 != null ? f14.floatValue() : f13 / surveyRatingBlock.getMeta().getOptions();
            if (fFloatValue <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (fFloatValue > Float.MAX_VALUE) {
                fFloatValue = Float.MAX_VALUE;
            }
            AbstractC31484o.m96951c(strValueOf, z4, c31475f, c35031i, new LayoutWeightElement(fFloatValue, true), c28655q, 0);
            i14 = i15;
            f13 = 1.0f;
        }
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C31476g(surveyRatingBlock, surveyResponseNumber, function1, i13, 0);
    }

    /* JADX INFO: renamed from: l */
    public static final void m96933l(SurveyRatingBlock surveyRatingBlock, SurveyResponseNumber surveyResponseNumber, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(634739290);
        Integer numM111193x = surveyResponseNumber != null ? AbstractC35148d.m111193x(surveyResponseNumber, surveyRatingBlock.getUuid()) : null;
        c28655q.m87152f0(-412521741);
        C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
        c28655q.m87173q(false);
        C35031i c35031i = c35035m.f148345h0;
        C22971k c22971kM66746i = AbstractC22977m.m66746i(4);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, C2299e.f9107J, c28655q, 6);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        c28655q.m87152f0(-2046174023);
        int options = surveyRatingBlock.getMeta().getOptions();
        int i14 = 0;
        while (i14 < options) {
            int i15 = i14 + 1;
            boolean z4 = numM111193x != null && i15 <= numM111193x.intValue();
            C31477h c31477h = new C31477h(function1, numM111193x, i15, surveyRatingBlock);
            Float f13 = c35031i.f148280b;
            float fFloatValue = f13 != null ? f13.floatValue() : 1.0f / surveyRatingBlock.getMeta().getOptions();
            if (fFloatValue <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (fFloatValue > Float.MAX_VALUE) {
                fFloatValue = Float.MAX_VALUE;
            }
            AbstractC31484o.m96952d(z4, c31477h, c35031i, new LayoutWeightElement(fFloatValue, true), c28655q, 0);
            i14 = i15;
        }
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C31476g(surveyRatingBlock, surveyResponseNumber, function1, i13, 1);
    }

    /* JADX INFO: renamed from: m */
    public static final void m96934m(SurveyTextShortBlock surveyTextShortBlock, SurveyResponseText surveyResponseText, Function1 function1, Composer composer, int i13) {
        int i14;
        String strM111195z;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(531509349);
        if ((i13 & 14) == 0) {
            i14 = (c28655q2.m87153g(surveyTextShortBlock) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= c28655q2.m87153g(surveyResponseText) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if ((i14 & 731) == 146 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            if (surveyResponseText == null || (strM111195z = AbstractC35148d.m111195z(surveyResponseText, surveyTextShortBlock.getUuid())) == null) {
                strM111195z = "";
            }
            String str = strM111195z;
            C23177t2 c23177t2 = C23177t2.f91688a;
            long j7 = AbstractC35032j.m110704f(c28655q2).f148347i0.f148284f;
            long j13 = AbstractC35032j.m110704f(c28655q2).f148365v;
            long j14 = AbstractC35032j.m110704f(c28655q2).f148365v;
            long j15 = AbstractC35032j.m110704f(c28655q2).f148347i0.f148283e;
            long j16 = AbstractC35032j.m110704f(c28655q2).f148347i0.f148283e;
            long j17 = AbstractC35032j.m110704f(c28655q2).f148368y;
            long j18 = AbstractC35032j.m110704f(c28655q2).f148347i0.f148285g;
            long j19 = AbstractC35032j.m110704f(c28655q2).f148347i0.f148285g;
            long j24 = AbstractC35032j.m110704f(c28655q2).f148360q;
            C17919x c17919x = AbstractC35032j.m110704f(c28655q2).f148347i0.f148289k;
            c28655q2.m87152f0(199884136);
            long j25 = c17919x == null ? AbstractC35032j.m110704f(c28655q2).f148359p : c17919x.f69639a;
            c28655q2.m87173q(false);
            C17919x c17919x2 = AbstractC35032j.m110704f(c28655q2).f148347i0.f148289k;
            c28655q2.m87152f0(199884263);
            long j26 = c17919x2 == null ? AbstractC35032j.m110704f(c28655q2).f148359p : c17919x2.f69639a;
            c28655q2.m87173q(false);
            C23089e4 c23089e4M67138c = C23177t2.m67138c(j18, j19, j24, j15, j16, j17, j7, j13, j14, j25, j26, AbstractC35032j.m110704f(c28655q2).f148360q, c28655q2);
            C33252i c33252iM105485a = AbstractC33253j.m105485a(AbstractC35032j.m110704f(c28655q2).f148347i0.f148282d);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            int i15 = 0;
            C34351r0 c34351r0 = new C34351r0(i15, i15, 7, 119);
            boolean zM87153g = c28655q2.m87153g(function1) | c28655q2.m87153g(surveyTextShortBlock);
            Object objM87133R = c28655q2.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2320z(22, function1, surveyTextShortBlock);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC23076c3.m67045a(str, (Function1) objM87133R, modifierM3409f, false, null, AbstractC37817c.m121341b(196503884, c28655q2, new C3955e(surveyTextShortBlock, 8)), null, c34351r0, null, true, 0, 0, c33252iM105485a, c23089e4M67138c, c28655q2, 12583296, 12779520, 1933176);
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3951c(surveyTextShortBlock, surveyResponseText, function1, i13, 6);
    }

    /* JADX INFO: renamed from: n */
    public static final void m96935n(SurveyTextBlock surveyTextBlock, SurveyResponseText surveyResponseText, Function1 function1, Composer composer, int i13) {
        int i14;
        String strM111195z;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-536832503);
        if ((i13 & 14) == 0) {
            i14 = (c28655q2.m87153g(surveyTextBlock) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= c28655q2.m87153g(surveyResponseText) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if ((i14 & 731) == 146 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            if (surveyResponseText == null || (strM111195z = AbstractC35148d.m111195z(surveyResponseText, surveyTextBlock.getUuid())) == null) {
                strM111195z = "";
            }
            String str = strM111195z;
            C23177t2 c23177t2 = C23177t2.f91688a;
            long j7 = AbstractC35032j.m110704f(c28655q2).f148349j0.f148284f;
            long j13 = AbstractC35032j.m110704f(c28655q2).f148365v;
            long j14 = AbstractC35032j.m110704f(c28655q2).f148365v;
            long j15 = AbstractC35032j.m110704f(c28655q2).f148349j0.f148283e;
            long j16 = AbstractC35032j.m110704f(c28655q2).f148349j0.f148283e;
            long j17 = AbstractC35032j.m110704f(c28655q2).f148368y;
            long j18 = AbstractC35032j.m110704f(c28655q2).f148349j0.f148285g;
            long j19 = AbstractC35032j.m110704f(c28655q2).f148349j0.f148285g;
            long j24 = AbstractC35032j.m110704f(c28655q2).f148360q;
            C17919x c17919x = AbstractC35032j.m110704f(c28655q2).f148349j0.f148289k;
            c28655q2.m87152f0(-728881123);
            long j25 = c17919x == null ? AbstractC35032j.m110704f(c28655q2).f148359p : c17919x.f69639a;
            c28655q2.m87173q(false);
            C17919x c17919x2 = AbstractC35032j.m110704f(c28655q2).f148349j0.f148289k;
            c28655q2.m87152f0(-728880993);
            long j26 = c17919x2 == null ? AbstractC35032j.m110704f(c28655q2).f148359p : c17919x2.f69639a;
            c28655q2.m87173q(false);
            C23089e4 c23089e4M67138c = C23177t2.m67138c(j18, j19, j24, j15, j16, j17, j7, j13, j14, j25, j26, AbstractC35032j.m110704f(c28655q2).f148360q, c28655q2);
            C33252i c33252iM105485a = AbstractC33253j.m105485a(AbstractC35032j.m110704f(c28655q2).f148349j0.f148282d);
            Modifier modifierM3411h = AbstractC1102d.m3411h(120, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            boolean zM87153g = c28655q2.m87153g(function1) | c28655q2.m87153g(surveyTextBlock);
            Object objM87133R = c28655q2.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2320z(23, function1, surveyTextBlock);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC23076c3.m67045a(str, (Function1) objM87133R, modifierM3411h, false, null, AbstractC37817c.m121341b(-381127760, c28655q2, new C3955e(surveyTextBlock, 9)), null, null, null, false, 5, 0, c33252iM105485a, c23089e4M67138c, c28655q2, 12583296, 100663296, 1834872);
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3951c(surveyTextBlock, surveyResponseText, function1, i13, 7);
    }

    /* JADX INFO: renamed from: o */
    public static String m96936o(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM8300m;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            length = objArr.length;
            if (i14 >= length) {
                break;
            }
            Object obj = objArr[i14];
            if (obj == null) {
                strM8300m = "null";
            } else {
                try {
                    strM8300m = obj.toString();
                } catch (Exception e5) {
                    String strM53370k = AbstractC18489d0.m53370k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM53370k), (Throwable) e5);
                    strM8300m = AbstractC2875y.m8300m("<", strM53370k, " threw ", e5.getClass().getName(), ">");
                }
            }
            objArr[i14] = strM8300m;
            i14++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length * 16));
        int i15 = 0;
        while (true) {
            length2 = objArr.length;
            if (i13 >= length2 || (iIndexOf = str.indexOf("%s", i15)) == -1) {
                break;
            }
            sb4.append((CharSequence) str, i15, iIndexOf);
            sb4.append(objArr[i13]);
            i13++;
            i15 = iIndexOf + 2;
        }
        sb4.append((CharSequence) str, i15, str.length());
        if (i13 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i13]);
            for (int i16 = i13 + 1; i16 < objArr.length; i16++) {
                sb4.append(", ");
                sb4.append(objArr[i16]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: p */
    public static void m96937p(StringBuilder sb4, String key) {
        AbstractC22676k.m65750j(key, "key");
        sb4.append('\"');
        int length = key.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = key.charAt(i13);
            if (cCharAt == '\n') {
                sb4.append("%0A");
            } else if (cCharAt == '\r') {
                sb4.append("%0D");
            } else if (cCharAt != '\"') {
                sb4.append(cCharAt);
            } else {
                sb4.append("%22");
            }
        }
        sb4.append('\"');
    }

    /* JADX INFO: renamed from: q */
    public static float m96938q(float f13, float f14, float f15) {
        if (f13 < f14) {
            return f14;
        }
        return f13 > f15 ? f15 : f13;
    }

    /* JADX INFO: renamed from: r */
    public static int m96939r(int i13, int i14, int i15) {
        if (i13 < i14) {
            return i14;
        }
        return i13 > i15 ? i15 : i13;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m96940s(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static long m96941t(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* JADX INFO: renamed from: u */
    public static boolean m96942u(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    /* JADX INFO: renamed from: v */
    public static String m96943v(int i13) {
        switch (i13) {
            case 514:
                return "OP CODE NOT SUPPORTED";
            case 515:
                return "INVALID PARAM";
            case 516:
                return "INSUFFICIENT RESOURCES";
            case 517:
                return "INVALID OBJECT";
            case 518:
            case 521:
            default:
                return AbstractC2875y.m8296i(i13, "UNKNOWN (", ")");
            case 519:
                return "UNSUPPORTED TYPE";
            case 520:
                return "OPERATION NOT PERMITTED";
            case 522:
                return "OPERATION FAILED";
            case 523:
                return "EXTENDED ERROR";
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m96944w(int i13) {
        if (i13 != 2050) {
            return i13 != 2052 ? AbstractC2875y.m8296i(i13, "UNKNOWN (", ")") : "OPERATION FAILED";
        }
        return "OP CODE NOT SUPPORTED";
    }

    /* JADX INFO: renamed from: x */
    public static String m96945x(int i13) {
        switch (i13) {
            case 1026:
                return "Wrong command format";
            case 1027:
                return "Unknown command";
            case 1028:
                return "Init command invalid";
            case 1029:
                return "FW version failure";
            case 1030:
                return "HW version failure";
            case 1031:
                return "SD version failure";
            case 1032:
                return "Signature mismatch";
            case 1033:
                return "Wrong hash type";
            case 1034:
                return "Hash failed";
            case 1035:
                return "Wrong signature type";
            case 1036:
                return "Verification failed";
            case 1037:
                return "Insufficient space";
            default:
                return "Reserved for future use";
        }
    }

    /* JADX INFO: renamed from: y */
    public static C36260d m96946y(Context context) throws GooglePlayServicesNotAvailableException {
        AbstractC35135w.m111094f(context);
        Log.d("j", "preferredRenderer: ".concat("null"));
        C36260d c36260d = f129711b;
        if (c36260d != null) {
            return c36260d;
        }
        AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
        int iM15612a = AbstractC4988e.m15612a(context, 13400000);
        if (iM15612a != 0) {
            throw new GooglePlayServicesNotAvailableException(iM15612a);
        }
        C36260d c36260dM96921A = m96921A(context, 0);
        f129711b = c36260dM96921A;
        try {
            Parcel parcelM57321j0 = c36260dM96921A.m57321j0(c36260dM96921A.m57322k0(), 9);
            int i13 = parcelM57321j0.readInt();
            parcelM57321j0.recycle();
            if (i13 == 2) {
                try {
                    C36260d c36260d2 = f129711b;
                    BinderC10935b binderC10935b = new BinderC10935b(m96947z(context, 0));
                    Parcel parcelM57322k0 = c36260d2.m57322k0();
                    AbstractC28076h.m84852d(parcelM57322k0, binderC10935b);
                    c36260d2.m57323l0(parcelM57322k0, 11);
                } catch (RemoteException e5) {
                    throw new RuntimeRemoteException(e5);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w("j", "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    f129710a = null;
                    f129711b = m96921A(context, 1);
                }
            }
            try {
                C36260d c36260d3 = f129711b;
                Context contextM96947z = m96947z(context, 0);
                contextM96947z.getClass();
                BinderC10935b binderC10935b2 = new BinderC10935b(contextM96947z.getResources());
                Parcel parcelM57322k1 = c36260d3.m57322k0();
                AbstractC28076h.m84852d(parcelM57322k1, binderC10935b2);
                parcelM57322k1.writeInt(18020000);
                c36260d3.m57323l0(parcelM57322k1, 6);
                return f129711b;
            } catch (RemoteException e13) {
                throw new RuntimeRemoteException(e13);
            }
        } catch (RemoteException e14) {
            throw new RuntimeRemoteException(e14);
        }
    }

    /* JADX INFO: renamed from: z */
    public static Context m96947z(Context context, int i13) {
        Context contextCreatePackageContext;
        Context context2 = f129710a;
        if (context2 != null) {
            return context2;
        }
        String str = i13 == 1 ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextCreatePackageContext = C12238b.m34029c(context, C12238b.f40940b, str).f40951a;
        } catch (Exception e5) {
            try {
                if (str.equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("j", "Failed to load maps module, use pre-Chimera", e5);
                    AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("j", "Attempting to load maps_dynamite again.");
                        contextCreatePackageContext = C12238b.m34029c(context, C12238b.f40940b, "com.google.android.gms.maps_dynamite").f40951a;
                    } catch (Exception e13) {
                        Log.e("j", "Failed to load maps module, use pre-Chimera", e13);
                        AtomicBoolean atomicBoolean2 = AbstractC4988e.f20525a;
                        contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
        }
        f129710a = contextCreatePackageContext;
        return contextCreatePackageContext;
    }
}
