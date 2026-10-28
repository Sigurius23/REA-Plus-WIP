package xw1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import qz0.AbstractC30784c;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import uw1.C35315h;
import wb3.AbstractC37056f;
import wo1.C37450h;
import wr0.C37526f;
import wr0.C37550r;
import x81.C38072d;
import xo1.C38492a;

/* JADX INFO: renamed from: xw1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Luw1/h;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Luw1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38682f {

    /* JADX INFO: renamed from: xw1.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f166486w = new a();

        /* JADX INFO: renamed from: a */
        public final long m124085a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m124085a((C39336i) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:103:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:105:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x019d  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x027f  */
    /* JADX WARN: Code duplicated, block: B:71:0x028f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0291  */
    /* JADX WARN: Code duplicated, block: B:76:0x029a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0321  */
    /* JADX WARN: Code duplicated, block: B:81:0x0326  */
    /* JADX WARN: Code duplicated, block: B:90:0x0374  */
    /* JADX WARN: Code duplicated, block: B:92:0x0377  */
    /* JADX WARN: Code duplicated, block: B:93:0x0379  */
    /* JADX WARN: Code duplicated, block: B:97:0x0383  */
    /* JADX INFO: renamed from: e */
    public static final void m124080e(Modifier modifier, C35315h viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        int iHashCode;
        int i16;
        C28676v0 c28676v0;
        boolean z4;
        AbstractC30784c.a aVar;
        Object objM87133R;
        int i17;
        boolean z13;
        Object objM87133R2;
        int i18;
        int i19;
        EnumC27272p enumC27272p;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R3;
        TextResource textResourceM112161f;
        Object objM87133R4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1213990543);
        int i24 = i14 & 1;
        if (i24 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier2 = c2314t;
            }
            boolean zM65745e = AbstractC22676k.m65745e(viewState.getValidationError(), AbstractC8693b.m21267a());
            boolean z17 = !zM65745e;
            float f13 = 4;
            float f14 = 3 * f13;
            Modifier modifierM118994r = AbstractC37056f.m118994r(modifier2, AbstractC33253j.m105489e(f14));
            C33252i c33252iM105489e = AbstractC33253j.m105489e(12);
            C17909s c17909s = AbstractC17911t.f69612b;
            C17919x c17919x = new C17919x(AbstractC17918w0.m51515c(16777215));
            C38072d c38072d = C38072d.f163053a;
            int i25 = C38072d.f163054b;
            float f15 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f15, AbstractC15751g.m44456i(1, modifierM118994r, C17909s.m51486d(c17909s, AbstractC37056f.m118959K(c17919x, new C17919x(c38072d.m121949b(c28655q, i25).getWhite5())), 0L, 0L, 14), c33252iM105489e));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier3 = modifier2;
            } else {
                modifier3 = modifier2;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                i16 = i15;
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                TextResource textResourceM112163h = viewState.getTextFieldLabel();
                C2886a c2886aM8432m = c38072d.m121952e(c28655q, i25).getFormLabel();
                C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f14);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getCurrentEmailText());
                c28676v0 = C28635l.f115821a;
                if (zM65745e) {
                    z4 = false;
                    c28655q.m87150e0(-2118996127);
                    c28655q.m87173q(false);
                    aVar = null;
                } else {
                    c28655q.m87150e0(-2119223109);
                    int iM46223a = c38072d.m121951d().getTinyIcons().getAttention();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = a.f166486w;
                        c28655q.m87172p0(objM87133R4);
                    }
                    aVar = new AbstractC30784c.a(iM46223a, new C39174f(f13 * f13), p745y81.Function1.m125323a((Function1) objM87133R4), null, 8, null);
                    z4 = false;
                    c28655q.m87173q(false);
                }
                TextResource textResourceM112164i = viewState.getValidationError();
                long accentNegativeTrend = c38072d.m121949b(c28655q, i25).getAccentNegativeTrend();
                C15043i8 c15043i8 = C15043i8.f56313a;
                C15197y1 c15197y1M43130h = C15043i8.m43130h(c38072d.m121949b(c28655q, i25).getBrandWhite(), 0L, c38072d.m121949b(c28655q, i25).getBlack30(), c38072d.m121949b(c28655q, i25).getBrandWhite(), c38072d.m121949b(c28655q, i25).getBrandWhite(), c38072d.m121949b(c28655q, i25).getWhite50(), c38072d.m121949b(c28655q, i25).getWhite10(), 0L, c38072d.m121949b(c28655q, i25).getAccentNegativeTrend(), 0L, 0L, 0L, 0L, c28655q, 2096770);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C38492a(15);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                i17 = i16 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C37450h(onViewEvent, 16);
                    c28655q.m87172p0(objM87133R2);
                }
                i18 = TextResource.$stable;
                int i26 = (i18 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i18 << 9);
                i19 = C2886a.f11498d;
                AbstractC30792k.m94678l(null, textResourceM21278l, null, textResourceM112163h, c2886aM8432m, null, null, aVar, textResourceM112164i, z17, z17, null, accentNegativeTrend, false, 6, 0, 0, false, null, false, false, 0, false, null, null, c33252iM105489e2, c15197y1M43130h, null, null, null, interfaceC4339a, (Function1) objM87133R2, c28655q, i26 | (i19 << 12) | (AbstractC30784c.a.f126785f << 21) | (i18 << 24), 24576, 0, 6, 973056069, 0);
                c28655q = c28655q;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C27256h c27256hM112159c = viewState.getCardButton();
                if (viewState.getSubmitEnabled()) {
                    enumC27272p = EnumC27272p.LIGHT_BACKGROUND;
                } else {
                    enumC27272p = EnumC27272p.DEFAULT;
                }
                C27256h c27256hM82144b = C27256h.m82144b(c27256hM112159c, null, null, null, null, null, null, enumC27272p, null, null, null, null, null, null, false, false, null, viewState.getSubmitEnabled(), false, null, null, null, null, null, null, null, 33488831, null);
                if ((i16 & 112) != 32 || ((i16 & 64) != 0 && c28655q.m87157i(viewState))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i17 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R3 = c28655q.m87133R();
                if (z16 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C37550r(13, viewState, onViewEvent);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27249e.m82121d(modifierM3409f, c27256hM82144b, null, (InterfaceC4339a) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6, 4);
                textResourceM112161f = viewState.getDisclaimer();
                if (!AbstractC8693b.m21270d(textResourceM112161f)) {
                    textResourceM112161f = null;
                }
                if (textResourceM112161f == null) {
                    c28655q.m87150e0(-2117431775);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2117431774);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM112161f, c28655q, i18), null, c38072d.m121949b(c28655q, i25).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getB2(), null, c28655q, 0, i19 << 18, 196090);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier2 = modifier3;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9111N, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            i16 = i15;
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            TextResource textResourceM112163h2 = viewState.getTextFieldLabel();
            C2886a c2886aM8432m2 = c38072d.m121952e(c28655q, i25).getFormLabel();
            C33252i c33252iM105489e3 = AbstractC33253j.m105489e(f14);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getCurrentEmailText());
            c28676v0 = C28635l.f115821a;
            if (zM65745e) {
                c28655q.m87150e0(-2119223109);
                int iM46223a2 = c38072d.m121951d().getTinyIcons().getAttention();
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = a.f166486w;
                    c28655q.m87172p0(objM87133R4);
                }
                aVar = new AbstractC30784c.a(iM46223a2, new C39174f(f13 * f13), p745y81.Function1.m125323a((Function1) objM87133R4), null, 8, null);
                z4 = false;
                c28655q.m87173q(false);
            } else {
                z4 = false;
                c28655q.m87150e0(-2118996127);
                c28655q.m87173q(false);
                aVar = null;
            }
            TextResource textResourceM112164i2 = viewState.getValidationError();
            long accentNegativeTrend2 = c38072d.m121949b(c28655q, i25).getAccentNegativeTrend();
            C15043i8 c15043i9 = C15043i8.f56313a;
            C15197y1 c15197y1M43130h2 = C15043i8.m43130h(c38072d.m121949b(c28655q, i25).getBrandWhite(), 0L, c38072d.m121949b(c28655q, i25).getBlack30(), c38072d.m121949b(c28655q, i25).getBrandWhite(), c38072d.m121949b(c28655q, i25).getBrandWhite(), c38072d.m121949b(c28655q, i25).getWhite50(), c38072d.m121949b(c28655q, i25).getWhite10(), 0L, c38072d.m121949b(c28655q, i25).getAccentNegativeTrend(), 0L, 0L, 0L, 0L, c28655q, 2096770);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C38492a(15);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            i17 = i16 & 896;
            if (i17 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C37450h(onViewEvent, 16);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C37450h(onViewEvent, 16);
                c28655q.m87172p0(objM87133R2);
            }
            i18 = TextResource.$stable;
            int i27 = (i18 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i18 << 9);
            i19 = C2886a.f11498d;
            AbstractC30792k.m94678l(null, textResourceM21278l2, null, textResourceM112163h2, c2886aM8432m2, null, null, aVar, textResourceM112164i2, z17, z17, null, accentNegativeTrend2, false, 6, 0, 0, false, null, false, false, 0, false, null, null, c33252iM105489e3, c15197y1M43130h2, null, null, null, interfaceC4339a2, (Function1) objM87133R2, c28655q, i27 | (i19 << 12) | (AbstractC30784c.a.f126785f << 21) | (i18 << 24), 24576, 0, 6, 973056069, 0);
            c28655q = c28655q;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C27256h c27256hM112159c2 = viewState.getCardButton();
            if (viewState.getSubmitEnabled()) {
                enumC27272p = EnumC27272p.LIGHT_BACKGROUND;
            } else {
                enumC27272p = EnumC27272p.DEFAULT;
            }
            C27256h c27256hM82144b2 = C27256h.m82144b(c27256hM112159c2, null, null, null, null, null, null, enumC27272p, null, null, null, null, null, null, false, false, null, viewState.getSubmitEnabled(), false, null, null, null, null, null, null, null, 33488831, null);
            if ((i16 & 112) != 32) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (i17 == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | z14;
            objM87133R3 = c28655q.m87133R();
            if (z16) {
                objM87133R3 = new C37550r(13, viewState, onViewEvent);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C37550r(13, viewState, onViewEvent);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27249e.m82121d(modifierM3409f2, c27256hM82144b2, null, (InterfaceC4339a) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6, 4);
            textResourceM112161f = viewState.getDisclaimer();
            if (!AbstractC8693b.m21270d(textResourceM112161f)) {
                textResourceM112161f = null;
            }
            if (textResourceM112161f == null) {
                c28655q.m87150e0(-2117431775);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2117431774);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM112161f, c28655q, i18), null, c38072d.m121949b(c28655q, i25).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getB2(), null, c28655q, 0, i19 << 18, 196090);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 17, modifier2, viewState, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m124081f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m124082g(Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC38681e.b(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m124083h(C35315h c35315h, Function1 function1) {
        if (c35315h.getSubmitEnabled()) {
            function1.invoke(new AbstractC38681e.a(c35315h.getCurrentEmailText()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m124084i(Modifier modifier, C35315h c35315h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m124080e(modifier, c35315h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
