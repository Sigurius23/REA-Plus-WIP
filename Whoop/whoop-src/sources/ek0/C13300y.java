package ek0;

import java.nio.ByteBuffer;
import ot0.C28323a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wj0.AbstractC37317a;

/* JADX INFO: renamed from: ek0.y */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b!\u0010\u0013¨\u0006%"}, m65681d2 = {"Lek0/y;", "Lot0/a;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "Ltr2/n;", "e", "Ltr2/n;", "logger", "", "U", "()J", "flashBacklogInPages", "", "V", "()F", "flashBacklogInTenthsPercent", "", "W", "()I", "flashStatus", "T", "chargingStatus", "Y", "wristState", "", "Z", "()Z", "isOnWrist", "X", "socInTenthsPercent", "f", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13300y extends C28323a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13300y(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
        this.logger = InterfaceC34116n.INSTANCE.m107848a("StrapConditionReportEventPacket");
    }

    /* JADX INFO: renamed from: T */
    private final int m37340T() {
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        return AbstractC37317a.m119536a(byteBufferM85784Q.get(9));
    }

    /* JADX INFO: renamed from: U */
    private final long m37341U() {
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        return AbstractC37317a.m119538c(byteBufferM85784Q.getInt(0));
    }

    /* JADX INFO: renamed from: V */
    private final float m37342V() {
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        return AbstractC37317a.m119537b(byteBufferM85784Q.getShort(4)) / 10.0f;
    }

    /* JADX INFO: renamed from: W */
    private final int m37343W() {
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        return AbstractC37317a.m119536a(byteBufferM85784Q.get(8));
    }

    /* JADX INFO: renamed from: Y */
    private final int m37344Y() {
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        return AbstractC37317a.m119536a(byteBufferM85784Q.get(10));
    }

    /* JADX INFO: renamed from: X */
    public final float m37345X() {
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        return AbstractC37317a.m119537b(byteBufferM85784Q.getShort(6)) / 10.0f;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m37346Z() {
        return m37344Y() == 1;
    }

    @Override // ot0.C28323a, lt0.AbstractC24726c
    public String toString() {
        try {
            return "BLE - Strap Condition Report | Flash backlog in pages: " + m37341U() + " | Flash backlog in tenths: " + m37342V() + " | SOC in tenths: " + m37345X() + " | Flash status: " + m37343W() + " | Charging status (tri-state): " + m37340T() + " |  Wrist State (tri-state): " + m37344Y();
        } catch (Exception e5) {
            this.logger.mo85222m(AbstractC2875y.m8297j(e5, "Caught an exception when trying to parse StrapConditionReportEventPacket: "), new AbstractC30556a.a[0]);
            return super.toString();
        }
    }
}
