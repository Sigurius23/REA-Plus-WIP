package bm2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p745y81.InterfaceC39332e;
import v41.AbstractC35676l;

/* JADX INFO: renamed from: bm2.j1 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3452j1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13539w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f13540x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC39332e f13541y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f13542z;

    public /* synthetic */ C3452j1(TextResource textResource, InterfaceC39332e interfaceC39332e, int i13, int i14) {
        this.f13539w = i14;
        this.f13540x = textResource;
        this.f13541y = interfaceC39332e;
        this.f13542z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f13539w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3455k1.m10111q(this.f13540x, this.f13541y, this.f13542z, composer, iIntValue);
            default:
                return AbstractC35676l.m113016p(this.f13540x, this.f13541y, this.f13542z, composer, iIntValue);
        }
    }
}
