package rb3;

import cb3.AbstractC4393e;
import ha3.C17062e;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rb3.w */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC31215w implements InterfaceC31197e {

    /* JADX INFO: renamed from: a */
    public final Function1 f128579a;

    /* JADX INFO: renamed from: b */
    public final String f128580b;

    public AbstractC31215w(String str, Function1 function1) {
        this.f128579a = function1;
        this.f128580b = "must return ".concat(str);
    }

    @Override // rb3.InterfaceC31197e
    /* JADX INFO: renamed from: a */
    public final boolean mo96148a(C17062e c17062e) {
        return AbstractC22676k.m65745e(c17062e.f146194H, this.f128579a.invoke(AbstractC4393e.m13807e(c17062e)));
    }

    @Override // rb3.InterfaceC31197e
    /* JADX INFO: renamed from: b */
    public final /* bridge */ String mo96149b(C17062e c17062e) {
        return AbstractC35785b.m113385H(this, c17062e);
    }

    @Override // rb3.InterfaceC31197e
    public final String getDescription() {
        return this.f128580b;
    }
}
