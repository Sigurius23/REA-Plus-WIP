package p077d0;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: d0.a2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11331a2 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36300w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11421z1 f36301x;

    public /* synthetic */ C11331a2(C11421z1 c11421z1, int i13) {
        this.f36300w = i13;
        this.f36301x = c11421z1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f36300w) {
            case 0:
                return new C11339c2(this.f36301x, 0);
            default:
                return new C11339c2(this.f36301x, 1);
        }
    }
}
