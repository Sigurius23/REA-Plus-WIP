package od1;

import bh3.InterfaceC3255b;
import com.whoop.domain.model.Login;
import java.util.List;

/* JADX INFO: renamed from: od1.r */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C27855r implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112218w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27856s f112219x;

    public /* synthetic */ C27855r(C27856s c27856s, int i13) {
        this.f112218w = i13;
        this.f112219x = c27856s;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f112218w) {
            case 0:
                this.f112219x.m84013l((List) obj);
                break;
            case 1:
                this.f112219x.m84014m((Throwable) obj);
                break;
            case 2:
                this.f112219x.m84011j((Login) obj);
                break;
            default:
                this.f112219x.m84012k((Throwable) obj);
                break;
        }
    }
}
