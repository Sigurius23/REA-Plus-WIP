package xj0;

import dk0.InterfaceC12103c;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;
import wj0.EnumC37318b;

/* JADX INFO: renamed from: xj0.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Ldk0/c;", "endPacket", "Lst0/v;", "deviceType", "Lxj0/q;", "d", "(Ldk0/c;Lst0/v;)Lxj0/q;", "c", "(Lst0/v;)Lxj0/q;", "Ljava/nio/ByteBuffer;", "b", "(Ldk0/c;)Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38379r {
    /* JADX INFO: renamed from: a */
    private static final ByteBuffer m122937a() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(9).order(AbstractC24727d.m72403a());
        byteBufferOrder.put(EnumC37318b.FAILURE.getByteValue());
        byteBufferOrder.put(new byte[4]);
        byteBufferOrder.put(new byte[4]);
        byteBufferOrder.rewind();
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: b */
    private static final ByteBuffer m122938b(InterfaceC12103c interfaceC12103c) {
        byte[] bArrMo33436w;
        byte[] bArrMo33434e = interfaceC12103c.mo33434e();
        if (bArrMo33434e == null || (bArrMo33436w = interfaceC12103c.mo33436w()) == null) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(9).order(AbstractC24727d.m72403a());
        byteBufferOrder.put(EnumC37318b.SUCCESS.getByteValue());
        byteBufferOrder.put(bArrMo33434e);
        byteBufferOrder.put(bArrMo33436w);
        byteBufferOrder.rewind();
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: c */
    public static final C38377q m122939c(EnumC32978v deviceType) {
        AbstractC22676k.m65750j(deviceType, "deviceType");
        return new C38377q(m122937a(), deviceType);
    }

    /* JADX INFO: renamed from: d */
    public static final C38377q m122940d(InterfaceC12103c endPacket, EnumC32978v deviceType) {
        AbstractC22676k.m65750j(endPacket, "endPacket");
        AbstractC22676k.m65750j(deviceType, "deviceType");
        ByteBuffer byteBufferM122938b = m122938b(endPacket);
        if (byteBufferM122938b == null) {
            return null;
        }
        return new C38377q(byteBufferM122938b, deviceType);
    }
}
