package ou0;

import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ou0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C28372c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114476w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f114477x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long[] f114478y;

    public /* synthetic */ C28372c(String str, long[] jArr, int i13) {
        this.f114476w = i13;
        this.f114477x = str;
        this.f114478y = jArr;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f114476w) {
            case 0:
                return C28373d.m86050l(this.f114477x, this.f114478y, (InterfaceC33687a) obj);
            default:
                return C28375f.m86067l(this.f114477x, this.f114478y, (InterfaceC33687a) obj);
        }
    }
}
