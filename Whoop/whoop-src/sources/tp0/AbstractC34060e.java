package tp0;

import android.content.res.Configuration;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2549j2;
import b91.C2886a;
import bv2.C3675b;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17755i2;
import io.sentry.config.AbstractC20301a;
import java.util.Iterator;
import java.util.List;
import kd1.C22411w;
import kotlin.C2026r;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15002f0;
import p163g1.AbstractC15081m5;
import p163g1.C14970c1;
import p163g1.C15071l5;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p702ch0.C4644p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p718lz1.C24823a;
import qz0.AbstractC30795n;
import re1.C31324k;
import sg2.C32458i;
import sp0.C32870j;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39279l;
import y71.AbstractC39281n;
import y71.C39282o;
import z90.AbstractC40203a;

/* JADX INFO: renamed from: tp0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\b\u001ak\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a_\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lsp0/j;", "currentItem", "", "dropdownExpanded", "Lkotlin/Function1;", "Ll83/a0;", "setDropdownExpanded", "Lcom/whoop/design/util/TextResource;", "locationPromptDisplay", "", "dropdownHeight", "", "optionsList", "onItemSelected", "p", "(Lsp0/j;ZLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;ILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "i", "(ZLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;ILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectedItem", "add-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34060e {
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x0172  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m107647i(boolean z4, Function1 setDropdownExpanded, TextResource locationPromptDisplay, int i13, List<C32870j> optionsList, Function1 onItemSelected, Composer composer, int i14, int i15) {
        int i16;
        int i17;
        boolean z13;
        int i18;
        C28677v1 c28677v1M87180u;
        int i19;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i24;
        int i25;
        AbstractC22676k.m65750j(setDropdownExpanded, "setDropdownExpanded");
        AbstractC22676k.m65750j(locationPromptDisplay, "locationPromptDisplay");
        AbstractC22676k.m65750j(optionsList, "optionsList");
        AbstractC22676k.m65750j(onItemSelected, "onItemSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1347670376);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87155h(z4) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87157i(setDropdownExpanded) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? c28655q.m87153g(locationPromptDisplay) : c28655q.m87157i(locationPromptDisplay) ? 256 : 128;
        }
        int i26 = i15 & 8;
        if (i26 == 0) {
            if ((i14 & 3072) == 0) {
                i17 = i13;
                i16 |= c28655q.m87149e(i17) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i14 & 24576) == 0) {
                if (c28655q.m87157i(optionsList)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i25;
            }
            if ((196608 & i14) == 0) {
                if (c28655q.m87157i(onItemSelected)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i24;
            }
            if ((74899 & i16) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i16 & 1, z13)) {
                if (i26 != 0) {
                    i19 = 100;
                } else {
                    i19 = i17;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                int i27 = i19;
                AbstractC20301a.m56339g(C14970c1.m43086a((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a), 0L, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), 0L, 8159), null, C15071l5.m43152a((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a), null, AbstractC33253j.m105489e(2 * 4), 5), AbstractC37817c.m121344e(-576306750, c28655q, new C2549j2(i27, z4, setDropdownExpanded, locationPromptDisplay, optionsList, onItemSelected)), c28655q, 3072, 2);
                c28655q.m87173q(true);
                i18 = i27;
            } else {
                c28655q.m87138X();
                i18 = i17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4644p0(z4, setDropdownExpanded, locationPromptDisplay, i18, optionsList, onItemSelected, i14, i15);
            }
        }
        i16 |= 3072;
        i17 = i13;
        if ((i14 & 24576) == 0) {
            if (c28655q.m87157i(optionsList)) {
                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i25;
        }
        if ((196608 & i14) == 0) {
            if (c28655q.m87157i(onItemSelected)) {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i24;
        }
        if ((74899 & i16) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i16 & 1, z13)) {
            if (i26 != 0) {
                i19 = 100;
            } else {
                i19 = i17;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            int i28 = i19;
            AbstractC20301a.m56339g(C14970c1.m43086a((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a), 0L, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), 0L, 8159), null, C15071l5.m43152a((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a), null, AbstractC33253j.m105489e(2 * 4), 5), AbstractC37817c.m121344e(-576306750, c28655q, new C2549j2(i28, z4, setDropdownExpanded, locationPromptDisplay, optionsList, onItemSelected)), c28655q, 3072, 2);
            c28655q.m87173q(true);
            i18 = i28;
        } else {
            c28655q.m87138X();
            i18 = i17;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4644p0(z4, setDropdownExpanded, locationPromptDisplay, i18, optionsList, onItemSelected, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m107648j(int i13, boolean z4, Function1 function1, TextResource textResource, List list, Function1 function2, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 4;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3417n(AbstractC1102d.m3424u(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp - (8 * f13), C2314t.f9131w), 0.0f, 0.0f, 0.0f, i13 * f13, 7), 1, 0.0f, 2);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C32458i(function1, 13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15002f0.m43105a(z4, (InterfaceC4339a) objM87133R, modifierM3396r, 0L, null, null, AbstractC37817c.m121344e(-1942444945, c28655q, new C2026r((Object) textResource, (Object) list, (Object) function2, (Object) function1, 23)), c28655q, 1572864, 56);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m107649k(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m107650l(TextResource textResource, List list, Function1 function1, Function1 function2, InterfaceC23013y DropdownMenu, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenu, "$this$DropdownMenu");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 8;
            float f14 = 2 * f13;
            AbstractC17755i2.m50938j(AbstractC1099a.m3397s(C2314t.f9131w, f14, f14, 1 * f13, f14), null, null, textResource, null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 246);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C32870j c32870j = (C32870j) it.next();
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c32870j) | c28655q.m87153g(function2);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C31324k(function1, c32870j, function2, 4);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC15002f0.m43106b((InterfaceC4339a) objM87133R, null, false, null, AbstractC37817c.m121344e(-1250905994, c28655q, new C24823a(c32870j, 26)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 30);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m107651m(Function1 function1, C32870j c32870j, Function1 function2) {
        function1.invoke(c32870j);
        function2.invoke(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m107652n(C32870j c32870j, InterfaceC22997s1 DropdownMenuItem, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenuItem, "$this$DropdownMenuItem");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM21274h = AbstractC8693b.m21274h(c32870j.getStrapLocationTitleDisplay(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m107653o(boolean z4, Function1 function1, TextResource textResource, int i13, List list, Function1 function2, int i14, int i15, Composer composer, int i16) {
        m107647i(z4, function1, textResource, i13, list, function2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:101:0x024d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0254  */
    /* JADX WARN: Code duplicated, block: B:105:0x0256  */
    /* JADX WARN: Code duplicated, block: B:110:0x0262  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x02af  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    /* JADX WARN: Code duplicated, block: B:80:0x010e  */
    /* JADX WARN: Code duplicated, block: B:85:0x012f  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0201  */
    /* JADX WARN: Code duplicated, block: B:97:0x020a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final void m107654p(C32870j c32870j, boolean z4, Function1 setDropdownExpanded, TextResource locationPromptDisplay, int i13, List<C32870j> optionsList, Function1 onItemSelected, Composer composer, int i14, int i15) {
        int i16;
        boolean z13;
        int i17;
        C32870j c32870j2;
        C28677v1 c28677v1M87180u;
        C32870j c32870j3;
        int i18;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z14;
        TextResource textResourceM103146b;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R;
        TextResource textResourceM103146b2;
        int i19;
        int i24;
        C32870j c32870j4 = c32870j;
        AbstractC22676k.m65750j(setDropdownExpanded, "setDropdownExpanded");
        AbstractC22676k.m65750j(locationPromptDisplay, "locationPromptDisplay");
        AbstractC22676k.m65750j(optionsList, "optionsList");
        AbstractC22676k.m65750j(onItemSelected, "onItemSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-667526579);
        int i25 = i15 & 1;
        if (i25 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? c28655q.m87153g(c32870j4) : c28655q.m87157i(c32870j4) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87157i(setDropdownExpanded) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? c28655q.m87153g(locationPromptDisplay) : c28655q.m87157i(locationPromptDisplay) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i26 = i15 & 16;
        if (i26 == 0) {
            if ((i14 & 24576) == 0) {
                i16 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i14) == 0) {
                if (c28655q.m87157i(optionsList)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i24;
            }
            if ((1572864 & i14) == 0) {
                if (c28655q.m87157i(onItemSelected)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i16 |= i19;
            }
            if ((599187 & i16) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i16 & 1, z13)) {
                if (i25 != 0) {
                    c32870j4 = null;
                }
                c32870j3 = c32870j4;
                if (i26 != 0) {
                    i18 = 100;
                } else {
                    i18 = i13;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
                float f13 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 1 * f13, 0.0f, 0.0f, 2 * f13, 6);
                String strM21273g = AbstractC8693b.m21273g(AbstractC40203a.f173540M, c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                int i27 = C38072d.f163054b;
                int i28 = i18;
                AbstractC30795n.m94707h(strM21273g, modifierM3398t, c38072d.m121949b(c28655q, i27).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                C22411w c22411w = C22411w.f87680a;
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t, c22411w.m64535a().m64090c()), c38072d.m121949b(c28655q, i27).getBlack10(), c22411w.m64535a().m64090c());
                if (c32870j3 != null || (textResourceM103146b2 = c32870j3.getStrapLocationTitleDisplay()) == null || AbstractC8693b.m21269c(textResourceM103146b2)) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z14) {
                    textResourceM103146b = c32870j3.getStrapLocationTitleDisplay();
                } else {
                    textResourceM103146b = AbstractC8693b.m21277k(AbstractC40203a.f173538K);
                }
                DefaultConstructorMarker defaultConstructorMarker = null;
                C39282o c39282o = new C39282o(null, textResourceM103146b, null, false, false, new AbstractC39279l.b(null, null, null, null, null, null, null, null, null, null, null, false, 4095, defaultConstructorMarker), false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32733, defaultConstructorMarker);
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i16 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | z15;
                objM87133R = c28655q.m87133R();
                if (z17 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3675b(setDropdownExpanded, z4, 11);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC39281n.m125207c(modifierM3358c, c39282o, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 0);
                int i29 = i16 >> 3;
                m107647i(z4, setDropdownExpanded, locationPromptDisplay, i28, optionsList, onItemSelected, c28655q, (i29 & 458752) | (i29 & 126) | (TextResource.$stable << 6) | (i29 & 896) | (i29 & 7168) | (57344 & i29), 0);
                c28655q.m87173q(true);
                i17 = i28;
                c32870j2 = c32870j3;
            } else {
                c28655q.m87138X();
                i17 = i13;
                c32870j2 = c32870j4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C34059d(c32870j2, z4, setDropdownExpanded, locationPromptDisplay, i17, optionsList, onItemSelected, i14, i15);
            }
        }
        i16 |= 24576;
        if ((196608 & i14) == 0) {
            if (c28655q.m87157i(optionsList)) {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i24;
        }
        if ((1572864 & i14) == 0) {
            if (c28655q.m87157i(onItemSelected)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i16 |= i19;
        }
        if ((599187 & i16) != 599186) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i16 & 1, z13)) {
            if (i25 != 0) {
                c32870j4 = null;
            }
            c32870j3 = c32870j4;
            if (i26 != 0) {
                i18 = 100;
            } else {
                i18 = i13;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
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
            float f14 = 8;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 1 * f14, 0.0f, 0.0f, 2 * f14, 6);
            String strM21273g2 = AbstractC8693b.m21273g(AbstractC40203a.f173540M, c28655q, 0);
            C38072d c38072d2 = C38072d.f163053a;
            int i210 = C38072d.f163054b;
            int i211 = i18;
            AbstractC30795n.m94707h(strM21273g2, modifierM3398t2, c38072d2.m121949b(c28655q, i210).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i210).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            C22411w c22411w2 = C22411w.f87680a;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t2, c22411w2.m64535a().m64090c()), c38072d2.m121949b(c28655q, i210).getBlack10(), c22411w2.m64535a().m64090c());
            if (c32870j3 != null) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (z14) {
                textResourceM103146b = AbstractC8693b.m21277k(AbstractC40203a.f173538K);
            } else {
                textResourceM103146b = c32870j3.getStrapLocationTitleDisplay();
            }
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            C39282o c39282o2 = new C39282o(null, textResourceM103146b, null, false, false, new AbstractC39279l.b(null, null, null, null, null, null, null, null, null, null, null, false, 4095, defaultConstructorMarker2), false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32733, defaultConstructorMarker2);
            if ((i16 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i16 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z16 | z15;
            objM87133R = c28655q.m87133R();
            if (z17) {
                objM87133R = new C3675b(setDropdownExpanded, z4, 11);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3675b(setDropdownExpanded, z4, 11);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39281n.m125207c(modifierM3358c2, c39282o2, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 0);
            int i212 = i16 >> 3;
            m107647i(z4, setDropdownExpanded, locationPromptDisplay, i211, optionsList, onItemSelected, c28655q, (i212 & 458752) | (i212 & 126) | (TextResource.$stable << 6) | (i212 & 896) | (i212 & 7168) | (57344 & i212), 0);
            c28655q.m87173q(true);
            i17 = i211;
            c32870j2 = c32870j3;
        } else {
            c28655q.m87138X();
            i17 = i13;
            c32870j2 = c32870j4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34059d(c32870j2, z4, setDropdownExpanded, locationPromptDisplay, i17, optionsList, onItemSelected, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m107655q(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m107656r(C32870j c32870j, boolean z4, Function1 function1, TextResource textResource, int i13, List list, Function1 function2, int i14, int i15, Composer composer, int i16) {
        m107654p(c32870j, z4, function1, textResource, i13, list, function2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
