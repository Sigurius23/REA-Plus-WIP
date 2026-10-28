package q31;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import e93.AbstractC12889b;
import fc0.C14362f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26954j0;
import nr0.C27072e;
import o71.C27632b;
import o72.C27640a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p725ot1.C28330f;
import p736sz0.AbstractC33231x0;
import p736sz0.C33223u0;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: q31.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lq31/f;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lq31/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "selectedIndex", "onSelectedIndexChange", "p", "(Landroidx/compose/ui/Modifier;Lq31/f;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29946d {
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
    /* JADX INFO: renamed from: h */
    public static final void m91597h(Modifier modifier, C29948f state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(241607654);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            Object[] objArr = {Integer.valueOf(state.getInitiallySelectedSegmentIndex())};
            boolean zM87157i = c28655q.m87157i(state);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C27072e(state, 27);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 0);
            if (state.getTransparentBackground()) {
                c28655q.m87150e0(-631259640);
                Modifier modifierM3599a = AbstractC1136a.m3599a(modifier4, "SegmentedContent");
                int iM91599j = m91599j(interfaceC28593a1);
                boolean zM87153g = c28655q.m87153g(interfaceC28593a1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C14362f(interfaceC28593a1, 7);
                    c28655q.m87172p0(objM87133R2);
                }
                m91605p(modifierM3599a, state, iM91599j, (Function1) objM87133R2, onViewEvent, c28655q, (i15 & 112) | ((i15 << 6) & 57344));
                c28655q.m87173q(false);
                modifier3 = modifier4;
            } else {
                c28655q.m87150e0(-630960800);
                modifier3 = modifier4;
                AbstractC12889b.m36263b(AbstractC1136a.m3599a(modifier4, "SegmentedContent"), AbstractC33253j.m105489e(3 * 4), C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), null, 0, AbstractC37817c.m121344e(1061857773, c28655q, new C27632b((Object) modifier3, (Object) state, (InterfaceC28601c1) interfaceC28593a1, (Object) onViewEvent, 4)), c28655q, 1769472, 24);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier3, state, onViewEvent, i13, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC28593a1 m91598i(C29948f c29948f) {
        return new C28621h1(c29948f.getInitiallySelectedSegmentIndex());
    }

    /* JADX INFO: renamed from: j */
    private static final int m91599j(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: k */
    private static final void m91600k(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m91601l(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m91600k(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m91602m(Modifier modifier, C29948f c29948f, InterfaceC28593a1 interfaceC28593a1, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierMo3471e = AbstractC1099a.m3394p(2 * 8, C2314t.f9131w).mo3471e(modifier);
            int iM91599j = m91599j(interfaceC28593a1);
            boolean zM87153g = c28655q.m87153g(interfaceC28593a1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C14362f(interfaceC28593a1, 8);
                c28655q.m87172p0(objM87133R);
            }
            m91605p(modifierMo3471e, c29948f, iM91599j, (Function1) objM87133R, function1, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m91603n(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m91600k(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m91604o(Modifier modifier, C29948f c29948f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m91597h(modifier, c29948f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m91605p(Modifier modifier, C29948f c29948f, int i13, Function1 function1, Function1 function2, Composer composer, int i14) {
        int i15;
        boolean z4;
        boolean z13;
        Function1 function3 = function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1057788500);
        int i16 = (i14 & 6) == 0 ? (c28655q.m87153g(modifier) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87157i(c29948f) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 9363) != 9362)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
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
            TextResource textResourceM91613f = c29948f.getTitle();
            if (textResourceM91613f == null) {
                c28655q.m87150e0(1567982706);
                c28655q.m87173q(false);
                z4 = false;
                z13 = true;
            } else {
                c28655q.m87150e0(1567982707);
                String strM21274h = AbstractC8693b.m21274h(textResourceM91613f, c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
                C2886a c2886aM8414L = c38072d.m121952e(c28655q, 6).getSh4();
                z4 = false;
                z13 = true;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, 0, 0, 196602);
                c28655q.m87173q(false);
            }
            List<C29943a> listM91612e = c29948f.m91612e();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM91612e, 10));
            for (C29943a c29943a : listM91612e) {
                arrayList.add(new C33223u0(c29943a.getSegmentControlTitle(), c29943a.getSegmentControlSubtitle()));
            }
            boolean zM87157i = c28655q.m87157i(c29948f) | ((i16 & 7168) == 2048 ? z13 : z4) | ((57344 & i16) == 16384 ? z13 : z4);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C26954j0((Object) function1, (Object) c29948f, (Object) function3, 18);
                c28655q.m87172p0(objM87133R);
            }
            int i17 = i16 >> 3;
            boolean z14 = z13;
            boolean z15 = z4;
            AbstractC33231x0.m105420e(arrayList, i13, null, null, (Function1) objM87133R, c28655q, i17 & 112, 12);
            i15 = i13;
            c28655q = c28655q;
            if (i15 < 0 || i15 >= c29948f.m91612e().size()) {
                c28655q.m87150e0(1569044984);
                c28655q.m87173q(z15);
            } else {
                c28655q.m87150e0(1568899873);
                Iterator<T> it = c29948f.m91612e().get(i15).m91582f().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function3, c28655q, i17 & 7168, 6);
                    function3 = function2;
                }
                c28655q.m87173q(z15);
            }
            c28655q.m87173q(z14);
        } else {
            i15 = i13;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a(modifier, c29948f, i15, function1, function2, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m91606q(Function1 function1, C29948f c29948f, Function1 function2, int i13) {
        function1.invoke(Integer.valueOf(i13));
        function2.invoke(new C29944b(c29948f.m91612e().get(i13).getId(), c29948f.m91612e().get(i13).m91582f()));
        AnalyticEventModel analyticEventModelM91580d = c29948f.m91612e().get(i13).getAnalyticEvent();
        if (analyticEventModelM91580d != null) {
            AbstractC13673n.m38578y(null, analyticEventModelM91580d, function2);
        }
        Action actionM91579c = c29948f.m91612e().get(i13).getAction();
        if (actionM91579c != null) {
            function2.invoke(actionM91579c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m91607r(Modifier modifier, C29948f c29948f, int i13, Function1 function1, Function1 function2, int i14, Composer composer, int i15) {
        m91605p(modifier, c29948f, i13, function1, function2, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }
}
