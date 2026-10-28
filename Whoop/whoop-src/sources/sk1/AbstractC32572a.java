package sk1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cw2.C11162c;
import hy0.AbstractC17796v1;
import hy0.C17723a2;
import hy0.EnumC17727b2;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sk1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lsk1/b;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lb91/a;", "textStyle", "Li2/x;", "textColor", "Ll83/a0;", "b", "(Lsk1/b;Landroidx/compose/ui/Modifier;Lb91/a;JLandroidx/compose/runtime/Composer;II)V", "Lhy0/b2;", "value", "", "inverseConcern", "Lhy0/a2;", "d", "(Lhy0/b2;ZLandroidx/compose/runtime/Composer;II)Lhy0/a2;", "heart-health-common_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32572a {

    /* JADX INFO: renamed from: sk1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f134952a;

        static {
            int[] iArr = new int[EnumC17727b2.values().length];
            try {
                iArr[EnumC17727b2.ALERT_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17727b2.CONCERN_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17727b2.NEGATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC17727b2.NEUTRAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC17727b2.POSITIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC17727b2.POSITIVE_RANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC17727b2.NEUTRAL_CONCERN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f134952a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x011c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x0133  */
    /* JADX WARN: Code duplicated, block: B:84:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m101627b(C32573b state, Modifier modifier, C2886a c2886a, long j7, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        long j13;
        boolean z4;
        C2886a c2886a2;
        Modifier modifier3;
        long j14;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C2886a c2886a3;
        long brandWhite;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        int i17;
        boolean zM87157i;
        C2886a b6 = c2886a;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2122392557);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 4) != 0) {
                    i17 = 128;
                } else {
                    if ((i13 & 512) == 0) {
                        zM87157i = c28655q.m87153g(b6);
                    } else {
                        zM87157i = c28655q.m87157i(b6);
                    }
                    if (zM87157i) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    j13 = j7;
                    if (c28655q.m87151f(j13)) {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i16;
                } else {
                    j13 = j7;
                }
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i16;
            } else {
                j13 = j7;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    if (i18 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        b6 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB1();
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c2886a3 = b6;
                        brandWhite = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
                    } else {
                        c2886a3 = b6;
                    }
                    c28655q.m87175r();
                    f13 = 2;
                    int i19 = i15 >> 3;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(8 * f13), C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    C17723a2 c17723a2M101629d = m101629d(state.getTrendType(), false, c28655q, 0, 2);
                    float f14 = 6;
                    float f15 = f13 * 4;
                    if (state.getTrendType() != EnumC17727b2.NEUTRAL) {
                        f13 = Float.NaN;
                    }
                    AbstractC17796v1.m51143b(c17723a2M101629d, null, f14, f15, f13, c28655q, C17723a2.f68897j | 3456, 2);
                    long j15 = brandWhite;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getTitle(), c28655q, TextResource.$stable), null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, null, c28655q, i19 & 896, (C2886a.f11498d << 18) | ((i15 << 12) & 3670016), 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                    j14 = j15;
                    c2886a2 = c2886a3;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    c2886a3 = b6;
                    modifier4 = modifier2;
                }
                brandWhite = j13;
                c28655q.m87175r();
                f13 = 2;
                int i110 = i15 >> 3;
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(8 * f13), C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                C17723a2 c17723a2M101629d2 = m101629d(state.getTrendType(), false, c28655q, 0, 2);
                float f16 = 6;
                float f17 = f13 * 4;
                if (state.getTrendType() != EnumC17727b2.NEUTRAL) {
                    f13 = Float.NaN;
                }
                AbstractC17796v1.m51143b(c17723a2M101629d2, null, f16, f17, f13, c28655q, C17723a2.f68897j | 3456, 2);
                long j16 = brandWhite;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getTitle(), c28655q, TextResource.$stable), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, null, c28655q, i110 & 896, (C2886a.f11498d << 18) | ((i15 << 12) & 3670016), 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier4;
                j14 = j16;
                c2886a2 = c2886a3;
            } else {
                c28655q.m87138X();
                c2886a2 = b6;
                modifier3 = modifier2;
                j14 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11162c(state, modifier3, c2886a2, j14, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) != 0) {
                i17 = 128;
            } else {
                if ((i13 & 512) == 0) {
                    zM87157i = c28655q.m87153g(b6);
                } else {
                    zM87157i = c28655q.m87157i(b6);
                }
                if (zM87157i) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
            }
            i15 |= i17;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                j13 = j7;
                if (c28655q.m87151f(j13)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i16;
            } else {
                j13 = j7;
            }
            i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i16;
        } else {
            j13 = j7;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    b6 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB1();
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c2886a3 = b6;
                    brandWhite = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
                } else {
                    c2886a3 = b6;
                    brandWhite = j13;
                }
            } else {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    b6 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB1();
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c2886a3 = b6;
                    brandWhite = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
                } else {
                    c2886a3 = b6;
                    brandWhite = j13;
                }
            }
            c28655q.m87175r();
            f13 = 2;
            int i111 = i15 >> 3;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(8 * f13), C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
            C17723a2 c17723a2M101629d3 = m101629d(state.getTrendType(), false, c28655q, 0, 2);
            float f18 = 6;
            float f19 = f13 * 4;
            if (state.getTrendType() != EnumC17727b2.NEUTRAL) {
                f13 = Float.NaN;
            }
            AbstractC17796v1.m51143b(c17723a2M101629d3, null, f18, f19, f13, c28655q, C17723a2.f68897j | 3456, 2);
            long j17 = brandWhite;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getTitle(), c28655q, TextResource.$stable), null, j17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, null, c28655q, i111 & 896, (C2886a.f11498d << 18) | ((i15 << 12) & 3670016), 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
            j14 = j17;
            c2886a2 = c2886a3;
        } else {
            c28655q.m87138X();
            c2886a2 = b6;
            modifier3 = modifier2;
            j14 = j13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11162c(state, modifier3, c2886a2, j14, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m101628c(C32573b c32573b, Modifier modifier, C2886a c2886a, long j7, int i13, int i14, Composer composer, int i15) {
        m101627b(c32573b, modifier, c2886a, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static final C17723a2 m101629d(EnumC17727b2 value, boolean z4, Composer composer, int i13, int i14) {
        C17723a2 c17723a2M50734c;
        AbstractC22676k.m65750j(value, "value");
        boolean z13 = (i14 & 2) != 0 ? false : z4;
        switch (a.f134952a[value.ordinal()]) {
            case 1:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(1850508474);
                C17723a2 c17723a2M50732a = C17723a2.INSTANCE.m50732a(c28655q, 6);
                c28655q.m87173q(false);
                return c17723a2M50732a;
            case 2:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(1850510540);
                if (z13) {
                    c28655q2.m87150e0(1531269533);
                    C38072d c38072d = C38072d.f163053a;
                    int i15 = C38072d.f163054b;
                    C17723a2 c17723a2 = new C17723a2(c38072d.m121949b(c28655q2, i15).getAccentNegativeTrend(), c38072d.m121949b(c28655q2, i15).getAccentNegativeTrend15(), Integer.valueOf(c38072d.m121951d().getTinyIcons().getAttention()), c38072d.m121949b(c28655q2, i15).getAccentNegativeTrend15(), c38072d.m121949b(c28655q2, i15).getBrandBlack(), 0L, false, false, 224, null);
                    c28655q2.m87173q(false);
                    c17723a2M50734c = c17723a2;
                } else {
                    c28655q2.m87150e0(1531549804);
                    c17723a2M50734c = C17723a2.INSTANCE.m50734c(c28655q2, 6);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(false);
                return c17723a2M50734c;
            case 3:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(1850522936);
                C17723a2 c17723a2M50738g = C17723a2.INSTANCE.m50738g(c28655q3, 6);
                c28655q3.m87173q(false);
                return c17723a2M50738g;
            case 4:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(1850524727);
                C17723a2 c17723a2M50742k = C17723a2.INSTANCE.m50742k(c28655q4, 6);
                c28655q4.m87173q(false);
                return c17723a2M50742k;
            case 5:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(1850526520);
                C17723a2 c17723a2M50751t = C17723a2.INSTANCE.m50751t(c28655q5, 6);
                c28655q5.m87173q(false);
                return c17723a2M50751t;
            case 6:
                C28655q c28655q6 = (C28655q) composer;
                c28655q6.m87150e0(1850528541);
                C17723a2 c17723a2M50750s = C17723a2.INSTANCE.m50750s(c28655q6, 6);
                c28655q6.m87173q(false);
                return c17723a2M50750s;
            case 7:
                C28655q c28655q7 = (C28655q) composer;
                c28655q7.m87150e0(1850530750);
                C17723a2 c17723a2M50741j = C17723a2.INSTANCE.m50741j(c28655q7, 6);
                c28655q7.m87173q(false);
                return c17723a2M50741j;
            default:
                C28655q c28655q8 = (C28655q) composer;
                c28655q8.m87150e0(1850532151);
                C17723a2 c17723a2M50742k2 = C17723a2.INSTANCE.m50742k(c28655q8, 6);
                c28655q8.m87173q(false);
                return c17723a2M50742k2;
        }
    }
}
