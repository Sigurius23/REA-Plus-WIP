package e33;

import j33.AbstractC21300d;
import org.webrtc.RtpParameters;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: e33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C12621b extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C12621b f43120w = new C12621b(1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RtpParameters.Encoding encoding = (RtpParameters.Encoding) obj;
        AbstractC22676k.m65747g(encoding);
        return AbstractC21300d.m59807d(encoding);
    }
}
