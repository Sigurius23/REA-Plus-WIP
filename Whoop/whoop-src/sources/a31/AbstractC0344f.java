package a31;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27237a;
import ny0.AbstractC27283u0;
import ny0.AbstractC27285v0;
import ny0.EnumC27251e1;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
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
import p745y81.AbstractC39330c;
import wb3.AbstractC37056f;
import x81.C38070b;
import x81.C38072d;

/* JADX INFO: renamed from: a31.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"", "min", "max", "number", "", "enabled", "Lkotlin/Function1;", "Ll83/a0;", "valueHasChanged", "Lkotlin/Function0;", "numberButtonPressed", "f", "(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0344f {
    /* JADX WARN: Code duplicated, block: B:100:0x0177  */
    /* JADX WARN: Code duplicated, block: B:101:0x017a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x018a  */
    /* JADX WARN: Code duplicated, block: B:108:0x020c  */
    /* JADX WARN: Code duplicated, block: B:109:0x020f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x021f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0244  */
    /* JADX WARN: Code duplicated, block: B:120:0x0253  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:80:0x010a  */
    /* JADX WARN: Code duplicated, block: B:83:0x011d  */
    /* JADX WARN: Code duplicated, block: B:85:0x012b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:92:0x0143  */
    /* JADX WARN: Code duplicated, block: B:95:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x014e  */
    /* JADX INFO: renamed from: f */
    public static final void m877f(int i13, int i14, Integer num, boolean z4, final Function1 valueHasChanged, InterfaceC4339a numberButtonPressed, Composer composer, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int i24;
        Integer num2;
        int i25;
        int i26;
        int i27;
        boolean z13;
        final Function1 function1;
        boolean z14;
        int i28;
        int i29;
        Integer num3;
        C28677v1 c28677v1M87180u;
        int i34;
        Integer num4;
        boolean z15;
        final C0339a c0339a;
        final C0345g c0345gM871c;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z16;
        boolean z17;
        int i35;
        boolean z18;
        boolean z19;
        Object objM87133R;
        boolean z24;
        boolean z25;
        Object objM87133R2;
        int i36;
        int i37;
        AbstractC22676k.m65750j(valueHasChanged, "valueHasChanged");
        AbstractC22676k.m65750j(numberButtonPressed, "numberButtonPressed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(346856875);
        int i38 = i16 & 1;
        if (i38 != 0) {
            i18 = i15 | 6;
            i17 = i13;
        } else if ((i15 & 6) == 0) {
            i17 = i13;
            i18 = (c28655q.m87149e(i17) ? 4 : 2) | i15;
        } else {
            i17 = i13;
            i18 = i15;
        }
        int i39 = i16 & 2;
        if (i39 == 0) {
            if ((i15 & 48) == 0) {
                i19 = i14;
                i18 |= c28655q.m87149e(i19) ? 32 : 16;
            }
            i24 = i16 & 4;
            if (i24 != 0) {
                if ((i15 & 384) == 0) {
                    num2 = num;
                    if (c28655q.m87153g(num2)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i18 |= i25;
                }
                i26 = i16 & 8;
                if (i26 != 0) {
                    if ((i15 & 3072) == 0) {
                        if (c28655q.m87155h(z4)) {
                            i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i18 |= i27;
                    }
                    if ((i15 & 24576) == 0) {
                        if (c28655q.m87157i(valueHasChanged)) {
                            i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i37 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i18 |= i37;
                    }
                    if ((196608 & i15) == 0) {
                        if (c28655q.m87157i(numberButtonPressed)) {
                            i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i18 |= i36;
                    }
                    if ((74899 & i18) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i18 & 1, z13)) {
                        if (i38 != 0) {
                            i17 = 0;
                        }
                        if (i39 != 0) {
                            i34 = 9;
                        } else {
                            i34 = i19;
                        }
                        if (i24 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i26 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        c0339a = new C0339a(i17, i34);
                        c0345gM871c = c0339a.m871c(num4);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        C2314t c2314t = C2314t.f9131w;
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        int i44 = i34;
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        int i45 = i17;
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
                        if (c0345gM871c.getAtMin() && c0345gM871c.getIsSet() && z15) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c0345gM871c.getAtMax() && z15) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        C38072d c38072d = C38072d.f163053a;
                        int iM46127m = c38072d.m121951d().getAction().getRemove();
                        float f13 = 2 * 4;
                        boolean zM87157i = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                        i35 = i18 & 57344;
                        boolean z26 = z16;
                        if (i35 == 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zM87157i | z18;
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (z19 || objM87133R == c28676v0) {
                            final int i46 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: a31.b
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i46) {
                                        case 0:
                                            return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                        default:
                                            return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        boolean z27 = z15;
                        boolean z28 = z17;
                        Integer num5 = num4;
                        AbstractC27237a.m82073c(iM46127m, "minus icon", z26, f13, (InterfaceC4339a) objM87133R, c28655q, 3120, 0);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                        AbstractC39330c.m125320b(0L, C38070b.f163049a.m121943a(c28655q, 6).getAffirmative(), 0L, 0L, AbstractC37817c.m121344e(-683622336, c28655q, new C0341c(c0345gM871c, z27, numberButtonPressed, 0)), c28655q, 24576, 13);
                        c28655q = c28655q;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                        int iM46115a = c38072d.m121951d().getAction().getAdd();
                        boolean zM87157i2 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                        if (i35 == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zM87157i2 | z24;
                        objM87133R2 = c28655q.m87133R();
                        if (!z25 || objM87133R2 == c28676v0) {
                            final int i47 = 1;
                            function1 = valueHasChanged;
                            objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i47) {
                                        case 0:
                                            return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                        default:
                                            return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function1 = valueHasChanged;
                        }
                        AbstractC27237a.m82073c(iM46115a, "plus icon", z28, f13, (InterfaceC4339a) objM87133R2, c28655q, 3120, 0);
                        c28655q.m87173q(true);
                        i29 = i44;
                        num3 = num5;
                        z14 = z27;
                        i28 = i45;
                    } else {
                        function1 = valueHasChanged;
                        c28655q.m87138X();
                        z14 = z4;
                        i28 = i17;
                        i29 = i19;
                        num3 = num2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0342d(i28, i29, num3, z14, function1, numberButtonPressed, i15, i16);
                    }
                }
                i18 |= 3072;
                if ((i15 & 24576) == 0) {
                    if (c28655q.m87157i(valueHasChanged)) {
                        i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i37 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i18 |= i37;
                }
                if ((196608 & i15) == 0) {
                    if (c28655q.m87157i(numberButtonPressed)) {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i18 |= i36;
                }
                if ((74899 & i18) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i18 & 1, z13)) {
                    if (i38 != 0) {
                        i17 = 0;
                    }
                    if (i39 != 0) {
                        i34 = 9;
                    } else {
                        i34 = i19;
                    }
                    if (i24 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i26 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    c0339a = new C0339a(i17, i34);
                    c0345gM871c = c0339a.m871c(num4);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    C2314t c2314t2 = C2314t.f9131w;
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
                    InterfaceC0221l.f734a.getClass();
                    int i48 = i34;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    int i49 = i17;
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
                    if (c0345gM871c.getAtMin()) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (c0345gM871c.getAtMax()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    C38072d c38072d2 = C38072d.f163053a;
                    int iM46127m2 = c38072d2.m121951d().getAction().getRemove();
                    float f14 = 2 * 4;
                    boolean zM87157i3 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                    i35 = i18 & 57344;
                    boolean z29 = z16;
                    if (i35 == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i3 | z18;
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (z19) {
                        final int i410 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i410) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i411 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i411) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    boolean z210 = z15;
                    boolean z211 = z17;
                    Integer num6 = num4;
                    AbstractC27237a.m82073c(iM46127m2, "minus icon", z29, f14, (InterfaceC4339a) objM87133R, c28655q, 3120, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t2));
                    AbstractC39330c.m125320b(0L, C38070b.f163049a.m121943a(c28655q, 6).getAffirmative(), 0L, 0L, AbstractC37817c.m121344e(-683622336, c28655q, new C0341c(c0345gM871c, z210, numberButtonPressed, 0)), c28655q, 24576, 13);
                    c28655q = c28655q;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t2));
                    int iM46115a2 = c38072d2.m121951d().getAction().getAdd();
                    boolean zM87157i4 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                    if (i35 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i4 | z24;
                    objM87133R2 = c28655q.m87133R();
                    if (z25) {
                        final int i412 = 1;
                        function1 = valueHasChanged;
                        objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i412) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i413 = 1;
                        function1 = valueHasChanged;
                        objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i413) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27237a.m82073c(iM46115a2, "plus icon", z211, f14, (InterfaceC4339a) objM87133R2, c28655q, 3120, 0);
                    c28655q.m87173q(true);
                    i29 = i48;
                    num3 = num6;
                    z14 = z210;
                    i28 = i49;
                } else {
                    function1 = valueHasChanged;
                    c28655q.m87138X();
                    z14 = z4;
                    i28 = i17;
                    i29 = i19;
                    num3 = num2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0342d(i28, i29, num3, z14, function1, numberButtonPressed, i15, i16);
                }
            }
            i18 |= 384;
            num2 = num;
            i26 = i16 & 8;
            if (i26 != 0) {
                if ((i15 & 3072) == 0) {
                    if (c28655q.m87155h(z4)) {
                        i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i18 |= i27;
                }
                if ((i15 & 24576) == 0) {
                    if (c28655q.m87157i(valueHasChanged)) {
                        i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i37 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i18 |= i37;
                }
                if ((196608 & i15) == 0) {
                    if (c28655q.m87157i(numberButtonPressed)) {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i18 |= i36;
                }
                if ((74899 & i18) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i18 & 1, z13)) {
                    if (i38 != 0) {
                        i17 = 0;
                    }
                    if (i39 != 0) {
                        i34 = 9;
                    } else {
                        i34 = i19;
                    }
                    if (i24 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i26 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    c0339a = new C0339a(i17, i34);
                    c0345gM871c = c0339a.m871c(num4);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    C2314t c2314t3 = C2314t.f9131w;
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t3);
                    InterfaceC0221l.f734a.getClass();
                    int i414 = i34;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    int i415 = i17;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    if (c0345gM871c.getAtMin()) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (c0345gM871c.getAtMax()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    C38072d c38072d3 = C38072d.f163053a;
                    int iM46127m3 = c38072d3.m121951d().getAction().getRemove();
                    float f15 = 2 * 4;
                    boolean zM87157i5 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                    i35 = i18 & 57344;
                    boolean z212 = z16;
                    if (i35 == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i5 | z18;
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v2 = C28635l.f115821a;
                    if (z19) {
                        final int i416 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i416) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i417 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i417) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    boolean z213 = z15;
                    boolean z214 = z17;
                    Integer num7 = num4;
                    AbstractC27237a.m82073c(iM46127m3, "minus icon", z212, f15, (InterfaceC4339a) objM87133R, c28655q, 3120, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t3));
                    AbstractC39330c.m125320b(0L, C38070b.f163049a.m121943a(c28655q, 6).getAffirmative(), 0L, 0L, AbstractC37817c.m121344e(-683622336, c28655q, new C0341c(c0345gM871c, z213, numberButtonPressed, 0)), c28655q, 24576, 13);
                    c28655q = c28655q;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t3));
                    int iM46115a3 = c38072d3.m121951d().getAction().getAdd();
                    boolean zM87157i6 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                    if (i35 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i6 | z24;
                    objM87133R2 = c28655q.m87133R();
                    if (z25) {
                        final int i418 = 1;
                        function1 = valueHasChanged;
                        objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i418) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i419 = 1;
                        function1 = valueHasChanged;
                        objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i419) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27237a.m82073c(iM46115a3, "plus icon", z214, f15, (InterfaceC4339a) objM87133R2, c28655q, 3120, 0);
                    c28655q.m87173q(true);
                    i29 = i414;
                    num3 = num7;
                    z14 = z213;
                    i28 = i415;
                } else {
                    function1 = valueHasChanged;
                    c28655q.m87138X();
                    z14 = z4;
                    i28 = i17;
                    i29 = i19;
                    num3 = num2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0342d(i28, i29, num3, z14, function1, numberButtonPressed, i15, i16);
                }
            }
            i18 |= 3072;
            if ((i15 & 24576) == 0) {
                if (c28655q.m87157i(valueHasChanged)) {
                    i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i37 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i18 |= i37;
            }
            if ((196608 & i15) == 0) {
                if (c28655q.m87157i(numberButtonPressed)) {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i18 |= i36;
            }
            if ((74899 & i18) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i18 & 1, z13)) {
                if (i38 != 0) {
                    i17 = 0;
                }
                if (i39 != 0) {
                    i34 = 9;
                } else {
                    i34 = i19;
                }
                if (i24 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i26 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                c0339a = new C0339a(i17, i34);
                c0345gM871c = c0339a.m871c(num4);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                C2314t c2314t4 = C2314t.f9131w;
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t4);
                InterfaceC0221l.f734a.getClass();
                int i4110 = i34;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                int i4111 = i17;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                if (c0345gM871c.getAtMin()) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (c0345gM871c.getAtMax()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                C38072d c38072d4 = C38072d.f163053a;
                int iM46127m4 = c38072d4.m121951d().getAction().getRemove();
                float f16 = 2 * 4;
                boolean zM87157i7 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                i35 = i18 & 57344;
                boolean z215 = z16;
                if (i35 == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i7 | z18;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v3 = C28635l.f115821a;
                if (z19) {
                    final int i4112 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i4112) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i4113 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i4113) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                boolean z216 = z15;
                boolean z217 = z17;
                Integer num8 = num4;
                AbstractC27237a.m82073c(iM46127m4, "minus icon", z215, f16, (InterfaceC4339a) objM87133R, c28655q, 3120, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t4));
                AbstractC39330c.m125320b(0L, C38070b.f163049a.m121943a(c28655q, 6).getAffirmative(), 0L, 0L, AbstractC37817c.m121344e(-683622336, c28655q, new C0341c(c0345gM871c, z216, numberButtonPressed, 0)), c28655q, 24576, 13);
                c28655q = c28655q;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t4));
                int iM46115a4 = c38072d4.m121951d().getAction().getAdd();
                boolean zM87157i8 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                if (i35 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87157i8 | z24;
                objM87133R2 = c28655q.m87133R();
                if (z25) {
                    final int i4114 = 1;
                    function1 = valueHasChanged;
                    objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i4114) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i4115 = 1;
                    function1 = valueHasChanged;
                    objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i4115) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27237a.m82073c(iM46115a4, "plus icon", z217, f16, (InterfaceC4339a) objM87133R2, c28655q, 3120, 0);
                c28655q.m87173q(true);
                i29 = i4110;
                num3 = num8;
                z14 = z216;
                i28 = i4111;
            } else {
                function1 = valueHasChanged;
                c28655q.m87138X();
                z14 = z4;
                i28 = i17;
                i29 = i19;
                num3 = num2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0342d(i28, i29, num3, z14, function1, numberButtonPressed, i15, i16);
            }
        }
        i18 |= 48;
        i19 = i14;
        i24 = i16 & 4;
        if (i24 != 0) {
            if ((i15 & 384) == 0) {
                num2 = num;
                if (c28655q.m87153g(num2)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i18 |= i25;
            }
            i26 = i16 & 8;
            if (i26 != 0) {
                if ((i15 & 3072) == 0) {
                    if (c28655q.m87155h(z4)) {
                        i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i18 |= i27;
                }
                if ((i15 & 24576) == 0) {
                    if (c28655q.m87157i(valueHasChanged)) {
                        i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i37 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i18 |= i37;
                }
                if ((196608 & i15) == 0) {
                    if (c28655q.m87157i(numberButtonPressed)) {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i18 |= i36;
                }
                if ((74899 & i18) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i18 & 1, z13)) {
                    if (i38 != 0) {
                        i17 = 0;
                    }
                    if (i39 != 0) {
                        i34 = 9;
                    } else {
                        i34 = i19;
                    }
                    if (i24 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i26 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    c0339a = new C0339a(i17, i34);
                    c0345gM871c = c0339a.m871c(num4);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    C2314t c2314t5 = C2314t.f9131w;
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t5);
                    InterfaceC0221l.f734a.getClass();
                    int i4116 = i34;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    int i4117 = i17;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    if (c0345gM871c.getAtMin()) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (c0345gM871c.getAtMax()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    C38072d c38072d5 = C38072d.f163053a;
                    int iM46127m5 = c38072d5.m121951d().getAction().getRemove();
                    float f17 = 2 * 4;
                    boolean zM87157i9 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                    i35 = i18 & 57344;
                    boolean z218 = z16;
                    if (i35 == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i9 | z18;
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v4 = C28635l.f115821a;
                    if (z19) {
                        final int i4118 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i4118) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i4119 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i4119) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    boolean z219 = z15;
                    boolean z2110 = z17;
                    Integer num9 = num4;
                    AbstractC27237a.m82073c(iM46127m5, "minus icon", z218, f17, (InterfaceC4339a) objM87133R, c28655q, 3120, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t5));
                    AbstractC39330c.m125320b(0L, C38070b.f163049a.m121943a(c28655q, 6).getAffirmative(), 0L, 0L, AbstractC37817c.m121344e(-683622336, c28655q, new C0341c(c0345gM871c, z219, numberButtonPressed, 0)), c28655q, 24576, 13);
                    c28655q = c28655q;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t5));
                    int iM46115a5 = c38072d5.m121951d().getAction().getAdd();
                    boolean zM87157i10 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                    if (i35 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i10 | z24;
                    objM87133R2 = c28655q.m87133R();
                    if (z25) {
                        final int i41110 = 1;
                        function1 = valueHasChanged;
                        objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i41110) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i41111 = 1;
                        function1 = valueHasChanged;
                        objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i41111) {
                                    case 0:
                                        return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                    default:
                                        return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27237a.m82073c(iM46115a5, "plus icon", z2110, f17, (InterfaceC4339a) objM87133R2, c28655q, 3120, 0);
                    c28655q.m87173q(true);
                    i29 = i4116;
                    num3 = num9;
                    z14 = z219;
                    i28 = i4117;
                } else {
                    function1 = valueHasChanged;
                    c28655q.m87138X();
                    z14 = z4;
                    i28 = i17;
                    i29 = i19;
                    num3 = num2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0342d(i28, i29, num3, z14, function1, numberButtonPressed, i15, i16);
                }
            }
            i18 |= 3072;
            if ((i15 & 24576) == 0) {
                if (c28655q.m87157i(valueHasChanged)) {
                    i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i37 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i18 |= i37;
            }
            if ((196608 & i15) == 0) {
                if (c28655q.m87157i(numberButtonPressed)) {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i18 |= i36;
            }
            if ((74899 & i18) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i18 & 1, z13)) {
                if (i38 != 0) {
                    i17 = 0;
                }
                if (i39 != 0) {
                    i34 = 9;
                } else {
                    i34 = i19;
                }
                if (i24 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i26 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                c0339a = new C0339a(i17, i34);
                c0345gM871c = c0339a.m871c(num4);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                C2314t c2314t6 = C2314t.f9131w;
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t6);
                InterfaceC0221l.f734a.getClass();
                int i41112 = i34;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                int i41113 = i17;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                if (c0345gM871c.getAtMin()) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (c0345gM871c.getAtMax()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                C38072d c38072d6 = C38072d.f163053a;
                int iM46127m6 = c38072d6.m121951d().getAction().getRemove();
                float f18 = 2 * 4;
                boolean zM87157i11 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                i35 = i18 & 57344;
                boolean z2111 = z16;
                if (i35 == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i11 | z18;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v5 = C28635l.f115821a;
                if (z19) {
                    final int i41114 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i41114) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i41115 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i41115) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                boolean z2112 = z15;
                boolean z2113 = z17;
                Integer num10 = num4;
                AbstractC27237a.m82073c(iM46127m6, "minus icon", z2111, f18, (InterfaceC4339a) objM87133R, c28655q, 3120, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t6));
                AbstractC39330c.m125320b(0L, C38070b.f163049a.m121943a(c28655q, 6).getAffirmative(), 0L, 0L, AbstractC37817c.m121344e(-683622336, c28655q, new C0341c(c0345gM871c, z2112, numberButtonPressed, 0)), c28655q, 24576, 13);
                c28655q = c28655q;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t6));
                int iM46115a6 = c38072d6.m121951d().getAction().getAdd();
                boolean zM87157i12 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                if (i35 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87157i12 | z24;
                objM87133R2 = c28655q.m87133R();
                if (z25) {
                    final int i41116 = 1;
                    function1 = valueHasChanged;
                    objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i41116) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i41117 = 1;
                    function1 = valueHasChanged;
                    objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i41117) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27237a.m82073c(iM46115a6, "plus icon", z2113, f18, (InterfaceC4339a) objM87133R2, c28655q, 3120, 0);
                c28655q.m87173q(true);
                i29 = i41112;
                num3 = num10;
                z14 = z2112;
                i28 = i41113;
            } else {
                function1 = valueHasChanged;
                c28655q.m87138X();
                z14 = z4;
                i28 = i17;
                i29 = i19;
                num3 = num2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0342d(i28, i29, num3, z14, function1, numberButtonPressed, i15, i16);
            }
        }
        i18 |= 384;
        num2 = num;
        i26 = i16 & 8;
        if (i26 != 0) {
            if ((i15 & 3072) == 0) {
                if (c28655q.m87155h(z4)) {
                    i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i18 |= i27;
            }
            if ((i15 & 24576) == 0) {
                if (c28655q.m87157i(valueHasChanged)) {
                    i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i37 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i18 |= i37;
            }
            if ((196608 & i15) == 0) {
                if (c28655q.m87157i(numberButtonPressed)) {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i18 |= i36;
            }
            if ((74899 & i18) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i18 & 1, z13)) {
                if (i38 != 0) {
                    i17 = 0;
                }
                if (i39 != 0) {
                    i34 = 9;
                } else {
                    i34 = i19;
                }
                if (i24 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i26 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                c0339a = new C0339a(i17, i34);
                c0345gM871c = c0339a.m871c(num4);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                C2314t c2314t7 = C2314t.f9131w;
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t7);
                InterfaceC0221l.f734a.getClass();
                int i41118 = i34;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                int i41119 = i17;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                if (c0345gM871c.getAtMin()) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (c0345gM871c.getAtMax()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                C38072d c38072d7 = C38072d.f163053a;
                int iM46127m7 = c38072d7.m121951d().getAction().getRemove();
                float f19 = 2 * 4;
                boolean zM87157i13 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                i35 = i18 & 57344;
                boolean z2114 = z16;
                if (i35 == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i13 | z18;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v6 = C28635l.f115821a;
                if (z19) {
                    final int i411110 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i411110) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i411111 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i411111) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                boolean z2115 = z15;
                boolean z2116 = z17;
                Integer num11 = num4;
                AbstractC27237a.m82073c(iM46127m7, "minus icon", z2114, f19, (InterfaceC4339a) objM87133R, c28655q, 3120, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19, c2314t7));
                AbstractC39330c.m125320b(0L, C38070b.f163049a.m121943a(c28655q, 6).getAffirmative(), 0L, 0L, AbstractC37817c.m121344e(-683622336, c28655q, new C0341c(c0345gM871c, z2115, numberButtonPressed, 0)), c28655q, 24576, 13);
                c28655q = c28655q;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19, c2314t7));
                int iM46115a7 = c38072d7.m121951d().getAction().getAdd();
                boolean zM87157i14 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
                if (i35 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87157i14 | z24;
                objM87133R2 = c28655q.m87133R();
                if (z25) {
                    final int i411112 = 1;
                    function1 = valueHasChanged;
                    objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i411112) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i411113 = 1;
                    function1 = valueHasChanged;
                    objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i411113) {
                                case 0:
                                    return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                                default:
                                    return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27237a.m82073c(iM46115a7, "plus icon", z2116, f19, (InterfaceC4339a) objM87133R2, c28655q, 3120, 0);
                c28655q.m87173q(true);
                i29 = i41118;
                num3 = num11;
                z14 = z2115;
                i28 = i41119;
            } else {
                function1 = valueHasChanged;
                c28655q.m87138X();
                z14 = z4;
                i28 = i17;
                i29 = i19;
                num3 = num2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0342d(i28, i29, num3, z14, function1, numberButtonPressed, i15, i16);
            }
        }
        i18 |= 3072;
        if ((i15 & 24576) == 0) {
            if (c28655q.m87157i(valueHasChanged)) {
                i37 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i37 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i18 |= i37;
        }
        if ((196608 & i15) == 0) {
            if (c28655q.m87157i(numberButtonPressed)) {
                i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i18 |= i36;
        }
        if ((74899 & i18) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i18 & 1, z13)) {
            if (i38 != 0) {
                i17 = 0;
            }
            if (i39 != 0) {
                i34 = 9;
            } else {
                i34 = i19;
            }
            if (i24 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (i26 != 0) {
                z15 = true;
            } else {
                z15 = z4;
            }
            c0339a = new C0339a(i17, i34);
            c0345gM871c = c0339a.m871c(num4);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            C2314t c2314t8 = C2314t.f9131w;
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t8);
            InterfaceC0221l.f734a.getClass();
            int i411114 = i34;
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            int i411115 = i17;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            if (c0345gM871c.getAtMin()) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (c0345gM871c.getAtMax()) {
                z17 = false;
            } else {
                z17 = false;
            }
            C38072d c38072d8 = C38072d.f163053a;
            int iM46127m8 = c38072d8.m121951d().getAction().getRemove();
            float f110 = 2 * 4;
            boolean zM87157i15 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
            i35 = i18 & 57344;
            boolean z2117 = z16;
            if (i35 == 16384) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zM87157i15 | z18;
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v7 = C28635l.f115821a;
            if (z19) {
                final int i411116 = 0;
                objM87133R = new InterfaceC4339a() { // from class: a31.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i411116) {
                            case 0:
                                return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                            default:
                                return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                final int i411117 = 0;
                objM87133R = new InterfaceC4339a() { // from class: a31.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i411117) {
                            case 0:
                                return AbstractC0344f.m878g(c0339a, c0345gM871c, valueHasChanged);
                            default:
                                return AbstractC0344f.m881j(c0339a, c0345gM871c, valueHasChanged);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            boolean z2118 = z15;
            boolean z2119 = z17;
            Integer num12 = num4;
            AbstractC27237a.m82073c(iM46127m8, "minus icon", z2117, f110, (InterfaceC4339a) objM87133R, c28655q, 3120, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f110, c2314t8));
            AbstractC39330c.m125320b(0L, C38070b.f163049a.m121943a(c28655q, 6).getAffirmative(), 0L, 0L, AbstractC37817c.m121344e(-683622336, c28655q, new C0341c(c0345gM871c, z2118, numberButtonPressed, 0)), c28655q, 24576, 13);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f110, c2314t8));
            int iM46115a8 = c38072d8.m121951d().getAction().getAdd();
            boolean zM87157i16 = c28655q.m87157i(c0339a) | c28655q.m87153g(c0345gM871c);
            if (i35 == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = zM87157i16 | z24;
            objM87133R2 = c28655q.m87133R();
            if (z25) {
                final int i411118 = 1;
                function1 = valueHasChanged;
                objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i411118) {
                            case 0:
                                return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                            default:
                                return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            } else {
                final int i411119 = 1;
                function1 = valueHasChanged;
                objM87133R2 = new InterfaceC4339a() { // from class: a31.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i411119) {
                            case 0:
                                return AbstractC0344f.m878g(c0339a, c0345gM871c, function1);
                            default:
                                return AbstractC0344f.m881j(c0339a, c0345gM871c, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27237a.m82073c(iM46115a8, "plus icon", z2119, f110, (InterfaceC4339a) objM87133R2, c28655q, 3120, 0);
            c28655q.m87173q(true);
            i29 = i411114;
            num3 = num12;
            z14 = z2118;
            i28 = i411115;
        } else {
            function1 = valueHasChanged;
            c28655q.m87138X();
            z14 = z4;
            i28 = i17;
            i29 = i19;
            num3 = num2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0342d(i28, i29, num3, z14, function1, numberButtonPressed, i15, i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m878g(C0339a c0339a, C0345g c0345g, Function1 function1) {
        function1.invoke(Integer.valueOf(c0339a.m870b(c0345g.getNumber(), -1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m879h(C0345g c0345g, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM21274h = AbstractC8693b.m21274h(c0345g.getNumberTextResource(), c28655q, 0);
            AbstractC27285v0.c cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
            boolean zM887e = c0345g.getIsSet();
            float f13 = 2 * 4;
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C0343e(interfaceC4339a, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27283u0.m82318q(null, strM21274h, null, null, cVar, zM887e, z4, f13, null, (InterfaceC4339a) objM87133R, c28655q, 12582912, 269);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m880i(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m881j(C0339a c0339a, C0345g c0345g, Function1 function1) {
        function1.invoke(Integer.valueOf(c0339a.m870b(c0345g.getNumber(), 1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m882k(int i13, int i14, Integer num, boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a, int i15, int i16, Composer composer, int i17) {
        m877f(i13, i14, num, z4, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }
}
