package do0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import df2.C12000a;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.C0003a0;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p412q3.InterfaceC29873g0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p704dk2.C12122i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30784c;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import x81.C38072d;

/* JADX INFO: renamed from: do0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0089\u0001\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "label", "text", "Lb91/a;", "labelStyle", "errorMessage", "Lqz0/c;", "endingType", "placeholderText", "Lq3/g0;", "visualTransformation", "", "enabled", "Lkotlin/Function0;", "Ll83/a0;", "onRightIconClicked", "Lkotlin/Function1;", "", "onTextChanged", "e", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lqz0/c;Lcom/whoop/design/util/TextResource;Lq3/g0;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "change-password_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12232f {
    /* JADX WARN: Code duplicated, block: B:100:0x0141  */
    /* JADX WARN: Code duplicated, block: B:102:0x0148  */
    /* JADX WARN: Code duplicated, block: B:104:0x014c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    /* JADX WARN: Code duplicated, block: B:107:0x0159  */
    /* JADX WARN: Code duplicated, block: B:111:0x0161  */
    /* JADX WARN: Code duplicated, block: B:113:0x0167  */
    /* JADX WARN: Code duplicated, block: B:114:0x016a  */
    /* JADX WARN: Code duplicated, block: B:116:0x016f  */
    /* JADX WARN: Code duplicated, block: B:119:0x017d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0185  */
    /* JADX WARN: Code duplicated, block: B:126:0x018f  */
    /* JADX WARN: Code duplicated, block: B:128:0x019a  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:153:0x0203  */
    /* JADX WARN: Code duplicated, block: B:156:0x0210  */
    /* JADX WARN: Code duplicated, block: B:157:0x0218  */
    /* JADX WARN: Code duplicated, block: B:160:0x0231  */
    /* JADX WARN: Code duplicated, block: B:161:0x024c  */
    /* JADX WARN: Code duplicated, block: B:165:0x025e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x0268  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:174:0x0311  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX INFO: renamed from: e */
    public static final void m34019e(Modifier modifier, TextResource label, TextResource text, C2886a c2886a, TextResource textResource, AbstractC30784c endingType, TextResource textResource2, InterfaceC29873g0 visualTransformation, boolean z4, InterfaceC4339a interfaceC4339a, Function1 onTextChanged, Composer composer, int i13, int i14, int i15) {
        Modifier modifierM3396r;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z13;
        C28655q c28655q;
        boolean z14;
        InterfaceC4339a interfaceC4339a2;
        TextResource textResource3;
        TextResource textResource4;
        Modifier modifier2;
        C2886a c2886a2;
        C28677v1 c28677v1M87180u;
        int i24;
        C28676v0 c28676v0;
        C37816b c37816bM121344e;
        C2886a b6;
        boolean z15;
        C2886a c2886a3;
        Modifier modifier3;
        boolean z16;
        InterfaceC4339a interfaceC4339a3;
        Object objM87133R;
        C23465k c23465k;
        boolean z17;
        Object objM87133R2;
        int i25;
        int i26;
        TextResource textResource5 = textResource;
        TextResource textResource6 = textResource2;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(endingType, "endingType");
        AbstractC22676k.m65750j(visualTransformation, "visualTransformation");
        AbstractC22676k.m65750j(onTextChanged, "onTextChanged");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1483236058);
        int i27 = i15 & 1;
        if (i27 != 0) {
            i16 = i13 | 6;
            modifierM3396r = modifier;
        } else if ((i13 & 6) == 0) {
            modifierM3396r = modifier;
            i16 = (c28655q2.m87153g(modifierM3396r) ? 4 : 2) | i13;
        } else {
            modifierM3396r = modifier;
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= (i13 & 64) == 0 ? c28655q2.m87153g(label) : c28655q2.m87157i(label) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= (i13 & 512) == 0 ? c28655q2.m87153g(text) : c28655q2.m87157i(text) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i15 & 8) != 0) {
                i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                if ((i13 & 4096) == 0 ? c28655q2.m87153g(c2886a) : c28655q2.m87157i(c2886a)) {
                    i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
            }
            i16 |= i26;
        }
        int i28 = i15 & 16;
        if (i28 != 0) {
            i16 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i16 |= (32768 & i13) == 0 ? c28655q2.m87153g(textResource5) : c28655q2.m87157i(textResource5) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i16 |= (262144 & i13) == 0 ? c28655q2.m87153g(endingType) : c28655q2.m87157i(endingType) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i29 = i15 & 64;
        int i34 = 1572864;
        if (i29 != 0) {
            i16 |= i34;
        } else if ((i13 & 1572864) == 0) {
            i34 = (i13 & 2097152) == 0 ? c28655q2.m87153g(textResource6) : c28655q2.m87157i(textResource6) ? 1048576 : 524288;
            i16 |= i34;
        }
        if ((i13 & 12582912) == 0) {
            i16 |= c28655q2.m87153g(visualTransformation) ? 8388608 : 4194304;
        }
        int i35 = i15 & 256;
        if (i35 == 0) {
            if ((i13 & 100663296) == 0) {
                i16 |= c28655q2.m87155h(z4) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
            }
            i17 = i15 & 512;
            if (i17 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i16 |= i18;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(onTextChanged)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i19 = i14 | i25;
                } else {
                    i19 = i14;
                }
                if ((i16 & 306783379) == 306783378 || (i19 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i16 & 1, z13)) {
                    c28655q2.m87140Z();
                    i24 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    c37816bM121344e = null;
                    if (i24 != 0 || c28655q2.m87118C()) {
                        if (i27 != 0) {
                            modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
                        }
                        if ((i15 & 8) != 0) {
                            b6 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB3();
                            i16 &= -7169;
                        } else {
                            b6 = c2886a;
                        }
                        if (i28 != 0) {
                            textResource5 = null;
                        }
                        if (i29 != 0) {
                            textResource6 = null;
                        }
                        if (i35 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12000a(29);
                                c28655q2.m87172p0(objM87133R);
                            }
                            boolean z18 = z15;
                            c2886a3 = b6;
                            modifier3 = modifierM3396r;
                            z16 = z18;
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            boolean z19 = z15;
                            c2886a3 = b6;
                            modifier3 = modifierM3396r;
                            z16 = z19;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                    } else {
                        c28655q2.m87138X();
                        if ((i15 & 8) != 0) {
                            i16 &= -7169;
                        }
                        c2886a3 = c2886a;
                        interfaceC4339a3 = interfaceC4339a;
                        modifier3 = modifierM3396r;
                        z16 = z4;
                    }
                    c28655q2.m87175r();
                    if (textResource5 != null) {
                        c23465k = new C23465k(Boolean.TRUE, textResource5);
                    } else {
                        c23465k = new C23465k(Boolean.FALSE, AbstractC8693b.m21267a());
                    }
                    boolean zBooleanValue = ((Boolean) c23465k.f92937w).booleanValue();
                    TextResource textResource7 = (TextResource) c23465k.f92938x;
                    if (textResource6 != null) {
                        c28655q2.m87150e0(-461190672);
                        c37816bM121344e = AbstractC37817c.m121344e(672088764, c28655q2, new C0003a0(24, textResource6, c2886a3));
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-460988056);
                        c28655q2.m87173q(false);
                    }
                    z17 = (i19 & 14) == 4;
                    objM87133R2 = c28655q2.m87133R();
                    if (z17 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C12122i(onTextChanged, 2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    int i36 = TextResource.$stable;
                    int i37 = i16 << 6;
                    c28655q = c28655q2;
                    Modifier modifier4 = modifier3;
                    AbstractC30792k.m94678l(modifier4, text, null, label, null, null, c37816bM121344e, endingType, textResource7, zBooleanValue, false, null, 0L, z16, 1, 0, 0, false, visualTransformation, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a3, (Function1) objM87133R2, c28655q, (i16 & 14) | (i36 << 3) | ((i16 >> 3) & 112) | (i36 << 9) | (i37 & 7168) | (AbstractC30784c.f126784a << 21) | (i37 & 29360128) | (i36 << 24), ((i16 >> 15) & 7168) | 24576 | (234881024 & (i16 << 3)), 0, (i16 >> 27) & 14, 1073454132, 0);
                    modifier2 = modifier4;
                    z14 = z16;
                    interfaceC4339a2 = interfaceC4339a3;
                    textResource3 = textResource5;
                    textResource4 = textResource6;
                    c2886a2 = c2886a3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z14 = z4;
                    interfaceC4339a2 = interfaceC4339a;
                    textResource3 = textResource5;
                    textResource4 = textResource6;
                    modifier2 = modifierM3396r;
                    c2886a2 = c2886a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12231e(modifier2, label, text, c2886a2, textResource3, endingType, textResource4, visualTransformation, z14, interfaceC4339a2, onTextChanged, i13, i14, i15);
                }
            }
            i16 |= 805306368;
            if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(onTextChanged)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i19 = i14 | i25;
            } else {
                i19 = i14;
            }
            if ((i16 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z13)) {
                c28655q2.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c37816bM121344e = null;
                if (i24 != 0) {
                    if (i27 != 0) {
                        modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
                    }
                    if ((i15 & 8) != 0) {
                        b6 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB3();
                        i16 &= -7169;
                    } else {
                        b6 = c2886a;
                    }
                    if (i28 != 0) {
                        textResource5 = null;
                    }
                    if (i29 != 0) {
                        textResource6 = null;
                    }
                    if (i35 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12000a(29);
                            c28655q2.m87172p0(objM87133R);
                        }
                        boolean z110 = z15;
                        c2886a3 = b6;
                        modifier3 = modifierM3396r;
                        z16 = z110;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        boolean z111 = z15;
                        c2886a3 = b6;
                        modifier3 = modifierM3396r;
                        z16 = z111;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                } else {
                    if (i27 != 0) {
                        modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
                    }
                    if ((i15 & 8) != 0) {
                        b6 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB3();
                        i16 &= -7169;
                    } else {
                        b6 = c2886a;
                    }
                    if (i28 != 0) {
                        textResource5 = null;
                    }
                    if (i29 != 0) {
                        textResource6 = null;
                    }
                    if (i35 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12000a(29);
                            c28655q2.m87172p0(objM87133R);
                        }
                        boolean z112 = z15;
                        c2886a3 = b6;
                        modifier3 = modifierM3396r;
                        z16 = z112;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        boolean z113 = z15;
                        c2886a3 = b6;
                        modifier3 = modifierM3396r;
                        z16 = z113;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                }
                c28655q2.m87175r();
                if (textResource5 != null) {
                    c23465k = new C23465k(Boolean.TRUE, textResource5);
                } else {
                    c23465k = new C23465k(Boolean.FALSE, AbstractC8693b.m21267a());
                }
                boolean zBooleanValue2 = ((Boolean) c23465k.f92937w).booleanValue();
                TextResource textResource8 = (TextResource) c23465k.f92938x;
                if (textResource6 != null) {
                    c28655q2.m87150e0(-461190672);
                    c37816bM121344e = AbstractC37817c.m121344e(672088764, c28655q2, new C0003a0(24, textResource6, c2886a3));
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-460988056);
                    c28655q2.m87173q(false);
                }
                if ((i19 & 14) == 4) {
                }
                objM87133R2 = c28655q2.m87133R();
                if (z17) {
                    objM87133R2 = new C12122i(onTextChanged, 2);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12122i(onTextChanged, 2);
                    c28655q2.m87172p0(objM87133R2);
                }
                int i38 = TextResource.$stable;
                int i39 = i16 << 6;
                c28655q = c28655q2;
                Modifier modifier5 = modifier3;
                AbstractC30792k.m94678l(modifier5, text, null, label, null, null, c37816bM121344e, endingType, textResource8, zBooleanValue2, false, null, 0L, z16, 1, 0, 0, false, visualTransformation, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a3, (Function1) objM87133R2, c28655q, (i16 & 14) | (i38 << 3) | ((i16 >> 3) & 112) | (i38 << 9) | (i39 & 7168) | (AbstractC30784c.f126784a << 21) | (i39 & 29360128) | (i38 << 24), ((i16 >> 15) & 7168) | 24576 | (234881024 & (i16 << 3)), 0, (i16 >> 27) & 14, 1073454132, 0);
                modifier2 = modifier5;
                z14 = z16;
                interfaceC4339a2 = interfaceC4339a3;
                textResource3 = textResource5;
                textResource4 = textResource6;
                c2886a2 = c2886a3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z14 = z4;
                interfaceC4339a2 = interfaceC4339a;
                textResource3 = textResource5;
                textResource4 = textResource6;
                modifier2 = modifierM3396r;
                c2886a2 = c2886a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12231e(modifier2, label, text, c2886a2, textResource3, endingType, textResource4, visualTransformation, z14, interfaceC4339a2, onTextChanged, i13, i14, i15);
            }
        }
        i16 |= 100663296;
        i17 = i15 & 512;
        if (i17 != 0) {
            if ((i13 & 805306368) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i16 |= i18;
            }
            if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(onTextChanged)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i19 = i14 | i25;
            } else {
                i19 = i14;
            }
            if ((i16 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z13)) {
                c28655q2.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                c37816bM121344e = null;
                if (i24 != 0) {
                    if (i27 != 0) {
                        modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
                    }
                    if ((i15 & 8) != 0) {
                        b6 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB3();
                        i16 &= -7169;
                    } else {
                        b6 = c2886a;
                    }
                    if (i28 != 0) {
                        textResource5 = null;
                    }
                    if (i29 != 0) {
                        textResource6 = null;
                    }
                    if (i35 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12000a(29);
                            c28655q2.m87172p0(objM87133R);
                        }
                        boolean z114 = z15;
                        c2886a3 = b6;
                        modifier3 = modifierM3396r;
                        z16 = z114;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        boolean z115 = z15;
                        c2886a3 = b6;
                        modifier3 = modifierM3396r;
                        z16 = z115;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                } else {
                    if (i27 != 0) {
                        modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
                    }
                    if ((i15 & 8) != 0) {
                        b6 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB3();
                        i16 &= -7169;
                    } else {
                        b6 = c2886a;
                    }
                    if (i28 != 0) {
                        textResource5 = null;
                    }
                    if (i29 != 0) {
                        textResource6 = null;
                    }
                    if (i35 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12000a(29);
                            c28655q2.m87172p0(objM87133R);
                        }
                        boolean z116 = z15;
                        c2886a3 = b6;
                        modifier3 = modifierM3396r;
                        z16 = z116;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        boolean z117 = z15;
                        c2886a3 = b6;
                        modifier3 = modifierM3396r;
                        z16 = z117;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                }
                c28655q2.m87175r();
                if (textResource5 != null) {
                    c23465k = new C23465k(Boolean.TRUE, textResource5);
                } else {
                    c23465k = new C23465k(Boolean.FALSE, AbstractC8693b.m21267a());
                }
                boolean zBooleanValue3 = ((Boolean) c23465k.f92937w).booleanValue();
                TextResource textResource9 = (TextResource) c23465k.f92938x;
                if (textResource6 != null) {
                    c28655q2.m87150e0(-461190672);
                    c37816bM121344e = AbstractC37817c.m121344e(672088764, c28655q2, new C0003a0(24, textResource6, c2886a3));
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-460988056);
                    c28655q2.m87173q(false);
                }
                if ((i19 & 14) == 4) {
                }
                objM87133R2 = c28655q2.m87133R();
                if (z17) {
                    objM87133R2 = new C12122i(onTextChanged, 2);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12122i(onTextChanged, 2);
                    c28655q2.m87172p0(objM87133R2);
                }
                int i310 = TextResource.$stable;
                int i311 = i16 << 6;
                c28655q = c28655q2;
                Modifier modifier6 = modifier3;
                AbstractC30792k.m94678l(modifier6, text, null, label, null, null, c37816bM121344e, endingType, textResource9, zBooleanValue3, false, null, 0L, z16, 1, 0, 0, false, visualTransformation, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a3, (Function1) objM87133R2, c28655q, (i16 & 14) | (i310 << 3) | ((i16 >> 3) & 112) | (i310 << 9) | (i311 & 7168) | (AbstractC30784c.f126784a << 21) | (i311 & 29360128) | (i310 << 24), ((i16 >> 15) & 7168) | 24576 | (234881024 & (i16 << 3)), 0, (i16 >> 27) & 14, 1073454132, 0);
                modifier2 = modifier6;
                z14 = z16;
                interfaceC4339a2 = interfaceC4339a3;
                textResource3 = textResource5;
                textResource4 = textResource6;
                c2886a2 = c2886a3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z14 = z4;
                interfaceC4339a2 = interfaceC4339a;
                textResource3 = textResource5;
                textResource4 = textResource6;
                modifier2 = modifierM3396r;
                c2886a2 = c2886a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12231e(modifier2, label, text, c2886a2, textResource3, endingType, textResource4, visualTransformation, z14, interfaceC4339a2, onTextChanged, i13, i14, i15);
            }
        }
        i16 |= 805306368;
        if ((i14 & 6) == 0) {
            if (c28655q2.m87157i(onTextChanged)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i19 = i14 | i25;
        } else {
            i19 = i14;
        }
        if ((i16 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c28655q2.m87135U(i16 & 1, z13)) {
            c28655q2.m87140Z();
            i24 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            c37816bM121344e = null;
            if (i24 != 0) {
                if (i27 != 0) {
                    modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
                }
                if ((i15 & 8) != 0) {
                    b6 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB3();
                    i16 &= -7169;
                } else {
                    b6 = c2886a;
                }
                if (i28 != 0) {
                    textResource5 = null;
                }
                if (i29 != 0) {
                    textResource6 = null;
                }
                if (i35 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                if (i17 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C12000a(29);
                        c28655q2.m87172p0(objM87133R);
                    }
                    boolean z118 = z15;
                    c2886a3 = b6;
                    modifier3 = modifierM3396r;
                    z16 = z118;
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    boolean z119 = z15;
                    c2886a3 = b6;
                    modifier3 = modifierM3396r;
                    z16 = z119;
                    interfaceC4339a3 = interfaceC4339a;
                }
            } else {
                if (i27 != 0) {
                    modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
                }
                if ((i15 & 8) != 0) {
                    b6 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB3();
                    i16 &= -7169;
                } else {
                    b6 = c2886a;
                }
                if (i28 != 0) {
                    textResource5 = null;
                }
                if (i29 != 0) {
                    textResource6 = null;
                }
                if (i35 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                if (i17 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C12000a(29);
                        c28655q2.m87172p0(objM87133R);
                    }
                    boolean z1110 = z15;
                    c2886a3 = b6;
                    modifier3 = modifierM3396r;
                    z16 = z1110;
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    boolean z1111 = z15;
                    c2886a3 = b6;
                    modifier3 = modifierM3396r;
                    z16 = z1111;
                    interfaceC4339a3 = interfaceC4339a;
                }
            }
            c28655q2.m87175r();
            if (textResource5 != null) {
                c23465k = new C23465k(Boolean.TRUE, textResource5);
            } else {
                c23465k = new C23465k(Boolean.FALSE, AbstractC8693b.m21267a());
            }
            boolean zBooleanValue4 = ((Boolean) c23465k.f92937w).booleanValue();
            TextResource textResource10 = (TextResource) c23465k.f92938x;
            if (textResource6 != null) {
                c28655q2.m87150e0(-461190672);
                c37816bM121344e = AbstractC37817c.m121344e(672088764, c28655q2, new C0003a0(24, textResource6, c2886a3));
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-460988056);
                c28655q2.m87173q(false);
            }
            if ((i19 & 14) == 4) {
            }
            objM87133R2 = c28655q2.m87133R();
            if (z17) {
                objM87133R2 = new C12122i(onTextChanged, 2);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C12122i(onTextChanged, 2);
                c28655q2.m87172p0(objM87133R2);
            }
            int i312 = TextResource.$stable;
            int i313 = i16 << 6;
            c28655q = c28655q2;
            Modifier modifier7 = modifier3;
            AbstractC30792k.m94678l(modifier7, text, null, label, null, null, c37816bM121344e, endingType, textResource10, zBooleanValue4, false, null, 0L, z16, 1, 0, 0, false, visualTransformation, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a3, (Function1) objM87133R2, c28655q, (i16 & 14) | (i312 << 3) | ((i16 >> 3) & 112) | (i312 << 9) | (i313 & 7168) | (AbstractC30784c.f126784a << 21) | (i313 & 29360128) | (i312 << 24), ((i16 >> 15) & 7168) | 24576 | (234881024 & (i16 << 3)), 0, (i16 >> 27) & 14, 1073454132, 0);
            modifier2 = modifier7;
            z14 = z16;
            interfaceC4339a2 = interfaceC4339a3;
            textResource3 = textResource5;
            textResource4 = textResource6;
            c2886a2 = c2886a3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z14 = z4;
            interfaceC4339a2 = interfaceC4339a;
            textResource3 = textResource5;
            textResource4 = textResource6;
            modifier2 = modifierM3396r;
            c2886a2 = c2886a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12231e(modifier2, label, text, c2886a2, textResource3, endingType, textResource4, visualTransformation, z14, interfaceC4339a2, onTextChanged, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m34020f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m34021g(TextResource textResource, C2886a c2886a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m34022h(Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m34023i(Modifier modifier, TextResource textResource, TextResource textResource2, C2886a c2886a, TextResource textResource3, AbstractC30784c abstractC30784c, TextResource textResource4, InterfaceC29873g0 interfaceC29873g0, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, int i15, Composer composer, int i16) {
        m34019e(modifier, textResource, textResource2, c2886a, textResource3, abstractC30784c, textResource4, interfaceC29873g0, z4, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }
}
