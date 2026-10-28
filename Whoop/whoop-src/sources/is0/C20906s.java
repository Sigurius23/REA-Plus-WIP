package is0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: is0.s */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20906s implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78749w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f78750x;

    public /* synthetic */ C20906s(Object obj, int i13) {
        this.f78749w = i13;
        this.f78750x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f78749w) {
            case 0:
                return AbstractC20916x.m57938U((InterfaceC4339a) this.f78750x, (InterfaceC39133t0) obj, (InterfaceC39124q0) obj2, (C39169a) obj3);
            default:
                return AbstractC20903q0.m57892q((TextResource) this.f78750x, (C20878e) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
