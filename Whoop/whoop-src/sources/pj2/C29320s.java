package pj2;

import c93.InterfaceC4339a;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import zr1.AbstractC41069c;

/* JADX INFO: renamed from: pj2.s */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29320s implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118755w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f118756x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f118757y;

    public /* synthetic */ C29320s(List list, int i13, Function1 function1) {
        this.f118755w = i13;
        this.f118756x = function1;
        this.f118757y = list;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f118755w) {
            case 0:
                return AbstractC29321t.m89202M(this.f118756x, this.f118757y);
            case 1:
                return AbstractC29321t.m89198I(this.f118756x, this.f118757y);
            default:
                return AbstractC41069c.m133355w(this.f118756x, this.f118757y);
        }
    }
}
