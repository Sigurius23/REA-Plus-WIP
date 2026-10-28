package h01;

import java.util.ArrayList;
import java.util.List;
import p134f2.C14015d;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h01.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16543j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63650w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f63651x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f63652y;

    public /* synthetic */ C16543j(int i13, List list, boolean z4) {
        this.f63650w = i13;
        this.f63651x = z4;
        this.f63652y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f63650w) {
            case 0:
                return AbstractC16549p.m46787u(this.f63651x, (ArrayList) this.f63652y, (C14015d) obj);
            default:
                return AbstractC16549p.m46788v(this.f63651x, this.f63652y, (InterfaceC22129c) obj);
        }
    }
}
