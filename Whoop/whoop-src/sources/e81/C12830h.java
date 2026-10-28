package e81;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import i21.AbstractC17993c;
import i21.InterfaceC18002l;
import p730qt2.AbstractC30600f;
import p730qt2.C30597d;
import y11.C39065r;

/* JADX INFO: renamed from: e81.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12830h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f43985E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43986w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f43987x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f43988y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f43989z;

    public /* synthetic */ C12830h(int i13, long j7, Object obj, Object obj2, Object obj3) {
        this.f43986w = i13;
        this.f43988y = obj;
        this.f43989z = obj2;
        this.f43985E = obj3;
        this.f43987x = j7;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43986w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC12836k.m35983P((C12816a) this.f43988y, (EnumC12838l) this.f43989z, (EnumC12839m) this.f43985E, this.f43987x, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC17993c.m51606j((InterfaceC18002l.a) this.f43988y, (TextResource) this.f43989z, this.f43987x, (C39065r) this.f43985E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC30600f.m93880i((C30597d) this.f43988y, (String) this.f43989z, (String) this.f43985E, this.f43987x, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C12830h(InterfaceC18002l.a aVar, TextResource textResource, long j7, C39065r c39065r) {
        this.f43986w = 1;
        this.f43988y = aVar;
        this.f43989z = textResource;
        this.f43987x = j7;
        this.f43985E = c39065r;
    }
}
