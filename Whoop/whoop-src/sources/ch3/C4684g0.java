package ch3;

import gh3.C15862g;
import gh3.C15867l;
import hh3.C17298b;
import hh3.C17299c;
import hh3.C17301e;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import mh3.C25566c;
import p098dt.AbstractC12350b;
import p471rx.exceptions.CompositeException;
import p471rx.exceptions.MissingBackpressureException;
import p471rx.exceptions.OnErrorThrowable;
import p471rx.internal.util.unsafe.AbstractC31895j;
import p471rx.internal.util.unsafe.C31889d;
import xg3.AbstractC38292s;
import xg3.C38280g;

/* JADX INFO: renamed from: ch3.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4684g0 extends AbstractC38292s {

    /* JADX INFO: renamed from: V */
    public static final C4680e0[] f19167V = new C4680e0[0];

    /* JADX INFO: renamed from: E */
    public final AbstractC38292s f19168E;

    /* JADX INFO: renamed from: F */
    public final boolean f19169F;

    /* JADX INFO: renamed from: H */
    public C4682f0 f19171H;

    /* JADX INFO: renamed from: I */
    public volatile Queue f19172I;

    /* JADX INFO: renamed from: J */
    public volatile C25566c f19173J;

    /* JADX INFO: renamed from: K */
    public volatile ConcurrentLinkedQueue f19174K;

    /* JADX INFO: renamed from: L */
    public volatile boolean f19175L;

    /* JADX INFO: renamed from: M */
    public boolean f19176M;

    /* JADX INFO: renamed from: N */
    public boolean f19177N;

    /* JADX INFO: renamed from: Q */
    public long f19180Q;

    /* JADX INFO: renamed from: R */
    public long f19181R;

    /* JADX INFO: renamed from: S */
    public int f19182S;

    /* JADX INFO: renamed from: U */
    public int f19184U;

    /* JADX INFO: renamed from: G */
    public final int f19170G = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: O */
    public final Object f19178O = new Object();

    /* JADX INFO: renamed from: P */
    public volatile C4680e0[] f19179P = f19167V;

    /* JADX INFO: renamed from: T */
    public final int f19183T = Integer.MAX_VALUE;

    public C4684g0(AbstractC38292s abstractC38292s, boolean z4) {
        this.f19168E = abstractC38292s;
        this.f19169F = z4;
        m122689e(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: k */
    public static void m14755k(C4680e0 c4680e0, Object obj) {
        C15862g c15862g;
        C15862g c15862g2 = c4680e0.f19148H;
        if (c15862g2 == null) {
            int i13 = C15862g.f59961x;
            if (AbstractC31895j.f132402a == null || AbstractC31895j.f132403b) {
                C17298b c17298b = new C17298b(i13);
                c15862g = new C15862g();
                c15862g.f59962w = c17298b;
            } else {
                c15862g = new C15862g();
                c15862g.f59962w = new C31889d(i13);
            }
            c15862g2 = c15862g;
            c4680e0.m122688c(c15862g2);
            c4680e0.f19148H = c15862g2;
        }
        if (obj == null) {
            try {
                obj = AbstractC4677d.f19136b;
            } catch (IllegalStateException e5) {
                if (c4680e0.mo14749a()) {
                    return;
                }
                c4680e0.mo14750b();
                c4680e0.onError(e5);
                return;
            } catch (MissingBackpressureException e13) {
                c4680e0.mo14750b();
                c4680e0.onError(e13);
                return;
            }
        }
        c15862g2.m44777c(obj);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m14756g() {
        if (this.f19168E.mo14749a()) {
            return true;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f19174K;
        if (this.f19169F || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return false;
        }
        try {
            m14762n();
            return true;
        } finally {
            mo14750b();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m14757h() {
        synchronized (this) {
            try {
                if (this.f19176M) {
                    this.f19177N = true;
                } else {
                    this.f19176M = true;
                    m14758i();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01fc */
    /* JADX WARN: Code duplicated, block: B:102:0x012a A[Catch: all -> 0x0128, TryCatch #2 {all -> 0x0128, blocks: (B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:199:0x0121, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0132 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0155 A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0162  */
    /* JADX WARN: Code duplicated, block: B:125:0x0173 A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0176 A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x017d A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0184  */
    /* JADX WARN: Code duplicated, block: B:138:0x019b  */
    /* JADX WARN: Code duplicated, block: B:139:0x019d A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ad A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x01b7 A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x01bd A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:186:0x0200  */
    /* JADX WARN: Code duplicated, block: B:187:0x0201  */
    /* JADX WARN: Code duplicated, block: B:199:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0151 A[EDGE_INSN: B:240:0x0151->B:118:0x0151 BREAK  A[LOOP:6: B:87:0x010f->B:108:0x0139], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0103 A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x010b A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0113 A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x011b A[Catch: all -> 0x005d, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0120 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #8 {all -> 0x005d, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0041, B:36:0x0068, B:26:0x004a, B:28:0x004e, B:35:0x0061, B:48:0x00a3, B:51:0x00ae, B:54:0x00b6, B:56:0x00ba, B:59:0x00c1, B:60:0x00c6, B:62:0x00cd, B:64:0x00d3, B:72:0x00e6, B:75:0x00ef, B:78:0x00f4, B:79:0x00f7, B:82:0x0103, B:85:0x010b, B:89:0x0113, B:92:0x011b, B:95:0x0120, B:106:0x0132, B:117:0x0150, B:120:0x0155, B:123:0x016a, B:125:0x0173, B:136:0x0195, B:139:0x019d, B:141:0x01a1, B:147:0x01ad, B:150:0x01b7, B:158:0x01cc, B:161:0x01da, B:164:0x01e4, B:153:0x01bd, B:156:0x01c2, B:126:0x0176, B:128:0x017d, B:40:0x0081, B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:209:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0125 A[Catch: all -> 0x0128, DONT_GENERATE, TryCatch #2 {all -> 0x0128, blocks: (B:96:0x0121, B:98:0x0125, B:102:0x012a, B:103:0x012e), top: B:199:0x0121, outer: #8 }] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14758i() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch3.C4684g0.m14758i():void");
    }

    /* JADX INFO: renamed from: j */
    public final ConcurrentLinkedQueue m14759j() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f19174K;
        if (concurrentLinkedQueue2 != null) {
            return concurrentLinkedQueue2;
        }
        synchronized (this) {
            try {
                concurrentLinkedQueue = this.f19174K;
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    this.f19174K = concurrentLinkedQueue;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return concurrentLinkedQueue;
    }

    /* JADX INFO: renamed from: l */
    public final void m14760l(Object obj) {
        Queue c17299c;
        Queue c17301e = this.f19172I;
        if (c17301e == null) {
            int i13 = this.f19170G;
            if (i13 == Integer.MAX_VALUE) {
                c17301e = new C17301e(C15862g.f59961x);
            } else {
                if (((i13 - 1) & i13) == 0) {
                    c17299c = (AbstractC31895j.f132402a == null || AbstractC31895j.f132403b) ? new C17298b(i13) : new C31889d(i13);
                } else {
                    c17299c = new C17299c(i13);
                }
                c17301e = c17299c;
            }
            this.f19172I = c17301e;
        }
        if (c17301e.offer(obj == null ? AbstractC4677d.f19136b : obj)) {
            return;
        }
        mo14750b();
        MissingBackpressureException missingBackpressureException = new MissingBackpressureException();
        OnErrorThrowable.m99122a(obj, missingBackpressureException);
        onError(missingBackpressureException);
    }

    /* JADX INFO: renamed from: m */
    public final void m14761m(C4680e0 c4680e0) {
        C15862g c15862g = c4680e0.f19148H;
        if (c15862g != null) {
            synchronized (c15862g) {
            }
        }
        this.f19173J.m75181e(c4680e0);
        synchronized (this.f19178O) {
            try {
                C4680e0[] c4680e0Arr = this.f19179P;
                int length = c4680e0Arr.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        i13 = -1;
                        break;
                    } else if (c4680e0.equals(c4680e0Arr[i13])) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 < 0) {
                    return;
                }
                if (length == 1) {
                    this.f19179P = f19167V;
                    return;
                }
                C4680e0[] c4680e0Arr2 = new C4680e0[length - 1];
                System.arraycopy(c4680e0Arr, 0, c4680e0Arr2, 0, i13);
                System.arraycopy(c4680e0Arr, i13 + 1, c4680e0Arr2, i13, (length - i13) - 1);
                this.f19179P = c4680e0Arr2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m14762n() {
        ArrayList arrayList = new ArrayList(this.f19174K);
        if (arrayList.size() == 1) {
            this.f19168E.onError((Throwable) arrayList.get(0));
        } else {
            this.f19168E.onError(new CompositeException(arrayList));
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        this.f19175L = true;
        m14757h();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        m14759j().offer(th3);
        this.f19175L = true;
        m14757h();
    }

    /* JADX WARN: Code duplicated, block: B:118:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00b9  */
    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) throws Throwable {
        boolean z4;
        C38280g c38280g = (C38280g) obj;
        if (c38280g == null) {
            return;
        }
        boolean z13 = true;
        if (c38280g == C38280g.m122642l()) {
            int i13 = this.f19184U + 1;
            if (i13 != this.f19183T) {
                this.f19184U = i13;
                return;
            } else {
                this.f19184U = 0;
                m122689e(i13);
                return;
            }
        }
        if (!(c38280g instanceof C15867l)) {
            long j7 = this.f19180Q;
            this.f19180Q = 1 + j7;
            C4680e0 c4680e0 = new C4680e0(this, j7);
            C25566c c25566c = this.f19173J;
            if (c25566c == null) {
                synchronized (this) {
                    try {
                        c25566c = this.f19173J;
                        if (c25566c == null) {
                            c25566c = new C25566c();
                            this.f19173J = c25566c;
                        } else {
                            z13 = false;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (z13) {
                    m122688c(c25566c);
                }
            }
            c25566c.m75179c(c4680e0);
            synchronized (this.f19178O) {
                C4680e0[] c4680e0Arr = this.f19179P;
                int length = c4680e0Arr.length;
                C4680e0[] c4680e0Arr2 = new C4680e0[length + 1];
                System.arraycopy(c4680e0Arr, 0, c4680e0Arr2, 0, length);
                c4680e0Arr2[length] = c4680e0;
                this.f19179P = c4680e0Arr2;
            }
            c38280g.m122671W(c4680e0);
            m14757h();
            return;
        }
        Object obj2 = ((C15867l) c38280g).f59973x;
        long j13 = this.f19171H.get();
        if (j13 != 0) {
            synchronized (this) {
                try {
                    j13 = this.f19171H.get();
                    if (this.f19176M || j13 == 0) {
                        z4 = false;
                    } else {
                        this.f19176M = true;
                        z4 = true;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } else {
            z4 = false;
        }
        if (!z4) {
            m14760l(obj2);
            m14757h();
            return;
        }
        Queue queue = this.f19172I;
        if (queue != null && !queue.isEmpty()) {
            m14760l(obj2);
            m14758i();
            return;
        }
        try {
            try {
                this.f19168E.onNext(obj2);
            } catch (Throwable th5) {
                try {
                    if (!this.f19169F) {
                        AbstractC12350b.m34573V(th5);
                        mo14750b();
                        onError(th5);
                        return;
                    }
                    m14759j().offer(th5);
                } catch (Throwable th6) {
                    th = th6;
                    z13 = false;
                    if (!z13) {
                        synchronized (this) {
                            this.f19176M = false;
                        }
                    }
                    throw th;
                }
            }
            if (j13 != Long.MAX_VALUE) {
                this.f19171H.addAndGet(-1);
            }
            int i14 = this.f19184U + 1;
            if (i14 == this.f19183T) {
                this.f19184U = 0;
                m122689e(i14);
            } else {
                this.f19184U = i14;
            }
            synchronized (this) {
                try {
                    if (this.f19177N) {
                        this.f19177N = false;
                        m14758i();
                    } else {
                        this.f19176M = false;
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            }
        } catch (Throwable th8) {
            th = th8;
            if (!z13) {
                synchronized (this) {
                    this.f19176M = false;
                }
            }
            throw th;
        }
    }
}
