package ph2;

import lu0.C24747c;
import oh2.C27940c;
import oh2.C27941d;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ph2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Llu0/c;", "", "useFirmwareVersionString", "Loh2/d;", "a", "(Llu0/c;Z)Loh2/d;", "strap-metadata_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29248a {
    /* JADX INFO: renamed from: a */
    public static final C27941d m88851a(C24747c c24747c, boolean z4) {
        AbstractC22676k.m65750j(c24747c, "<this>");
        C27941d c27941dM84350c = C27941d.m84339b().m84352e(C27940c.INSTANCE.m84337a().m84334b(c24747c.getHardwareFamily()).m84336d(c24747c.getPcbaRevision()).m84335c(c24747c.getOpticalRevision()).m84333a()).m84351d(z4 ? c24747c.getFirmwareVersion() : new InterfaceC27939b.b(c24747c.getFirmwareMajor(), c24747c.getFirmwareMinor(), c24747c.getFirmwareBuild(), c24747c.getFirmwareUnreleased())).m84353f(C27942e.m84355a().m84362b((short) c24747c.getSigProcMajor()).m84363c((short) c24747c.getSigProcMinor()).m84364d((short) c24747c.getSigProcPatch()).m84361a()).m84349b((byte) c24747c.getBinaryVersion()).m84348a((byte) c24747c.getBinaryFlags()).m84354g(c24747c.getStrapId()).m84350c();
        AbstractC22676k.m65749i(c27941dM84350c, "build(...)");
        return c27941dM84350c;
    }
}
