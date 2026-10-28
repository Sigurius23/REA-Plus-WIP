package p668z1;

import c93.InterfaceC4339a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p002a0.C0039m0;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p005a3.InterfaceC0184b2;
import p098dt.AbstractC12350b;
import p390p1.AbstractC28683x;
import p390p1.C28608e0;
import p390p1.C28612f0;
import p390p1.C28651p;
import p390p1.C28676v0;
import p390p1.InterfaceC28650o2;
import p446r1.C30849c;
import p446r1.C30851e;
import p459rf.C31345p;
import p652yl.C39615a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C39972u {

    /* JADX INFO: renamed from: a */
    public final Function1 f172482a;

    /* JADX INFO: renamed from: b */
    public Object f172483b;

    /* JADX INFO: renamed from: c */
    public C0039m0 f172484c;

    /* JADX INFO: renamed from: j */
    public int f172491j;

    /* JADX INFO: renamed from: d */
    public int f172485d = -1;

    /* JADX INFO: renamed from: e */
    public final C0057v0 f172486e = AbstractC12350b.m34588i();

    /* JADX INFO: renamed from: f */
    public final C0057v0 f172487f = new C0057v0();

    /* JADX INFO: renamed from: g */
    public final C0059w0 f172488g = new C0059w0();

    /* JADX INFO: renamed from: h */
    public final C30849c f172489h = new C30849c(new C28612f0[16]);

    /* JADX INFO: renamed from: i */
    public final C28651p f172490i = new C28651p(this, 1);

    /* JADX INFO: renamed from: k */
    public final C0057v0 f172492k = AbstractC12350b.m34588i();

    /* JADX INFO: renamed from: l */
    public final HashMap f172493l = new HashMap();

    public C39972u(Function1 function1) {
        this.f172482a = function1;
    }

    /* JADX INFO: renamed from: a */
    public final void m128196a(Object obj, C31345p c31345p, InterfaceC4339a interfaceC4339a) {
        boolean z4;
        int i13;
        int i14;
        Object obj2 = this.f172483b;
        C0039m0 c0039m0 = this.f172484c;
        int i15 = this.f172485d;
        this.f172483b = obj;
        this.f172484c = (C0039m0) this.f172487f.m129g(obj);
        if (this.f172485d == -1) {
            this.f172485d = Long.hashCode(AbstractC39963l.m128171k().mo128147g());
        }
        C28651p c28651p = this.f172490i;
        C30849c c30849cM87263q = AbstractC28683x.m87263q();
        boolean z13 = true;
        try {
            c30849cM87263q.m94885b(c28651p);
            C39615a.m126590f(interfaceC4339a, c31345p);
            c30849cM87263q.m94894l(c30849cM87263q.f127229y - 1);
            Object obj3 = this.f172483b;
            AbstractC22676k.m65747g(obj3);
            int i16 = this.f172485d;
            C0039m0 c0039m1 = this.f172484c;
            if (c0039m1 != null) {
                long[] jArr = c0039m1.f114a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j7 = jArr[i17];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8;
                            int i19 = 8 - ((~(i17 - length)) >>> 31);
                            z4 = z13;
                            int i24 = 0;
                            while (i24 < i19) {
                                if ((j7 & 255) < 128) {
                                    int i25 = (i17 << 3) + i24;
                                    i14 = i18;
                                    Object obj4 = c0039m1.f115b[i25];
                                    i13 = i24;
                                    boolean z14 = c0039m1.f116c[i25] != i16 ? z4 : false;
                                    if (z14) {
                                        m128199d(obj3, obj4);
                                    }
                                    if (z14) {
                                        c0039m1.m94g(i25);
                                    }
                                } else {
                                    i13 = i24;
                                    i14 = i18;
                                }
                                j7 >>= i14;
                                i24 = i13 + 1;
                                i18 = i14;
                            }
                            if (i19 != i18) {
                                break;
                            }
                        } else {
                            z4 = z13;
                        }
                        if (i17 == length) {
                            break;
                        }
                        i17++;
                        z13 = z4;
                    }
                }
            }
            this.f172483b = obj2;
            this.f172484c = c0039m0;
            this.f172485d = i15;
        } catch (Throwable th3) {
            c30849cM87263q.m94894l(c30849cM87263q.f127229y - 1);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x027e A[DONT_INVERT, PHI: r13
      0x027e: PHI (r13v32 boolean) = (r13v31 boolean), (r13v33 boolean) binds: [B:109:0x0256, B:117:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0280 A[LOOP:6: B:108:0x024c->B:119:0x0280, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x04a7 A[DONT_INVERT, PHI: r13
      0x04a7: PHI (r13v11 boolean) = (r13v10 boolean), (r13v12 boolean) binds: [B:210:0x047f, B:218:0x04a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:220:0x04a9 A[LOOP:20: B:209:0x0475->B:220:0x04a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:241:0x0506 A[DONT_INVERT, PHI: r13
      0x0506: PHI (r13v5 boolean) = (r13v4 boolean), (r13v6 boolean) binds: [B:232:0x04de, B:240:0x0504] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:242:0x0508 A[LOOP:18: B:231:0x04d4->B:242:0x0508, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:294:0x015d A[EDGE_INSN: B:294:0x015d->B:62:0x015d BREAK  A[LOOP:4: B:46:0x00fc->B:58:0x0138], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0287 A[EDGE_INSN: B:299:0x0287->B:121:0x0287 BREAK  A[LOOP:6: B:108:0x024c->B:119:0x0280], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0227 A[EDGE_INSN: B:304:0x0227->B:99:0x0227 BREAK  A[LOOP:8: B:84:0x01dd->B:95:0x0211], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x050f A[EDGE_INSN: B:321:0x050f->B:244:0x050f BREAK  A[LOOP:18: B:231:0x04d4->B:242:0x0508], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x04bb A[EDGE_INSN: B:332:0x04bb->B:224:0x04bb BREAK  A[LOOP:20: B:209:0x0475->B:220:0x04a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0136 A[DONT_INVERT, PHI: r33
      0x0136: PHI (r33v17 boolean) = (r33v16 boolean), (r33v18 boolean) binds: [B:47:0x010a, B:56:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0138 A[LOOP:4: B:46:0x00fc->B:58:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:94:0x020f A[DONT_INVERT, PHI: r13
      0x020f: PHI (r13v42 boolean) = (r13v41 boolean), (r13v43 boolean) binds: [B:85:0x01e7, B:93:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0211 A[LOOP:8: B:84:0x01dd->B:95:0x0211, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x021d  */
    /* JADX INFO: renamed from: b */
    public final boolean m128197b(Set set) {
        char c3;
        long j7;
        boolean z4;
        Iterator it;
        String str;
        C0057v0 c0057v0;
        Object objM129g;
        Object[] objArr;
        Iterator it3;
        int i13;
        String str2;
        C0057v0 c0057v1;
        long j13;
        long[] jArr;
        int i14;
        Object[] objArr2;
        int i15;
        C0039m0 c0039m0;
        long[] jArr2;
        C28676v0 c28676v0;
        Object[] objArr3;
        long[] jArr3;
        C28676v0 c28676v1;
        Object[] objArr4;
        int i16;
        int i17;
        int i18;
        long j14;
        Object obj;
        Object obj2;
        Object obj3;
        int i19;
        int i24;
        long j15;
        int i25;
        C28676v0 c28676v2 = C28676v0.f115974F;
        boolean z13 = set instanceof C30851e;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        C30849c c30849c = this.f172489h;
        C0057v0 c0057v2 = this.f172492k;
        HashMap map = this.f172493l;
        C0057v0 c0057v3 = this.f172486e;
        C0059w0 c0059w0 = this.f172488g;
        if (z13) {
            C0059w0 c0059w1 = ((C30851e) set).f127230w;
            Object[] objArr5 = c0059w1.f178b;
            long[] jArr4 = c0059w1.f177a;
            c3 = 7;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i26 = 0;
                z4 = false;
                j7 = -9187201950435737472L;
                while (true) {
                    int i27 = 8;
                    long j16 = jArr4[i26];
                    int i28 = i26;
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i29 = 8 - ((~(i28 - length)) >>> 31);
                        int i34 = 0;
                        while (i34 < i29) {
                            if ((j16 & 255) < 128) {
                                jArr3 = jArr4;
                                Object obj4 = objArr5[(i28 << 3) + i34];
                                c28676v1 = c28676v2;
                                if (obj4 instanceof AbstractC39948a0) {
                                    objArr4 = objArr5;
                                    if (!((AbstractC39948a0) obj4).m128128k(2)) {
                                    }
                                    i34 = i18 + 1;
                                    i27 = 8;
                                    c28676v2 = c28676v1;
                                    objArr5 = objArr4;
                                    length = i16;
                                    i29 = i17;
                                    j16 = j14 >> 8;
                                    jArr4 = jArr3;
                                } else {
                                    objArr4 = objArr5;
                                }
                                if (c0057v2.m125c(obj4)) {
                                    Object objM129g2 = c0057v2.m129g(obj4);
                                    if (objM129g2 == null) {
                                        obj2 = obj4;
                                        i16 = length;
                                        i17 = i29;
                                        i18 = i34;
                                        j14 = j16;
                                    } else if (objM129g2 instanceof C0059w0) {
                                        C0059w0 c0059w2 = (C0059w0) objM129g2;
                                        Object[] objArr6 = c0059w2.f178b;
                                        long[] jArr5 = c0059w2.f177a;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            i18 = i34;
                                            boolean z14 = z4;
                                            int i35 = 0;
                                            while (true) {
                                                long j17 = jArr5[i35];
                                                j14 = j16;
                                                if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i36 = 8 - ((~(i35 - length2)) >>> 31);
                                                    int i37 = 0;
                                                    while (i37 < i36) {
                                                        if ((j17 & 255) < 128) {
                                                            j15 = j17;
                                                            C28612f0 c28612f0 = (C28612f0) objArr6[(i35 << 3) + i37];
                                                            AbstractC22676k.m65748h(c28612f0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                            Object obj5 = map.get(c28612f0);
                                                            i25 = i37;
                                                            InterfaceC28650o2 interfaceC28650o2 = c28612f0.f115754y;
                                                            if (interfaceC28650o2 == null) {
                                                                interfaceC28650o2 = c28676v1;
                                                            }
                                                            if (interfaceC28650o2.mo87112a(c28612f0.m87013y().f115735f, obj5)) {
                                                                obj3 = obj4;
                                                                i19 = length;
                                                                i24 = i29;
                                                                c30849c.m94885b(c28612f0);
                                                            } else {
                                                                Object objM129g3 = c0057v3.m129g(c28612f0);
                                                                if (objM129g3 == null) {
                                                                    obj3 = obj4;
                                                                    i19 = length;
                                                                    i24 = i29;
                                                                } else if (objM129g3 instanceof C0059w0) {
                                                                    C0059w0 c0059w3 = (C0059w0) objM129g3;
                                                                    Object[] objArr7 = c0059w3.f178b;
                                                                    long[] jArr6 = c0059w3.f177a;
                                                                    int length3 = jArr6.length - 2;
                                                                    if (length3 >= 0) {
                                                                        i19 = length;
                                                                        i24 = i29;
                                                                        int i38 = 0;
                                                                        while (true) {
                                                                            long j18 = jArr6[i38];
                                                                            long[] jArr7 = jArr6;
                                                                            obj3 = obj4;
                                                                            if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                if (i38 != length3) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i38++;
                                                                                obj4 = obj3;
                                                                                jArr6 = jArr7;
                                                                                i27 = 8;
                                                                            } else {
                                                                                int i39 = 8 - ((~(i38 - length3)) >>> 31);
                                                                                for (int i44 = 0; i44 < i39; i44++) {
                                                                                    if ((j18 & 255) < 128) {
                                                                                        c0059w0.m136a(objArr7[(i38 << 3) + i44]);
                                                                                        z14 = true;
                                                                                    }
                                                                                    j18 >>= i27;
                                                                                }
                                                                                if (i39 != i27) {
                                                                                    break;
                                                                                }
                                                                                if (i38 != length3) {
                                                                                    break;
                                                                                }
                                                                                i38++;
                                                                                obj4 = obj3;
                                                                                jArr6 = jArr7;
                                                                                i27 = 8;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        obj3 = obj4;
                                                                        i19 = length;
                                                                        i24 = i29;
                                                                    }
                                                                } else {
                                                                    obj3 = obj4;
                                                                    i19 = length;
                                                                    i24 = i29;
                                                                    c0059w0.m136a(objM129g3);
                                                                    z14 = true;
                                                                }
                                                            }
                                                        } else {
                                                            obj3 = obj4;
                                                            i19 = length;
                                                            i24 = i29;
                                                            j15 = j17;
                                                            i25 = i37;
                                                        }
                                                        j17 = j15 >> 8;
                                                        i37 = i25 + 1;
                                                        i27 = 8;
                                                        length = i19;
                                                        i29 = i24;
                                                        obj4 = obj3;
                                                    }
                                                    obj2 = obj4;
                                                    i16 = length;
                                                    i17 = i29;
                                                    if (i36 != i27) {
                                                        break;
                                                    }
                                                } else {
                                                    obj2 = obj4;
                                                    i16 = length;
                                                    i17 = i29;
                                                }
                                                if (i35 == length2) {
                                                    break;
                                                }
                                                i35++;
                                                i27 = 8;
                                                j16 = j14;
                                                length = i16;
                                                i29 = i17;
                                                obj4 = obj2;
                                            }
                                            z4 = z14;
                                        } else {
                                            obj2 = obj4;
                                            i16 = length;
                                            i17 = i29;
                                            i18 = i34;
                                            j14 = j16;
                                        }
                                    } else {
                                        obj2 = obj4;
                                        i16 = length;
                                        i17 = i29;
                                        i18 = i34;
                                        j14 = j16;
                                        C28612f0 c28612f1 = (C28612f0) objM129g2;
                                        Object obj6 = map.get(c28612f1);
                                        InterfaceC28650o2 interfaceC28650o3 = c28612f1.f115754y;
                                        if (interfaceC28650o3 == null) {
                                            interfaceC28650o3 = c28676v1;
                                        }
                                        if (interfaceC28650o3.mo87112a(c28612f1.m87013y().f115735f, obj6)) {
                                            c30849c.m94885b(c28612f1);
                                        } else {
                                            Object objM129g4 = c0057v3.m129g(c28612f1);
                                            if (objM129g4 != null) {
                                                if (objM129g4 instanceof C0059w0) {
                                                    C0059w0 c0059w4 = (C0059w0) objM129g4;
                                                    Object[] objArr8 = c0059w4.f178b;
                                                    long[] jArr8 = c0059w4.f177a;
                                                    int length4 = jArr8.length - 2;
                                                    if (length4 >= 0) {
                                                        int i45 = 0;
                                                        while (true) {
                                                            long j19 = jArr8[i45];
                                                            if ((((~j19) << 7) & j19 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                if (i45 != length4) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i45++;
                                                            } else {
                                                                int i46 = 8 - ((~(i45 - length4)) >>> 31);
                                                                for (int i47 = 0; i47 < i46; i47++) {
                                                                    if ((j19 & 255) < 128) {
                                                                        c0059w0.m136a(objArr8[(i45 << 3) + i47]);
                                                                        z4 = true;
                                                                    }
                                                                    j19 >>= 8;
                                                                }
                                                                if (i46 != 8) {
                                                                    break;
                                                                }
                                                                if (i45 != length4) {
                                                                    break;
                                                                }
                                                                i45++;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    c0059w0.m136a(objM129g4);
                                                    z4 = true;
                                                }
                                            }
                                        }
                                    }
                                    obj = obj2;
                                } else {
                                    i16 = length;
                                    i17 = i29;
                                    i18 = i34;
                                    j14 = j16;
                                    obj = obj4;
                                }
                                Object objM129g5 = c0057v3.m129g(obj);
                                if (objM129g5 != null) {
                                    if (objM129g5 instanceof C0059w0) {
                                        C0059w0 c0059w5 = (C0059w0) objM129g5;
                                        Object[] objArr9 = c0059w5.f178b;
                                        long[] jArr9 = c0059w5.f177a;
                                        int length5 = jArr9.length - 2;
                                        if (length5 >= 0) {
                                            int i48 = 0;
                                            while (true) {
                                                long j24 = jArr9[i48];
                                                if ((((~j24) << 7) & j24 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i48 != length5) {
                                                        break;
                                                        break;
                                                    }
                                                    i48++;
                                                } else {
                                                    int i49 = 8 - ((~(i48 - length5)) >>> 31);
                                                    for (int i54 = 0; i54 < i49; i54++) {
                                                        if ((j24 & 255) < 128) {
                                                            c0059w0.m136a(objArr9[(i48 << 3) + i54]);
                                                            z4 = true;
                                                        }
                                                        j24 >>= 8;
                                                    }
                                                    if (i49 != 8) {
                                                        break;
                                                    }
                                                    if (i48 != length5) {
                                                        break;
                                                    }
                                                    i48++;
                                                }
                                            }
                                        }
                                    } else {
                                        c0059w0.m136a(objM129g5);
                                        z4 = true;
                                    }
                                }
                                i34 = i18 + 1;
                                i27 = 8;
                                c28676v2 = c28676v1;
                                objArr5 = objArr4;
                                length = i16;
                                i29 = i17;
                                j16 = j14 >> 8;
                                jArr4 = jArr3;
                            } else {
                                jArr3 = jArr4;
                                c28676v1 = c28676v2;
                                objArr4 = objArr5;
                            }
                            i16 = length;
                            i17 = i29;
                            i18 = i34;
                            j14 = j16;
                            i34 = i18 + 1;
                            i27 = 8;
                            c28676v2 = c28676v1;
                            objArr5 = objArr4;
                            length = i16;
                            i29 = i17;
                            j16 = j14 >> 8;
                            jArr4 = jArr3;
                        }
                        jArr2 = jArr4;
                        c28676v0 = c28676v2;
                        objArr3 = objArr5;
                        int i55 = length;
                        if (i29 != i27) {
                            break;
                        }
                        length = i55;
                    } else {
                        jArr2 = jArr4;
                        c28676v0 = c28676v2;
                        objArr3 = objArr5;
                    }
                    if (i28 == length) {
                        break;
                    }
                    i26 = i28 + 1;
                    c28676v2 = c28676v0;
                    jArr4 = jArr2;
                    objArr5 = objArr3;
                }
            } else {
                j7 = -9187201950435737472L;
                z4 = false;
            }
        } else {
            c3 = 7;
            j7 = -9187201950435737472L;
            Iterator it4 = set.iterator();
            z4 = false;
            while (it4.hasNext()) {
                Object next = it4.next();
                if (!(next instanceof AbstractC39948a0) || ((AbstractC39948a0) next).m128128k(2)) {
                    if (!c0057v2.m125c(next) || (objM129g = c0057v2.m129g(next)) == null) {
                        it = it4;
                        str = str3;
                        c0057v0 = c0057v2;
                    } else if (objM129g instanceof C0059w0) {
                        C0059w0 c0059w6 = (C0059w0) objM129g;
                        Object[] objArr10 = c0059w6.f178b;
                        long[] jArr10 = c0059w6.f177a;
                        int length6 = jArr10.length - 2;
                        if (length6 >= 0) {
                            int i56 = 0;
                            while (true) {
                                long j25 = jArr10[i56];
                                long[] jArr11 = jArr10;
                                Object[] objArr11 = objArr10;
                                if ((((~j25) << 7) & j25 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i57 = 8 - ((~(i56 - length6)) >>> 31);
                                    int i58 = 0;
                                    while (i58 < i57) {
                                        if ((j25 & 255) < 128) {
                                            it3 = it4;
                                            C28612f0 c28612f2 = (C28612f0) objArr11[(i56 << 3) + i58];
                                            AbstractC22676k.m65748h(c28612f2, str3);
                                            i13 = i58;
                                            Object obj7 = map.get(c28612f2);
                                            str2 = str3;
                                            InterfaceC28650o2 interfaceC28650o4 = c28612f2.f115754y;
                                            if (interfaceC28650o4 == null) {
                                                interfaceC28650o4 = c28676v2;
                                            }
                                            c0057v1 = c0057v2;
                                            if (interfaceC28650o4.mo87112a(c28612f2.m87013y().f115735f, obj7)) {
                                                j13 = j25;
                                                c30849c.m94885b(c28612f2);
                                            } else {
                                                Object objM129g6 = c0057v3.m129g(c28612f2);
                                                if (objM129g6 != null) {
                                                    if (objM129g6 instanceof C0059w0) {
                                                        C0059w0 c0059w7 = (C0059w0) objM129g6;
                                                        Object[] objArr12 = c0059w7.f178b;
                                                        long[] jArr12 = c0059w7.f177a;
                                                        int length7 = jArr12.length - 2;
                                                        if (length7 >= 0) {
                                                            boolean z15 = z4;
                                                            int i59 = 0;
                                                            while (true) {
                                                                long j26 = jArr12[i59];
                                                                j13 = j25;
                                                                if ((((~j26) << 7) & j26 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i64 = 8 - ((~(i59 - length7)) >>> 31);
                                                                    int i65 = 0;
                                                                    while (i65 < i64) {
                                                                        if ((j26 & 255) < 128) {
                                                                            c0059w0.m136a(objArr12[(i59 << 3) + i65]);
                                                                            z15 = true;
                                                                        }
                                                                        j26 >>= 8;
                                                                        i65++;
                                                                        jArr12 = jArr12;
                                                                    }
                                                                    jArr = jArr12;
                                                                    if (i64 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr = jArr12;
                                                                }
                                                                if (i59 == length7) {
                                                                    break;
                                                                }
                                                                i59++;
                                                                j25 = j13;
                                                                jArr12 = jArr;
                                                            }
                                                            z4 = z15;
                                                        }
                                                    } else {
                                                        j13 = j25;
                                                        c0059w0.m136a(objM129g6);
                                                        z4 = true;
                                                    }
                                                }
                                            }
                                            j25 = j13 >> 8;
                                            str3 = str2;
                                            c0057v2 = c0057v1;
                                            objArr11 = objArr11;
                                            i58 = i13 + 1;
                                            it4 = it3;
                                        } else {
                                            it3 = it4;
                                            i13 = i58;
                                            str2 = str3;
                                            c0057v1 = c0057v2;
                                        }
                                        j13 = j25;
                                        j25 = j13 >> 8;
                                        str3 = str2;
                                        c0057v2 = c0057v1;
                                        objArr11 = objArr11;
                                        i58 = i13 + 1;
                                        it4 = it3;
                                    }
                                    it = it4;
                                    str = str3;
                                    c0057v0 = c0057v2;
                                    objArr = objArr11;
                                    if (i57 != 8) {
                                        break;
                                    }
                                } else {
                                    it = it4;
                                    str = str3;
                                    c0057v0 = c0057v2;
                                    objArr = objArr11;
                                }
                                if (i56 == length6) {
                                    break;
                                }
                                i56++;
                                it4 = it;
                                jArr10 = jArr11;
                                str3 = str;
                                c0057v2 = c0057v0;
                                objArr10 = objArr;
                            }
                        } else {
                            it = it4;
                            str = str3;
                            c0057v0 = c0057v2;
                        }
                    } else {
                        it = it4;
                        str = str3;
                        c0057v0 = c0057v2;
                        C28612f0 c28612f3 = (C28612f0) objM129g;
                        Object obj8 = map.get(c28612f3);
                        InterfaceC28650o2 interfaceC28650o5 = c28612f3.f115754y;
                        if (interfaceC28650o5 == null) {
                            interfaceC28650o5 = c28676v2;
                        }
                        if (interfaceC28650o5.mo87112a(c28612f3.m87013y().f115735f, obj8)) {
                            c30849c.m94885b(c28612f3);
                        } else {
                            Object objM129g7 = c0057v3.m129g(c28612f3);
                            if (objM129g7 != null) {
                                if (objM129g7 instanceof C0059w0) {
                                    C0059w0 c0059w8 = (C0059w0) objM129g7;
                                    Object[] objArr13 = c0059w8.f178b;
                                    long[] jArr13 = c0059w8.f177a;
                                    int length8 = jArr13.length - 2;
                                    if (length8 >= 0) {
                                        int i66 = 0;
                                        while (true) {
                                            long j27 = jArr13[i66];
                                            if ((((~j27) << 7) & j27 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i66 != length8) {
                                                    break;
                                                    break;
                                                }
                                                i66++;
                                            } else {
                                                int i67 = 8 - ((~(i66 - length8)) >>> 31);
                                                for (int i68 = 0; i68 < i67; i68++) {
                                                    if ((j27 & 255) < 128) {
                                                        c0059w0.m136a(objArr13[(i66 << 3) + i68]);
                                                        z4 = true;
                                                    }
                                                    j27 >>= 8;
                                                }
                                                if (i67 != 8) {
                                                    break;
                                                }
                                                if (i66 != length8) {
                                                    break;
                                                }
                                                i66++;
                                            }
                                        }
                                    }
                                } else {
                                    c0059w0.m136a(objM129g7);
                                    z4 = true;
                                }
                            }
                        }
                    }
                    Object objM129g8 = c0057v3.m129g(next);
                    if (objM129g8 != null) {
                        if (objM129g8 instanceof C0059w0) {
                            C0059w0 c0059w9 = (C0059w0) objM129g8;
                            Object[] objArr14 = c0059w9.f178b;
                            long[] jArr14 = c0059w9.f177a;
                            int length9 = jArr14.length - 2;
                            if (length9 >= 0) {
                                int i69 = 0;
                                while (true) {
                                    long j28 = jArr14[i69];
                                    if ((((~j28) << 7) & j28 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i69 != length9) {
                                            break;
                                            break;
                                        }
                                        i69++;
                                    } else {
                                        int i74 = 8 - ((~(i69 - length9)) >>> 31);
                                        for (int i75 = 0; i75 < i74; i75++) {
                                            if ((j28 & 255) < 128) {
                                                c0059w0.m136a(objArr14[(i69 << 3) + i75]);
                                                z4 = true;
                                            }
                                            j28 >>= 8;
                                        }
                                        if (i74 != 8) {
                                            break;
                                        }
                                        if (i69 != length9) {
                                            break;
                                        }
                                        i69++;
                                    }
                                }
                            }
                        } else {
                            c0059w0.m136a(objM129g8);
                            z4 = true;
                        }
                    }
                } else {
                    it = it4;
                    str = str3;
                    c0057v0 = c0057v2;
                }
                it4 = it;
                str3 = str;
                c0057v2 = c0057v0;
            }
        }
        int i76 = c30849c.f127229y;
        if (i76 == 0) {
            return z4;
        }
        Object[] objArr15 = c30849c.f127227w;
        int i77 = 0;
        while (i77 < i76) {
            C28612f0 c28612f4 = (C28612f0) objArr15[i77];
            int iHashCode = Long.hashCode(AbstractC39963l.m128171k().mo128147g());
            Object objM129g9 = c0057v3.m129g(c28612f4);
            if (objM129g9 != null) {
                boolean z16 = objM129g9 instanceof C0059w0;
                C0057v0 c0057v4 = this.f172487f;
                if (z16) {
                    C0059w0 c0059w10 = (C0059w0) objM129g9;
                    Object[] objArr16 = c0059w10.f178b;
                    long[] jArr15 = c0059w10.f177a;
                    int length10 = jArr15.length - 2;
                    if (length10 >= 0) {
                        int i78 = 0;
                        while (true) {
                            long j29 = jArr15[i78];
                            i14 = i76;
                            objArr2 = objArr15;
                            if ((((~j29) << c3) & j29 & j7) != j7) {
                                int i79 = 8 - ((~(i78 - length10)) >>> 31);
                                int i83 = 0;
                                while (i83 < i79) {
                                    if ((j29 & 255) < 128) {
                                        Object obj9 = objArr16[(i78 << 3) + i83];
                                        C0039m0 c0039m1 = (C0039m0) c0057v4.m129g(obj9);
                                        if (c0039m1 == null) {
                                            c0039m0 = new C0039m0();
                                            c0057v4.m135m(obj9, c0039m0);
                                        } else {
                                            c0039m0 = c0039m1;
                                        }
                                        m128198c(c28612f4, iHashCode, obj9, c0039m0);
                                    }
                                    j29 >>= 8;
                                    i83++;
                                    i77 = i77;
                                }
                                i15 = i77;
                                if (i79 != 8) {
                                    break;
                                }
                            } else {
                                i15 = i77;
                            }
                            if (i78 == length10) {
                                break;
                            }
                            i78++;
                            i76 = i14;
                            objArr15 = objArr2;
                            i77 = i15;
                        }
                    } else {
                        i14 = i76;
                        objArr2 = objArr15;
                        i15 = i77;
                    }
                } else {
                    i14 = i76;
                    objArr2 = objArr15;
                    i15 = i77;
                    C0039m0 c0039m2 = (C0039m0) c0057v4.m129g(objM129g9);
                    if (c0039m2 == null) {
                        c0039m2 = new C0039m0();
                        c0057v4.m135m(objM129g9, c0039m2);
                    }
                    m128198c(c28612f4, iHashCode, objM129g9, c0039m2);
                }
            } else {
                i14 = i76;
                objArr2 = objArr15;
                i15 = i77;
            }
            i77 = i15 + 1;
            i76 = i14;
            objArr15 = objArr2;
        }
        c30849c.m94890g();
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final void m128198c(Object obj, int i13, Object obj2, C0039m0 c0039m0) {
        int i14;
        if (this.f172491j > 0) {
            return;
        }
        int iM90c = c0039m0.m90c(obj);
        if (iM90c < 0) {
            iM90c = ~iM90c;
            i14 = -1;
        } else {
            i14 = c0039m0.f116c[iM90c];
        }
        c0039m0.f115b[iM90c] = obj;
        c0039m0.f116c[iM90c] = i13;
        if ((obj instanceof C28612f0) && i14 != i13) {
            C28608e0 c28608e0M87013y = ((C28612f0) obj).m87013y();
            this.f172493l.put(obj, c28608e0M87013y.f115735f);
            C0039m0 c0039m1 = c28608e0M87013y.f115734e;
            C0057v0 c0057v0 = this.f172492k;
            AbstractC12350b.m34561J(c0057v0, obj);
            Object[] objArr = c0039m1.f115b;
            long[] jArr = c0039m1.f114a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j7 = jArr[i15];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j7 & 255) < 128) {
                                InterfaceC39977z interfaceC39977z = (InterfaceC39977z) objArr[(i15 << 3) + i17];
                                if (interfaceC39977z instanceof AbstractC39948a0) {
                                    ((AbstractC39948a0) interfaceC39977z).m128129s(2);
                                }
                                AbstractC12350b.m34585f(c0057v0, interfaceC39977z, obj);
                            }
                            j7 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        } else if (i15 != length) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        if (i14 == -1) {
            if (obj instanceof AbstractC39948a0) {
                ((AbstractC39948a0) obj).m128129s(2);
            }
            AbstractC12350b.m34585f(this.f172486e, obj, obj2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m128199d(Object obj, Object obj2) {
        C0057v0 c0057v0 = this.f172486e;
        AbstractC12350b.m34560I(c0057v0, obj2, obj);
        if (!(obj2 instanceof C28612f0) || c0057v0.m125c(obj2)) {
            return;
        }
        AbstractC12350b.m34561J(this.f172492k, obj2);
        this.f172493l.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[LOOP:2: B:16:0x0066->B:28:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0 A[EDGE_INSN: B:48:0x00b0->B:30:0x00b0 BREAK  A[LOOP:2: B:16:0x0066->B:28:0x00a1], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m128200e() {
        long[] jArr;
        long[] jArr2;
        long j7;
        char c3;
        long j13;
        int i13;
        boolean z4;
        C0057v0 c0057v0 = this.f172487f;
        long[] jArr3 = c0057v0.f170a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j14 = jArr3[i14];
            char c7 = 7;
            long j15 = -9187201950435737472L;
            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j14 & 255) < 128) {
                        int i18 = (i14 << 3) + i17;
                        c3 = c7;
                        Object obj = c0057v0.f171b[i18];
                        j13 = j15;
                        C0039m0 c0039m0 = (C0039m0) c0057v0.f172c[i18];
                        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean zMo432U = ((InterfaceC0184b2) obj).mo432U();
                        if (zMo432U) {
                            jArr2 = jArr3;
                            j7 = j14;
                            z4 = zMo432U;
                        } else {
                            Object[] objArr = c0039m0.f115b;
                            int[] iArr = c0039m0.f116c;
                            long[] jArr4 = c0039m0.f114a;
                            int i19 = i15;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j7 = j14;
                                int i24 = 0;
                                while (true) {
                                    long j16 = jArr4[i24];
                                    long[] jArr5 = jArr4;
                                    z4 = zMo432U;
                                    if ((((~j16) << c3) & j16 & j13) == j13) {
                                        if (i24 != length2) {
                                            break;
                                            break;
                                        }
                                        i24++;
                                        zMo432U = z4;
                                        jArr4 = jArr5;
                                        i19 = 8;
                                    } else {
                                        int i25 = 8 - ((~(i24 - length2)) >>> 31);
                                        for (int i26 = 0; i26 < i25; i26++) {
                                            if ((j16 & 255) < 128) {
                                                int i27 = (i24 << 3) + i26;
                                                Object obj2 = objArr[i27];
                                                int i28 = iArr[i27];
                                                m128199d(obj, obj2);
                                            }
                                            j16 >>= i19;
                                        }
                                        if (i25 != i19) {
                                            break;
                                        }
                                        if (i24 != length2) {
                                            break;
                                        }
                                        i24++;
                                        zMo432U = z4;
                                        jArr4 = jArr5;
                                        i19 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j7 = j14;
                                z4 = zMo432U;
                            }
                        }
                        if (!z4) {
                            c0057v0.m134l(i18);
                        }
                        i13 = 8;
                    } else {
                        jArr2 = jArr3;
                        j7 = j14;
                        c3 = c7;
                        j13 = j15;
                        i13 = i15;
                    }
                    i17++;
                    i15 = i13;
                    j14 = j7 >> i13;
                    c7 = c3;
                    j15 = j13;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i16 != i15) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i14 == length) {
                return;
            }
            i14++;
            jArr3 = jArr;
        }
    }
}
