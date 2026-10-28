package zq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: zq2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C40994g implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f176924E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176925w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C40993f f176926x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f176927y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f176928z;

    public /* synthetic */ C40994g(C40993f c40993f, boolean z4, Function1 function1, int i13, int i14) {
        this.f176925w = i14;
        this.f176926x = c40993f;
        this.f176927y = z4;
        this.f176928z = function1;
        this.f176924E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f176925w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC40996i.m133132I(this.f176926x, this.f176927y, this.f176928z, this.f176924E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40998k.m133165C(this.f176926x, this.f176927y, this.f176928z, this.f176924E, (Composer) obj, iIntValue2);
        }
    }
}
