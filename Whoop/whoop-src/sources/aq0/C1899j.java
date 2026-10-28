package aq0;

import be1.C3169c;
import bi2.C3294j;
import java.util.function.Function;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: aq0.j */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C1899j implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f7457b;

    public /* synthetic */ C1899j(Function1 function1, int i13) {
        this.f7456a = i13;
        this.f7457b = function1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f7456a) {
            case 0:
                return C1906q.m5683D1((C1890a) this.f7457b, obj);
            default:
                return C3294j.m9585e((C3169c) this.f7457b, obj);
        }
    }
}
