package rb3;

import m83.AbstractC25236b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rb3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C31194b extends AbstractC25236b {

    /* JADX INFO: renamed from: y */
    public int f128517y = -1;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C31195c f128518z;

    public C31194b(C31195c c31195c) {
        this.f128518z = c31195c;
    }

    @Override // m83.AbstractC25236b
    /* JADX INFO: renamed from: a */
    public final void mo73981a() {
        int i13;
        Object[] objArr;
        do {
            i13 = this.f128517y + 1;
            this.f128517y = i13;
            objArr = this.f128518z.f128519w;
            if (i13 >= objArr.length) {
                break;
            }
        } while (objArr[i13] == null);
        if (i13 >= objArr.length) {
            this.f99114w = 2;
            return;
        }
        Object obj = objArr[i13];
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f99115x = obj;
        this.f99114w = 1;
    }
}
