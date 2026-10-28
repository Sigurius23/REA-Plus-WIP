package or2;

import android.net.Uri;
import android.os.Bundle;
import com.mapbox.common.MapboxServices;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p114eb.AbstractC12939a0;
import p114eb.C12977n0;
import p114eb.C12997x0;
import p114eb.InterfaceC12981p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.s */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)¨\u0006+"}, m65681d2 = {"Lor2/s;", "", "Leb/a0;", "underlyingNavController", "Lor2/t;", "currentDestinationHoldingStore", "<init>", "(Leb/a0;Lor2/t;)V", "", "resId", "Ll83/a0;", "b", "(I)V", "Landroid/os/Bundle;", "args", "Leb/x0;", "navOptions", "c", "(ILandroid/os/Bundle;Leb/x0;)V", "", "deepLink", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)V", "Landroid/net/Uri;", "d", "(Landroid/net/Uri;)V", "e", "(Landroid/net/Uri;Leb/x0;)V", "Leb/p0;", MapboxServices.DIRECTIONS, "f", "(Leb/p0;)V", "g", "(Leb/p0;Leb/x0;)V", "", "i", "()Z", "a", "Leb/a0;", "Lor2/t;", "Ltr2/n;", "Ltr2/n;", "logger", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28198s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 underlyingNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28201t currentDestinationHoldingStore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C28198s(AbstractC12939a0 underlyingNavController, C28201t currentDestinationHoldingStore) {
        AbstractC22676k.m65750j(underlyingNavController, "underlyingNavController");
        AbstractC22676k.m65750j(currentDestinationHoldingStore, "currentDestinationHoldingStore");
        this.underlyingNavController = underlyingNavController;
        this.currentDestinationHoldingStore = currentDestinationHoldingStore;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("CurrentDestinationCheckingNavController");
    }

    /* JADX INFO: renamed from: b */
    public final void m85336b(int resId) {
        C12977n0 c12977n0M36394i = this.underlyingNavController.m36394i();
        if ((c12977n0M36394i != null ? Integer.valueOf(c12977n0M36394i.f44819H) : null) == null) {
            this.logger.mo85222m("Could not navigate - current nav controller destination is null", new AbstractC30556a.a[0]);
            return;
        }
        Integer numM85348g = this.currentDestinationHoldingStore.m85348g();
        C12977n0 c12977n0M36394i2 = this.underlyingNavController.m36394i();
        Integer numValueOf = c12977n0M36394i2 != null ? Integer.valueOf(c12977n0M36394i2.f44819H) : null;
        AbstractC22676k.m65747g(numValueOf);
        int iIntValue = numValueOf.intValue();
        if (numM85348g == null) {
            this.currentDestinationHoldingStore.m85349j(numValueOf);
            this.underlyingNavController.m36401p(resId, null, null);
        } else {
            if (numM85348g.intValue() == iIntValue) {
                this.underlyingNavController.m36401p(resId, null, null);
                return;
            }
            this.logger.mo85222m("Failed to safely navigate, savedCurrentDestinationId: " + numM85348g + " != currentDestinationId: " + iIntValue, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m85337c(int resId, Bundle args, C12997x0 navOptions) {
        C12977n0 c12977n0M36394i = this.underlyingNavController.m36394i();
        if ((c12977n0M36394i != null ? Integer.valueOf(c12977n0M36394i.f44819H) : null) == null) {
            this.logger.mo85222m("Could not navigate - current nav controller destination is null", new AbstractC30556a.a[0]);
            return;
        }
        Integer numM85348g = this.currentDestinationHoldingStore.m85348g();
        C12977n0 c12977n0M36394i2 = this.underlyingNavController.m36394i();
        Integer numValueOf = c12977n0M36394i2 != null ? Integer.valueOf(c12977n0M36394i2.f44819H) : null;
        AbstractC22676k.m65747g(numValueOf);
        int iIntValue = numValueOf.intValue();
        if (numM85348g == null) {
            this.currentDestinationHoldingStore.m85349j(numValueOf);
            this.underlyingNavController.m36401p(resId, args, navOptions);
        } else {
            if (numM85348g.intValue() == iIntValue) {
                this.underlyingNavController.m36401p(resId, args, navOptions);
                return;
            }
            this.logger.mo85222m("Failed to safely navigate, savedCurrentDestinationId: " + numM85348g + " != currentDestinationId: " + iIntValue, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m85338d(Uri deepLink) {
        AbstractC22676k.m65750j(deepLink, "deepLink");
        C12977n0 c12977n0M36394i = this.underlyingNavController.m36394i();
        if ((c12977n0M36394i != null ? Integer.valueOf(c12977n0M36394i.f44819H) : null) == null) {
            this.logger.mo85222m("Could not navigate - current nav controller destination is null", new AbstractC30556a.a[0]);
            return;
        }
        Integer numM85348g = this.currentDestinationHoldingStore.m85348g();
        C12977n0 c12977n0M36394i2 = this.underlyingNavController.m36394i();
        Integer numValueOf = c12977n0M36394i2 != null ? Integer.valueOf(c12977n0M36394i2.f44819H) : null;
        AbstractC22676k.m65747g(numValueOf);
        int iIntValue = numValueOf.intValue();
        if (numM85348g == null) {
            this.currentDestinationHoldingStore.m85349j(numValueOf);
            this.underlyingNavController.m36402q(deepLink);
        } else {
            if (numM85348g.intValue() == iIntValue) {
                this.underlyingNavController.m36402q(deepLink);
                return;
            }
            this.logger.mo85222m("Failed to safely navigate, savedCurrentDestinationId: " + numM85348g + " != currentDestinationId: " + iIntValue, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m85339e(Uri deepLink, C12997x0 navOptions) {
        AbstractC22676k.m65750j(deepLink, "deepLink");
        C12977n0 c12977n0M36394i = this.underlyingNavController.m36394i();
        if ((c12977n0M36394i != null ? Integer.valueOf(c12977n0M36394i.f44819H) : null) == null) {
            this.logger.mo85222m("Could not navigate - current nav controller destination is null", new AbstractC30556a.a[0]);
            return;
        }
        Integer numM85348g = this.currentDestinationHoldingStore.m85348g();
        C12977n0 c12977n0M36394i2 = this.underlyingNavController.m36394i();
        Integer numValueOf = c12977n0M36394i2 != null ? Integer.valueOf(c12977n0M36394i2.f44819H) : null;
        AbstractC22676k.m65747g(numValueOf);
        int iIntValue = numValueOf.intValue();
        if (numM85348g == null) {
            this.currentDestinationHoldingStore.m85349j(numValueOf);
            this.underlyingNavController.m36403r(deepLink, navOptions);
        } else {
            if (numM85348g.intValue() == iIntValue) {
                this.underlyingNavController.m36403r(deepLink, navOptions);
                return;
            }
            this.logger.mo85222m("Failed to safely navigate, savedCurrentDestinationId: " + numM85348g + " != currentDestinationId: " + iIntValue, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m85340f(InterfaceC12981p0 directions) {
        AbstractC22676k.m65750j(directions, "directions");
        C12977n0 c12977n0M36394i = this.underlyingNavController.m36394i();
        if ((c12977n0M36394i != null ? Integer.valueOf(c12977n0M36394i.f44819H) : null) == null) {
            this.logger.mo85222m("Could not navigate - current nav controller destination is null", new AbstractC30556a.a[0]);
            return;
        }
        Integer numM85348g = this.currentDestinationHoldingStore.m85348g();
        C12977n0 c12977n0M36394i2 = this.underlyingNavController.m36394i();
        Integer numValueOf = c12977n0M36394i2 != null ? Integer.valueOf(c12977n0M36394i2.f44819H) : null;
        AbstractC22676k.m65747g(numValueOf);
        int iIntValue = numValueOf.intValue();
        if (numM85348g == null) {
            this.currentDestinationHoldingStore.m85349j(numValueOf);
            this.underlyingNavController.m36407v(directions);
        } else {
            if (numM85348g.intValue() == iIntValue) {
                this.underlyingNavController.m36407v(directions);
                return;
            }
            this.logger.mo85222m("Failed to safely navigate, savedCurrentDestinationId: " + numM85348g + " != currentDestinationId: " + iIntValue, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m85341g(InterfaceC12981p0 directions, C12997x0 navOptions) {
        AbstractC22676k.m65750j(directions, "directions");
        C12977n0 c12977n0M36394i = this.underlyingNavController.m36394i();
        if ((c12977n0M36394i != null ? Integer.valueOf(c12977n0M36394i.f44819H) : null) == null) {
            this.logger.mo85222m("Could not navigate - current nav controller destination is null", new AbstractC30556a.a[0]);
            return;
        }
        Integer numM85348g = this.currentDestinationHoldingStore.m85348g();
        C12977n0 c12977n0M36394i2 = this.underlyingNavController.m36394i();
        Integer numValueOf = c12977n0M36394i2 != null ? Integer.valueOf(c12977n0M36394i2.f44819H) : null;
        AbstractC22676k.m65747g(numValueOf);
        int iIntValue = numValueOf.intValue();
        if (numM85348g == null) {
            this.currentDestinationHoldingStore.m85349j(numValueOf);
            AbstractC12939a0 abstractC12939a0 = this.underlyingNavController;
            abstractC12939a0.getClass();
            abstractC12939a0.m36401p(directions.mo19186a(), directions.getArguments(), navOptions);
            return;
        }
        if (numM85348g.intValue() == iIntValue) {
            AbstractC12939a0 abstractC12939a1 = this.underlyingNavController;
            abstractC12939a1.getClass();
            abstractC12939a1.m36401p(directions.mo19186a(), directions.getArguments(), navOptions);
        } else {
            this.logger.mo85222m("Failed to safely navigate, savedCurrentDestinationId: " + numM85348g + " != currentDestinationId: " + iIntValue, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m85342h(String deepLink) {
        AbstractC22676k.m65750j(deepLink, "deepLink");
        m85338d(Uri.parse(deepLink));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m85343i() {
        return this.underlyingNavController.m36410z();
    }
}
