package ju1;

import com.whoop.labradorService.domain.exception.LabradorServiceException;
import fu1.InterfaceC14782a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zj0.C40727h;

/* JADX INFO: renamed from: ju1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0000\"\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"", "Lzj0/h;", "commandResponsePacket", "Lfu1/a;", "a", "([Lzj0/h;)Lfu1/a;", "labrador-service_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21962b {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC14782a m62708a(C40727h... commandResponsePacket) throws LabradorServiceException.LabradorCommandFailure {
        AbstractC22676k.m65750j(commandResponsePacket, "commandResponsePacket");
        for (C40727h c40727h : commandResponsePacket) {
            if (c40727h == null || !c40727h.m132198W()) {
                throw new LabradorServiceException.LabradorCommandFailure(null, 1, null);
            }
        }
        return InterfaceC14782a.a.f54811a;
    }
}
