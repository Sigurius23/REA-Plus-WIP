package fx2;

import com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fx2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C14851c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55426w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14855g f55427x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ WhoopLabsHrDevice f55428y;

    public /* synthetic */ C14851c(C14855g c14855g, WhoopLabsHrDevice whoopLabsHrDevice, int i13) {
        this.f55426w = i13;
        this.f55427x = c14855g;
        this.f55428y = whoopLabsHrDevice;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55426w) {
            case 0:
                return this.f55427x.m42831V0(this.f55428y, (InterfaceC33687a) obj);
            default:
                return this.f55427x.m42867z0(this.f55428y, (InterfaceC33687a) obj);
        }
    }
}
