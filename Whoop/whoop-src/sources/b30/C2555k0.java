package b30;

import c93.InterfaceC4351m;
import h20.C16621a;
import h20.C16689l1;
import h20.EnumC16677j1;
import java.util.Collection;
import java.util.List;
import l40.C23328a;
import l83.C23454a0;
import m83.AbstractC25265s;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import wb3.AbstractC37056f;
import x30.C37917p0;
import y00.C38783b;
import y00.C38793c;
import y00.C38977v3;
import y00.EnumC38853i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: b30.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2555k0 extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9924w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f9925x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f9926y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f9927z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2555k0(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f9924w = 1;
        this.f9927z = (AbstractC22680m) interfaceC4351m;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [c93.m, kotlin.jvm.internal.m] */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f9924w) {
            case 0:
                C2555k0 c2555k0 = new C2555k0((C2571m0) this.f9927z, (InterfaceC30057d) obj3, 0);
                c2555k0.f9925x = (C2616s) obj;
                c2555k0.f9926y = (C2554k) obj2;
                return c2555k0.invokeSuspend(C23454a0.f92919a);
            case 1:
                C2555k0 c2555k1 = new C2555k0((AbstractC22680m) this.f9927z, (InterfaceC30057d) obj3);
                c2555k1.f9925x = obj;
                c2555k1.f9926y = obj2;
                return c2555k1.invokeSuspend(C23454a0.f92919a);
            default:
                C2555k0 c2555k2 = new C2555k0((C37917p0) this.f9927z, (InterfaceC30057d) obj3, 2);
                c2555k2.f9925x = (String) obj;
                c2555k2.f9926y = (List) obj2;
                return c2555k2.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0159  */
    /* JADX WARN: Code duplicated, block: B:103:0x015f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0168  */
    /* JADX WARN: Code duplicated, block: B:110:0x0171  */
    /* JADX WARN: Code duplicated, block: B:114:0x017a  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:163:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:171:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:173:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:175:0x0203  */
    /* JADX WARN: Code duplicated, block: B:176:0x0206  */
    /* JADX WARN: Code duplicated, block: B:178:0x0209  */
    /* JADX WARN: Code duplicated, block: B:180:0x020d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0210  */
    /* JADX WARN: Code duplicated, block: B:183:0x0213  */
    /* JADX WARN: Code duplicated, block: B:185:0x0217  */
    /* JADX WARN: Code duplicated, block: B:187:0x021d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0221  */
    /* JADX WARN: Code duplicated, block: B:190:0x0224  */
    /* JADX WARN: Code duplicated, block: B:192:0x0227  */
    /* JADX WARN: Code duplicated, block: B:194:0x022b  */
    /* JADX WARN: Code duplicated, block: B:195:0x022e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0238  */
    /* JADX WARN: Code duplicated, block: B:203:0x023b  */
    /* JADX WARN: Code duplicated, block: B:204:0x023d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0240  */
    /* JADX WARN: Code duplicated, block: B:207:0x0242  */
    /* JADX WARN: Code duplicated, block: B:24:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x010c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    /* JADX WARN: Code duplicated, block: B:77:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0127  */
    /* JADX WARN: Code duplicated, block: B:84:0x0130  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:91:0x0142  */
    /* JADX WARN: Code duplicated, block: B:95:0x014b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0155  */
    /* JADX WARN: Type inference failed for: r2v7, types: [c93.m, kotlin.jvm.internal.m] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C38977v3 c38977v3;
        C2578n c2578n;
        boolean zM7468a;
        boolean zM7468a2;
        boolean zM7468a3;
        boolean z4;
        int iOrdinal;
        String str;
        String str2;
        C38793c c38793c;
        C38793c c38793c2;
        boolean z13;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C38793c c38793c3;
        C38793c c38793c4;
        C38793c c38793c5;
        C38793c c38793c6;
        C38793c c38793c7;
        C38793c c38793c8;
        String str9;
        String str10;
        String str11;
        boolean z14;
        boolean z15;
        boolean z16;
        C2578n c2578n2;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        int iOrdinal2;
        C23328a c23328a;
        boolean z25;
        C23328a c23328a2;
        boolean z26;
        boolean z27;
        boolean z28;
        C23328a c23328a3;
        boolean z29;
        C23328a c23328a4;
        boolean z34;
        C23328a c23328a5;
        boolean z35;
        C23328a c23328a6;
        boolean z36;
        C23328a c23328a7;
        boolean z37;
        C23328a c23328a8;
        C23328a c23328a9;
        C23328a c23328a10;
        C38793c c38793c9;
        C2578n c2578n3;
        C23328a c23328a11;
        C2578n c2578n4;
        C23328a c23328a12;
        C2578n c2578n5;
        C23328a c23328a13;
        C2578n c2578n6;
        EnumC38853i enumC38853i;
        int i13 = this.f9924w;
        Object obj2 = this.f9927z;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C2616s c2616s = (C2616s) this.f9925x;
                C2554k c2554k = (C2554k) this.f9926y;
                C2571m0 c2571m0 = (C2571m0) obj2;
                C16689l1 c16689l1 = c2571m0.f9991b;
                EnumC16677j1 enumC16677j1 = c16689l1.f64192z;
                C2540i1 c2540i1 = c2571m0.f9990a;
                C2658y c2658y = c2571m0.f9992c;
                boolean z38 = true;
                if (c2658y == null || c2616s == null) {
                    if (c2554k != null) {
                        c38977v3 = c2540i1.f9863g;
                        c2578n = c2554k.f9923a;
                        if (c16689l1.m47251h()) {
                            if (c38977v3 != null) {
                                str11 = c38977v3.f167775y;
                            } else {
                                str11 = null;
                            }
                            zM7468a = C2554k.m7468a(str11, c2578n.f10019a);
                        } else {
                            zM7468a = false;
                        }
                        if (c16689l1.m47250f()) {
                            if (c38977v3 != null) {
                                str10 = c38977v3.f167774x;
                            } else {
                                str10 = null;
                            }
                            zM7468a2 = C2554k.m7468a(str10, c2578n.f10020b);
                        } else {
                            zM7468a2 = false;
                        }
                        if (c16689l1.m47252i()) {
                            if (c38977v3 != null) {
                                str9 = c38977v3.f167776z;
                            } else {
                                str9 = null;
                            }
                            zM7468a3 = C2554k.m7468a(str9, c2578n.f10021c);
                        } else {
                            zM7468a3 = false;
                        }
                        if (!zM7468a || zM7468a2 || zM7468a3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        iOrdinal = enumC16677j1.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (c38977v3 != null || (c38793c8 = c38977v3.f167773w) == null) {
                                    str3 = null;
                                } else {
                                    str3 = c38793c8.f166958E;
                                }
                                if (!C2554k.m7468a(str3, c2578n.f10025g)) {
                                    if (c38977v3 != null || (c38793c7 = c38977v3.f167773w) == null) {
                                        str4 = null;
                                    } else {
                                        str4 = c38793c7.f166961x;
                                    }
                                    if (!C2554k.m7468a(str4, c2578n.f10027i)) {
                                        if (c38977v3 != null || (c38793c6 = c38977v3.f167773w) == null) {
                                            str5 = null;
                                        } else {
                                            str5 = c38793c6.f166962y;
                                        }
                                        if (!C2554k.m7468a(str5, c2578n.f10022d)) {
                                            if (c38977v3 != null || (c38793c5 = c38977v3.f167773w) == null) {
                                                str6 = null;
                                            } else {
                                                str6 = c38793c5.f166963z;
                                            }
                                            if (!C2554k.m7468a(str6, c2578n.f10023e)) {
                                                if (c38977v3 != null || (c38793c4 = c38977v3.f167773w) == null) {
                                                    str7 = null;
                                                } else {
                                                    str7 = c38793c4.f166960w;
                                                }
                                                if (!C2554k.m7468a(str7, c2578n.f10024f)) {
                                                    if (c38977v3 != null || (c38793c3 = c38977v3.f167773w) == null) {
                                                        str8 = null;
                                                    } else {
                                                        str8 = c38793c3.f166959F;
                                                    }
                                                    if (C2554k.m7468a(str8, c2578n.f10026h)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                z13 = true;
                            }
                            z13 = false;
                        } else {
                            if (c38977v3 != null || (c38793c2 = c38977v3.f167773w) == null) {
                                str = null;
                            } else {
                                str = c38793c2.f166958E;
                            }
                            if (!C2554k.m7468a(str, c2578n.f10025g)) {
                                if (c38977v3 != null || (c38793c = c38977v3.f167773w) == null) {
                                    str2 = null;
                                } else {
                                    str2 = c38793c.f166961x;
                                }
                                if (C2554k.m7468a(str2, c2578n.f10027i)) {
                                    z13 = false;
                                }
                            }
                            z13 = true;
                        }
                        z14 = !z4 || z13;
                    }
                } else {
                    if (c2571m0.m7500a(c2658y).equals(c2616s.f10192a)) {
                        Integer num = c2540i1.f9858b;
                        C2556k1 c2556k1 = c2616s.f10193b;
                        if (AbstractC22676k.m65745e(num, c2556k1.m7470b()) && AbstractC22676k.m65745e(c2540i1.f9859c, c2556k1.m7471c())) {
                            if (c2554k != null) {
                                c38977v3 = c2540i1.f9863g;
                                c2578n = c2554k.f9923a;
                                if (c16689l1.m47251h()) {
                                    if (c38977v3 != null) {
                                        str11 = c38977v3.f167775y;
                                    } else {
                                        str11 = null;
                                    }
                                    zM7468a = C2554k.m7468a(str11, c2578n.f10019a);
                                } else {
                                    zM7468a = false;
                                }
                                if (c16689l1.m47250f()) {
                                    if (c38977v3 != null) {
                                        str10 = c38977v3.f167774x;
                                    } else {
                                        str10 = null;
                                    }
                                    zM7468a2 = C2554k.m7468a(str10, c2578n.f10020b);
                                } else {
                                    zM7468a2 = false;
                                }
                                if (c16689l1.m47252i()) {
                                    if (c38977v3 != null) {
                                        str9 = c38977v3.f167776z;
                                    } else {
                                        str9 = null;
                                    }
                                    zM7468a3 = C2554k.m7468a(str9, c2578n.f10021c);
                                } else {
                                    zM7468a3 = false;
                                }
                                if (zM7468a) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                iOrdinal = enumC16677j1.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal != 1) {
                                        if (iOrdinal == 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (c38977v3 != null) {
                                            str3 = null;
                                        } else {
                                            str3 = null;
                                        }
                                        if (!C2554k.m7468a(str3, c2578n.f10025g)) {
                                            if (c38977v3 != null) {
                                                str4 = null;
                                            } else {
                                                str4 = null;
                                            }
                                            if (!C2554k.m7468a(str4, c2578n.f10027i)) {
                                                if (c38977v3 != null) {
                                                    str5 = null;
                                                } else {
                                                    str5 = null;
                                                }
                                                if (!C2554k.m7468a(str5, c2578n.f10022d)) {
                                                    if (c38977v3 != null) {
                                                        str6 = null;
                                                    } else {
                                                        str6 = null;
                                                    }
                                                    if (!C2554k.m7468a(str6, c2578n.f10023e)) {
                                                        if (c38977v3 != null) {
                                                            str7 = null;
                                                        } else {
                                                            str7 = null;
                                                        }
                                                        if (!C2554k.m7468a(str7, c2578n.f10024f)) {
                                                            if (c38977v3 != null) {
                                                                str8 = null;
                                                            } else {
                                                                str8 = null;
                                                            }
                                                            if (C2554k.m7468a(str8, c2578n.f10026h)) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z13 = true;
                                    }
                                    z13 = false;
                                } else {
                                    if (c38977v3 != null) {
                                        str = null;
                                    } else {
                                        str = null;
                                    }
                                    if (!C2554k.m7468a(str, c2578n.f10025g)) {
                                        if (c38977v3 != null) {
                                            str2 = null;
                                        } else {
                                            str2 = null;
                                        }
                                        if (C2554k.m7468a(str2, c2578n.f10027i)) {
                                            z13 = false;
                                        }
                                    }
                                    z13 = true;
                                }
                                if (z4) {
                                }
                            }
                        }
                    }
                }
                if (c2616s != null) {
                    C2556k1 c2556k2 = c2616s.f10193b;
                    if (c2556k2.f9929b && (c2556k2.m7470b() == null || c2556k2.m7471c() == null)) {
                        z16 = false;
                    } else {
                        if (c2554k != null) {
                            c2578n2 = c2554k.f9923a;
                            if (c16689l1.m47251h() || (c23328a10 = c2578n2.f10019a) == null) {
                                z17 = true;
                            } else {
                                z17 = c23328a10.f92492b;
                            }
                            if (c16689l1.m47250f() || (c23328a9 = c2578n2.f10020b) == null) {
                                z18 = true;
                            } else {
                                z18 = c23328a9.f92492b;
                            }
                            if (c16689l1.m47252i() || (c23328a8 = c2578n2.f10021c) == null) {
                                z19 = true;
                            } else {
                                z19 = c23328a8.f92492b;
                            }
                            if (!z17 && z18 && z19) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            iOrdinal2 = enumC16677j1.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    if (iOrdinal2 == 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    c23328a3 = c2578n2.f10027i;
                                    if (c23328a3 != null) {
                                        z29 = c23328a3.f92492b;
                                    } else {
                                        z29 = true;
                                    }
                                    if (z29) {
                                        c23328a4 = c2578n2.f10026h;
                                        if (c23328a4 != null) {
                                            z34 = c23328a4.f92492b;
                                        } else {
                                            z34 = true;
                                        }
                                        if (z34) {
                                            c23328a5 = c2578n2.f10025g;
                                            if (c23328a5 != null) {
                                                z35 = c23328a5.f92492b;
                                            } else {
                                                z35 = true;
                                            }
                                            if (z35) {
                                                c23328a6 = c2578n2.f10022d;
                                                if (c23328a6 != null) {
                                                    z36 = c23328a6.f92492b;
                                                } else {
                                                    z36 = true;
                                                }
                                                if (z36) {
                                                    c23328a7 = c2578n2.f10024f;
                                                    if (c23328a7 != null) {
                                                        z37 = c23328a7.f92492b;
                                                    } else {
                                                        z37 = true;
                                                    }
                                                    if (z37) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                c23328a = c2578n2.f10027i;
                                if (c23328a != null) {
                                    z25 = c23328a.f92492b;
                                } else {
                                    z25 = true;
                                }
                                if (z25) {
                                    c23328a2 = c2578n2.f10025g;
                                    if (c23328a2 != null) {
                                        z26 = c23328a2.f92492b;
                                    } else {
                                        z26 = true;
                                    }
                                    z27 = z26;
                                }
                            }
                            if (z24 || !z27) {
                                z28 = false;
                            } else {
                                z28 = true;
                            }
                            if (z28) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                    }
                } else {
                    if (c2554k != null) {
                        c2578n2 = c2554k.f9923a;
                        if (c16689l1.m47251h()) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (c16689l1.m47250f()) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (c16689l1.m47252i()) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (!z17) {
                            z24 = false;
                        } else {
                            z24 = false;
                        }
                        iOrdinal2 = enumC16677j1.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c23328a3 = c2578n2.f10027i;
                                if (c23328a3 != null) {
                                    z29 = c23328a3.f92492b;
                                } else {
                                    z29 = true;
                                }
                                if (z29) {
                                    c23328a4 = c2578n2.f10026h;
                                    if (c23328a4 != null) {
                                        z34 = c23328a4.f92492b;
                                    } else {
                                        z34 = true;
                                    }
                                    if (z34) {
                                        c23328a5 = c2578n2.f10025g;
                                        if (c23328a5 != null) {
                                            z35 = c23328a5.f92492b;
                                        } else {
                                            z35 = true;
                                        }
                                        if (z35) {
                                            c23328a6 = c2578n2.f10022d;
                                            if (c23328a6 != null) {
                                                z36 = c23328a6.f92492b;
                                            } else {
                                                z36 = true;
                                            }
                                            if (z36) {
                                                c23328a7 = c2578n2.f10024f;
                                                if (c23328a7 != null) {
                                                    z37 = c23328a7.f92492b;
                                                } else {
                                                    z37 = true;
                                                }
                                                if (z37) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c23328a = c2578n2.f10027i;
                            if (c23328a != null) {
                                z25 = c23328a.f92492b;
                            } else {
                                z25 = true;
                            }
                            if (z25) {
                                c23328a2 = c2578n2.f10025g;
                                if (c23328a2 != null) {
                                    z26 = c23328a2.f92492b;
                                } else {
                                    z26 = true;
                                }
                                if (z26) {
                                }
                            }
                        }
                        if (z24) {
                            z28 = false;
                        } else {
                            z28 = false;
                        }
                        if (z28) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                if ((!z14 && c2571m0.f9993d) || !z16) {
                    return null;
                }
                EnumC38853i enumC38853i2 = c2616s != null ? c2616s.f10192a.f10126a : null;
                Integer numM7470b = c2616s != null ? c2616s.f10193b.m7470b() : null;
                Integer numM7471c = c2616s != null ? c2616s.f10193b.m7471c() : null;
                if (c2554k == null || (c2578n6 = c2554k.f9923a) == null) {
                    c38793c9 = null;
                } else {
                    C23328a c23328a14 = c2578n6.f10024f;
                    String str12 = c23328a14 != null ? c23328a14.f92491a : null;
                    C23328a c23328a15 = c2578n6.f10027i;
                    String str13 = c23328a15 != null ? c23328a15.f92491a : null;
                    C23328a c23328a16 = c2578n6.f10022d;
                    String str14 = c23328a16 != null ? c23328a16.f92491a : null;
                    C23328a c23328a17 = c2578n6.f10023e;
                    String str15 = c23328a17 != null ? c23328a17.f92491a : null;
                    C23328a c23328a18 = c2578n6.f10025g;
                    String str16 = c23328a18 != null ? c23328a18.f92491a : null;
                    C23328a c23328a19 = c2578n6.f10026h;
                    c38793c9 = new C38793c(str12, str13, str14, str15, str16, c23328a19 != null ? c23328a19.f92491a : null);
                }
                String str17 = (c2554k == null || (c2578n5 = c2554k.f9923a) == null || (c23328a13 = c2578n5.f10020b) == null) ? null : c23328a13.f92491a;
                String str18 = (c2554k == null || (c2578n4 = c2554k.f9923a) == null || (c23328a12 = c2578n4.f10021c) == null) ? null : c23328a12.f92491a;
                String str19 = (c2554k == null || (c2578n3 = c2554k.f9923a) == null || (c23328a11 = c2578n3.f10019a) == null) ? null : c23328a11.f92491a;
                List<String> listM118959K = AbstractC37056f.m118959K(str17, str18, str19);
                if (!(listM118959K instanceof Collection) || !listM118959K.isEmpty()) {
                    for (String str20 : listM118959K) {
                        if (str20 != null && !AbstractC39414r.m125890i0(str20)) {
                            z38 = false;
                        }
                    }
                }
                return new C16621a(numM7470b, numM7471c, enumC38853i2, (c38793c9 == null && z38) ? null : new C38977v3(c38793c9, str17, str19, str18));
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return ((AbstractC22680m) obj2).invoke(this.f9925x, this.f9926y);
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                String str21 = (String) this.f9925x;
                C38783b c38783b = (C38783b) AbstractC25265s.m74100H0((List) this.f9926y);
                if (c38783b != null && (enumC38853i = c38783b.f166934y.f166885x) != null) {
                    return enumC38853i;
                }
                EnumC38853i.f167238M.getClass();
                EnumC38853i enumC38853i3 = (EnumC38853i) AbstractC25265s.m74100H0(C33623c0.m106240p(str21));
                return enumC38853i3 == null ? EnumC38853i.Unknown : enumC38853i3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2555k0(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(3, interfaceC30057d);
        this.f9924w = i13;
        this.f9927z = obj;
    }
}
