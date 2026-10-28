package p31;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aw0.C2108h;
import c93.InterfaceC4339a;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p023ay.C2124a0;
import p026b2.C2314t;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15002f0;
import p163g1.AbstractC15081m5;
import p163g1.C14970c1;
import p163g1.C15071l5;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: p31.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "expanded", "Lkotlin/Function0;", "Ll83/a0;", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Ll0/y;", "content", "c", "(ZLc93/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28806q {
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m87672c(boolean z4, InterfaceC4339a onDismissRequest, Modifier modifier, Function3 content, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        int i16;
        AbstractC22676k.m65750j(onDismissRequest, "onDismissRequest");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(371385072);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onDismissRequest) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(content)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                AbstractC20301a.m56339g(C14970c1.m43086a((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a), 0L, C38072d.f163053a.m121949b(c28655q, 6).getTransparent(), 0L, 8159), null, C15071l5.m43152a((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a), null, AbstractC33253j.m105489e(5 * 4), 5), AbstractC37817c.m121344e(735623324, c28655q, new C2124a0(z4, onDismissRequest, modifier3, content, 8)), c28655q, 3072, 2);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(z4, onDismissRequest, modifier3, content, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(content)) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
        }
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            AbstractC20301a.m56339g(C14970c1.m43086a((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a), 0L, C38072d.f163053a.m121949b(c28655q, 6).getTransparent(), 0L, 8159), null, C15071l5.m43152a((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a), null, AbstractC33253j.m105489e(5 * 4), 5), AbstractC37817c.m121344e(735623324, c28655q, new C2124a0(z4, onDismissRequest, modifier3, content, 8)), c28655q, 3072, 2);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(z4, onDismissRequest, modifier3, content, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m87673d(boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, Function3 function3, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 1 * 8;
            AbstractC15002f0.m43105a(z4, interfaceC4339a, AbstractC1099a.m3395q(AbstractC28795f.m87552H().mo3471e(modifier), f13, f13), 0L, null, null, function3, c28655q, 0, 56);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m87674e(boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, Function3 function3, int i13, int i14, Composer composer, int i15) {
        m87672c(z4, interfaceC4339a, modifier, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
