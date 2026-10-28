package h22;

import d22.InterfaceC11511b;
import g22.InterfaceC15282b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h22.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lh22/a;", "", "<init>", "()V", "Ld22/b;", "domainResult", "Lg22/b;", "a", "(Ld22/b;)Lg22/b;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16782a {
    /* JADX INFO: renamed from: a */
    public final InterfaceC15282b m47333a(InterfaceC11511b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult.equals(InterfaceC11511b.a.f37040a)) {
            return InterfaceC15282b.a.f57381a;
        }
        if (domainResult.equals(InterfaceC11511b.b.f37041a)) {
            return InterfaceC15282b.b.f57382a;
        }
        if (domainResult instanceof InterfaceC11511b.c) {
            return new InterfaceC15282b.c(AbstractC16783b.m47334a(((InterfaceC11511b.c) domainResult).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()));
        }
        if (domainResult.equals(InterfaceC11511b.d.f37043a)) {
            return InterfaceC15282b.d.f57384a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
