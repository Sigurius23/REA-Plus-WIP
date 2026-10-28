package com.whoop.design.atomic.organism.toolbar;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15676d;
import hy0.AbstractC17746g1;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import nx1.C27219a;
import ny0.AbstractC27242b1;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: com.whoop.design.atomic.organism.toolbar.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a]\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/atomic/organism/toolbar/d$a;", "state", "titleColumnModifier", "Lkotlin/Function0;", "Ll83/a0;", "onLeftButtonClick", "onRightButtonClick", "onTagClick", "d", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$a;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6718a {
    /* JADX WARN: Code duplicated, block: B:100:0x0180  */
    /* JADX WARN: Code duplicated, block: B:103:0x0191  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:107:0x0209  */
    /* JADX WARN: Code duplicated, block: B:111:0x0239  */
    /* JADX WARN: Code duplicated, block: B:114:0x0268  */
    /* JADX WARN: Code duplicated, block: B:115:0x026c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0279  */
    /* JADX WARN: Code duplicated, block: B:120:0x0287  */
    /* JADX WARN: Code duplicated, block: B:125:0x0309  */
    /* JADX WARN: Code duplicated, block: B:127:0x032d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0341  */
    /* JADX WARN: Code duplicated, block: B:131:0x0381  */
    /* JADX WARN: Code duplicated, block: B:134:0x0390  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:139:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:140:0x042a  */
    /* JADX WARN: Code duplicated, block: B:142:0x042e  */
    /* JADX WARN: Code duplicated, block: B:143:0x043f  */
    /* JADX WARN: Code duplicated, block: B:145:0x045e  */
    /* JADX WARN: Code duplicated, block: B:148:0x046c  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x015f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0172  */
    /* JADX INFO: renamed from: d */
    public static final void m20136d(Modifier modifier, AbstractC6721d.a state, Modifier modifier2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Composer composer, int i13, int i14) {
        Modifier modifier3;
        int i15;
        Modifier modifier4;
        int i16;
        InterfaceC4339a interfaceC4339a4;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a5;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z4;
        InterfaceC4339a interfaceC4339a6;
        Modifier modifier5;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier6;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a9;
        InterfaceC4339a interfaceC4339a10;
        float f13;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        float f15;
        float f16;
        int iHashCode2;
        C38072d c38072d;
        InterfaceC4339a interfaceC4339a11;
        InterfaceC4351m rightIconView;
        InterfaceC4339a interfaceC4339a12;
        C2886a c2886aM8423d;
        String leftIconAutomationTag;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-723735473);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i13 | 6;
            modifier3 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier3 = modifier;
            i15 = (c28655q.m87153g(modifier3) ? 4 : 2) | i13;
        } else {
            modifier3 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                modifier4 = modifier2;
                i15 |= c28655q.m87153g(modifier4) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a4 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a5 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a5)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        if ((196608 & i13) == 0) {
                            if (c28655q.m87157i(interfaceC4339a3)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i25;
                        }
                        i26 = i15;
                        if ((i26 & 74899) != 74898) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i26 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i27 != 0) {
                                modifier3 = c2314t;
                            }
                            if (i28 != 0) {
                                modifier6 = c2314t;
                            } else {
                                modifier6 = modifier4;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C27219a(9);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i18 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C27219a(10);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a9 = interfaceC4339a5;
                            }
                            if (i24 != 0) {
                                interfaceC4339a10 = null;
                            } else {
                                interfaceC4339a10 = interfaceC4339a3;
                            }
                            f13 = 4;
                            f14 = 1;
                            float f17 = f14 * 8;
                            Modifier modifierMo3471e = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f17, 7).mo3471e(modifier3);
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
                            c0209i = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                            C0209i c0209i4 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
                            c0209i2 = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                            }
                            C0209i c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                            if (state.getLeftIcon() != null) {
                                c28655q.m87150e0(1510239677);
                                Modifier modifierM3419p = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                                leftIconAutomationTag = state.getLeftIconAutomationTag();
                                if (leftIconAutomationTag == null) {
                                    leftIconAutomationTag = "toolbar_left_icon_tag";
                                }
                                f15 = f14;
                                f16 = 1.0f;
                                c0209i3 = c0209i;
                                AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                                c28655q.m87173q(false);
                            } else {
                                c0209i3 = c0209i;
                                f15 = f14;
                                f16 = 1.0f;
                                c28655q.m87150e0(1510682822);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                                c28655q.m87173q(false);
                            }
                            if (f16 <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f17, 0.0f, 2);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                            String strM21274h = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                            Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                            long jMo134584toComposableColorWaAFU9c = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                            c38072d = C38072d.f163053a;
                            AbstractC30795n.m94707h(strM21274h, modifierM44101d, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                            c28655q = c28655q;
                            if (state.getSubtitle() != null) {
                                c28655q.m87150e0(275275340);
                                String strM21274h2 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                                long jMo134584toComposableColorWaAFU9c2 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                                if (state.getSubtitle().getIsNumber()) {
                                    c28655q.m87150e0(424528599);
                                    c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                                } else {
                                    c28655q.m87150e0(424529559);
                                    c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                                }
                                c28655q.m87173q(false);
                                AbstractC30795n.m94707h(strM21274h2, null, jMo134584toComposableColorWaAFU9c2, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(275597709);
                                c28655q.m87173q(false);
                            }
                            if (state.getTag() != null) {
                                AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                                C28655q c28655q2 = c28655q;
                                InterfaceC4339a interfaceC4339a13 = interfaceC4339a10;
                                AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a13, c28655q2, (i26 >> 9) & 896, 2);
                                interfaceC4339a11 = interfaceC4339a13;
                                c28655q = c28655q2;
                                c28655q.m87173q(false);
                            } else {
                                interfaceC4339a11 = interfaceC4339a10;
                                c28655q.m87150e0(275828845);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            rightIconView = state.getRightIconView();
                            if (state.getRightIcon() != null) {
                                c28655q.m87150e0(1512094965);
                                interfaceC4339a12 = interfaceC4339a9;
                                AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                                c28655q.m87173q(false);
                            } else {
                                interfaceC4339a12 = interfaceC4339a9;
                                if (rightIconView != null) {
                                    c28655q.m87150e0(1512602032);
                                    rightIconView.invoke(c28655q, 0);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(1512647974);
                                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                                    c28655q.m87173q(false);
                                }
                            }
                            c28655q.m87173q(true);
                            modifier5 = modifier6;
                            interfaceC4339a6 = interfaceC4339a11;
                            interfaceC4339a8 = interfaceC4339a12;
                            modifier3 = modifier3;
                            interfaceC4339a7 = interfaceC4339a4;
                        } else {
                            c28655q.m87138X();
                            interfaceC4339a6 = interfaceC4339a3;
                            modifier5 = modifier4;
                            interfaceC4339a7 = interfaceC4339a4;
                            interfaceC4339a8 = interfaceC4339a5;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
                        }
                    }
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    i26 = i15;
                    if ((i26 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i26 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            modifier6 = c2314t;
                        } else {
                            modifier6 = modifier4;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C27219a(9);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C27219a(10);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a9 = interfaceC4339a5;
                        }
                        if (i24 != 0) {
                            interfaceC4339a10 = null;
                        } else {
                            interfaceC4339a10 = interfaceC4339a3;
                        }
                        f13 = 4;
                        f14 = 1;
                        float f18 = f14 * 8;
                        Modifier modifierMo3471e2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f18, 7).mo3471e(modifier3);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                        C0209i c0209i6 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        }
                        C0209i c0209i7 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                        if (state.getLeftIcon() != null) {
                            c28655q.m87150e0(1510239677);
                            Modifier modifierM3419p2 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                            leftIconAutomationTag = state.getLeftIconAutomationTag();
                            if (leftIconAutomationTag == null) {
                                leftIconAutomationTag = "toolbar_left_icon_tag";
                            }
                            f15 = f14;
                            f16 = 1.0f;
                            c0209i3 = c0209i;
                            AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p2, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                            c28655q.m87173q(false);
                        } else {
                            c0209i3 = c0209i;
                            f15 = f14;
                            f16 = 1.0f;
                            c28655q.m87150e0(1510682822);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q.m87173q(false);
                        }
                        if (f16 <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f18, 0.0f, 2);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                        String strM21274h3 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                        Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                        long jMo134584toComposableColorWaAFU9c3 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c38072d = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h3, modifierM44101d2, jMo134584toComposableColorWaAFU9c3, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                        c28655q = c28655q;
                        if (state.getSubtitle() != null) {
                            c28655q.m87150e0(275275340);
                            String strM21274h4 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                            long jMo134584toComposableColorWaAFU9c4 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                            if (state.getSubtitle().getIsNumber()) {
                                c28655q.m87150e0(424528599);
                                c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                            } else {
                                c28655q.m87150e0(424529559);
                                c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                            }
                            c28655q.m87173q(false);
                            AbstractC30795n.m94707h(strM21274h4, null, jMo134584toComposableColorWaAFU9c4, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(275597709);
                            c28655q.m87173q(false);
                        }
                        if (state.getTag() != null) {
                            AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                            C28655q c28655q3 = c28655q;
                            InterfaceC4339a interfaceC4339a14 = interfaceC4339a10;
                            AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a14, c28655q3, (i26 >> 9) & 896, 2);
                            interfaceC4339a11 = interfaceC4339a14;
                            c28655q = c28655q3;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a11 = interfaceC4339a10;
                            c28655q.m87150e0(275828845);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        rightIconView = state.getRightIconView();
                        if (state.getRightIcon() != null) {
                            c28655q.m87150e0(1512094965);
                            interfaceC4339a12 = interfaceC4339a9;
                            AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a12 = interfaceC4339a9;
                            if (rightIconView != null) {
                                c28655q.m87150e0(1512602032);
                                rightIconView.invoke(c28655q, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1512647974);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                                c28655q.m87173q(false);
                            }
                        }
                        c28655q.m87173q(true);
                        modifier5 = modifier6;
                        interfaceC4339a6 = interfaceC4339a11;
                        interfaceC4339a8 = interfaceC4339a12;
                        modifier3 = modifier3;
                        interfaceC4339a7 = interfaceC4339a4;
                    } else {
                        c28655q.m87138X();
                        interfaceC4339a6 = interfaceC4339a3;
                        modifier5 = modifier4;
                        interfaceC4339a7 = interfaceC4339a4;
                        interfaceC4339a8 = interfaceC4339a5;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
                    }
                }
                i15 |= 24576;
                interfaceC4339a5 = interfaceC4339a2;
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(interfaceC4339a3)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i15;
                    if ((i26 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i26 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            modifier6 = c2314t;
                        } else {
                            modifier6 = modifier4;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C27219a(9);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C27219a(10);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a9 = interfaceC4339a5;
                        }
                        if (i24 != 0) {
                            interfaceC4339a10 = null;
                        } else {
                            interfaceC4339a10 = interfaceC4339a3;
                        }
                        f13 = 4;
                        f14 = 1;
                        float f19 = f14 * 8;
                        Modifier modifierMo3471e3 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f19, 7).mo3471e(modifier3);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
                        C0209i c0209i8 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m5);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        }
                        C0209i c0209i9 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N5);
                        if (state.getLeftIcon() != null) {
                            c28655q.m87150e0(1510239677);
                            Modifier modifierM3419p3 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                            leftIconAutomationTag = state.getLeftIconAutomationTag();
                            if (leftIconAutomationTag == null) {
                                leftIconAutomationTag = "toolbar_left_icon_tag";
                            }
                            f15 = f14;
                            f16 = 1.0f;
                            c0209i3 = c0209i;
                            AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p3, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                            c28655q.m87173q(false);
                        } else {
                            c0209i3 = c0209i;
                            f15 = f14;
                            f16 = 1.0f;
                            c28655q.m87150e0(1510682822);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q.m87173q(false);
                        }
                        if (f16 <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f19, 0.0f, 2);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                        String strM21274h5 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                        Modifier modifierM44101d3 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                        long jMo134584toComposableColorWaAFU9c5 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c38072d = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h5, modifierM44101d3, jMo134584toComposableColorWaAFU9c5, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                        c28655q = c28655q;
                        if (state.getSubtitle() != null) {
                            c28655q.m87150e0(275275340);
                            String strM21274h6 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                            long jMo134584toComposableColorWaAFU9c6 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                            if (state.getSubtitle().getIsNumber()) {
                                c28655q.m87150e0(424528599);
                                c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                            } else {
                                c28655q.m87150e0(424529559);
                                c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                            }
                            c28655q.m87173q(false);
                            AbstractC30795n.m94707h(strM21274h6, null, jMo134584toComposableColorWaAFU9c6, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(275597709);
                            c28655q.m87173q(false);
                        }
                        if (state.getTag() != null) {
                            AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                            C28655q c28655q4 = c28655q;
                            InterfaceC4339a interfaceC4339a15 = interfaceC4339a10;
                            AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a15, c28655q4, (i26 >> 9) & 896, 2);
                            interfaceC4339a11 = interfaceC4339a15;
                            c28655q = c28655q4;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a11 = interfaceC4339a10;
                            c28655q.m87150e0(275828845);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        rightIconView = state.getRightIconView();
                        if (state.getRightIcon() != null) {
                            c28655q.m87150e0(1512094965);
                            interfaceC4339a12 = interfaceC4339a9;
                            AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a12 = interfaceC4339a9;
                            if (rightIconView != null) {
                                c28655q.m87150e0(1512602032);
                                rightIconView.invoke(c28655q, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1512647974);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                                c28655q.m87173q(false);
                            }
                        }
                        c28655q.m87173q(true);
                        modifier5 = modifier6;
                        interfaceC4339a6 = interfaceC4339a11;
                        interfaceC4339a8 = interfaceC4339a12;
                        modifier3 = modifier3;
                        interfaceC4339a7 = interfaceC4339a4;
                    } else {
                        c28655q.m87138X();
                        interfaceC4339a6 = interfaceC4339a3;
                        modifier5 = modifier4;
                        interfaceC4339a7 = interfaceC4339a4;
                        interfaceC4339a8 = interfaceC4339a5;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                i26 = i15;
                if ((i26 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i26 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        modifier6 = c2314t;
                    } else {
                        modifier6 = modifier4;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C27219a(9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C27219a(10);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a9 = interfaceC4339a5;
                    }
                    if (i24 != 0) {
                        interfaceC4339a10 = null;
                    } else {
                        interfaceC4339a10 = interfaceC4339a3;
                    }
                    f13 = 4;
                    f14 = 1;
                    float f110 = f14 * 8;
                    Modifier modifierMo3471e4 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f110, 7).mo3471e(modifier3);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
                    C0209i c0209i10 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m7);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    }
                    C0209i c0209i11 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N7);
                    if (state.getLeftIcon() != null) {
                        c28655q.m87150e0(1510239677);
                        Modifier modifierM3419p4 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                        leftIconAutomationTag = state.getLeftIconAutomationTag();
                        if (leftIconAutomationTag == null) {
                            leftIconAutomationTag = "toolbar_left_icon_tag";
                        }
                        f15 = f14;
                        f16 = 1.0f;
                        c0209i3 = c0209i;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p4, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        c0209i3 = c0209i;
                        f15 = f14;
                        f16 = 1.0f;
                        c28655q.m87150e0(1510682822);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q.m87173q(false);
                    }
                    if (f16 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f110, 0.0f, 2);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N8);
                    String strM21274h7 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                    Modifier modifierM44101d4 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                    long jMo134584toComposableColorWaAFU9c7 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h7, modifierM44101d4, jMo134584toComposableColorWaAFU9c7, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                    c28655q = c28655q;
                    if (state.getSubtitle() != null) {
                        c28655q.m87150e0(275275340);
                        String strM21274h8 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                        long jMo134584toComposableColorWaAFU9c8 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        if (state.getSubtitle().getIsNumber()) {
                            c28655q.m87150e0(424528599);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                        } else {
                            c28655q.m87150e0(424529559);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                        }
                        c28655q.m87173q(false);
                        AbstractC30795n.m94707h(strM21274h8, null, jMo134584toComposableColorWaAFU9c8, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(275597709);
                        c28655q.m87173q(false);
                    }
                    if (state.getTag() != null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                        C28655q c28655q5 = c28655q;
                        InterfaceC4339a interfaceC4339a16 = interfaceC4339a10;
                        AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a16, c28655q5, (i26 >> 9) & 896, 2);
                        interfaceC4339a11 = interfaceC4339a16;
                        c28655q = c28655q5;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a11 = interfaceC4339a10;
                        c28655q.m87150e0(275828845);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    rightIconView = state.getRightIconView();
                    if (state.getRightIcon() != null) {
                        c28655q.m87150e0(1512094965);
                        interfaceC4339a12 = interfaceC4339a9;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a12 = interfaceC4339a9;
                        if (rightIconView != null) {
                            c28655q.m87150e0(1512602032);
                            rightIconView.invoke(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1512647974);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(true);
                    modifier5 = modifier6;
                    interfaceC4339a6 = interfaceC4339a11;
                    interfaceC4339a8 = interfaceC4339a12;
                    modifier3 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a6 = interfaceC4339a3;
                    modifier5 = modifier4;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
                }
            }
            i15 |= 3072;
            interfaceC4339a4 = interfaceC4339a;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a5 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a5)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(interfaceC4339a3)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i15;
                    if ((i26 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i26 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            modifier6 = c2314t;
                        } else {
                            modifier6 = modifier4;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C27219a(9);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C27219a(10);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a9 = interfaceC4339a5;
                        }
                        if (i24 != 0) {
                            interfaceC4339a10 = null;
                        } else {
                            interfaceC4339a10 = interfaceC4339a3;
                        }
                        f13 = 4;
                        f14 = 1;
                        float f111 = f14 * 8;
                        Modifier modifierMo3471e5 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f111, 7).mo3471e(modifier3);
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo3471e5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a5);
                        C0209i c0209i12 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m9);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        }
                        C0209i c0209i13 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                        if (state.getLeftIcon() != null) {
                            c28655q.m87150e0(1510239677);
                            Modifier modifierM3419p5 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                            leftIconAutomationTag = state.getLeftIconAutomationTag();
                            if (leftIconAutomationTag == null) {
                                leftIconAutomationTag = "toolbar_left_icon_tag";
                            }
                            f15 = f14;
                            f16 = 1.0f;
                            c0209i3 = c0209i;
                            AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p5, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                            c28655q.m87173q(false);
                        } else {
                            c0209i3 = c0209i;
                            f15 = f14;
                            f16 = 1.0f;
                            c28655q.m87150e0(1510682822);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q.m87173q(false);
                        }
                        if (f16 <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3396r5 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f111, 0.0f, 2);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3396r5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m10);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N10);
                        String strM21274h9 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                        Modifier modifierM44101d5 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                        long jMo134584toComposableColorWaAFU9c9 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c38072d = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h9, modifierM44101d5, jMo134584toComposableColorWaAFU9c9, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                        c28655q = c28655q;
                        if (state.getSubtitle() != null) {
                            c28655q.m87150e0(275275340);
                            String strM21274h10 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                            long jMo134584toComposableColorWaAFU9c10 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                            if (state.getSubtitle().getIsNumber()) {
                                c28655q.m87150e0(424528599);
                                c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                            } else {
                                c28655q.m87150e0(424529559);
                                c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                            }
                            c28655q.m87173q(false);
                            AbstractC30795n.m94707h(strM21274h10, null, jMo134584toComposableColorWaAFU9c10, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(275597709);
                            c28655q.m87173q(false);
                        }
                        if (state.getTag() != null) {
                            AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                            C28655q c28655q6 = c28655q;
                            InterfaceC4339a interfaceC4339a17 = interfaceC4339a10;
                            AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a17, c28655q6, (i26 >> 9) & 896, 2);
                            interfaceC4339a11 = interfaceC4339a17;
                            c28655q = c28655q6;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a11 = interfaceC4339a10;
                            c28655q.m87150e0(275828845);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        rightIconView = state.getRightIconView();
                        if (state.getRightIcon() != null) {
                            c28655q.m87150e0(1512094965);
                            interfaceC4339a12 = interfaceC4339a9;
                            AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a12 = interfaceC4339a9;
                            if (rightIconView != null) {
                                c28655q.m87150e0(1512602032);
                                rightIconView.invoke(c28655q, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1512647974);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                                c28655q.m87173q(false);
                            }
                        }
                        c28655q.m87173q(true);
                        modifier5 = modifier6;
                        interfaceC4339a6 = interfaceC4339a11;
                        interfaceC4339a8 = interfaceC4339a12;
                        modifier3 = modifier3;
                        interfaceC4339a7 = interfaceC4339a4;
                    } else {
                        c28655q.m87138X();
                        interfaceC4339a6 = interfaceC4339a3;
                        modifier5 = modifier4;
                        interfaceC4339a7 = interfaceC4339a4;
                        interfaceC4339a8 = interfaceC4339a5;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                i26 = i15;
                if ((i26 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i26 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        modifier6 = c2314t;
                    } else {
                        modifier6 = modifier4;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C27219a(9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C27219a(10);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a9 = interfaceC4339a5;
                    }
                    if (i24 != 0) {
                        interfaceC4339a10 = null;
                    } else {
                        interfaceC4339a10 = interfaceC4339a3;
                    }
                    f13 = 4;
                    f14 = 1;
                    float f112 = f14 * 8;
                    Modifier modifierMo3471e6 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f112, 7).mo3471e(modifier3);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
                    C0209i c0209i14 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC28653p1M87165m11);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    }
                    C0209i c0209i15 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N11);
                    if (state.getLeftIcon() != null) {
                        c28655q.m87150e0(1510239677);
                        Modifier modifierM3419p6 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                        leftIconAutomationTag = state.getLeftIconAutomationTag();
                        if (leftIconAutomationTag == null) {
                            leftIconAutomationTag = "toolbar_left_icon_tag";
                        }
                        f15 = f14;
                        f16 = 1.0f;
                        c0209i3 = c0209i;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p6, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        c0209i3 = c0209i;
                        f15 = f14;
                        f16 = 1.0f;
                        c28655q.m87150e0(1510682822);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q.m87173q(false);
                    }
                    if (f16 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f112, 0.0f, 2);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3396r6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N12);
                    String strM21274h11 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                    Modifier modifierM44101d6 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                    long jMo134584toComposableColorWaAFU9c11 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h11, modifierM44101d6, jMo134584toComposableColorWaAFU9c11, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                    c28655q = c28655q;
                    if (state.getSubtitle() != null) {
                        c28655q.m87150e0(275275340);
                        String strM21274h12 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                        long jMo134584toComposableColorWaAFU9c12 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        if (state.getSubtitle().getIsNumber()) {
                            c28655q.m87150e0(424528599);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                        } else {
                            c28655q.m87150e0(424529559);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                        }
                        c28655q.m87173q(false);
                        AbstractC30795n.m94707h(strM21274h12, null, jMo134584toComposableColorWaAFU9c12, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(275597709);
                        c28655q.m87173q(false);
                    }
                    if (state.getTag() != null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                        C28655q c28655q7 = c28655q;
                        InterfaceC4339a interfaceC4339a18 = interfaceC4339a10;
                        AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a18, c28655q7, (i26 >> 9) & 896, 2);
                        interfaceC4339a11 = interfaceC4339a18;
                        c28655q = c28655q7;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a11 = interfaceC4339a10;
                        c28655q.m87150e0(275828845);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    rightIconView = state.getRightIconView();
                    if (state.getRightIcon() != null) {
                        c28655q.m87150e0(1512094965);
                        interfaceC4339a12 = interfaceC4339a9;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a12 = interfaceC4339a9;
                        if (rightIconView != null) {
                            c28655q.m87150e0(1512602032);
                            rightIconView.invoke(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1512647974);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(true);
                    modifier5 = modifier6;
                    interfaceC4339a6 = interfaceC4339a11;
                    interfaceC4339a8 = interfaceC4339a12;
                    modifier3 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a6 = interfaceC4339a3;
                    modifier5 = modifier4;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
                }
            }
            i15 |= 24576;
            interfaceC4339a5 = interfaceC4339a2;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i15;
                if ((i26 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i26 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        modifier6 = c2314t;
                    } else {
                        modifier6 = modifier4;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C27219a(9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C27219a(10);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a9 = interfaceC4339a5;
                    }
                    if (i24 != 0) {
                        interfaceC4339a10 = null;
                    } else {
                        interfaceC4339a10 = interfaceC4339a3;
                    }
                    f13 = 4;
                    f14 = 1;
                    float f113 = f14 * 8;
                    Modifier modifierMo3471e7 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f113, 7).mo3471e(modifier3);
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierMo3471e7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a7);
                    C0209i c0209i16 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m13);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    }
                    C0209i c0209i17 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N13);
                    if (state.getLeftIcon() != null) {
                        c28655q.m87150e0(1510239677);
                        Modifier modifierM3419p7 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                        leftIconAutomationTag = state.getLeftIconAutomationTag();
                        if (leftIconAutomationTag == null) {
                            leftIconAutomationTag = "toolbar_left_icon_tag";
                        }
                        f15 = f14;
                        f16 = 1.0f;
                        c0209i3 = c0209i;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p7, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        c0209i3 = c0209i;
                        f15 = f14;
                        f16 = 1.0f;
                        c28655q.m87150e0(1510682822);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q.m87173q(false);
                    }
                    if (f16 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3396r7 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f113, 0.0f, 2);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3396r7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N14);
                    String strM21274h13 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                    Modifier modifierM44101d7 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                    long jMo134584toComposableColorWaAFU9c13 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h13, modifierM44101d7, jMo134584toComposableColorWaAFU9c13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                    c28655q = c28655q;
                    if (state.getSubtitle() != null) {
                        c28655q.m87150e0(275275340);
                        String strM21274h14 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                        long jMo134584toComposableColorWaAFU9c14 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        if (state.getSubtitle().getIsNumber()) {
                            c28655q.m87150e0(424528599);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                        } else {
                            c28655q.m87150e0(424529559);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                        }
                        c28655q.m87173q(false);
                        AbstractC30795n.m94707h(strM21274h14, null, jMo134584toComposableColorWaAFU9c14, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(275597709);
                        c28655q.m87173q(false);
                    }
                    if (state.getTag() != null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                        C28655q c28655q8 = c28655q;
                        InterfaceC4339a interfaceC4339a19 = interfaceC4339a10;
                        AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a19, c28655q8, (i26 >> 9) & 896, 2);
                        interfaceC4339a11 = interfaceC4339a19;
                        c28655q = c28655q8;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a11 = interfaceC4339a10;
                        c28655q.m87150e0(275828845);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    rightIconView = state.getRightIconView();
                    if (state.getRightIcon() != null) {
                        c28655q.m87150e0(1512094965);
                        interfaceC4339a12 = interfaceC4339a9;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a12 = interfaceC4339a9;
                        if (rightIconView != null) {
                            c28655q.m87150e0(1512602032);
                            rightIconView.invoke(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1512647974);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(true);
                    modifier5 = modifier6;
                    interfaceC4339a6 = interfaceC4339a11;
                    interfaceC4339a8 = interfaceC4339a12;
                    modifier3 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a6 = interfaceC4339a3;
                    modifier5 = modifier4;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i26 = i15;
            if ((i26 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i26 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier3 = c2314t;
                }
                if (i28 != 0) {
                    modifier6 = c2314t;
                } else {
                    modifier6 = modifier4;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C27219a(9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C27219a(10);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a9 = interfaceC4339a5;
                }
                if (i24 != 0) {
                    interfaceC4339a10 = null;
                } else {
                    interfaceC4339a10 = interfaceC4339a3;
                }
                f13 = 4;
                f14 = 1;
                float f114 = f14 * 8;
                Modifier modifierMo3471e8 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f114, 7).mo3471e(modifier3);
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierMo3471e8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a8);
                C0209i c0209i18 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m15);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                }
                C0209i c0209i19 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N15);
                if (state.getLeftIcon() != null) {
                    c28655q.m87150e0(1510239677);
                    Modifier modifierM3419p8 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                    leftIconAutomationTag = state.getLeftIconAutomationTag();
                    if (leftIconAutomationTag == null) {
                        leftIconAutomationTag = "toolbar_left_icon_tag";
                    }
                    f15 = f14;
                    f16 = 1.0f;
                    c0209i3 = c0209i;
                    AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p8, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                    c28655q.m87173q(false);
                } else {
                    c0209i3 = c0209i;
                    f15 = f14;
                    f16 = 1.0f;
                    c28655q.m87150e0(1510682822);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q.m87173q(false);
                }
                if (f16 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f114, 0.0f, 2);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3396r8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m16);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N16);
                String strM21274h15 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                Modifier modifierM44101d8 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                long jMo134584toComposableColorWaAFU9c15 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h15, modifierM44101d8, jMo134584toComposableColorWaAFU9c15, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                c28655q = c28655q;
                if (state.getSubtitle() != null) {
                    c28655q.m87150e0(275275340);
                    String strM21274h16 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                    long jMo134584toComposableColorWaAFU9c16 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    if (state.getSubtitle().getIsNumber()) {
                        c28655q.m87150e0(424528599);
                        c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                    } else {
                        c28655q.m87150e0(424529559);
                        c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                    }
                    c28655q.m87173q(false);
                    AbstractC30795n.m94707h(strM21274h16, null, jMo134584toComposableColorWaAFU9c16, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(275597709);
                    c28655q.m87173q(false);
                }
                if (state.getTag() != null) {
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                    C28655q c28655q9 = c28655q;
                    InterfaceC4339a interfaceC4339a110 = interfaceC4339a10;
                    AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a110, c28655q9, (i26 >> 9) & 896, 2);
                    interfaceC4339a11 = interfaceC4339a110;
                    c28655q = c28655q9;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a11 = interfaceC4339a10;
                    c28655q.m87150e0(275828845);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                rightIconView = state.getRightIconView();
                if (state.getRightIcon() != null) {
                    c28655q.m87150e0(1512094965);
                    interfaceC4339a12 = interfaceC4339a9;
                    AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a12 = interfaceC4339a9;
                    if (rightIconView != null) {
                        c28655q.m87150e0(1512602032);
                        rightIconView.invoke(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1512647974);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(true);
                modifier5 = modifier6;
                interfaceC4339a6 = interfaceC4339a11;
                interfaceC4339a8 = interfaceC4339a12;
                modifier3 = modifier3;
                interfaceC4339a7 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a6 = interfaceC4339a3;
                modifier5 = modifier4;
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
            }
        }
        i15 |= 384;
        modifier4 = modifier2;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a4 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a5 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a5)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(interfaceC4339a3)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i15;
                    if ((i26 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i26 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            modifier6 = c2314t;
                        } else {
                            modifier6 = modifier4;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C27219a(9);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C27219a(10);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a9 = interfaceC4339a5;
                        }
                        if (i24 != 0) {
                            interfaceC4339a10 = null;
                        } else {
                            interfaceC4339a10 = interfaceC4339a3;
                        }
                        f13 = 4;
                        f14 = 1;
                        float f115 = f14 * 8;
                        Modifier modifierMo3471e9 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f115, 7).mo3471e(modifier3);
                        C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierMo3471e9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a9);
                        C0209i c0209i110 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m17);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        }
                        C0209i c0209i111 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N17);
                        if (state.getLeftIcon() != null) {
                            c28655q.m87150e0(1510239677);
                            Modifier modifierM3419p9 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                            leftIconAutomationTag = state.getLeftIconAutomationTag();
                            if (leftIconAutomationTag == null) {
                                leftIconAutomationTag = "toolbar_left_icon_tag";
                            }
                            f15 = f14;
                            f16 = 1.0f;
                            c0209i3 = c0209i;
                            AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p9, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                            c28655q.m87173q(false);
                        } else {
                            c0209i3 = c0209i;
                            f15 = f14;
                            f16 = 1.0f;
                            c28655q.m87150e0(1510682822);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q.m87173q(false);
                        }
                        if (f16 <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3396r9 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f115, 0.0f, 2);
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3396r9);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a9);
                        AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m18);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N18);
                        String strM21274h17 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                        Modifier modifierM44101d9 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                        long jMo134584toComposableColorWaAFU9c17 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c38072d = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h17, modifierM44101d9, jMo134584toComposableColorWaAFU9c17, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                        c28655q = c28655q;
                        if (state.getSubtitle() != null) {
                            c28655q.m87150e0(275275340);
                            String strM21274h18 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                            long jMo134584toComposableColorWaAFU9c18 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                            if (state.getSubtitle().getIsNumber()) {
                                c28655q.m87150e0(424528599);
                                c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                            } else {
                                c28655q.m87150e0(424529559);
                                c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                            }
                            c28655q.m87173q(false);
                            AbstractC30795n.m94707h(strM21274h18, null, jMo134584toComposableColorWaAFU9c18, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(275597709);
                            c28655q.m87173q(false);
                        }
                        if (state.getTag() != null) {
                            AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                            C28655q c28655q10 = c28655q;
                            InterfaceC4339a interfaceC4339a111 = interfaceC4339a10;
                            AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a111, c28655q10, (i26 >> 9) & 896, 2);
                            interfaceC4339a11 = interfaceC4339a111;
                            c28655q = c28655q10;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a11 = interfaceC4339a10;
                            c28655q.m87150e0(275828845);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        rightIconView = state.getRightIconView();
                        if (state.getRightIcon() != null) {
                            c28655q.m87150e0(1512094965);
                            interfaceC4339a12 = interfaceC4339a9;
                            AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a12 = interfaceC4339a9;
                            if (rightIconView != null) {
                                c28655q.m87150e0(1512602032);
                                rightIconView.invoke(c28655q, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1512647974);
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                                c28655q.m87173q(false);
                            }
                        }
                        c28655q.m87173q(true);
                        modifier5 = modifier6;
                        interfaceC4339a6 = interfaceC4339a11;
                        interfaceC4339a8 = interfaceC4339a12;
                        modifier3 = modifier3;
                        interfaceC4339a7 = interfaceC4339a4;
                    } else {
                        c28655q.m87138X();
                        interfaceC4339a6 = interfaceC4339a3;
                        modifier5 = modifier4;
                        interfaceC4339a7 = interfaceC4339a4;
                        interfaceC4339a8 = interfaceC4339a5;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                i26 = i15;
                if ((i26 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i26 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        modifier6 = c2314t;
                    } else {
                        modifier6 = modifier4;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C27219a(9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C27219a(10);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a9 = interfaceC4339a5;
                    }
                    if (i24 != 0) {
                        interfaceC4339a10 = null;
                    } else {
                        interfaceC4339a10 = interfaceC4339a3;
                    }
                    f13 = 4;
                    f14 = 1;
                    float f116 = f14 * 8;
                    Modifier modifierMo3471e10 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f116, 7).mo3471e(modifier3);
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierMo3471e10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a10);
                    C0209i c0209i112 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC28653p1M87165m19);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    }
                    C0209i c0209i113 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i113, modifierM118962N19);
                    if (state.getLeftIcon() != null) {
                        c28655q.m87150e0(1510239677);
                        Modifier modifierM3419p10 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                        leftIconAutomationTag = state.getLeftIconAutomationTag();
                        if (leftIconAutomationTag == null) {
                            leftIconAutomationTag = "toolbar_left_icon_tag";
                        }
                        f15 = f14;
                        f16 = 1.0f;
                        c0209i3 = c0209i;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p10, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        c0209i3 = c0209i;
                        f15 = f14;
                        f16 = 1.0f;
                        c28655q.m87150e0(1510682822);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q.m87173q(false);
                    }
                    if (f16 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3396r10 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f116, 0.0f, 2);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3396r10);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC28653p1M87165m110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i113, modifierM118962N110);
                    String strM21274h19 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                    Modifier modifierM44101d10 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                    long jMo134584toComposableColorWaAFU9c19 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h19, modifierM44101d10, jMo134584toComposableColorWaAFU9c19, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                    c28655q = c28655q;
                    if (state.getSubtitle() != null) {
                        c28655q.m87150e0(275275340);
                        String strM21274h110 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                        long jMo134584toComposableColorWaAFU9c110 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        if (state.getSubtitle().getIsNumber()) {
                            c28655q.m87150e0(424528599);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                        } else {
                            c28655q.m87150e0(424529559);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                        }
                        c28655q.m87173q(false);
                        AbstractC30795n.m94707h(strM21274h110, null, jMo134584toComposableColorWaAFU9c110, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(275597709);
                        c28655q.m87173q(false);
                    }
                    if (state.getTag() != null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                        C28655q c28655q11 = c28655q;
                        InterfaceC4339a interfaceC4339a112 = interfaceC4339a10;
                        AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a112, c28655q11, (i26 >> 9) & 896, 2);
                        interfaceC4339a11 = interfaceC4339a112;
                        c28655q = c28655q11;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a11 = interfaceC4339a10;
                        c28655q.m87150e0(275828845);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    rightIconView = state.getRightIconView();
                    if (state.getRightIcon() != null) {
                        c28655q.m87150e0(1512094965);
                        interfaceC4339a12 = interfaceC4339a9;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a12 = interfaceC4339a9;
                        if (rightIconView != null) {
                            c28655q.m87150e0(1512602032);
                            rightIconView.invoke(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1512647974);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(true);
                    modifier5 = modifier6;
                    interfaceC4339a6 = interfaceC4339a11;
                    interfaceC4339a8 = interfaceC4339a12;
                    modifier3 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a6 = interfaceC4339a3;
                    modifier5 = modifier4;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
                }
            }
            i15 |= 24576;
            interfaceC4339a5 = interfaceC4339a2;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i15;
                if ((i26 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i26 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        modifier6 = c2314t;
                    } else {
                        modifier6 = modifier4;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C27219a(9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C27219a(10);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a9 = interfaceC4339a5;
                    }
                    if (i24 != 0) {
                        interfaceC4339a10 = null;
                    } else {
                        interfaceC4339a10 = interfaceC4339a3;
                    }
                    f13 = 4;
                    f14 = 1;
                    float f117 = f14 * 8;
                    Modifier modifierMo3471e11 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f117, 7).mo3471e(modifier3);
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierMo3471e11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a11);
                    C0209i c0209i114 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m111);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    }
                    C0209i c0209i115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N111);
                    if (state.getLeftIcon() != null) {
                        c28655q.m87150e0(1510239677);
                        Modifier modifierM3419p11 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                        leftIconAutomationTag = state.getLeftIconAutomationTag();
                        if (leftIconAutomationTag == null) {
                            leftIconAutomationTag = "toolbar_left_icon_tag";
                        }
                        f15 = f14;
                        f16 = 1.0f;
                        c0209i3 = c0209i;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p11, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        c0209i3 = c0209i;
                        f15 = f14;
                        f16 = 1.0f;
                        c28655q.m87150e0(1510682822);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q.m87173q(false);
                    }
                    if (f16 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3396r11 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f117, 0.0f, 2);
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM3396r11);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a11);
                    AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m112);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N112);
                    String strM21274h111 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                    Modifier modifierM44101d11 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                    long jMo134584toComposableColorWaAFU9c111 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h111, modifierM44101d11, jMo134584toComposableColorWaAFU9c111, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                    c28655q = c28655q;
                    if (state.getSubtitle() != null) {
                        c28655q.m87150e0(275275340);
                        String strM21274h112 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                        long jMo134584toComposableColorWaAFU9c112 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        if (state.getSubtitle().getIsNumber()) {
                            c28655q.m87150e0(424528599);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                        } else {
                            c28655q.m87150e0(424529559);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                        }
                        c28655q.m87173q(false);
                        AbstractC30795n.m94707h(strM21274h112, null, jMo134584toComposableColorWaAFU9c112, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(275597709);
                        c28655q.m87173q(false);
                    }
                    if (state.getTag() != null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                        C28655q c28655q12 = c28655q;
                        InterfaceC4339a interfaceC4339a113 = interfaceC4339a10;
                        AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a113, c28655q12, (i26 >> 9) & 896, 2);
                        interfaceC4339a11 = interfaceC4339a113;
                        c28655q = c28655q12;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a11 = interfaceC4339a10;
                        c28655q.m87150e0(275828845);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    rightIconView = state.getRightIconView();
                    if (state.getRightIcon() != null) {
                        c28655q.m87150e0(1512094965);
                        interfaceC4339a12 = interfaceC4339a9;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a12 = interfaceC4339a9;
                        if (rightIconView != null) {
                            c28655q.m87150e0(1512602032);
                            rightIconView.invoke(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1512647974);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(true);
                    modifier5 = modifier6;
                    interfaceC4339a6 = interfaceC4339a11;
                    interfaceC4339a8 = interfaceC4339a12;
                    modifier3 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a6 = interfaceC4339a3;
                    modifier5 = modifier4;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i26 = i15;
            if ((i26 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i26 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier3 = c2314t;
                }
                if (i28 != 0) {
                    modifier6 = c2314t;
                } else {
                    modifier6 = modifier4;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C27219a(9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C27219a(10);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a9 = interfaceC4339a5;
                }
                if (i24 != 0) {
                    interfaceC4339a10 = null;
                } else {
                    interfaceC4339a10 = interfaceC4339a3;
                }
                f13 = 4;
                f14 = 1;
                float f118 = f14 * 8;
                Modifier modifierMo3471e12 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f118, 7).mo3471e(modifier3);
                C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierMo3471e12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a12);
                C0209i c0209i116 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC28653p1M87165m113);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                }
                C0209i c0209i117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N113);
                if (state.getLeftIcon() != null) {
                    c28655q.m87150e0(1510239677);
                    Modifier modifierM3419p12 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                    leftIconAutomationTag = state.getLeftIconAutomationTag();
                    if (leftIconAutomationTag == null) {
                        leftIconAutomationTag = "toolbar_left_icon_tag";
                    }
                    f15 = f14;
                    f16 = 1.0f;
                    c0209i3 = c0209i;
                    AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p12, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                    c28655q.m87173q(false);
                } else {
                    c0209i3 = c0209i;
                    f15 = f14;
                    f16 = 1.0f;
                    c28655q.m87150e0(1510682822);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q.m87173q(false);
                }
                if (f16 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3396r12 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f118, 0.0f, 2);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3396r12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC28653p1M87165m114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N114);
                String strM21274h113 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                Modifier modifierM44101d12 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                long jMo134584toComposableColorWaAFU9c113 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h113, modifierM44101d12, jMo134584toComposableColorWaAFU9c113, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                c28655q = c28655q;
                if (state.getSubtitle() != null) {
                    c28655q.m87150e0(275275340);
                    String strM21274h114 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                    long jMo134584toComposableColorWaAFU9c114 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    if (state.getSubtitle().getIsNumber()) {
                        c28655q.m87150e0(424528599);
                        c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                    } else {
                        c28655q.m87150e0(424529559);
                        c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                    }
                    c28655q.m87173q(false);
                    AbstractC30795n.m94707h(strM21274h114, null, jMo134584toComposableColorWaAFU9c114, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(275597709);
                    c28655q.m87173q(false);
                }
                if (state.getTag() != null) {
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                    C28655q c28655q13 = c28655q;
                    InterfaceC4339a interfaceC4339a114 = interfaceC4339a10;
                    AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a114, c28655q13, (i26 >> 9) & 896, 2);
                    interfaceC4339a11 = interfaceC4339a114;
                    c28655q = c28655q13;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a11 = interfaceC4339a10;
                    c28655q.m87150e0(275828845);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                rightIconView = state.getRightIconView();
                if (state.getRightIcon() != null) {
                    c28655q.m87150e0(1512094965);
                    interfaceC4339a12 = interfaceC4339a9;
                    AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a12 = interfaceC4339a9;
                    if (rightIconView != null) {
                        c28655q.m87150e0(1512602032);
                        rightIconView.invoke(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1512647974);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(true);
                modifier5 = modifier6;
                interfaceC4339a6 = interfaceC4339a11;
                interfaceC4339a8 = interfaceC4339a12;
                modifier3 = modifier3;
                interfaceC4339a7 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a6 = interfaceC4339a3;
                modifier5 = modifier4;
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
            }
        }
        i15 |= 3072;
        interfaceC4339a4 = interfaceC4339a;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a5 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a5)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i15;
                if ((i26 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i26 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        modifier6 = c2314t;
                    } else {
                        modifier6 = modifier4;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C27219a(9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C27219a(10);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a9 = interfaceC4339a5;
                    }
                    if (i24 != 0) {
                        interfaceC4339a10 = null;
                    } else {
                        interfaceC4339a10 = interfaceC4339a3;
                    }
                    f13 = 4;
                    f14 = 1;
                    float f119 = f14 * 8;
                    Modifier modifierMo3471e13 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f119, 7).mo3471e(modifier3);
                    C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierMo3471e13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a13);
                    C0209i c0209i118 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i118, interfaceC28653p1M87165m115);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    }
                    C0209i c0209i119 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N115);
                    if (state.getLeftIcon() != null) {
                        c28655q.m87150e0(1510239677);
                        Modifier modifierM3419p13 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                        leftIconAutomationTag = state.getLeftIconAutomationTag();
                        if (leftIconAutomationTag == null) {
                            leftIconAutomationTag = "toolbar_left_icon_tag";
                        }
                        f15 = f14;
                        f16 = 1.0f;
                        c0209i3 = c0209i;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p13, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        c0209i3 = c0209i;
                        f15 = f14;
                        f16 = 1.0f;
                        c28655q.m87150e0(1510682822);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q.m87173q(false);
                    }
                    if (f16 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3396r13 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f119, 0.0f, 2);
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM3396r13);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a13);
                    AbstractC28683x.m87239G(c28655q, c0209i118, interfaceC28653p1M87165m116);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N116);
                    String strM21274h115 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                    Modifier modifierM44101d13 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                    long jMo134584toComposableColorWaAFU9c115 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h115, modifierM44101d13, jMo134584toComposableColorWaAFU9c115, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                    c28655q = c28655q;
                    if (state.getSubtitle() != null) {
                        c28655q.m87150e0(275275340);
                        String strM21274h116 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                        long jMo134584toComposableColorWaAFU9c116 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        if (state.getSubtitle().getIsNumber()) {
                            c28655q.m87150e0(424528599);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                        } else {
                            c28655q.m87150e0(424529559);
                            c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                        }
                        c28655q.m87173q(false);
                        AbstractC30795n.m94707h(strM21274h116, null, jMo134584toComposableColorWaAFU9c116, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(275597709);
                        c28655q.m87173q(false);
                    }
                    if (state.getTag() != null) {
                        AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                        C28655q c28655q14 = c28655q;
                        InterfaceC4339a interfaceC4339a115 = interfaceC4339a10;
                        AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a115, c28655q14, (i26 >> 9) & 896, 2);
                        interfaceC4339a11 = interfaceC4339a115;
                        c28655q = c28655q14;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a11 = interfaceC4339a10;
                        c28655q.m87150e0(275828845);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    rightIconView = state.getRightIconView();
                    if (state.getRightIcon() != null) {
                        c28655q.m87150e0(1512094965);
                        interfaceC4339a12 = interfaceC4339a9;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a12 = interfaceC4339a9;
                        if (rightIconView != null) {
                            c28655q.m87150e0(1512602032);
                            rightIconView.invoke(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1512647974);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(true);
                    modifier5 = modifier6;
                    interfaceC4339a6 = interfaceC4339a11;
                    interfaceC4339a8 = interfaceC4339a12;
                    modifier3 = modifier3;
                    interfaceC4339a7 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a6 = interfaceC4339a3;
                    modifier5 = modifier4;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i26 = i15;
            if ((i26 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i26 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier3 = c2314t;
                }
                if (i28 != 0) {
                    modifier6 = c2314t;
                } else {
                    modifier6 = modifier4;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C27219a(9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C27219a(10);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a9 = interfaceC4339a5;
                }
                if (i24 != 0) {
                    interfaceC4339a10 = null;
                } else {
                    interfaceC4339a10 = interfaceC4339a3;
                }
                f13 = 4;
                f14 = 1;
                float f1110 = f14 * 8;
                Modifier modifierMo3471e14 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f1110, 7).mo3471e(modifier3);
                C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, modifierMo3471e14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a14);
                C0209i c0209i1110 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC28653p1M87165m117);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                }
                C0209i c0209i1111 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1111, modifierM118962N117);
                if (state.getLeftIcon() != null) {
                    c28655q.m87150e0(1510239677);
                    Modifier modifierM3419p14 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                    leftIconAutomationTag = state.getLeftIconAutomationTag();
                    if (leftIconAutomationTag == null) {
                        leftIconAutomationTag = "toolbar_left_icon_tag";
                    }
                    f15 = f14;
                    f16 = 1.0f;
                    c0209i3 = c0209i;
                    AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p14, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                    c28655q.m87173q(false);
                } else {
                    c0209i3 = c0209i;
                    f15 = f14;
                    f16 = 1.0f;
                    c28655q.m87150e0(1510682822);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q.m87173q(false);
                }
                if (f16 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3396r14 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f1110, 0.0f, 2);
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM3396r14);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC28653p1M87165m118);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111, modifierM118962N118);
                String strM21274h117 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                Modifier modifierM44101d14 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                long jMo134584toComposableColorWaAFU9c117 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h117, modifierM44101d14, jMo134584toComposableColorWaAFU9c117, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                c28655q = c28655q;
                if (state.getSubtitle() != null) {
                    c28655q.m87150e0(275275340);
                    String strM21274h118 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                    long jMo134584toComposableColorWaAFU9c118 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    if (state.getSubtitle().getIsNumber()) {
                        c28655q.m87150e0(424528599);
                        c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                    } else {
                        c28655q.m87150e0(424529559);
                        c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                    }
                    c28655q.m87173q(false);
                    AbstractC30795n.m94707h(strM21274h118, null, jMo134584toComposableColorWaAFU9c118, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(275597709);
                    c28655q.m87173q(false);
                }
                if (state.getTag() != null) {
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                    C28655q c28655q15 = c28655q;
                    InterfaceC4339a interfaceC4339a116 = interfaceC4339a10;
                    AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a116, c28655q15, (i26 >> 9) & 896, 2);
                    interfaceC4339a11 = interfaceC4339a116;
                    c28655q = c28655q15;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a11 = interfaceC4339a10;
                    c28655q.m87150e0(275828845);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                rightIconView = state.getRightIconView();
                if (state.getRightIcon() != null) {
                    c28655q.m87150e0(1512094965);
                    interfaceC4339a12 = interfaceC4339a9;
                    AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a12 = interfaceC4339a9;
                    if (rightIconView != null) {
                        c28655q.m87150e0(1512602032);
                        rightIconView.invoke(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1512647974);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(true);
                modifier5 = modifier6;
                interfaceC4339a6 = interfaceC4339a11;
                interfaceC4339a8 = interfaceC4339a12;
                modifier3 = modifier3;
                interfaceC4339a7 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a6 = interfaceC4339a3;
                modifier5 = modifier4;
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
            }
        }
        i15 |= 24576;
        interfaceC4339a5 = interfaceC4339a2;
        i24 = i14 & 32;
        if (i24 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(interfaceC4339a3)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            i26 = i15;
            if ((i26 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i26 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier3 = c2314t;
                }
                if (i28 != 0) {
                    modifier6 = c2314t;
                } else {
                    modifier6 = modifier4;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C27219a(9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C27219a(10);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a9 = interfaceC4339a5;
                }
                if (i24 != 0) {
                    interfaceC4339a10 = null;
                } else {
                    interfaceC4339a10 = interfaceC4339a3;
                }
                f13 = 4;
                f14 = 1;
                float f1111 = f14 * 8;
                Modifier modifierMo3471e15 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f1111, 7).mo3471e(modifier3);
                C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifierMo3471e15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a15);
                C0209i c0209i1112 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i1112, interfaceC28653p1M87165m119);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                }
                C0209i c0209i1113 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N119);
                if (state.getLeftIcon() != null) {
                    c28655q.m87150e0(1510239677);
                    Modifier modifierM3419p15 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                    leftIconAutomationTag = state.getLeftIconAutomationTag();
                    if (leftIconAutomationTag == null) {
                        leftIconAutomationTag = "toolbar_left_icon_tag";
                    }
                    f15 = f14;
                    f16 = 1.0f;
                    c0209i3 = c0209i;
                    AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p15, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                    c28655q.m87173q(false);
                } else {
                    c0209i3 = c0209i;
                    f15 = f14;
                    f16 = 1.0f;
                    c28655q.m87150e0(1510682822);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q.m87173q(false);
                }
                if (f16 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3396r15 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f1111, 0.0f, 2);
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, modifierM3396r15);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a15);
                AbstractC28683x.m87239G(c28655q, c0209i1112, interfaceC28653p1M87165m1110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N1110);
                String strM21274h119 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                Modifier modifierM44101d15 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
                long jMo134584toComposableColorWaAFU9c119 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h119, modifierM44101d15, jMo134584toComposableColorWaAFU9c119, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
                c28655q = c28655q;
                if (state.getSubtitle() != null) {
                    c28655q.m87150e0(275275340);
                    String strM21274h1110 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                    long jMo134584toComposableColorWaAFU9c1110 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    if (state.getSubtitle().getIsNumber()) {
                        c28655q.m87150e0(424528599);
                        c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                    } else {
                        c28655q.m87150e0(424529559);
                        c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                    }
                    c28655q.m87173q(false);
                    AbstractC30795n.m94707h(strM21274h1110, null, jMo134584toComposableColorWaAFU9c1110, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(275597709);
                    c28655q.m87173q(false);
                }
                if (state.getTag() != null) {
                    AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                    C28655q c28655q16 = c28655q;
                    InterfaceC4339a interfaceC4339a117 = interfaceC4339a10;
                    AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a117, c28655q16, (i26 >> 9) & 896, 2);
                    interfaceC4339a11 = interfaceC4339a117;
                    c28655q = c28655q16;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a11 = interfaceC4339a10;
                    c28655q.m87150e0(275828845);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                rightIconView = state.getRightIconView();
                if (state.getRightIcon() != null) {
                    c28655q.m87150e0(1512094965);
                    interfaceC4339a12 = interfaceC4339a9;
                    AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a12 = interfaceC4339a9;
                    if (rightIconView != null) {
                        c28655q.m87150e0(1512602032);
                        rightIconView.invoke(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1512647974);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(true);
                modifier5 = modifier6;
                interfaceC4339a6 = interfaceC4339a11;
                interfaceC4339a8 = interfaceC4339a12;
                modifier3 = modifier3;
                interfaceC4339a7 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a6 = interfaceC4339a3;
                modifier5 = modifier4;
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i26 = i15;
        if ((i26 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i26 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i27 != 0) {
                modifier3 = c2314t;
            }
            if (i28 != 0) {
                modifier6 = c2314t;
            } else {
                modifier6 = modifier4;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C27219a(9);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            }
            if (i18 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C27219a(10);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a9 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a9 = interfaceC4339a5;
            }
            if (i24 != 0) {
                interfaceC4339a10 = null;
            } else {
                interfaceC4339a10 = interfaceC4339a3;
            }
            f13 = 4;
            f14 = 1;
            float f1112 = f14 * 8;
            Modifier modifierMo3471e16 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 1.5d) * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f1112, 7).mo3471e(modifier3);
            C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
            Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, modifierMo3471e16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a16);
            C0209i c0209i1114 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC28653p1M87165m1111);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            }
            C0209i c0209i1115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N1111);
            if (state.getLeftIcon() != null) {
                c28655q.m87150e0(1510239677);
                Modifier modifierM3419p16 = AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t);
                leftIconAutomationTag = state.getLeftIconAutomationTag();
                if (leftIconAutomationTag == null) {
                    leftIconAutomationTag = "toolbar_left_icon_tag";
                }
                f15 = f14;
                f16 = 1.0f;
                c0209i3 = c0209i;
                AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().getIcon(), state.getLeftIconColor(), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21274h(state.getLeftIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(modifierM3419p16, leftIconAutomationTag), null, interfaceC4339a4, c28655q, (i26 << 3) & 57344, 8);
                c28655q.m87173q(false);
            } else {
                c0209i3 = c0209i;
                f15 = f14;
                f16 = 1.0f;
                c28655q.m87150e0(1510682822);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                c28655q.m87173q(false);
            }
            if (f16 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3396r16 = AbstractC1099a.m3396r(AbstractC11895b.m31988g(modifier6, true, f16), f1112, 0.0f, 2);
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifierM3396r16);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a16);
            AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC28653p1M87165m1112);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N1112);
            String strM21274h1111 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
            Modifier modifierM44101d16 = AbstractC15676d.m44101d(c2314t, state.getTitleAutomationTag());
            long jMo134584toComposableColorWaAFU9c1111 = state.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h1111, modifierM44101d16, jMo134584toComposableColorWaAFU9c1111, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196088);
            c28655q = c28655q;
            if (state.getSubtitle() != null) {
                c28655q.m87150e0(275275340);
                String strM21274h1112 = AbstractC8693b.m21274h(state.getSubtitle().getText(), c28655q, 0);
                long jMo134584toComposableColorWaAFU9c1112 = state.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                if (state.getSubtitle().getIsNumber()) {
                    c28655q.m87150e0(424528599);
                    c2886aM8423d = c38072d.m121952e(c28655q, 6).getN8();
                } else {
                    c28655q.m87150e0(424529559);
                    c2886aM8423d = c38072d.m121952e(c28655q, 6).getB4();
                }
                c28655q.m87173q(false);
                AbstractC30795n.m94707h(strM21274h1112, null, jMo134584toComposableColorWaAFU9c1112, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, 0, 196090);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(275597709);
                c28655q.m87173q(false);
            }
            if (state.getTag() != null) {
                AbstractC22953f.m66715b(c28655q, AbstractC18489d0.m53365f(c28655q, 275640489, f15, f13, c2314t));
                C28655q c28655q17 = c28655q;
                InterfaceC4339a interfaceC4339a118 = interfaceC4339a10;
                AbstractC17746g1.m50872h(state.getTag(), null, interfaceC4339a118, c28655q17, (i26 >> 9) & 896, 2);
                interfaceC4339a11 = interfaceC4339a118;
                c28655q = c28655q17;
                c28655q.m87173q(false);
            } else {
                interfaceC4339a11 = interfaceC4339a10;
                c28655q.m87150e0(275828845);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            rightIconView = state.getRightIconView();
            if (state.getRightIcon() != null) {
                c28655q.m87150e0(1512094965);
                interfaceC4339a12 = interfaceC4339a9;
                AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().getIcon(), state.getRightIconColor(), null, null, false, false, state.getShouldKeepOriginalIconColor(), 0.0f, false, 888, null), AbstractC8693b.m21274h(state.getRightIcon().getContentDescription(), c28655q, 0), AbstractC15676d.m44101d(AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), "toolbar_right_icon_tag"), null, interfaceC4339a12, c28655q, i26 & 57344, 8);
                c28655q.m87173q(false);
            } else {
                interfaceC4339a12 = interfaceC4339a9;
                if (rightIconView != null) {
                    c28655q.m87150e0(1512602032);
                    rightIconView.invoke(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1512647974);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(true);
            modifier5 = modifier6;
            interfaceC4339a6 = interfaceC4339a11;
            interfaceC4339a8 = interfaceC4339a12;
            modifier3 = modifier3;
            interfaceC4339a7 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            interfaceC4339a6 = interfaceC4339a3;
            modifier5 = modifier4;
            interfaceC4339a7 = interfaceC4339a4;
            interfaceC4339a8 = interfaceC4339a5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(i13, i14, 28, modifier3, state, modifier5, interfaceC4339a7, interfaceC4339a8, interfaceC4339a6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m20137e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m20138f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m20139g(Modifier modifier, AbstractC6721d.a aVar, Modifier modifier2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, int i14, Composer composer, int i15) {
        m20136d(modifier, aVar, modifier2, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
