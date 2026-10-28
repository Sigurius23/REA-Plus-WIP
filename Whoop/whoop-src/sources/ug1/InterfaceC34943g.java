package ug1;

import java.io.File;
import java.nio.ByteBuffer;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ug1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019À\u0006\u0003"}, m65681d2 = {"Lug1/g;", "", "Ljava/io/File;", "file", "", "useFileLength", "Ll83/a0;", "b", "(Ljava/io/File;ZLq83/d;)Ljava/lang/Object;", "Ljava/nio/ByteBuffer;", "destBuffer", "", "destOffset", "byteCount", "e", "(Ljava/nio/ByteBuffer;IILq83/d;)Ljava/lang/Object;", "c", "(Lq83/d;)Ljava/lang/Object;", "position", "d", "(ILq83/d;)Ljava/lang/Object;", "a", "getLength", "()I", "length", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC34943g {
    /* JADX INFO: renamed from: a */
    Object mo110373a(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo110374b(File file, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo110375c(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    Object mo110376d(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: e */
    Object mo110377e(ByteBuffer byteBuffer, int i13, int i14, InterfaceC30057d<? super Integer> interfaceC30057d);

    int getLength();
}
