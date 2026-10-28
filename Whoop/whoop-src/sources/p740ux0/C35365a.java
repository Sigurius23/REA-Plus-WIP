package p740ux0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p163g1.AbstractC15011f9;
import p291l0.InterfaceC22997s1;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32587b2;
import qx0.C30745a;
import x81.C38072d;

/* JADX INFO: renamed from: ux0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35365a {

    /* JADX INFO: renamed from: a */
    public static final C35365a f150638a = new C35365a();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f150639b = new C37816b(new C32587b2(23), false, 114832117);

    /* JADX INFO: renamed from: c */
    private static Function3 f150640c = new C37816b(new C30745a(20), false, 1306216031);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m112204e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC15011f9.m43114b("Share Path", null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 6, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m112205f(InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC15011f9.m43114b("Show Share Sheet", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 6, 0, 131070);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC4351m m112206c() {
        return f150639b;
    }

    /* JADX INFO: renamed from: d */
    public final Function3 m112207d() {
        return f150640c;
    }
}
