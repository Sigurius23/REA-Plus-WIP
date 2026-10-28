package nt0;

import lt0.C24725b;
import lt0.C24736m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: nt0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lnt0/b;", "Lnt0/h;", "Lst0/v;", "strapGen", "Llt0/m;", "receivedPacket", "Llt0/b;", "dataPacket", "<init>", "(Lst0/v;Llt0/m;Llt0/b;)V", "", "v", "I", "c0", "()I", "expectedPacketLength", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27114b extends AbstractC27120h {

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int expectedPacketLength;

    /* JADX INFO: renamed from: nt0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f108371a;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f108371a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27114b(EnumC32978v strapGen, C24736m receivedPacket, C24725b dataPacket) {
        int i13;
        super(receivedPacket, dataPacket, null);
        AbstractC22676k.m65750j(strapGen, "strapGen");
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(dataPacket, "dataPacket");
        switch (a.f108371a[strapGen.ordinal()]) {
            case 1:
                i13 = 1932;
                break;
            case 2:
            case 3:
                i13 = 1936;
                break;
            case 4:
                i13 = 0;
                break;
            case 5:
            case 6:
                throw new IllegalStateException("R11 is not a Castle packet type; Castle uses Rev2PacketType. Check dispatch site.");
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.expectedPacketLength = i13;
    }

    @Override // nt0.AbstractC27120h
    /* JADX INFO: renamed from: c0, reason: from getter */
    public int getExpectedPacketLength() {
        return this.expectedPacketLength;
    }
}
