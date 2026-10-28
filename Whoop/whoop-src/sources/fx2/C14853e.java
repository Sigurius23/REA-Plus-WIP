package fx2;

import com.whoop.whooplabs.data.room.entity.WhoopLabsStudy;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fx2.e */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C14853e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55432w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14855g f55433x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ WhoopLabsStudy f55434y;

    public /* synthetic */ C14853e(C14855g c14855g, WhoopLabsStudy whoopLabsStudy, int i13) {
        this.f55432w = i13;
        this.f55433x = c14855g;
        this.f55434y = whoopLabsStudy;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55432w) {
            case 0:
                return this.f55433x.m42843b1(this.f55434y, (InterfaceC33687a) obj);
            default:
                return this.f55433x.m42837Y0(this.f55434y, (InterfaceC33687a) obj);
        }
    }
}
