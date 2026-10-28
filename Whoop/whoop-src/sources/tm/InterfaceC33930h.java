package tm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: tm.h */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC33930h {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f142179a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: a */
    ByteBuffer mo107334a();

    /* JADX INFO: renamed from: b */
    void mo107335b(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: c */
    void mo107345c();

    /* JADX INFO: renamed from: d */
    boolean mo107336d();

    /* JADX INFO: renamed from: e */
    C33929g mo107346e(C33929g c33929g);

    void flush();

    boolean isActive();

    void reset();
}
