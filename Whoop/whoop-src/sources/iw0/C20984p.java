package iw0;

import c93.InterfaceC4339a;
import java.util.List;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: iw0.p */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20984p implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79285w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f79286x;

    public /* synthetic */ C20984p(Object obj, int i13) {
        this.f79285w = i13;
        this.f79286x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f79285w) {
            case 0:
                return AbstractC20992x.m58382R0((List) this.f79286x, (InterfaceC26064q) obj);
            default:
                return AbstractC20962c0.m58258o((InterfaceC4339a) this.f79286x, obj);
        }
    }
}
