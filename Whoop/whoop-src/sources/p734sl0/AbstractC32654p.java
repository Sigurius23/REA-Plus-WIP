package p734sl0;

import android.net.Uri;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import j11.AbstractC21211n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import nl0.AbstractC26802d;
import nl0.C26804f;
import nl0.C26810l;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p164g2.InterfaceC15250v;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import re1.C31314a;
import sh2.C32513d;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import xk0.C38423a;

/* JADX INFO: renamed from: sl0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u009d\u0002\u0010\"\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0016\u001a\u00020\u00152&\b\u0002\u0010\u0019\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\f\u0018\u00010\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f0\n2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\"\u0010#\u001a3\u0010(\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lnl0/f;", "viewState", "", "sourceType", "Lcom/whoop/design/util/TextResource;", "placeholderMessage", "", "showPermissionsDisclaimerModal", "Lg2/v;", "focusState", "Lkotlin/Function1;", "Lnl0/d;", "Ll83/a0;", "onViewEvent", "Lml0/a;", "onNavigationEvent", "Lkotlin/Function0;", "onBackPressed", "onUpdateFocusState", "onPermissionApproved", "onPermissionDismissed", "Lsl0/n2;", "mediaPickerLauncher", "Lkotlin/Function3;", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "onFeedbackStateChange", "Lnl0/d$r;", "onRetryImageUpload", "Lnl0/d$j;", "onRemoveImage", "onDisabledInputTapped", "Lsl0/x1;", "autoLaunch", "halfDrawerReadOnly", "j", "(Lnl0/f;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLg2/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lsl0/n2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lsl0/x1;ZLandroidx/compose/runtime/Composer;III)V", "loading", "textFieldDisable", "isUploadingImage", "isImageError", "t", "(ZZLjava/lang/Boolean;Ljava/lang/Boolean;)Z", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32654p {
    /* JADX WARN: Code duplicated, block: B:188:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:189:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:191:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:194:0x033d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0341  */
    /* JADX WARN: Code duplicated, block: B:200:0x035c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0368  */
    /* JADX WARN: Code duplicated, block: B:206:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:208:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:213:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:216:0x0408  */
    /* JADX WARN: Code duplicated, block: B:220:0x041a  */
    /* JADX WARN: Code duplicated, block: B:223:0x0422  */
    /* JADX WARN: Code duplicated, block: B:228:0x0433  */
    /* JADX WARN: Code duplicated, block: B:231:0x043d  */
    /* JADX WARN: Code duplicated, block: B:235:0x044f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0480  */
    /* JADX WARN: Code duplicated, block: B:239:0x0484  */
    /* JADX WARN: Code duplicated, block: B:244:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:247:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:248:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:251:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:254:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:258:0x0511  */
    /* JADX WARN: Code duplicated, block: B:259:0x0514  */
    /* JADX WARN: Code duplicated, block: B:262:0x051b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:265:0x0523  */
    /* JADX WARN: Code duplicated, block: B:268:0x0536  */
    /* JADX WARN: Code duplicated, block: B:269:0x0539  */
    /* JADX WARN: Code duplicated, block: B:272:0x0548 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:275:0x054e  */
    /* JADX WARN: Code duplicated, block: B:278:0x0561  */
    /* JADX WARN: Code duplicated, block: B:279:0x0564  */
    /* JADX WARN: Code duplicated, block: B:282:0x056b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x0571  */
    /* JADX WARN: Code duplicated, block: B:288:0x0582  */
    /* JADX WARN: Code duplicated, block: B:289:0x0585  */
    /* JADX WARN: Code duplicated, block: B:292:0x058c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:293:0x058e  */
    /* JADX WARN: Code duplicated, block: B:296:0x059f  */
    /* JADX WARN: Code duplicated, block: B:298:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:301:0x0614  */
    /* JADX WARN: Code duplicated, block: B:302:0x0685  */
    /* JADX WARN: Code duplicated, block: B:309:0x0431 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:? A[LOOP:0: B:229:0x0437->B:311:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x03fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:? A[LOOP:1: B:214:0x0402->B:314:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static final void m102106j(final C26804f viewState, final String sourceType, final TextResource placeholderMessage, final boolean z4, final InterfaceC15250v interfaceC15250v, final Function1 onViewEvent, final Function1 onNavigationEvent, final InterfaceC4339a onBackPressed, final Function1 onUpdateFocusState, final InterfaceC4339a onPermissionApproved, final InterfaceC4339a onPermissionDismissed, final InterfaceC32647n2 mediaPickerLauncher, Function3 function3, final Function1 onRetryImageUpload, final Function1 onRemoveImage, InterfaceC4339a interfaceC4339a, EnumC32692x1 enumC32692x1, boolean z13, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        C28655q c28655q;
        final Function3 function4;
        final InterfaceC4339a interfaceC4339a2;
        final EnumC32692x1 enumC32692x2;
        final boolean z14;
        int i26;
        InterfaceC4339a interfaceC4339a3;
        boolean z15;
        boolean z16;
        int iHashCode;
        Object objM87133R;
        int i27;
        int i28;
        int i29;
        boolean z17;
        int i34;
        boolean z18;
        boolean z19;
        List<C26810l> listM79952j;
        Boolean boolValueOf;
        List<C26810l> listM79952j2;
        Boolean boolValueOf2;
        int iHashCode2;
        C0213j c0213j;
        C0209i c0209i;
        int i35;
        boolean z24;
        boolean zM87157i;
        Object objM87133R2;
        C28676v0 c28676v0;
        boolean z25;
        Object objM87133R3;
        boolean z26;
        boolean zM87157i2;
        Object objM87133R4;
        boolean z27;
        Object objM87133R5;
        boolean z28;
        Object objM87133R6;
        Object objM87133R7;
        List<C26810l> list;
        Iterator<T> it;
        boolean z29;
        List<C26810l> list2;
        Iterator<T> it3;
        boolean z34;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(sourceType, "sourceType");
        AbstractC22676k.m65750j(placeholderMessage, "placeholderMessage");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        AbstractC22676k.m65750j(onUpdateFocusState, "onUpdateFocusState");
        AbstractC22676k.m65750j(onPermissionApproved, "onPermissionApproved");
        AbstractC22676k.m65750j(onPermissionDismissed, "onPermissionDismissed");
        AbstractC22676k.m65750j(mediaPickerLauncher, "mediaPickerLauncher");
        AbstractC22676k.m65750j(onRetryImageUpload, "onRetryImageUpload");
        AbstractC22676k.m65750j(onRemoveImage, "onRemoveImage");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-989487646);
        if ((i13 & 6) == 0) {
            i16 = i13 | (c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87153g(sourceType) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= (i13 & 512) == 0 ? c28655q2.m87153g(placeholderMessage) : c28655q2.m87157i(placeholderMessage) ? 256 : 128;
        }
        int i36 = i13 & 3072;
        int i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i36 == 0) {
            i16 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i38 = i13 & 24576;
        int i39 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i38 == 0) {
            i16 |= c28655q2.m87157i(interfaceC15250v) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i16 |= c28655q2.m87157i(onViewEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i16 |= c28655q2.m87157i(onNavigationEvent) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i16 |= c28655q2.m87157i(onBackPressed) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i16 |= c28655q2.m87157i(onUpdateFocusState) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i16 |= c28655q2.m87157i(onPermissionApproved) ? 536870912 : 268435456;
        }
        int i44 = i16;
        if ((i14 & 6) == 0) {
            i17 = i14 | (c28655q2.m87157i(onPermissionDismissed) ? 4 : 2);
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= (i14 & 64) == 0 ? c28655q2.m87153g(mediaPickerLauncher) : c28655q2.m87157i(mediaPickerLauncher) ? 32 : 16;
        }
        int i45 = i17;
        int i46 = i15 & 4096;
        if (i46 != 0) {
            i18 = i45 | 384;
            i19 = i46;
            i24 = i14;
        } else {
            i18 = i45;
            i19 = i46;
            i24 = i14;
            if ((i24 & 384) == 0) {
                i18 |= c28655q2.m87157i(function3) ? 256 : 128;
            }
        }
        if ((i24 & 3072) == 0) {
            if (c28655q2.m87157i(onRetryImageUpload)) {
                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            i18 |= i37;
        }
        if ((i24 & 24576) == 0) {
            if (c28655q2.m87157i(onRemoveImage)) {
                i39 = DfuBaseService.ERROR_CONNECTION_MASK;
            }
            i18 |= i39;
        }
        int i47 = i15 & 32768;
        if (i47 != 0) {
            i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i24 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i18 |= c28655q2.m87157i(interfaceC4339a) ? 131072 : 65536;
        }
        int i48 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i48 != 0) {
            i18 |= 1572864;
        } else if ((i14 & 1572864) == 0) {
            i18 |= c28655q2.m87149e(enumC32692x1 == null ? -1 : enumC32692x1.ordinal()) ? 1048576 : 524288;
        }
        int i49 = i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        if (i49 != 0) {
            i49 = i49;
            i25 = i18 | 12582912;
        } else {
            if ((i14 & 12582912) == 0) {
                i18 |= c28655q2.m87155h(z13) ? 8388608 : 4194304;
            }
            i25 = i18;
        }
        int i54 = i25;
        if (c28655q2.m87135U(i44 & 1, ((i44 & 306783379) == 306783378 && (i54 & 4793491) == 4793490) ? false : true)) {
            Function3 function5 = i19 != 0 ? null : function3;
            C28676v0 c28676v1 = C28635l.f115821a;
            if (i47 != 0) {
                Object objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v1) {
                    objM87133R8 = new C32513d(18);
                    c28655q2.m87172p0(objM87133R8);
                }
                int i55 = i49;
                interfaceC4339a3 = (InterfaceC4339a) objM87133R8;
                i26 = i55;
            } else {
                i26 = i49;
                interfaceC4339a3 = interfaceC4339a;
            }
            EnumC32692x1 enumC32692x3 = i48 != 0 ? EnumC32692x1.NONE : enumC32692x1;
            boolean z35 = i26 != 0 ? false : z13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, AbstractC1102d.m3409f(1.0f, c2314t)), C32655p0.f135412a.m102118b(), null, 0.0f, 6));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            Function3 function6 = function5;
            if (c28655q2.f115903S) {
                z15 = z35;
            } else {
                z15 = z35;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                if (1.0f > 0.0d) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!z16) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3398t = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 14 * 4, 0.0f, 0.0f, 13);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v1) {
                    objM87133R = new C31314a(17);
                    c28655q2.m87172p0(objM87133R);
                }
                i27 = i44 & 14;
                i28 = (i44 >> 12) & 112;
                i29 = i54 << 6;
                int i56 = i44 >> 6;
                z17 = z15;
                c28655q = c28655q2;
                AbstractC32679u0.m102395q0(viewState, onViewEvent, sourceType, mediaPickerLauncher, onNavigationEvent, onBackPressed, (InterfaceC4351m) objM87133R, true, function6, null, z17, c28655q, i27 | 14155776 | i28 | ((i44 << 3) & 896) | (i29 & 7168) | (i56 & 57344) | (i56 & 458752) | ((i54 << 18) & 234881024), (i54 >> 21) & 14, 512);
                c28655q.m87173q(true);
                if (z17) {
                    i34 = i44;
                    z18 = true;
                    z19 = false;
                    c28655q.m87150e0(-799398314);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-802259211);
                    AbstractC32650o0.m102057H(viewState, onViewEvent, c28655q, i27 | i28);
                    boolean zM79963u = viewState.getIsWceLoading();
                    boolean zM79947e = viewState.getDisableTextField();
                    listM79952j = viewState.m79952j();
                    if (listM79952j != null) {
                        list2 = listM79952j;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            z34 = false;
                            break;
                        }
                        it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z34 = false;
                                break;
                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                z34 = true;
                                break;
                            }
                        }
                        boolValueOf = Boolean.valueOf(z34);
                    } else {
                        boolValueOf = null;
                    }
                    listM79952j2 = viewState.m79952j();
                    if (listM79952j2 != null) {
                        list = listM79952j2;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            z29 = false;
                            break;
                        }
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z29 = false;
                                break;
                            } else if (((C26810l) it.next()).getIsError()) {
                                z29 = true;
                                break;
                            }
                        }
                        boolValueOf2 = Boolean.valueOf(z29);
                    } else {
                        boolValueOf2 = null;
                    }
                    boolean zM102116t = m102116t(zM79963u, zM79947e, boolValueOf, boolValueOf2);
                    Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "AiCoachWrapperInput");
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3599a);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    int iM79958p = viewState.getSendFieldIcon();
                    InterfaceC39332e interfaceC39332eM79957o = viewState.getSendFieldColor();
                    boolean zM79960r = viewState.getShowStopGenerating();
                    boolean zM79880c = viewState.getConversation().getCanStartNewConversation();
                    C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                    EnumC26811m enumC26811mM79953k = viewState.getLoadingState();
                    boolean zIsEmpty = viewState.getConversation().m79883f().isEmpty();
                    List<C26810l> listM79952j3 = viewState.m79952j();
                    i35 = i44 & 458752;
                    if (i35 == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    zM87157i = z24 | c28655q.m87157i(viewState);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        c28676v0 = c28676v1;
                    } else {
                        c28676v0 = c28676v1;
                        if (objM87133R2 == c28676v0) {
                        }
                        InterfaceC4352n interfaceC4352n = (InterfaceC4352n) objM87133R2;
                        if ((i54 & 7168) == 2048) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z25 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C32599e(onRetryImageUpload, 1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function1 = (Function1) objM87133R3;
                        if (i35 == 131072) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zM87157i2 = z26 | c28655q.m87157i(viewState);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C32634l(onViewEvent, viewState, 0);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                        if ((i54 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z27 || objM87133R5 == c28676v0) {
                            objM87133R5 = new C32639m(onRemoveImage, 0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R5;
                        if (i35 == 131072) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z28 || objM87133R6 == c28676v0) {
                            objM87133R6 = new C32644n(onViewEvent, 0);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R6;
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C31314a(18);
                            c28655q.m87172p0(objM87133R7);
                        }
                        i34 = i44;
                        AbstractC32700z1.m102618e(iM79958p, interfaceC39332eM79957o, placeholderMessage, zM102116t, zM79960r, zM79880c, c26068uM77569a, interfaceC4352n, function1, listM79952j3, interfaceC4339a4, interfaceC4351m, interfaceC4339a5, false, enumC26811mM79953k, zIsEmpty, (InterfaceC4351m) objM87133R7, interfaceC15250v, onUpdateFocusState, mediaPickerLauncher, interfaceC4339a3, enumC32692x3, c28655q, (TextResource.$stable << 6) | (i44 & 896), ((i44 << 9) & 29360128) | 1575936 | (i44 & 234881024) | ((i54 << 24) & 1879048192), (i54 >> 15) & 126, 0);
                        c28655q = c28655q;
                        z18 = true;
                        c28655q.m87173q(true);
                        z19 = false;
                        c28655q.m87173q(false);
                    }
                    objM87133R2 = new C32629k(onViewEvent, viewState, 0);
                    c28655q.m87172p0(objM87133R2);
                    InterfaceC4352n interfaceC4352n2 = (InterfaceC4352n) objM87133R2;
                    if ((i54 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z25) {
                        objM87133R3 = new C32599e(onRetryImageUpload, 1);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32599e(onRetryImageUpload, 1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function1 function2 = (Function1) objM87133R3;
                    if (i35 == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zM87157i2 = z26 | c28655q.m87157i(viewState);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R4 = new C32634l(onViewEvent, viewState, 0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C32634l(onViewEvent, viewState, 0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R4;
                    if ((i54 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z27) {
                        objM87133R5 = new C32639m(onRemoveImage, 0);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C32639m(onRemoveImage, 0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R5;
                    if (i35 == 131072) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z28) {
                        objM87133R6 = new C32644n(onViewEvent, 0);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C32644n(onViewEvent, 0);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C31314a(18);
                        c28655q.m87172p0(objM87133R7);
                    }
                    i34 = i44;
                    AbstractC32700z1.m102618e(iM79958p, interfaceC39332eM79957o, placeholderMessage, zM102116t, zM79960r, zM79880c, c26068uM77569a, interfaceC4352n2, function2, listM79952j3, interfaceC4339a6, interfaceC4351m2, interfaceC4339a7, false, enumC26811mM79953k, zIsEmpty, (InterfaceC4351m) objM87133R7, interfaceC15250v, onUpdateFocusState, mediaPickerLauncher, interfaceC4339a3, enumC32692x3, c28655q, (TextResource.$stable << 6) | (i44 & 896), ((i44 << 9) & 29360128) | 1575936 | (i44 & 234881024) | ((i54 << 24) & 1879048192), (i54 >> 15) & 126, 0);
                    c28655q = c28655q;
                    z18 = true;
                    c28655q.m87173q(true);
                    z19 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z18);
                if (z4) {
                    c28655q.m87150e0(-1461047062);
                    TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159691r);
                    TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC37336b.f159685o);
                    TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC37336b.f159687p);
                    TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC37336b.f159689q);
                    int i57 = TextResource.C8688b.f25889c;
                    int i58 = (i29 & 896) | ((i34 >> 15) & 57344);
                    C28655q c28655q3 = c28655q;
                    AbstractC21211n.m59497o(null, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, true, null, null, null, null, c8688bM21277k4, null, false, false, null, null, false, 0, null, null, null, false, null, onPermissionDismissed, null, onPermissionApproved, null, null, null, c28655q3, (i57 << 3) | 24576 | (i57 << 6) | (i57 << 9) | (i57 << 27), 0, i58, 247463393);
                    c28655q = c28655q3;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1460558688);
                    c28655q.m87173q(z19);
                }
                function4 = function6;
                z14 = z17;
                interfaceC4339a2 = interfaceC4339a3;
                enumC32692x2 = enumC32692x3;
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
            if (1.0f > 0.0d) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (!z16) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 14 * 4, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N4);
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v1) {
                objM87133R = new C31314a(17);
                c28655q2.m87172p0(objM87133R);
            }
            i27 = i44 & 14;
            i28 = (i44 >> 12) & 112;
            i29 = i54 << 6;
            int i59 = i44 >> 6;
            z17 = z15;
            c28655q = c28655q2;
            AbstractC32679u0.m102395q0(viewState, onViewEvent, sourceType, mediaPickerLauncher, onNavigationEvent, onBackPressed, (InterfaceC4351m) objM87133R, true, function6, null, z17, c28655q, i27 | 14155776 | i28 | ((i44 << 3) & 896) | (i29 & 7168) | (i59 & 57344) | (i59 & 458752) | ((i54 << 18) & 234881024), (i54 >> 21) & 14, 512);
            c28655q.m87173q(true);
            if (z17) {
                c28655q.m87150e0(-802259211);
                AbstractC32650o0.m102057H(viewState, onViewEvent, c28655q, i27 | i28);
                boolean zM79963u2 = viewState.getIsWceLoading();
                boolean zM79947e2 = viewState.getDisableTextField();
                listM79952j = viewState.m79952j();
                if (listM79952j != null) {
                    list2 = listM79952j;
                    if (list2 instanceof Collection) {
                        it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z34 = false;
                                break;
                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                z34 = true;
                                break;
                            }
                        }
                    } else {
                        it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z34 = false;
                                break;
                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                z34 = true;
                                break;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z34);
                } else {
                    boolValueOf = null;
                }
                listM79952j2 = viewState.m79952j();
                if (listM79952j2 != null) {
                    list = listM79952j2;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z29 = false;
                                break;
                            } else if (((C26810l) it.next()).getIsError()) {
                                z29 = true;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z29 = false;
                                break;
                            } else if (((C26810l) it.next()).getIsError()) {
                                z29 = true;
                                break;
                            }
                        }
                    }
                    boolValueOf2 = Boolean.valueOf(z29);
                } else {
                    boolValueOf2 = null;
                }
                boolean zM102116t2 = m102116t(zM79963u2, zM79947e2, boolValueOf, boolValueOf2);
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "AiCoachWrapperInput");
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                int iM79958p2 = viewState.getSendFieldIcon();
                InterfaceC39332e interfaceC39332eM79957o2 = viewState.getSendFieldColor();
                boolean zM79960r2 = viewState.getShowStopGenerating();
                boolean zM79880c2 = viewState.getConversation().getCanStartNewConversation();
                C26068u c26068uM77569a2 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                EnumC26811m enumC26811mM79953k2 = viewState.getLoadingState();
                boolean zIsEmpty2 = viewState.getConversation().m79883f().isEmpty();
                List<C26810l> listM79952j4 = viewState.m79952j();
                i35 = i44 & 458752;
                if (i35 == 131072) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zM87157i = z24 | c28655q.m87157i(viewState);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    c28676v0 = c28676v1;
                    if (objM87133R2 == c28676v0) {
                    }
                    InterfaceC4352n interfaceC4352n3 = (InterfaceC4352n) objM87133R2;
                    if ((i54 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z25) {
                        objM87133R3 = new C32599e(onRetryImageUpload, 1);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32599e(onRetryImageUpload, 1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function1 function7 = (Function1) objM87133R3;
                    if (i35 == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zM87157i2 = z26 | c28655q.m87157i(viewState);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R4 = new C32634l(onViewEvent, viewState, 0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C32634l(onViewEvent, viewState, 0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                    if ((i54 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z27) {
                        objM87133R5 = new C32639m(onRemoveImage, 0);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C32639m(onRemoveImage, 0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) objM87133R5;
                    if (i35 == 131072) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z28) {
                        objM87133R6 = new C32644n(onViewEvent, 0);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C32644n(onViewEvent, 0);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R6;
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C31314a(18);
                        c28655q.m87172p0(objM87133R7);
                    }
                    i34 = i44;
                    AbstractC32700z1.m102618e(iM79958p2, interfaceC39332eM79957o2, placeholderMessage, zM102116t2, zM79960r2, zM79880c2, c26068uM77569a2, interfaceC4352n3, function7, listM79952j4, interfaceC4339a8, interfaceC4351m3, interfaceC4339a9, false, enumC26811mM79953k2, zIsEmpty2, (InterfaceC4351m) objM87133R7, interfaceC15250v, onUpdateFocusState, mediaPickerLauncher, interfaceC4339a3, enumC32692x3, c28655q, (TextResource.$stable << 6) | (i44 & 896), ((i44 << 9) & 29360128) | 1575936 | (i44 & 234881024) | ((i54 << 24) & 1879048192), (i54 >> 15) & 126, 0);
                    c28655q = c28655q;
                    z18 = true;
                    c28655q.m87173q(true);
                    z19 = false;
                    c28655q.m87173q(false);
                } else {
                    c28676v0 = c28676v1;
                }
                objM87133R2 = new C32629k(onViewEvent, viewState, 0);
                c28655q.m87172p0(objM87133R2);
                InterfaceC4352n interfaceC4352n4 = (InterfaceC4352n) objM87133R2;
                if ((i54 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z25) {
                    objM87133R3 = new C32599e(onRetryImageUpload, 1);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C32599e(onRetryImageUpload, 1);
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function8 = (Function1) objM87133R3;
                if (i35 == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zM87157i2 = z26 | c28655q.m87157i(viewState);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new C32634l(onViewEvent, viewState, 0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C32634l(onViewEvent, viewState, 0);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R4;
                if ((i54 & 57344) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z27) {
                    objM87133R5 = new C32639m(onRemoveImage, 0);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C32639m(onRemoveImage, 0);
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4351m interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                if (i35 == 131072) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z28) {
                    objM87133R6 = new C32644n(onViewEvent, 0);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C32644n(onViewEvent, 0);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R6;
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C31314a(18);
                    c28655q.m87172p0(objM87133R7);
                }
                i34 = i44;
                AbstractC32700z1.m102618e(iM79958p2, interfaceC39332eM79957o2, placeholderMessage, zM102116t2, zM79960r2, zM79880c2, c26068uM77569a2, interfaceC4352n4, function8, listM79952j4, interfaceC4339a10, interfaceC4351m4, interfaceC4339a11, false, enumC26811mM79953k2, zIsEmpty2, (InterfaceC4351m) objM87133R7, interfaceC15250v, onUpdateFocusState, mediaPickerLauncher, interfaceC4339a3, enumC32692x3, c28655q, (TextResource.$stable << 6) | (i44 & 896), ((i44 << 9) & 29360128) | 1575936 | (i44 & 234881024) | ((i54 << 24) & 1879048192), (i54 >> 15) & 126, 0);
                c28655q = c28655q;
                z18 = true;
                c28655q.m87173q(true);
                z19 = false;
                c28655q.m87173q(false);
            } else {
                i34 = i44;
                z18 = true;
                z19 = false;
                c28655q.m87150e0(-799398314);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z18);
            if (z4) {
                c28655q.m87150e0(-1461047062);
                TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC37336b.f159691r);
                TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC37336b.f159685o);
                TextResource.C8688b c8688bM21277k7 = AbstractC8693b.m21277k(AbstractC37336b.f159687p);
                TextResource.C8688b c8688bM21277k8 = AbstractC8693b.m21277k(AbstractC37336b.f159689q);
                int i510 = TextResource.C8688b.f25889c;
                int i511 = (i29 & 896) | ((i34 >> 15) & 57344);
                C28655q c28655q4 = c28655q;
                AbstractC21211n.m59497o(null, c8688bM21277k5, c8688bM21277k6, c8688bM21277k7, true, null, null, null, null, c8688bM21277k8, null, false, false, null, null, false, 0, null, null, null, false, null, onPermissionDismissed, null, onPermissionApproved, null, null, null, c28655q4, (i510 << 3) | 24576 | (i510 << 6) | (i510 << 9) | (i510 << 27), 0, i511, 247463393);
                c28655q = c28655q4;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1460558688);
                c28655q.m87173q(z19);
            }
            function4 = function6;
            z14 = z17;
            interfaceC4339a2 = interfaceC4339a3;
            enumC32692x2 = enumC32692x3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function4 = function3;
            interfaceC4339a2 = interfaceC4339a;
            enumC32692x2 = enumC32692x1;
            z14 = z13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.o
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC32654p.m102115s(viewState, sourceType, placeholderMessage, z4, interfaceC15250v, onViewEvent, onNavigationEvent, onBackPressed, onUpdateFocusState, onPermissionApproved, onPermissionDismissed, mediaPickerLauncher, function4, onRetryImageUpload, onRemoveImage, interfaceC4339a2, enumC32692x2, z14, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m102107k() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m102108l(C38423a.a aVar, boolean z4) {
        AbstractC22676k.m65750j(aVar, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m102109m(Function1 function1, C26804f c26804f, String message, List list, List list2, boolean z4) {
        AbstractC22676k.m65750j(message, "message");
        function1.invoke(new AbstractC26802d.l(message, c26804f.getConversation().m79883f().size(), null, list, list2, z4, null, 68, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m102110n(Function1 function1, Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        function1.invoke(new AbstractC26802d.r(AbstractC37056f.m118958J(uri)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m102111o(Function1 function1, C26804f c26804f) {
        function1.invoke(new AbstractC26802d.n(c26804f.getConversation().getId(), null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m102112p(Function1 function1, String str, Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        function1.invoke(new AbstractC26802d.j(str, uri));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m102113q(Function1 function1) {
        function1.invoke(AbstractC26802d.i.f106778a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m102114r(C38423a.a aVar, boolean z4) {
        AbstractC22676k.m65750j(aVar, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m102115s(C26804f c26804f, String str, TextResource textResource, boolean z4, InterfaceC15250v interfaceC15250v, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC32647n2 interfaceC32647n2, Function3 function4, Function1 function5, Function1 function6, InterfaceC4339a interfaceC4339a4, EnumC32692x1 enumC32692x1, boolean z13, int i13, int i14, int i15, Composer composer, int i16) {
        m102106j(c26804f, str, textResource, z4, interfaceC15250v, function1, function2, interfaceC4339a, function3, interfaceC4339a2, interfaceC4339a3, interfaceC32647n2, function4, function5, function6, interfaceC4339a4, enumC32692x1, z13, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m102116t(boolean z4, boolean z13, Boolean bool, Boolean bool2) {
        if (z4 || z13) {
            return false;
        }
        Boolean bool3 = Boolean.TRUE;
        return (AbstractC22676k.m65745e(bool, bool3) || AbstractC22676k.m65745e(bool2, bool3)) ? false : true;
    }
}
