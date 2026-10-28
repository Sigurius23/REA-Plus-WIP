package c41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import az1.C2161b;
import b01.C2192m;
import bf0.C3198j;
import bm2.C3434d1;
import bs1.C3590i;
import c31.C3929m;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import i91.AbstractC18249c;
import java.util.List;
import kd1.AbstractC22391d0;
import kotlin.C2032u;
import l83.C23454a0;
import l83.C23470p;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: c41.y4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u00ad\u0001\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u000e\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\u000e\u0010\u001b\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ly81/f;", "backgroundColor", "", "Lcom/whoop/design/util/TextResource;", "dayLabelList", "title", "", "isTileExpanded", "isTagVisible", "Lhy0/h1;", "tagState", "editActionText", "deleteActionText", "Lkotlin/Function1;", "Ll83/a0;", "tileExpandedListener", "Lkotlin/Function0;", "editButtonClicked", "deleteButtonClicked", "", "onViewEvent", "n", "(Landroidx/compose/ui/Modifier;Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "j", "(Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "isExpanded", "", "titleBarEndContentRotation", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4157y4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    private static final void m12958j(TextResource textResource, InterfaceC4339a interfaceC4339a, TextResource textResource2, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        TextResource textResource3;
        int i14;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1772835294);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            textResource3 = textResource;
            i14 = (c28655q2.m87153g(textResource3) ? 4 : 2) | i13;
        } else {
            textResource3 = textResource;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(textResource2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            float f13 = 2;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(8 * f13, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            int i16 = i14;
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
            C38072d c38072d = C38072d.f163053a;
            C39274g c39274g = new C39274g(AbstractC25012a.m73365A(c38072d), null, i15, 0 == true ? 1 : 0);
            boolean z4 = (i16 & 112) == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C2161b(interfaceC4339a, 6);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC27265l0.m82217i(null, enumC27269n0, textResource3, c39274g, null, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q2, ((i16 << 6) & 896) | 48, 0, 4081);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13 * 4, c2314t));
            C39274g c39274g2 = new C39274g(c38072d.m121951d().getAction().getDelete(), null, i15, 0 == true ? 1 : 0);
            boolean z13 = (i16 & 7168) == 2048;
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                interfaceC4339a3 = interfaceC4339a2;
                objM87133R2 = new C2161b(interfaceC4339a3, 7);
                c28655q2.m87172p0(objM87133R2);
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            AbstractC27265l0.m82217i(null, enumC27269n0, textResource2, c39274g2, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q2, (i16 & 896) | 48, 0, 4081);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3434d1(textResource, interfaceC4339a, textResource2, interfaceC4339a3, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m12959k(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m12960l(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m12961m(TextResource textResource, InterfaceC4339a interfaceC4339a, TextResource textResource2, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m12958j(textResource, interfaceC4339a, textResource2, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:107:0x015a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0168  */
    /* JADX WARN: Code duplicated, block: B:115:0x0171  */
    /* JADX WARN: Code duplicated, block: B:118:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x017c  */
    /* JADX WARN: Code duplicated, block: B:120:0x017f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x0185  */
    /* JADX WARN: Code duplicated, block: B:125:0x0188  */
    /* JADX WARN: Code duplicated, block: B:126:0x018a  */
    /* JADX WARN: Code duplicated, block: B:128:0x018d  */
    /* JADX WARN: Code duplicated, block: B:129:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0195  */
    /* JADX WARN: Code duplicated, block: B:134:0x019b  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:142:0x01be  */
    /* JADX WARN: Code duplicated, block: B:145:0x020d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0211  */
    /* JADX WARN: Code duplicated, block: B:149:0x0224  */
    /* JADX WARN: Code duplicated, block: B:151:0x0232  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:74:0x0102  */
    /* JADX WARN: Code duplicated, block: B:78:0x010c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0126  */
    /* JADX WARN: Code duplicated, block: B:89:0x012a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0134  */
    /* JADX WARN: Code duplicated, block: B:92:0x0137  */
    /* JADX WARN: Code duplicated, block: B:96:0x013f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0145  */
    /* JADX WARN: Code duplicated, block: B:99:0x0148  */
    /* JADX INFO: renamed from: n */
    public static final void m12962n(Modifier modifier, EnumC39333f enumC39333f, List<? extends TextResource> dayLabelList, TextResource title, boolean z4, boolean z13, C17750h1 c17750h1, TextResource editActionText, TextResource deleteActionText, Function1 function1, InterfaceC4339a editButtonClicked, InterfaceC4339a deleteButtonClicked, Function1 onViewEvent, Composer composer, int i13, int i14, int i15) {
        int i16;
        boolean z14;
        int i17;
        boolean z15;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z16;
        C28655q c28655q;
        Function1 function2;
        boolean z17;
        boolean z18;
        C17750h1 c17750h2;
        EnumC39333f enumC39333f2;
        C28677v1 c28677v1M87180u;
        EnumC39333f enumC39333f3;
        boolean z19;
        boolean z24;
        C17750h1 c17750h3;
        C28676v0 c28676v0;
        Function1 function3;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R3;
        int i28;
        int i29;
        int i34;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(dayLabelList, "dayLabelList");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(editActionText, "editActionText");
        AbstractC22676k.m65750j(deleteActionText, "deleteActionText");
        AbstractC22676k.m65750j(editButtonClicked, "editButtonClicked");
        AbstractC22676k.m65750j(deleteButtonClicked, "deleteButtonClicked");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1376958385);
        if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        int i35 = i15 & 2;
        if (i35 != 0) {
            i16 |= 48;
        } else if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87149e(enumC39333f == null ? -1 : enumC39333f.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q2.m87157i(dayLabelList) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i16 |= c28655q2.m87153g(title) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i36 = i15 & 16;
        if (i36 == 0) {
            if ((i13 & 24576) == 0) {
                z14 = z4;
                i16 |= c28655q2.m87155h(z14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z15 = z13;
            } else {
                z15 = z13;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
            }
            i19 = i15 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(c17750h1)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87153g(editActionText)) {
                    i34 = 8388608;
                } else {
                    i34 = 4194304;
                }
                i16 |= i34;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87153g(deleteActionText)) {
                    i29 = 67108864;
                } else {
                    i29 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i29;
            }
            i25 = i15 & 512;
            if (i25 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i16 |= i26;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(editButtonClicked)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i14 | i28;
                } else {
                    i27 = i14;
                }
                if ((i14 & 48) == 0) {
                    i27 |= c28655q2.m87157i(deleteButtonClicked) ? 32 : 16;
                }
                if ((i16 & 306783379) == 306783378 || (i27 & 19) != 18) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q2.m87135U(i16 & 1, z16)) {
                    if (i35 != 0) {
                        enumC39333f3 = EnumC39333f.WHITE_10;
                    } else {
                        enumC39333f3 = enumC39333f;
                    }
                    if (i36 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i17 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i19 != 0) {
                        c17750h3 = null;
                    } else {
                        c17750h3 = c17750h1;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C3929m(23);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function3 = (Function1) objM87133R3;
                    } else {
                        function3 = function1;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z19, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    boolean z25 = z19;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C2192m(9, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    C23470p c23470pM92088H = AbstractC30060g.m92088H((InterfaceC4339a) objM87133R2);
                    Modifier modifierM52565c = AbstractC18249c.m52565c(modifier, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q2, 6).getWhite5()));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    int i37 = i16;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM52565c);
                    InterfaceC0221l.f734a.getClass();
                    Function1 function4 = function3;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    boolean z26 = z24;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    enumC39333f = enumC39333f3;
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(null, null, enumC39333f3.mo134584toComposableColorWaAFU9c(c28655q2, (i37 >> 3) & 14), null, null, null, 0.0f, AbstractC37817c.m121344e(-1263418901, c28655q, new C3198j(function4, interfaceC28601c1, dayLabelList, title, z26, c17750h3, c23470pM92088H)), c28655q, 12582912, 123);
                    AbstractC22391d0.m64437c(m12964p(interfaceC28601c1), AbstractC3788w0.m11577e(AbstractC11348f.m30574v(400, 0, null, 6), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(200, 0, null, 6), 2), AbstractC37817c.m121344e(-1931901963, c28655q, new C2032u(editActionText, editButtonClicked, deleteActionText, deleteButtonClicked, 4)), c28655q, 3504, 0);
                    c28655q.m87173q(true);
                    z17 = z25;
                    z18 = z26;
                    c17750h2 = c17750h3;
                    function2 = function4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function2 = function1;
                    z17 = z14;
                    z18 = z15;
                    c17750h2 = c17750h1;
                }
                enumC39333f2 = enumC39333f;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4150x4(modifier, enumC39333f2, dayLabelList, title, z17, z18, c17750h2, editActionText, deleteActionText, function2, editButtonClicked, deleteButtonClicked, onViewEvent, i13, i14, i15);
                }
            }
            i16 |= 805306368;
            if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(editButtonClicked)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i14 | i28;
            } else {
                i27 = i14;
            }
            if ((i14 & 48) == 0) {
                i27 |= c28655q2.m87157i(deleteButtonClicked) ? 32 : 16;
            }
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z16)) {
                if (i35 != 0) {
                    enumC39333f3 = EnumC39333f.WHITE_10;
                } else {
                    enumC39333f3 = enumC39333f;
                }
                if (i36 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i17 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i19 != 0) {
                    c17750h3 = null;
                } else {
                    c17750h3 = c17750h1;
                }
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3929m(23);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function1;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z19, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                boolean z27 = z19;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C2192m(9, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R2);
                }
                C23470p c23470pM92088H2 = AbstractC30060g.m92088H((InterfaceC4339a) objM87133R2);
                Modifier modifierM52565c2 = AbstractC18249c.m52565c(modifier, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q2, 6).getWhite5()));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                int i38 = i16;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM52565c2);
                InterfaceC0221l.f734a.getClass();
                Function1 function5 = function3;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                boolean z28 = z24;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                enumC39333f = enumC39333f3;
                c28655q = c28655q2;
                AbstractC31926e.m99375j(null, null, enumC39333f3.mo134584toComposableColorWaAFU9c(c28655q2, (i38 >> 3) & 14), null, null, null, 0.0f, AbstractC37817c.m121344e(-1263418901, c28655q, new C3198j(function5, interfaceC28601c1, dayLabelList, title, z28, c17750h3, c23470pM92088H2)), c28655q, 12582912, 123);
                AbstractC22391d0.m64437c(m12964p(interfaceC28601c1), AbstractC3788w0.m11577e(AbstractC11348f.m30574v(400, 0, null, 6), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(200, 0, null, 6), 2), AbstractC37817c.m121344e(-1931901963, c28655q, new C2032u(editActionText, editButtonClicked, deleteActionText, deleteButtonClicked, 4)), c28655q, 3504, 0);
                c28655q.m87173q(true);
                z17 = z27;
                z18 = z28;
                c17750h2 = c17750h3;
                function2 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function2 = function1;
                z17 = z14;
                z18 = z15;
                c17750h2 = c17750h1;
            }
            enumC39333f2 = enumC39333f;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4150x4(modifier, enumC39333f2, dayLabelList, title, z17, z18, c17750h2, editActionText, deleteActionText, function2, editButtonClicked, deleteButtonClicked, onViewEvent, i13, i14, i15);
            }
        }
        i16 |= 24576;
        z14 = z4;
        i17 = i15 & 32;
        if (i17 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z15 = z13;
        } else {
            z15 = z13;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
        }
        i19 = i15 & 64;
        if (i19 != 0) {
            i16 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q2.m87157i(c17750h1)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i16 |= i24;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q2.m87153g(editActionText)) {
                i34 = 8388608;
            } else {
                i34 = 4194304;
            }
            i16 |= i34;
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q2.m87153g(deleteActionText)) {
                i29 = 67108864;
            } else {
                i29 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i29;
        }
        i25 = i15 & 512;
        if (i25 != 0) {
            if ((i13 & 805306368) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i16 |= i26;
            }
            if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(editButtonClicked)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i14 | i28;
            } else {
                i27 = i14;
            }
            if ((i14 & 48) == 0) {
                i27 |= c28655q2.m87157i(deleteButtonClicked) ? 32 : 16;
            }
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z16)) {
                if (i35 != 0) {
                    enumC39333f3 = EnumC39333f.WHITE_10;
                } else {
                    enumC39333f3 = enumC39333f;
                }
                if (i36 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i17 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i19 != 0) {
                    c17750h3 = null;
                } else {
                    c17750h3 = c17750h1;
                }
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3929m(23);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function1;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z19, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                boolean z29 = z19;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C2192m(9, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R2);
                }
                C23470p c23470pM92088H3 = AbstractC30060g.m92088H((InterfaceC4339a) objM87133R2);
                Modifier modifierM52565c3 = AbstractC18249c.m52565c(modifier, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q2, 6).getWhite5()));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                int i39 = i16;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM52565c3);
                InterfaceC0221l.f734a.getClass();
                Function1 function6 = function3;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                boolean z210 = z24;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                enumC39333f = enumC39333f3;
                c28655q = c28655q2;
                AbstractC31926e.m99375j(null, null, enumC39333f3.mo134584toComposableColorWaAFU9c(c28655q2, (i39 >> 3) & 14), null, null, null, 0.0f, AbstractC37817c.m121344e(-1263418901, c28655q, new C3198j(function6, interfaceC28601c1, dayLabelList, title, z210, c17750h3, c23470pM92088H3)), c28655q, 12582912, 123);
                AbstractC22391d0.m64437c(m12964p(interfaceC28601c1), AbstractC3788w0.m11577e(AbstractC11348f.m30574v(400, 0, null, 6), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(200, 0, null, 6), 2), AbstractC37817c.m121344e(-1931901963, c28655q, new C2032u(editActionText, editButtonClicked, deleteActionText, deleteButtonClicked, 4)), c28655q, 3504, 0);
                c28655q.m87173q(true);
                z17 = z29;
                z18 = z210;
                c17750h2 = c17750h3;
                function2 = function6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function2 = function1;
                z17 = z14;
                z18 = z15;
                c17750h2 = c17750h1;
            }
            enumC39333f2 = enumC39333f;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4150x4(modifier, enumC39333f2, dayLabelList, title, z17, z18, c17750h2, editActionText, deleteActionText, function2, editButtonClicked, deleteButtonClicked, onViewEvent, i13, i14, i15);
            }
        }
        i16 |= 805306368;
        if ((i14 & 6) == 0) {
            if (c28655q2.m87157i(editButtonClicked)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i27 = i14 | i28;
        } else {
            i27 = i14;
        }
        if ((i14 & 48) == 0) {
            i27 |= c28655q2.m87157i(deleteButtonClicked) ? 32 : 16;
        }
        if ((i16 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q2.m87135U(i16 & 1, z16)) {
            if (i35 != 0) {
                enumC39333f3 = EnumC39333f.WHITE_10;
            } else {
                enumC39333f3 = enumC39333f;
            }
            if (i36 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            if (i17 != 0) {
                z24 = false;
            } else {
                z24 = z15;
            }
            if (i19 != 0) {
                c17750h3 = null;
            } else {
                c17750h3 = c17750h1;
            }
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C3929m(23);
                    c28655q2.m87172p0(objM87133R3);
                }
                function3 = (Function1) objM87133R3;
            } else {
                function3 = function1;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95647w(z19, c28655q2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean z211 = z19;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C2192m(9, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R2);
            }
            C23470p c23470pM92088H4 = AbstractC30060g.m92088H((InterfaceC4339a) objM87133R2);
            Modifier modifierM52565c4 = AbstractC18249c.m52565c(modifier, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q2, 6).getWhite5()));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int i310 = i16;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM52565c4);
            InterfaceC0221l.f734a.getClass();
            Function1 function7 = function3;
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            boolean z212 = z24;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            enumC39333f = enumC39333f3;
            c28655q = c28655q2;
            AbstractC31926e.m99375j(null, null, enumC39333f3.mo134584toComposableColorWaAFU9c(c28655q2, (i310 >> 3) & 14), null, null, null, 0.0f, AbstractC37817c.m121344e(-1263418901, c28655q, new C3198j(function7, interfaceC28601c1, dayLabelList, title, z212, c17750h3, c23470pM92088H4)), c28655q, 12582912, 123);
            AbstractC22391d0.m64437c(m12964p(interfaceC28601c1), AbstractC3788w0.m11577e(AbstractC11348f.m30574v(400, 0, null, 6), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(200, 0, null, 6), 2), AbstractC37817c.m121344e(-1931901963, c28655q, new C2032u(editActionText, editButtonClicked, deleteActionText, deleteButtonClicked, 4)), c28655q, 3504, 0);
            c28655q.m87173q(true);
            z17 = z211;
            z18 = z212;
            c17750h2 = c17750h3;
            function2 = function7;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function2 = function1;
            z17 = z14;
            z18 = z15;
            c17750h2 = c17750h1;
        }
        enumC39333f2 = enumC39333f;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4150x4(modifier, enumC39333f2, dayLabelList, title, z17, z18, c17750h2, editActionText, deleteActionText, function2, editButtonClicked, deleteButtonClicked, onViewEvent, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m12963o(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final boolean m12964p(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    private static final void m12965q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final float m12966r(InterfaceC28601c1 interfaceC28601c1) {
        return m12964p(interfaceC28601c1) ? -180.0f : 0.0f;
    }

    /* JADX INFO: renamed from: s */
    private static final float m12967s(InterfaceC23462h interfaceC23462h) {
        return ((Number) interfaceC23462h.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m12968t(Function1 function1, InterfaceC28601c1 interfaceC28601c1, List list, TextResource textResource, boolean z4, C17750h1 c17750h1, InterfaceC23462h interfaceC23462h, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 2;
            float f14 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(f13 * f14, c2314t));
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C3590i(function1, interfaceC28601c1, 3);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
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
            float f15 = ((float) 1.5d) * f14;
            AbstractC4081n5.m12528b(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f15, 0.0f, 11), list, 0L, null, 0L, c28655q, 6, 28);
            float f16 = 4;
            float f17 = f13 * f16;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, 0);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f15, 0.0f, 11);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN5(), null, c28655q, 48, 0, 196600);
            C28655q c28655q2 = c28655q;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f17, c2314t));
            if (z4) {
                c28655q2.m87150e0(-1217120438);
                if (c17750h1 == null) {
                    c28655q2.m87150e0(923972087);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(923972088);
                    AbstractC17746g1.m50874j(c17750h1.getTagText(), c17750h1.getTagBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), null, c17750h1.getTagTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), null, false, c17750h1.getTagIcon(), null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q2, 0, 0, 0, 8388532);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(924356209);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getDownArrow(), c28655q2, 6), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(((Number) AbstractC11352g.m30588b(m12967s(interfaceC23462h), null, null, null, c28655q2, 0, 30).getValue()).floatValue(), AbstractC1102d.m3419p(f16 * f16, c2314t)), c38072d.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 0, 0);
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m12969u(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        m12965q(interfaceC28601c1, !m12964p(interfaceC28601c1));
        function1.invoke(Boolean.valueOf(m12964p(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m12970v(TextResource textResource, InterfaceC4339a interfaceC4339a, TextResource textResource2, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m12958j(textResource, interfaceC4339a, textResource2, interfaceC4339a2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m12971w(Modifier modifier, EnumC39333f enumC39333f, List list, TextResource textResource, boolean z4, boolean z13, C17750h1 c17750h1, TextResource textResource2, TextResource textResource3, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function2, int i13, int i14, int i15, Composer composer, int i16) {
        m12962n(modifier, enumC39333f, list, textResource, z4, z13, c17750h1, textResource2, textResource3, function1, interfaceC4339a, interfaceC4339a2, function2, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }
}
