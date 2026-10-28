package y71;

import am2.C1033n0;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;

/* JADX INFO: renamed from: y71.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Ly71/k;", "Lm91/f;", "Ly71/o;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Ly71/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39278k implements InterfaceC25297f<C39282o> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m125156f(Function1 function1, C39282o c39282o) {
        function1.invoke(c39282o.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m125157g(C39282o c39282o, Function1 function1) {
        GenericInteraction genericInteraction = c39282o.getGenericInteraction();
        if (genericInteraction != null) {
            function1.invoke(genericInteraction);
        } else {
            C9598e destination = c39282o.getDestination();
            if (destination != null) {
                function1.invoke(destination);
            } else {
                function1.invoke(c39282o.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m125158h(Function1 function1, C39282o c39282o) {
        function1.invoke(c39282o.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m125159i(C39278k c39278k, Modifier modifier, C39282o c39282o, Function1 function1, int i13, Composer composer, int i14) {
        c39278k.Compose(modifier, c39282o, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C39282o itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1315775952);
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
            AbstractC39279l alignment = itemState.getAlignment();
            boolean z4 = alignment instanceof AbstractC39279l.a;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-1740298175);
                AbstractC39279l.a aVar = (AbstractC39279l.a) alignment;
                boolean zM87157i = c28655q.m87157i(itemState) | ((i14 & 896) == 256);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C1033n0(onViewEvent, itemState, 1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC39273f.m125126d(itemState, aVar, modifier, (InterfaceC4339a) objM87133R, c28655q, ((i14 >> 3) & 14) | ((i14 << 6) & 896));
                c28655q.m87173q(false);
            } else if (alignment instanceof AbstractC39279l.b) {
                c28655q.m87150e0(-1740293009);
                AbstractC39279l.b bVar = (AbstractC39279l.b) alignment;
                boolean zM87157i2 = c28655q.m87157i(itemState) | ((i14 & 896) == 256);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C1033n0(itemState, onViewEvent, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC39276i.m125140f(itemState, bVar, modifier, (InterfaceC4339a) objM87133R2, c28655q, ((i14 << 6) & 896) | ((i14 >> 3) & 14));
                c28655q.m87173q(false);
            } else {
                if (!(alignment instanceof AbstractC39279l.c)) {
                    throw AbstractC11895b.m32003v(-1740301020, c28655q, false);
                }
                c28655q.m87150e0(-1740280663);
                AbstractC39279l.c cVar = (AbstractC39279l.c) alignment;
                boolean zM87157i3 = c28655q.m87157i(itemState) | ((i14 & 896) == 256);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i3 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C1033n0(onViewEvent, itemState, 3);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC39276i.m125142h(itemState, cVar, modifier, (InterfaceC4339a) objM87133R3, c28655q, ((i14 << 6) & 896) | ((i14 >> 3) & 14));
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39277j(this, modifier, itemState, onViewEvent, i13, 0);
        }
    }
}
