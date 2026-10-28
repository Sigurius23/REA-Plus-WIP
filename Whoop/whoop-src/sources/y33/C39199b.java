package y33;

import c93.InterfaceC4339a;
import io.getstream.android.video.generated.apis.ProductvideoApi;
import io.getstream.android.video.generated.infrastructure.Serializer;
import p441qx.C30722l0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pg3.C29222x0;
import pg3.C29224y0;
import tg3.C33800a;
import ug3.C34954c;

/* JADX INFO: renamed from: y33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C39199b extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f168471w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39200c f168472x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39199b(C39200c c39200c, int i13) {
        super(0);
        this.f168471w = i13;
        this.f168472x = c39200c;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f168471w) {
            case 0:
                Object value = this.f168472x.f168478f.getValue();
                AbstractC22676k.m65749i(value, "getValue(...)");
                return (ProductvideoApi) ((C29224y0) value).m88733b(ProductvideoApi.class);
            default:
                C29222x0 c29222x0 = new C29222x0();
                C39200c c39200c = this.f168472x;
                c29222x0.m88729c(c39200c.f168475c);
                c29222x0.m88728b(new C34954c(0));
                C30722l0 moshi = Serializer.getMoshi();
                if (moshi == null) {
                    throw new NullPointerException("moshi == null");
                }
                c29222x0.m88728b(new C33800a(moshi));
                c29222x0.m88731e(c39200c.f168479g);
                return c29222x0.m88730d();
        }
    }
}
