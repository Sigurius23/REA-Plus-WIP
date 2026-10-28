package bi;

import a00.C0073h;
import a81.C0561l;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1637w1;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.C1844y;
import b30.AbstractC2573m2;
import b30.C2539i0;
import b30.C2639v1;
import b83.AbstractC2808d;
import bc3.AbstractC3006f0;
import be.C3151d;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import c93.InterfaceC4353o;
import c93.InterfaceC4354p;
import ch.C4598s;
import com.amplitude.android.engagement.types.DebugStatus;
import com.whoop.android.R;
import com.whoop.profile.view.edit.C9786j;
import cz.C11205i0;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import eu.C13602b;
import eu.C13604c;
import eu.C13621k0;
import eu.C13623l0;
import eu.C13625m0;
import eu.C13635v;
import g40.AbstractC15327b3;
import g40.C15352f4;
import g40.C15425t2;
import g40.InterfaceC15450y2;
import ga3.C15623a;
import ge3.AbstractC15751g;
import hb3.AbstractC17104a0;
import hb3.InterfaceC17126o;
import i63.C18160b0;
import i63.C18166e0;
import i93.C18284j;
import io.getstream.chat.android.client.internal.state.utils.internal.C19378a;
import io.getstream.chat.android.client.internal.state.utils.internal.C19379b;
import io.getstream.chat.android.client.internal.state.utils.internal.C19380c;
import j93.InterfaceC21467g;
import ja3.C21513i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kk1.C22541b;
import kotlin.C2032u;
import l83.C23454a0;
import l83.C23465k;
import l93.C23546a;
import live.hms.video.utils.AndroidSDKConstants;
import lt2.C24738a;
import m00.C24869a;
import m00.C24872d;
import m40.C25046w;
import m83.AbstractC25265s;
import n53.C26307a2;
import n53.C26318e;
import ng3.C26701n;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import org.json.JSONObject;
import ov2.C28402f;
import p000.AbstractC11266d;
import p002a0.C0043o0;
import p002a0.C0047q0;
import p003a1.C0103b;
import p003a1.C0105d;
import p003a1.C0106e;
import p005a3.AbstractC0201g;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p005a3.InterfaceC0229n;
import p008a7.AbstractC0514e;
import p008a7.C0512c;
import p008a7.C0513d;
import p021av.C2088b;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2371f;
import p035bp.AbstractC3511b;
import p042c2.C3862g;
import p042c2.InterfaceC3871p;
import p048ce.C4472m;
import p097ds.AbstractC12311n;
import p097ds.C12300c;
import p097ds.C12310m;
import p098dt.AbstractC12350b;
import p161g.AbstractActivityC14909l;
import p164g2.InterfaceC15237i;
import p181h2.C16618c;
import p208i2.C17919x;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23112i3;
import p292l1.AbstractC23149o4;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p326mf.C25481a;
import p326mf.C25500t;
import p326mf.EnumC25499s;
import p335n6.AbstractC26394k;
import p335n6.C26396m;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26398o;
import p355o2.C27430e;
import p358o6.AbstractC27597e;
import p358o6.C27594b;
import p358o6.InterfaceC27593a;
import p370oj.AbstractC27970q;
import p370oj.C27969p;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p395p6.C28866b1;
import p395p6.C28887i1;
import p395p6.C28899m1;
import p395p6.C28927w;
import p403pp.AbstractFutureC29420p;
import p403pp.C29406b;
import p403pp.C29412h;
import p403pp.C29419o;
import p477s2.AbstractC32072d;
import p490t0.AbstractC33253j;
import p525uj.AbstractC35029g;
import p545v6.C35721j;
import p545v6.C35725n;
import p545v6.C35733v;
import p550vd.AbstractC35903f;
import p568w0.C36625a;
import p591wp.C37482c;
import p601x0.AbstractC37791b;
import p601x0.C37792c;
import p601x0.C37795f;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39147y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22668g;
import p715kotlin.reflect.jvm.internal.DescriptorKFunction;
import p715kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import p715kotlin.reflect.jvm.internal.UtilKt;
import pf.AbstractC29125c;
import q30.C29926q0;
import q40.C29965c;
import q40.C29966d;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qa3.C30122c0;
import qa3.C30123c1;
import r30.C30902g;
import r30.EnumC30901f;
import r93.InterfaceC31107a1;
import r93.InterfaceC31117e;
import sa3.C32331e;
import sa3.C32334h;
import se.AbstractC32410a;
import u93.AbstractC34690n;
import u93.C34682j;
import u93.C34697q0;
import ua3.C34726f;
import ua3.C34727g;
import va3.C35850h;
import wb3.AbstractC37056f;
import ya3.C39371n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: bi.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3269g {

    /* JADX INFO: renamed from: a */
    public static C27430e f12768a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public static InterfaceC31107a1 m9475C(C35850h c35850h, InterfaceC31117e interfaceC31117e) {
        if (c35850h == null) {
            m9494a(19);
            throw null;
        }
        if (interfaceC31117e == null) {
            m9494a(20);
            throw null;
        }
        Collection constructors = interfaceC31117e.getConstructors();
        if (constructors.size() != 1) {
            return null;
        }
        for (InterfaceC31107a1 interfaceC31107a1 : ((C34682j) constructors.iterator().next()).mo78676v()) {
            if (((AbstractC34690n) interfaceC31107a1).getName().equals(c35850h)) {
                return interfaceC31107a1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static final String m9476D(C18166e0 c18166e0) {
        AbstractC22676k.m65750j(c18166e0, "<this>");
        String str = c18166e0.f70482b;
        C18160b0 c18160b0 = c18166e0.f70481a;
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        String str2 = (String) c18166e0.f70488h.getValue();
        String str3 = (String) c18166e0.f70489i.getValue();
        if (str2 != null) {
            sb5.append(str2);
            if (str3 != null) {
                sb5.append(':');
                sb5.append(str3);
            }
            sb5.append("@");
        }
        String string = sb5.toString();
        AbstractC22676k.m65749i(string, "StringBuilder().apply(builderAction).toString()");
        sb4.append(string);
        int i13 = c18166e0.f70483c;
        if (i13 == 0 || i13 == c18160b0.f70473b) {
            sb4.append(str);
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append(':');
            Integer numValueOf = Integer.valueOf(i13);
            if (i13 == 0) {
                numValueOf = null;
            }
            sb6.append(numValueOf != null ? numValueOf.intValue() : c18160b0.f70473b);
            sb4.append(sb6.toString());
        }
        String string2 = sb4.toString();
        AbstractC22676k.m65749i(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    /* JADX INFO: renamed from: E */
    public static final String[] m9477E(InterfaceC3871p interfaceC3871p) {
        AbstractC22676k.m65748h(interfaceC3871p, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((C3862g) interfaceC3871p).f15797b.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: F */
    public static C2371f m9478F() {
        if (C2371f.f9353d == null) {
            C2371f.f9353d = new C2371f();
        }
        C2371f c2371f = C2371f.f9353d;
        AbstractC22676k.m65748h(c2371f, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
        return c2371f;
    }

    /* JADX INFO: renamed from: G */
    public static final void m9479G(InterfaceC30063j interfaceC30063j, Throwable th3) {
        if (th3 instanceof CancellationException) {
            return;
        }
        try {
            AbstractC21598x.m60677d0(th3);
        } catch (Throwable th4) {
            AbstractC29125c.m88530g(th3, th4);
            AbstractC3006f0.m8727u(interfaceC30063j, th3);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m9480I(InterfaceC15450y2 interfaceC15450y2, Set set) {
        if (!(interfaceC15450y2 instanceof C15425t2)) {
            return set.contains(interfaceC15450y2.mo43531a());
        }
        List list = ((C15425t2) interfaceC15450y2).f57975b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!m9480I((AbstractC15327b3) it.next(), set)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m9481J(String str) {
        if (AbstractC39414r.m125875T(str, '=', false)) {
            List listM125905x0 = AbstractC39414r.m125905x0(str, new char[]{'='}, 2, 2);
            if (listM125905x0.size() == 2 && AbstractC39414r.m125869O0((String) listM125905x0.get(0)).toString().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m9482K(C4472m c4472m) {
        AbstractC22676k.m65750j(c4472m, "<this>");
        String str = c4472m.f18003b;
        AbstractC22676k.m65750j(str, "<this>");
        String string = AbstractC39414r.m125869O0(AbstractC3511b.m10369I(AbstractC3511b.m10369I(str, "#"), ";")).toString();
        return AbstractC39414r.m125907z0(string, '[') && AbstractC39414r.m125881Z(string, ']');
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m9483L(C25500t c25500t) {
        AbstractC22676k.m65750j(c25500t, "<this>");
        EnumC25499s enumC25499s = EnumC25499s.SUCCESS;
        return enumC25499s.f99848w.m52655e(c25500t.f99856a);
    }

    /* JADX INFO: renamed from: M */
    public static final C26318e m9484M(InterfaceC13037f2 interfaceC13037f2, Function1 transform) {
        AbstractC22676k.m65750j(interfaceC13037f2, "<this>");
        AbstractC22676k.m65750j(transform, "transform");
        return new C26318e(new C26307a2(1, interfaceC13037f2, transform), new C19379b(2, interfaceC13037f2, transform));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX INFO: renamed from: N */
    public static void m9485N(C28899m1 c28899m1) {
        ArrayList<InterfaceC26392i> arrayList = c28899m1.f104849b;
        if (!arrayList.isEmpty()) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((InterfaceC26392i) it.next()) instanceof C28927w)) {
                            if (arrayList.size() != 1) {
                                C35721j c35721j = new C35721j();
                                AbstractC25265s.m74141p0(c35721j.f104849b, arrayList);
                                arrayList.clear();
                                arrayList.add(c35721j);
                            }
                        }
                    }
                }
            }
            for (InterfaceC26392i interfaceC26392i : arrayList) {
                AbstractC22676k.m65748h(interfaceC26392i, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
                ArrayList arrayList2 = ((C28927w) interfaceC26392i).f104849b;
                if (arrayList2.size() != 1) {
                    C35721j c35721j2 = new C35721j();
                    AbstractC25265s.m74141p0(c35721j2.f104849b, arrayList2);
                    arrayList2.clear();
                    arrayList2.add(c35721j2);
                }
            }
        } else if (arrayList.size() != 1) {
            C35721j c35721j3 = new C35721j();
            AbstractC25265s.m74141p0(c35721j3.f104849b, arrayList);
            arrayList.clear();
            arrayList.add(c35721j3);
        }
        m9486O(c28899m1);
        m9497b0(c28899m1, new C28402f(28));
    }

    /* JADX INFO: renamed from: O */
    public static final void m9486O(AbstractC26394k abstractC26394k) {
        ArrayList<InterfaceC26392i> arrayList = abstractC26394k.f104849b;
        for (InterfaceC26392i interfaceC26392i : arrayList) {
            if (interfaceC26392i instanceof AbstractC26394k) {
                m9486O((AbstractC26394k) interfaceC26392i);
            }
        }
        C35725n c35725n = (C35725n) abstractC26394k.mo78105c().mo78097a(null, C28866b1.f116820L);
        AbstractC0514e abstractC0514e = C0513d.f1722a;
        if (((c35725n != null ? c35725n.f151971a : abstractC0514e) instanceof C0513d) && (arrayList == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C35725n c35725n2 = (C35725n) ((InterfaceC26392i) it.next()).mo78105c().mo78097a(null, C28866b1.f116822N);
                if ((c35725n2 != null ? c35725n2.f151971a : null) instanceof C0512c) {
                    abstractC26394k.mo78104b(abstractC26394k.mo78105c().mo78107d(new C35725n(C0512c.f1721a)));
                    break;
                }
            }
        }
        C35733v c35733v = (C35733v) abstractC26394k.mo78105c().mo78097a(null, C28866b1.f116821M);
        if (c35733v != null) {
            abstractC0514e = c35733v.f151984a;
        }
        if (abstractC0514e instanceof C0513d) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C35733v c35733v2 = (C35733v) ((InterfaceC26392i) it3.next()).mo78105c().mo78097a(null, C28866b1.f116823O);
                    if ((c35733v2 != null ? c35733v2.f151984a : null) instanceof C0512c) {
                        abstractC26394k.mo78104b(AbstractC32072d.m99703l(abstractC26394k.mo78105c()));
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m9487P(Throwable th3) {
        throw AbstractC2808d.m7993a(th3);
    }

    /* JADX INFO: renamed from: S */
    public static final DescriptorKFunction m9488S(InterfaceC22668g interfaceC22668g) {
        AbstractC22676k.m65750j(interfaceC22668g, "<this>");
        Metadata metadata = (Metadata) interfaceC22668g.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] strArrM65680d1 = metadata.m65680d1();
            if (strArrM65680d1.length == 0) {
                strArrM65680d1 = null;
            }
            if (strArrM65680d1 != null) {
                C23465k c23465kM109655g = C34727g.m109655g(strArrM65680d1, metadata.m65681d2());
                C34726f c34726f = (C34726f) c23465kM109655g.f92937w;
                C30122c0 c30122c0 = (C30122c0) c23465kM109655g.f92938x;
                C32331e c32331e = new C32331e(metadata.m65683mv(), (metadata.m65685xi() & 8) != 0);
                Class<?> cls = interfaceC22668g.getClass();
                C30123c1 c30123c1 = c30122c0.f123048Q;
                AbstractC22676k.m65749i(c30123c1, "getTypeTable(...)");
                return new DescriptorKFunction(EmptyContainerForLocal.INSTANCE, (C34697q0) UtilKt.deserializeToDescriptor(cls, c30122c0, c34726f, new C32334h(c30123c1), c32331e, C23546a.f93276w));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: T */
    public static LinkedHashSet m9489T(C35850h c35850h, Collection collection, Collection collection2, InterfaceC31117e interfaceC31117e, InterfaceC17126o interfaceC17126o, C39371n c39371n, boolean z4) {
        if (c35850h == null) {
            m9494a(12);
            throw null;
        }
        if (collection == null) {
            m9494a(13);
            throw null;
        }
        if (interfaceC31117e == null) {
            m9494a(15);
            throw null;
        }
        if (interfaceC17126o == null) {
            m9494a(16);
            throw null;
        }
        if (c39371n == null) {
            m9494a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c39371n.m125565h(c35850h, collection, collection2, interfaceC31117e, new C15623a(interfaceC17126o, linkedHashSet, z4));
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: U */
    public static LinkedHashSet m9490U(C35850h c35850h, AbstractCollection abstractCollection, Collection collection, InterfaceC31117e interfaceC31117e, InterfaceC17126o interfaceC17126o, C39371n c39371n) {
        if (c35850h == null) {
            m9494a(0);
            throw null;
        }
        if (interfaceC31117e == null) {
            m9494a(3);
            throw null;
        }
        if (interfaceC17126o == null) {
            m9494a(4);
            throw null;
        }
        if (c39371n != null) {
            return m9489T(c35850h, abstractCollection, collection, interfaceC31117e, interfaceC17126o, c39371n, false);
        }
        m9494a(5);
        throw null;
    }

    /* JADX INFO: renamed from: V */
    public static LinkedHashSet m9491V(C35850h c35850h, Collection collection, AbstractCollection abstractCollection, C21513i c21513i, InterfaceC17126o interfaceC17126o, C39371n c39371n) {
        if (c35850h == null) {
            m9494a(6);
            throw null;
        }
        if (collection == null) {
            m9494a(7);
            throw null;
        }
        if (c21513i == null) {
            m9494a(9);
            throw null;
        }
        if (interfaceC17126o == null) {
            m9494a(10);
            throw null;
        }
        if (c39371n != null) {
            return m9489T(c35850h, collection, abstractCollection, c21513i, interfaceC17126o, c39371n, true);
        }
        m9494a(11);
        throw null;
    }

    /* JADX INFO: renamed from: W */
    public static final void m9492W(View view, AbstractActivityC14909l abstractActivityC14909l) {
        view.setTag(R.id.report_drawn, abstractActivityC14909l);
    }

    /* JADX INFO: renamed from: Z */
    public static final C13081r1 m9493Z(Object obj) {
        return AbstractC13091v.m36598h(AbstractC13091v.m36593c(obj));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9494a(int i13) {
        String str = i13 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 18 ? 3 : 2];
        switch (i13) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            default:
                objArr[0] = "name";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i13 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i13) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "resolveOverrides";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static void m9495a0(Throwable th3) {
        if (th3 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th3);
        }
        if (th3 instanceof ThreadDeath) {
            throw ((ThreadDeath) th3);
        }
        if (th3 instanceof LinkageError) {
            throw ((LinkageError) th3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C3862g m9496b(String str) {
        return new C3862g(AbstractC12350b.m34570S(str));
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m9497b0(AbstractC26394k abstractC26394k, C28402f c28402f) {
        int i13 = 0;
        for (Object obj : abstractC26394k.f104849b) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            InterfaceC26392i interfaceC26392i = (InterfaceC26392i) c28402f.invoke((InterfaceC26392i) obj);
            abstractC26394k.f104849b.set(i13, interfaceC26392i);
            if (interfaceC26392i instanceof AbstractC26394k) {
                m9497b0((AbstractC26394k) interfaceC26392i, c28402f);
            }
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9498c(final float f13, final int i13, final String str, final C25046w imageLoader, final String title, final boolean z4, final boolean z13, final boolean z14, final String str2, final Modifier modifier, final InterfaceC4339a onItemSelectedListener, Composer composer, final int i14) {
        C28655q c28655q;
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(onItemSelectedListener, "onItemSelectedListener");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-654699572);
        int i15 = (c28655q2.m87153g(modifier) ? 536870912 : 268435456) | i14 | (c28655q2.m87147d(f13) ? 4 : 2) | (c28655q2.m87149e(i13) ? 32 : 16) | (c28655q2.m87153g(str) ? 256 : 128) | (c28655q2.m87157i(imageLoader) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q2.m87153g(title) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q2.m87155h(z4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) | (c28655q2.m87155h(z13) ? 1048576 : 524288) | (c28655q2.m87155h(z14) ? 8388608 : 4194304) | (c28655q2.m87153g(str2) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE);
        int i16 = c28655q2.m87157i(onItemSelectedListener) ? 4 : 2;
        if ((306783379 & i15) == 306783378 && (i16 & 3) == 2 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            float f14 = AbstractC2573m2.f10007a;
            C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(f14, f14, f14, 0.0f, 8);
            C22949e c22949e = AbstractC22977m.f90650a;
            c28655q = c28655q2;
            AbstractC32410a.m101042m(z13, z4, false, onItemSelectedListener, c22976l1M3381c, AbstractC1102d.m3425v(AbstractC1102d.m3413j(modifier, 60, 0.0f, 2), f13, 0.0f, 2), AbstractC37817c.m121344e(-1428691454, c28655q2, new C2639v1(title, z13, i13, str, imageLoader, z14, str2)), c28655q, ((i15 >> 18) & 14) | 12779520 | ((i15 >> 12) & 112) | ((i16 << 9) & 7168));
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(f13, i13, str, imageLoader, title, z4, z13, z14, str2, modifier, onItemSelectedListener, i14) { // from class: b30.u1

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ String f10258E;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ boolean f10259F;

                /* JADX INFO: renamed from: G */
                public final /* synthetic */ boolean f10260G;

                /* JADX INFO: renamed from: H */
                public final /* synthetic */ boolean f10261H;

                /* JADX INFO: renamed from: I */
                public final /* synthetic */ String f10262I;

                /* JADX INFO: renamed from: J */
                public final /* synthetic */ Modifier f10263J;

                /* JADX INFO: renamed from: K */
                public final /* synthetic */ InterfaceC4339a f10264K;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ float f10265w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ int f10266x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ String f10267y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ C25046w f10268z;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(DfuBaseService.ERROR_FILE_NOT_FOUND);
                    AbstractC3269g.m9498c(this.f10265w, this.f10266x, this.f10267y, this.f10268z, this.f10258E, this.f10259F, this.f10260G, this.f10261H, this.f10262I, this.f10263J, this.f10264K, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final LinkedHashMap m9499c0(AbstractC26394k abstractC26394k) {
        ArrayList arrayList = abstractC26394k.f104849b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            InterfaceC26392i interfaceC26392i = (InterfaceC26392i) obj;
            InterfaceC26398o interfaceC26398oMo78105c = interfaceC26392i.mo78105c();
            C23465k c23465k = interfaceC26398oMo78105c.mo78099c(C28887i1.f116928x) ? (C23465k) interfaceC26398oMo78105c.mo78097a(new C23465k(null, C26396m.f104850a), C28866b1.f116819K) : new C23465k(null, interfaceC26398oMo78105c);
            C27594b c27594b = (C27594b) c23465k.f92937w;
            InterfaceC26398o interfaceC26398o = (InterfaceC26398o) c23465k.f92938x;
            InterfaceC27593a interfaceC27593a = c27594b != null ? c27594b.f111086a : null;
            C23465k c23465k2 = interfaceC27593a instanceof AbstractC27597e ? new C23465k(interfaceC27593a, interfaceC26398o) : new C23465k(null, interfaceC26398o);
            if (interfaceC26392i instanceof AbstractC26394k) {
                for (Map.Entry entry : m9499c0((AbstractC26394k) interfaceC26392i).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object arrayList2 = linkedHashMap.get(str);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str, arrayList2);
                    }
                    ((List) arrayList2).addAll(list);
                }
            }
            i13 = i14;
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: d */
    public static final void m9500d(C24869a state, Function1 onFormFieldValuesChanged, InterfaceC4339a onPayClicked, InterfaceC4339a onDisabledPayClicked, Composer composer, int i13) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC22676k.m65750j(onPayClicked, "onPayClicked");
        AbstractC22676k.m65750j(onDisabledPayClicked, "onDisabledPayClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1889371879);
        if (((i13 | (c28655q.m87157i(state) ? 4 : 2) | (c28655q.m87157i(onFormFieldValuesChanged) ? 32 : 16) | (c28655q.m87157i(onPayClicked) ? 256 : 128) | (c28655q.m87157i(onDisabledPayClicked) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED)) & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            Object[] objArr = new Object[0];
            c28655q.m87150e0(-1544592627);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C24738a(4);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            Object objM124459e = AbstractC39038k.m124459e(objArr, null, (InterfaceC4339a) objM87133R, c28655q, 3072, 6);
            AbstractC22676k.m65749i(objM124459e, "rememberSaveable(...)");
            AbstractC35903f.m114008c(null, AbstractC37817c.m121344e(-1759283741, c28655q, new C4598s(state, interfaceC15237i, onPayClicked, onDisabledPayClicked, (String) objM124459e, onFormFieldValuesChanged)), c28655q, 48);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2032u(state, onFormFieldValuesChanged, onPayClicked, onDisabledPayClicked, i13, 22);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9501e(C24872d viewModel, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1131186091);
        if ((((c28655q2.m87157i(viewModel) ? 4 : 2) | i13) & 3) == 2 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            C24869a c24869a = (C24869a) C27648a.m83597t(viewModel.f97442K, c28655q2, 0).getValue();
            c28655q2.m87150e0(-456662541);
            boolean zM87157i = c28655q2.m87157i(viewModel);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                C15352f4 c15352f4 = new C15352f4(1, viewModel, C24872d.class, "formValuesChanged", "formValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)V", 0, 16);
                c28655q2.m87172p0(c15352f4);
                objM87133R = c15352f4;
            }
            c28655q2.m87173q(false);
            Function1 function1 = (Function1) ((InterfaceC21467g) objM87133R);
            c28655q2.m87150e0(-456660850);
            boolean zM87157i2 = c28655q2.m87157i(viewModel);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                C2539i0 c2539i0 = new C2539i0(0, viewModel, C24872d.class, "onPayClicked", "onPayClicked()V", 0, 23);
                c28655q2.m87172p0(c2539i0);
                objM87133R2 = c2539i0;
            }
            c28655q2.m87173q(false);
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R2);
            c28655q2.m87150e0(-456659050);
            boolean zM87157i3 = c28655q2.m87157i(viewModel);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                C2539i0 c2539i1 = new C2539i0(0, viewModel, C24872d.class, "onDisabledPayClicked", "onDisabledPayClicked()V", 0, 24);
                c28655q2.m87172p0(c2539i1);
                objM87133R3 = c2539i1;
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            m9500d(c24869a, function1, interfaceC4339a, (InterfaceC4339a) ((InterfaceC21467g) objM87133R3), c28655q, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22541b(viewModel, i13, 25);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9502f(long j7, List points, Composer composer, int i13) {
        AbstractC22676k.m65750j(points, "points");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2113937603);
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        C37482c c37482c = new C37482c();
        C37482c c37482c2 = new C37482c();
        C13604c c13604c = C13604c.f48148P;
        C13621k0 c13621k0 = new C13621k0((C13635v) abstractC17104a0, points, j7, c37482c, c37482c2);
        c28655q.m87152f0(1886828752);
        if (!(abstractC17104a0 instanceof C13635v)) {
            AbstractC28683x.m87269w();
            throw null;
        }
        c28655q.m87146c0();
        if (c28655q.f115903S) {
            c28655q.m87163l(new C2088b(c13621k0, 11));
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87243K(c28655q, C13623l0.f48261x, c13604c);
        AbstractC28683x.m87239G(c28655q, C13623l0.f48262y, points);
        AbstractC28683x.m87239G(c28655q, C13623l0.f48263z, false);
        AbstractC28683x.m87239G(c28655q, C13623l0.f48255E, new C17919x(j7));
        AbstractC28683x.m87239G(c28655q, C13623l0.f48256F, c37482c);
        AbstractC28683x.m87239G(c28655q, C13623l0.f48257G, false);
        C13623l0 c13623l0 = C13623l0.f48258H;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), 0)) {
            c28655q.m87172p0(0);
            c28655q.m87143b(0, c13623l0);
        }
        AbstractC28683x.m87239G(c28655q, C13623l0.f48259I, null);
        AbstractC28683x.m87239G(c28655q, C13623l0.f48260J, c37482c2);
        AbstractC28683x.m87239G(c28655q, C13602b.f48124b0, null);
        AbstractC28683x.m87239G(c28655q, C13602b.f48125c0, true);
        AbstractC28683x.m87239G(c28655q, C13602b.f48126d0, Float.valueOf(10.0f));
        AbstractC28683x.m87239G(c28655q, C13602b.f48127e0, Float.valueOf(0.0f));
        c28655q.m87173q(true);
        c28655q.m87173q(false);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C13625m0(points, j7, c37482c, c37482c2, i13);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:71:0x01af  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0240  */
    /* JADX WARN: Code duplicated, block: B:86:0x0261  */
    /* JADX WARN: Code duplicated, block: B:90:0x026f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x0270  */
    /* JADX INFO: renamed from: g */
    public static final void m9503g(DebugStatus status, String str, boolean z4, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        boolean z13;
        int i15;
        InterfaceC4351m interfaceC4351m2;
        boolean z14;
        InterfaceC4351m interfaceC4351m3;
        int i16;
        long jM51541c;
        int i17;
        long jM51541c2;
        C2314t c2314t;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        int i18;
        C0209i c0209i3;
        C0209i c0209i4;
        C2314t c2314t2;
        int iHashCode2;
        InterfaceC4351m interfaceC4351m4;
        boolean z15;
        InterfaceC4351m interfaceC4351m5;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(status, "status");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1414847535);
        int i19 = (c28655q.m87153g(status) ? 4 : 2) | i13 | (c28655q.m87153g(str) ? 32 : 16);
        int i24 = i14 & 4;
        if (i24 != 0) {
            i15 = i19 | 384;
            z13 = z4;
        } else {
            z13 = z4;
            i15 = i19 | (c28655q.m87155h(z13) ? 256 : 128);
        }
        int i25 = i14 & 8;
        if (i25 == 0) {
            if ((i13 & 7168) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                i15 |= c28655q.m87157i(interfaceC4351m2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 5851) == 1170 || !c28655q.m87121F()) {
                if (i24 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                if (i25 != 0) {
                    interfaceC4351m3 = null;
                } else {
                    interfaceC4351m3 = interfaceC4351m2;
                }
                int[] iArr = AbstractC27970q.f112800a;
                i16 = iArr[status.ordinal()];
                if (i16 == 1) {
                    jM51541c = C17919x.m51541c(0.1f, C17919x.f69630g);
                } else if (i16 != 2) {
                    jM51541c = AbstractC35029g.f148267p;
                } else {
                    jM51541c = AbstractC35029g.f148270s;
                }
                i17 = iArr[status.ordinal()];
                if (i17 == 1) {
                    jM51541c2 = C17919x.m51541c(0.2f, C17919x.f69630g);
                } else if (i17 != 2) {
                    jM51541c2 = AbstractC35029g.f148266o;
                } else {
                    jM51541c2 = AbstractC35029g.f148269r;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                f13 = AbstractC35029g.f148252a;
                Modifier modifierM3394p = AbstractC1099a.m3394p(AbstractC35029g.f148253b, AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifierM3409f, jM51541c, AbstractC33253j.m105489e(f13)), 1, jM51541c2, AbstractC33253j.m105489e(f13)));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    i18 = i15;
                } else {
                    i18 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i6 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                    if (z14) {
                        c28655q.m87152f0(551368437);
                        c2314t2 = c2314t;
                        c0209i3 = c0209i;
                        c0209i4 = c0209i2;
                        AbstractC23112i3.m67091b(2, 0, 390, status.getColor(c28655q, i18 & 14), 0L, c28655q, AbstractC1102d.m3419p(20, c2314t));
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c0209i3 = c0209i;
                        c0209i4 = c0209i2;
                        c2314t2 = c2314t;
                        c28655q.m87152f0(551368630);
                        int i26 = i18 & 14;
                        AbstractC23164r1.m67133b(status.getIcon(c28655q, i26), status.name(), AbstractC1102d.m3419p(20, c2314t2), status.getColor(c28655q, i26), c28655q, 384, 0);
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t2));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                    C28655q c28655q2 = c28655q;
                    AbstractC23149o4.m67127b(str, null, status.getColor(c28655q, i18 & 14), AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q2, ((i18 >> 3) & 14) | 3072, 0, 131058);
                    c28655q = c28655q2;
                    c28655q.m87152f0(551369160);
                    if (interfaceC4351m3 != 0) {
                        AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t2, 0.0f, f13, 0.0f, 0.0f, 13));
                        interfaceC4351m4 = interfaceC4351m3;
                        interfaceC4351m4.invoke(c28655q, Integer.valueOf((i18 >> 9) & 14));
                    } else {
                        interfaceC4351m4 = interfaceC4351m3;
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, true);
                    z15 = z14;
                    interfaceC4351m5 = interfaceC4351m4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                if (z14) {
                    c28655q.m87152f0(551368437);
                    c2314t2 = c2314t;
                    c0209i3 = c0209i;
                    c0209i4 = c0209i2;
                    AbstractC23112i3.m67091b(2, 0, 390, status.getColor(c28655q, i18 & 14), 0L, c28655q, AbstractC1102d.m3419p(20, c2314t));
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c0209i3 = c0209i;
                    c0209i4 = c0209i2;
                    c2314t2 = c2314t;
                    c28655q.m87152f0(551368630);
                    int i27 = i18 & 14;
                    AbstractC23164r1.m67133b(status.getIcon(c28655q, i27), status.name(), AbstractC1102d.m3419p(20, c2314t2), status.getColor(c28655q, i27), c28655q, 384, 0);
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t2));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                C28655q c28655q3 = c28655q;
                AbstractC23149o4.m67127b(str, null, status.getColor(c28655q, i18 & 14), AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q3, ((i18 >> 3) & 14) | 3072, 0, 131058);
                c28655q = c28655q3;
                c28655q.m87152f0(551369160);
                if (interfaceC4351m3 != 0) {
                    AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t2, 0.0f, f13, 0.0f, 0.0f, 13));
                    interfaceC4351m4 = interfaceC4351m3;
                    interfaceC4351m4.invoke(c28655q, Integer.valueOf((i18 >> 9) & 14));
                } else {
                    interfaceC4351m4 = interfaceC4351m3;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                z15 = z14;
                interfaceC4351m5 = interfaceC4351m4;
            } else {
                c28655q.m87138X();
                z15 = z13;
                interfaceC4351m5 = interfaceC4351m2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u == null) {
                return;
            }
            c28677v1M87180u.f115982d = new C27969p(status, str, z15, interfaceC4351m5, i13, i14);
        }
        i15 |= 3072;
        interfaceC4351m2 = interfaceC4351m;
        if ((i15 & 5851) == 1170) {
            if (i24 != 0) {
                z14 = false;
            } else {
                z14 = z13;
            }
            if (i25 != 0) {
                interfaceC4351m3 = null;
            } else {
                interfaceC4351m3 = interfaceC4351m2;
            }
            int[] iArr2 = AbstractC27970q.f112800a;
            i16 = iArr2[status.ordinal()];
            if (i16 == 1) {
                jM51541c = C17919x.m51541c(0.1f, C17919x.f69630g);
            } else if (i16 != 2) {
                jM51541c = AbstractC35029g.f148267p;
            } else {
                jM51541c = AbstractC35029g.f148270s;
            }
            i17 = iArr2[status.ordinal()];
            if (i17 == 1) {
                jM51541c2 = C17919x.m51541c(0.2f, C17919x.f69630g);
            } else if (i17 != 2) {
                jM51541c2 = AbstractC35029g.f148266o;
            } else {
                jM51541c2 = AbstractC35029g.f148269r;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            f13 = AbstractC35029g.f148252a;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(AbstractC35029g.f148253b, AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifierM3409f2, jM51541c, AbstractC33253j.m105489e(f13)), 1, jM51541c2, AbstractC33253j.m105489e(f13)));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i8 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a2);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m4);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                i18 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                if (z14) {
                    c28655q.m87152f0(551368437);
                    c2314t2 = c2314t;
                    c0209i3 = c0209i;
                    c0209i4 = c0209i2;
                    AbstractC23112i3.m67091b(2, 0, 390, status.getColor(c28655q, i18 & 14), 0L, c28655q, AbstractC1102d.m3419p(20, c2314t));
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c0209i3 = c0209i;
                    c0209i4 = c0209i2;
                    c2314t2 = c2314t;
                    c28655q.m87152f0(551368630);
                    int i28 = i18 & 14;
                    AbstractC23164r1.m67133b(status.getIcon(c28655q, i28), status.name(), AbstractC1102d.m3419p(20, c2314t2), status.getColor(c28655q, i28), c28655q, 384, 0);
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t2));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N5);
                C28655q c28655q4 = c28655q;
                AbstractC23149o4.m67127b(str, null, status.getColor(c28655q, i18 & 14), AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q4, ((i18 >> 3) & 14) | 3072, 0, 131058);
                c28655q = c28655q4;
                c28655q.m87152f0(551369160);
                if (interfaceC4351m3 != 0) {
                    AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t2, 0.0f, f13, 0.0f, 0.0f, 13));
                    interfaceC4351m4 = interfaceC4351m3;
                    interfaceC4351m4.invoke(c28655q, Integer.valueOf((i18 >> 9) & 14));
                } else {
                    interfaceC4351m4 = interfaceC4351m3;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                z15 = z14;
                interfaceC4351m5 = interfaceC4351m4;
            } else {
                i18 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N4);
            if (z14) {
                c28655q.m87152f0(551368437);
                c2314t2 = c2314t;
                c0209i3 = c0209i;
                c0209i4 = c0209i2;
                AbstractC23112i3.m67091b(2, 0, 390, status.getColor(c28655q, i18 & 14), 0L, c28655q, AbstractC1102d.m3419p(20, c2314t));
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c0209i3 = c0209i;
                c0209i4 = c0209i2;
                c2314t2 = c2314t;
                c28655q.m87152f0(551368630);
                int i29 = i18 & 14;
                AbstractC23164r1.m67133b(status.getIcon(c28655q, i29), status.name(), AbstractC1102d.m3419p(20, c2314t2), status.getColor(c28655q, i29), c28655q, 384, 0);
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t2));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
            C28655q c28655q5 = c28655q;
            AbstractC23149o4.m67127b(str, null, status.getColor(c28655q, i18 & 14), AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q5, ((i18 >> 3) & 14) | 3072, 0, 131058);
            c28655q = c28655q5;
            c28655q.m87152f0(551369160);
            if (interfaceC4351m3 != 0) {
                AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t2, 0.0f, f13, 0.0f, 0.0f, 13));
                interfaceC4351m4 = interfaceC4351m3;
                interfaceC4351m4.invoke(c28655q, Integer.valueOf((i18 >> 9) & 14));
            } else {
                interfaceC4351m4 = interfaceC4351m3;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            z15 = z14;
            interfaceC4351m5 = interfaceC4351m4;
        } else {
            if (i24 != 0) {
                z14 = false;
            } else {
                z14 = z13;
            }
            if (i25 != 0) {
                interfaceC4351m3 = null;
            } else {
                interfaceC4351m3 = interfaceC4351m2;
            }
            int[] iArr3 = AbstractC27970q.f112800a;
            i16 = iArr3[status.ordinal()];
            if (i16 == 1) {
                jM51541c = C17919x.m51541c(0.1f, C17919x.f69630g);
            } else if (i16 != 2) {
                jM51541c = AbstractC35029g.f148267p;
            } else {
                jM51541c = AbstractC35029g.f148270s;
            }
            i17 = iArr3[status.ordinal()];
            if (i17 == 1) {
                jM51541c2 = C17919x.m51541c(0.2f, C17919x.f69630g);
            } else if (i17 != 2) {
                jM51541c2 = AbstractC35029g.f148266o;
            } else {
                jM51541c2 = AbstractC35029g.f148269r;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
            f13 = AbstractC35029g.f148252a;
            Modifier modifierM3394p3 = AbstractC1099a.m3394p(AbstractC35029g.f148253b, AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifierM3409f3, jM51541c, AbstractC33253j.m105489e(f13)), 1, jM51541c2, AbstractC33253j.m105489e(f13)));
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a3);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m7);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                i18 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i12 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                if (z14) {
                    c28655q.m87152f0(551368437);
                    c2314t2 = c2314t;
                    c0209i3 = c0209i;
                    c0209i4 = c0209i2;
                    AbstractC23112i3.m67091b(2, 0, 390, status.getColor(c28655q, i18 & 14), 0L, c28655q, AbstractC1102d.m3419p(20, c2314t));
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c0209i3 = c0209i;
                    c0209i4 = c0209i2;
                    c2314t2 = c2314t;
                    c28655q.m87152f0(551368630);
                    int i210 = i18 & 14;
                    AbstractC23164r1.m67133b(status.getIcon(c28655q, i210), status.name(), AbstractC1102d.m3419p(20, c2314t2), status.getColor(c28655q, i210), c28655q, 384, 0);
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t2));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                C28655q c28655q6 = c28655q;
                AbstractC23149o4.m67127b(str, null, status.getColor(c28655q, i18 & 14), AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q6, ((i18 >> 3) & 14) | 3072, 0, 131058);
                c28655q = c28655q6;
                c28655q.m87152f0(551369160);
                if (interfaceC4351m3 != 0) {
                    AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t2, 0.0f, f13, 0.0f, 0.0f, 13));
                    interfaceC4351m4 = interfaceC4351m3;
                    interfaceC4351m4.invoke(c28655q, Integer.valueOf((i18 >> 9) & 14));
                } else {
                    interfaceC4351m4 = interfaceC4351m3;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                z15 = z14;
                interfaceC4351m5 = interfaceC4351m4;
            } else {
                i18 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            if (z14) {
                c28655q.m87152f0(551368437);
                c2314t2 = c2314t;
                c0209i3 = c0209i;
                c0209i4 = c0209i2;
                AbstractC23112i3.m67091b(2, 0, 390, status.getColor(c28655q, i18 & 14), 0L, c28655q, AbstractC1102d.m3419p(20, c2314t));
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c0209i3 = c0209i;
                c0209i4 = c0209i2;
                c2314t2 = c2314t;
                c28655q.m87152f0(551368630);
                int i211 = i18 & 14;
                AbstractC23164r1.m67133b(status.getIcon(c28655q, i211), status.name(), AbstractC1102d.m3419p(20, c2314t2), status.getColor(c28655q, i211), c28655q, 384, 0);
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t2));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, layoutWeightElement6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
            C28655q c28655q7 = c28655q;
            AbstractC23149o4.m67127b(str, null, status.getColor(c28655q, i18 & 14), AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q7, ((i18 >> 3) & 14) | 3072, 0, 131058);
            c28655q = c28655q7;
            c28655q.m87152f0(551369160);
            if (interfaceC4351m3 != 0) {
                AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t2, 0.0f, f13, 0.0f, 0.0f, 13));
                interfaceC4351m4 = interfaceC4351m3;
                interfaceC4351m4.invoke(c28655q, Integer.valueOf((i18 >> 9) & 14));
            } else {
                interfaceC4351m4 = interfaceC4351m3;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            z15 = z14;
            interfaceC4351m5 = interfaceC4351m4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C27969p(status, str, z15, interfaceC4351m5, i13, i14);
    }

    /* JADX INFO: renamed from: h */
    public static Object m9504h(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final C16618c m9505i(InterfaceC39147y interfaceC39147y, InterfaceC39147y interfaceC39147y2) {
        AbstractC22676k.m65750j(interfaceC39147y, "<this>");
        InterfaceC39147y interfaceC39147yM124662h = interfaceC39147y2 == null ? AbstractC39125q1.m124662h(interfaceC39147y) : interfaceC39147y2;
        float fMo3541n = (int) (interfaceC39147yM124662h.mo3541n() >> 32);
        float fMo3541n2 = (int) (interfaceC39147yM124662h.mo3541n() & 4294967295L);
        C16618c c16618cMo3547r = interfaceC39147yM124662h.mo3547r(interfaceC39147y, true);
        float f13 = c16618cMo3547r.f63939a;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > fMo3541n) {
            f13 = fMo3541n;
        }
        float f14 = c16618cMo3547r.f63940b;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > fMo3541n2) {
            f14 = fMo3541n2;
        }
        float f15 = c16618cMo3547r.f63941c;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        if (f15 <= fMo3541n) {
            fMo3541n = f15;
        }
        float f16 = c16618cMo3547r.f63942d;
        float f17 = f16 >= 0.0f ? f16 : 0.0f;
        if (f17 <= fMo3541n2) {
            fMo3541n2 = f17;
        }
        if (f13 == fMo3541n || f14 == fMo3541n2) {
            return C16618c.f63938e;
        }
        long jMo3510E = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
        long jMo3510E2 = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(fMo3541n)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
        long jMo3510E3 = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(fMo3541n2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMo3541n)) << 32));
        long jMo3510E4 = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(fMo3541n2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3510E >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo3510E2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo3510E4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo3510E3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo3510E & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo3510E2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo3510E4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo3510E3 & 4294967295L));
        return new C16618c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX INFO: renamed from: m */
    public static final EnumC25499s m9506m(C25500t c25500t) {
        EnumC25499s enumC25499s;
        AbstractC22676k.m65750j(c25500t, "<this>");
        C25481a c25481a = EnumC25499s.f99845x;
        int i13 = c25500t.f99856a;
        c25481a.getClass();
        EnumC25499s[] enumC25499sArrValues = EnumC25499s.values();
        int length = enumC25499sArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC25499s = null;
                break;
            }
            enumC25499s = enumC25499sArrValues[i14];
            C18284j c18284j = enumC25499s.f99848w;
            int i15 = c18284j.f71133w;
            if (i13 <= c18284j.f71134x && i15 <= i13) {
                break;
            }
            i14++;
        }
        if (enumC25499s != null) {
            return enumC25499s;
        }
        throw new IllegalStateException(("Invalid HTTP code " + i13).toString());
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC26398o m9507n(ArrayList arrayList) {
        InterfaceC26398o interfaceC26398oMo78107d;
        Iterator it = arrayList.iterator();
        C26396m c26396m = C26396m.f104850a;
        while (it.hasNext()) {
            InterfaceC26398o interfaceC26398o = (InterfaceC26398o) it.next();
            if (interfaceC26398o != null && (interfaceC26398oMo78107d = c26396m.mo78107d(interfaceC26398o)) != null) {
                c26396m = interfaceC26398oMo78107d;
            }
        }
        return c26396m;
    }

    /* JADX INFO: renamed from: o */
    public static final C37792c m9508o(InterfaceC0229n interfaceC0229n) {
        C37795f c37795f;
        C36625a c36625a = new C36625a();
        AbstractC0201g.m518r(interfaceC0229n, C0105d.f331a, new C0103b(new C0103b(c36625a, 2), new C0106e(1, c36625a, C36625a.class, "addFilter", "addFilter$foundation_release(Lkotlin/jvm/functions/Function1;)V", 0, 1)));
        C0047q0 c0047q0 = new C0047q0();
        C0047q0 c0047q1 = c36625a.f156939a;
        Object[] objArr = c0047q1.f136a;
        int i13 = c0047q1.f137b;
        int i14 = 0;
        boolean z4 = true;
        AbstractC37791b abstractC37791b = null;
        while (true) {
            c37795f = C37795f.f161901b;
            if (i14 >= i13) {
                break;
            }
            AbstractC37791b abstractC37791b2 = (AbstractC37791b) objArr[i14];
            if (!z4 || abstractC37791b2 != c37795f) {
                if (abstractC37791b2 == c37795f && abstractC37791b == c37795f) {
                    z4 = false;
                } else {
                    if (abstractC37791b2 != c37795f) {
                        C0047q0 c0047q2 = c36625a.f156940b;
                        Object[] objArr2 = c0047q2.f136a;
                        int i15 = c0047q2.f137b;
                        int i16 = 0;
                        while (true) {
                            if (i16 < i15) {
                                if (((Boolean) ((Function1) objArr2[i16]).invoke(abstractC37791b2)).booleanValue()) {
                                    i16++;
                                } else {
                                    z4 = false;
                                }
                            }
                        }
                    }
                    c0047q0.m98a(abstractC37791b2);
                    z4 = false;
                    abstractC37791b = abstractC37791b2;
                }
            }
            i14++;
        }
        if (((AbstractC37791b) (c0047q0.m104g() ? null : c0047q0.f136a[c0047q0.f137b - 1])) == c37795f) {
            c0047q0.m107j(c0047q0.f137b - 1);
        }
        C0043o0 c0043o0 = c0047q0.f138c;
        if (c0043o0 == null) {
            c0043o0 = new C0043o0(c0047q0);
            c0047q0.f138c = c0043o0;
        }
        return new C37792c(c0043o0);
    }

    /* JADX INFO: renamed from: p */
    public static final C26318e m9509p(InterfaceC13037f2 flow1, InterfaceC13037f2 flow2, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(flow1, "flow1");
        AbstractC22676k.m65750j(flow2, "flow2");
        int i13 = 1;
        return new C26318e(new C13060l1(flow1, flow2, new C11205i0(3, interfaceC4351m, AbstractC22674j.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$3(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), i13), new C19380c(interfaceC4351m, flow1, flow2, i13));
    }

    /* JADX INFO: renamed from: q */
    public static final C26318e m9510q(InterfaceC13037f2 flow1, InterfaceC13037f2 flow2, InterfaceC13037f2 flow3, InterfaceC13037f2 flow4, InterfaceC4352n interfaceC4352n) {
        AbstractC22676k.m65750j(flow1, "flow1");
        AbstractC22676k.m65750j(flow2, "flow2");
        AbstractC22676k.m65750j(flow3, "flow3");
        AbstractC22676k.m65750j(flow4, "flow4");
        return new C26318e(AbstractC13091v.m36605o(flow1, flow2, flow3, flow4, new C29966d(5, 0, AbstractC22674j.class, interfaceC4352n, "suspendConversion0", "combineAsStateFlow$suspendConversion0$7(Lkotlin/jvm/functions/Function4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;")), new C0073h(interfaceC4352n, flow1, flow2, flow3, flow4, 18));
    }

    /* JADX INFO: renamed from: r */
    public static final C26318e m9511r(InterfaceC13037f2 flow1, InterfaceC13037f2 flow2, InterfaceC13037f2 flow3, InterfaceC13037f2 flow4, InterfaceC13037f2 flow5, InterfaceC4353o interfaceC4353o) {
        AbstractC22676k.m65750j(flow1, "flow1");
        AbstractC22676k.m65750j(flow2, "flow2");
        AbstractC22676k.m65750j(flow3, "flow3");
        AbstractC22676k.m65750j(flow4, "flow4");
        AbstractC22676k.m65750j(flow5, "flow5");
        return new C26318e(new C1844y(5, (InterfaceC13058l[]) AbstractC25265s.m74093D1(AbstractC37056f.m118959K(flow1, flow2, flow3, flow4, flow5)).toArray(new InterfaceC13058l[0]), interfaceC4353o), new C0561l(interfaceC4353o, flow1, flow2, flow3, flow4, flow5, 10));
    }

    /* JADX INFO: renamed from: s */
    public static final C26318e m9512s(InterfaceC13037f2 flow1, InterfaceC13037f2 flow2, InterfaceC13037f2 flow3, InterfaceC13037f2 flow4, InterfaceC13037f2 flow5, InterfaceC13037f2 flow6, InterfaceC4354p interfaceC4354p) {
        AbstractC22676k.m65750j(flow1, "flow1");
        AbstractC22676k.m65750j(flow2, "flow2");
        AbstractC22676k.m65750j(flow3, "flow3");
        AbstractC22676k.m65750j(flow4, "flow4");
        AbstractC22676k.m65750j(flow5, "flow5");
        AbstractC22676k.m65750j(flow6, "flow6");
        return new C26318e(new C1844y(6, (InterfaceC13058l[]) AbstractC25265s.m74093D1(AbstractC37056f.m118959K(flow1, flow2, flow3, flow4, flow5, flow6)).toArray(new InterfaceC13058l[0]), interfaceC4354p), new C9786j(interfaceC4354p, flow1, flow2, flow3, flow4, flow5, flow6, 1));
    }

    /* JADX INFO: renamed from: t */
    public static final C26318e m9513t(InterfaceC13037f2 flow1, InterfaceC13037f2 flow2, InterfaceC13037f2 flow3, Function3 function3) {
        AbstractC22676k.m65750j(flow1, "flow1");
        AbstractC22676k.m65750j(flow2, "flow2");
        AbstractC22676k.m65750j(flow3, "flow3");
        return new C26318e(AbstractC13091v.m36606p(flow1, flow2, flow3, new C29965c(4, 0, AbstractC22674j.class, function3, "suspendConversion0", "combineAsStateFlow$suspendConversion0$5(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;")), new C19378a(function3, flow1, flow2, flow3, 1));
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m9514u(C16618c c16618c, float f13, float f14) {
        float f15 = c16618c.f63939a;
        if (f13 > c16618c.f63941c || f15 > f13) {
            return false;
        }
        return f14 <= c16618c.f63942d && c16618c.f63940b <= f14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (p474s.AbstractC32004s.m99538g(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & 4294967295L), r11) == 1.0d) goto L16;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m9515v(android.graphics.drawable.Drawable r8, android.graphics.Bitmap.Config r9, gi.C15878i r10, gi.EnumC15876g r11, boolean r12) {
        /*
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 == 0) goto L4e
            r0 = r8
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r4 = r0.getConfig()
            if (r9 == 0) goto L21
            boolean r5 = x30.AbstractC37926s0.m121481u(r9)
            if (r5 == 0) goto L1f
            goto L21
        L1f:
            r5 = r9
            goto L23
        L21:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L23:
            if (r4 != r5) goto L4e
            if (r12 == 0) goto L28
            goto L4d
        L28:
            int r12 = r0.getWidth()
            int r4 = r0.getHeight()
            gi.i r5 = gi.C15878i.f59992c
            long r4 = p474s.AbstractC32004s.m99537f(r12, r4, r10, r11, r5)
            long r6 = r4 >> r3
            int r12 = (int) r6
            long r4 = r4 & r1
            int r4 = (int) r4
            int r5 = r0.getWidth()
            int r6 = r0.getHeight()
            double r4 = p474s.AbstractC32004s.m99538g(r5, r6, r12, r4, r11)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L4e
        L4d:
            return r0
        L4e:
            android.graphics.drawable.Drawable r8 = r8.mutate()
            int r12 = ki.AbstractC22500l.m64993b(r8)
            r0 = 512(0x200, float:7.17E-43)
            if (r12 <= 0) goto L5b
            goto L5c
        L5b:
            r12 = r0
        L5c:
            int r4 = ki.AbstractC22500l.m64992a(r8)
            if (r4 <= 0) goto L63
            r0 = r4
        L63:
            gi.i r4 = gi.C15878i.f59992c
            long r4 = p474s.AbstractC32004s.m99537f(r12, r0, r10, r11, r4)
            long r6 = r4 >> r3
            int r10 = (int) r6
            long r1 = r1 & r4
            int r1 = (int) r1
            double r10 = p474s.AbstractC32004s.m99538g(r12, r0, r10, r1, r11)
            double r1 = (double) r12
            double r1 = r1 * r10
            int r12 = e93.AbstractC12889b.m36257W(r1)
            double r0 = (double) r0
            double r10 = r10 * r0
            int r10 = e93.AbstractC12889b.m36257W(r10)
            if (r9 == 0) goto L86
            boolean r11 = x30.AbstractC37926s0.m121481u(r9)
            if (r11 == 0) goto L88
        L86:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L88:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r12, r10, r9)
            android.graphics.Rect r11 = r8.getBounds()
            int r0 = r11.left
            int r1 = r11.top
            int r2 = r11.right
            int r11 = r11.bottom
            r3 = 0
            r8.setBounds(r3, r3, r12, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r8.draw(r10)
            r8.setBounds(r0, r1, r2, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.AbstractC3269g.m9515v(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, gi.i, gi.g, boolean):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: w */
    public static AbstractC1637w1 m9516w(Class modelClass) throws InvocationTargetException {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        try {
            Constructor declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException(AbstractC11266d.m30459m(modelClass, "Cannot create an instance of "));
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                AbstractC22676k.m65747g(objNewInstance);
                return (AbstractC1637w1) objNewInstance;
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(AbstractC11266d.m30459m(modelClass, "Cannot create an instance of "), e5);
            } catch (InstantiationException e13) {
                throw new RuntimeException(AbstractC11266d.m30459m(modelClass, "Cannot create an instance of "), e13);
            }
        } catch (NoSuchMethodException e14) {
            throw new RuntimeException(AbstractC11266d.m30459m(modelClass, "Cannot create an instance of "), e14);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final ArrayList m9517x(List list, Set hiddenIdentifiers) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(hiddenIdentifiers, "hiddenIdentifiers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!m9480I((InterfaceC15450y2) obj, hiddenIdentifiers)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static final C26318e m9518y(InterfaceC13037f2 interfaceC13037f2, Function1 function1) {
        AbstractC22676k.m65750j(interfaceC13037f2, "<this>");
        return new C26318e(AbstractC13091v.m36590P(interfaceC13037f2, new C3151d((InterfaceC30057d) null, function1, 6)), new C19379b(1, interfaceC13037f2, function1));
    }

    /* JADX INFO: renamed from: z */
    public static C30902g m9519z(JSONObject jSONObject) {
        Object next;
        String strOptString = jSONObject.optString("threeDSServerTransID");
        String strOptString2 = jSONObject.optString("acsTransID");
        String strOptString3 = jSONObject.optString("dsTransID");
        String strOptString4 = jSONObject.optString("errorCode");
        AbstractC22676k.m65749i(strOptString4, "optString(...)");
        C26701n c26701n = EnumC30901f.f127432x;
        String strOptString5 = jSONObject.optString("errorComponent");
        c26701n.getClass();
        Iterator it = EnumC30901f.f127431E.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((EnumC30901f) next).f127435w.equals(strOptString5));
        EnumC30901f enumC30901f = (EnumC30901f) next;
        String strOptString6 = jSONObject.optString("errorDescription");
        AbstractC22676k.m65749i(strOptString6, "optString(...)");
        String strOptString7 = jSONObject.optString("errorDetail");
        AbstractC22676k.m65749i(strOptString7, "optString(...)");
        String strOptString8 = jSONObject.optString("errorMessageType");
        String strOptString9 = jSONObject.optString("messageVersion");
        AbstractC22676k.m65749i(strOptString9, "optString(...)");
        String strOptString10 = jSONObject.optString("sdkTransID");
        return new C30902g(strOptString, strOptString2, strOptString3, strOptString4, enumC30901f, strOptString6, strOptString7, strOptString8, strOptString9, strOptString10 != null ? new C29926q0(strOptString10) : null);
    }

    /* JADX INFO: renamed from: A */
    public abstract C12300c mo9520A(AbstractC12311n abstractC12311n);

    /* JADX INFO: renamed from: B */
    public abstract C12310m mo9521B(AbstractC12311n abstractC12311n);

    /* JADX INFO: renamed from: H */
    public abstract boolean mo9522H();

    /* JADX INFO: renamed from: Q */
    public abstract void mo9523Q(C12310m c12310m, C12310m c12310m2);

    /* JADX INFO: renamed from: R */
    public abstract void mo9524R(C12310m c12310m, Thread thread);

    /* JADX INFO: renamed from: X */
    public abstract void mo9525X(boolean z4);

    /* JADX INFO: renamed from: Y */
    public abstract void mo9526Y(boolean z4);

    /* JADX INFO: renamed from: d0 */
    public abstract void mo9527d0(C29419o c29419o, Thread thread);

    /* JADX INFO: renamed from: e0 */
    public abstract void mo9528e0(C29419o c29419o, C29419o c29419o2);

    /* JADX INFO: renamed from: f0 */
    public abstract boolean mo9529f0(AbstractFutureC29420p abstractFutureC29420p, C29419o c29419o, C29419o c29419o2);

    /* JADX INFO: renamed from: g0 */
    public abstract C29419o mo9530g0(C29406b c29406b);

    /* JADX INFO: renamed from: h0 */
    public abstract C29412h mo9531h0(C29406b c29406b);

    /* JADX INFO: renamed from: i0 */
    public abstract boolean mo9532i0(AbstractFutureC29420p abstractFutureC29420p, Object obj, Object obj2);

    /* JADX INFO: renamed from: j */
    public abstract boolean mo9533j(AbstractC12311n abstractC12311n, C12300c c12300c, C12300c c12300c2);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo9534k(AbstractC12311n abstractC12311n, Object obj, Object obj2);

    /* JADX INFO: renamed from: l */
    public abstract boolean mo9535l(AbstractC12311n abstractC12311n, C12310m c12310m, C12310m c12310m2);
}
