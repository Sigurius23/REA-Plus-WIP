package e41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import d01.C11439d;
import e11.C12582b;
import gy0.AbstractC16277f;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: e41.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", NotificationCompat.CATEGORY_EVENT, "c", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12705j {
    /* JADX INFO: renamed from: c */
    public static final void m35547c(Modifier modifier, Function1 onViewEvent, Object event, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(event, "event");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(334395156);
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
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(event) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            Modifier modifierM95629e = AbstractC31061c.m95629e(modifier4, 1, 4, EnumC39333f.BRAND_PRIMARY.mo134584toComposableColorWaAFU9c(c28655q, 6));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM95629e);
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
            C27270o c27270o = new C27270o(AbstractC27274q.b.f109138f, C38072d.f163053a.m121951d().getAction().getDelete(), EnumC39333f.BRAND_WHITE, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62322f);
            boolean zM87157i = c28655q.m87157i(event) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C11439d(onViewEvent, event, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R, c28655q, 0, 12);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 2, (Object) modifier3, event, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m35548d(Function1 function1, Object obj) {
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m35549e(Modifier modifier, Function1 function1, Object obj, int i13, int i14, Composer composer, int i15) {
        m35547c(modifier, function1, obj, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
