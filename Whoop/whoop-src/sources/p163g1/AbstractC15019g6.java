package p163g1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1094c;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.key.AbstractC1128a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import i93.C18279e;
import i93.InterfaceC18280f;
import j93.AbstractC21478l0;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.C11347e2;
import p077d0.InterfaceC11419z;
import p132f0.C13797j1;
import p181h2.C16617b;
import p208i2.C17919x;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.g6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15019g6 {

    /* JADX INFO: renamed from: a */
    public static final float f56199a = 10;

    /* JADX INFO: renamed from: b */
    public static final float f56200b = 24;

    /* JADX INFO: renamed from: c */
    public static final float f56201c = 1;

    /* JADX INFO: renamed from: d */
    public static final float f56202d = 6;

    /* JADX INFO: renamed from: e */
    public static final float f56203e = 4;

    /* JADX INFO: renamed from: f */
    public static final Modifier f56204f = AbstractC1102d.m3413j(AbstractC1102d.m3425v(C2314t.f9131w, 144, 0.0f, 2), 0.0f, 48, 1);

    /* JADX INFO: renamed from: g */
    public static final C11347e2 f56205g = new C11347e2(100, (InterfaceC11419z) null, 6);

    /* JADX INFO: renamed from: a */
    public static final void m43119a(final Function1 function1, final InterfaceC18280f interfaceC18280f, final C18279e c18279e, final InterfaceC28601c1 interfaceC28601c1, final float f13, Composer composer, final int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-743965752);
        int i14 = i13 | (c28655q.m87157i(function1) ? 4 : 2) | (c28655q.m87153g(interfaceC18280f) ? 32 : 16) | (c28655q.m87153g(c18279e) ? 256 : 128) | (c28655q.m87147d(f13) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK);
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            boolean z4 = ((i14 & 14) == 4) | ((i14 & 112) == 32) | ((57344 & i14) == 16384) | ((i14 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: g1.q5
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        InterfaceC18280f interfaceC18280f2 = interfaceC18280f;
                        float fFloatValue = (((Number) interfaceC18280f2.mo52651d()).floatValue() - ((Number) interfaceC18280f2.getStart()).floatValue()) / 1000;
                        float fFloatValue2 = ((Number) function1.invoke(Float.valueOf(f13))).floatValue();
                        InterfaceC28601c1 interfaceC28601c2 = interfaceC28601c1;
                        if (Math.abs(fFloatValue2 - ((Number) interfaceC28601c2.getValue()).floatValue()) > fFloatValue) {
                            if (c18279e.mo52654c((Comparable) interfaceC28601c2.getValue())) {
                                interfaceC28601c2.setValue(Float.valueOf(fFloatValue2));
                            }
                        }
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(interfaceC4339a);
                objM87133R = interfaceC4339a;
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(interfaceC18280f, c18279e, interfaceC28601c1, f13, i13) { // from class: g1.r5

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ float f56702E;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ InterfaceC18280f f56704x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ C18279e f56705y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ InterfaceC28601c1 f56706z;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(3073);
                    AbstractC15019g6.m43119a(this.f56703w, this.f56704x, this.f56705y, this.f56706z, this.f56702E, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:107:0x01be  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e1 A[LOOP:0: B:117:0x01dd->B:119:0x01e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x026c  */
    /* JADX WARN: Code duplicated, block: B:124:0x026f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0273  */
    /* JADX WARN: Code duplicated, block: B:127:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f5 A[EDGE_INSN: B:136:0x01f5->B:120:0x01f5 BREAK  A[LOOP:0: B:117:0x01dd->B:119:0x01e1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0111  */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:89:0x0123  */
    /* JADX WARN: Code duplicated, block: B:91:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x0129  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m43120b(float f13, final Function1 function1, Modifier modifier, boolean z4, InterfaceC18280f interfaceC18280f, int i13, InterfaceC4339a interfaceC4339a, C15177w1 c15177w1, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        int i17;
        boolean z13;
        int i18;
        InterfaceC18280f c18279e;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        InterfaceC4339a interfaceC4339a2;
        int i34;
        int i35;
        C15177w1 c15177w1M101110v;
        int i36;
        int i37;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        InterfaceC18280f interfaceC18280f2;
        C15177w1 c15177w2;
        int i38;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        int i39;
        int i44;
        InterfaceC4339a interfaceC4339a4;
        C28655q c28655q2;
        boolean z16;
        int i45;
        int i46;
        InterfaceC18280f interfaceC18280f3;
        Modifier modifier4;
        boolean z17;
        Object objM87133R;
        Object obj;
        InterfaceC21083i interfaceC21083i;
        final int i47;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC28601c1 interfaceC28601c1M87238F2;
        boolean z18;
        int i48;
        ArrayList arrayList;
        int i49;
        final InterfaceC4339a interfaceC4339a6;
        Object obj2;
        List list;
        InterfaceC4339a interfaceC4339a7;
        Modifier modifierM3366a;
        boolean z19;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1962335196);
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q3.m87147d(f13) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q3.m87157i(function1) ? 32 : 16;
        }
        int i54 = i15 & 4;
        if (i54 != 0) {
            i17 = i16 | 384;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i17 = i16 | (c28655q3.m87153g(modifier2) ? 256 : 128);
        }
        int i55 = i15 & 8;
        if (i55 != 0) {
            i18 = i17 | 3072;
            z13 = z4;
        } else {
            z13 = z4;
            i18 = i17 | (c28655q3.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        }
        if ((i15 & 16) == 0) {
            c18279e = interfaceC18280f;
            if (c28655q3.m87153g(c18279e)) {
                i19 = DfuBaseService.ERROR_CONNECTION_MASK;
            }
            i24 = i18 | i19;
            i25 = i15 & 32;
            if (i25 != 0) {
                i28 = i24 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                i26 = i13;
            } else {
                i26 = i13;
                if (c28655q3.m87149e(i26)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i28 = i24 | i27;
            }
            i29 = i15 & 64;
            if (i29 != 0) {
                i35 = i28 | 1572864;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q3.m87157i(interfaceC4339a2)) {
                    i34 = 1048576;
                } else {
                    i34 = 524288;
                }
                i35 = i28 | i34;
            }
            int i56 = i35 | 12582912;
            if ((i15 & 256) == 0) {
                c15177w1M101110v = c15177w1;
                if (c28655q3.m87153g(c15177w1M101110v)) {
                    i36 = 67108864;
                }
                i37 = i56 | i36;
                if ((i37 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q3.m87135U(i37 & 1, z14)) {
                    c28655q3.m87140Z();
                    if ((i14 & 1) != 0 || c28655q3.m87118C()) {
                        if (i54 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i55 != 0) {
                            z13 = true;
                        }
                        if ((i15 & 16) != 0) {
                            c18279e = new C18279e(0.0f, 1.0f);
                            i39 = i37 & (-57345);
                        }
                        if (i25 != 0) {
                            i39 = i37;
                            i44 = 0;
                        } else {
                            i39 = i37;
                            i44 = i26;
                        }
                        if (i29 != 0) {
                            interfaceC4339a4 = null;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        if ((i15 & 256) != 0) {
                            z16 = false;
                            i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            c28655q2 = c28655q3;
                            boolean z24 = z13;
                            i46 = i39 & (-234881025);
                            interfaceC18280f3 = c18279e;
                            modifier4 = modifier2;
                            z17 = z24;
                            c15177w1M101110v = AbstractC32411b.m101110v(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c28655q3, 0, 1023);
                        } else {
                            c28655q2 = c28655q3;
                            z16 = false;
                            i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            boolean z25 = z13;
                            i46 = i39;
                            interfaceC18280f3 = c18279e;
                            modifier4 = modifier2;
                            z17 = z25;
                        }
                    } else {
                        c28655q3.m87138X();
                        int i57 = (i15 & 16) != 0 ? i37 & (-57345) : i37;
                        if ((i15 & 256) != 0) {
                            i57 &= -234881025;
                        }
                        boolean z26 = z13;
                        i46 = i57;
                        interfaceC18280f3 = c18279e;
                        modifier4 = modifier2;
                        z17 = z26;
                        i44 = i26;
                        interfaceC4339a4 = interfaceC4339a2;
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        c28655q2 = c28655q3;
                        z16 = false;
                    }
                    c28655q2.m87175r();
                    c28655q2.m87150e0(-1127477833);
                    objM87133R = c28655q2.m87133R();
                    obj = C28635l.f115821a;
                    if (objM87133R == obj) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    interfaceC21083i = (InterfaceC21083i) objM87133R;
                    c28655q2.m87173q(z16);
                    if (i44 >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    i47 = i44;
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q2);
                    interfaceC4339a5 = interfaceC4339a4;
                    interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(interfaceC4339a5, c28655q2);
                    if ((i46 & 458752) == i45) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    Object objM87133R2 = c28655q2.m87133R();
                    if (!z18 || objM87133R2 == obj) {
                        if (i47 != 0) {
                            i48 = i47 + 2;
                            arrayList = new ArrayList(i48);
                            i49 = 0;
                            while (true) {
                                interfaceC4339a6 = interfaceC4339a5;
                                if (i49 >= i48) {
                                    break;
                                }
                                arrayList.add(Float.valueOf(i49 / (i47 + 1)));
                                i49++;
                                interfaceC4339a5 = interfaceC4339a6;
                            }
                        } else {
                            arrayList = C25271y.f99162w;
                            interfaceC4339a6 = interfaceC4339a5;
                        }
                        c28655q2.m87172p0(arrayList);
                        obj2 = arrayList;
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        obj2 = objM87133R2;
                    }
                    list = (List) obj2;
                    C28674u2 c28674u2 = AbstractC15027h3.f56241a;
                    Modifier modifierMo3471e = modifier4.mo3471e(MinimumInteractiveModifier.f4718w);
                    float f14 = f56199a * 2;
                    Modifier modifierM3417n = AbstractC1102d.m3417n(modifierMo3471e, f14, f14, 0.0f, 0.0f, 12);
                    final float fM36283m = AbstractC12889b.m36283m(f13, ((Number) interfaceC18280f3.getStart()).floatValue(), ((Number) interfaceC18280f3.mo52651d()).floatValue());
                    final InterfaceC18280f interfaceC18280f4 = interfaceC18280f3;
                    final boolean z27 = z17;
                    interfaceC4339a7 = interfaceC4339a6;
                    modifierM3366a = AbstractC1094c.m3366a(AbstractC18032n.m51775c(AbstractC18032n.m51775c(modifierM3417n, false, new Function1() { // from class: g1.p5
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj3;
                            if (!z27) {
                                AbstractC18041w.m51802a(interfaceC18044z);
                            }
                            C15012g c15012g = new C15012g(interfaceC18280f4, i47, fM36283m, function1, interfaceC4339a6);
                            InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                            ((C18030l) interfaceC18044z).m51772e(AbstractC18029k.f69961h, new C18017a(null, c15012g));
                            return C23454a0.f92919a;
                        }
                    }), true, new C13797j1(f13, interfaceC18280f3, i47)), z17, interfaceC21083i);
                    if (c28655q2.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (i47 >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    InterfaceC18280f interfaceC18280f5 = interfaceC18280f3;
                    boolean z28 = z17;
                    Modifier modifierM3493a = AbstractC1128a.m3493a(modifierM3366a, new C14975c6(z28, interfaceC18280f5, i47, interfaceC28601c1M87238F, f13, z19, interfaceC28601c1M87238F2));
                    C15177w1 c15177w3 = c15177w1M101110v;
                    C28655q c28655q4 = c28655q2;
                    AbstractC22953f.m66714a(modifierM3493a, null, false, AbstractC37817c.m121344e(2085116814, c28655q2, new C15211z5(interfaceC18280f5, f13, list, interfaceC4339a7, interfaceC21083i, z28, c15177w3, interfaceC28601c1M87238F)), c28655q4, 3072, 6);
                    c28655q = c28655q4;
                    interfaceC18280f2 = interfaceC18280f5;
                    z15 = z28;
                    c15177w2 = c15177w3;
                    modifier3 = modifier4;
                    interfaceC4339a3 = interfaceC4339a7;
                    i38 = i47;
                } else {
                    C28655q c28655q5 = c28655q3;
                    c28655q5.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    interfaceC18280f2 = c18279e;
                    c15177w2 = c15177w1M101110v;
                    i38 = i26;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15101o5(f13, function1, modifier3, z15, interfaceC18280f2, i38, interfaceC4339a3, c15177w2, i14, i15);
                }
            }
            c15177w1M101110v = c15177w1;
            i36 = AndroidSDKConstants.FLAG_MUTABLE;
            i37 = i56 | i36;
            if ((i37 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q3.m87135U(i37 & 1, z14)) {
                c28655q3.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i54 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i55 != 0) {
                        z13 = true;
                    }
                    if ((i15 & 16) != 0) {
                        c18279e = new C18279e(0.0f, 1.0f);
                        i39 = i37 & (-57345);
                    }
                    if (i25 != 0) {
                        i39 = i37;
                        i44 = 0;
                    } else {
                        i39 = i37;
                        i44 = i26;
                    }
                    if (i29 != 0) {
                        interfaceC4339a4 = null;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if ((i15 & 256) != 0) {
                        z16 = false;
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        c28655q2 = c28655q3;
                        boolean z29 = z13;
                        i46 = i39 & (-234881025);
                        interfaceC18280f3 = c18279e;
                        modifier4 = modifier2;
                        z17 = z29;
                        c15177w1M101110v = AbstractC32411b.m101110v(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c28655q3, 0, 1023);
                    } else {
                        c28655q2 = c28655q3;
                        z16 = false;
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        boolean z210 = z13;
                        i46 = i39;
                        interfaceC18280f3 = c18279e;
                        modifier4 = modifier2;
                        z17 = z210;
                    }
                } else {
                    if (i54 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i55 != 0) {
                        z13 = true;
                    }
                    if ((i15 & 16) != 0) {
                        c18279e = new C18279e(0.0f, 1.0f);
                        i39 = i37 & (-57345);
                    }
                    if (i25 != 0) {
                        i39 = i37;
                        i44 = 0;
                    } else {
                        i39 = i37;
                        i44 = i26;
                    }
                    if (i29 != 0) {
                        interfaceC4339a4 = null;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if ((i15 & 256) != 0) {
                        z16 = false;
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        c28655q2 = c28655q3;
                        boolean z211 = z13;
                        i46 = i39 & (-234881025);
                        interfaceC18280f3 = c18279e;
                        modifier4 = modifier2;
                        z17 = z211;
                        c15177w1M101110v = AbstractC32411b.m101110v(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c28655q3, 0, 1023);
                    } else {
                        c28655q2 = c28655q3;
                        z16 = false;
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        boolean z212 = z13;
                        i46 = i39;
                        interfaceC18280f3 = c18279e;
                        modifier4 = modifier2;
                        z17 = z212;
                    }
                }
                c28655q2.m87175r();
                c28655q2.m87150e0(-1127477833);
                objM87133R = c28655q2.m87133R();
                obj = C28635l.f115821a;
                if (objM87133R == obj) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R;
                c28655q2.m87173q(z16);
                if (i44 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0");
                }
                i47 = i44;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q2);
                interfaceC4339a5 = interfaceC4339a4;
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(interfaceC4339a5, c28655q2);
                if ((i46 & 458752) == i45) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                Object objM87133R3 = c28655q2.m87133R();
                if (z18) {
                    if (i47 != 0) {
                        i48 = i47 + 2;
                        arrayList = new ArrayList(i48);
                        i49 = 0;
                        while (true) {
                            interfaceC4339a6 = interfaceC4339a5;
                            if (i49 >= i48) {
                                break;
                                break;
                            } else {
                                arrayList.add(Float.valueOf(i49 / (i47 + 1)));
                                i49++;
                                interfaceC4339a5 = interfaceC4339a6;
                            }
                        }
                    } else {
                        arrayList = C25271y.f99162w;
                        interfaceC4339a6 = interfaceC4339a5;
                    }
                    c28655q2.m87172p0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i47 != 0) {
                        i48 = i47 + 2;
                        arrayList = new ArrayList(i48);
                        i49 = 0;
                        while (true) {
                            interfaceC4339a6 = interfaceC4339a5;
                            if (i49 >= i48) {
                                break;
                                break;
                            } else {
                                arrayList.add(Float.valueOf(i49 / (i47 + 1)));
                                i49++;
                                interfaceC4339a5 = interfaceC4339a6;
                            }
                        }
                    } else {
                        arrayList = C25271y.f99162w;
                        interfaceC4339a6 = interfaceC4339a5;
                    }
                    c28655q2.m87172p0(arrayList);
                    obj2 = arrayList;
                }
                list = (List) obj2;
                C28674u2 c28674u3 = AbstractC15027h3.f56241a;
                Modifier modifierMo3471e2 = modifier4.mo3471e(MinimumInteractiveModifier.f4718w);
                float f15 = f56199a * 2;
                Modifier modifierM3417n2 = AbstractC1102d.m3417n(modifierMo3471e2, f15, f15, 0.0f, 0.0f, 12);
                final float fM36283m2 = AbstractC12889b.m36283m(f13, ((Number) interfaceC18280f3.getStart()).floatValue(), ((Number) interfaceC18280f3.mo52651d()).floatValue());
                final InterfaceC18280f interfaceC18280f6 = interfaceC18280f3;
                final boolean z213 = z17;
                interfaceC4339a7 = interfaceC4339a6;
                modifierM3366a = AbstractC1094c.m3366a(AbstractC18032n.m51775c(AbstractC18032n.m51775c(modifierM3417n2, false, new Function1() { // from class: g1.p5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj3;
                        if (!z213) {
                            AbstractC18041w.m51802a(interfaceC18044z);
                        }
                        C15012g c15012g = new C15012g(interfaceC18280f6, i47, fM36283m2, function1, interfaceC4339a6);
                        InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                        ((C18030l) interfaceC18044z).m51772e(AbstractC18029k.f69961h, new C18017a(null, c15012g));
                        return C23454a0.f92919a;
                    }
                }), true, new C13797j1(f13, interfaceC18280f3, i47)), z17, interfaceC21083i);
                if (c28655q2.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (i47 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0");
                }
                InterfaceC18280f interfaceC18280f7 = interfaceC18280f3;
                boolean z214 = z17;
                Modifier modifierM3493a2 = AbstractC1128a.m3493a(modifierM3366a, new C14975c6(z214, interfaceC18280f7, i47, interfaceC28601c1M87238F, f13, z19, interfaceC28601c1M87238F2));
                C15177w1 c15177w4 = c15177w1M101110v;
                C28655q c28655q6 = c28655q2;
                AbstractC22953f.m66714a(modifierM3493a2, null, false, AbstractC37817c.m121344e(2085116814, c28655q2, new C15211z5(interfaceC18280f7, f13, list, interfaceC4339a7, interfaceC21083i, z214, c15177w4, interfaceC28601c1M87238F)), c28655q6, 3072, 6);
                c28655q = c28655q6;
                interfaceC18280f2 = interfaceC18280f7;
                z15 = z214;
                c15177w2 = c15177w4;
                modifier3 = modifier4;
                interfaceC4339a3 = interfaceC4339a7;
                i38 = i47;
            } else {
                C28655q c28655q7 = c28655q3;
                c28655q7.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                interfaceC18280f2 = c18279e;
                c15177w2 = c15177w1M101110v;
                i38 = i26;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15101o5(f13, function1, modifier3, z15, interfaceC18280f2, i38, interfaceC4339a3, c15177w2, i14, i15);
            }
        }
        c18279e = interfaceC18280f;
        i19 = DfuBaseService.ERROR_REMOTE_MASK;
        i24 = i18 | i19;
        i25 = i15 & 32;
        if (i25 != 0) {
            i28 = i24 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i26 = i13;
        } else {
            i26 = i13;
            if (c28655q3.m87149e(i26)) {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i28 = i24 | i27;
        }
        i29 = i15 & 64;
        if (i29 != 0) {
            i35 = i28 | 1572864;
            interfaceC4339a2 = interfaceC4339a;
        } else {
            interfaceC4339a2 = interfaceC4339a;
            if (c28655q3.m87157i(interfaceC4339a2)) {
                i34 = 1048576;
            } else {
                i34 = 524288;
            }
            i35 = i28 | i34;
        }
        int i58 = i35 | 12582912;
        if ((i15 & 256) == 0) {
            c15177w1M101110v = c15177w1;
            if (c28655q3.m87153g(c15177w1M101110v)) {
                i36 = 67108864;
            }
            i37 = i58 | i36;
            if ((i37 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q3.m87135U(i37 & 1, z14)) {
                c28655q3.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i54 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i55 != 0) {
                        z13 = true;
                    }
                    if ((i15 & 16) != 0) {
                        c18279e = new C18279e(0.0f, 1.0f);
                        i39 = i37 & (-57345);
                    }
                    if (i25 != 0) {
                        i39 = i37;
                        i44 = 0;
                    } else {
                        i39 = i37;
                        i44 = i26;
                    }
                    if (i29 != 0) {
                        interfaceC4339a4 = null;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if ((i15 & 256) != 0) {
                        z16 = false;
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        c28655q2 = c28655q3;
                        boolean z215 = z13;
                        i46 = i39 & (-234881025);
                        interfaceC18280f3 = c18279e;
                        modifier4 = modifier2;
                        z17 = z215;
                        c15177w1M101110v = AbstractC32411b.m101110v(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c28655q3, 0, 1023);
                    } else {
                        c28655q2 = c28655q3;
                        z16 = false;
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        boolean z216 = z13;
                        i46 = i39;
                        interfaceC18280f3 = c18279e;
                        modifier4 = modifier2;
                        z17 = z216;
                    }
                } else {
                    if (i54 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i55 != 0) {
                        z13 = true;
                    }
                    if ((i15 & 16) != 0) {
                        c18279e = new C18279e(0.0f, 1.0f);
                        i39 = i37 & (-57345);
                    }
                    if (i25 != 0) {
                        i39 = i37;
                        i44 = 0;
                    } else {
                        i39 = i37;
                        i44 = i26;
                    }
                    if (i29 != 0) {
                        interfaceC4339a4 = null;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if ((i15 & 256) != 0) {
                        z16 = false;
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        c28655q2 = c28655q3;
                        boolean z217 = z13;
                        i46 = i39 & (-234881025);
                        interfaceC18280f3 = c18279e;
                        modifier4 = modifier2;
                        z17 = z217;
                        c15177w1M101110v = AbstractC32411b.m101110v(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c28655q3, 0, 1023);
                    } else {
                        c28655q2 = c28655q3;
                        z16 = false;
                        i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        boolean z218 = z13;
                        i46 = i39;
                        interfaceC18280f3 = c18279e;
                        modifier4 = modifier2;
                        z17 = z218;
                    }
                }
                c28655q2.m87175r();
                c28655q2.m87150e0(-1127477833);
                objM87133R = c28655q2.m87133R();
                obj = C28635l.f115821a;
                if (objM87133R == obj) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R;
                c28655q2.m87173q(z16);
                if (i44 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0");
                }
                i47 = i44;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q2);
                interfaceC4339a5 = interfaceC4339a4;
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(interfaceC4339a5, c28655q2);
                if ((i46 & 458752) == i45) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                Object objM87133R4 = c28655q2.m87133R();
                if (z18) {
                    if (i47 != 0) {
                        i48 = i47 + 2;
                        arrayList = new ArrayList(i48);
                        i49 = 0;
                        while (true) {
                            interfaceC4339a6 = interfaceC4339a5;
                            if (i49 >= i48) {
                                break;
                                break;
                            } else {
                                arrayList.add(Float.valueOf(i49 / (i47 + 1)));
                                i49++;
                                interfaceC4339a5 = interfaceC4339a6;
                            }
                        }
                    } else {
                        arrayList = C25271y.f99162w;
                        interfaceC4339a6 = interfaceC4339a5;
                    }
                    c28655q2.m87172p0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i47 != 0) {
                        i48 = i47 + 2;
                        arrayList = new ArrayList(i48);
                        i49 = 0;
                        while (true) {
                            interfaceC4339a6 = interfaceC4339a5;
                            if (i49 >= i48) {
                                break;
                                break;
                            } else {
                                arrayList.add(Float.valueOf(i49 / (i47 + 1)));
                                i49++;
                                interfaceC4339a5 = interfaceC4339a6;
                            }
                        }
                    } else {
                        arrayList = C25271y.f99162w;
                        interfaceC4339a6 = interfaceC4339a5;
                    }
                    c28655q2.m87172p0(arrayList);
                    obj2 = arrayList;
                }
                list = (List) obj2;
                C28674u2 c28674u4 = AbstractC15027h3.f56241a;
                Modifier modifierMo3471e3 = modifier4.mo3471e(MinimumInteractiveModifier.f4718w);
                float f16 = f56199a * 2;
                Modifier modifierM3417n3 = AbstractC1102d.m3417n(modifierMo3471e3, f16, f16, 0.0f, 0.0f, 12);
                final float fM36283m3 = AbstractC12889b.m36283m(f13, ((Number) interfaceC18280f3.getStart()).floatValue(), ((Number) interfaceC18280f3.mo52651d()).floatValue());
                final InterfaceC18280f interfaceC18280f8 = interfaceC18280f3;
                final boolean z219 = z17;
                interfaceC4339a7 = interfaceC4339a6;
                modifierM3366a = AbstractC1094c.m3366a(AbstractC18032n.m51775c(AbstractC18032n.m51775c(modifierM3417n3, false, new Function1() { // from class: g1.p5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj3;
                        if (!z219) {
                            AbstractC18041w.m51802a(interfaceC18044z);
                        }
                        C15012g c15012g = new C15012g(interfaceC18280f8, i47, fM36283m3, function1, interfaceC4339a6);
                        InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                        ((C18030l) interfaceC18044z).m51772e(AbstractC18029k.f69961h, new C18017a(null, c15012g));
                        return C23454a0.f92919a;
                    }
                }), true, new C13797j1(f13, interfaceC18280f3, i47)), z17, interfaceC21083i);
                if (c28655q2.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (i47 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0");
                }
                InterfaceC18280f interfaceC18280f9 = interfaceC18280f3;
                boolean z2110 = z17;
                Modifier modifierM3493a3 = AbstractC1128a.m3493a(modifierM3366a, new C14975c6(z2110, interfaceC18280f9, i47, interfaceC28601c1M87238F, f13, z19, interfaceC28601c1M87238F2));
                C15177w1 c15177w5 = c15177w1M101110v;
                C28655q c28655q8 = c28655q2;
                AbstractC22953f.m66714a(modifierM3493a3, null, false, AbstractC37817c.m121344e(2085116814, c28655q2, new C15211z5(interfaceC18280f9, f13, list, interfaceC4339a7, interfaceC21083i, z2110, c15177w5, interfaceC28601c1M87238F)), c28655q8, 3072, 6);
                c28655q = c28655q8;
                interfaceC18280f2 = interfaceC18280f9;
                z15 = z2110;
                c15177w2 = c15177w5;
                modifier3 = modifier4;
                interfaceC4339a3 = interfaceC4339a7;
                i38 = i47;
            } else {
                C28655q c28655q9 = c28655q3;
                c28655q9.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                interfaceC18280f2 = c18279e;
                c15177w2 = c15177w1M101110v;
                i38 = i26;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q9;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15101o5(f13, function1, modifier3, z15, interfaceC18280f2, i38, interfaceC4339a3, c15177w2, i14, i15);
            }
        }
        c15177w1M101110v = c15177w1;
        i36 = AndroidSDKConstants.FLAG_MUTABLE;
        i37 = i58 | i36;
        if ((i37 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q3.m87135U(i37 & 1, z14)) {
            c28655q3.m87140Z();
            if ((i14 & 1) != 0) {
                if (i54 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i55 != 0) {
                    z13 = true;
                }
                if ((i15 & 16) != 0) {
                    c18279e = new C18279e(0.0f, 1.0f);
                    i39 = i37 & (-57345);
                }
                if (i25 != 0) {
                    i39 = i37;
                    i44 = 0;
                } else {
                    i39 = i37;
                    i44 = i26;
                }
                if (i29 != 0) {
                    interfaceC4339a4 = null;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if ((i15 & 256) != 0) {
                    z16 = false;
                    i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    c28655q2 = c28655q3;
                    boolean z2111 = z13;
                    i46 = i39 & (-234881025);
                    interfaceC18280f3 = c18279e;
                    modifier4 = modifier2;
                    z17 = z2111;
                    c15177w1M101110v = AbstractC32411b.m101110v(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c28655q3, 0, 1023);
                } else {
                    c28655q2 = c28655q3;
                    z16 = false;
                    i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    boolean z2112 = z13;
                    i46 = i39;
                    interfaceC18280f3 = c18279e;
                    modifier4 = modifier2;
                    z17 = z2112;
                }
            } else {
                if (i54 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i55 != 0) {
                    z13 = true;
                }
                if ((i15 & 16) != 0) {
                    c18279e = new C18279e(0.0f, 1.0f);
                    i39 = i37 & (-57345);
                }
                if (i25 != 0) {
                    i39 = i37;
                    i44 = 0;
                } else {
                    i39 = i37;
                    i44 = i26;
                }
                if (i29 != 0) {
                    interfaceC4339a4 = null;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if ((i15 & 256) != 0) {
                    z16 = false;
                    i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    c28655q2 = c28655q3;
                    boolean z2113 = z13;
                    i46 = i39 & (-234881025);
                    interfaceC18280f3 = c18279e;
                    modifier4 = modifier2;
                    z17 = z2113;
                    c15177w1M101110v = AbstractC32411b.m101110v(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c28655q3, 0, 1023);
                } else {
                    c28655q2 = c28655q3;
                    z16 = false;
                    i45 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    boolean z2114 = z13;
                    i46 = i39;
                    interfaceC18280f3 = c18279e;
                    modifier4 = modifier2;
                    z17 = z2114;
                }
            }
            c28655q2.m87175r();
            c28655q2.m87150e0(-1127477833);
            objM87133R = c28655q2.m87133R();
            obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R;
            c28655q2.m87173q(z16);
            if (i44 >= 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            i47 = i44;
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q2);
            interfaceC4339a5 = interfaceC4339a4;
            interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(interfaceC4339a5, c28655q2);
            if ((i46 & 458752) == i45) {
                z18 = true;
            } else {
                z18 = false;
            }
            Object objM87133R5 = c28655q2.m87133R();
            if (z18) {
                if (i47 != 0) {
                    i48 = i47 + 2;
                    arrayList = new ArrayList(i48);
                    i49 = 0;
                    while (true) {
                        interfaceC4339a6 = interfaceC4339a5;
                        if (i49 >= i48) {
                            break;
                            break;
                        } else {
                            arrayList.add(Float.valueOf(i49 / (i47 + 1)));
                            i49++;
                            interfaceC4339a5 = interfaceC4339a6;
                        }
                    }
                } else {
                    arrayList = C25271y.f99162w;
                    interfaceC4339a6 = interfaceC4339a5;
                }
                c28655q2.m87172p0(arrayList);
                obj2 = arrayList;
            } else {
                if (i47 != 0) {
                    i48 = i47 + 2;
                    arrayList = new ArrayList(i48);
                    i49 = 0;
                    while (true) {
                        interfaceC4339a6 = interfaceC4339a5;
                        if (i49 >= i48) {
                            break;
                            break;
                        } else {
                            arrayList.add(Float.valueOf(i49 / (i47 + 1)));
                            i49++;
                            interfaceC4339a5 = interfaceC4339a6;
                        }
                    }
                } else {
                    arrayList = C25271y.f99162w;
                    interfaceC4339a6 = interfaceC4339a5;
                }
                c28655q2.m87172p0(arrayList);
                obj2 = arrayList;
            }
            list = (List) obj2;
            C28674u2 c28674u5 = AbstractC15027h3.f56241a;
            Modifier modifierMo3471e4 = modifier4.mo3471e(MinimumInteractiveModifier.f4718w);
            float f17 = f56199a * 2;
            Modifier modifierM3417n4 = AbstractC1102d.m3417n(modifierMo3471e4, f17, f17, 0.0f, 0.0f, 12);
            final float fM36283m4 = AbstractC12889b.m36283m(f13, ((Number) interfaceC18280f3.getStart()).floatValue(), ((Number) interfaceC18280f3.mo52651d()).floatValue());
            final InterfaceC18280f interfaceC18280f10 = interfaceC18280f3;
            final boolean z2115 = z17;
            interfaceC4339a7 = interfaceC4339a6;
            modifierM3366a = AbstractC1094c.m3366a(AbstractC18032n.m51775c(AbstractC18032n.m51775c(modifierM3417n4, false, new Function1() { // from class: g1.p5
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj3;
                    if (!z2115) {
                        AbstractC18041w.m51802a(interfaceC18044z);
                    }
                    C15012g c15012g = new C15012g(interfaceC18280f10, i47, fM36283m4, function1, interfaceC4339a6);
                    InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                    ((C18030l) interfaceC18044z).m51772e(AbstractC18029k.f69961h, new C18017a(null, c15012g));
                    return C23454a0.f92919a;
                }
            }), true, new C13797j1(f13, interfaceC18280f3, i47)), z17, interfaceC21083i);
            if (c28655q2.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (i47 >= 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            InterfaceC18280f interfaceC18280f11 = interfaceC18280f3;
            boolean z2116 = z17;
            Modifier modifierM3493a4 = AbstractC1128a.m3493a(modifierM3366a, new C14975c6(z2116, interfaceC18280f11, i47, interfaceC28601c1M87238F, f13, z19, interfaceC28601c1M87238F2));
            C15177w1 c15177w6 = c15177w1M101110v;
            C28655q c28655q10 = c28655q2;
            AbstractC22953f.m66714a(modifierM3493a4, null, false, AbstractC37817c.m121344e(2085116814, c28655q2, new C15211z5(interfaceC18280f11, f13, list, interfaceC4339a7, interfaceC21083i, z2116, c15177w6, interfaceC28601c1M87238F)), c28655q10, 3072, 6);
            c28655q = c28655q10;
            interfaceC18280f2 = interfaceC18280f11;
            z15 = z2116;
            c15177w2 = c15177w6;
            modifier3 = modifier4;
            interfaceC4339a3 = interfaceC4339a7;
            i38 = i47;
        } else {
            C28655q c28655q11 = c28655q3;
            c28655q11.m87138X();
            modifier3 = modifier2;
            z15 = z13;
            interfaceC18280f2 = c18279e;
            c15177w2 = c15177w1M101110v;
            i38 = i26;
            interfaceC4339a3 = interfaceC4339a2;
            c28655q = c28655q11;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15101o5(f13, function1, modifier3, z15, interfaceC18280f2, i38, interfaceC4339a3, c15177w2, i14, i15);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m43121c(final boolean z4, final float f13, final List list, final C15177w1 c15177w1, final float f14, final InterfaceC21083i interfaceC21083i, final Modifier modifier, Composer composer, final int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1679682785);
        int i14 = i13 | (c28655q.m87155h(z4) ? 4 : 2) | (c28655q.m87147d(f13) ? 32 : 16) | (c28655q.m87157i(list) ? 256 : 128) | (c28655q.m87153g(c15177w1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87147d(f14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q.m87153g(interfaceC21083i) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) | (c28655q.m87153g(modifier) ? 1048576 : 524288);
        if (c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            Modifier modifierMo3471e = modifier.mo3471e(f56204f);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            float fMo743q0 = interfaceC39171c.mo743q0(f56203e);
            float f15 = f56199a;
            float fMo743q1 = interfaceC39171c.mo743q0(f15);
            float f16 = f15 * 2;
            float fMo734f0 = interfaceC39171c.mo734f0(f14) * f13;
            int i15 = i14 >> 6;
            int i16 = i14 << 9;
            m43123e(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), c15177w1, z4, f13, list, fMo743q1, fMo743q0, c28655q, (i16 & 458752) | (i15 & 112) | 3078 | ((i14 << 6) & 896) | (i16 & 57344));
            m43122d(fMo734f0, interfaceC21083i, c15177w1, z4, f16, c28655q, (i15 & 7168) | 1572918 | ((i14 << 3) & 57344) | ((i14 << 15) & 458752));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(z4, f13, list, c15177w1, f14, interfaceC21083i, modifier, i13) { // from class: g1.s5

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ float f56772E;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ InterfaceC21083i f56773F;

                /* JADX INFO: renamed from: G */
                public final /* synthetic */ Modifier f56774G;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ boolean f56775w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ float f56776x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ List f56777y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ C15177w1 f56778z;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(1);
                    AbstractC15019g6.m43121c(this.f56775w, this.f56776x, this.f56777y, this.f56778z, this.f56772E, this.f56773F, this.f56774G, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m43122d(final float f13, final InterfaceC21083i interfaceC21083i, final C15177w1 c15177w1, final boolean z4, final float f14, Composer composer, final int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(428907178);
        int i15 = i13 & 6;
        C1100b c1100b = C1100b.f4583a;
        if (i15 == 0) {
            i14 = (c28655q.m87153g(c1100b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i16 = i13 & 48;
        C2314t c2314t = C2314t.f9131w;
        if (i16 == 0) {
            i14 |= c28655q.m87153g(c2314t) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(interfaceC21083i) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(c15177w1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87155h(z4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87147d(f14) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            Modifier modifierMo3400a = c1100b.mo3400a(AbstractC1099a.m3398t(c2314t, f13, 0.0f, 0.0f, 0.0f, 14), C2299e.f9117z);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3400a);
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
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C39967p();
                c28655q.m87172p0(objM87133R);
            }
            C39967p c39967p = (C39967p) objM87133R;
            boolean z13 = (i14 & 7168) == 2048;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C15097o1(interfaceC21083i, c39967p, null, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC21083i);
            float f15 = !c39967p.isEmpty() ? f56202d : f56201c;
            Modifier modifierM3367b = AbstractC1094c.m3367b(AbstractC1095d.m3369a(AbstractC1102d.m3421r(c2314t, f14, f14), interfaceC21083i, AbstractC15210z4.m43228a(0L, 4, false, f56200b)), interfaceC21083i);
            if (!z4) {
                f15 = 0;
            }
            float f16 = f15;
            C33252i c33252i = AbstractC33253j.f138651a;
            Modifier modifierM36262a0 = AbstractC12889b.m36262a0(modifierM3367b, f16, c33252i, false, 0L, 0L, 24);
            c15177w1.getClass();
            c28655q.m87150e0(-1733795637);
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(new C17919x(z4 ? c15177w1.f56957a : c15177w1.f56958b), c28655q);
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1092a.m3358c(modifierM36262a0, ((C17919x) interfaceC28601c1M87238F.getValue()).f69639a, c33252i));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.t5
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15019g6.m43122d(f13, interfaceC21083i, c15177w1, z4, f14, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m43123e(final Modifier modifier, final C15177w1 c15177w1, final boolean z4, final float f13, final List list, final float f14, final float f15, Composer composer, final int i13) {
        int i14;
        final float f16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1833126050);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c15177w1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87147d(0.0f) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87147d(f13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(list) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            f16 = f14;
            i14 |= c28655q.m87147d(f16) ? 1048576 : 524288;
        } else {
            f16 = f14;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87147d(f15) ? 8388608 : 4194304;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (4793491 & i15) != 4793490)) {
            final InterfaceC28601c1 interfaceC28601c1M43210b = c15177w1.m43210b(z4, false, c28655q);
            final InterfaceC28601c1 interfaceC28601c1M43210b2 = c15177w1.m43210b(z4, true, c28655q);
            final InterfaceC28601c1 interfaceC28601c1M43209a = c15177w1.m43209a(z4, false, c28655q);
            final InterfaceC28601c1 interfaceC28601c1M43209a2 = c15177w1.m43209a(z4, true, c28655q);
            boolean zM87153g = ((i15 & 3670016) == 1048576) | c28655q.m87153g(interfaceC28601c1M43210b) | ((29360128 & i15) == 8388608) | ((57344 & i15) == 16384) | ((i15 & 7168) == 2048) | c28655q.m87153g(interfaceC28601c1M43210b2) | c28655q.m87157i(list) | c28655q.m87153g(interfaceC28601c1M43209a) | c28655q.m87153g(interfaceC28601c1M43209a2);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                Function1 function1 = new Function1() { // from class: g1.u5
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j7;
                        long j13;
                        InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                        boolean z13 = interfaceC22131e.getLayoutDirection() == EnumC39181m.f168424x;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() & 4294967295L));
                        float f17 = f16;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)) - f17;
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                        if (z13) {
                            j13 = jFloatToRawIntBits;
                            j7 = jFloatToRawIntBits2;
                        } else {
                            j7 = jFloatToRawIntBits;
                            j13 = j7;
                        }
                        if (!z13) {
                            j13 = jFloatToRawIntBits2;
                        }
                        long j14 = ((C17919x) interfaceC28601c1M43210b.getValue()).f69639a;
                        float f18 = f15;
                        interfaceC22131e.mo732d0(j14, j7, j13, (496 & 8) != 0 ? 0.0f : f18, (496 & 16) != 0 ? 0 : 1, (496 & 32) != 0 ? null : null);
                        int i16 = (int) (j7 >> 32);
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i16);
                        int i17 = (int) (j13 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i17) - Float.intBitsToFloat(i16);
                        float f19 = f13;
                        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits((fIntBitsToFloat4 * f19) + fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() & 4294967295L)))) & 4294967295L);
                        float fIntBitsToFloat5 = ((Float.intBitsToFloat(i17) - Float.intBitsToFloat(i16)) * 0.0f) + Float.intBitsToFloat(i16);
                        long j15 = j7;
                        long j16 = j13;
                        interfaceC22131e.mo732d0(((C17919x) interfaceC28601c1M43210b2.getValue()).f69639a, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32), jFloatToRawIntBits3, (496 & 8) != 0 ? 0.0f : f18, (496 & 16) != 0 ? 0 : 1, (496 & 32) != 0 ? null : null);
                        List list2 = list;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list2) {
                            float fFloatValue = ((Number) obj2).floatValue();
                            Boolean boolValueOf = Boolean.valueOf(fFloatValue > f19 || fFloatValue < 0.0f);
                            Object arrayList = linkedHashMap.get(boolValueOf);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(boolValueOf, arrayList);
                            }
                            ((List) arrayList).add(obj2);
                        }
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list3 = (List) entry.getValue();
                            ArrayList arrayList2 = new ArrayList(list3.size());
                            int size = list3.size();
                            int i18 = 0;
                            while (i18 < size) {
                                arrayList2.add(new C16617b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (AbstractC15751g.m44428H(j15, j16, ((Number) list3.get(i18)).floatValue()) >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() & 4294967295L)))) & 4294967295L)));
                                i18++;
                                it = it;
                                list3 = list3;
                            }
                            Iterator it3 = it;
                            interfaceC22131e.mo748y0(arrayList2, ((C17919x) (zBooleanValue ? interfaceC28601c1M43209a : interfaceC28601c1M43209a2).getValue()).f69639a, f18);
                            it = it3;
                        }
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC21478l0.m60421a(modifier, (Function1) objM87133R, c28655q, i15 & 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.v5
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15019g6.m43123e(modifier, c15177w1, z4, f13, list, f14, f15, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }
}
