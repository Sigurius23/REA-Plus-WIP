package com.whoop.bot.settings;

import a01.C0086f;
import a31.C0343e;
import a81.C0563n;
import am2.C1040r;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1909c;
import aw0.C2108h;
import b91.C2886a;
import bb2.C2931g;
import be1.C3169c;
import bf0.C3189a;
import bz0.C3713c;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import cj0.C4744f;
import cj2.C4769a;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dp0.C12253i;
import e93.AbstractC12889b;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import hg3.AbstractC17269i;
import hy0.AbstractC17746g1;
import j02.AbstractC21130a1;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C0003a0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p698au1.C2066k;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.AbstractC39330c;
import p745y81.C39336i;
import pz0.AbstractC29641d;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.AbstractC38073e;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001aW\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a}\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\r2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a-\u0010%\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b#\u0010$\u001a3\u0010*\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b(\u0010)\u001a%\u0010+\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b+\u0010,\u001a\u000f\u0010-\u001a\u00020\u0006H\u0001¢\u0006\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewState;", "viewState", "Leb/u0;", "navController", "Lkotlin/Function1;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "learnMoreClicked", "onExit", "CoachSettingsScreen", "(Lcom/whoop/bot/settings/CoachSettingsViewState;Leb/u0;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/bot/settings/CoachSettingsViewState$Success;", "CoachSettingsNavHost", "(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Leb/u0;Landroidx/compose/runtime/Composer;I)V", "onCoachingModeClicked", "onConcisenessModeClicked", "onRecommendedActivitiesClicked", "CoachSettingsContent", "(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "titleText", "statusText", "", "enabled", "onClick", "CoachSettingsRow", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/bot/settings/CoachSettingsDisplayState;", "displayState", "Header", "(Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "contentHorizontalPadding", "Footer-rAjV9yQ", "(Lcom/whoop/bot/settings/CoachSettingsDisplayState;FLc93/a;Landroidx/compose/runtime/Composer;I)V", "Footer", "Lcom/whoop/bot/settings/SettingItem;", "settingItem", "SettingItemEntry-rAjV9yQ", "(Lcom/whoop/bot/settings/SettingItem;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SettingItemEntry", "ErrorState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CoachSettingsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CoachSettingsScreenKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecommendedActivitiesMode.values().length];
            try {
                iArr[RecommendedActivitiesMode.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendedActivitiesMode.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0137  */
    /* JADX WARN: Code duplicated, block: B:102:0x0145  */
    /* JADX WARN: Code duplicated, block: B:104:0x0148  */
    /* JADX WARN: Code duplicated, block: B:106:0x014e  */
    /* JADX WARN: Code duplicated, block: B:108:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x015f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0165  */
    /* JADX WARN: Code duplicated, block: B:114:0x0173  */
    /* JADX WARN: Code duplicated, block: B:117:0x019c  */
    /* JADX WARN: Code duplicated, block: B:118:0x019f  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218  */
    /* JADX WARN: Code duplicated, block: B:148:0x0228  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x0118  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0131  */
    public static final void CoachSettingsContent(CoachSettingsViewState.Success viewState, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a6;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a7;
        int i19;
        int i24;
        InterfaceC4339a interfaceC4339a8;
        int i25;
        int i26;
        InterfaceC4339a interfaceC4339a9;
        int i27;
        int i28;
        InterfaceC4339a interfaceC4339a10;
        int i29;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        InterfaceC4339a interfaceC4339a11;
        InterfaceC4339a interfaceC4339a12;
        InterfaceC4339a interfaceC4339a13;
        InterfaceC4339a interfaceC4339a14;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        int i34;
        InterfaceC4339a interfaceC4339a15;
        InterfaceC4339a interfaceC4339a16;
        InterfaceC4339a interfaceC4339a17;
        boolean zIsFeatureEnabled;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a18;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-260913241);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i35 = i14 & 2;
        if (i35 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a6 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a6)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        interfaceC4339a7 = interfaceC4339a2;
                        if (c28655q2.m87157i(interfaceC4339a7)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            interfaceC4339a8 = interfaceC4339a3;
                            if (c28655q2.m87157i(interfaceC4339a8)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 32;
                        if (i26 != 0) {
                            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                            interfaceC4339a9 = interfaceC4339a4;
                        } else {
                            interfaceC4339a9 = interfaceC4339a4;
                            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                                if (c28655q2.m87157i(interfaceC4339a9)) {
                                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                                } else {
                                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                                }
                                i15 |= i27;
                            }
                        }
                        i28 = i14 & 64;
                        if (i28 != 0) {
                            i15 |= 1572864;
                            interfaceC4339a10 = interfaceC4339a5;
                        } else {
                            interfaceC4339a10 = interfaceC4339a5;
                            if ((i13 & 1572864) == 0) {
                                if (c28655q2.m87157i(interfaceC4339a10)) {
                                    i29 = 1048576;
                                } else {
                                    i29 = 524288;
                                }
                                i15 |= i29;
                            }
                        }
                        if ((i15 & 599187) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c28676v0 = C28635l.f115821a;
                            if (i35 != 0) {
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = new C4769a(23);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                function2 = (Function1) objM87133R7;
                            }
                            if (i16 != 0) {
                                objM87133R6 = c28655q2.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C4744f(19);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                                i34 = i18;
                            } else {
                                i34 = i18;
                                interfaceC4339a15 = interfaceC4339a6;
                            }
                            if (i34 != 0) {
                                objM87133R5 = c28655q2.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C4744f(20);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                            }
                            if (i24 != 0) {
                                objM87133R4 = c28655q2.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C4744f(21);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                            } else {
                                interfaceC4339a14 = interfaceC4339a8;
                            }
                            if (i26 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C4744f(22);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                            } else {
                                interfaceC4339a16 = interfaceC4339a9;
                            }
                            if (i28 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C4744f(23);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                            } else {
                                interfaceC4339a17 = interfaceC4339a10;
                            }
                            zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                            boolean zM87157i = c28655q2.m87157i(viewState);
                            if ((i15 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z19 = zM87157i | z13;
                            if ((i15 & 112) == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z24 = z19 | z14;
                            if ((57344 & i15) == 16384) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            boolean zM87155h = z24 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                            if ((3670016 & i15) == 1048576) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            boolean z25 = zM87155h | z16;
                            if ((458752 & i15) == 131072) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z25 | z17 | ((i15 & 896) == 256);
                            objM87133R = c28655q2.m87133R();
                            if (!z18 || objM87133R == c28676v0) {
                                interfaceC4339a18 = interfaceC4339a7;
                                C6075e c6075e = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                                c28655q2.m87172p0(c6075e);
                                objM87133R = c6075e;
                            } else {
                                interfaceC4339a18 = interfaceC4339a7;
                            }
                            c28655q = c28655q2;
                            AbstractC22674j.m65717c(modifierM66724m, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                            InterfaceC4339a interfaceC4339a19 = interfaceC4339a16;
                            interfaceC4339a13 = interfaceC4339a17;
                            interfaceC4339a9 = interfaceC4339a19;
                            function3 = function2;
                            interfaceC4339a12 = interfaceC4339a18;
                            interfaceC4339a11 = interfaceC4339a15;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            function3 = function2;
                            interfaceC4339a11 = interfaceC4339a6;
                            interfaceC4339a12 = interfaceC4339a7;
                            interfaceC4339a13 = interfaceC4339a10;
                            interfaceC4339a14 = interfaceC4339a8;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
                        }
                    }
                    i15 |= 24576;
                    interfaceC4339a8 = interfaceC4339a3;
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        interfaceC4339a9 = interfaceC4339a4;
                    } else {
                        interfaceC4339a9 = interfaceC4339a4;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a9)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        interfaceC4339a10 = interfaceC4339a5;
                    } else {
                        interfaceC4339a10 = interfaceC4339a5;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a10)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i35 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C4769a(23);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            function2 = (Function1) objM87133R7;
                        }
                        if (i16 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C4744f(19);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                            i34 = i18;
                        } else {
                            i34 = i18;
                            interfaceC4339a15 = interfaceC4339a6;
                        }
                        if (i34 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4744f(20);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4744f(21);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a14 = interfaceC4339a8;
                        }
                        if (i26 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4744f(22);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a16 = interfaceC4339a9;
                        }
                        if (i28 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4744f(23);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a17 = interfaceC4339a10;
                        }
                        zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                        Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                        boolean zM87157i2 = c28655q2.m87157i(viewState);
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z110 = zM87157i2 | z13;
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z26 = z110 | z14;
                        if ((57344 & i15) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean zM87155h2 = z26 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                        if ((3670016 & i15) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z27 = zM87155h2 | z16;
                        if ((458752 & i15) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z27 | z17 | ((i15 & 896) == 256);
                        objM87133R = c28655q2.m87133R();
                        if (z18) {
                            interfaceC4339a18 = interfaceC4339a7;
                            C6075e c6075e2 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                            c28655q2.m87172p0(c6075e2);
                            objM87133R = c6075e2;
                        } else {
                            interfaceC4339a18 = interfaceC4339a7;
                            C6075e c6075e3 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                            c28655q2.m87172p0(c6075e3);
                            objM87133R = c6075e3;
                        }
                        c28655q = c28655q2;
                        AbstractC22674j.m65717c(modifierM66724m2, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                        InterfaceC4339a interfaceC4339a110 = interfaceC4339a16;
                        interfaceC4339a13 = interfaceC4339a17;
                        interfaceC4339a9 = interfaceC4339a110;
                        function3 = function2;
                        interfaceC4339a12 = interfaceC4339a18;
                        interfaceC4339a11 = interfaceC4339a15;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        function3 = function2;
                        interfaceC4339a11 = interfaceC4339a6;
                        interfaceC4339a12 = interfaceC4339a7;
                        interfaceC4339a13 = interfaceC4339a10;
                        interfaceC4339a14 = interfaceC4339a8;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
                    }
                }
                i15 |= 3072;
                interfaceC4339a7 = interfaceC4339a2;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a8 = interfaceC4339a3;
                        if (c28655q2.m87157i(interfaceC4339a8)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        interfaceC4339a9 = interfaceC4339a4;
                    } else {
                        interfaceC4339a9 = interfaceC4339a4;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a9)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        interfaceC4339a10 = interfaceC4339a5;
                    } else {
                        interfaceC4339a10 = interfaceC4339a5;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a10)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i35 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C4769a(23);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            function2 = (Function1) objM87133R7;
                        }
                        if (i16 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C4744f(19);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                            i34 = i18;
                        } else {
                            i34 = i18;
                            interfaceC4339a15 = interfaceC4339a6;
                        }
                        if (i34 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4744f(20);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4744f(21);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a14 = interfaceC4339a8;
                        }
                        if (i26 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4744f(22);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a16 = interfaceC4339a9;
                        }
                        if (i28 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4744f(23);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a17 = interfaceC4339a10;
                        }
                        zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                        Modifier modifierM66724m3 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                        boolean zM87157i3 = c28655q2.m87157i(viewState);
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z111 = zM87157i3 | z13;
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z28 = z111 | z14;
                        if ((57344 & i15) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean zM87155h3 = z28 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                        if ((3670016 & i15) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z29 = zM87155h3 | z16;
                        if ((458752 & i15) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z29 | z17 | ((i15 & 896) == 256);
                        objM87133R = c28655q2.m87133R();
                        if (z18) {
                            interfaceC4339a18 = interfaceC4339a7;
                            C6075e c6075e4 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                            c28655q2.m87172p0(c6075e4);
                            objM87133R = c6075e4;
                        } else {
                            interfaceC4339a18 = interfaceC4339a7;
                            C6075e c6075e5 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                            c28655q2.m87172p0(c6075e5);
                            objM87133R = c6075e5;
                        }
                        c28655q = c28655q2;
                        AbstractC22674j.m65717c(modifierM66724m3, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                        InterfaceC4339a interfaceC4339a111 = interfaceC4339a16;
                        interfaceC4339a13 = interfaceC4339a17;
                        interfaceC4339a9 = interfaceC4339a111;
                        function3 = function2;
                        interfaceC4339a12 = interfaceC4339a18;
                        interfaceC4339a11 = interfaceC4339a15;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        function3 = function2;
                        interfaceC4339a11 = interfaceC4339a6;
                        interfaceC4339a12 = interfaceC4339a7;
                        interfaceC4339a13 = interfaceC4339a10;
                        interfaceC4339a14 = interfaceC4339a8;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
                    }
                }
                i15 |= 24576;
                interfaceC4339a8 = interfaceC4339a3;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a9 = interfaceC4339a4;
                } else {
                    interfaceC4339a9 = interfaceC4339a4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a9)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a10 = interfaceC4339a5;
                } else {
                    interfaceC4339a10 = interfaceC4339a5;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C4769a(23);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function2 = (Function1) objM87133R7;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4744f(19);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                        i34 = i18;
                    } else {
                        i34 = i18;
                        interfaceC4339a15 = interfaceC4339a6;
                    }
                    if (i34 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4744f(20);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4744f(21);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a14 = interfaceC4339a8;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4744f(22);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a16 = interfaceC4339a9;
                    }
                    if (i28 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(23);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a17 = interfaceC4339a10;
                    }
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                    Modifier modifierM66724m4 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                    boolean zM87157i4 = c28655q2.m87157i(viewState);
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z112 = zM87157i4 | z13;
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z210 = z112 | z14;
                    if ((57344 & i15) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zM87155h4 = z210 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                    if ((3670016 & i15) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z211 = zM87155h4 | z16;
                    if ((458752 & i15) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z211 | z17 | ((i15 & 896) == 256);
                    objM87133R = c28655q2.m87133R();
                    if (z18) {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e6 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e6);
                        objM87133R = c6075e6;
                    } else {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e7 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e7);
                        objM87133R = c6075e7;
                    }
                    c28655q = c28655q2;
                    AbstractC22674j.m65717c(modifierM66724m4, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                    InterfaceC4339a interfaceC4339a112 = interfaceC4339a16;
                    interfaceC4339a13 = interfaceC4339a17;
                    interfaceC4339a9 = interfaceC4339a112;
                    function3 = function2;
                    interfaceC4339a12 = interfaceC4339a18;
                    interfaceC4339a11 = interfaceC4339a15;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a11 = interfaceC4339a6;
                    interfaceC4339a12 = interfaceC4339a7;
                    interfaceC4339a13 = interfaceC4339a10;
                    interfaceC4339a14 = interfaceC4339a8;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
                }
            }
            i15 |= 384;
            interfaceC4339a6 = interfaceC4339a;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a7 = interfaceC4339a2;
                    if (c28655q2.m87157i(interfaceC4339a7)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a8 = interfaceC4339a3;
                        if (c28655q2.m87157i(interfaceC4339a8)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        interfaceC4339a9 = interfaceC4339a4;
                    } else {
                        interfaceC4339a9 = interfaceC4339a4;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a9)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        interfaceC4339a10 = interfaceC4339a5;
                    } else {
                        interfaceC4339a10 = interfaceC4339a5;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a10)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i35 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C4769a(23);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            function2 = (Function1) objM87133R7;
                        }
                        if (i16 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C4744f(19);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                            i34 = i18;
                        } else {
                            i34 = i18;
                            interfaceC4339a15 = interfaceC4339a6;
                        }
                        if (i34 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4744f(20);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4744f(21);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a14 = interfaceC4339a8;
                        }
                        if (i26 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4744f(22);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a16 = interfaceC4339a9;
                        }
                        if (i28 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4744f(23);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a17 = interfaceC4339a10;
                        }
                        zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                        Modifier modifierM66724m5 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                        boolean zM87157i5 = c28655q2.m87157i(viewState);
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z113 = zM87157i5 | z13;
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z212 = z113 | z14;
                        if ((57344 & i15) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean zM87155h5 = z212 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                        if ((3670016 & i15) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z213 = zM87155h5 | z16;
                        if ((458752 & i15) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z213 | z17 | ((i15 & 896) == 256);
                        objM87133R = c28655q2.m87133R();
                        if (z18) {
                            interfaceC4339a18 = interfaceC4339a7;
                            C6075e c6075e8 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                            c28655q2.m87172p0(c6075e8);
                            objM87133R = c6075e8;
                        } else {
                            interfaceC4339a18 = interfaceC4339a7;
                            C6075e c6075e9 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                            c28655q2.m87172p0(c6075e9);
                            objM87133R = c6075e9;
                        }
                        c28655q = c28655q2;
                        AbstractC22674j.m65717c(modifierM66724m5, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                        InterfaceC4339a interfaceC4339a113 = interfaceC4339a16;
                        interfaceC4339a13 = interfaceC4339a17;
                        interfaceC4339a9 = interfaceC4339a113;
                        function3 = function2;
                        interfaceC4339a12 = interfaceC4339a18;
                        interfaceC4339a11 = interfaceC4339a15;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        function3 = function2;
                        interfaceC4339a11 = interfaceC4339a6;
                        interfaceC4339a12 = interfaceC4339a7;
                        interfaceC4339a13 = interfaceC4339a10;
                        interfaceC4339a14 = interfaceC4339a8;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
                    }
                }
                i15 |= 24576;
                interfaceC4339a8 = interfaceC4339a3;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a9 = interfaceC4339a4;
                } else {
                    interfaceC4339a9 = interfaceC4339a4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a9)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a10 = interfaceC4339a5;
                } else {
                    interfaceC4339a10 = interfaceC4339a5;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C4769a(23);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function2 = (Function1) objM87133R7;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4744f(19);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                        i34 = i18;
                    } else {
                        i34 = i18;
                        interfaceC4339a15 = interfaceC4339a6;
                    }
                    if (i34 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4744f(20);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4744f(21);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a14 = interfaceC4339a8;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4744f(22);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a16 = interfaceC4339a9;
                    }
                    if (i28 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(23);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a17 = interfaceC4339a10;
                    }
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                    Modifier modifierM66724m6 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                    boolean zM87157i6 = c28655q2.m87157i(viewState);
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z114 = zM87157i6 | z13;
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z214 = z114 | z14;
                    if ((57344 & i15) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zM87155h6 = z214 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                    if ((3670016 & i15) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z215 = zM87155h6 | z16;
                    if ((458752 & i15) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z215 | z17 | ((i15 & 896) == 256);
                    objM87133R = c28655q2.m87133R();
                    if (z18) {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e10 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e10);
                        objM87133R = c6075e10;
                    } else {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e11 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e11);
                        objM87133R = c6075e11;
                    }
                    c28655q = c28655q2;
                    AbstractC22674j.m65717c(modifierM66724m6, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                    InterfaceC4339a interfaceC4339a114 = interfaceC4339a16;
                    interfaceC4339a13 = interfaceC4339a17;
                    interfaceC4339a9 = interfaceC4339a114;
                    function3 = function2;
                    interfaceC4339a12 = interfaceC4339a18;
                    interfaceC4339a11 = interfaceC4339a15;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a11 = interfaceC4339a6;
                    interfaceC4339a12 = interfaceC4339a7;
                    interfaceC4339a13 = interfaceC4339a10;
                    interfaceC4339a14 = interfaceC4339a8;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
                }
            }
            i15 |= 3072;
            interfaceC4339a7 = interfaceC4339a2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a8 = interfaceC4339a3;
                    if (c28655q2.m87157i(interfaceC4339a8)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a9 = interfaceC4339a4;
                } else {
                    interfaceC4339a9 = interfaceC4339a4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a9)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a10 = interfaceC4339a5;
                } else {
                    interfaceC4339a10 = interfaceC4339a5;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C4769a(23);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function2 = (Function1) objM87133R7;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4744f(19);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                        i34 = i18;
                    } else {
                        i34 = i18;
                        interfaceC4339a15 = interfaceC4339a6;
                    }
                    if (i34 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4744f(20);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4744f(21);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a14 = interfaceC4339a8;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4744f(22);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a16 = interfaceC4339a9;
                    }
                    if (i28 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(23);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a17 = interfaceC4339a10;
                    }
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                    Modifier modifierM66724m7 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                    boolean zM87157i7 = c28655q2.m87157i(viewState);
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z115 = zM87157i7 | z13;
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z216 = z115 | z14;
                    if ((57344 & i15) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zM87155h7 = z216 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                    if ((3670016 & i15) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z217 = zM87155h7 | z16;
                    if ((458752 & i15) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z217 | z17 | ((i15 & 896) == 256);
                    objM87133R = c28655q2.m87133R();
                    if (z18) {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e12 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e12);
                        objM87133R = c6075e12;
                    } else {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e13 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e13);
                        objM87133R = c6075e13;
                    }
                    c28655q = c28655q2;
                    AbstractC22674j.m65717c(modifierM66724m7, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                    InterfaceC4339a interfaceC4339a115 = interfaceC4339a16;
                    interfaceC4339a13 = interfaceC4339a17;
                    interfaceC4339a9 = interfaceC4339a115;
                    function3 = function2;
                    interfaceC4339a12 = interfaceC4339a18;
                    interfaceC4339a11 = interfaceC4339a15;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a11 = interfaceC4339a6;
                    interfaceC4339a12 = interfaceC4339a7;
                    interfaceC4339a13 = interfaceC4339a10;
                    interfaceC4339a14 = interfaceC4339a8;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4339a8 = interfaceC4339a3;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a9 = interfaceC4339a4;
            } else {
                interfaceC4339a9 = interfaceC4339a4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a9)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                interfaceC4339a10 = interfaceC4339a5;
            } else {
                interfaceC4339a10 = interfaceC4339a5;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i35 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C4769a(23);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function2 = (Function1) objM87133R7;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C4744f(19);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                    i34 = i18;
                } else {
                    i34 = i18;
                    interfaceC4339a15 = interfaceC4339a6;
                }
                if (i34 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4744f(20);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4744f(21);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a14 = interfaceC4339a8;
                }
                if (i26 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4744f(22);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a16 = interfaceC4339a9;
                }
                if (i28 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4744f(23);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a17 = interfaceC4339a10;
                }
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                Modifier modifierM66724m8 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                boolean zM87157i8 = c28655q2.m87157i(viewState);
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z116 = zM87157i8 | z13;
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z218 = z116 | z14;
                if ((57344 & i15) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM87155h8 = z218 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                if ((3670016 & i15) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z219 = zM87155h8 | z16;
                if ((458752 & i15) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z219 | z17 | ((i15 & 896) == 256);
                objM87133R = c28655q2.m87133R();
                if (z18) {
                    interfaceC4339a18 = interfaceC4339a7;
                    C6075e c6075e14 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                    c28655q2.m87172p0(c6075e14);
                    objM87133R = c6075e14;
                } else {
                    interfaceC4339a18 = interfaceC4339a7;
                    C6075e c6075e15 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                    c28655q2.m87172p0(c6075e15);
                    objM87133R = c6075e15;
                }
                c28655q = c28655q2;
                AbstractC22674j.m65717c(modifierM66724m8, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                InterfaceC4339a interfaceC4339a116 = interfaceC4339a16;
                interfaceC4339a13 = interfaceC4339a17;
                interfaceC4339a9 = interfaceC4339a116;
                function3 = function2;
                interfaceC4339a12 = interfaceC4339a18;
                interfaceC4339a11 = interfaceC4339a15;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a11 = interfaceC4339a6;
                interfaceC4339a12 = interfaceC4339a7;
                interfaceC4339a13 = interfaceC4339a10;
                interfaceC4339a14 = interfaceC4339a8;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a6 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a6)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a7 = interfaceC4339a2;
                    if (c28655q2.m87157i(interfaceC4339a7)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a8 = interfaceC4339a3;
                        if (c28655q2.m87157i(interfaceC4339a8)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        interfaceC4339a9 = interfaceC4339a4;
                    } else {
                        interfaceC4339a9 = interfaceC4339a4;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a9)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        interfaceC4339a10 = interfaceC4339a5;
                    } else {
                        interfaceC4339a10 = interfaceC4339a5;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a10)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i35 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C4769a(23);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            function2 = (Function1) objM87133R7;
                        }
                        if (i16 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C4744f(19);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                            i34 = i18;
                        } else {
                            i34 = i18;
                            interfaceC4339a15 = interfaceC4339a6;
                        }
                        if (i34 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4744f(20);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                        }
                        if (i24 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4744f(21);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a14 = interfaceC4339a8;
                        }
                        if (i26 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4744f(22);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a16 = interfaceC4339a9;
                        }
                        if (i28 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4744f(23);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a17 = interfaceC4339a10;
                        }
                        zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                        Modifier modifierM66724m9 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                        boolean zM87157i9 = c28655q2.m87157i(viewState);
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z117 = zM87157i9 | z13;
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z2110 = z117 | z14;
                        if ((57344 & i15) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean zM87155h9 = z2110 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                        if ((3670016 & i15) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z2111 = zM87155h9 | z16;
                        if ((458752 & i15) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z2111 | z17 | ((i15 & 896) == 256);
                        objM87133R = c28655q2.m87133R();
                        if (z18) {
                            interfaceC4339a18 = interfaceC4339a7;
                            C6075e c6075e16 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                            c28655q2.m87172p0(c6075e16);
                            objM87133R = c6075e16;
                        } else {
                            interfaceC4339a18 = interfaceC4339a7;
                            C6075e c6075e17 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                            c28655q2.m87172p0(c6075e17);
                            objM87133R = c6075e17;
                        }
                        c28655q = c28655q2;
                        AbstractC22674j.m65717c(modifierM66724m9, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                        InterfaceC4339a interfaceC4339a117 = interfaceC4339a16;
                        interfaceC4339a13 = interfaceC4339a17;
                        interfaceC4339a9 = interfaceC4339a117;
                        function3 = function2;
                        interfaceC4339a12 = interfaceC4339a18;
                        interfaceC4339a11 = interfaceC4339a15;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        function3 = function2;
                        interfaceC4339a11 = interfaceC4339a6;
                        interfaceC4339a12 = interfaceC4339a7;
                        interfaceC4339a13 = interfaceC4339a10;
                        interfaceC4339a14 = interfaceC4339a8;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
                    }
                }
                i15 |= 24576;
                interfaceC4339a8 = interfaceC4339a3;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a9 = interfaceC4339a4;
                } else {
                    interfaceC4339a9 = interfaceC4339a4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a9)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a10 = interfaceC4339a5;
                } else {
                    interfaceC4339a10 = interfaceC4339a5;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C4769a(23);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function2 = (Function1) objM87133R7;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4744f(19);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                        i34 = i18;
                    } else {
                        i34 = i18;
                        interfaceC4339a15 = interfaceC4339a6;
                    }
                    if (i34 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4744f(20);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4744f(21);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a14 = interfaceC4339a8;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4744f(22);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a16 = interfaceC4339a9;
                    }
                    if (i28 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(23);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a17 = interfaceC4339a10;
                    }
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                    Modifier modifierM66724m10 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                    boolean zM87157i10 = c28655q2.m87157i(viewState);
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z118 = zM87157i10 | z13;
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z2112 = z118 | z14;
                    if ((57344 & i15) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zM87155h10 = z2112 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                    if ((3670016 & i15) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z2113 = zM87155h10 | z16;
                    if ((458752 & i15) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z2113 | z17 | ((i15 & 896) == 256);
                    objM87133R = c28655q2.m87133R();
                    if (z18) {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e18 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e18);
                        objM87133R = c6075e18;
                    } else {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e19 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e19);
                        objM87133R = c6075e19;
                    }
                    c28655q = c28655q2;
                    AbstractC22674j.m65717c(modifierM66724m10, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                    InterfaceC4339a interfaceC4339a118 = interfaceC4339a16;
                    interfaceC4339a13 = interfaceC4339a17;
                    interfaceC4339a9 = interfaceC4339a118;
                    function3 = function2;
                    interfaceC4339a12 = interfaceC4339a18;
                    interfaceC4339a11 = interfaceC4339a15;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a11 = interfaceC4339a6;
                    interfaceC4339a12 = interfaceC4339a7;
                    interfaceC4339a13 = interfaceC4339a10;
                    interfaceC4339a14 = interfaceC4339a8;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
                }
            }
            i15 |= 3072;
            interfaceC4339a7 = interfaceC4339a2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a8 = interfaceC4339a3;
                    if (c28655q2.m87157i(interfaceC4339a8)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a9 = interfaceC4339a4;
                } else {
                    interfaceC4339a9 = interfaceC4339a4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a9)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a10 = interfaceC4339a5;
                } else {
                    interfaceC4339a10 = interfaceC4339a5;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C4769a(23);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function2 = (Function1) objM87133R7;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4744f(19);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                        i34 = i18;
                    } else {
                        i34 = i18;
                        interfaceC4339a15 = interfaceC4339a6;
                    }
                    if (i34 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4744f(20);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4744f(21);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a14 = interfaceC4339a8;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4744f(22);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a16 = interfaceC4339a9;
                    }
                    if (i28 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(23);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a17 = interfaceC4339a10;
                    }
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                    Modifier modifierM66724m11 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                    boolean zM87157i11 = c28655q2.m87157i(viewState);
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z119 = zM87157i11 | z13;
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z2114 = z119 | z14;
                    if ((57344 & i15) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zM87155h11 = z2114 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                    if ((3670016 & i15) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z2115 = zM87155h11 | z16;
                    if ((458752 & i15) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z2115 | z17 | ((i15 & 896) == 256);
                    objM87133R = c28655q2.m87133R();
                    if (z18) {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e110 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e110);
                        objM87133R = c6075e110;
                    } else {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e111 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e111);
                        objM87133R = c6075e111;
                    }
                    c28655q = c28655q2;
                    AbstractC22674j.m65717c(modifierM66724m11, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                    InterfaceC4339a interfaceC4339a119 = interfaceC4339a16;
                    interfaceC4339a13 = interfaceC4339a17;
                    interfaceC4339a9 = interfaceC4339a119;
                    function3 = function2;
                    interfaceC4339a12 = interfaceC4339a18;
                    interfaceC4339a11 = interfaceC4339a15;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a11 = interfaceC4339a6;
                    interfaceC4339a12 = interfaceC4339a7;
                    interfaceC4339a13 = interfaceC4339a10;
                    interfaceC4339a14 = interfaceC4339a8;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4339a8 = interfaceC4339a3;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a9 = interfaceC4339a4;
            } else {
                interfaceC4339a9 = interfaceC4339a4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a9)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                interfaceC4339a10 = interfaceC4339a5;
            } else {
                interfaceC4339a10 = interfaceC4339a5;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i35 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C4769a(23);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function2 = (Function1) objM87133R7;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C4744f(19);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                    i34 = i18;
                } else {
                    i34 = i18;
                    interfaceC4339a15 = interfaceC4339a6;
                }
                if (i34 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4744f(20);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4744f(21);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a14 = interfaceC4339a8;
                }
                if (i26 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4744f(22);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a16 = interfaceC4339a9;
                }
                if (i28 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4744f(23);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a17 = interfaceC4339a10;
                }
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                Modifier modifierM66724m12 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                boolean zM87157i12 = c28655q2.m87157i(viewState);
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z1110 = zM87157i12 | z13;
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z2116 = z1110 | z14;
                if ((57344 & i15) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM87155h12 = z2116 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                if ((3670016 & i15) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z2117 = zM87155h12 | z16;
                if ((458752 & i15) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z2117 | z17 | ((i15 & 896) == 256);
                objM87133R = c28655q2.m87133R();
                if (z18) {
                    interfaceC4339a18 = interfaceC4339a7;
                    C6075e c6075e112 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                    c28655q2.m87172p0(c6075e112);
                    objM87133R = c6075e112;
                } else {
                    interfaceC4339a18 = interfaceC4339a7;
                    C6075e c6075e113 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                    c28655q2.m87172p0(c6075e113);
                    objM87133R = c6075e113;
                }
                c28655q = c28655q2;
                AbstractC22674j.m65717c(modifierM66724m12, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                InterfaceC4339a interfaceC4339a1110 = interfaceC4339a16;
                interfaceC4339a13 = interfaceC4339a17;
                interfaceC4339a9 = interfaceC4339a1110;
                function3 = function2;
                interfaceC4339a12 = interfaceC4339a18;
                interfaceC4339a11 = interfaceC4339a15;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a11 = interfaceC4339a6;
                interfaceC4339a12 = interfaceC4339a7;
                interfaceC4339a13 = interfaceC4339a10;
                interfaceC4339a14 = interfaceC4339a8;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
            }
        }
        i15 |= 384;
        interfaceC4339a6 = interfaceC4339a;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a7 = interfaceC4339a2;
                if (c28655q2.m87157i(interfaceC4339a7)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a8 = interfaceC4339a3;
                    if (c28655q2.m87157i(interfaceC4339a8)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a9 = interfaceC4339a4;
                } else {
                    interfaceC4339a9 = interfaceC4339a4;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a9)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    interfaceC4339a10 = interfaceC4339a5;
                } else {
                    interfaceC4339a10 = interfaceC4339a5;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a10)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C4769a(23);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function2 = (Function1) objM87133R7;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4744f(19);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                        i34 = i18;
                    } else {
                        i34 = i18;
                        interfaceC4339a15 = interfaceC4339a6;
                    }
                    if (i34 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4744f(20);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                    }
                    if (i24 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4744f(21);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a14 = interfaceC4339a8;
                    }
                    if (i26 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4744f(22);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a16 = interfaceC4339a9;
                    }
                    if (i28 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(23);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a17 = interfaceC4339a10;
                    }
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                    Modifier modifierM66724m13 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                    boolean zM87157i13 = c28655q2.m87157i(viewState);
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z1111 = zM87157i13 | z13;
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z2118 = z1111 | z14;
                    if ((57344 & i15) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zM87155h13 = z2118 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                    if ((3670016 & i15) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z2119 = zM87155h13 | z16;
                    if ((458752 & i15) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z2119 | z17 | ((i15 & 896) == 256);
                    objM87133R = c28655q2.m87133R();
                    if (z18) {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e114 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e114);
                        objM87133R = c6075e114;
                    } else {
                        interfaceC4339a18 = interfaceC4339a7;
                        C6075e c6075e115 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                        c28655q2.m87172p0(c6075e115);
                        objM87133R = c6075e115;
                    }
                    c28655q = c28655q2;
                    AbstractC22674j.m65717c(modifierM66724m13, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                    InterfaceC4339a interfaceC4339a1111 = interfaceC4339a16;
                    interfaceC4339a13 = interfaceC4339a17;
                    interfaceC4339a9 = interfaceC4339a1111;
                    function3 = function2;
                    interfaceC4339a12 = interfaceC4339a18;
                    interfaceC4339a11 = interfaceC4339a15;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a11 = interfaceC4339a6;
                    interfaceC4339a12 = interfaceC4339a7;
                    interfaceC4339a13 = interfaceC4339a10;
                    interfaceC4339a14 = interfaceC4339a8;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4339a8 = interfaceC4339a3;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a9 = interfaceC4339a4;
            } else {
                interfaceC4339a9 = interfaceC4339a4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a9)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                interfaceC4339a10 = interfaceC4339a5;
            } else {
                interfaceC4339a10 = interfaceC4339a5;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i35 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C4769a(23);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function2 = (Function1) objM87133R7;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C4744f(19);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                    i34 = i18;
                } else {
                    i34 = i18;
                    interfaceC4339a15 = interfaceC4339a6;
                }
                if (i34 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4744f(20);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4744f(21);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a14 = interfaceC4339a8;
                }
                if (i26 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4744f(22);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a16 = interfaceC4339a9;
                }
                if (i28 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4744f(23);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a17 = interfaceC4339a10;
                }
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                Modifier modifierM66724m14 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                boolean zM87157i14 = c28655q2.m87157i(viewState);
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z1112 = zM87157i14 | z13;
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21110 = z1112 | z14;
                if ((57344 & i15) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM87155h14 = z21110 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                if ((3670016 & i15) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z21111 = zM87155h14 | z16;
                if ((458752 & i15) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z21111 | z17 | ((i15 & 896) == 256);
                objM87133R = c28655q2.m87133R();
                if (z18) {
                    interfaceC4339a18 = interfaceC4339a7;
                    C6075e c6075e116 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                    c28655q2.m87172p0(c6075e116);
                    objM87133R = c6075e116;
                } else {
                    interfaceC4339a18 = interfaceC4339a7;
                    C6075e c6075e117 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                    c28655q2.m87172p0(c6075e117);
                    objM87133R = c6075e117;
                }
                c28655q = c28655q2;
                AbstractC22674j.m65717c(modifierM66724m14, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                InterfaceC4339a interfaceC4339a1112 = interfaceC4339a16;
                interfaceC4339a13 = interfaceC4339a17;
                interfaceC4339a9 = interfaceC4339a1112;
                function3 = function2;
                interfaceC4339a12 = interfaceC4339a18;
                interfaceC4339a11 = interfaceC4339a15;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a11 = interfaceC4339a6;
                interfaceC4339a12 = interfaceC4339a7;
                interfaceC4339a13 = interfaceC4339a10;
                interfaceC4339a14 = interfaceC4339a8;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
            }
        }
        i15 |= 3072;
        interfaceC4339a7 = interfaceC4339a2;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a8 = interfaceC4339a3;
                if (c28655q2.m87157i(interfaceC4339a8)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a9 = interfaceC4339a4;
            } else {
                interfaceC4339a9 = interfaceC4339a4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a9)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                interfaceC4339a10 = interfaceC4339a5;
            } else {
                interfaceC4339a10 = interfaceC4339a5;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a10)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i35 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C4769a(23);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function2 = (Function1) objM87133R7;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C4744f(19);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                    i34 = i18;
                } else {
                    i34 = i18;
                    interfaceC4339a15 = interfaceC4339a6;
                }
                if (i34 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4744f(20);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                }
                if (i24 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4744f(21);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a14 = interfaceC4339a8;
                }
                if (i26 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4744f(22);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a16 = interfaceC4339a9;
                }
                if (i28 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4744f(23);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a17 = interfaceC4339a10;
                }
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
                Modifier modifierM66724m15 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
                boolean zM87157i15 = c28655q2.m87157i(viewState);
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z1113 = zM87157i15 | z13;
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21112 = z1113 | z14;
                if ((57344 & i15) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM87155h15 = z21112 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
                if ((3670016 & i15) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z21113 = zM87155h15 | z16;
                if ((458752 & i15) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z21113 | z17 | ((i15 & 896) == 256);
                objM87133R = c28655q2.m87133R();
                if (z18) {
                    interfaceC4339a18 = interfaceC4339a7;
                    C6075e c6075e118 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                    c28655q2.m87172p0(c6075e118);
                    objM87133R = c6075e118;
                } else {
                    interfaceC4339a18 = interfaceC4339a7;
                    C6075e c6075e119 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                    c28655q2.m87172p0(c6075e119);
                    objM87133R = c6075e119;
                }
                c28655q = c28655q2;
                AbstractC22674j.m65717c(modifierM66724m15, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
                InterfaceC4339a interfaceC4339a1113 = interfaceC4339a16;
                interfaceC4339a13 = interfaceC4339a17;
                interfaceC4339a9 = interfaceC4339a1113;
                function3 = function2;
                interfaceC4339a12 = interfaceC4339a18;
                interfaceC4339a11 = interfaceC4339a15;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a11 = interfaceC4339a6;
                interfaceC4339a12 = interfaceC4339a7;
                interfaceC4339a13 = interfaceC4339a10;
                interfaceC4339a14 = interfaceC4339a8;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4339a8 = interfaceC4339a3;
        i26 = i14 & 32;
        if (i26 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a9 = interfaceC4339a4;
        } else {
            interfaceC4339a9 = interfaceC4339a4;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(interfaceC4339a9)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
        }
        i28 = i14 & 64;
        if (i28 != 0) {
            i15 |= 1572864;
            interfaceC4339a10 = interfaceC4339a5;
        } else {
            interfaceC4339a10 = interfaceC4339a5;
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(interfaceC4339a10)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
        }
        if ((i15 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i35 != 0) {
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C4769a(23);
                    c28655q2.m87172p0(objM87133R7);
                }
                function2 = (Function1) objM87133R7;
            }
            if (i16 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C4744f(19);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                i34 = i18;
            } else {
                i34 = i18;
                interfaceC4339a15 = interfaceC4339a6;
            }
            if (i34 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C4744f(20);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
            }
            if (i24 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C4744f(21);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC4339a14 = (InterfaceC4339a) objM87133R4;
            } else {
                interfaceC4339a14 = interfaceC4339a8;
            }
            if (i26 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C4744f(22);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a16 = interfaceC4339a9;
            }
            if (i28 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C4744f(23);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a17 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a17 = interfaceC4339a10;
            }
            zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AUTO_ACTIVITY_RECS);
            Modifier modifierM66724m16 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(C2314t.f9131w)));
            boolean zM87157i16 = c28655q2.m87157i(viewState);
            if ((i15 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z1114 = zM87157i16 | z13;
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z21114 = z1114 | z14;
            if ((57344 & i15) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zM87155h16 = z21114 | z15 | c28655q2.m87155h(zIsFeatureEnabled);
            if ((3670016 & i15) == 1048576) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z21115 = zM87155h16 | z16;
            if ((458752 & i15) == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z21115 | z17 | ((i15 & 896) == 256);
            objM87133R = c28655q2.m87133R();
            if (z18) {
                interfaceC4339a18 = interfaceC4339a7;
                C6075e c6075e1110 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                c28655q2.m87172p0(c6075e1110);
                objM87133R = c6075e1110;
            } else {
                interfaceC4339a18 = interfaceC4339a7;
                C6075e c6075e1111 = new C6075e(viewState, zIsFeatureEnabled, interfaceC4339a18, function2, interfaceC4339a14, interfaceC4339a17, interfaceC4339a16, interfaceC4339a15);
                c28655q2.m87172p0(c6075e1111);
                objM87133R = c6075e1111;
            }
            c28655q = c28655q2;
            AbstractC22674j.m65717c(modifierM66724m16, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
            InterfaceC4339a interfaceC4339a1114 = interfaceC4339a16;
            interfaceC4339a13 = interfaceC4339a17;
            interfaceC4339a9 = interfaceC4339a1114;
            function3 = function2;
            interfaceC4339a12 = interfaceC4339a18;
            interfaceC4339a11 = interfaceC4339a15;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
            interfaceC4339a11 = interfaceC4339a6;
            interfaceC4339a12 = interfaceC4339a7;
            interfaceC4339a13 = interfaceC4339a10;
            interfaceC4339a14 = interfaceC4339a8;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g(viewState, function3, interfaceC4339a11, interfaceC4339a12, interfaceC4339a14, interfaceC4339a9, interfaceC4339a13, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsContent$lambda$0$0(CoachSettingsViewEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsContent$lambda$6$0(final CoachSettingsViewState.Success success, boolean z4, final InterfaceC4339a interfaceC4339a, final Function1 function1, final InterfaceC4339a interfaceC4339a2, final InterfaceC4339a interfaceC4339a3, final InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        final int i13 = 0;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: com.whoop.bot.settings.f
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i14 = i13;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i14) {
                    case 0:
                        return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$0(success, interfaceC4339a, interfaceC1103a, composer, iIntValue);
                    case 1:
                        return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$2$0(success, interfaceC4339a, interfaceC1103a, composer, iIntValue);
                    case 2:
                        return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$3(success, interfaceC4339a, interfaceC1103a, composer, iIntValue);
                    default:
                        return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$4$0(success, interfaceC4339a, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, 264946098), 3);
        final float f13 = 2 * 8;
        final List<SettingItem> settingItems = success.getDisplayState().getSettingItems();
        final C6064x7752bd16 c6064x7752bd16 = new Function1() { // from class: com.whoop.bot.settings.CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$1
            @Override // p715kotlin.jvm.functions.Function1
            public final Void invoke(SettingItem settingItem) {
                return null;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((SettingItem) obj);
            }
        };
        ((C26053f) LazyColumn).m77529r(settingItems.size(), null, new Function1() { // from class: com.whoop.bot.settings.CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i14) {
                return c6064x7752bd16.invoke(settingItems.get(i14));
            }
        }, new C37816b(new InterfaceC4352n() { // from class: com.whoop.bot.settings.CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$4
            @Override // c93.InterfaceC4352n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return C23454a0.f92919a;
            }

            public final void invoke(InterfaceC1103a interfaceC1103a, int i14, Composer composer, int i15) {
                int i16;
                if ((i15 & 6) == 0) {
                    i16 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i15;
                } else {
                    i16 = i15;
                }
                if ((i15 & 48) == 0) {
                    i16 |= ((C28655q) composer).m87149e(i14) ? 32 : 16;
                }
                C28655q c28655q = (C28655q) composer;
                if (!c28655q.m87135U(i16 & 1, (i16 & 147) != 146)) {
                    c28655q.m87138X();
                    return;
                }
                SettingItem settingItem = (SettingItem) settingItems.get(i14);
                c28655q.m87150e0(1839983818);
                CoachSettingsScreenKt.m134152SettingItemEntryrAjV9yQ(settingItem, f13, function1, c28655q, TextResource.$stable | 48);
                c28655q.m87173q(false);
            }
        }, true, 802480018));
        if (success.getCoachingModeState() != null) {
            final int i14 = 1;
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: com.whoop.bot.settings.f
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i15 = i14;
                    InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i15) {
                        case 0:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$0(success, interfaceC4339a2, interfaceC1103a, composer, iIntValue);
                        case 1:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$2$0(success, interfaceC4339a2, interfaceC1103a, composer, iIntValue);
                        case 2:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$3(success, interfaceC4339a2, interfaceC1103a, composer, iIntValue);
                        default:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$4$0(success, interfaceC4339a2, interfaceC1103a, composer, iIntValue);
                    }
                }
            }, true, 106761402), 3);
        }
        if (z4) {
            final int i15 = 2;
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: com.whoop.bot.settings.f
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i16 = i15;
                    InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i16) {
                        case 0:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$0(success, interfaceC4339a3, interfaceC1103a, composer, iIntValue);
                        case 1:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$2$0(success, interfaceC4339a3, interfaceC1103a, composer, iIntValue);
                        case 2:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$3(success, interfaceC4339a3, interfaceC1103a, composer, iIntValue);
                        default:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$4$0(success, interfaceC4339a3, interfaceC1103a, composer, iIntValue);
                    }
                }
            }, true, -2142889865), 3);
        }
        if (success.getConcisenessState() != null) {
            final int i16 = 3;
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: com.whoop.bot.settings.f
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i17 = i16;
                    InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i17) {
                        case 0:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$0(success, interfaceC4339a4, interfaceC1103a, composer, iIntValue);
                        case 1:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$2$0(success, interfaceC4339a4, interfaceC1103a, composer, iIntValue);
                        case 2:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$3(success, interfaceC4339a4, interfaceC1103a, composer, iIntValue);
                        default:
                            return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$4$0(success, interfaceC4339a4, interfaceC1103a, composer, iIntValue);
                    }
                }
            }, true, 943082284), 3);
        }
        InterfaceC26064q.m77556b(LazyColumn, null, ComposableSingletons$CoachSettingsScreenKt.INSTANCE.getLambda$919338267$bot_release(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C6077g(success, f13, interfaceC4339a5, 0), true, 784755578), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsContent$lambda$6$0$0(CoachSettingsViewState.Success success, InterfaceC4339a interfaceC4339a, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Header(success.getDisplayState(), interfaceC4339a, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsContent$lambda$6$0$2$0(CoachSettingsViewState.Success success, InterfaceC4339a interfaceC4339a, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(4 * 8, C2314t.f9131w));
            TextResource title = success.getCoachingModeState().getTitle();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(success.getCoachingModeState().getSelectedState().name());
            boolean enabled = success.getCoachingModeState().getEnabled();
            int i14 = TextResource.$stable;
            CoachSettingsRow(title, textResourceM21278l, enabled, interfaceC4339a, c28655q, i14 | (i14 << 3), 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsContent$lambda$6$0$3(CoachSettingsViewState.Success success, InterfaceC4339a interfaceC4339a, InterfaceC1103a item, Composer composer, int i13) {
        TextResource.C8688b c8688bM21277k;
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * 8, C2314t.f9131w));
            TextResource title = success.getRecommendedActivitiesState().getTitle();
            int i14 = WhenMappings.$EnumSwitchMapping$0[success.getRecommendedActivitiesState().getSelectedState().ordinal()];
            if (i14 == 1) {
                c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159698u0);
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159696t0);
            }
            CoachSettingsRow(title, c8688bM21277k, success.getRecommendedActivitiesState().getEnabled(), interfaceC4339a, c28655q, TextResource.$stable | (TextResource.C8688b.f25889c << 3), 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsContent$lambda$6$0$4$0(CoachSettingsViewState.Success success, InterfaceC4339a interfaceC4339a, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * 8, C2314t.f9131w));
            TextResource title = success.getConcisenessState().getTitle();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(success.getConcisenessState().getSelectedState().name());
            boolean enabled = success.getConcisenessState().getEnabled();
            int i14 = TextResource.$stable;
            CoachSettingsRow(title, textResourceM21278l, enabled, interfaceC4339a, c28655q, i14 | (i14 << 3), 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsContent$lambda$6$0$5(CoachSettingsViewState.Success success, float f13, InterfaceC4339a interfaceC4339a, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m134151FooterrAjV9yQ(success.getDisplayState(), f13, interfaceC4339a, c28655q, 48);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsContent$lambda$7(CoachSettingsViewState.Success success, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, int i13, int i14, Composer composer, int i15) {
        CoachSettingsContent(success, function1, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    private static final void CoachSettingsNavHost(CoachSettingsViewState.Success success, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C12991u0 c12991u0, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1786826224);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(success) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            interfaceC4339a3 = interfaceC4339a;
            i14 |= c28655q2.m87157i(interfaceC4339a3) ? 256 : 128;
        } else {
            interfaceC4339a3 = interfaceC4339a;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a2) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(c12991u0) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            boolean zM87157i = c28655q2.m87157i(success) | ((i15 & 112) == 32) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | c28655q2.m87157i(c12991u0);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                C1040r c1040r = new C1040r(success, function1, interfaceC4339a3, interfaceC4339a2, c12991u0, 4);
                c28655q2.m87172p0(c1040r);
                objM87133R = c1040r;
            }
            c28655q = c28655q2;
            AbstractC17269i.m48888e(c12991u0, "MAIN_SCREEN", null, (Function1) objM87133R, c28655q, (i15 >> 12) & 14);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c((Object) success, (Object) function1, (Object) interfaceC4339a, (Object) interfaceC4339a2, (Object) c12991u0, i13, 4, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$0$0(final CoachSettingsViewState.Success success, final Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, final C12991u0 c12991u0, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "MAIN_SCREEN", null, new C37816b(new C0563n((Object) success, function1, (Object) interfaceC4339a, (Object) interfaceC4339a2, (Object) c12991u0, 2), true, -694872619), 6);
        if (success.getCoachingModeState() != null) {
            final int i13 = 0;
            AbstractC12889b.m36291u(NavHost, "COACHING_MODE_SCREEN", null, new C37816b(new Function3() { // from class: com.whoop.bot.settings.d
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    switch (i13) {
                        case 0:
                            int iIntValue = ((Integer) obj3).intValue();
                            return CoachSettingsScreenKt.CoachSettingsNavHost$lambda$0$0$1$0(success, c12991u0, function1, (C12982q) obj, (Composer) obj2, iIntValue);
                        case 1:
                            int iIntValue2 = ((Integer) obj3).intValue();
                            return CoachSettingsScreenKt.CoachSettingsNavHost$lambda$0$0$2$0(success, c12991u0, function1, (C12982q) obj, (Composer) obj2, iIntValue2);
                        default:
                            int iIntValue3 = ((Integer) obj3).intValue();
                            return CoachSettingsScreenKt.CoachSettingsNavHost$lambda$0$0$3(success, c12991u0, function1, (C12982q) obj, (Composer) obj2, iIntValue3);
                    }
                }
            }, true, -1533867631), 6);
        }
        if (success.getConcisenessState() != null) {
            final int i14 = 1;
            AbstractC12889b.m36291u(NavHost, "CONCISENESS_MODE_SCREEN", null, new C37816b(new Function3() { // from class: com.whoop.bot.settings.d
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    switch (i14) {
                        case 0:
                            int iIntValue = ((Integer) obj3).intValue();
                            return CoachSettingsScreenKt.CoachSettingsNavHost$lambda$0$0$1$0(success, c12991u0, function1, (C12982q) obj, (Composer) obj2, iIntValue);
                        case 1:
                            int iIntValue2 = ((Integer) obj3).intValue();
                            return CoachSettingsScreenKt.CoachSettingsNavHost$lambda$0$0$2$0(success, c12991u0, function1, (C12982q) obj, (Composer) obj2, iIntValue2);
                        default:
                            int iIntValue3 = ((Integer) obj3).intValue();
                            return CoachSettingsScreenKt.CoachSettingsNavHost$lambda$0$0$3(success, c12991u0, function1, (C12982q) obj, (Composer) obj2, iIntValue3);
                    }
                }
            }, true, -1873102693), 6);
        }
        final int i15 = 2;
        AbstractC12889b.m36291u(NavHost, "ACTIVITY_RECOMMENDATIONS_SCREEN", null, new C37816b(new Function3() { // from class: com.whoop.bot.settings.d
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i15) {
                    case 0:
                        int iIntValue = ((Integer) obj3).intValue();
                        return CoachSettingsScreenKt.CoachSettingsNavHost$lambda$0$0$1$0(success, c12991u0, function1, (C12982q) obj, (Composer) obj2, iIntValue);
                    case 1:
                        int iIntValue2 = ((Integer) obj3).intValue();
                        return CoachSettingsScreenKt.CoachSettingsNavHost$lambda$0$0$2$0(success, c12991u0, function1, (C12982q) obj, (Composer) obj2, iIntValue2);
                    default:
                        int iIntValue3 = ((Integer) obj3).intValue();
                        return CoachSettingsScreenKt.CoachSettingsNavHost$lambda$0$0$3(success, c12991u0, function1, (C12982q) obj, (Composer) obj2, iIntValue3);
                }
            }
        }, true, -1602724788), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$0$0$0(CoachSettingsViewState.Success success, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C12991u0 c12991u0, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c12991u0);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C6073c(c12991u0, 0);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(c12991u0);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C6073c(c12991u0, 1);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(c12991u0);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C6073c(c12991u0, 2);
            c28655q.m87172p0(objM87133R3);
        }
        CoachSettingsContent(success, function1, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$0$0$0$0$0(C12991u0 c12991u0) {
        AbstractC12939a0.m36374y(c12991u0, "COACHING_MODE_SCREEN", null, 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$0$0$0$1$0(C12991u0 c12991u0) {
        AbstractC12939a0.m36374y(c12991u0, "CONCISENESS_MODE_SCREEN", null, 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$0$0$0$2$0(C12991u0 c12991u0) {
        AbstractC12939a0.m36374y(c12991u0, "ACTIVITY_RECOMMENDATIONS_SCREEN", null, 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$0$0$1$0(CoachSettingsViewState.Success success, C12991u0 c12991u0, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        CoachingMode selectedState = success.getCoachingModeState().getSelectedState();
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c12991u0);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            objM87133R = new C6073c(c12991u0, 3);
            c28655q.m87172p0(objM87133R);
        }
        CoachSettingsCoachingModeKt.CoachingModeContent(selectedState, (InterfaceC4339a) objM87133R, function1, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$0$0$1$0$0$0(C12991u0 c12991u0) {
        c12991u0.m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$0$0$2$0(CoachSettingsViewState.Success success, C12991u0 c12991u0, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        ConcisenessMode selectedState = success.getConcisenessState().getSelectedState();
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c12991u0);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            objM87133R = new C6073c(c12991u0, 5);
            c28655q.m87172p0(objM87133R);
        }
        CoachSettingsConcisenessContentKt.ConcisenessContent(selectedState, (InterfaceC4339a) objM87133R, function1, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$0$0$2$0$0$0(C12991u0 c12991u0) {
        c12991u0.m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$0$0$3(CoachSettingsViewState.Success success, C12991u0 c12991u0, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        CoachSettingsRecommendedActivitiesState recommendedActivitiesState = success.getRecommendedActivitiesState();
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c12991u0);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            objM87133R = new C6073c(c12991u0, 4);
            c28655q.m87172p0(objM87133R);
        }
        CoachSettingsActivityRecommendationContentKt.CoachSettingsActivityRecommendationContent(recommendedActivitiesState, (InterfaceC4339a) objM87133R, function1, c28655q, TextResource.$stable, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$0$0$3$0$0(C12991u0 c12991u0) {
        c12991u0.m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsNavHost$lambda$1(CoachSettingsViewState.Success success, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C12991u0 c12991u0, int i13, Composer composer, int i14) {
        CoachSettingsNavHost(success, function1, interfaceC4339a, interfaceC4339a2, c12991u0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:74:0x015d  */
    /* JADX WARN: Code duplicated, block: B:77:0x017c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x022c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0237  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void CoachSettingsRow(TextResource titleText, TextResource statusText, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        C2314t c2314t;
        Modifier modifierM3362g;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C39336i c39336iM121949b;
        long jM125382b1;
        C39336i c39336iM121949b2;
        long jM125382b2;
        boolean z14;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(titleText, "titleText");
        AbstractC22676k.m65750j(statusText, "statusText");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1959494672);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(titleText) : c28655q2.m87157i(titleText) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(statusText) : c28655q2.m87157i(statusText) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4744f(18);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c2314t = C2314t.f9131w;
                if (z4) {
                    c28655q2.m87150e0(1878710119);
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z14 || objM87133R == c28676v0) {
                        objM87133R = new C0343e(interfaceC4339a4, 11);
                        c28655q2.m87172p0(objM87133R);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(1878711032);
                    c28655q2.m87173q(false);
                    modifierM3362g = c2314t;
                }
                float f13 = 8;
                float f14 = 2 * f13;
                Modifier modifierMo3471e = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2).mo3471e(modifierM3362g);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                float f15 = 3;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC31061c.m95629e(modifierMo3471e, f15, 4, c38072d.m121949b(c28655q2, i17).getWhite10()), f14, f15 * f13);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
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
                int i18 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(titleText, c28655q2, (i15 & 14) | i18);
                C2886a c2886aM8437r = c38072d.m121952e(c28655q2, i17).getH4();
                c39336iM121949b = c38072d.m121949b(c28655q2, i17);
                if (z4) {
                    jM125382b1 = c39336iM121949b.getBrandWhite();
                } else {
                    jM125382b1 = c39336iM121949b.getWhite50();
                }
                int i19 = C2886a.f11498d << 18;
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                AbstractC30795n.m94707h(strM21274h, null, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q2, 0, i19, 196602);
                String strM21274h2 = AbstractC8693b.m21274h(statusText, c28655q2, i18 | ((i15 >> 3) & 14));
                C2886a c2886aM8438s = c38072d.m121952e(c28655q2, i17).getH5();
                c39336iM121949b2 = c38072d.m121949b(c28655q2, i17);
                if (z4) {
                    jM125382b2 = c39336iM121949b2.getBrandWhite();
                } else {
                    jM125382b2 = c39336iM121949b2.getWhite50();
                }
                AbstractC30795n.m94707h(strM21274h2, null, jM125382b2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q2, 0, i19, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(titleText, statusText, z4, interfaceC4339a3, i13, i14, 4);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C4744f(18);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            c2314t = C2314t.f9131w;
            if (z4) {
                c28655q2.m87150e0(1878710119);
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    objM87133R = new C0343e(interfaceC4339a4, 11);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0343e(interfaceC4339a4, 11);
                    c28655q2.m87172p0(objM87133R);
                }
                modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1878711032);
                c28655q2.m87173q(false);
                modifierM3362g = c2314t;
            }
            float f16 = 8;
            float f17 = 2 * f16;
            Modifier modifierMo3471e2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f17, 0.0f, 2).mo3471e(modifierM3362g);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            float f18 = 3;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC31061c.m95629e(modifierMo3471e2, f18, 4, c38072d2.m121949b(c28655q2, i110).getWhite10()), f17, f18 * f16);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q2, 6);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
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
            int i111 = TextResource.$stable;
            String strM21274h3 = AbstractC8693b.m21274h(titleText, c28655q2, (i15 & 14) | i111);
            C2886a c2886aM8437r2 = c38072d2.m121952e(c28655q2, i110).getH4();
            c39336iM121949b = c38072d2.m121949b(c28655q2, i110);
            if (z4) {
                jM125382b1 = c39336iM121949b.getBrandWhite();
            } else {
                jM125382b1 = c39336iM121949b.getWhite50();
            }
            int i112 = C2886a.f11498d << 18;
            InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
            AbstractC30795n.m94707h(strM21274h3, null, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q2, 0, i112, 196602);
            String strM21274h4 = AbstractC8693b.m21274h(statusText, c28655q2, i111 | ((i15 >> 3) & 14));
            C2886a c2886aM8438s2 = c38072d2.m121952e(c28655q2, i110).getH5();
            c39336iM121949b2 = c38072d2.m121949b(c28655q2, i110);
            if (z4) {
                jM125382b2 = c39336iM121949b2.getBrandWhite();
            } else {
                jM125382b2 = c39336iM121949b2.getWhite50();
            }
            AbstractC30795n.m94707h(strM21274h4, null, jM125382b2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s2, null, c28655q2, 0, i112, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(titleText, statusText, z4, interfaceC4339a3, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsRow$lambda$1$0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsRow$lambda$3(TextResource textResource, TextResource textResource2, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        CoachSettingsRow(textResource, textResource2, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0174  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01df  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:108:0x021b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0224  */
    /* JADX WARN: Code duplicated, block: B:113:0x0231  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0131  */
    /* JADX WARN: Code duplicated, block: B:97:0x0139  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    public static final void CoachSettingsScreen(CoachSettingsViewState viewState, C12991u0 c12991u0, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        int i15;
        C12991u0 c12991u1;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a3;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a4;
        int i19;
        boolean z4;
        C12991u0 c12991u0M58963a;
        Function1 function3;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int i24;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1456534677);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                c12991u1 = c12991u0;
                int i25 = c28655q.m87157i(c12991u1) ? 32 : 16;
                i15 |= i25;
            } else {
                c12991u1 = c12991u0;
            }
            i15 |= i25;
        } else {
            c12991u1 = c12991u0;
        }
        int i26 = i14 & 4;
        if (i26 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a3 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a4)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0 || c28655q.m87118C()) {
                            if ((i14 & 2) != 0) {
                                c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                                i15 &= -113;
                            } else {
                                c12991u0M58963a = c12991u1;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i26 != 0) {
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C4769a(24);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                function4 = (Function1) objM87133R3;
                            } else {
                                function4 = function2;
                            }
                            if (i16 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C4744f(24);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i18 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C4744f(25);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                            } else {
                                i24 = i15;
                                interfaceC4339a7 = interfaceC4339a3;
                                interfaceC4339a8 = interfaceC4339a4;
                            }
                            c28655q.m87175r();
                            if (viewState.equals(CoachSettingsViewState.Error.INSTANCE)) {
                                c28655q.m87150e0(-429502740);
                                ErrorState(function4, c28655q, (i24 >> 6) & 14, 0);
                                c28655q.m87173q(false);
                            } else if (viewState.equals(CoachSettingsViewState.Loading.INSTANCE)) {
                                c28655q.m87150e0(-429500590);
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else if (viewState.equals(CoachSettingsViewState.Saved.INSTANCE)) {
                                c28655q.m87150e0(-429497324);
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else if (viewState instanceof CoachSettingsViewState.Success) {
                                c28655q.m87150e0(-429493814);
                                int i27 = i24 >> 3;
                                CoachSettingsNavHost((CoachSettingsViewState.Success) viewState, function4, interfaceC4339a7, interfaceC4339a8, c12991u0M58963a, c28655q, (i24 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i24 << 9) & 57344));
                                c28655q.m87173q(false);
                            } else {
                                if (!viewState.equals(CoachSettingsViewState.Saving.INSTANCE)) {
                                    throw AbstractC11895b.m32003v(-429504122, c28655q, false);
                                }
                                c28655q.m87150e0(-429489775);
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            }
                            interfaceC4339a6 = interfaceC4339a8;
                            function3 = function4;
                            interfaceC4339a5 = interfaceC4339a7;
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 2) != 0) {
                                i15 &= -113;
                            }
                            c12991u0M58963a = c12991u1;
                            function4 = function2;
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                        c28655q.m87175r();
                        if (viewState.equals(CoachSettingsViewState.Error.INSTANCE)) {
                            c28655q.m87150e0(-429502740);
                            ErrorState(function4, c28655q, (i24 >> 6) & 14, 0);
                            c28655q.m87173q(false);
                        } else if (viewState.equals(CoachSettingsViewState.Loading.INSTANCE)) {
                            c28655q.m87150e0(-429500590);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState.equals(CoachSettingsViewState.Saved.INSTANCE)) {
                            c28655q.m87150e0(-429497324);
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState instanceof CoachSettingsViewState.Success) {
                            c28655q.m87150e0(-429493814);
                            int i28 = i24 >> 3;
                            CoachSettingsNavHost((CoachSettingsViewState.Success) viewState, function4, interfaceC4339a7, interfaceC4339a8, c12991u0M58963a, c28655q, (i24 & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168) | ((i24 << 9) & 57344));
                            c28655q.m87173q(false);
                        } else {
                            if (!viewState.equals(CoachSettingsViewState.Saving.INSTANCE)) {
                                throw AbstractC11895b.m32003v(-429504122, c28655q, false);
                            }
                            c28655q.m87150e0(-429489775);
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        interfaceC4339a6 = interfaceC4339a8;
                        function3 = function4;
                        interfaceC4339a5 = interfaceC4339a7;
                    } else {
                        c28655q.m87138X();
                        c12991u0M58963a = c12991u1;
                        function3 = function2;
                        interfaceC4339a5 = interfaceC4339a3;
                        interfaceC4339a6 = interfaceC4339a4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((Object) viewState, (Object) c12991u0M58963a, function3, (Object) interfaceC4339a5, (Object) interfaceC4339a6, i13, i14, 14);
                    }
                }
                i15 |= 24576;
                interfaceC4339a4 = interfaceC4339a2;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if ((i14 & 2) != 0) {
                            c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                            i15 &= -113;
                        } else {
                            c12991u0M58963a = c12991u1;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4769a(24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4744f(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4744f(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                        } else {
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                            i15 &= -113;
                        } else {
                            c12991u0M58963a = c12991u1;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4769a(24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4744f(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4744f(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                        } else {
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                    }
                    c28655q.m87175r();
                    if (viewState.equals(CoachSettingsViewState.Error.INSTANCE)) {
                        c28655q.m87150e0(-429502740);
                        ErrorState(function4, c28655q, (i24 >> 6) & 14, 0);
                        c28655q.m87173q(false);
                    } else if (viewState.equals(CoachSettingsViewState.Loading.INSTANCE)) {
                        c28655q.m87150e0(-429500590);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState.equals(CoachSettingsViewState.Saved.INSTANCE)) {
                        c28655q.m87150e0(-429497324);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof CoachSettingsViewState.Success) {
                        c28655q.m87150e0(-429493814);
                        int i29 = i24 >> 3;
                        CoachSettingsNavHost((CoachSettingsViewState.Success) viewState, function4, interfaceC4339a7, interfaceC4339a8, c12991u0M58963a, c28655q, (i24 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | ((i24 << 9) & 57344));
                        c28655q.m87173q(false);
                    } else {
                        if (!viewState.equals(CoachSettingsViewState.Saving.INSTANCE)) {
                            throw AbstractC11895b.m32003v(-429504122, c28655q, false);
                        }
                        c28655q.m87150e0(-429489775);
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    interfaceC4339a6 = interfaceC4339a8;
                    function3 = function4;
                    interfaceC4339a5 = interfaceC4339a7;
                } else {
                    c28655q.m87138X();
                    c12991u0M58963a = c12991u1;
                    function3 = function2;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) viewState, (Object) c12991u0M58963a, function3, (Object) interfaceC4339a5, (Object) interfaceC4339a6, i13, i14, 14);
                }
            }
            i15 |= 3072;
            interfaceC4339a3 = interfaceC4339a;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if ((i14 & 2) != 0) {
                            c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                            i15 &= -113;
                        } else {
                            c12991u0M58963a = c12991u1;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4769a(24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4744f(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4744f(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                        } else {
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                            i15 &= -113;
                        } else {
                            c12991u0M58963a = c12991u1;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4769a(24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4744f(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4744f(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                        } else {
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                    }
                    c28655q.m87175r();
                    if (viewState.equals(CoachSettingsViewState.Error.INSTANCE)) {
                        c28655q.m87150e0(-429502740);
                        ErrorState(function4, c28655q, (i24 >> 6) & 14, 0);
                        c28655q.m87173q(false);
                    } else if (viewState.equals(CoachSettingsViewState.Loading.INSTANCE)) {
                        c28655q.m87150e0(-429500590);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState.equals(CoachSettingsViewState.Saved.INSTANCE)) {
                        c28655q.m87150e0(-429497324);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof CoachSettingsViewState.Success) {
                        c28655q.m87150e0(-429493814);
                        int i210 = i24 >> 3;
                        CoachSettingsNavHost((CoachSettingsViewState.Success) viewState, function4, interfaceC4339a7, interfaceC4339a8, c12991u0M58963a, c28655q, (i24 & 14) | (i210 & 112) | (i210 & 896) | (i210 & 7168) | ((i24 << 9) & 57344));
                        c28655q.m87173q(false);
                    } else {
                        if (!viewState.equals(CoachSettingsViewState.Saving.INSTANCE)) {
                            throw AbstractC11895b.m32003v(-429504122, c28655q, false);
                        }
                        c28655q.m87150e0(-429489775);
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    interfaceC4339a6 = interfaceC4339a8;
                    function3 = function4;
                    interfaceC4339a5 = interfaceC4339a7;
                } else {
                    c28655q.m87138X();
                    c12991u0M58963a = c12991u1;
                    function3 = function2;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) viewState, (Object) c12991u0M58963a, function3, (Object) interfaceC4339a5, (Object) interfaceC4339a6, i13, i14, 14);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                        i15 &= -113;
                    } else {
                        c12991u0M58963a = c12991u1;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4744f(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                    } else {
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                        i15 &= -113;
                    } else {
                        c12991u0M58963a = c12991u1;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4744f(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                    } else {
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                }
                c28655q.m87175r();
                if (viewState.equals(CoachSettingsViewState.Error.INSTANCE)) {
                    c28655q.m87150e0(-429502740);
                    ErrorState(function4, c28655q, (i24 >> 6) & 14, 0);
                    c28655q.m87173q(false);
                } else if (viewState.equals(CoachSettingsViewState.Loading.INSTANCE)) {
                    c28655q.m87150e0(-429500590);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState.equals(CoachSettingsViewState.Saved.INSTANCE)) {
                    c28655q.m87150e0(-429497324);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof CoachSettingsViewState.Success) {
                    c28655q.m87150e0(-429493814);
                    int i211 = i24 >> 3;
                    CoachSettingsNavHost((CoachSettingsViewState.Success) viewState, function4, interfaceC4339a7, interfaceC4339a8, c12991u0M58963a, c28655q, (i24 & 14) | (i211 & 112) | (i211 & 896) | (i211 & 7168) | ((i24 << 9) & 57344));
                    c28655q.m87173q(false);
                } else {
                    if (!viewState.equals(CoachSettingsViewState.Saving.INSTANCE)) {
                        throw AbstractC11895b.m32003v(-429504122, c28655q, false);
                    }
                    c28655q.m87150e0(-429489775);
                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                interfaceC4339a6 = interfaceC4339a8;
                function3 = function4;
                interfaceC4339a5 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                c12991u0M58963a = c12991u1;
                function3 = function2;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) viewState, (Object) c12991u0M58963a, function3, (Object) interfaceC4339a5, (Object) interfaceC4339a6, i13, i14, 14);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a3)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if ((i14 & 2) != 0) {
                            c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                            i15 &= -113;
                        } else {
                            c12991u0M58963a = c12991u1;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4769a(24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4744f(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4744f(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                        } else {
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                            i15 &= -113;
                        } else {
                            c12991u0M58963a = c12991u1;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4769a(24);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function4 = (Function1) objM87133R3;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4744f(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4744f(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                        } else {
                            i24 = i15;
                            interfaceC4339a7 = interfaceC4339a3;
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                    }
                    c28655q.m87175r();
                    if (viewState.equals(CoachSettingsViewState.Error.INSTANCE)) {
                        c28655q.m87150e0(-429502740);
                        ErrorState(function4, c28655q, (i24 >> 6) & 14, 0);
                        c28655q.m87173q(false);
                    } else if (viewState.equals(CoachSettingsViewState.Loading.INSTANCE)) {
                        c28655q.m87150e0(-429500590);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState.equals(CoachSettingsViewState.Saved.INSTANCE)) {
                        c28655q.m87150e0(-429497324);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof CoachSettingsViewState.Success) {
                        c28655q.m87150e0(-429493814);
                        int i212 = i24 >> 3;
                        CoachSettingsNavHost((CoachSettingsViewState.Success) viewState, function4, interfaceC4339a7, interfaceC4339a8, c12991u0M58963a, c28655q, (i24 & 14) | (i212 & 112) | (i212 & 896) | (i212 & 7168) | ((i24 << 9) & 57344));
                        c28655q.m87173q(false);
                    } else {
                        if (!viewState.equals(CoachSettingsViewState.Saving.INSTANCE)) {
                            throw AbstractC11895b.m32003v(-429504122, c28655q, false);
                        }
                        c28655q.m87150e0(-429489775);
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    interfaceC4339a6 = interfaceC4339a8;
                    function3 = function4;
                    interfaceC4339a5 = interfaceC4339a7;
                } else {
                    c28655q.m87138X();
                    c12991u0M58963a = c12991u1;
                    function3 = function2;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) viewState, (Object) c12991u0M58963a, function3, (Object) interfaceC4339a5, (Object) interfaceC4339a6, i13, i14, 14);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                        i15 &= -113;
                    } else {
                        c12991u0M58963a = c12991u1;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4744f(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                    } else {
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                        i15 &= -113;
                    } else {
                        c12991u0M58963a = c12991u1;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4744f(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                    } else {
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                }
                c28655q.m87175r();
                if (viewState.equals(CoachSettingsViewState.Error.INSTANCE)) {
                    c28655q.m87150e0(-429502740);
                    ErrorState(function4, c28655q, (i24 >> 6) & 14, 0);
                    c28655q.m87173q(false);
                } else if (viewState.equals(CoachSettingsViewState.Loading.INSTANCE)) {
                    c28655q.m87150e0(-429500590);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState.equals(CoachSettingsViewState.Saved.INSTANCE)) {
                    c28655q.m87150e0(-429497324);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof CoachSettingsViewState.Success) {
                    c28655q.m87150e0(-429493814);
                    int i213 = i24 >> 3;
                    CoachSettingsNavHost((CoachSettingsViewState.Success) viewState, function4, interfaceC4339a7, interfaceC4339a8, c12991u0M58963a, c28655q, (i24 & 14) | (i213 & 112) | (i213 & 896) | (i213 & 7168) | ((i24 << 9) & 57344));
                    c28655q.m87173q(false);
                } else {
                    if (!viewState.equals(CoachSettingsViewState.Saving.INSTANCE)) {
                        throw AbstractC11895b.m32003v(-429504122, c28655q, false);
                    }
                    c28655q.m87150e0(-429489775);
                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                interfaceC4339a6 = interfaceC4339a8;
                function3 = function4;
                interfaceC4339a5 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                c12991u0M58963a = c12991u1;
                function3 = function2;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) viewState, (Object) c12991u0M58963a, function3, (Object) interfaceC4339a5, (Object) interfaceC4339a6, i13, i14, 14);
            }
        }
        i15 |= 3072;
        interfaceC4339a3 = interfaceC4339a;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                        i15 &= -113;
                    } else {
                        c12991u0M58963a = c12991u1;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4744f(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                    } else {
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                        i15 &= -113;
                    } else {
                        c12991u0M58963a = c12991u1;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4744f(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                    } else {
                        i24 = i15;
                        interfaceC4339a7 = interfaceC4339a3;
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                }
                c28655q.m87175r();
                if (viewState.equals(CoachSettingsViewState.Error.INSTANCE)) {
                    c28655q.m87150e0(-429502740);
                    ErrorState(function4, c28655q, (i24 >> 6) & 14, 0);
                    c28655q.m87173q(false);
                } else if (viewState.equals(CoachSettingsViewState.Loading.INSTANCE)) {
                    c28655q.m87150e0(-429500590);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState.equals(CoachSettingsViewState.Saved.INSTANCE)) {
                    c28655q.m87150e0(-429497324);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof CoachSettingsViewState.Success) {
                    c28655q.m87150e0(-429493814);
                    int i214 = i24 >> 3;
                    CoachSettingsNavHost((CoachSettingsViewState.Success) viewState, function4, interfaceC4339a7, interfaceC4339a8, c12991u0M58963a, c28655q, (i24 & 14) | (i214 & 112) | (i214 & 896) | (i214 & 7168) | ((i24 << 9) & 57344));
                    c28655q.m87173q(false);
                } else {
                    if (!viewState.equals(CoachSettingsViewState.Saving.INSTANCE)) {
                        throw AbstractC11895b.m32003v(-429504122, c28655q, false);
                    }
                    c28655q.m87150e0(-429489775);
                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                interfaceC4339a6 = interfaceC4339a8;
                function3 = function4;
                interfaceC4339a5 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                c12991u0M58963a = c12991u1;
                function3 = function2;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) viewState, (Object) c12991u0M58963a, function3, (Object) interfaceC4339a5, (Object) interfaceC4339a6, i13, i14, 14);
            }
        }
        i15 |= 24576;
        interfaceC4339a4 = interfaceC4339a2;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 2) != 0) {
                    c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                    i15 &= -113;
                } else {
                    c12991u0M58963a = c12991u1;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4769a(24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4744f(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4744f(25);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    i24 = i15;
                    interfaceC4339a7 = interfaceC4339a3;
                } else {
                    i24 = i15;
                    interfaceC4339a7 = interfaceC4339a3;
                    interfaceC4339a8 = interfaceC4339a4;
                }
            } else {
                if ((i14 & 2) != 0) {
                    c12991u0M58963a = AbstractC21130a1.m58963a("CoachSettingsNavHost", null, c28655q, 6, 2);
                    i15 &= -113;
                } else {
                    c12991u0M58963a = c12991u1;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4769a(24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4744f(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4744f(25);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    i24 = i15;
                    interfaceC4339a7 = interfaceC4339a3;
                } else {
                    i24 = i15;
                    interfaceC4339a7 = interfaceC4339a3;
                    interfaceC4339a8 = interfaceC4339a4;
                }
            }
            c28655q.m87175r();
            if (viewState.equals(CoachSettingsViewState.Error.INSTANCE)) {
                c28655q.m87150e0(-429502740);
                ErrorState(function4, c28655q, (i24 >> 6) & 14, 0);
                c28655q.m87173q(false);
            } else if (viewState.equals(CoachSettingsViewState.Loading.INSTANCE)) {
                c28655q.m87150e0(-429500590);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (viewState.equals(CoachSettingsViewState.Saved.INSTANCE)) {
                c28655q.m87150e0(-429497324);
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (viewState instanceof CoachSettingsViewState.Success) {
                c28655q.m87150e0(-429493814);
                int i215 = i24 >> 3;
                CoachSettingsNavHost((CoachSettingsViewState.Success) viewState, function4, interfaceC4339a7, interfaceC4339a8, c12991u0M58963a, c28655q, (i24 & 14) | (i215 & 112) | (i215 & 896) | (i215 & 7168) | ((i24 << 9) & 57344));
                c28655q.m87173q(false);
            } else {
                if (!viewState.equals(CoachSettingsViewState.Saving.INSTANCE)) {
                    throw AbstractC11895b.m32003v(-429504122, c28655q, false);
                }
                c28655q.m87150e0(-429489775);
                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            interfaceC4339a6 = interfaceC4339a8;
            function3 = function4;
            interfaceC4339a5 = interfaceC4339a7;
        } else {
            c28655q.m87138X();
            c12991u0M58963a = c12991u1;
            function3 = function2;
            interfaceC4339a5 = interfaceC4339a3;
            interfaceC4339a6 = interfaceC4339a4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f((Object) viewState, (Object) c12991u0M58963a, function3, (Object) interfaceC4339a5, (Object) interfaceC4339a6, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsScreen$lambda$0$0(CoachSettingsViewEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsScreen$lambda$3(CoachSettingsViewState coachSettingsViewState, C12991u0 c12991u0, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        CoachSettingsScreen(coachSettingsViewState, c12991u0, function1, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void CoachSettingsScreenPreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-776854764);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            final CoachSettingsDisplayState coachSettingsDisplayState = new CoachSettingsDisplayState(AbstractC8693b.m21278l("WHOOP COACH"), AbstractC37056f.m118959K(new SettingItem(AbstractC8693b.m21278l("WHOOP COACH"), AbstractC8693b.m21278l("BETA"), AbstractC8693b.m21278l("Enable AI powered WHOOP Coach to get personalized advice and coaching to help you unlock optimal performance. You can disable this feature at any time."), true, true, "WHOOP_COACH"), new SettingItem(AbstractC8693b.m21278l("INCORPORATE WHOOP METRICS"), null, AbstractC8693b.m21278l("Allow WHOOP Coach to use your de-identified WHOOP data for a more personalized coaching experience. If enabled, your de-identified WHOOP data may be shared with our third party AI technology partners when you chat with WHOOP Coach. Even when enabled, the information we share with those partners will never identify you."), true, false, "WHOOP_COACH_DATA", 2, null), new SettingItem(AbstractC8693b.m21278l("RECOMMENDED ACTIVITIES"), null, AbstractC8693b.m21278l("Let Whoop automatically recommend daily activities on your home page."), true, false, "WHOOP_COACH_RECOMMENDED_ACTIVITIES", 2, defaultConstructorMarker)), new SettingFooter(AbstractC8693b.m21278l("Data Privacy"), AbstractC8693b.m21278l("We exist to improve your life, not invade it. You control your personal data. Read more about our commitment to Data Privacy."), AbstractC8693b.m21278l("LEARN MORE"), 0, null, 24, null));
            final CoachSettingsCoachingModeState coachSettingsCoachingModeState = new CoachSettingsCoachingModeState(AbstractC8693b.m21278l("Coaching Mode"), CoachingMode.EDUCATION, true);
            final CoachSettingsConciseState coachSettingsConciseState = new CoachSettingsConciseState(AbstractC8693b.m21278l("RESPONSE LENGTH"), ConcisenessMode.DEFAULT, true);
            final CoachSettingsRecommendedActivitiesState coachSettingsRecommendedActivitiesState = new CoachSettingsRecommendedActivitiesState(AbstractC8693b.m21278l("RECOMMENDED ACTIVITIES"), null, RecommendedActivitiesMode.ON, true, 0 == true ? 1 : 0, 18, defaultConstructorMarker);
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.bot.settings.CoachSettingsScreenKt$CoachSettingsScreenPreview$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(-1629297895);
                    CoachSettingsScreenKt.CoachSettingsScreen(new CoachSettingsViewState.Success(coachSettingsDisplayState, coachSettingsCoachingModeState, coachSettingsConciseState, coachSettingsRecommendedActivitiesState), null, null, null, null, c28655q2, 0, 30);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsScreenPreview$lambda$1(int i13, Composer composer, int i14) {
        CoachSettingsScreenPreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    private static final void ErrorState(Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        int i15;
        Function1 function3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-412963135);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            function2 = function1;
        } else if ((i13 & 6) == 0) {
            function2 = function1;
            i15 = (c28655q.m87157i(function2) ? 4 : 2) | i13;
        } else {
            function2 = function1;
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C4769a(25);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function2;
            }
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC37336b.f159702w0), false, null, 6, null);
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159704x0);
            int i17 = i15 & 14;
            boolean z4 = i17 == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C3189a(function3, 24);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC16277f.f62253K);
            boolean z13 = i17 == 4;
            Object objM87133R3 = c28655q.m87133R();
            if (z13 || objM87133R3 == c28676v0) {
                objM87133R3 = new C3189a(function3, 25);
                c28655q.m87172p0(objM87133R3);
            }
            int i18 = 196608 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
            int i19 = TextResource.C8688b.f25889c;
            AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688bM21277k, interfaceC4339a, true, false, c8688bM21277k2, (InterfaceC4339a) objM87133R3, null, false, false, c28655q, i18 | (i19 << 9) | (i19 << 21), 0, 3652);
            function2 = function3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2066k(i13, i14, 1, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ErrorState$lambda$0$0(CoachSettingsViewEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ErrorState$lambda$1$0(Function1 function1) {
        function1.invoke(CoachSettingsViewEvent.Retry.INSTANCE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ErrorState$lambda$2$0(Function1 function1) {
        function1.invoke(CoachSettingsViewEvent.DismissError.INSTANCE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ErrorState$lambda$3(Function1 function1, int i13, int i14, Composer composer, int i15) {
        ErrorState(function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Footer-rAjV9yQ, reason: not valid java name */
    private static final void m134151FooterrAjV9yQ(CoachSettingsDisplayState coachSettingsDisplayState, float f13, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1143330256);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(coachSettingsDisplayState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2));
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            int i16 = i14;
            float f14 = 4;
            Modifier modifierM95629e = AbstractC31061c.m95629e(modifierM3409f, 3, f14, c38072d.m121949b(c28655q, i15).getWhite5());
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM95629e);
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
            float f15 = 2;
            float f16 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f15 * f16, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15 * f14), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            TextResource title = coachSettingsDisplayState.getFooter().getTitle();
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(title, c28655q, i17);
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i15).getB1();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i18, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(coachSettingsDisplayState.getFooter().getBody(), c28655q, i17), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 0, i18, 196602);
            boolean z4 = (i16 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C0343e(interfaceC4339a, 12);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f16), C2299e.f9108K, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3362g);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(coachSettingsDisplayState.getFooter().getCtaTitle(), c28655q, i17), null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 0, i18, 196602);
            c28655q = c28655q;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), c28655q, 6), null, AbstractC1102d.m3419p(f14 * f14, c2314t), c38072d.m121949b(c28655q, i15).getBrandWhite(), c28655q, 432, 0);
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C6078h(coachSettingsDisplayState, f13, interfaceC4339a, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 Footer_rAjV9yQ$lambda$0$0$0$0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 Footer_rAjV9yQ$lambda$1(CoachSettingsDisplayState coachSettingsDisplayState, float f13, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m134151FooterrAjV9yQ(coachSettingsDisplayState, f13, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    private static final void Header(CoachSettingsDisplayState coachSettingsDisplayState, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1292502596);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(coachSettingsDisplayState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(coachSettingsDisplayState.getTitle(), null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62257L), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i14 << 6) & 7168), 53);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(coachSettingsDisplayState, interfaceC4339a, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 Header$lambda$0(CoachSettingsDisplayState coachSettingsDisplayState, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        Header(coachSettingsDisplayState, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SettingItemEntry-rAjV9yQ, reason: not valid java name */
    public static final void m134152SettingItemEntryrAjV9yQ(SettingItem settingItem, float f13, Function1 function1, Composer composer, int i13) {
        int i14;
        C0209i c0209i;
        boolean z4;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1699960998);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(settingItem) : c28655q2.m87157i(settingItem) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, 2);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
            TextResource betaTag = settingItem.getBetaTag();
            if (betaTag != null) {
                c28655q2.m87150e0(-1600464061);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(3 * 4, c2305k), c2306l, c28655q2, 54);
                int iHashCode3 = Long.hashCode(c28655q2.f115904T);
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
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                TextResource title = settingItem.getTitle();
                int i15 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(title, c28655q2, i15);
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                z4 = true;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getH4(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                AbstractC17746g1.m50874j(betaTag, 0L, null, 0L, null, false, null, null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q2, i15, 0, 0, 8388606);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                z4 = true;
                c28655q2.m87150e0(-1599959877);
                String strM21274h2 = AbstractC8693b.m21274h(settingItem.getTitle(), c28655q2, TextResource.$stable);
                C38072d c38072d2 = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i17).getH4(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            C38072d c38072d3 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            AbstractC39330c.m125320b(0L, c38072d3.m121949b(c28655q, i18).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-2064541337, c28655q, new C0003a0(16, settingItem, function1)), c28655q, 24576, 13);
            c28655q.m87173q(z4);
            C28655q c28655q3 = c28655q;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(settingItem.getBody(), c28655q, TextResource.$stable), null, c38072d3.m121949b(c28655q, i18).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i18).getB2(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
            c28655q2 = c28655q3;
            c28655q2.m87173q(z4);
        } else {
            c28655q2.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C6078h(settingItem, f13, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 SettingItemEntry_rAjV9yQ$lambda$0$0$1(SettingItem settingItem, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean checked = settingItem.getChecked();
            boolean enabled = settingItem.getEnabled();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(settingItem);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C3169c(function1, settingItem, 16);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, checked, enabled, 0L, null, null, (Function1) objM87133R, c28655q, 0, 57);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 SettingItemEntry_rAjV9yQ$lambda$0$0$1$0$0(Function1 function1, SettingItem settingItem, boolean z4) {
        function1.invoke(new CoachSettingsViewEvent.Toggle(settingItem.getSettingKey(), z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 SettingItemEntry_rAjV9yQ$lambda$1(SettingItem settingItem, float f13, Function1 function1, int i13, Composer composer, int i14) {
        m134152SettingItemEntryrAjV9yQ(settingItem, f13, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
