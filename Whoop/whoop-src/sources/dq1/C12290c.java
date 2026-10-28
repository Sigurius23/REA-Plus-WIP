package dq1;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: dq1.c */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12290c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f41159w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12291d f41160x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f41161y;

    public /* synthetic */ C12290c(C12291d c12291d, List list, int i13) {
        this.f41159w = i13;
        this.f41160x = c12291d;
        this.f41161y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f41159w) {
            case 0:
                return this.f41160x.m34219o(this.f41161y, (InterfaceC30057d) obj);
            default:
                return this.f41160x.m34218n(this.f41161y, (InterfaceC33687a) obj);
        }
    }
}
