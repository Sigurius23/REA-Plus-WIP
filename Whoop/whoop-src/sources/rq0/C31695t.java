package rq0;

import android.graphics.Bitmap;
import com.whoop.community.presentation.teams.C6376c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: rq0.t */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31695t implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131221w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C6376c f131222x;

    public /* synthetic */ C31695t(C6376c c6376c, int i13) {
        this.f131221w = i13;
        this.f131222x = c6376c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f131221w) {
            case 0:
                return C6376c.m19501c0(this.f131222x, ((Integer) obj).intValue());
            default:
                return C6376c.m19499a0(this.f131222x, (Bitmap) obj);
        }
    }
}
