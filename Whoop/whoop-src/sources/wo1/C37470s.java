package wo1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.C9812h;
import h91.C17027b;
import java.time.LocalDate;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import so1.C32804b;
import vy0.AbstractC36597y;
import vy0.C36570d0;
import wm1.C37383e;

/* JADX INFO: renamed from: wo1.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lwo1/s;", "Lm91/f;", "Lso1/b;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lso1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37470s implements InterfaceC25297f<C32804b> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m120117g(Function1 function1, int i13, String date) {
        AbstractC22676k.m65750j(date, "date");
        function1.invoke(new AbstractC37472u.a(date));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m120118h(Function1 function1, String date) {
        AbstractC22676k.m65750j(date, "date");
        function1.invoke(new AbstractC37472u.c(date));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m120119i(Function1 function1, LocalDate date) {
        AbstractC22676k.m65750j(date, "date");
        function1.invoke(new AbstractC37472u.b(date));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m120120j(Function1 function1, AbstractC36597y event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(new AbstractC37472u.d(event));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m120121k(C37470s c37470s, Modifier modifier, C32804b c32804b, Function1 function1, int i13, Composer composer, int i14) {
        c37470s.Compose(modifier, c32804b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C32804b itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1139922465);
        if ((i13 & 48) == 0) {
            i14 = ((i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 145) != 144)) {
            int i15 = i14 & 896;
            boolean z4 = i15 == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C9812h(onViewEvent, 9);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R;
            boolean z13 = i15 == 256;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C37450h(onViewEvent, 2);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean z14 = i15 == 256;
            Object objM87133R3 = c28655q.m87133R();
            if (z14 || objM87133R3 == c28676v0) {
                objM87133R3 = new C37450h(onViewEvent, 3);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            boolean z15 = i15 == 256;
            Object objM87133R4 = c28655q.m87133R();
            if (z15 || objM87133R4 == c28676v0) {
                objM87133R4 = new C37450h(onViewEvent, 4);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC37471t.m120134l(itemState, interfaceC4351m, function1, function2, (Function1) objM87133R4, c28655q, TextResource.$stable | C17027b.f65485k | C36570d0.f156622b | ((i14 >> 3) & 14), 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37383e(this, modifier, itemState, onViewEvent, i13, 5);
        }
    }
}
