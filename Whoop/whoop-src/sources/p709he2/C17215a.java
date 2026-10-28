package p709he2;

import android.content.Context;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p725ot1.AbstractC28328d;

/* JADX INFO: renamed from: he2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17215a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f66152w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String[] f66153x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f66154y;

    public /* synthetic */ C17215a(String[] strArr, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f66152w = i13;
        this.f66153x = strArr;
        this.f66154y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f66152w) {
            case 0:
                return AbstractC17217c.m48673i(this.f66153x, this.f66154y, (Context) obj);
            default:
                return AbstractC28328d.m85848i(this.f66153x, this.f66154y, (Context) obj);
        }
    }
}
