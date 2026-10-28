package bm2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: bm2.g1 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3443g1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13486w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f13487x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC39332e f13488y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ TextResource f13489z;

    public /* synthetic */ C3443g1(TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, int i13) {
        this.f13486w = i13;
        this.f13487x = textResource;
        this.f13488y = interfaceC39332e;
        this.f13489z = textResource2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f13486w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3455k1.m10104j(this.f13487x, this.f13488y, this.f13489z, composer, iIntValue);
            default:
                return AbstractC3455k1.m10113s(this.f13487x, this.f13488y, this.f13489z, composer, iIntValue);
        }
    }
}
