package p007a6;

import al0.C0975j;
import androidx.health.platform.client.proto.C1533u;
import bc3.C3058t;
import c93.InterfaceC4351m;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import uf3.C34911a;
import xf3.C38266c;

/* JADX INFO: renamed from: a6.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0431j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1484w;

    public /* synthetic */ C0431j(int i13) {
        this.f1484w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1484w) {
            case 0:
                C0455t0 msg = (C0455t0) obj;
                Throwable cancellationException = (Throwable) obj2;
                AbstractC22676k.m65750j(msg, "msg");
                C3058t c3058t = msg.f1564b;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                c3058t.completeExceptionally(cancellationException);
                return C23454a0.f92919a;
            case 1:
                return C0975j.m2569b1((C38266c) obj, (C34911a) obj2);
            case 2:
                return C0975j.m2613m1((C38266c) obj, (C34911a) obj2);
            case 3:
                return C0975j.m2573c1((C38266c) obj, (C34911a) obj2);
            case 4:
                return C0975j.m2621o1((C38266c) obj, (C34911a) obj2);
            case 5:
                return C0975j.m2625p1((C38266c) obj, (C34911a) obj2);
            case 6:
                return C0975j.m2633r1((C38266c) obj, (C34911a) obj2);
            case 7:
                return C0975j.m2641t1((C38266c) obj, (C34911a) obj2);
            case 8:
                return C0975j.m2645u1((C38266c) obj, (C34911a) obj2);
            case 9:
                return C0975j.m2649v1((C38266c) obj, (C34911a) obj2);
            case 10:
                return C0975j.m2653w1((C38266c) obj, (C34911a) obj2);
            case 11:
                return C0975j.m2661y1((C38266c) obj, (C34911a) obj2);
            case 12:
                return C0975j.m2577d1((C38266c) obj, (C34911a) obj2);
            case 13:
                return C0975j.m2665z1((C38266c) obj, (C34911a) obj2);
            case 14:
                return C0975j.m2460A1((C38266c) obj, (C34911a) obj2);
            case 15:
                return C0975j.m2617n1((C38266c) obj, (C34911a) obj2);
            case 16:
                return C0975j.m2468C1((C38266c) obj, (C34911a) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C0975j.m2472D1((C38266c) obj, (C34911a) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C0975j.m2476E1((C38266c) obj, (C34911a) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C0975j.m2480F1((C38266c) obj, (C34911a) obj2);
            case 20:
                return C0975j.m2484G1((C38266c) obj, (C34911a) obj2);
            case 21:
                return C0975j.m2492I1((C38266c) obj, (C34911a) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C0975j.m2496J1((C38266c) obj, (C34911a) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C0975j.m2581e1((C38266c) obj, (C34911a) obj2);
            case 24:
                return C0975j.m2500K1((C38266c) obj, (C34911a) obj2);
            case 25:
                return C0975j.m2508M1((C38266c) obj, (C34911a) obj2);
            case 26:
                return C0975j.m2512N1((C38266c) obj, (C34911a) obj2);
            case 27:
                return C0975j.m2464B1((C38266c) obj, (C34911a) obj2);
            case 28:
                return C0975j.m2520P1((C38266c) obj, (C34911a) obj2);
            default:
                return C0975j.m2524Q1((C38266c) obj, (C34911a) obj2);
        }
    }
}
