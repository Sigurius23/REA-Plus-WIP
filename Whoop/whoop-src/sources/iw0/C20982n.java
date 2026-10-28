package iw0;

import androidx.compose.runtime.Composer;
import com.whoop.design.util.TextResource;
import java.util.List;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC22997s1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: iw0.n */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20982n implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79281w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f79282x;

    public /* synthetic */ C20982n(Object obj, int i13) {
        this.f79281w = i13;
        this.f79282x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f79281w) {
            case 0:
                return AbstractC20992x.m58338B0((List) this.f79282x, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC20992x.m58452r1((TextResource) this.f79282x, (InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
