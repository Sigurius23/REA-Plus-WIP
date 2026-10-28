package fg2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dw1.C12413a;
import eg2.C13168a;
import gz0.EnumC16313m0;
import l83.C23454a0;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p208i2.C17919x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import vf2.AbstractC35950b;
import x81.C38072d;

/* JADX INFO: renamed from: fg2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14460b {

    /* JADX INFO: renamed from: a */
    public static final C14460b f52784a = new C14460b();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f52785b = new C37816b(new C12413a(16), false, 1650280887);

    /* JADX INFO: renamed from: c */
    private static Function3 f52786c = new C37816b(new C13168a(19), false, 186882044);

    /* JADX INFO: renamed from: fg2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f52787w = new a();

        /* JADX INFO: renamed from: a */
        public final long m41203a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlertTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41203a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fg2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f52788w = new b();

        /* JADX INFO: renamed from: a */
        public final long m41204a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlert();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m41204a((C39336i) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m41199e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153098r, c28655q, 0), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262138);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m41200f(InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_INFORMATION;
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153097q);
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = a.f52787w;
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = b.f52788w;
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC4106r2.m12647f(modifierM3409f, new C4092p2(enumC16313m0, 0.0f, null, null, c8688bM21277k, null, interfaceC39332eM125323a, null, p745y81.Function1.m125323a((Function1) objM87133R2), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC4351m m41201c() {
        return f52785b;
    }

    /* JADX INFO: renamed from: d */
    public final Function3 m41202d() {
        return f52786c;
    }
}
