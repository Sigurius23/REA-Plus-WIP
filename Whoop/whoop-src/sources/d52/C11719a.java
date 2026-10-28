package d52;

import lt0.AbstractC24726c;
import lt0.C24736m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pk0.InterfaceC29333c;
import st0.EnumC32978v;

/* JADX INFO: renamed from: d52.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Ld52/a;", "", "Lpk0/c;", "commandResponseParser", "dataPacketParser", "eventPacketParser", "<init>", "(Lpk0/c;Lpk0/c;Lpk0/c;)V", "", "data", "Llt0/c;", "a", "([B)Llt0/c;", "Llt0/m;", "b", "([B)Llt0/m;", "c", "Lpk0/c;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11719a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC29333c commandResponseParser;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC29333c dataPacketParser;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC29333c eventPacketParser;

    public C11719a(InterfaceC29333c commandResponseParser, InterfaceC29333c dataPacketParser, InterfaceC29333c eventPacketParser) {
        AbstractC22676k.m65750j(commandResponseParser, "commandResponseParser");
        AbstractC22676k.m65750j(dataPacketParser, "dataPacketParser");
        AbstractC22676k.m65750j(eventPacketParser, "eventPacketParser");
        this.commandResponseParser = commandResponseParser;
        this.dataPacketParser = dataPacketParser;
        this.eventPacketParser = eventPacketParser;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC24726c m31325a(byte[] data) {
        AbstractC22676k.m65750j(data, "data");
        C24736m c24736mMo89258a = this.commandResponseParser.mo89258a(data, EnumC32978v.PUFFIN);
        if (c24736mMo89258a != null) {
            return c24736mMo89258a.getPacket();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C24736m m31326b(byte[] data) {
        AbstractC22676k.m65750j(data, "data");
        return this.dataPacketParser.mo89258a(data, EnumC32978v.PUFFIN);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC24726c m31327c(byte[] data) {
        AbstractC22676k.m65750j(data, "data");
        C24736m c24736mMo89258a = this.eventPacketParser.mo89258a(data, EnumC32978v.PUFFIN);
        if (c24736mMo89258a != null) {
            return c24736mMo89258a.getPacket();
        }
        return null;
    }
}
