package d91;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import ci0.C4726a;
import d71.C11757c;
import fy1.C14873i;
import l83.C23454a0;
import p027b3.AbstractC2346a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: d91.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, m65681d2 = {"Ld91/e;", "Lb3/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "a", "(Landroidx/compose/runtime/Composer;I)V", "m", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11817e extends AbstractC2346a {

    /* JADX INFO: renamed from: J */
    public static final int f38412J = AbstractC2346a.f9276I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC11817e(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m31685k(AbstractC11817e abstractC11817e, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            abstractC11817e.mo20132m(c28655q, AbstractC2346a.f9276I);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m31686l(AbstractC11817e abstractC11817e, int i13, Composer composer, int i14) {
        abstractC11817e.mo3598a(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p027b3.AbstractC2346a
    /* JADX INFO: renamed from: a */
    public final void mo3598a(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1479513787);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(this) : c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC38073e.m121966n(null, C14873i.f55508a, null, null, AbstractC37817c.m121344e(-1124353568, c28655q, new C4726a(this, 19)), c28655q, (C14873i.f55509b << 3) | 24576, 13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(this, i13, 2);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo20132m(Composer composer, int i13);
}
