package p702ch0;

import android.net.Uri;
import c93.InterfaceC4351m;
import p668z1.C39970s;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ch0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4611d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18595w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18596x;

    public /* synthetic */ C4611d(Object obj, int i13) {
        this.f18595w = i13;
        this.f18596x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18595w) {
            case 0:
                return AbstractC4639n.m14472K((C39970s) this.f18596x, (String) obj, ((Float) obj2).floatValue());
            default:
                return Function1.m14414W((Function1) this.f18596x, (Uri) obj, (String) obj2);
        }
    }
}
