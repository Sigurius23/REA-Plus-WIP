package uj2;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: uj2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ+\u0010\u001f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u001c*\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"Ja\u0010*\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001c2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001c2\u0018\b\u0002\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00100¨\u00061"}, m65681d2 = {"Luj2/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "zoomIn", "Luj2/d;", "source", "Ll83/a0;", "l", "(ZLuj2/d;)V", "k", "()V", "Luj2/c;", "d", "(Luj2/c;)V", "e", "isNext", "c", "(Z)V", "Ljava/time/LocalDate;", "selectedDate", "now", "b", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "a", "", "daysSince", "hoursInGraph", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "g", "(Luj2/d;)Ljava/lang/String;", "eventName", "category", "action", "label", "value", "", "otherProperties", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Luj2/a;", NotificationCompat.CATEGORY_EVENT, "j", "(Luj2/a;)V", "Lfi0/a;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35039b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: uj2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f148490a;

        static {
            int[] iArr = new int[EnumC35041d.values().length];
            try {
                iArr[EnumC35041d.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35041d.DOUBLE_TAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC35041d.PINCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f148490a = iArr;
        }
    }

    public C35039b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final void m110752a() {
        m110760i(this, "Tilt Mode", null, "View Calendar Date Selector", null, null, null, 58, null);
    }

    /* JADX INFO: renamed from: b */
    private final void m110753b(LocalDate selectedDate, LocalDate now) {
        m110760i(this, "Tilt Mode", null, "Select Calendar Date", null, String.valueOf(Duration.between(selectedDate.atStartOfDay(), now.atStartOfDay()).toDays()), null, 42, null);
    }

    /* JADX INFO: renamed from: c */
    private final void m110754c(boolean isNext) {
        m110760i(this, "Tilt Mode", null, isNext ? "Press Next Date" : "Press Previous Date", null, null, null, 58, null);
    }

    /* JADX INFO: renamed from: d */
    private final void m110755d(EnumC35040c source) {
        m110760i(this, "Tilt Mode", null, "Close", null, null, AbstractC31061c.m95645u("source", source.getSourceName()), 26, null);
    }

    /* JADX INFO: renamed from: e */
    private final void m110756e() {
        m110760i(this, "Tilt Mode", null, "Load Failure", null, null, null, 58, null);
    }

    /* JADX INFO: renamed from: f */
    private final void m110757f(String source, String daysSince, String hoursInGraph) {
        if (source == null || source.length() == 0) {
            source = "deeplink";
        }
        m110760i(this, "Tilt Mode", null, "Open", hoursInGraph, daysSince, AbstractC31061c.m95645u("source", source), 2, null);
    }

    /* JADX INFO: renamed from: g */
    private final String m110758g(EnumC35041d enumC35041d) {
        int i13 = a.f148490a[enumC35041d.ordinal()];
        if (i13 == 1) {
            return "Button";
        }
        if (i13 == 2) {
            return "Double Tap";
        }
        if (i13 == 3) {
            return "Pinch";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    private final void m110759h(String eventName, String category, String action, String label, String value, Map<String, ? extends Object> otherProperties) {
        this.analytics.mo41422d(category, action, label, eventName, value, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m110760i(C35039b c35039b, String str, String str2, String str3, String str4, String str5, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            str4 = null;
        }
        if ((i13 & 16) != 0) {
            str5 = null;
        }
        if ((i13 & 32) != 0) {
            map = null;
        }
        c35039b.m110759h(str, str2, str3, str4, str5, map);
    }

    /* JADX INFO: renamed from: k */
    private final void m110761k() {
        m110760i(this, "Tilt Mode", null, "Data Scrub", null, null, null, 58, null);
    }

    /* JADX INFO: renamed from: l */
    private final void m110762l(boolean zoomIn, EnumC35041d source) {
        m110760i(this, "Tilt Mode", null, zoomIn ? "Zoom In" : "Zoom Out", null, null, AbstractC31061c.m95645u("source", m110758g(source)), 26, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m110763j(AbstractC35038a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC35038a.e) {
            m110755d(((AbstractC35038a.e) event).getSource());
            return;
        }
        if (event instanceof AbstractC35038a.d) {
            m110754c(((AbstractC35038a.d) event).getIsNext());
            return;
        }
        if (event instanceof AbstractC35038a.c) {
            AbstractC35038a.c cVar = (AbstractC35038a.c) event;
            m110753b(cVar.getSelectedDate(), cVar.getNow());
            return;
        }
        if (event instanceof AbstractC35038a.h) {
            AbstractC35038a.h hVar = (AbstractC35038a.h) event;
            m110762l(hVar.getZoomIn(), hVar.getSource());
            return;
        }
        if (event instanceof AbstractC35038a.g) {
            AbstractC35038a.g gVar = (AbstractC35038a.g) event;
            m110757f(gVar.getSource(), gVar.getDaysSince(), gVar.getHoursInGraph());
        } else if (event.equals(AbstractC35038a.f.f148483a)) {
            m110756e();
        } else if (event.equals(AbstractC35038a.a.f148477a)) {
            m110752a();
        } else {
            if (!event.equals(AbstractC35038a.b.f148478a)) {
                throw new NoWhenBranchMatchedException();
            }
            m110761k();
        }
    }
}
