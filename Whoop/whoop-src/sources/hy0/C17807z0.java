package hy0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import y71.AbstractC39273f;
import y71.AbstractC39279l;
import y71.C39282o;

/* JADX INFO: renamed from: hy0.z0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17807z0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f69255E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69256w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f69257x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f69258y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f69259z;

    public /* synthetic */ C17807z0(String str, String str2, long j7, long j13) {
        this.f69259z = str;
        this.f69255E = str2;
        this.f69257x = j7;
        this.f69258y = j13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69256w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17722a1.m50720f((String) this.f69259z, (String) this.f69255E, this.f69257x, this.f69258y, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39273f.m125131i((C39282o) this.f69259z, this.f69257x, (AbstractC39279l.a) this.f69255E, this.f69258y, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C17807z0(C39282o c39282o, long j7, AbstractC39279l.a aVar, long j13) {
        this.f69259z = c39282o;
        this.f69257x = j7;
        this.f69255E = aVar;
        this.f69258y = j13;
    }
}
