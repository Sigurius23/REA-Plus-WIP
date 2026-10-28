package a53;

import at.C1977u;
import at.C1981y;
import io.sentry.internal.debugmeta.C20378c;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C0403b extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1383a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1384b;

    public /* synthetic */ C0403b(Object obj, int i13) {
        this.f1383a = i13;
        this.f1384b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1383a) {
            case 0:
                return ((AbstractC22680m) ((C20378c) this.f1384b).f76422x).invoke();
            default:
                C1981y c1981y = (C1981y) this.f1384b;
                try {
                    C1977u c1977u = C1977u.f7820c;
                    Mac mac = (Mac) c1977u.f7825a.m6025a(c1981y.f7836b);
                    mac.init(c1981y.f7837c);
                    return mac;
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
        }
    }
}
