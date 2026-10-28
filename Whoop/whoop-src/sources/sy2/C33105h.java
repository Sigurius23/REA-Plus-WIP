package sy2;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sy2.h */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C33105h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138075w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f138076x;

    public /* synthetic */ C33105h(Function1 function1, int i13) {
        this.f138075w = i13;
        this.f138076x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f138075w) {
            case 0:
                return AbstractC33108k.m104914m(this.f138076x, (String) obj);
            case 1:
                return AbstractC33108k.m104915n(this.f138076x, (String) obj);
            case 2:
                return AbstractC33108k.m104916o(this.f138076x, (String) obj);
            case 3:
                return AbstractC33110m.m104936k(this.f138076x, (String) obj);
            case 4:
                return AbstractC33117t.m104980A(this.f138076x, (String) obj);
            default:
                return AbstractC33117t.m105009w(this.f138076x, (String) obj);
        }
    }
}
