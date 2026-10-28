package p702ch0;

import android.content.Context;
import c93.InterfaceC4339a;
import java.util.List;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;
import yg0.AbstractC39523b;
import zg0.C40620c;
import zg0.C40625h;

/* JADX INFO: renamed from: ch0.i */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4626i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18656w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18657x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f18658y;

    public /* synthetic */ C4626i(int i13, Object obj, Object obj2) {
        this.f18656w = i13;
        this.f18657x = obj;
        this.f18658y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18656w) {
            case 0:
                return AbstractC4639n.m14474M((C4656v0) this.f18657x, (String) this.f18658y, ((Boolean) obj).booleanValue());
            case 1:
                return AbstractC4653u.m14651q((C40620c) this.f18657x, (Function1) this.f18658y, (InterfaceC26064q) obj);
            case 2:
                return AbstractC4658w0.m14715l((C40625h) this.f18657x, (Context) this.f18658y, (List) obj);
            default:
                return AbstractC4610c1.m14366y((C4656v0) this.f18657x, (InterfaceC4339a) this.f18658y, (AbstractC39523b) obj);
        }
    }
}
