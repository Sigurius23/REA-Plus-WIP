package okhttp3.internal.platform;

import android.content.Context;
import fe3.AbstractC14421e;
import fe3.InterfaceC14420d;
import java.util.List;
import m83.C25271y;
import p644yb.InterfaceC39377b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lyb/b;", "Lfe3/e;", "<init>", "()V", "okhttp"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PlatformInitializer implements InterfaceC39377b {
    @Override // p644yb.InterfaceC39377b
    public final Object create(Context context) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
        Object obj = AbstractC14421e.f52594a;
        InterfaceC14420d interfaceC14420d = obj != null ? (InterfaceC14420d) obj : null;
        if (interfaceC14420d != null) {
            interfaceC14420d.mo41114b(context);
        }
        return AbstractC14421e.f52594a;
    }

    @Override // p644yb.InterfaceC39377b
    public final List dependencies() {
        return C25271y.f99162w;
    }
}
