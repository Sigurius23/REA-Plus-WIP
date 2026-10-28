package p713jm0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.selection.AbstractC1110b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2541i2;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.design.util.AbstractC8692a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dp0.AbstractC12247c;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import ih0.C18500j;
import iw0.C20960b0;
import j11.C21214q;
import java.io.IOException;
import java.util.List;
import jl0.C21769a;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p127ev.AbstractC13673n;
import p133f1.C13921a0;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.C18027i;
import p251jg.C21650c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qc1.C30217a;
import qz0.AbstractC30795n;
import vy0.AbstractC36578h0;
import vy0.AbstractC36588p;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: jm0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008f\u0001\u0010\u0014\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aa\u0010\u0018\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aQ\u0010#\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b#\u0010$¨\u0006&²\u0006\u000e\u0010%\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "Lcom/whoop/appconfiguration/TabConfiguration;", "tabs", "", "selectedTabId", "", "showCommunityBadge", "Lkotlin/Function1;", "Ll83/a0;", "onTabSelected", "Landroidx/compose/ui/Modifier;", "modifier", "", "coachFabAlpha", "Lkotlin/Function0;", "onCoachFabClicked", "showCoachBar", "suppressCoachBarRender", "showVoiceButton", "coachBarPlaceholder", "k", "(Ljava/util/List;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLc93/a;ZZZLjava/lang/String;Landroidx/compose/runtime/Composer;III)V", "Ly3/f;", "onHeightChanged", "u", "(Ljava/util/List;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "y", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "selected", "onClick", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "tabId", "r", "(ZLc93/a;ILcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "navigationContentHeight", "bottom-navigation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21789d {
    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:102:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x013c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0141  */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:114:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:119:0x0167  */
    /* JADX WARN: Code duplicated, block: B:122:0x016c  */
    /* JADX WARN: Code duplicated, block: B:123:0x016f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:128:0x017b  */
    /* JADX WARN: Code duplicated, block: B:132:0x018f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0191  */
    /* JADX WARN: Code duplicated, block: B:135:0x0195  */
    /* JADX WARN: Code duplicated, block: B:136:0x0197  */
    /* JADX WARN: Code duplicated, block: B:138:0x019b  */
    /* JADX WARN: Code duplicated, block: B:139:0x019d  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:152:0x0206  */
    /* JADX WARN: Code duplicated, block: B:155:0x0217  */
    /* JADX WARN: Code duplicated, block: B:159:0x0233  */
    /* JADX WARN: Code duplicated, block: B:161:0x0239  */
    /* JADX WARN: Code duplicated, block: B:162:0x023d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0242 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0244  */
    /* JADX WARN: Code duplicated, block: B:167:0x0248  */
    /* JADX WARN: Code duplicated, block: B:170:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:172:0x034c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0350  */
    /* JADX WARN: Code duplicated, block: B:176:0x035f  */
    /* JADX WARN: Code duplicated, block: B:178:0x036d  */
    /* JADX WARN: Code duplicated, block: B:183:0x037c  */
    /* JADX WARN: Code duplicated, block: B:185:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:188:0x040d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0443  */
    /* JADX WARN: Code duplicated, block: B:192:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:196:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:198:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:202:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:205:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:208:0x051c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0521  */
    /* JADX WARN: Code duplicated, block: B:212:0x0570  */
    /* JADX WARN: Code duplicated, block: B:215:0x0586  */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122  */
    /* JADX INFO: renamed from: k */
    public static final void m61632k(List<TabConfiguration> tabs, String str, boolean z4, Function1 onTabSelected, Modifier modifier, float f13, InterfaceC4339a interfaceC4339a, boolean z13, boolean z14, boolean z15, String str2, Composer composer, int i13, int i14, int i15) throws XmlPullParserException, IOException {
        int i16;
        Modifier modifier2;
        int i17;
        float f14;
        int i18;
        int i19;
        InterfaceC4339a interfaceC4339a2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z16;
        boolean z17;
        boolean z18;
        String str3;
        InterfaceC4339a interfaceC4339a3;
        Modifier modifier3;
        float f15;
        boolean z19;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        float f16;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z24;
        boolean z25;
        boolean z26;
        String str4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z27;
        int iHashCode;
        C0213j c0213j;
        boolean z28;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        boolean z29;
        C0209i c0209i4;
        float f17;
        int i38;
        float f18;
        String str5;
        int i39;
        C1100b c1100b;
        boolean z34;
        String str6;
        int iHashCode2;
        Object objM87133R2;
        float fM61634m;
        boolean z35;
        int iHashCode3;
        boolean z36;
        Object objM87133R3;
        float f19;
        Object objM87133R4;
        C2307m c2307m = C2299e.f9105H;
        AbstractC22676k.m65750j(tabs, "tabs");
        AbstractC22676k.m65750j(onTabSelected, "onTabSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2097966270);
        if ((i13 & 6) == 0) {
            i16 = (c28655q.m87157i(tabs) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i16 |= c28655q.m87157i(onTabSelected) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i44 = i15 & 16;
        if (i44 == 0) {
            if ((i13 & 24576) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i13) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 64;
                if (i19 != 0) {
                    i16 |= 1572864;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i16 |= i24;
                    }
                }
                i25 = i15 & 128;
                if (i25 != 0) {
                    i16 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 256;
                if (i27 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q.m87155h(z14)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i28;
                    }
                    i29 = i15 & 512;
                    if (i29 != 0) {
                        if ((i13 & 805306368) == 0) {
                            if (c28655q.m87155h(z15)) {
                                i34 = 536870912;
                            } else {
                                i34 = 268435456;
                            }
                            i16 |= i34;
                        }
                        i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        if (i35 != 0) {
                            i36 = i14 | 6;
                        } else if ((i14 & 6) == 0) {
                            if (c28655q.m87153g(str2)) {
                                i37 = 4;
                            } else {
                                i37 = 2;
                            }
                            i36 = i14 | i37;
                        } else {
                            i36 = i14;
                        }
                        if ((i16 & 306783379) == 306783378 || (i36 & 3) != 2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q.m87135U(i16 & 1, z16)) {
                            c2314t = C2314t.f9131w;
                            if (i44 != 0) {
                                modifier2 = c2314t;
                            }
                            if (i17 != 0) {
                                f16 = 1.0f;
                            } else {
                                f16 = f14;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i19 != 0) {
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C21769a(15);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                            }
                            interfaceC4339a4 = interfaceC4339a2;
                            if (i25 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i27 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            if (i29 != 0) {
                                z26 = false;
                            } else {
                                z26 = z15;
                            }
                            if (i35 != 0) {
                                str4 = "";
                            } else {
                                str4 = str2;
                            }
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            z27 = z26;
                            Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            Modifier modifier4 = modifier2;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3427x);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            z28 = z24;
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            c0209i = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                            c0209i2 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                            c0209i3 = C0217k.f732j;
                            if (c28655q.f115903S) {
                                z29 = z25;
                            } else {
                                z29 = z25;
                                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                c0209i4 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                                f17 = 0;
                                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                    float fM61634m2 = m61634m(interfaceC28601c1);
                                    if (z28) {
                                        f19 = 3.4f;
                                    } else {
                                        f19 = 2.1f;
                                    }
                                    f18 = fM61634m2 * f19;
                                } else {
                                    if (z28) {
                                        i38 = 220;
                                    } else {
                                        i38 = 120;
                                    }
                                    f18 = i38;
                                }
                                Modifier modifierM3411h = AbstractC1102d.m3411h(f18, modifierM3409f);
                                C17909s c17909s = AbstractC17911t.f69612b;
                                str5 = str4;
                                i39 = i16;
                                C23465k c23465k = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                                Float fValueOf = Float.valueOf(0.5f);
                                C38072d c38072d = C38072d.f163053a;
                                int i45 = C38072d.f163054b;
                                AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h, C17909s.m51494l(c17909s, new C23465k[]{c23465k, new C23465k(fValueOf, new C17919x(C17919x.m51541c(0.75f, c38072d.m121949b(c28655q, i45).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d.m121949b(c28655q, i45).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d.m121949b(c28655q, i45).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                                c1100b = C1100b.f4583a;
                                if (z28) {
                                    c28655q.m87150e0(-291014767);
                                    z35 = true;
                                    float f24 = 8;
                                    float f25 = 1 * f24;
                                    float f26 = ((float) 1.5d) * f24;
                                    AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f25 + f26, c28655q, 0);
                                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f26, 0.0f, f26, f25, 2);
                                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f26), C2299e.f9110M, c28655q, 6);
                                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                                    if (z29) {
                                        z34 = z27;
                                        str6 = str5;
                                        z36 = false;
                                        c28655q.m87150e0(-1103088805);
                                        c28655q.m87173q(false);
                                    } else {
                                        c28655q.m87150e0(-1103518372);
                                        z34 = z27;
                                        AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                        str6 = str5;
                                        z36 = false;
                                        c28655q.m87173q(false);
                                    }
                                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                                    objM87133R3 = c28655q.m87133R();
                                    if (objM87133R3 == c28676v0) {
                                        objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f2, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                    c28655q.m87173q(true);
                                    c28655q.m87173q(z36);
                                } else {
                                    z34 = z27;
                                    f16 = f16;
                                    str6 = str5;
                                    c28655q.m87150e0(-289531355);
                                    float f27 = 8;
                                    float f28 = ((float) 1.5d) * f27;
                                    float f29 = 1 * f27;
                                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f28, 0.0f, f28, f29, 2);
                                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f29), C2299e.f9108K, c28655q, 54);
                                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                                    c28655q.m87158i0();
                                    if (c28655q.f115903S) {
                                        c28655q.m87163l(c0213j);
                                    } else {
                                        c28655q.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                    }
                                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                                    objM87133R2 = c28655q.m87133R();
                                    if (objM87133R2 == c28676v0) {
                                        objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                        fM61634m = m61634m(interfaceC28601c1);
                                    } else {
                                        fM61634m = 56;
                                    }
                                    AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                                    z35 = true;
                                    c28655q.m87173q(true);
                                    c28655q.m87173q(false);
                                }
                                c28655q.m87173q(z35);
                                str3 = str6;
                                interfaceC4339a3 = interfaceC4339a4;
                                z19 = z34;
                                modifier3 = modifier4;
                                z17 = z28;
                                z18 = z29;
                                f15 = f16;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                            f17 = 0;
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                float fM61634m3 = m61634m(interfaceC28601c1);
                                if (z28) {
                                    f19 = 3.4f;
                                } else {
                                    f19 = 2.1f;
                                }
                                f18 = fM61634m3 * f19;
                            } else {
                                if (z28) {
                                    i38 = 220;
                                } else {
                                    i38 = 120;
                                }
                                f18 = i38;
                            }
                            Modifier modifierM3411h2 = AbstractC1102d.m3411h(f18, modifierM3409f3);
                            C17909s c17909s2 = AbstractC17911t.f69612b;
                            str5 = str4;
                            i39 = i16;
                            C23465k c23465k2 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                            Float fValueOf2 = Float.valueOf(0.5f);
                            C38072d c38072d2 = C38072d.f163053a;
                            int i46 = C38072d.f163054b;
                            AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h2, C17909s.m51494l(c17909s2, new C23465k[]{c23465k2, new C23465k(fValueOf2, new C17919x(C17919x.m51541c(0.75f, c38072d2.m121949b(c28655q, i46).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d2.m121949b(c28655q, i46).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d2.m121949b(c28655q, i46).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                            c1100b = C1100b.f4583a;
                            if (z28) {
                                c28655q.m87150e0(-291014767);
                                z35 = true;
                                float f210 = 8;
                                float f211 = 1 * f210;
                                float f212 = ((float) 1.5d) * f210;
                                AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211 + f212, c28655q, 0);
                                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f212, 0.0f, f212, f211, 2);
                                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f212), C2299e.f9110M, c28655q, 6);
                                iHashCode3 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                                if (z29) {
                                    c28655q.m87150e0(-1103518372);
                                    z34 = z27;
                                    AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                    str6 = str5;
                                    z36 = false;
                                    c28655q.m87173q(false);
                                } else {
                                    z34 = z27;
                                    str6 = str5;
                                    z36 = false;
                                    c28655q.m87150e0(-1103088805);
                                    c28655q.m87173q(false);
                                }
                                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f4, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                c28655q.m87173q(true);
                                c28655q.m87173q(z36);
                            } else {
                                z34 = z27;
                                f16 = f16;
                                str6 = str5;
                                c28655q.m87150e0(-289531355);
                                float f213 = 8;
                                float f214 = ((float) 1.5d) * f213;
                                float f215 = 1 * f213;
                                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f214, 0.0f, f214, f215, 2);
                                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f215), C2299e.f9108K, c28655q, 54);
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement2, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                    fM61634m = m61634m(interfaceC28601c1);
                                } else {
                                    fM61634m = 56;
                                }
                                AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                                z35 = true;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z35);
                            str3 = str6;
                            interfaceC4339a3 = interfaceC4339a4;
                            z19 = z34;
                            modifier3 = modifier4;
                            z17 = z28;
                            z18 = z29;
                            f15 = f16;
                        } else {
                            c28655q.m87138X();
                            z17 = z13;
                            z18 = z14;
                            str3 = str2;
                            interfaceC4339a3 = interfaceC4339a2;
                            modifier3 = modifier2;
                            f15 = f14;
                            z19 = z15;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
                        }
                    }
                    i16 |= 805306368;
                    i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i35 != 0) {
                        i36 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        if (c28655q.m87153g(str2)) {
                            i37 = 4;
                        } else {
                            i37 = 2;
                        }
                        i36 = i14 | i37;
                    } else {
                        i36 = i14;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z16)) {
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i17 != 0) {
                            f16 = 1.0f;
                        } else {
                            f16 = f14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i19 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C21769a(15);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                        }
                        interfaceC4339a4 = interfaceC4339a2;
                        if (i25 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i27 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i29 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i35 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        z27 = z26;
                        Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        Modifier modifier5 = modifier2;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3427x2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        z28 = z24;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            z29 = z25;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                            f17 = 0;
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                float fM61634m4 = m61634m(interfaceC28601c1);
                                if (z28) {
                                    f19 = 3.4f;
                                } else {
                                    f19 = 2.1f;
                                }
                                f18 = fM61634m4 * f19;
                            } else {
                                if (z28) {
                                    i38 = 220;
                                } else {
                                    i38 = 120;
                                }
                                f18 = i38;
                            }
                            Modifier modifierM3411h3 = AbstractC1102d.m3411h(f18, modifierM3409f5);
                            C17909s c17909s3 = AbstractC17911t.f69612b;
                            str5 = str4;
                            i39 = i16;
                            C23465k c23465k3 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                            Float fValueOf3 = Float.valueOf(0.5f);
                            C38072d c38072d3 = C38072d.f163053a;
                            int i47 = C38072d.f163054b;
                            AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h3, C17909s.m51494l(c17909s3, new C23465k[]{c23465k3, new C23465k(fValueOf3, new C17919x(C17919x.m51541c(0.75f, c38072d3.m121949b(c28655q, i47).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d3.m121949b(c28655q, i47).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d3.m121949b(c28655q, i47).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                            c1100b = C1100b.f4583a;
                            if (z28) {
                                c28655q.m87150e0(-291014767);
                                z35 = true;
                                float f216 = 8;
                                float f217 = 1 * f216;
                                float f218 = ((float) 1.5d) * f216;
                                AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f217 + f218, c28655q, 0);
                                Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f218, 0.0f, f218, f217, 2);
                                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f218), C2299e.f9110M, c28655q, 6);
                                iHashCode3 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                                if (z29) {
                                    c28655q.m87150e0(-1103518372);
                                    z34 = z27;
                                    AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                    str6 = str5;
                                    z36 = false;
                                    c28655q.m87173q(false);
                                } else {
                                    z34 = z27;
                                    str6 = str5;
                                    z36 = false;
                                    c28655q.m87150e0(-1103088805);
                                    c28655q.m87173q(false);
                                }
                                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f6, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                c28655q.m87173q(true);
                                c28655q.m87173q(z36);
                            } else {
                                z34 = z27;
                                f16 = f16;
                                str6 = str5;
                                c28655q.m87150e0(-289531355);
                                float f219 = 8;
                                float f2110 = ((float) 1.5d) * f219;
                                float f2111 = 1 * f219;
                                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2110, 0.0f, f2110, f2111, 2);
                                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2111), C2299e.f9108K, c28655q, 54);
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement3, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                    fM61634m = m61634m(interfaceC28601c1);
                                } else {
                                    fM61634m = 56;
                                }
                                AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                                z35 = true;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z35);
                            str3 = str6;
                            interfaceC4339a3 = interfaceC4339a4;
                            z19 = z34;
                            modifier3 = modifier5;
                            z17 = z28;
                            z18 = z29;
                            f15 = f16;
                        } else {
                            z29 = z25;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                        Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f17 = 0;
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            float fM61634m5 = m61634m(interfaceC28601c1);
                            if (z28) {
                                f19 = 3.4f;
                            } else {
                                f19 = 2.1f;
                            }
                            f18 = fM61634m5 * f19;
                        } else {
                            if (z28) {
                                i38 = 220;
                            } else {
                                i38 = 120;
                            }
                            f18 = i38;
                        }
                        Modifier modifierM3411h4 = AbstractC1102d.m3411h(f18, modifierM3409f7);
                        C17909s c17909s4 = AbstractC17911t.f69612b;
                        str5 = str4;
                        i39 = i16;
                        C23465k c23465k4 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                        Float fValueOf4 = Float.valueOf(0.5f);
                        C38072d c38072d4 = C38072d.f163053a;
                        int i48 = C38072d.f163054b;
                        AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h4, C17909s.m51494l(c17909s4, new C23465k[]{c23465k4, new C23465k(fValueOf4, new C17919x(C17919x.m51541c(0.75f, c38072d4.m121949b(c28655q, i48).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d4.m121949b(c28655q, i48).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d4.m121949b(c28655q, i48).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                        c1100b = C1100b.f4583a;
                        if (z28) {
                            c28655q.m87150e0(-291014767);
                            z35 = true;
                            float f2112 = 8;
                            float f2113 = 1 * f2112;
                            float f2114 = ((float) 1.5d) * f2112;
                            AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2113 + f2114, c28655q, 0);
                            Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2114, 0.0f, f2114, f2113, 2);
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f2114), C2299e.f9110M, c28655q, 6);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3398t7);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                            if (z29) {
                                c28655q.m87150e0(-1103518372);
                                z34 = z27;
                                AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                str6 = str5;
                                z36 = false;
                                c28655q.m87173q(false);
                            } else {
                                z34 = z27;
                                str6 = str5;
                                z36 = false;
                                c28655q.m87150e0(-1103088805);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f8, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z36);
                        } else {
                            z34 = z27;
                            f16 = f16;
                            str6 = str5;
                            c28655q.m87150e0(-289531355);
                            float f2115 = 8;
                            float f2116 = ((float) 1.5d) * f2115;
                            float f2117 = 1 * f2115;
                            Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2116, 0.0f, f2116, f2117, 2);
                            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2117), C2299e.f9108K, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3398t8);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement4, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                fM61634m = m61634m(interfaceC28601c1);
                            } else {
                                fM61634m = 56;
                            }
                            AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                            z35 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z35);
                        str3 = str6;
                        interfaceC4339a3 = interfaceC4339a4;
                        z19 = z34;
                        modifier3 = modifier5;
                        z17 = z28;
                        z18 = z29;
                        f15 = f16;
                    } else {
                        c28655q.m87138X();
                        z17 = z13;
                        z18 = z14;
                        str3 = str2;
                        interfaceC4339a3 = interfaceC4339a2;
                        modifier3 = modifier2;
                        f15 = f14;
                        z19 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
                    }
                }
                i16 |= 100663296;
                i29 = i15 & 512;
                if (i29 != 0) {
                    if ((i13 & 805306368) == 0) {
                        if (c28655q.m87155h(z15)) {
                            i34 = 536870912;
                        } else {
                            i34 = 268435456;
                        }
                        i16 |= i34;
                    }
                    i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i35 != 0) {
                        i36 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        if (c28655q.m87153g(str2)) {
                            i37 = 4;
                        } else {
                            i37 = 2;
                        }
                        i36 = i14 | i37;
                    } else {
                        i36 = i14;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z16)) {
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i17 != 0) {
                            f16 = 1.0f;
                        } else {
                            f16 = f14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i19 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C21769a(15);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                        }
                        interfaceC4339a4 = interfaceC4339a2;
                        if (i25 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i27 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i29 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i35 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        z27 = z26;
                        Modifier modifierM3427x3 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        Modifier modifier6 = modifier2;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3427x3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        z28 = z24;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            z29 = z25;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                            Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
                            f17 = 0;
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                float fM61634m6 = m61634m(interfaceC28601c1);
                                if (z28) {
                                    f19 = 3.4f;
                                } else {
                                    f19 = 2.1f;
                                }
                                f18 = fM61634m6 * f19;
                            } else {
                                if (z28) {
                                    i38 = 220;
                                } else {
                                    i38 = 120;
                                }
                                f18 = i38;
                            }
                            Modifier modifierM3411h5 = AbstractC1102d.m3411h(f18, modifierM3409f9);
                            C17909s c17909s5 = AbstractC17911t.f69612b;
                            str5 = str4;
                            i39 = i16;
                            C23465k c23465k5 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                            Float fValueOf5 = Float.valueOf(0.5f);
                            C38072d c38072d5 = C38072d.f163053a;
                            int i49 = C38072d.f163054b;
                            AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h5, C17909s.m51494l(c17909s5, new C23465k[]{c23465k5, new C23465k(fValueOf5, new C17919x(C17919x.m51541c(0.75f, c38072d5.m121949b(c28655q, i49).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d5.m121949b(c28655q, i49).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d5.m121949b(c28655q, i49).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                            c1100b = C1100b.f4583a;
                            if (z28) {
                                c28655q.m87150e0(-291014767);
                                z35 = true;
                                float f2118 = 8;
                                float f2119 = 1 * f2118;
                                float f21110 = ((float) 1.5d) * f2118;
                                AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2119 + f21110, c28655q, 0);
                                Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21110, 0.0f, f21110, f2119, 2);
                                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21110), C2299e.f9110M, c28655q, 6);
                                iHashCode3 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3398t9);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                                if (z29) {
                                    c28655q.m87150e0(-1103518372);
                                    z34 = z27;
                                    AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                    str6 = str5;
                                    z36 = false;
                                    c28655q.m87173q(false);
                                } else {
                                    z34 = z27;
                                    str6 = str5;
                                    z36 = false;
                                    c28655q.m87150e0(-1103088805);
                                    c28655q.m87173q(false);
                                }
                                Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t);
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f10, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                c28655q.m87173q(true);
                                c28655q.m87173q(z36);
                            } else {
                                z34 = z27;
                                f16 = f16;
                                str6 = str5;
                                c28655q.m87150e0(-289531355);
                                float f21111 = 8;
                                float f21112 = ((float) 1.5d) * f21111;
                                float f21113 = 1 * f21111;
                                Modifier modifierM3398t10 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21112, 0.0f, f21112, f21113, 2);
                                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21113), C2299e.f9108K, c28655q, 54);
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3398t10);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a5);
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement5, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                    fM61634m = m61634m(interfaceC28601c1);
                                } else {
                                    fM61634m = 56;
                                }
                                AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                                z35 = true;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z35);
                            str3 = str6;
                            interfaceC4339a3 = interfaceC4339a4;
                            z19 = z34;
                            modifier3 = modifier6;
                            z17 = z28;
                            z18 = z29;
                            f15 = f16;
                        } else {
                            z29 = z25;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                        Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f17 = 0;
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            float fM61634m7 = m61634m(interfaceC28601c1);
                            if (z28) {
                                f19 = 3.4f;
                            } else {
                                f19 = 2.1f;
                            }
                            f18 = fM61634m7 * f19;
                        } else {
                            if (z28) {
                                i38 = 220;
                            } else {
                                i38 = 120;
                            }
                            f18 = i38;
                        }
                        Modifier modifierM3411h6 = AbstractC1102d.m3411h(f18, modifierM3409f11);
                        C17909s c17909s6 = AbstractC17911t.f69612b;
                        str5 = str4;
                        i39 = i16;
                        C23465k c23465k6 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                        Float fValueOf6 = Float.valueOf(0.5f);
                        C38072d c38072d6 = C38072d.f163053a;
                        int i410 = C38072d.f163054b;
                        AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h6, C17909s.m51494l(c17909s6, new C23465k[]{c23465k6, new C23465k(fValueOf6, new C17919x(C17919x.m51541c(0.75f, c38072d6.m121949b(c28655q, i410).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d6.m121949b(c28655q, i410).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d6.m121949b(c28655q, i410).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                        c1100b = C1100b.f4583a;
                        if (z28) {
                            c28655q.m87150e0(-291014767);
                            z35 = true;
                            float f21114 = 8;
                            float f21115 = 1 * f21114;
                            float f21116 = ((float) 1.5d) * f21114;
                            AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f21115 + f21116, c28655q, 0);
                            Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21116, 0.0f, f21116, f21115, 2);
                            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21116), C2299e.f9110M, c28655q, 6);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3398t11);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a6);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
                            if (z29) {
                                c28655q.m87150e0(-1103518372);
                                z34 = z27;
                                AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                str6 = str5;
                                z36 = false;
                                c28655q.m87173q(false);
                            } else {
                                z34 = z27;
                                str6 = str5;
                                z36 = false;
                                c28655q.m87150e0(-1103088805);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f12, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z36);
                        } else {
                            z34 = z27;
                            f16 = f16;
                            str6 = str5;
                            c28655q.m87150e0(-289531355);
                            float f21117 = 8;
                            float f21118 = ((float) 1.5d) * f21117;
                            float f21119 = 1 * f21117;
                            Modifier modifierM3398t12 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21118, 0.0f, f21118, f21119, 2);
                            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21119), C2299e.f9108K, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3398t12);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement6, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                fM61634m = m61634m(interfaceC28601c1);
                            } else {
                                fM61634m = 56;
                            }
                            AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                            z35 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z35);
                        str3 = str6;
                        interfaceC4339a3 = interfaceC4339a4;
                        z19 = z34;
                        modifier3 = modifier6;
                        z17 = z28;
                        z18 = z29;
                        f15 = f16;
                    } else {
                        c28655q.m87138X();
                        z17 = z13;
                        z18 = z14;
                        str3 = str2;
                        interfaceC4339a3 = interfaceC4339a2;
                        modifier3 = modifier2;
                        f15 = f14;
                        z19 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
                    }
                }
                i16 |= 805306368;
                i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q.m87153g(str2)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i17 != 0) {
                        f16 = 1.0f;
                    } else {
                        f16 = f14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C21769a(15);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    if (i25 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i27 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i29 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i35 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    z27 = z26;
                    Modifier modifierM3427x4 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    Modifier modifier7 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3427x4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z28 = z24;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z29 = z25;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                        Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f17 = 0;
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            float fM61634m8 = m61634m(interfaceC28601c1);
                            if (z28) {
                                f19 = 3.4f;
                            } else {
                                f19 = 2.1f;
                            }
                            f18 = fM61634m8 * f19;
                        } else {
                            if (z28) {
                                i38 = 220;
                            } else {
                                i38 = 120;
                            }
                            f18 = i38;
                        }
                        Modifier modifierM3411h7 = AbstractC1102d.m3411h(f18, modifierM3409f13);
                        C17909s c17909s7 = AbstractC17911t.f69612b;
                        str5 = str4;
                        i39 = i16;
                        C23465k c23465k7 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                        Float fValueOf7 = Float.valueOf(0.5f);
                        C38072d c38072d7 = C38072d.f163053a;
                        int i411 = C38072d.f163054b;
                        AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h7, C17909s.m51494l(c17909s7, new C23465k[]{c23465k7, new C23465k(fValueOf7, new C17919x(C17919x.m51541c(0.75f, c38072d7.m121949b(c28655q, i411).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d7.m121949b(c28655q, i411).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d7.m121949b(c28655q, i411).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                        c1100b = C1100b.f4583a;
                        if (z28) {
                            c28655q.m87150e0(-291014767);
                            z35 = true;
                            float f211110 = 8;
                            float f211111 = 1 * f211110;
                            float f211112 = ((float) 1.5d) * f211110;
                            AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211111 + f211112, c28655q, 0);
                            Modifier modifierM3398t13 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211112, 0.0f, f211112, f211111, 2);
                            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f211112), C2299e.f9110M, c28655q, 6);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                            Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3398t13);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a7);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m17);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N17);
                            if (z29) {
                                c28655q.m87150e0(-1103518372);
                                z34 = z27;
                                AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                str6 = str5;
                                z36 = false;
                                c28655q.m87173q(false);
                            } else {
                                z34 = z27;
                                str6 = str5;
                                z36 = false;
                                c28655q.m87150e0(-1103088805);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f14, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z36);
                        } else {
                            z34 = z27;
                            f16 = f16;
                            str6 = str5;
                            c28655q.m87150e0(-289531355);
                            float f211113 = 8;
                            float f211114 = ((float) 1.5d) * f211113;
                            float f211115 = 1 * f211113;
                            Modifier modifierM3398t14 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211114, 0.0f, f211114, f211115, 2);
                            C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f211115), C2299e.f9108K, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3398t14);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a7);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m18);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N18);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement7, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                fM61634m = m61634m(interfaceC28601c1);
                            } else {
                                fM61634m = 56;
                            }
                            AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                            z35 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z35);
                        str3 = str6;
                        interfaceC4339a3 = interfaceC4339a4;
                        z19 = z34;
                        modifier3 = modifier7;
                        z17 = z28;
                        z18 = z29;
                        f15 = f16;
                    } else {
                        z29 = z25;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                    Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f17 = 0;
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        float fM61634m9 = m61634m(interfaceC28601c1);
                        if (z28) {
                            f19 = 3.4f;
                        } else {
                            f19 = 2.1f;
                        }
                        f18 = fM61634m9 * f19;
                    } else {
                        if (z28) {
                            i38 = 220;
                        } else {
                            i38 = 120;
                        }
                        f18 = i38;
                    }
                    Modifier modifierM3411h8 = AbstractC1102d.m3411h(f18, modifierM3409f15);
                    C17909s c17909s8 = AbstractC17911t.f69612b;
                    str5 = str4;
                    i39 = i16;
                    C23465k c23465k8 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                    Float fValueOf8 = Float.valueOf(0.5f);
                    C38072d c38072d8 = C38072d.f163053a;
                    int i412 = C38072d.f163054b;
                    AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h8, C17909s.m51494l(c17909s8, new C23465k[]{c23465k8, new C23465k(fValueOf8, new C17919x(C17919x.m51541c(0.75f, c38072d8.m121949b(c28655q, i412).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d8.m121949b(c28655q, i412).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d8.m121949b(c28655q, i412).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                    c1100b = C1100b.f4583a;
                    if (z28) {
                        c28655q.m87150e0(-291014767);
                        z35 = true;
                        float f211116 = 8;
                        float f211117 = 1 * f211116;
                        float f211118 = ((float) 1.5d) * f211116;
                        AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211117 + f211118, c28655q, 0);
                        Modifier modifierM3398t15 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211118, 0.0f, f211118, f211117, 2);
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f211118), C2299e.f9110M, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3398t15);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a8);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m19);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N19);
                        if (z29) {
                            c28655q.m87150e0(-1103518372);
                            z34 = z27;
                            AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                            str6 = str5;
                            z36 = false;
                            c28655q.m87173q(false);
                        } else {
                            z34 = z27;
                            str6 = str5;
                            z36 = false;
                            c28655q.m87150e0(-1103088805);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C13921a0(24, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f16, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z36);
                    } else {
                        z34 = z27;
                        f16 = f16;
                        str6 = str5;
                        c28655q.m87150e0(-289531355);
                        float f211119 = 8;
                        float f2111110 = ((float) 1.5d) * f211119;
                        float f2111111 = 1 * f211119;
                        Modifier modifierM3398t16 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111110, 0.0f, f2111110, f2111111, 2);
                        C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2111111), C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3398t16);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a8);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m110);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N110);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13921a0(25, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement8, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            fM61634m = m61634m(interfaceC28601c1);
                        } else {
                            fM61634m = 56;
                        }
                        AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                        z35 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z35);
                    str3 = str6;
                    interfaceC4339a3 = interfaceC4339a4;
                    z19 = z34;
                    modifier3 = modifier7;
                    z17 = z28;
                    z18 = z29;
                    f15 = f16;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier2;
                    f15 = f14;
                    z19 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f14 = f13;
            i19 = i15 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 128;
            if (i25 != 0) {
                i16 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q.m87155h(z13)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i16 |= i26;
            }
            i27 = i15 & 256;
            if (i27 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
                i29 = i15 & 512;
                if (i29 != 0) {
                    if ((i13 & 805306368) == 0) {
                        if (c28655q.m87155h(z15)) {
                            i34 = 536870912;
                        } else {
                            i34 = 268435456;
                        }
                        i16 |= i34;
                    }
                    i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i35 != 0) {
                        i36 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        if (c28655q.m87153g(str2)) {
                            i37 = 4;
                        } else {
                            i37 = 2;
                        }
                        i36 = i14 | i37;
                    } else {
                        i36 = i14;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z16)) {
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i17 != 0) {
                            f16 = 1.0f;
                        } else {
                            f16 = f14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i19 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C21769a(15);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                        }
                        interfaceC4339a4 = interfaceC4339a2;
                        if (i25 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i27 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i29 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i35 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        z27 = z26;
                        Modifier modifierM3427x5 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        Modifier modifier8 = modifier2;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                        Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM3427x5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        z28 = z24;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d5);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            z29 = z25;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111);
                            Modifier modifierM3409f17 = AbstractC1102d.m3409f(1.0f, c2314t);
                            f17 = 0;
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                float fM61634m10 = m61634m(interfaceC28601c1);
                                if (z28) {
                                    f19 = 3.4f;
                                } else {
                                    f19 = 2.1f;
                                }
                                f18 = fM61634m10 * f19;
                            } else {
                                if (z28) {
                                    i38 = 220;
                                } else {
                                    i38 = 120;
                                }
                                f18 = i38;
                            }
                            Modifier modifierM3411h9 = AbstractC1102d.m3411h(f18, modifierM3409f17);
                            C17909s c17909s9 = AbstractC17911t.f69612b;
                            str5 = str4;
                            i39 = i16;
                            C23465k c23465k9 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                            Float fValueOf9 = Float.valueOf(0.5f);
                            C38072d c38072d9 = C38072d.f163053a;
                            int i413 = C38072d.f163054b;
                            AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h9, C17909s.m51494l(c17909s9, new C23465k[]{c23465k9, new C23465k(fValueOf9, new C17919x(C17919x.m51541c(0.75f, c38072d9.m121949b(c28655q, i413).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d9.m121949b(c28655q, i413).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d9.m121949b(c28655q, i413).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                            c1100b = C1100b.f4583a;
                            if (z28) {
                                c28655q.m87150e0(-291014767);
                                z35 = true;
                                float f2111112 = 8;
                                float f2111113 = 1 * f2111112;
                                float f2111114 = ((float) 1.5d) * f2111112;
                                AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2111113 + f2111114, c28655q, 0);
                                Modifier modifierM3398t17 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111114, 0.0f, f2111114, f2111113, 2);
                                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f2111114), C2299e.f9110M, c28655q, 6);
                                iHashCode3 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM3398t17);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a9);
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m112);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N112);
                                if (z29) {
                                    c28655q.m87150e0(-1103518372);
                                    z34 = z27;
                                    AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                    str6 = str5;
                                    z36 = false;
                                    c28655q.m87173q(false);
                                } else {
                                    z34 = z27;
                                    str6 = str5;
                                    z36 = false;
                                    c28655q.m87150e0(-1103088805);
                                    c28655q.m87173q(false);
                                }
                                Modifier modifierM3409f18 = AbstractC1102d.m3409f(1.0f, c2314t);
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f18, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                c28655q.m87173q(true);
                                c28655q.m87173q(z36);
                            } else {
                                z34 = z27;
                                f16 = f16;
                                str6 = str5;
                                c28655q.m87150e0(-289531355);
                                float f2111115 = 8;
                                float f2111116 = ((float) 1.5d) * f2111115;
                                float f2111117 = 1 * f2111115;
                                Modifier modifierM3398t18 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111116, 0.0f, f2111116, f2111117, 2);
                                C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2111117), C2299e.f9108K, c28655q, 54);
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3398t18);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a9);
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m113);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N113);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                LayoutWeightElement layoutWeightElement9 = new LayoutWeightElement(1.0f, true);
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement9, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                    fM61634m = m61634m(interfaceC28601c1);
                                } else {
                                    fM61634m = 56;
                                }
                                AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                                z35 = true;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z35);
                            str3 = str6;
                            interfaceC4339a3 = interfaceC4339a4;
                            z19 = z34;
                            modifier3 = modifier8;
                            z17 = z28;
                            z18 = z29;
                            f15 = f16;
                        } else {
                            z29 = z25;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111);
                        Modifier modifierM3409f19 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f17 = 0;
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            float fM61634m11 = m61634m(interfaceC28601c1);
                            if (z28) {
                                f19 = 3.4f;
                            } else {
                                f19 = 2.1f;
                            }
                            f18 = fM61634m11 * f19;
                        } else {
                            if (z28) {
                                i38 = 220;
                            } else {
                                i38 = 120;
                            }
                            f18 = i38;
                        }
                        Modifier modifierM3411h10 = AbstractC1102d.m3411h(f18, modifierM3409f19);
                        C17909s c17909s10 = AbstractC17911t.f69612b;
                        str5 = str4;
                        i39 = i16;
                        C23465k c23465k10 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                        Float fValueOf10 = Float.valueOf(0.5f);
                        C38072d c38072d10 = C38072d.f163053a;
                        int i414 = C38072d.f163054b;
                        AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h10, C17909s.m51494l(c17909s10, new C23465k[]{c23465k10, new C23465k(fValueOf10, new C17919x(C17919x.m51541c(0.75f, c38072d10.m121949b(c28655q, i414).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d10.m121949b(c28655q, i414).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d10.m121949b(c28655q, i414).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                        c1100b = C1100b.f4583a;
                        if (z28) {
                            c28655q.m87150e0(-291014767);
                            z35 = true;
                            float f2111118 = 8;
                            float f2111119 = 1 * f2111118;
                            float f21111110 = ((float) 1.5d) * f2111118;
                            AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2111119 + f21111110, c28655q, 0);
                            Modifier modifierM3398t19 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111110, 0.0f, f21111110, f2111119, 2);
                            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21111110), C2299e.f9110M, c28655q, 6);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                            Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3398t19);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a10);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m114);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N114);
                            if (z29) {
                                c28655q.m87150e0(-1103518372);
                                z34 = z27;
                                AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                str6 = str5;
                                z36 = false;
                                c28655q.m87173q(false);
                            } else {
                                z34 = z27;
                                str6 = str5;
                                z36 = false;
                                c28655q.m87150e0(-1103088805);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f110 = AbstractC1102d.m3409f(1.0f, c2314t);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f110, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z36);
                        } else {
                            z34 = z27;
                            f16 = f16;
                            str6 = str5;
                            c28655q.m87150e0(-289531355);
                            float f21111111 = 8;
                            float f21111112 = ((float) 1.5d) * f21111111;
                            float f21111113 = 1 * f21111111;
                            Modifier modifierM3398t110 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111112, 0.0f, f21111112, f21111113, 2);
                            C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21111113), C2299e.f9108K, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                            Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierM3398t110);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a10);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m115);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N115);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement10 = new LayoutWeightElement(1.0f, true);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement10, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                fM61634m = m61634m(interfaceC28601c1);
                            } else {
                                fM61634m = 56;
                            }
                            AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                            z35 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z35);
                        str3 = str6;
                        interfaceC4339a3 = interfaceC4339a4;
                        z19 = z34;
                        modifier3 = modifier8;
                        z17 = z28;
                        z18 = z29;
                        f15 = f16;
                    } else {
                        c28655q.m87138X();
                        z17 = z13;
                        z18 = z14;
                        str3 = str2;
                        interfaceC4339a3 = interfaceC4339a2;
                        modifier3 = modifier2;
                        f15 = f14;
                        z19 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
                    }
                }
                i16 |= 805306368;
                i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q.m87153g(str2)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i17 != 0) {
                        f16 = 1.0f;
                    } else {
                        f16 = f14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C21769a(15);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    if (i25 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i27 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i29 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i35 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    z27 = z26;
                    Modifier modifierM3427x6 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    Modifier modifier9 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM3427x6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z28 = z24;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d6);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m116);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z29 = z25;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N116);
                        Modifier modifierM3409f111 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f17 = 0;
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            float fM61634m12 = m61634m(interfaceC28601c1);
                            if (z28) {
                                f19 = 3.4f;
                            } else {
                                f19 = 2.1f;
                            }
                            f18 = fM61634m12 * f19;
                        } else {
                            if (z28) {
                                i38 = 220;
                            } else {
                                i38 = 120;
                            }
                            f18 = i38;
                        }
                        Modifier modifierM3411h11 = AbstractC1102d.m3411h(f18, modifierM3409f111);
                        C17909s c17909s11 = AbstractC17911t.f69612b;
                        str5 = str4;
                        i39 = i16;
                        C23465k c23465k11 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                        Float fValueOf11 = Float.valueOf(0.5f);
                        C38072d c38072d11 = C38072d.f163053a;
                        int i415 = C38072d.f163054b;
                        AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h11, C17909s.m51494l(c17909s11, new C23465k[]{c23465k11, new C23465k(fValueOf11, new C17919x(C17919x.m51541c(0.75f, c38072d11.m121949b(c28655q, i415).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d11.m121949b(c28655q, i415).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d11.m121949b(c28655q, i415).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                        c1100b = C1100b.f4583a;
                        if (z28) {
                            c28655q.m87150e0(-291014767);
                            z35 = true;
                            float f21111114 = 8;
                            float f21111115 = 1 * f21111114;
                            float f21111116 = ((float) 1.5d) * f21111114;
                            AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f21111115 + f21111116, c28655q, 0);
                            Modifier modifierM3398t111 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111116, 0.0f, f21111116, f21111115, 2);
                            C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21111116), C2299e.f9110M, c28655q, 6);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, modifierM3398t111);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a11);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m117);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N117);
                            if (z29) {
                                c28655q.m87150e0(-1103518372);
                                z34 = z27;
                                AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                str6 = str5;
                                z36 = false;
                                c28655q.m87173q(false);
                            } else {
                                z34 = z27;
                                str6 = str5;
                                z36 = false;
                                c28655q.m87150e0(-1103088805);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f112 = AbstractC1102d.m3409f(1.0f, c2314t);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f112, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z36);
                        } else {
                            z34 = z27;
                            f16 = f16;
                            str6 = str5;
                            c28655q.m87150e0(-289531355);
                            float f21111117 = 8;
                            float f21111118 = ((float) 1.5d) * f21111117;
                            float f21111119 = 1 * f21111117;
                            Modifier modifierM3398t112 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111118, 0.0f, f21111118, f21111119, 2);
                            C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21111119), C2299e.f9108K, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM3398t112);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a11);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m118);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N118);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement11 = new LayoutWeightElement(1.0f, true);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement11, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                fM61634m = m61634m(interfaceC28601c1);
                            } else {
                                fM61634m = 56;
                            }
                            AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                            z35 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z35);
                        str3 = str6;
                        interfaceC4339a3 = interfaceC4339a4;
                        z19 = z34;
                        modifier3 = modifier9;
                        z17 = z28;
                        z18 = z29;
                        f15 = f16;
                    } else {
                        z29 = z25;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N116);
                    Modifier modifierM3409f113 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f17 = 0;
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        float fM61634m13 = m61634m(interfaceC28601c1);
                        if (z28) {
                            f19 = 3.4f;
                        } else {
                            f19 = 2.1f;
                        }
                        f18 = fM61634m13 * f19;
                    } else {
                        if (z28) {
                            i38 = 220;
                        } else {
                            i38 = 120;
                        }
                        f18 = i38;
                    }
                    Modifier modifierM3411h12 = AbstractC1102d.m3411h(f18, modifierM3409f113);
                    C17909s c17909s12 = AbstractC17911t.f69612b;
                    str5 = str4;
                    i39 = i16;
                    C23465k c23465k12 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                    Float fValueOf12 = Float.valueOf(0.5f);
                    C38072d c38072d12 = C38072d.f163053a;
                    int i416 = C38072d.f163054b;
                    AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h12, C17909s.m51494l(c17909s12, new C23465k[]{c23465k12, new C23465k(fValueOf12, new C17919x(C17919x.m51541c(0.75f, c38072d12.m121949b(c28655q, i416).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d12.m121949b(c28655q, i416).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d12.m121949b(c28655q, i416).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                    c1100b = C1100b.f4583a;
                    if (z28) {
                        c28655q.m87150e0(-291014767);
                        z35 = true;
                        float f211111110 = 8;
                        float f211111111 = 1 * f211111110;
                        float f211111112 = ((float) 1.5d) * f211111110;
                        AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211111111 + f211111112, c28655q, 0);
                        Modifier modifierM3398t113 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111112, 0.0f, f211111112, f211111111, 2);
                        C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f211111112), C2299e.f9110M, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                        Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifierM3398t113);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a12);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m119);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N119);
                        if (z29) {
                            c28655q.m87150e0(-1103518372);
                            z34 = z27;
                            AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                            str6 = str5;
                            z36 = false;
                            c28655q.m87173q(false);
                        } else {
                            z34 = z27;
                            str6 = str5;
                            z36 = false;
                            c28655q.m87150e0(-1103088805);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f114 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C13921a0(24, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f114, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z36);
                    } else {
                        z34 = z27;
                        f16 = f16;
                        str6 = str5;
                        c28655q.m87150e0(-289531355);
                        float f211111113 = 8;
                        float f211111114 = ((float) 1.5d) * f211111113;
                        float f211111115 = 1 * f211111113;
                        Modifier modifierM3398t114 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111114, 0.0f, f211111114, f211111115, 2);
                        C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f211111115), C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                        Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, modifierM3398t114);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a12);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1110);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1110);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement12 = new LayoutWeightElement(1.0f, true);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13921a0(25, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement12, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            fM61634m = m61634m(interfaceC28601c1);
                        } else {
                            fM61634m = 56;
                        }
                        AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                        z35 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z35);
                    str3 = str6;
                    interfaceC4339a3 = interfaceC4339a4;
                    z19 = z34;
                    modifier3 = modifier9;
                    z17 = z28;
                    z18 = z29;
                    f15 = f16;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier2;
                    f15 = f14;
                    z19 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
                }
            }
            i16 |= 100663296;
            i29 = i15 & 512;
            if (i29 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i16 |= i34;
                }
                i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q.m87153g(str2)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i17 != 0) {
                        f16 = 1.0f;
                    } else {
                        f16 = f14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C21769a(15);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    if (i25 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i27 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i29 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i35 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    z27 = z26;
                    Modifier modifierM3427x7 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    Modifier modifier10 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, modifierM3427x7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z28 = z24;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d7);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z29 = z25;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111);
                        Modifier modifierM3409f115 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f17 = 0;
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            float fM61634m14 = m61634m(interfaceC28601c1);
                            if (z28) {
                                f19 = 3.4f;
                            } else {
                                f19 = 2.1f;
                            }
                            f18 = fM61634m14 * f19;
                        } else {
                            if (z28) {
                                i38 = 220;
                            } else {
                                i38 = 120;
                            }
                            f18 = i38;
                        }
                        Modifier modifierM3411h13 = AbstractC1102d.m3411h(f18, modifierM3409f115);
                        C17909s c17909s13 = AbstractC17911t.f69612b;
                        str5 = str4;
                        i39 = i16;
                        C23465k c23465k13 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                        Float fValueOf13 = Float.valueOf(0.5f);
                        C38072d c38072d13 = C38072d.f163053a;
                        int i417 = C38072d.f163054b;
                        AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h13, C17909s.m51494l(c17909s13, new C23465k[]{c23465k13, new C23465k(fValueOf13, new C17919x(C17919x.m51541c(0.75f, c38072d13.m121949b(c28655q, i417).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d13.m121949b(c28655q, i417).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d13.m121949b(c28655q, i417).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                        c1100b = C1100b.f4583a;
                        if (z28) {
                            c28655q.m87150e0(-291014767);
                            z35 = true;
                            float f211111116 = 8;
                            float f211111117 = 1 * f211111116;
                            float f211111118 = ((float) 1.5d) * f211111116;
                            AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211111117 + f211111118, c28655q, 0);
                            Modifier modifierM3398t115 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111118, 0.0f, f211111118, f211111117, 2);
                            C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f211111118), C2299e.f9110M, c28655q, 6);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifierM3398t115);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a13);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1112);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1112);
                            if (z29) {
                                c28655q.m87150e0(-1103518372);
                                z34 = z27;
                                AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                str6 = str5;
                                z36 = false;
                                c28655q.m87173q(false);
                            } else {
                                z34 = z27;
                                str6 = str5;
                                z36 = false;
                                c28655q.m87150e0(-1103088805);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f116 = AbstractC1102d.m3409f(1.0f, c2314t);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f116, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z36);
                        } else {
                            z34 = z27;
                            f16 = f16;
                            str6 = str5;
                            c28655q.m87150e0(-289531355);
                            float f211111119 = 8;
                            float f2111111110 = ((float) 1.5d) * f211111119;
                            float f2111111111 = 1 * f211111119;
                            Modifier modifierM3398t116 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111110, 0.0f, f2111111110, f2111111111, 2);
                            C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2111111111), C2299e.f9108K, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q.m87165m();
                            Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q, modifierM3398t116);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a13);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1113);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1113);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement13 = new LayoutWeightElement(1.0f, true);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement13, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                fM61634m = m61634m(interfaceC28601c1);
                            } else {
                                fM61634m = 56;
                            }
                            AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                            z35 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z35);
                        str3 = str6;
                        interfaceC4339a3 = interfaceC4339a4;
                        z19 = z34;
                        modifier3 = modifier10;
                        z17 = z28;
                        z18 = z29;
                        f15 = f16;
                    } else {
                        z29 = z25;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111);
                    Modifier modifierM3409f117 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f17 = 0;
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        float fM61634m15 = m61634m(interfaceC28601c1);
                        if (z28) {
                            f19 = 3.4f;
                        } else {
                            f19 = 2.1f;
                        }
                        f18 = fM61634m15 * f19;
                    } else {
                        if (z28) {
                            i38 = 220;
                        } else {
                            i38 = 120;
                        }
                        f18 = i38;
                    }
                    Modifier modifierM3411h14 = AbstractC1102d.m3411h(f18, modifierM3409f117);
                    C17909s c17909s14 = AbstractC17911t.f69612b;
                    str5 = str4;
                    i39 = i16;
                    C23465k c23465k14 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                    Float fValueOf14 = Float.valueOf(0.5f);
                    C38072d c38072d14 = C38072d.f163053a;
                    int i418 = C38072d.f163054b;
                    AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h14, C17909s.m51494l(c17909s14, new C23465k[]{c23465k14, new C23465k(fValueOf14, new C17919x(C17919x.m51541c(0.75f, c38072d14.m121949b(c28655q, i418).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d14.m121949b(c28655q, i418).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d14.m121949b(c28655q, i418).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                    c1100b = C1100b.f4583a;
                    if (z28) {
                        c28655q.m87150e0(-291014767);
                        z35 = true;
                        float f2111111112 = 8;
                        float f2111111113 = 1 * f2111111112;
                        float f2111111114 = ((float) 1.5d) * f2111111112;
                        AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2111111113 + f2111111114, c28655q, 0);
                        Modifier modifierM3398t117 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111114, 0.0f, f2111111114, f2111111113, 2);
                        C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f2111111114), C2299e.f9110M, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q.m87165m();
                        Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q, modifierM3398t117);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a14);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1114);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1114);
                        if (z29) {
                            c28655q.m87150e0(-1103518372);
                            z34 = z27;
                            AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                            str6 = str5;
                            z36 = false;
                            c28655q.m87173q(false);
                        } else {
                            z34 = z27;
                            str6 = str5;
                            z36 = false;
                            c28655q.m87150e0(-1103088805);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f118 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C13921a0(24, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f118, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z36);
                    } else {
                        z34 = z27;
                        f16 = f16;
                        str6 = str5;
                        c28655q.m87150e0(-289531355);
                        float f2111111115 = 8;
                        float f2111111116 = ((float) 1.5d) * f2111111115;
                        float f2111111117 = 1 * f2111111115;
                        Modifier modifierM3398t118 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111116, 0.0f, f2111111116, f2111111117, 2);
                        C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2111111117), C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q.m87165m();
                        Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q, modifierM3398t118);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a14);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1115);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1115);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement14 = new LayoutWeightElement(1.0f, true);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13921a0(25, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement14, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            fM61634m = m61634m(interfaceC28601c1);
                        } else {
                            fM61634m = 56;
                        }
                        AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                        z35 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z35);
                    str3 = str6;
                    interfaceC4339a3 = interfaceC4339a4;
                    z19 = z34;
                    modifier3 = modifier10;
                    z17 = z28;
                    z18 = z29;
                    f15 = f16;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier2;
                    f15 = f14;
                    z19 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
                }
            }
            i16 |= 805306368;
            i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q.m87153g(str2)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i14 | i37;
            } else {
                i36 = i14;
            }
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    modifier2 = c2314t;
                }
                if (i17 != 0) {
                    f16 = 1.0f;
                } else {
                    f16 = f14;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C21769a(15);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                }
                interfaceC4339a4 = interfaceC4339a2;
                if (i25 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if (i27 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                if (i29 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i35 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                z27 = z26;
                Modifier modifierM3427x8 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                Modifier modifier11 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q.m87165m();
                Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q, modifierM3427x8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                z28 = z24;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d8);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1116);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    z29 = z25;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1116);
                    Modifier modifierM3409f119 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f17 = 0;
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        float fM61634m16 = m61634m(interfaceC28601c1);
                        if (z28) {
                            f19 = 3.4f;
                        } else {
                            f19 = 2.1f;
                        }
                        f18 = fM61634m16 * f19;
                    } else {
                        if (z28) {
                            i38 = 220;
                        } else {
                            i38 = 120;
                        }
                        f18 = i38;
                    }
                    Modifier modifierM3411h15 = AbstractC1102d.m3411h(f18, modifierM3409f119);
                    C17909s c17909s15 = AbstractC17911t.f69612b;
                    str5 = str4;
                    i39 = i16;
                    C23465k c23465k15 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                    Float fValueOf15 = Float.valueOf(0.5f);
                    C38072d c38072d15 = C38072d.f163053a;
                    int i419 = C38072d.f163054b;
                    AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h15, C17909s.m51494l(c17909s15, new C23465k[]{c23465k15, new C23465k(fValueOf15, new C17919x(C17919x.m51541c(0.75f, c38072d15.m121949b(c28655q, i419).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d15.m121949b(c28655q, i419).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d15.m121949b(c28655q, i419).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                    c1100b = C1100b.f4583a;
                    if (z28) {
                        c28655q.m87150e0(-291014767);
                        z35 = true;
                        float f2111111118 = 8;
                        float f2111111119 = 1 * f2111111118;
                        float f21111111110 = ((float) 1.5d) * f2111111118;
                        AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2111111119 + f21111111110, c28655q, 0);
                        Modifier modifierM3398t119 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111110, 0.0f, f21111111110, f2111111119, 2);
                        C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21111111110), C2299e.f9110M, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q.m87165m();
                        Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q, modifierM3398t119);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a15);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1117);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1117);
                        if (z29) {
                            c28655q.m87150e0(-1103518372);
                            z34 = z27;
                            AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                            str6 = str5;
                            z36 = false;
                            c28655q.m87173q(false);
                        } else {
                            z34 = z27;
                            str6 = str5;
                            z36 = false;
                            c28655q.m87150e0(-1103088805);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f1110 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C13921a0(24, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f1110, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z36);
                    } else {
                        z34 = z27;
                        f16 = f16;
                        str6 = str5;
                        c28655q.m87150e0(-289531355);
                        float f21111111111 = 8;
                        float f21111111112 = ((float) 1.5d) * f21111111111;
                        float f21111111113 = 1 * f21111111111;
                        Modifier modifierM3398t1110 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111112, 0.0f, f21111111112, f21111111113, 2);
                        C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21111111113), C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q, modifierM3398t1110);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a15);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1118);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1118);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement15 = new LayoutWeightElement(1.0f, true);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13921a0(25, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement15, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            fM61634m = m61634m(interfaceC28601c1);
                        } else {
                            fM61634m = 56;
                        }
                        AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                        z35 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z35);
                    str3 = str6;
                    interfaceC4339a3 = interfaceC4339a4;
                    z19 = z34;
                    modifier3 = modifier11;
                    z17 = z28;
                    z18 = z29;
                    f15 = f16;
                } else {
                    z29 = z25;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1116);
                Modifier modifierM3409f1111 = AbstractC1102d.m3409f(1.0f, c2314t);
                f17 = 0;
                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                    float fM61634m17 = m61634m(interfaceC28601c1);
                    if (z28) {
                        f19 = 3.4f;
                    } else {
                        f19 = 2.1f;
                    }
                    f18 = fM61634m17 * f19;
                } else {
                    if (z28) {
                        i38 = 220;
                    } else {
                        i38 = 120;
                    }
                    f18 = i38;
                }
                Modifier modifierM3411h16 = AbstractC1102d.m3411h(f18, modifierM3409f1111);
                C17909s c17909s16 = AbstractC17911t.f69612b;
                str5 = str4;
                i39 = i16;
                C23465k c23465k16 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                Float fValueOf16 = Float.valueOf(0.5f);
                C38072d c38072d16 = C38072d.f163053a;
                int i4110 = C38072d.f163054b;
                AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h16, C17909s.m51494l(c17909s16, new C23465k[]{c23465k16, new C23465k(fValueOf16, new C17919x(C17919x.m51541c(0.75f, c38072d16.m121949b(c28655q, i4110).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d16.m121949b(c28655q, i4110).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d16.m121949b(c28655q, i4110).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                c1100b = C1100b.f4583a;
                if (z28) {
                    c28655q.m87150e0(-291014767);
                    z35 = true;
                    float f21111111114 = 8;
                    float f21111111115 = 1 * f21111111114;
                    float f21111111116 = ((float) 1.5d) * f21111111114;
                    AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f21111111115 + f21111111116, c28655q, 0);
                    Modifier modifierM3398t1111 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111116, 0.0f, f21111111116, f21111111115, 2);
                    C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21111111116), C2299e.f9110M, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q.m87165m();
                    Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q, modifierM3398t1111);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a16);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1119);
                    if (z29) {
                        c28655q.m87150e0(-1103518372);
                        z34 = z27;
                        AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                        str6 = str5;
                        z36 = false;
                        c28655q.m87173q(false);
                    } else {
                        z34 = z27;
                        str6 = str5;
                        z36 = false;
                        c28655q.m87150e0(-1103088805);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f1112 = AbstractC1102d.m3409f(1.0f, c2314t);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C13921a0(24, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f1112, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(z36);
                } else {
                    z34 = z27;
                    f16 = f16;
                    str6 = str5;
                    c28655q.m87150e0(-289531355);
                    float f21111111117 = 8;
                    float f21111111118 = ((float) 1.5d) * f21111111117;
                    float f21111111119 = 1 * f21111111117;
                    Modifier modifierM3398t1112 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111118, 0.0f, f21111111118, f21111111119, 2);
                    C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21111111119), C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q.m87165m();
                    Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q, modifierM3398t1112);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a16);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11110);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement16 = new LayoutWeightElement(1.0f, true);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13921a0(25, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement16, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        fM61634m = m61634m(interfaceC28601c1);
                    } else {
                        fM61634m = 56;
                    }
                    AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                    z35 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z35);
                str3 = str6;
                interfaceC4339a3 = interfaceC4339a4;
                z19 = z34;
                modifier3 = modifier11;
                z17 = z28;
                z18 = z29;
                f15 = f16;
            } else {
                c28655q.m87138X();
                z17 = z13;
                z18 = z14;
                str3 = str2;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
                f15 = f14;
                z19 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
            }
        }
        i16 |= 24576;
        modifier2 = modifier;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i13) == 0) {
                f14 = f13;
                if (c28655q.m87147d(f14)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
            i19 = i15 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 128;
            if (i25 != 0) {
                i16 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q.m87155h(z13)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i16 |= i26;
            }
            i27 = i15 & 256;
            if (i27 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
                i29 = i15 & 512;
                if (i29 != 0) {
                    if ((i13 & 805306368) == 0) {
                        if (c28655q.m87155h(z15)) {
                            i34 = 536870912;
                        } else {
                            i34 = 268435456;
                        }
                        i16 |= i34;
                    }
                    i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i35 != 0) {
                        i36 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        if (c28655q.m87153g(str2)) {
                            i37 = 4;
                        } else {
                            i37 = 2;
                        }
                        i36 = i14 | i37;
                    } else {
                        i36 = i14;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z16)) {
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i17 != 0) {
                            f16 = 1.0f;
                        } else {
                            f16 = f14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i19 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C21769a(15);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                        }
                        interfaceC4339a4 = interfaceC4339a2;
                        if (i25 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i27 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i29 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i35 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        z27 = z26;
                        Modifier modifierM3427x9 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        Modifier modifier12 = modifier2;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q.m87165m();
                        Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q, modifierM3427x9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        z28 = z24;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d9);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            z29 = z25;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111);
                            Modifier modifierM3409f1113 = AbstractC1102d.m3409f(1.0f, c2314t);
                            f17 = 0;
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                float fM61634m18 = m61634m(interfaceC28601c1);
                                if (z28) {
                                    f19 = 3.4f;
                                } else {
                                    f19 = 2.1f;
                                }
                                f18 = fM61634m18 * f19;
                            } else {
                                if (z28) {
                                    i38 = 220;
                                } else {
                                    i38 = 120;
                                }
                                f18 = i38;
                            }
                            Modifier modifierM3411h17 = AbstractC1102d.m3411h(f18, modifierM3409f1113);
                            C17909s c17909s17 = AbstractC17911t.f69612b;
                            str5 = str4;
                            i39 = i16;
                            C23465k c23465k17 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                            Float fValueOf17 = Float.valueOf(0.5f);
                            C38072d c38072d17 = C38072d.f163053a;
                            int i4111 = C38072d.f163054b;
                            AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h17, C17909s.m51494l(c17909s17, new C23465k[]{c23465k17, new C23465k(fValueOf17, new C17919x(C17919x.m51541c(0.75f, c38072d17.m121949b(c28655q, i4111).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d17.m121949b(c28655q, i4111).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d17.m121949b(c28655q, i4111).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                            c1100b = C1100b.f4583a;
                            if (z28) {
                                c28655q.m87150e0(-291014767);
                                z35 = true;
                                float f211111111110 = 8;
                                float f211111111111 = 1 * f211111111110;
                                float f211111111112 = ((float) 1.5d) * f211111111110;
                                AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211111111111 + f211111111112, c28655q, 0);
                                Modifier modifierM3398t1113 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111111112, 0.0f, f211111111112, f211111111111, 2);
                                C23010x c23010xM66775a17 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f211111111112), C2299e.f9110M, c28655q, 6);
                                iHashCode3 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q.m87165m();
                                Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q, modifierM3398t1113);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a17);
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11112);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11112);
                                if (z29) {
                                    c28655q.m87150e0(-1103518372);
                                    z34 = z27;
                                    AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                    str6 = str5;
                                    z36 = false;
                                    c28655q.m87173q(false);
                                } else {
                                    z34 = z27;
                                    str6 = str5;
                                    z36 = false;
                                    c28655q.m87150e0(-1103088805);
                                    c28655q.m87173q(false);
                                }
                                Modifier modifierM3409f1114 = AbstractC1102d.m3409f(1.0f, c2314t);
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f1114, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                c28655q.m87173q(true);
                                c28655q.m87173q(z36);
                            } else {
                                z34 = z27;
                                f16 = f16;
                                str6 = str5;
                                c28655q.m87150e0(-289531355);
                                float f211111111113 = 8;
                                float f211111111114 = ((float) 1.5d) * f211111111113;
                                float f211111111115 = 1 * f211111111113;
                                Modifier modifierM3398t1114 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111111114, 0.0f, f211111111114, f211111111115, 2);
                                C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f211111111115), C2299e.f9108K, c28655q, 54);
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q.m87165m();
                                Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q, modifierM3398t1114);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a17);
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11113);
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11113);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                LayoutWeightElement layoutWeightElement17 = new LayoutWeightElement(1.0f, true);
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement17, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                    fM61634m = m61634m(interfaceC28601c1);
                                } else {
                                    fM61634m = 56;
                                }
                                AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                                z35 = true;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z35);
                            str3 = str6;
                            interfaceC4339a3 = interfaceC4339a4;
                            z19 = z34;
                            modifier3 = modifier12;
                            z17 = z28;
                            z18 = z29;
                            f15 = f16;
                        } else {
                            z29 = z25;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111);
                        Modifier modifierM3409f1115 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f17 = 0;
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            float fM61634m19 = m61634m(interfaceC28601c1);
                            if (z28) {
                                f19 = 3.4f;
                            } else {
                                f19 = 2.1f;
                            }
                            f18 = fM61634m19 * f19;
                        } else {
                            if (z28) {
                                i38 = 220;
                            } else {
                                i38 = 120;
                            }
                            f18 = i38;
                        }
                        Modifier modifierM3411h18 = AbstractC1102d.m3411h(f18, modifierM3409f1115);
                        C17909s c17909s18 = AbstractC17911t.f69612b;
                        str5 = str4;
                        i39 = i16;
                        C23465k c23465k18 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                        Float fValueOf18 = Float.valueOf(0.5f);
                        C38072d c38072d18 = C38072d.f163053a;
                        int i4112 = C38072d.f163054b;
                        AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h18, C17909s.m51494l(c17909s18, new C23465k[]{c23465k18, new C23465k(fValueOf18, new C17919x(C17919x.m51541c(0.75f, c38072d18.m121949b(c28655q, i4112).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d18.m121949b(c28655q, i4112).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d18.m121949b(c28655q, i4112).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                        c1100b = C1100b.f4583a;
                        if (z28) {
                            c28655q.m87150e0(-291014767);
                            z35 = true;
                            float f211111111116 = 8;
                            float f211111111117 = 1 * f211111111116;
                            float f211111111118 = ((float) 1.5d) * f211111111116;
                            AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211111111117 + f211111111118, c28655q, 0);
                            Modifier modifierM3398t1115 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111111118, 0.0f, f211111111118, f211111111117, 2);
                            C23010x c23010xM66775a18 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f211111111118), C2299e.f9110M, c28655q, 6);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q.m87165m();
                            Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q, modifierM3398t1115);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a18);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11114);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11114);
                            if (z29) {
                                c28655q.m87150e0(-1103518372);
                                z34 = z27;
                                AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                str6 = str5;
                                z36 = false;
                                c28655q.m87173q(false);
                            } else {
                                z34 = z27;
                                str6 = str5;
                                z36 = false;
                                c28655q.m87150e0(-1103088805);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f1116 = AbstractC1102d.m3409f(1.0f, c2314t);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f1116, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z36);
                        } else {
                            z34 = z27;
                            f16 = f16;
                            str6 = str5;
                            c28655q.m87150e0(-289531355);
                            float f211111111119 = 8;
                            float f2111111111110 = ((float) 1.5d) * f211111111119;
                            float f2111111111111 = 1 * f211111111119;
                            Modifier modifierM3398t1116 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111111110, 0.0f, f2111111111110, f2111111111111, 2);
                            C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2111111111111), C2299e.f9108K, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q.m87165m();
                            Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q, modifierM3398t1116);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a18);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11115);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11115);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement18 = new LayoutWeightElement(1.0f, true);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement18, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                fM61634m = m61634m(interfaceC28601c1);
                            } else {
                                fM61634m = 56;
                            }
                            AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                            z35 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z35);
                        str3 = str6;
                        interfaceC4339a3 = interfaceC4339a4;
                        z19 = z34;
                        modifier3 = modifier12;
                        z17 = z28;
                        z18 = z29;
                        f15 = f16;
                    } else {
                        c28655q.m87138X();
                        z17 = z13;
                        z18 = z14;
                        str3 = str2;
                        interfaceC4339a3 = interfaceC4339a2;
                        modifier3 = modifier2;
                        f15 = f14;
                        z19 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
                    }
                }
                i16 |= 805306368;
                i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q.m87153g(str2)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i17 != 0) {
                        f16 = 1.0f;
                    } else {
                        f16 = f14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C21769a(15);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    if (i25 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i27 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i29 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i35 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    z27 = z26;
                    Modifier modifierM3427x10 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    Modifier modifier13 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q.m87165m();
                    Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q, modifierM3427x10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z28 = z24;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d10);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11116);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z29 = z25;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11116);
                        Modifier modifierM3409f1117 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f17 = 0;
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            float fM61634m110 = m61634m(interfaceC28601c1);
                            if (z28) {
                                f19 = 3.4f;
                            } else {
                                f19 = 2.1f;
                            }
                            f18 = fM61634m110 * f19;
                        } else {
                            if (z28) {
                                i38 = 220;
                            } else {
                                i38 = 120;
                            }
                            f18 = i38;
                        }
                        Modifier modifierM3411h19 = AbstractC1102d.m3411h(f18, modifierM3409f1117);
                        C17909s c17909s19 = AbstractC17911t.f69612b;
                        str5 = str4;
                        i39 = i16;
                        C23465k c23465k19 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                        Float fValueOf19 = Float.valueOf(0.5f);
                        C38072d c38072d19 = C38072d.f163053a;
                        int i4113 = C38072d.f163054b;
                        AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h19, C17909s.m51494l(c17909s19, new C23465k[]{c23465k19, new C23465k(fValueOf19, new C17919x(C17919x.m51541c(0.75f, c38072d19.m121949b(c28655q, i4113).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d19.m121949b(c28655q, i4113).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d19.m121949b(c28655q, i4113).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                        c1100b = C1100b.f4583a;
                        if (z28) {
                            c28655q.m87150e0(-291014767);
                            z35 = true;
                            float f2111111111112 = 8;
                            float f2111111111113 = 1 * f2111111111112;
                            float f2111111111114 = ((float) 1.5d) * f2111111111112;
                            AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2111111111113 + f2111111111114, c28655q, 0);
                            Modifier modifierM3398t1117 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111111114, 0.0f, f2111111111114, f2111111111113, 2);
                            C23010x c23010xM66775a19 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f2111111111114), C2299e.f9110M, c28655q, 6);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q.m87165m();
                            Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q, modifierM3398t1117);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a19);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11117);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11117);
                            if (z29) {
                                c28655q.m87150e0(-1103518372);
                                z34 = z27;
                                AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                str6 = str5;
                                z36 = false;
                                c28655q.m87173q(false);
                            } else {
                                z34 = z27;
                                str6 = str5;
                                z36 = false;
                                c28655q.m87150e0(-1103088805);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f1118 = AbstractC1102d.m3409f(1.0f, c2314t);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f1118, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z36);
                        } else {
                            z34 = z27;
                            f16 = f16;
                            str6 = str5;
                            c28655q.m87150e0(-289531355);
                            float f2111111111115 = 8;
                            float f2111111111116 = ((float) 1.5d) * f2111111111115;
                            float f2111111111117 = 1 * f2111111111115;
                            Modifier modifierM3398t1118 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111111116, 0.0f, f2111111111116, f2111111111117, 2);
                            C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2111111111117), C2299e.f9108K, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q.m87165m();
                            Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q, modifierM3398t1118);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a19);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11118);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11118);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement19 = new LayoutWeightElement(1.0f, true);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement19, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                fM61634m = m61634m(interfaceC28601c1);
                            } else {
                                fM61634m = 56;
                            }
                            AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                            z35 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z35);
                        str3 = str6;
                        interfaceC4339a3 = interfaceC4339a4;
                        z19 = z34;
                        modifier3 = modifier13;
                        z17 = z28;
                        z18 = z29;
                        f15 = f16;
                    } else {
                        z29 = z25;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11116);
                    Modifier modifierM3409f1119 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f17 = 0;
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        float fM61634m111 = m61634m(interfaceC28601c1);
                        if (z28) {
                            f19 = 3.4f;
                        } else {
                            f19 = 2.1f;
                        }
                        f18 = fM61634m111 * f19;
                    } else {
                        if (z28) {
                            i38 = 220;
                        } else {
                            i38 = 120;
                        }
                        f18 = i38;
                    }
                    Modifier modifierM3411h110 = AbstractC1102d.m3411h(f18, modifierM3409f1119);
                    C17909s c17909s110 = AbstractC17911t.f69612b;
                    str5 = str4;
                    i39 = i16;
                    C23465k c23465k110 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                    Float fValueOf110 = Float.valueOf(0.5f);
                    C38072d c38072d110 = C38072d.f163053a;
                    int i4114 = C38072d.f163054b;
                    AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h110, C17909s.m51494l(c17909s110, new C23465k[]{c23465k110, new C23465k(fValueOf110, new C17919x(C17919x.m51541c(0.75f, c38072d110.m121949b(c28655q, i4114).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d110.m121949b(c28655q, i4114).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d110.m121949b(c28655q, i4114).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                    c1100b = C1100b.f4583a;
                    if (z28) {
                        c28655q.m87150e0(-291014767);
                        z35 = true;
                        float f2111111111118 = 8;
                        float f2111111111119 = 1 * f2111111111118;
                        float f21111111111110 = ((float) 1.5d) * f2111111111118;
                        AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2111111111119 + f21111111111110, c28655q, 0);
                        Modifier modifierM3398t1119 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111110, 0.0f, f21111111111110, f2111111111119, 2);
                        C23010x c23010xM66775a110 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21111111111110), C2299e.f9110M, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q.m87165m();
                        Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q, modifierM3398t1119);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a110);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11119);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11119);
                        if (z29) {
                            c28655q.m87150e0(-1103518372);
                            z34 = z27;
                            AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                            str6 = str5;
                            z36 = false;
                            c28655q.m87173q(false);
                        } else {
                            z34 = z27;
                            str6 = str5;
                            z36 = false;
                            c28655q.m87150e0(-1103088805);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f11110 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C13921a0(24, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f11110, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z36);
                    } else {
                        z34 = z27;
                        f16 = f16;
                        str6 = str5;
                        c28655q.m87150e0(-289531355);
                        float f21111111111111 = 8;
                        float f21111111111112 = ((float) 1.5d) * f21111111111111;
                        float f21111111111113 = 1 * f21111111111111;
                        Modifier modifierM3398t11110 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111112, 0.0f, f21111111111112, f21111111111113, 2);
                        C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21111111111113), C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q.m87165m();
                        Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q, modifierM3398t11110);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a110);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111110);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111110);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement110 = new LayoutWeightElement(1.0f, true);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13921a0(25, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement110, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            fM61634m = m61634m(interfaceC28601c1);
                        } else {
                            fM61634m = 56;
                        }
                        AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                        z35 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z35);
                    str3 = str6;
                    interfaceC4339a3 = interfaceC4339a4;
                    z19 = z34;
                    modifier3 = modifier13;
                    z17 = z28;
                    z18 = z29;
                    f15 = f16;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier2;
                    f15 = f14;
                    z19 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
                }
            }
            i16 |= 100663296;
            i29 = i15 & 512;
            if (i29 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i16 |= i34;
                }
                i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q.m87153g(str2)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i17 != 0) {
                        f16 = 1.0f;
                    } else {
                        f16 = f14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C21769a(15);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    if (i25 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i27 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i29 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i35 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    z27 = z26;
                    Modifier modifierM3427x11 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    Modifier modifier14 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q.m87165m();
                    Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q, modifierM3427x11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z28 = z24;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d11);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111111);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z29 = z25;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111111);
                        Modifier modifierM3409f11111 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f17 = 0;
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            float fM61634m112 = m61634m(interfaceC28601c1);
                            if (z28) {
                                f19 = 3.4f;
                            } else {
                                f19 = 2.1f;
                            }
                            f18 = fM61634m112 * f19;
                        } else {
                            if (z28) {
                                i38 = 220;
                            } else {
                                i38 = 120;
                            }
                            f18 = i38;
                        }
                        Modifier modifierM3411h111 = AbstractC1102d.m3411h(f18, modifierM3409f11111);
                        C17909s c17909s111 = AbstractC17911t.f69612b;
                        str5 = str4;
                        i39 = i16;
                        C23465k c23465k111 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                        Float fValueOf111 = Float.valueOf(0.5f);
                        C38072d c38072d111 = C38072d.f163053a;
                        int i4115 = C38072d.f163054b;
                        AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h111, C17909s.m51494l(c17909s111, new C23465k[]{c23465k111, new C23465k(fValueOf111, new C17919x(C17919x.m51541c(0.75f, c38072d111.m121949b(c28655q, i4115).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d111.m121949b(c28655q, i4115).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d111.m121949b(c28655q, i4115).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                        c1100b = C1100b.f4583a;
                        if (z28) {
                            c28655q.m87150e0(-291014767);
                            z35 = true;
                            float f21111111111114 = 8;
                            float f21111111111115 = 1 * f21111111111114;
                            float f21111111111116 = ((float) 1.5d) * f21111111111114;
                            AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f21111111111115 + f21111111111116, c28655q, 0);
                            Modifier modifierM3398t11111 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111116, 0.0f, f21111111111116, f21111111111115, 2);
                            C23010x c23010xM66775a111 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21111111111116), C2299e.f9110M, c28655q, 6);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q.m87165m();
                            Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q, modifierM3398t11111);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a111);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111112);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111112);
                            if (z29) {
                                c28655q.m87150e0(-1103518372);
                                z34 = z27;
                                AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                str6 = str5;
                                z36 = false;
                                c28655q.m87173q(false);
                            } else {
                                z34 = z27;
                                str6 = str5;
                                z36 = false;
                                c28655q.m87150e0(-1103088805);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f11112 = AbstractC1102d.m3409f(1.0f, c2314t);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f11112, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z36);
                        } else {
                            z34 = z27;
                            f16 = f16;
                            str6 = str5;
                            c28655q.m87150e0(-289531355);
                            float f21111111111117 = 8;
                            float f21111111111118 = ((float) 1.5d) * f21111111111117;
                            float f21111111111119 = 1 * f21111111111117;
                            Modifier modifierM3398t11112 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111118, 0.0f, f21111111111118, f21111111111119, 2);
                            C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21111111111119), C2299e.f9108K, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q.m87165m();
                            Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q, modifierM3398t11112);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a111);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111113);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111113);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement111 = new LayoutWeightElement(1.0f, true);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement111, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                fM61634m = m61634m(interfaceC28601c1);
                            } else {
                                fM61634m = 56;
                            }
                            AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                            z35 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z35);
                        str3 = str6;
                        interfaceC4339a3 = interfaceC4339a4;
                        z19 = z34;
                        modifier3 = modifier14;
                        z17 = z28;
                        z18 = z29;
                        f15 = f16;
                    } else {
                        z29 = z25;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111111);
                    Modifier modifierM3409f11113 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f17 = 0;
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        float fM61634m113 = m61634m(interfaceC28601c1);
                        if (z28) {
                            f19 = 3.4f;
                        } else {
                            f19 = 2.1f;
                        }
                        f18 = fM61634m113 * f19;
                    } else {
                        if (z28) {
                            i38 = 220;
                        } else {
                            i38 = 120;
                        }
                        f18 = i38;
                    }
                    Modifier modifierM3411h112 = AbstractC1102d.m3411h(f18, modifierM3409f11113);
                    C17909s c17909s112 = AbstractC17911t.f69612b;
                    str5 = str4;
                    i39 = i16;
                    C23465k c23465k112 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                    Float fValueOf112 = Float.valueOf(0.5f);
                    C38072d c38072d112 = C38072d.f163053a;
                    int i4116 = C38072d.f163054b;
                    AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h112, C17909s.m51494l(c17909s112, new C23465k[]{c23465k112, new C23465k(fValueOf112, new C17919x(C17919x.m51541c(0.75f, c38072d112.m121949b(c28655q, i4116).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d112.m121949b(c28655q, i4116).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d112.m121949b(c28655q, i4116).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                    c1100b = C1100b.f4583a;
                    if (z28) {
                        c28655q.m87150e0(-291014767);
                        z35 = true;
                        float f211111111111110 = 8;
                        float f211111111111111 = 1 * f211111111111110;
                        float f211111111111112 = ((float) 1.5d) * f211111111111110;
                        AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211111111111111 + f211111111111112, c28655q, 0);
                        Modifier modifierM3398t11113 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111111111112, 0.0f, f211111111111112, f211111111111111, 2);
                        C23010x c23010xM66775a112 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f211111111111112), C2299e.f9110M, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q.m87165m();
                        Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q, modifierM3398t11113);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a112);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111114);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111114);
                        if (z29) {
                            c28655q.m87150e0(-1103518372);
                            z34 = z27;
                            AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                            str6 = str5;
                            z36 = false;
                            c28655q.m87173q(false);
                        } else {
                            z34 = z27;
                            str6 = str5;
                            z36 = false;
                            c28655q.m87150e0(-1103088805);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f11114 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C13921a0(24, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f11114, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z36);
                    } else {
                        z34 = z27;
                        f16 = f16;
                        str6 = str5;
                        c28655q.m87150e0(-289531355);
                        float f211111111111113 = 8;
                        float f211111111111114 = ((float) 1.5d) * f211111111111113;
                        float f211111111111115 = 1 * f211111111111113;
                        Modifier modifierM3398t11114 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111111111114, 0.0f, f211111111111114, f211111111111115, 2);
                        C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f211111111111115), C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q.m87165m();
                        Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q, modifierM3398t11114);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a112);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111115);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111115);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement112 = new LayoutWeightElement(1.0f, true);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13921a0(25, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement112, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            fM61634m = m61634m(interfaceC28601c1);
                        } else {
                            fM61634m = 56;
                        }
                        AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                        z35 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z35);
                    str3 = str6;
                    interfaceC4339a3 = interfaceC4339a4;
                    z19 = z34;
                    modifier3 = modifier14;
                    z17 = z28;
                    z18 = z29;
                    f15 = f16;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier2;
                    f15 = f14;
                    z19 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
                }
            }
            i16 |= 805306368;
            i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q.m87153g(str2)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i14 | i37;
            } else {
                i36 = i14;
            }
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    modifier2 = c2314t;
                }
                if (i17 != 0) {
                    f16 = 1.0f;
                } else {
                    f16 = f14;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C21769a(15);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                }
                interfaceC4339a4 = interfaceC4339a2;
                if (i25 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if (i27 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                if (i29 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i35 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                z27 = z26;
                Modifier modifierM3427x12 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                Modifier modifier15 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q.m87165m();
                Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q, modifierM3427x12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                z28 = z24;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d12);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111116);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    z29 = z25;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111116);
                    Modifier modifierM3409f11115 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f17 = 0;
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        float fM61634m114 = m61634m(interfaceC28601c1);
                        if (z28) {
                            f19 = 3.4f;
                        } else {
                            f19 = 2.1f;
                        }
                        f18 = fM61634m114 * f19;
                    } else {
                        if (z28) {
                            i38 = 220;
                        } else {
                            i38 = 120;
                        }
                        f18 = i38;
                    }
                    Modifier modifierM3411h113 = AbstractC1102d.m3411h(f18, modifierM3409f11115);
                    C17909s c17909s113 = AbstractC17911t.f69612b;
                    str5 = str4;
                    i39 = i16;
                    C23465k c23465k113 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                    Float fValueOf113 = Float.valueOf(0.5f);
                    C38072d c38072d113 = C38072d.f163053a;
                    int i4117 = C38072d.f163054b;
                    AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h113, C17909s.m51494l(c17909s113, new C23465k[]{c23465k113, new C23465k(fValueOf113, new C17919x(C17919x.m51541c(0.75f, c38072d113.m121949b(c28655q, i4117).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d113.m121949b(c28655q, i4117).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d113.m121949b(c28655q, i4117).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                    c1100b = C1100b.f4583a;
                    if (z28) {
                        c28655q.m87150e0(-291014767);
                        z35 = true;
                        float f211111111111116 = 8;
                        float f211111111111117 = 1 * f211111111111116;
                        float f211111111111118 = ((float) 1.5d) * f211111111111116;
                        AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211111111111117 + f211111111111118, c28655q, 0);
                        Modifier modifierM3398t11115 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111111111118, 0.0f, f211111111111118, f211111111111117, 2);
                        C23010x c23010xM66775a113 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f211111111111118), C2299e.f9110M, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111117 = c28655q.m87165m();
                        Modifier modifierM118962N111117 = AbstractC37056f.m118962N(c28655q, modifierM3398t11115);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a113);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111117);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111117);
                        if (z29) {
                            c28655q.m87150e0(-1103518372);
                            z34 = z27;
                            AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                            str6 = str5;
                            z36 = false;
                            c28655q.m87173q(false);
                        } else {
                            z34 = z27;
                            str6 = str5;
                            z36 = false;
                            c28655q.m87150e0(-1103088805);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f11116 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C13921a0(24, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f11116, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z36);
                    } else {
                        z34 = z27;
                        f16 = f16;
                        str6 = str5;
                        c28655q.m87150e0(-289531355);
                        float f211111111111119 = 8;
                        float f2111111111111110 = ((float) 1.5d) * f211111111111119;
                        float f2111111111111111 = 1 * f211111111111119;
                        Modifier modifierM3398t11116 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111111111110, 0.0f, f2111111111111110, f2111111111111111, 2);
                        C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2111111111111111), C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111118 = c28655q.m87165m();
                        Modifier modifierM118962N111118 = AbstractC37056f.m118962N(c28655q, modifierM3398t11116);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a113);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111118);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111118);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement113 = new LayoutWeightElement(1.0f, true);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13921a0(25, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement113, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            fM61634m = m61634m(interfaceC28601c1);
                        } else {
                            fM61634m = 56;
                        }
                        AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                        z35 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z35);
                    str3 = str6;
                    interfaceC4339a3 = interfaceC4339a4;
                    z19 = z34;
                    modifier3 = modifier15;
                    z17 = z28;
                    z18 = z29;
                    f15 = f16;
                } else {
                    z29 = z25;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111116);
                Modifier modifierM3409f11117 = AbstractC1102d.m3409f(1.0f, c2314t);
                f17 = 0;
                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                    float fM61634m115 = m61634m(interfaceC28601c1);
                    if (z28) {
                        f19 = 3.4f;
                    } else {
                        f19 = 2.1f;
                    }
                    f18 = fM61634m115 * f19;
                } else {
                    if (z28) {
                        i38 = 220;
                    } else {
                        i38 = 120;
                    }
                    f18 = i38;
                }
                Modifier modifierM3411h114 = AbstractC1102d.m3411h(f18, modifierM3409f11117);
                C17909s c17909s114 = AbstractC17911t.f69612b;
                str5 = str4;
                i39 = i16;
                C23465k c23465k114 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                Float fValueOf114 = Float.valueOf(0.5f);
                C38072d c38072d114 = C38072d.f163053a;
                int i4118 = C38072d.f163054b;
                AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h114, C17909s.m51494l(c17909s114, new C23465k[]{c23465k114, new C23465k(fValueOf114, new C17919x(C17919x.m51541c(0.75f, c38072d114.m121949b(c28655q, i4118).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d114.m121949b(c28655q, i4118).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d114.m121949b(c28655q, i4118).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                c1100b = C1100b.f4583a;
                if (z28) {
                    c28655q.m87150e0(-291014767);
                    z35 = true;
                    float f2111111111111112 = 8;
                    float f2111111111111113 = 1 * f2111111111111112;
                    float f2111111111111114 = ((float) 1.5d) * f2111111111111112;
                    AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2111111111111113 + f2111111111111114, c28655q, 0);
                    Modifier modifierM3398t11117 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111111111114, 0.0f, f2111111111111114, f2111111111111113, 2);
                    C23010x c23010xM66775a114 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f2111111111111114), C2299e.f9110M, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111119 = c28655q.m87165m();
                    Modifier modifierM118962N111119 = AbstractC37056f.m118962N(c28655q, modifierM3398t11117);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a114);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111119);
                    if (z29) {
                        c28655q.m87150e0(-1103518372);
                        z34 = z27;
                        AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                        str6 = str5;
                        z36 = false;
                        c28655q.m87173q(false);
                    } else {
                        z34 = z27;
                        str6 = str5;
                        z36 = false;
                        c28655q.m87150e0(-1103088805);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f11118 = AbstractC1102d.m3409f(1.0f, c2314t);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C13921a0(24, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f11118, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(z36);
                } else {
                    z34 = z27;
                    f16 = f16;
                    str6 = str5;
                    c28655q.m87150e0(-289531355);
                    float f2111111111111115 = 8;
                    float f2111111111111116 = ((float) 1.5d) * f2111111111111115;
                    float f2111111111111117 = 1 * f2111111111111115;
                    Modifier modifierM3398t11118 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111111111116, 0.0f, f2111111111111116, f2111111111111117, 2);
                    C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2111111111111117), C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111110 = c28655q.m87165m();
                    Modifier modifierM118962N1111110 = AbstractC37056f.m118962N(c28655q, modifierM3398t11118);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a114);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111110);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement114 = new LayoutWeightElement(1.0f, true);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13921a0(25, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement114, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        fM61634m = m61634m(interfaceC28601c1);
                    } else {
                        fM61634m = 56;
                    }
                    AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                    z35 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z35);
                str3 = str6;
                interfaceC4339a3 = interfaceC4339a4;
                z19 = z34;
                modifier3 = modifier15;
                z17 = z28;
                z18 = z29;
                f15 = f16;
            } else {
                c28655q.m87138X();
                z17 = z13;
                z18 = z14;
                str3 = str2;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
                f15 = f14;
                z19 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        f14 = f13;
        i19 = i15 & 64;
        if (i19 != 0) {
            i16 |= 1572864;
            interfaceC4339a2 = interfaceC4339a;
        } else {
            interfaceC4339a2 = interfaceC4339a;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
        }
        i25 = i15 & 128;
        if (i25 != 0) {
            i16 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q.m87155h(z13)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i16 |= i26;
        }
        i27 = i15 & 256;
        if (i27 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87155h(z14)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i28;
            }
            i29 = i15 & 512;
            if (i29 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i16 |= i34;
                }
                i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q.m87153g(str2)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i14 | i37;
                } else {
                    i36 = i14;
                }
                if ((i16 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i17 != 0) {
                        f16 = 1.0f;
                    } else {
                        f16 = f14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C21769a(15);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    if (i25 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i27 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i29 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i35 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    z27 = z26;
                    Modifier modifierM3427x13 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    Modifier modifier16 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111 = c28655q.m87165m();
                    Modifier modifierM118962N1111111 = AbstractC37056f.m118962N(c28655q, modifierM3427x13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z28 = z24;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d13);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111111);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z29 = z25;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111111);
                        Modifier modifierM3409f11119 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f17 = 0;
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            float fM61634m116 = m61634m(interfaceC28601c1);
                            if (z28) {
                                f19 = 3.4f;
                            } else {
                                f19 = 2.1f;
                            }
                            f18 = fM61634m116 * f19;
                        } else {
                            if (z28) {
                                i38 = 220;
                            } else {
                                i38 = 120;
                            }
                            f18 = i38;
                        }
                        Modifier modifierM3411h115 = AbstractC1102d.m3411h(f18, modifierM3409f11119);
                        C17909s c17909s115 = AbstractC17911t.f69612b;
                        str5 = str4;
                        i39 = i16;
                        C23465k c23465k115 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                        Float fValueOf115 = Float.valueOf(0.5f);
                        C38072d c38072d115 = C38072d.f163053a;
                        int i4119 = C38072d.f163054b;
                        AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h115, C17909s.m51494l(c17909s115, new C23465k[]{c23465k115, new C23465k(fValueOf115, new C17919x(C17919x.m51541c(0.75f, c38072d115.m121949b(c28655q, i4119).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d115.m121949b(c28655q, i4119).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d115.m121949b(c28655q, i4119).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                        c1100b = C1100b.f4583a;
                        if (z28) {
                            c28655q.m87150e0(-291014767);
                            z35 = true;
                            float f2111111111111118 = 8;
                            float f2111111111111119 = 1 * f2111111111111118;
                            float f21111111111111110 = ((float) 1.5d) * f2111111111111118;
                            AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2111111111111119 + f21111111111111110, c28655q, 0);
                            Modifier modifierM3398t11119 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111111110, 0.0f, f21111111111111110, f2111111111111119, 2);
                            C23010x c23010xM66775a115 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21111111111111110), C2299e.f9110M, c28655q, 6);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1111112 = c28655q.m87165m();
                            Modifier modifierM118962N1111112 = AbstractC37056f.m118962N(c28655q, modifierM3398t11119);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a115);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111112);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111112);
                            if (z29) {
                                c28655q.m87150e0(-1103518372);
                                z34 = z27;
                                AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                                str6 = str5;
                                z36 = false;
                                c28655q.m87173q(false);
                            } else {
                                z34 = z27;
                                str6 = str5;
                                z36 = false;
                                c28655q.m87150e0(-1103088805);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f111110 = AbstractC1102d.m3409f(1.0f, c2314t);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C13921a0(24, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f111110, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(z36);
                        } else {
                            z34 = z27;
                            f16 = f16;
                            str6 = str5;
                            c28655q.m87150e0(-289531355);
                            float f21111111111111111 = 8;
                            float f21111111111111112 = ((float) 1.5d) * f21111111111111111;
                            float f21111111111111113 = 1 * f21111111111111111;
                            Modifier modifierM3398t111110 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111111112, 0.0f, f21111111111111112, f21111111111111113, 2);
                            C22994r1 c22994r1M66759a115 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21111111111111113), C2299e.f9108K, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1111113 = c28655q.m87165m();
                            Modifier modifierM118962N1111113 = AbstractC37056f.m118962N(c28655q, modifierM3398t111110);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a115);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111113);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111113);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement115 = new LayoutWeightElement(1.0f, true);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13921a0(25, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement115, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                                fM61634m = m61634m(interfaceC28601c1);
                            } else {
                                fM61634m = 56;
                            }
                            AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                            z35 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z35);
                        str3 = str6;
                        interfaceC4339a3 = interfaceC4339a4;
                        z19 = z34;
                        modifier3 = modifier16;
                        z17 = z28;
                        z18 = z29;
                        f15 = f16;
                    } else {
                        z29 = z25;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111111);
                    Modifier modifierM3409f111111 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f17 = 0;
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        float fM61634m117 = m61634m(interfaceC28601c1);
                        if (z28) {
                            f19 = 3.4f;
                        } else {
                            f19 = 2.1f;
                        }
                        f18 = fM61634m117 * f19;
                    } else {
                        if (z28) {
                            i38 = 220;
                        } else {
                            i38 = 120;
                        }
                        f18 = i38;
                    }
                    Modifier modifierM3411h116 = AbstractC1102d.m3411h(f18, modifierM3409f111111);
                    C17909s c17909s116 = AbstractC17911t.f69612b;
                    str5 = str4;
                    i39 = i16;
                    C23465k c23465k116 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                    Float fValueOf116 = Float.valueOf(0.5f);
                    C38072d c38072d116 = C38072d.f163053a;
                    int i41110 = C38072d.f163054b;
                    AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h116, C17909s.m51494l(c17909s116, new C23465k[]{c23465k116, new C23465k(fValueOf116, new C17919x(C17919x.m51541c(0.75f, c38072d116.m121949b(c28655q, i41110).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d116.m121949b(c28655q, i41110).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d116.m121949b(c28655q, i41110).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                    c1100b = C1100b.f4583a;
                    if (z28) {
                        c28655q.m87150e0(-291014767);
                        z35 = true;
                        float f21111111111111114 = 8;
                        float f21111111111111115 = 1 * f21111111111111114;
                        float f21111111111111116 = ((float) 1.5d) * f21111111111111114;
                        AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f21111111111111115 + f21111111111111116, c28655q, 0);
                        Modifier modifierM3398t111111 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111111116, 0.0f, f21111111111111116, f21111111111111115, 2);
                        C23010x c23010xM66775a116 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21111111111111116), C2299e.f9110M, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111114 = c28655q.m87165m();
                        Modifier modifierM118962N1111114 = AbstractC37056f.m118962N(c28655q, modifierM3398t111111);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a116);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111114);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111114);
                        if (z29) {
                            c28655q.m87150e0(-1103518372);
                            z34 = z27;
                            AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                            str6 = str5;
                            z36 = false;
                            c28655q.m87173q(false);
                        } else {
                            z34 = z27;
                            str6 = str5;
                            z36 = false;
                            c28655q.m87150e0(-1103088805);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f111112 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C13921a0(24, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f111112, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z36);
                    } else {
                        z34 = z27;
                        f16 = f16;
                        str6 = str5;
                        c28655q.m87150e0(-289531355);
                        float f21111111111111117 = 8;
                        float f21111111111111118 = ((float) 1.5d) * f21111111111111117;
                        float f21111111111111119 = 1 * f21111111111111117;
                        Modifier modifierM3398t111112 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111111118, 0.0f, f21111111111111118, f21111111111111119, 2);
                        C22994r1 c22994r1M66759a116 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21111111111111119), C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111115 = c28655q.m87165m();
                        Modifier modifierM118962N1111115 = AbstractC37056f.m118962N(c28655q, modifierM3398t111112);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a116);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111115);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111115);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement116 = new LayoutWeightElement(1.0f, true);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13921a0(25, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement116, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            fM61634m = m61634m(interfaceC28601c1);
                        } else {
                            fM61634m = 56;
                        }
                        AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                        z35 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z35);
                    str3 = str6;
                    interfaceC4339a3 = interfaceC4339a4;
                    z19 = z34;
                    modifier3 = modifier16;
                    z17 = z28;
                    z18 = z29;
                    f15 = f16;
                } else {
                    c28655q.m87138X();
                    z17 = z13;
                    z18 = z14;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier2;
                    f15 = f14;
                    z19 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
                }
            }
            i16 |= 805306368;
            i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q.m87153g(str2)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i14 | i37;
            } else {
                i36 = i14;
            }
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    modifier2 = c2314t;
                }
                if (i17 != 0) {
                    f16 = 1.0f;
                } else {
                    f16 = f14;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C21769a(15);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                }
                interfaceC4339a4 = interfaceC4339a2;
                if (i25 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if (i27 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                if (i29 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i35 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                z27 = z26;
                Modifier modifierM3427x14 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                Modifier modifier17 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111116 = c28655q.m87165m();
                Modifier modifierM118962N1111116 = AbstractC37056f.m118962N(c28655q, modifierM3427x14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                z28 = z24;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d14);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111116);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    z29 = z25;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111116);
                    Modifier modifierM3409f111113 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f17 = 0;
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        float fM61634m118 = m61634m(interfaceC28601c1);
                        if (z28) {
                            f19 = 3.4f;
                        } else {
                            f19 = 2.1f;
                        }
                        f18 = fM61634m118 * f19;
                    } else {
                        if (z28) {
                            i38 = 220;
                        } else {
                            i38 = 120;
                        }
                        f18 = i38;
                    }
                    Modifier modifierM3411h117 = AbstractC1102d.m3411h(f18, modifierM3409f111113);
                    C17909s c17909s117 = AbstractC17911t.f69612b;
                    str5 = str4;
                    i39 = i16;
                    C23465k c23465k117 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                    Float fValueOf117 = Float.valueOf(0.5f);
                    C38072d c38072d117 = C38072d.f163053a;
                    int i41111 = C38072d.f163054b;
                    AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h117, C17909s.m51494l(c17909s117, new C23465k[]{c23465k117, new C23465k(fValueOf117, new C17919x(C17919x.m51541c(0.75f, c38072d117.m121949b(c28655q, i41111).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d117.m121949b(c28655q, i41111).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d117.m121949b(c28655q, i41111).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                    c1100b = C1100b.f4583a;
                    if (z28) {
                        c28655q.m87150e0(-291014767);
                        z35 = true;
                        float f211111111111111110 = 8;
                        float f211111111111111111 = 1 * f211111111111111110;
                        float f211111111111111112 = ((float) 1.5d) * f211111111111111110;
                        AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211111111111111111 + f211111111111111112, c28655q, 0);
                        Modifier modifierM3398t111113 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111111111111112, 0.0f, f211111111111111112, f211111111111111111, 2);
                        C23010x c23010xM66775a117 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f211111111111111112), C2299e.f9110M, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111117 = c28655q.m87165m();
                        Modifier modifierM118962N1111117 = AbstractC37056f.m118962N(c28655q, modifierM3398t111113);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a117);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111117);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111117);
                        if (z29) {
                            c28655q.m87150e0(-1103518372);
                            z34 = z27;
                            AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                            str6 = str5;
                            z36 = false;
                            c28655q.m87173q(false);
                        } else {
                            z34 = z27;
                            str6 = str5;
                            z36 = false;
                            c28655q.m87150e0(-1103088805);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f111114 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C13921a0(24, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f111114, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z36);
                    } else {
                        z34 = z27;
                        f16 = f16;
                        str6 = str5;
                        c28655q.m87150e0(-289531355);
                        float f211111111111111113 = 8;
                        float f211111111111111114 = ((float) 1.5d) * f211111111111111113;
                        float f211111111111111115 = 1 * f211111111111111113;
                        Modifier modifierM3398t111114 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111111111111114, 0.0f, f211111111111111114, f211111111111111115, 2);
                        C22994r1 c22994r1M66759a117 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f211111111111111115), C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111118 = c28655q.m87165m();
                        Modifier modifierM118962N1111118 = AbstractC37056f.m118962N(c28655q, modifierM3398t111114);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a117);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111118);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111118);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement117 = new LayoutWeightElement(1.0f, true);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13921a0(25, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement117, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            fM61634m = m61634m(interfaceC28601c1);
                        } else {
                            fM61634m = 56;
                        }
                        AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                        z35 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z35);
                    str3 = str6;
                    interfaceC4339a3 = interfaceC4339a4;
                    z19 = z34;
                    modifier3 = modifier17;
                    z17 = z28;
                    z18 = z29;
                    f15 = f16;
                } else {
                    z29 = z25;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111116);
                Modifier modifierM3409f111115 = AbstractC1102d.m3409f(1.0f, c2314t);
                f17 = 0;
                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                    float fM61634m119 = m61634m(interfaceC28601c1);
                    if (z28) {
                        f19 = 3.4f;
                    } else {
                        f19 = 2.1f;
                    }
                    f18 = fM61634m119 * f19;
                } else {
                    if (z28) {
                        i38 = 220;
                    } else {
                        i38 = 120;
                    }
                    f18 = i38;
                }
                Modifier modifierM3411h118 = AbstractC1102d.m3411h(f18, modifierM3409f111115);
                C17909s c17909s118 = AbstractC17911t.f69612b;
                str5 = str4;
                i39 = i16;
                C23465k c23465k118 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                Float fValueOf118 = Float.valueOf(0.5f);
                C38072d c38072d118 = C38072d.f163053a;
                int i41112 = C38072d.f163054b;
                AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h118, C17909s.m51494l(c17909s118, new C23465k[]{c23465k118, new C23465k(fValueOf118, new C17919x(C17919x.m51541c(0.75f, c38072d118.m121949b(c28655q, i41112).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d118.m121949b(c28655q, i41112).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d118.m121949b(c28655q, i41112).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                c1100b = C1100b.f4583a;
                if (z28) {
                    c28655q.m87150e0(-291014767);
                    z35 = true;
                    float f211111111111111116 = 8;
                    float f211111111111111117 = 1 * f211111111111111116;
                    float f211111111111111118 = ((float) 1.5d) * f211111111111111116;
                    AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211111111111111117 + f211111111111111118, c28655q, 0);
                    Modifier modifierM3398t111115 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111111111111118, 0.0f, f211111111111111118, f211111111111111117, 2);
                    C23010x c23010xM66775a118 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f211111111111111118), C2299e.f9110M, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111119 = c28655q.m87165m();
                    Modifier modifierM118962N1111119 = AbstractC37056f.m118962N(c28655q, modifierM3398t111115);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a118);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111119);
                    if (z29) {
                        c28655q.m87150e0(-1103518372);
                        z34 = z27;
                        AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                        str6 = str5;
                        z36 = false;
                        c28655q.m87173q(false);
                    } else {
                        z34 = z27;
                        str6 = str5;
                        z36 = false;
                        c28655q.m87150e0(-1103088805);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f111116 = AbstractC1102d.m3409f(1.0f, c2314t);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C13921a0(24, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f111116, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(z36);
                } else {
                    z34 = z27;
                    f16 = f16;
                    str6 = str5;
                    c28655q.m87150e0(-289531355);
                    float f211111111111111119 = 8;
                    float f2111111111111111110 = ((float) 1.5d) * f211111111111111119;
                    float f2111111111111111111 = 1 * f211111111111111119;
                    Modifier modifierM3398t111116 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111111111111110, 0.0f, f2111111111111111110, f2111111111111111111, 2);
                    C22994r1 c22994r1M66759a118 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2111111111111111111), C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111110 = c28655q.m87165m();
                    Modifier modifierM118962N11111110 = AbstractC37056f.m118962N(c28655q, modifierM3398t111116);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a118);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111110);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement118 = new LayoutWeightElement(1.0f, true);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13921a0(25, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement118, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        fM61634m = m61634m(interfaceC28601c1);
                    } else {
                        fM61634m = 56;
                    }
                    AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                    z35 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z35);
                str3 = str6;
                interfaceC4339a3 = interfaceC4339a4;
                z19 = z34;
                modifier3 = modifier17;
                z17 = z28;
                z18 = z29;
                f15 = f16;
            } else {
                c28655q.m87138X();
                z17 = z13;
                z18 = z14;
                str3 = str2;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
                f15 = f14;
                z19 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
            }
        }
        i16 |= 100663296;
        i29 = i15 & 512;
        if (i29 != 0) {
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87155h(z15)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i16 |= i34;
            }
            i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q.m87153g(str2)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i14 | i37;
            } else {
                i36 = i14;
            }
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    modifier2 = c2314t;
                }
                if (i17 != 0) {
                    f16 = 1.0f;
                } else {
                    f16 = f14;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C21769a(15);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                }
                interfaceC4339a4 = interfaceC4339a2;
                if (i25 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if (i27 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                if (i29 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i35 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                z27 = z26;
                Modifier modifierM3427x15 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                Modifier modifier18 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111 = c28655q.m87165m();
                Modifier modifierM118962N11111111 = AbstractC37056f.m118962N(c28655q, modifierM3427x15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                z28 = z24;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d15);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111111);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    z29 = z25;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111111);
                    Modifier modifierM3409f111117 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f17 = 0;
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        float fM61634m1110 = m61634m(interfaceC28601c1);
                        if (z28) {
                            f19 = 3.4f;
                        } else {
                            f19 = 2.1f;
                        }
                        f18 = fM61634m1110 * f19;
                    } else {
                        if (z28) {
                            i38 = 220;
                        } else {
                            i38 = 120;
                        }
                        f18 = i38;
                    }
                    Modifier modifierM3411h119 = AbstractC1102d.m3411h(f18, modifierM3409f111117);
                    C17909s c17909s119 = AbstractC17911t.f69612b;
                    str5 = str4;
                    i39 = i16;
                    C23465k c23465k119 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                    Float fValueOf119 = Float.valueOf(0.5f);
                    C38072d c38072d119 = C38072d.f163053a;
                    int i41113 = C38072d.f163054b;
                    AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h119, C17909s.m51494l(c17909s119, new C23465k[]{c23465k119, new C23465k(fValueOf119, new C17919x(C17919x.m51541c(0.75f, c38072d119.m121949b(c28655q, i41113).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d119.m121949b(c28655q, i41113).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d119.m121949b(c28655q, i41113).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                    c1100b = C1100b.f4583a;
                    if (z28) {
                        c28655q.m87150e0(-291014767);
                        z35 = true;
                        float f2111111111111111112 = 8;
                        float f2111111111111111113 = 1 * f2111111111111111112;
                        float f2111111111111111114 = ((float) 1.5d) * f2111111111111111112;
                        AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2111111111111111113 + f2111111111111111114, c28655q, 0);
                        Modifier modifierM3398t111117 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111111111111114, 0.0f, f2111111111111111114, f2111111111111111113, 2);
                        C23010x c23010xM66775a119 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f2111111111111111114), C2299e.f9110M, c28655q, 6);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111112 = c28655q.m87165m();
                        Modifier modifierM118962N11111112 = AbstractC37056f.m118962N(c28655q, modifierM3398t111117);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a119);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111112);
                        if (z29) {
                            c28655q.m87150e0(-1103518372);
                            z34 = z27;
                            AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                            str6 = str5;
                            z36 = false;
                            c28655q.m87173q(false);
                        } else {
                            z34 = z27;
                            str6 = str5;
                            z36 = false;
                            c28655q.m87150e0(-1103088805);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f111118 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C13921a0(24, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f111118, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z36);
                    } else {
                        z34 = z27;
                        f16 = f16;
                        str6 = str5;
                        c28655q.m87150e0(-289531355);
                        float f2111111111111111115 = 8;
                        float f2111111111111111116 = ((float) 1.5d) * f2111111111111111115;
                        float f2111111111111111117 = 1 * f2111111111111111115;
                        Modifier modifierM3398t111118 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f2111111111111111116, 0.0f, f2111111111111111116, f2111111111111111117, 2);
                        C22994r1 c22994r1M66759a119 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f2111111111111111117), C2299e.f9108K, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111113 = c28655q.m87165m();
                        Modifier modifierM118962N11111113 = AbstractC37056f.m118962N(c28655q, modifierM3398t111118);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a119);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111113);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111113);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement119 = new LayoutWeightElement(1.0f, true);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13921a0(25, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement119, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                        if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                            fM61634m = m61634m(interfaceC28601c1);
                        } else {
                            fM61634m = 56;
                        }
                        AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                        z35 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z35);
                    str3 = str6;
                    interfaceC4339a3 = interfaceC4339a4;
                    z19 = z34;
                    modifier3 = modifier18;
                    z17 = z28;
                    z18 = z29;
                    f15 = f16;
                } else {
                    z29 = z25;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111111);
                Modifier modifierM3409f111119 = AbstractC1102d.m3409f(1.0f, c2314t);
                f17 = 0;
                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                    float fM61634m1111 = m61634m(interfaceC28601c1);
                    if (z28) {
                        f19 = 3.4f;
                    } else {
                        f19 = 2.1f;
                    }
                    f18 = fM61634m1111 * f19;
                } else {
                    if (z28) {
                        i38 = 220;
                    } else {
                        i38 = 120;
                    }
                    f18 = i38;
                }
                Modifier modifierM3411h1110 = AbstractC1102d.m3411h(f18, modifierM3409f111119);
                C17909s c17909s1110 = AbstractC17911t.f69612b;
                str5 = str4;
                i39 = i16;
                C23465k c23465k1110 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                Float fValueOf1110 = Float.valueOf(0.5f);
                C38072d c38072d1110 = C38072d.f163053a;
                int i41114 = C38072d.f163054b;
                AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h1110, C17909s.m51494l(c17909s1110, new C23465k[]{c23465k1110, new C23465k(fValueOf1110, new C17919x(C17919x.m51541c(0.75f, c38072d1110.m121949b(c28655q, i41114).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d1110.m121949b(c28655q, i41114).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d1110.m121949b(c28655q, i41114).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                c1100b = C1100b.f4583a;
                if (z28) {
                    c28655q.m87150e0(-291014767);
                    z35 = true;
                    float f2111111111111111118 = 8;
                    float f2111111111111111119 = 1 * f2111111111111111118;
                    float f21111111111111111110 = ((float) 1.5d) * f2111111111111111118;
                    AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f2111111111111111119 + f21111111111111111110, c28655q, 0);
                    Modifier modifierM3398t111119 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111111111110, 0.0f, f21111111111111111110, f2111111111111111119, 2);
                    C23010x c23010xM66775a1110 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21111111111111111110), C2299e.f9110M, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111114 = c28655q.m87165m();
                    Modifier modifierM118962N11111114 = AbstractC37056f.m118962N(c28655q, modifierM3398t111119);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a1110);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111114);
                    if (z29) {
                        c28655q.m87150e0(-1103518372);
                        z34 = z27;
                        AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                        str6 = str5;
                        z36 = false;
                        c28655q.m87173q(false);
                    } else {
                        z34 = z27;
                        str6 = str5;
                        z36 = false;
                        c28655q.m87150e0(-1103088805);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f1111110 = AbstractC1102d.m3409f(1.0f, c2314t);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C13921a0(24, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f1111110, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(z36);
                } else {
                    z34 = z27;
                    f16 = f16;
                    str6 = str5;
                    c28655q.m87150e0(-289531355);
                    float f21111111111111111111 = 8;
                    float f21111111111111111112 = ((float) 1.5d) * f21111111111111111111;
                    float f21111111111111111113 = 1 * f21111111111111111111;
                    Modifier modifierM3398t1111110 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111111111112, 0.0f, f21111111111111111112, f21111111111111111113, 2);
                    C22994r1 c22994r1M66759a1110 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21111111111111111113), C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111115 = c28655q.m87165m();
                    Modifier modifierM118962N11111115 = AbstractC37056f.m118962N(c28655q, modifierM3398t1111110);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a1110);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111115);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement1110 = new LayoutWeightElement(1.0f, true);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13921a0(25, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement1110, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        fM61634m = m61634m(interfaceC28601c1);
                    } else {
                        fM61634m = 56;
                    }
                    AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                    z35 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z35);
                str3 = str6;
                interfaceC4339a3 = interfaceC4339a4;
                z19 = z34;
                modifier3 = modifier18;
                z17 = z28;
                z18 = z29;
                f15 = f16;
            } else {
                c28655q.m87138X();
                z17 = z13;
                z18 = z14;
                str3 = str2;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
                f15 = f14;
                z19 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
            }
        }
        i16 |= 805306368;
        i35 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i35 != 0) {
            i36 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q.m87153g(str2)) {
                i37 = 4;
            } else {
                i37 = 2;
            }
            i36 = i14 | i37;
        } else {
            i36 = i14;
        }
        if ((i16 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q.m87135U(i16 & 1, z16)) {
            c2314t = C2314t.f9131w;
            if (i44 != 0) {
                modifier2 = c2314t;
            }
            if (i17 != 0) {
                f16 = 1.0f;
            } else {
                f16 = f14;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C21769a(15);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
            }
            interfaceC4339a4 = interfaceC4339a2;
            if (i25 != 0) {
                z24 = false;
            } else {
                z24 = z13;
            }
            if (i27 != 0) {
                z25 = false;
            } else {
                z25 = z14;
            }
            if (i29 != 0) {
                z26 = false;
            } else {
                z26 = z15;
            }
            if (i35 != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            z27 = z26;
            Modifier modifierM3427x16 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier2), null, 3);
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            Modifier modifier19 = modifier2;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11111116 = c28655q.m87165m();
            Modifier modifierM118962N11111116 = AbstractC37056f.m118962N(c28655q, modifierM3427x16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            z28 = z24;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d16);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111116);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                z29 = z25;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111116);
                Modifier modifierM3409f1111111 = AbstractC1102d.m3409f(1.0f, c2314t);
                f17 = 0;
                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                    float fM61634m1112 = m61634m(interfaceC28601c1);
                    if (z28) {
                        f19 = 3.4f;
                    } else {
                        f19 = 2.1f;
                    }
                    f18 = fM61634m1112 * f19;
                } else {
                    if (z28) {
                        i38 = 220;
                    } else {
                        i38 = 120;
                    }
                    f18 = i38;
                }
                Modifier modifierM3411h1111 = AbstractC1102d.m3411h(f18, modifierM3409f1111111);
                C17909s c17909s1111 = AbstractC17911t.f69612b;
                str5 = str4;
                i39 = i16;
                C23465k c23465k1111 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
                Float fValueOf1111 = Float.valueOf(0.5f);
                C38072d c38072d1111 = C38072d.f163053a;
                int i41115 = C38072d.f163054b;
                AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h1111, C17909s.m51494l(c17909s1111, new C23465k[]{c23465k1111, new C23465k(fValueOf1111, new C17919x(C17919x.m51541c(0.75f, c38072d1111.m121949b(c28655q, i41115).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d1111.m121949b(c28655q, i41115).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d1111.m121949b(c28655q, i41115).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
                c1100b = C1100b.f4583a;
                if (z28) {
                    c28655q.m87150e0(-291014767);
                    z35 = true;
                    float f21111111111111111114 = 8;
                    float f21111111111111111115 = 1 * f21111111111111111114;
                    float f21111111111111111116 = ((float) 1.5d) * f21111111111111111114;
                    AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f21111111111111111115 + f21111111111111111116, c28655q, 0);
                    Modifier modifierM3398t1111111 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111111111116, 0.0f, f21111111111111111116, f21111111111111111115, 2);
                    C23010x c23010xM66775a1111 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f21111111111111111116), C2299e.f9110M, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111117 = c28655q.m87165m();
                    Modifier modifierM118962N11111117 = AbstractC37056f.m118962N(c28655q, modifierM3398t1111111);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a1111);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111117);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111117);
                    if (z29) {
                        c28655q.m87150e0(-1103518372);
                        z34 = z27;
                        AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                        str6 = str5;
                        z36 = false;
                        c28655q.m87173q(false);
                    } else {
                        z34 = z27;
                        str6 = str5;
                        z36 = false;
                        c28655q.m87150e0(-1103088805);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f1111112 = AbstractC1102d.m3409f(1.0f, c2314t);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C13921a0(24, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f1111112, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(z36);
                } else {
                    z34 = z27;
                    f16 = f16;
                    str6 = str5;
                    c28655q.m87150e0(-289531355);
                    float f21111111111111111117 = 8;
                    float f21111111111111111118 = ((float) 1.5d) * f21111111111111111117;
                    float f21111111111111111119 = 1 * f21111111111111111117;
                    Modifier modifierM3398t1111112 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f21111111111111111118, 0.0f, f21111111111111111118, f21111111111111111119, 2);
                    C22994r1 c22994r1M66759a1111 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f21111111111111111119), C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111118 = c28655q.m87165m();
                    Modifier modifierM118962N11111118 = AbstractC37056f.m118962N(c28655q, modifierM3398t1111112);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a1111);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111118);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111118);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement1111 = new LayoutWeightElement(1.0f, true);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13921a0(25, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement1111, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                    if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                        fM61634m = m61634m(interfaceC28601c1);
                    } else {
                        fM61634m = 56;
                    }
                    AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                    z35 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z35);
                str3 = str6;
                interfaceC4339a3 = interfaceC4339a4;
                z19 = z34;
                modifier3 = modifier19;
                z17 = z28;
                z18 = z29;
                f15 = f16;
            } else {
                z29 = z25;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111116);
            Modifier modifierM3409f1111113 = AbstractC1102d.m3409f(1.0f, c2314t);
            f17 = 0;
            if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                float fM61634m1113 = m61634m(interfaceC28601c1);
                if (z28) {
                    f19 = 3.4f;
                } else {
                    f19 = 2.1f;
                }
                f18 = fM61634m1113 * f19;
            } else {
                if (z28) {
                    i38 = 220;
                } else {
                    i38 = 120;
                }
                f18 = i38;
            }
            Modifier modifierM3411h1112 = AbstractC1102d.m3411h(f18, modifierM3409f1111113);
            C17909s c17909s1112 = AbstractC17911t.f69612b;
            str5 = str4;
            i39 = i16;
            C23465k c23465k1112 = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
            Float fValueOf1112 = Float.valueOf(0.5f);
            C38072d c38072d1112 = C38072d.f163053a;
            int i41116 = C38072d.f163054b;
            AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierM3411h1112, C17909s.m51494l(c17909s1112, new C23465k[]{c23465k1112, new C23465k(fValueOf1112, new C17919x(C17919x.m51541c(0.75f, c38072d1112.m121949b(c28655q, i41116).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(0.97f, c38072d1112.m121949b(c28655q, i41116).getBackgroundDarkStd()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d1112.m121949b(c28655q, i41116).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "FloatingBottomNavigationRowView"), c28655q, 0);
            c1100b = C1100b.f4583a;
            if (z28) {
                c28655q.m87150e0(-291014767);
                z35 = true;
                float f211111111111111111110 = 8;
                float f211111111111111111111 = 1 * f211111111111111111110;
                float f211111111111111111112 = ((float) 1.5d) * f211111111111111111110;
                AbstractC12247c.m34103h(m61634m(interfaceC28601c1) + f211111111111111111111 + f211111111111111111112, c28655q, 0);
                Modifier modifierM3398t1111113 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111111111111111112, 0.0f, f211111111111111111112, f211111111111111111111, 2);
                C23010x c23010xM66775a1112 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f211111111111111111112), C2299e.f9110M, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111119 = c28655q.m87165m();
                Modifier modifierM118962N11111119 = AbstractC37056f.m118962N(c28655q, modifierM3398t1111113);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a1112);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111119);
                if (z29) {
                    c28655q.m87150e0(-1103518372);
                    z34 = z27;
                    AbstractC36588p.m117413S(str5, AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), null, interfaceC4339a4, interfaceC4339a4, interfaceC4339a4, null, null, null, null, null, z34, false, null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q, (i36 & 14) | ((i39 >> 9) & 7168) | ((i39 >> 6) & 57344) | ((i39 >> 3) & 458752), (i39 >> 24) & 112, 0, 33552324);
                    str6 = str5;
                    z36 = false;
                    c28655q.m87173q(false);
                } else {
                    z34 = z27;
                    str6 = str5;
                    z36 = false;
                    c28655q.m87150e0(-1103088805);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f1111114 = AbstractC1102d.m3409f(1.0f, c2314t);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C13921a0(24, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R3, modifierM3409f1111114, c28655q, (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                c28655q.m87173q(true);
                c28655q.m87173q(z36);
            } else {
                z34 = z27;
                f16 = f16;
                str6 = str5;
                c28655q.m87150e0(-289531355);
                float f211111111111111111113 = 8;
                float f211111111111111111114 = ((float) 1.5d) * f211111111111111111113;
                float f211111111111111111115 = 1 * f211111111111111111113;
                Modifier modifierM3398t1111114 = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)), null, 3)), f211111111111111111114, 0.0f, f211111111111111111114, f211111111111111111115, 2);
                C22994r1 c22994r1M66759a1112 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f211111111111111111115), C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111110 = c28655q.m87165m();
                Modifier modifierM118962N111111110 = AbstractC37056f.m118962N(c28655q, modifierM3398t1111114);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a1112);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111111110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111111110);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement1112 = new LayoutWeightElement(1.0f, true);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C13921a0(25, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                m61642u(tabs, str, z4, onTabSelected, (Function1) objM87133R2, layoutWeightElement1112, c28655q, (i39 & 14) | 24576 | (i39 & 112) | (i39 & 896) | (i39 & 7168), 0);
                if (Float.compare(m61634m(interfaceC28601c1), f17) > 0) {
                    fM61634m = m61634m(interfaceC28601c1);
                } else {
                    fM61634m = 56;
                }
                AbstractC36578h0.m117329G(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3411h(fM61634m, c2314t), false, 1.0f), "BffCoachFab"), null, f16, null, interfaceC4339a4, c28655q, ((i39 >> 9) & 896) | ((i39 >> 6) & 57344), 10);
                z35 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z35);
            str3 = str6;
            interfaceC4339a3 = interfaceC4339a4;
            z19 = z34;
            modifier3 = modifier19;
            z17 = z28;
            z18 = z29;
            f15 = f16;
        } else {
            c28655q.m87138X();
            z17 = z13;
            z18 = z14;
            str3 = str2;
            interfaceC4339a3 = interfaceC4339a2;
            modifier3 = modifier2;
            f15 = f14;
            z19 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18500j(tabs, str, z4, onTabSelected, modifier3, f15, interfaceC4339a3, z17, z18, z19, str3, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m61633l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final float m61634m(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39174f) interfaceC28601c1.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: n */
    private static final void m61635n(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(new C39174f(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m61636o(InterfaceC28601c1 interfaceC28601c1, C39174f c39174f) {
        m61635n(interfaceC28601c1, c39174f.f168413w);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m61637p(InterfaceC28601c1 interfaceC28601c1, C39174f c39174f) {
        m61635n(interfaceC28601c1, c39174f.f168413w);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m61638q(List list, String str, boolean z4, Function1 function1, Modifier modifier, float f13, InterfaceC4339a interfaceC4339a, boolean z13, boolean z14, boolean z15, String str2, int i13, int i14, int i15, Composer composer, int i16) throws XmlPullParserException, IOException {
        m61632k(list, str, z4, function1, modifier, f13, interfaceC4339a, z13, z14, z15, str2, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:107:0x0209  */
    /* JADX WARN: Code duplicated, block: B:109:0x0217  */
    /* JADX WARN: Code duplicated, block: B:112:0x0240  */
    /* JADX WARN: Code duplicated, block: B:113:0x0243  */
    /* JADX WARN: Code duplicated, block: B:116:0x0257  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:122:0x02db  */
    /* JADX WARN: Code duplicated, block: B:124:0x0329  */
    /* JADX WARN: Code duplicated, block: B:127:0x0334  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x0127  */
    /* JADX WARN: Code duplicated, block: B:86:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0140  */
    /* JADX WARN: Code duplicated, block: B:91:0x014e  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b9  */
    /* JADX INFO: renamed from: r */
    private static final void m61639r(boolean z4, InterfaceC4339a interfaceC4339a, int i13, TextResource textResource, String str, Modifier modifier, boolean z13, Composer composer, int i14, int i15) throws XmlPullParserException, IOException {
        int i16;
        String str2;
        Modifier modifier2;
        int i17;
        boolean z14;
        int i18;
        boolean z15;
        Modifier modifier3;
        boolean z16;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean z17;
        String strM21265c;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        int i19;
        long jM125430y;
        long jM125382b1;
        C1100b c1100b;
        int iHashCode2;
        float f13;
        int iHashCode3;
        long j7;
        C38072d c38072d2;
        int i24;
        long j13;
        int i25 = i13;
        TextResource textResource2 = textResource;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(543974640);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87155h(z4) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87149e(i25) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? c28655q.m87153g(textResource2) : c28655q.m87157i(textResource2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            str2 = str;
            i16 |= c28655q.m87153g(str2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            str2 = str;
        }
        int i26 = i15 & 32;
        if (i26 == 0) {
            if ((196608 & i14) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                if ((1572864 & i14) == 0) {
                    z14 = z13;
                    if (c28655q.m87155h(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i16 |= i18;
                }
                if ((599187 & i16) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i16 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i17 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    strM21265c = AbstractC8692a.m21265c(str2);
                    if (strM21265c == null) {
                        strM21265c = "";
                    }
                    Modifier modifierM3446c = AbstractC1110b.m3446c(modifier4, z4, new C18027i(4), interfaceC4339a, 10);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C21650c(13);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC15676d.m44099b(modifierM3446c, z4, (Function1) objM87133R), strM21265c.concat("_Tab_Button"));
                    C2307m c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44101d);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    int i27 = i16;
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
                    c38072d = C38072d.f163053a;
                    i19 = C38072d.f163054b;
                    jM125430y = c38072d.m121949b(c28655q, i19).getBrandWhite();
                    jM125382b1 = c38072d.m121949b(c28655q, i19).getWhite50();
                    C2307m c2307m2 = C2299e.f9102E;
                    c1100b = C1100b.f4583a;
                    Modifier modifier5 = modifier4;
                    float f14 = 8;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c1100b.mo3400a(c2314t, c2307m2), 0.0f, ((float) 0.5d) * f14, 1);
                    C2305k c2305k = C2299e.f9111N;
                    String str3 = strM21265c;
                    C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 0.75d, f14, c2305k, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
                    f13 = 4;
                    float f15 = 6 * f13;
                    Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1102d.m3419p(f15, c2314t));
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM38560g);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(c1100b.mo3400a(AbstractC1102d.m3419p(f15, c2314t), c2307m2), str3.concat("_Tab_Icon"));
                    i25 = i13;
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(i25, c28655q, ((i27 >> 3) & 112) | 6);
                    if (z4) {
                        j7 = jM125430y;
                    } else {
                        j7 = jM125382b1;
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S, "", modifierM44101d2, j7, c28655q, 48, 0);
                    if (z17) {
                        c28655q.m87150e0(553905031);
                        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3419p(2 * f13, c1100b.mo3400a(c2314t, C2299e.f9116y)), "CommunityBadge");
                        long jM51541c = C17919x.m51541c(0.97f, AbstractC17918w0.m51517e(4280626484L));
                        C33252i c33252i = AbstractC33253j.f138651a;
                        Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.25d) * f13, AbstractC1092a.m3358c(modifierM3599a, jM51541c, c33252i));
                        c38072d2 = c38072d;
                        i24 = i19;
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3394p, c38072d2.m121949b(c28655q, i24).getRecovery(), c33252i), c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c38072d2 = c38072d;
                        i24 = i19;
                        c28655q.m87150e0(554409556);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t), str3.concat("_Tab_Text"));
                    textResource2 = textResource;
                    String strM21274h = AbstractC8693b.m21274h(textResource2, c28655q, TextResource.$stable | ((i27 >> 9) & 14));
                    if (z4) {
                        j13 = jM125430y;
                    } else {
                        j13 = jM125382b1;
                    }
                    AbstractC30795n.m94707h(strM21274h, modifierM44101d3, j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i24).getB4(), Float.valueOf(1.25f), c28655q, 0, (C2886a.f11498d << 18) | 12582912, 65016);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                    z16 = z17;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z16 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C20960b0(z4, interfaceC4339a, i25, textResource2, str, modifier3, z16, i14, i15);
                }
            }
            i16 |= 1572864;
            z14 = z13;
            if ((599187 & i16) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i16 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i17 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                strM21265c = AbstractC8692a.m21265c(str2);
                if (strM21265c == null) {
                    strM21265c = "";
                }
                Modifier modifierM3446c2 = AbstractC1110b.m3446c(modifier4, z4, new C18027i(4), interfaceC4339a, 10);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21650c(13);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC15676d.m44099b(modifierM3446c2, z4, (Function1) objM87133R), strM21265c.concat("_Tab_Button"));
                C2307m c2307m3 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM44101d4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                int i28 = i16;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d3);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                c38072d = C38072d.f163053a;
                i19 = C38072d.f163054b;
                jM125430y = c38072d.m121949b(c28655q, i19).getBrandWhite();
                jM125382b1 = c38072d.m121949b(c28655q, i19).getWhite50();
                C2307m c2307m4 = C2299e.f9102E;
                c1100b = C1100b.f4583a;
                Modifier modifier6 = modifier4;
                float f16 = 8;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c1100b.mo3400a(c2314t, c2307m4), 0.0f, ((float) 0.5d) * f16, 1);
                C2305k c2305k2 = C2299e.f9111N;
                String str4 = strM21265c;
                C23010x c23010xM73381n2 = AbstractC25012a.m73381n((float) 0.75d, f16, c2305k2, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM73381n2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
                f13 = 4;
                float f17 = 6 * f13;
                Modifier modifierM38560g2 = AbstractC13673n.m38560g(c2305k2, AbstractC1102d.m3419p(f17, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM38560g2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
                Modifier modifierM44101d5 = AbstractC15676d.m44101d(c1100b.mo3400a(AbstractC1102d.m3419p(f17, c2314t), c2307m4), str4.concat("_Tab_Icon"));
                i25 = i13;
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(i25, c28655q, ((i28 >> 3) & 112) | 6);
                if (z4) {
                    j7 = jM125430y;
                } else {
                    j7 = jM125382b1;
                }
                AbstractC15005f3.m43108b(c27430eM107874S2, "", modifierM44101d5, j7, c28655q, 48, 0);
                if (z17) {
                    c28655q.m87150e0(553905031);
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(2 * f13, c1100b.mo3400a(c2314t, C2299e.f9116y)), "CommunityBadge");
                    long jM51541c2 = C17919x.m51541c(0.97f, AbstractC17918w0.m51517e(4280626484L));
                    C33252i c33252i2 = AbstractC33253j.f138651a;
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 0.25d) * f13, AbstractC1092a.m3358c(modifierM3599a2, jM51541c2, c33252i2));
                    c38072d2 = c38072d;
                    i24 = i19;
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3394p2, c38072d2.m121949b(c28655q, i24).getRecovery(), c33252i2), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c38072d2 = c38072d;
                    i24 = i19;
                    c28655q.m87150e0(554409556);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierM44101d6 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t), str4.concat("_Tab_Text"));
                textResource2 = textResource;
                String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q, TextResource.$stable | ((i28 >> 9) & 14));
                if (z4) {
                    j13 = jM125430y;
                } else {
                    j13 = jM125382b1;
                }
                AbstractC30795n.m94707h(strM21274h2, modifierM44101d6, j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i24).getB4(), Float.valueOf(1.25f), c28655q, 0, (C2886a.f11498d << 18) | 12582912, 65016);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier6;
                z16 = z17;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z16 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20960b0(z4, interfaceC4339a, i25, textResource2, str, modifier3, z16, i14, i15);
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        modifier2 = modifier;
        i17 = i15 & 64;
        if (i17 != 0) {
            if ((1572864 & i14) == 0) {
                z14 = z13;
                if (c28655q.m87155h(z14)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            if ((599187 & i16) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i16 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i17 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                strM21265c = AbstractC8692a.m21265c(str2);
                if (strM21265c == null) {
                    strM21265c = "";
                }
                Modifier modifierM3446c3 = AbstractC1110b.m3446c(modifier4, z4, new C18027i(4), interfaceC4339a, 10);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21650c(13);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC15676d.m44099b(modifierM3446c3, z4, (Function1) objM87133R), strM21265c.concat("_Tab_Button"));
                C2307m c2307m5 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m5, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM44101d7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                int i29 = i16;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d5);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N7);
                c38072d = C38072d.f163053a;
                i19 = C38072d.f163054b;
                jM125430y = c38072d.m121949b(c28655q, i19).getBrandWhite();
                jM125382b1 = c38072d.m121949b(c28655q, i19).getWhite50();
                C2307m c2307m6 = C2299e.f9102E;
                c1100b = C1100b.f4583a;
                Modifier modifier7 = modifier4;
                float f18 = 8;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c1100b.mo3400a(c2314t, c2307m6), 0.0f, ((float) 0.5d) * f18, 1);
                C2305k c2305k3 = C2299e.f9111N;
                String str5 = strM21265c;
                C23010x c23010xM73381n3 = AbstractC25012a.m73381n((float) 0.75d, f18, c2305k3, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM73381n3);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N8);
                f13 = 4;
                float f19 = 6 * f13;
                Modifier modifierM38560g3 = AbstractC13673n.m38560g(c2305k3, AbstractC1102d.m3419p(f19, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m5, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM38560g3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                Modifier modifierM44101d8 = AbstractC15676d.m44101d(c1100b.mo3400a(AbstractC1102d.m3419p(f19, c2314t), c2307m6), str5.concat("_Tab_Icon"));
                i25 = i13;
                C27430e c27430eM107874S3 = AbstractC34132o.m107874S(i25, c28655q, ((i29 >> 3) & 112) | 6);
                if (z4) {
                    j7 = jM125430y;
                } else {
                    j7 = jM125382b1;
                }
                AbstractC15005f3.m43108b(c27430eM107874S3, "", modifierM44101d8, j7, c28655q, 48, 0);
                if (z17) {
                    c28655q.m87150e0(553905031);
                    Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(2 * f13, c1100b.mo3400a(c2314t, C2299e.f9116y)), "CommunityBadge");
                    long jM51541c3 = C17919x.m51541c(0.97f, AbstractC17918w0.m51517e(4280626484L));
                    C33252i c33252i3 = AbstractC33253j.f138651a;
                    Modifier modifierM3394p3 = AbstractC1099a.m3394p(((float) 0.25d) * f13, AbstractC1092a.m3358c(modifierM3599a3, jM51541c3, c33252i3));
                    c38072d2 = c38072d;
                    i24 = i19;
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3394p3, c38072d2.m121949b(c28655q, i24).getRecovery(), c33252i3), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c38072d2 = c38072d;
                    i24 = i19;
                    c28655q.m87150e0(554409556);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierM44101d9 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t), str5.concat("_Tab_Text"));
                textResource2 = textResource;
                String strM21274h3 = AbstractC8693b.m21274h(textResource2, c28655q, TextResource.$stable | ((i29 >> 9) & 14));
                if (z4) {
                    j13 = jM125430y;
                } else {
                    j13 = jM125382b1;
                }
                AbstractC30795n.m94707h(strM21274h3, modifierM44101d9, j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i24).getB4(), Float.valueOf(1.25f), c28655q, 0, (C2886a.f11498d << 18) | 12582912, 65016);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier7;
                z16 = z17;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z16 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20960b0(z4, interfaceC4339a, i25, textResource2, str, modifier3, z16, i14, i15);
            }
        }
        i16 |= 1572864;
        z14 = z13;
        if ((599187 & i16) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i16 & 1, z15)) {
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i17 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            strM21265c = AbstractC8692a.m21265c(str2);
            if (strM21265c == null) {
                strM21265c = "";
            }
            Modifier modifierM3446c4 = AbstractC1110b.m3446c(modifier4, z4, new C18027i(4), interfaceC4339a, 10);
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C21650c(13);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM44101d10 = AbstractC15676d.m44101d(AbstractC15676d.m44099b(modifierM3446c4, z4, (Function1) objM87133R), strM21265c.concat("_Tab_Button"));
            C2307m c2307m7 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m7, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM44101d10);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            int i210 = i16;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d7);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N10);
            c38072d = C38072d.f163053a;
            i19 = C38072d.f163054b;
            jM125430y = c38072d.m121949b(c28655q, i19).getBrandWhite();
            jM125382b1 = c38072d.m121949b(c28655q, i19).getWhite50();
            C2307m c2307m8 = C2299e.f9102E;
            c1100b = C1100b.f4583a;
            Modifier modifier8 = modifier4;
            float f110 = 8;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c1100b.mo3400a(c2314t, c2307m8), 0.0f, ((float) 0.5d) * f110, 1);
            C2305k c2305k4 = C2299e.f9111N;
            String str6 = strM21265c;
            C23010x c23010xM73381n4 = AbstractC25012a.m73381n((float) 0.75d, f110, c2305k4, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM73381n4);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m11);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
            f13 = 4;
            float f111 = 6 * f13;
            Modifier modifierM38560g4 = AbstractC13673n.m38560g(c2305k4, AbstractC1102d.m3419p(f111, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m7, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM38560g4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N12);
            Modifier modifierM44101d11 = AbstractC15676d.m44101d(c1100b.mo3400a(AbstractC1102d.m3419p(f111, c2314t), c2307m8), str6.concat("_Tab_Icon"));
            i25 = i13;
            C27430e c27430eM107874S4 = AbstractC34132o.m107874S(i25, c28655q, ((i210 >> 3) & 112) | 6);
            if (z4) {
                j7 = jM125430y;
            } else {
                j7 = jM125382b1;
            }
            AbstractC15005f3.m43108b(c27430eM107874S4, "", modifierM44101d11, j7, c28655q, 48, 0);
            if (z17) {
                c28655q.m87150e0(553905031);
                Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(2 * f13, c1100b.mo3400a(c2314t, C2299e.f9116y)), "CommunityBadge");
                long jM51541c4 = C17919x.m51541c(0.97f, AbstractC17918w0.m51517e(4280626484L));
                C33252i c33252i4 = AbstractC33253j.f138651a;
                Modifier modifierM3394p4 = AbstractC1099a.m3394p(((float) 0.25d) * f13, AbstractC1092a.m3358c(modifierM3599a4, jM51541c4, c33252i4));
                c38072d2 = c38072d;
                i24 = i19;
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3394p4, c38072d2.m121949b(c28655q, i24).getRecovery(), c33252i4), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c38072d2 = c38072d;
                i24 = i19;
                c28655q.m87150e0(554409556);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            Modifier modifierM44101d12 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t), str6.concat("_Tab_Text"));
            textResource2 = textResource;
            String strM21274h4 = AbstractC8693b.m21274h(textResource2, c28655q, TextResource.$stable | ((i210 >> 9) & 14));
            if (z4) {
                j13 = jM125430y;
            } else {
                j13 = jM125382b1;
            }
            AbstractC30795n.m94707h(strM21274h4, modifierM44101d12, j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i24).getB4(), Float.valueOf(1.25f), c28655q, 0, (C2886a.f11498d << 18) | 12582912, 65016);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier8;
            z16 = z17;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z16 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20960b0(z4, interfaceC4339a, i25, textResource2, str, modifier3, z16, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Modifier m61640s(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return m61646y(applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m61641t(boolean z4, InterfaceC4339a interfaceC4339a, int i13, TextResource textResource, String str, Modifier modifier, boolean z13, int i14, int i15, Composer composer, int i16) throws XmlPullParserException, IOException {
        m61639r(z4, interfaceC4339a, i13, textResource, str, modifier, z13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:78:0x0216  */
    /* JADX WARN: Code duplicated, block: B:81:0x0226  */
    /* JADX WARN: Code duplicated, block: B:87:0x0262  */
    /* JADX WARN: Code duplicated, block: B:90:0x0269  */
    /* JADX WARN: Code duplicated, block: B:91:0x026b  */
    /* JADX WARN: Code duplicated, block: B:95:0x027a  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a2  */
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
    /* JADX INFO: renamed from: u */
    private static final void m61642u(List<TabConfiguration> list, String str, boolean z4, Function1 function1, Function1 function2, Modifier modifier, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        InterfaceC39171c interfaceC39171c;
        boolean z14;
        boolean zM87153g;
        Object objM87133R;
        boolean z15;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z16;
        boolean z17;
        boolean zM87157i;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1374369451);
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(function2) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i16 = i14 & 32;
        if (i16 == 0) {
            if ((196608 & i13) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                float f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(6 * f13);
                Modifier modifierM3427x = AbstractC1102d.m3427x(modifier4, null, 3);
                if ((57344 & i15) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87153g = z14 | c28655q.m87153g(interfaceC39171c);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C21788c(function2, interfaceC39171c);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3427x, (Function1) objM87133R);
                float f14 = ((float) 0.25d) * f13;
                C17909s c17909s = AbstractC17911t.f69612b;
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                Modifier modifier5 = modifier4;
                z15 = false;
                float f15 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC18032n.m51775c(AbstractC37056f.m118995s(AbstractC1092a.m3357b(AbstractC15751g.m44456i(f14, modifierM3500d, C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, c38072d.m121949b(c28655q, i17).getWhite10())), new C17919x(c38072d.m121949b(c28655q, i17).getTransparent()), new C17919x(c38072d.m121949b(c28655q, i17).getTransparent())), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(150.0f)) << 32) | (((long) Float.floatToRawIntBits(300.0f)) & 4294967295L), 8), c33252iM105489e), C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.97f, AbstractC17918w0.m51517e(4280626484L))), new C17919x(C17919x.m51541c(0.97f, c38072d.m121949b(c28655q, i17).getBackgroundDarkAlt()))), 0.0f, 0.0f, 14), c33252iM105489e, 0.0f, 4)), false, new C30217a(12)), ((float) 0.5d) * f15, 1 * f15);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9107J, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
                c28655q.m87150e0(-1363152900);
                for (TabConfiguration tabConfiguration : list) {
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    boolean zM65745e = AbstractC22676k.m65745e(tabConfiguration.getId(), str);
                    int iM46380e = AbstractC16315n0.m46380e(tabConfiguration.getIconKey(), EnumC16313m0.WHOOP_LOGO_CIRCLE);
                    TextResource.C8691e c8691e = new TextResource.C8691e(tabConfiguration.getTitle());
                    String id4 = tabConfiguration.getId();
                    if (z4 || !AbstractC22676k.m65745e(tabConfiguration.getId(), "community")) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = z17 | c28655q.m87157i(tabConfiguration);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C21214q(5, function1, tabConfiguration);
                        c28655q.m87172p0(objM87133R2);
                    }
                    z15 = false;
                    m61639r(zM65745e, (InterfaceC4339a) objM87133R2, iM46380e, c8691e, id4, layoutWeightElement, z16, c28655q, TextResource.C8691e.f25898b << 9, 0);
                }
                c28655q.m87173q(z15);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(list, str, z4, function1, function2, modifier3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        modifier2 = modifier;
        if ((74899 & i15) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            float f16 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(6 * f16);
            Modifier modifierM3427x2 = AbstractC1102d.m3427x(modifier4, null, 3);
            if ((57344 & i15) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87153g = z14 | c28655q.m87153g(interfaceC39171c);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g) {
                objM87133R = new C21788c(function2, interfaceC39171c);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21788c(function2, interfaceC39171c);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3500d2 = AbstractC1131a.m3500d(modifierM3427x2, (Function1) objM87133R);
            float f17 = ((float) 0.25d) * f16;
            C17909s c17909s2 = AbstractC17911t.f69612b;
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            Modifier modifier6 = modifier4;
            z15 = false;
            float f18 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC18032n.m51775c(AbstractC37056f.m118995s(AbstractC1092a.m3357b(AbstractC15751g.m44456i(f17, modifierM3500d2, C17909s.m51486d(c17909s2, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, c38072d2.m121949b(c28655q, i18).getWhite10())), new C17919x(c38072d2.m121949b(c28655q, i18).getTransparent()), new C17919x(c38072d2.m121949b(c28655q, i18).getTransparent())), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(150.0f)) << 32) | (((long) Float.floatToRawIntBits(300.0f)) & 4294967295L), 8), c33252iM105489e2), C17909s.m51493k(c17909s2, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.97f, AbstractC17918w0.m51517e(4280626484L))), new C17919x(C17919x.m51541c(0.97f, c38072d2.m121949b(c28655q, i18).getBackgroundDarkAlt()))), 0.0f, 0.0f, 14), c33252iM105489e2, 0.0f, 4)), false, new C30217a(12)), ((float) 0.5d) * f18, 1 * f18);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9107J, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
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
            c28655q.m87150e0(-1363152900);
            while (r1.hasNext()) {
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                boolean zM65745e2 = AbstractC22676k.m65745e(tabConfiguration.getId(), str);
                int iM46380e2 = AbstractC16315n0.m46380e(tabConfiguration.getIconKey(), EnumC16313m0.WHOOP_LOGO_CIRCLE);
                TextResource.C8691e c8691e2 = new TextResource.C8691e(tabConfiguration.getTitle());
                String id5 = tabConfiguration.getId();
                if (z4) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = z17 | c28655q.m87157i(tabConfiguration);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C21214q(5, function1, tabConfiguration);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C21214q(5, function1, tabConfiguration);
                    c28655q.m87172p0(objM87133R2);
                }
                z15 = false;
                m61639r(zM65745e2, (InterfaceC4339a) objM87133R2, iM46380e2, c8691e2, id5, layoutWeightElement2, z16, c28655q, TextResource.C8691e.f25898b << 9, 0);
            }
            c28655q.m87173q(z15);
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(list, str, z4, function1, function2, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m61643v(Function1 function1, InterfaceC39171c interfaceC39171c, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        function1.invoke(new C39174f(interfaceC39171c.mo733e0((int) (coordinates.mo3541n() & 4294967295L))));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m61644w(Function1 function1, TabConfiguration tabConfiguration) {
        function1.invoke(tabConfiguration);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m61645x(List list, String str, boolean z4, Function1 function1, Function1 function2, Modifier modifier, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m61642u(list, str, z4, function1, function2, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final Modifier m61646y(Modifier modifier) {
        return AbstractC1125a.m3478a(modifier, new C21650c(14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m61647z(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fMo743q0 = drawBehind.mo743q0(16 * 4);
        float fMo743q1 = drawBehind.mo743q0(5 * 8);
        C17909s c17909s = AbstractC17911t.f69612b;
        List listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, C17919x.f69629f)), new C17919x(C17919x.f69636m));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)) / 2.0f) + fMo743q1;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) / 2.0f;
        InterfaceC22131e.m63375G(drawBehind, C17909s.m51489g(c17909s, listM118959K, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 0.5f * fMo743q0, 8), fMo743q0 * 0.65f, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)) / 2.0f) + fMo743q1)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32), 0.0f, null, 120);
        return C23454a0.f92919a;
    }
}
