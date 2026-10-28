package e33;

import org.webrtc.PeerConnection;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: e33.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12632g0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C12632g0 f43141w = new C12632g0(1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string = ((PeerConnection.IceServer) obj).toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
