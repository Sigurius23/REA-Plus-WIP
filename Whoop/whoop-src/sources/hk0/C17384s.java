package hk0;

import java.nio.ByteBuffer;
import java.util.Iterator;
import lt0.InterfaceC24724a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wj0.EnumC37318b;
import zj0.InterfaceC40722f0;

/* JADX INFO: renamed from: hk0.s */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lhk0/s;", "Lzj0/f0;", "<init>", "()V", "Ljava/nio/ByteBuffer;", "payload", "Llt0/a;", "a", "(Ljava/nio/ByteBuffer;)Llt0/a;", "", "d", "(Ljava/nio/ByteBuffer;)B", "Lwj0/b;", "b", "(Ljava/nio/ByteBuffer;)Lwj0/b;", "", "c", "()I", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17384s implements InterfaceC40722f0 {

    /* JADX INFO: renamed from: b */
    public static final C17384s f67321b = new C17384s();

    private C17384s() {
    }

    @Override // zj0.InterfaceC40722f0
    /* JADX INFO: renamed from: a */
    public InterfaceC24724a mo44950a(ByteBuffer payload) {
        AbstractC22676k.m65750j(payload, "payload");
        return InterfaceC24724a.INSTANCE.m72386b((byte) payload.getShort(20));
    }

    @Override // zj0.InterfaceC40722f0
    /* JADX INFO: renamed from: b */
    public EnumC37318b mo44951b(ByteBuffer payload) {
        Object next;
        AbstractC22676k.m65750j(payload, "payload");
        byte b = (byte) payload.getInt(27);
        Iterator<E> it = EnumC37318b.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((EnumC37318b) next).getByteValue() != b);
        EnumC37318b enumC37318b = (EnumC37318b) next;
        return enumC37318b == null ? EnumC37318b.FAILURE : enumC37318b;
    }

    @Override // zj0.InterfaceC40722f0
    /* JADX INFO: renamed from: c */
    public int mo44952c() {
        return 32;
    }

    @Override // zj0.InterfaceC40722f0
    /* JADX INFO: renamed from: d */
    public byte mo44953d(ByteBuffer payload) {
        AbstractC22676k.m65750j(payload, "payload");
        return (byte) payload.getInt(22);
    }
}
