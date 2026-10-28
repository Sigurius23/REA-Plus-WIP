package ip2;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import mn2.EnumC25719b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ip2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, m65681d2 = {"Lfi0/a;", "Lmn2/b;", "source", "Ll83/a0;", "c", "(Lfi0/a;Lmn2/b;)V", "a", "b", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20815b {
    /* JADX INFO: renamed from: a */
    public static final void m57403a(InterfaceC14515a interfaceC14515a, EnumC25719b source) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "tap", "icon", "Mobile Checkout", "back", AbstractC25247g0.m73990Y(new C23465k("screen_name", "shipping_address"), new C23465k("flow_type", source.getValue())), 1, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m57404b(InterfaceC14515a interfaceC14515a, EnumC25719b source) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, "modal", "Mobile Checkout", "change_shipping_region_error", AbstractC25247g0.m73990Y(new C23465k("screen_name", "shipping_address"), new C23465k("flow_type", source.getValue())), 1, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m57405c(InterfaceC14515a interfaceC14515a, EnumC25719b source) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, HMSTrackSource.SCREEN, "Mobile Checkout", null, AbstractC25247g0.m73990Y(new C23465k("screen_name", "shipping_address"), new C23465k("flow_type", source.getValue())), 17, null);
    }
}
