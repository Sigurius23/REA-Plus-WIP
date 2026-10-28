package bm2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p745y81.InterfaceC39332e;
import v41.AbstractC35676l;

/* JADX INFO: renamed from: bm2.i1 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3449i1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ TextResource f13523E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC39332e f13524F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ TextResource f13525G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC39332e f13526H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f13527I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f13528J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13529w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f13530x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f13531y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ TextResource f13532z;

    public /* synthetic */ C3449i1(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, int i13, int i14, int i15) {
        this.f13529w = i15;
        this.f13530x = textResource;
        this.f13531y = textResource2;
        this.f13532z = textResource3;
        this.f13523E = textResource4;
        this.f13524F = interfaceC39332e;
        this.f13525G = textResource5;
        this.f13526H = interfaceC39332e2;
        this.f13527I = i13;
        this.f13528J = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13529w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3455k1.m10114t(this.f13530x, this.f13531y, this.f13532z, this.f13523E, this.f13524F, this.f13525G, this.f13526H, this.f13527I, this.f13528J, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC35676l.m113018r(this.f13530x, this.f13531y, this.f13532z, this.f13523E, this.f13524F, this.f13525G, this.f13526H, this.f13527I, this.f13528J, (Composer) obj, iIntValue2);
        }
    }
}
