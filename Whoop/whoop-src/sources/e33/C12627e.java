package e33;

import l83.C23454a0;
import org.webrtc.MediaStream;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import stream.video.sfu.models.TrackInfo;

/* JADX INFO: renamed from: e33.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C12627e extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C12627e f43128x;

    /* JADX INFO: renamed from: y */
    public static final C12627e f43129y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43130w;

    static {
        int i13 = 1;
        f43128x = new C12627e(i13, 0);
        f43129y = new C12627e(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12627e(int i13, int i14) {
        super(i13);
        this.f43130w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f43130w) {
            case 0:
                TrackInfo it = (TrackInfo) obj;
                AbstractC22676k.m65750j(it, "it");
                return it.toString();
            case 1:
                AbstractC22676k.m65750j((MediaStream) obj, "<anonymous parameter 0>");
                return C23454a0.f92919a;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                AbstractC22676k.m65750j(null, "it");
                throw null;
        }
    }
}
