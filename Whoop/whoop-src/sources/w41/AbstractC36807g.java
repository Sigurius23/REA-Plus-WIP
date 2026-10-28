package w41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import eu.C13612g;
import p390p1.C28635l;
import p390p1.C28655q;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: w41.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Leu/g;", "cameraPositionState", "Lw41/f;", "a", "(Leu/g;Landroidx/compose/runtime/Composer;II)Lw41/f;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36807g {

    /* JADX INFO: renamed from: w41.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {
        public a() {
            super(0);
        }

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13612g invoke() {
            return new C13612g();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C36806f m117972a(C13612g c13612g, Composer composer, int i13, int i14) {
        boolean z4 = true;
        if ((i14 & 1) != 0) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87152f0(-1911106014);
            c13612g = (C13612g) AbstractC39038k.m124459e(new Object[0], C13612g.f48186h, new a(), c28655q, 72, 0);
            c28655q.m87173q(false);
        }
        if ((((i13 & 14) ^ 6) <= 4 || !((C28655q) composer).m87153g(c13612g)) && (i13 & 6) != 4) {
            z4 = false;
        }
        C28655q c28655q2 = (C28655q) composer;
        Object objM87133R = c28655q2.m87133R();
        if (z4 || objM87133R == C28635l.f115821a) {
            objM87133R = new C36806f(c13612g);
            c28655q2.m87172p0(objM87133R);
        }
        return (C36806f) objM87133R;
    }
}
