package jl1;

import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25265s;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: jl1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\nB3\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ<\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ljl1/a;", "", "", "Lcom/whoop/navigation/e;", "destinations", "Ljl1/d;", "shownDestinations", "nextDestination", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;)V", "a", "(Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;)Ljl1/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "e", "Lcom/whoop/navigation/e;", "d", "()Lcom/whoop/navigation/e;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21770a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f83752e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C9598e> destinations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C21773d> shownDestinations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e nextDestination;

    /* JADX INFO: renamed from: jl1.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0012*\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b*\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Ljl1/a$a;", "", "<init>", "()V", "Lcom/whoop/navigation/e;", "Ljl1/d;", "g", "(Lcom/whoop/navigation/e;)Ljl1/d;", "Ljl1/a;", "c", "(Ljl1/a;)Lcom/whoop/navigation/e;", "", HMSTrackSource.SCREEN, "identifier", "", "a", "(Ljl1/a;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "destination", "", "e", "(Ljl1/a;Lcom/whoop/navigation/e;)Z", "d", "(Ljl1/a;)Z", "f", "(Ljl1/a;Ljava/lang/String;Ljava/lang/String;)Ljl1/a;", "b", "newDestinations", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljl1/a;Ljava/util/List;)Ljl1/a;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final List<C21773d> m61539a(C21770a c21770a, String str, String str2) {
            List<C21773d> listM61538e = c21770a.m61538e();
            if (!(listM61538e instanceof Collection) || !listM61538e.isEmpty()) {
                for (C21773d c21773d : listM61538e) {
                    if (AbstractC22676k.m65745e(c21773d.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), str) && AbstractC22676k.m65745e(c21773d.getIdentifier(), str2)) {
                        return c21770a.m61538e();
                    }
                }
            }
            return AbstractC25265s.m74128f1(new C21773d(str, str2), c21770a.m61538e());
        }

        /* JADX INFO: renamed from: c */
        private final C9598e m61540c(C21770a c21770a) {
            Object next;
            Iterator<T> it = c21770a.m61536c().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (!C21770a.INSTANCE.m61544e(c21770a, (C9598e) next)) {
                    return (C9598e) next;
                }
            }
            next = null;
            return (C9598e) next;
        }

        /* JADX INFO: renamed from: g */
        private final C21773d m61541g(C9598e c9598e) {
            return new C21773d(c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName(), AbstractC21772c.m61573a(c9598e));
        }

        /* JADX INFO: renamed from: b */
        public final C21770a m61542b(C21770a c21770a, String screen, String identifier) {
            AbstractC22676k.m65750j(c21770a, "<this>");
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(identifier, "identifier");
            return C21770a.m61534b(c21770a, null, m61539a(c21770a, screen, identifier), null, 5, null);
        }

        /* JADX INFO: renamed from: d */
        public final boolean m61543d(C21770a c21770a) {
            AbstractC22676k.m65750j(c21770a, "<this>");
            C9598e nextDestination = c21770a.getNextDestination();
            return AbstractC22676k.m65745e(nextDestination != null ? nextDestination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9441w1.f28009w);
        }

        /* JADX INFO: renamed from: e */
        public final boolean m61544e(C21770a c21770a, C9598e destination) {
            AbstractC22676k.m65750j(c21770a, "<this>");
            AbstractC22676k.m65750j(destination, "destination");
            C21773d c21773dM61541g = m61541g(destination);
            List<C21773d> listM61538e = c21770a.m61538e();
            if ((listM61538e instanceof Collection) && listM61538e.isEmpty()) {
                return false;
            }
            for (C21773d c21773d : listM61538e) {
                if (AbstractC22676k.m65745e(c21773d.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), c21773dM61541g.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()) && AbstractC22676k.m65745e(c21773d.getIdentifier(), c21773dM61541g.getIdentifier())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public final C21770a m61545f(C21770a c21770a, String screen, String identifier) {
            AbstractC22676k.m65750j(c21770a, "<this>");
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(identifier, "identifier");
            List<C21773d> listM61539a = m61539a(c21770a, screen, identifier);
            return C21770a.m61534b(c21770a, null, listM61539a, m61540c(C21770a.m61534b(c21770a, null, listM61539a, null, 5, null)), 1, null);
        }

        /* JADX INFO: renamed from: h */
        public final C21770a m61546h(C21770a c21770a, List<C9598e> newDestinations) {
            AbstractC22676k.m65750j(c21770a, "<this>");
            AbstractC22676k.m65750j(newDestinations, "newDestinations");
            C21770a c21770aM61534b = C21770a.m61534b(c21770a, newDestinations, null, null, 6, null);
            return C21770a.m61534b(c21770aM61534b, null, null, m61540c(c21770aM61534b), 3, null);
        }

        private Companion() {
        }
    }

    public C21770a(List<C9598e> destinations, List<C21773d> shownDestinations, C9598e c9598e) {
        AbstractC22676k.m65750j(destinations, "destinations");
        AbstractC22676k.m65750j(shownDestinations, "shownDestinations");
        this.destinations = destinations;
        this.shownDestinations = shownDestinations;
        this.nextDestination = c9598e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21770a m61534b(C21770a c21770a, List list, List list2, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c21770a.destinations;
        }
        if ((i13 & 2) != 0) {
            list2 = c21770a.shownDestinations;
        }
        if ((i13 & 4) != 0) {
            c9598e = c21770a.nextDestination;
        }
        return c21770a.m61535a(list, list2, c9598e);
    }

    /* JADX INFO: renamed from: a */
    public final C21770a m61535a(List<C9598e> destinations, List<C21773d> shownDestinations, C9598e nextDestination) {
        AbstractC22676k.m65750j(destinations, "destinations");
        AbstractC22676k.m65750j(shownDestinations, "shownDestinations");
        return new C21770a(destinations, shownDestinations, nextDestination);
    }

    /* JADX INFO: renamed from: c */
    public final List<C9598e> m61536c() {
        return this.destinations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C9598e getNextDestination() {
        return this.nextDestination;
    }

    /* JADX INFO: renamed from: e */
    public final List<C21773d> m61538e() {
        return this.shownDestinations;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21770a)) {
            return false;
        }
        C21770a c21770a = (C21770a) other;
        return AbstractC22676k.m65745e(this.destinations, c21770a.destinations) && AbstractC22676k.m65745e(this.shownDestinations, c21770a.shownDestinations) && AbstractC22676k.m65745e(this.nextDestination, c21770a.nextDestination);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.destinations.hashCode() * 31, 31, this.shownDestinations);
        C9598e c9598e = this.nextDestination;
        return iM31983b + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        List<C9598e> list = this.destinations;
        List<C21773d> list2 = this.shownDestinations;
        return AbstractC33745d.m106656o(AbstractC38963t7.m124380j("AutoPopDomainState(destinations=", ", shownDestinations=", list, ", nextDestination=", list2), this.nextDestination, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C21770a(List list, List list2, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2, (i13 & 4) != 0 ? null : c9598e);
    }
}
