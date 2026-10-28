package eg2;

import androidx.compose.runtime.Composer;
import az1.C2161b;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c31.EnumC3920d;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import eb1.C13005a;
import gz0.EnumC16313m0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: eg2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Leg2/k;", "step", "", "enabled", "isLoading", "isError", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "g", "(Leg2/k;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V", "k", "Li2/t;", "a", "Li2/t;", "smsSetupButtonBrush", "sms_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13172e {

    /* JADX INFO: renamed from: a */
    private static final AbstractC17911t f45654a = C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4287324927L)), new C17919x(AbstractC17918w0.m51517e(4283487743L))), (((long) Float.floatToRawIntBits(-30.0f)) << 32) | (((long) Float.floatToRawIntBits(30.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(200.0f)) & 4294967295L), 8);

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x0116  */
    /* JADX WARN: Code duplicated, block: B:86:0x0118  */
    /* JADX WARN: Code duplicated, block: B:89:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:93:0x0138  */
    /* JADX WARN: Code duplicated, block: B:96:0x0143  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m36935g(EnumC13178k step, boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        int i18;
        boolean z17;
        int i19;
        int i24;
        InterfaceC4339a interfaceC4339a2;
        int i25;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        boolean z26;
        C28676v0 c28676v0;
        EnumC3920d buttonState;
        AbstractC17911t abstractC17911t;
        boolean z27;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1366419487);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(step.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                z15 = z4;
                i15 |= c28655q.m87155h(z15) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z16 = z13;
                    if (c28655q.m87155h(z16)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        z17 = z14;
                        if (c28655q.m87155h(z17)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            interfaceC4339a2 = interfaceC4339a;
                            if (c28655q.m87157i(interfaceC4339a2)) {
                                i25 = 16384;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 9363) != 9362) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z18)) {
                            if (i26 != 0) {
                                z26 = true;
                            } else {
                                z26 = z15;
                            }
                            if (i16 != 0) {
                                z16 = false;
                            }
                            if (i18 != 0) {
                                z17 = false;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i24 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C13005a(22);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                            }
                            if (z16) {
                                buttonState = EnumC3920d.LOADING;
                            } else {
                                buttonState = step.getButtonState();
                            }
                            EnumC3920d enumC3920d = buttonState;
                            TextResource buttonText = step.getButtonText();
                            int filledCount = step.getFilledCount();
                            EnumC16313m0 enumC16313m0 = EnumC16313m0.ARROW_FORWARD;
                            if (z17) {
                                abstractC17911t = null;
                            } else {
                                abstractC17911t = f45654a;
                            }
                            EnumC39333f enumC39333f = z17 ? EnumC39333f.ACCENT_NEGATIVE_TREND : null;
                            EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHITE;
                            C3927k c3927k = new C3927k(enumC3920d, buttonText, enumC39333f2, null, null, enumC16313m0, 100, filledCount, null, z26, false, enumC39333f, abstractC17911t, enumC39333f2, null, null, null, 115992, null);
                            if ((i15 & 57344) == 16384) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z27 || objM87133R == c28676v0) {
                                objM87133R = new C2161b(interfaceC4339a2, 16);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC3926j.m11931e(c3927k, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                            z19 = z26;
                        } else {
                            c28655q.m87138X();
                            z19 = z15;
                        }
                        z24 = z16;
                        z25 = z17;
                        interfaceC4339a3 = interfaceC4339a2;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
                        }
                    }
                    i15 |= 24576;
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i15 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z18)) {
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z15;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z17 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(22);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (z16) {
                            buttonState = EnumC3920d.LOADING;
                        } else {
                            buttonState = step.getButtonState();
                        }
                        EnumC3920d enumC3920d2 = buttonState;
                        TextResource buttonText2 = step.getButtonText();
                        int filledCount2 = step.getFilledCount();
                        EnumC16313m0 enumC16313m1 = EnumC16313m0.ARROW_FORWARD;
                        if (z17) {
                            abstractC17911t = null;
                        } else {
                            abstractC17911t = f45654a;
                        }
                        if (z17) {
                        }
                        EnumC39333f enumC39333f3 = EnumC39333f.BRAND_WHITE;
                        C3927k c3927k2 = new C3927k(enumC3920d2, buttonText2, enumC39333f3, null, null, enumC16313m1, 100, filledCount2, null, z26, false, enumC39333f, abstractC17911t, enumC39333f3, null, null, null, 115992, null);
                        if ((i15 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z27) {
                            objM87133R = new C2161b(interfaceC4339a2, 16);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2161b(interfaceC4339a2, 16);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC3926j.m11931e(c3927k2, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                        z19 = z26;
                    } else {
                        c28655q.m87138X();
                        z19 = z15;
                    }
                    z24 = z16;
                    z25 = z17;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
                    }
                }
                i15 |= 3072;
                z17 = z14;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z18)) {
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z15;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z17 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(22);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (z16) {
                            buttonState = EnumC3920d.LOADING;
                        } else {
                            buttonState = step.getButtonState();
                        }
                        EnumC3920d enumC3920d3 = buttonState;
                        TextResource buttonText3 = step.getButtonText();
                        int filledCount3 = step.getFilledCount();
                        EnumC16313m0 enumC16313m2 = EnumC16313m0.ARROW_FORWARD;
                        if (z17) {
                            abstractC17911t = null;
                        } else {
                            abstractC17911t = f45654a;
                        }
                        if (z17) {
                        }
                        EnumC39333f enumC39333f4 = EnumC39333f.BRAND_WHITE;
                        C3927k c3927k3 = new C3927k(enumC3920d3, buttonText3, enumC39333f4, null, null, enumC16313m2, 100, filledCount3, null, z26, false, enumC39333f, abstractC17911t, enumC39333f4, null, null, null, 115992, null);
                        if ((i15 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z27) {
                            objM87133R = new C2161b(interfaceC4339a2, 16);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2161b(interfaceC4339a2, 16);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC3926j.m11931e(c3927k3, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                        z19 = z26;
                    } else {
                        c28655q.m87138X();
                        z19 = z15;
                    }
                    z24 = z16;
                    z25 = z17;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
                    }
                }
                i15 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(22);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d4 = buttonState;
                    TextResource buttonText4 = step.getButtonText();
                    int filledCount4 = step.getFilledCount();
                    EnumC16313m0 enumC16313m3 = EnumC16313m0.ARROW_FORWARD;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = f45654a;
                    }
                    if (z17) {
                    }
                    EnumC39333f enumC39333f5 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k4 = new C3927k(enumC3920d4, buttonText4, enumC39333f5, null, null, enumC16313m3, 100, filledCount4, null, z26, false, enumC39333f, abstractC17911t, enumC39333f5, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k4, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
                }
            }
            i15 |= 384;
            z16 = z13;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z17 = z14;
                    if (c28655q.m87155h(z17)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z18)) {
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z15;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z17 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(22);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (z16) {
                            buttonState = EnumC3920d.LOADING;
                        } else {
                            buttonState = step.getButtonState();
                        }
                        EnumC3920d enumC3920d5 = buttonState;
                        TextResource buttonText5 = step.getButtonText();
                        int filledCount5 = step.getFilledCount();
                        EnumC16313m0 enumC16313m4 = EnumC16313m0.ARROW_FORWARD;
                        if (z17) {
                            abstractC17911t = null;
                        } else {
                            abstractC17911t = f45654a;
                        }
                        if (z17) {
                        }
                        EnumC39333f enumC39333f6 = EnumC39333f.BRAND_WHITE;
                        C3927k c3927k5 = new C3927k(enumC3920d5, buttonText5, enumC39333f6, null, null, enumC16313m4, 100, filledCount5, null, z26, false, enumC39333f, abstractC17911t, enumC39333f6, null, null, null, 115992, null);
                        if ((i15 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z27) {
                            objM87133R = new C2161b(interfaceC4339a2, 16);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2161b(interfaceC4339a2, 16);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC3926j.m11931e(c3927k5, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                        z19 = z26;
                    } else {
                        c28655q.m87138X();
                        z19 = z15;
                    }
                    z24 = z16;
                    z25 = z17;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
                    }
                }
                i15 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(22);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d6 = buttonState;
                    TextResource buttonText6 = step.getButtonText();
                    int filledCount6 = step.getFilledCount();
                    EnumC16313m0 enumC16313m5 = EnumC16313m0.ARROW_FORWARD;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = f45654a;
                    }
                    if (z17) {
                    }
                    EnumC39333f enumC39333f7 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k6 = new C3927k(enumC3920d6, buttonText6, enumC39333f7, null, null, enumC16313m5, 100, filledCount6, null, z26, false, enumC39333f, abstractC17911t, enumC39333f7, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k6, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
                }
            }
            i15 |= 3072;
            z17 = z14;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(22);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d7 = buttonState;
                    TextResource buttonText7 = step.getButtonText();
                    int filledCount7 = step.getFilledCount();
                    EnumC16313m0 enumC16313m6 = EnumC16313m0.ARROW_FORWARD;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = f45654a;
                    }
                    if (z17) {
                    }
                    EnumC39333f enumC39333f8 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k7 = new C3927k(enumC3920d7, buttonText7, enumC39333f8, null, null, enumC16313m6, 100, filledCount7, null, z26, false, enumC39333f, abstractC17911t, enumC39333f8, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k7, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i15 & 1, z18)) {
                if (i26 != 0) {
                    z26 = true;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(22);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (z16) {
                    buttonState = EnumC3920d.LOADING;
                } else {
                    buttonState = step.getButtonState();
                }
                EnumC3920d enumC3920d8 = buttonState;
                TextResource buttonText8 = step.getButtonText();
                int filledCount8 = step.getFilledCount();
                EnumC16313m0 enumC16313m7 = EnumC16313m0.ARROW_FORWARD;
                if (z17) {
                    abstractC17911t = null;
                } else {
                    abstractC17911t = f45654a;
                }
                if (z17) {
                }
                EnumC39333f enumC39333f9 = EnumC39333f.BRAND_WHITE;
                C3927k c3927k8 = new C3927k(enumC3920d8, buttonText8, enumC39333f9, null, null, enumC16313m7, 100, filledCount8, null, z26, false, enumC39333f, abstractC17911t, enumC39333f9, null, null, null, 115992, null);
                if ((i15 & 57344) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z27) {
                    objM87133R = new C2161b(interfaceC4339a2, 16);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(interfaceC4339a2, 16);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC3926j.m11931e(c3927k8, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                z19 = z26;
            } else {
                c28655q.m87138X();
                z19 = z15;
            }
            z24 = z16;
            z25 = z17;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
            }
        }
        i15 |= 48;
        z15 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z16 = z13;
                if (c28655q.m87155h(z16)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z17 = z14;
                    if (c28655q.m87155h(z17)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z18)) {
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z15;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z17 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(22);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (z16) {
                            buttonState = EnumC3920d.LOADING;
                        } else {
                            buttonState = step.getButtonState();
                        }
                        EnumC3920d enumC3920d9 = buttonState;
                        TextResource buttonText9 = step.getButtonText();
                        int filledCount9 = step.getFilledCount();
                        EnumC16313m0 enumC16313m8 = EnumC16313m0.ARROW_FORWARD;
                        if (z17) {
                            abstractC17911t = null;
                        } else {
                            abstractC17911t = f45654a;
                        }
                        if (z17) {
                        }
                        EnumC39333f enumC39333f10 = EnumC39333f.BRAND_WHITE;
                        C3927k c3927k9 = new C3927k(enumC3920d9, buttonText9, enumC39333f10, null, null, enumC16313m8, 100, filledCount9, null, z26, false, enumC39333f, abstractC17911t, enumC39333f10, null, null, null, 115992, null);
                        if ((i15 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z27) {
                            objM87133R = new C2161b(interfaceC4339a2, 16);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2161b(interfaceC4339a2, 16);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC3926j.m11931e(c3927k9, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                        z19 = z26;
                    } else {
                        c28655q.m87138X();
                        z19 = z15;
                    }
                    z24 = z16;
                    z25 = z17;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
                    }
                }
                i15 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(22);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d10 = buttonState;
                    TextResource buttonText10 = step.getButtonText();
                    int filledCount10 = step.getFilledCount();
                    EnumC16313m0 enumC16313m9 = EnumC16313m0.ARROW_FORWARD;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = f45654a;
                    }
                    if (z17) {
                    }
                    EnumC39333f enumC39333f11 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k10 = new C3927k(enumC3920d10, buttonText10, enumC39333f11, null, null, enumC16313m9, 100, filledCount10, null, z26, false, enumC39333f, abstractC17911t, enumC39333f11, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k10, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
                }
            }
            i15 |= 3072;
            z17 = z14;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(22);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d11 = buttonState;
                    TextResource buttonText11 = step.getButtonText();
                    int filledCount11 = step.getFilledCount();
                    EnumC16313m0 enumC16313m10 = EnumC16313m0.ARROW_FORWARD;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = f45654a;
                    }
                    if (z17) {
                    }
                    EnumC39333f enumC39333f12 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k11 = new C3927k(enumC3920d11, buttonText11, enumC39333f12, null, null, enumC16313m10, 100, filledCount11, null, z26, false, enumC39333f, abstractC17911t, enumC39333f12, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k11, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i15 & 1, z18)) {
                if (i26 != 0) {
                    z26 = true;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(22);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (z16) {
                    buttonState = EnumC3920d.LOADING;
                } else {
                    buttonState = step.getButtonState();
                }
                EnumC3920d enumC3920d12 = buttonState;
                TextResource buttonText12 = step.getButtonText();
                int filledCount12 = step.getFilledCount();
                EnumC16313m0 enumC16313m11 = EnumC16313m0.ARROW_FORWARD;
                if (z17) {
                    abstractC17911t = null;
                } else {
                    abstractC17911t = f45654a;
                }
                if (z17) {
                }
                EnumC39333f enumC39333f13 = EnumC39333f.BRAND_WHITE;
                C3927k c3927k12 = new C3927k(enumC3920d12, buttonText12, enumC39333f13, null, null, enumC16313m11, 100, filledCount12, null, z26, false, enumC39333f, abstractC17911t, enumC39333f13, null, null, null, 115992, null);
                if ((i15 & 57344) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z27) {
                    objM87133R = new C2161b(interfaceC4339a2, 16);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(interfaceC4339a2, 16);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC3926j.m11931e(c3927k12, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                z19 = z26;
            } else {
                c28655q.m87138X();
                z19 = z15;
            }
            z24 = z16;
            z25 = z17;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
            }
        }
        i15 |= 384;
        z16 = z13;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z17 = z14;
                if (c28655q.m87155h(z17)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(22);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d13 = buttonState;
                    TextResource buttonText13 = step.getButtonText();
                    int filledCount13 = step.getFilledCount();
                    EnumC16313m0 enumC16313m12 = EnumC16313m0.ARROW_FORWARD;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = f45654a;
                    }
                    if (z17) {
                    }
                    EnumC39333f enumC39333f14 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k13 = new C3927k(enumC3920d13, buttonText13, enumC39333f14, null, null, enumC16313m12, 100, filledCount13, null, z26, false, enumC39333f, abstractC17911t, enumC39333f14, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 16);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k13, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i15 & 1, z18)) {
                if (i26 != 0) {
                    z26 = true;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(22);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (z16) {
                    buttonState = EnumC3920d.LOADING;
                } else {
                    buttonState = step.getButtonState();
                }
                EnumC3920d enumC3920d14 = buttonState;
                TextResource buttonText14 = step.getButtonText();
                int filledCount14 = step.getFilledCount();
                EnumC16313m0 enumC16313m13 = EnumC16313m0.ARROW_FORWARD;
                if (z17) {
                    abstractC17911t = null;
                } else {
                    abstractC17911t = f45654a;
                }
                if (z17) {
                }
                EnumC39333f enumC39333f15 = EnumC39333f.BRAND_WHITE;
                C3927k c3927k14 = new C3927k(enumC3920d14, buttonText14, enumC39333f15, null, null, enumC16313m13, 100, filledCount14, null, z26, false, enumC39333f, abstractC17911t, enumC39333f15, null, null, null, 115992, null);
                if ((i15 & 57344) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z27) {
                    objM87133R = new C2161b(interfaceC4339a2, 16);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(interfaceC4339a2, 16);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC3926j.m11931e(c3927k14, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                z19 = z26;
            } else {
                c28655q.m87138X();
                z19 = z15;
            }
            z24 = z16;
            z25 = z17;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
            }
        }
        i15 |= 3072;
        z17 = z14;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i25 = 16384;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i15 & 1, z18)) {
                if (i26 != 0) {
                    z26 = true;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(22);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (z16) {
                    buttonState = EnumC3920d.LOADING;
                } else {
                    buttonState = step.getButtonState();
                }
                EnumC3920d enumC3920d15 = buttonState;
                TextResource buttonText15 = step.getButtonText();
                int filledCount15 = step.getFilledCount();
                EnumC16313m0 enumC16313m14 = EnumC16313m0.ARROW_FORWARD;
                if (z17) {
                    abstractC17911t = null;
                } else {
                    abstractC17911t = f45654a;
                }
                if (z17) {
                }
                EnumC39333f enumC39333f16 = EnumC39333f.BRAND_WHITE;
                C3927k c3927k15 = new C3927k(enumC3920d15, buttonText15, enumC39333f16, null, null, enumC16313m14, 100, filledCount15, null, z26, false, enumC39333f, abstractC17911t, enumC39333f16, null, null, null, 115992, null);
                if ((i15 & 57344) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z27) {
                    objM87133R = new C2161b(interfaceC4339a2, 16);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(interfaceC4339a2, 16);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC3926j.m11931e(c3927k15, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                z19 = z26;
            } else {
                c28655q.m87138X();
                z19 = z15;
            }
            z24 = z16;
            z25 = z17;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 9363) != 9362) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (c28655q.m87135U(i15 & 1, z18)) {
            if (i26 != 0) {
                z26 = true;
            } else {
                z26 = z15;
            }
            if (i16 != 0) {
                z16 = false;
            }
            if (i18 != 0) {
                z17 = false;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C13005a(22);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            }
            if (z16) {
                buttonState = EnumC3920d.LOADING;
            } else {
                buttonState = step.getButtonState();
            }
            EnumC3920d enumC3920d16 = buttonState;
            TextResource buttonText16 = step.getButtonText();
            int filledCount16 = step.getFilledCount();
            EnumC16313m0 enumC16313m15 = EnumC16313m0.ARROW_FORWARD;
            if (z17) {
                abstractC17911t = null;
            } else {
                abstractC17911t = f45654a;
            }
            if (z17) {
            }
            EnumC39333f enumC39333f17 = EnumC39333f.BRAND_WHITE;
            C3927k c3927k16 = new C3927k(enumC3920d16, buttonText16, enumC39333f17, null, null, enumC16313m15, 100, filledCount16, null, z26, false, enumC39333f, abstractC17911t, enumC39333f17, null, null, null, 115992, null);
            if ((i15 & 57344) == 16384) {
                z27 = true;
            } else {
                z27 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z27) {
                objM87133R = new C2161b(interfaceC4339a2, 16);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C2161b(interfaceC4339a2, 16);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC3926j.m11931e(c3927k16, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
            z19 = z26;
        } else {
            c28655q.m87138X();
            z19 = z15;
        }
        z24 = z16;
        z25 = z17;
        interfaceC4339a3 = interfaceC4339a2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m36936h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m36937i(InterfaceC4339a interfaceC4339a, EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m36938j(EnumC13178k enumC13178k, boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m36935g(enumC13178k, z4, z13, z14, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014c  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0121  */
    /* JADX WARN: Code duplicated, block: B:94:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x012a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0141  */
    /* JADX INFO: renamed from: k */
    public static final void m36939k(EnumC13178k step, boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        int i18;
        boolean z17;
        int i19;
        int i24;
        InterfaceC4339a interfaceC4339a2;
        int i25;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        boolean z26;
        C28676v0 c28676v0;
        EnumC3920d buttonState;
        EnumC39333f enumC39333f;
        AbstractC17911t abstractC17911t;
        boolean z27;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(329314877);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(step.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                z15 = z4;
                i15 |= c28655q.m87155h(z15) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z16 = z13;
                    if (c28655q.m87155h(z16)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        z17 = z14;
                        if (c28655q.m87155h(z17)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            interfaceC4339a2 = interfaceC4339a;
                            if (c28655q.m87157i(interfaceC4339a2)) {
                                i25 = 16384;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 9363) != 9362) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z18)) {
                            if (i26 != 0) {
                                z26 = true;
                            } else {
                                z26 = z15;
                            }
                            if (i16 != 0) {
                                z16 = false;
                            }
                            if (i18 != 0) {
                                z17 = false;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i24 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C13005a(23);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                            }
                            if (z16) {
                                buttonState = EnumC3920d.LOADING;
                            } else {
                                buttonState = step.getButtonState();
                            }
                            EnumC3920d enumC3920d = buttonState;
                            TextResource buttonText = step.getButtonText();
                            int filledCount = step.getFilledCount();
                            EnumC16313m0 enumC16313m0 = EnumC16313m0.ARROW_FORWARD;
                            enumC39333f = null;
                            if (z17 && z26) {
                                abstractC17911t = f45654a;
                            } else {
                                abstractC17911t = null;
                            }
                            if (z17) {
                                enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                            } else if (!z26) {
                                enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                            }
                            EnumC39333f enumC39333f2 = enumC39333f;
                            EnumC39333f enumC39333f3 = EnumC39333f.BRAND_WHITE;
                            C3927k c3927k = new C3927k(enumC3920d, buttonText, enumC39333f3, null, null, enumC16313m0, 100, filledCount, null, z26, false, enumC39333f2, abstractC17911t, enumC39333f3, null, null, null, 115992, null);
                            if ((i15 & 57344) == 16384) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z27 || objM87133R == c28676v0) {
                                objM87133R = new C2161b(interfaceC4339a2, 17);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC3926j.m11931e(c3927k, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                            z19 = z26;
                        } else {
                            c28655q.m87138X();
                            z19 = z15;
                        }
                        z24 = z16;
                        z25 = z17;
                        interfaceC4339a3 = interfaceC4339a2;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
                        }
                    }
                    i15 |= 24576;
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i15 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z18)) {
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z15;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z17 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(23);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (z16) {
                            buttonState = EnumC3920d.LOADING;
                        } else {
                            buttonState = step.getButtonState();
                        }
                        EnumC3920d enumC3920d2 = buttonState;
                        TextResource buttonText2 = step.getButtonText();
                        int filledCount2 = step.getFilledCount();
                        EnumC16313m0 enumC16313m1 = EnumC16313m0.ARROW_FORWARD;
                        enumC39333f = null;
                        if (z17) {
                            abstractC17911t = null;
                        } else {
                            abstractC17911t = null;
                        }
                        if (z17) {
                            enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                        } else if (!z26) {
                            enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                        }
                        EnumC39333f enumC39333f4 = enumC39333f;
                        EnumC39333f enumC39333f5 = EnumC39333f.BRAND_WHITE;
                        C3927k c3927k2 = new C3927k(enumC3920d2, buttonText2, enumC39333f5, null, null, enumC16313m1, 100, filledCount2, null, z26, false, enumC39333f4, abstractC17911t, enumC39333f5, null, null, null, 115992, null);
                        if ((i15 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z27) {
                            objM87133R = new C2161b(interfaceC4339a2, 17);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2161b(interfaceC4339a2, 17);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC3926j.m11931e(c3927k2, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                        z19 = z26;
                    } else {
                        c28655q.m87138X();
                        z19 = z15;
                    }
                    z24 = z16;
                    z25 = z17;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
                    }
                }
                i15 |= 3072;
                z17 = z14;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z18)) {
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z15;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z17 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(23);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (z16) {
                            buttonState = EnumC3920d.LOADING;
                        } else {
                            buttonState = step.getButtonState();
                        }
                        EnumC3920d enumC3920d3 = buttonState;
                        TextResource buttonText3 = step.getButtonText();
                        int filledCount3 = step.getFilledCount();
                        EnumC16313m0 enumC16313m2 = EnumC16313m0.ARROW_FORWARD;
                        enumC39333f = null;
                        if (z17) {
                            abstractC17911t = null;
                        } else {
                            abstractC17911t = null;
                        }
                        if (z17) {
                            enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                        } else if (!z26) {
                            enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                        }
                        EnumC39333f enumC39333f6 = enumC39333f;
                        EnumC39333f enumC39333f7 = EnumC39333f.BRAND_WHITE;
                        C3927k c3927k3 = new C3927k(enumC3920d3, buttonText3, enumC39333f7, null, null, enumC16313m2, 100, filledCount3, null, z26, false, enumC39333f6, abstractC17911t, enumC39333f7, null, null, null, 115992, null);
                        if ((i15 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z27) {
                            objM87133R = new C2161b(interfaceC4339a2, 17);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2161b(interfaceC4339a2, 17);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC3926j.m11931e(c3927k3, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                        z19 = z26;
                    } else {
                        c28655q.m87138X();
                        z19 = z15;
                    }
                    z24 = z16;
                    z25 = z17;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
                    }
                }
                i15 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(23);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d4 = buttonState;
                    TextResource buttonText4 = step.getButtonText();
                    int filledCount4 = step.getFilledCount();
                    EnumC16313m0 enumC16313m3 = EnumC16313m0.ARROW_FORWARD;
                    enumC39333f = null;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = null;
                    }
                    if (z17) {
                        enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                    } else if (!z26) {
                        enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                    }
                    EnumC39333f enumC39333f8 = enumC39333f;
                    EnumC39333f enumC39333f9 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k4 = new C3927k(enumC3920d4, buttonText4, enumC39333f9, null, null, enumC16313m3, 100, filledCount4, null, z26, false, enumC39333f8, abstractC17911t, enumC39333f9, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k4, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
                }
            }
            i15 |= 384;
            z16 = z13;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z17 = z14;
                    if (c28655q.m87155h(z17)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z18)) {
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z15;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z17 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(23);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (z16) {
                            buttonState = EnumC3920d.LOADING;
                        } else {
                            buttonState = step.getButtonState();
                        }
                        EnumC3920d enumC3920d5 = buttonState;
                        TextResource buttonText5 = step.getButtonText();
                        int filledCount5 = step.getFilledCount();
                        EnumC16313m0 enumC16313m4 = EnumC16313m0.ARROW_FORWARD;
                        enumC39333f = null;
                        if (z17) {
                            abstractC17911t = null;
                        } else {
                            abstractC17911t = null;
                        }
                        if (z17) {
                            enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                        } else if (!z26) {
                            enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                        }
                        EnumC39333f enumC39333f10 = enumC39333f;
                        EnumC39333f enumC39333f11 = EnumC39333f.BRAND_WHITE;
                        C3927k c3927k5 = new C3927k(enumC3920d5, buttonText5, enumC39333f11, null, null, enumC16313m4, 100, filledCount5, null, z26, false, enumC39333f10, abstractC17911t, enumC39333f11, null, null, null, 115992, null);
                        if ((i15 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z27) {
                            objM87133R = new C2161b(interfaceC4339a2, 17);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2161b(interfaceC4339a2, 17);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC3926j.m11931e(c3927k5, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                        z19 = z26;
                    } else {
                        c28655q.m87138X();
                        z19 = z15;
                    }
                    z24 = z16;
                    z25 = z17;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
                    }
                }
                i15 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(23);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d6 = buttonState;
                    TextResource buttonText6 = step.getButtonText();
                    int filledCount6 = step.getFilledCount();
                    EnumC16313m0 enumC16313m5 = EnumC16313m0.ARROW_FORWARD;
                    enumC39333f = null;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = null;
                    }
                    if (z17) {
                        enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                    } else if (!z26) {
                        enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                    }
                    EnumC39333f enumC39333f12 = enumC39333f;
                    EnumC39333f enumC39333f13 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k6 = new C3927k(enumC3920d6, buttonText6, enumC39333f13, null, null, enumC16313m5, 100, filledCount6, null, z26, false, enumC39333f12, abstractC17911t, enumC39333f13, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k6, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
                }
            }
            i15 |= 3072;
            z17 = z14;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(23);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d7 = buttonState;
                    TextResource buttonText7 = step.getButtonText();
                    int filledCount7 = step.getFilledCount();
                    EnumC16313m0 enumC16313m6 = EnumC16313m0.ARROW_FORWARD;
                    enumC39333f = null;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = null;
                    }
                    if (z17) {
                        enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                    } else if (!z26) {
                        enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                    }
                    EnumC39333f enumC39333f14 = enumC39333f;
                    EnumC39333f enumC39333f15 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k7 = new C3927k(enumC3920d7, buttonText7, enumC39333f15, null, null, enumC16313m6, 100, filledCount7, null, z26, false, enumC39333f14, abstractC17911t, enumC39333f15, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k7, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i15 & 1, z18)) {
                if (i26 != 0) {
                    z26 = true;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(23);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (z16) {
                    buttonState = EnumC3920d.LOADING;
                } else {
                    buttonState = step.getButtonState();
                }
                EnumC3920d enumC3920d8 = buttonState;
                TextResource buttonText8 = step.getButtonText();
                int filledCount8 = step.getFilledCount();
                EnumC16313m0 enumC16313m7 = EnumC16313m0.ARROW_FORWARD;
                enumC39333f = null;
                if (z17) {
                    abstractC17911t = null;
                } else {
                    abstractC17911t = null;
                }
                if (z17) {
                    enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                } else if (!z26) {
                    enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                }
                EnumC39333f enumC39333f16 = enumC39333f;
                EnumC39333f enumC39333f17 = EnumC39333f.BRAND_WHITE;
                C3927k c3927k8 = new C3927k(enumC3920d8, buttonText8, enumC39333f17, null, null, enumC16313m7, 100, filledCount8, null, z26, false, enumC39333f16, abstractC17911t, enumC39333f17, null, null, null, 115992, null);
                if ((i15 & 57344) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z27) {
                    objM87133R = new C2161b(interfaceC4339a2, 17);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(interfaceC4339a2, 17);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC3926j.m11931e(c3927k8, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                z19 = z26;
            } else {
                c28655q.m87138X();
                z19 = z15;
            }
            z24 = z16;
            z25 = z17;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
            }
        }
        i15 |= 48;
        z15 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z16 = z13;
                if (c28655q.m87155h(z16)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z17 = z14;
                    if (c28655q.m87155h(z17)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i25 = 16384;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z18)) {
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z15;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z17 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(23);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (z16) {
                            buttonState = EnumC3920d.LOADING;
                        } else {
                            buttonState = step.getButtonState();
                        }
                        EnumC3920d enumC3920d9 = buttonState;
                        TextResource buttonText9 = step.getButtonText();
                        int filledCount9 = step.getFilledCount();
                        EnumC16313m0 enumC16313m8 = EnumC16313m0.ARROW_FORWARD;
                        enumC39333f = null;
                        if (z17) {
                            abstractC17911t = null;
                        } else {
                            abstractC17911t = null;
                        }
                        if (z17) {
                            enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                        } else if (!z26) {
                            enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                        }
                        EnumC39333f enumC39333f18 = enumC39333f;
                        EnumC39333f enumC39333f19 = EnumC39333f.BRAND_WHITE;
                        C3927k c3927k9 = new C3927k(enumC3920d9, buttonText9, enumC39333f19, null, null, enumC16313m8, 100, filledCount9, null, z26, false, enumC39333f18, abstractC17911t, enumC39333f19, null, null, null, 115992, null);
                        if ((i15 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z27) {
                            objM87133R = new C2161b(interfaceC4339a2, 17);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2161b(interfaceC4339a2, 17);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC3926j.m11931e(c3927k9, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                        z19 = z26;
                    } else {
                        c28655q.m87138X();
                        z19 = z15;
                    }
                    z24 = z16;
                    z25 = z17;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
                    }
                }
                i15 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(23);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d10 = buttonState;
                    TextResource buttonText10 = step.getButtonText();
                    int filledCount10 = step.getFilledCount();
                    EnumC16313m0 enumC16313m9 = EnumC16313m0.ARROW_FORWARD;
                    enumC39333f = null;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = null;
                    }
                    if (z17) {
                        enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                    } else if (!z26) {
                        enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                    }
                    EnumC39333f enumC39333f110 = enumC39333f;
                    EnumC39333f enumC39333f111 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k10 = new C3927k(enumC3920d10, buttonText10, enumC39333f111, null, null, enumC16313m9, 100, filledCount10, null, z26, false, enumC39333f110, abstractC17911t, enumC39333f111, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k10, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
                }
            }
            i15 |= 3072;
            z17 = z14;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(23);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d11 = buttonState;
                    TextResource buttonText11 = step.getButtonText();
                    int filledCount11 = step.getFilledCount();
                    EnumC16313m0 enumC16313m10 = EnumC16313m0.ARROW_FORWARD;
                    enumC39333f = null;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = null;
                    }
                    if (z17) {
                        enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                    } else if (!z26) {
                        enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                    }
                    EnumC39333f enumC39333f112 = enumC39333f;
                    EnumC39333f enumC39333f113 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k11 = new C3927k(enumC3920d11, buttonText11, enumC39333f113, null, null, enumC16313m10, 100, filledCount11, null, z26, false, enumC39333f112, abstractC17911t, enumC39333f113, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k11, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i15 & 1, z18)) {
                if (i26 != 0) {
                    z26 = true;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(23);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (z16) {
                    buttonState = EnumC3920d.LOADING;
                } else {
                    buttonState = step.getButtonState();
                }
                EnumC3920d enumC3920d12 = buttonState;
                TextResource buttonText12 = step.getButtonText();
                int filledCount12 = step.getFilledCount();
                EnumC16313m0 enumC16313m11 = EnumC16313m0.ARROW_FORWARD;
                enumC39333f = null;
                if (z17) {
                    abstractC17911t = null;
                } else {
                    abstractC17911t = null;
                }
                if (z17) {
                    enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                } else if (!z26) {
                    enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                }
                EnumC39333f enumC39333f114 = enumC39333f;
                EnumC39333f enumC39333f115 = EnumC39333f.BRAND_WHITE;
                C3927k c3927k12 = new C3927k(enumC3920d12, buttonText12, enumC39333f115, null, null, enumC16313m11, 100, filledCount12, null, z26, false, enumC39333f114, abstractC17911t, enumC39333f115, null, null, null, 115992, null);
                if ((i15 & 57344) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z27) {
                    objM87133R = new C2161b(interfaceC4339a2, 17);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(interfaceC4339a2, 17);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC3926j.m11931e(c3927k12, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                z19 = z26;
            } else {
                c28655q.m87138X();
                z19 = z15;
            }
            z24 = z16;
            z25 = z17;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
            }
        }
        i15 |= 384;
        z16 = z13;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z17 = z14;
                if (c28655q.m87155h(z17)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i25 = 16384;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i15 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z17 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(23);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (z16) {
                        buttonState = EnumC3920d.LOADING;
                    } else {
                        buttonState = step.getButtonState();
                    }
                    EnumC3920d enumC3920d13 = buttonState;
                    TextResource buttonText13 = step.getButtonText();
                    int filledCount13 = step.getFilledCount();
                    EnumC16313m0 enumC16313m12 = EnumC16313m0.ARROW_FORWARD;
                    enumC39333f = null;
                    if (z17) {
                        abstractC17911t = null;
                    } else {
                        abstractC17911t = null;
                    }
                    if (z17) {
                        enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                    } else if (!z26) {
                        enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                    }
                    EnumC39333f enumC39333f116 = enumC39333f;
                    EnumC39333f enumC39333f117 = EnumC39333f.BRAND_WHITE;
                    C3927k c3927k13 = new C3927k(enumC3920d13, buttonText13, enumC39333f117, null, null, enumC16313m12, 100, filledCount13, null, z26, false, enumC39333f116, abstractC17911t, enumC39333f117, null, null, null, 115992, null);
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z27) {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(interfaceC4339a2, 17);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927k13, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    z19 = z26;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                }
                z24 = z16;
                z25 = z17;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i15 & 1, z18)) {
                if (i26 != 0) {
                    z26 = true;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(23);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (z16) {
                    buttonState = EnumC3920d.LOADING;
                } else {
                    buttonState = step.getButtonState();
                }
                EnumC3920d enumC3920d14 = buttonState;
                TextResource buttonText14 = step.getButtonText();
                int filledCount14 = step.getFilledCount();
                EnumC16313m0 enumC16313m13 = EnumC16313m0.ARROW_FORWARD;
                enumC39333f = null;
                if (z17) {
                    abstractC17911t = null;
                } else {
                    abstractC17911t = null;
                }
                if (z17) {
                    enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                } else if (!z26) {
                    enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                }
                EnumC39333f enumC39333f118 = enumC39333f;
                EnumC39333f enumC39333f119 = EnumC39333f.BRAND_WHITE;
                C3927k c3927k14 = new C3927k(enumC3920d14, buttonText14, enumC39333f119, null, null, enumC16313m13, 100, filledCount14, null, z26, false, enumC39333f118, abstractC17911t, enumC39333f119, null, null, null, 115992, null);
                if ((i15 & 57344) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z27) {
                    objM87133R = new C2161b(interfaceC4339a2, 17);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(interfaceC4339a2, 17);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC3926j.m11931e(c3927k14, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                z19 = z26;
            } else {
                c28655q.m87138X();
                z19 = z15;
            }
            z24 = z16;
            z25 = z17;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
            }
        }
        i15 |= 3072;
        z17 = z14;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i25 = 16384;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i15 & 1, z18)) {
                if (i26 != 0) {
                    z26 = true;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z17 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(23);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (z16) {
                    buttonState = EnumC3920d.LOADING;
                } else {
                    buttonState = step.getButtonState();
                }
                EnumC3920d enumC3920d15 = buttonState;
                TextResource buttonText15 = step.getButtonText();
                int filledCount15 = step.getFilledCount();
                EnumC16313m0 enumC16313m14 = EnumC16313m0.ARROW_FORWARD;
                enumC39333f = null;
                if (z17) {
                    abstractC17911t = null;
                } else {
                    abstractC17911t = null;
                }
                if (z17) {
                    enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                } else if (!z26) {
                    enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
                }
                EnumC39333f enumC39333f1110 = enumC39333f;
                EnumC39333f enumC39333f1111 = EnumC39333f.BRAND_WHITE;
                C3927k c3927k15 = new C3927k(enumC3920d15, buttonText15, enumC39333f1111, null, null, enumC16313m14, 100, filledCount15, null, z26, false, enumC39333f1110, abstractC17911t, enumC39333f1111, null, null, null, 115992, null);
                if ((i15 & 57344) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z27) {
                    objM87133R = new C2161b(interfaceC4339a2, 17);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(interfaceC4339a2, 17);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC3926j.m11931e(c3927k15, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                z19 = z26;
            } else {
                c28655q.m87138X();
                z19 = z15;
            }
            z24 = z16;
            z25 = z17;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 9363) != 9362) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (c28655q.m87135U(i15 & 1, z18)) {
            if (i26 != 0) {
                z26 = true;
            } else {
                z26 = z15;
            }
            if (i16 != 0) {
                z16 = false;
            }
            if (i18 != 0) {
                z17 = false;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C13005a(23);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            }
            if (z16) {
                buttonState = EnumC3920d.LOADING;
            } else {
                buttonState = step.getButtonState();
            }
            EnumC3920d enumC3920d16 = buttonState;
            TextResource buttonText16 = step.getButtonText();
            int filledCount16 = step.getFilledCount();
            EnumC16313m0 enumC16313m15 = EnumC16313m0.ARROW_FORWARD;
            enumC39333f = null;
            if (z17) {
                abstractC17911t = null;
            } else {
                abstractC17911t = null;
            }
            if (z17) {
                enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
            } else if (!z26) {
                enumC39333f = EnumC39333f.BACKGROUND_DARK_ALT;
            }
            EnumC39333f enumC39333f1112 = enumC39333f;
            EnumC39333f enumC39333f1113 = EnumC39333f.BRAND_WHITE;
            C3927k c3927k16 = new C3927k(enumC3920d16, buttonText16, enumC39333f1113, null, null, enumC16313m15, 100, filledCount16, null, z26, false, enumC39333f1112, abstractC17911t, enumC39333f1113, null, null, null, 115992, null);
            if ((i15 & 57344) == 16384) {
                z27 = true;
            } else {
                z27 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z27) {
                objM87133R = new C2161b(interfaceC4339a2, 17);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C2161b(interfaceC4339a2, 17);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC3926j.m11931e(c3927k16, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
            z19 = z26;
        } else {
            c28655q.m87138X();
            z19 = z15;
        }
        z24 = z16;
        z25 = z17;
        interfaceC4339a3 = interfaceC4339a2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13171d(step, z19, z24, z25, interfaceC4339a3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m36940l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m36941m(InterfaceC4339a interfaceC4339a, EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m36942n(EnumC13178k enumC13178k, boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m36939k(enumC13178k, z4, z13, z14, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
