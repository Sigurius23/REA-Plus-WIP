package m81;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.foundation.selection.AbstractC1112d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import com.whoop.design.util.AbstractC8693b;
import e93.AbstractC12889b;
import f31.AbstractC14046c;
import f31.C14044a;
import fc0.C14362f;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import js2.C21930h;
import l80.C23434k;
import l83.C23454a0;
import m01.C24875c;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.InterfaceC22965i;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: m81.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001ai\u0010\u000f\u001a\u00020\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001ae\u0010\u0013\u001a\u00020\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aa\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\fH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!²\u0006\u000e\u0010 \u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "Lm81/g;", "viewState", "", "initialSelectedId", "Li2/x;", "activeColor", "Ly3/f;", "paddingSize", "Lm81/f;", "selectedStyle", "unselectedStyle", "Lkotlin/Function1;", "Ll83/a0;", "onSelect", "m", "(Ljava/util/List;Ljava/lang/String;JLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "selectedIndex", "l", "(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "initialToggle", "minHeight", "style", "onMeasuredHeight", "onToggle", "k", "(Lm81/g;JZFLm81/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "a", "F", "DefaultSelectorButtonMinHeight", "sharedMinHeightPx", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25230e {

    /* JADX INFO: renamed from: a */
    private static final float f99094a = 9 * 4;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v18 */
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
    /* JADX INFO: renamed from: k */
    private static final void m73955k(final C25232g c25232g, final long j7, final boolean z4, final float f13, final C25231f c25231f, final Function1 function1, final Function1 function2, Composer composer, final int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q;
        C17919x c17919xM31989h;
        long jM95624D;
        C17919x c17919xM31989h2;
        long jM95628d;
        C17919x c17919xM31989h3;
        long jM53358D;
        Modifier modifierM44456i;
        int i15;
        boolean z13;
        ?? r10;
        C28655q c28655q2;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1067235111);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q3.m87153g(c25232g) : c28655q3.m87157i(c25232g) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q3.m87147d(f13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (32768 & i13) == 0 ? c28655q3.m87153g(c25231f) : c28655q3.m87157i(c25231f) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q3.m87157i(function1) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q3.m87157i(function2) ? 1048576 : 524288;
        }
        int i16 = i14;
        if (c28655q3.m87135U(i16 & 1, (i16 & 599187) != 599186)) {
            InterfaceC39332e interfaceC39332eM73973d = c25231f != null ? c25231f.getContentColor() : null;
            if (interfaceC39332eM73973d == null) {
                c28655q3.m87150e0(-1641424121);
                c28655q3.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q3.m87150e0(-884233158);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q3, false, interfaceC39332eM73973d.mo134584toComposableColorWaAFU9c(c28655q3, 0));
            }
            if (c17919xM31989h != null) {
                jM95624D = c17919xM31989h.f69639a;
            } else if (z4) {
                c28655q3.m87150e0(-884231247);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q3, 6, false);
            } else {
                c28655q3.m87150e0(-884230159);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q3, 6, false);
            }
            long j13 = jM95624D;
            InterfaceC39332e interfaceC39332eM73970a = c25231f != null ? c25231f.getBackgroundColor() : null;
            if (interfaceC39332eM73970a == null) {
                c28655q3.m87150e0(-1641270361);
                c28655q3.m87173q(false);
                c17919xM31989h2 = null;
            } else {
                c28655q3.m87150e0(-884228198);
                c17919xM31989h2 = AbstractC11895b.m31989h(c28655q3, false, interfaceC39332eM73970a.mo134584toComposableColorWaAFU9c(c28655q3, 0));
            }
            if (c17919xM31989h2 != null) {
                jM95628d = c17919xM31989h2.f69639a;
            } else if (z4) {
                c28655q3.m87150e0(-884226862);
                c28655q3.m87173q(false);
                jM95628d = j7;
            } else {
                c28655q3.m87150e0(-884225746);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q3, 6, false);
            }
            InterfaceC39332e interfaceC39332eM73975f = c25231f != null ? c25231f.getIconColor() : null;
            if (interfaceC39332eM73975f == null) {
                c28655q3.m87150e0(-1641148345);
                c28655q3.m87173q(false);
                c17919xM31989h3 = null;
            } else {
                c28655q3.m87150e0(-884224262);
                c17919xM31989h3 = AbstractC11895b.m31989h(c28655q3, false, interfaceC39332eM73975f.mo134584toComposableColorWaAFU9c(c28655q3, 0));
            }
            if (c17919xM31989h3 != null) {
                jM53358D = c17919xM31989h3.f69639a;
            } else if (z4) {
                c28655q3.m87150e0(-884222354);
                jM53358D = C38072d.f163053a.m121949b(c28655q3, 6).getBlack50();
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-884221362);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q3, 6, false);
            }
            long j14 = jM53358D;
            float f14 = (c25232g.getIcon() != null ? (float) 19.5d : 10) * 4;
            InterfaceC22965i interfaceC22965iM66746i = c25232g.getIcon() != null ? AbstractC22977m.m66746i(2 * 4) : AbstractC22977m.f90654e;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(c25231f != null ? c25231f.getCornerRadius() : 3 * 4);
            InterfaceC39332e interfaceC39332eM73971b = c25231f != null ? c25231f.getBorderColor() : null;
            long j15 = jM95628d;
            C2314t c2314t = C2314t.f9131w;
            if (interfaceC39332eM73971b == null) {
                c28655q3.m87150e0(-1640745066);
                c28655q3.m87173q(false);
                modifierM44456i = null;
            } else {
                c28655q3.m87150e0(-1640745065);
                C13825t c13825tM48880a = AbstractC17269i.m48880a(c25231f.getBorderWidth(), interfaceC39332eM73971b.mo134584toComposableColorWaAFU9c(c28655q3, 0));
                modifierM44456i = AbstractC15751g.m44456i(c13825tM48880a.f49345a, c2314t, c13825tM48880a.f49346b, c33252iM105489e);
                c28655q3.m87173q(false);
            }
            Modifier modifier = modifierM44456i == null ? c2314t : modifierM44456i;
            boolean z14 = (i16 & 3670016) == 1048576;
            Object objM87133R = c28655q3.m87133R();
            Object obj = C28635l.f115821a;
            if (z14 || objM87133R == obj) {
                objM87133R = new C23434k(function2, 15);
                c28655q3.m87172p0(objM87133R);
            }
            InterfaceC22965i interfaceC22965i = interfaceC22965iM66746i;
            float f15 = 4;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3404a(AbstractC1112d.m3448b(c2314t, z4, false, null, (Function1) objM87133R, 14), f14, f13), c33252iM105489e).mo3471e(modifier), j15, AbstractC17918w0.f69621a), 3 * f15, 2 * f15);
            boolean z15 = (i16 & 458752) == 131072;
            Object objM87133R2 = c28655q3.m87133R();
            if (z15 || objM87133R2 == obj) {
                objM87133R2 = new C23434k(function1, 16);
                c28655q3.m87172p0(objM87133R2);
            }
            Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3395q, (Function1) objM87133R2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(interfaceC22965i, C2299e.f9108K, c28655q3, 48);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3500d);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            if (c25232g.getIcon() == null) {
                c28655q3.m87150e0(-914622601);
                c28655q3.m87173q(false);
                c28655q2 = c28655q3;
                r10 = 0;
                z13 = true;
                i15 = 6;
            } else {
                c28655q3.m87150e0(-914622600);
                i15 = 6;
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c25232g.getIcon().toWhoopIcon(), c28655q3, 6);
                Modifier modifierM3419p = AbstractC1102d.m3419p(f15 * f15, c2314t);
                z13 = true;
                r10 = 0;
                AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, j14, c28655q3, 432, 0);
                C28655q c28655q4 = c28655q3;
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            String strM21274h = AbstractC8693b.m21274h(c25232g.getLabel(), c28655q2, r10);
            C2886a c2886aM73979d = c25232g.getLabelStyle();
            if (c2886aM73979d == null) {
                c28655q2.m87150e0(940339717);
                c2886aM73979d = C38072d.f163053a.m121952e(c28655q2, i15).getH5();
            } else {
                c28655q2.m87150e0(940338229);
            }
            c28655q2.m87173q(r10);
            AbstractC30795n.m94707h(strM21274h, null, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM73979d, Float.valueOf(1.4f), c28655q2, 0, 12582912, 65530);
            c28655q2.m87173q(z13);
            c28655q = c28655q2;
        } else {
            C28655q c28655q5 = c28655q3;
            c28655q5.m87138X();
            c28655q = c28655q5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: m81.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC25230e.m73969y(c25232g, j7, z4, f13, c25231f, function1, function2, i13, (Composer) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098 A[PHI: r16
      0x0098: PHI (r16v18 int) = (r16v0 int), (r16v6 int), (r16v7 int) binds: [B:50:0x0096, B:60:0x00b3, B:59:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x012f  */
    /* JADX WARN: Code duplicated, block: B:91:0x018d  */
    /* JADX WARN: Code duplicated, block: B:94:0x019c  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static final void m73956l(final List<C25232g> viewState, final int i13, final long j7, C39174f c39174f, C25231f c25231f, C25231f c25231f2, final Function1 onSelect, Composer composer, final int i14, final int i15) {
        int i16;
        C39174f c39174f2;
        int i17;
        boolean zM87157i;
        int i18;
        int i19;
        int i24;
        boolean zM87157i2;
        boolean z4;
        C28655q c28655q;
        final C25231f c25231f3;
        final C25231f c25231f4;
        final C39174f c39174f3;
        C28677v1 c28677v1M87180u;
        boolean zM87153g;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        int i25;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onSelect, "onSelect");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(89579867);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87157i(viewState) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87151f(j7) ? 256 : 128;
        }
        int i26 = i15 & 8;
        if (i26 == 0) {
            if ((i14 & 3072) == 0) {
                c39174f2 = c39174f;
                i16 |= c28655q2.m87153g(c39174f2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                i16 |= 24576;
            } else if ((i14 & 24576) == 0) {
                if ((32768 & i14) == 0) {
                    zM87157i = c28655q2.m87153g(c25231f);
                } else {
                    zM87157i = c28655q2.m87157i(c25231f);
                }
                if (zM87157i) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i18;
            }
            i19 = i15 & 32;
            i24 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i19 == 0) {
                i16 |= i24;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    zM87157i2 = c28655q2.m87153g(c25231f2);
                } else {
                    zM87157i2 = c28655q2.m87157i(c25231f2);
                }
                if (zM87157i2) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i24;
            }
            if ((i14 & 1572864) == 0) {
                if (c28655q2.m87157i(onSelect)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i16 |= i25;
            }
            if ((i16 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                if (i26 != 0) {
                    c39174f2 = null;
                }
                if (i17 != 0) {
                    c25231f3 = null;
                } else {
                    c25231f3 = c25231f;
                }
                if (i19 != 0) {
                    c25231f4 = null;
                } else {
                    c25231f4 = c25231f2;
                }
                zM87153g = c28655q2.m87153g(viewState);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q2);
                }
                final InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                final float f13 = ((C39174f) AbstractC12889b.m36281k(new C39174f(((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo733e0(m73960p(interfaceC28593a1))), new C39174f(f99094a))).f168413w;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C24875c(18);
                    c28655q2.m87172p0(objM87133R2);
                }
                final C39174f c39174f4 = c39174f2;
                c28655q = c28655q2;
                AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(viewState)), Integer.valueOf(AbstractC12889b.m36284n(i13, 0, viewState.size() - 1)), AbstractC1127a.m3486a(C2314t.f9131w, (Function1) objM87133R2), AbstractC22977m.m66746i(2 * 4), C2299e.f9108K, AbstractC37817c.m121344e(119953703, c28655q2, new InterfaceC4353o() { // from class: m81.a
                    @Override // c93.InterfaceC4353o
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return AbstractC25230e.m73963s(c39174f4, viewState, j7, f13, c25231f3, c25231f4, interfaceC28593a1, onSelect, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                    }
                }), c28655q, 224640, 0);
                c39174f3 = c39174f4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c25231f3 = c25231f;
                c25231f4 = c25231f2;
                c39174f3 = c39174f2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: m81.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC25230e.m73966v(viewState, i13, j7, c39174f3, c25231f3, c25231f4, onSelect, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        c39174f2 = c39174f;
        i17 = i15 & 16;
        if (i17 != 0) {
            i16 |= 24576;
        } else if ((i14 & 24576) == 0) {
            if ((32768 & i14) == 0) {
                zM87157i = c28655q2.m87153g(c25231f);
            } else {
                zM87157i = c28655q2.m87157i(c25231f);
            }
            if (zM87157i) {
                i18 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i18;
        }
        i19 = i15 & 32;
        i24 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if (i19 == 0) {
            i16 |= i24;
        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                zM87157i2 = c28655q2.m87153g(c25231f2);
            } else {
                zM87157i2 = c28655q2.m87157i(c25231f2);
            }
            if (zM87157i2) {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i24;
        }
        if ((i14 & 1572864) == 0) {
            if (c28655q2.m87157i(onSelect)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i16 |= i25;
        }
        if ((i16 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            if (i26 != 0) {
                c39174f2 = null;
            }
            if (i17 != 0) {
                c25231f3 = null;
            } else {
                c25231f3 = c25231f;
            }
            if (i19 != 0) {
                c25231f4 = null;
            } else {
                c25231f4 = c25231f2;
            }
            zM87153g = c28655q2.m87153g(viewState);
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (zM87153g) {
                objM87133R = AbstractC31061c.m95646v(0, c28655q2);
            } else {
                objM87133R = AbstractC31061c.m95646v(0, c28655q2);
            }
            final InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) objM87133R;
            final float f14 = ((C39174f) AbstractC12889b.m36281k(new C39174f(((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo733e0(m73960p(interfaceC28593a2))), new C39174f(f99094a))).f168413w;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C24875c(18);
                c28655q2.m87172p0(objM87133R2);
            }
            final C39174f c39174f5 = c39174f2;
            c28655q = c28655q2;
            AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(viewState)), Integer.valueOf(AbstractC12889b.m36284n(i13, 0, viewState.size() - 1)), AbstractC1127a.m3486a(C2314t.f9131w, (Function1) objM87133R2), AbstractC22977m.m66746i(2 * 4), C2299e.f9108K, AbstractC37817c.m121344e(119953703, c28655q2, new InterfaceC4353o() { // from class: m81.a
                @Override // c93.InterfaceC4353o
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    return AbstractC25230e.m73963s(c39174f5, viewState, j7, f14, c25231f3, c25231f4, interfaceC28593a2, onSelect, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                }
            }), c28655q, 224640, 0);
            c39174f3 = c39174f5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            c25231f3 = c25231f;
            c25231f4 = c25231f2;
            c39174f3 = c39174f2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: m81.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC25230e.m73966v(viewState, i13, j7, c39174f3, c25231f3, c25231f4, onSelect, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x013d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:110:0x0167  */
    /* JADX WARN: Code duplicated, block: B:113:0x0175  */
    /* JADX WARN: Code duplicated, block: B:115:0x0126 A[EDGE_INSN: B:115:0x0126->B:101:0x0126 BREAK  A[LOOP:0: B:94:0x010b->B:99:0x0122], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1 A[PHI: r15
      0x00a1: PHI (r15v21 int) = (r15v0 int), (r15v6 int), (r15v7 int) binds: [B:54:0x009f, B:64:0x00b9, B:63:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122 A[LOOP:0: B:94:0x010b->B:99:0x0122, LOOP_END] */
    /* JADX INFO: renamed from: m */
    public static final void m73957m(List<C25232g> viewState, String str, long j7, C39174f c39174f, C25231f c25231f, C25231f c25231f2, Function1 onSelect, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        C39174f c39174f2;
        int i17;
        int i18;
        boolean zM87157i;
        int i19;
        int i24;
        int i25;
        boolean zM87157i2;
        boolean z4;
        C25231f c25231f3;
        C25231f c25231f4;
        String str3;
        C39174f c39174f3;
        C28677v1 c28677v1M87180u;
        String str4;
        C39174f c39174f4;
        C25231f c25231f5;
        C25231f c25231f6;
        Object objM87133R;
        C28676v0 c28676v0;
        C28621h1 c28621h1;
        boolean zM87157i3;
        Object objM87133R2;
        Iterator<C25232g> it;
        int i26;
        int i27;
        int i28;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onSelect, "onSelect");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-840249783);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            if ((i13 & 384) != 0) {
                if (c28655q.m87151f(j7)) {
                    i28 = 256;
                } else {
                    i28 = 128;
                }
                i15 |= i28;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    c39174f2 = c39174f;
                    if (c28655q.m87153g(c39174f2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    if ((32768 & i13) == 0) {
                        zM87157i = c28655q.m87153g(c25231f);
                    } else {
                        zM87157i = c28655q.m87157i(c25231f);
                    }
                    if (zM87157i) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if (i24 == 0) {
                    i15 |= i25;
                } else if ((196608 & i13) == 0) {
                    if ((262144 & i13) == 0) {
                        zM87157i2 = c28655q.m87153g(c25231f2);
                    } else {
                        zM87157i2 = c28655q.m87157i(c25231f2);
                    }
                    if (zM87157i2) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(onSelect)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
                if ((599187 & i15) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i29 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i16 != 0) {
                        c39174f4 = null;
                    } else {
                        c39174f4 = c39174f2;
                    }
                    if (i18 != 0) {
                        c25231f5 = null;
                    } else {
                        c25231f5 = c25231f;
                    }
                    if (i24 != 0) {
                        c25231f6 = null;
                    } else {
                        c25231f6 = c25231f2;
                    }
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        it = viewState.iterator();
                        i26 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i26 = -1;
                                break;
                            } else if (AbstractC22676k.m65745e(it.next().getButtonId(), str4)) {
                                break;
                            } else {
                                i26++;
                            }
                        }
                        objM87133R = AbstractC31061c.m95646v(i26, c28655q);
                    }
                    c28621h1 = (C28621h1) ((InterfaceC28593a1) objM87133R);
                    int iM87024x = c28621h1.m87024x();
                    zM87157i3 = c28655q.m87157i(viewState) | ((3670016 & i15) == 1048576);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i3 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C21930h(c28621h1, viewState, onSelect, 17);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m73956l(viewState, iM87024x, j7, c39174f4, c25231f5, c25231f6, (Function1) objM87133R2, c28655q, i15 & 524174, 0);
                    c25231f4 = c25231f6;
                    str3 = str4;
                    c25231f3 = c25231f5;
                    c39174f3 = c39174f4;
                } else {
                    c28655q.m87138X();
                    c25231f3 = c25231f;
                    c25231f4 = c25231f2;
                    str3 = str2;
                    c39174f3 = c39174f2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C25228c(viewState, str3, j7, c39174f3, c25231f3, c25231f4, onSelect, i13, i14);
                }
            }
            i15 |= 3072;
            c39174f2 = c39174f;
            i18 = i14 & 16;
            if (i18 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q.m87153g(c25231f);
                } else {
                    zM87157i = c28655q.m87157i(c25231f);
                }
                if (zM87157i) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i24 == 0) {
                i15 |= i25;
            } else if ((196608 & i13) == 0) {
                if ((262144 & i13) == 0) {
                    zM87157i2 = c28655q.m87153g(c25231f2);
                } else {
                    zM87157i2 = c28655q.m87157i(c25231f2);
                }
                if (zM87157i2) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(onSelect)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
            if ((599187 & i15) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i29 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    c39174f4 = null;
                } else {
                    c39174f4 = c39174f2;
                }
                if (i18 != 0) {
                    c25231f5 = null;
                } else {
                    c25231f5 = c25231f;
                }
                if (i24 != 0) {
                    c25231f6 = null;
                } else {
                    c25231f6 = c25231f2;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    it = viewState.iterator();
                    i26 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i26 = -1;
                            break;
                        } else {
                            if (AbstractC22676k.m65745e(it.next().getButtonId(), str4)) {
                                break;
                                break;
                            }
                            i26++;
                        }
                    }
                    objM87133R = AbstractC31061c.m95646v(i26, c28655q);
                }
                c28621h1 = (C28621h1) ((InterfaceC28593a1) objM87133R);
                int iM87024x2 = c28621h1.m87024x();
                zM87157i3 = c28655q.m87157i(viewState) | ((3670016 & i15) == 1048576);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R2 = new C21930h(c28621h1, viewState, onSelect, 17);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C21930h(c28621h1, viewState, onSelect, 17);
                    c28655q.m87172p0(objM87133R2);
                }
                m73956l(viewState, iM87024x2, j7, c39174f4, c25231f5, c25231f6, (Function1) objM87133R2, c28655q, i15 & 524174, 0);
                c25231f4 = c25231f6;
                str3 = str4;
                c25231f3 = c25231f5;
                c39174f3 = c39174f4;
            } else {
                c28655q.m87138X();
                c25231f3 = c25231f;
                c25231f4 = c25231f2;
                str3 = str2;
                c39174f3 = c39174f2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25228c(viewState, str3, j7, c39174f3, c25231f3, c25231f4, onSelect, i13, i14);
            }
        }
        i15 |= 48;
        str2 = str;
        if ((i13 & 384) != 0) {
            if (c28655q.m87151f(j7)) {
                i28 = 256;
            } else {
                i28 = 128;
            }
            i15 |= i28;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                c39174f2 = c39174f;
                if (c28655q.m87153g(c39174f2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q.m87153g(c25231f);
                } else {
                    zM87157i = c28655q.m87157i(c25231f);
                }
                if (zM87157i) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i24 == 0) {
                i15 |= i25;
            } else if ((196608 & i13) == 0) {
                if ((262144 & i13) == 0) {
                    zM87157i2 = c28655q.m87153g(c25231f2);
                } else {
                    zM87157i2 = c28655q.m87157i(c25231f2);
                }
                if (zM87157i2) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(onSelect)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
            if ((599187 & i15) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i29 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i16 != 0) {
                    c39174f4 = null;
                } else {
                    c39174f4 = c39174f2;
                }
                if (i18 != 0) {
                    c25231f5 = null;
                } else {
                    c25231f5 = c25231f;
                }
                if (i24 != 0) {
                    c25231f6 = null;
                } else {
                    c25231f6 = c25231f2;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    it = viewState.iterator();
                    i26 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i26 = -1;
                            break;
                        } else {
                            if (AbstractC22676k.m65745e(it.next().getButtonId(), str4)) {
                                break;
                                break;
                            }
                            i26++;
                        }
                    }
                    objM87133R = AbstractC31061c.m95646v(i26, c28655q);
                }
                c28621h1 = (C28621h1) ((InterfaceC28593a1) objM87133R);
                int iM87024x3 = c28621h1.m87024x();
                zM87157i3 = c28655q.m87157i(viewState) | ((3670016 & i15) == 1048576);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R2 = new C21930h(c28621h1, viewState, onSelect, 17);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C21930h(c28621h1, viewState, onSelect, 17);
                    c28655q.m87172p0(objM87133R2);
                }
                m73956l(viewState, iM87024x3, j7, c39174f4, c25231f5, c25231f6, (Function1) objM87133R2, c28655q, i15 & 524174, 0);
                c25231f4 = c25231f6;
                str3 = str4;
                c25231f3 = c25231f5;
                c39174f3 = c39174f4;
            } else {
                c28655q.m87138X();
                c25231f3 = c25231f;
                c25231f4 = c25231f2;
                str3 = str2;
                c39174f3 = c39174f2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25228c(viewState, str3, j7, c39174f3, c25231f3, c25231f4, onSelect, i13, i14);
            }
        }
        i15 |= 3072;
        c39174f2 = c39174f;
        i18 = i14 & 16;
        if (i18 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            if ((32768 & i13) == 0) {
                zM87157i = c28655q.m87153g(c25231f);
            } else {
                zM87157i = c28655q.m87157i(c25231f);
            }
            if (zM87157i) {
                i19 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i19;
        }
        i24 = i14 & 32;
        i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if (i24 == 0) {
            i15 |= i25;
        } else if ((196608 & i13) == 0) {
            if ((262144 & i13) == 0) {
                zM87157i2 = c28655q.m87153g(c25231f2);
            } else {
                zM87157i2 = c28655q.m87157i(c25231f2);
            }
            if (zM87157i2) {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i25;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q.m87157i(onSelect)) {
                i27 = 1048576;
            } else {
                i27 = 524288;
            }
            i15 |= i27;
        }
        if ((599187 & i15) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i29 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i16 != 0) {
                c39174f4 = null;
            } else {
                c39174f4 = c39174f2;
            }
            if (i18 != 0) {
                c25231f5 = null;
            } else {
                c25231f5 = c25231f;
            }
            if (i24 != 0) {
                c25231f6 = null;
            } else {
                c25231f6 = c25231f2;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                it = viewState.iterator();
                i26 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i26 = -1;
                        break;
                    } else {
                        if (AbstractC22676k.m65745e(it.next().getButtonId(), str4)) {
                            break;
                            break;
                        }
                        i26++;
                    }
                }
                objM87133R = AbstractC31061c.m95646v(i26, c28655q);
            }
            c28621h1 = (C28621h1) ((InterfaceC28593a1) objM87133R);
            int iM87024x4 = c28621h1.m87024x();
            zM87157i3 = c28655q.m87157i(viewState) | ((3670016 & i15) == 1048576);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i3) {
                objM87133R2 = new C21930h(c28621h1, viewState, onSelect, 17);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C21930h(c28621h1, viewState, onSelect, 17);
                c28655q.m87172p0(objM87133R2);
            }
            m73956l(viewState, iM87024x4, j7, c39174f4, c25231f5, c25231f6, (Function1) objM87133R2, c28655q, i15 & 524174, 0);
            c25231f4 = c25231f6;
            str3 = str4;
            c25231f3 = c25231f5;
            c39174f3 = c39174f4;
        } else {
            c28655q.m87138X();
            c25231f3 = c25231f;
            c25231f4 = c25231f2;
            str3 = str2;
            c39174f3 = c39174f2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25228c(viewState, str3, j7, c39174f3, c25231f3, c25231f4, onSelect, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m73958n(InterfaceC28593a1 interfaceC28593a1, List list, Function1 function1, String buttonId) {
        AbstractC22676k.m65750j(buttonId, "buttonId");
        Iterator it = list.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(((C25232g) it.next()).getButtonId(), buttonId)) {
                ((C28621h1) interfaceC28593a1).m87025y(i13);
                function1.invoke(buttonId);
                return C23454a0.f92919a;
            }
            i13++;
        }
        i13 = -1;
        ((C28621h1) interfaceC28593a1).m87025y(i13);
        function1.invoke(buttonId);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m73959o(List list, String str, long j7, C39174f c39174f, C25231f c25231f, C25231f c25231f2, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m73957m(list, str, j7, c39174f, c25231f, c25231f2, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final int m73960p(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: q */
    private static final void m73961q(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m73962r(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51555f(1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m73963s(C39174f c39174f, List list, long j7, float f13, C25231f c25231f, C25231f c25231f2, InterfaceC28593a1 interfaceC28593a1, Function1 function1, InterfaceC1103a RadioGroup, int i13, C14044a state, Composer composer, int i14) throws XmlPullParserException, IOException {
        int i15;
        AbstractC22676k.m65750j(RadioGroup, "$this$RadioGroup");
        AbstractC22676k.m65750j(state, "state");
        if ((i14 & 48) == 0) {
            i15 = (((C28655q) composer).m87149e(i13) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= ((C28655q) composer).m87153g(state) ? 256 : 128;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 1169) != 1168)) {
            C2314t c2314t = C2314t.f9131w;
            if (i13 != 0 || c39174f == null) {
                c28655q.m87150e0(128106747);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(128040438);
                AbstractC25012a.m73389v(c2314t, c39174f.f168413w, c28655q, false);
            }
            C25232g c25232g = (C25232g) list.get(i13);
            boolean zM39960c = state.getIsSelected();
            C25231f c25231f3 = state.getIsSelected() ? c25231f : c25231f2;
            boolean zM87153g = c28655q.m87153g(interfaceC28593a1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C14362f(interfaceC28593a1, 4);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function2 = (Function1) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87157i(list) | ((i15 & 112) == 32);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C6517d(function1, list, i13, 6);
                c28655q.m87172p0(objM87133R2);
            }
            m73955k(c25232g, j7, zM39960c, f13, c25231f3, function2, (Function1) objM87133R2, c28655q, 0);
            if (i13 != AbstractC37056f.m118951C(list) || c39174f == null) {
                c28655q.m87150e0(128711867);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(128645558);
                AbstractC25012a.m73389v(c2314t, c39174f.f168413w, c28655q, false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m73964t(InterfaceC28593a1 interfaceC28593a1, int i13) {
        if (i13 > m73960p(interfaceC28593a1)) {
            m73961q(interfaceC28593a1, i13);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m73965u(Function1 function1, List list, int i13, boolean z4) {
        function1.invoke(((C25232g) list.get(i13)).getButtonId());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m73966v(List list, int i13, long j7, C39174f c39174f, C25231f c25231f, C25231f c25231f2, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m73956l(list, i13, j7, c39174f, c25231f, c25231f2, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m73967w(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m73968x(Function1 function1, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(Integer.valueOf((int) (it.mo3541n() & 4294967295L)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m73969y(C25232g c25232g, long j7, boolean z4, float f13, C25231f c25231f, Function1 function1, Function1 function2, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m73955k(c25232g, j7, z4, f13, c25231f, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
