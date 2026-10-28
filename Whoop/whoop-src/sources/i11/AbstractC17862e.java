package i11;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import cw2.C11161b;
import gb1.AbstractC15676d;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import h11.AbstractC16611f;
import h11.C16613h;
import hb1.C17089l;
import hu1.C17650g;
import java.util.List;
import kd1.AbstractC22407s;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
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
import p026b2.C2314t;
import p163g1.AbstractC15011f9;
import p163g1.C15184w8;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.InterfaceC22965i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: i11.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0099\u0001\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0081\u0001\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "isLoading", "Ll0/i;", "arrangement", "Lcom/whoop/design/util/TextResource;", "text", "backButtonEnabled", "forwardButtonEnabled", "", "backDate", "forwardDate", "Lcom/whoop/navigation/models/GenericInteraction;", "previousInteraction", "nextInteraction", "labelInteraction", "Li11/g;", "dateStrip", "Lkotlin/Function1;", "", "Ll83/a0;", "clickEvent", "q", "(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "j", "(Landroidx/compose/ui/Modifier;Ll0/i;ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "MIN_LABEL_WIDTH", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17862e {

    /* JADX INFO: renamed from: a */
    private static final float f69515a = 40 * 4;

    /* JADX WARN: Code duplicated, block: B:206:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:210:0x04df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x04e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v33 */
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
    /* JADX INFO: renamed from: j */
    private static final void m51351j(final Modifier modifier, final InterfaceC22965i interfaceC22965i, final boolean z4, final TextResource textResource, final boolean z13, final boolean z14, final String str, String str2, final GenericInteraction genericInteraction, GenericInteraction genericInteraction2, final GenericInteraction genericInteraction3, Function1 function1, Composer composer, final int i13, final int i14) {
        int i15;
        int i16;
        C28655q c28655q;
        final GenericInteraction genericInteraction4;
        Modifier modifier2;
        Modifier modifier3;
        C28655q c28655q2;
        ?? r15;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R;
        final String str3 = str2;
        final Function1 function2 = function1;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-783535948);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87153g(interfaceC22965i) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q3.m87153g(textResource) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q3.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i15 |= c28655q3.m87155h(z14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c28655q3.m87153g(str) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= c28655q3.m87153g(str3) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= (i13 & 134217728) == 0 ? c28655q3.m87153g(genericInteraction) : c28655q3.m87157i(genericInteraction) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= (i13 & 1073741824) == 0 ? c28655q3.m87153g(genericInteraction2) : c28655q3.m87157i(genericInteraction2) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | ((i14 & 8) == 0 ? c28655q3.m87153g(genericInteraction3) : c28655q3.m87157i(genericInteraction3) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q3.m87157i(function2) ? 32 : 16;
        }
        int i17 = i16;
        int i18 = i15;
        if (c28655q3.m87135U(i18 & 1, ((i15 & 306783379) == 306783378 && (i17 & 19) == 18) ? false : true)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(interfaceC22965i, C2299e.f9108K, c28655q3, ((((i18 & 112) | 384) >> 3) & 14) | 48);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
            C23000t1 c23000t1 = C23000t1.f90727a;
            Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, false, 1.0f);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierMo66772c);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
            AbstractC27274q.c cVar = AbstractC27274q.c.f109140f;
            C27270o c27270o = new C27270o(cVar, AbstractC16319p0.m46430a().getTinyIcons().getBackwardArrow(), null, null, null, z13, false, false, 0.0f, false, 988, null);
            String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62276R0, c28655q3, 0);
            Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, "DateSelector_Left_Button");
            int i19 = i17 & 112;
            boolean z18 = ((i18 & 234881024) == 67108864 || ((i18 & 134217728) != 0 && c28655q3.m87157i(genericInteraction))) | (i19 == 32) | ((i18 & 3670016) == 1048576);
            Object objM87133R2 = c28655q3.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z18 || objM87133R2 == c28676v0) {
                final int i24 = 0;
                objM87133R2 = new InterfaceC4339a() { // from class: i11.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i24) {
                            case 0:
                                return AbstractC17862e.m51352k(function2, genericInteraction, str);
                            default:
                                return AbstractC17862e.m51356o(function2, genericInteraction, str);
                        }
                    }
                };
                c28655q3.m87172p0(objM87133R2);
            }
            AbstractC27242b1.m82092d(c27270o, strM21273g, modifierM44101d, null, (InterfaceC4339a) objM87133R2, c28655q3, 0, 8);
            c28655q3.m87173q(true);
            Modifier modifierM3425v = AbstractC1102d.m3425v(c23000t1.mo66772c(c2314t, false, 8.0f), f69515a, 0.0f, 2);
            if (genericInteraction3 == null) {
                c28655q3.m87150e0(-716356020);
                c28655q3.m87173q(false);
                modifier2 = null;
            } else {
                c28655q3.m87150e0(-716356019);
                boolean zM87157i = (i19 == 32) | c28655q3.m87157i(genericInteraction3);
                Object objM87133R3 = c28655q3.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new C11161b(function2, genericInteraction3, 2);
                    c28655q3.m87172p0(objM87133R3);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                c28655q3.m87173q(false);
                modifier2 = modifierM3362g;
            }
            if (modifier2 == null) {
                modifier2 = c2314t;
            }
            Modifier modifierMo3471e2 = modifierM3425v.mo3471e(modifier2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q3, 48);
            int iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierMo3471e2);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
            if (z4) {
                c28655q3.m87150e0(-1432548167);
                float f13 = 6 * 4;
                Modifier modifierM3424u = AbstractC1102d.m3424u(f13, AbstractC1102d.m3411h(f13, AbstractC1136a.m3599a(r17, "DateSelectorLottieLoading")));
                InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
                Object objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C17089l(26);
                    c28655q3.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                Object objM87133R5 = c28655q3.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C17650g(10);
                    c28655q3.m87172p0(objM87133R5);
                }
                modifier3 = r17;
                AbstractC35684p.m113047h(modifierM3424u, dVarM113128a, false, 0.0f, 0, interfaceC4339a, (Function1) objM87133R5, null, null, c28655q3, 1769478, 412);
                c28655q2 = c28655q3;
                r15 = 0;
                c28655q2.m87173q(false);
            } else {
                modifier3 = r17;
                c28655q3.m87150e0(-1432122940);
                Modifier modifierM44101d2 = AbstractC15676d.m44101d(modifier3, "DateSelector_Label");
                C38072d c38072d = C38072d.f163053a;
                AbstractC15011f9.m43114b(AbstractC8693b.m21274h(textResource, c28655q3, (i18 >> 9) & 14), modifierM44101d2, c38072d.m121949b(c28655q3, 6).getBrandWhite(), AbstractC22407s.m64512a(c38072d.m121952e(c28655q3, 6).getSh4().getStyle().f92255a.f92192b, 1.5f, c28655q3, 48), null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getSh4().getStyle(), c28655q3, 0, 0, 65008);
                c28655q2 = c28655q3;
                r15 = 0;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            Modifier modifierMo66772c2 = c23000t1.mo66772c(modifier3, r15, 1.0f);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, r15);
            int iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierMo66772c2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
            C27270o c27270o2 = new C27270o(cVar, AbstractC16319p0.m46430a().getTinyIcons().getForwardArrow(), null, null, null, z14, false, false, 0.0f, false, 988, null);
            String strM21273g2 = AbstractC8693b.m21273g(AbstractC16277f.f62333h2, c28655q2, 0);
            Modifier modifierM44101d3 = AbstractC15676d.m44101d(modifier3, "DateSelector_Right_Button");
            boolean z19 = i19 == 32;
            if ((i18 & 1879048192) != 536870912) {
                if ((i18 & 1073741824) != 0) {
                    genericInteraction4 = genericInteraction2;
                    if (c28655q2.m87157i(genericInteraction4)) {
                    }
                    boolean z24 = z19 | z15;
                    if ((i18 & 29360128) == 8388608) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z24 | z16;
                    objM87133R = c28655q2.m87133R();
                    if (!z17 || objM87133R == c28676v0) {
                        final int i25 = 1;
                        str3 = str2;
                        function2 = function1;
                        objM87133R = new InterfaceC4339a() { // from class: i11.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        return AbstractC17862e.m51352k(function2, genericInteraction4, str3);
                                    default:
                                        return AbstractC17862e.m51356o(function2, genericInteraction4, str3);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        str3 = str2;
                        function2 = function1;
                    }
                    C28655q c28655q4 = c28655q2;
                    AbstractC27242b1.m82092d(c27270o2, strM21273g2, modifierM44101d3, null, (InterfaceC4339a) objM87133R, c28655q4, 0, 8);
                    c28655q = c28655q4;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                } else {
                    genericInteraction4 = genericInteraction2;
                }
                z15 = false;
                boolean z25 = z19 | z15;
                if ((i18 & 29360128) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z25 | z16;
                objM87133R = c28655q2.m87133R();
                if (z17) {
                    final int i26 = 1;
                    str3 = str2;
                    function2 = function1;
                    objM87133R = new InterfaceC4339a() { // from class: i11.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i26) {
                                case 0:
                                    return AbstractC17862e.m51352k(function2, genericInteraction4, str3);
                                default:
                                    return AbstractC17862e.m51356o(function2, genericInteraction4, str3);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                } else {
                    final int i27 = 1;
                    str3 = str2;
                    function2 = function1;
                    objM87133R = new InterfaceC4339a() { // from class: i11.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i27) {
                                case 0:
                                    return AbstractC17862e.m51352k(function2, genericInteraction4, str3);
                                default:
                                    return AbstractC17862e.m51356o(function2, genericInteraction4, str3);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                }
                C28655q c28655q5 = c28655q2;
                AbstractC27242b1.m82092d(c27270o2, strM21273g2, modifierM44101d3, null, (InterfaceC4339a) objM87133R, c28655q5, 0, 8);
                c28655q = c28655q5;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                genericInteraction4 = genericInteraction2;
            }
            z15 = true;
            boolean z26 = z19 | z15;
            if ((i18 & 29360128) == 8388608) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z26 | z16;
            objM87133R = c28655q2.m87133R();
            if (z17) {
                final int i28 = 1;
                str3 = str2;
                function2 = function1;
                objM87133R = new InterfaceC4339a() { // from class: i11.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i28) {
                            case 0:
                                return AbstractC17862e.m51352k(function2, genericInteraction4, str3);
                            default:
                                return AbstractC17862e.m51356o(function2, genericInteraction4, str3);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R);
            } else {
                final int i29 = 1;
                str3 = str2;
                function2 = function1;
                objM87133R = new InterfaceC4339a() { // from class: i11.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i29) {
                            case 0:
                                return AbstractC17862e.m51352k(function2, genericInteraction4, str3);
                            default:
                                return AbstractC17862e.m51356o(function2, genericInteraction4, str3);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R);
            }
            C28655q c28655q6 = c28655q2;
            AbstractC27242b1.m82092d(c27270o2, strM21273g2, modifierM44101d3, null, (InterfaceC4339a) objM87133R, c28655q6, 0, 8);
            c28655q = c28655q6;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q3;
            genericInteraction4 = genericInteraction2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final GenericInteraction genericInteraction5 = genericInteraction4;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: i11.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC17862e.m51357p(modifier, interfaceC22965i, z4, textResource, z13, z14, str, str3, genericInteraction, genericInteraction5, genericInteraction3, function2, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m51352k(Function1 function1, GenericInteraction genericInteraction, String str) {
        Object obj = genericInteraction;
        if (genericInteraction == null) {
            obj = str;
        }
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m51353l(Function1 function1, GenericInteraction genericInteraction) {
        function1.invoke(genericInteraction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m51354m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m51355n(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m51356o(Function1 function1, GenericInteraction genericInteraction, String str) {
        Object obj = genericInteraction;
        if (genericInteraction == null) {
            obj = str;
        }
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m51357p(Modifier modifier, InterfaceC22965i interfaceC22965i, boolean z4, TextResource textResource, boolean z13, boolean z14, String str, String str2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51351j(modifier, interfaceC22965i, z4, textResource, z13, z14, str, str2, genericInteraction, genericInteraction2, genericInteraction3, function1, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a  */
    /* JADX WARN: Code duplicated, block: B:102:0x014f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0155  */
    /* JADX WARN: Code duplicated, block: B:105:0x0158  */
    /* JADX WARN: Code duplicated, block: B:107:0x015d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x016c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0170  */
    /* JADX WARN: Code duplicated, block: B:116:0x017a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0182  */
    /* JADX WARN: Code duplicated, block: B:122:0x0188  */
    /* JADX WARN: Code duplicated, block: B:126:0x0198  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01db  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:158:0x0244  */
    /* JADX WARN: Code duplicated, block: B:160:0x0280  */
    /* JADX WARN: Code duplicated, block: B:161:0x0284  */
    /* JADX WARN: Code duplicated, block: B:164:0x0297  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:169:0x0314  */
    /* JADX WARN: Code duplicated, block: B:172:0x0326  */
    /* JADX WARN: Code duplicated, block: B:174:0x0333  */
    /* JADX WARN: Code duplicated, block: B:176:0x0341  */
    /* JADX WARN: Code duplicated, block: B:177:0x0343  */
    /* JADX WARN: Code duplicated, block: B:180:0x034f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x0351  */
    /* JADX WARN: Code duplicated, block: B:185:0x0394  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7 A[PHI: r24
      0x00f7: PHI (r24v27 int) = (r24v6 int), (r24v12 int), (r24v13 int) binds: [B:71:0x00f5, B:81:0x0112, B:80:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0104  */
    /* JADX WARN: Code duplicated, block: B:78:0x0109  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0112  */
    /* JADX WARN: Code duplicated, block: B:84:0x011b A[PHI: r24
      0x011b: PHI (r24v26 int) = (r24v15 int), (r24v21 int), (r24v22 int) binds: [B:83:0x0119, B:93:0x0136, B:92:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0122  */
    /* JADX WARN: Code duplicated, block: B:89:0x0128  */
    /* JADX WARN: Code duplicated, block: B:90:0x012d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0133  */
    /* JADX WARN: Code duplicated, block: B:93:0x0136  */
    /* JADX WARN: Code duplicated, block: B:96:0x013f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0142  */
    /* JADX WARN: Code duplicated, block: B:99:0x0146  */
    /* JADX INFO: renamed from: q */
    public static final void m51358q(Modifier modifier, boolean z4, InterfaceC22965i interfaceC22965i, TextResource text, boolean z13, boolean z14, String backDate, String forwardDate, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, C17864g c17864g, Function1 clickEvent, Composer composer, int i13, int i14, int i15) {
        Modifier modifier2;
        int i16;
        boolean z15;
        InterfaceC22965i interfaceC22965i2;
        int i17;
        int i18;
        boolean zM87157i;
        int i19;
        int i24;
        boolean zM87157i2;
        int i25;
        int i26;
        boolean zM87157i3;
        int i27;
        int i28;
        int i29;
        boolean z16;
        GenericInteraction genericInteraction4;
        GenericInteraction genericInteraction5;
        InterfaceC22965i interfaceC22965i3;
        boolean z17;
        Modifier modifier3;
        GenericInteraction genericInteraction6;
        C17864g c17864g2;
        C28677v1 c28677v1M87180u;
        int i34;
        C2314t c2314t;
        Modifier modifier4;
        boolean z18;
        Modifier modifier5;
        InterfaceC22965i interfaceC22965i4;
        InterfaceC4339a interfaceC4339a;
        GenericInteraction genericInteraction7;
        GenericInteraction genericInteraction8;
        GenericInteraction genericInteraction9;
        C17864g c17864g3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier6;
        InterfaceC22965i interfaceC22965i5;
        GenericInteraction genericInteraction10;
        Object objM87133R;
        C28676v0 c28676v0;
        GenericInteraction genericInteractionM51374a;
        boolean z19;
        boolean zM87157i4;
        Object objM87133R2;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(backDate, "backDate");
        AbstractC22676k.m65750j(forwardDate, "forwardDate");
        AbstractC22676k.m65750j(clickEvent, "clickEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-384358963);
        int i44 = i15 & 1;
        if (i44 != 0) {
            i16 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i16 = i13;
        }
        int i45 = i15 & 2;
        if (i45 != 0) {
            i16 |= 48;
            z15 = z4;
        } else {
            z15 = z4;
            if ((i13 & 48) == 0) {
                i16 |= c28655q.m87155h(z15) ? 32 : 16;
            }
        }
        int i46 = i15 & 4;
        if (i46 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC22965i2 = interfaceC22965i;
                i16 |= c28655q.m87153g(interfaceC22965i2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87153g(text)) {
                    i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i39;
            }
            if ((i13 & 24576) != 0) {
                if (c28655q.m87155h(z13)) {
                    i38 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i38 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i38;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z14)) {
                    i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i37;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87153g(backDate)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i16 |= i36;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87153g(forwardDate)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i16 |= i35;
            }
            i17 = i15 & 256;
            i18 = 100663296;
            if (i17 == 0) {
                i16 |= i18;
            } else if ((i13 & 100663296) == 0) {
                if ((i13 & 134217728) == 0) {
                    zM87157i = c28655q.m87153g(genericInteraction);
                } else {
                    zM87157i = c28655q.m87157i(genericInteraction);
                }
                if (zM87157i) {
                    i18 = 67108864;
                } else {
                    i18 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i18;
            }
            i19 = i15 & 512;
            i24 = 805306368;
            if (i19 == 0) {
                i16 |= i24;
            } else if ((i13 & 805306368) == 0) {
                if ((i13 & 1073741824) == 0) {
                    zM87157i2 = c28655q.m87153g(genericInteraction2);
                } else {
                    zM87157i2 = c28655q.m87157i(genericInteraction2);
                }
                if (zM87157i2) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i16 |= i24;
            }
            i25 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i25 != 0) {
                i26 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if ((i14 & 8) == 0) {
                    zM87157i3 = c28655q.m87153g(genericInteraction3);
                } else {
                    zM87157i3 = c28655q.m87157i(genericInteraction3);
                }
                if (zM87157i3) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i14 | i27;
            } else {
                i26 = i14;
            }
            i28 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i28 != 0) {
                if ((i14 & 48) == 0) {
                    i26 |= c28655q.m87157i(c17864g) ? 32 : 16;
                }
                if ((i14 & 384) == 0) {
                    i26 |= c28655q.m87157i(clickEvent) ? 256 : 128;
                }
                i29 = i26;
                if ((i16 & 306783379) == 306783378 || (i29 & 147) != 146) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    i34 = i29;
                    c2314t = C2314t.f9131w;
                    if (i44 == 0) {
                        modifier4 = c2314t;
                        modifier4 = modifier2;
                    }
                    if (i45 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i46 != 0) {
                        interfaceC22965i2 = AbstractC22977m.f90656g;
                    }
                    modifier5 = modifier4;
                    interfaceC22965i4 = interfaceC22965i2;
                    interfaceC4339a = null;
                    if (i17 != 0) {
                        genericInteraction7 = null;
                    } else {
                        genericInteraction7 = genericInteraction;
                    }
                    if (i19 != 0) {
                        genericInteraction8 = null;
                    } else {
                        genericInteraction8 = genericInteraction2;
                    }
                    if (i25 != 0) {
                        genericInteraction9 = null;
                    } else {
                        genericInteraction9 = genericInteraction3;
                    }
                    if (i28 != 0) {
                        c17864g3 = null;
                    } else {
                        c17864g3 = c17864g;
                    }
                    if (c17864g3 == null) {
                        c28655q.m87150e0(-54121379);
                        int i47 = GenericInteraction.$stable;
                        m51351j(modifier5, interfaceC22965i4, z18, text, z13, z14, backDate, forwardDate, genericInteraction7, genericInteraction8, genericInteraction9, clickEvent, c28655q, (i16 & 14) | ((i16 >> 3) & 112) | ((i16 << 3) & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i47 << 24) | (i16 & 234881024) | (i47 << 27) | (1879048192 & i16), ((i34 >> 3) & 112) | (i34 & 14) | i47);
                        c28655q.m87173q(false);
                        modifier6 = modifier5;
                        genericInteraction10 = genericInteraction7;
                        interfaceC22965i5 = interfaceC22965i4;
                    } else {
                        GenericInteraction genericInteraction11 = genericInteraction7;
                        c28655q.m87150e0(-53551165);
                        Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier5);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
                        int i48 = GenericInteraction.$stable;
                        modifier6 = modifier5;
                        m51351j(c2314t, interfaceC22965i4, z18, text, z13, z14, backDate, forwardDate, genericInteraction11, genericInteraction8, genericInteraction9, clickEvent, c28655q, ((i16 >> 3) & 112) | 6 | ((i16 << 3) & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i48 << 24) | (i16 & 234881024) | (i48 << 27) | (i16 & 1879048192), (i34 & 14) | i48 | ((i34 >> 3) & 112));
                        interfaceC22965i5 = interfaceC22965i4;
                        genericInteraction10 = genericInteraction11;
                        AbstractC11266d.m30469w(2, 4, c2314t, c28655q);
                        Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, "DateSelectorDateStrip");
                        List<C16613h> listM51376c = c17864g3.m51376c();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = new C15184w8(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R;
                        genericInteractionM51374a = c17864g3.getCalendarIconInteraction();
                        if (genericInteractionM51374a == null) {
                            c28655q.m87150e0(1733980292);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1733980293);
                            if ((i34 & 896) == 256) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87157i4 = z19 | c28655q.m87157i(genericInteractionM51374a);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i4 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C11161b(clickEvent, genericInteractionM51374a, 1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a = (InterfaceC4339a) objM87133R2;
                            c28655q.m87173q(false);
                            i34 = i34;
                        }
                        AbstractC16611f.m47150h(modifierM44101d, listM51376c, interfaceC4351m, clickEvent, interfaceC4339a, c17864g3.getLeftCalendarIcon(), c17864g3.getRightCalendarIcon(), "DateSelector_DayPill", c28655q, ((i34 << 3) & 7168) | 12583296, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    z17 = z18;
                    interfaceC22965i3 = interfaceC22965i5;
                    c17864g2 = c17864g3;
                    modifier3 = modifier6;
                    genericInteraction6 = genericInteraction10;
                    genericInteraction4 = genericInteraction8;
                    genericInteraction5 = genericInteraction9;
                } else {
                    c28655q.m87138X();
                    genericInteraction4 = genericInteraction2;
                    genericInteraction5 = genericInteraction3;
                    interfaceC22965i3 = interfaceC22965i2;
                    z17 = z15;
                    modifier3 = modifier2;
                    genericInteraction6 = genericInteraction;
                    c17864g2 = c17864g;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C17859b(modifier3, z17, interfaceC22965i3, text, z13, z14, backDate, forwardDate, genericInteraction6, genericInteraction4, genericInteraction5, c17864g2, clickEvent, i13, i14, i15);
                }
            }
            i26 |= 48;
            if ((i14 & 384) == 0) {
                i26 |= c28655q.m87157i(clickEvent) ? 256 : 128;
            }
            i29 = i26;
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                i34 = i29;
                c2314t = C2314t.f9131w;
                if (i44 == 0) {
                    modifier4 = c2314t;
                    modifier4 = modifier2;
                }
                if (i45 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i46 != 0) {
                    interfaceC22965i2 = AbstractC22977m.f90656g;
                }
                modifier5 = modifier4;
                interfaceC22965i4 = interfaceC22965i2;
                interfaceC4339a = null;
                if (i17 != 0) {
                    genericInteraction7 = null;
                } else {
                    genericInteraction7 = genericInteraction;
                }
                if (i19 != 0) {
                    genericInteraction8 = null;
                } else {
                    genericInteraction8 = genericInteraction2;
                }
                if (i25 != 0) {
                    genericInteraction9 = null;
                } else {
                    genericInteraction9 = genericInteraction3;
                }
                if (i28 != 0) {
                    c17864g3 = null;
                } else {
                    c17864g3 = c17864g;
                }
                if (c17864g3 == null) {
                    c28655q.m87150e0(-54121379);
                    int i49 = GenericInteraction.$stable;
                    m51351j(modifier5, interfaceC22965i4, z18, text, z13, z14, backDate, forwardDate, genericInteraction7, genericInteraction8, genericInteraction9, clickEvent, c28655q, (i16 & 14) | ((i16 >> 3) & 112) | ((i16 << 3) & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i49 << 24) | (i16 & 234881024) | (i49 << 27) | (1879048192 & i16), ((i34 >> 3) & 112) | (i34 & 14) | i49);
                    c28655q.m87173q(false);
                    modifier6 = modifier5;
                    genericInteraction10 = genericInteraction7;
                    interfaceC22965i5 = interfaceC22965i4;
                } else {
                    GenericInteraction genericInteraction12 = genericInteraction7;
                    c28655q.m87150e0(-53551165);
                    Modifier modifierMo3471e2 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier5);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
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
                    int i410 = GenericInteraction.$stable;
                    modifier6 = modifier5;
                    m51351j(c2314t, interfaceC22965i4, z18, text, z13, z14, backDate, forwardDate, genericInteraction12, genericInteraction8, genericInteraction9, clickEvent, c28655q, ((i16 >> 3) & 112) | 6 | ((i16 << 3) & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i410 << 24) | (i16 & 234881024) | (i410 << 27) | (i16 & 1879048192), (i34 & 14) | i410 | ((i34 >> 3) & 112));
                    interfaceC22965i5 = interfaceC22965i4;
                    genericInteraction10 = genericInteraction12;
                    AbstractC11266d.m30469w(2, 4, c2314t, c28655q);
                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t, "DateSelectorDateStrip");
                    List<C16613h> listM51376c2 = c17864g3.m51376c();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15184w8(27);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R;
                    genericInteractionM51374a = c17864g3.getCalendarIconInteraction();
                    if (genericInteractionM51374a == null) {
                        c28655q.m87150e0(1733980292);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1733980293);
                        if ((i34 & 896) == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i4 = z19 | c28655q.m87157i(genericInteractionM51374a);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i4) {
                            objM87133R2 = new C11161b(clickEvent, genericInteractionM51374a, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C11161b(clickEvent, genericInteractionM51374a, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a = (InterfaceC4339a) objM87133R2;
                        c28655q.m87173q(false);
                        i34 = i34;
                    }
                    AbstractC16611f.m47150h(modifierM44101d2, listM51376c2, interfaceC4351m2, clickEvent, interfaceC4339a, c17864g3.getLeftCalendarIcon(), c17864g3.getRightCalendarIcon(), "DateSelector_DayPill", c28655q, ((i34 << 3) & 7168) | 12583296, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                z17 = z18;
                interfaceC22965i3 = interfaceC22965i5;
                c17864g2 = c17864g3;
                modifier3 = modifier6;
                genericInteraction6 = genericInteraction10;
                genericInteraction4 = genericInteraction8;
                genericInteraction5 = genericInteraction9;
            } else {
                c28655q.m87138X();
                genericInteraction4 = genericInteraction2;
                genericInteraction5 = genericInteraction3;
                interfaceC22965i3 = interfaceC22965i2;
                z17 = z15;
                modifier3 = modifier2;
                genericInteraction6 = genericInteraction;
                c17864g2 = c17864g;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17859b(modifier3, z17, interfaceC22965i3, text, z13, z14, backDate, forwardDate, genericInteraction6, genericInteraction4, genericInteraction5, c17864g2, clickEvent, i13, i14, i15);
            }
        }
        i16 |= 384;
        interfaceC22965i2 = interfaceC22965i;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87153g(text)) {
                i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 |= i39;
        }
        if ((i13 & 24576) != 0) {
            if (c28655q.m87155h(z13)) {
                i38 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i38 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i38;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87155h(z14)) {
                i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i37;
        }
        if ((i13 & 1572864) == 0) {
            if (c28655q.m87153g(backDate)) {
                i36 = 1048576;
            } else {
                i36 = 524288;
            }
            i16 |= i36;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q.m87153g(forwardDate)) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i16 |= i35;
        }
        i17 = i15 & 256;
        i18 = 100663296;
        if (i17 == 0) {
            i16 |= i18;
        } else if ((i13 & 100663296) == 0) {
            if ((i13 & 134217728) == 0) {
                zM87157i = c28655q.m87153g(genericInteraction);
            } else {
                zM87157i = c28655q.m87157i(genericInteraction);
            }
            if (zM87157i) {
                i18 = 67108864;
            } else {
                i18 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i18;
        }
        i19 = i15 & 512;
        i24 = 805306368;
        if (i19 == 0) {
            i16 |= i24;
        } else if ((i13 & 805306368) == 0) {
            if ((i13 & 1073741824) == 0) {
                zM87157i2 = c28655q.m87153g(genericInteraction2);
            } else {
                zM87157i2 = c28655q.m87157i(genericInteraction2);
            }
            if (zM87157i2) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i16 |= i24;
        }
        i25 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i25 != 0) {
            i26 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if ((i14 & 8) == 0) {
                zM87157i3 = c28655q.m87153g(genericInteraction3);
            } else {
                zM87157i3 = c28655q.m87157i(genericInteraction3);
            }
            if (zM87157i3) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i14 | i27;
        } else {
            i26 = i14;
        }
        i28 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i28 != 0) {
            if ((i14 & 48) == 0) {
                i26 |= c28655q.m87157i(c17864g) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                i26 |= c28655q.m87157i(clickEvent) ? 256 : 128;
            }
            i29 = i26;
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                i34 = i29;
                c2314t = C2314t.f9131w;
                if (i44 == 0) {
                    modifier4 = c2314t;
                    modifier4 = modifier2;
                }
                if (i45 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i46 != 0) {
                    interfaceC22965i2 = AbstractC22977m.f90656g;
                }
                modifier5 = modifier4;
                interfaceC22965i4 = interfaceC22965i2;
                interfaceC4339a = null;
                if (i17 != 0) {
                    genericInteraction7 = null;
                } else {
                    genericInteraction7 = genericInteraction;
                }
                if (i19 != 0) {
                    genericInteraction8 = null;
                } else {
                    genericInteraction8 = genericInteraction2;
                }
                if (i25 != 0) {
                    genericInteraction9 = null;
                } else {
                    genericInteraction9 = genericInteraction3;
                }
                if (i28 != 0) {
                    c17864g3 = null;
                } else {
                    c17864g3 = c17864g;
                }
                if (c17864g3 == null) {
                    c28655q.m87150e0(-54121379);
                    int i411 = GenericInteraction.$stable;
                    m51351j(modifier5, interfaceC22965i4, z18, text, z13, z14, backDate, forwardDate, genericInteraction7, genericInteraction8, genericInteraction9, clickEvent, c28655q, (i16 & 14) | ((i16 >> 3) & 112) | ((i16 << 3) & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i411 << 24) | (i16 & 234881024) | (i411 << 27) | (1879048192 & i16), ((i34 >> 3) & 112) | (i34 & 14) | i411);
                    c28655q.m87173q(false);
                    modifier6 = modifier5;
                    genericInteraction10 = genericInteraction7;
                    interfaceC22965i5 = interfaceC22965i4;
                } else {
                    GenericInteraction genericInteraction13 = genericInteraction7;
                    c28655q.m87150e0(-53551165);
                    Modifier modifierMo3471e3 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier5);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
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
                    int i412 = GenericInteraction.$stable;
                    modifier6 = modifier5;
                    m51351j(c2314t, interfaceC22965i4, z18, text, z13, z14, backDate, forwardDate, genericInteraction13, genericInteraction8, genericInteraction9, clickEvent, c28655q, ((i16 >> 3) & 112) | 6 | ((i16 << 3) & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i412 << 24) | (i16 & 234881024) | (i412 << 27) | (i16 & 1879048192), (i34 & 14) | i412 | ((i34 >> 3) & 112));
                    interfaceC22965i5 = interfaceC22965i4;
                    genericInteraction10 = genericInteraction13;
                    AbstractC11266d.m30469w(2, 4, c2314t, c28655q);
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(c2314t, "DateSelectorDateStrip");
                    List<C16613h> listM51376c3 = c17864g3.m51376c();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15184w8(27);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) objM87133R;
                    genericInteractionM51374a = c17864g3.getCalendarIconInteraction();
                    if (genericInteractionM51374a == null) {
                        c28655q.m87150e0(1733980292);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1733980293);
                        if ((i34 & 896) == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i4 = z19 | c28655q.m87157i(genericInteractionM51374a);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i4) {
                            objM87133R2 = new C11161b(clickEvent, genericInteractionM51374a, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C11161b(clickEvent, genericInteractionM51374a, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a = (InterfaceC4339a) objM87133R2;
                        c28655q.m87173q(false);
                        i34 = i34;
                    }
                    AbstractC16611f.m47150h(modifierM44101d3, listM51376c3, interfaceC4351m3, clickEvent, interfaceC4339a, c17864g3.getLeftCalendarIcon(), c17864g3.getRightCalendarIcon(), "DateSelector_DayPill", c28655q, ((i34 << 3) & 7168) | 12583296, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                z17 = z18;
                interfaceC22965i3 = interfaceC22965i5;
                c17864g2 = c17864g3;
                modifier3 = modifier6;
                genericInteraction6 = genericInteraction10;
                genericInteraction4 = genericInteraction8;
                genericInteraction5 = genericInteraction9;
            } else {
                c28655q.m87138X();
                genericInteraction4 = genericInteraction2;
                genericInteraction5 = genericInteraction3;
                interfaceC22965i3 = interfaceC22965i2;
                z17 = z15;
                modifier3 = modifier2;
                genericInteraction6 = genericInteraction;
                c17864g2 = c17864g;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17859b(modifier3, z17, interfaceC22965i3, text, z13, z14, backDate, forwardDate, genericInteraction6, genericInteraction4, genericInteraction5, c17864g2, clickEvent, i13, i14, i15);
            }
        }
        i26 |= 48;
        if ((i14 & 384) == 0) {
            i26 |= c28655q.m87157i(clickEvent) ? 256 : 128;
        }
        i29 = i26;
        if ((i16 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q.m87135U(i16 & 1, z16)) {
            i34 = i29;
            c2314t = C2314t.f9131w;
            if (i44 == 0) {
                modifier4 = c2314t;
                modifier4 = modifier2;
            }
            if (i45 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i46 != 0) {
                interfaceC22965i2 = AbstractC22977m.f90656g;
            }
            modifier5 = modifier4;
            interfaceC22965i4 = interfaceC22965i2;
            interfaceC4339a = null;
            if (i17 != 0) {
                genericInteraction7 = null;
            } else {
                genericInteraction7 = genericInteraction;
            }
            if (i19 != 0) {
                genericInteraction8 = null;
            } else {
                genericInteraction8 = genericInteraction2;
            }
            if (i25 != 0) {
                genericInteraction9 = null;
            } else {
                genericInteraction9 = genericInteraction3;
            }
            if (i28 != 0) {
                c17864g3 = null;
            } else {
                c17864g3 = c17864g;
            }
            if (c17864g3 == null) {
                c28655q.m87150e0(-54121379);
                int i413 = GenericInteraction.$stable;
                m51351j(modifier5, interfaceC22965i4, z18, text, z13, z14, backDate, forwardDate, genericInteraction7, genericInteraction8, genericInteraction9, clickEvent, c28655q, (i16 & 14) | ((i16 >> 3) & 112) | ((i16 << 3) & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i413 << 24) | (i16 & 234881024) | (i413 << 27) | (1879048192 & i16), ((i34 >> 3) & 112) | (i34 & 14) | i413);
                c28655q.m87173q(false);
                modifier6 = modifier5;
                genericInteraction10 = genericInteraction7;
                interfaceC22965i5 = interfaceC22965i4;
            } else {
                GenericInteraction genericInteraction14 = genericInteraction7;
                c28655q.m87150e0(-53551165);
                Modifier modifierMo3471e4 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier5);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                int i414 = GenericInteraction.$stable;
                modifier6 = modifier5;
                m51351j(c2314t, interfaceC22965i4, z18, text, z13, z14, backDate, forwardDate, genericInteraction14, genericInteraction8, genericInteraction9, clickEvent, c28655q, ((i16 >> 3) & 112) | 6 | ((i16 << 3) & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i414 << 24) | (i16 & 234881024) | (i414 << 27) | (i16 & 1879048192), (i34 & 14) | i414 | ((i34 >> 3) & 112));
                interfaceC22965i5 = interfaceC22965i4;
                genericInteraction10 = genericInteraction14;
                AbstractC11266d.m30469w(2, 4, c2314t, c28655q);
                Modifier modifierM44101d4 = AbstractC15676d.m44101d(c2314t, "DateSelectorDateStrip");
                List<C16613h> listM51376c4 = c17864g3.m51376c();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C15184w8(27);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4351m interfaceC4351m4 = (InterfaceC4351m) objM87133R;
                genericInteractionM51374a = c17864g3.getCalendarIconInteraction();
                if (genericInteractionM51374a == null) {
                    c28655q.m87150e0(1733980292);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1733980293);
                    if ((i34 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i4 = z19 | c28655q.m87157i(genericInteractionM51374a);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i4) {
                        objM87133R2 = new C11161b(clickEvent, genericInteractionM51374a, 1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C11161b(clickEvent, genericInteractionM51374a, 1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    c28655q.m87173q(false);
                    i34 = i34;
                }
                AbstractC16611f.m47150h(modifierM44101d4, listM51376c4, interfaceC4351m4, clickEvent, interfaceC4339a, c17864g3.getLeftCalendarIcon(), c17864g3.getRightCalendarIcon(), "DateSelector_DayPill", c28655q, ((i34 << 3) & 7168) | 12583296, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            z17 = z18;
            interfaceC22965i3 = interfaceC22965i5;
            c17864g2 = c17864g3;
            modifier3 = modifier6;
            genericInteraction6 = genericInteraction10;
            genericInteraction4 = genericInteraction8;
            genericInteraction5 = genericInteraction9;
        } else {
            c28655q.m87138X();
            genericInteraction4 = genericInteraction2;
            genericInteraction5 = genericInteraction3;
            interfaceC22965i3 = interfaceC22965i2;
            z17 = z15;
            modifier3 = modifier2;
            genericInteraction6 = genericInteraction;
            c17864g2 = c17864g;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17859b(modifier3, z17, interfaceC22965i3, text, z13, z14, backDate, forwardDate, genericInteraction6, genericInteraction4, genericInteraction5, c17864g2, clickEvent, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m51359r(String str, Long l7) {
        AbstractC22676k.m65750j(str, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m51360s(Function1 function1, GenericInteraction genericInteraction) {
        function1.invoke(genericInteraction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m51361t(Modifier modifier, boolean z4, InterfaceC22965i interfaceC22965i, TextResource textResource, boolean z13, boolean z14, String str, String str2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, C17864g c17864g, Function1 function1, int i13, int i14, int i15, Composer composer, int i16) {
        m51358q(modifier, z4, interfaceC22965i, textResource, z13, z14, str, str2, genericInteraction, genericInteraction2, genericInteraction3, c17864g, function1, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }
}
