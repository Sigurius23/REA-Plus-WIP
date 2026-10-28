package p702ch0;

import android.content.Context;
import android.net.Uri;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ch0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4608c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18535w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18536x;

    public /* synthetic */ C4608c(Object obj, int i13) {
        this.f18535w = i13;
        this.f18536x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18535w) {
            case 0:
                return AbstractC4639n.m14471J((InterfaceC28601c1) this.f18536x, (InterfaceC39147y) obj);
            default:
                return Long.valueOf(AbstractC4658w0.m14716m((Context) this.f18536x, (Uri) obj));
        }
    }
}
