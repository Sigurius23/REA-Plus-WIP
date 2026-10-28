package ox0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import no0.C26970r0;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15011f9;
import p291l0.InterfaceC22997s1;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24947b;
import x81.C38072d;

/* JADX INFO: renamed from: ox0.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28452f {

    /* JADX INFO: renamed from: a */
    public static final C28452f f114717a = new C28452f();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f114718b = new C37816b(new C24947b(25), false, -89208661);

    /* JADX INFO: renamed from: c */
    private static InterfaceC4351m f114719c = new C37816b(new C24947b(26), false, -11087572);

    /* JADX INFO: renamed from: d */
    private static Function3 f114720d = new C37816b(new C26970r0(11), false, 2017196309);

    /* JADX INFO: renamed from: e */
    private static Function3 f114721e = new C37816b(new C26970r0(12), false, -92953517);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m86252i(InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC15011f9.m43114b("Set Battery Level", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 6, 0, 131070);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m86253j(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC15011f9.m43114b("Enter battery level", null, AbstractC13673n.m38559f(C38072d.f163053a, c28655q, C38072d.f163054b, 0.6f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 6, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m86254k(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC15011f9.m43114b("Battery Level (0-100)", null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 6, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m86255l(InterfaceC22997s1 OutlinedButton, Composer composer, int i13) {
        AbstractC22676k.m65750j(OutlinedButton, "$this$OutlinedButton");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC15011f9.m43114b("Clear PN Cache", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 6, 0, 131070);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC4351m m86256e() {
        return f114719c;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC4351m m86257f() {
        return f114718b;
    }

    /* JADX INFO: renamed from: g */
    public final Function3 m86258g() {
        return f114721e;
    }

    /* JADX INFO: renamed from: h */
    public final Function3 m86259h() {
        return f114720d;
    }
}
