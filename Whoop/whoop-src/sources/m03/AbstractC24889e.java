package m03;

import android.content.Context;
import androidx.compose.runtime.Composer;
import d03.AbstractC11446a;
import d03.AbstractC11447b;
import k71.C22252i;
import l83.C23454a0;
import o73.C27648a;
import p335n6.C26384a;
import p335n6.C26396m;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p477s2.AbstractC32072d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m03.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroid/content/Context;", "context", "Ll83/a0;", "b", "(Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "widget_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24889e {
    /* JADX INFO: renamed from: b */
    public static final void m72988b(Context context, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(context, "context");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(629042683);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(context) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C27648a.m83581d(new C26384a(AbstractC11446a.f36708g), context.getString(AbstractC11447b.f36720c), AbstractC32072d.m99702k(C26396m.f104850a), 1, c28655q, 0, 16);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(context, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m72989c(Context context, int i13, Composer composer, int i14) {
        m72988b(context, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
