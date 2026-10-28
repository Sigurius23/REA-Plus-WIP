package p451r6;

import androidx.datastore.core.CorruptionException;
import androidx.glance.appwidget.protobuf.AbstractC1411p;
import androidx.glance.appwidget.protobuf.C1409o;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import p007a6.InterfaceC0465y0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r6.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C30972z implements InterfaceC0465y0 {

    /* JADX INFO: renamed from: a */
    public static final C30972z f127724a = new C30972z();

    /* JADX INFO: renamed from: b */
    public static final C30965s f127725b;

    static {
        C30965s c30965sM95250q = C30965s.m95250q();
        AbstractC22676k.m65749i(c30965sM95250q, "getDefaultInstance(...)");
        f127725b = c30965sM95250q;
    }

    @Override // p007a6.InterfaceC0465y0
    /* JADX INFO: renamed from: a */
    public final Object mo1122a() {
        return f127725b;
    }

    @Override // p007a6.InterfaceC0465y0
    /* JADX INFO: renamed from: b */
    public final Object mo1123b(InputStream inputStream) throws CorruptionException {
        try {
            return C30965s.m95251t(inputStream);
        } catch (InvalidProtocolBufferException e5) {
            throw new CorruptionException("Cannot read proto.", e5);
        }
    }

    @Override // p007a6.InterfaceC0465y0
    /* JADX INFO: renamed from: c */
    public final void mo1124c(OutputStream outputStream, Object obj) throws IOException {
        C30965s c30965s = (C30965s) obj;
        c30965s.getClass();
        int iMo4269b = c30965s.mo4269b(null);
        Logger logger = AbstractC1411p.f5953e;
        if (iMo4269b > 4096) {
            iMo4269b = 4096;
        }
        C1409o c1409o = new C1409o(outputStream, iMo4269b);
        c30965s.m4280m(c1409o);
        if (c1409o.f5951i > 0) {
            c1409o.m4495H0();
        }
    }
}
