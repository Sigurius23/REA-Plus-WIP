package m01;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import i51.C18106c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: m01.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C24874b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97448w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C18106c f97449x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f97450y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f97451z;

    public /* synthetic */ C24874b(C18106c c18106c, Function1 function1, int i13, int i14) {
        this.f97448w = i14;
        this.f97449x = c18106c;
        this.f97450y = function1;
        this.f97451z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f97448w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC24876d.m72920P(this.f97449x, this.f97450y, this.f97451z, composer, iIntValue);
            default:
                return AbstractC24876d.m72906B(this.f97449x, this.f97450y, this.f97451z, composer, iIntValue);
        }
    }
}
