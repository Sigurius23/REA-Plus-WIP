package p093dl;

import android.content.Context;

/* JADX INFO: renamed from: dl.n */
/* JADX INFO: loaded from: classes.dex */
public final class C12149n implements InterfaceC12156u {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40397a;

    /* JADX INFO: renamed from: b */
    public final Context f40398b;

    public /* synthetic */ C12149n(Context context, int i13) {
        this.f40397a = i13;
        this.f40398b = context;
    }

    @Override // p093dl.InterfaceC12156u
    /* JADX INFO: renamed from: a */
    public final InterfaceC12155t mo33589a(C12161z c12161z) {
        switch (this.f40397a) {
            case 0:
                return new C12151p(this.f40398b, 0);
            case 1:
                return new C12151p(this.f40398b, 1);
            default:
                return new C12151p(this.f40398b, 2);
        }
    }
}
