package lk1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c11.AbstractC3841h;
import c11.C3842i;
import c11.C3844k;
import c11.C3845l;
import c11.C3849p;
import c11.EnumC3846m;
import c11.EnumC3847n;
import c11.EnumC3848o;
import c93.InterfaceC4339a;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import ik1.C18608e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io2.C20769k0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import live.hms.video.media.capturers.camera.utils.C24174a;
import m83.C25271y;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p668z1.C39967p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.Function1;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lk1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lik1/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Lik1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "", "dividerState", "", "index", "isExpanded", "totalContributors", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;IZI)V", "Lc11/i;", "a", "Lc11/i;", "SampleContributorContent", "healthspan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24492b {

    /* JADX INFO: renamed from: a */
    private static final C3842i f95548a;

    static {
        EnumC3846m enumC3846m = EnumC3846m.OLDER_1;
        C3844k c3844k = new C3844k(enumC3846m);
        C3844k c3844k2 = new C3844k(EnumC3846m.OLDER_2);
        C3844k c3844k3 = new C3844k(EnumC3846m.OLDER_3);
        C3844k c3844k4 = new C3844k(EnumC3846m.OLDER_4);
        EnumC3846m enumC3846m2 = EnumC3846m.NEUTRAL;
        C3844k c3844k5 = new C3844k(enumC3846m2);
        C3844k c3844k6 = new C3844k(enumC3846m2);
        C3844k c3844k7 = new C3844k(EnumC3846m.YOUNGER_4);
        C3844k c3844k8 = new C3844k(EnumC3846m.YOUNGER_3);
        C3844k c3844k9 = new C3844k(EnumC3846m.YOUNGER_2);
        EnumC3846m enumC3846m3 = EnumC3846m.YOUNGER_1;
        List listM118959K = AbstractC37056f.m118959K(c3844k, c3844k2, c3844k3, c3844k4, c3844k5, c3844k6, c3844k7, c3844k8, c3844k9, new C3844k(enumC3846m3));
        TextResource textResourceM21278l = AbstractC8693b.m21278l("0%");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("100%");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("68");
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("%");
        EnumC3848o enumC3848o = EnumC3848o.ENABLED;
        f95548a = new C3842i(listM118959K, textResourceM21278l, enumC3846m, textResourceM21278l2, enumC3846m3, new C3845l(textResourceM21278l3, textResourceM21278l4, 0.68d, enumC3848o, AbstractC8693b.m21278l("6 Month avg.")), AbstractC8693b.m21278l("+0.1"), AbstractC8693b.m21278l("years"), EnumC3847n.NEUTRAL, new C3845l(AbstractC8693b.m21278l("0.39"), AbstractC8693b.m21278l(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT), 0.45d, enumC3848o, AbstractC8693b.m21278l("30 Day avg.")), C25271y.f99162w, Function1.m74307h(null, 1, null));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m71280d(C18608e viewState, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13, int i14) {
        p715kotlin.jvm.functions.Function1 function2;
        p715kotlin.jvm.functions.Function1 function3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-377609049);
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(viewState) ? 4 : 2) : i13;
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Object obj = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == obj) {
                    objM87133R = new C24174a(2);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (p715kotlin.jvm.functions.Function1) objM87133R;
            } else {
                function3 = function1;
            }
            boolean zM87153g = c28655q.m87153g(viewState.m53850c());
            Object objM87133R2 = c28655q.m87133R();
            Object obj2 = objM87133R2;
            if (zM87153g || objM87133R2 == obj) {
                C39967p c39967p = new C39967p();
                int size = viewState.m53850c().size();
                ArrayList arrayList = new ArrayList(size);
                int i17 = 0;
                while (i17 < size) {
                    arrayList.add(Boolean.valueOf(i17 < AbstractC37056f.m118951C(viewState.m53850c())));
                    i17++;
                }
                c39967p.addAll(arrayList);
                c28655q.m87172p0(c39967p);
                obj2 = c39967p;
            }
            C39967p c39967p2 = (C39967p) obj2;
            Modifier modifierM52565c = AbstractC18249c.m52565c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 3, 4), AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10()));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM52565c);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(interfaceC4339a);
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
            c28655q.m87150e0(1036303500);
            int i18 = 0;
            for (Object obj3 : viewState.m53850c()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C3849p c3849p = (C3849p) obj3;
                boolean zBooleanValue = ((Boolean) ((i18 < 0 || i18 >= c39967p2.size()) ? Boolean.TRUE : c39967p2.get(i18))).booleanValue();
                boolean zM87153g2 = c28655q.m87153g(c39967p2) | c28655q.m87149e(i18) | c28655q.m87157i(viewState);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == obj) {
                    objM87133R3 = new C6517d(c39967p2, i18, viewState, 4);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC3841h.m11750v(c3849p, zBooleanValue, (p715kotlin.jvm.functions.Function1) objM87133R3, function3, c28655q, ((i15 << 6) & 7168) | C3849p.f15760f, 0);
                i18 = i19;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function2, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m71281e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m71282f(C39967p c39967p, int i13, C18608e c18608e, boolean z4) {
        m71284h(c39967p, i13, z4, c18608e.m53850c().size());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m71283g(C18608e c18608e, p715kotlin.jvm.functions.Function1 function1, int i13, int i14, Composer composer, int i15) {
        m71280d(c18608e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final void m71284h(List<Boolean> list, int i13, boolean z4, int i14) {
        if (i13 < 0 || i13 >= list.size()) {
            return;
        }
        boolean z13 = false;
        boolean z14 = i13 == i14 - 1;
        if (!z4 && !z14) {
            z13 = true;
        }
        list.set(i13, Boolean.valueOf(z13));
        if (i13 > 0) {
            list.set(i13 - 1, Boolean.valueOf(!z4));
        }
    }
}
