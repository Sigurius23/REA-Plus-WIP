package sy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bv2.C3675b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gb1.AbstractC15680h;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import iz0.AbstractC21048g;
import iz0.C21053l;
import kk1.C22541b;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p026b2.InterfaceC2300f;
import p095dp.AbstractC12240d;
import p163g1.AbstractC14959b1;
import p163g1.AbstractC15027h3;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.InterfaceC22973k1;
import p292l1.C23099g2;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sy0.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a£\u0001\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "markdownText", "Lb91/a;", "style", "", "initialToggle", "isEnabled", "Ly3/f;", "spacerSize", "Li2/x;", "textColor", "linkColor", "Ll0/k1;", "paddingValues", "localMinimumInteractiveComponentEnforcement", "Lb2/f;", "horizontalAlignment", "trimStartGutter", "checkedColor", "Lkotlin/Function1;", "Ll83/a0;", "onToggle", "d", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lb91/a;ZZFJJLl0/k1;ZLb2/f;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "a", "F", "CHECKBOX_MIN_TOUCH_TARGET", "b", "CHECKBOX_COMPONENT_SIZE", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33090m {

    /* JADX INFO: renamed from: a */
    private static final float f138015a;

    /* JADX INFO: renamed from: b */
    private static final float f138016b;

    static {
        float f13 = 4;
        f138015a = 12 * f13;
        f138016b = 6 * f13;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0145  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x0153  */
    /* JADX WARN: Code duplicated, block: B:110:0x0156  */
    /* JADX WARN: Code duplicated, block: B:112:0x015b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:117:0x016c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x017a  */
    /* JADX WARN: Code duplicated, block: B:122:0x017d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0185  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x019b  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:164:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0210  */
    /* JADX WARN: Code duplicated, block: B:166:0x0212  */
    /* JADX WARN: Code duplicated, block: B:168:0x0216  */
    /* JADX WARN: Code duplicated, block: B:170:0x0219  */
    /* JADX WARN: Code duplicated, block: B:172:0x021c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0223  */
    /* JADX WARN: Code duplicated, block: B:176:0x022c  */
    /* JADX WARN: Code duplicated, block: B:179:0x023c  */
    /* JADX WARN: Code duplicated, block: B:180:0x024a  */
    /* JADX WARN: Code duplicated, block: B:182:0x024e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0258  */
    /* JADX WARN: Code duplicated, block: B:185:0x025c  */
    /* JADX WARN: Code duplicated, block: B:186:0x025e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0262  */
    /* JADX WARN: Code duplicated, block: B:189:0x0265  */
    /* JADX WARN: Code duplicated, block: B:191:0x0269  */
    /* JADX WARN: Code duplicated, block: B:192:0x026c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0272  */
    /* JADX WARN: Code duplicated, block: B:196:0x028c  */
    /* JADX WARN: Code duplicated, block: B:199:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:202:0x02af  */
    /* JADX WARN: Code duplicated, block: B:204:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:207:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:208:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:210:0x02ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x02db  */
    /* JADX WARN: Code duplicated, block: B:216:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:217:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:220:0x0303  */
    /* JADX WARN: Code duplicated, block: B:221:0x0305  */
    /* JADX WARN: Code duplicated, block: B:224:0x030d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x030f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0332  */
    /* JADX WARN: Code duplicated, block: B:229:0x0335  */
    /* JADX WARN: Code duplicated, block: B:232:0x0369  */
    /* JADX WARN: Code duplicated, block: B:233:0x036d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0380  */
    /* JADX WARN: Code duplicated, block: B:238:0x038e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0439  */
    /* JADX WARN: Code duplicated, block: B:243:0x0456  */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0131  */
    /* JADX INFO: renamed from: d */
    public static final void m104836d(Modifier modifier, final String markdownText, final C2886a style, boolean z4, boolean z13, float f13, long j7, long j13, InterfaceC22973k1 interfaceC22973k1, boolean z14, InterfaceC2300f interfaceC2300f, boolean z15, long j14, final Function1 onToggle, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        int i18;
        int i19;
        int i24;
        long jM125385c1;
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
        boolean z18;
        C28655q c28655q;
        Modifier modifier2;
        final float f14;
        final InterfaceC22973k1 interfaceC22973k2;
        final boolean z19;
        final InterfaceC2300f interfaceC2300f2;
        final long j15;
        final boolean z24;
        final boolean z25;
        final long j16;
        final boolean z26;
        final long j17;
        C28677v1 c28677v1M87180u;
        int i39;
        C2314t c2314t;
        float f15;
        long jM125403k0;
        InterfaceC22973k1 c22976l1;
        boolean z27;
        InterfaceC2300f interfaceC2300f3;
        boolean z28;
        int i44;
        InterfaceC22973k1 interfaceC22973k3;
        boolean z29;
        int i45;
        InterfaceC2300f interfaceC2300f4;
        boolean z34;
        long j18;
        long jM125430y;
        Object objM87133R;
        C28676v0 c28676v0;
        boolean z35;
        InterfaceC22973k1 interfaceC22973k1M3381c;
        float f16;
        int i46;
        boolean z36;
        boolean z37;
        boolean z38;
        Object objM87133R2;
        InterfaceC2300f interfaceC2300f5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i47;
        int i48;
        AbstractC22676k.m65750j(markdownText, "markdownText");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1926749040);
        int i49 = i15 & 1;
        if (i49 != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87153g(markdownText) ? 32 : 16;
        }
        int i54 = 128;
        if ((i13 & 384) == 0) {
            i16 |= (i13 & 512) == 0 ? c28655q2.m87153g(style) : c28655q2.m87157i(style) ? 256 : 128;
        }
        int i55 = i15 & 8;
        int i56 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i55 == 0) {
            if ((i13 & 3072) == 0) {
                z16 = z4;
                i16 |= c28655q2.m87155h(z16) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i13 & 24576) == 0) {
                    z17 = z13;
                    if (c28655q2.m87155h(z17)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87147d(f13)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i24;
                }
                if ((i13 & 1572864) == 0) {
                    jM125385c1 = j7;
                    if ((i15 & 64) == 0 || !c28655q2.m87151f(jM125385c1)) {
                        i48 = 524288;
                    } else {
                        i48 = 1048576;
                    }
                    i16 |= i48;
                } else {
                    jM125385c1 = j7;
                }
                if ((i13 & 12582912) != 0) {
                    if ((i15 & 128) == 0 || !c28655q2.m87151f(j13)) {
                        i47 = 4194304;
                    } else {
                        i47 = 8388608;
                    }
                    i16 |= i47;
                }
                i25 = i15 & 256;
                if (i25 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87153g(interfaceC22973k1)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 512;
                if (i27 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i16 |= i28;
                }
                i29 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i29 != 0) {
                    i34 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q2.m87153g(interfaceC2300f)) {
                        i35 = 4;
                    } else {
                        i35 = 2;
                    }
                    i34 = i14 | i35;
                } else {
                    i34 = i14;
                }
                i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i36 != 0) {
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87155h(z15)) {
                            i37 = 32;
                        } else {
                            i37 = 16;
                        }
                        i34 |= i37;
                    }
                    if ((i14 & 384) != 0) {
                        if ((i15 & 4096) == 0 && c28655q2.m87151f(j14)) {
                            i54 = 256;
                        }
                        i34 |= i54;
                    }
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(onToggle)) {
                            i56 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i34 |= i56;
                    }
                    i38 = i34;
                    if ((306783379 & i16) == 306783378 || (i38 & 1171) != 1170) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q2.m87135U(i16 & 1, z18)) {
                        c28655q2.m87140Z();
                        i39 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i39 != 0 || c28655q2.m87118C()) {
                            if (i49 != 0) {
                                modifier2 = c2314t;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i55 != 0) {
                                z16 = false;
                            }
                            if (i17 != 0) {
                                z17 = true;
                            }
                            if (i19 != 0) {
                                f15 = 4 * 3;
                            } else {
                                f15 = f13;
                            }
                            if ((i15 & 64) != 0) {
                                jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                                i16 &= -3670017;
                            }
                            if ((i15 & 128) != 0) {
                                jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                                i16 &= -29360129;
                            } else {
                                jM125403k0 = j13;
                            }
                            if (i25 != 0) {
                                float f17 = 1 * 8;
                                c22976l1 = new C22976l1(f17, f17, f17, f17);
                            } else {
                                c22976l1 = interfaceC22973k1;
                            }
                            if (i27 != 0) {
                                z27 = true;
                            } else {
                                z27 = z14;
                            }
                            if (i29 != 0) {
                                interfaceC2300f3 = null;
                            } else {
                                interfaceC2300f3 = interfaceC2300f;
                            }
                            if (i36 != 0) {
                                z28 = false;
                            } else {
                                z28 = z15;
                            }
                            if ((i15 & 4096) != 0) {
                                interfaceC22973k3 = c22976l1;
                                z29 = z27;
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                interfaceC2300f4 = interfaceC2300f3;
                                z34 = z28;
                                i44 = i38 & (-897);
                                i45 = i16;
                                j18 = jM125403k0;
                            } else {
                                i44 = i38;
                                interfaceC22973k3 = c22976l1;
                                z29 = z27;
                                i45 = i16;
                                interfaceC2300f4 = interfaceC2300f3;
                                z34 = z28;
                                j18 = jM125403k0;
                                jM125430y = j14;
                            }
                        } else {
                            c28655q2.m87138X();
                            if ((i15 & 64) != 0) {
                                i16 &= -3670017;
                            }
                            if ((i15 & 128) != 0) {
                                i16 &= -29360129;
                            }
                            if ((i15 & 4096) != 0) {
                                i38 &= -897;
                            }
                            modifier2 = modifier;
                            interfaceC22973k3 = interfaceC22973k1;
                            z29 = z14;
                            interfaceC2300f4 = interfaceC2300f;
                            z34 = z15;
                            jM125430y = j14;
                            i44 = i38;
                            i45 = i16;
                            f15 = f13;
                            j18 = j13;
                        }
                        c28655q2.m87175r();
                        objM87133R = c28655q2.m87133R();
                        long j19 = jM125430y;
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                        if (interfaceC2300f4 != null) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        if (z35) {
                            interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, interfaceC22973k3.mo43112d(), 0.0f, interfaceC22973k3.mo43109a(), 5);
                        } else {
                            interfaceC22973k1M3381c = interfaceC22973k3;
                        }
                        if (z34 || !z29) {
                            f16 = 0 * 8;
                            i46 = 2;
                        } else {
                            i46 = 2;
                            f16 = (-(f138015a - f138016b)) / 2;
                        }
                        Modifier modifierM44112a = AbstractC15680h.m44112a(AbstractC1099a.m3393o(interfaceC22973k1M3381c, AbstractC1099a.m3392n(modifier2, f16, 0.0f, i46)), z17);
                        C18027i c18027i = new C18027i(1);
                        if ((i44 & 7168) == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        if ((i45 & 7168) == 2048) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        z38 = z36 | z37;
                        objM87133R2 = c28655q2.m87133R();
                        if (z38 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C3675b(onToggle, z16, 8);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM44112a, interfaceC21083i, null, z17, c18027i, (InterfaceC4339a) objM87133R2, 8);
                        C22949e c22949e = AbstractC22977m.f90650a;
                        if (interfaceC2300f4 == null) {
                            interfaceC2300f5 = C2299e.f9110M;
                        } else {
                            interfaceC2300f5 = interfaceC2300f4;
                        }
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(new C22971k(0, true, new C22541b(interfaceC2300f5, 4)), C2299e.f9108K, c28655q2, 48);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3360e);
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
                        boolean z39 = z16;
                        boolean z44 = z17;
                        AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z29)), AbstractC37817c.m121344e(-764695604, c28655q2, new C23099g2(z39, onToggle, z44, j19)), c28655q2, 56);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
                        long j24 = jM125385c1;
                        AbstractC21048g.m58807M(markdownText, null, false, C21053l.f79834a.m58880a(style.getStyle(), j24, j18, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, (i45 >> 15) & MessageListItemViewType.GIPHY, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760), null, 0, 0, 0, false, c28655q2, (i45 >> 3) & 14, 502);
                        c28655q = c28655q2;
                        c28655q.m87173q(true);
                        z25 = z44;
                        f14 = f15;
                        j15 = j24;
                        j16 = j18;
                        z19 = z29;
                        interfaceC2300f2 = interfaceC2300f4;
                        z26 = z34;
                        z24 = z39;
                        j17 = j19;
                        interfaceC22973k2 = interfaceC22973k3;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        f14 = f13;
                        interfaceC22973k2 = interfaceC22973k1;
                        z19 = z14;
                        interfaceC2300f2 = interfaceC2300f;
                        j15 = jM125385c1;
                        z24 = z16;
                        z25 = z17;
                        j16 = j13;
                        z26 = z15;
                        j17 = j14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final Modifier modifier3 = modifier2;
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.l
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC33090m.m104839g(modifier3, markdownText, style, z24, z25, f14, j15, j16, interfaceC22973k2, z19, interfaceC2300f2, z26, j17, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i34 |= 48;
                if ((i14 & 384) != 0) {
                    if ((i15 & 4096) == 0) {
                        i54 = 256;
                    }
                    i34 |= i54;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onToggle)) {
                        i56 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i34 |= i56;
                }
                i38 = i34;
                if ((306783379 & i16) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z18)) {
                    c28655q2.m87140Z();
                    i39 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i39 != 0) {
                        if (i49 != 0) {
                            modifier2 = c2314t;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i55 != 0) {
                            z16 = false;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        }
                        if (i19 != 0) {
                            f15 = 4 * 3;
                        } else {
                            f15 = f13;
                        }
                        if ((i15 & 64) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                            i16 &= -3670017;
                        }
                        if ((i15 & 128) != 0) {
                            jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                            i16 &= -29360129;
                        } else {
                            jM125403k0 = j13;
                        }
                        if (i25 != 0) {
                            float f18 = 1 * 8;
                            c22976l1 = new C22976l1(f18, f18, f18, f18);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i27 != 0) {
                            z27 = true;
                        } else {
                            z27 = z14;
                        }
                        if (i29 != 0) {
                            interfaceC2300f3 = null;
                        } else {
                            interfaceC2300f3 = interfaceC2300f;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if ((i15 & 4096) != 0) {
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            i44 = i38 & (-897);
                            i45 = i16;
                            j18 = jM125403k0;
                        } else {
                            i44 = i38;
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            i45 = i16;
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            j18 = jM125403k0;
                            jM125430y = j14;
                        }
                    } else {
                        if (i49 != 0) {
                            modifier2 = c2314t;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i55 != 0) {
                            z16 = false;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        }
                        if (i19 != 0) {
                            f15 = 4 * 3;
                        } else {
                            f15 = f13;
                        }
                        if ((i15 & 64) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                            i16 &= -3670017;
                        }
                        if ((i15 & 128) != 0) {
                            jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                            i16 &= -29360129;
                        } else {
                            jM125403k0 = j13;
                        }
                        if (i25 != 0) {
                            float f19 = 1 * 8;
                            c22976l1 = new C22976l1(f19, f19, f19, f19);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i27 != 0) {
                            z27 = true;
                        } else {
                            z27 = z14;
                        }
                        if (i29 != 0) {
                            interfaceC2300f3 = null;
                        } else {
                            interfaceC2300f3 = interfaceC2300f;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if ((i15 & 4096) != 0) {
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            i44 = i38 & (-897);
                            i45 = i16;
                            j18 = jM125403k0;
                        } else {
                            i44 = i38;
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            i45 = i16;
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            j18 = jM125403k0;
                            jM125430y = j14;
                        }
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    long j110 = jM125430y;
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                    if (interfaceC2300f4 != null) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    if (z35) {
                        interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, interfaceC22973k3.mo43112d(), 0.0f, interfaceC22973k3.mo43109a(), 5);
                    } else {
                        interfaceC22973k1M3381c = interfaceC22973k3;
                    }
                    if (z34) {
                        f16 = 0 * 8;
                        i46 = 2;
                    } else {
                        f16 = 0 * 8;
                        i46 = 2;
                    }
                    Modifier modifierM44112a2 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(interfaceC22973k1M3381c, AbstractC1099a.m3392n(modifier2, f16, 0.0f, i46)), z17);
                    C18027i c18027i2 = new C18027i(1);
                    if ((i44 & 7168) == 2048) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    if ((i45 & 7168) == 2048) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z36 | z37;
                    objM87133R2 = c28655q2.m87133R();
                    if (z38) {
                        objM87133R2 = new C3675b(onToggle, z16, 8);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3675b(onToggle, z16, 8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM44112a2, interfaceC21083i2, null, z17, c18027i2, (InterfaceC4339a) objM87133R2, 8);
                    C22949e c22949e2 = AbstractC22977m.f90650a;
                    if (interfaceC2300f4 == null) {
                        interfaceC2300f5 = C2299e.f9110M;
                    } else {
                        interfaceC2300f5 = interfaceC2300f4;
                    }
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(new C22971k(0, true, new C22541b(interfaceC2300f5, 4)), C2299e.f9108K, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3360e2);
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
                    boolean z310 = z16;
                    boolean z45 = z17;
                    AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z29)), AbstractC37817c.m121344e(-764695604, c28655q2, new C23099g2(z310, onToggle, z45, j110)), c28655q2, 56);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
                    long j25 = jM125385c1;
                    AbstractC21048g.m58807M(markdownText, null, false, C21053l.f79834a.m58880a(style.getStyle(), j25, j18, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, (i45 >> 15) & MessageListItemViewType.GIPHY, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760), null, 0, 0, 0, false, c28655q2, (i45 >> 3) & 14, 502);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    z25 = z45;
                    f14 = f15;
                    j15 = j25;
                    j16 = j18;
                    z19 = z29;
                    interfaceC2300f2 = interfaceC2300f4;
                    z26 = z34;
                    z24 = z310;
                    j17 = j110;
                    interfaceC22973k2 = interfaceC22973k3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    f14 = f13;
                    interfaceC22973k2 = interfaceC22973k1;
                    z19 = z14;
                    interfaceC2300f2 = interfaceC2300f;
                    j15 = jM125385c1;
                    z24 = z16;
                    z25 = z17;
                    j16 = j13;
                    z26 = z15;
                    j17 = j14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final Modifier modifier4 = modifier2;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.l
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33090m.m104839g(modifier4, markdownText, style, z24, z25, f14, j15, j16, interfaceC22973k2, z19, interfaceC2300f2, z26, j17, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            z17 = z13;
            i19 = i15 & 32;
            if (i19 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87147d(f13)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i24;
            }
            if ((i13 & 1572864) == 0) {
                jM125385c1 = j7;
                if ((i15 & 64) == 0) {
                    i48 = 524288;
                } else {
                    i48 = 524288;
                }
                i16 |= i48;
            } else {
                jM125385c1 = j7;
            }
            if ((i13 & 12582912) != 0) {
                if ((i15 & 128) == 0) {
                    i47 = 4194304;
                } else {
                    i47 = 4194304;
                }
                i16 |= i47;
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q2.m87153g(interfaceC22973k1)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i26;
            }
            i27 = i15 & 512;
            if (i27 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87155h(z14)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i16 |= i28;
            }
            i29 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i29 != 0) {
                i34 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q2.m87153g(interfaceC2300f)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i34 = i14 | i35;
            } else {
                i34 = i14;
            }
            i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i36 != 0) {
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i37 = 32;
                    } else {
                        i37 = 16;
                    }
                    i34 |= i37;
                }
                if ((i14 & 384) != 0) {
                    if ((i15 & 4096) == 0) {
                        i54 = 256;
                    }
                    i34 |= i54;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onToggle)) {
                        i56 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i34 |= i56;
                }
                i38 = i34;
                if ((306783379 & i16) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z18)) {
                    c28655q2.m87140Z();
                    i39 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i39 != 0) {
                        if (i49 != 0) {
                            modifier2 = c2314t;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i55 != 0) {
                            z16 = false;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        }
                        if (i19 != 0) {
                            f15 = 4 * 3;
                        } else {
                            f15 = f13;
                        }
                        if ((i15 & 64) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                            i16 &= -3670017;
                        }
                        if ((i15 & 128) != 0) {
                            jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                            i16 &= -29360129;
                        } else {
                            jM125403k0 = j13;
                        }
                        if (i25 != 0) {
                            float f110 = 1 * 8;
                            c22976l1 = new C22976l1(f110, f110, f110, f110);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i27 != 0) {
                            z27 = true;
                        } else {
                            z27 = z14;
                        }
                        if (i29 != 0) {
                            interfaceC2300f3 = null;
                        } else {
                            interfaceC2300f3 = interfaceC2300f;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if ((i15 & 4096) != 0) {
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            i44 = i38 & (-897);
                            i45 = i16;
                            j18 = jM125403k0;
                        } else {
                            i44 = i38;
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            i45 = i16;
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            j18 = jM125403k0;
                            jM125430y = j14;
                        }
                    } else {
                        if (i49 != 0) {
                            modifier2 = c2314t;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i55 != 0) {
                            z16 = false;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        }
                        if (i19 != 0) {
                            f15 = 4 * 3;
                        } else {
                            f15 = f13;
                        }
                        if ((i15 & 64) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                            i16 &= -3670017;
                        }
                        if ((i15 & 128) != 0) {
                            jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                            i16 &= -29360129;
                        } else {
                            jM125403k0 = j13;
                        }
                        if (i25 != 0) {
                            float f111 = 1 * 8;
                            c22976l1 = new C22976l1(f111, f111, f111, f111);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i27 != 0) {
                            z27 = true;
                        } else {
                            z27 = z14;
                        }
                        if (i29 != 0) {
                            interfaceC2300f3 = null;
                        } else {
                            interfaceC2300f3 = interfaceC2300f;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if ((i15 & 4096) != 0) {
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            i44 = i38 & (-897);
                            i45 = i16;
                            j18 = jM125403k0;
                        } else {
                            i44 = i38;
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            i45 = i16;
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            j18 = jM125403k0;
                            jM125430y = j14;
                        }
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    long j111 = jM125430y;
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                    if (interfaceC2300f4 != null) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    if (z35) {
                        interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, interfaceC22973k3.mo43112d(), 0.0f, interfaceC22973k3.mo43109a(), 5);
                    } else {
                        interfaceC22973k1M3381c = interfaceC22973k3;
                    }
                    if (z34) {
                        f16 = 0 * 8;
                        i46 = 2;
                    } else {
                        f16 = 0 * 8;
                        i46 = 2;
                    }
                    Modifier modifierM44112a3 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(interfaceC22973k1M3381c, AbstractC1099a.m3392n(modifier2, f16, 0.0f, i46)), z17);
                    C18027i c18027i3 = new C18027i(1);
                    if ((i44 & 7168) == 2048) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    if ((i45 & 7168) == 2048) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z36 | z37;
                    objM87133R2 = c28655q2.m87133R();
                    if (z38) {
                        objM87133R2 = new C3675b(onToggle, z16, 8);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3675b(onToggle, z16, 8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3360e3 = AbstractC1092a.m3360e(modifierM44112a3, interfaceC21083i3, null, z17, c18027i3, (InterfaceC4339a) objM87133R2, 8);
                    C22949e c22949e3 = AbstractC22977m.f90650a;
                    if (interfaceC2300f4 == null) {
                        interfaceC2300f5 = C2299e.f9110M;
                    } else {
                        interfaceC2300f5 = interfaceC2300f4;
                    }
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(new C22971k(0, true, new C22541b(interfaceC2300f5, 4)), C2299e.f9108K, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3360e3);
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
                    boolean z311 = z16;
                    boolean z46 = z17;
                    AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z29)), AbstractC37817c.m121344e(-764695604, c28655q2, new C23099g2(z311, onToggle, z46, j111)), c28655q2, 56);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
                    long j26 = jM125385c1;
                    AbstractC21048g.m58807M(markdownText, null, false, C21053l.f79834a.m58880a(style.getStyle(), j26, j18, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, (i45 >> 15) & MessageListItemViewType.GIPHY, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760), null, 0, 0, 0, false, c28655q2, (i45 >> 3) & 14, 502);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    z25 = z46;
                    f14 = f15;
                    j15 = j26;
                    j16 = j18;
                    z19 = z29;
                    interfaceC2300f2 = interfaceC2300f4;
                    z26 = z34;
                    z24 = z311;
                    j17 = j111;
                    interfaceC22973k2 = interfaceC22973k3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    f14 = f13;
                    interfaceC22973k2 = interfaceC22973k1;
                    z19 = z14;
                    interfaceC2300f2 = interfaceC2300f;
                    j15 = jM125385c1;
                    z24 = z16;
                    z25 = z17;
                    j16 = j13;
                    z26 = z15;
                    j17 = j14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final Modifier modifier5 = modifier2;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.l
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33090m.m104839g(modifier5, markdownText, style, z24, z25, f14, j15, j16, interfaceC22973k2, z19, interfaceC2300f2, z26, j17, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i34 |= 48;
            if ((i14 & 384) != 0) {
                if ((i15 & 4096) == 0) {
                    i54 = 256;
                }
                i34 |= i54;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87157i(onToggle)) {
                    i56 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i34 |= i56;
            }
            i38 = i34;
            if ((306783379 & i16) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z18)) {
                c28655q2.m87140Z();
                i39 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i39 != 0) {
                    if (i49 != 0) {
                        modifier2 = c2314t;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i55 != 0) {
                        z16 = false;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    }
                    if (i19 != 0) {
                        f15 = 4 * 3;
                    } else {
                        f15 = f13;
                    }
                    if ((i15 & 64) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                        i16 &= -3670017;
                    }
                    if ((i15 & 128) != 0) {
                        jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                        i16 &= -29360129;
                    } else {
                        jM125403k0 = j13;
                    }
                    if (i25 != 0) {
                        float f112 = 1 * 8;
                        c22976l1 = new C22976l1(f112, f112, f112, f112);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i27 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                    if (i29 != 0) {
                        interfaceC2300f3 = null;
                    } else {
                        interfaceC2300f3 = interfaceC2300f;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if ((i15 & 4096) != 0) {
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        i44 = i38 & (-897);
                        i45 = i16;
                        j18 = jM125403k0;
                    } else {
                        i44 = i38;
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        i45 = i16;
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        j18 = jM125403k0;
                        jM125430y = j14;
                    }
                } else {
                    if (i49 != 0) {
                        modifier2 = c2314t;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i55 != 0) {
                        z16 = false;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    }
                    if (i19 != 0) {
                        f15 = 4 * 3;
                    } else {
                        f15 = f13;
                    }
                    if ((i15 & 64) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                        i16 &= -3670017;
                    }
                    if ((i15 & 128) != 0) {
                        jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                        i16 &= -29360129;
                    } else {
                        jM125403k0 = j13;
                    }
                    if (i25 != 0) {
                        float f113 = 1 * 8;
                        c22976l1 = new C22976l1(f113, f113, f113, f113);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i27 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                    if (i29 != 0) {
                        interfaceC2300f3 = null;
                    } else {
                        interfaceC2300f3 = interfaceC2300f;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if ((i15 & 4096) != 0) {
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        i44 = i38 & (-897);
                        i45 = i16;
                        j18 = jM125403k0;
                    } else {
                        i44 = i38;
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        i45 = i16;
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        j18 = jM125403k0;
                        jM125430y = j14;
                    }
                }
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                long j112 = jM125430y;
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                if (interfaceC2300f4 != null) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                if (z35) {
                    interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, interfaceC22973k3.mo43112d(), 0.0f, interfaceC22973k3.mo43109a(), 5);
                } else {
                    interfaceC22973k1M3381c = interfaceC22973k3;
                }
                if (z34) {
                    f16 = 0 * 8;
                    i46 = 2;
                } else {
                    f16 = 0 * 8;
                    i46 = 2;
                }
                Modifier modifierM44112a4 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(interfaceC22973k1M3381c, AbstractC1099a.m3392n(modifier2, f16, 0.0f, i46)), z17);
                C18027i c18027i4 = new C18027i(1);
                if ((i44 & 7168) == 2048) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                if ((i45 & 7168) == 2048) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z36 | z37;
                objM87133R2 = c28655q2.m87133R();
                if (z38) {
                    objM87133R2 = new C3675b(onToggle, z16, 8);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3675b(onToggle, z16, 8);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3360e4 = AbstractC1092a.m3360e(modifierM44112a4, interfaceC21083i4, null, z17, c18027i4, (InterfaceC4339a) objM87133R2, 8);
                C22949e c22949e4 = AbstractC22977m.f90650a;
                if (interfaceC2300f4 == null) {
                    interfaceC2300f5 = C2299e.f9110M;
                } else {
                    interfaceC2300f5 = interfaceC2300f4;
                }
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(new C22971k(0, true, new C22541b(interfaceC2300f5, 4)), C2299e.f9108K, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3360e4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                boolean z312 = z16;
                boolean z47 = z17;
                AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z29)), AbstractC37817c.m121344e(-764695604, c28655q2, new C23099g2(z312, onToggle, z47, j112)), c28655q2, 56);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
                long j27 = jM125385c1;
                AbstractC21048g.m58807M(markdownText, null, false, C21053l.f79834a.m58880a(style.getStyle(), j27, j18, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, (i45 >> 15) & MessageListItemViewType.GIPHY, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760), null, 0, 0, 0, false, c28655q2, (i45 >> 3) & 14, 502);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                z25 = z47;
                f14 = f15;
                j15 = j27;
                j16 = j18;
                z19 = z29;
                interfaceC2300f2 = interfaceC2300f4;
                z26 = z34;
                z24 = z312;
                j17 = j112;
                interfaceC22973k2 = interfaceC22973k3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                f14 = f13;
                interfaceC22973k2 = interfaceC22973k1;
                z19 = z14;
                interfaceC2300f2 = interfaceC2300f;
                j15 = jM125385c1;
                z24 = z16;
                z25 = z17;
                j16 = j13;
                z26 = z15;
                j17 = j14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final Modifier modifier6 = modifier2;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.l
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33090m.m104839g(modifier6, markdownText, style, z24, z25, f14, j15, j16, interfaceC22973k2, z19, interfaceC2300f2, z26, j17, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        z16 = z4;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i13 & 24576) == 0) {
                z17 = z13;
                if (c28655q2.m87155h(z17)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i18;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87147d(f13)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i24;
            }
            if ((i13 & 1572864) == 0) {
                jM125385c1 = j7;
                if ((i15 & 64) == 0) {
                    i48 = 524288;
                } else {
                    i48 = 524288;
                }
                i16 |= i48;
            } else {
                jM125385c1 = j7;
            }
            if ((i13 & 12582912) != 0) {
                if ((i15 & 128) == 0) {
                    i47 = 4194304;
                } else {
                    i47 = 4194304;
                }
                i16 |= i47;
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q2.m87153g(interfaceC22973k1)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i26;
            }
            i27 = i15 & 512;
            if (i27 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87155h(z14)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i16 |= i28;
            }
            i29 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i29 != 0) {
                i34 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q2.m87153g(interfaceC2300f)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i34 = i14 | i35;
            } else {
                i34 = i14;
            }
            i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i36 != 0) {
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i37 = 32;
                    } else {
                        i37 = 16;
                    }
                    i34 |= i37;
                }
                if ((i14 & 384) != 0) {
                    if ((i15 & 4096) == 0) {
                        i54 = 256;
                    }
                    i34 |= i54;
                }
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(onToggle)) {
                        i56 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i34 |= i56;
                }
                i38 = i34;
                if ((306783379 & i16) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z18)) {
                    c28655q2.m87140Z();
                    i39 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i39 != 0) {
                        if (i49 != 0) {
                            modifier2 = c2314t;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i55 != 0) {
                            z16 = false;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        }
                        if (i19 != 0) {
                            f15 = 4 * 3;
                        } else {
                            f15 = f13;
                        }
                        if ((i15 & 64) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                            i16 &= -3670017;
                        }
                        if ((i15 & 128) != 0) {
                            jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                            i16 &= -29360129;
                        } else {
                            jM125403k0 = j13;
                        }
                        if (i25 != 0) {
                            float f114 = 1 * 8;
                            c22976l1 = new C22976l1(f114, f114, f114, f114);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i27 != 0) {
                            z27 = true;
                        } else {
                            z27 = z14;
                        }
                        if (i29 != 0) {
                            interfaceC2300f3 = null;
                        } else {
                            interfaceC2300f3 = interfaceC2300f;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if ((i15 & 4096) != 0) {
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            i44 = i38 & (-897);
                            i45 = i16;
                            j18 = jM125403k0;
                        } else {
                            i44 = i38;
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            i45 = i16;
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            j18 = jM125403k0;
                            jM125430y = j14;
                        }
                    } else {
                        if (i49 != 0) {
                            modifier2 = c2314t;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i55 != 0) {
                            z16 = false;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        }
                        if (i19 != 0) {
                            f15 = 4 * 3;
                        } else {
                            f15 = f13;
                        }
                        if ((i15 & 64) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                            i16 &= -3670017;
                        }
                        if ((i15 & 128) != 0) {
                            jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                            i16 &= -29360129;
                        } else {
                            jM125403k0 = j13;
                        }
                        if (i25 != 0) {
                            float f115 = 1 * 8;
                            c22976l1 = new C22976l1(f115, f115, f115, f115);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i27 != 0) {
                            z27 = true;
                        } else {
                            z27 = z14;
                        }
                        if (i29 != 0) {
                            interfaceC2300f3 = null;
                        } else {
                            interfaceC2300f3 = interfaceC2300f;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if ((i15 & 4096) != 0) {
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            i44 = i38 & (-897);
                            i45 = i16;
                            j18 = jM125403k0;
                        } else {
                            i44 = i38;
                            interfaceC22973k3 = c22976l1;
                            z29 = z27;
                            i45 = i16;
                            interfaceC2300f4 = interfaceC2300f3;
                            z34 = z28;
                            j18 = jM125403k0;
                            jM125430y = j14;
                        }
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    long j113 = jM125430y;
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R;
                    if (interfaceC2300f4 != null) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    if (z35) {
                        interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, interfaceC22973k3.mo43112d(), 0.0f, interfaceC22973k3.mo43109a(), 5);
                    } else {
                        interfaceC22973k1M3381c = interfaceC22973k3;
                    }
                    if (z34) {
                        f16 = 0 * 8;
                        i46 = 2;
                    } else {
                        f16 = 0 * 8;
                        i46 = 2;
                    }
                    Modifier modifierM44112a5 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(interfaceC22973k1M3381c, AbstractC1099a.m3392n(modifier2, f16, 0.0f, i46)), z17);
                    C18027i c18027i5 = new C18027i(1);
                    if ((i44 & 7168) == 2048) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    if ((i45 & 7168) == 2048) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z36 | z37;
                    objM87133R2 = c28655q2.m87133R();
                    if (z38) {
                        objM87133R2 = new C3675b(onToggle, z16, 8);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3675b(onToggle, z16, 8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3360e5 = AbstractC1092a.m3360e(modifierM44112a5, interfaceC21083i5, null, z17, c18027i5, (InterfaceC4339a) objM87133R2, 8);
                    C22949e c22949e5 = AbstractC22977m.f90650a;
                    if (interfaceC2300f4 == null) {
                        interfaceC2300f5 = C2299e.f9110M;
                    } else {
                        interfaceC2300f5 = interfaceC2300f4;
                    }
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(new C22971k(0, true, new C22541b(interfaceC2300f5, 4)), C2299e.f9108K, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3360e5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                    boolean z313 = z16;
                    boolean z48 = z17;
                    AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z29)), AbstractC37817c.m121344e(-764695604, c28655q2, new C23099g2(z313, onToggle, z48, j113)), c28655q2, 56);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
                    long j28 = jM125385c1;
                    AbstractC21048g.m58807M(markdownText, null, false, C21053l.f79834a.m58880a(style.getStyle(), j28, j18, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, (i45 >> 15) & MessageListItemViewType.GIPHY, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760), null, 0, 0, 0, false, c28655q2, (i45 >> 3) & 14, 502);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    z25 = z48;
                    f14 = f15;
                    j15 = j28;
                    j16 = j18;
                    z19 = z29;
                    interfaceC2300f2 = interfaceC2300f4;
                    z26 = z34;
                    z24 = z313;
                    j17 = j113;
                    interfaceC22973k2 = interfaceC22973k3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    f14 = f13;
                    interfaceC22973k2 = interfaceC22973k1;
                    z19 = z14;
                    interfaceC2300f2 = interfaceC2300f;
                    j15 = jM125385c1;
                    z24 = z16;
                    z25 = z17;
                    j16 = j13;
                    z26 = z15;
                    j17 = j14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final Modifier modifier7 = modifier2;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.l
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33090m.m104839g(modifier7, markdownText, style, z24, z25, f14, j15, j16, interfaceC22973k2, z19, interfaceC2300f2, z26, j17, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i34 |= 48;
            if ((i14 & 384) != 0) {
                if ((i15 & 4096) == 0) {
                    i54 = 256;
                }
                i34 |= i54;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87157i(onToggle)) {
                    i56 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i34 |= i56;
            }
            i38 = i34;
            if ((306783379 & i16) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z18)) {
                c28655q2.m87140Z();
                i39 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i39 != 0) {
                    if (i49 != 0) {
                        modifier2 = c2314t;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i55 != 0) {
                        z16 = false;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    }
                    if (i19 != 0) {
                        f15 = 4 * 3;
                    } else {
                        f15 = f13;
                    }
                    if ((i15 & 64) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                        i16 &= -3670017;
                    }
                    if ((i15 & 128) != 0) {
                        jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                        i16 &= -29360129;
                    } else {
                        jM125403k0 = j13;
                    }
                    if (i25 != 0) {
                        float f116 = 1 * 8;
                        c22976l1 = new C22976l1(f116, f116, f116, f116);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i27 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                    if (i29 != 0) {
                        interfaceC2300f3 = null;
                    } else {
                        interfaceC2300f3 = interfaceC2300f;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if ((i15 & 4096) != 0) {
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        i44 = i38 & (-897);
                        i45 = i16;
                        j18 = jM125403k0;
                    } else {
                        i44 = i38;
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        i45 = i16;
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        j18 = jM125403k0;
                        jM125430y = j14;
                    }
                } else {
                    if (i49 != 0) {
                        modifier2 = c2314t;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i55 != 0) {
                        z16 = false;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    }
                    if (i19 != 0) {
                        f15 = 4 * 3;
                    } else {
                        f15 = f13;
                    }
                    if ((i15 & 64) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                        i16 &= -3670017;
                    }
                    if ((i15 & 128) != 0) {
                        jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                        i16 &= -29360129;
                    } else {
                        jM125403k0 = j13;
                    }
                    if (i25 != 0) {
                        float f117 = 1 * 8;
                        c22976l1 = new C22976l1(f117, f117, f117, f117);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i27 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                    if (i29 != 0) {
                        interfaceC2300f3 = null;
                    } else {
                        interfaceC2300f3 = interfaceC2300f;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if ((i15 & 4096) != 0) {
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        i44 = i38 & (-897);
                        i45 = i16;
                        j18 = jM125403k0;
                    } else {
                        i44 = i38;
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        i45 = i16;
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        j18 = jM125403k0;
                        jM125430y = j14;
                    }
                }
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                long j114 = jM125430y;
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i6 = (InterfaceC21083i) objM87133R;
                if (interfaceC2300f4 != null) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                if (z35) {
                    interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, interfaceC22973k3.mo43112d(), 0.0f, interfaceC22973k3.mo43109a(), 5);
                } else {
                    interfaceC22973k1M3381c = interfaceC22973k3;
                }
                if (z34) {
                    f16 = 0 * 8;
                    i46 = 2;
                } else {
                    f16 = 0 * 8;
                    i46 = 2;
                }
                Modifier modifierM44112a6 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(interfaceC22973k1M3381c, AbstractC1099a.m3392n(modifier2, f16, 0.0f, i46)), z17);
                C18027i c18027i6 = new C18027i(1);
                if ((i44 & 7168) == 2048) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                if ((i45 & 7168) == 2048) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z36 | z37;
                objM87133R2 = c28655q2.m87133R();
                if (z38) {
                    objM87133R2 = new C3675b(onToggle, z16, 8);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3675b(onToggle, z16, 8);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3360e6 = AbstractC1092a.m3360e(modifierM44112a6, interfaceC21083i6, null, z17, c18027i6, (InterfaceC4339a) objM87133R2, 8);
                C22949e c22949e6 = AbstractC22977m.f90650a;
                if (interfaceC2300f4 == null) {
                    interfaceC2300f5 = C2299e.f9110M;
                } else {
                    interfaceC2300f5 = interfaceC2300f4;
                }
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(new C22971k(0, true, new C22541b(interfaceC2300f5, 4)), C2299e.f9108K, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3360e6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                boolean z314 = z16;
                boolean z49 = z17;
                AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z29)), AbstractC37817c.m121344e(-764695604, c28655q2, new C23099g2(z314, onToggle, z49, j114)), c28655q2, 56);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
                long j29 = jM125385c1;
                AbstractC21048g.m58807M(markdownText, null, false, C21053l.f79834a.m58880a(style.getStyle(), j29, j18, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, (i45 >> 15) & MessageListItemViewType.GIPHY, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760), null, 0, 0, 0, false, c28655q2, (i45 >> 3) & 14, 502);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                z25 = z49;
                f14 = f15;
                j15 = j29;
                j16 = j18;
                z19 = z29;
                interfaceC2300f2 = interfaceC2300f4;
                z26 = z34;
                z24 = z314;
                j17 = j114;
                interfaceC22973k2 = interfaceC22973k3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                f14 = f13;
                interfaceC22973k2 = interfaceC22973k1;
                z19 = z14;
                interfaceC2300f2 = interfaceC2300f;
                j15 = jM125385c1;
                z24 = z16;
                z25 = z17;
                j16 = j13;
                z26 = z15;
                j17 = j14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final Modifier modifier8 = modifier2;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.l
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33090m.m104839g(modifier8, markdownText, style, z24, z25, f14, j15, j16, interfaceC22973k2, z19, interfaceC2300f2, z26, j17, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        z17 = z13;
        i19 = i15 & 32;
        if (i19 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87147d(f13)) {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i24;
        }
        if ((i13 & 1572864) == 0) {
            jM125385c1 = j7;
            if ((i15 & 64) == 0) {
                i48 = 524288;
            } else {
                i48 = 524288;
            }
            i16 |= i48;
        } else {
            jM125385c1 = j7;
        }
        if ((i13 & 12582912) != 0) {
            if ((i15 & 128) == 0) {
                i47 = 4194304;
            } else {
                i47 = 4194304;
            }
            i16 |= i47;
        }
        i25 = i15 & 256;
        if (i25 != 0) {
            i16 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c28655q2.m87153g(interfaceC22973k1)) {
                i26 = 67108864;
            } else {
                i26 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i26;
        }
        i27 = i15 & 512;
        if (i27 != 0) {
            i16 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c28655q2.m87155h(z14)) {
                i28 = 536870912;
            } else {
                i28 = 268435456;
            }
            i16 |= i28;
        }
        i29 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i29 != 0) {
            i34 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q2.m87153g(interfaceC2300f)) {
                i35 = 4;
            } else {
                i35 = 2;
            }
            i34 = i14 | i35;
        } else {
            i34 = i14;
        }
        i36 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i36 != 0) {
            if ((i14 & 48) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i37 = 32;
                } else {
                    i37 = 16;
                }
                i34 |= i37;
            }
            if ((i14 & 384) != 0) {
                if ((i15 & 4096) == 0) {
                    i54 = 256;
                }
                i34 |= i54;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87157i(onToggle)) {
                    i56 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i34 |= i56;
            }
            i38 = i34;
            if ((306783379 & i16) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z18)) {
                c28655q2.m87140Z();
                i39 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i39 != 0) {
                    if (i49 != 0) {
                        modifier2 = c2314t;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i55 != 0) {
                        z16 = false;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    }
                    if (i19 != 0) {
                        f15 = 4 * 3;
                    } else {
                        f15 = f13;
                    }
                    if ((i15 & 64) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                        i16 &= -3670017;
                    }
                    if ((i15 & 128) != 0) {
                        jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                        i16 &= -29360129;
                    } else {
                        jM125403k0 = j13;
                    }
                    if (i25 != 0) {
                        float f118 = 1 * 8;
                        c22976l1 = new C22976l1(f118, f118, f118, f118);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i27 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                    if (i29 != 0) {
                        interfaceC2300f3 = null;
                    } else {
                        interfaceC2300f3 = interfaceC2300f;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if ((i15 & 4096) != 0) {
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        i44 = i38 & (-897);
                        i45 = i16;
                        j18 = jM125403k0;
                    } else {
                        i44 = i38;
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        i45 = i16;
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        j18 = jM125403k0;
                        jM125430y = j14;
                    }
                } else {
                    if (i49 != 0) {
                        modifier2 = c2314t;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i55 != 0) {
                        z16 = false;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    }
                    if (i19 != 0) {
                        f15 = 4 * 3;
                    } else {
                        f15 = f13;
                    }
                    if ((i15 & 64) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                        i16 &= -3670017;
                    }
                    if ((i15 & 128) != 0) {
                        jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                        i16 &= -29360129;
                    } else {
                        jM125403k0 = j13;
                    }
                    if (i25 != 0) {
                        float f119 = 1 * 8;
                        c22976l1 = new C22976l1(f119, f119, f119, f119);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i27 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                    if (i29 != 0) {
                        interfaceC2300f3 = null;
                    } else {
                        interfaceC2300f3 = interfaceC2300f;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if ((i15 & 4096) != 0) {
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        i44 = i38 & (-897);
                        i45 = i16;
                        j18 = jM125403k0;
                    } else {
                        i44 = i38;
                        interfaceC22973k3 = c22976l1;
                        z29 = z27;
                        i45 = i16;
                        interfaceC2300f4 = interfaceC2300f3;
                        z34 = z28;
                        j18 = jM125403k0;
                        jM125430y = j14;
                    }
                }
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                long j115 = jM125430y;
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i7 = (InterfaceC21083i) objM87133R;
                if (interfaceC2300f4 != null) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                if (z35) {
                    interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, interfaceC22973k3.mo43112d(), 0.0f, interfaceC22973k3.mo43109a(), 5);
                } else {
                    interfaceC22973k1M3381c = interfaceC22973k3;
                }
                if (z34) {
                    f16 = 0 * 8;
                    i46 = 2;
                } else {
                    f16 = 0 * 8;
                    i46 = 2;
                }
                Modifier modifierM44112a7 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(interfaceC22973k1M3381c, AbstractC1099a.m3392n(modifier2, f16, 0.0f, i46)), z17);
                C18027i c18027i7 = new C18027i(1);
                if ((i44 & 7168) == 2048) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                if ((i45 & 7168) == 2048) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z36 | z37;
                objM87133R2 = c28655q2.m87133R();
                if (z38) {
                    objM87133R2 = new C3675b(onToggle, z16, 8);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3675b(onToggle, z16, 8);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3360e7 = AbstractC1092a.m3360e(modifierM44112a7, interfaceC21083i7, null, z17, c18027i7, (InterfaceC4339a) objM87133R2, 8);
                C22949e c22949e7 = AbstractC22977m.f90650a;
                if (interfaceC2300f4 == null) {
                    interfaceC2300f5 = C2299e.f9110M;
                } else {
                    interfaceC2300f5 = interfaceC2300f4;
                }
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(new C22971k(0, true, new C22541b(interfaceC2300f5, 4)), C2299e.f9108K, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3360e7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                boolean z315 = z16;
                boolean z410 = z17;
                AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z29)), AbstractC37817c.m121344e(-764695604, c28655q2, new C23099g2(z315, onToggle, z410, j115)), c28655q2, 56);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
                long j210 = jM125385c1;
                AbstractC21048g.m58807M(markdownText, null, false, C21053l.f79834a.m58880a(style.getStyle(), j210, j18, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, (i45 >> 15) & MessageListItemViewType.GIPHY, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760), null, 0, 0, 0, false, c28655q2, (i45 >> 3) & 14, 502);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                z25 = z410;
                f14 = f15;
                j15 = j210;
                j16 = j18;
                z19 = z29;
                interfaceC2300f2 = interfaceC2300f4;
                z26 = z34;
                z24 = z315;
                j17 = j115;
                interfaceC22973k2 = interfaceC22973k3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                f14 = f13;
                interfaceC22973k2 = interfaceC22973k1;
                z19 = z14;
                interfaceC2300f2 = interfaceC2300f;
                j15 = jM125385c1;
                z24 = z16;
                z25 = z17;
                j16 = j13;
                z26 = z15;
                j17 = j14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final Modifier modifier9 = modifier2;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.l
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33090m.m104839g(modifier9, markdownText, style, z24, z25, f14, j15, j16, interfaceC22973k2, z19, interfaceC2300f2, z26, j17, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i34 |= 48;
        if ((i14 & 384) != 0) {
            if ((i15 & 4096) == 0) {
                i54 = 256;
            }
            i34 |= i54;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q2.m87157i(onToggle)) {
                i56 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            i34 |= i56;
        }
        i38 = i34;
        if ((306783379 & i16) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (c28655q2.m87135U(i16 & 1, z18)) {
            c28655q2.m87140Z();
            i39 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i39 != 0) {
                if (i49 != 0) {
                    modifier2 = c2314t;
                } else {
                    modifier2 = modifier;
                }
                if (i55 != 0) {
                    z16 = false;
                }
                if (i17 != 0) {
                    z17 = true;
                }
                if (i19 != 0) {
                    f15 = 4 * 3;
                } else {
                    f15 = f13;
                }
                if ((i15 & 64) != 0) {
                    jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                    i16 &= -3670017;
                }
                if ((i15 & 128) != 0) {
                    jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                    i16 &= -29360129;
                } else {
                    jM125403k0 = j13;
                }
                if (i25 != 0) {
                    float f1110 = 1 * 8;
                    c22976l1 = new C22976l1(f1110, f1110, f1110, f1110);
                } else {
                    c22976l1 = interfaceC22973k1;
                }
                if (i27 != 0) {
                    z27 = true;
                } else {
                    z27 = z14;
                }
                if (i29 != 0) {
                    interfaceC2300f3 = null;
                } else {
                    interfaceC2300f3 = interfaceC2300f;
                }
                if (i36 != 0) {
                    z28 = false;
                } else {
                    z28 = z15;
                }
                if ((i15 & 4096) != 0) {
                    interfaceC22973k3 = c22976l1;
                    z29 = z27;
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    interfaceC2300f4 = interfaceC2300f3;
                    z34 = z28;
                    i44 = i38 & (-897);
                    i45 = i16;
                    j18 = jM125403k0;
                } else {
                    i44 = i38;
                    interfaceC22973k3 = c22976l1;
                    z29 = z27;
                    i45 = i16;
                    interfaceC2300f4 = interfaceC2300f3;
                    z34 = z28;
                    j18 = jM125403k0;
                    jM125430y = j14;
                }
            } else {
                if (i49 != 0) {
                    modifier2 = c2314t;
                } else {
                    modifier2 = modifier;
                }
                if (i55 != 0) {
                    z16 = false;
                }
                if (i17 != 0) {
                    z17 = true;
                }
                if (i19 != 0) {
                    f15 = 4 * 3;
                } else {
                    f15 = f13;
                }
                if ((i15 & 64) != 0) {
                    jM125385c1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                    i16 &= -3670017;
                }
                if ((i15 & 128) != 0) {
                    jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
                    i16 &= -29360129;
                } else {
                    jM125403k0 = j13;
                }
                if (i25 != 0) {
                    float f1111 = 1 * 8;
                    c22976l1 = new C22976l1(f1111, f1111, f1111, f1111);
                } else {
                    c22976l1 = interfaceC22973k1;
                }
                if (i27 != 0) {
                    z27 = true;
                } else {
                    z27 = z14;
                }
                if (i29 != 0) {
                    interfaceC2300f3 = null;
                } else {
                    interfaceC2300f3 = interfaceC2300f;
                }
                if (i36 != 0) {
                    z28 = false;
                } else {
                    z28 = z15;
                }
                if ((i15 & 4096) != 0) {
                    interfaceC22973k3 = c22976l1;
                    z29 = z27;
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    interfaceC2300f4 = interfaceC2300f3;
                    z34 = z28;
                    i44 = i38 & (-897);
                    i45 = i16;
                    j18 = jM125403k0;
                } else {
                    i44 = i38;
                    interfaceC22973k3 = c22976l1;
                    z29 = z27;
                    i45 = i16;
                    interfaceC2300f4 = interfaceC2300f3;
                    z34 = z28;
                    j18 = jM125403k0;
                    jM125430y = j14;
                }
            }
            c28655q2.m87175r();
            objM87133R = c28655q2.m87133R();
            long j116 = jM125430y;
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i8 = (InterfaceC21083i) objM87133R;
            if (interfaceC2300f4 != null) {
                z35 = true;
            } else {
                z35 = false;
            }
            if (z35) {
                interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, interfaceC22973k3.mo43112d(), 0.0f, interfaceC22973k3.mo43109a(), 5);
            } else {
                interfaceC22973k1M3381c = interfaceC22973k3;
            }
            if (z34) {
                f16 = 0 * 8;
                i46 = 2;
            } else {
                f16 = 0 * 8;
                i46 = 2;
            }
            Modifier modifierM44112a8 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(interfaceC22973k1M3381c, AbstractC1099a.m3392n(modifier2, f16, 0.0f, i46)), z17);
            C18027i c18027i8 = new C18027i(1);
            if ((i44 & 7168) == 2048) {
                z36 = true;
            } else {
                z36 = false;
            }
            if ((i45 & 7168) == 2048) {
                z37 = true;
            } else {
                z37 = false;
            }
            z38 = z36 | z37;
            objM87133R2 = c28655q2.m87133R();
            if (z38) {
                objM87133R2 = new C3675b(onToggle, z16, 8);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C3675b(onToggle, z16, 8);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM3360e8 = AbstractC1092a.m3360e(modifierM44112a8, interfaceC21083i8, null, z17, c18027i8, (InterfaceC4339a) objM87133R2, 8);
            C22949e c22949e8 = AbstractC22977m.f90650a;
            if (interfaceC2300f4 == null) {
                interfaceC2300f5 = C2299e.f9110M;
            } else {
                interfaceC2300f5 = interfaceC2300f4;
            }
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(new C22971k(0, true, new C22541b(interfaceC2300f5, 4)), C2299e.f9108K, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3360e8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
            boolean z316 = z16;
            boolean z411 = z17;
            AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.valueOf(z29)), AbstractC37817c.m121344e(-764695604, c28655q2, new C23099g2(z316, onToggle, z411, j116)), c28655q2, 56);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
            long j211 = jM125385c1;
            AbstractC21048g.m58807M(markdownText, null, false, C21053l.f79834a.m58880a(style.getStyle(), j211, j18, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, (i45 >> 15) & MessageListItemViewType.GIPHY, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760), null, 0, 0, 0, false, c28655q2, (i45 >> 3) & 14, 502);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            z25 = z411;
            f14 = f15;
            j15 = j211;
            j16 = j18;
            z19 = z29;
            interfaceC2300f2 = interfaceC2300f4;
            z26 = z34;
            z24 = z316;
            j17 = j116;
            interfaceC22973k2 = interfaceC22973k3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            f14 = f13;
            interfaceC22973k2 = interfaceC22973k1;
            z19 = z14;
            interfaceC2300f2 = interfaceC2300f;
            j15 = jM125385c1;
            z24 = z16;
            z25 = z17;
            j16 = j13;
            z26 = z15;
            j17 = j14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final Modifier modifier10 = modifier2;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.l
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC33090m.m104839g(modifier10, markdownText, style, z24, z25, f14, j15, j16, interfaceC22973k2, z19, interfaceC2300f2, z26, j17, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104837e(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m104838f(boolean z4, Function1 function1, boolean z13, long j7, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            AbstractC14959b1.m43082a(z4, function1, null, z13, AbstractC12240d.m34081r(j7, c38072d.m121949b(c28655q, 6).getBrandWhite(), c38072d.m121949b(c28655q, 6).getBrandBlack(), 0L, c28655q, 0, 24), c28655q, 0, 20);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m104839g(Modifier modifier, String str, C2886a c2886a, boolean z4, boolean z13, float f13, long j7, long j13, InterfaceC22973k1 interfaceC22973k1, boolean z14, InterfaceC2300f interfaceC2300f, boolean z15, long j14, Function1 function1, int i13, int i14, int i15, Composer composer, int i16) {
        m104836d(modifier, str, c2886a, z4, z13, f13, j7, j13, interfaceC22973k1, z14, interfaceC2300f, z15, j14, function1, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }
}
