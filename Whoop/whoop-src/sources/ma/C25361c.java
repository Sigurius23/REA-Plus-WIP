package ma;

import android.util.Pair;
import p499t9.C33625d0;
import p499t9.C33629f0;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: ma.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C25361c implements InterfaceC25364f {

    /* JADX INFO: renamed from: a */
    public final long[] f99392a;

    /* JADX INFO: renamed from: b */
    public final long[] f99393b;

    /* JADX INFO: renamed from: c */
    public final long f99394c;

    public C25361c(long j7, long[] jArr, long[] jArr2) {
        this.f99392a = jArr;
        this.f99393b = jArr2;
        this.f99394c = j7 == -9223372036854775807L ? AbstractC38065t.m121896J(jArr2[jArr2.length - 1]) : j7;
    }

    /* JADX INFO: renamed from: b */
    public static Pair m74418b(long j7, long[] jArr, long[] jArr2) {
        int iM121911d = AbstractC38065t.m121911d(jArr, j7, true);
        long j13 = jArr[iM121911d];
        long j14 = jArr2[iM121911d];
        int i13 = iM121911d + 1;
        if (i13 == jArr.length) {
            return Pair.create(Long.valueOf(j13), Long.valueOf(j14));
        }
        long j15 = jArr[i13];
        return Pair.create(Long.valueOf(j7), Long.valueOf(((long) ((j15 == j13 ? 0.0d : (j7 - j13) / (j15 - j13)) * (jArr2[i13] - j14))) + j14));
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: a */
    public final long mo74415a(long j7) {
        return AbstractC38065t.m121896J(((Long) m74418b(j7, this.f99392a, this.f99393b).second).longValue());
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        Pair pairM74418b = m74418b(AbstractC38065t.m121907U(AbstractC38065t.m121915h(j7, 0L, this.f99394c)), this.f99393b, this.f99392a);
        C33629f0 c33629f0 = new C33629f0(AbstractC38065t.m121896J(((Long) pairM74418b.first).longValue()), ((Long) pairM74418b.second).longValue());
        return new C33625d0(c33629f0, c33629f0);
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: d */
    public final long mo74416d() {
        return -1L;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: e */
    public final boolean mo8509e() {
        return true;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: f */
    public final long mo8510f() {
        return this.f99394c;
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: k */
    public final int mo74417k() {
        return -2147483647;
    }
}
