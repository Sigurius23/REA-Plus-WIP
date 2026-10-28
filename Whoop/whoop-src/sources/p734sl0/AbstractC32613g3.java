package p734sl0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2648w3;
import b91.C2886a;
import b91.InterfaceC2887b;
import bs1.C3605x;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import dn0.C12203c;
import e93.AbstractC12889b;
import gz0.AbstractC16306j;
import gz0.EnumC16302h;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p043c4.AbstractC3975r;
import p043c4.C3966j0;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
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
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import wk0.AbstractC37335a;
import wk0.AbstractC37336b;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: sl0.g3 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a{\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001c\b\u0002\u0010\n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001am\u0010\u000f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019²\u0006\u000e\u0010\r\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "isNewConversationEnabled", "isFileUploadEnabled", "Lkotlin/Function0;", "Ll83/a0;", "onNewConversationClicked", "onImageUploadClicked", "onFileUploadClicked", "onCameraClicked", "Lkotlin/Function1;", "trigger", "A", "(ZZLc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "expanded", "onDismiss", "p", "(Lc93/a;Lc93/a;Lc93/a;Lc93/a;ZZZLc93/a;Landroidx/compose/runtime/Composer;I)V", "isEnabled", "", "icon", "", "text", "onClick", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(ZILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32613g3 {
    /* JADX WARN: Code duplicated, block: B:101:0x0161  */
    /* JADX WARN: Code duplicated, block: B:102:0x0165  */
    /* JADX WARN: Code duplicated, block: B:105:0x0178  */
    /* JADX WARN: Code duplicated, block: B:107:0x0186  */
    /* JADX WARN: Code duplicated, block: B:110:0x0191  */
    /* JADX WARN: Code duplicated, block: B:112:0x019d  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01be  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:124:0x0218  */
    /* JADX WARN: Code duplicated, block: B:127:0x0254  */
    /* JADX WARN: Code duplicated, block: B:130:0x0261  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x010e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    /* JADX INFO: renamed from: A */
    public static final void m101771A(boolean z4, boolean z13, InterfaceC4339a onNewConversationClicked, InterfaceC4339a onImageUploadClicked, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function3 function3, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        boolean z14;
        int i16;
        InterfaceC4339a interfaceC4339a3;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a4;
        int i19;
        int i24;
        Function3 function4;
        int i25;
        Function3 function5;
        boolean z15;
        boolean z16;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        Function3 function6;
        C28655q c28655q;
        Function3 function7;
        C28677v1 c28677v1M87180u;
        boolean z17;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        Function3 function8;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Modifier modifierM3398t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC28601c1 interfaceC28601c2;
        C28655q c28655q2;
        boolean z18;
        Object objM87133R2;
        C28655q c28655q3;
        Object objM87133R3;
        int iM46115a;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        int i26;
        int i27;
        AbstractC22676k.m65750j(onNewConversationClicked, "onNewConversationClicked");
        AbstractC22676k.m65750j(onImageUploadClicked, "onImageUploadClicked");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(903594264);
        if ((i13 & 6) == 0) {
            i15 = (c28655q4.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                z14 = z13;
                i15 |= c28655q4.m87155h(z14) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q4.m87157i(onNewConversationClicked)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i15 |= i27;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q4.m87157i(onImageUploadClicked)) {
                    i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i26;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a3 = interfaceC4339a;
                    if (c28655q4.m87157i(interfaceC4339a3)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (c28655q4.m87157i(interfaceC4339a4)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        if ((1572864 & i13) == 0) {
                            function4 = function3;
                            if (c28655q4.m87157i(function4)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i15 |= i25;
                            function5 = function4;
                        }
                        if ((599187 & i15) != 599186) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c28655q4.m87135U(i15 & 1, z15)) {
                            if (i28 != 0) {
                                z17 = false;
                            } else {
                                z17 = z14;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R6 = c28655q4.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C32581a1(18);
                                    c28655q4.m87172p0(objM87133R6);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                            } else {
                                interfaceC4339a7 = interfaceC4339a3;
                            }
                            if (i18 != 0) {
                                objM87133R5 = c28655q4.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C32581a1(17);
                                    c28655q4.m87172p0(objM87133R5);
                                }
                                interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                            } else {
                                interfaceC4339a8 = interfaceC4339a4;
                            }
                            if (i24 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q4.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            modifierM3398t = C2314t.f9131w;
                            if (function8 == null) {
                                modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                            }
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
                            if (function8 == null) {
                                c28655q4.m87150e0(-2022273391);
                                if (m101774D(interfaceC28601c1)) {
                                    iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                                } else {
                                    iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                                }
                                C27430e c27430eM107874S = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                                EnumC16302h enumC16302h = EnumC16302h.DEFAULT;
                                objM87133R4 = c28655q4.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C32586b1(7, interfaceC28601c1);
                                    c28655q4.m87172p0(objM87133R4);
                                }
                                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R4;
                                interfaceC28601c2 = interfaceC28601c1;
                                z18 = true;
                                AbstractC16306j.m46276r(c27430eM107874S, 0.0f, enumC16302h, true, "expandMenu", interfaceC4339a9, c28655q4, 224640, 2);
                                C28655q c28655q5 = c28655q4;
                                c28655q5.m87173q(false);
                                c28655q3 = c28655q5;
                            } else {
                                interfaceC28601c2 = interfaceC28601c1;
                                c28655q2 = c28655q4;
                                z18 = true;
                                c28655q2.m87150e0(-2021856968);
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C32586b1(8, interfaceC28601c2);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                                c28655q2.m87173q(false);
                                c28655q3 = c28655q2;
                            }
                            boolean zM101774D = m101774D(interfaceC28601c2);
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32586b1(9, interfaceC28601c2);
                                c28655q3.m87172p0(objM87133R3);
                            }
                            int i29 = i15 >> 6;
                            int i34 = i15 << 15;
                            int i35 = (i29 & 7168) | (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 896) | (458752 & i34) | (i34 & 3670016);
                            C28655q c28655q6 = c28655q3;
                            boolean z19 = z18;
                            C28655q c28655q7 = c28655q6;
                            function6 = function8;
                            m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D, z4, z17, (InterfaceC4339a) objM87133R3, c28655q7, i35);
                            c28655q7.m87173q(z19);
                            interfaceC4339a5 = interfaceC4339a7;
                            z16 = z17;
                            interfaceC4339a6 = interfaceC4339a8;
                            c28655q = c28655q7;
                        } else {
                            c28655q4.m87138X();
                            z16 = z14;
                            interfaceC4339a5 = interfaceC4339a3;
                            interfaceC4339a6 = interfaceC4339a4;
                            c28655q = c28655q4;
                            function6 = function5;
                        }
                        function7 = function6;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
                        }
                    }
                    i15 |= 1572864;
                    function5 = function3;
                    if ((599187 & i15) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z15)) {
                        if (i28 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q4.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C32581a1(18);
                                c28655q4.m87172p0(objM87133R6);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q4.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C32581a1(17);
                                c28655q4.m87172p0(objM87133R5);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        if (i24 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        modifierM3398t = C2314t.f9131w;
                        if (function8 == null) {
                            modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N2);
                        if (function8 == null) {
                            c28655q4.m87150e0(-2022273391);
                            if (m101774D(interfaceC28601c1)) {
                                iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                            } else {
                                iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                            }
                            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                            EnumC16302h enumC16302h2 = EnumC16302h.DEFAULT;
                            objM87133R4 = c28655q4.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C32586b1(7, interfaceC28601c1);
                                c28655q4.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R4;
                            interfaceC28601c2 = interfaceC28601c1;
                            z18 = true;
                            AbstractC16306j.m46276r(c27430eM107874S2, 0.0f, enumC16302h2, true, "expandMenu", interfaceC4339a10, c28655q4, 224640, 2);
                            C28655q c28655q8 = c28655q4;
                            c28655q8.m87173q(false);
                            c28655q3 = c28655q8;
                        } else {
                            interfaceC28601c2 = interfaceC28601c1;
                            c28655q2 = c28655q4;
                            z18 = true;
                            c28655q2.m87150e0(-2021856968);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32586b1(8, interfaceC28601c2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        }
                        boolean zM101774D2 = m101774D(interfaceC28601c2);
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32586b1(9, interfaceC28601c2);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        int i210 = i15 >> 6;
                        int i36 = i15 << 15;
                        int i37 = (i210 & 7168) | (i210 & 14) | 12582912 | (i210 & 112) | (i210 & 896) | (458752 & i36) | (i36 & 3670016);
                        C28655q c28655q9 = c28655q3;
                        boolean z110 = z18;
                        C28655q c28655q10 = c28655q9;
                        function6 = function8;
                        m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D2, z4, z17, (InterfaceC4339a) objM87133R3, c28655q10, i37);
                        c28655q10.m87173q(z110);
                        interfaceC4339a5 = interfaceC4339a7;
                        z16 = z17;
                        interfaceC4339a6 = interfaceC4339a8;
                        c28655q = c28655q10;
                    } else {
                        c28655q4.m87138X();
                        z16 = z14;
                        interfaceC4339a5 = interfaceC4339a3;
                        interfaceC4339a6 = interfaceC4339a4;
                        c28655q = c28655q4;
                        function6 = function5;
                    }
                    function7 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a4 = interfaceC4339a2;
                i24 = i14 & 64;
                if (i24 != 0) {
                    if ((1572864 & i13) == 0) {
                        function4 = function3;
                        if (c28655q4.m87157i(function4)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                        function5 = function4;
                    }
                    if ((599187 & i15) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z15)) {
                        if (i28 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q4.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C32581a1(18);
                                c28655q4.m87172p0(objM87133R6);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q4.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C32581a1(17);
                                c28655q4.m87172p0(objM87133R5);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        if (i24 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        modifierM3398t = C2314t.f9131w;
                        if (function8 == null) {
                            modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N3);
                        if (function8 == null) {
                            c28655q4.m87150e0(-2022273391);
                            if (m101774D(interfaceC28601c1)) {
                                iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                            } else {
                                iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                            }
                            C27430e c27430eM107874S3 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                            EnumC16302h enumC16302h3 = EnumC16302h.DEFAULT;
                            objM87133R4 = c28655q4.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C32586b1(7, interfaceC28601c1);
                                c28655q4.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R4;
                            interfaceC28601c2 = interfaceC28601c1;
                            z18 = true;
                            AbstractC16306j.m46276r(c27430eM107874S3, 0.0f, enumC16302h3, true, "expandMenu", interfaceC4339a11, c28655q4, 224640, 2);
                            C28655q c28655q11 = c28655q4;
                            c28655q11.m87173q(false);
                            c28655q3 = c28655q11;
                        } else {
                            interfaceC28601c2 = interfaceC28601c1;
                            c28655q2 = c28655q4;
                            z18 = true;
                            c28655q2.m87150e0(-2021856968);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32586b1(8, interfaceC28601c2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        }
                        boolean zM101774D3 = m101774D(interfaceC28601c2);
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32586b1(9, interfaceC28601c2);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        int i211 = i15 >> 6;
                        int i38 = i15 << 15;
                        int i39 = (i211 & 7168) | (i211 & 14) | 12582912 | (i211 & 112) | (i211 & 896) | (458752 & i38) | (i38 & 3670016);
                        C28655q c28655q12 = c28655q3;
                        boolean z111 = z18;
                        C28655q c28655q13 = c28655q12;
                        function6 = function8;
                        m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D3, z4, z17, (InterfaceC4339a) objM87133R3, c28655q13, i39);
                        c28655q13.m87173q(z111);
                        interfaceC4339a5 = interfaceC4339a7;
                        z16 = z17;
                        interfaceC4339a6 = interfaceC4339a8;
                        c28655q = c28655q13;
                    } else {
                        c28655q4.m87138X();
                        z16 = z14;
                        interfaceC4339a5 = interfaceC4339a3;
                        interfaceC4339a6 = interfaceC4339a4;
                        c28655q = c28655q4;
                        function6 = function5;
                    }
                    function7 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
                    }
                }
                i15 |= 1572864;
                function5 = function3;
                if ((599187 & i15) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z15)) {
                    if (i28 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q4.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C32581a1(18);
                            c28655q4.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C32581a1(17);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    if (i24 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    modifierM3398t = C2314t.f9131w;
                    if (function8 == null) {
                        modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N4);
                    if (function8 == null) {
                        c28655q4.m87150e0(-2022273391);
                        if (m101774D(interfaceC28601c1)) {
                            iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                        } else {
                            iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                        }
                        C27430e c27430eM107874S4 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                        EnumC16302h enumC16302h4 = EnumC16302h.DEFAULT;
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32586b1(7, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R4;
                        interfaceC28601c2 = interfaceC28601c1;
                        z18 = true;
                        AbstractC16306j.m46276r(c27430eM107874S4, 0.0f, enumC16302h4, true, "expandMenu", interfaceC4339a12, c28655q4, 224640, 2);
                        C28655q c28655q14 = c28655q4;
                        c28655q14.m87173q(false);
                        c28655q3 = c28655q14;
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2 = c28655q4;
                        z18 = true;
                        c28655q2.m87150e0(-2021856968);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32586b1(8, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    boolean zM101774D4 = m101774D(interfaceC28601c2);
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32586b1(9, interfaceC28601c2);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    int i212 = i15 >> 6;
                    int i310 = i15 << 15;
                    int i311 = (i212 & 7168) | (i212 & 14) | 12582912 | (i212 & 112) | (i212 & 896) | (458752 & i310) | (i310 & 3670016);
                    C28655q c28655q15 = c28655q3;
                    boolean z112 = z18;
                    C28655q c28655q16 = c28655q15;
                    function6 = function8;
                    m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D4, z4, z17, (InterfaceC4339a) objM87133R3, c28655q16, i311);
                    c28655q16.m87173q(z112);
                    interfaceC4339a5 = interfaceC4339a7;
                    z16 = z17;
                    interfaceC4339a6 = interfaceC4339a8;
                    c28655q = c28655q16;
                } else {
                    c28655q4.m87138X();
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                    c28655q = c28655q4;
                    function6 = function5;
                }
                function7 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4339a3 = interfaceC4339a;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q4.m87157i(interfaceC4339a4)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    if ((1572864 & i13) == 0) {
                        function4 = function3;
                        if (c28655q4.m87157i(function4)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                        function5 = function4;
                    }
                    if ((599187 & i15) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z15)) {
                        if (i28 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q4.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C32581a1(18);
                                c28655q4.m87172p0(objM87133R6);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q4.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C32581a1(17);
                                c28655q4.m87172p0(objM87133R5);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        if (i24 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        modifierM3398t = C2314t.f9131w;
                        if (function8 == null) {
                            modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N5);
                        if (function8 == null) {
                            c28655q4.m87150e0(-2022273391);
                            if (m101774D(interfaceC28601c1)) {
                                iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                            } else {
                                iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                            }
                            C27430e c27430eM107874S5 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                            EnumC16302h enumC16302h5 = EnumC16302h.DEFAULT;
                            objM87133R4 = c28655q4.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C32586b1(7, interfaceC28601c1);
                                c28655q4.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                            interfaceC28601c2 = interfaceC28601c1;
                            z18 = true;
                            AbstractC16306j.m46276r(c27430eM107874S5, 0.0f, enumC16302h5, true, "expandMenu", interfaceC4339a13, c28655q4, 224640, 2);
                            C28655q c28655q17 = c28655q4;
                            c28655q17.m87173q(false);
                            c28655q3 = c28655q17;
                        } else {
                            interfaceC28601c2 = interfaceC28601c1;
                            c28655q2 = c28655q4;
                            z18 = true;
                            c28655q2.m87150e0(-2021856968);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32586b1(8, interfaceC28601c2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        }
                        boolean zM101774D5 = m101774D(interfaceC28601c2);
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32586b1(9, interfaceC28601c2);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        int i213 = i15 >> 6;
                        int i312 = i15 << 15;
                        int i313 = (i213 & 7168) | (i213 & 14) | 12582912 | (i213 & 112) | (i213 & 896) | (458752 & i312) | (i312 & 3670016);
                        C28655q c28655q18 = c28655q3;
                        boolean z113 = z18;
                        C28655q c28655q19 = c28655q18;
                        function6 = function8;
                        m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D5, z4, z17, (InterfaceC4339a) objM87133R3, c28655q19, i313);
                        c28655q19.m87173q(z113);
                        interfaceC4339a5 = interfaceC4339a7;
                        z16 = z17;
                        interfaceC4339a6 = interfaceC4339a8;
                        c28655q = c28655q19;
                    } else {
                        c28655q4.m87138X();
                        z16 = z14;
                        interfaceC4339a5 = interfaceC4339a3;
                        interfaceC4339a6 = interfaceC4339a4;
                        c28655q = c28655q4;
                        function6 = function5;
                    }
                    function7 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
                    }
                }
                i15 |= 1572864;
                function5 = function3;
                if ((599187 & i15) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z15)) {
                    if (i28 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q4.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C32581a1(18);
                            c28655q4.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C32581a1(17);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    if (i24 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    modifierM3398t = C2314t.f9131w;
                    if (function8 == null) {
                        modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N6);
                    if (function8 == null) {
                        c28655q4.m87150e0(-2022273391);
                        if (m101774D(interfaceC28601c1)) {
                            iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                        } else {
                            iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                        }
                        C27430e c27430eM107874S6 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                        EnumC16302h enumC16302h6 = EnumC16302h.DEFAULT;
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32586b1(7, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                        interfaceC28601c2 = interfaceC28601c1;
                        z18 = true;
                        AbstractC16306j.m46276r(c27430eM107874S6, 0.0f, enumC16302h6, true, "expandMenu", interfaceC4339a14, c28655q4, 224640, 2);
                        C28655q c28655q110 = c28655q4;
                        c28655q110.m87173q(false);
                        c28655q3 = c28655q110;
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2 = c28655q4;
                        z18 = true;
                        c28655q2.m87150e0(-2021856968);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32586b1(8, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    boolean zM101774D6 = m101774D(interfaceC28601c2);
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32586b1(9, interfaceC28601c2);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    int i214 = i15 >> 6;
                    int i314 = i15 << 15;
                    int i315 = (i214 & 7168) | (i214 & 14) | 12582912 | (i214 & 112) | (i214 & 896) | (458752 & i314) | (i314 & 3670016);
                    C28655q c28655q111 = c28655q3;
                    boolean z114 = z18;
                    C28655q c28655q112 = c28655q111;
                    function6 = function8;
                    m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D6, z4, z17, (InterfaceC4339a) objM87133R3, c28655q112, i315);
                    c28655q112.m87173q(z114);
                    interfaceC4339a5 = interfaceC4339a7;
                    z16 = z17;
                    interfaceC4339a6 = interfaceC4339a8;
                    c28655q = c28655q112;
                } else {
                    c28655q4.m87138X();
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                    c28655q = c28655q4;
                    function6 = function5;
                }
                function7 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a4 = interfaceC4339a2;
            i24 = i14 & 64;
            if (i24 != 0) {
                if ((1572864 & i13) == 0) {
                    function4 = function3;
                    if (c28655q4.m87157i(function4)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                    function5 = function4;
                }
                if ((599187 & i15) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z15)) {
                    if (i28 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q4.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C32581a1(18);
                            c28655q4.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C32581a1(17);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    if (i24 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    modifierM3398t = C2314t.f9131w;
                    if (function8 == null) {
                        modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N7);
                    if (function8 == null) {
                        c28655q4.m87150e0(-2022273391);
                        if (m101774D(interfaceC28601c1)) {
                            iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                        } else {
                            iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                        }
                        C27430e c27430eM107874S7 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                        EnumC16302h enumC16302h7 = EnumC16302h.DEFAULT;
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32586b1(7, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R4;
                        interfaceC28601c2 = interfaceC28601c1;
                        z18 = true;
                        AbstractC16306j.m46276r(c27430eM107874S7, 0.0f, enumC16302h7, true, "expandMenu", interfaceC4339a15, c28655q4, 224640, 2);
                        C28655q c28655q113 = c28655q4;
                        c28655q113.m87173q(false);
                        c28655q3 = c28655q113;
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2 = c28655q4;
                        z18 = true;
                        c28655q2.m87150e0(-2021856968);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32586b1(8, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    boolean zM101774D7 = m101774D(interfaceC28601c2);
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32586b1(9, interfaceC28601c2);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    int i215 = i15 >> 6;
                    int i316 = i15 << 15;
                    int i317 = (i215 & 7168) | (i215 & 14) | 12582912 | (i215 & 112) | (i215 & 896) | (458752 & i316) | (i316 & 3670016);
                    C28655q c28655q114 = c28655q3;
                    boolean z115 = z18;
                    C28655q c28655q115 = c28655q114;
                    function6 = function8;
                    m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D7, z4, z17, (InterfaceC4339a) objM87133R3, c28655q115, i317);
                    c28655q115.m87173q(z115);
                    interfaceC4339a5 = interfaceC4339a7;
                    z16 = z17;
                    interfaceC4339a6 = interfaceC4339a8;
                    c28655q = c28655q115;
                } else {
                    c28655q4.m87138X();
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                    c28655q = c28655q4;
                    function6 = function5;
                }
                function7 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
                }
            }
            i15 |= 1572864;
            function5 = function3;
            if ((599187 & i15) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z15)) {
                if (i28 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q4.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C32581a1(18);
                        c28655q4.m87172p0(objM87133R6);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C32581a1(17);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                if (i24 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                modifierM3398t = C2314t.f9131w;
                if (function8 == null) {
                    modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N8);
                if (function8 == null) {
                    c28655q4.m87150e0(-2022273391);
                    if (m101774D(interfaceC28601c1)) {
                        iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                    } else {
                        iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                    }
                    C27430e c27430eM107874S8 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                    EnumC16302h enumC16302h8 = EnumC16302h.DEFAULT;
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32586b1(7, interfaceC28601c1);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R4;
                    interfaceC28601c2 = interfaceC28601c1;
                    z18 = true;
                    AbstractC16306j.m46276r(c27430eM107874S8, 0.0f, enumC16302h8, true, "expandMenu", interfaceC4339a16, c28655q4, 224640, 2);
                    C28655q c28655q116 = c28655q4;
                    c28655q116.m87173q(false);
                    c28655q3 = c28655q116;
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q2 = c28655q4;
                    z18 = true;
                    c28655q2.m87150e0(-2021856968);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32586b1(8, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                boolean zM101774D8 = m101774D(interfaceC28601c2);
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C32586b1(9, interfaceC28601c2);
                    c28655q3.m87172p0(objM87133R3);
                }
                int i216 = i15 >> 6;
                int i318 = i15 << 15;
                int i319 = (i216 & 7168) | (i216 & 14) | 12582912 | (i216 & 112) | (i216 & 896) | (458752 & i318) | (i318 & 3670016);
                C28655q c28655q117 = c28655q3;
                boolean z116 = z18;
                C28655q c28655q118 = c28655q117;
                function6 = function8;
                m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D8, z4, z17, (InterfaceC4339a) objM87133R3, c28655q118, i319);
                c28655q118.m87173q(z116);
                interfaceC4339a5 = interfaceC4339a7;
                z16 = z17;
                interfaceC4339a6 = interfaceC4339a8;
                c28655q = c28655q118;
            } else {
                c28655q4.m87138X();
                z16 = z14;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
                c28655q = c28655q4;
                function6 = function5;
            }
            function7 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
            }
        }
        i15 |= 48;
        z14 = z13;
        if ((i13 & 384) == 0) {
            if (c28655q4.m87157i(onNewConversationClicked)) {
                i27 = 256;
            } else {
                i27 = 128;
            }
            i15 |= i27;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q4.m87157i(onImageUploadClicked)) {
                i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i26;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                if (c28655q4.m87157i(interfaceC4339a3)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q4.m87157i(interfaceC4339a4)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    if ((1572864 & i13) == 0) {
                        function4 = function3;
                        if (c28655q4.m87157i(function4)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                        function5 = function4;
                    }
                    if ((599187 & i15) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z15)) {
                        if (i28 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R6 = c28655q4.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C32581a1(18);
                                c28655q4.m87172p0(objM87133R6);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q4.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C32581a1(17);
                                c28655q4.m87172p0(objM87133R5);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        if (i24 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        modifierM3398t = C2314t.f9131w;
                        if (function8 == null) {
                            modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N9);
                        if (function8 == null) {
                            c28655q4.m87150e0(-2022273391);
                            if (m101774D(interfaceC28601c1)) {
                                iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                            } else {
                                iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                            }
                            C27430e c27430eM107874S9 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                            EnumC16302h enumC16302h9 = EnumC16302h.DEFAULT;
                            objM87133R4 = c28655q4.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C32586b1(7, interfaceC28601c1);
                                c28655q4.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R4;
                            interfaceC28601c2 = interfaceC28601c1;
                            z18 = true;
                            AbstractC16306j.m46276r(c27430eM107874S9, 0.0f, enumC16302h9, true, "expandMenu", interfaceC4339a17, c28655q4, 224640, 2);
                            C28655q c28655q119 = c28655q4;
                            c28655q119.m87173q(false);
                            c28655q3 = c28655q119;
                        } else {
                            interfaceC28601c2 = interfaceC28601c1;
                            c28655q2 = c28655q4;
                            z18 = true;
                            c28655q2.m87150e0(-2021856968);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32586b1(8, interfaceC28601c2);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        }
                        boolean zM101774D9 = m101774D(interfaceC28601c2);
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32586b1(9, interfaceC28601c2);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        int i217 = i15 >> 6;
                        int i3110 = i15 << 15;
                        int i3111 = (i217 & 7168) | (i217 & 14) | 12582912 | (i217 & 112) | (i217 & 896) | (458752 & i3110) | (i3110 & 3670016);
                        C28655q c28655q1110 = c28655q3;
                        boolean z117 = z18;
                        C28655q c28655q1111 = c28655q1110;
                        function6 = function8;
                        m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D9, z4, z17, (InterfaceC4339a) objM87133R3, c28655q1111, i3111);
                        c28655q1111.m87173q(z117);
                        interfaceC4339a5 = interfaceC4339a7;
                        z16 = z17;
                        interfaceC4339a6 = interfaceC4339a8;
                        c28655q = c28655q1111;
                    } else {
                        c28655q4.m87138X();
                        z16 = z14;
                        interfaceC4339a5 = interfaceC4339a3;
                        interfaceC4339a6 = interfaceC4339a4;
                        c28655q = c28655q4;
                        function6 = function5;
                    }
                    function7 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
                    }
                }
                i15 |= 1572864;
                function5 = function3;
                if ((599187 & i15) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z15)) {
                    if (i28 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q4.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C32581a1(18);
                            c28655q4.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C32581a1(17);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    if (i24 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    modifierM3398t = C2314t.f9131w;
                    if (function8 == null) {
                        modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N10);
                    if (function8 == null) {
                        c28655q4.m87150e0(-2022273391);
                        if (m101774D(interfaceC28601c1)) {
                            iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                        } else {
                            iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                        }
                        C27430e c27430eM107874S10 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                        EnumC16302h enumC16302h10 = EnumC16302h.DEFAULT;
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32586b1(7, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R4;
                        interfaceC28601c2 = interfaceC28601c1;
                        z18 = true;
                        AbstractC16306j.m46276r(c27430eM107874S10, 0.0f, enumC16302h10, true, "expandMenu", interfaceC4339a18, c28655q4, 224640, 2);
                        C28655q c28655q1112 = c28655q4;
                        c28655q1112.m87173q(false);
                        c28655q3 = c28655q1112;
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2 = c28655q4;
                        z18 = true;
                        c28655q2.m87150e0(-2021856968);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32586b1(8, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    boolean zM101774D10 = m101774D(interfaceC28601c2);
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32586b1(9, interfaceC28601c2);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    int i218 = i15 >> 6;
                    int i3112 = i15 << 15;
                    int i3113 = (i218 & 7168) | (i218 & 14) | 12582912 | (i218 & 112) | (i218 & 896) | (458752 & i3112) | (i3112 & 3670016);
                    C28655q c28655q1113 = c28655q3;
                    boolean z118 = z18;
                    C28655q c28655q1114 = c28655q1113;
                    function6 = function8;
                    m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D10, z4, z17, (InterfaceC4339a) objM87133R3, c28655q1114, i3113);
                    c28655q1114.m87173q(z118);
                    interfaceC4339a5 = interfaceC4339a7;
                    z16 = z17;
                    interfaceC4339a6 = interfaceC4339a8;
                    c28655q = c28655q1114;
                } else {
                    c28655q4.m87138X();
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                    c28655q = c28655q4;
                    function6 = function5;
                }
                function7 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a4 = interfaceC4339a2;
            i24 = i14 & 64;
            if (i24 != 0) {
                if ((1572864 & i13) == 0) {
                    function4 = function3;
                    if (c28655q4.m87157i(function4)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                    function5 = function4;
                }
                if ((599187 & i15) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z15)) {
                    if (i28 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q4.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C32581a1(18);
                            c28655q4.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C32581a1(17);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    if (i24 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    modifierM3398t = C2314t.f9131w;
                    if (function8 == null) {
                        modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11);
                    if (function8 == null) {
                        c28655q4.m87150e0(-2022273391);
                        if (m101774D(interfaceC28601c1)) {
                            iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                        } else {
                            iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                        }
                        C27430e c27430eM107874S11 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                        EnumC16302h enumC16302h11 = EnumC16302h.DEFAULT;
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32586b1(7, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R4;
                        interfaceC28601c2 = interfaceC28601c1;
                        z18 = true;
                        AbstractC16306j.m46276r(c27430eM107874S11, 0.0f, enumC16302h11, true, "expandMenu", interfaceC4339a19, c28655q4, 224640, 2);
                        C28655q c28655q1115 = c28655q4;
                        c28655q1115.m87173q(false);
                        c28655q3 = c28655q1115;
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2 = c28655q4;
                        z18 = true;
                        c28655q2.m87150e0(-2021856968);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32586b1(8, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    boolean zM101774D11 = m101774D(interfaceC28601c2);
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32586b1(9, interfaceC28601c2);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    int i219 = i15 >> 6;
                    int i3114 = i15 << 15;
                    int i3115 = (i219 & 7168) | (i219 & 14) | 12582912 | (i219 & 112) | (i219 & 896) | (458752 & i3114) | (i3114 & 3670016);
                    C28655q c28655q1116 = c28655q3;
                    boolean z119 = z18;
                    C28655q c28655q1117 = c28655q1116;
                    function6 = function8;
                    m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D11, z4, z17, (InterfaceC4339a) objM87133R3, c28655q1117, i3115);
                    c28655q1117.m87173q(z119);
                    interfaceC4339a5 = interfaceC4339a7;
                    z16 = z17;
                    interfaceC4339a6 = interfaceC4339a8;
                    c28655q = c28655q1117;
                } else {
                    c28655q4.m87138X();
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                    c28655q = c28655q4;
                    function6 = function5;
                }
                function7 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
                }
            }
            i15 |= 1572864;
            function5 = function3;
            if ((599187 & i15) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z15)) {
                if (i28 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q4.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C32581a1(18);
                        c28655q4.m87172p0(objM87133R6);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C32581a1(17);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                if (i24 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                modifierM3398t = C2314t.f9131w;
                if (function8 == null) {
                    modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N12);
                if (function8 == null) {
                    c28655q4.m87150e0(-2022273391);
                    if (m101774D(interfaceC28601c1)) {
                        iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                    } else {
                        iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                    }
                    C27430e c27430eM107874S12 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                    EnumC16302h enumC16302h12 = EnumC16302h.DEFAULT;
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32586b1(7, interfaceC28601c1);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R4;
                    interfaceC28601c2 = interfaceC28601c1;
                    z18 = true;
                    AbstractC16306j.m46276r(c27430eM107874S12, 0.0f, enumC16302h12, true, "expandMenu", interfaceC4339a110, c28655q4, 224640, 2);
                    C28655q c28655q1118 = c28655q4;
                    c28655q1118.m87173q(false);
                    c28655q3 = c28655q1118;
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q2 = c28655q4;
                    z18 = true;
                    c28655q2.m87150e0(-2021856968);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32586b1(8, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                boolean zM101774D12 = m101774D(interfaceC28601c2);
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C32586b1(9, interfaceC28601c2);
                    c28655q3.m87172p0(objM87133R3);
                }
                int i2110 = i15 >> 6;
                int i3116 = i15 << 15;
                int i3117 = (i2110 & 7168) | (i2110 & 14) | 12582912 | (i2110 & 112) | (i2110 & 896) | (458752 & i3116) | (i3116 & 3670016);
                C28655q c28655q1119 = c28655q3;
                boolean z1110 = z18;
                C28655q c28655q11110 = c28655q1119;
                function6 = function8;
                m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D12, z4, z17, (InterfaceC4339a) objM87133R3, c28655q11110, i3117);
                c28655q11110.m87173q(z1110);
                interfaceC4339a5 = interfaceC4339a7;
                z16 = z17;
                interfaceC4339a6 = interfaceC4339a8;
                c28655q = c28655q11110;
            } else {
                c28655q4.m87138X();
                z16 = z14;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
                c28655q = c28655q4;
                function6 = function5;
            }
            function7 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4339a3 = interfaceC4339a;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                if (c28655q4.m87157i(interfaceC4339a4)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                if ((1572864 & i13) == 0) {
                    function4 = function3;
                    if (c28655q4.m87157i(function4)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                    function5 = function4;
                }
                if ((599187 & i15) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z15)) {
                    if (i28 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q4.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C32581a1(18);
                            c28655q4.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C32581a1(17);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    if (i24 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    modifierM3398t = C2314t.f9131w;
                    if (function8 == null) {
                        modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q4.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d13);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N13);
                    if (function8 == null) {
                        c28655q4.m87150e0(-2022273391);
                        if (m101774D(interfaceC28601c1)) {
                            iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                        } else {
                            iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                        }
                        C27430e c27430eM107874S13 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                        EnumC16302h enumC16302h13 = EnumC16302h.DEFAULT;
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32586b1(7, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R4;
                        interfaceC28601c2 = interfaceC28601c1;
                        z18 = true;
                        AbstractC16306j.m46276r(c27430eM107874S13, 0.0f, enumC16302h13, true, "expandMenu", interfaceC4339a111, c28655q4, 224640, 2);
                        C28655q c28655q11111 = c28655q4;
                        c28655q11111.m87173q(false);
                        c28655q3 = c28655q11111;
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        c28655q2 = c28655q4;
                        z18 = true;
                        c28655q2.m87150e0(-2021856968);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32586b1(8, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    boolean zM101774D13 = m101774D(interfaceC28601c2);
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32586b1(9, interfaceC28601c2);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    int i2111 = i15 >> 6;
                    int i3118 = i15 << 15;
                    int i3119 = (i2111 & 7168) | (i2111 & 14) | 12582912 | (i2111 & 112) | (i2111 & 896) | (458752 & i3118) | (i3118 & 3670016);
                    C28655q c28655q11112 = c28655q3;
                    boolean z1111 = z18;
                    C28655q c28655q11113 = c28655q11112;
                    function6 = function8;
                    m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D13, z4, z17, (InterfaceC4339a) objM87133R3, c28655q11113, i3119);
                    c28655q11113.m87173q(z1111);
                    interfaceC4339a5 = interfaceC4339a7;
                    z16 = z17;
                    interfaceC4339a6 = interfaceC4339a8;
                    c28655q = c28655q11113;
                } else {
                    c28655q4.m87138X();
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                    c28655q = c28655q4;
                    function6 = function5;
                }
                function7 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
                }
            }
            i15 |= 1572864;
            function5 = function3;
            if ((599187 & i15) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z15)) {
                if (i28 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q4.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C32581a1(18);
                        c28655q4.m87172p0(objM87133R6);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C32581a1(17);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                if (i24 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                modifierM3398t = C2314t.f9131w;
                if (function8 == null) {
                    modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q4.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N14);
                if (function8 == null) {
                    c28655q4.m87150e0(-2022273391);
                    if (m101774D(interfaceC28601c1)) {
                        iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                    } else {
                        iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                    }
                    C27430e c27430eM107874S14 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                    EnumC16302h enumC16302h14 = EnumC16302h.DEFAULT;
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32586b1(7, interfaceC28601c1);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R4;
                    interfaceC28601c2 = interfaceC28601c1;
                    z18 = true;
                    AbstractC16306j.m46276r(c27430eM107874S14, 0.0f, enumC16302h14, true, "expandMenu", interfaceC4339a112, c28655q4, 224640, 2);
                    C28655q c28655q11114 = c28655q4;
                    c28655q11114.m87173q(false);
                    c28655q3 = c28655q11114;
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q2 = c28655q4;
                    z18 = true;
                    c28655q2.m87150e0(-2021856968);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32586b1(8, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                boolean zM101774D14 = m101774D(interfaceC28601c2);
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C32586b1(9, interfaceC28601c2);
                    c28655q3.m87172p0(objM87133R3);
                }
                int i2112 = i15 >> 6;
                int i31110 = i15 << 15;
                int i31111 = (i2112 & 7168) | (i2112 & 14) | 12582912 | (i2112 & 112) | (i2112 & 896) | (458752 & i31110) | (i31110 & 3670016);
                C28655q c28655q11115 = c28655q3;
                boolean z1112 = z18;
                C28655q c28655q11116 = c28655q11115;
                function6 = function8;
                m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D14, z4, z17, (InterfaceC4339a) objM87133R3, c28655q11116, i31111);
                c28655q11116.m87173q(z1112);
                interfaceC4339a5 = interfaceC4339a7;
                z16 = z17;
                interfaceC4339a6 = interfaceC4339a8;
                c28655q = c28655q11116;
            } else {
                c28655q4.m87138X();
                z16 = z14;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
                c28655q = c28655q4;
                function6 = function5;
            }
            function7 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a4 = interfaceC4339a2;
        i24 = i14 & 64;
        if (i24 != 0) {
            if ((1572864 & i13) == 0) {
                function4 = function3;
                if (c28655q4.m87157i(function4)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
                function5 = function4;
            }
            if ((599187 & i15) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z15)) {
                if (i28 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q4.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C32581a1(18);
                        c28655q4.m87172p0(objM87133R6);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C32581a1(17);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                if (i24 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                modifierM3398t = C2314t.f9131w;
                if (function8 == null) {
                    modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q4.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d15);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N15);
                if (function8 == null) {
                    c28655q4.m87150e0(-2022273391);
                    if (m101774D(interfaceC28601c1)) {
                        iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                    } else {
                        iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                    }
                    C27430e c27430eM107874S15 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                    EnumC16302h enumC16302h15 = EnumC16302h.DEFAULT;
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32586b1(7, interfaceC28601c1);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a113 = (InterfaceC4339a) objM87133R4;
                    interfaceC28601c2 = interfaceC28601c1;
                    z18 = true;
                    AbstractC16306j.m46276r(c27430eM107874S15, 0.0f, enumC16302h15, true, "expandMenu", interfaceC4339a113, c28655q4, 224640, 2);
                    C28655q c28655q11117 = c28655q4;
                    c28655q11117.m87173q(false);
                    c28655q3 = c28655q11117;
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q2 = c28655q4;
                    z18 = true;
                    c28655q2.m87150e0(-2021856968);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32586b1(8, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                boolean zM101774D15 = m101774D(interfaceC28601c2);
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C32586b1(9, interfaceC28601c2);
                    c28655q3.m87172p0(objM87133R3);
                }
                int i2113 = i15 >> 6;
                int i31112 = i15 << 15;
                int i31113 = (i2113 & 7168) | (i2113 & 14) | 12582912 | (i2113 & 112) | (i2113 & 896) | (458752 & i31112) | (i31112 & 3670016);
                C28655q c28655q11118 = c28655q3;
                boolean z1113 = z18;
                C28655q c28655q11119 = c28655q11118;
                function6 = function8;
                m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D15, z4, z17, (InterfaceC4339a) objM87133R3, c28655q11119, i31113);
                c28655q11119.m87173q(z1113);
                interfaceC4339a5 = interfaceC4339a7;
                z16 = z17;
                interfaceC4339a6 = interfaceC4339a8;
                c28655q = c28655q11119;
            } else {
                c28655q4.m87138X();
                z16 = z14;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
                c28655q = c28655q4;
                function6 = function5;
            }
            function7 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
            }
        }
        i15 |= 1572864;
        function5 = function3;
        if ((599187 & i15) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z15)) {
            if (i28 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R6 = c28655q4.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C32581a1(18);
                    c28655q4.m87172p0(objM87133R6);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i18 != 0) {
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C32581a1(17);
                    c28655q4.m87172p0(objM87133R5);
                }
                interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
            } else {
                interfaceC4339a8 = interfaceC4339a4;
            }
            if (i24 != 0) {
                function8 = null;
            } else {
                function8 = function5;
            }
            objM87133R = c28655q4.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            modifierM3398t = C2314t.f9131w;
            if (function8 == null) {
                modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
            }
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d16);
            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N16);
            if (function8 == null) {
                c28655q4.m87150e0(-2022273391);
                if (m101774D(interfaceC28601c1)) {
                    iM46115a = AbstractC39383f.m125595a(C38072d.f163053a);
                } else {
                    iM46115a = C38072d.f163053a.m121951d().getAction().getAdd();
                }
                C27430e c27430eM107874S16 = AbstractC34132o.m107874S(iM46115a, c28655q4, 6);
                EnumC16302h enumC16302h16 = EnumC16302h.DEFAULT;
                objM87133R4 = c28655q4.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C32586b1(7, interfaceC28601c1);
                    c28655q4.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R4;
                interfaceC28601c2 = interfaceC28601c1;
                z18 = true;
                AbstractC16306j.m46276r(c27430eM107874S16, 0.0f, enumC16302h16, true, "expandMenu", interfaceC4339a114, c28655q4, 224640, 2);
                C28655q c28655q111110 = c28655q4;
                c28655q111110.m87173q(false);
                c28655q3 = c28655q111110;
            } else {
                interfaceC28601c2 = interfaceC28601c1;
                c28655q2 = c28655q4;
                z18 = true;
                c28655q2.m87150e0(-2021856968);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32586b1(8, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R2);
                }
                function8.invoke((InterfaceC4339a) objM87133R2, c28655q2, Integer.valueOf(6 | ((i15 >> 15) & 112)));
                c28655q2.m87173q(false);
                c28655q3 = c28655q2;
            }
            boolean zM101774D16 = m101774D(interfaceC28601c2);
            objM87133R3 = c28655q3.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C32586b1(9, interfaceC28601c2);
                c28655q3.m87172p0(objM87133R3);
            }
            int i2114 = i15 >> 6;
            int i31114 = i15 << 15;
            int i31115 = (i2114 & 7168) | (i2114 & 14) | 12582912 | (i2114 & 112) | (i2114 & 896) | (458752 & i31114) | (i31114 & 3670016);
            C28655q c28655q111111 = c28655q3;
            boolean z1114 = z18;
            C28655q c28655q111112 = c28655q111111;
            function6 = function8;
            m101795p(onNewConversationClicked, onImageUploadClicked, interfaceC4339a7, interfaceC4339a8, zM101774D16, z4, z17, (InterfaceC4339a) objM87133R3, c28655q111112, i31115);
            c28655q111112.m87173q(z1114);
            interfaceC4339a5 = interfaceC4339a7;
            z16 = z17;
            interfaceC4339a6 = interfaceC4339a8;
            c28655q = c28655q111112;
        } else {
            c28655q4.m87138X();
            z16 = z14;
            interfaceC4339a5 = interfaceC4339a3;
            interfaceC4339a6 = interfaceC4339a4;
            c28655q = c28655q4;
            function6 = function5;
        }
        function7 = function6;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2648w3(z4, z16, onNewConversationClicked, onImageUploadClicked, interfaceC4339a5, interfaceC4339a6, function7, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m101772B() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m101773C() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final boolean m101774D(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: E */
    private static final void m101775E(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m101776F(InterfaceC28601c1 interfaceC28601c1) {
        m101775E(interfaceC28601c1, !m101774D(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m101777G(InterfaceC28601c1 interfaceC28601c1) {
        m101775E(interfaceC28601c1, !m101774D(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m101778H(InterfaceC28601c1 interfaceC28601c1) {
        m101775E(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m101779I(boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, Function3 function3, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m101771A(z4, z13, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m101795p(final InterfaceC4339a interfaceC4339a, final InterfaceC4339a interfaceC4339a2, final InterfaceC4339a interfaceC4339a3, final InterfaceC4339a interfaceC4339a4, final boolean z4, final boolean z13, final boolean z14, final InterfaceC4339a interfaceC4339a5, Composer composer, final int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a6;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-585422348);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            interfaceC4339a6 = interfaceC4339a3;
            i14 |= c28655q.m87157i(interfaceC4339a6) ? 256 : 128;
        } else {
            interfaceC4339a6 = interfaceC4339a3;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87155h(z14) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a5) ? 8388608 : 4194304;
        }
        if (c28655q.m87135U(i14 & 1, (4793491 & i14) != 4793490)) {
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            float f13 = 4;
            long j7 = (((long) (-interfaceC39171c.mo724F(14 * f13))) & 4294967295L) | (((long) (-interfaceC39171c.mo724F(2 * f13))) << 32);
            if (z4) {
                c28655q.m87150e0(1545577666);
                final InterfaceC4339a interfaceC4339a7 = interfaceC4339a6;
                AbstractC3975r.m12005b(C2299e.f9104G, j7, interfaceC4339a5, new C3966j0(false, 9), AbstractC37817c.m121344e(801909404, c28655q, new InterfaceC4351m() { // from class: sl0.d3
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC32613g3.m101796q(z13, interfaceC4339a, interfaceC4339a5, interfaceC4339a2, z14, interfaceC4339a7, interfaceC4339a4, (Composer) obj, iIntValue);
                    }
                }), c28655q, ((i14 >> 15) & 896) | 27654, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1547993806);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.e3
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC32613g3.m101801v(interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, z4, z13, z14, interfaceC4339a5, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m101796q(boolean z4, final InterfaceC4339a interfaceC4339a, final InterfaceC4339a interfaceC4339a2, final InterfaceC4339a interfaceC4339a3, boolean z13, final InterfaceC4339a interfaceC4339a4, final InterfaceC4339a interfaceC4339a5, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 12;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f13);
            C2314t c2314t = C2314t.f9131w;
            float f14 = 3 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1092a.m3357b(AbstractC12889b.m36262a0(c2314t, 6, c33252iM105489e, false, 0L, 0L, 28), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(3426239567L)), new C17919x(AbstractC17918w0.m51517e(4280626484L))), 0.0f, 0.0f, 14), AbstractC33253j.m105489e(f13), 0.0f, 4));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
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
            int i14 = AbstractC37335a.f159603e;
            String strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159694s0, c28655q, 0);
            boolean zM87153g = c28655q.m87153g(interfaceC4339a) | c28655q.m87153g(interfaceC4339a2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                final int i15 = 0;
                objM87133R = new InterfaceC4339a() { // from class: sl0.f3
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return AbstractC32613g3.m101797r(interfaceC4339a, interfaceC4339a2);
                            case 1:
                                return AbstractC32613g3.m101798s(interfaceC4339a, interfaceC4339a2);
                            case 2:
                                return AbstractC32613g3.m101799t(interfaceC4339a, interfaceC4339a2);
                            default:
                                return AbstractC32613g3.m101800u(interfaceC4339a, interfaceC4339a2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            m101802w(z4, i14, strM21273g, (InterfaceC4339a) objM87133R, c28655q, 0);
            int i16 = AbstractC37335a.f159605g;
            String strM21273g2 = AbstractC8693b.m21273g(AbstractC37336b.f159649U0, c28655q, 0);
            boolean zM87153g2 = c28655q.m87153g(interfaceC4339a3) | c28655q.m87153g(interfaceC4339a2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                final int i17 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: sl0.f3
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return AbstractC32613g3.m101797r(interfaceC4339a3, interfaceC4339a2);
                            case 1:
                                return AbstractC32613g3.m101798s(interfaceC4339a3, interfaceC4339a2);
                            case 2:
                                return AbstractC32613g3.m101799t(interfaceC4339a3, interfaceC4339a2);
                            default:
                                return AbstractC32613g3.m101800u(interfaceC4339a3, interfaceC4339a2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            m101802w(true, i16, strM21273g2, (InterfaceC4339a) objM87133R2, c28655q, 6);
            if (z13) {
                c28655q.m87150e0(932805449);
                int whoopIcon = EnumC16313m0.ARTICLE.toWhoopIcon();
                String strM21273g3 = AbstractC8693b.m21273g(AbstractC37336b.f159647T0, c28655q, 0);
                boolean zM87153g3 = c28655q.m87153g(interfaceC4339a4) | c28655q.m87153g(interfaceC4339a2);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    final int i18 = 2;
                    objM87133R3 = new InterfaceC4339a() { // from class: sl0.f3
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC32613g3.m101797r(interfaceC4339a4, interfaceC4339a2);
                                case 1:
                                    return AbstractC32613g3.m101798s(interfaceC4339a4, interfaceC4339a2);
                                case 2:
                                    return AbstractC32613g3.m101799t(interfaceC4339a4, interfaceC4339a2);
                                default:
                                    return AbstractC32613g3.m101800u(interfaceC4339a4, interfaceC4339a2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                m101802w(true, whoopIcon, strM21273g3, (InterfaceC4339a) objM87133R3, c28655q, 6);
                int iM46491f = C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCamera();
                String strM21273g4 = AbstractC8693b.m21273g(AbstractC37336b.f159641Q0, c28655q, 0);
                boolean zM87153g4 = c28655q.m87153g(interfaceC4339a5) | c28655q.m87153g(interfaceC4339a2);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87153g4 || objM87133R4 == c28676v0) {
                    final int i19 = 3;
                    objM87133R4 = new InterfaceC4339a() { // from class: sl0.f3
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC32613g3.m101797r(interfaceC4339a5, interfaceC4339a2);
                                case 1:
                                    return AbstractC32613g3.m101798s(interfaceC4339a5, interfaceC4339a2);
                                case 2:
                                    return AbstractC32613g3.m101799t(interfaceC4339a5, interfaceC4339a2);
                                default:
                                    return AbstractC32613g3.m101800u(interfaceC4339a5, interfaceC4339a2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                m101802w(true, iM46491f, strM21273g4, (InterfaceC4339a) objM87133R4, c28655q, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(933544458);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m101797r(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        interfaceC4339a.invoke();
        interfaceC4339a2.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m101798s(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        interfaceC4339a.invoke();
        interfaceC4339a2.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m101799t(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        interfaceC4339a.invoke();
        interfaceC4339a2.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m101800u(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        interfaceC4339a.invoke();
        interfaceC4339a2.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m101801v(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a5, int i13, Composer composer, int i14) {
        m101795p(interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, z4, z13, z14, interfaceC4339a5, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m101802w(boolean z4, int i13, String text, InterfaceC4339a onClick, Composer composer, int i14) throws XmlPullParserException, IOException {
        int i15;
        long jM125374Y0;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1847568729);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(text) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87157i(onClick) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            boolean z13 = (i15 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C32604f(text, 4);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM51775c = AbstractC18032n.m51775c(c2314t, true, (Function1) objM87133R);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 7168) == 2048);
            Object objM87133R2 = c28655q.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                objM87133R2 = new C12203c(5, onClick, z4);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM51775c, false, null, null, (InterfaceC4339a) objM87133R2, 15);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, 8, C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3419p = AbstractC1102d.m3419p(5 * 4, c2314t);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(i13, c28655q, (i15 & 112) | 6);
            if (z4) {
                c28655q.m87150e0(444558386);
                jM125374Y0 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(444559378);
                jM125374Y0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30();
                c28655q.m87173q(false);
            }
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, jM125374Y0, c28655q, 432, 0);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q, i16).getFormLabel(), null, InterfaceC2887b.d.f11504a, 1, null);
            long jM73366B = z4 ? AbstractC25012a.m73366B(c28655q, 444566805, c38072d, c28655q, i16) : AbstractC31061c.m95627c(c28655q, 444567890, c38072d, c28655q, i16);
            c28655q.m87173q(false);
            AbstractC30795n.m94707h(text, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, c28655q, (i15 >> 6) & 14, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3605x(z4, i13, text, onClick, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m101803x(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m101804y(boolean z4, InterfaceC4339a interfaceC4339a) {
        if (z4) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m101805z(boolean z4, int i13, String str, InterfaceC4339a interfaceC4339a, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m101802w(z4, i13, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }
}
