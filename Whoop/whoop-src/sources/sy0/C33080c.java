package sy0;

import p715kotlin.jvm.functions.Function1;
import t01.AbstractC33261g;

/* JADX INFO: renamed from: sy0.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33080c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f137947w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33082e f137948x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f137949y;

    public /* synthetic */ C33080c(C33082e c33082e, Function1 function1, int i13) {
        this.f137947w = i13;
        this.f137948x = c33082e;
        this.f137949y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f137947w;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i13) {
            case 0:
                return AbstractC33081d.m104794d(this.f137948x, this.f137949y, zBooleanValue);
            default:
                return AbstractC33261g.m105527f(this.f137948x, this.f137949y, zBooleanValue);
        }
    }
}
