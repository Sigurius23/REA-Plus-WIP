package p390p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import p002a0.C0059w0;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: p1.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28685x1 extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: E */
    public C0059w0 f116020E;

    /* JADX INFO: renamed from: F */
    public C0059w0 f116021F;

    /* JADX INFO: renamed from: G */
    public Set f116022G;

    /* JADX INFO: renamed from: H */
    public C0059w0 f116023H;

    /* JADX INFO: renamed from: I */
    public int f116024I;

    /* JADX INFO: renamed from: J */
    public /* synthetic */ InterfaceC28680w0 f116025J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C28688y1 f116026K;

    /* JADX INFO: renamed from: w */
    public List f116027w;

    /* JADX INFO: renamed from: x */
    public List f116028x;

    /* JADX INFO: renamed from: y */
    public List f116029y;

    /* JADX INFO: renamed from: z */
    public C0059w0 f116030z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28685x1(C28688y1 c28688y1, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f116026K = c28688y1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[Catch: all -> 0x002c, LOOP:1: B:12:0x0042->B:22:0x0078, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[Catch: all -> 0x002c, LOOP:3: B:27:0x0090->B:37:0x00bd, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100 A[Catch: all -> 0x002c, LOOP:5: B:41:0x00d0->B:51:0x0100, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0083 A[EDGE_INSN: B:61:0x0083->B:24:0x0083 BREAK  A[LOOP:1: B:12:0x0042->B:22:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0 A[EDGE_INSN: B:66:0x00c0->B:38:0x00c0 BREAK  A[LOOP:3: B:27:0x0090->B:37:0x00bd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0103 A[EDGE_INSN: B:71:0x0103->B:52:0x0103 BREAK  A[LOOP:5: B:41:0x00d0->B:51:0x0100], SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m87274f(C28688y1 c28688y1, List list, List list2, List list3, C0059w0 c0059w0, C0059w0 c0059w1, C0059w0 c0059w2, C0059w0 c0059w3) {
        char c3;
        long j7;
        long j13;
        synchronized (c28688y1.f116037c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i13 = 0; i13 < size; i13++) {
                    C28679w c28679w = (C28679w) list3.get(i13);
                    c28679w.m87207a();
                    c28688y1.m87288G(c28679w);
                }
                list3.clear();
                Object[] objArr = c0059w0.f178b;
                long[] jArr = c0059w0.f177a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    j7 = 255;
                    while (true) {
                        long j14 = jArr[i14];
                        c3 = 7;
                        j13 = -9187201950435737472L;
                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i14 != length) {
                                break;
                                break;
                            }
                            i14++;
                        } else {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j14 & 255) < 128) {
                                    C28679w c28679w2 = (C28679w) objArr[(i14 << 3) + i16];
                                    c28679w2.m87207a();
                                    c28688y1.m87288G(c28679w2);
                                }
                                j14 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            } else if (i14 != length) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                } else {
                    c3 = 7;
                    j7 = 255;
                    j13 = -9187201950435737472L;
                }
                c0059w0.m137b();
                Object[] objArr2 = c0059w1.f178b;
                long[] jArr2 = c0059w1.f177a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j15 = jArr2[i17];
                        if ((((~j15) << c3) & j15 & j13) == j13) {
                            if (i17 != length2) {
                                break;
                                break;
                            }
                            i17++;
                        } else {
                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j15 & j7) < 128) {
                                    ((C28679w) objArr2[(i17 << 3) + i19]).m87213g();
                                }
                                j15 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            } else if (i17 != length2) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                c0059w1.m137b();
                c0059w2.m137b();
                Object[] objArr3 = c0059w3.f178b;
                long[] jArr3 = c0059w3.f177a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i24 = 0;
                    while (true) {
                        long j16 = jArr3[i24];
                        if ((((~j16) << c3) & j16 & j13) == j13) {
                            if (i24 != length3) {
                                break;
                                break;
                            }
                            i24++;
                        } else {
                            int i25 = 8 - ((~(i24 - length3)) >>> 31);
                            for (int i26 = 0; i26 < i25; i26++) {
                                if ((j16 & j7) < 128) {
                                    C28679w c28679w3 = (C28679w) objArr3[(i24 << 3) + i26];
                                    c28679w3.m87207a();
                                    c28688y1.m87288G(c28679w3);
                                }
                                j16 >>= 8;
                            }
                            if (i25 != 8) {
                                break;
                            } else if (i24 != length3) {
                                break;
                            } else {
                                i24++;
                            }
                        }
                    }
                }
                c0059w3.m137b();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m87275h(List list, C28688y1 c28688y1) {
        list.clear();
        synchronized (c28688y1.f116037c) {
            try {
                ArrayList arrayList = c28688y1.f116045k;
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    list.add((AbstractC28687y0) arrayList.get(i13));
                }
                c28688y1.f116045k.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C28685x1 c28685x1 = new C28685x1(this.f116026K, (InterfaceC30057d) obj3);
        c28685x1.f116025J = (InterfaceC28680w0) obj2;
        c28685x1.invokeSuspend(C23454a0.f92919a);
        return EnumC31071a.f128113w;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00a5 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e5 A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #1 {, blocks: (B:19:0x00dd, B:22:0x00e5), top: B:65:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x0144  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0144 -> B:44:0x014c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01e4 -> B:12:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p390p1.C28685x1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
