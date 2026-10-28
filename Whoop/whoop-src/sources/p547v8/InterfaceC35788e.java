package p547v8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: v8.e */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC35788e {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f152198a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: a */
    ByteBuffer mo31606a();

    /* JADX INFO: renamed from: b */
    void mo31596b(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: c */
    void mo113437c();

    /* JADX INFO: renamed from: d */
    boolean mo31607d();

    /* JADX INFO: renamed from: e */
    C35787d mo113438e(C35787d c35787d);

    void flush();

    boolean isActive();

    void reset();
}
