package v41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2549j2;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.profile.view.edit.C9788l;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
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
import p088dc.AbstractC11895b;
import p163g1.AbstractC15108p2;
import p163g1.C15136s0;
import p163g1.C15199y3;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import p734sl0.C32585b0;
import p734sl0.C32632k2;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import v40.C35652d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: v41.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a¿\u0001\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aC\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\tH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010\"\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010!\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lv41/g;", "bottomSheetTopBarViewState", "Lv41/f;", "modalBottomSheetState", "Ly81/e;", "scrimColor", "Lkotlin/Function0;", "Ll83/a0;", "onLeftIconClicked", "onRightIconClicked", "Li2/a1;", "sheetShape", "Lkotlin/Function1;", "Ll0/y;", "sheetContent", "", "showHandle", "Lny0/q;", "gestureIconType", "Li2/t;", "sheetBackgroundBrush", "headerModifier", "sheetGesturesEnabled", "contentModifier", "bodyContent", "m", "(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V", "u", "(ZLv41/g;Lc93/a;Lc93/a;Lny0/q;Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/runtime/Composer;I)V", "iconButtonType", "y", "(Lv41/g;Lc93/a;Lc93/a;Lny0/q;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35660d {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m112857A(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m112858B(C35666g c35666g, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, AbstractC27274q abstractC27274q, int i13, int i14, Composer composer, int i15) {
        m112883y(c35666g, interfaceC4339a, interfaceC4339a2, abstractC27274q, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0149  */
    /* JADX WARN: Code duplicated, block: B:101:0x014c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0154  */
    /* JADX WARN: Code duplicated, block: B:106:0x015d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:0x016b  */
    /* JADX WARN: Code duplicated, block: B:111:0x016e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0173  */
    /* JADX WARN: Code duplicated, block: B:116:0x017d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0184  */
    /* JADX WARN: Code duplicated, block: B:120:0x0188  */
    /* JADX WARN: Code duplicated, block: B:123:0x0193  */
    /* JADX WARN: Code duplicated, block: B:125:0x0198  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01da  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:162:0x0208  */
    /* JADX WARN: Code duplicated, block: B:164:0x0212  */
    /* JADX WARN: Code duplicated, block: B:174:0x0240  */
    /* JADX WARN: Code duplicated, block: B:176:0x0244  */
    /* JADX WARN: Code duplicated, block: B:178:0x0247  */
    /* JADX WARN: Code duplicated, block: B:180:0x024c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0253  */
    /* JADX WARN: Code duplicated, block: B:185:0x0259  */
    /* JADX WARN: Code duplicated, block: B:188:0x0266  */
    /* JADX WARN: Code duplicated, block: B:190:0x026c  */
    /* JADX WARN: Code duplicated, block: B:192:0x0279  */
    /* JADX WARN: Code duplicated, block: B:195:0x027e  */
    /* JADX WARN: Code duplicated, block: B:196:0x028b  */
    /* JADX WARN: Code duplicated, block: B:198:0x028f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0292  */
    /* JADX WARN: Code duplicated, block: B:201:0x0296  */
    /* JADX WARN: Code duplicated, block: B:202:0x0299  */
    /* JADX WARN: Code duplicated, block: B:205:0x029f  */
    /* JADX WARN: Code duplicated, block: B:206:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:209:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:212:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:215:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:217:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:220:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:222:0x0315  */
    /* JADX WARN: Code duplicated, block: B:223:0x0324  */
    /* JADX WARN: Code duplicated, block: B:225:0x039b  */
    /* JADX WARN: Code duplicated, block: B:227:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:229:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:230:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:233:0x0432  */
    /* JADX WARN: Code duplicated, block: B:235:0x043b  */
    /* JADX WARN: Code duplicated, block: B:238:0x0459  */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x0112  */
    /* JADX WARN: Code duplicated, block: B:85:0x0119  */
    /* JADX WARN: Code duplicated, block: B:87:0x011d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0127  */
    /* JADX WARN: Code duplicated, block: B:90:0x012a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x013b  */
    /* JADX WARN: Code duplicated, block: B:98:0x013f  */
    /* JADX INFO: renamed from: m */
    public static final void m112871m(Modifier modifier, final C35666g bottomSheetTopBarViewState, final AbstractC35664f modalBottomSheetState, InterfaceC39332e interfaceC39332e, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC17869a1 interfaceC17869a1, final Function3 sheetContent, boolean z4, AbstractC27274q abstractC27274q, AbstractC17911t abstractC17911t, Modifier modifier2, boolean z13, Modifier modifier3, final InterfaceC4351m bodyContent, Composer composer, final int i13, final int i14, final int i15) {
        Modifier modifier4;
        int i16;
        InterfaceC4339a interfaceC4339a3;
        int i17;
        InterfaceC4339a interfaceC4339a4;
        int i18;
        int i19;
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
        int i38;
        boolean z14;
        final InterfaceC17869a1 interfaceC17869a2;
        final boolean z15;
        final AbstractC27274q abstractC27274q2;
        final AbstractC17911t abstractC17911t2;
        final Modifier modifier5;
        final boolean z16;
        final InterfaceC4339a interfaceC4339a5;
        final Modifier modifier6;
        final InterfaceC39332e interfaceC39332e2;
        final Modifier modifier7;
        final InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        InterfaceC39332e interfaceC39332e3;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC17869a1 interfaceC17869a1M105491g;
        boolean z17;
        AbstractC27274q abstractC27274q3;
        AbstractC17911t abstractC17911t3;
        Modifier modifier8;
        Modifier modifierM66722k;
        InterfaceC17869a1 interfaceC17869a3;
        int i39;
        AbstractC17911t abstractC17911t4;
        boolean z18;
        int i44;
        InterfaceC39332e interfaceC39332e4;
        AbstractC27274q abstractC27274q4;
        Modifier modifier9;
        boolean z19;
        Object objM87133R;
        Object objM87133R2;
        Modifier modifier10;
        InterfaceC39332e interfaceC39332e5;
        Modifier modifier11;
        C38072d c38072d;
        long jM125410o;
        Modifier modifier12;
        C38072d c38072d2;
        long jM125410o2;
        int i45;
        int i46;
        AbstractC22676k.m65750j(bottomSheetTopBarViewState, "bottomSheetTopBarViewState");
        AbstractC22676k.m65750j(modalBottomSheetState, "modalBottomSheetState");
        AbstractC22676k.m65750j(sheetContent, "sheetContent");
        AbstractC22676k.m65750j(bodyContent, "bodyContent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-231979186);
        int i47 = i15 & 1;
        if (i47 != 0) {
            i16 = i13 | 6;
            modifier4 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier4 = modifier;
            i16 = (c28655q.m87153g(modifier4) ? 4 : 2) | i13;
        } else {
            modifier4 = modifier;
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= (i13 & 64) == 0 ? c28655q.m87153g(bottomSheetTopBarViewState) : c28655q.m87157i(bottomSheetTopBarViewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q.m87153g(modalBottomSheetState) ? 256 : 128;
        }
        int i48 = i15 & 8;
        int i49 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i48 != 0) {
            i16 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i16 |= (i13 & 4096) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? 2048 : 1024;
        }
        int i54 = i15 & 16;
        int i55 = DfuBaseService.ERROR_CONNECTION_MASK;
        if (i54 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                i16 |= c28655q.m87157i(interfaceC4339a3) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a4 = interfaceC4339a2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
            }
            if ((i13 & 1572864) != 0) {
                if ((i15 & 64) == 0 || !c28655q.m87153g(interfaceC17869a1)) {
                    i46 = 524288;
                } else {
                    i46 = 1048576;
                }
                i16 |= i46;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(sheetContent)) {
                    i45 = 8388608;
                } else {
                    i45 = 4194304;
                }
                i16 |= i45;
            }
            i19 = i15 & 256;
            if (i19 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87155h(z4)) {
                        i24 = 67108864;
                    } else {
                        i24 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 512;
                if (i25 != 0) {
                    if ((i13 & 805306368) == 0) {
                        if (c28655q.m87153g(abstractC27274q)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i27 != 0) {
                        i28 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        if (c28655q.m87153g(abstractC17911t)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i14 | i29;
                    } else {
                        i28 = i14;
                    }
                    i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    if (i34 != 0) {
                        i28 |= 48;
                    } else if ((i14 & 48) != 0) {
                        i28 |= c28655q.m87153g(modifier2) ? 32 : 16;
                    }
                    i35 = i28;
                    i36 = i15 & 4096;
                    if (i36 != 0) {
                        i37 = i35;
                        if ((i14 & 384) == 0) {
                            i37 |= c28655q.m87155h(z13) ? 256 : 128;
                        }
                        if ((i14 & 3072) != 0) {
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0 && c28655q.m87153g(modifier3)) {
                                i49 = 2048;
                            }
                            i37 |= i49;
                        }
                        if ((i14 & 24576) == 0) {
                            if (!c28655q.m87157i(bodyContent)) {
                                i55 = 8192;
                            }
                            i37 |= i55;
                        }
                        i38 = i37;
                        if ((i16 & 306783379) == 306783378 || (i38 & 9363) != 9362) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q.m87135U(i16 & 1, z14)) {
                            c28655q.m87140Z();
                            if ((i13 & 1) != 0 || c28655q.m87118C()) {
                                c2314t = C2314t.f9131w;
                                if (i47 != 0) {
                                    modifier4 = c2314t;
                                }
                                if (i48 != 0) {
                                    interfaceC39332e3 = EnumC39333f.BLACK_90;
                                } else {
                                    interfaceC39332e3 = interfaceC39332e;
                                }
                                c28676v0 = C28635l.f115821a;
                                if (i54 != 0) {
                                    objM87133R2 = c28655q.m87133R();
                                    if (objM87133R2 == c28676v0) {
                                        objM87133R2 = new C35652d(1);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                                }
                                if (i17 != 0) {
                                    objM87133R = c28655q.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C35652d(2);
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                                } else {
                                    interfaceC4339a7 = interfaceC4339a4;
                                }
                                if ((i15 & 64) != 0) {
                                    float f13 = 4;
                                    float f14 = f13 * f13;
                                    interfaceC17869a1M105491g = AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12);
                                    i16 &= -3670017;
                                } else {
                                    interfaceC17869a1M105491g = interfaceC17869a1;
                                }
                                if (i19 != 0) {
                                    z17 = true;
                                } else {
                                    z17 = z4;
                                }
                                if (i25 != 0) {
                                    abstractC27274q3 = AbstractC27274q.c.f109140f;
                                } else {
                                    abstractC27274q3 = abstractC27274q;
                                }
                                if (i27 != 0) {
                                    abstractC17911t3 = null;
                                } else {
                                    abstractC17911t3 = abstractC17911t;
                                }
                                modifier8 = i34 == 0 ? modifier2 : null;
                                boolean z24 = i36 == 0 ? z13 : true;
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    i38 &= -7169;
                                    modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                                } else {
                                    modifierM66722k = modifier3;
                                }
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                                i39 = i16;
                                abstractC17911t4 = abstractC17911t3;
                                interfaceC4339a5 = interfaceC4339a7;
                                z18 = z24;
                                i44 = i38;
                                interfaceC39332e4 = interfaceC39332e3;
                                abstractC27274q4 = abstractC27274q3;
                                modifier9 = modifier4;
                                interfaceC4339a6 = interfaceC4339a3;
                                z19 = z17;
                            } else {
                                c28655q.m87138X();
                                if ((i15 & 64) != 0) {
                                    i16 &= -3670017;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    i38 &= -7169;
                                }
                                interfaceC17869a3 = interfaceC17869a1;
                                abstractC27274q4 = abstractC27274q;
                                abstractC17911t4 = abstractC17911t;
                                modifier8 = modifier2;
                                z18 = z13;
                                modifierM66722k = modifier3;
                                i44 = i38;
                                modifier9 = modifier4;
                                i39 = i16;
                                interfaceC39332e4 = interfaceC39332e;
                                interfaceC4339a6 = interfaceC4339a3;
                                interfaceC4339a5 = interfaceC4339a4;
                                z19 = z4;
                            }
                            c28655q.m87175r();
                            if (modalBottomSheetState instanceof AbstractC35664f.a) {
                                c28655q.m87150e0(-288484398);
                                Modifier modifierM3599a = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                                C15199y3 c15199y3M112950a = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                                c38072d2 = C38072d.f163053a;
                                long jM125410o3 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                                if (abstractC17911t4 != null) {
                                    c28655q.m87150e0(406346393);
                                    c28655q.m87173q(false);
                                    jM125410o2 = C17919x.f69636m;
                                } else {
                                    c28655q.m87150e0(406347519);
                                    jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                                    c28655q.m87173q(false);
                                }
                                long jMo134584toComposableColorWaAFU9c = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                                boolean z25 = z19;
                                Modifier modifier13 = modifier9;
                                Modifier modifier14 = modifier8;
                                interfaceC39332e5 = interfaceC39332e4;
                                abstractC17911t4 = abstractC17911t4;
                                InterfaceC4339a interfaceC4339a8 = interfaceC4339a5;
                                InterfaceC4339a interfaceC4339a9 = interfaceC4339a6;
                                C35654a c35654a = new C35654a(abstractC17911t4, modifierM66722k, modifier14, z25, bottomSheetTopBarViewState, interfaceC4339a9, interfaceC4339a8, abstractC27274q4, sheetContent);
                                interfaceC4339a6 = interfaceC4339a9;
                                interfaceC4339a5 = interfaceC4339a8;
                                modifier11 = modifier14;
                                z19 = z25;
                                AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a), modifierM3599a, c15199y3M112950a, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o3, jMo134584toComposableColorWaAFU9c, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                                c28655q.m87173q(false);
                                modifier12 = modifier13;
                            } else {
                                modifier10 = modifier9;
                                interfaceC39332e5 = interfaceC39332e4;
                                modifier11 = modifier8;
                                if (modalBottomSheetState instanceof AbstractC35664f.b) {
                                    throw AbstractC11895b.m32003v(406334486, c28655q, false);
                                }
                                c28655q.m87150e0(-286548851);
                                C15136s0 c15136s0M112951a = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                                c38072d = C38072d.f163053a;
                                long jM125410o4 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                                if (abstractC17911t4 != null) {
                                    c28655q.m87150e0(406406009);
                                    c28655q.m87173q(false);
                                    jM125410o = C17919x.f69636m;
                                } else {
                                    c28655q.m87150e0(406407135);
                                    jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                                    c28655q.m87173q(false);
                                }
                                long jMo134584toComposableColorWaAFU9c2 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                                int i56 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                                modifier12 = modifier10;
                                AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o4, jMo134584toComposableColorWaAFU9c2, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i56);
                                c28655q.m87173q(false);
                            }
                            modifier5 = modifier11;
                            abstractC27274q2 = abstractC27274q4;
                            interfaceC39332e2 = interfaceC39332e5;
                            interfaceC17869a2 = interfaceC17869a3;
                            z16 = z18;
                            abstractC17911t2 = abstractC17911t4;
                            modifier7 = modifierM66722k;
                            z15 = z19;
                            modifier6 = modifier12;
                        } else {
                            c28655q.m87138X();
                            interfaceC17869a2 = interfaceC17869a1;
                            z15 = z4;
                            abstractC27274q2 = abstractC27274q;
                            abstractC17911t2 = abstractC17911t;
                            modifier5 = modifier2;
                            z16 = z13;
                            interfaceC4339a5 = interfaceC4339a4;
                            modifier6 = modifier4;
                            interfaceC39332e2 = interfaceC39332e;
                            modifier7 = modifier3;
                            interfaceC4339a6 = interfaceC4339a3;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i37 = i35 | 384;
                    if ((i14 & 3072) != 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                            i49 = 2048;
                        }
                        i37 |= i49;
                    }
                    if ((i14 & 24576) == 0) {
                        if (!c28655q.m87157i(bodyContent)) {
                            i55 = 8192;
                        }
                        i37 |= i55;
                    }
                    i38 = i37;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z14)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0) {
                            c2314t = C2314t.f9131w;
                            if (i47 != 0) {
                                modifier4 = c2314t;
                            }
                            if (i48 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i54 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i17 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(2);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a7 = interfaceC4339a4;
                            }
                            if ((i15 & 64) != 0) {
                                float f15 = 4;
                                float f16 = f15 * f15;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f16, f16, 0.0f, 0.0f, 12);
                                i16 &= -3670017;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i19 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i25 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if (i27 != 0) {
                                abstractC17911t3 = null;
                            } else {
                                abstractC17911t3 = abstractC17911t;
                            }
                            if (i34 == 0) {
                            }
                            if (i36 == 0) {
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                i38 &= -7169;
                                modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                            } else {
                                modifierM66722k = modifier3;
                            }
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            i39 = i16;
                            abstractC17911t4 = abstractC17911t3;
                            interfaceC4339a5 = interfaceC4339a7;
                            z18 = z24;
                            i44 = i38;
                            interfaceC39332e4 = interfaceC39332e3;
                            abstractC27274q4 = abstractC27274q3;
                            modifier9 = modifier4;
                            interfaceC4339a6 = interfaceC4339a3;
                            z19 = z17;
                        } else {
                            c2314t = C2314t.f9131w;
                            if (i47 != 0) {
                                modifier4 = c2314t;
                            }
                            if (i48 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i54 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i17 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(2);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a7 = interfaceC4339a4;
                            }
                            if ((i15 & 64) != 0) {
                                float f17 = 4;
                                float f18 = f17 * f17;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f18, f18, 0.0f, 0.0f, 12);
                                i16 &= -3670017;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i19 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i25 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if (i27 != 0) {
                                abstractC17911t3 = null;
                            } else {
                                abstractC17911t3 = abstractC17911t;
                            }
                            if (i34 == 0) {
                            }
                            if (i36 == 0) {
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                i38 &= -7169;
                                modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                            } else {
                                modifierM66722k = modifier3;
                            }
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            i39 = i16;
                            abstractC17911t4 = abstractC17911t3;
                            interfaceC4339a5 = interfaceC4339a7;
                            z18 = z24;
                            i44 = i38;
                            interfaceC39332e4 = interfaceC39332e3;
                            abstractC27274q4 = abstractC27274q3;
                            modifier9 = modifier4;
                            interfaceC4339a6 = interfaceC4339a3;
                            z19 = z17;
                        }
                        c28655q.m87175r();
                        if (modalBottomSheetState instanceof AbstractC35664f.a) {
                            c28655q.m87150e0(-288484398);
                            Modifier modifierM3599a2 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                            C15199y3 c15199y3M112950a2 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                            c38072d2 = C38072d.f163053a;
                            long jM125410o5 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                            if (abstractC17911t4 != null) {
                                c28655q.m87150e0(406346393);
                                c28655q.m87173q(false);
                                jM125410o2 = C17919x.f69636m;
                            } else {
                                c28655q.m87150e0(406347519);
                                jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                                c28655q.m87173q(false);
                            }
                            long jMo134584toComposableColorWaAFU9c3 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                            boolean z26 = z19;
                            Modifier modifier15 = modifier9;
                            Modifier modifier16 = modifier8;
                            interfaceC39332e5 = interfaceC39332e4;
                            abstractC17911t4 = abstractC17911t4;
                            InterfaceC4339a interfaceC4339a10 = interfaceC4339a5;
                            InterfaceC4339a interfaceC4339a11 = interfaceC4339a6;
                            C35654a c35654a2 = new C35654a(abstractC17911t4, modifierM66722k, modifier16, z26, bottomSheetTopBarViewState, interfaceC4339a11, interfaceC4339a10, abstractC27274q4, sheetContent);
                            interfaceC4339a6 = interfaceC4339a11;
                            interfaceC4339a5 = interfaceC4339a10;
                            modifier11 = modifier16;
                            z19 = z26;
                            AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a2), modifierM3599a2, c15199y3M112950a2, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o5, jMo134584toComposableColorWaAFU9c3, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                            c28655q.m87173q(false);
                            modifier12 = modifier15;
                        } else {
                            modifier10 = modifier9;
                            interfaceC39332e5 = interfaceC39332e4;
                            modifier11 = modifier8;
                            if (modalBottomSheetState instanceof AbstractC35664f.b) {
                                throw AbstractC11895b.m32003v(406334486, c28655q, false);
                            }
                            c28655q.m87150e0(-286548851);
                            C15136s0 c15136s0M112951a2 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                            c38072d = C38072d.f163053a;
                            long jM125410o6 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                            if (abstractC17911t4 != null) {
                                c28655q.m87150e0(406406009);
                                c28655q.m87173q(false);
                                jM125410o = C17919x.f69636m;
                            } else {
                                c28655q.m87150e0(406407135);
                                jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                                c28655q.m87173q(false);
                            }
                            long jMo134584toComposableColorWaAFU9c4 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                            int i57 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                            modifier12 = modifier10;
                            AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a2, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o6, jMo134584toComposableColorWaAFU9c4, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i57);
                            c28655q.m87173q(false);
                        }
                        modifier5 = modifier11;
                        abstractC27274q2 = abstractC27274q4;
                        interfaceC39332e2 = interfaceC39332e5;
                        interfaceC17869a2 = interfaceC17869a3;
                        z16 = z18;
                        abstractC17911t2 = abstractC17911t4;
                        modifier7 = modifierM66722k;
                        z15 = z19;
                        modifier6 = modifier12;
                    } else {
                        c28655q.m87138X();
                        interfaceC17869a2 = interfaceC17869a1;
                        z15 = z4;
                        abstractC27274q2 = abstractC27274q;
                        abstractC17911t2 = abstractC17911t;
                        modifier5 = modifier2;
                        z16 = z13;
                        interfaceC4339a5 = interfaceC4339a4;
                        modifier6 = modifier4;
                        interfaceC39332e2 = interfaceC39332e;
                        modifier7 = modifier3;
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 805306368;
                i27 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i27 != 0) {
                    i28 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q.m87153g(abstractC17911t)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i14 | i29;
                } else {
                    i28 = i14;
                }
                i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i34 != 0) {
                    i28 |= 48;
                } else if ((i14 & 48) != 0) {
                    i28 |= c28655q.m87153g(modifier2) ? 32 : 16;
                }
                i35 = i28;
                i36 = i15 & 4096;
                if (i36 != 0) {
                    i37 = i35;
                    if ((i14 & 384) == 0) {
                        i37 |= c28655q.m87155h(z13) ? 256 : 128;
                    }
                    if ((i14 & 3072) != 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                            i49 = 2048;
                        }
                        i37 |= i49;
                    }
                    if ((i14 & 24576) == 0) {
                        if (!c28655q.m87157i(bodyContent)) {
                            i55 = 8192;
                        }
                        i37 |= i55;
                    }
                    i38 = i37;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z14)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0) {
                            c2314t = C2314t.f9131w;
                            if (i47 != 0) {
                                modifier4 = c2314t;
                            }
                            if (i48 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i54 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i17 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(2);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a7 = interfaceC4339a4;
                            }
                            if ((i15 & 64) != 0) {
                                float f19 = 4;
                                float f110 = f19 * f19;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f110, f110, 0.0f, 0.0f, 12);
                                i16 &= -3670017;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i19 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i25 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if (i27 != 0) {
                                abstractC17911t3 = null;
                            } else {
                                abstractC17911t3 = abstractC17911t;
                            }
                            if (i34 == 0) {
                            }
                            if (i36 == 0) {
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                i38 &= -7169;
                                modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                            } else {
                                modifierM66722k = modifier3;
                            }
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            i39 = i16;
                            abstractC17911t4 = abstractC17911t3;
                            interfaceC4339a5 = interfaceC4339a7;
                            z18 = z24;
                            i44 = i38;
                            interfaceC39332e4 = interfaceC39332e3;
                            abstractC27274q4 = abstractC27274q3;
                            modifier9 = modifier4;
                            interfaceC4339a6 = interfaceC4339a3;
                            z19 = z17;
                        } else {
                            c2314t = C2314t.f9131w;
                            if (i47 != 0) {
                                modifier4 = c2314t;
                            }
                            if (i48 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i54 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i17 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(2);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a7 = interfaceC4339a4;
                            }
                            if ((i15 & 64) != 0) {
                                float f111 = 4;
                                float f112 = f111 * f111;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f112, f112, 0.0f, 0.0f, 12);
                                i16 &= -3670017;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i19 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i25 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if (i27 != 0) {
                                abstractC17911t3 = null;
                            } else {
                                abstractC17911t3 = abstractC17911t;
                            }
                            if (i34 == 0) {
                            }
                            if (i36 == 0) {
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                i38 &= -7169;
                                modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                            } else {
                                modifierM66722k = modifier3;
                            }
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            i39 = i16;
                            abstractC17911t4 = abstractC17911t3;
                            interfaceC4339a5 = interfaceC4339a7;
                            z18 = z24;
                            i44 = i38;
                            interfaceC39332e4 = interfaceC39332e3;
                            abstractC27274q4 = abstractC27274q3;
                            modifier9 = modifier4;
                            interfaceC4339a6 = interfaceC4339a3;
                            z19 = z17;
                        }
                        c28655q.m87175r();
                        if (modalBottomSheetState instanceof AbstractC35664f.a) {
                            c28655q.m87150e0(-288484398);
                            Modifier modifierM3599a3 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                            C15199y3 c15199y3M112950a3 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                            c38072d2 = C38072d.f163053a;
                            long jM125410o7 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                            if (abstractC17911t4 != null) {
                                c28655q.m87150e0(406346393);
                                c28655q.m87173q(false);
                                jM125410o2 = C17919x.f69636m;
                            } else {
                                c28655q.m87150e0(406347519);
                                jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                                c28655q.m87173q(false);
                            }
                            long jMo134584toComposableColorWaAFU9c5 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                            boolean z27 = z19;
                            Modifier modifier17 = modifier9;
                            Modifier modifier18 = modifier8;
                            interfaceC39332e5 = interfaceC39332e4;
                            abstractC17911t4 = abstractC17911t4;
                            InterfaceC4339a interfaceC4339a12 = interfaceC4339a5;
                            InterfaceC4339a interfaceC4339a13 = interfaceC4339a6;
                            C35654a c35654a3 = new C35654a(abstractC17911t4, modifierM66722k, modifier18, z27, bottomSheetTopBarViewState, interfaceC4339a13, interfaceC4339a12, abstractC27274q4, sheetContent);
                            interfaceC4339a6 = interfaceC4339a13;
                            interfaceC4339a5 = interfaceC4339a12;
                            modifier11 = modifier18;
                            z19 = z27;
                            AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a3), modifierM3599a3, c15199y3M112950a3, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o7, jMo134584toComposableColorWaAFU9c5, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                            c28655q.m87173q(false);
                            modifier12 = modifier17;
                        } else {
                            modifier10 = modifier9;
                            interfaceC39332e5 = interfaceC39332e4;
                            modifier11 = modifier8;
                            if (modalBottomSheetState instanceof AbstractC35664f.b) {
                                throw AbstractC11895b.m32003v(406334486, c28655q, false);
                            }
                            c28655q.m87150e0(-286548851);
                            C15136s0 c15136s0M112951a3 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                            c38072d = C38072d.f163053a;
                            long jM125410o8 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                            if (abstractC17911t4 != null) {
                                c28655q.m87150e0(406406009);
                                c28655q.m87173q(false);
                                jM125410o = C17919x.f69636m;
                            } else {
                                c28655q.m87150e0(406407135);
                                jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                                c28655q.m87173q(false);
                            }
                            long jMo134584toComposableColorWaAFU9c6 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                            int i58 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                            modifier12 = modifier10;
                            AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a3, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o8, jMo134584toComposableColorWaAFU9c6, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i58);
                            c28655q.m87173q(false);
                        }
                        modifier5 = modifier11;
                        abstractC27274q2 = abstractC27274q4;
                        interfaceC39332e2 = interfaceC39332e5;
                        interfaceC17869a2 = interfaceC17869a3;
                        z16 = z18;
                        abstractC17911t2 = abstractC17911t4;
                        modifier7 = modifierM66722k;
                        z15 = z19;
                        modifier6 = modifier12;
                    } else {
                        c28655q.m87138X();
                        interfaceC17869a2 = interfaceC17869a1;
                        z15 = z4;
                        abstractC27274q2 = abstractC27274q;
                        abstractC17911t2 = abstractC17911t;
                        modifier5 = modifier2;
                        z16 = z13;
                        interfaceC4339a5 = interfaceC4339a4;
                        modifier6 = modifier4;
                        interfaceC39332e2 = interfaceC39332e;
                        modifier7 = modifier3;
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i37 = i35 | 384;
                if ((i14 & 3072) != 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        i49 = 2048;
                    }
                    i37 |= i49;
                }
                if ((i14 & 24576) == 0) {
                    if (!c28655q.m87157i(bodyContent)) {
                        i55 = 8192;
                    }
                    i37 |= i55;
                }
                i38 = i37;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f113 = 4;
                            float f114 = f113 * f113;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f114, f114, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    } else {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f115 = 4;
                            float f116 = f115 * f115;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f116, f116, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    }
                    c28655q.m87175r();
                    if (modalBottomSheetState instanceof AbstractC35664f.a) {
                        c28655q.m87150e0(-288484398);
                        Modifier modifierM3599a4 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                        C15199y3 c15199y3M112950a4 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                        c38072d2 = C38072d.f163053a;
                        long jM125410o9 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406346393);
                            c28655q.m87173q(false);
                            jM125410o2 = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406347519);
                            jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c7 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        boolean z28 = z19;
                        Modifier modifier19 = modifier9;
                        Modifier modifier110 = modifier8;
                        interfaceC39332e5 = interfaceC39332e4;
                        abstractC17911t4 = abstractC17911t4;
                        InterfaceC4339a interfaceC4339a14 = interfaceC4339a5;
                        InterfaceC4339a interfaceC4339a15 = interfaceC4339a6;
                        C35654a c35654a4 = new C35654a(abstractC17911t4, modifierM66722k, modifier110, z28, bottomSheetTopBarViewState, interfaceC4339a15, interfaceC4339a14, abstractC27274q4, sheetContent);
                        interfaceC4339a6 = interfaceC4339a15;
                        interfaceC4339a5 = interfaceC4339a14;
                        modifier11 = modifier110;
                        z19 = z28;
                        AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a4), modifierM3599a4, c15199y3M112950a4, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o9, jMo134584toComposableColorWaAFU9c7, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                        c28655q.m87173q(false);
                        modifier12 = modifier19;
                    } else {
                        modifier10 = modifier9;
                        interfaceC39332e5 = interfaceC39332e4;
                        modifier11 = modifier8;
                        if (modalBottomSheetState instanceof AbstractC35664f.b) {
                            throw AbstractC11895b.m32003v(406334486, c28655q, false);
                        }
                        c28655q.m87150e0(-286548851);
                        C15136s0 c15136s0M112951a4 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                        c38072d = C38072d.f163053a;
                        long jM125410o10 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406406009);
                            c28655q.m87173q(false);
                            jM125410o = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406407135);
                            jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c8 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        int i59 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                        modifier12 = modifier10;
                        AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a4, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o10, jMo134584toComposableColorWaAFU9c8, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i59);
                        c28655q.m87173q(false);
                    }
                    modifier5 = modifier11;
                    abstractC27274q2 = abstractC27274q4;
                    interfaceC39332e2 = interfaceC39332e5;
                    interfaceC17869a2 = interfaceC17869a3;
                    z16 = z18;
                    abstractC17911t2 = abstractC17911t4;
                    modifier7 = modifierM66722k;
                    z15 = z19;
                    modifier6 = modifier12;
                } else {
                    c28655q.m87138X();
                    interfaceC17869a2 = interfaceC17869a1;
                    z15 = z4;
                    abstractC27274q2 = abstractC27274q;
                    abstractC17911t2 = abstractC17911t;
                    modifier5 = modifier2;
                    z16 = z13;
                    interfaceC4339a5 = interfaceC4339a4;
                    modifier6 = modifier4;
                    interfaceC39332e2 = interfaceC39332e;
                    modifier7 = modifier3;
                    interfaceC4339a6 = interfaceC4339a3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 100663296;
            i25 = i15 & 512;
            if (i25 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87153g(abstractC27274q)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i16 |= i26;
                }
                i27 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i27 != 0) {
                    i28 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q.m87153g(abstractC17911t)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i14 | i29;
                } else {
                    i28 = i14;
                }
                i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i34 != 0) {
                    i28 |= 48;
                } else if ((i14 & 48) != 0) {
                    i28 |= c28655q.m87153g(modifier2) ? 32 : 16;
                }
                i35 = i28;
                i36 = i15 & 4096;
                if (i36 != 0) {
                    i37 = i35;
                    if ((i14 & 384) == 0) {
                        i37 |= c28655q.m87155h(z13) ? 256 : 128;
                    }
                    if ((i14 & 3072) != 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                            i49 = 2048;
                        }
                        i37 |= i49;
                    }
                    if ((i14 & 24576) == 0) {
                        if (!c28655q.m87157i(bodyContent)) {
                            i55 = 8192;
                        }
                        i37 |= i55;
                    }
                    i38 = i37;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z14)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0) {
                            c2314t = C2314t.f9131w;
                            if (i47 != 0) {
                                modifier4 = c2314t;
                            }
                            if (i48 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i54 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i17 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(2);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a7 = interfaceC4339a4;
                            }
                            if ((i15 & 64) != 0) {
                                float f117 = 4;
                                float f118 = f117 * f117;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f118, f118, 0.0f, 0.0f, 12);
                                i16 &= -3670017;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i19 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i25 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if (i27 != 0) {
                                abstractC17911t3 = null;
                            } else {
                                abstractC17911t3 = abstractC17911t;
                            }
                            if (i34 == 0) {
                            }
                            if (i36 == 0) {
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                i38 &= -7169;
                                modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                            } else {
                                modifierM66722k = modifier3;
                            }
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            i39 = i16;
                            abstractC17911t4 = abstractC17911t3;
                            interfaceC4339a5 = interfaceC4339a7;
                            z18 = z24;
                            i44 = i38;
                            interfaceC39332e4 = interfaceC39332e3;
                            abstractC27274q4 = abstractC27274q3;
                            modifier9 = modifier4;
                            interfaceC4339a6 = interfaceC4339a3;
                            z19 = z17;
                        } else {
                            c2314t = C2314t.f9131w;
                            if (i47 != 0) {
                                modifier4 = c2314t;
                            }
                            if (i48 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i54 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i17 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(2);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a7 = interfaceC4339a4;
                            }
                            if ((i15 & 64) != 0) {
                                float f119 = 4;
                                float f1110 = f119 * f119;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1110, f1110, 0.0f, 0.0f, 12);
                                i16 &= -3670017;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i19 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i25 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if (i27 != 0) {
                                abstractC17911t3 = null;
                            } else {
                                abstractC17911t3 = abstractC17911t;
                            }
                            if (i34 == 0) {
                            }
                            if (i36 == 0) {
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                i38 &= -7169;
                                modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                            } else {
                                modifierM66722k = modifier3;
                            }
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            i39 = i16;
                            abstractC17911t4 = abstractC17911t3;
                            interfaceC4339a5 = interfaceC4339a7;
                            z18 = z24;
                            i44 = i38;
                            interfaceC39332e4 = interfaceC39332e3;
                            abstractC27274q4 = abstractC27274q3;
                            modifier9 = modifier4;
                            interfaceC4339a6 = interfaceC4339a3;
                            z19 = z17;
                        }
                        c28655q.m87175r();
                        if (modalBottomSheetState instanceof AbstractC35664f.a) {
                            c28655q.m87150e0(-288484398);
                            Modifier modifierM3599a5 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                            C15199y3 c15199y3M112950a5 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                            c38072d2 = C38072d.f163053a;
                            long jM125410o11 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                            if (abstractC17911t4 != null) {
                                c28655q.m87150e0(406346393);
                                c28655q.m87173q(false);
                                jM125410o2 = C17919x.f69636m;
                            } else {
                                c28655q.m87150e0(406347519);
                                jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                                c28655q.m87173q(false);
                            }
                            long jMo134584toComposableColorWaAFU9c9 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                            boolean z29 = z19;
                            Modifier modifier111 = modifier9;
                            Modifier modifier112 = modifier8;
                            interfaceC39332e5 = interfaceC39332e4;
                            abstractC17911t4 = abstractC17911t4;
                            InterfaceC4339a interfaceC4339a16 = interfaceC4339a5;
                            InterfaceC4339a interfaceC4339a17 = interfaceC4339a6;
                            C35654a c35654a5 = new C35654a(abstractC17911t4, modifierM66722k, modifier112, z29, bottomSheetTopBarViewState, interfaceC4339a17, interfaceC4339a16, abstractC27274q4, sheetContent);
                            interfaceC4339a6 = interfaceC4339a17;
                            interfaceC4339a5 = interfaceC4339a16;
                            modifier11 = modifier112;
                            z19 = z29;
                            AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a5), modifierM3599a5, c15199y3M112950a5, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o11, jMo134584toComposableColorWaAFU9c9, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                            c28655q.m87173q(false);
                            modifier12 = modifier111;
                        } else {
                            modifier10 = modifier9;
                            interfaceC39332e5 = interfaceC39332e4;
                            modifier11 = modifier8;
                            if (modalBottomSheetState instanceof AbstractC35664f.b) {
                                throw AbstractC11895b.m32003v(406334486, c28655q, false);
                            }
                            c28655q.m87150e0(-286548851);
                            C15136s0 c15136s0M112951a5 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                            c38072d = C38072d.f163053a;
                            long jM125410o12 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                            if (abstractC17911t4 != null) {
                                c28655q.m87150e0(406406009);
                                c28655q.m87173q(false);
                                jM125410o = C17919x.f69636m;
                            } else {
                                c28655q.m87150e0(406407135);
                                jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                                c28655q.m87173q(false);
                            }
                            long jMo134584toComposableColorWaAFU9c10 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                            int i510 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                            modifier12 = modifier10;
                            AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a5, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o12, jMo134584toComposableColorWaAFU9c10, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i510);
                            c28655q.m87173q(false);
                        }
                        modifier5 = modifier11;
                        abstractC27274q2 = abstractC27274q4;
                        interfaceC39332e2 = interfaceC39332e5;
                        interfaceC17869a2 = interfaceC17869a3;
                        z16 = z18;
                        abstractC17911t2 = abstractC17911t4;
                        modifier7 = modifierM66722k;
                        z15 = z19;
                        modifier6 = modifier12;
                    } else {
                        c28655q.m87138X();
                        interfaceC17869a2 = interfaceC17869a1;
                        z15 = z4;
                        abstractC27274q2 = abstractC27274q;
                        abstractC17911t2 = abstractC17911t;
                        modifier5 = modifier2;
                        z16 = z13;
                        interfaceC4339a5 = interfaceC4339a4;
                        modifier6 = modifier4;
                        interfaceC39332e2 = interfaceC39332e;
                        modifier7 = modifier3;
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i37 = i35 | 384;
                if ((i14 & 3072) != 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        i49 = 2048;
                    }
                    i37 |= i49;
                }
                if ((i14 & 24576) == 0) {
                    if (!c28655q.m87157i(bodyContent)) {
                        i55 = 8192;
                    }
                    i37 |= i55;
                }
                i38 = i37;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f1111 = 4;
                            float f1112 = f1111 * f1111;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1112, f1112, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    } else {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f1113 = 4;
                            float f1114 = f1113 * f1113;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1114, f1114, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    }
                    c28655q.m87175r();
                    if (modalBottomSheetState instanceof AbstractC35664f.a) {
                        c28655q.m87150e0(-288484398);
                        Modifier modifierM3599a6 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                        C15199y3 c15199y3M112950a6 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                        c38072d2 = C38072d.f163053a;
                        long jM125410o13 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406346393);
                            c28655q.m87173q(false);
                            jM125410o2 = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406347519);
                            jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c11 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        boolean z210 = z19;
                        Modifier modifier113 = modifier9;
                        Modifier modifier114 = modifier8;
                        interfaceC39332e5 = interfaceC39332e4;
                        abstractC17911t4 = abstractC17911t4;
                        InterfaceC4339a interfaceC4339a18 = interfaceC4339a5;
                        InterfaceC4339a interfaceC4339a19 = interfaceC4339a6;
                        C35654a c35654a6 = new C35654a(abstractC17911t4, modifierM66722k, modifier114, z210, bottomSheetTopBarViewState, interfaceC4339a19, interfaceC4339a18, abstractC27274q4, sheetContent);
                        interfaceC4339a6 = interfaceC4339a19;
                        interfaceC4339a5 = interfaceC4339a18;
                        modifier11 = modifier114;
                        z19 = z210;
                        AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a6), modifierM3599a6, c15199y3M112950a6, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o13, jMo134584toComposableColorWaAFU9c11, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                        c28655q.m87173q(false);
                        modifier12 = modifier113;
                    } else {
                        modifier10 = modifier9;
                        interfaceC39332e5 = interfaceC39332e4;
                        modifier11 = modifier8;
                        if (modalBottomSheetState instanceof AbstractC35664f.b) {
                            throw AbstractC11895b.m32003v(406334486, c28655q, false);
                        }
                        c28655q.m87150e0(-286548851);
                        C15136s0 c15136s0M112951a6 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                        c38072d = C38072d.f163053a;
                        long jM125410o14 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406406009);
                            c28655q.m87173q(false);
                            jM125410o = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406407135);
                            jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c12 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        int i511 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                        modifier12 = modifier10;
                        AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a6, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o14, jMo134584toComposableColorWaAFU9c12, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i511);
                        c28655q.m87173q(false);
                    }
                    modifier5 = modifier11;
                    abstractC27274q2 = abstractC27274q4;
                    interfaceC39332e2 = interfaceC39332e5;
                    interfaceC17869a2 = interfaceC17869a3;
                    z16 = z18;
                    abstractC17911t2 = abstractC17911t4;
                    modifier7 = modifierM66722k;
                    z15 = z19;
                    modifier6 = modifier12;
                } else {
                    c28655q.m87138X();
                    interfaceC17869a2 = interfaceC17869a1;
                    z15 = z4;
                    abstractC27274q2 = abstractC27274q;
                    abstractC17911t2 = abstractC17911t;
                    modifier5 = modifier2;
                    z16 = z13;
                    interfaceC4339a5 = interfaceC4339a4;
                    modifier6 = modifier4;
                    interfaceC39332e2 = interfaceC39332e;
                    modifier7 = modifier3;
                    interfaceC4339a6 = interfaceC4339a3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 805306368;
            i27 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i27 != 0) {
                i28 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q.m87153g(abstractC17911t)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i14 | i29;
            } else {
                i28 = i14;
            }
            i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i34 != 0) {
                i28 |= 48;
            } else if ((i14 & 48) != 0) {
                i28 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i35 = i28;
            i36 = i15 & 4096;
            if (i36 != 0) {
                i37 = i35;
                if ((i14 & 384) == 0) {
                    i37 |= c28655q.m87155h(z13) ? 256 : 128;
                }
                if ((i14 & 3072) != 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        i49 = 2048;
                    }
                    i37 |= i49;
                }
                if ((i14 & 24576) == 0) {
                    if (!c28655q.m87157i(bodyContent)) {
                        i55 = 8192;
                    }
                    i37 |= i55;
                }
                i38 = i37;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f1115 = 4;
                            float f1116 = f1115 * f1115;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1116, f1116, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    } else {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f1117 = 4;
                            float f1118 = f1117 * f1117;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1118, f1118, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    }
                    c28655q.m87175r();
                    if (modalBottomSheetState instanceof AbstractC35664f.a) {
                        c28655q.m87150e0(-288484398);
                        Modifier modifierM3599a7 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                        C15199y3 c15199y3M112950a7 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                        c38072d2 = C38072d.f163053a;
                        long jM125410o15 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406346393);
                            c28655q.m87173q(false);
                            jM125410o2 = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406347519);
                            jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c13 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        boolean z211 = z19;
                        Modifier modifier115 = modifier9;
                        Modifier modifier116 = modifier8;
                        interfaceC39332e5 = interfaceC39332e4;
                        abstractC17911t4 = abstractC17911t4;
                        InterfaceC4339a interfaceC4339a110 = interfaceC4339a5;
                        InterfaceC4339a interfaceC4339a111 = interfaceC4339a6;
                        C35654a c35654a7 = new C35654a(abstractC17911t4, modifierM66722k, modifier116, z211, bottomSheetTopBarViewState, interfaceC4339a111, interfaceC4339a110, abstractC27274q4, sheetContent);
                        interfaceC4339a6 = interfaceC4339a111;
                        interfaceC4339a5 = interfaceC4339a110;
                        modifier11 = modifier116;
                        z19 = z211;
                        AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a7), modifierM3599a7, c15199y3M112950a7, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o15, jMo134584toComposableColorWaAFU9c13, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                        c28655q.m87173q(false);
                        modifier12 = modifier115;
                    } else {
                        modifier10 = modifier9;
                        interfaceC39332e5 = interfaceC39332e4;
                        modifier11 = modifier8;
                        if (modalBottomSheetState instanceof AbstractC35664f.b) {
                            throw AbstractC11895b.m32003v(406334486, c28655q, false);
                        }
                        c28655q.m87150e0(-286548851);
                        C15136s0 c15136s0M112951a7 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                        c38072d = C38072d.f163053a;
                        long jM125410o16 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406406009);
                            c28655q.m87173q(false);
                            jM125410o = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406407135);
                            jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c14 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        int i512 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                        modifier12 = modifier10;
                        AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a7, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o16, jMo134584toComposableColorWaAFU9c14, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i512);
                        c28655q.m87173q(false);
                    }
                    modifier5 = modifier11;
                    abstractC27274q2 = abstractC27274q4;
                    interfaceC39332e2 = interfaceC39332e5;
                    interfaceC17869a2 = interfaceC17869a3;
                    z16 = z18;
                    abstractC17911t2 = abstractC17911t4;
                    modifier7 = modifierM66722k;
                    z15 = z19;
                    modifier6 = modifier12;
                } else {
                    c28655q.m87138X();
                    interfaceC17869a2 = interfaceC17869a1;
                    z15 = z4;
                    abstractC27274q2 = abstractC27274q;
                    abstractC17911t2 = abstractC17911t;
                    modifier5 = modifier2;
                    z16 = z13;
                    interfaceC4339a5 = interfaceC4339a4;
                    modifier6 = modifier4;
                    interfaceC39332e2 = interfaceC39332e;
                    modifier7 = modifier3;
                    interfaceC4339a6 = interfaceC4339a3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i37 = i35 | 384;
            if ((i14 & 3072) != 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    i49 = 2048;
                }
                i37 |= i49;
            }
            if ((i14 & 24576) == 0) {
                if (!c28655q.m87157i(bodyContent)) {
                    i55 = 8192;
                }
                i37 |= i55;
            }
            i38 = i37;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    c2314t = C2314t.f9131w;
                    if (i47 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i48 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i54 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a4;
                    }
                    if ((i15 & 64) != 0) {
                        float f1119 = 4;
                        float f11110 = f1119 * f1119;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11110, f11110, 0.0f, 0.0f, 12);
                        i16 &= -3670017;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i25 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if (i27 != 0) {
                        abstractC17911t3 = null;
                    } else {
                        abstractC17911t3 = abstractC17911t;
                    }
                    if (i34 == 0) {
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        i38 &= -7169;
                        modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                    } else {
                        modifierM66722k = modifier3;
                    }
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                    i39 = i16;
                    abstractC17911t4 = abstractC17911t3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z18 = z24;
                    i44 = i38;
                    interfaceC39332e4 = interfaceC39332e3;
                    abstractC27274q4 = abstractC27274q3;
                    modifier9 = modifier4;
                    interfaceC4339a6 = interfaceC4339a3;
                    z19 = z17;
                } else {
                    c2314t = C2314t.f9131w;
                    if (i47 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i48 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i54 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a4;
                    }
                    if ((i15 & 64) != 0) {
                        float f11111 = 4;
                        float f11112 = f11111 * f11111;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11112, f11112, 0.0f, 0.0f, 12);
                        i16 &= -3670017;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i25 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if (i27 != 0) {
                        abstractC17911t3 = null;
                    } else {
                        abstractC17911t3 = abstractC17911t;
                    }
                    if (i34 == 0) {
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        i38 &= -7169;
                        modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                    } else {
                        modifierM66722k = modifier3;
                    }
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                    i39 = i16;
                    abstractC17911t4 = abstractC17911t3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z18 = z24;
                    i44 = i38;
                    interfaceC39332e4 = interfaceC39332e3;
                    abstractC27274q4 = abstractC27274q3;
                    modifier9 = modifier4;
                    interfaceC4339a6 = interfaceC4339a3;
                    z19 = z17;
                }
                c28655q.m87175r();
                if (modalBottomSheetState instanceof AbstractC35664f.a) {
                    c28655q.m87150e0(-288484398);
                    Modifier modifierM3599a8 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                    C15199y3 c15199y3M112950a8 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                    c38072d2 = C38072d.f163053a;
                    long jM125410o17 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                    if (abstractC17911t4 != null) {
                        c28655q.m87150e0(406346393);
                        c28655q.m87173q(false);
                        jM125410o2 = C17919x.f69636m;
                    } else {
                        c28655q.m87150e0(406347519);
                        jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                        c28655q.m87173q(false);
                    }
                    long jMo134584toComposableColorWaAFU9c15 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                    boolean z212 = z19;
                    Modifier modifier117 = modifier9;
                    Modifier modifier118 = modifier8;
                    interfaceC39332e5 = interfaceC39332e4;
                    abstractC17911t4 = abstractC17911t4;
                    InterfaceC4339a interfaceC4339a112 = interfaceC4339a5;
                    InterfaceC4339a interfaceC4339a113 = interfaceC4339a6;
                    C35654a c35654a8 = new C35654a(abstractC17911t4, modifierM66722k, modifier118, z212, bottomSheetTopBarViewState, interfaceC4339a113, interfaceC4339a112, abstractC27274q4, sheetContent);
                    interfaceC4339a6 = interfaceC4339a113;
                    interfaceC4339a5 = interfaceC4339a112;
                    modifier11 = modifier118;
                    z19 = z212;
                    AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a8), modifierM3599a8, c15199y3M112950a8, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o17, jMo134584toComposableColorWaAFU9c15, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                    c28655q.m87173q(false);
                    modifier12 = modifier117;
                } else {
                    modifier10 = modifier9;
                    interfaceC39332e5 = interfaceC39332e4;
                    modifier11 = modifier8;
                    if (modalBottomSheetState instanceof AbstractC35664f.b) {
                        throw AbstractC11895b.m32003v(406334486, c28655q, false);
                    }
                    c28655q.m87150e0(-286548851);
                    C15136s0 c15136s0M112951a8 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                    c38072d = C38072d.f163053a;
                    long jM125410o18 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                    if (abstractC17911t4 != null) {
                        c28655q.m87150e0(406406009);
                        c28655q.m87173q(false);
                        jM125410o = C17919x.f69636m;
                    } else {
                        c28655q.m87150e0(406407135);
                        jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                        c28655q.m87173q(false);
                    }
                    long jMo134584toComposableColorWaAFU9c16 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                    int i513 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                    modifier12 = modifier10;
                    AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a8, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o18, jMo134584toComposableColorWaAFU9c16, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i513);
                    c28655q.m87173q(false);
                }
                modifier5 = modifier11;
                abstractC27274q2 = abstractC27274q4;
                interfaceC39332e2 = interfaceC39332e5;
                interfaceC17869a2 = interfaceC17869a3;
                z16 = z18;
                abstractC17911t2 = abstractC17911t4;
                modifier7 = modifierM66722k;
                z15 = z19;
                modifier6 = modifier12;
            } else {
                c28655q.m87138X();
                interfaceC17869a2 = interfaceC17869a1;
                z15 = z4;
                abstractC27274q2 = abstractC27274q;
                abstractC17911t2 = abstractC17911t;
                modifier5 = modifier2;
                z16 = z13;
                interfaceC4339a5 = interfaceC4339a4;
                modifier6 = modifier4;
                interfaceC39332e2 = interfaceC39332e;
                modifier7 = modifier3;
                interfaceC4339a6 = interfaceC4339a3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        interfaceC4339a3 = interfaceC4339a;
        i17 = i15 & 32;
        if (i17 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a4 = interfaceC4339a2;
        } else {
            interfaceC4339a4 = interfaceC4339a2;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
        }
        if ((i13 & 1572864) != 0) {
            if ((i15 & 64) == 0) {
                i46 = 524288;
            } else {
                i46 = 524288;
            }
            i16 |= i46;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q.m87157i(sheetContent)) {
                i45 = 8388608;
            } else {
                i45 = 4194304;
            }
            i16 |= i45;
        }
        i19 = i15 & 256;
        if (i19 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87155h(z4)) {
                    i24 = 67108864;
                } else {
                    i24 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i24;
            }
            i25 = i15 & 512;
            if (i25 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87153g(abstractC27274q)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i16 |= i26;
                }
                i27 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i27 != 0) {
                    i28 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q.m87153g(abstractC17911t)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i14 | i29;
                } else {
                    i28 = i14;
                }
                i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i34 != 0) {
                    i28 |= 48;
                } else if ((i14 & 48) != 0) {
                    i28 |= c28655q.m87153g(modifier2) ? 32 : 16;
                }
                i35 = i28;
                i36 = i15 & 4096;
                if (i36 != 0) {
                    i37 = i35;
                    if ((i14 & 384) == 0) {
                        i37 |= c28655q.m87155h(z13) ? 256 : 128;
                    }
                    if ((i14 & 3072) != 0) {
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                            i49 = 2048;
                        }
                        i37 |= i49;
                    }
                    if ((i14 & 24576) == 0) {
                        if (!c28655q.m87157i(bodyContent)) {
                            i55 = 8192;
                        }
                        i37 |= i55;
                    }
                    i38 = i37;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q.m87135U(i16 & 1, z14)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0) {
                            c2314t = C2314t.f9131w;
                            if (i47 != 0) {
                                modifier4 = c2314t;
                            }
                            if (i48 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i54 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i17 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(2);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a7 = interfaceC4339a4;
                            }
                            if ((i15 & 64) != 0) {
                                float f11113 = 4;
                                float f11114 = f11113 * f11113;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11114, f11114, 0.0f, 0.0f, 12);
                                i16 &= -3670017;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i19 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i25 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if (i27 != 0) {
                                abstractC17911t3 = null;
                            } else {
                                abstractC17911t3 = abstractC17911t;
                            }
                            if (i34 == 0) {
                            }
                            if (i36 == 0) {
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                i38 &= -7169;
                                modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                            } else {
                                modifierM66722k = modifier3;
                            }
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            i39 = i16;
                            abstractC17911t4 = abstractC17911t3;
                            interfaceC4339a5 = interfaceC4339a7;
                            z18 = z24;
                            i44 = i38;
                            interfaceC39332e4 = interfaceC39332e3;
                            abstractC27274q4 = abstractC27274q3;
                            modifier9 = modifier4;
                            interfaceC4339a6 = interfaceC4339a3;
                            z19 = z17;
                        } else {
                            c2314t = C2314t.f9131w;
                            if (i47 != 0) {
                                modifier4 = c2314t;
                            }
                            if (i48 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i54 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i17 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(2);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a7 = interfaceC4339a4;
                            }
                            if ((i15 & 64) != 0) {
                                float f11115 = 4;
                                float f11116 = f11115 * f11115;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11116, f11116, 0.0f, 0.0f, 12);
                                i16 &= -3670017;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i19 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i25 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if (i27 != 0) {
                                abstractC17911t3 = null;
                            } else {
                                abstractC17911t3 = abstractC17911t;
                            }
                            if (i34 == 0) {
                            }
                            if (i36 == 0) {
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                i38 &= -7169;
                                modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                            } else {
                                modifierM66722k = modifier3;
                            }
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            i39 = i16;
                            abstractC17911t4 = abstractC17911t3;
                            interfaceC4339a5 = interfaceC4339a7;
                            z18 = z24;
                            i44 = i38;
                            interfaceC39332e4 = interfaceC39332e3;
                            abstractC27274q4 = abstractC27274q3;
                            modifier9 = modifier4;
                            interfaceC4339a6 = interfaceC4339a3;
                            z19 = z17;
                        }
                        c28655q.m87175r();
                        if (modalBottomSheetState instanceof AbstractC35664f.a) {
                            c28655q.m87150e0(-288484398);
                            Modifier modifierM3599a9 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                            C15199y3 c15199y3M112950a9 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                            c38072d2 = C38072d.f163053a;
                            long jM125410o19 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                            if (abstractC17911t4 != null) {
                                c28655q.m87150e0(406346393);
                                c28655q.m87173q(false);
                                jM125410o2 = C17919x.f69636m;
                            } else {
                                c28655q.m87150e0(406347519);
                                jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                                c28655q.m87173q(false);
                            }
                            long jMo134584toComposableColorWaAFU9c17 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                            boolean z213 = z19;
                            Modifier modifier119 = modifier9;
                            Modifier modifier1110 = modifier8;
                            interfaceC39332e5 = interfaceC39332e4;
                            abstractC17911t4 = abstractC17911t4;
                            InterfaceC4339a interfaceC4339a114 = interfaceC4339a5;
                            InterfaceC4339a interfaceC4339a115 = interfaceC4339a6;
                            C35654a c35654a9 = new C35654a(abstractC17911t4, modifierM66722k, modifier1110, z213, bottomSheetTopBarViewState, interfaceC4339a115, interfaceC4339a114, abstractC27274q4, sheetContent);
                            interfaceC4339a6 = interfaceC4339a115;
                            interfaceC4339a5 = interfaceC4339a114;
                            modifier11 = modifier1110;
                            z19 = z213;
                            AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a9), modifierM3599a9, c15199y3M112950a9, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o19, jMo134584toComposableColorWaAFU9c17, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                            c28655q.m87173q(false);
                            modifier12 = modifier119;
                        } else {
                            modifier10 = modifier9;
                            interfaceC39332e5 = interfaceC39332e4;
                            modifier11 = modifier8;
                            if (modalBottomSheetState instanceof AbstractC35664f.b) {
                                throw AbstractC11895b.m32003v(406334486, c28655q, false);
                            }
                            c28655q.m87150e0(-286548851);
                            C15136s0 c15136s0M112951a9 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                            c38072d = C38072d.f163053a;
                            long jM125410o110 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                            if (abstractC17911t4 != null) {
                                c28655q.m87150e0(406406009);
                                c28655q.m87173q(false);
                                jM125410o = C17919x.f69636m;
                            } else {
                                c28655q.m87150e0(406407135);
                                jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                                c28655q.m87173q(false);
                            }
                            long jMo134584toComposableColorWaAFU9c18 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                            int i514 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                            modifier12 = modifier10;
                            AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a9, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o110, jMo134584toComposableColorWaAFU9c18, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i514);
                            c28655q.m87173q(false);
                        }
                        modifier5 = modifier11;
                        abstractC27274q2 = abstractC27274q4;
                        interfaceC39332e2 = interfaceC39332e5;
                        interfaceC17869a2 = interfaceC17869a3;
                        z16 = z18;
                        abstractC17911t2 = abstractC17911t4;
                        modifier7 = modifierM66722k;
                        z15 = z19;
                        modifier6 = modifier12;
                    } else {
                        c28655q.m87138X();
                        interfaceC17869a2 = interfaceC17869a1;
                        z15 = z4;
                        abstractC27274q2 = abstractC27274q;
                        abstractC17911t2 = abstractC17911t;
                        modifier5 = modifier2;
                        z16 = z13;
                        interfaceC4339a5 = interfaceC4339a4;
                        modifier6 = modifier4;
                        interfaceC39332e2 = interfaceC39332e;
                        modifier7 = modifier3;
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i37 = i35 | 384;
                if ((i14 & 3072) != 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        i49 = 2048;
                    }
                    i37 |= i49;
                }
                if ((i14 & 24576) == 0) {
                    if (!c28655q.m87157i(bodyContent)) {
                        i55 = 8192;
                    }
                    i37 |= i55;
                }
                i38 = i37;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f11117 = 4;
                            float f11118 = f11117 * f11117;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11118, f11118, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    } else {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f11119 = 4;
                            float f111110 = f11119 * f11119;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f111110, f111110, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    }
                    c28655q.m87175r();
                    if (modalBottomSheetState instanceof AbstractC35664f.a) {
                        c28655q.m87150e0(-288484398);
                        Modifier modifierM3599a10 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                        C15199y3 c15199y3M112950a10 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                        c38072d2 = C38072d.f163053a;
                        long jM125410o111 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406346393);
                            c28655q.m87173q(false);
                            jM125410o2 = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406347519);
                            jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c19 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        boolean z214 = z19;
                        Modifier modifier1111 = modifier9;
                        Modifier modifier1112 = modifier8;
                        interfaceC39332e5 = interfaceC39332e4;
                        abstractC17911t4 = abstractC17911t4;
                        InterfaceC4339a interfaceC4339a116 = interfaceC4339a5;
                        InterfaceC4339a interfaceC4339a117 = interfaceC4339a6;
                        C35654a c35654a10 = new C35654a(abstractC17911t4, modifierM66722k, modifier1112, z214, bottomSheetTopBarViewState, interfaceC4339a117, interfaceC4339a116, abstractC27274q4, sheetContent);
                        interfaceC4339a6 = interfaceC4339a117;
                        interfaceC4339a5 = interfaceC4339a116;
                        modifier11 = modifier1112;
                        z19 = z214;
                        AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a10), modifierM3599a10, c15199y3M112950a10, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o111, jMo134584toComposableColorWaAFU9c19, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                        c28655q.m87173q(false);
                        modifier12 = modifier1111;
                    } else {
                        modifier10 = modifier9;
                        interfaceC39332e5 = interfaceC39332e4;
                        modifier11 = modifier8;
                        if (modalBottomSheetState instanceof AbstractC35664f.b) {
                            throw AbstractC11895b.m32003v(406334486, c28655q, false);
                        }
                        c28655q.m87150e0(-286548851);
                        C15136s0 c15136s0M112951a10 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                        c38072d = C38072d.f163053a;
                        long jM125410o112 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406406009);
                            c28655q.m87173q(false);
                            jM125410o = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406407135);
                            jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c110 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        int i515 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                        modifier12 = modifier10;
                        AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a10, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o112, jMo134584toComposableColorWaAFU9c110, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i515);
                        c28655q.m87173q(false);
                    }
                    modifier5 = modifier11;
                    abstractC27274q2 = abstractC27274q4;
                    interfaceC39332e2 = interfaceC39332e5;
                    interfaceC17869a2 = interfaceC17869a3;
                    z16 = z18;
                    abstractC17911t2 = abstractC17911t4;
                    modifier7 = modifierM66722k;
                    z15 = z19;
                    modifier6 = modifier12;
                } else {
                    c28655q.m87138X();
                    interfaceC17869a2 = interfaceC17869a1;
                    z15 = z4;
                    abstractC27274q2 = abstractC27274q;
                    abstractC17911t2 = abstractC17911t;
                    modifier5 = modifier2;
                    z16 = z13;
                    interfaceC4339a5 = interfaceC4339a4;
                    modifier6 = modifier4;
                    interfaceC39332e2 = interfaceC39332e;
                    modifier7 = modifier3;
                    interfaceC4339a6 = interfaceC4339a3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 805306368;
            i27 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i27 != 0) {
                i28 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q.m87153g(abstractC17911t)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i14 | i29;
            } else {
                i28 = i14;
            }
            i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i34 != 0) {
                i28 |= 48;
            } else if ((i14 & 48) != 0) {
                i28 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i35 = i28;
            i36 = i15 & 4096;
            if (i36 != 0) {
                i37 = i35;
                if ((i14 & 384) == 0) {
                    i37 |= c28655q.m87155h(z13) ? 256 : 128;
                }
                if ((i14 & 3072) != 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        i49 = 2048;
                    }
                    i37 |= i49;
                }
                if ((i14 & 24576) == 0) {
                    if (!c28655q.m87157i(bodyContent)) {
                        i55 = 8192;
                    }
                    i37 |= i55;
                }
                i38 = i37;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f111111 = 4;
                            float f111112 = f111111 * f111111;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f111112, f111112, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    } else {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f111113 = 4;
                            float f111114 = f111113 * f111113;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f111114, f111114, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    }
                    c28655q.m87175r();
                    if (modalBottomSheetState instanceof AbstractC35664f.a) {
                        c28655q.m87150e0(-288484398);
                        Modifier modifierM3599a11 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                        C15199y3 c15199y3M112950a11 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                        c38072d2 = C38072d.f163053a;
                        long jM125410o113 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406346393);
                            c28655q.m87173q(false);
                            jM125410o2 = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406347519);
                            jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c111 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        boolean z215 = z19;
                        Modifier modifier1113 = modifier9;
                        Modifier modifier1114 = modifier8;
                        interfaceC39332e5 = interfaceC39332e4;
                        abstractC17911t4 = abstractC17911t4;
                        InterfaceC4339a interfaceC4339a118 = interfaceC4339a5;
                        InterfaceC4339a interfaceC4339a119 = interfaceC4339a6;
                        C35654a c35654a11 = new C35654a(abstractC17911t4, modifierM66722k, modifier1114, z215, bottomSheetTopBarViewState, interfaceC4339a119, interfaceC4339a118, abstractC27274q4, sheetContent);
                        interfaceC4339a6 = interfaceC4339a119;
                        interfaceC4339a5 = interfaceC4339a118;
                        modifier11 = modifier1114;
                        z19 = z215;
                        AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a11), modifierM3599a11, c15199y3M112950a11, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o113, jMo134584toComposableColorWaAFU9c111, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                        c28655q.m87173q(false);
                        modifier12 = modifier1113;
                    } else {
                        modifier10 = modifier9;
                        interfaceC39332e5 = interfaceC39332e4;
                        modifier11 = modifier8;
                        if (modalBottomSheetState instanceof AbstractC35664f.b) {
                            throw AbstractC11895b.m32003v(406334486, c28655q, false);
                        }
                        c28655q.m87150e0(-286548851);
                        C15136s0 c15136s0M112951a11 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                        c38072d = C38072d.f163053a;
                        long jM125410o114 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406406009);
                            c28655q.m87173q(false);
                            jM125410o = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406407135);
                            jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c112 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        int i516 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                        modifier12 = modifier10;
                        AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a11, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o114, jMo134584toComposableColorWaAFU9c112, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i516);
                        c28655q.m87173q(false);
                    }
                    modifier5 = modifier11;
                    abstractC27274q2 = abstractC27274q4;
                    interfaceC39332e2 = interfaceC39332e5;
                    interfaceC17869a2 = interfaceC17869a3;
                    z16 = z18;
                    abstractC17911t2 = abstractC17911t4;
                    modifier7 = modifierM66722k;
                    z15 = z19;
                    modifier6 = modifier12;
                } else {
                    c28655q.m87138X();
                    interfaceC17869a2 = interfaceC17869a1;
                    z15 = z4;
                    abstractC27274q2 = abstractC27274q;
                    abstractC17911t2 = abstractC17911t;
                    modifier5 = modifier2;
                    z16 = z13;
                    interfaceC4339a5 = interfaceC4339a4;
                    modifier6 = modifier4;
                    interfaceC39332e2 = interfaceC39332e;
                    modifier7 = modifier3;
                    interfaceC4339a6 = interfaceC4339a3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i37 = i35 | 384;
            if ((i14 & 3072) != 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    i49 = 2048;
                }
                i37 |= i49;
            }
            if ((i14 & 24576) == 0) {
                if (!c28655q.m87157i(bodyContent)) {
                    i55 = 8192;
                }
                i37 |= i55;
            }
            i38 = i37;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    c2314t = C2314t.f9131w;
                    if (i47 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i48 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i54 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a4;
                    }
                    if ((i15 & 64) != 0) {
                        float f111115 = 4;
                        float f111116 = f111115 * f111115;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f111116, f111116, 0.0f, 0.0f, 12);
                        i16 &= -3670017;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i25 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if (i27 != 0) {
                        abstractC17911t3 = null;
                    } else {
                        abstractC17911t3 = abstractC17911t;
                    }
                    if (i34 == 0) {
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        i38 &= -7169;
                        modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                    } else {
                        modifierM66722k = modifier3;
                    }
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                    i39 = i16;
                    abstractC17911t4 = abstractC17911t3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z18 = z24;
                    i44 = i38;
                    interfaceC39332e4 = interfaceC39332e3;
                    abstractC27274q4 = abstractC27274q3;
                    modifier9 = modifier4;
                    interfaceC4339a6 = interfaceC4339a3;
                    z19 = z17;
                } else {
                    c2314t = C2314t.f9131w;
                    if (i47 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i48 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i54 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a4;
                    }
                    if ((i15 & 64) != 0) {
                        float f111117 = 4;
                        float f111118 = f111117 * f111117;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f111118, f111118, 0.0f, 0.0f, 12);
                        i16 &= -3670017;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i25 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if (i27 != 0) {
                        abstractC17911t3 = null;
                    } else {
                        abstractC17911t3 = abstractC17911t;
                    }
                    if (i34 == 0) {
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        i38 &= -7169;
                        modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                    } else {
                        modifierM66722k = modifier3;
                    }
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                    i39 = i16;
                    abstractC17911t4 = abstractC17911t3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z18 = z24;
                    i44 = i38;
                    interfaceC39332e4 = interfaceC39332e3;
                    abstractC27274q4 = abstractC27274q3;
                    modifier9 = modifier4;
                    interfaceC4339a6 = interfaceC4339a3;
                    z19 = z17;
                }
                c28655q.m87175r();
                if (modalBottomSheetState instanceof AbstractC35664f.a) {
                    c28655q.m87150e0(-288484398);
                    Modifier modifierM3599a12 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                    C15199y3 c15199y3M112950a12 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                    c38072d2 = C38072d.f163053a;
                    long jM125410o115 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                    if (abstractC17911t4 != null) {
                        c28655q.m87150e0(406346393);
                        c28655q.m87173q(false);
                        jM125410o2 = C17919x.f69636m;
                    } else {
                        c28655q.m87150e0(406347519);
                        jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                        c28655q.m87173q(false);
                    }
                    long jMo134584toComposableColorWaAFU9c113 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                    boolean z216 = z19;
                    Modifier modifier1115 = modifier9;
                    Modifier modifier1116 = modifier8;
                    interfaceC39332e5 = interfaceC39332e4;
                    abstractC17911t4 = abstractC17911t4;
                    InterfaceC4339a interfaceC4339a1110 = interfaceC4339a5;
                    InterfaceC4339a interfaceC4339a1111 = interfaceC4339a6;
                    C35654a c35654a12 = new C35654a(abstractC17911t4, modifierM66722k, modifier1116, z216, bottomSheetTopBarViewState, interfaceC4339a1111, interfaceC4339a1110, abstractC27274q4, sheetContent);
                    interfaceC4339a6 = interfaceC4339a1111;
                    interfaceC4339a5 = interfaceC4339a1110;
                    modifier11 = modifier1116;
                    z19 = z216;
                    AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a12), modifierM3599a12, c15199y3M112950a12, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o115, jMo134584toComposableColorWaAFU9c113, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                    c28655q.m87173q(false);
                    modifier12 = modifier1115;
                } else {
                    modifier10 = modifier9;
                    interfaceC39332e5 = interfaceC39332e4;
                    modifier11 = modifier8;
                    if (modalBottomSheetState instanceof AbstractC35664f.b) {
                        throw AbstractC11895b.m32003v(406334486, c28655q, false);
                    }
                    c28655q.m87150e0(-286548851);
                    C15136s0 c15136s0M112951a12 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                    c38072d = C38072d.f163053a;
                    long jM125410o116 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                    if (abstractC17911t4 != null) {
                        c28655q.m87150e0(406406009);
                        c28655q.m87173q(false);
                        jM125410o = C17919x.f69636m;
                    } else {
                        c28655q.m87150e0(406407135);
                        jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                        c28655q.m87173q(false);
                    }
                    long jMo134584toComposableColorWaAFU9c114 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                    int i517 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                    modifier12 = modifier10;
                    AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a12, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o116, jMo134584toComposableColorWaAFU9c114, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i517);
                    c28655q.m87173q(false);
                }
                modifier5 = modifier11;
                abstractC27274q2 = abstractC27274q4;
                interfaceC39332e2 = interfaceC39332e5;
                interfaceC17869a2 = interfaceC17869a3;
                z16 = z18;
                abstractC17911t2 = abstractC17911t4;
                modifier7 = modifierM66722k;
                z15 = z19;
                modifier6 = modifier12;
            } else {
                c28655q.m87138X();
                interfaceC17869a2 = interfaceC17869a1;
                z15 = z4;
                abstractC27274q2 = abstractC27274q;
                abstractC17911t2 = abstractC17911t;
                modifier5 = modifier2;
                z16 = z13;
                interfaceC4339a5 = interfaceC4339a4;
                modifier6 = modifier4;
                interfaceC39332e2 = interfaceC39332e;
                modifier7 = modifier3;
                interfaceC4339a6 = interfaceC4339a3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 100663296;
        i25 = i15 & 512;
        if (i25 != 0) {
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87153g(abstractC27274q)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i16 |= i26;
            }
            i27 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i27 != 0) {
                i28 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q.m87153g(abstractC17911t)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i14 | i29;
            } else {
                i28 = i14;
            }
            i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i34 != 0) {
                i28 |= 48;
            } else if ((i14 & 48) != 0) {
                i28 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i35 = i28;
            i36 = i15 & 4096;
            if (i36 != 0) {
                i37 = i35;
                if ((i14 & 384) == 0) {
                    i37 |= c28655q.m87155h(z13) ? 256 : 128;
                }
                if ((i14 & 3072) != 0) {
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        i49 = 2048;
                    }
                    i37 |= i49;
                }
                if ((i14 & 24576) == 0) {
                    if (!c28655q.m87157i(bodyContent)) {
                        i55 = 8192;
                    }
                    i37 |= i55;
                }
                i38 = i37;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f111119 = 4;
                            float f1111110 = f111119 * f111119;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1111110, f1111110, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    } else {
                        c2314t = C2314t.f9131w;
                        if (i47 != 0) {
                            modifier4 = c2314t;
                        }
                        if (i48 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i54 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a4;
                        }
                        if ((i15 & 64) != 0) {
                            float f1111111 = 4;
                            float f1111112 = f1111111 * f1111111;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1111112, f1111112, 0.0f, 0.0f, 12);
                            i16 &= -3670017;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i25 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if (i27 != 0) {
                            abstractC17911t3 = null;
                        } else {
                            abstractC17911t3 = abstractC17911t;
                        }
                        if (i34 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            i38 &= -7169;
                            modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                        } else {
                            modifierM66722k = modifier3;
                        }
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        i39 = i16;
                        abstractC17911t4 = abstractC17911t3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z18 = z24;
                        i44 = i38;
                        interfaceC39332e4 = interfaceC39332e3;
                        abstractC27274q4 = abstractC27274q3;
                        modifier9 = modifier4;
                        interfaceC4339a6 = interfaceC4339a3;
                        z19 = z17;
                    }
                    c28655q.m87175r();
                    if (modalBottomSheetState instanceof AbstractC35664f.a) {
                        c28655q.m87150e0(-288484398);
                        Modifier modifierM3599a13 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                        C15199y3 c15199y3M112950a13 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                        c38072d2 = C38072d.f163053a;
                        long jM125410o117 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406346393);
                            c28655q.m87173q(false);
                            jM125410o2 = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406347519);
                            jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c115 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        boolean z217 = z19;
                        Modifier modifier1117 = modifier9;
                        Modifier modifier1118 = modifier8;
                        interfaceC39332e5 = interfaceC39332e4;
                        abstractC17911t4 = abstractC17911t4;
                        InterfaceC4339a interfaceC4339a1112 = interfaceC4339a5;
                        InterfaceC4339a interfaceC4339a1113 = interfaceC4339a6;
                        C35654a c35654a13 = new C35654a(abstractC17911t4, modifierM66722k, modifier1118, z217, bottomSheetTopBarViewState, interfaceC4339a1113, interfaceC4339a1112, abstractC27274q4, sheetContent);
                        interfaceC4339a6 = interfaceC4339a1113;
                        interfaceC4339a5 = interfaceC4339a1112;
                        modifier11 = modifier1118;
                        z19 = z217;
                        AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a13), modifierM3599a13, c15199y3M112950a13, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o117, jMo134584toComposableColorWaAFU9c115, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                        c28655q.m87173q(false);
                        modifier12 = modifier1117;
                    } else {
                        modifier10 = modifier9;
                        interfaceC39332e5 = interfaceC39332e4;
                        modifier11 = modifier8;
                        if (modalBottomSheetState instanceof AbstractC35664f.b) {
                            throw AbstractC11895b.m32003v(406334486, c28655q, false);
                        }
                        c28655q.m87150e0(-286548851);
                        C15136s0 c15136s0M112951a13 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                        c38072d = C38072d.f163053a;
                        long jM125410o118 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                        if (abstractC17911t4 != null) {
                            c28655q.m87150e0(406406009);
                            c28655q.m87173q(false);
                            jM125410o = C17919x.f69636m;
                        } else {
                            c28655q.m87150e0(406407135);
                            jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                            c28655q.m87173q(false);
                        }
                        long jMo134584toComposableColorWaAFU9c116 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                        int i518 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                        modifier12 = modifier10;
                        AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a13, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o118, jMo134584toComposableColorWaAFU9c116, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i518);
                        c28655q.m87173q(false);
                    }
                    modifier5 = modifier11;
                    abstractC27274q2 = abstractC27274q4;
                    interfaceC39332e2 = interfaceC39332e5;
                    interfaceC17869a2 = interfaceC17869a3;
                    z16 = z18;
                    abstractC17911t2 = abstractC17911t4;
                    modifier7 = modifierM66722k;
                    z15 = z19;
                    modifier6 = modifier12;
                } else {
                    c28655q.m87138X();
                    interfaceC17869a2 = interfaceC17869a1;
                    z15 = z4;
                    abstractC27274q2 = abstractC27274q;
                    abstractC17911t2 = abstractC17911t;
                    modifier5 = modifier2;
                    z16 = z13;
                    interfaceC4339a5 = interfaceC4339a4;
                    modifier6 = modifier4;
                    interfaceC39332e2 = interfaceC39332e;
                    modifier7 = modifier3;
                    interfaceC4339a6 = interfaceC4339a3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i37 = i35 | 384;
            if ((i14 & 3072) != 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    i49 = 2048;
                }
                i37 |= i49;
            }
            if ((i14 & 24576) == 0) {
                if (!c28655q.m87157i(bodyContent)) {
                    i55 = 8192;
                }
                i37 |= i55;
            }
            i38 = i37;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    c2314t = C2314t.f9131w;
                    if (i47 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i48 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i54 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a4;
                    }
                    if ((i15 & 64) != 0) {
                        float f1111113 = 4;
                        float f1111114 = f1111113 * f1111113;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1111114, f1111114, 0.0f, 0.0f, 12);
                        i16 &= -3670017;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i25 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if (i27 != 0) {
                        abstractC17911t3 = null;
                    } else {
                        abstractC17911t3 = abstractC17911t;
                    }
                    if (i34 == 0) {
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        i38 &= -7169;
                        modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                    } else {
                        modifierM66722k = modifier3;
                    }
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                    i39 = i16;
                    abstractC17911t4 = abstractC17911t3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z18 = z24;
                    i44 = i38;
                    interfaceC39332e4 = interfaceC39332e3;
                    abstractC27274q4 = abstractC27274q3;
                    modifier9 = modifier4;
                    interfaceC4339a6 = interfaceC4339a3;
                    z19 = z17;
                } else {
                    c2314t = C2314t.f9131w;
                    if (i47 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i48 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i54 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a4;
                    }
                    if ((i15 & 64) != 0) {
                        float f1111115 = 4;
                        float f1111116 = f1111115 * f1111115;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1111116, f1111116, 0.0f, 0.0f, 12);
                        i16 &= -3670017;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i25 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if (i27 != 0) {
                        abstractC17911t3 = null;
                    } else {
                        abstractC17911t3 = abstractC17911t;
                    }
                    if (i34 == 0) {
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        i38 &= -7169;
                        modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                    } else {
                        modifierM66722k = modifier3;
                    }
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                    i39 = i16;
                    abstractC17911t4 = abstractC17911t3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z18 = z24;
                    i44 = i38;
                    interfaceC39332e4 = interfaceC39332e3;
                    abstractC27274q4 = abstractC27274q3;
                    modifier9 = modifier4;
                    interfaceC4339a6 = interfaceC4339a3;
                    z19 = z17;
                }
                c28655q.m87175r();
                if (modalBottomSheetState instanceof AbstractC35664f.a) {
                    c28655q.m87150e0(-288484398);
                    Modifier modifierM3599a14 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                    C15199y3 c15199y3M112950a14 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                    c38072d2 = C38072d.f163053a;
                    long jM125410o119 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                    if (abstractC17911t4 != null) {
                        c28655q.m87150e0(406346393);
                        c28655q.m87173q(false);
                        jM125410o2 = C17919x.f69636m;
                    } else {
                        c28655q.m87150e0(406347519);
                        jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                        c28655q.m87173q(false);
                    }
                    long jMo134584toComposableColorWaAFU9c117 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                    boolean z218 = z19;
                    Modifier modifier1119 = modifier9;
                    Modifier modifier11110 = modifier8;
                    interfaceC39332e5 = interfaceC39332e4;
                    abstractC17911t4 = abstractC17911t4;
                    InterfaceC4339a interfaceC4339a1114 = interfaceC4339a5;
                    InterfaceC4339a interfaceC4339a1115 = interfaceC4339a6;
                    C35654a c35654a14 = new C35654a(abstractC17911t4, modifierM66722k, modifier11110, z218, bottomSheetTopBarViewState, interfaceC4339a1115, interfaceC4339a1114, abstractC27274q4, sheetContent);
                    interfaceC4339a6 = interfaceC4339a1115;
                    interfaceC4339a5 = interfaceC4339a1114;
                    modifier11 = modifier11110;
                    z19 = z218;
                    AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a14), modifierM3599a14, c15199y3M112950a14, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o119, jMo134584toComposableColorWaAFU9c117, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                    c28655q.m87173q(false);
                    modifier12 = modifier1119;
                } else {
                    modifier10 = modifier9;
                    interfaceC39332e5 = interfaceC39332e4;
                    modifier11 = modifier8;
                    if (modalBottomSheetState instanceof AbstractC35664f.b) {
                        throw AbstractC11895b.m32003v(406334486, c28655q, false);
                    }
                    c28655q.m87150e0(-286548851);
                    C15136s0 c15136s0M112951a14 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                    c38072d = C38072d.f163053a;
                    long jM125410o1110 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                    if (abstractC17911t4 != null) {
                        c28655q.m87150e0(406406009);
                        c28655q.m87173q(false);
                        jM125410o = C17919x.f69636m;
                    } else {
                        c28655q.m87150e0(406407135);
                        jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                        c28655q.m87173q(false);
                    }
                    long jMo134584toComposableColorWaAFU9c118 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                    int i519 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                    modifier12 = modifier10;
                    AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a14, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o1110, jMo134584toComposableColorWaAFU9c118, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i519);
                    c28655q.m87173q(false);
                }
                modifier5 = modifier11;
                abstractC27274q2 = abstractC27274q4;
                interfaceC39332e2 = interfaceC39332e5;
                interfaceC17869a2 = interfaceC17869a3;
                z16 = z18;
                abstractC17911t2 = abstractC17911t4;
                modifier7 = modifierM66722k;
                z15 = z19;
                modifier6 = modifier12;
            } else {
                c28655q.m87138X();
                interfaceC17869a2 = interfaceC17869a1;
                z15 = z4;
                abstractC27274q2 = abstractC27274q;
                abstractC17911t2 = abstractC17911t;
                modifier5 = modifier2;
                z16 = z13;
                interfaceC4339a5 = interfaceC4339a4;
                modifier6 = modifier4;
                interfaceC39332e2 = interfaceC39332e;
                modifier7 = modifier3;
                interfaceC4339a6 = interfaceC4339a3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 805306368;
        i27 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i27 != 0) {
            i28 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q.m87153g(abstractC17911t)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i28 = i14 | i29;
        } else {
            i28 = i14;
        }
        i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i34 != 0) {
            i28 |= 48;
        } else if ((i14 & 48) != 0) {
            i28 |= c28655q.m87153g(modifier2) ? 32 : 16;
        }
        i35 = i28;
        i36 = i15 & 4096;
        if (i36 != 0) {
            i37 = i35;
            if ((i14 & 384) == 0) {
                i37 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i14 & 3072) != 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    i49 = 2048;
                }
                i37 |= i49;
            }
            if ((i14 & 24576) == 0) {
                if (!c28655q.m87157i(bodyContent)) {
                    i55 = 8192;
                }
                i37 |= i55;
            }
            i38 = i37;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    c2314t = C2314t.f9131w;
                    if (i47 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i48 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i54 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a4;
                    }
                    if ((i15 & 64) != 0) {
                        float f1111117 = 4;
                        float f1111118 = f1111117 * f1111117;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1111118, f1111118, 0.0f, 0.0f, 12);
                        i16 &= -3670017;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i25 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if (i27 != 0) {
                        abstractC17911t3 = null;
                    } else {
                        abstractC17911t3 = abstractC17911t;
                    }
                    if (i34 == 0) {
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        i38 &= -7169;
                        modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                    } else {
                        modifierM66722k = modifier3;
                    }
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                    i39 = i16;
                    abstractC17911t4 = abstractC17911t3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z18 = z24;
                    i44 = i38;
                    interfaceC39332e4 = interfaceC39332e3;
                    abstractC27274q4 = abstractC27274q3;
                    modifier9 = modifier4;
                    interfaceC4339a6 = interfaceC4339a3;
                    z19 = z17;
                } else {
                    c2314t = C2314t.f9131w;
                    if (i47 != 0) {
                        modifier4 = c2314t;
                    }
                    if (i48 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i54 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a4;
                    }
                    if ((i15 & 64) != 0) {
                        float f1111119 = 4;
                        float f11111110 = f1111119 * f1111119;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11111110, f11111110, 0.0f, 0.0f, 12);
                        i16 &= -3670017;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i25 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if (i27 != 0) {
                        abstractC17911t3 = null;
                    } else {
                        abstractC17911t3 = abstractC17911t;
                    }
                    if (i34 == 0) {
                    }
                    if (i36 == 0) {
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        i38 &= -7169;
                        modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                    } else {
                        modifierM66722k = modifier3;
                    }
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                    i39 = i16;
                    abstractC17911t4 = abstractC17911t3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z18 = z24;
                    i44 = i38;
                    interfaceC39332e4 = interfaceC39332e3;
                    abstractC27274q4 = abstractC27274q3;
                    modifier9 = modifier4;
                    interfaceC4339a6 = interfaceC4339a3;
                    z19 = z17;
                }
                c28655q.m87175r();
                if (modalBottomSheetState instanceof AbstractC35664f.a) {
                    c28655q.m87150e0(-288484398);
                    Modifier modifierM3599a15 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                    C15199y3 c15199y3M112950a15 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                    c38072d2 = C38072d.f163053a;
                    long jM125410o1111 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                    if (abstractC17911t4 != null) {
                        c28655q.m87150e0(406346393);
                        c28655q.m87173q(false);
                        jM125410o2 = C17919x.f69636m;
                    } else {
                        c28655q.m87150e0(406347519);
                        jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                        c28655q.m87173q(false);
                    }
                    long jMo134584toComposableColorWaAFU9c119 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                    boolean z219 = z19;
                    Modifier modifier11111 = modifier9;
                    Modifier modifier11112 = modifier8;
                    interfaceC39332e5 = interfaceC39332e4;
                    abstractC17911t4 = abstractC17911t4;
                    InterfaceC4339a interfaceC4339a1116 = interfaceC4339a5;
                    InterfaceC4339a interfaceC4339a1117 = interfaceC4339a6;
                    C35654a c35654a15 = new C35654a(abstractC17911t4, modifierM66722k, modifier11112, z219, bottomSheetTopBarViewState, interfaceC4339a1117, interfaceC4339a1116, abstractC27274q4, sheetContent);
                    interfaceC4339a6 = interfaceC4339a1117;
                    interfaceC4339a5 = interfaceC4339a1116;
                    modifier11 = modifier11112;
                    z19 = z219;
                    AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a15), modifierM3599a15, c15199y3M112950a15, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o1111, jMo134584toComposableColorWaAFU9c119, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                    c28655q.m87173q(false);
                    modifier12 = modifier11111;
                } else {
                    modifier10 = modifier9;
                    interfaceC39332e5 = interfaceC39332e4;
                    modifier11 = modifier8;
                    if (modalBottomSheetState instanceof AbstractC35664f.b) {
                        throw AbstractC11895b.m32003v(406334486, c28655q, false);
                    }
                    c28655q.m87150e0(-286548851);
                    C15136s0 c15136s0M112951a15 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                    c38072d = C38072d.f163053a;
                    long jM125410o1112 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                    if (abstractC17911t4 != null) {
                        c28655q.m87150e0(406406009);
                        c28655q.m87173q(false);
                        jM125410o = C17919x.f69636m;
                    } else {
                        c28655q.m87150e0(406407135);
                        jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                        c28655q.m87173q(false);
                    }
                    long jMo134584toComposableColorWaAFU9c1110 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                    int i5110 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                    modifier12 = modifier10;
                    AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a15, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o1112, jMo134584toComposableColorWaAFU9c1110, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i5110);
                    c28655q.m87173q(false);
                }
                modifier5 = modifier11;
                abstractC27274q2 = abstractC27274q4;
                interfaceC39332e2 = interfaceC39332e5;
                interfaceC17869a2 = interfaceC17869a3;
                z16 = z18;
                abstractC17911t2 = abstractC17911t4;
                modifier7 = modifierM66722k;
                z15 = z19;
                modifier6 = modifier12;
            } else {
                c28655q.m87138X();
                interfaceC17869a2 = interfaceC17869a1;
                z15 = z4;
                abstractC27274q2 = abstractC27274q;
                abstractC17911t2 = abstractC17911t;
                modifier5 = modifier2;
                z16 = z13;
                interfaceC4339a5 = interfaceC4339a4;
                modifier6 = modifier4;
                interfaceC39332e2 = interfaceC39332e;
                modifier7 = modifier3;
                interfaceC4339a6 = interfaceC4339a3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i37 = i35 | 384;
        if ((i14 & 3072) != 0) {
            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                i49 = 2048;
            }
            i37 |= i49;
        }
        if ((i14 & 24576) == 0) {
            if (!c28655q.m87157i(bodyContent)) {
                i55 = 8192;
            }
            i37 |= i55;
        }
        i38 = i37;
        if ((i16 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                c2314t = C2314t.f9131w;
                if (i47 != 0) {
                    modifier4 = c2314t;
                }
                if (i48 != 0) {
                    interfaceC39332e3 = EnumC39333f.BLACK_90;
                } else {
                    interfaceC39332e3 = interfaceC39332e;
                }
                c28676v0 = C28635l.f115821a;
                if (i54 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35652d(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35652d(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a7 = interfaceC4339a4;
                }
                if ((i15 & 64) != 0) {
                    float f11111111 = 4;
                    float f11111112 = f11111111 * f11111111;
                    interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11111112, f11111112, 0.0f, 0.0f, 12);
                    i16 &= -3670017;
                } else {
                    interfaceC17869a1M105491g = interfaceC17869a1;
                }
                if (i19 != 0) {
                    z17 = true;
                } else {
                    z17 = z4;
                }
                if (i25 != 0) {
                    abstractC27274q3 = AbstractC27274q.c.f109140f;
                } else {
                    abstractC27274q3 = abstractC27274q;
                }
                if (i27 != 0) {
                    abstractC17911t3 = null;
                } else {
                    abstractC17911t3 = abstractC17911t;
                }
                if (i34 == 0) {
                }
                if (i36 == 0) {
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    i38 &= -7169;
                    modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                } else {
                    modifierM66722k = modifier3;
                }
                interfaceC17869a3 = interfaceC17869a1M105491g;
                i39 = i16;
                abstractC17911t4 = abstractC17911t3;
                interfaceC4339a5 = interfaceC4339a7;
                z18 = z24;
                i44 = i38;
                interfaceC39332e4 = interfaceC39332e3;
                abstractC27274q4 = abstractC27274q3;
                modifier9 = modifier4;
                interfaceC4339a6 = interfaceC4339a3;
                z19 = z17;
            } else {
                c2314t = C2314t.f9131w;
                if (i47 != 0) {
                    modifier4 = c2314t;
                }
                if (i48 != 0) {
                    interfaceC39332e3 = EnumC39333f.BLACK_90;
                } else {
                    interfaceC39332e3 = interfaceC39332e;
                }
                c28676v0 = C28635l.f115821a;
                if (i54 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35652d(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35652d(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a7 = interfaceC4339a4;
                }
                if ((i15 & 64) != 0) {
                    float f11111113 = 4;
                    float f11111114 = f11111113 * f11111113;
                    interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11111114, f11111114, 0.0f, 0.0f, 12);
                    i16 &= -3670017;
                } else {
                    interfaceC17869a1M105491g = interfaceC17869a1;
                }
                if (i19 != 0) {
                    z17 = true;
                } else {
                    z17 = z4;
                }
                if (i25 != 0) {
                    abstractC27274q3 = AbstractC27274q.c.f109140f;
                } else {
                    abstractC27274q3 = abstractC27274q;
                }
                if (i27 != 0) {
                    abstractC17911t3 = null;
                } else {
                    abstractC17911t3 = abstractC17911t;
                }
                if (i34 == 0) {
                }
                if (i36 == 0) {
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    i38 &= -7169;
                    modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                } else {
                    modifierM66722k = modifier3;
                }
                interfaceC17869a3 = interfaceC17869a1M105491g;
                i39 = i16;
                abstractC17911t4 = abstractC17911t3;
                interfaceC4339a5 = interfaceC4339a7;
                z18 = z24;
                i44 = i38;
                interfaceC39332e4 = interfaceC39332e3;
                abstractC27274q4 = abstractC27274q3;
                modifier9 = modifier4;
                interfaceC4339a6 = interfaceC4339a3;
                z19 = z17;
            }
            c28655q.m87175r();
            if (modalBottomSheetState instanceof AbstractC35664f.a) {
                c28655q.m87150e0(-288484398);
                Modifier modifierM3599a16 = AbstractC1136a.m3599a(modifier9, "ModalBottomSheetLayout");
                C15199y3 c15199y3M112950a16 = ((AbstractC35664f.a) modalBottomSheetState).getModalBottomSheetState();
                c38072d2 = C38072d.f163053a;
                long jM125410o1113 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                if (abstractC17911t4 != null) {
                    c28655q.m87150e0(406346393);
                    c28655q.m87173q(false);
                    jM125410o2 = C17919x.f69636m;
                } else {
                    c28655q.m87150e0(406347519);
                    jM125410o2 = c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd();
                    c28655q.m87173q(false);
                }
                long jMo134584toComposableColorWaAFU9c1111 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                boolean z2110 = z19;
                Modifier modifier11113 = modifier9;
                Modifier modifier11114 = modifier8;
                interfaceC39332e5 = interfaceC39332e4;
                abstractC17911t4 = abstractC17911t4;
                InterfaceC4339a interfaceC4339a1118 = interfaceC4339a5;
                InterfaceC4339a interfaceC4339a1119 = interfaceC4339a6;
                C35654a c35654a16 = new C35654a(abstractC17911t4, modifierM66722k, modifier11114, z2110, bottomSheetTopBarViewState, interfaceC4339a1119, interfaceC4339a1118, abstractC27274q4, sheetContent);
                interfaceC4339a6 = interfaceC4339a1119;
                interfaceC4339a5 = interfaceC4339a1118;
                modifier11 = modifier11114;
                z19 = z2110;
                AbstractC1118c.m3458a(AbstractC37817c.m121344e(-957694232, c28655q, c35654a16), modifierM3599a16, c15199y3M112950a16, z18, interfaceC17869a3, 0.0f, jM125410o2, jM125410o1113, jMo134584toComposableColorWaAFU9c1111, AbstractC37817c.m121344e(1422311759, c28655q, new C9788l(7, bodyContent)), c28655q, 805306886 | ((i44 << 3) & 7168) | ((i39 >> 6) & 57344), 32);
                c28655q.m87173q(false);
                modifier12 = modifier11113;
            } else {
                modifier10 = modifier9;
                interfaceC39332e5 = interfaceC39332e4;
                modifier11 = modifier8;
                if (modalBottomSheetState instanceof AbstractC35664f.b) {
                    throw AbstractC11895b.m32003v(406334486, c28655q, false);
                }
                c28655q.m87150e0(-286548851);
                C15136s0 c15136s0M112951a16 = ((AbstractC35664f.b) modalBottomSheetState).getBottomDrawerState();
                c38072d = C38072d.f163053a;
                long jM125410o1114 = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                if (abstractC17911t4 != null) {
                    c28655q.m87150e0(406406009);
                    c28655q.m87173q(false);
                    jM125410o = C17919x.f69636m;
                } else {
                    c28655q.m87150e0(406407135);
                    jM125410o = c38072d.m121949b(c28655q, 6).getBackgroundDarkStd();
                    c28655q.m87173q(false);
                }
                long jMo134584toComposableColorWaAFU9c1112 = interfaceC39332e5.mo134584toComposableColorWaAFU9c(c28655q, (i39 >> 9) & 14);
                int i5111 = ((i39 << 3) & 112) | 805309958 | ((i39 >> 6) & 57344);
                modifier12 = modifier10;
                AbstractC15108p2.m43170a(AbstractC37817c.m121344e(682152084, c28655q, new C32585b0(abstractC17911t4, modifierM66722k, z19, bottomSheetTopBarViewState, interfaceC4339a6, interfaceC4339a5, sheetContent)), modifier12, c15136s0M112951a16, false, interfaceC17869a3, 0.0f, jM125410o, jM125410o1114, jMo134584toComposableColorWaAFU9c1112, AbstractC37817c.m121344e(-1067111941, c28655q, new C9788l(8, bodyContent)), c28655q, i5111);
                c28655q.m87173q(false);
            }
            modifier5 = modifier11;
            abstractC27274q2 = abstractC27274q4;
            interfaceC39332e2 = interfaceC39332e5;
            interfaceC17869a2 = interfaceC17869a3;
            z16 = z18;
            abstractC17911t2 = abstractC17911t4;
            modifier7 = modifierM66722k;
            z15 = z19;
            modifier6 = modifier12;
        } else {
            c28655q.m87138X();
            interfaceC17869a2 = interfaceC17869a1;
            z15 = z4;
            abstractC27274q2 = abstractC27274q;
            abstractC17911t2 = abstractC17911t;
            modifier5 = modifier2;
            z16 = z13;
            interfaceC4339a5 = interfaceC4339a4;
            modifier6 = modifier4;
            interfaceC39332e2 = interfaceC39332e;
            modifier7 = modifier3;
            interfaceC4339a6 = interfaceC4339a3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: v41.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC35660d.m112878t(modifier6, bottomSheetTopBarViewState, modalBottomSheetState, interfaceC39332e2, interfaceC4339a6, interfaceC4339a5, interfaceC17869a2, sheetContent, z15, abstractC27274q2, abstractC17911t2, modifier5, z16, modifier7, bodyContent, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m112872n() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m112873o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m112874p(AbstractC17911t abstractC17911t, Modifier modifier, String str, Modifier modifier2, boolean z4, C35666g c35666g, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, AbstractC27274q abstractC27274q, Function3 function3, InterfaceC23013y ModalBottomSheetLayout, Composer composer, int i13) {
        Modifier modifierM3357b;
        AbstractC22676k.m65750j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifier3 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            if (abstractC17911t != null && (modifierM3357b = AbstractC1092a.m3357b(modifier3, abstractC17911t, null, 0.0f, 6)) != null) {
                modifier3 = modifierM3357b;
            }
            Modifier modifierMo3471e = modifierM3409f.mo3471e(modifier3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            Modifier modifierM3599a = AbstractC1136a.m3599a(modifier, str);
            C2305k c2305k = C2299e.f9111N;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a);
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
            if (modifier2 != null) {
                c28655q.m87150e0(133789710);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                m112879u(z4, c35666g, interfaceC4339a, interfaceC4339a2, abstractC27274q, c28655q, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(134239365);
                m112879u(z4, c35666g, interfaceC4339a, interfaceC4339a2, abstractC27274q, c28655q, 0);
                c28655q.m87173q(false);
            }
            function3.invoke(C23016z.f90757a, c28655q, 6);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m112875q(InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            interfaceC4351m.invoke(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m112876r(AbstractC17911t abstractC17911t, Modifier modifier, boolean z4, C35666g c35666g, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function3 function3, InterfaceC23013y BottomDrawer, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomDrawer, "$this$BottomDrawer");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3357b = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifierM3357b);
            if (abstractC17911t != null) {
                modifierM3357b = AbstractC1092a.m3357b(modifierM3357b, abstractC17911t, null, 0.0f, 6);
            }
            Modifier modifierMo3471e = modifierM3409f.mo3471e(modifierM3357b);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier);
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
            if (z4) {
                c28655q.m87150e0(-2087424544);
                m112881w(c28655q, 0);
            } else {
                c28655q.m87150e0(-285643734);
            }
            c28655q.m87173q(false);
            m112883y(c35666g, interfaceC4339a, interfaceC4339a2, AbstractC27274q.a.f109136f, c28655q, 3072, 0);
            function3.invoke(C23016z.f90757a, c28655q, 6);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m112877s(InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            interfaceC4351m.invoke(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m112878t(Modifier modifier, C35666g c35666g, AbstractC35664f abstractC35664f, InterfaceC39332e interfaceC39332e, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC17869a1 interfaceC17869a1, Function3 function3, boolean z4, AbstractC27274q abstractC27274q, AbstractC17911t abstractC17911t, Modifier modifier2, boolean z13, Modifier modifier3, InterfaceC4351m interfaceC4351m, int i13, int i14, int i15, Composer composer, int i16) {
        m112871m(modifier, c35666g, abstractC35664f, interfaceC39332e, interfaceC4339a, interfaceC4339a2, interfaceC17869a1, function3, z4, abstractC27274q, abstractC17911t, modifier2, z13, modifier3, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m112879u(boolean z4, C35666g c35666g, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, AbstractC27274q abstractC27274q, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2067283601);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c35666g) : c28655q.m87157i(c35666g) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(abstractC27274q) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            if (z4) {
                c28655q.m87150e0(1910325143);
                m112881w(c28655q, 0);
            } else {
                c28655q.m87150e0(-909455021);
            }
            c28655q.m87173q(false);
            m112883y(c35666g, interfaceC4339a, interfaceC4339a2, abstractC27274q, c28655q, (i14 >> 3) & 8190, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(z4, c35666g, interfaceC4339a, interfaceC4339a2, abstractC27274q, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m112880v(boolean z4, C35666g c35666g, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, AbstractC27274q abstractC27274q, int i13, Composer composer, int i14) {
        m112879u(z4, c35666g, interfaceC4339a, interfaceC4339a2, abstractC27274q, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m112881w(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(837086491);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC29125c.m88524d(AbstractC34132o.m107874S(AbstractC16272a.f62068e, c28655q, 6), null, null, null, c28655q, 48, 124);
            float f13 = 4;
            AbstractC18489d0.m53380u(f13, f13, C2314t.f9131w, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m112882x(int i13, Composer composer, int i14) {
        m112881w(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x034e  */
    /* JADX WARN: Code duplicated, block: B:103:0x038b  */
    /* JADX WARN: Code duplicated, block: B:104:0x038d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0394 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x039a  */
    /* JADX WARN: Code duplicated, block: B:112:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:118:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:63:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x0129  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01be  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:78:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0202  */
    /* JADX WARN: Code duplicated, block: B:81:0x021d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0241  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:92:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:95:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:99:0x0347  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v6, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r28v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v14, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v21, types: [x81.d] */
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
    /* JADX INFO: renamed from: y */
    public static final void m112883y(C35666g bottomSheetTopBarViewState, InterfaceC4339a onLeftIconClicked, InterfaceC4339a onRightIconClicked, AbstractC27274q abstractC27274q, Composer composer, int i13, int i14) {
        int i15;
        AbstractC27274q abstractC27274q2;
        boolean z4;
        InterfaceC4339a interfaceC4339a;
        AbstractC27274q abstractC27274q3;
        ?? r14;
        C28677v1 c28677v1M87180u;
        AbstractC27274q abstractC27274q4;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        EnumC35671i0 enumC35671i0M112957f;
        EnumC35671i0 enumC35671i0;
        C28676v0 c28676v0;
        C23000t1 c23000t1;
        C28676v0 c28676v1;
        C2314t c2314t2;
        int i16;
        C23000t1 c23000t2;
        boolean z13;
        C2314t c2314t3;
        boolean z14;
        Object objM87133R;
        ?? r15;
        ?? r10;
        C2314t c2314t4;
        C23000t1 c23000t3;
        ?? r16;
        C2314t c2314t5;
        AbstractC27274q abstractC27274q5;
        ?? r17;
        Object objM87133R2;
        ?? r18;
        C28655q c28655q;
        boolean z15;
        ?? r19;
        AbstractC22676k.m65750j(bottomSheetTopBarViewState, "bottomSheetTopBarViewState");
        AbstractC22676k.m65750j(onLeftIconClicked, "onLeftIconClicked");
        AbstractC22676k.m65750j(onRightIconClicked, "onRightIconClicked");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1774726569);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(bottomSheetTopBarViewState) : c28655q2.m87157i(bottomSheetTopBarViewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onLeftIconClicked) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onRightIconClicked) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                abstractC27274q2 = abstractC27274q;
                i15 |= c28655q2.m87153g(abstractC27274q2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    abstractC27274q4 = AbstractC27274q.c.f109140f;
                } else {
                    abstractC27274q4 = abstractC27274q2;
                }
                if (bottomSheetTopBarViewState.getLeftIcon() != null && bottomSheetTopBarViewState.getTitle() == null && bottomSheetTopBarViewState.getRightIcon() == null) {
                    c28655q2.m87150e0(927704980);
                    c28655q2.m87173q(false);
                    interfaceC4339a = onRightIconClicked;
                    abstractC27274q5 = abstractC27274q4;
                    r19 = c28655q2;
                } else {
                    c28655q2.m87150e0(924520226);
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(bottomSheetTopBarViewState.getTitleBarPadding(), AbstractC1102d.m3409f(1.0f, c2314t));
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    enumC35671i0M112957f = bottomSheetTopBarViewState.getTitleAlignment();
                    enumC35671i0 = EnumC35671i0.LEFT;
                    c28676v0 = C28635l.f115821a;
                    c23000t1 = C23000t1.f90727a;
                    if (enumC35671i0M112957f == enumC35671i0 || bottomSheetTopBarViewState.getTitle() == null) {
                        c28676v1 = c28676v0;
                        c2314t2 = c2314t;
                        i16 = 6;
                        c23000t2 = c23000t1;
                        z13 = false;
                        if (bottomSheetTopBarViewState.getLeftIcon() != null) {
                            c28655q2.m87150e0(-1244733209);
                            C27270o c27270o = new C27270o(abstractC27274q4, bottomSheetTopBarViewState.getLeftIcon().getIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            String strM21274h = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getLeftIcon().getContentDescription(), c28655q2, 0);
                            if ((i15 & 112) == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R = c28655q2.m87133R();
                            if (z14 || objM87133R == c28676v1) {
                                objM87133R = new C31918g(onLeftIconClicked, 11);
                                c28655q2.m87172p0(objM87133R);
                            }
                            AbstractC27242b1.m82092d(c27270o, strM21274h, null, null, (InterfaceC4339a) objM87133R, c28655q2, 0, 12);
                            c28655q2.m87173q(false);
                            z15 = z13;
                            c28655q = c28655q2;
                        } else {
                            c28655q2.m87150e0(-1244370912);
                            c2314t3 = c2314t2;
                            AbstractC22953f.m66715b(c28655q2, AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t3), "left_spacer"));
                            c28655q2.m87173q(false);
                            r10 = z13;
                            r15 = c28655q2;
                        }
                        if (bottomSheetTopBarViewState.getTitleAlignment() == EnumC35671i0.CENTER || bottomSheetTopBarViewState.getTitle() == null) {
                            c2314t4 = c2314t3;
                            c23000t3 = c23000t2;
                            if (bottomSheetTopBarViewState.getTitleAlignment() != enumC35671i0 || bottomSheetTopBarViewState.getTitleAlignment() == EnumC35671i0.RIGHT) {
                                r15.m87150e0(-1243363629);
                                r15.m87173q(r10);
                                r16 = r15;
                            } else {
                                r15.m87150e0(-1243553907);
                                AbstractC22953f.m66715b(r15, c23000t3.mo66772c(c2314t4, true, 1.0f));
                                r15.m87173q(r10);
                                r16 = r15;
                            }
                        } else {
                            r15.m87150e0(-1243968966);
                            C2314t c2314t6 = c2314t3;
                            Modifier modifierMo66772c = c23000t2.mo66772c(c2314t6, true, 1.0f);
                            String strM21274h2 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getTitle(), r15, r10);
                            ?? r24 = C38072d.f163053a;
                            ?? r28 = r15;
                            AbstractC30795n.m94707h(strM21274h2, modifierMo66772c, r24.m121949b(r15, i16).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, r24.m121952e(r15, i16).getH4(), null, r28, 0, 0, 196088);
                            ?? r110 = r28;
                            r110.m87173q(r10);
                            c2314t4 = c2314t6;
                            c23000t3 = c23000t2;
                            r16 = r110;
                        }
                        if (bottomSheetTopBarViewState.getTitleAlignment() == EnumC35671i0.RIGHT || bottomSheetTopBarViewState.getTitle() == null) {
                            c2314t5 = c2314t4;
                            if (bottomSheetTopBarViewState.getRightIcon() != null) {
                                r16.m87150e0(-1242820912);
                                abstractC27274q5 = abstractC27274q4;
                                C27270o c27270o2 = new C27270o(abstractC27274q5, bottomSheetTopBarViewState.getRightIcon().getIcon(), bottomSheetTopBarViewState.getRightIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                                String strM21274h3 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getRightIcon().getContentDescription(), r16, r10);
                                if ((i15 & 896) == 256) {
                                    r17 = 1;
                                } else {
                                    r17 = r10;
                                }
                                objM87133R2 = r16.m87133R();
                                if (r17 == 0 || objM87133R2 == c28676v1) {
                                    interfaceC4339a = onRightIconClicked;
                                    objM87133R2 = new C31918g(interfaceC4339a, 10);
                                    r16.m87172p0(objM87133R2);
                                } else {
                                    interfaceC4339a = onRightIconClicked;
                                }
                                AbstractC27242b1.m82092d(c27270o2, strM21274h3, null, null, (InterfaceC4339a) objM87133R2, r16, 0, 12);
                                r16.m87173q(r10);
                                r18 = r16;
                            } else {
                                interfaceC4339a = onRightIconClicked;
                                abstractC27274q5 = abstractC27274q4;
                                r16.m87150e0(-1242408953);
                                AbstractC22953f.m66715b(r16, AbstractC1136a.m3599a(AbstractC1102d.m3419p(i16 * 4, c2314t5), "right_spacer"));
                                r16.m87173q(r10);
                                r18 = r16;
                            }
                        } else {
                            r16.m87150e0(-1243178435);
                            Modifier modifierMo66772c2 = c23000t3.mo66772c(c2314t4, true, 1.0f);
                            String strM21274h4 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getTitle(), r16, r10);
                            ?? r25 = C38072d.f163053a;
                            C2886a c2886aM8437r = r25.m121952e(r16, i16).getH4();
                            ?? r29 = r16;
                            c2314t5 = c2314t4;
                            AbstractC30795n.m94707h(strM21274h4, modifierMo66772c2, r25.m121949b(r16, i16).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(i16), 0L, 0, false, 0, 0, null, c2886aM8437r, null, r29, 0, 0, 196088);
                            ?? r111 = r29;
                            r111.m87173q(r10);
                            interfaceC4339a = onRightIconClicked;
                            abstractC27274q5 = abstractC27274q4;
                            r18 = r111;
                        }
                        r18.m87173q(true);
                        AbstractC22953f.m66715b(r18, AbstractC1102d.m3419p(bottomSheetTopBarViewState.getBottomSpacing(), c2314t5));
                        r18.m87173q(r10);
                        r19 = r18;
                    } else {
                        c28655q2.m87150e0(-1245089957);
                        Modifier modifierMo66772c3 = c23000t1.mo66772c(c2314t, true, 1.0f);
                        String strM21274h5 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getTitle(), c28655q2, 0);
                        C38072d c38072d = C38072d.f163053a;
                        c23000t2 = c23000t1;
                        i16 = 6;
                        c28676v1 = c28676v0;
                        c2314t2 = c2314t;
                        z15 = false;
                        AbstractC30795n.m94707h(strM21274h5, modifierMo66772c3, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH4(), null, c28655q2, 0, 0, 196088);
                        C28655q c28655q3 = c28655q2;
                        c28655q3.m87173q(false);
                        c28655q = c28655q3;
                    }
                    c2314t3 = c2314t2;
                    r10 = z15;
                    r15 = c28655q;
                    if (bottomSheetTopBarViewState.getTitleAlignment() == EnumC35671i0.CENTER) {
                        c2314t4 = c2314t3;
                        c23000t3 = c23000t2;
                        if (bottomSheetTopBarViewState.getTitleAlignment() != enumC35671i0) {
                            r15.m87150e0(-1243363629);
                            r15.m87173q(r10);
                            r16 = r15;
                        } else {
                            r15.m87150e0(-1243363629);
                            r15.m87173q(r10);
                            r16 = r15;
                        }
                    } else {
                        c2314t4 = c2314t3;
                        c23000t3 = c23000t2;
                        if (bottomSheetTopBarViewState.getTitleAlignment() != enumC35671i0) {
                            r15.m87150e0(-1243363629);
                            r15.m87173q(r10);
                            r16 = r15;
                        } else {
                            r15.m87150e0(-1243363629);
                            r15.m87173q(r10);
                            r16 = r15;
                        }
                    }
                    if (bottomSheetTopBarViewState.getTitleAlignment() == EnumC35671i0.RIGHT) {
                        c2314t5 = c2314t4;
                        if (bottomSheetTopBarViewState.getRightIcon() != null) {
                            r16.m87150e0(-1242820912);
                            abstractC27274q5 = abstractC27274q4;
                            C27270o c27270o3 = new C27270o(abstractC27274q5, bottomSheetTopBarViewState.getRightIcon().getIcon(), bottomSheetTopBarViewState.getRightIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                            String strM21274h6 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getRightIcon().getContentDescription(), r16, r10);
                            if ((i15 & 896) == 256) {
                                r17 = 1;
                            } else {
                                r17 = r10;
                            }
                            objM87133R2 = r16.m87133R();
                            if (r17 == 0) {
                                interfaceC4339a = onRightIconClicked;
                                objM87133R2 = new C31918g(interfaceC4339a, 10);
                                r16.m87172p0(objM87133R2);
                            } else {
                                interfaceC4339a = onRightIconClicked;
                                objM87133R2 = new C31918g(interfaceC4339a, 10);
                                r16.m87172p0(objM87133R2);
                            }
                            AbstractC27242b1.m82092d(c27270o3, strM21274h6, null, null, (InterfaceC4339a) objM87133R2, r16, 0, 12);
                            r16.m87173q(r10);
                            r18 = r16;
                        } else {
                            interfaceC4339a = onRightIconClicked;
                            abstractC27274q5 = abstractC27274q4;
                            r16.m87150e0(-1242408953);
                            AbstractC22953f.m66715b(r16, AbstractC1136a.m3599a(AbstractC1102d.m3419p(i16 * 4, c2314t5), "right_spacer"));
                            r16.m87173q(r10);
                            r18 = r16;
                        }
                    } else {
                        c2314t5 = c2314t4;
                        if (bottomSheetTopBarViewState.getRightIcon() != null) {
                            r16.m87150e0(-1242820912);
                            abstractC27274q5 = abstractC27274q4;
                            C27270o c27270o4 = new C27270o(abstractC27274q5, bottomSheetTopBarViewState.getRightIcon().getIcon(), bottomSheetTopBarViewState.getRightIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                            String strM21274h7 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getRightIcon().getContentDescription(), r16, r10);
                            if ((i15 & 896) == 256) {
                                r17 = 1;
                            } else {
                                r17 = r10;
                            }
                            objM87133R2 = r16.m87133R();
                            if (r17 == 0) {
                                interfaceC4339a = onRightIconClicked;
                                objM87133R2 = new C31918g(interfaceC4339a, 10);
                                r16.m87172p0(objM87133R2);
                            } else {
                                interfaceC4339a = onRightIconClicked;
                                objM87133R2 = new C31918g(interfaceC4339a, 10);
                                r16.m87172p0(objM87133R2);
                            }
                            AbstractC27242b1.m82092d(c27270o4, strM21274h7, null, null, (InterfaceC4339a) objM87133R2, r16, 0, 12);
                            r16.m87173q(r10);
                            r18 = r16;
                        } else {
                            interfaceC4339a = onRightIconClicked;
                            abstractC27274q5 = abstractC27274q4;
                            r16.m87150e0(-1242408953);
                            AbstractC22953f.m66715b(r16, AbstractC1136a.m3599a(AbstractC1102d.m3419p(i16 * 4, c2314t5), "right_spacer"));
                            r16.m87173q(r10);
                            r18 = r16;
                        }
                    }
                    r18.m87173q(true);
                    AbstractC22953f.m66715b(r18, AbstractC1102d.m3419p(bottomSheetTopBarViewState.getBottomSpacing(), c2314t5));
                    r18.m87173q(r10);
                    r19 = r18;
                }
                abstractC27274q3 = abstractC27274q5;
                r14 = r19;
            } else {
                interfaceC4339a = onRightIconClicked;
                c28655q2.m87138X();
                abstractC27274q3 = abstractC27274q2;
                r14 = c28655q2;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(bottomSheetTopBarViewState, onLeftIconClicked, interfaceC4339a, abstractC27274q3, i13, i14, 13);
            }
        }
        i15 |= 3072;
        abstractC27274q2 = abstractC27274q;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                abstractC27274q4 = AbstractC27274q.c.f109140f;
            } else {
                abstractC27274q4 = abstractC27274q2;
            }
            if (bottomSheetTopBarViewState.getLeftIcon() != null) {
                c28655q2.m87150e0(924520226);
                c2314t = C2314t.f9131w;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(bottomSheetTopBarViewState.getTitleBarPadding(), AbstractC1102d.m3409f(1.0f, c2314t));
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                enumC35671i0M112957f = bottomSheetTopBarViewState.getTitleAlignment();
                enumC35671i0 = EnumC35671i0.LEFT;
                c28676v0 = C28635l.f115821a;
                c23000t1 = C23000t1.f90727a;
                if (enumC35671i0M112957f == enumC35671i0) {
                    c28676v1 = c28676v0;
                    c2314t2 = c2314t;
                    i16 = 6;
                    c23000t2 = c23000t1;
                    z13 = false;
                    if (bottomSheetTopBarViewState.getLeftIcon() != null) {
                        c28655q2.m87150e0(-1244733209);
                        C27270o c27270o5 = new C27270o(abstractC27274q4, bottomSheetTopBarViewState.getLeftIcon().getIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        String strM21274h8 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getLeftIcon().getContentDescription(), c28655q2, 0);
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C31918g(onLeftIconClicked, 11);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C31918g(onLeftIconClicked, 11);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC27242b1.m82092d(c27270o5, strM21274h8, null, null, (InterfaceC4339a) objM87133R, c28655q2, 0, 12);
                        c28655q2.m87173q(false);
                        z15 = z13;
                        c28655q = c28655q2;
                        c2314t3 = c2314t2;
                        r10 = z15;
                        r15 = c28655q;
                    } else {
                        c28655q2.m87150e0(-1244370912);
                        c2314t3 = c2314t2;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t3), "left_spacer"));
                        c28655q2.m87173q(false);
                        r10 = z13;
                        r15 = c28655q2;
                    }
                } else {
                    c28676v1 = c28676v0;
                    c2314t2 = c2314t;
                    i16 = 6;
                    c23000t2 = c23000t1;
                    z13 = false;
                    if (bottomSheetTopBarViewState.getLeftIcon() != null) {
                        c28655q2.m87150e0(-1244733209);
                        C27270o c27270o6 = new C27270o(abstractC27274q4, bottomSheetTopBarViewState.getLeftIcon().getIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        String strM21274h9 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getLeftIcon().getContentDescription(), c28655q2, 0);
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C31918g(onLeftIconClicked, 11);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C31918g(onLeftIconClicked, 11);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC27242b1.m82092d(c27270o6, strM21274h9, null, null, (InterfaceC4339a) objM87133R, c28655q2, 0, 12);
                        c28655q2.m87173q(false);
                        z15 = z13;
                        c28655q = c28655q2;
                        c2314t3 = c2314t2;
                        r10 = z15;
                        r15 = c28655q;
                    } else {
                        c28655q2.m87150e0(-1244370912);
                        c2314t3 = c2314t2;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t3), "left_spacer"));
                        c28655q2.m87173q(false);
                        r10 = z13;
                        r15 = c28655q2;
                    }
                }
                if (bottomSheetTopBarViewState.getTitleAlignment() == EnumC35671i0.CENTER) {
                    c2314t4 = c2314t3;
                    c23000t3 = c23000t2;
                    if (bottomSheetTopBarViewState.getTitleAlignment() != enumC35671i0) {
                        r15.m87150e0(-1243363629);
                        r15.m87173q(r10);
                        r16 = r15;
                    } else {
                        r15.m87150e0(-1243363629);
                        r15.m87173q(r10);
                        r16 = r15;
                    }
                } else {
                    c2314t4 = c2314t3;
                    c23000t3 = c23000t2;
                    if (bottomSheetTopBarViewState.getTitleAlignment() != enumC35671i0) {
                        r15.m87150e0(-1243363629);
                        r15.m87173q(r10);
                        r16 = r15;
                    } else {
                        r15.m87150e0(-1243363629);
                        r15.m87173q(r10);
                        r16 = r15;
                    }
                }
                if (bottomSheetTopBarViewState.getTitleAlignment() == EnumC35671i0.RIGHT) {
                    c2314t5 = c2314t4;
                    if (bottomSheetTopBarViewState.getRightIcon() != null) {
                        r16.m87150e0(-1242820912);
                        abstractC27274q5 = abstractC27274q4;
                        C27270o c27270o7 = new C27270o(abstractC27274q5, bottomSheetTopBarViewState.getRightIcon().getIcon(), bottomSheetTopBarViewState.getRightIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                        String strM21274h10 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getRightIcon().getContentDescription(), r16, r10);
                        if ((i15 & 896) == 256) {
                            r17 = 1;
                        } else {
                            r17 = r10;
                        }
                        objM87133R2 = r16.m87133R();
                        if (r17 == 0) {
                            interfaceC4339a = onRightIconClicked;
                            objM87133R2 = new C31918g(interfaceC4339a, 10);
                            r16.m87172p0(objM87133R2);
                        } else {
                            interfaceC4339a = onRightIconClicked;
                            objM87133R2 = new C31918g(interfaceC4339a, 10);
                            r16.m87172p0(objM87133R2);
                        }
                        AbstractC27242b1.m82092d(c27270o7, strM21274h10, null, null, (InterfaceC4339a) objM87133R2, r16, 0, 12);
                        r16.m87173q(r10);
                        r18 = r16;
                    } else {
                        interfaceC4339a = onRightIconClicked;
                        abstractC27274q5 = abstractC27274q4;
                        r16.m87150e0(-1242408953);
                        AbstractC22953f.m66715b(r16, AbstractC1136a.m3599a(AbstractC1102d.m3419p(i16 * 4, c2314t5), "right_spacer"));
                        r16.m87173q(r10);
                        r18 = r16;
                    }
                } else {
                    c2314t5 = c2314t4;
                    if (bottomSheetTopBarViewState.getRightIcon() != null) {
                        r16.m87150e0(-1242820912);
                        abstractC27274q5 = abstractC27274q4;
                        C27270o c27270o8 = new C27270o(abstractC27274q5, bottomSheetTopBarViewState.getRightIcon().getIcon(), bottomSheetTopBarViewState.getRightIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                        String strM21274h11 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getRightIcon().getContentDescription(), r16, r10);
                        if ((i15 & 896) == 256) {
                            r17 = 1;
                        } else {
                            r17 = r10;
                        }
                        objM87133R2 = r16.m87133R();
                        if (r17 == 0) {
                            interfaceC4339a = onRightIconClicked;
                            objM87133R2 = new C31918g(interfaceC4339a, 10);
                            r16.m87172p0(objM87133R2);
                        } else {
                            interfaceC4339a = onRightIconClicked;
                            objM87133R2 = new C31918g(interfaceC4339a, 10);
                            r16.m87172p0(objM87133R2);
                        }
                        AbstractC27242b1.m82092d(c27270o8, strM21274h11, null, null, (InterfaceC4339a) objM87133R2, r16, 0, 12);
                        r16.m87173q(r10);
                        r18 = r16;
                    } else {
                        interfaceC4339a = onRightIconClicked;
                        abstractC27274q5 = abstractC27274q4;
                        r16.m87150e0(-1242408953);
                        AbstractC22953f.m66715b(r16, AbstractC1136a.m3599a(AbstractC1102d.m3419p(i16 * 4, c2314t5), "right_spacer"));
                        r16.m87173q(r10);
                        r18 = r16;
                    }
                }
                r18.m87173q(true);
                AbstractC22953f.m66715b(r18, AbstractC1102d.m3419p(bottomSheetTopBarViewState.getBottomSpacing(), c2314t5));
                r18.m87173q(r10);
                r19 = r18;
            } else {
                c28655q2.m87150e0(924520226);
                c2314t = C2314t.f9131w;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(bottomSheetTopBarViewState.getTitleBarPadding(), AbstractC1102d.m3409f(1.0f, c2314t));
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3394p3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                enumC35671i0M112957f = bottomSheetTopBarViewState.getTitleAlignment();
                enumC35671i0 = EnumC35671i0.LEFT;
                c28676v0 = C28635l.f115821a;
                c23000t1 = C23000t1.f90727a;
                if (enumC35671i0M112957f == enumC35671i0) {
                    c28676v1 = c28676v0;
                    c2314t2 = c2314t;
                    i16 = 6;
                    c23000t2 = c23000t1;
                    z13 = false;
                    if (bottomSheetTopBarViewState.getLeftIcon() != null) {
                        c28655q2.m87150e0(-1244733209);
                        C27270o c27270o9 = new C27270o(abstractC27274q4, bottomSheetTopBarViewState.getLeftIcon().getIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        String strM21274h12 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getLeftIcon().getContentDescription(), c28655q2, 0);
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C31918g(onLeftIconClicked, 11);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C31918g(onLeftIconClicked, 11);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC27242b1.m82092d(c27270o9, strM21274h12, null, null, (InterfaceC4339a) objM87133R, c28655q2, 0, 12);
                        c28655q2.m87173q(false);
                        z15 = z13;
                        c28655q = c28655q2;
                        c2314t3 = c2314t2;
                        r10 = z15;
                        r15 = c28655q;
                    } else {
                        c28655q2.m87150e0(-1244370912);
                        c2314t3 = c2314t2;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t3), "left_spacer"));
                        c28655q2.m87173q(false);
                        r10 = z13;
                        r15 = c28655q2;
                    }
                } else {
                    c28676v1 = c28676v0;
                    c2314t2 = c2314t;
                    i16 = 6;
                    c23000t2 = c23000t1;
                    z13 = false;
                    if (bottomSheetTopBarViewState.getLeftIcon() != null) {
                        c28655q2.m87150e0(-1244733209);
                        C27270o c27270o10 = new C27270o(abstractC27274q4, bottomSheetTopBarViewState.getLeftIcon().getIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        String strM21274h13 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getLeftIcon().getContentDescription(), c28655q2, 0);
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C31918g(onLeftIconClicked, 11);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C31918g(onLeftIconClicked, 11);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC27242b1.m82092d(c27270o10, strM21274h13, null, null, (InterfaceC4339a) objM87133R, c28655q2, 0, 12);
                        c28655q2.m87173q(false);
                        z15 = z13;
                        c28655q = c28655q2;
                        c2314t3 = c2314t2;
                        r10 = z15;
                        r15 = c28655q;
                    } else {
                        c28655q2.m87150e0(-1244370912);
                        c2314t3 = c2314t2;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t3), "left_spacer"));
                        c28655q2.m87173q(false);
                        r10 = z13;
                        r15 = c28655q2;
                    }
                }
                if (bottomSheetTopBarViewState.getTitleAlignment() == EnumC35671i0.CENTER) {
                    c2314t4 = c2314t3;
                    c23000t3 = c23000t2;
                    if (bottomSheetTopBarViewState.getTitleAlignment() != enumC35671i0) {
                        r15.m87150e0(-1243363629);
                        r15.m87173q(r10);
                        r16 = r15;
                    } else {
                        r15.m87150e0(-1243363629);
                        r15.m87173q(r10);
                        r16 = r15;
                    }
                } else {
                    c2314t4 = c2314t3;
                    c23000t3 = c23000t2;
                    if (bottomSheetTopBarViewState.getTitleAlignment() != enumC35671i0) {
                        r15.m87150e0(-1243363629);
                        r15.m87173q(r10);
                        r16 = r15;
                    } else {
                        r15.m87150e0(-1243363629);
                        r15.m87173q(r10);
                        r16 = r15;
                    }
                }
                if (bottomSheetTopBarViewState.getTitleAlignment() == EnumC35671i0.RIGHT) {
                    c2314t5 = c2314t4;
                    if (bottomSheetTopBarViewState.getRightIcon() != null) {
                        r16.m87150e0(-1242820912);
                        abstractC27274q5 = abstractC27274q4;
                        C27270o c27270o11 = new C27270o(abstractC27274q5, bottomSheetTopBarViewState.getRightIcon().getIcon(), bottomSheetTopBarViewState.getRightIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                        String strM21274h14 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getRightIcon().getContentDescription(), r16, r10);
                        if ((i15 & 896) == 256) {
                            r17 = 1;
                        } else {
                            r17 = r10;
                        }
                        objM87133R2 = r16.m87133R();
                        if (r17 == 0) {
                            interfaceC4339a = onRightIconClicked;
                            objM87133R2 = new C31918g(interfaceC4339a, 10);
                            r16.m87172p0(objM87133R2);
                        } else {
                            interfaceC4339a = onRightIconClicked;
                            objM87133R2 = new C31918g(interfaceC4339a, 10);
                            r16.m87172p0(objM87133R2);
                        }
                        AbstractC27242b1.m82092d(c27270o11, strM21274h14, null, null, (InterfaceC4339a) objM87133R2, r16, 0, 12);
                        r16.m87173q(r10);
                        r18 = r16;
                    } else {
                        interfaceC4339a = onRightIconClicked;
                        abstractC27274q5 = abstractC27274q4;
                        r16.m87150e0(-1242408953);
                        AbstractC22953f.m66715b(r16, AbstractC1136a.m3599a(AbstractC1102d.m3419p(i16 * 4, c2314t5), "right_spacer"));
                        r16.m87173q(r10);
                        r18 = r16;
                    }
                } else {
                    c2314t5 = c2314t4;
                    if (bottomSheetTopBarViewState.getRightIcon() != null) {
                        r16.m87150e0(-1242820912);
                        abstractC27274q5 = abstractC27274q4;
                        C27270o c27270o12 = new C27270o(abstractC27274q5, bottomSheetTopBarViewState.getRightIcon().getIcon(), bottomSheetTopBarViewState.getRightIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                        String strM21274h15 = AbstractC8693b.m21274h(bottomSheetTopBarViewState.getRightIcon().getContentDescription(), r16, r10);
                        if ((i15 & 896) == 256) {
                            r17 = 1;
                        } else {
                            r17 = r10;
                        }
                        objM87133R2 = r16.m87133R();
                        if (r17 == 0) {
                            interfaceC4339a = onRightIconClicked;
                            objM87133R2 = new C31918g(interfaceC4339a, 10);
                            r16.m87172p0(objM87133R2);
                        } else {
                            interfaceC4339a = onRightIconClicked;
                            objM87133R2 = new C31918g(interfaceC4339a, 10);
                            r16.m87172p0(objM87133R2);
                        }
                        AbstractC27242b1.m82092d(c27270o12, strM21274h15, null, null, (InterfaceC4339a) objM87133R2, r16, 0, 12);
                        r16.m87173q(r10);
                        r18 = r16;
                    } else {
                        interfaceC4339a = onRightIconClicked;
                        abstractC27274q5 = abstractC27274q4;
                        r16.m87150e0(-1242408953);
                        AbstractC22953f.m66715b(r16, AbstractC1136a.m3599a(AbstractC1102d.m3419p(i16 * 4, c2314t5), "right_spacer"));
                        r16.m87173q(r10);
                        r18 = r16;
                    }
                }
                r18.m87173q(true);
                AbstractC22953f.m66715b(r18, AbstractC1102d.m3419p(bottomSheetTopBarViewState.getBottomSpacing(), c2314t5));
                r18.m87173q(r10);
                r19 = r18;
            }
            abstractC27274q3 = abstractC27274q5;
            r14 = r19;
        } else {
            interfaceC4339a = onRightIconClicked;
            c28655q2.m87138X();
            abstractC27274q3 = abstractC27274q2;
            r14 = c28655q2;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(bottomSheetTopBarViewState, onLeftIconClicked, interfaceC4339a, abstractC27274q3, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m112884z(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }
}
