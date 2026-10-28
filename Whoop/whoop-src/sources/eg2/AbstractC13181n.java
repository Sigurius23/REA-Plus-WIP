package eg2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm2.C3444h;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.preview.C9809a;
import e81.C12824e;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import l83.C23454a0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p208i2.C17919x;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p699b70.C2775a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import te0.AbstractC33745d;
import x81.C38072d;

/* JADX INFO: renamed from: eg2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\n\u001a5\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "i", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "q", "(Landroidx/compose/runtime/Composer;I)V", "", "textRes", "u", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "l", "Li2/x;", "linkColor", "strongEmphasisColor", "s", "(ILandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "contentRes", "n", "(ILandroidx/compose/runtime/Composer;I)V", "sms_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13181n {

    /* JADX INFO: renamed from: eg2.n$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f45694w = new a();

        /* JADX INFO: renamed from: a */
        public final long m37073a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getNeutral15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m37073a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: eg2.n$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f45695w = new b();

        /* JADX INFO: renamed from: a */
        public final long m37074a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m37074a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m37055i(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-9228206);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier), 2 * 8, 0.0f, 2);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C12824e(25);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65717c(modifierM3396r, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 805306368, 510);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 6, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m37056j(InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        C13169b c13169b = C13169b.f45620a;
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36913H(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36925T(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36924S(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36921P(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36909D(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36915J(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36917L(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36926x(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36906A(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36910E(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36920O(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36912G(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36916K(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36919N(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36928z(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36908C(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36911F(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36914I(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36923R(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36922Q(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36918M(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36927y(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c13169b.m36907B(), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m37057k(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m37055i(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static final void m37058l(int i13, Modifier modifier, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Modifier modifierM3398t;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1120489090);
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q2.m87149e(i13) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 == 0) {
            if ((i14 & 48) == 0) {
                modifier2 = modifier;
                i16 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i16 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 1 * 4, 0.0f, 0.0f, 13);
                } else {
                    modifierM3398t = modifier2;
                }
                String strM21273g = AbstractC8693b.m21273g(i13, c28655q2, i16 & 14);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21273g, modifierM3398t, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB1(), null, c28655q, i16 & 112, C2886a.f11498d << 18, 196600);
                modifier2 = modifierM3398t;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13179l(i13, i14, i15, 0, modifier2);
            }
        }
        i16 |= 48;
        modifier2 = modifier;
        if ((i16 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 1 * 4, 0.0f, 0.0f, 13);
            } else {
                modifierM3398t = modifier2;
            }
            String strM21273g2 = AbstractC8693b.m21273g(i13, c28655q2, i16 & 14);
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21273g2, modifierM3398t, c38072d2.m121949b(c28655q2, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i19).getB1(), null, c28655q, i16 & 112, C2886a.f11498d << 18, 196600);
            modifier2 = modifierM3398t;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13179l(i13, i14, i15, 0, modifier2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m37059m(int i13, Modifier modifier, int i14, int i15, Composer composer, int i16) {
        m37058l(i13, modifier, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m37060n(int i13, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1537915295);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 4 * 8, 0.0f, 0.0f, 13);
            EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_INFORMATION;
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(i13);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = a.f45694w;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = b.f45695w;
                c28655q.m87172p0(objM87133R2);
            }
            C4092p2 c4092p2 = new C4092p2(enumC16313m0, 0.0f, null, null, c8688bM21277k, null, interfaceC39332eM125323a, null, p745y81.Function1.m125323a((Function1) objM87133R2), null, null, null, null, false, null, null, null, C25271y.f99162w, null, null, 917166, null);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C12824e(26);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC4106r2.m12647f(modifierM3398t, c4092p2, (Function1) objM87133R3, c28655q, (C4092p2.f16593v << 3) | 390, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3444h(i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m37061o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m37062p(int i13, int i14, Composer composer, int i15) {
        m37060n(i13, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m37063q(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1349070641);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 4 * 8, 0.0f, 0.0f, 13), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m37064r(int i13, Composer composer, int i14) {
        m37063q(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3 A[PHI: r3 r4 r8
      0x00a3: PHI (r3v9 androidx.compose.ui.Modifier) = (r3v4 androidx.compose.ui.Modifier), (r3v12 androidx.compose.ui.Modifier) binds: [B:69:0x00d8, B:60:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r4v12 int) = (r4v6 int), (r4v14 int) binds: [B:69:0x00d8, B:60:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r8v13 long) = (r8v8 long), (r8v6 long) binds: [B:69:0x00d8, B:60:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x016c  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public static final void m37065s(int i13, Modifier modifier, long j7, long j13, Composer composer, final int i14, final int i15) {
        final int i16;
        int i17;
        Modifier modifier2;
        long jM125403k0;
        long j14;
        boolean z4;
        C28655q c28655q;
        final Modifier modifier3;
        final long j15;
        final long j16;
        C28677v1 c28677v1M87180u;
        Modifier modifierM3398t;
        long jM125430y;
        long j17;
        int i18;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1772820739);
        if ((i14 & 6) == 0) {
            i16 = i13;
            i17 = (c28655q2.m87149e(i16) ? 4 : 2) | i14;
        } else {
            i16 = i13;
            i17 = i14;
        }
        int i19 = i15 & 2;
        if (i19 == 0) {
            if ((i14 & 48) == 0) {
                modifier2 = modifier;
                i17 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if ((i15 & 4) == 0) {
                    jM125403k0 = j7;
                    int i24 = c28655q2.m87151f(jM125403k0) ? 256 : 128;
                    i17 |= i24;
                } else {
                    jM125403k0 = j7;
                }
                i17 |= i24;
            } else {
                jM125403k0 = j7;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    j14 = j13;
                    if (c28655q2.m87151f(j14)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i17 |= i18;
                } else {
                    j14 = j13;
                }
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i17 |= i18;
            } else {
                j14 = j13;
            }
            if ((i17 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i17 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i14 & 1) != 0 || c28655q2.m87118C()) {
                    if (i19 != 0) {
                        modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 1 * 4, 0.0f, 0.0f, 13);
                    } else {
                        modifierM3398t = modifier2;
                    }
                    if ((i15 & 4) != 0) {
                        i17 &= -897;
                        jM125403k0 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getStrain();
                    }
                    if ((i15 & 8) != 0) {
                        i17 &= -7169;
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandWhite();
                        j17 = jM125403k0;
                    }
                    c28655q2.m87175r();
                    C21053l c21053l = C21053l.f79834a;
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    Modifier modifier4 = modifierM3398t;
                    AbstractC21048g.m58807M(AbstractC8693b.m21274h(AbstractC8693b.m21277k(i16), c28655q2, TextResource.C8688b.f25889c), modifier4, false, c21053l.m58880a(AbstractC33745d.m106661t(c38072d, c28655q2, i25), c38072d.m121949b(c28655q2, i25).getWhite70(), j17, 0L, null, jM125430y, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 2 * 8, c28655q2, (i17 & 896) | (458752 & (i17 << 6)), (C21053l.f79835b << 15) | 24576, 16344), null, 0, 0, 0, false, c28655q2, (i17 & 112) | (C21054m.f79836p << 9), 500);
                    c28655q = c28655q2;
                    j15 = j17;
                    modifier3 = modifier4;
                    j16 = jM125430y;
                } else {
                    c28655q2.m87138X();
                    if ((i15 & 4) != 0) {
                        i17 &= -897;
                    }
                    if ((i15 & 8) != 0) {
                        i17 &= -7169;
                    }
                    modifierM3398t = modifier2;
                }
                j17 = jM125403k0;
                jM125430y = j14;
                c28655q2.m87175r();
                C21053l c21053l2 = C21053l.f79834a;
                C38072d c38072d2 = C38072d.f163053a;
                int i26 = C38072d.f163054b;
                Modifier modifier5 = modifierM3398t;
                AbstractC21048g.m58807M(AbstractC8693b.m21274h(AbstractC8693b.m21277k(i16), c28655q2, TextResource.C8688b.f25889c), modifier5, false, c21053l2.m58880a(AbstractC33745d.m106661t(c38072d2, c28655q2, i26), c38072d2.m121949b(c28655q2, i26).getWhite70(), j17, 0L, null, jM125430y, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 2 * 8, c28655q2, (i17 & 896) | (458752 & (i17 << 6)), (C21053l.f79835b << 15) | 24576, 16344), null, 0, 0, 0, false, c28655q2, (i17 & 112) | (C21054m.f79836p << 9), 500);
                c28655q = c28655q2;
                j15 = j17;
                modifier3 = modifier5;
                j16 = jM125430y;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                j15 = jM125403k0;
                j16 = j14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: eg2.m
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC13181n.m37066t(i16, modifier3, j15, j16, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 48;
        modifier2 = modifier;
        if ((i14 & 384) == 0) {
            if ((i15 & 4) == 0) {
                jM125403k0 = j7;
                if (c28655q2.m87151f(jM125403k0)) {
                }
                i17 |= i24;
            } else {
                jM125403k0 = j7;
            }
            i17 |= i24;
        } else {
            jM125403k0 = j7;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                j14 = j13;
                if (c28655q2.m87151f(j14)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i17 |= i18;
            } else {
                j14 = j13;
            }
            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i17 |= i18;
        } else {
            j14 = j13;
        }
        if ((i17 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i17 & 1, z4)) {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0) {
                if (i19 != 0) {
                    modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 1 * 4, 0.0f, 0.0f, 13);
                } else {
                    modifierM3398t = modifier2;
                }
                if ((i15 & 4) != 0) {
                    i17 &= -897;
                    jM125403k0 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getStrain();
                }
                if ((i15 & 8) != 0) {
                    i17 &= -7169;
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandWhite();
                    j17 = jM125403k0;
                } else {
                    j17 = jM125403k0;
                    jM125430y = j14;
                }
            } else {
                if (i19 != 0) {
                    modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 1 * 4, 0.0f, 0.0f, 13);
                } else {
                    modifierM3398t = modifier2;
                }
                if ((i15 & 4) != 0) {
                    i17 &= -897;
                    jM125403k0 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getStrain();
                }
                if ((i15 & 8) != 0) {
                    i17 &= -7169;
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandWhite();
                    j17 = jM125403k0;
                } else {
                    j17 = jM125403k0;
                    jM125430y = j14;
                }
            }
            c28655q2.m87175r();
            C21053l c21053l3 = C21053l.f79834a;
            C38072d c38072d3 = C38072d.f163053a;
            int i27 = C38072d.f163054b;
            Modifier modifier6 = modifierM3398t;
            AbstractC21048g.m58807M(AbstractC8693b.m21274h(AbstractC8693b.m21277k(i16), c28655q2, TextResource.C8688b.f25889c), modifier6, false, c21053l3.m58880a(AbstractC33745d.m106661t(c38072d3, c28655q2, i27), c38072d3.m121949b(c28655q2, i27).getWhite70(), j17, 0L, null, jM125430y, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 2 * 8, c28655q2, (i17 & 896) | (458752 & (i17 << 6)), (C21053l.f79835b << 15) | 24576, 16344), null, 0, 0, 0, false, c28655q2, (i17 & 112) | (C21054m.f79836p << 9), 500);
            c28655q = c28655q2;
            j15 = j17;
            modifier3 = modifier6;
            j16 = jM125430y;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            j15 = jM125403k0;
            j16 = j14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: eg2.m
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC13181n.m37066t(i16, modifier3, j15, j16, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m37066t(int i13, Modifier modifier, long j7, long j13, int i14, int i15, Composer composer, int i16) {
        m37065s(i13, modifier, j7, j13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public static final void m37067u(int i13, Modifier modifier, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Modifier modifierM3398t;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(199059428);
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q2.m87149e(i13) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 == 0) {
            if ((i14 & 48) == 0) {
                modifier2 = modifier;
                i16 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i16 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 4 * 8, 0.0f, 0.0f, 13);
                } else {
                    modifierM3398t = modifier2;
                }
                String strM21273g = AbstractC8693b.m21273g(i13, c28655q2, i16 & 14);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21273g, modifierM3398t, c38072d.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getT3(), null, c28655q, i16 & 112, C2886a.f11498d << 18, 196600);
                modifier2 = modifierM3398t;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13179l(i13, i14, i15, 1, modifier2);
            }
        }
        i16 |= 48;
        modifier2 = modifier;
        if ((i16 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 4 * 8, 0.0f, 0.0f, 13);
            } else {
                modifierM3398t = modifier2;
            }
            String strM21273g2 = AbstractC8693b.m21273g(i13, c28655q2, i16 & 14);
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21273g2, modifierM3398t, c38072d2.m121949b(c28655q2, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i19).getT3(), null, c28655q, i16 & 112, C2886a.f11498d << 18, 196600);
            modifier2 = modifierM3398t;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13179l(i13, i14, i15, 1, modifier2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m37068v(int i13, Modifier modifier, int i14, int i15, Composer composer, int i16) {
        m37067u(i13, modifier, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
