package pj2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import r90.AbstractC31099f;

/* JADX INFO: renamed from: pj2.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29311j implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f118682E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118683w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f118684x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f118685y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f118686z;

    public /* synthetic */ C29311j(Function1 function1, String str, String str2, boolean z4) {
        this.f118684x = function1;
        this.f118685y = str;
        this.f118686z = str2;
        this.f118682E = z4;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f118683w) {
            case 0:
                return AbstractC29318q.m89118O(this.f118684x, this.f118682E, this.f118685y, this.f118686z);
            default:
                return AbstractC31099f.m95802y(this.f118684x, this.f118685y, this.f118686z, this.f118682E);
        }
    }

    public /* synthetic */ C29311j(Function1 function1, boolean z4, String str, String str2) {
        this.f118684x = function1;
        this.f118682E = z4;
        this.f118685y = str;
        this.f118686z = str2;
    }
}
