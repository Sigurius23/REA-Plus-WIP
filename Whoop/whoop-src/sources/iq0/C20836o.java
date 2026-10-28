package iq0;

import java.util.function.Function;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: iq0.o */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20836o implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f78349b;

    public /* synthetic */ C20836o(Function1 function1, int i13) {
        this.f78348a = i13;
        this.f78349b = function1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f78348a) {
            case 0:
                return C20834m.n.m57552k((C20835n) this.f78349b, obj);
            default:
                return C20834m.m57485X0((C20835n) this.f78349b, obj);
        }
    }
}
