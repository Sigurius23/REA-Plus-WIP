package p709he2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p725ot1.Function1;

/* JADX INFO: renamed from: he2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17220f implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f66162E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f66163w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f66164x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f66165y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f66166z;

    public /* synthetic */ C17220f(TextResource textResource, String str, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f66163w = i14;
        this.f66164x = textResource;
        this.f66165y = str;
        this.f66166z = interfaceC4339a;
        this.f66162E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f66163w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return Function1.m48704R(this.f66164x, this.f66165y, this.f66166z, this.f66162E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return Function1.m85812X(this.f66164x, this.f66165y, this.f66166z, this.f66162E, (Composer) obj, iIntValue2);
        }
    }
}
