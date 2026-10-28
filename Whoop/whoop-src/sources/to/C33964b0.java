package to;

import android.os.SystemClock;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import jp.HandlerC21846d;
import live.hms.video.error.ErrorCodes;
import p073cq.InterfaceC11035d;
import p529uo.AbstractC35107c;
import p529uo.C35110d0;
import p529uo.C35113f;
import p529uo.C35121j;
import p529uo.C35123k;
import p529uo.C35124l;

/* JADX INFO: renamed from: to.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33964b0 implements InterfaceC11035d {

    /* JADX INFO: renamed from: E */
    public final long f142397E;

    /* JADX INFO: renamed from: w */
    public final C33971f f142398w;

    /* JADX INFO: renamed from: x */
    public final int f142399x;

    /* JADX INFO: renamed from: y */
    public final C33961a f142400y;

    /* JADX INFO: renamed from: z */
    public final long f142401z;

    public C33964b0(C33971f c33971f, int i13, C33961a c33961a, long j7, long j13) {
        this.f142398w = c33971f;
        this.f142399x = i13;
        this.f142400y = c33961a;
        this.f142401z = j7;
        this.f142397E = j13;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX INFO: renamed from: a */
    public static C33964b0 m107420a(C33971f c33971f, int i13, C33961a c33961a) {
        if (!c33971f.m107433g()) {
            return null;
        }
        C35124l c35124l = (C35124l) C35123k.m111072a().f149049a;
        boolean z4 = true;
        if (c35124l != null) {
            if (!c35124l.f149052x) {
                return null;
            }
            boolean z13 = c35124l.f149053y;
            C34003v c34003v = (C34003v) c33971f.f142423J.get(c33961a);
            if (c34003v != null) {
                Object obj = c34003v.f142495g;
                if (!(obj instanceof AbstractC35107c)) {
                    return null;
                }
                AbstractC35107c abstractC35107c = (AbstractC35107c) obj;
                if (abstractC35107c.f148983v == null || abstractC35107c.m111063o()) {
                    z4 = z13;
                } else {
                    C35113f c35113fM107421b = m107421b(c34003v, abstractC35107c, i13);
                    if (c35113fM107421b == null) {
                        return null;
                    }
                    c34003v.f142505q++;
                    z4 = c35113fM107421b.f149002y;
                }
            } else {
                z4 = z13;
            }
        }
        return new C33964b0(c33971f, i13, c33961a, z4 ? System.currentTimeMillis() : 0L, z4 ? SystemClock.elapsedRealtime() : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    /* JADX INFO: renamed from: b */
    public static C35113f m107421b(C34003v c34003v, AbstractC35107c abstractC35107c, int i13) {
        C35110d0 c35110d0 = abstractC35107c.f148983v;
        C35113f c35113f = c35110d0 == null ? null : c35110d0.f148991z;
        if (c35113f != null && c35113f.f149001x) {
            int[] iArr = c35113f.f149003z;
            int i14 = 0;
            if (iArr == null) {
                int[] iArr2 = c35113f.f148999F;
                if (iArr2 != null) {
                    while (i14 < iArr2.length) {
                        if (iArr2[i14] != i13) {
                            i14++;
                        }
                    }
                    if (c34003v.f142505q < c35113f.f148998E) {
                        return c35113f;
                    }
                } else if (c34003v.f142505q < c35113f.f148998E) {
                    return c35113f;
                }
            } else {
                while (i14 < iArr.length) {
                    if (iArr[i14] != i13) {
                        i14++;
                    } else if (c34003v.f142505q < c35113f.f148998E) {
                        return c35113f;
                    }
                }
            }
        }
        return null;
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public final void mo944q(Task task) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j7;
        long j13;
        C33971f c33971f = this.f142398w;
        if (c33971f.m107433g()) {
            C35124l c35124l = (C35124l) C35123k.m111072a().f149049a;
            if (c35124l == null || c35124l.f149052x) {
                C34003v c34003v = (C34003v) c33971f.f142423J.get(this.f142400y);
                if (c34003v != null) {
                    Object obj = c34003v.f142495g;
                    if (obj instanceof AbstractC35107c) {
                        AbstractC35107c abstractC35107c = (AbstractC35107c) obj;
                        long j14 = this.f142401z;
                        int i18 = 0;
                        boolean z4 = j14 > 0;
                        int i19 = abstractC35107c.f148977p;
                        if (c35124l != null) {
                            z4 &= c35124l.f149053y;
                            i13 = c35124l.f149054z;
                            i15 = c35124l.f149050E;
                            i14 = c35124l.f149051w;
                            if (abstractC35107c.f148983v != null && !abstractC35107c.m111063o()) {
                                C35113f c35113fM107421b = m107421b(c34003v, abstractC35107c, this.f142399x);
                                if (c35113fM107421b == null) {
                                    return;
                                }
                                boolean z13 = c35113fM107421b.f149002y && j14 > 0;
                                i15 = c35113fM107421b.f148998E;
                                z4 = z13;
                            }
                        } else {
                            i13 = ErrorCodes.WebsocketMethodErrors.cServerErrors;
                            i14 = 0;
                            i15 = 100;
                        }
                        int i24 = i13;
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i17 = 0;
                        } else if (task.isCanceled()) {
                            i18 = -1;
                            i17 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ApiException) {
                                Status status = ((ApiException) exception).f20483w;
                                i16 = status.f20493w;
                                C4969a c4969a = status.f20496z;
                                if (c4969a != null) {
                                    i17 = i16;
                                    i18 = c4969a.f20480x;
                                }
                            } else {
                                i16 = 101;
                            }
                            i17 = i16;
                            i18 = -1;
                        }
                        if (z4) {
                            long j15 = this.f142397E;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j15);
                            j13 = jCurrentTimeMillis;
                            j7 = j14;
                        } else {
                            j7 = 0;
                            j13 = 0;
                        }
                        C33966c0 c33966c0 = new C33966c0(new C35121j(this.f142399x, i17, i18, j7, j13, null, null, i19, iElapsedRealtime), i14, i24, i15);
                        HandlerC21846d handlerC21846d = c33971f.f142427N;
                        handlerC21846d.sendMessage(handlerC21846d.obtainMessage(18, c33966c0));
                    }
                }
            }
        }
    }
}
