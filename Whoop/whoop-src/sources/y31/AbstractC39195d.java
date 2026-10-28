package y31;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bh.InterfaceC3242e;
import bp0.C3526n;
import c93.InterfaceC4339a;
import ch.AbstractC4590k;
import ch.AbstractC4596q;
import ch.AbstractC4601v;
import ch.C4591l;
import coil.compose.AsyncImagePainter;
import com.squareup.wire.AbstractC5583n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp0.C10965i;
import g90.C15597c;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C2000e1;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p048ce.AbstractC4482w;
import p134f2.C14015d;
import p134f2.C14018g;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15210z4;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p341nh.C26711e;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r51.C30936d;
import vv2.C36537c;
import w71.C36891k;
import wb3.AbstractC37056f;
import x81.C38072d;
import xl0.C38448b;
import xo1.C38492a;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: y31.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aG\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u001a\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aS\u0010#\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b#\u0010$\u001a%\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ly31/e;", "viewState", "Lkotlin/Function1;", "Ly31/a;", "Ll83/a0;", "onButtonClick", "Lkotlin/Function0;", "onBottomNavClick", "n", "(Landroidx/compose/ui/Modifier;Ly31/e;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "imageUrl", "z", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lgz0/m0;", "titleIcon", "E", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "", "smallButtons", "largeButtons", "v", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "icon", "label", "voiceoverText", "Li2/t;", "backgroundBrush", "onClick", "B", "(Landroidx/compose/ui/Modifier;ILcom/whoop/design/util/TextResource;Ljava/lang/String;Li2/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "text", "r", "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39195d {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m124840A(TextResource textResource, TextResource textResource2, String str, int i13, Composer composer, int i14) {
        m124871z(textResource, textResource2, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:106:0x0201  */
    /* JADX WARN: Code duplicated, block: B:108:0x020f  */
    /* JADX WARN: Code duplicated, block: B:111:0x023f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0297  */
    /* JADX WARN: Code duplicated, block: B:117:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x0107  */
    /* JADX WARN: Code duplicated, block: B:81:0x013e  */
    /* JADX WARN: Code duplicated, block: B:82:0x014b  */
    /* JADX WARN: Code duplicated, block: B:84:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:0x019b  */
    /* JADX WARN: Code duplicated, block: B:92:0x019f  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c5  */
    /* JADX INFO: renamed from: B */
    private static final void m124841B(Modifier modifier, int i13, TextResource textResource, String str, AbstractC17911t abstractC17911t, InterfaceC4339a interfaceC4339a, Composer composer, int i14, int i15) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i16;
        int i17;
        AbstractC17911t abstractC17911t2;
        int i18;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        String str2;
        Modifier modifier3;
        AbstractC17911t abstractC17911t3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        String str3;
        AbstractC17911t abstractC17911t4;
        C33252i c33252iM105489e;
        Modifier modifierM3358c;
        Object objM87133R;
        C28676v0 c28676v0;
        boolean zM87153g;
        Object objM87133R2;
        boolean z13;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i19;
        int iHashCode2;
        int i24;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(619323537);
        int i25 = i15 & 1;
        if (i25 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(textResource) ? 256 : 128;
        }
        int i26 = i15 & 8;
        if (i26 == 0) {
            if ((i14 & 3072) == 0) {
                i16 |= c28655q.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    abstractC17911t2 = abstractC17911t;
                    if (c28655q.m87153g(abstractC17911t2)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i18;
                }
                if ((196608 & i14) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i24;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                if ((74899 & i16) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i26 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i17 != 0) {
                        abstractC17911t4 = null;
                    } else {
                        abstractC17911t4 = abstractC17911t2;
                    }
                    float f13 = 4;
                    c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                    Modifier modifierM118994r = AbstractC37056f.m118994r(modifier2, c33252iM105489e);
                    if (abstractC17911t4 != null) {
                        c28655q.m87150e0(-911635298);
                        c28655q.m87173q(false);
                        modifierM3358c = AbstractC1092a.m3357b(c2314t, abstractC17911t4, c33252iM105489e, 0.0f, 4);
                    } else {
                        c28655q.m87150e0(-911546917);
                        modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC17918w0.f69621a);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierMo3471e = modifierM118994r.mo3471e(modifierM3358c);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    Modifier modifier5 = modifier2;
                    Modifier modifierM3360e = AbstractC1092a.m3360e(modifierMo3471e, (InterfaceC21083i) objM87133R, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), false, null, interfaceC4339a2, 28);
                    float f14 = 8;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3360e, 2 * f14, ((float) 1.5d) * f14);
                    if (str3 == null) {
                        c28655q.m87150e0(-911138090);
                        c28655q.m87173q(false);
                        z13 = false;
                        modifier4 = null;
                    } else {
                        c28655q.m87150e0(-911138089);
                        zM87153g = c28655q.m87153g(str3);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g || objM87133R2 == c28676v0) {
                            objM87133R2 = new C30936d(str3, 12);
                            c28655q.m87172p0(objM87133R2);
                        }
                        z13 = false;
                        Modifier modifierM51775c = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                        modifier4 = modifierM51775c;
                    }
                    if (modifier4 == null) {
                        modifier4 = c2314t;
                    }
                    Modifier modifierMo3471e2 = modifierM3395q.mo3471e(modifier4);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, z13);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        i19 = i16;
                    } else {
                        i19 = i16;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        String str4 = str3;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        C27430e c27430eM107874S = AbstractC34132o.m107874S(i13, c28655q, (i19 & 112) | 6);
                        Modifier modifierM3419p = AbstractC1102d.m3419p(f13 * f13, c2314t);
                        C38072d c38072d = C38072d.f163053a;
                        str2 = str4;
                        abstractC17911t3 = abstractC17911t4;
                        AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                        if (textResource == null && AbstractC8693b.m21270d(textResource)) {
                            c28655q.m87150e0(-1611051391);
                            AbstractC38963t7.m124386p(1, f14, c2314t, c28655q);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, (i19 >> 6) & 14), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1610780389);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        modifier3 = modifier5;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    String str5 = str3;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                    C27430e c27430eM107874S2 = AbstractC34132o.m107874S(i13, c28655q, (i19 & 112) | 6);
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(f13 * f13, c2314t);
                    C38072d c38072d2 = C38072d.f163053a;
                    str2 = str5;
                    abstractC17911t3 = abstractC17911t4;
                    AbstractC15005f3.m43108b(c27430eM107874S2, null, modifierM3419p2, c38072d2.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                    if (textResource == null) {
                        c28655q.m87150e0(-1610780389);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1610780389);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    modifier3 = modifier2;
                    abstractC17911t3 = abstractC17911t2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2000e1(modifier3, i13, textResource, str2, abstractC17911t3, interfaceC4339a, i14, i15);
                }
            }
            i16 |= 24576;
            abstractC17911t2 = abstractC17911t;
            if ((196608 & i14) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i24;
            } else {
                interfaceC4339a2 = interfaceC4339a;
            }
            if ((74899 & i16) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i26 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i17 != 0) {
                    abstractC17911t4 = null;
                } else {
                    abstractC17911t4 = abstractC17911t2;
                }
                float f15 = 4;
                c33252iM105489e = AbstractC33253j.m105489e(3 * f15);
                Modifier modifierM118994r2 = AbstractC37056f.m118994r(modifier2, c33252iM105489e);
                if (abstractC17911t4 != null) {
                    c28655q.m87150e0(-911635298);
                    c28655q.m87173q(false);
                    modifierM3358c = AbstractC1092a.m3357b(c2314t, abstractC17911t4, c33252iM105489e, 0.0f, 4);
                } else {
                    c28655q.m87150e0(-911546917);
                    modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC17918w0.f69621a);
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e3 = modifierM118994r2.mo3471e(modifierM3358c);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                Modifier modifier6 = modifier2;
                Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierMo3471e3, (InterfaceC21083i) objM87133R, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), false, null, interfaceC4339a2, 28);
                float f16 = 8;
                Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM3360e2, 2 * f16, ((float) 1.5d) * f16);
                if (str3 == null) {
                    c28655q.m87150e0(-911138090);
                    c28655q.m87173q(false);
                    z13 = false;
                    modifier4 = null;
                } else {
                    c28655q.m87150e0(-911138089);
                    zM87153g = c28655q.m87153g(str3);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new C30936d(str3, 12);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C30936d(str3, 12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    z13 = false;
                    Modifier modifierM51775c2 = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                    modifier4 = modifierM51775c2;
                }
                if (modifier4 == null) {
                    modifier4 = c2314t;
                }
                Modifier modifierMo3471e4 = modifierM3395q2.mo3471e(modifier4);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, z13);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d2);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i19 = i16;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    String str6 = str3;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                    C27430e c27430eM107874S3 = AbstractC34132o.m107874S(i13, c28655q, (i19 & 112) | 6);
                    Modifier modifierM3419p3 = AbstractC1102d.m3419p(f15 * f15, c2314t);
                    C38072d c38072d3 = C38072d.f163053a;
                    str2 = str6;
                    abstractC17911t3 = abstractC17911t4;
                    AbstractC15005f3.m43108b(c27430eM107874S3, null, modifierM3419p3, c38072d3.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                    if (textResource == null) {
                        c28655q.m87150e0(-1610780389);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1610780389);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier6;
                } else {
                    i19 = i16;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                String str7 = str3;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                C27430e c27430eM107874S4 = AbstractC34132o.m107874S(i13, c28655q, (i19 & 112) | 6);
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(f15 * f15, c2314t);
                C38072d c38072d4 = C38072d.f163053a;
                str2 = str7;
                abstractC17911t3 = abstractC17911t4;
                AbstractC15005f3.m43108b(c27430eM107874S4, null, modifierM3419p4, c38072d4.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                if (textResource == null) {
                    c28655q.m87150e0(-1610780389);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1610780389);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                str2 = str;
                modifier3 = modifier2;
                abstractC17911t3 = abstractC17911t2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2000e1(modifier3, i13, textResource, str2, abstractC17911t3, interfaceC4339a, i14, i15);
            }
        }
        i16 |= 3072;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                abstractC17911t2 = abstractC17911t;
                if (c28655q.m87153g(abstractC17911t2)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i18;
            }
            if ((196608 & i14) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i24;
            } else {
                interfaceC4339a2 = interfaceC4339a;
            }
            if ((74899 & i16) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i26 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i17 != 0) {
                    abstractC17911t4 = null;
                } else {
                    abstractC17911t4 = abstractC17911t2;
                }
                float f17 = 4;
                c33252iM105489e = AbstractC33253j.m105489e(3 * f17);
                Modifier modifierM118994r3 = AbstractC37056f.m118994r(modifier2, c33252iM105489e);
                if (abstractC17911t4 != null) {
                    c28655q.m87150e0(-911635298);
                    c28655q.m87173q(false);
                    modifierM3358c = AbstractC1092a.m3357b(c2314t, abstractC17911t4, c33252iM105489e, 0.0f, 4);
                } else {
                    c28655q.m87150e0(-911546917);
                    modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC17918w0.f69621a);
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e5 = modifierM118994r3.mo3471e(modifierM3358c);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                Modifier modifier7 = modifier2;
                Modifier modifierM3360e3 = AbstractC1092a.m3360e(modifierMo3471e5, (InterfaceC21083i) objM87133R, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), false, null, interfaceC4339a2, 28);
                float f18 = 8;
                Modifier modifierM3395q3 = AbstractC1099a.m3395q(modifierM3360e3, 2 * f18, ((float) 1.5d) * f18);
                if (str3 == null) {
                    c28655q.m87150e0(-911138090);
                    c28655q.m87173q(false);
                    z13 = false;
                    modifier4 = null;
                } else {
                    c28655q.m87150e0(-911138089);
                    zM87153g = c28655q.m87153g(str3);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new C30936d(str3, 12);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C30936d(str3, 12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    z13 = false;
                    Modifier modifierM51775c3 = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                    modifier4 = modifierM51775c3;
                }
                if (modifier4 == null) {
                    modifier4 = c2314t;
                }
                Modifier modifierMo3471e6 = modifierM3395q3.mo3471e(modifier4);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, z13);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d3);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i19 = i16;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    String str8 = str3;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                    C27430e c27430eM107874S5 = AbstractC34132o.m107874S(i13, c28655q, (i19 & 112) | 6);
                    Modifier modifierM3419p5 = AbstractC1102d.m3419p(f17 * f17, c2314t);
                    C38072d c38072d5 = C38072d.f163053a;
                    str2 = str8;
                    abstractC17911t3 = abstractC17911t4;
                    AbstractC15005f3.m43108b(c27430eM107874S5, null, modifierM3419p5, c38072d5.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                    if (textResource == null) {
                        c28655q.m87150e0(-1610780389);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1610780389);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier7;
                } else {
                    i19 = i16;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                String str9 = str3;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                C27430e c27430eM107874S6 = AbstractC34132o.m107874S(i13, c28655q, (i19 & 112) | 6);
                Modifier modifierM3419p6 = AbstractC1102d.m3419p(f17 * f17, c2314t);
                C38072d c38072d6 = C38072d.f163053a;
                str2 = str9;
                abstractC17911t3 = abstractC17911t4;
                AbstractC15005f3.m43108b(c27430eM107874S6, null, modifierM3419p6, c38072d6.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                if (textResource == null) {
                    c28655q.m87150e0(-1610780389);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1610780389);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                str2 = str;
                modifier3 = modifier2;
                abstractC17911t3 = abstractC17911t2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2000e1(modifier3, i13, textResource, str2, abstractC17911t3, interfaceC4339a, i14, i15);
            }
        }
        i16 |= 24576;
        abstractC17911t2 = abstractC17911t;
        if ((196608 & i14) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            if (c28655q.m87157i(interfaceC4339a2)) {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i24;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if ((74899 & i16) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier2 = c2314t;
            }
            if (i26 != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if (i17 != 0) {
                abstractC17911t4 = null;
            } else {
                abstractC17911t4 = abstractC17911t2;
            }
            float f19 = 4;
            c33252iM105489e = AbstractC33253j.m105489e(3 * f19);
            Modifier modifierM118994r4 = AbstractC37056f.m118994r(modifier2, c33252iM105489e);
            if (abstractC17911t4 != null) {
                c28655q.m87150e0(-911635298);
                c28655q.m87173q(false);
                modifierM3358c = AbstractC1092a.m3357b(c2314t, abstractC17911t4, c33252iM105489e, 0.0f, 4);
            } else {
                c28655q.m87150e0(-911546917);
                modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC17918w0.f69621a);
                c28655q.m87173q(false);
            }
            Modifier modifierMo3471e7 = modifierM118994r4.mo3471e(modifierM3358c);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            Modifier modifier8 = modifier2;
            Modifier modifierM3360e4 = AbstractC1092a.m3360e(modifierMo3471e7, (InterfaceC21083i) objM87133R, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), false, null, interfaceC4339a2, 28);
            float f110 = 8;
            Modifier modifierM3395q4 = AbstractC1099a.m3395q(modifierM3360e4, 2 * f110, ((float) 1.5d) * f110);
            if (str3 == null) {
                c28655q.m87150e0(-911138090);
                c28655q.m87173q(false);
                z13 = false;
                modifier4 = null;
            } else {
                c28655q.m87150e0(-911138089);
                zM87153g = c28655q.m87153g(str3);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new C30936d(str3, 12);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C30936d(str3, 12);
                    c28655q.m87172p0(objM87133R2);
                }
                z13 = false;
                Modifier modifierM51775c4 = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2);
                c28655q.m87173q(false);
                modifier4 = modifierM51775c4;
            }
            if (modifier4 == null) {
                modifier4 = c2314t;
            }
            Modifier modifierMo3471e8 = modifierM3395q4.mo3471e(modifier4);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, z13);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierMo3471e8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d4);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                i19 = i16;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                String str10 = str3;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N11);
                C27430e c27430eM107874S7 = AbstractC34132o.m107874S(i13, c28655q, (i19 & 112) | 6);
                Modifier modifierM3419p7 = AbstractC1102d.m3419p(f19 * f19, c2314t);
                C38072d c38072d7 = C38072d.f163053a;
                str2 = str10;
                abstractC17911t3 = abstractC17911t4;
                AbstractC15005f3.m43108b(c27430eM107874S7, null, modifierM3419p7, c38072d7.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                if (textResource == null) {
                    c28655q.m87150e0(-1610780389);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1610780389);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier8;
            } else {
                i19 = i16;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N10);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            String str11 = str3;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N12);
            C27430e c27430eM107874S8 = AbstractC34132o.m107874S(i13, c28655q, (i19 & 112) | 6);
            Modifier modifierM3419p8 = AbstractC1102d.m3419p(f19 * f19, c2314t);
            C38072d c38072d8 = C38072d.f163053a;
            str2 = str11;
            abstractC17911t3 = abstractC17911t4;
            AbstractC15005f3.m43108b(c27430eM107874S8, null, modifierM3419p8, c38072d8.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
            if (textResource == null) {
                c28655q.m87150e0(-1610780389);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1610780389);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier8;
        } else {
            c28655q.m87138X();
            str2 = str;
            modifier3 = modifier2;
            abstractC17911t3 = abstractC17911t2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2000e1(modifier3, i13, textResource, str2, abstractC17911t3, interfaceC4339a, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m124842C(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m124843D(Modifier modifier, int i13, TextResource textResource, String str, AbstractC17911t abstractC17911t, InterfaceC4339a interfaceC4339a, int i14, int i15, Composer composer, int i16) throws XmlPullParserException, IOException {
        m124841B(modifier, i13, textResource, str, abstractC17911t, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final void m124844E(TextResource textResource, EnumC16313m0 enumC16313m0, TextResource textResource2, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-698738177);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(textResource2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int whoopIcon = enumC16313m0 != null ? enumC16313m0.toWhoopIcon() : C38072d.f163053a.m121951d().getVarious().getAiSparkle();
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(whoopIcon, c28655q, 6);
            Modifier modifierM3419p = AbstractC1102d.m3419p(5 * 4, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i15 = i14;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, 6).getRecovery(), c28655q, 432, 0);
            AbstractC38963t7.m124386p(1, 8, c2314t, c28655q);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i15 & 14), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getT4(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            if (AbstractC8693b.m21270d(textResource2)) {
                c28655q.m87150e0(-1581654046);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i15 >> 6) & 14), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1581443587);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(textResource, enumC16313m0, textResource2, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m124845F(TextResource textResource, EnumC16313m0 enumC16313m0, TextResource textResource2, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m124844E(textResource, enumC16313m0, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x010e  */
    /* JADX WARN: Code duplicated, block: B:70:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0134  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x015f  */
    /* JADX WARN: Code duplicated, block: B:82:0x016c  */
    /* JADX WARN: Code duplicated, block: B:84:0x017a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0186  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:99:0x0201  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX INFO: renamed from: n */
    public static final void m124859n(Modifier modifier, C39196e viewState, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Object obj;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C2305k c2305k;
        int i18;
        int iHashCode2;
        ?? r10;
        TextResource textResourceM124873b;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(927850085);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i19 != 0) {
                        modifier2 = c2314t;
                    }
                    obj = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == obj) {
                            objM87133R2 = new C38448b(27);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function2 = (Function1) objM87133R2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == obj) {
                            objM87133R = new C38492a(19);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    }
                    float f13 = 4;
                    C33252i c33252iM105489e = AbstractC33253j.m105489e(f13 * f13);
                    Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier2), c33252iM105489e), AbstractC15673b0.m43978D(), c33252iM105489e, 0.0f, 4);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3357b);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    float f14 = 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f14, c2314t);
                    if (viewState.getIsCenterAligned()) {
                        c2305k = C2299e.f9111N;
                    } else {
                        c2305k = C2299e.f9110M;
                    }
                    Modifier modifier4 = modifier2;
                    C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 1.5d, f14, c2305k, c28655q, 6);
                    i18 = i15;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    if (viewState.getIsCenterAligned()) {
                        c28655q.m87150e0(998012739);
                        r10 = 0;
                        m124871z(viewState.getTitle(), viewState.getSubtitle(), viewState.getImageUrl(), c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        r10 = 0;
                        c28655q.m87150e0(998238574);
                        m124844E(viewState.getTitle(), viewState.getTitleIcon(), viewState.getSubtitle(), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    m124867v(viewState.m124877f(), viewState.m124876e(), function2, c28655q, i18 & 896);
                    textResourceM124873b = viewState.getBottomNavText();
                    if (textResourceM124873b == null) {
                        c28655q.m87150e0(998675952);
                        c28655q.m87173q(r10);
                    } else {
                        c28655q.m87150e0(998675953);
                        m124863r(AbstractC8693b.m21274h(textResourceM124873b, c28655q, r10), interfaceC4339a2, c28655q, (i18 >> 6) & 112);
                        c28655q.m87173q(r10);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                }
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k(modifier3, (InterfaceC25312u) viewState, function3, (Object) interfaceC4339a3, i13, i14, 11);
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                obj = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C38448b(27);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function2 = (Function1) objM87133R2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = new C38492a(19);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                }
                float f15 = 4;
                C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f15 * f15);
                Modifier modifierM3357b2 = AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier2), c33252iM105489e2), AbstractC15673b0.m43978D(), c33252iM105489e2, 0.0f, 4);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3357b2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                float f16 = 8;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f16, c2314t);
                if (viewState.getIsCenterAligned()) {
                    c2305k = C2299e.f9111N;
                } else {
                    c2305k = C2299e.f9110M;
                }
                Modifier modifier5 = modifier2;
                C23010x c23010xM73381n2 = AbstractC25012a.m73381n((float) 1.5d, f16, c2305k, c28655q, 6);
                i18 = i15;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM73381n2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                if (viewState.getIsCenterAligned()) {
                    c28655q.m87150e0(998012739);
                    r10 = 0;
                    m124871z(viewState.getTitle(), viewState.getSubtitle(), viewState.getImageUrl(), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    r10 = 0;
                    c28655q.m87150e0(998238574);
                    m124844E(viewState.getTitle(), viewState.getTitleIcon(), viewState.getSubtitle(), c28655q, 0);
                    c28655q.m87173q(false);
                }
                m124867v(viewState.m124877f(), viewState.m124876e(), function2, c28655q, i18 & 896);
                textResourceM124873b = viewState.getBottomNavText();
                if (textResourceM124873b == null) {
                    c28655q.m87150e0(998675952);
                    c28655q.m87173q(r10);
                } else {
                    c28655q.m87150e0(998675953);
                    m124863r(AbstractC8693b.m21274h(textResourceM124873b, c28655q, r10), interfaceC4339a2, c28655q, (i18 >> 6) & 112);
                    c28655q.m87173q(r10);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(modifier3, (InterfaceC25312u) viewState, function3, (Object) interfaceC4339a3, i13, i14, 11);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                obj = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C38448b(27);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function2 = (Function1) objM87133R2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = new C38492a(19);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                }
                float f17 = 4;
                C33252i c33252iM105489e3 = AbstractC33253j.m105489e(f17 * f17);
                Modifier modifierM3357b3 = AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier2), c33252iM105489e3), AbstractC15673b0.m43978D(), c33252iM105489e3, 0.0f, 4);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3357b3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                float f18 = 8;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(2 * f18, c2314t);
                if (viewState.getIsCenterAligned()) {
                    c2305k = C2299e.f9111N;
                } else {
                    c2305k = C2299e.f9110M;
                }
                Modifier modifier6 = modifier2;
                C23010x c23010xM73381n3 = AbstractC25012a.m73381n((float) 1.5d, f18, c2305k, c28655q, 6);
                i18 = i15;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM73381n3);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                if (viewState.getIsCenterAligned()) {
                    c28655q.m87150e0(998012739);
                    r10 = 0;
                    m124871z(viewState.getTitle(), viewState.getSubtitle(), viewState.getImageUrl(), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    r10 = 0;
                    c28655q.m87150e0(998238574);
                    m124844E(viewState.getTitle(), viewState.getTitleIcon(), viewState.getSubtitle(), c28655q, 0);
                    c28655q.m87173q(false);
                }
                m124867v(viewState.m124877f(), viewState.m124876e(), function2, c28655q, i18 & 896);
                textResourceM124873b = viewState.getBottomNavText();
                if (textResourceM124873b == null) {
                    c28655q.m87150e0(998675952);
                    c28655q.m87173q(r10);
                } else {
                    c28655q.m87150e0(998675953);
                    m124863r(AbstractC8693b.m21274h(textResourceM124873b, c28655q, r10), interfaceC4339a2, c28655q, (i18 >> 6) & 112);
                    c28655q.m87173q(r10);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(modifier3, (InterfaceC25312u) viewState, function3, (Object) interfaceC4339a3, i13, i14, 11);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier2 = c2314t;
            }
            obj = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C38448b(27);
                    c28655q.m87172p0(objM87133R2);
                }
                function2 = (Function1) objM87133R2;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == obj) {
                    objM87133R = new C38492a(19);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            }
            float f19 = 4;
            C33252i c33252iM105489e4 = AbstractC33253j.m105489e(f19 * f19);
            Modifier modifierM3357b4 = AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier2), c33252iM105489e4), AbstractC15673b0.m43978D(), c33252iM105489e4, 0.0f, 4);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3357b4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            float f110 = 8;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(2 * f110, c2314t);
            if (viewState.getIsCenterAligned()) {
                c2305k = C2299e.f9111N;
            } else {
                c2305k = C2299e.f9110M;
            }
            Modifier modifier7 = modifier2;
            C23010x c23010xM73381n4 = AbstractC25012a.m73381n((float) 1.5d, f110, c2305k, c28655q, 6);
            i18 = i15;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM73381n4);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            if (viewState.getIsCenterAligned()) {
                c28655q.m87150e0(998012739);
                r10 = 0;
                m124871z(viewState.getTitle(), viewState.getSubtitle(), viewState.getImageUrl(), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                r10 = 0;
                c28655q.m87150e0(998238574);
                m124844E(viewState.getTitle(), viewState.getTitleIcon(), viewState.getSubtitle(), c28655q, 0);
                c28655q.m87173q(false);
            }
            m124867v(viewState.m124877f(), viewState.m124876e(), function2, c28655q, i18 & 896);
            textResourceM124873b = viewState.getBottomNavText();
            if (textResourceM124873b == null) {
                c28655q.m87150e0(998675952);
                c28655q.m87173q(r10);
            } else {
                c28655q.m87150e0(998675953);
                m124863r(AbstractC8693b.m21274h(textResourceM124873b, c28655q, r10), interfaceC4339a2, c28655q, (i18 >> 6) & 112);
                c28655q.m87173q(r10);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier7;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        function3 = function2;
        interfaceC4339a3 = interfaceC4339a2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(modifier3, (InterfaceC25312u) viewState, function3, (Object) interfaceC4339a3, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m124860o(C39192a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m124861p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m124862q(Modifier modifier, C39196e c39196e, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m124859n(modifier, c39196e, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m124863r(String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-582558802);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3409f, (InterfaceC21083i) objM87133R, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), false, null, interfaceC4339a, 28);
            float f13 = 1 * 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM3360e, 0.0f, f13, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String upperCase = str.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, 6).getH5(), C23285v0.m67363a(c38072d.m121952e(c28655q, 6).getH5().getStyle(), AbstractC15673b0.m43972A(), 0L, null, null, 0L, 33554430), null, 2, null), null, c28655q, 0, 0, 196606);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t));
            C27430e c27430eM107874S = AbstractC34132o.m107874S(EnumC16313m0.ARROW_FORWARD.toWhoopIcon(), c28655q, 6);
            float f14 = 4;
            Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f14 * f14, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C38448b(29);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1125a.m3479b(modifierM3488c, (Function1) objM87133R2), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 48, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10965i(str, interfaceC4339a, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C14018g m124864s(C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C38448b(28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m124865t(InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        ((C0238p0) onDrawWithContent).m728a();
        InterfaceC22131e.m63385u(onDrawWithContent, AbstractC15673b0.m43972A(), 0L, 0L, 0.0f, null, 9, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m124866u(String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m124863r(str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v */
    private static final void m124867v(List<C39192a> list, List<C39192a> list2, final Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28676v0 c28676v0;
        AbstractC17911t c17875c1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1913872680);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list2) ? 32 : 16;
        }
        int i15 = 256;
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        boolean z4 = true;
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = 1.0f;
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), EnumC22935a1.f90538x);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3388j);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1141663926);
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c28676v0 = C28635l.f115821a;
                if (!zHasNext) {
                    break;
                }
                final C39192a c39192a = (C39192a) it.next();
                int whoopIcon = c39192a.getIcon().toWhoopIcon();
                boolean z13 = z4;
                TextResource textResourceM124830d = c39192a.getTitle();
                String strM124831e = c39192a.getVoiceoverText();
                boolean zM87157i = ((i14 & 896) == i15 ? z13 : false) | c28655q.m87157i(c39192a);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    final int i16 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: y31.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    return AbstractC39195d.m124868w(function1, c39192a);
                                default:
                                    return AbstractC39195d.m124869x(function1, c39192a);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                m124841B(null, whoopIcon, textResourceM124830d, strM124831e, null, (InterfaceC4339a) objM87133R, c28655q, 24576, 1);
                f13 = 1.0f;
                z4 = true;
                i15 = 256;
            }
            float f14 = f13;
            c28655q.m87173q(false);
            c28655q.m87150e0(-1141653419);
            for (final C39192a c39192a2 : list2) {
                if (f14 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f14, true);
                int whoopIcon2 = c39192a2.getIcon().toWhoopIcon();
                TextResource textResourceM124830d2 = c39192a2.getTitle();
                String strM124831e2 = c39192a2.getVoiceoverText();
                if (c39192a2.getIsEmphasized()) {
                    c28655q.m87150e0(-1499926696);
                    c28655q.m87173q(false);
                    c17875c1 = AbstractC15673b0.m43978D();
                } else {
                    c28655q.m87150e0(-1499925630);
                    c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getWhite10());
                    c28655q.m87173q(false);
                }
                boolean zM87157i2 = ((i14 & 896) == 256) | c28655q.m87157i(c39192a2);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    final int i17 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: y31.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    return AbstractC39195d.m124868w(function1, c39192a2);
                                default:
                                    return AbstractC39195d.m124869x(function1, c39192a2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                m124841B(layoutWeightElement, whoopIcon2, textResourceM124830d2, strM124831e2, c17875c1, (InterfaceC4339a) objM87133R2, c28655q, 0, 0);
                c28676v0 = c28676v0;
                f14 = 1.0f;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(list, list2, function1, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m124868w(Function1 function1, C39192a c39192a) {
        function1.invoke(c39192a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m124869x(Function1 function1, C39192a c39192a) {
        function1.invoke(c39192a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m124870y(List list, List list2, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m124867v(list, list2, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: z */
    private static final void m124871z(TextResource textResource, TextResource textResource2, String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        ?? r10;
        C2314t c2314t;
        boolean z4;
        C28655q c28655q2;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1295452536);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87153g(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87153g(str) ? 256 : 128;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q3, 48);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, c2314t2);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            int i15 = 3;
            if (str == null) {
                c28655q3.m87150e0(-356252009);
                c28655q3.m87173q(false);
                r10 = 0;
                c2314t = c2314t2;
            } else {
                c28655q3.m87150e0(-356252008);
                Modifier modifierM3419p = AbstractC1102d.m3419p(18 * 4, c2314t2);
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q3, 0);
                c28655q3.m87152f0(2027616330);
                C2307m c2307m = C2299e.f9102E;
                InterfaceC3242e interfaceC3242eM16747F = AbstractC5583n.m16747F(AbstractC4596q.f18485a, c28655q3);
                c28655q3.m87152f0(-1481548872);
                C4591l c4591l = new C4591l(str, AbstractC4590k.f18473b, interfaceC3242eM16747F);
                C26711e c26711e = AbstractC4601v.f18506b;
                r10 = 0;
                c2314t = c2314t2;
                AbstractC4482w.m13998k(c4591l, null, modifierM3419p, (abstractC26165aM88500I == null && abstractC26165aM88500I == null) ? AsyncImagePainter.f20210T : new C3526n(i15, abstractC26165aM88500I, abstractC26165aM88500I), null, c2307m, C39102j.f168200b, 1.0f, c28655q3, 1573296, 0);
                c28655q3.m87173q(false);
                c28655q3.m87173q(false);
                AbstractC25012a.m73388u((float) 1.5d, 8, c2314t, c28655q3, false);
            }
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q3, i14 & 14);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getT4(), null, c28655q3, 0, 0, 196090);
            C28655q c28655q4 = c28655q3;
            if (textResource2 == null) {
                c28655q4.m87150e0(-355673580);
                c28655q4.m87173q(r10);
                z4 = true;
                c28655q2 = c28655q4;
            } else {
                c28655q4.m87150e0(-355673579);
                AbstractC11266d.m30469w(1, 8, c2314t, c28655q4);
                z4 = true;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q4, r10), null, c38072d.m121949b(c28655q4, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196090);
                C28655q c28655q5 = c28655q4;
                c28655q5.m87173q(r10);
                c28655q2 = c28655q5;
            }
            c28655q2.m87173q(z4);
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15597c(textResource, textResource2, str, i13, 1);
        }
    }
}
