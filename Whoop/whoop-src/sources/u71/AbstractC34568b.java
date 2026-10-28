package u71;

import androidx.compose.runtime.Composer;
import c41.AbstractC4012e;
import c41.EnumC4026g;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p510u0.C34350r;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import y71.C39274g;

/* JADX INFO: renamed from: u71.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lu71/j;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Lu71/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34568b {
    /* JADX INFO: renamed from: c */
    public static final void m109299c(C34576j itemState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(424439286);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(itemState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C34350r(29);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            TextResource title = itemState.getTitle();
            TextResource bodyTextResource = itemState.getBodyTextResource();
            C39274g c39274g = new C39274g(itemState.getIcon(), null, 2, null);
            C34571e actionButton = itemState.getActionButton();
            C39274g icon = actionButton != null ? actionButton.getIcon() : null;
            C34571e actionButton2 = itemState.getActionButton();
            TextResource text = actionButton2 != null ? actionButton2.getText() : null;
            C34571e actionButton3 = itemState.getActionButton();
            AbstractC4012e.m12168e(title, bodyTextResource, c39274g, text, icon, actionButton3 != null ? actionButton3.getTagStyle() : null, EnumC4026g.ONBOARDING, function3, c28655q, ((i15 << 18) & 29360128) | 1572864, 0);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34567a(itemState, function2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m109300d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m109301e(C34576j c34576j, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m109299c(c34576j, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
