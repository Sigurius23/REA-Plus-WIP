package com.whoop.navigation;

import android.os.Bundle;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.EnumC1635w;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21157n0;
import j02.EnumC21172v;
import java.util.Iterator;
import live.hms.video.media.tracks.HMSTrackSource;
import p114eb.AbstractC12939a0;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12985r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: com.whoop.navigation.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000b\u001a\u0013\u0010\u0012\u001a\u00020\u0001*\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u0013\u0010\u0018\u001a\u00020\u0001*\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0013\u001a\u0013\u0010\u0019\u001a\u00020\u0001*\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0013\u001a\u001b\u0010\u001a\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u000b\u001a-\u0010\u001f\u001a\u00020\u0001*\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010$\u001a\u00020\u0001*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%\u001a\u001d\u0010)\u001a\u0004\u0018\u00010(*\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*\u001a!\u0010.\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Leb/a0;", "", "k", "(Leb/a0;)Z", "Lj02/v;", "type", "Ltr2/n;", "logger", "e", "(Leb/a0;Lj02/v;Ltr2/n;)Z", "q", "(Leb/a0;Ltr2/n;)Z", "o", "Leb/q;", "", "n", "(Leb/q;)Ljava/lang/String;", "p", "j", "(Leb/q;)Z", "Ll83/a0;", "l", "(Leb/a0;Ltr2/n;)V", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "r", "a", "Lcom/whoop/navigation/PopUpToModel;", "popUpTo", "", "popBackCount", "d", "(Leb/a0;Lcom/whoop/navigation/PopUpToModel;Ljava/lang/Integer;Ltr2/n;)Z", "Lcom/whoop/navigation/e;", "destination", "inclusive", "g", "(Leb/a0;Lcom/whoop/navigation/e;Z)Z", "Lcom/whoop/navigation/AppScreen;", HMSTrackSource.SCREEN, "Leb/n0;", "c", "(Leb/a0;Lcom/whoop/navigation/AppScreen;)Leb/n0;", "Leb/r0;", "graph", "label", "b", "(Leb/r0;Ljava/lang/String;)Leb/n0;", "navigation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC9597d {

    /* JADX INFO: renamed from: com.whoop.navigation.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28133a;

        static {
            int[] iArr = new int[EnumC21172v.values().length];
            try {
                iArr[EnumC21172v.POP_CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21172v.POP_TO_ROOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21172v.DISMISS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC21172v.DISMISS_WITHOUT_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC21172v.AUTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f28133a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final boolean m23109a(AbstractC12939a0 abstractC12939a0, InterfaceC34116n interfaceC34116n) {
        if (!m23117i(abstractC12939a0)) {
            interfaceC34116n.mo85216g("No presented flow to dismiss - ignoring dismissal, back stack left untouched", new AbstractC30556a.a[0]);
            return false;
        }
        boolean z4 = false;
        while (!z4) {
            C12982q c12982qM36393h = abstractC12939a0.m36393h();
            z4 = c12982qM36393h != null && m23118j(c12982qM36393h);
            if (!abstractC12939a0.m36410z()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static final C12977n0 m23110b(C12985r0 c12985r0, String str) {
        Object next;
        Object next2;
        CharSequence charSequence;
        CharSequence charSequence2;
        Iterator it = c12985r0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            charSequence2 = ((C12977n0) next).f44825z;
        } while (!AbstractC22676k.m65745e(charSequence2 != null ? charSequence2.toString() : null, str));
        C12977n0 c12977n0 = (C12977n0) next;
        if (c12977n0 != null) {
            return c12977n0;
        }
        for (Object obj : c12985r0) {
            if (obj instanceof C12985r0) {
                Iterator it3 = ((Iterable) obj).iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    charSequence = ((C12977n0) next2).f44825z;
                } while (!AbstractC22676k.m65745e(charSequence != null ? charSequence.toString() : null, str));
                C12977n0 c12977n1 = (C12977n0) next2;
                if (c12977n1 != null) {
                    return c12977n1;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static final C12977n0 m23111c(AbstractC12939a0 abstractC12939a0, AppScreen appScreen) {
        C12985r0 c12985r0M36396k = abstractC12939a0.m36396k();
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9426u2.f27963w)) {
            return m23110b(c12985r0M36396k, "Home Fragment");
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9264a0.f27464w)) {
            return m23110b(c12985r0M36396k, appScreen.getName());
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9394q2.f27867w)) {
            return m23110b(c12985r0M36396k, "HealthTabFragment");
        }
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9263a.f27461w)) {
            return m23110b(c12985r0M36396k, "Reconfirm Labs");
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m23112d(AbstractC12939a0 abstractC12939a0, PopUpToModel popUpToModel, Integer num, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(abstractC12939a0, "<this>");
        AbstractC22676k.m65750j(logger, "logger");
        if (popUpToModel != null) {
            return m23115g(abstractC12939a0, popUpToModel.getDestination(), popUpToModel.getInclusive());
        }
        if (num == null || num.intValue() <= 1) {
            return abstractC12939a0.m36410z();
        }
        int i13 = 0;
        while (i13 < num.intValue()) {
            if (!abstractC12939a0.m36410z()) {
                logger.mo85226q("Cannot pop - already at root", new AbstractC30556a.a[0]);
                break;
            }
            i13++;
        }
        return i13 == num.intValue();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m23113e(AbstractC12939a0 abstractC12939a0, EnumC21172v type, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(abstractC12939a0, "<this>");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(logger, "logger");
        int i13 = a.f28133a[type.ordinal()];
        if (i13 == 1) {
            return m23125q(abstractC12939a0, logger);
        }
        if (i13 == 2) {
            return m23123o(abstractC12939a0, logger);
        }
        if (i13 == 3 || i13 == 4) {
            return m23109a(abstractC12939a0, logger);
        }
        if (i13 == 5) {
            return m23117i(abstractC12939a0) ? m23109a(abstractC12939a0, logger) : abstractC12939a0.m36410z();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m23114f(AbstractC12939a0 abstractC12939a0, EnumC21172v enumC21172v, InterfaceC34116n interfaceC34116n, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC34116n = InterfaceC34116n.INSTANCE.m107848a("NavControllerExt");
        }
        return m23113e(abstractC12939a0, enumC21172v, interfaceC34116n);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m23115g(AbstractC12939a0 abstractC12939a0, C9598e c9598e, boolean z4) {
        AbstractC22676k.m65750j(abstractC12939a0, "<this>");
        if (c9598e == null) {
            return abstractC12939a0.m36410z();
        }
        AppScreen screen = c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        if (AbstractC22676k.m65745e(screen, AppScreen.C9346k2.f27718w)) {
            throw new UnsupportedOperationException("handlePopUpTo does not support AppScreen.Generic. This function is designed for XML-based navigation only. For Compose navigation (arch v2), use route-based navigation instead.");
        }
        C12977n0 c12977n0M23111c = m23111c(abstractC12939a0, screen);
        if (c12977n0M23111c != null) {
            return abstractC12939a0.m36375A(c12977n0M23111c.f44819H, z4);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private static final boolean m23116h(C12982q c12982q) {
        return c12982q.f44837H.f6250d != EnumC1635w.f6325w;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m23117i(AbstractC12939a0 abstractC12939a0) {
        AbstractC22676k.m65750j(abstractC12939a0, "<this>");
        C12982q c12982qM36393h = abstractC12939a0.m36393h();
        if (c12982qM36393h == null) {
            return false;
        }
        return m23118j(c12982qM36393h) || m23126r(c12982qM36393h);
    }

    /* JADX INFO: renamed from: j */
    private static final boolean m23118j(C12982q c12982q) {
        return AbstractC21157n0.m59385a(m23122n(c12982q));
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m23119k(AbstractC12939a0 abstractC12939a0) {
        C1601k1 c1601k1M36480b;
        AbstractC22676k.m65750j(abstractC12939a0, "<this>");
        C12982q c12982qM36393h = abstractC12939a0.m36393h();
        if (c12982qM36393h == null || (c1601k1M36480b = c12982qM36393h.m36480b()) == null) {
            return false;
        }
        return AbstractC22676k.m65745e(c1601k1M36480b.m5001b("bff_is_tab_root"), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: l */
    public static final void m23120l(AbstractC12939a0 abstractC12939a0, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(abstractC12939a0, "<this>");
        AbstractC22676k.m65750j(logger, "logger");
        C12982q c12982qM36393h = abstractC12939a0.m36393h();
        if (c12982qM36393h != null) {
            C12982q c12982q = null;
            if (!m23116h(c12982qM36393h)) {
                c12982qM36393h = null;
            }
            if (c12982qM36393h == null) {
                return;
            }
            C12982q c12982qM36398m = abstractC12939a0.m36398m();
            if (c12982qM36398m != null && m23116h(c12982qM36398m)) {
                c12982q = c12982qM36398m;
            }
            try {
                C1601k1 c1601k1M36480b = c12982qM36393h.m36480b();
                boolean z4 = true;
                if (!m23118j(c12982qM36393h) && (c12982q == null || !m23126r(c12982q))) {
                    z4 = false;
                }
                c1601k1M36480b.m5004e(Boolean.valueOf(z4), "nav_in_presented_flow");
            } catch (IllegalStateException e5) {
                logger.mo85230v("Could not mark presented flow membership", e5, new AbstractC30556a.a[0]);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m23121m(AbstractC12939a0 abstractC12939a0, InterfaceC34116n interfaceC34116n, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC34116n = InterfaceC34116n.INSTANCE.m107848a("NavControllerExt");
        }
        m23120l(abstractC12939a0, interfaceC34116n);
    }

    /* JADX INFO: renamed from: n */
    public static final String m23122n(C12982q c12982q) {
        AbstractC22676k.m65750j(c12982q, "<this>");
        Bundle bundleM36479a = c12982q.m36479a();
        if (bundleM36479a != null) {
            return bundleM36479a.getString("navigationStyle");
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m23123o(AbstractC12939a0 abstractC12939a0, InterfaceC34116n interfaceC34116n) {
        C12982q c12982qM36393h;
        if (!m23117i(abstractC12939a0)) {
            return m23124p(abstractC12939a0, interfaceC34116n);
        }
        boolean z4 = false;
        while (m23117i(abstractC12939a0) && ((c12982qM36393h = abstractC12939a0.m36393h()) == null || !m23118j(c12982qM36393h))) {
            if (!abstractC12939a0.m36410z()) {
                return z4;
            }
            z4 = true;
        }
        if (!z4) {
            interfaceC34116n.mo85216g("Already at the root of the presented flow - nothing to pop", new AbstractC30556a.a[0]);
        }
        return z4;
    }

    /* JADX INFO: renamed from: p */
    private static final boolean m23124p(AbstractC12939a0 abstractC12939a0, InterfaceC34116n interfaceC34116n) {
        C12982q c12982qM36398m;
        if (abstractC12939a0.m36375A(abstractC12939a0.m36396k().f44856M, false)) {
            return true;
        }
        if (m23119k(abstractC12939a0)) {
            interfaceC34116n.mo85216g("Already at the tab root - nothing to pop", new AbstractC30556a.a[0]);
            return false;
        }
        for (int i13 = 0; i13 < 50 && (c12982qM36398m = abstractC12939a0.m36398m()) != null && c12982qM36398m.f44844x.f44819H != abstractC12939a0.m36396k().f44819H; i13++) {
            boolean zM65745e = AbstractC22676k.m65745e(c12982qM36398m.m36480b().m5001b("bff_is_tab_root"), Boolean.TRUE);
            if (!abstractC12939a0.m36410z()) {
                return false;
            }
            if (zM65745e) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    private static final boolean m23125q(AbstractC12939a0 abstractC12939a0, InterfaceC34116n interfaceC34116n) {
        C12982q c12982qM36393h = abstractC12939a0.m36393h();
        if (c12982qM36393h == null || !m23118j(c12982qM36393h)) {
            return abstractC12939a0.m36410z();
        }
        interfaceC34116n.mo85216g("At the presented flow entry - a pop cannot leave the flow, dismiss it instead", new AbstractC30556a.a[0]);
        return false;
    }

    /* JADX INFO: renamed from: r */
    private static final boolean m23126r(C12982q c12982q) {
        return m23116h(c12982q) && AbstractC22676k.m65745e(c12982q.m36480b().m5001b("nav_in_presented_flow"), Boolean.TRUE);
    }
}
