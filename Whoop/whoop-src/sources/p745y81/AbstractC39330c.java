package p745y81;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.AbstractC38071c;
import x81.C38070b;

/* JADX INFO: renamed from: y81.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Li2/x;", "accent", "active", "affirmative", "negative", "Lkotlin/Function0;", "Ll83/a0;", "content", "b", "(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V", "Ly81/a;", "a", "Ly81/a;", "d", "()Ly81/a;", "DarkSemanticColors", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39330c {

    /* JADX INFO: renamed from: a */
    private static final C39328a f169194a = new C39328a(AbstractC42793j.m125436c().getBrandWhite(), AbstractC42793j.m125436c().getBrandWhite(), AbstractC42793j.m125436c().getAccentAction(), AbstractC42793j.m125436c().getBrandWhite(), null);

    /* JADX INFO: renamed from: b */
    public static final void m125320b(long j7, long j13, long j14, long j15, final InterfaceC4351m content, Composer composer, final int i13, final int i14) {
        final long accent;
        int i15;
        long active;
        long affirmative;
        long negative;
        final long j16;
        final long j17;
        final long j18;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-436203402);
        if ((i13 & 6) == 0) {
            if ((i14 & 1) == 0) {
                accent = j7;
                int i16 = c28655q.m87151f(accent) ? 4 : 2;
                i15 = i16 | i13;
            } else {
                accent = j7;
            }
            i15 = i16 | i13;
        } else {
            accent = j7;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                active = j13;
                int i17 = c28655q.m87151f(active) ? 32 : 16;
                i15 |= i17;
            } else {
                active = j13;
            }
            i15 |= i17;
        } else {
            active = j13;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                affirmative = j14;
                int i18 = c28655q.m87151f(affirmative) ? 256 : 128;
                i15 |= i18;
            } else {
                affirmative = j14;
            }
            i15 |= i18;
        } else {
            affirmative = j14;
        }
        if ((i13 & 3072) == 0) {
            negative = j15;
            i15 |= ((i14 & 8) == 0 && c28655q.m87151f(negative)) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            negative = j15;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(content) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 1) != 0) {
                    accent = C38070b.f163049a.m121943a(c28655q, 6).getAccent();
                    i15 &= -15;
                }
                if ((i14 & 2) != 0) {
                    active = C38070b.f163049a.m121943a(c28655q, 6).getActive();
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    affirmative = C38070b.f163049a.m121943a(c28655q, 6).getAffirmative();
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    negative = C38070b.f163049a.m121943a(c28655q, 6).getNegative();
                    i15 &= -7169;
                }
            } else {
                c28655q.m87138X();
                if ((i14 & 1) != 0) {
                    i15 &= -15;
                }
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
            }
            long j19 = accent;
            long j24 = active;
            long j25 = affirmative;
            long j26 = negative;
            c28655q.m87175r();
            AbstractC28683x.m87247a(AbstractC38071c.m121946c().mo86977a(new C39328a(j19, j24, j25, j26, null)), content, c28655q, ((i15 >> 9) & 112) | 8);
            accent = j19;
            j16 = j24;
            j17 = j25;
            j18 = j26;
        } else {
            c28655q.m87138X();
            j16 = active;
            j17 = affirmative;
            j18 = negative;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y81.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC39330c.m125321c(accent, j16, j17, j18, content, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m125321c(long j7, long j13, long j14, long j15, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m125320b(j7, j13, j14, j15, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static final C39328a m125322d() {
        return f169194a;
    }
}
