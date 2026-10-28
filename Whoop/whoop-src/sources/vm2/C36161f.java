package vm2;

import com.whoop.appconfiguration.TabConfiguration;
import j02.AbstractC21155m0;
import ji0.InterfaceC21718f;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vm2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lvm2/f;", "", "Lji0/f;", "bffBottomNavConfigSource", "Lvm2/a;", "appConfigurationTabResolver", "", "homeGraphStartDestinationId", "<init>", "(Lji0/f;Lvm2/a;I)V", "Lj02/m0;", "a", "()Lj02/m0;", "Lji0/f;", "b", "Lvm2/a;", "c", "I", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36161f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21718f bffBottomNavConfigSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36156a appConfigurationTabResolver;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int homeGraphStartDestinationId;

    public C36161f(InterfaceC21718f bffBottomNavConfigSource, C36156a appConfigurationTabResolver, int i13) {
        AbstractC22676k.m65750j(bffBottomNavConfigSource, "bffBottomNavConfigSource");
        AbstractC22676k.m65750j(appConfigurationTabResolver, "appConfigurationTabResolver");
        this.bffBottomNavConfigSource = bffBottomNavConfigSource;
        this.appConfigurationTabResolver = appConfigurationTabResolver;
        this.homeGraphStartDestinationId = i13;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC21155m0 m115100a() {
        AbstractC21155m0 abstractC21155m0M115012a;
        TabConfiguration tabConfigurationMo61186b = this.bffBottomNavConfigSource.mo61186b();
        if (tabConfigurationMo61186b == null || (abstractC21155m0M115012a = this.appConfigurationTabResolver.m115012a(tabConfigurationMo61186b)) == null) {
            return null;
        }
        return AbstractC36160e.m115099a(abstractC21155m0M115012a, new C12997x0(false, false, this.homeGraphStartDestinationId, true, false, -1, -1, -1, -1));
    }
}
