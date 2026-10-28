package lj2;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.design.models.items.ArticleTileCarouselEventEnum;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.design.models.items.ArticleTileModelEventEnum;
import com.whoop.design.models.items.graph.plot.overlay.OverlayCta;
import com.whoop.navigation.ActivityDetailType;
import d13.AbstractC11478a;
import d61.InterfaceC11734c;
import fj2.C14543a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import jj2.AbstractC21741a;
import nj2.AbstractC26768o;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12991u0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pj2.AbstractC29307f;
import rj2.C31489a;
import s01.EnumC32045a;
import u92.C34660d;
import v61.C35736a;

/* JADX INFO: renamed from: lj2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001\"Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0001¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;¨\u0006>"}, m65681d2 = {"Llj2/c;", "", "Landroidx/fragment/app/m0;", "fragment", "Leb/a0;", "fragmentNavController", "Leb/u0;", "composeNavController", "Lj02/o0;", "navigator", "Ljava/time/Clock;", "clock", "Lrj2/a;", "viewModel", "Lor2/y;", "externalLinkNavigator", "Lfj2/a;", "analyticsManager", "Lu92/d;", "sharedPref", "", "source", HttpHeaders.DATE, "<init>", "(Landroidx/fragment/app/m0;Leb/a0;Leb/u0;Lj02/o0;Ljava/time/Clock;Lrj2/a;Lor2/y;Lfj2/a;Lu92/d;Ljava/lang/String;Ljava/lang/String;)V", "Lv61/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lv61/a;)V", "Llj2/a;", "g", "(Llj2/a;)V", "Llj2/a$a;", "a", "(Llj2/a$a;)V", "Lcom/whoop/design/models/items/ArticleTileModelEvent;", "f", "(Lcom/whoop/design/models/items/ArticleTileModelEvent;)V", "e", "()V", "Landroid/net/Uri;", "uri", "d", "(Landroid/net/Uri;)V", "c", "(Ljava/lang/Object;)V", "Landroidx/fragment/app/m0;", "Leb/a0;", "Leb/u0;", "Lj02/o0;", "Ljava/time/Clock;", "Lrj2/a;", "Lor2/y;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lfj2/a;", "i", "Lu92/d;", "j", "Ljava/lang/String;", "k", "l", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24477c {

    /* JADX INFO: renamed from: m */
    public static final int f95477m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 fragmentNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C12991u0 composeNavController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C31489a viewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C14543a analyticsManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C34660d sharedPref;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String date;

    /* JADX INFO: renamed from: lj2.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95489a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f95490b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f95491c;

        static {
            int[] iArr = new int[OverlayCta.values().length];
            try {
                iArr[OverlayCta.SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverlayCta.CARDIO_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OverlayCta.RECOVERY_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OverlayCta.WEIGHTLIFTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OverlayCta.PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OverlayCta.MULTIPLE_ACTIVITIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f95489a = iArr;
            int[] iArr2 = new int[ActivityDetailType.values().length];
            try {
                iArr2[ActivityDetailType.CARDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ActivityDetailType.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ActivityDetailType.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ActivityDetailType.WEIGHTLIFTING_MSK.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            f95490b = iArr2;
            int[] iArr3 = new int[ArticleTileModelEventEnum.values().length];
            try {
                iArr3[ArticleTileModelEventEnum.STRESS_MONITOR_IN_APP_EDUCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ArticleTileModelEventEnum.STRESS_MONITOR_INTERVENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            f95491c = iArr3;
        }
    }

    public C24477c(AbstractComponentCallbacksC1320m0 fragment, AbstractC12939a0 fragmentNavController, C12991u0 composeNavController, InterfaceC21159o0 navigator, Clock clock, C31489a viewModel, C28216y externalLinkNavigator, C14543a analyticsManager, C34660d sharedPref, String source, String str) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(fragmentNavController, "fragmentNavController");
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(sharedPref, "sharedPref");
        AbstractC22676k.m65750j(source, "source");
        this.fragment = fragment;
        this.fragmentNavController = fragmentNavController;
        this.composeNavController = composeNavController;
        this.navigator = navigator;
        this.clock = clock;
        this.viewModel = viewModel;
        this.externalLinkNavigator = externalLinkNavigator;
        this.analyticsManager = analyticsManager;
        this.sharedPref = sharedPref;
        this.source = source;
        this.date = str;
    }

    /* JADX INFO: renamed from: a */
    private final void m71241a(AbstractC24475a.a event) {
        int i13 = b.f95490b[event.getActivityType().ordinal()];
        if (i13 == 1) {
            m71243d(Uri.parse("android-app://com.whoop/coreDetailsFragment/?entryPoint=STRESS_MONITOR&activityType=Cardio&newHome=true&activityIdV2=" + event.getActivityIdV2()));
            return;
        }
        if (i13 == 2) {
            m71243d(Uri.parse("android-app://com.whoop/coreDetailsFragment/?entryPoint=STRESS_MONITOR&activityType=Recovery&newHome=true&activityIdV2=" + event.getActivityIdV2()));
            return;
        }
        if (i13 == 3) {
            m71243d(Uri.parse("android-app://com.whoop/coreDetails/sleepDetails?sleepIdV2=" + event.getActivityIdV2() + "&source=STRESS_MONITOR&newHome=true"));
            return;
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        m71243d(Uri.parse("android-app://com.whoop/coreDetailsFragment/?entryPoint=STRESS_MONITOR&activityType=Cardio&newHome=true&activityIdV2=" + event.getActivityIdV2()));
    }

    /* JADX INFO: renamed from: b */
    private final void m71242b(C35736a event) {
        switch (b.f95489a[OverlayCta.valueOf(event.getCta()).ordinal()]) {
            case 1:
                m71243d(Uri.parse("android-app://com.whoop/coreDetails/sleepDetails?sleepIdV2=" + event.getActivityId() + "&source=STRESS_MONITOR&newHome=true"));
                return;
            case 2:
                this.analyticsManager.m41534a();
                m71243d(Uri.parse("android-app://com.whoop/coreDetailsFragment/?entryPoint=STRESS_MONITOR&activityType=Cardio&newHome=true&activityIdV2=" + event.getActivityId()));
                return;
            case 3:
                this.analyticsManager.m41534a();
                m71243d(Uri.parse("android-app://com.whoop/coreDetailsFragment/?entryPoint=STRESS_MONITOR&activityType=Recovery&newHome=true&activityIdV2=" + event.getActivityId()));
                return;
            case 4:
                m71243d(Uri.parse("android-app://com.whoop/coreDetailsFragment/?entryPoint=STRESS_MONITOR&activityType=Cardio&newHome=true&activityIdV2=" + event.getActivityId()));
                return;
            case 5:
            case 6:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m71243d(Uri uri) {
        this.fragmentNavController.m36404s(AbstractC11478a.m30854f(uri, "uri", uri, null, null));
    }

    /* JADX INFO: renamed from: e */
    private final void m71244e() {
        this.sharedPref.m109538q(SharedPreferenceConstants.KEY_SHOW_STRESS_MONITOR_ONBOARDING, false);
        Uri uri = Uri.parse("android-app://com.whoop/onboardingStoriesFragmentRedesign/STRESS_MONITOR_STORY");
        AbstractC22676k.m65750j(uri, "uri");
        this.fragmentNavController.m36404s(new C12969k0(uri, null, null));
    }

    /* JADX INFO: renamed from: f */
    private final void m71245f(ArticleTileModelEvent event) {
        if (event instanceof ArticleTileModelEvent.Url) {
            ArticleTileModelEvent.Url url = (ArticleTileModelEvent.Url) event;
            this.analyticsManager.m41543j(url.getTitle(), String.valueOf(url.getIndex()));
            C28216y c28216y = this.externalLinkNavigator;
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.fragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            C28216y.m85414y(c28216y, abstractActivityC1340r0RequireActivity, url.getUrl(), false, 4, null);
            return;
        }
        if (event instanceof ArticleTileModelEvent.Cta) {
            ArticleTileModelEvent.Cta cta = (ArticleTileModelEvent.Cta) event;
            int i13 = b.f95491c[cta.getCta().ordinal()];
            if (i13 == 1) {
                this.analyticsManager.m41552u(cta.getTitle(), String.valueOf(cta.getIndex()));
                this.analyticsManager.m41554w();
                AbstractC12939a0.m36374y(this.composeNavController, "EDUCATION", null, 6);
            } else {
                if (i13 != 2) {
                    return;
                }
                AbstractC29307f.a aVarM88966a = AbstractC29307f.m88966a(cta.getId());
                AbstractC22676k.m65749i(aVarM88966a, "actionStressMonitorToSession(...)");
                this.fragmentNavController.m36407v(aVarM88966a);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m71246g(AbstractC24475a event) {
        C12977n0 c12977n0;
        CharSequence charSequence = null;
        if (event instanceof AbstractC24475a.b) {
            if (AbstractC22676k.m65745e(this.source, "Unknown")) {
                C12982q c12982qM36398m = this.fragmentNavController.m36398m();
                if (c12982qM36398m != null && (c12977n0 = c12982qM36398m.f44844x) != null) {
                    charSequence = c12977n0.f44825z;
                }
                if (AbstractC22676k.m65745e(charSequence, "CoachingWrapper")) {
                    this.fragmentNavController.m36410z();
                }
            }
            this.fragmentNavController.m36410z();
            return;
        }
        if (event instanceof AbstractC24475a.e) {
            this.analyticsManager.m41554w();
            AbstractC12939a0.m36374y(this.composeNavController, "EDUCATION", null, 6);
            return;
        }
        if (event instanceof AbstractC24475a.g) {
            String str = this.date;
            if (str == null || this.viewModel.m96996u(new AbstractC21741a.e(this.source, str)) == null) {
                this.viewModel.m96996u(new AbstractC21741a.c(this.source));
                return;
            }
            return;
        }
        if (AbstractC22676k.m65745e(event, AbstractC24475a.i.f95471a)) {
            Uri uri = Uri.parse("android-app://com.whoop/settingsNotificationFragment");
            this.fragmentNavController.m36404s(AbstractC11478a.m30854f(uri, "uri", uri, null, null));
            return;
        }
        if (event instanceof AbstractC24475a.d) {
            AbstractC24475a.d dVar = (AbstractC24475a.d) event;
            this.viewModel.m96996u(new AbstractC21741a.e("", dVar.getDateSelected()));
            this.analyticsManager.m41536c(dVar.getDateSelected());
            return;
        }
        if (event instanceof AbstractC24475a.c) {
            this.viewModel.m96996u(new AbstractC21741a.a(((AbstractC24475a.c) event).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String()));
            return;
        }
        if (!(event instanceof AbstractC24475a.h)) {
            if (AbstractC22676k.m65745e(event, AbstractC24475a.j.f95472a)) {
                this.analyticsManager.m41551t();
                return;
            } else if (event instanceof AbstractC24475a.a) {
                m71241a((AbstractC24475a.a) event);
                return;
            } else {
                if (!(event instanceof AbstractC24475a.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.navigator.mo59393b(new AbstractC21155m0.z(null, null, ((AbstractC24475a.f) event).getMessage(), DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now(this.clock)), "VoW_Stress", EnumC32045a.STRESS.toString(), null, null, false, null, null, null, 4035, null));
                return;
            }
        }
        AbstractC24475a.h hVar = (AbstractC24475a.h) event;
        Uri uri2 = Uri.parse("android-app://com.whoop/trends?trendKey=" + hVar.getTrendKey() + "&date=" + hVar.getDateSelected());
        AbstractC22676k.m65750j(uri2, "uri");
        this.fragmentNavController.m36404s(new C12969k0(uri2, null, null));
    }

    /* JADX INFO: renamed from: c */
    public final void m71247c(Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event == ArticleTileCarouselEventEnum.DISMISS) {
            C14543a.m41532l(this.analyticsManager, null, 1, null);
            this.viewModel.m96996u(AbstractC21741a.b.f83600a);
            return;
        }
        if (event instanceof ArticleTileModelEvent) {
            m71245f((ArticleTileModelEvent) event);
            return;
        }
        if (event instanceof AbstractC24475a) {
            m71246g((AbstractC24475a) event);
            return;
        }
        if (event instanceof AbstractC26768o.a) {
            m71244e();
        } else if (event instanceof C35736a) {
            m71242b((C35736a) event);
        } else if (event instanceof InterfaceC11734c.a) {
            this.analyticsManager.m41535b();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C24477c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, AbstractC12939a0 abstractC12939a0, C12991u0 c12991u0, InterfaceC21159o0 interfaceC21159o0, Clock clock, C31489a c31489a, C28216y c28216y, C14543a c14543a, C34660d c34660d, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Clock clock2;
        if ((i13 & 16) != 0) {
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
            clock2 = clockSystemDefaultZone;
        } else {
            clock2 = clock;
        }
        this(abstractComponentCallbacksC1320m0, abstractC12939a0, c12991u0, interfaceC21159o0, clock2, c31489a, c28216y, c14543a, c34660d, str, str2);
    }
}
