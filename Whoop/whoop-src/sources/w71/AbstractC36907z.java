package w71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
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
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31919h;
import qz0.AbstractC30795n;
import w70.C36870a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: w71.z */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\" \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "question", "context", "", "hasContext", "Lw71/a0;", "padding", "Ll83/a0;", "c", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V", "Lp1/t1;", "a", "Lp1/t1;", "f", "()Lp1/t1;", "LocalJournalQuestionTextPadding", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36907z {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f157896a = new C28596b0(new C36870a(3));

    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5 A[PHI: r2 r3 r6
      0x00a5: PHI (r2v16 int) = (r2v10 int), (r2v17 int), (r2v18 int) binds: [B:69:0x00bd, B:59:0x00a1, B:60:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r3v9 com.whoop.design.util.TextResource) = 
      (r3v5 com.whoop.design.util.TextResource)
      (r3v2 com.whoop.design.util.TextResource)
      (r3v2 com.whoop.design.util.TextResource)
     binds: [B:69:0x00bd, B:59:0x00a1, B:60:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r6v15 boolean) = (r6v4 boolean), (r6v2 boolean), (r6v2 boolean) binds: [B:69:0x00bd, B:59:0x00a1, B:60:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x0102  */
    /* JADX WARN: Code duplicated, block: B:77:0x0115  */
    /* JADX WARN: Code duplicated, block: B:79:0x0123  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0209  */
    /* JADX WARN: Code duplicated, block: B:89:0x0216  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m118520c(TextResource question, TextResource textResource, boolean z4, EnumC36872a0 enumC36872a0, Composer composer, int i13, int i14) {
        int i15;
        TextResource c8691e;
        boolean z13;
        boolean z14;
        EnumC36872a0 enumC36872a1;
        TextResource textResource2;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i16;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        int i17;
        int iOrdinal;
        AbstractC22676k.m65750j(question, "question");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(644226989);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(question) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                c8691e = textResource;
                int i18 = c28655q.m87153g(c8691e) ? 32 : 16;
                i15 |= i18;
            } else {
                c8691e = textResource;
            }
            i15 |= i18;
        } else {
            c8691e = textResource;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) != 0) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                } else {
                    if (enumC36872a0 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36872a0.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    if ((i14 & 2) != 0) {
                        c8691e = new TextResource.C8691e("");
                        i15 &= -113;
                    }
                    if (i19 != 0) {
                        z13 = false;
                    }
                    if ((i14 & 8) != 0) {
                        enumC36872a1 = (EnumC36872a0) c28655q.m87161k(f157896a);
                        i15 &= -7169;
                    }
                    i16 = i15;
                    z16 = z13;
                    c28655q.m87175r();
                    float verticalPadding = enumC36872a1.getVerticalPadding();
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, verticalPadding, 1);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    String strM21274h = AbstractC8693b.m21274h(question, c28655q, i16 & 14);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 48, 0, 196600);
                    if (z16) {
                        c28655q.m87150e0(1586491457);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c8691e, c28655q, (i16 >> 3) & 14), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q = c28655q;
                        c28655q.m87150e0(1586664747);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    TextResource textResource3 = c8691e;
                    z15 = z16;
                    textResource2 = textResource3;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                }
                enumC36872a1 = enumC36872a0;
                i16 = i15;
                z16 = z13;
                c28655q.m87175r();
                float verticalPadding2 = enumC36872a1.getVerticalPadding();
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t2, 0.0f, verticalPadding2, 1);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                String strM21274h2 = AbstractC8693b.m21274h(question, c28655q, i16 & 14);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 48, 0, 196600);
                if (z16) {
                    c28655q.m87150e0(1586491457);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c8691e, c28655q, (i16 >> 3) & 14), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q;
                    c28655q.m87150e0(1586664747);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                TextResource textResource4 = c8691e;
                z15 = z16;
                textResource2 = textResource4;
            } else {
                c28655q.m87138X();
                enumC36872a1 = enumC36872a0;
                textResource2 = c8691e;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(question, textResource2, z15, enumC36872a1, i13, i14, 10);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) != 0) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                if (enumC36872a0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC36872a0.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
            }
            i15 |= i17;
        }
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 2) != 0) {
                    c8691e = new TextResource.C8691e("");
                    i15 &= -113;
                }
                if (i19 != 0) {
                    z13 = false;
                }
                if ((i14 & 8) != 0) {
                    enumC36872a1 = (EnumC36872a0) c28655q.m87161k(f157896a);
                    i15 &= -7169;
                } else {
                    enumC36872a1 = enumC36872a0;
                }
            } else {
                if ((i14 & 2) != 0) {
                    c8691e = new TextResource.C8691e("");
                    i15 &= -113;
                }
                if (i19 != 0) {
                    z13 = false;
                }
                if ((i14 & 8) != 0) {
                    enumC36872a1 = (EnumC36872a0) c28655q.m87161k(f157896a);
                    i15 &= -7169;
                } else {
                    enumC36872a1 = enumC36872a0;
                }
            }
            i16 = i15;
            z16 = z13;
            c28655q.m87175r();
            float verticalPadding3 = enumC36872a1.getVerticalPadding();
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t3, 0.0f, verticalPadding3, 1);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
            String strM21274h3 = AbstractC8693b.m21274h(question, c28655q, i16 & 14);
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
            c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h3, modifierM3398t3, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 48, 0, 196600);
            if (z16) {
                c28655q.m87150e0(1586491457);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c8691e, c28655q, (i16 >> 3) & 14), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q;
                c28655q.m87150e0(1586664747);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            TextResource textResource5 = c8691e;
            z15 = z16;
            textResource2 = textResource5;
        } else {
            c28655q.m87138X();
            enumC36872a1 = enumC36872a0;
            textResource2 = c8691e;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(question, textResource2, z15, enumC36872a1, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m118521d(TextResource textResource, TextResource textResource2, boolean z4, EnumC36872a0 enumC36872a0, int i13, int i14, Composer composer, int i15) {
        m118520c(textResource, textResource2, z4, enumC36872a0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final EnumC36872a0 m118522e() {
        return EnumC36872a0.DEFAULT;
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC28669t1 m118523f() {
        return f157896a;
    }
}
