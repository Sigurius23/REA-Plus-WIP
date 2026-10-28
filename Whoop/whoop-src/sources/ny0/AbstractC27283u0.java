package ny0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gb1.AbstractC15676d;
import gb1.AbstractC15680h;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24679k;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38070b;
import x81.C38072d;

/* JADX INFO: renamed from: ny0.u0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001as\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aw\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001aa\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "settingText", "settingLabelText", "supportText", "Lny0/v0;", "type", "", "isActive", "enabled", "Ly3/f;", "radiusDp", "testTag", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "q", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "text", "Lny0/e1;", "widthType", "Lj0/i;", "interactionSource", "Li2/x;", "backgroundColor", "textColor", "m", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lny0/v0;Lny0/e1;ZLj0/i;JJFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;III)V", "settingLabel", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZLj0/i;JJLc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27283u0 {
    /* JADX WARN: Code duplicated, block: B:100:0x0172  */
    /* JADX WARN: Code duplicated, block: B:101:0x0176  */
    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:106:0x0197  */
    /* JADX WARN: Code duplicated, block: B:109:0x024b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0256  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    /* JADX INFO: renamed from: j */
    private static final void m82311j(final String str, final String str2, String str3, final AbstractC27285v0 abstractC27285v0, boolean z4, final InterfaceC21083i interfaceC21083i, final long j7, final long j13, final InterfaceC4339a interfaceC4339a, Composer composer, final int i13, final int i14) {
        int i15;
        String str4;
        int i16;
        boolean z13;
        int i17;
        InterfaceC21083i interfaceC21083i2;
        int i18;
        int i19;
        boolean z14;
        C28655q c28655q;
        final boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        boolean z17;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean zM87157i;
        int i28;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1177724300);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str2) ? 32 : 16;
        }
        int i29 = i14 & 4;
        if (i29 == 0) {
            if ((i13 & 384) == 0) {
                str4 = str3;
                i15 |= c28655q2.m87153g(str4) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i13 & 4096) == 0) {
                    zM87157i = c28655q2.m87153g(abstractC27285v0);
                } else {
                    zM87157i = c28655q2.m87157i(abstractC27285v0);
                }
                if (zM87157i) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i28;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((196608 & i13) == 0) {
                    interfaceC21083i2 = interfaceC21083i;
                    if (c28655q2.m87153g(interfaceC21083i2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                } else {
                    interfaceC21083i2 = interfaceC21083i;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q2.m87151f(j7)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                if ((12582912 & i13) == 0) {
                    int i34 = i15;
                    if (c28655q2.m87151f(j13)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i18 = i34 | i25;
                } else {
                    i18 = i15;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i24 = 67108864;
                    } else {
                        i24 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i18 |= i24;
                }
                i19 = i18;
                if ((i19 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i19 & 1, z14)) {
                    if (i29 != 0) {
                        str4 = "";
                    }
                    if (i16 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    C18027i c18027i = new C18027i(0);
                    z17 = (i19 & 234881024) == 67108864;
                    objM87133R = c28655q2.m87133R();
                    if (z17 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C24679k(interfaceC4339a, 23);
                        c28655q2.m87172p0(objM87133R);
                    }
                    C2314t c2314t = C2314t.f9131w;
                    z13 = z16;
                    Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(AbstractC1092a.m3360e(c2314t, interfaceC21083i2, null, z16, c18027i, (InterfaceC4339a) objM87133R, 8), AbstractC33253j.m105489e(1 * 4)), z13), j7, AbstractC17918w0.f69621a);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3358c);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
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
                    float f13 = ((float) 0.5d) * 8;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13, c2314t));
                    int i35 = (i19 >> 15) & 896;
                    AbstractC30795n.m94707h(str2, AbstractC34132o.m107879c(0.5f, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t)), j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingLabelStyle(), null, c28655q2, ((i19 >> 3) & 14) | i35, 0, 196600);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13, c2314t));
                    AbstractC30795n.m94707h(str, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q2, (i19 & 14) | i35, 0, 196088);
                    c28655q = c28655q2;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                    AbstractC30795n.m94707h(str4, AbstractC34132o.m107879c(0.5f, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t)), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSupportStyle(), null, c28655q2, ((i19 >> 6) & 14) | i35, 0, 196088);
                    AbstractC30007c.m91851u(c2314t, f13, c28655q, true);
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                }
                z15 = z13;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final String str5 = str4;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.t0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC27283u0.m82313l(str, str2, str5, abstractC27285v0, z15, interfaceC21083i, j7, j13, interfaceC4339a, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 24576;
            z13 = z4;
            if ((196608 & i13) == 0) {
                interfaceC21083i2 = interfaceC21083i;
                if (c28655q2.m87153g(interfaceC21083i2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            } else {
                interfaceC21083i2 = interfaceC21083i;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q2.m87151f(j7)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            if ((12582912 & i13) == 0) {
                int i36 = i15;
                if (c28655q2.m87151f(j13)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i18 = i36 | i25;
            } else {
                i18 = i15;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i24 = 67108864;
                } else {
                    i24 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i24;
            }
            i19 = i18;
            if ((i19 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i19 & 1, z14)) {
                if (i29 != 0) {
                    str4 = "";
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                C18027i c18027i2 = new C18027i(0);
                if ((i19 & 234881024) == 67108864) {
                }
                objM87133R = c28655q2.m87133R();
                if (z17) {
                    objM87133R = new C24679k(interfaceC4339a, 23);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C24679k(interfaceC4339a, 23);
                    c28655q2.m87172p0(objM87133R);
                }
                C2314t c2314t2 = C2314t.f9131w;
                z13 = z16;
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(AbstractC1092a.m3360e(c2314t2, interfaceC21083i2, null, z16, c18027i2, (InterfaceC4339a) objM87133R, 8), AbstractC33253j.m105489e(1 * 4)), z13), j7, AbstractC17918w0.f69621a);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3358c2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
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
                float f14 = ((float) 0.5d) * 8;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14, c2314t2));
                int i37 = (i19 >> 15) & 896;
                AbstractC30795n.m94707h(str2, AbstractC34132o.m107879c(0.5f, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t2)), j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingLabelStyle(), null, c28655q2, ((i19 >> 3) & 14) | i37, 0, 196600);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14, c2314t2));
                AbstractC30795n.m94707h(str, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t2), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q2, (i19 & 14) | i37, 0, 196088);
                c28655q = c28655q2;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t2));
                AbstractC30795n.m94707h(str4, AbstractC34132o.m107879c(0.5f, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t2)), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSupportStyle(), null, c28655q2, ((i19 >> 6) & 14) | i37, 0, 196088);
                AbstractC30007c.m91851u(c2314t2, f14, c28655q, true);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final String str6 = str4;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.t0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC27283u0.m82313l(str, str2, str6, abstractC27285v0, z15, interfaceC21083i, j7, j13, interfaceC4339a, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 384;
        str4 = str3;
        if ((i13 & 3072) == 0) {
            if ((i13 & 4096) == 0) {
                zM87157i = c28655q2.m87153g(abstractC27285v0);
            } else {
                zM87157i = c28655q2.m87157i(abstractC27285v0);
            }
            if (zM87157i) {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i28;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                if (c28655q2.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((196608 & i13) == 0) {
                interfaceC21083i2 = interfaceC21083i;
                if (c28655q2.m87153g(interfaceC21083i2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            } else {
                interfaceC21083i2 = interfaceC21083i;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q2.m87151f(j7)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            if ((12582912 & i13) == 0) {
                int i38 = i15;
                if (c28655q2.m87151f(j13)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i18 = i38 | i25;
            } else {
                i18 = i15;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i24 = 67108864;
                } else {
                    i24 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i24;
            }
            i19 = i18;
            if ((i19 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i19 & 1, z14)) {
                if (i29 != 0) {
                    str4 = "";
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                C18027i c18027i3 = new C18027i(0);
                if ((i19 & 234881024) == 67108864) {
                }
                objM87133R = c28655q2.m87133R();
                if (z17) {
                    objM87133R = new C24679k(interfaceC4339a, 23);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C24679k(interfaceC4339a, 23);
                    c28655q2.m87172p0(objM87133R);
                }
                C2314t c2314t3 = C2314t.f9131w;
                z13 = z16;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(AbstractC1092a.m3360e(c2314t3, interfaceC21083i2, null, z16, c18027i3, (InterfaceC4339a) objM87133R, 8), AbstractC33253j.m105489e(1 * 4)), z13), j7, AbstractC17918w0.f69621a);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3358c3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
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
                float f15 = ((float) 0.5d) * 8;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t3));
                int i39 = (i19 >> 15) & 896;
                AbstractC30795n.m94707h(str2, AbstractC34132o.m107879c(0.5f, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t3)), j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingLabelStyle(), null, c28655q2, ((i19 >> 3) & 14) | i39, 0, 196600);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t3));
                AbstractC30795n.m94707h(str, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t3), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q2, (i19 & 14) | i39, 0, 196088);
                c28655q = c28655q2;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t3));
                AbstractC30795n.m94707h(str4, AbstractC34132o.m107879c(0.5f, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t3)), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSupportStyle(), null, c28655q2, ((i19 >> 6) & 14) | i39, 0, 196088);
                AbstractC30007c.m91851u(c2314t3, f15, c28655q, true);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final String str7 = str4;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.t0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC27283u0.m82313l(str, str2, str7, abstractC27285v0, z15, interfaceC21083i, j7, j13, interfaceC4339a, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 24576;
        z13 = z4;
        if ((196608 & i13) == 0) {
            interfaceC21083i2 = interfaceC21083i;
            if (c28655q2.m87153g(interfaceC21083i2)) {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i27;
        } else {
            interfaceC21083i2 = interfaceC21083i;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q2.m87151f(j7)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i15 |= i26;
        }
        if ((12582912 & i13) == 0) {
            int i310 = i15;
            if (c28655q2.m87151f(j13)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i18 = i310 | i25;
        } else {
            i18 = i15;
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q2.m87157i(interfaceC4339a)) {
                i24 = 67108864;
            } else {
                i24 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i18 |= i24;
        }
        i19 = i18;
        if ((i19 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i19 & 1, z14)) {
            if (i29 != 0) {
                str4 = "";
            }
            if (i16 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            C18027i c18027i4 = new C18027i(0);
            if ((i19 & 234881024) == 67108864) {
            }
            objM87133R = c28655q2.m87133R();
            if (z17) {
                objM87133R = new C24679k(interfaceC4339a, 23);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C24679k(interfaceC4339a, 23);
                c28655q2.m87172p0(objM87133R);
            }
            C2314t c2314t4 = C2314t.f9131w;
            z13 = z16;
            Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(AbstractC1092a.m3360e(c2314t4, interfaceC21083i2, null, z16, c18027i4, (InterfaceC4339a) objM87133R, 8), AbstractC33253j.m105489e(1 * 4)), z13), j7, AbstractC17918w0.f69621a);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3358c4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
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
            float f16 = ((float) 0.5d) * 8;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f16, c2314t4));
            int i311 = (i19 >> 15) & 896;
            AbstractC30795n.m94707h(str2, AbstractC34132o.m107879c(0.5f, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t4)), j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingLabelStyle(), null, c28655q2, ((i19 >> 3) & 14) | i311, 0, 196600);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f16, c2314t4));
            AbstractC30795n.m94707h(str, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t4), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q2, (i19 & 14) | i311, 0, 196088);
            c28655q = c28655q2;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t4));
            AbstractC30795n.m94707h(str4, AbstractC34132o.m107879c(0.5f, AbstractC1099a.m3393o(abstractC27285v0.getPadding(), c2314t4)), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSupportStyle(), null, c28655q2, ((i19 >> 6) & 14) | i311, 0, 196088);
            AbstractC30007c.m91851u(c2314t4, f16, c28655q, true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final String str8 = str4;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.t0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC27283u0.m82313l(str, str2, str8, abstractC27285v0, z15, interfaceC21083i, j7, j13, interfaceC4339a, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m82312k(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m82313l(String str, String str2, String str3, AbstractC27285v0 abstractC27285v0, boolean z4, InterfaceC21083i interfaceC21083i, long j7, long j13, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m82311j(str, str2, str3, abstractC27285v0, z4, interfaceC21083i, j7, j13, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:107:0x0140  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x015f  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:125:0x0182  */
    /* JADX WARN: Code duplicated, block: B:128:0x0189 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x018b  */
    /* JADX WARN: Code duplicated, block: B:132:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:136:0x0202  */
    /* JADX WARN: Code duplicated, block: B:138:0x0210  */
    /* JADX WARN: Code duplicated, block: B:140:0x0260  */
    /* JADX WARN: Code duplicated, block: B:142:0x0273  */
    /* JADX WARN: Code duplicated, block: B:143:0x0275  */
    /* JADX WARN: Code duplicated, block: B:146:0x027c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x027e  */
    /* JADX WARN: Code duplicated, block: B:150:0x02de  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:156:0x0303  */
    /* JADX WARN: Code duplicated, block: B:160:0x036b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0379  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX INFO: renamed from: m */
    private static final void m82314m(Modifier modifier, final String str, final AbstractC27285v0 abstractC27285v0, final EnumC27251e1 enumC27251e1, boolean z4, final InterfaceC21083i interfaceC21083i, final long j7, final long j13, float f13, String str2, final InterfaceC4339a interfaceC4339a, Composer composer, final int i13, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        boolean z13;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z14;
        final Modifier modifier3;
        final boolean z15;
        final String str3;
        final float f14;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean z16;
        float f15;
        String str4;
        EnumC27251e1 enumC27251e2;
        C17916v0 c17916v0;
        Modifier modifier5;
        boolean z17;
        Object objM87133R;
        boolean z18;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z19;
        Object objM87133R2;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        int i26;
        int i27;
        int i28;
        int i29;
        C2307m c2307m = C2299e.f9102E;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1719158230);
        int i34 = i15 & 1;
        if (i34 != 0) {
            i16 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= (i13 & 512) == 0 ? c28655q.m87153g(abstractC27285v0) : c28655q.m87157i(abstractC27285v0) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i16 |= c28655q.m87149e(enumC27251e1.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i35 = i15 & 16;
        if (i35 == 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                i16 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87153g(interfaceC21083i)) {
                    i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i29;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87151f(j7)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i16 |= i28;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87151f(j13)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
            i17 = i15 & 256;
            if (i17 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87147d(f13)) {
                        i18 = 67108864;
                    } else {
                        i18 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 512;
                if (i19 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q.m87153g(str2)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i16 |= i24;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i14 | i26;
                } else {
                    i25 = i14;
                }
                if ((i16 & 306783379) == 306783378 || (i25 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i35 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i17 != 0) {
                        f15 = 1 * 4;
                    } else {
                        f15 = f13;
                    }
                    if (i19 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    enumC27251e2 = EnumC27251e1.FIXED;
                    c17916v0 = AbstractC17918w0.f69621a;
                    C28676v0 c28676v0 = C28635l.f115821a;
                    f13 = f15;
                    if (enumC27251e1 == enumC27251e2) {
                        c28655q.m87150e0(2042577810);
                        C18027i c18027i = new C18027i(0);
                        if ((i25 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z19 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C24679k(interfaceC4339a, 21);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3360e = AbstractC1092a.m3360e(modifier4, interfaceC21083i, null, z16, c18027i, (InterfaceC4339a) objM87133R2, 8);
                        modifier5 = modifier4;
                        boolean z24 = z16;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * 8, AbstractC15676d.m44101d(modifierM3360e, str4)), AbstractC33253j.m105489e(f13)), z24), j7, c17916v0);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        z18 = z24;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        AbstractC30795n.m94707h(str, null, j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q, ((i16 >> 3) & 14) | ((i16 >> 15) & 896), 0, 196090);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        modifier5 = modifier4;
                        c28655q.m87150e0(2043355910);
                        C18027i c18027i2 = new C18027i(0);
                        if ((i25 & 14) == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z17 || objM87133R == c28676v0) {
                            objM87133R = new C24679k(interfaceC4339a, 22);
                            c28655q.m87172p0(objM87133R);
                        }
                        boolean z25 = z16;
                        Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC15676d.m44101d(AbstractC1092a.m3360e(modifier5, interfaceC21083i, null, z16, c18027i2, (InterfaceC4339a) objM87133R, 8), str4), null, 3);
                        float f16 = 1;
                        Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(modifierM3427x, AbstractC33253j.m105489e(4 * f16)), z25), j7, c17916v0);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        z18 = z25;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
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
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        float f17 = 8;
                        float f18 = ((float) 1.5d) * f17;
                        float f19 = f16 * f17;
                        AbstractC30795n.m94707h(str, AbstractC1099a.m3393o(new C22976l1(f18, f19, f18, f19), c2314t), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q, ((i16 >> 3) & 14) | 48 | ((i16 >> 15) & 896), 0, 196088);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    z15 = z18;
                    modifier3 = modifier5;
                    str3 = str4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    str3 = str2;
                }
                f14 = f13;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.s0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC27283u0.m82317p(modifier3, str, abstractC27285v0, enumC27251e1, z15, interfaceC21083i, j7, j13, f14, str3, interfaceC4339a, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 100663296;
            i19 = i15 & 512;
            if (i19 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q.m87153g(str2)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i16 |= i24;
            }
            if ((i14 & 6) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i14 | i26;
            } else {
                i25 = i14;
            }
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i34 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i35 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i17 != 0) {
                    f15 = 1 * 4;
                } else {
                    f15 = f13;
                }
                if (i19 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                enumC27251e2 = EnumC27251e1.FIXED;
                c17916v0 = AbstractC17918w0.f69621a;
                C28676v0 c28676v1 = C28635l.f115821a;
                f13 = f15;
                if (enumC27251e1 == enumC27251e2) {
                    c28655q.m87150e0(2042577810);
                    C18027i c18027i3 = new C18027i(0);
                    if ((i25 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z19) {
                        objM87133R2 = new C24679k(interfaceC4339a, 21);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C24679k(interfaceC4339a, 21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifier4, interfaceC21083i, null, z16, c18027i3, (InterfaceC4339a) objM87133R2, 8);
                    modifier5 = modifier4;
                    boolean z26 = z16;
                    Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * 8, AbstractC15676d.m44101d(modifierM3360e2, str4)), AbstractC33253j.m105489e(f13)), z26), j7, c17916v0);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                    z18 = z26;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3358c3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    AbstractC30795n.m94707h(str, null, j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q, ((i16 >> 3) & 14) | ((i16 >> 15) & 896), 0, 196090);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    modifier5 = modifier4;
                    c28655q.m87150e0(2043355910);
                    C18027i c18027i4 = new C18027i(0);
                    if ((i25 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z17) {
                        objM87133R = new C24679k(interfaceC4339a, 22);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C24679k(interfaceC4339a, 22);
                        c28655q.m87172p0(objM87133R);
                    }
                    boolean z27 = z16;
                    Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC15676d.m44101d(AbstractC1092a.m3360e(modifier5, interfaceC21083i, null, z16, c18027i4, (InterfaceC4339a) objM87133R, 8), str4), null, 3);
                    float f110 = 1;
                    Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(modifierM3427x2, AbstractC33253j.m105489e(4 * f110)), z27), j7, c17916v0);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                    z18 = z27;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3358c4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    float f111 = 8;
                    float f112 = ((float) 1.5d) * f111;
                    float f113 = f110 * f111;
                    AbstractC30795n.m94707h(str, AbstractC1099a.m3393o(new C22976l1(f112, f113, f112, f113), c2314t), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q, ((i16 >> 3) & 14) | 48 | ((i16 >> 15) & 896), 0, 196088);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                z15 = z18;
                modifier3 = modifier5;
                str3 = str4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                str3 = str2;
            }
            f14 = f13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.s0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC27283u0.m82317p(modifier3, str, abstractC27285v0, enumC27251e1, z15, interfaceC21083i, j7, j13, f14, str3, interfaceC4339a, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        z13 = z4;
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87153g(interfaceC21083i)) {
                i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i29;
        }
        if ((i13 & 1572864) == 0) {
            if (c28655q.m87151f(j7)) {
                i28 = 1048576;
            } else {
                i28 = 524288;
            }
            i16 |= i28;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q.m87151f(j13)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i16 |= i27;
        }
        i17 = i15 & 256;
        if (i17 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87147d(f13)) {
                    i18 = 67108864;
                } else {
                    i18 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i18;
            }
            i19 = i15 & 512;
            if (i19 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q.m87153g(str2)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i16 |= i24;
            }
            if ((i14 & 6) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i14 | i26;
            } else {
                i25 = i14;
            }
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i34 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i35 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i17 != 0) {
                    f15 = 1 * 4;
                } else {
                    f15 = f13;
                }
                if (i19 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                enumC27251e2 = EnumC27251e1.FIXED;
                c17916v0 = AbstractC17918w0.f69621a;
                C28676v0 c28676v2 = C28635l.f115821a;
                f13 = f15;
                if (enumC27251e1 == enumC27251e2) {
                    c28655q.m87150e0(2042577810);
                    C18027i c18027i5 = new C18027i(0);
                    if ((i25 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z19) {
                        objM87133R2 = new C24679k(interfaceC4339a, 21);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C24679k(interfaceC4339a, 21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3360e3 = AbstractC1092a.m3360e(modifier4, interfaceC21083i, null, z16, c18027i5, (InterfaceC4339a) objM87133R2, 8);
                    modifier5 = modifier4;
                    boolean z28 = z16;
                    Modifier modifierM3358c5 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * 8, AbstractC15676d.m44101d(modifierM3360e3, str4)), AbstractC33253j.m105489e(f13)), z28), j7, c17916v0);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                    z18 = z28;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3358c5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    AbstractC30795n.m94707h(str, null, j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q, ((i16 >> 3) & 14) | ((i16 >> 15) & 896), 0, 196090);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    modifier5 = modifier4;
                    c28655q.m87150e0(2043355910);
                    C18027i c18027i6 = new C18027i(0);
                    if ((i25 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z17) {
                        objM87133R = new C24679k(interfaceC4339a, 22);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C24679k(interfaceC4339a, 22);
                        c28655q.m87172p0(objM87133R);
                    }
                    boolean z29 = z16;
                    Modifier modifierM3427x3 = AbstractC1102d.m3427x(AbstractC15676d.m44101d(AbstractC1092a.m3360e(modifier5, interfaceC21083i, null, z16, c18027i6, (InterfaceC4339a) objM87133R, 8), str4), null, 3);
                    float f114 = 1;
                    Modifier modifierM3358c6 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(modifierM3427x3, AbstractC33253j.m105489e(4 * f114)), z29), j7, c17916v0);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                    z18 = z29;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3358c6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    float f115 = 8;
                    float f116 = ((float) 1.5d) * f115;
                    float f117 = f114 * f115;
                    AbstractC30795n.m94707h(str, AbstractC1099a.m3393o(new C22976l1(f116, f117, f116, f117), c2314t), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q, ((i16 >> 3) & 14) | 48 | ((i16 >> 15) & 896), 0, 196088);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                z15 = z18;
                modifier3 = modifier5;
                str3 = str4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                str3 = str2;
            }
            f14 = f13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.s0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC27283u0.m82317p(modifier3, str, abstractC27285v0, enumC27251e1, z15, interfaceC21083i, j7, j13, f14, str3, interfaceC4339a, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 100663296;
        i19 = i15 & 512;
        if (i19 != 0) {
            i16 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c28655q.m87153g(str2)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i16 |= i24;
        }
        if ((i14 & 6) == 0) {
            if (c28655q.m87157i(interfaceC4339a)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i25 = i14 | i26;
        } else {
            i25 = i14;
        }
        if ((i16 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i34 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i35 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            if (i17 != 0) {
                f15 = 1 * 4;
            } else {
                f15 = f13;
            }
            if (i19 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            enumC27251e2 = EnumC27251e1.FIXED;
            c17916v0 = AbstractC17918w0.f69621a;
            C28676v0 c28676v3 = C28635l.f115821a;
            f13 = f15;
            if (enumC27251e1 == enumC27251e2) {
                c28655q.m87150e0(2042577810);
                C18027i c18027i7 = new C18027i(0);
                if ((i25 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z19) {
                    objM87133R2 = new C24679k(interfaceC4339a, 21);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C24679k(interfaceC4339a, 21);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3360e4 = AbstractC1092a.m3360e(modifier4, interfaceC21083i, null, z16, c18027i7, (InterfaceC4339a) objM87133R2, 8);
                modifier5 = modifier4;
                boolean z210 = z16;
                Modifier modifierM3358c7 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * 8, AbstractC15676d.m44101d(modifierM3360e4, str4)), AbstractC33253j.m105489e(f13)), z210), j7, c17916v0);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
                z18 = z210;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3358c7);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                AbstractC30795n.m94707h(str, null, j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q, ((i16 >> 3) & 14) | ((i16 >> 15) & 896), 0, 196090);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                modifier5 = modifier4;
                c28655q.m87150e0(2043355910);
                C18027i c18027i8 = new C18027i(0);
                if ((i25 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z17) {
                    objM87133R = new C24679k(interfaceC4339a, 22);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C24679k(interfaceC4339a, 22);
                    c28655q.m87172p0(objM87133R);
                }
                boolean z211 = z16;
                Modifier modifierM3427x4 = AbstractC1102d.m3427x(AbstractC15676d.m44101d(AbstractC1092a.m3360e(modifier5, interfaceC21083i, null, z16, c18027i8, (InterfaceC4339a) objM87133R, 8), str4), null, 3);
                float f118 = 1;
                Modifier modifierM3358c8 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC37056f.m118994r(modifierM3427x4, AbstractC33253j.m105489e(4 * f118)), z211), j7, c17916v0);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                z18 = z211;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3358c8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                float f119 = 8;
                float f1110 = ((float) 1.5d) * f119;
                float f1111 = f118 * f119;
                AbstractC30795n.m94707h(str, AbstractC1099a.m3393o(new C22976l1(f1110, f1111, f1110, f1111), c2314t), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, abstractC27285v0.getSettingStyle(), null, c28655q, ((i16 >> 3) & 14) | 48 | ((i16 >> 15) & 896), 0, 196088);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            z15 = z18;
            modifier3 = modifier5;
            str3 = str4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
            str3 = str2;
        }
        f14 = f13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.s0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC27283u0.m82317p(modifier3, str, abstractC27285v0, enumC27251e1, z15, interfaceC21083i, j7, j13, f14, str3, interfaceC4339a, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m82315n(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m82316o(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m82317p(Modifier modifier, String str, AbstractC27285v0 abstractC27285v0, EnumC27251e1 enumC27251e1, boolean z4, InterfaceC21083i interfaceC21083i, long j7, long j13, float f13, String str2, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15, Composer composer, int i16) {
        m82314m(modifier, str, abstractC27285v0, enumC27251e1, z4, interfaceC21083i, j7, j13, f13, str2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:107:0x014d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0150  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x0157  */
    /* JADX WARN: Code duplicated, block: B:113:0x015b  */
    /* JADX WARN: Code duplicated, block: B:114:0x015d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:117:0x0167  */
    /* JADX WARN: Code duplicated, block: B:119:0x016b  */
    /* JADX WARN: Code duplicated, block: B:120:0x016e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0173  */
    /* JADX WARN: Code duplicated, block: B:124:0x0188  */
    /* JADX WARN: Code duplicated, block: B:126:0x0197  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:142:0x0234  */
    /* JADX WARN: Code duplicated, block: B:144:0x023c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0251  */
    /* JADX WARN: Code duplicated, block: B:149:0x025d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0260  */
    /* JADX WARN: Code duplicated, block: B:153:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x026e  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:171:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:180:0x0339  */
    /* JADX WARN: Code duplicated, block: B:183:0x034a  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0104  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112  */
    /* JADX WARN: Code duplicated, block: B:88:0x0115  */
    /* JADX WARN: Code duplicated, block: B:92:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    /* JADX WARN: Code duplicated, block: B:99:0x0139  */
    /* JADX INFO: renamed from: q */
    public static final void m82318q(Modifier modifier, final String settingText, String str, String str2, final AbstractC27285v0 type, final boolean z4, boolean z13, float f13, String str3, final InterfaceC4339a onClick, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        String str4;
        int i16;
        String str5;
        int i17;
        int i18;
        int i19;
        boolean z14;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z15;
        final String str6;
        final Modifier modifier3;
        final String str7;
        final String str8;
        final boolean z16;
        final float f14;
        C28677v1 c28677v1M87180u;
        String str9;
        String str10;
        boolean z17;
        float f15;
        String str11;
        boolean z18;
        long jM95628d;
        long jM95624D;
        boolean z19;
        C28676v0 c28676v0;
        Modifier modifier4;
        int i29;
        long j7;
        boolean z24;
        float f16;
        Object objM87133R;
        boolean z25;
        Object objM87133R2;
        Modifier modifier5;
        String str12;
        String str13;
        boolean z26;
        Object objM87133R3;
        boolean z27;
        Object objM87133R4;
        boolean z28;
        Object objM87133R5;
        boolean z29;
        Object objM87133R6;
        int i34;
        int i35;
        boolean zM87157i;
        int i36;
        AbstractC22676k.m65750j(settingText, "settingText");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-677227802);
        int i37 = i14 & 1;
        if (i37 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(settingText) ? 32 : 16;
        }
        int i38 = i14 & 4;
        if (i38 == 0) {
            if ((i13 & 384) == 0) {
                str4 = str;
                i15 |= c28655q.m87153g(str4) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    str5 = str2;
                    if (c28655q.m87153g(str5)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if ((32768 & i13) == 0) {
                        zM87157i = c28655q.m87153g(type);
                    } else {
                        zM87157i = c28655q.m87157i(type);
                    }
                    if (zM87157i) {
                        i36 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i36 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i36;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z4)) {
                        i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i35;
                }
                i18 = i14 & 64;
                if (i18 != 0) {
                    i15 |= 1572864;
                    i19 = 196608;
                    z14 = z13;
                } else {
                    i19 = 196608;
                    z14 = z13;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z14)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i15 |= i24;
                    }
                }
                i25 = i14 & 128;
                if (i25 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q.m87147d(f13)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i15 |= i26;
                }
                i27 = i14 & 256;
                if (i27 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q.m87153g(str3)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i28;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q.m87157i(onClick)) {
                            i34 = 536870912;
                        } else {
                            i34 = 268435456;
                        }
                        i15 |= i34;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z15)) {
                        if (i37 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i38 != 0) {
                            str9 = "";
                        } else {
                            str9 = str4;
                        }
                        if (i16 != 0) {
                            str10 = "";
                        } else {
                            str10 = str5;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i25 != 0) {
                            f15 = 1 * 4;
                        } else {
                            f15 = f13;
                        }
                        if (i27 != 0) {
                            str11 = null;
                        } else {
                            str11 = str3;
                        }
                        if (z4) {
                            c28655q.m87150e0(2019123148);
                            jM95628d = C38070b.f163049a.m121943a(c28655q, 6).getActive();
                            z18 = false;
                            c28655q.m87173q(false);
                        } else {
                            z18 = false;
                            c28655q.m87150e0(2019124109);
                            jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                        }
                        if (z4) {
                            c28655q.m87150e0(2019126032);
                            jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, z18);
                        } else {
                            c28655q.m87150e0(2019127120);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, z18);
                        }
                        z19 = type instanceof AbstractC27285v0.d;
                        c28676v0 = C28635l.f115821a;
                        if (z19) {
                            c28655q.m87150e0(-1831482507);
                            z28 = z18;
                            AbstractC27285v0.d dVar = (AbstractC27285v0.d) type;
                            EnumC27251e1 enumC27251e1M82328e = dVar.getWidthType();
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC11266d.m30453g(c28655q);
                            }
                            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R5;
                            if ((i15 & 1879048192) == 536870912) {
                                z29 = true;
                            } else {
                                z29 = z28;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z29 || objM87133R6 == c28676v0) {
                                objM87133R6 = new C24679k(onClick, 18);
                                c28655q.m87172p0(objM87133R6);
                            }
                            int i39 = i15 >> 6;
                            Modifier modifier6 = modifier2;
                            m82314m(modifier6, settingText, dVar, enumC27251e1M82328e, z17, interfaceC21083i, jM95628d, jM95624D, 0.0f, str11, (InterfaceC4339a) objM87133R6, c28655q, (i39 & 896) | (i15 & 14) | i19 | (i15 & 112) | (i39 & 57344) | ((i15 << 3) & 1879048192), 0, 256);
                            c28655q.m87173q(false);
                            modifier5 = modifier6;
                            f16 = f15;
                            str12 = str9;
                            str13 = str10;
                        } else {
                            modifier4 = modifier2;
                            i29 = i15;
                            j7 = jM95624D;
                            if (type instanceof AbstractC27285v0.c) {
                                c28655q.m87150e0(-1830974448);
                                z26 = z18;
                                AbstractC27285v0.c cVar = (AbstractC27285v0.c) type;
                                EnumC27251e1 enumC27251e1M82327e = cVar.getWidthType();
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = AbstractC11266d.m30453g(c28655q);
                                }
                                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R3;
                                if ((i29 & 1879048192) == 536870912) {
                                    z27 = true;
                                } else {
                                    z27 = z26;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z27 || objM87133R4 == c28676v0) {
                                    objM87133R4 = new C24679k(onClick, 19);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                int i44 = i29 >> 6;
                                int i45 = i29 << 3;
                                float f17 = f15;
                                m82314m(modifier4, settingText, cVar, enumC27251e1M82327e, z17, interfaceC21083i2, jM95628d, j7, f17, str11, (InterfaceC4339a) objM87133R4, c28655q, (i44 & 896) | (i29 & 14) | i19 | (i29 & 112) | (i44 & 57344) | (234881024 & i45) | (i45 & 1879048192), 0, 0);
                                f16 = f17;
                                c28655q.m87173q(false);
                                modifier5 = modifier4;
                                str12 = str9;
                                str13 = str10;
                            } else {
                                z24 = z18;
                                f16 = f15;
                                if (type.equals(AbstractC27285v0.b.f109204d) && !(type instanceof AbstractC27285v0.a)) {
                                    throw AbstractC11895b.m32003v(2019129204, c28655q, z24);
                                }
                                c28655q.m87150e0(-1830414836);
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = AbstractC11266d.m30453g(c28655q);
                                }
                                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                                if ((i29 & 1879048192) == 536870912) {
                                    z25 = true;
                                } else {
                                    z25 = z24;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z25 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C24679k(onClick, 20);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                int i46 = i29 >> 3;
                                int i47 = (i46 & 896) | (i46 & 14) | i19 | (i46 & 112) | (i46 & 7168) | ((i29 >> 6) & 57344);
                                modifier5 = modifier4;
                                str12 = str9;
                                str13 = str10;
                                m82311j(settingText, str12, str13, type, z17, interfaceC21083i3, jM95628d, j7, (InterfaceC4339a) objM87133R2, c28655q, i47, 0);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            }
                        }
                        str7 = str12;
                        z16 = z17;
                        f14 = f16;
                        str6 = str11;
                        modifier3 = modifier5;
                        str8 = str13;
                    } else {
                        c28655q.m87138X();
                        str6 = str3;
                        modifier3 = modifier2;
                        str7 = str4;
                        str8 = str5;
                        z16 = z14;
                        f14 = f13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.r0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                return AbstractC27283u0.m82322u(modifier3, settingText, str7, str8, type, z4, z16, f14, str6, onClick, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        };
                    }
                }
                i15 |= 100663296;
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(onClick)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i15 |= i34;
                }
                if ((i15 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    if (i37 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i38 != 0) {
                        str9 = "";
                    } else {
                        str9 = str4;
                    }
                    if (i16 != 0) {
                        str10 = "";
                    } else {
                        str10 = str5;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i25 != 0) {
                        f15 = 1 * 4;
                    } else {
                        f15 = f13;
                    }
                    if (i27 != 0) {
                        str11 = null;
                    } else {
                        str11 = str3;
                    }
                    if (z4) {
                        c28655q.m87150e0(2019123148);
                        jM95628d = C38070b.f163049a.m121943a(c28655q, 6).getActive();
                        z18 = false;
                        c28655q.m87173q(false);
                    } else {
                        z18 = false;
                        c28655q.m87150e0(2019124109);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    }
                    if (z4) {
                        c28655q.m87150e0(2019126032);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, z18);
                    } else {
                        c28655q.m87150e0(2019127120);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, z18);
                    }
                    z19 = type instanceof AbstractC27285v0.d;
                    c28676v0 = C28635l.f115821a;
                    if (z19) {
                        c28655q.m87150e0(-1831482507);
                        z28 = z18;
                        AbstractC27285v0.d dVar2 = (AbstractC27285v0.d) type;
                        EnumC27251e1 enumC27251e1M82328e2 = dVar2.getWidthType();
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R5;
                        if ((i15 & 1879048192) == 536870912) {
                            z29 = true;
                        } else {
                            z29 = z28;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z29) {
                            objM87133R6 = new C24679k(onClick, 18);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C24679k(onClick, 18);
                            c28655q.m87172p0(objM87133R6);
                        }
                        int i310 = i15 >> 6;
                        Modifier modifier7 = modifier2;
                        m82314m(modifier7, settingText, dVar2, enumC27251e1M82328e2, z17, interfaceC21083i4, jM95628d, jM95624D, 0.0f, str11, (InterfaceC4339a) objM87133R6, c28655q, (i310 & 896) | (i15 & 14) | i19 | (i15 & 112) | (i310 & 57344) | ((i15 << 3) & 1879048192), 0, 256);
                        c28655q.m87173q(false);
                        modifier5 = modifier7;
                        f16 = f15;
                        str12 = str9;
                        str13 = str10;
                    } else {
                        modifier4 = modifier2;
                        i29 = i15;
                        j7 = jM95624D;
                        if (type instanceof AbstractC27285v0.c) {
                            c28655q.m87150e0(-1830974448);
                            z26 = z18;
                            AbstractC27285v0.c cVar2 = (AbstractC27285v0.c) type;
                            EnumC27251e1 enumC27251e1M82327e2 = cVar2.getWidthType();
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC11266d.m30453g(c28655q);
                            }
                            InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R3;
                            if ((i29 & 1879048192) == 536870912) {
                                z27 = true;
                            } else {
                                z27 = z26;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z27) {
                                objM87133R4 = new C24679k(onClick, 19);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C24679k(onClick, 19);
                                c28655q.m87172p0(objM87133R4);
                            }
                            int i48 = i29 >> 6;
                            int i49 = i29 << 3;
                            float f18 = f15;
                            m82314m(modifier4, settingText, cVar2, enumC27251e1M82327e2, z17, interfaceC21083i5, jM95628d, j7, f18, str11, (InterfaceC4339a) objM87133R4, c28655q, (i48 & 896) | (i29 & 14) | i19 | (i29 & 112) | (i48 & 57344) | (234881024 & i49) | (i49 & 1879048192), 0, 0);
                            f16 = f18;
                            c28655q.m87173q(false);
                            modifier5 = modifier4;
                            str12 = str9;
                            str13 = str10;
                        } else {
                            z24 = z18;
                            f16 = f15;
                            if (type.equals(AbstractC27285v0.b.f109204d)) {
                            }
                            c28655q.m87150e0(-1830414836);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC11266d.m30453g(c28655q);
                            }
                            InterfaceC21083i interfaceC21083i6 = (InterfaceC21083i) objM87133R;
                            if ((i29 & 1879048192) == 536870912) {
                                z25 = true;
                            } else {
                                z25 = z24;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z25) {
                                objM87133R2 = new C24679k(onClick, 20);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C24679k(onClick, 20);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i410 = i29 >> 3;
                            int i411 = (i410 & 896) | (i410 & 14) | i19 | (i410 & 112) | (i410 & 7168) | ((i29 >> 6) & 57344);
                            modifier5 = modifier4;
                            str12 = str9;
                            str13 = str10;
                            m82311j(settingText, str12, str13, type, z17, interfaceC21083i6, jM95628d, j7, (InterfaceC4339a) objM87133R2, c28655q, i411, 0);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                    }
                    str7 = str12;
                    z16 = z17;
                    f14 = f16;
                    str6 = str11;
                    modifier3 = modifier5;
                    str8 = str13;
                } else {
                    c28655q.m87138X();
                    str6 = str3;
                    modifier3 = modifier2;
                    str7 = str4;
                    str8 = str5;
                    z16 = z14;
                    f14 = f13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC27283u0.m82322u(modifier3, settingText, str7, str8, type, z4, z16, f14, str6, onClick, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i15 |= 3072;
            str5 = str2;
            if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q.m87153g(type);
                } else {
                    zM87157i = c28655q.m87157i(type);
                }
                if (zM87157i) {
                    i36 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i36 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i36;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z4)) {
                    i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i35;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
                i19 = 196608;
                z14 = z13;
            } else {
                i19 = 196608;
                z14 = z13;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i15 |= i24;
                }
            }
            i25 = i14 & 128;
            if (i25 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q.m87147d(f13)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i15 |= i26;
            }
            i27 = i14 & 256;
            if (i27 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87153g(str3)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i28;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(onClick)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i15 |= i34;
                }
                if ((i15 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    if (i37 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i38 != 0) {
                        str9 = "";
                    } else {
                        str9 = str4;
                    }
                    if (i16 != 0) {
                        str10 = "";
                    } else {
                        str10 = str5;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i25 != 0) {
                        f15 = 1 * 4;
                    } else {
                        f15 = f13;
                    }
                    if (i27 != 0) {
                        str11 = null;
                    } else {
                        str11 = str3;
                    }
                    if (z4) {
                        c28655q.m87150e0(2019123148);
                        jM95628d = C38070b.f163049a.m121943a(c28655q, 6).getActive();
                        z18 = false;
                        c28655q.m87173q(false);
                    } else {
                        z18 = false;
                        c28655q.m87150e0(2019124109);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    }
                    if (z4) {
                        c28655q.m87150e0(2019126032);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, z18);
                    } else {
                        c28655q.m87150e0(2019127120);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, z18);
                    }
                    z19 = type instanceof AbstractC27285v0.d;
                    c28676v0 = C28635l.f115821a;
                    if (z19) {
                        c28655q.m87150e0(-1831482507);
                        z28 = z18;
                        AbstractC27285v0.d dVar3 = (AbstractC27285v0.d) type;
                        EnumC27251e1 enumC27251e1M82328e3 = dVar3.getWidthType();
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i7 = (InterfaceC21083i) objM87133R5;
                        if ((i15 & 1879048192) == 536870912) {
                            z29 = true;
                        } else {
                            z29 = z28;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z29) {
                            objM87133R6 = new C24679k(onClick, 18);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C24679k(onClick, 18);
                            c28655q.m87172p0(objM87133R6);
                        }
                        int i311 = i15 >> 6;
                        Modifier modifier8 = modifier2;
                        m82314m(modifier8, settingText, dVar3, enumC27251e1M82328e3, z17, interfaceC21083i7, jM95628d, jM95624D, 0.0f, str11, (InterfaceC4339a) objM87133R6, c28655q, (i311 & 896) | (i15 & 14) | i19 | (i15 & 112) | (i311 & 57344) | ((i15 << 3) & 1879048192), 0, 256);
                        c28655q.m87173q(false);
                        modifier5 = modifier8;
                        f16 = f15;
                        str12 = str9;
                        str13 = str10;
                    } else {
                        modifier4 = modifier2;
                        i29 = i15;
                        j7 = jM95624D;
                        if (type instanceof AbstractC27285v0.c) {
                            c28655q.m87150e0(-1830974448);
                            z26 = z18;
                            AbstractC27285v0.c cVar3 = (AbstractC27285v0.c) type;
                            EnumC27251e1 enumC27251e1M82327e3 = cVar3.getWidthType();
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC11266d.m30453g(c28655q);
                            }
                            InterfaceC21083i interfaceC21083i8 = (InterfaceC21083i) objM87133R3;
                            if ((i29 & 1879048192) == 536870912) {
                                z27 = true;
                            } else {
                                z27 = z26;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z27) {
                                objM87133R4 = new C24679k(onClick, 19);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C24679k(onClick, 19);
                                c28655q.m87172p0(objM87133R4);
                            }
                            int i412 = i29 >> 6;
                            int i413 = i29 << 3;
                            float f19 = f15;
                            m82314m(modifier4, settingText, cVar3, enumC27251e1M82327e3, z17, interfaceC21083i8, jM95628d, j7, f19, str11, (InterfaceC4339a) objM87133R4, c28655q, (i412 & 896) | (i29 & 14) | i19 | (i29 & 112) | (i412 & 57344) | (234881024 & i413) | (i413 & 1879048192), 0, 0);
                            f16 = f19;
                            c28655q.m87173q(false);
                            modifier5 = modifier4;
                            str12 = str9;
                            str13 = str10;
                        } else {
                            z24 = z18;
                            f16 = f15;
                            if (type.equals(AbstractC27285v0.b.f109204d)) {
                            }
                            c28655q.m87150e0(-1830414836);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC11266d.m30453g(c28655q);
                            }
                            InterfaceC21083i interfaceC21083i9 = (InterfaceC21083i) objM87133R;
                            if ((i29 & 1879048192) == 536870912) {
                                z25 = true;
                            } else {
                                z25 = z24;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z25) {
                                objM87133R2 = new C24679k(onClick, 20);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C24679k(onClick, 20);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i414 = i29 >> 3;
                            int i415 = (i414 & 896) | (i414 & 14) | i19 | (i414 & 112) | (i414 & 7168) | ((i29 >> 6) & 57344);
                            modifier5 = modifier4;
                            str12 = str9;
                            str13 = str10;
                            m82311j(settingText, str12, str13, type, z17, interfaceC21083i9, jM95628d, j7, (InterfaceC4339a) objM87133R2, c28655q, i415, 0);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                    }
                    str7 = str12;
                    z16 = z17;
                    f14 = f16;
                    str6 = str11;
                    modifier3 = modifier5;
                    str8 = str13;
                } else {
                    c28655q.m87138X();
                    str6 = str3;
                    modifier3 = modifier2;
                    str7 = str4;
                    str8 = str5;
                    z16 = z14;
                    f14 = f13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC27283u0.m82322u(modifier3, settingText, str7, str8, type, z4, z16, f14, str6, onClick, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i15 |= 100663296;
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i15 |= i34;
            }
            if ((i15 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                if (i37 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i38 != 0) {
                    str9 = "";
                } else {
                    str9 = str4;
                }
                if (i16 != 0) {
                    str10 = "";
                } else {
                    str10 = str5;
                }
                if (i18 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i25 != 0) {
                    f15 = 1 * 4;
                } else {
                    f15 = f13;
                }
                if (i27 != 0) {
                    str11 = null;
                } else {
                    str11 = str3;
                }
                if (z4) {
                    c28655q.m87150e0(2019123148);
                    jM95628d = C38070b.f163049a.m121943a(c28655q, 6).getActive();
                    z18 = false;
                    c28655q.m87173q(false);
                } else {
                    z18 = false;
                    c28655q.m87150e0(2019124109);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z4) {
                    c28655q.m87150e0(2019126032);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, z18);
                } else {
                    c28655q.m87150e0(2019127120);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, z18);
                }
                z19 = type instanceof AbstractC27285v0.d;
                c28676v0 = C28635l.f115821a;
                if (z19) {
                    c28655q.m87150e0(-1831482507);
                    z28 = z18;
                    AbstractC27285v0.d dVar4 = (AbstractC27285v0.d) type;
                    EnumC27251e1 enumC27251e1M82328e4 = dVar4.getWidthType();
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i10 = (InterfaceC21083i) objM87133R5;
                    if ((i15 & 1879048192) == 536870912) {
                        z29 = true;
                    } else {
                        z29 = z28;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z29) {
                        objM87133R6 = new C24679k(onClick, 18);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C24679k(onClick, 18);
                        c28655q.m87172p0(objM87133R6);
                    }
                    int i312 = i15 >> 6;
                    Modifier modifier9 = modifier2;
                    m82314m(modifier9, settingText, dVar4, enumC27251e1M82328e4, z17, interfaceC21083i10, jM95628d, jM95624D, 0.0f, str11, (InterfaceC4339a) objM87133R6, c28655q, (i312 & 896) | (i15 & 14) | i19 | (i15 & 112) | (i312 & 57344) | ((i15 << 3) & 1879048192), 0, 256);
                    c28655q.m87173q(false);
                    modifier5 = modifier9;
                    f16 = f15;
                    str12 = str9;
                    str13 = str10;
                } else {
                    modifier4 = modifier2;
                    i29 = i15;
                    j7 = jM95624D;
                    if (type instanceof AbstractC27285v0.c) {
                        c28655q.m87150e0(-1830974448);
                        z26 = z18;
                        AbstractC27285v0.c cVar4 = (AbstractC27285v0.c) type;
                        EnumC27251e1 enumC27251e1M82327e4 = cVar4.getWidthType();
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i11 = (InterfaceC21083i) objM87133R3;
                        if ((i29 & 1879048192) == 536870912) {
                            z27 = true;
                        } else {
                            z27 = z26;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z27) {
                            objM87133R4 = new C24679k(onClick, 19);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C24679k(onClick, 19);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i416 = i29 >> 6;
                        int i417 = i29 << 3;
                        float f110 = f15;
                        m82314m(modifier4, settingText, cVar4, enumC27251e1M82327e4, z17, interfaceC21083i11, jM95628d, j7, f110, str11, (InterfaceC4339a) objM87133R4, c28655q, (i416 & 896) | (i29 & 14) | i19 | (i29 & 112) | (i416 & 57344) | (234881024 & i417) | (i417 & 1879048192), 0, 0);
                        f16 = f110;
                        c28655q.m87173q(false);
                        modifier5 = modifier4;
                        str12 = str9;
                        str13 = str10;
                    } else {
                        z24 = z18;
                        f16 = f15;
                        if (type.equals(AbstractC27285v0.b.f109204d)) {
                        }
                        c28655q.m87150e0(-1830414836);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i12 = (InterfaceC21083i) objM87133R;
                        if ((i29 & 1879048192) == 536870912) {
                            z25 = true;
                        } else {
                            z25 = z24;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z25) {
                            objM87133R2 = new C24679k(onClick, 20);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C24679k(onClick, 20);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i418 = i29 >> 3;
                        int i419 = (i418 & 896) | (i418 & 14) | i19 | (i418 & 112) | (i418 & 7168) | ((i29 >> 6) & 57344);
                        modifier5 = modifier4;
                        str12 = str9;
                        str13 = str10;
                        m82311j(settingText, str12, str13, type, z17, interfaceC21083i12, jM95628d, j7, (InterfaceC4339a) objM87133R2, c28655q, i419, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                }
                str7 = str12;
                z16 = z17;
                f14 = f16;
                str6 = str11;
                modifier3 = modifier5;
                str8 = str13;
            } else {
                c28655q.m87138X();
                str6 = str3;
                modifier3 = modifier2;
                str7 = str4;
                str8 = str5;
                z16 = z14;
                f14 = f13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.r0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC27283u0.m82322u(modifier3, settingText, str7, str8, type, z4, z16, f14, str6, onClick, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 384;
        str4 = str;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                str5 = str2;
                if (c28655q.m87153g(str5)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q.m87153g(type);
                } else {
                    zM87157i = c28655q.m87157i(type);
                }
                if (zM87157i) {
                    i36 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i36 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i36;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z4)) {
                    i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i35;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
                i19 = 196608;
                z14 = z13;
            } else {
                i19 = 196608;
                z14 = z13;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i15 |= i24;
                }
            }
            i25 = i14 & 128;
            if (i25 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q.m87147d(f13)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i15 |= i26;
            }
            i27 = i14 & 256;
            if (i27 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87153g(str3)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i28;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(onClick)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i15 |= i34;
                }
                if ((i15 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    if (i37 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i38 != 0) {
                        str9 = "";
                    } else {
                        str9 = str4;
                    }
                    if (i16 != 0) {
                        str10 = "";
                    } else {
                        str10 = str5;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i25 != 0) {
                        f15 = 1 * 4;
                    } else {
                        f15 = f13;
                    }
                    if (i27 != 0) {
                        str11 = null;
                    } else {
                        str11 = str3;
                    }
                    if (z4) {
                        c28655q.m87150e0(2019123148);
                        jM95628d = C38070b.f163049a.m121943a(c28655q, 6).getActive();
                        z18 = false;
                        c28655q.m87173q(false);
                    } else {
                        z18 = false;
                        c28655q.m87150e0(2019124109);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    }
                    if (z4) {
                        c28655q.m87150e0(2019126032);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, z18);
                    } else {
                        c28655q.m87150e0(2019127120);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, z18);
                    }
                    z19 = type instanceof AbstractC27285v0.d;
                    c28676v0 = C28635l.f115821a;
                    if (z19) {
                        c28655q.m87150e0(-1831482507);
                        z28 = z18;
                        AbstractC27285v0.d dVar5 = (AbstractC27285v0.d) type;
                        EnumC27251e1 enumC27251e1M82328e5 = dVar5.getWidthType();
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i13 = (InterfaceC21083i) objM87133R5;
                        if ((i15 & 1879048192) == 536870912) {
                            z29 = true;
                        } else {
                            z29 = z28;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z29) {
                            objM87133R6 = new C24679k(onClick, 18);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C24679k(onClick, 18);
                            c28655q.m87172p0(objM87133R6);
                        }
                        int i313 = i15 >> 6;
                        Modifier modifier10 = modifier2;
                        m82314m(modifier10, settingText, dVar5, enumC27251e1M82328e5, z17, interfaceC21083i13, jM95628d, jM95624D, 0.0f, str11, (InterfaceC4339a) objM87133R6, c28655q, (i313 & 896) | (i15 & 14) | i19 | (i15 & 112) | (i313 & 57344) | ((i15 << 3) & 1879048192), 0, 256);
                        c28655q.m87173q(false);
                        modifier5 = modifier10;
                        f16 = f15;
                        str12 = str9;
                        str13 = str10;
                    } else {
                        modifier4 = modifier2;
                        i29 = i15;
                        j7 = jM95624D;
                        if (type instanceof AbstractC27285v0.c) {
                            c28655q.m87150e0(-1830974448);
                            z26 = z18;
                            AbstractC27285v0.c cVar5 = (AbstractC27285v0.c) type;
                            EnumC27251e1 enumC27251e1M82327e5 = cVar5.getWidthType();
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC11266d.m30453g(c28655q);
                            }
                            InterfaceC21083i interfaceC21083i14 = (InterfaceC21083i) objM87133R3;
                            if ((i29 & 1879048192) == 536870912) {
                                z27 = true;
                            } else {
                                z27 = z26;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z27) {
                                objM87133R4 = new C24679k(onClick, 19);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C24679k(onClick, 19);
                                c28655q.m87172p0(objM87133R4);
                            }
                            int i4110 = i29 >> 6;
                            int i4111 = i29 << 3;
                            float f111 = f15;
                            m82314m(modifier4, settingText, cVar5, enumC27251e1M82327e5, z17, interfaceC21083i14, jM95628d, j7, f111, str11, (InterfaceC4339a) objM87133R4, c28655q, (i4110 & 896) | (i29 & 14) | i19 | (i29 & 112) | (i4110 & 57344) | (234881024 & i4111) | (i4111 & 1879048192), 0, 0);
                            f16 = f111;
                            c28655q.m87173q(false);
                            modifier5 = modifier4;
                            str12 = str9;
                            str13 = str10;
                        } else {
                            z24 = z18;
                            f16 = f15;
                            if (type.equals(AbstractC27285v0.b.f109204d)) {
                            }
                            c28655q.m87150e0(-1830414836);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC11266d.m30453g(c28655q);
                            }
                            InterfaceC21083i interfaceC21083i15 = (InterfaceC21083i) objM87133R;
                            if ((i29 & 1879048192) == 536870912) {
                                z25 = true;
                            } else {
                                z25 = z24;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z25) {
                                objM87133R2 = new C24679k(onClick, 20);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C24679k(onClick, 20);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i4112 = i29 >> 3;
                            int i4113 = (i4112 & 896) | (i4112 & 14) | i19 | (i4112 & 112) | (i4112 & 7168) | ((i29 >> 6) & 57344);
                            modifier5 = modifier4;
                            str12 = str9;
                            str13 = str10;
                            m82311j(settingText, str12, str13, type, z17, interfaceC21083i15, jM95628d, j7, (InterfaceC4339a) objM87133R2, c28655q, i4113, 0);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                    }
                    str7 = str12;
                    z16 = z17;
                    f14 = f16;
                    str6 = str11;
                    modifier3 = modifier5;
                    str8 = str13;
                } else {
                    c28655q.m87138X();
                    str6 = str3;
                    modifier3 = modifier2;
                    str7 = str4;
                    str8 = str5;
                    z16 = z14;
                    f14 = f13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC27283u0.m82322u(modifier3, settingText, str7, str8, type, z4, z16, f14, str6, onClick, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i15 |= 100663296;
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i15 |= i34;
            }
            if ((i15 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                if (i37 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i38 != 0) {
                    str9 = "";
                } else {
                    str9 = str4;
                }
                if (i16 != 0) {
                    str10 = "";
                } else {
                    str10 = str5;
                }
                if (i18 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i25 != 0) {
                    f15 = 1 * 4;
                } else {
                    f15 = f13;
                }
                if (i27 != 0) {
                    str11 = null;
                } else {
                    str11 = str3;
                }
                if (z4) {
                    c28655q.m87150e0(2019123148);
                    jM95628d = C38070b.f163049a.m121943a(c28655q, 6).getActive();
                    z18 = false;
                    c28655q.m87173q(false);
                } else {
                    z18 = false;
                    c28655q.m87150e0(2019124109);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z4) {
                    c28655q.m87150e0(2019126032);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, z18);
                } else {
                    c28655q.m87150e0(2019127120);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, z18);
                }
                z19 = type instanceof AbstractC27285v0.d;
                c28676v0 = C28635l.f115821a;
                if (z19) {
                    c28655q.m87150e0(-1831482507);
                    z28 = z18;
                    AbstractC27285v0.d dVar6 = (AbstractC27285v0.d) type;
                    EnumC27251e1 enumC27251e1M82328e6 = dVar6.getWidthType();
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i16 = (InterfaceC21083i) objM87133R5;
                    if ((i15 & 1879048192) == 536870912) {
                        z29 = true;
                    } else {
                        z29 = z28;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z29) {
                        objM87133R6 = new C24679k(onClick, 18);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C24679k(onClick, 18);
                        c28655q.m87172p0(objM87133R6);
                    }
                    int i314 = i15 >> 6;
                    Modifier modifier11 = modifier2;
                    m82314m(modifier11, settingText, dVar6, enumC27251e1M82328e6, z17, interfaceC21083i16, jM95628d, jM95624D, 0.0f, str11, (InterfaceC4339a) objM87133R6, c28655q, (i314 & 896) | (i15 & 14) | i19 | (i15 & 112) | (i314 & 57344) | ((i15 << 3) & 1879048192), 0, 256);
                    c28655q.m87173q(false);
                    modifier5 = modifier11;
                    f16 = f15;
                    str12 = str9;
                    str13 = str10;
                } else {
                    modifier4 = modifier2;
                    i29 = i15;
                    j7 = jM95624D;
                    if (type instanceof AbstractC27285v0.c) {
                        c28655q.m87150e0(-1830974448);
                        z26 = z18;
                        AbstractC27285v0.c cVar6 = (AbstractC27285v0.c) type;
                        EnumC27251e1 enumC27251e1M82327e6 = cVar6.getWidthType();
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i17 = (InterfaceC21083i) objM87133R3;
                        if ((i29 & 1879048192) == 536870912) {
                            z27 = true;
                        } else {
                            z27 = z26;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z27) {
                            objM87133R4 = new C24679k(onClick, 19);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C24679k(onClick, 19);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i4114 = i29 >> 6;
                        int i4115 = i29 << 3;
                        float f112 = f15;
                        m82314m(modifier4, settingText, cVar6, enumC27251e1M82327e6, z17, interfaceC21083i17, jM95628d, j7, f112, str11, (InterfaceC4339a) objM87133R4, c28655q, (i4114 & 896) | (i29 & 14) | i19 | (i29 & 112) | (i4114 & 57344) | (234881024 & i4115) | (i4115 & 1879048192), 0, 0);
                        f16 = f112;
                        c28655q.m87173q(false);
                        modifier5 = modifier4;
                        str12 = str9;
                        str13 = str10;
                    } else {
                        z24 = z18;
                        f16 = f15;
                        if (type.equals(AbstractC27285v0.b.f109204d)) {
                        }
                        c28655q.m87150e0(-1830414836);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i18 = (InterfaceC21083i) objM87133R;
                        if ((i29 & 1879048192) == 536870912) {
                            z25 = true;
                        } else {
                            z25 = z24;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z25) {
                            objM87133R2 = new C24679k(onClick, 20);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C24679k(onClick, 20);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i4116 = i29 >> 3;
                        int i4117 = (i4116 & 896) | (i4116 & 14) | i19 | (i4116 & 112) | (i4116 & 7168) | ((i29 >> 6) & 57344);
                        modifier5 = modifier4;
                        str12 = str9;
                        str13 = str10;
                        m82311j(settingText, str12, str13, type, z17, interfaceC21083i18, jM95628d, j7, (InterfaceC4339a) objM87133R2, c28655q, i4117, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                }
                str7 = str12;
                z16 = z17;
                f14 = f16;
                str6 = str11;
                modifier3 = modifier5;
                str8 = str13;
            } else {
                c28655q.m87138X();
                str6 = str3;
                modifier3 = modifier2;
                str7 = str4;
                str8 = str5;
                z16 = z14;
                f14 = f13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.r0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC27283u0.m82322u(modifier3, settingText, str7, str8, type, z4, z16, f14, str6, onClick, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 3072;
        str5 = str2;
        if ((i13 & 24576) == 0) {
            if ((32768 & i13) == 0) {
                zM87157i = c28655q.m87153g(type);
            } else {
                zM87157i = c28655q.m87157i(type);
            }
            if (zM87157i) {
                i36 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i36 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i36;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87155h(z4)) {
                i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i35;
        }
        i18 = i14 & 64;
        if (i18 != 0) {
            i15 |= 1572864;
            i19 = 196608;
            z14 = z13;
        } else {
            i19 = 196608;
            z14 = z13;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87155h(z14)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i15 |= i24;
            }
        }
        i25 = i14 & 128;
        if (i25 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q.m87147d(f13)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i15 |= i26;
        }
        i27 = i14 & 256;
        if (i27 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87153g(str3)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i28;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i15 |= i34;
            }
            if ((i15 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                if (i37 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i38 != 0) {
                    str9 = "";
                } else {
                    str9 = str4;
                }
                if (i16 != 0) {
                    str10 = "";
                } else {
                    str10 = str5;
                }
                if (i18 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i25 != 0) {
                    f15 = 1 * 4;
                } else {
                    f15 = f13;
                }
                if (i27 != 0) {
                    str11 = null;
                } else {
                    str11 = str3;
                }
                if (z4) {
                    c28655q.m87150e0(2019123148);
                    jM95628d = C38070b.f163049a.m121943a(c28655q, 6).getActive();
                    z18 = false;
                    c28655q.m87173q(false);
                } else {
                    z18 = false;
                    c28655q.m87150e0(2019124109);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z4) {
                    c28655q.m87150e0(2019126032);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, z18);
                } else {
                    c28655q.m87150e0(2019127120);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, z18);
                }
                z19 = type instanceof AbstractC27285v0.d;
                c28676v0 = C28635l.f115821a;
                if (z19) {
                    c28655q.m87150e0(-1831482507);
                    z28 = z18;
                    AbstractC27285v0.d dVar7 = (AbstractC27285v0.d) type;
                    EnumC27251e1 enumC27251e1M82328e7 = dVar7.getWidthType();
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i19 = (InterfaceC21083i) objM87133R5;
                    if ((i15 & 1879048192) == 536870912) {
                        z29 = true;
                    } else {
                        z29 = z28;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z29) {
                        objM87133R6 = new C24679k(onClick, 18);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C24679k(onClick, 18);
                        c28655q.m87172p0(objM87133R6);
                    }
                    int i315 = i15 >> 6;
                    Modifier modifier12 = modifier2;
                    m82314m(modifier12, settingText, dVar7, enumC27251e1M82328e7, z17, interfaceC21083i19, jM95628d, jM95624D, 0.0f, str11, (InterfaceC4339a) objM87133R6, c28655q, (i315 & 896) | (i15 & 14) | i19 | (i15 & 112) | (i315 & 57344) | ((i15 << 3) & 1879048192), 0, 256);
                    c28655q.m87173q(false);
                    modifier5 = modifier12;
                    f16 = f15;
                    str12 = str9;
                    str13 = str10;
                } else {
                    modifier4 = modifier2;
                    i29 = i15;
                    j7 = jM95624D;
                    if (type instanceof AbstractC27285v0.c) {
                        c28655q.m87150e0(-1830974448);
                        z26 = z18;
                        AbstractC27285v0.c cVar7 = (AbstractC27285v0.c) type;
                        EnumC27251e1 enumC27251e1M82327e7 = cVar7.getWidthType();
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i110 = (InterfaceC21083i) objM87133R3;
                        if ((i29 & 1879048192) == 536870912) {
                            z27 = true;
                        } else {
                            z27 = z26;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z27) {
                            objM87133R4 = new C24679k(onClick, 19);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C24679k(onClick, 19);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i4118 = i29 >> 6;
                        int i4119 = i29 << 3;
                        float f113 = f15;
                        m82314m(modifier4, settingText, cVar7, enumC27251e1M82327e7, z17, interfaceC21083i110, jM95628d, j7, f113, str11, (InterfaceC4339a) objM87133R4, c28655q, (i4118 & 896) | (i29 & 14) | i19 | (i29 & 112) | (i4118 & 57344) | (234881024 & i4119) | (i4119 & 1879048192), 0, 0);
                        f16 = f113;
                        c28655q.m87173q(false);
                        modifier5 = modifier4;
                        str12 = str9;
                        str13 = str10;
                    } else {
                        z24 = z18;
                        f16 = f15;
                        if (type.equals(AbstractC27285v0.b.f109204d)) {
                        }
                        c28655q.m87150e0(-1830414836);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i111 = (InterfaceC21083i) objM87133R;
                        if ((i29 & 1879048192) == 536870912) {
                            z25 = true;
                        } else {
                            z25 = z24;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z25) {
                            objM87133R2 = new C24679k(onClick, 20);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C24679k(onClick, 20);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i41110 = i29 >> 3;
                        int i41111 = (i41110 & 896) | (i41110 & 14) | i19 | (i41110 & 112) | (i41110 & 7168) | ((i29 >> 6) & 57344);
                        modifier5 = modifier4;
                        str12 = str9;
                        str13 = str10;
                        m82311j(settingText, str12, str13, type, z17, interfaceC21083i111, jM95628d, j7, (InterfaceC4339a) objM87133R2, c28655q, i41111, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                }
                str7 = str12;
                z16 = z17;
                f14 = f16;
                str6 = str11;
                modifier3 = modifier5;
                str8 = str13;
            } else {
                c28655q.m87138X();
                str6 = str3;
                modifier3 = modifier2;
                str7 = str4;
                str8 = str5;
                z16 = z14;
                f14 = f13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.r0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC27283u0.m82322u(modifier3, settingText, str7, str8, type, z4, z16, f14, str6, onClick, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 100663296;
        if ((i13 & 805306368) == 0) {
            if (c28655q.m87157i(onClick)) {
                i34 = 536870912;
            } else {
                i34 = 268435456;
            }
            i15 |= i34;
        }
        if ((i15 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            if (i37 != 0) {
                modifier2 = C2314t.f9131w;
            }
            if (i38 != 0) {
                str9 = "";
            } else {
                str9 = str4;
            }
            if (i16 != 0) {
                str10 = "";
            } else {
                str10 = str5;
            }
            if (i18 != 0) {
                z17 = true;
            } else {
                z17 = z14;
            }
            if (i25 != 0) {
                f15 = 1 * 4;
            } else {
                f15 = f13;
            }
            if (i27 != 0) {
                str11 = null;
            } else {
                str11 = str3;
            }
            if (z4) {
                c28655q.m87150e0(2019123148);
                jM95628d = C38070b.f163049a.m121943a(c28655q, 6).getActive();
                z18 = false;
                c28655q.m87173q(false);
            } else {
                z18 = false;
                c28655q.m87150e0(2019124109);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            if (z4) {
                c28655q.m87150e0(2019126032);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, z18);
            } else {
                c28655q.m87150e0(2019127120);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, z18);
            }
            z19 = type instanceof AbstractC27285v0.d;
            c28676v0 = C28635l.f115821a;
            if (z19) {
                c28655q.m87150e0(-1831482507);
                z28 = z18;
                AbstractC27285v0.d dVar8 = (AbstractC27285v0.d) type;
                EnumC27251e1 enumC27251e1M82328e8 = dVar8.getWidthType();
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i112 = (InterfaceC21083i) objM87133R5;
                if ((i15 & 1879048192) == 536870912) {
                    z29 = true;
                } else {
                    z29 = z28;
                }
                objM87133R6 = c28655q.m87133R();
                if (z29) {
                    objM87133R6 = new C24679k(onClick, 18);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C24679k(onClick, 18);
                    c28655q.m87172p0(objM87133R6);
                }
                int i316 = i15 >> 6;
                Modifier modifier13 = modifier2;
                m82314m(modifier13, settingText, dVar8, enumC27251e1M82328e8, z17, interfaceC21083i112, jM95628d, jM95624D, 0.0f, str11, (InterfaceC4339a) objM87133R6, c28655q, (i316 & 896) | (i15 & 14) | i19 | (i15 & 112) | (i316 & 57344) | ((i15 << 3) & 1879048192), 0, 256);
                c28655q.m87173q(false);
                modifier5 = modifier13;
                f16 = f15;
                str12 = str9;
                str13 = str10;
            } else {
                modifier4 = modifier2;
                i29 = i15;
                j7 = jM95624D;
                if (type instanceof AbstractC27285v0.c) {
                    c28655q.m87150e0(-1830974448);
                    z26 = z18;
                    AbstractC27285v0.c cVar8 = (AbstractC27285v0.c) type;
                    EnumC27251e1 enumC27251e1M82327e8 = cVar8.getWidthType();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i113 = (InterfaceC21083i) objM87133R3;
                    if ((i29 & 1879048192) == 536870912) {
                        z27 = true;
                    } else {
                        z27 = z26;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z27) {
                        objM87133R4 = new C24679k(onClick, 19);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C24679k(onClick, 19);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i41112 = i29 >> 6;
                    int i41113 = i29 << 3;
                    float f114 = f15;
                    m82314m(modifier4, settingText, cVar8, enumC27251e1M82327e8, z17, interfaceC21083i113, jM95628d, j7, f114, str11, (InterfaceC4339a) objM87133R4, c28655q, (i41112 & 896) | (i29 & 14) | i19 | (i29 & 112) | (i41112 & 57344) | (234881024 & i41113) | (i41113 & 1879048192), 0, 0);
                    f16 = f114;
                    c28655q.m87173q(false);
                    modifier5 = modifier4;
                    str12 = str9;
                    str13 = str10;
                } else {
                    z24 = z18;
                    f16 = f15;
                    if (type.equals(AbstractC27285v0.b.f109204d)) {
                    }
                    c28655q.m87150e0(-1830414836);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i114 = (InterfaceC21083i) objM87133R;
                    if ((i29 & 1879048192) == 536870912) {
                        z25 = true;
                    } else {
                        z25 = z24;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z25) {
                        objM87133R2 = new C24679k(onClick, 20);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C24679k(onClick, 20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i41114 = i29 >> 3;
                    int i41115 = (i41114 & 896) | (i41114 & 14) | i19 | (i41114 & 112) | (i41114 & 7168) | ((i29 >> 6) & 57344);
                    modifier5 = modifier4;
                    str12 = str9;
                    str13 = str10;
                    m82311j(settingText, str12, str13, type, z17, interfaceC21083i114, jM95628d, j7, (InterfaceC4339a) objM87133R2, c28655q, i41115, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
            }
            str7 = str12;
            z16 = z17;
            f14 = f16;
            str6 = str11;
            modifier3 = modifier5;
            str8 = str13;
        } else {
            c28655q.m87138X();
            str6 = str3;
            modifier3 = modifier2;
            str7 = str4;
            str8 = str5;
            z16 = z14;
            f14 = f13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ny0.r0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC27283u0.m82322u(modifier3, settingText, str7, str8, type, z4, z16, f14, str6, onClick, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m82319r(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m82320s(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m82321t(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m82322u(Modifier modifier, String str, String str2, String str3, AbstractC27285v0 abstractC27285v0, boolean z4, boolean z13, float f13, String str4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m82318q(modifier, str, str2, str3, abstractC27285v0, z4, z13, f13, str4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
