package p292l1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import ku2.C22837a;
import p208i2.C17919x;
import p354o1.EnumC27367f;
import p390p1.C28655q;
import p390p1.C28674u2;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: l1.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23138n {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f91494a = new C28674u2(new C22837a(27));

    /* JADX INFO: renamed from: b */
    public static final C28674u2 f91495b = new C28674u2(new C22837a(28));

    /* JADX INFO: renamed from: a */
    public static final long m67115a(C23132m c23132m, long j7) {
        long j13 = c23132m.f91437a;
        long j14 = c23132m.f91431U;
        long j15 = c23132m.f91427Q;
        long j16 = c23132m.f91423M;
        long j17 = c23132m.f91457q;
        if (C17919x.m51542d(j7, j13)) {
            return c23132m.f91439b;
        }
        if (C17919x.m51542d(j7, c23132m.f91446f)) {
            return c23132m.f91447g;
        }
        if (C17919x.m51542d(j7, c23132m.f91450j)) {
            return c23132m.f91451k;
        }
        if (C17919x.m51542d(j7, c23132m.f91454n)) {
            return c23132m.f91455o;
        }
        if (C17919x.m51542d(j7, c23132m.f91463w)) {
            return c23132m.f91464x;
        }
        if (C17919x.m51542d(j7, c23132m.f91441c)) {
            return c23132m.f91443d;
        }
        if (C17919x.m51542d(j7, c23132m.f91448h)) {
            return c23132m.f91449i;
        }
        if (C17919x.m51542d(j7, c23132m.f91452l)) {
            return c23132m.f91453m;
        }
        if (C17919x.m51542d(j7, c23132m.f91465y)) {
            return c23132m.f91466z;
        }
        if (C17919x.m51542d(j7, c23132m.f91461u)) {
            return c23132m.f91462v;
        }
        if (C17919x.m51542d(j7, c23132m.f91456p)) {
            return j17;
        }
        if (C17919x.m51542d(j7, c23132m.f91458r)) {
            return c23132m.f91459s;
        }
        if (C17919x.m51542d(j7, c23132m.f91414D) || C17919x.m51542d(j7, c23132m.f91416F) || C17919x.m51542d(j7, c23132m.f91417G) || C17919x.m51542d(j7, c23132m.f91418H) || C17919x.m51542d(j7, c23132m.f91419I) || C17919x.m51542d(j7, c23132m.f91420J) || C17919x.m51542d(j7, c23132m.f91415E)) {
            return j17;
        }
        if (C17919x.m51542d(j7, c23132m.f91421K) || C17919x.m51542d(j7, c23132m.f91422L)) {
            return j16;
        }
        if (C17919x.m51542d(j7, c23132m.f91425O) || C17919x.m51542d(j7, c23132m.f91426P)) {
            return j15;
        }
        if (C17919x.m51542d(j7, c23132m.f91429S) || C17919x.m51542d(j7, c23132m.f91430T)) {
            return j14;
        }
        int i13 = C17919x.f69638o;
        return C17919x.f69637n;
    }

    /* JADX INFO: renamed from: b */
    public static final long m67116b(long j7, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(89374938);
        long jM67115a = m67115a((C23132m) c28655q.m87161k(f91494a), j7);
        if (jM67115a == 16) {
            jM67115a = ((C17919x) c28655q.m87161k(AbstractC23168s.f91626a)).f69639a;
        }
        c28655q.m87173q(false);
        return jM67115a;
    }

    /* JADX INFO: renamed from: c */
    public static final long m67117c(C23132m c23132m, EnumC27367f enumC27367f) {
        switch (enumC27367f.ordinal()) {
            case 0:
                return c23132m.f91454n;
            case 1:
                return c23132m.f91463w;
            case 2:
                return c23132m.f91465y;
            case 3:
                return c23132m.f91462v;
            case 4:
                return c23132m.f91445e;
            case 5:
                return c23132m.f91461u;
            case 6:
                return c23132m.f91455o;
            case 7:
                return c23132m.f91464x;
            case 8:
                return c23132m.f91466z;
            case 9:
                return c23132m.f91439b;
            case 10:
                return c23132m.f91443d;
            case 11:
                return c23132m.f91423M;
            case 12:
                return c23132m.f91424N;
            case 13:
                return c23132m.f91447g;
            case 14:
                return c23132m.f91449i;
            case 15:
                return c23132m.f91427Q;
            case 16:
                return c23132m.f91428R;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return c23132m.f91457q;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return c23132m.f91459s;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return c23132m.f91451k;
            case 20:
                return c23132m.f91453m;
            case 21:
                return c23132m.f91431U;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return c23132m.f91432V;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return c23132m.f91411A;
            case 24:
                return c23132m.f91412B;
            case 25:
                return c23132m.f91437a;
            case 26:
                return c23132m.f91441c;
            case 27:
                return c23132m.f91421K;
            case 28:
                return c23132m.f91422L;
            case 29:
                return c23132m.f91413C;
            case 30:
                return c23132m.f91446f;
            case 31:
                return c23132m.f91448h;
            case 32:
                return c23132m.f91425O;
            case 33:
                return c23132m.f91426P;
            case 34:
                return c23132m.f91456p;
            case 35:
                return c23132m.f91414D;
            case 36:
                return c23132m.f91416F;
            case 37:
                return c23132m.f91417G;
            case 38:
                return c23132m.f91418H;
            case 39:
                return c23132m.f91419I;
            case 40:
                return c23132m.f91420J;
            case 41:
                return c23132m.f91415E;
            case 42:
                return c23132m.f91460t;
            case 43:
                return c23132m.f91458r;
            case 44:
                return c23132m.f91450j;
            case 45:
                return c23132m.f91452l;
            case 46:
                return c23132m.f91429S;
            case 47:
                return c23132m.f91430T;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final long m67118d(EnumC27367f enumC27367f, Composer composer) {
        return m67117c((C23132m) ((C28655q) composer).m87161k(f91494a), enumC27367f);
    }
}
