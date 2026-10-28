package vm2;

import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.navigation.C9598e;
import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import o02.InterfaceC27353d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: vm2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lvm2/a;", "", "Lo02/d;", "navigationReducer", "Ltr2/n;", "logger", "<init>", "(Lo02/d;Ltr2/n;)V", "Lcom/whoop/appconfiguration/TabConfiguration;", "tab", "Lj02/m0;", "a", "(Lcom/whoop/appconfiguration/TabConfiguration;)Lj02/m0;", "Lo02/d;", "b", "Ltr2/n;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36156a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C36156a(InterfaceC27353d navigationReducer, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigationReducer = navigationReducer;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC21155m0 m115012a(TabConfiguration tab) {
        AbstractC22676k.m65750j(tab, "tab");
        C9598e destination = tab.getDestination();
        if (destination == null) {
            this.logger.mo85226q(AbstractC11895b.m31996o("No destination configured for tab '", tab.getId(), "'"), new AbstractC30556a.a[0]);
            return null;
        }
        InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(destination.getParameters());
        AbstractC21155m0 abstractC21155m0 = interfaceC21134cMo67681a instanceof AbstractC21155m0 ? (AbstractC21155m0) interfaceC21134cMo67681a : null;
        if (abstractC21155m0 != null) {
            return abstractC21155m0;
        }
        this.logger.mo85226q("NavigationReducer could not map " + destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() + " for tab '" + tab.getId() + "'", new AbstractC30556a.a[0]);
        return null;
    }

    public /* synthetic */ C36156a(InterfaceC27353d interfaceC27353d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC27353d, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AppConfigurationTabResolver") : interfaceC34116n);
    }
}
