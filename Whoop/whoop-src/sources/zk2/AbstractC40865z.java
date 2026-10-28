package zk2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2646w1;
import b91.AbstractC2890e;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import kk2.AbstractC22550c;
import kk2.AbstractC22551d;
import l83.C23454a0;
import l83.C23465k;
import n83.C26460c;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import tk2.C33896n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: zk2.z */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ac\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "durationLeading", "durationTrailing", "Landroidx/compose/ui/Modifier;", "modifier", "durationTargetText", "Ltk2/n;", "durationProgressBar", "", "isPaused", "Lkotlin/Function0;", "Ll83/a0;", "onCloseClick", "c", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ltk2/n;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "ToolbarIconTouchArea", "b", "ToolbarPauseIconSize", "ToolbarTitleToDurationSpacing", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40865z {

    /* JADX INFO: renamed from: a */
    private static final float f176108a;

    /* JADX INFO: renamed from: b */
    private static final float f176109b;

    /* JADX INFO: renamed from: c */
    private static final float f176110c = ((float) 0.5d) * 8;

    static {
        float f13 = 4;
        f176108a = 12 * f13;
        f176109b = f13 * f13;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:104:0x012c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0130  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:110:0x013b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0148  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:126:0x0259  */
    /* JADX WARN: Code duplicated, block: B:127:0x025b  */
    /* JADX WARN: Code duplicated, block: B:129:0x025e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0295  */
    /* JADX WARN: Code duplicated, block: B:133:0x0299  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:141:0x0362  */
    /* JADX WARN: Code duplicated, block: B:142:0x0366  */
    /* JADX WARN: Code duplicated, block: B:145:0x0373  */
    /* JADX WARN: Code duplicated, block: B:147:0x0381  */
    /* JADX WARN: Code duplicated, block: B:150:0x0389  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:154:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:155:0x0401  */
    /* JADX WARN: Code duplicated, block: B:158:0x040e  */
    /* JADX WARN: Code duplicated, block: B:160:0x041c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0483  */
    /* JADX WARN: Code duplicated, block: B:164:0x048d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0504  */
    /* JADX WARN: Code duplicated, block: B:169:0x0512  */
    /* JADX WARN: Code duplicated, block: B:171:0x0546  */
    /* JADX WARN: Code duplicated, block: B:174:0x0558  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0110  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    /* JADX INFO: renamed from: c */
    public static final void m132455c(TextResource title, TextResource durationLeading, TextResource durationTrailing, Modifier modifier, TextResource textResource, C33896n c33896n, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean zM87157i;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean z13;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z14;
        TextResource textResource2;
        C28655q c28655q;
        TextResource textResource3;
        C33896n c33896n2;
        InterfaceC4339a interfaceC4339a2;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        TextResource textResource4;
        InterfaceC4339a interfaceC4339a3;
        C38072d c38072d;
        float f13;
        int iHashCode;
        boolean z15;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResource5;
        int i29;
        boolean z16;
        int iHashCode2;
        EnumC39333f enumC39333f;
        int i34;
        C33896n c33896n3;
        C28655q c28655q2;
        int iHashCode3;
        float f14;
        int iHashCode4;
        C26460c c26460cM119000x;
        float f15;
        C33896n c33896n4;
        Object objM87133R;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(durationLeading, "durationLeading");
        AbstractC22676k.m65750j(durationTrailing, "durationTrailing");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1579719728);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q3.m87153g(title) : c28655q3.m87157i(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q3.m87153g(durationLeading) : c28655q3.m87157i(durationLeading) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q3.m87153g(durationTrailing) : c28655q3.m87157i(durationTrailing) ? 256 : 128;
        }
        int i35 = i14 & 8;
        if (i35 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q3.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q3.m87153g(textResource);
                } else {
                    zM87157i = c28655q3.m87157i(textResource);
                }
                if (zM87157i) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q3.m87153g(c33896n)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    z13 = z4;
                } else {
                    z13 = z4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q3.m87155h(z13)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                i28 = i15;
                if ((i15 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q3.m87135U(i28 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i35 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        textResource4 = null;
                    } else {
                        textResource4 = textResource;
                    }
                    C33896n c33896n5 = i18 == 0 ? c33896n : null;
                    if (i24 != 0) {
                        z13 = false;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C40857r(1);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHITE;
                    InterfaceC4339a interfaceC4339a4 = interfaceC4339a3;
                    long jMo134584toComposableColorWaAFU9c = enumC39333f2.mo134584toComposableColorWaAFU9c(c28655q3, 6);
                    c38072d = C38072d.f163053a;
                    C39274g c39274g = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                    float f16 = (float) 1.5d;
                    Modifier modifier5 = modifier4;
                    f13 = 8;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), 4 * f16, 0.0f, 2), 0.0f, f16 * f13, 0.0f, 0.0f, 13);
                    C22961h c22961h = AbstractC22977m.f90656g;
                    C2306l c2306l = C2299e.f9108K;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q3, 54);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
                    InterfaceC0221l.f734a.getClass();
                    z15 = z13;
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i2, c22994r1M66759a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        textResource5 = textResource4;
                    } else {
                        textResource5 = textResource4;
                        if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                        float f17 = f176108a;
                        Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3419p(f17, c2314t), "toolbar_left_icon_tag");
                        C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, c39274g.getIcon(), enumC39333f2, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                        TextResource textResourceM125133a = c39274g.getContentDescription();
                        i29 = TextResource.$stable;
                        TextResource textResource6 = textResource5;
                        AbstractC27242b1.m82092d(c27270o, AbstractC8693b.m21274h(textResourceM125133a, c28655q3, i29), modifierM44101d, null, interfaceC4339a4, c28655q3, C27270o.f109105k | ((i28 >> 9) & 57344), 8);
                        if (1.0f > 0.0d) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (!z16) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3396r = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), 1 * f13, 0.0f, 2);
                        C2305k c2305k = C2299e.f9111N;
                        C22961h c22961h2 = AbstractC22977m.f90654e;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h2, c2305k, c28655q3, 54);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                        String strM21274h = AbstractC8693b.m21274h(title, c28655q3, i29 | (i28 & 14));
                        enumC39333f = EnumC39333f.WHITE_70;
                        long jMo134584toComposableColorWaAFU9c2 = enumC39333f.mo134584toComposableColorWaAFU9c(c28655q3, 6);
                        i34 = C38072d.f163054b;
                        C2886a c2886aM8420a = c38072d.m121952e(c28655q3, i34).getB1();
                        C36775k c36775k = new C36775k(3);
                        int i36 = C2886a.f11498d;
                        c33896n3 = c33896n5;
                        AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c2, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q3, 0, i36 << 18, 196090);
                        c28655q2 = c28655q3;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f176110c, c2314t));
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h2, c2306l, c28655q2, 54);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                        if (z15) {
                            c28655q2.m87150e0(-1269639259);
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC22550c.f88658c, c28655q2, 6), AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC22551d.f88688b0), c28655q2, TextResource.C8688b.f25889c), AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176109b, c2314t), "track_session_toolbar_pause_icon"), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0, 0);
                            c28655q2 = c28655q2;
                            f14 = f13;
                            AbstractC18489d0.m53381v((float) 0.75d, f14, c2314t, c28655q2, false);
                        } else {
                            f14 = f13;
                            c28655q2.m87150e0(-1269040556);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3399u = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90538x);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 48);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3399u);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                        Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t, "track_session_toolbar_duration");
                        c28655q2.m87150e0(1564770982);
                        c26460cM119000x = AbstractC37056f.m119000x();
                        c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(durationLeading, c28655q2, i29 | ((i28 >> 3) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN3().getStyle(), jMo134584toComposableColorWaAFU9c, c28655q2, 0)));
                        textResource2 = durationTrailing;
                        c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource2, c28655q2, i29 | ((i28 >> 6) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN5().getStyle(), jMo134584toComposableColorWaAFU9c, c28655q2, 0)));
                        textResource3 = textResource6;
                        if (textResource3 == null) {
                            c28655q2.m87150e0(-1798172932);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-1798172931);
                            c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource3, c28655q2, i29), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN8().getStyle(), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0)));
                            c28655q2.m87173q(false);
                        }
                        C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                        c28655q2.m87173q(false);
                        C28655q c28655q4 = c28655q2;
                        f15 = f14;
                        AbstractC30795n.m94704e(c26460cM118988k, modifierM44101d2, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, null, c38072d.m121952e(c28655q2, i34).getN3(), c28655q4, 0, (i36 << 21) | 3072, 122360);
                        c28655q = c28655q4;
                        if (c33896n3 == null) {
                            c28655q.m87150e0(1264175865);
                            c28655q.m87173q(false);
                            c33896n4 = c33896n3;
                        } else {
                            c28655q.m87150e0(1264175866);
                            c33896n4 = c33896n3;
                            AbstractC40848i.m132382e(c33896n4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13), c28655q, 48, 0);
                            c28655q.m87173q(false);
                        }
                        AbstractC25012a.m73392y(c28655q, true, true, true);
                        AbstractC25012a.m73389v(c2314t, f17, c28655q, true);
                        c33896n2 = c33896n4;
                        modifier3 = modifier5;
                        z13 = z15;
                        interfaceC4339a2 = interfaceC4339a4;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
                    float f18 = f176108a;
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(f18, c2314t), "toolbar_left_icon_tag");
                    C27270o c27270o2 = new C27270o(AbstractC27274q.a.f109136f, c39274g.getIcon(), enumC39333f2, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                    TextResource textResourceM125133a2 = c39274g.getContentDescription();
                    i29 = TextResource.$stable;
                    TextResource textResource7 = textResource5;
                    AbstractC27242b1.m82092d(c27270o2, AbstractC8693b.m21274h(textResourceM125133a2, c28655q3, i29), modifierM44101d3, null, interfaceC4339a4, c28655q3, C27270o.f109105k | ((i28 >> 9) & 57344), 8);
                    if (1.0f > 0.0d) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (!z16) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), 1 * f13, 0.0f, 2);
                    C2305k c2305k2 = C2299e.f9111N;
                    C22961h c22961h3 = AbstractC22977m.f90654e;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22961h3, c2305k2, c28655q3, 54);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3396r2);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m5);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N5);
                    String strM21274h2 = AbstractC8693b.m21274h(title, c28655q3, i29 | (i28 & 14));
                    enumC39333f = EnumC39333f.WHITE_70;
                    long jMo134584toComposableColorWaAFU9c3 = enumC39333f.mo134584toComposableColorWaAFU9c(c28655q3, 6);
                    i34 = C38072d.f163054b;
                    C2886a c2886aM8420a2 = c38072d.m121952e(c28655q3, i34).getB1();
                    C36775k c36775k2 = new C36775k(3);
                    int i37 = C2886a.f11498d;
                    c33896n3 = c33896n5;
                    AbstractC30795n.m94707h(strM21274h2, null, jMo134584toComposableColorWaAFU9c3, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q3, 0, i37 << 18, 196090);
                    c28655q2 = c28655q3;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f176110c, c2314t));
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22961h3, c2306l, c28655q2, 54);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m6);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N6);
                    if (z15) {
                        c28655q2.m87150e0(-1269639259);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC22550c.f88658c, c28655q2, 6), AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC22551d.f88688b0), c28655q2, TextResource.C8688b.f25889c), AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176109b, c2314t), "track_session_toolbar_pause_icon"), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0, 0);
                        c28655q2 = c28655q2;
                        f14 = f13;
                        AbstractC18489d0.m53381v((float) 0.75d, f14, c2314t, c28655q2, false);
                    } else {
                        f14 = f13;
                        c28655q2.m87150e0(-1269040556);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3399u2 = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90538x);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q2, 48);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3399u2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m7);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N7);
                    Modifier modifierM44101d4 = AbstractC15676d.m44101d(c2314t, "track_session_toolbar_duration");
                    c28655q2.m87150e0(1564770982);
                    c26460cM119000x = AbstractC37056f.m119000x();
                    c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(durationLeading, c28655q2, i29 | ((i28 >> 3) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN3().getStyle(), jMo134584toComposableColorWaAFU9c, c28655q2, 0)));
                    textResource2 = durationTrailing;
                    c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource2, c28655q2, i29 | ((i28 >> 6) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN5().getStyle(), jMo134584toComposableColorWaAFU9c, c28655q2, 0)));
                    textResource3 = textResource7;
                    if (textResource3 == null) {
                        c28655q2.m87150e0(-1798172932);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1798172931);
                        c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource3, c28655q2, i29), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN8().getStyle(), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0)));
                        c28655q2.m87173q(false);
                    }
                    C26460c c26460cM118988k2 = AbstractC37056f.m118988k(c26460cM119000x);
                    c28655q2.m87173q(false);
                    C28655q c28655q5 = c28655q2;
                    f15 = f14;
                    AbstractC30795n.m94704e(c26460cM118988k2, modifierM44101d4, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, null, c38072d.m121952e(c28655q2, i34).getN3(), c28655q5, 0, (i37 << 21) | 3072, 122360);
                    c28655q = c28655q5;
                    if (c33896n3 == null) {
                        c28655q.m87150e0(1264175865);
                        c28655q.m87173q(false);
                        c33896n4 = c33896n3;
                    } else {
                        c28655q.m87150e0(1264175866);
                        c33896n4 = c33896n3;
                        AbstractC40848i.m132382e(c33896n4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13), c28655q, 48, 0);
                        c28655q.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    AbstractC25012a.m73389v(c2314t, f18, c28655q, true);
                    c33896n2 = c33896n4;
                    modifier3 = modifier5;
                    z13 = z15;
                    interfaceC4339a2 = interfaceC4339a4;
                } else {
                    textResource2 = durationTrailing;
                    c28655q = c28655q3;
                    c28655q.m87138X();
                    textResource3 = textResource;
                    c33896n2 = c33896n;
                    interfaceC4339a2 = interfaceC4339a;
                    modifier3 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2646w1(title, durationLeading, textResource2, modifier3, textResource3, c33896n2, z13, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q3.m87157i(interfaceC4339a)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            i28 = i15;
            if ((i15 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q3.m87135U(i28 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i35 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    textResource4 = null;
                } else {
                    textResource4 = textResource;
                }
                if (i18 == 0) {
                }
                if (i24 != 0) {
                    z13 = false;
                }
                if (i26 != 0) {
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C40857r(1);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                EnumC39333f enumC39333f3 = EnumC39333f.BRAND_WHITE;
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
                long jMo134584toComposableColorWaAFU9c4 = enumC39333f3.mo134584toComposableColorWaAFU9c(c28655q3, 6);
                c38072d = C38072d.f163053a;
                C39274g c39274g2 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                float f19 = (float) 1.5d;
                Modifier modifier6 = modifier4;
                f13 = 8;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), 4 * f19, 0.0f, 2), 0.0f, f19 * f13, 0.0f, 0.0f, 13);
                C22961h c22961h4 = AbstractC22977m.f90656g;
                C2306l c2306l2 = C2299e.f9108K;
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22961h4, c2306l2, c28655q3, 54);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM3398t2);
                InterfaceC0221l.f734a.getClass();
                z15 = z13;
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i6, c22994r1M66759a4);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    textResource5 = textResource4;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N8);
                    float f110 = f176108a;
                    Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(f110, c2314t), "toolbar_left_icon_tag");
                    C27270o c27270o3 = new C27270o(AbstractC27274q.a.f109136f, c39274g2.getIcon(), enumC39333f3, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                    TextResource textResourceM125133a3 = c39274g2.getContentDescription();
                    i29 = TextResource.$stable;
                    TextResource textResource8 = textResource5;
                    AbstractC27242b1.m82092d(c27270o3, AbstractC8693b.m21274h(textResourceM125133a3, c28655q3, i29), modifierM44101d5, null, interfaceC4339a5, c28655q3, C27270o.f109105k | ((i28 >> 9) & 57344), 8);
                    if (1.0f > 0.0d) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (!z16) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), 1 * f13, 0.0f, 2);
                    C2305k c2305k3 = C2299e.f9111N;
                    C22961h c22961h5 = AbstractC22977m.f90654e;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22961h5, c2305k3, c28655q3, 54);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifierM3396r3);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i6, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m9);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N9);
                    String strM21274h3 = AbstractC8693b.m21274h(title, c28655q3, i29 | (i28 & 14));
                    enumC39333f = EnumC39333f.WHITE_70;
                    long jMo134584toComposableColorWaAFU9c5 = enumC39333f.mo134584toComposableColorWaAFU9c(c28655q3, 6);
                    i34 = C38072d.f163054b;
                    C2886a c2886aM8420a3 = c38072d.m121952e(c28655q3, i34).getB1();
                    C36775k c36775k3 = new C36775k(3);
                    int i38 = C2886a.f11498d;
                    c33896n3 = c33896n5;
                    AbstractC30795n.m94707h(strM21274h3, null, jMo134584toComposableColorWaAFU9c5, 0L, null, null, null, 0L, null, c36775k3, 0L, 0, false, 0, 0, null, c2886aM8420a3, null, c28655q3, 0, i38 << 18, 196090);
                    c28655q2 = c28655q3;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f176110c, c2314t));
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22961h5, c2306l2, c28655q2, 54);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m10);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N10);
                    if (z15) {
                        c28655q2.m87150e0(-1269639259);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC22550c.f88658c, c28655q2, 6), AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC22551d.f88688b0), c28655q2, TextResource.C8688b.f25889c), AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176109b, c2314t), "track_session_toolbar_pause_icon"), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0, 0);
                        c28655q2 = c28655q2;
                        f14 = f13;
                        AbstractC18489d0.m53381v((float) 0.75d, f14, c2314t, c28655q2, false);
                    } else {
                        f14 = f13;
                        c28655q2.m87150e0(-1269040556);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3399u3 = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90538x);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k3, c28655q2, 48);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3399u3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m11);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N11);
                    Modifier modifierM44101d6 = AbstractC15676d.m44101d(c2314t, "track_session_toolbar_duration");
                    c28655q2.m87150e0(1564770982);
                    c26460cM119000x = AbstractC37056f.m119000x();
                    c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(durationLeading, c28655q2, i29 | ((i28 >> 3) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN3().getStyle(), jMo134584toComposableColorWaAFU9c4, c28655q2, 0)));
                    textResource2 = durationTrailing;
                    c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource2, c28655q2, i29 | ((i28 >> 6) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN5().getStyle(), jMo134584toComposableColorWaAFU9c4, c28655q2, 0)));
                    textResource3 = textResource8;
                    if (textResource3 == null) {
                        c28655q2.m87150e0(-1798172932);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1798172931);
                        c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource3, c28655q2, i29), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN8().getStyle(), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0)));
                        c28655q2.m87173q(false);
                    }
                    C26460c c26460cM118988k3 = AbstractC37056f.m118988k(c26460cM119000x);
                    c28655q2.m87173q(false);
                    C28655q c28655q6 = c28655q2;
                    f15 = f14;
                    AbstractC30795n.m94704e(c26460cM118988k3, modifierM44101d6, jMo134584toComposableColorWaAFU9c4, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, null, c38072d.m121952e(c28655q2, i34).getN3(), c28655q6, 0, (i38 << 21) | 3072, 122360);
                    c28655q = c28655q6;
                    if (c33896n3 == null) {
                        c28655q.m87150e0(1264175865);
                        c28655q.m87173q(false);
                        c33896n4 = c33896n3;
                    } else {
                        c28655q.m87150e0(1264175866);
                        c33896n4 = c33896n3;
                        AbstractC40848i.m132382e(c33896n4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13), c28655q, 48, 0);
                        c28655q.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    AbstractC25012a.m73389v(c2314t, f110, c28655q, true);
                    c33896n2 = c33896n4;
                    modifier3 = modifier6;
                    z13 = z15;
                    interfaceC4339a2 = interfaceC4339a5;
                } else {
                    textResource5 = textResource4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N8);
                float f111 = f176108a;
                Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(f111, c2314t), "toolbar_left_icon_tag");
                C27270o c27270o4 = new C27270o(AbstractC27274q.a.f109136f, c39274g2.getIcon(), enumC39333f3, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                TextResource textResourceM125133a4 = c39274g2.getContentDescription();
                i29 = TextResource.$stable;
                TextResource textResource9 = textResource5;
                AbstractC27242b1.m82092d(c27270o4, AbstractC8693b.m21274h(textResourceM125133a4, c28655q3, i29), modifierM44101d7, null, interfaceC4339a5, c28655q3, C27270o.f109105k | ((i28 >> 9) & 57344), 8);
                if (1.0f > 0.0d) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!z16) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), 1 * f13, 0.0f, 2);
                C2305k c2305k4 = C2299e.f9111N;
                C22961h c22961h6 = AbstractC22977m.f90654e;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22961h6, c2305k4, c28655q3, 54);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q3.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q3, modifierM3396r4);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i6, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m12);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N12);
                String strM21274h4 = AbstractC8693b.m21274h(title, c28655q3, i29 | (i28 & 14));
                enumC39333f = EnumC39333f.WHITE_70;
                long jMo134584toComposableColorWaAFU9c6 = enumC39333f.mo134584toComposableColorWaAFU9c(c28655q3, 6);
                i34 = C38072d.f163054b;
                C2886a c2886aM8420a4 = c38072d.m121952e(c28655q3, i34).getB1();
                C36775k c36775k4 = new C36775k(3);
                int i39 = C2886a.f11498d;
                c33896n3 = c33896n5;
                AbstractC30795n.m94707h(strM21274h4, null, jMo134584toComposableColorWaAFU9c6, 0L, null, null, null, 0L, null, c36775k4, 0L, 0, false, 0, 0, null, c2886aM8420a4, null, c28655q3, 0, i39 << 18, 196090);
                c28655q2 = c28655q3;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f176110c, c2314t));
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22961h6, c2306l2, c28655q2, 54);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m13);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N13);
                if (z15) {
                    c28655q2.m87150e0(-1269639259);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC22550c.f88658c, c28655q2, 6), AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC22551d.f88688b0), c28655q2, TextResource.C8688b.f25889c), AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176109b, c2314t), "track_session_toolbar_pause_icon"), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0, 0);
                    c28655q2 = c28655q2;
                    f14 = f13;
                    AbstractC18489d0.m53381v((float) 0.75d, f14, c2314t, c28655q2, false);
                } else {
                    f14 = f13;
                    c28655q2.m87150e0(-1269040556);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3399u4 = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90538x);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k4, c28655q2, 48);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3399u4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m14);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N14);
                Modifier modifierM44101d8 = AbstractC15676d.m44101d(c2314t, "track_session_toolbar_duration");
                c28655q2.m87150e0(1564770982);
                c26460cM119000x = AbstractC37056f.m119000x();
                c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(durationLeading, c28655q2, i29 | ((i28 >> 3) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN3().getStyle(), jMo134584toComposableColorWaAFU9c4, c28655q2, 0)));
                textResource2 = durationTrailing;
                c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource2, c28655q2, i29 | ((i28 >> 6) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN5().getStyle(), jMo134584toComposableColorWaAFU9c4, c28655q2, 0)));
                textResource3 = textResource9;
                if (textResource3 == null) {
                    c28655q2.m87150e0(-1798172932);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1798172931);
                    c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource3, c28655q2, i29), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN8().getStyle(), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0)));
                    c28655q2.m87173q(false);
                }
                C26460c c26460cM118988k4 = AbstractC37056f.m118988k(c26460cM119000x);
                c28655q2.m87173q(false);
                C28655q c28655q7 = c28655q2;
                f15 = f14;
                AbstractC30795n.m94704e(c26460cM118988k4, modifierM44101d8, jMo134584toComposableColorWaAFU9c4, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, null, c38072d.m121952e(c28655q2, i34).getN3(), c28655q7, 0, (i39 << 21) | 3072, 122360);
                c28655q = c28655q7;
                if (c33896n3 == null) {
                    c28655q.m87150e0(1264175865);
                    c28655q.m87173q(false);
                    c33896n4 = c33896n3;
                } else {
                    c28655q.m87150e0(1264175866);
                    c33896n4 = c33896n3;
                    AbstractC40848i.m132382e(c33896n4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13), c28655q, 48, 0);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q, true, true, true);
                AbstractC25012a.m73389v(c2314t, f111, c28655q, true);
                c33896n2 = c33896n4;
                modifier3 = modifier6;
                z13 = z15;
                interfaceC4339a2 = interfaceC4339a5;
            } else {
                textResource2 = durationTrailing;
                c28655q = c28655q3;
                c28655q.m87138X();
                textResource3 = textResource;
                c33896n2 = c33896n;
                interfaceC4339a2 = interfaceC4339a;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2646w1(title, durationLeading, textResource2, modifier3, textResource3, c33896n2, z13, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        i16 = i14 & 16;
        if (i16 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            if ((32768 & i13) == 0) {
                zM87157i = c28655q3.m87153g(textResource);
            } else {
                zM87157i = c28655q3.m87157i(textResource);
            }
            if (zM87157i) {
                i17 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i17;
        }
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q3.m87153g(c33896n)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q3.m87157i(interfaceC4339a)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            i28 = i15;
            if ((i15 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q3.m87135U(i28 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i35 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    textResource4 = null;
                } else {
                    textResource4 = textResource;
                }
                if (i18 == 0) {
                }
                if (i24 != 0) {
                    z13 = false;
                }
                if (i26 != 0) {
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C40857r(1);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                EnumC39333f enumC39333f4 = EnumC39333f.BRAND_WHITE;
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a3;
                long jMo134584toComposableColorWaAFU9c7 = enumC39333f4.mo134584toComposableColorWaAFU9c(c28655q3, 6);
                c38072d = C38072d.f163053a;
                C39274g c39274g3 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                float f112 = (float) 1.5d;
                Modifier modifier7 = modifier4;
                f13 = 8;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), 4 * f112, 0.0f, 2), 0.0f, f112 * f13, 0.0f, 0.0f, 13);
                C22961h c22961h7 = AbstractC22977m.f90656g;
                C2306l c2306l3 = C2299e.f9108K;
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22961h7, c2306l3, c28655q3, 54);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q3.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q3, modifierM3398t3);
                InterfaceC0221l.f734a.getClass();
                z15 = z13;
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i10, c22994r1M66759a7);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    textResource5 = textResource4;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N15);
                    float f113 = f176108a;
                    Modifier modifierM44101d9 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(f113, c2314t), "toolbar_left_icon_tag");
                    C27270o c27270o5 = new C27270o(AbstractC27274q.a.f109136f, c39274g3.getIcon(), enumC39333f4, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                    TextResource textResourceM125133a5 = c39274g3.getContentDescription();
                    i29 = TextResource.$stable;
                    TextResource textResource10 = textResource5;
                    AbstractC27242b1.m82092d(c27270o5, AbstractC8693b.m21274h(textResourceM125133a5, c28655q3, i29), modifierM44101d9, null, interfaceC4339a6, c28655q3, C27270o.f109105k | ((i28 >> 9) & 57344), 8);
                    if (1.0f > 0.0d) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (!z16) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3396r5 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), 1 * f13, 0.0f, 2);
                    C2305k c2305k5 = C2299e.f9111N;
                    C22961h c22961h8 = AbstractC22977m.f90654e;
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22961h8, c2305k5, c28655q3, 54);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q3.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q3, modifierM3396r5);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i10, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC28653p1M87165m16);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N16);
                    String strM21274h5 = AbstractC8693b.m21274h(title, c28655q3, i29 | (i28 & 14));
                    enumC39333f = EnumC39333f.WHITE_70;
                    long jMo134584toComposableColorWaAFU9c8 = enumC39333f.mo134584toComposableColorWaAFU9c(c28655q3, 6);
                    i34 = C38072d.f163054b;
                    C2886a c2886aM8420a5 = c38072d.m121952e(c28655q3, i34).getB1();
                    C36775k c36775k5 = new C36775k(3);
                    int i310 = C2886a.f11498d;
                    c33896n3 = c33896n5;
                    AbstractC30795n.m94707h(strM21274h5, null, jMo134584toComposableColorWaAFU9c8, 0L, null, null, null, 0L, null, c36775k5, 0L, 0, false, 0, 0, null, c2886aM8420a5, null, c28655q3, 0, i310 << 18, 196090);
                    c28655q2 = c28655q3;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f176110c, c2314t));
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22961h8, c2306l3, c28655q2, 54);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i10, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m17);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N17);
                    if (z15) {
                        c28655q2.m87150e0(-1269639259);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC22550c.f88658c, c28655q2, 6), AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC22551d.f88688b0), c28655q2, TextResource.C8688b.f25889c), AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176109b, c2314t), "track_session_toolbar_pause_icon"), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0, 0);
                        c28655q2 = c28655q2;
                        f14 = f13;
                        AbstractC18489d0.m53381v((float) 0.75d, f14, c2314t, c28655q2, false);
                    } else {
                        f14 = f13;
                        c28655q2.m87150e0(-1269040556);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3399u5 = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90538x);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k5, c28655q2, 48);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3399u5);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m18);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N18);
                    Modifier modifierM44101d10 = AbstractC15676d.m44101d(c2314t, "track_session_toolbar_duration");
                    c28655q2.m87150e0(1564770982);
                    c26460cM119000x = AbstractC37056f.m119000x();
                    c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(durationLeading, c28655q2, i29 | ((i28 >> 3) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN3().getStyle(), jMo134584toComposableColorWaAFU9c7, c28655q2, 0)));
                    textResource2 = durationTrailing;
                    c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource2, c28655q2, i29 | ((i28 >> 6) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN5().getStyle(), jMo134584toComposableColorWaAFU9c7, c28655q2, 0)));
                    textResource3 = textResource10;
                    if (textResource3 == null) {
                        c28655q2.m87150e0(-1798172932);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1798172931);
                        c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource3, c28655q2, i29), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN8().getStyle(), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0)));
                        c28655q2.m87173q(false);
                    }
                    C26460c c26460cM118988k5 = AbstractC37056f.m118988k(c26460cM119000x);
                    c28655q2.m87173q(false);
                    C28655q c28655q8 = c28655q2;
                    f15 = f14;
                    AbstractC30795n.m94704e(c26460cM118988k5, modifierM44101d10, jMo134584toComposableColorWaAFU9c7, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, null, c38072d.m121952e(c28655q2, i34).getN3(), c28655q8, 0, (i310 << 21) | 3072, 122360);
                    c28655q = c28655q8;
                    if (c33896n3 == null) {
                        c28655q.m87150e0(1264175865);
                        c28655q.m87173q(false);
                        c33896n4 = c33896n3;
                    } else {
                        c28655q.m87150e0(1264175866);
                        c33896n4 = c33896n3;
                        AbstractC40848i.m132382e(c33896n4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13), c28655q, 48, 0);
                        c28655q.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    AbstractC25012a.m73389v(c2314t, f113, c28655q, true);
                    c33896n2 = c33896n4;
                    modifier3 = modifier7;
                    z13 = z15;
                    interfaceC4339a2 = interfaceC4339a6;
                } else {
                    textResource5 = textResource4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i13, modifierM118962N15);
                float f114 = f176108a;
                Modifier modifierM44101d11 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(f114, c2314t), "toolbar_left_icon_tag");
                C27270o c27270o6 = new C27270o(AbstractC27274q.a.f109136f, c39274g3.getIcon(), enumC39333f4, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                TextResource textResourceM125133a6 = c39274g3.getContentDescription();
                i29 = TextResource.$stable;
                TextResource textResource11 = textResource5;
                AbstractC27242b1.m82092d(c27270o6, AbstractC8693b.m21274h(textResourceM125133a6, c28655q3, i29), modifierM44101d11, null, interfaceC4339a6, c28655q3, C27270o.f109105k | ((i28 >> 9) & 57344), 8);
                if (1.0f > 0.0d) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!z16) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3396r6 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), 1 * f13, 0.0f, 2);
                C2305k c2305k6 = C2299e.f9111N;
                C22961h c22961h9 = AbstractC22977m.f90654e;
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22961h9, c2305k6, c28655q3, 54);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q3.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q3, modifierM3396r6);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i10, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC28653p1M87165m19);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i13, modifierM118962N19);
                String strM21274h6 = AbstractC8693b.m21274h(title, c28655q3, i29 | (i28 & 14));
                enumC39333f = EnumC39333f.WHITE_70;
                long jMo134584toComposableColorWaAFU9c9 = enumC39333f.mo134584toComposableColorWaAFU9c(c28655q3, 6);
                i34 = C38072d.f163054b;
                C2886a c2886aM8420a6 = c38072d.m121952e(c28655q3, i34).getB1();
                C36775k c36775k6 = new C36775k(3);
                int i311 = C2886a.f11498d;
                c33896n3 = c33896n5;
                AbstractC30795n.m94707h(strM21274h6, null, jMo134584toComposableColorWaAFU9c9, 0L, null, null, null, 0L, null, c36775k6, 0L, 0, false, 0, 0, null, c2886aM8420a6, null, c28655q3, 0, i311 << 18, 196090);
                c28655q2 = c28655q3;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f176110c, c2314t));
                C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22961h9, c2306l3, c28655q2, 54);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, c22994r1M66759a9);
                AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m110);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N110);
                if (z15) {
                    c28655q2.m87150e0(-1269639259);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC22550c.f88658c, c28655q2, 6), AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC22551d.f88688b0), c28655q2, TextResource.C8688b.f25889c), AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176109b, c2314t), "track_session_toolbar_pause_icon"), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0, 0);
                    c28655q2 = c28655q2;
                    f14 = f13;
                    AbstractC18489d0.m53381v((float) 0.75d, f14, c2314t, c28655q2, false);
                } else {
                    f14 = f13;
                    c28655q2.m87150e0(-1269040556);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3399u6 = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90538x);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k6, c28655q2, 48);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierM3399u6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m111);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N111);
                Modifier modifierM44101d12 = AbstractC15676d.m44101d(c2314t, "track_session_toolbar_duration");
                c28655q2.m87150e0(1564770982);
                c26460cM119000x = AbstractC37056f.m119000x();
                c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(durationLeading, c28655q2, i29 | ((i28 >> 3) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN3().getStyle(), jMo134584toComposableColorWaAFU9c7, c28655q2, 0)));
                textResource2 = durationTrailing;
                c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource2, c28655q2, i29 | ((i28 >> 6) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN5().getStyle(), jMo134584toComposableColorWaAFU9c7, c28655q2, 0)));
                textResource3 = textResource11;
                if (textResource3 == null) {
                    c28655q2.m87150e0(-1798172932);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1798172931);
                    c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource3, c28655q2, i29), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN8().getStyle(), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0)));
                    c28655q2.m87173q(false);
                }
                C26460c c26460cM118988k6 = AbstractC37056f.m118988k(c26460cM119000x);
                c28655q2.m87173q(false);
                C28655q c28655q9 = c28655q2;
                f15 = f14;
                AbstractC30795n.m94704e(c26460cM118988k6, modifierM44101d12, jMo134584toComposableColorWaAFU9c7, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, null, c38072d.m121952e(c28655q2, i34).getN3(), c28655q9, 0, (i311 << 21) | 3072, 122360);
                c28655q = c28655q9;
                if (c33896n3 == null) {
                    c28655q.m87150e0(1264175865);
                    c28655q.m87173q(false);
                    c33896n4 = c33896n3;
                } else {
                    c28655q.m87150e0(1264175866);
                    c33896n4 = c33896n3;
                    AbstractC40848i.m132382e(c33896n4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13), c28655q, 48, 0);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q, true, true, true);
                AbstractC25012a.m73389v(c2314t, f114, c28655q, true);
                c33896n2 = c33896n4;
                modifier3 = modifier7;
                z13 = z15;
                interfaceC4339a2 = interfaceC4339a6;
            } else {
                textResource2 = durationTrailing;
                c28655q = c28655q3;
                c28655q.m87138X();
                textResource3 = textResource;
                c33896n2 = c33896n;
                interfaceC4339a2 = interfaceC4339a;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2646w1(title, durationLeading, textResource2, modifier3, textResource3, c33896n2, z13, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
            z13 = z4;
        } else {
            z13 = z4;
            if ((i13 & 1572864) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
        }
        i26 = i14 & 128;
        if (i26 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q3.m87157i(interfaceC4339a)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        i28 = i15;
        if ((i15 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q3.m87135U(i28 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i35 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                textResource4 = null;
            } else {
                textResource4 = textResource;
            }
            if (i18 == 0) {
            }
            if (i24 != 0) {
                z13 = false;
            }
            if (i26 != 0) {
                objM87133R = c28655q3.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40857r(1);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            EnumC39333f enumC39333f5 = EnumC39333f.BRAND_WHITE;
            InterfaceC4339a interfaceC4339a7 = interfaceC4339a3;
            long jMo134584toComposableColorWaAFU9c10 = enumC39333f5.mo134584toComposableColorWaAFU9c(c28655q3, 6);
            c38072d = C38072d.f163053a;
            C39274g c39274g4 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
            float f115 = (float) 1.5d;
            Modifier modifier8 = modifier4;
            f13 = 8;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), 4 * f115, 0.0f, 2), 0.0f, f115 * f13, 0.0f, 0.0f, 13);
            C22961h c22961h10 = AbstractC22977m.f90656g;
            C2306l c2306l4 = C2299e.f9108K;
            C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22961h10, c2306l4, c28655q3, 54);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q3.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q3, modifierM3398t4);
            InterfaceC0221l.f734a.getClass();
            z15 = z13;
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i14, c22994r1M66759a10);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i15, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                textResource5 = textResource4;
                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i16, modifierM118962N112);
                float f116 = f176108a;
                Modifier modifierM44101d13 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(f116, c2314t), "toolbar_left_icon_tag");
                C27270o c27270o7 = new C27270o(AbstractC27274q.a.f109136f, c39274g4.getIcon(), enumC39333f5, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                TextResource textResourceM125133a7 = c39274g4.getContentDescription();
                i29 = TextResource.$stable;
                TextResource textResource12 = textResource5;
                AbstractC27242b1.m82092d(c27270o7, AbstractC8693b.m21274h(textResourceM125133a7, c28655q3, i29), modifierM44101d13, null, interfaceC4339a7, c28655q3, C27270o.f109105k | ((i28 >> 9) & 57344), 8);
                if (1.0f > 0.0d) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!z16) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3396r7 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), 1 * f13, 0.0f, 2);
                C2305k c2305k7 = C2299e.f9111N;
                C22961h c22961h11 = AbstractC22977m.f90654e;
                C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22961h11, c2305k7, c28655q3, 54);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q3.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q3, modifierM3396r7);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i14, c23010xM66775a13);
                AbstractC28683x.m87239G(c28655q3, c0209i15, interfaceC28653p1M87165m113);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i16, modifierM118962N113);
                String strM21274h7 = AbstractC8693b.m21274h(title, c28655q3, i29 | (i28 & 14));
                enumC39333f = EnumC39333f.WHITE_70;
                long jMo134584toComposableColorWaAFU9c11 = enumC39333f.mo134584toComposableColorWaAFU9c(c28655q3, 6);
                i34 = C38072d.f163054b;
                C2886a c2886aM8420a7 = c38072d.m121952e(c28655q3, i34).getB1();
                C36775k c36775k7 = new C36775k(3);
                int i312 = C2886a.f11498d;
                c33896n3 = c33896n5;
                AbstractC30795n.m94707h(strM21274h7, null, jMo134584toComposableColorWaAFU9c11, 0L, null, null, null, 0L, null, c36775k7, 0L, 0, false, 0, 0, null, c2886aM8420a7, null, c28655q3, 0, i312 << 18, 196090);
                c28655q2 = c28655q3;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f176110c, c2314t));
                C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(c22961h11, c2306l4, c28655q2, 54);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, c22994r1M66759a11);
                AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m114);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N114);
                if (z15) {
                    c28655q2.m87150e0(-1269639259);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC22550c.f88658c, c28655q2, 6), AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC22551d.f88688b0), c28655q2, TextResource.C8688b.f25889c), AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176109b, c2314t), "track_session_toolbar_pause_icon"), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0, 0);
                    c28655q2 = c28655q2;
                    f14 = f13;
                    AbstractC18489d0.m53381v((float) 0.75d, f14, c2314t, c28655q2, false);
                } else {
                    f14 = f13;
                    c28655q2.m87150e0(-1269040556);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3399u7 = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90538x);
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k7, c28655q2, 48);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, modifierM3399u7);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m115);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N115);
                Modifier modifierM44101d14 = AbstractC15676d.m44101d(c2314t, "track_session_toolbar_duration");
                c28655q2.m87150e0(1564770982);
                c26460cM119000x = AbstractC37056f.m119000x();
                c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(durationLeading, c28655q2, i29 | ((i28 >> 3) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN3().getStyle(), jMo134584toComposableColorWaAFU9c10, c28655q2, 0)));
                textResource2 = durationTrailing;
                c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource2, c28655q2, i29 | ((i28 >> 6) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN5().getStyle(), jMo134584toComposableColorWaAFU9c10, c28655q2, 0)));
                textResource3 = textResource12;
                if (textResource3 == null) {
                    c28655q2.m87150e0(-1798172932);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1798172931);
                    c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource3, c28655q2, i29), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN8().getStyle(), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0)));
                    c28655q2.m87173q(false);
                }
                C26460c c26460cM118988k7 = AbstractC37056f.m118988k(c26460cM119000x);
                c28655q2.m87173q(false);
                C28655q c28655q10 = c28655q2;
                f15 = f14;
                AbstractC30795n.m94704e(c26460cM118988k7, modifierM44101d14, jMo134584toComposableColorWaAFU9c10, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, null, c38072d.m121952e(c28655q2, i34).getN3(), c28655q10, 0, (i312 << 21) | 3072, 122360);
                c28655q = c28655q10;
                if (c33896n3 == null) {
                    c28655q.m87150e0(1264175865);
                    c28655q.m87173q(false);
                    c33896n4 = c33896n3;
                } else {
                    c28655q.m87150e0(1264175866);
                    c33896n4 = c33896n3;
                    AbstractC40848i.m132382e(c33896n4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13), c28655q, 48, 0);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q, true, true, true);
                AbstractC25012a.m73389v(c2314t, f116, c28655q, true);
                c33896n2 = c33896n4;
                modifier3 = modifier8;
                z13 = z15;
                interfaceC4339a2 = interfaceC4339a7;
            } else {
                textResource5 = textResource4;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i17, modifierM118962N112);
            float f117 = f176108a;
            Modifier modifierM44101d15 = AbstractC15676d.m44101d(AbstractC1102d.m3419p(f117, c2314t), "toolbar_left_icon_tag");
            C27270o c27270o8 = new C27270o(AbstractC27274q.a.f109136f, c39274g4.getIcon(), enumC39333f5, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
            TextResource textResourceM125133a8 = c39274g4.getContentDescription();
            i29 = TextResource.$stable;
            TextResource textResource13 = textResource5;
            AbstractC27242b1.m82092d(c27270o8, AbstractC8693b.m21274h(textResourceM125133a8, c28655q3, i29), modifierM44101d15, null, interfaceC4339a7, c28655q3, C27270o.f109105k | ((i28 >> 9) & 57344), 8);
            if (1.0f > 0.0d) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (!z16) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3396r8 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), 1 * f13, 0.0f, 2);
            C2305k c2305k8 = C2299e.f9111N;
            C22961h c22961h12 = AbstractC22977m.f90654e;
            C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22961h12, c2305k8, c28655q3, 54);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q3.m87165m();
            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q3, modifierM3396r8);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i14, c23010xM66775a15);
            AbstractC28683x.m87239G(c28655q3, c0209i15, interfaceC28653p1M87165m116);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i17, modifierM118962N116);
            String strM21274h8 = AbstractC8693b.m21274h(title, c28655q3, i29 | (i28 & 14));
            enumC39333f = EnumC39333f.WHITE_70;
            long jMo134584toComposableColorWaAFU9c12 = enumC39333f.mo134584toComposableColorWaAFU9c(c28655q3, 6);
            i34 = C38072d.f163054b;
            C2886a c2886aM8420a8 = c38072d.m121952e(c28655q3, i34).getB1();
            C36775k c36775k8 = new C36775k(3);
            int i313 = C2886a.f11498d;
            c33896n3 = c33896n5;
            AbstractC30795n.m94707h(strM21274h8, null, jMo134584toComposableColorWaAFU9c12, 0L, null, null, null, 0L, null, c36775k8, 0L, 0, false, 0, 0, null, c2886aM8420a8, null, c28655q3, 0, i313 << 18, 196090);
            c28655q2 = c28655q3;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f176110c, c2314t));
            C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(c22961h12, c2306l4, c28655q2, 54);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i14, c22994r1M66759a12);
            AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m117);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N117);
            if (z15) {
                c28655q2.m87150e0(-1269639259);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC22550c.f88658c, c28655q2, 6), AbstractC8693b.m21274h(AbstractC8693b.m21277k(AbstractC22551d.f88688b0), c28655q2, TextResource.C8688b.f25889c), AbstractC15676d.m44101d(AbstractC1102d.m3419p(f176109b, c2314t), "track_session_toolbar_pause_icon"), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0, 0);
                c28655q2 = c28655q2;
                f14 = f13;
                AbstractC18489d0.m53381v((float) 0.75d, f14, c2314t, c28655q2, false);
            } else {
                f14 = f13;
                c28655q2.m87150e0(-1269040556);
                c28655q2.m87173q(false);
            }
            Modifier modifierM3399u8 = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90538x);
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k8, c28655q2, 48);
            iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, modifierM3399u8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a16);
            AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m118);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N118);
            Modifier modifierM44101d16 = AbstractC15676d.m44101d(c2314t, "track_session_toolbar_duration");
            c28655q2.m87150e0(1564770982);
            c26460cM119000x = AbstractC37056f.m119000x();
            c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(durationLeading, c28655q2, i29 | ((i28 >> 3) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN3().getStyle(), jMo134584toComposableColorWaAFU9c10, c28655q2, 0)));
            textResource2 = durationTrailing;
            c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource2, c28655q2, i29 | ((i28 >> 6) & 14)), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN5().getStyle(), jMo134584toComposableColorWaAFU9c10, c28655q2, 0)));
            textResource3 = textResource13;
            if (textResource3 == null) {
                c28655q2.m87150e0(-1798172932);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1798172931);
                c26460cM119000x.add(new C23465k(AbstractC8693b.m21274h(textResource3, c28655q2, i29), AbstractC2890e.m8451f(c38072d.m121952e(c28655q2, i34).getN8().getStyle(), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q2, 0)));
                c28655q2.m87173q(false);
            }
            C26460c c26460cM118988k8 = AbstractC37056f.m118988k(c26460cM119000x);
            c28655q2.m87173q(false);
            C28655q c28655q11 = c28655q2;
            f15 = f14;
            AbstractC30795n.m94704e(c26460cM118988k8, modifierM44101d16, jMo134584toComposableColorWaAFU9c10, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, null, c38072d.m121952e(c28655q2, i34).getN3(), c28655q11, 0, (i313 << 21) | 3072, 122360);
            c28655q = c28655q11;
            if (c33896n3 == null) {
                c28655q.m87150e0(1264175865);
                c28655q.m87173q(false);
                c33896n4 = c33896n3;
            } else {
                c28655q.m87150e0(1264175866);
                c33896n4 = c33896n3;
                AbstractC40848i.m132382e(c33896n4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 0.5d) * f15, 0.0f, 0.0f, 13), c28655q, 48, 0);
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73392y(c28655q, true, true, true);
            AbstractC25012a.m73389v(c2314t, f117, c28655q, true);
            c33896n2 = c33896n4;
            modifier3 = modifier8;
            z13 = z15;
            interfaceC4339a2 = interfaceC4339a7;
        } else {
            textResource2 = durationTrailing;
            c28655q = c28655q3;
            c28655q.m87138X();
            textResource3 = textResource;
            c33896n2 = c33896n;
            interfaceC4339a2 = interfaceC4339a;
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2646w1(title, durationLeading, textResource2, modifier3, textResource3, c33896n2, z13, interfaceC4339a2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m132456d() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m132457e(TextResource textResource, TextResource textResource2, TextResource textResource3, Modifier modifier, TextResource textResource4, C33896n c33896n, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m132455c(textResource, textResource2, textResource3, modifier, textResource4, c33896n, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
