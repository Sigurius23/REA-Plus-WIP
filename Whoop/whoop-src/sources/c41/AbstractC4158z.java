package c41;

import a01.C0086f;
import am0.C0998b;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bo2.C3509a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15210z4;
import p208i2.C17893k;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p747z81.Function1;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.z */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aG\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\r8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lc41/a0;", "itemViewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lj0/i;", "interactionSource", "", "testTag", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Lc41/a0;Landroidx/compose/ui/Modifier;Lj0/i;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "isPressedAndEnabled", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lc41/a0;ZLandroidx/compose/runtime/Composer;I)V", "isPressed", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4158z {
    /* JADX WARN: Code duplicated, block: B:102:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:110:0x0248  */
    /* JADX WARN: Code duplicated, block: B:113:0x027b  */
    /* JADX WARN: Code duplicated, block: B:114:0x027f  */
    /* JADX WARN: Code duplicated, block: B:117:0x028c  */
    /* JADX WARN: Code duplicated, block: B:119:0x029a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0304  */
    /* JADX WARN: Code duplicated, block: B:124:0x0314  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
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
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:94:0x015f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0161  */
    /* JADX WARN: Code duplicated, block: B:98:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
    /* JADX INFO: renamed from: d */
    public static final void m12975d(C3985a0 itemViewState, Modifier modifier, InterfaceC21083i interfaceC21083i, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        InterfaceC21083i interfaceC21083i2;
        int i17;
        int i18;
        String str2;
        int i19;
        int i24;
        int i25;
        boolean z4;
        C3985a0 c3985a0;
        InterfaceC21083i interfaceC21083i3;
        String str3;
        InterfaceC4339a interfaceC4339a2;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        String str4;
        InterfaceC4339a interfaceC4339a3;
        InterfaceC28601c1 interfaceC28601c1M44460m;
        boolean z13;
        long jM51541c;
        long jM95624D;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        int i26;
        C0209i c0209i4;
        C0209i c0209i5;
        C0209i c0209i6;
        int i27;
        int iHashCode2;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(itemViewState, "itemViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1108894562);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(itemViewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        int i29 = 16;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC21083i2 = interfaceC21083i;
                    if (c28655q.m87153g(interfaceC21083i2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        str2 = str;
                        if (c28655q.m87153g(str2)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            if (c28655q.m87157i(interfaceC4339a)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 9363) != 9362) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i28 != 0) {
                                modifier2 = c2314t;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = AbstractC11266d.m30453g(c28655q);
                                }
                                interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                            }
                            if (i18 != 0) {
                                str4 = null;
                            } else {
                                str4 = str2;
                            }
                            if (i24 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C3509a(i29);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                            if (m12977f(interfaceC28601c1M44460m) || !itemViewState.getEnabled()) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (z13) {
                                c28655q.m87150e0(1810957801);
                                jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1811022901);
                                jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                                c28655q.m87173q(false);
                            }
                            if (z13) {
                                c28655q.m87150e0(-495764728);
                                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                            } else {
                                c28655q.m87150e0(-495763640);
                                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                            }
                            long j7 = jM95624D;
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                            if (itemViewState.getEnabled()) {
                                f13 = 1.0f;
                            } else {
                                f13 = 0.4f;
                            }
                            InterfaceC21083i interfaceC21083i4 = interfaceC21083i2;
                            InterfaceC4339a interfaceC4339a4 = interfaceC4339a3;
                            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f), interfaceC21083i4, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44101d);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
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
                                i26 = i15;
                            } else {
                                i26 = i15;
                                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i7 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                                if (m12977f(interfaceC28601c1M44460m)) {
                                    c0209i4 = c0209i2;
                                    c0209i5 = c0209i;
                                    c0209i6 = c0209i3;
                                    i27 = 0;
                                    c28655q.m87150e0(1667007850);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(1666546570);
                                    c0209i5 = c0209i;
                                    c0209i6 = c0209i3;
                                    i27 = 0;
                                    c0209i4 = c0209i2;
                                    Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                                    c28655q.m87173q(false);
                                }
                                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a);
                                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
                                c3985a0 = itemViewState;
                                m12979h(c3985a0, z13, c28655q, i26 & 14);
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j7, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                c28655q.m87173q(true);
                                str3 = str4;
                                interfaceC4339a2 = interfaceC4339a4;
                                interfaceC21083i3 = interfaceC21083i4;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                            C0209i c0209i8 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N);
                            if (m12977f(interfaceC28601c1M44460m)) {
                                c28655q.m87150e0(1666546570);
                                c0209i5 = c0209i;
                                c0209i6 = c0209i3;
                                i27 = 0;
                                c0209i4 = c0209i2;
                                Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                                c28655q.m87173q(false);
                            } else {
                                c0209i4 = c0209i2;
                                c0209i5 = c0209i;
                                c0209i6 = c0209i3;
                                i27 = 0;
                                c28655q.m87150e0(1667007850);
                                c28655q.m87173q(false);
                            }
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m3);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N3);
                            c3985a0 = itemViewState;
                            m12979h(c3985a0, z13, c28655q, i26 & 14);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j7, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            str3 = str4;
                            interfaceC4339a2 = interfaceC4339a4;
                            interfaceC21083i3 = interfaceC21083i4;
                        } else {
                            c3985a0 = itemViewState;
                            c28655q.m87138X();
                            modifier2 = modifier2;
                            interfaceC21083i3 = interfaceC21083i2;
                            str3 = str2;
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
                        }
                    }
                    i15 |= 24576;
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i28 != 0) {
                            modifier2 = c2314t;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC11266d.m30453g(c28655q);
                            }
                            interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                        }
                        if (i18 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C3509a(i29);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            c28655q.m87150e0(1810957801);
                            jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1811022901);
                            jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                            c28655q.m87173q(false);
                        }
                        if (z13) {
                            c28655q.m87150e0(-495764728);
                            jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                        } else {
                            c28655q.m87150e0(-495763640);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                        }
                        long j13 = jM95624D;
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                        if (itemViewState.getEnabled()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.4f;
                        }
                        InterfaceC21083i interfaceC21083i5 = interfaceC21083i2;
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
                        Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f2), interfaceC21083i5, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM44101d2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            i26 = i15;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i9 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                            if (m12977f(interfaceC28601c1M44460m)) {
                                c28655q.m87150e0(1666546570);
                                c0209i5 = c0209i;
                                c0209i6 = c0209i3;
                                i27 = 0;
                                c0209i4 = c0209i2;
                                Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                                c28655q.m87173q(false);
                            } else {
                                c0209i4 = c0209i2;
                                c0209i5 = c0209i;
                                c0209i6 = c0209i3;
                                i27 = 0;
                                c28655q.m87150e0(1667007850);
                                c28655q.m87173q(false);
                            }
                            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a3);
                            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m5);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N5);
                            c3985a0 = itemViewState;
                            m12979h(c3985a0, z13, c28655q, i26 & 14);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j13, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            str3 = str4;
                            interfaceC4339a2 = interfaceC4339a5;
                            interfaceC21083i3 = interfaceC21083i5;
                        } else {
                            i26 = i15;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        C0209i c0209i10 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N4);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            c28655q.m87150e0(1666546570);
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c0209i4 = c0209i2;
                            Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c0209i4 = c0209i2;
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c28655q.m87150e0(1667007850);
                            c28655q.m87173q(false);
                        }
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                        c3985a0 = itemViewState;
                        m12979h(c3985a0, z13, c28655q, i26 & 14);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j13, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        str3 = str4;
                        interfaceC4339a2 = interfaceC4339a5;
                        interfaceC21083i3 = interfaceC21083i5;
                    } else {
                        c3985a0 = itemViewState;
                        c28655q.m87138X();
                        modifier2 = modifier2;
                        interfaceC21083i3 = interfaceC21083i2;
                        str3 = str2;
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
                    }
                }
                i15 |= 3072;
                str2 = str;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i28 != 0) {
                            modifier2 = c2314t;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC11266d.m30453g(c28655q);
                            }
                            interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                        }
                        if (i18 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C3509a(i29);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            c28655q.m87150e0(1810957801);
                            jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1811022901);
                            jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                            c28655q.m87173q(false);
                        }
                        if (z13) {
                            c28655q.m87150e0(-495764728);
                            jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                        } else {
                            c28655q.m87150e0(-495763640);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                        }
                        long j14 = jM95624D;
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                        if (itemViewState.getEnabled()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.4f;
                        }
                        InterfaceC21083i interfaceC21083i6 = interfaceC21083i2;
                        InterfaceC4339a interfaceC4339a6 = interfaceC4339a3;
                        Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f3), interfaceC21083i6, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM44101d3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            i26 = i15;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i11 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N7);
                            if (m12977f(interfaceC28601c1M44460m)) {
                                c28655q.m87150e0(1666546570);
                                c0209i5 = c0209i;
                                c0209i6 = c0209i3;
                                i27 = 0;
                                c0209i4 = c0209i2;
                                Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                                c28655q.m87173q(false);
                            } else {
                                c0209i4 = c0209i2;
                                c0209i5 = c0209i;
                                c0209i6 = c0209i3;
                                i27 = 0;
                                c28655q.m87150e0(1667007850);
                                c28655q.m87173q(false);
                            }
                            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a5);
                            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m8);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N8);
                            c3985a0 = itemViewState;
                            m12979h(c3985a0, z13, c28655q, i26 & 14);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j14, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            str3 = str4;
                            interfaceC4339a2 = interfaceC4339a6;
                            interfaceC21083i3 = interfaceC21083i6;
                        } else {
                            i26 = i15;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        C0209i c0209i12 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            c28655q.m87150e0(1666546570);
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c0209i4 = c0209i2;
                            Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c0209i4 = c0209i2;
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c28655q.m87150e0(1667007850);
                            c28655q.m87173q(false);
                        }
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a6);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m9);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N9);
                        c3985a0 = itemViewState;
                        m12979h(c3985a0, z13, c28655q, i26 & 14);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j14, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        str3 = str4;
                        interfaceC4339a2 = interfaceC4339a6;
                        interfaceC21083i3 = interfaceC21083i6;
                    } else {
                        c3985a0 = itemViewState;
                        c28655q.m87138X();
                        modifier2 = modifier2;
                        interfaceC21083i3 = interfaceC21083i2;
                        str3 = str2;
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
                    }
                }
                i15 |= 24576;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC11266d.m30453g(c28655q);
                        }
                        interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                    }
                    if (i18 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C3509a(i29);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        c28655q.m87150e0(1810957801);
                        jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1811022901);
                        jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                        c28655q.m87173q(false);
                    }
                    if (z13) {
                        c28655q.m87150e0(-495764728);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(-495763640);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    long j15 = jM95624D;
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                    if (itemViewState.getEnabled()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    InterfaceC21083i interfaceC21083i7 = interfaceC21083i2;
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a3;
                    Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f4), interfaceC21083i7, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM44101d4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        i26 = i15;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i13 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N10);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            c28655q.m87150e0(1666546570);
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c0209i4 = c0209i2;
                            Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c0209i4 = c0209i2;
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c28655q.m87150e0(1667007850);
                            c28655q.m87173q(false);
                        }
                        C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a7);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m11);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
                        c3985a0 = itemViewState;
                        m12979h(c3985a0, z13, c28655q, i26 & 14);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j15, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        str3 = str4;
                        interfaceC4339a2 = interfaceC4339a7;
                        interfaceC21083i3 = interfaceC21083i7;
                    } else {
                        i26 = i15;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    C0209i c0209i14 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N10);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        c28655q.m87150e0(1666546570);
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c0209i4 = c0209i2;
                        Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c0209i4 = c0209i2;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c28655q.m87150e0(1667007850);
                        c28655q.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N12);
                    c3985a0 = itemViewState;
                    m12979h(c3985a0, z13, c28655q, i26 & 14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j15, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    str3 = str4;
                    interfaceC4339a2 = interfaceC4339a7;
                    interfaceC21083i3 = interfaceC21083i7;
                } else {
                    c3985a0 = itemViewState;
                    c28655q.m87138X();
                    modifier2 = modifier2;
                    interfaceC21083i3 = interfaceC21083i2;
                    str3 = str2;
                    interfaceC4339a2 = interfaceC4339a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 384;
            interfaceC21083i2 = interfaceC21083i;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i28 != 0) {
                            modifier2 = c2314t;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC11266d.m30453g(c28655q);
                            }
                            interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                        }
                        if (i18 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C3509a(i29);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            c28655q.m87150e0(1810957801);
                            jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1811022901);
                            jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                            c28655q.m87173q(false);
                        }
                        if (z13) {
                            c28655q.m87150e0(-495764728);
                            jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                        } else {
                            c28655q.m87150e0(-495763640);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                        }
                        long j16 = jM95624D;
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                        if (itemViewState.getEnabled()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.4f;
                        }
                        InterfaceC21083i interfaceC21083i8 = interfaceC21083i2;
                        InterfaceC4339a interfaceC4339a8 = interfaceC4339a3;
                        Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f5), interfaceC21083i8, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM44101d5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d5);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            i26 = i15;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i15 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N13);
                            if (m12977f(interfaceC28601c1M44460m)) {
                                c28655q.m87150e0(1666546570);
                                c0209i5 = c0209i;
                                c0209i6 = c0209i3;
                                i27 = 0;
                                c0209i4 = c0209i2;
                                Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                                c28655q.m87173q(false);
                            } else {
                                c0209i4 = c0209i2;
                                c0209i5 = c0209i;
                                c0209i6 = c0209i3;
                                i27 = 0;
                                c28655q.m87150e0(1667007850);
                                c28655q.m87173q(false);
                            }
                            C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a9);
                            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m14);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N14);
                            c3985a0 = itemViewState;
                            m12979h(c3985a0, z13, c28655q, i26 & 14);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j16, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            str3 = str4;
                            interfaceC4339a2 = interfaceC4339a8;
                            interfaceC21083i3 = interfaceC21083i8;
                        } else {
                            i26 = i15;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        C0209i c0209i16 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N13);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            c28655q.m87150e0(1666546570);
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c0209i4 = c0209i2;
                            Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c0209i4 = c0209i2;
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c28655q.m87150e0(1667007850);
                            c28655q.m87173q(false);
                        }
                        C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a10);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m15);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N15);
                        c3985a0 = itemViewState;
                        m12979h(c3985a0, z13, c28655q, i26 & 14);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j16, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        str3 = str4;
                        interfaceC4339a2 = interfaceC4339a8;
                        interfaceC21083i3 = interfaceC21083i8;
                    } else {
                        c3985a0 = itemViewState;
                        c28655q.m87138X();
                        modifier2 = modifier2;
                        interfaceC21083i3 = interfaceC21083i2;
                        str3 = str2;
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
                    }
                }
                i15 |= 24576;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC11266d.m30453g(c28655q);
                        }
                        interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                    }
                    if (i18 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C3509a(i29);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        c28655q.m87150e0(1810957801);
                        jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1811022901);
                        jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                        c28655q.m87173q(false);
                    }
                    if (z13) {
                        c28655q.m87150e0(-495764728);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(-495763640);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    long j17 = jM95624D;
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                    if (itemViewState.getEnabled()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    InterfaceC21083i interfaceC21083i9 = interfaceC21083i2;
                    InterfaceC4339a interfaceC4339a9 = interfaceC4339a3;
                    Modifier modifierM44101d6 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f6), interfaceC21083i9, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM44101d6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d6);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        i26 = i15;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i17 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N16);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            c28655q.m87150e0(1666546570);
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c0209i4 = c0209i2;
                            Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c0209i4 = c0209i2;
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c28655q.m87150e0(1667007850);
                            c28655q.m87173q(false);
                        }
                        C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a11);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m17);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N17);
                        c3985a0 = itemViewState;
                        m12979h(c3985a0, z13, c28655q, i26 & 14);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j17, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        str3 = str4;
                        interfaceC4339a2 = interfaceC4339a9;
                        interfaceC21083i3 = interfaceC21083i9;
                    } else {
                        i26 = i15;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    C0209i c0209i18 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N16);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        c28655q.m87150e0(1666546570);
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c0209i4 = c0209i2;
                        Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c0209i4 = c0209i2;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c28655q.m87150e0(1667007850);
                        c28655q.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a12);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m18);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N18);
                    c3985a0 = itemViewState;
                    m12979h(c3985a0, z13, c28655q, i26 & 14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j17, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    str3 = str4;
                    interfaceC4339a2 = interfaceC4339a9;
                    interfaceC21083i3 = interfaceC21083i9;
                } else {
                    c3985a0 = itemViewState;
                    c28655q.m87138X();
                    modifier2 = modifier2;
                    interfaceC21083i3 = interfaceC21083i2;
                    str3 = str2;
                    interfaceC4339a2 = interfaceC4339a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 3072;
            str2 = str;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC11266d.m30453g(c28655q);
                        }
                        interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                    }
                    if (i18 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C3509a(i29);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        c28655q.m87150e0(1810957801);
                        jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1811022901);
                        jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                        c28655q.m87173q(false);
                    }
                    if (z13) {
                        c28655q.m87150e0(-495764728);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(-495763640);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    long j18 = jM95624D;
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                    if (itemViewState.getEnabled()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    InterfaceC21083i interfaceC21083i10 = interfaceC21083i2;
                    InterfaceC4339a interfaceC4339a10 = interfaceC4339a3;
                    Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f7), interfaceC21083i10, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM44101d7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d7);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m19);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        i26 = i15;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i19 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N19);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            c28655q.m87150e0(1666546570);
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c0209i4 = c0209i2;
                            Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c0209i4 = c0209i2;
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c28655q.m87150e0(1667007850);
                            c28655q.m87173q(false);
                        }
                        C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a13);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m110);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N110);
                        c3985a0 = itemViewState;
                        m12979h(c3985a0, z13, c28655q, i26 & 14);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j18, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        str3 = str4;
                        interfaceC4339a2 = interfaceC4339a10;
                        interfaceC21083i3 = interfaceC21083i10;
                    } else {
                        i26 = i15;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    C0209i c0209i110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N19);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        c28655q.m87150e0(1666546570);
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c0209i4 = c0209i2;
                        Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c0209i4 = c0209i2;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c28655q.m87150e0(1667007850);
                        c28655q.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a14);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m111);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N111);
                    c3985a0 = itemViewState;
                    m12979h(c3985a0, z13, c28655q, i26 & 14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j18, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    str3 = str4;
                    interfaceC4339a2 = interfaceC4339a10;
                    interfaceC21083i3 = interfaceC21083i10;
                } else {
                    c3985a0 = itemViewState;
                    c28655q.m87138X();
                    modifier2 = modifier2;
                    interfaceC21083i3 = interfaceC21083i2;
                    str3 = str2;
                    interfaceC4339a2 = interfaceC4339a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 24576;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11266d.m30453g(c28655q);
                    }
                    interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                }
                if (i18 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C3509a(i29);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                if (m12977f(interfaceC28601c1M44460m)) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (z13) {
                    c28655q.m87150e0(1810957801);
                    jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1811022901);
                    jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                    c28655q.m87173q(false);
                }
                if (z13) {
                    c28655q.m87150e0(-495764728);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-495763640);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                long j19 = jM95624D;
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                if (itemViewState.getEnabled()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.4f;
                }
                InterfaceC21083i interfaceC21083i11 = interfaceC21083i2;
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a3;
                Modifier modifierM44101d8 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f8), interfaceC21083i11, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM44101d8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d8);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m112);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    i26 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N112);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        c28655q.m87150e0(1666546570);
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c0209i4 = c0209i2;
                        Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c0209i4 = c0209i2;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c28655q.m87150e0(1667007850);
                        c28655q.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a15);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N113);
                    c3985a0 = itemViewState;
                    m12979h(c3985a0, z13, c28655q, i26 & 14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j19, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    str3 = str4;
                    interfaceC4339a2 = interfaceC4339a11;
                    interfaceC21083i3 = interfaceC21083i11;
                } else {
                    i26 = i15;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                C0209i c0209i112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N112);
                if (m12977f(interfaceC28601c1M44460m)) {
                    c28655q.m87150e0(1666546570);
                    c0209i5 = c0209i;
                    c0209i6 = c0209i3;
                    i27 = 0;
                    c0209i4 = c0209i2;
                    Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c0209i4 = c0209i2;
                    c0209i5 = c0209i;
                    c0209i6 = c0209i3;
                    i27 = 0;
                    c28655q.m87150e0(1667007850);
                    c28655q.m87173q(false);
                }
                C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a16);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N114);
                c3985a0 = itemViewState;
                m12979h(c3985a0, z13, c28655q, i26 & 14);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j19, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                str3 = str4;
                interfaceC4339a2 = interfaceC4339a11;
                interfaceC21083i3 = interfaceC21083i11;
            } else {
                c3985a0 = itemViewState;
                c28655q.m87138X();
                modifier2 = modifier2;
                interfaceC21083i3 = interfaceC21083i2;
                str3 = str2;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC21083i2 = interfaceC21083i;
                if (c28655q.m87153g(interfaceC21083i2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i28 != 0) {
                            modifier2 = c2314t;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC11266d.m30453g(c28655q);
                            }
                            interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                        }
                        if (i18 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C3509a(i29);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            c28655q.m87150e0(1810957801);
                            jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1811022901);
                            jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                            c28655q.m87173q(false);
                        }
                        if (z13) {
                            c28655q.m87150e0(-495764728);
                            jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                        } else {
                            c28655q.m87150e0(-495763640);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                        }
                        long j110 = jM95624D;
                        Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                        if (itemViewState.getEnabled()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.4f;
                        }
                        InterfaceC21083i interfaceC21083i12 = interfaceC21083i2;
                        InterfaceC4339a interfaceC4339a12 = interfaceC4339a3;
                        Modifier modifierM44101d9 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f9), interfaceC21083i12, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierM44101d9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d9);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m115);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            i26 = i15;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i113 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i113, modifierM118962N115);
                            if (m12977f(interfaceC28601c1M44460m)) {
                                c28655q.m87150e0(1666546570);
                                c0209i5 = c0209i;
                                c0209i6 = c0209i3;
                                i27 = 0;
                                c0209i4 = c0209i2;
                                Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                                c28655q.m87173q(false);
                            } else {
                                c0209i4 = c0209i2;
                                c0209i5 = c0209i;
                                c0209i6 = c0209i3;
                                i27 = 0;
                                c28655q.m87150e0(1667007850);
                                c28655q.m87173q(false);
                            }
                            C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a17);
                            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m116);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i113, modifierM118962N116);
                            c3985a0 = itemViewState;
                            m12979h(c3985a0, z13, c28655q, i26 & 14);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j110, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            str3 = str4;
                            interfaceC4339a2 = interfaceC4339a12;
                            interfaceC21083i3 = interfaceC21083i12;
                        } else {
                            i26 = i15;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        C0209i c0209i114 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N115);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            c28655q.m87150e0(1666546570);
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c0209i4 = c0209i2;
                            Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c0209i4 = c0209i2;
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c28655q.m87150e0(1667007850);
                            c28655q.m87173q(false);
                        }
                        C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                        Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a18);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m117);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N117);
                        c3985a0 = itemViewState;
                        m12979h(c3985a0, z13, c28655q, i26 & 14);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j110, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        str3 = str4;
                        interfaceC4339a2 = interfaceC4339a12;
                        interfaceC21083i3 = interfaceC21083i12;
                    } else {
                        c3985a0 = itemViewState;
                        c28655q.m87138X();
                        modifier2 = modifier2;
                        interfaceC21083i3 = interfaceC21083i2;
                        str3 = str2;
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
                    }
                }
                i15 |= 24576;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC11266d.m30453g(c28655q);
                        }
                        interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                    }
                    if (i18 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C3509a(i29);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        c28655q.m87150e0(1810957801);
                        jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1811022901);
                        jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                        c28655q.m87173q(false);
                    }
                    if (z13) {
                        c28655q.m87150e0(-495764728);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(-495763640);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    long j111 = jM95624D;
                    Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                    if (itemViewState.getEnabled()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    InterfaceC21083i interfaceC21083i13 = interfaceC21083i2;
                    InterfaceC4339a interfaceC4339a13 = interfaceC4339a3;
                    Modifier modifierM44101d10 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f10), interfaceC21083i13, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM44101d10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d10);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m118);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        i26 = i15;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i115 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N118);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            c28655q.m87150e0(1666546570);
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c0209i4 = c0209i2;
                            Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c0209i4 = c0209i2;
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c28655q.m87150e0(1667007850);
                            c28655q.m87173q(false);
                        }
                        C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                        Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a19);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m119);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N119);
                        c3985a0 = itemViewState;
                        m12979h(c3985a0, z13, c28655q, i26 & 14);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j111, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        str3 = str4;
                        interfaceC4339a2 = interfaceC4339a13;
                        interfaceC21083i3 = interfaceC21083i13;
                    } else {
                        i26 = i15;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    C0209i c0209i116 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i116, modifierM118962N118);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        c28655q.m87150e0(1666546570);
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c0209i4 = c0209i2;
                        Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c0209i4 = c0209i2;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c28655q.m87150e0(1667007850);
                        c28655q.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a110);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m1110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i116, modifierM118962N1110);
                    c3985a0 = itemViewState;
                    m12979h(c3985a0, z13, c28655q, i26 & 14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j111, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    str3 = str4;
                    interfaceC4339a2 = interfaceC4339a13;
                    interfaceC21083i3 = interfaceC21083i13;
                } else {
                    c3985a0 = itemViewState;
                    c28655q.m87138X();
                    modifier2 = modifier2;
                    interfaceC21083i3 = interfaceC21083i2;
                    str3 = str2;
                    interfaceC4339a2 = interfaceC4339a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 3072;
            str2 = str;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC11266d.m30453g(c28655q);
                        }
                        interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                    }
                    if (i18 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C3509a(i29);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        c28655q.m87150e0(1810957801);
                        jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1811022901);
                        jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                        c28655q.m87173q(false);
                    }
                    if (z13) {
                        c28655q.m87150e0(-495764728);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(-495763640);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    long j112 = jM95624D;
                    Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                    if (itemViewState.getEnabled()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    InterfaceC21083i interfaceC21083i14 = interfaceC21083i2;
                    InterfaceC4339a interfaceC4339a14 = interfaceC4339a3;
                    Modifier modifierM44101d11 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f11), interfaceC21083i14, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, modifierM44101d11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d11);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        i26 = i15;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i117 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N1111);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            c28655q.m87150e0(1666546570);
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c0209i4 = c0209i2;
                            Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c0209i4 = c0209i2;
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c28655q.m87150e0(1667007850);
                            c28655q.m87173q(false);
                        }
                        C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                        Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a111);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m1112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N1112);
                        c3985a0 = itemViewState;
                        m12979h(c3985a0, z13, c28655q, i26 & 14);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j112, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        str3 = str4;
                        interfaceC4339a2 = interfaceC4339a14;
                        interfaceC21083i3 = interfaceC21083i14;
                    } else {
                        i26 = i15;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    C0209i c0209i118 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N1111);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        c28655q.m87150e0(1666546570);
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c0209i4 = c0209i2;
                        Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c0209i4 = c0209i2;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c28655q.m87150e0(1667007850);
                        c28655q.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q.m87165m();
                    Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a112);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m1113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N1113);
                    c3985a0 = itemViewState;
                    m12979h(c3985a0, z13, c28655q, i26 & 14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j112, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    str3 = str4;
                    interfaceC4339a2 = interfaceC4339a14;
                    interfaceC21083i3 = interfaceC21083i14;
                } else {
                    c3985a0 = itemViewState;
                    c28655q.m87138X();
                    modifier2 = modifier2;
                    interfaceC21083i3 = interfaceC21083i2;
                    str3 = str2;
                    interfaceC4339a2 = interfaceC4339a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 24576;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11266d.m30453g(c28655q);
                    }
                    interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                }
                if (i18 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C3509a(i29);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                if (m12977f(interfaceC28601c1M44460m)) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (z13) {
                    c28655q.m87150e0(1810957801);
                    jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1811022901);
                    jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                    c28655q.m87173q(false);
                }
                if (z13) {
                    c28655q.m87150e0(-495764728);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-495763640);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                long j113 = jM95624D;
                Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                if (itemViewState.getEnabled()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.4f;
                }
                InterfaceC21083i interfaceC21083i15 = interfaceC21083i2;
                InterfaceC4339a interfaceC4339a15 = interfaceC4339a3;
                Modifier modifierM44101d12 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f12), interfaceC21083i15, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q.m87165m();
                Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q, modifierM44101d12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d12);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1114);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    i26 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i119 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N1114);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        c28655q.m87150e0(1666546570);
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c0209i4 = c0209i2;
                        Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c0209i4 = c0209i2;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c28655q.m87150e0(1667007850);
                        c28655q.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q.m87165m();
                    Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a113);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m1115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N1115);
                    c3985a0 = itemViewState;
                    m12979h(c3985a0, z13, c28655q, i26 & 14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j113, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    str3 = str4;
                    interfaceC4339a2 = interfaceC4339a15;
                    interfaceC21083i3 = interfaceC21083i15;
                } else {
                    i26 = i15;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                C0209i c0209i1110 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N1114);
                if (m12977f(interfaceC28601c1M44460m)) {
                    c28655q.m87150e0(1666546570);
                    c0209i5 = c0209i;
                    c0209i6 = c0209i3;
                    i27 = 0;
                    c0209i4 = c0209i2;
                    Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c0209i4 = c0209i2;
                    c0209i5 = c0209i;
                    c0209i6 = c0209i3;
                    i27 = 0;
                    c28655q.m87150e0(1667007850);
                    c28655q.m87173q(false);
                }
                C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q.m87165m();
                Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a114);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m1116);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N1116);
                c3985a0 = itemViewState;
                m12979h(c3985a0, z13, c28655q, i26 & 14);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j113, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                str3 = str4;
                interfaceC4339a2 = interfaceC4339a15;
                interfaceC21083i3 = interfaceC21083i15;
            } else {
                c3985a0 = itemViewState;
                c28655q.m87138X();
                modifier2 = modifier2;
                interfaceC21083i3 = interfaceC21083i2;
                str3 = str2;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 384;
        interfaceC21083i2 = interfaceC21083i;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                str2 = str;
                if (c28655q.m87153g(str2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC11266d.m30453g(c28655q);
                        }
                        interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                    }
                    if (i18 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C3509a(i29);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        c28655q.m87150e0(1810957801);
                        jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1811022901);
                        jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                        c28655q.m87173q(false);
                    }
                    if (z13) {
                        c28655q.m87150e0(-495764728);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(-495763640);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    long j114 = jM95624D;
                    Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                    if (itemViewState.getEnabled()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    InterfaceC21083i interfaceC21083i16 = interfaceC21083i2;
                    InterfaceC4339a interfaceC4339a16 = interfaceC4339a3;
                    Modifier modifierM44101d13 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f13), interfaceC21083i16, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q.m87165m();
                    Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q, modifierM44101d13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d13);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1117);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        i26 = i15;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i1111 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i1111, modifierM118962N1117);
                        if (m12977f(interfaceC28601c1M44460m)) {
                            c28655q.m87150e0(1666546570);
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c0209i4 = c0209i2;
                            Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            c0209i4 = c0209i2;
                            c0209i5 = c0209i;
                            c0209i6 = c0209i3;
                            i27 = 0;
                            c28655q.m87150e0(1667007850);
                            c28655q.m87173q(false);
                        }
                        C22994r1 c22994r1M66759a115 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a115);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m1118);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1111, modifierM118962N1118);
                        c3985a0 = itemViewState;
                        m12979h(c3985a0, z13, c28655q, i26 & 14);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j114, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        str3 = str4;
                        interfaceC4339a2 = interfaceC4339a16;
                        interfaceC21083i3 = interfaceC21083i16;
                    } else {
                        i26 = i15;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    C0209i c0209i1112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N1117);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        c28655q.m87150e0(1666546570);
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c0209i4 = c0209i2;
                        Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c0209i4 = c0209i2;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c28655q.m87150e0(1667007850);
                        c28655q.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a116 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q.m87165m();
                    Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a116);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m1119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N1119);
                    c3985a0 = itemViewState;
                    m12979h(c3985a0, z13, c28655q, i26 & 14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j114, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    str3 = str4;
                    interfaceC4339a2 = interfaceC4339a16;
                    interfaceC21083i3 = interfaceC21083i16;
                } else {
                    c3985a0 = itemViewState;
                    c28655q.m87138X();
                    modifier2 = modifier2;
                    interfaceC21083i3 = interfaceC21083i2;
                    str3 = str2;
                    interfaceC4339a2 = interfaceC4339a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
                }
            }
            i15 |= 24576;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11266d.m30453g(c28655q);
                    }
                    interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                }
                if (i18 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C3509a(i29);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                if (m12977f(interfaceC28601c1M44460m)) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (z13) {
                    c28655q.m87150e0(1810957801);
                    jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1811022901);
                    jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                    c28655q.m87173q(false);
                }
                if (z13) {
                    c28655q.m87150e0(-495764728);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-495763640);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                long j115 = jM95624D;
                Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                if (itemViewState.getEnabled()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.4f;
                }
                InterfaceC21083i interfaceC21083i17 = interfaceC21083i2;
                InterfaceC4339a interfaceC4339a17 = interfaceC4339a3;
                Modifier modifierM44101d14 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f14), interfaceC21083i17, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q.m87165m();
                Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q, modifierM44101d14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d14);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11110);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    i26 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1113 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N11110);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        c28655q.m87150e0(1666546570);
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c0209i4 = c0209i2;
                        Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c0209i4 = c0209i2;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c28655q.m87150e0(1667007850);
                        c28655q.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a117 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q.m87165m();
                    Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a117);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m11111);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N11111);
                    c3985a0 = itemViewState;
                    m12979h(c3985a0, z13, c28655q, i26 & 14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j115, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    str3 = str4;
                    interfaceC4339a2 = interfaceC4339a17;
                    interfaceC21083i3 = interfaceC21083i17;
                } else {
                    i26 = i15;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                C0209i c0209i1114 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N11110);
                if (m12977f(interfaceC28601c1M44460m)) {
                    c28655q.m87150e0(1666546570);
                    c0209i5 = c0209i;
                    c0209i6 = c0209i3;
                    i27 = 0;
                    c0209i4 = c0209i2;
                    Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c0209i4 = c0209i2;
                    c0209i5 = c0209i;
                    c0209i6 = c0209i3;
                    i27 = 0;
                    c28655q.m87150e0(1667007850);
                    c28655q.m87173q(false);
                }
                C22994r1 c22994r1M66759a118 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q.m87165m();
                Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a118);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m11112);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N11112);
                c3985a0 = itemViewState;
                m12979h(c3985a0, z13, c28655q, i26 & 14);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j115, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                str3 = str4;
                interfaceC4339a2 = interfaceC4339a17;
                interfaceC21083i3 = interfaceC21083i17;
            } else {
                c3985a0 = itemViewState;
                c28655q.m87138X();
                modifier2 = modifier2;
                interfaceC21083i3 = interfaceC21083i2;
                str3 = str2;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 3072;
        str2 = str;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11266d.m30453g(c28655q);
                    }
                    interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                }
                if (i18 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C3509a(i29);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
                if (m12977f(interfaceC28601c1M44460m)) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (z13) {
                    c28655q.m87150e0(1810957801);
                    jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1811022901);
                    jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                    c28655q.m87173q(false);
                }
                if (z13) {
                    c28655q.m87150e0(-495764728);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-495763640);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                long j116 = jM95624D;
                Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
                if (itemViewState.getEnabled()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.4f;
                }
                InterfaceC21083i interfaceC21083i18 = interfaceC21083i2;
                InterfaceC4339a interfaceC4339a18 = interfaceC4339a3;
                Modifier modifierM44101d15 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f15), interfaceC21083i18, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q.m87165m();
                Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q, modifierM44101d15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d15);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11113);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    i26 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N11113);
                    if (m12977f(interfaceC28601c1M44460m)) {
                        c28655q.m87150e0(1666546570);
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c0209i4 = c0209i2;
                        Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c0209i4 = c0209i2;
                        c0209i5 = c0209i;
                        c0209i6 = c0209i3;
                        i27 = 0;
                        c28655q.m87150e0(1667007850);
                        c28655q.m87173q(false);
                    }
                    C22994r1 c22994r1M66759a119 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q.m87165m();
                    Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a119);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m11114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N11114);
                    c3985a0 = itemViewState;
                    m12979h(c3985a0, z13, c28655q, i26 & 14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j116, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    str3 = str4;
                    interfaceC4339a2 = interfaceC4339a18;
                    interfaceC21083i3 = interfaceC21083i18;
                } else {
                    i26 = i15;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                C0209i c0209i1116 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1116, modifierM118962N11113);
                if (m12977f(interfaceC28601c1M44460m)) {
                    c28655q.m87150e0(1666546570);
                    c0209i5 = c0209i;
                    c0209i6 = c0209i3;
                    i27 = 0;
                    c0209i4 = c0209i2;
                    Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c0209i4 = c0209i2;
                    c0209i5 = c0209i;
                    c0209i6 = c0209i3;
                    i27 = 0;
                    c28655q.m87150e0(1667007850);
                    c28655q.m87173q(false);
                }
                C22994r1 c22994r1M66759a1110 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q.m87165m();
                Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a1110);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m11115);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1116, modifierM118962N11115);
                c3985a0 = itemViewState;
                m12979h(c3985a0, z13, c28655q, i26 & 14);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j116, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                str3 = str4;
                interfaceC4339a2 = interfaceC4339a18;
                interfaceC21083i3 = interfaceC21083i18;
            } else {
                c3985a0 = itemViewState;
                c28655q.m87138X();
                modifier2 = modifier2;
                interfaceC21083i3 = interfaceC21083i2;
                str3 = str2;
                interfaceC4339a2 = interfaceC4339a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 24576;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i28 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q);
                }
                interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
            }
            if (i18 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i24 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C3509a(i29);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14);
            if (m12977f(interfaceC28601c1M44460m)) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (z13) {
                c28655q.m87150e0(1810957801);
                jM51541c = itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1811022901);
                jM51541c = C17919x.m51541c(0.05f, itemViewState.getFillColor().mo134584toComposableColorWaAFU9c(c28655q, 0));
                c28655q.m87173q(false);
            }
            if (z13) {
                c28655q.m87150e0(-495764728);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-495763640);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            long j117 = jM95624D;
            Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(itemViewState.getType().getTileHeight(), modifier2), jM51541c, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius())));
            if (itemViewState.getEnabled()) {
                f13 = 1.0f;
            } else {
                f13 = 0.4f;
            }
            InterfaceC21083i interfaceC21083i19 = interfaceC21083i2;
            InterfaceC4339a interfaceC4339a19 = interfaceC4339a3;
            Modifier modifierM44101d16 = AbstractC15676d.m44101d(AbstractC1092a.m3360e(AbstractC34132o.m107879c(f13, modifierM3409f16), interfaceC21083i19, AbstractC15210z4.m43228a(0L, 7, false, 0.0f), itemViewState.getEnabled(), null, interfaceC4339a3, 24), str4);
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q.m87165m();
            Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q, modifierM44101d16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d16);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11116);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                i26 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i1117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N11116);
                if (m12977f(interfaceC28601c1M44460m)) {
                    c28655q.m87150e0(1666546570);
                    c0209i5 = c0209i;
                    c0209i6 = c0209i3;
                    i27 = 0;
                    c0209i4 = c0209i2;
                    Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c0209i4 = c0209i2;
                    c0209i5 = c0209i;
                    c0209i6 = c0209i3;
                    i27 = 0;
                    c28655q.m87150e0(1667007850);
                    c28655q.m87173q(false);
                }
                C22994r1 c22994r1M66759a1111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q.m87165m();
                Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a1111);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m11117);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N11117);
                c3985a0 = itemViewState;
                m12979h(c3985a0, z13, c28655q, i26 & 14);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j117, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                str3 = str4;
                interfaceC4339a2 = interfaceC4339a19;
                interfaceC21083i3 = interfaceC21083i19;
            } else {
                i26 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            C0209i c0209i1118 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i1118, modifierM118962N11116);
            if (m12977f(interfaceC28601c1M44460m)) {
                c28655q.m87150e0(1666546570);
                c0209i5 = c0209i;
                c0209i6 = c0209i3;
                i27 = 0;
                c0209i4 = c0209i2;
                Function1.m128930i(AbstractC1102d.m3407d(1.0f, AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(itemViewState.getType().getTitleBarCornerRadius()))), Function1.m128938q().getStroke7Dp().f49345a, itemViewState.getDashedOutlineColor(), new C17893k(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f)), itemViewState.getType().getTitleBarCornerRadius(), c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c0209i4 = c0209i2;
                c0209i5 = c0209i;
                c0209i6 = c0209i3;
                i27 = 0;
                c28655q.m87150e0(1667007850);
                c28655q.m87173q(false);
            }
            C22994r1 c22994r1M66759a1112 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q.m87165m();
            Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a1112);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m11118);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i1118, modifierM118962N11118);
            c3985a0 = itemViewState;
            m12979h(c3985a0, z13, c28655q, i26 & 14);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3985a0.getTitle(), c28655q, i27), AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2), j117, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 3120, 185848);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            str3 = str4;
            interfaceC4339a2 = interfaceC4339a19;
            interfaceC21083i3 = interfaceC21083i19;
        } else {
            c3985a0 = itemViewState;
            c28655q.m87138X();
            modifier2 = modifier2;
            interfaceC21083i3 = interfaceC21083i2;
            str3 = str2;
            interfaceC4339a2 = interfaceC4339a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(c3985a0, modifier2, interfaceC21083i3, str3, interfaceC4339a2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m12976e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final boolean m12977f(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m12978g(C3985a0 c3985a0, Modifier modifier, InterfaceC21083i interfaceC21083i, String str, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m12975d(c3985a0, modifier, interfaceC21083i, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final void m12979h(C3985a0 c3985a0, boolean z4, Composer composer, int i13) {
        int i14;
        long jM95628d;
        long jM95624D;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1126356834);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c3985a0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            if (z4) {
                c28655q.m87150e0(97164105);
                jM95628d = C38072d.f163053a.m121949b(c28655q, 6).getBlack10();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(97165097);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            if (z4) {
                c28655q.m87150e0(97167532);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(97168620);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            C33252i c33252iM105489e = AbstractC33253j.m105489e(c3985a0.getType().getImageCornerRadius());
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1099a.m3398t(AbstractC1102d.m3411h(c3985a0.getType().getTileHeight(), AbstractC1102d.m3424u(c3985a0.getType().getImageTileWidth(), AbstractC37056f.m118994r(c2314t, c33252iM105489e))), c3985a0.getType().getPaddingBetweenTileAndImage(), c3985a0.getType().getPaddingBetweenTileAndImage(), 0.0f, c3985a0.getType().getPaddingBetweenTileAndImage(), 4), jM95628d, AbstractC33253j.m105489e(c3985a0.getType().getImageCornerRadius()));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c3985a0.getResourceId(), c28655q, 6), null, AbstractC1102d.m3419p(c3985a0.getType().getImageSize(), c2314t), jM95624D, c28655q, 48, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(c3985a0, z4, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m12980i(C3985a0 c3985a0, boolean z4, int i13, Composer composer, int i14) {
        m12979h(c3985a0, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
