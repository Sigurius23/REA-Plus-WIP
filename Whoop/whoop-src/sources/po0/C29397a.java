package po0;

import androidx.core.app.NotificationCompat;
import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingStepID;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dp0.AbstractC12249e;
import ep0.EnumC13401g;
import ep0.InterfaceC13399e;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: po0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 JU\u0010&\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0018\b\u0002\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010,\u001a\u00020\u001d¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103¨\u00064"}, m65681d2 = {"Lpo0/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "source", "Ll83/a0;", "g", "(Ljava/lang/String;)V", "screenName", "", "stepNumber", "l", "(Ljava/lang/String;I)V", "label", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "screenIdentifier", "", "wasTextCutoff", "d", "(Ljava/lang/String;Z)V", "f", "drawerState", "dismissType", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lep0/e;", "state", "c", "(Lep0/e;)Ljava/lang/String;", "eventName", "category", "action", "", "otherProperties", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Ldp0/e;", NotificationCompat.CATEGORY_EVENT, "k", "(Ldp0/e;)V", "proactiveAnimationState", "b", "(Ljava/lang/String;Lep0/e;)V", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;", "stepId", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;)Ljava/lang/String;", "Lfi0/a;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29397a {

    /* JADX INFO: renamed from: c */
    public static final int f119242c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: po0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f119244a;

        static {
            int[] iArr = new int[CoachOnboardingStepID.values().length];
            try {
                iArr[CoachOnboardingStepID.COACH_EVERYWHERE_DAY_ZERO_INTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoachOnboardingStepID.COACH_EVERYWHERE_DAY_ZERO_PLUS_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoachOnboardingStepID.COACH_EVERYWHERE_DAY_ZERO_INPUT_FIELD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoachOnboardingStepID.COACH_EVERYWHERE_DAY_ZERO_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CoachOnboardingStepID.COACH_EVERYWHERE_DAY_ZERO_SPEECH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CoachOnboardingStepID.COACH_EVERYWHERE_DAY_ZERO_HISTORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f119244a = iArr;
        }
    }

    public C29397a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final void m89564a(String screenName, String label) {
        m89570i("AI Coach", "onboarding", "click", label, AbstractC31061c.m95645u("source", screenName));
    }

    /* JADX INFO: renamed from: c */
    private final String m89565c(InterfaceC13399e state) {
        if (state instanceof InterfaceC13399e.a) {
            return "ready";
        }
        return ((state instanceof InterfaceC13399e.e) && ((InterfaceC13399e.e) state).getLoadStyle() == EnumC13401g.ANALYZING) ? "generating" : "static";
    }

    /* JADX INFO: renamed from: d */
    private final void m89566d(String screenIdentifier, boolean wasTextCutoff) {
        m89571j(this, "drawer_collapsed", null, null, null, AbstractC25247g0.m73990Y(new C23465k("screen_identifier", screenIdentifier), new C23465k("was_text_cutoff", Boolean.valueOf(wasTextCutoff))), 14, null);
    }

    /* JADX INFO: renamed from: e */
    private final void m89567e(String screenIdentifier, String drawerState, String dismissType) {
        m89571j(this, "drawer_dismissed", null, null, null, AbstractC25247g0.m73990Y(new C23465k("screen_identifier", screenIdentifier), new C23465k("drawer_state", drawerState), new C23465k("dismiss_type", dismissType)), 14, null);
    }

    /* JADX INFO: renamed from: f */
    private final void m89568f(String screenIdentifier, boolean wasTextCutoff) {
        m89571j(this, "drawer_expanded", null, null, null, AbstractC25247g0.m73990Y(new C23465k("screen_identifier", screenIdentifier), new C23465k("was_text_cutoff", Boolean.valueOf(wasTextCutoff))), 14, null);
    }

    /* JADX INFO: renamed from: g */
    private final void m89569g(String source) {
        if (source == null) {
            source = "coach_tile";
        }
        m89571j(this, "AI Coach", "onboarding", ProfileAnalyticsKt.OPEN, null, AbstractC31061c.m95645u("source", source), 8, null);
    }

    /* JADX INFO: renamed from: i */
    private final void m89570i(String eventName, String category, String action, String label, Map<String, ? extends Object> otherProperties) {
        this.analytics.mo41428k(category, action, label, eventName, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m89571j(C29397a c29397a, String str, String str2, String str3, String str4, Map map, int i13, Object obj) {
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
            map = null;
        }
        c29397a.m89570i(str, str2, str3, str4, map);
    }

    /* JADX INFO: renamed from: l */
    private final void m89572l(String screenName, int stepNumber) {
        m89570i("AI Coach", "onboarding", "view_onboarding_screen", screenName, AbstractC31061c.m95645u("value", String.valueOf(stepNumber)));
    }

    /* JADX INFO: renamed from: b */
    public final void m89573b(String screenIdentifier, InterfaceC13399e proactiveAnimationState) {
        AbstractC22676k.m65750j(proactiveAnimationState, "proactiveAnimationState");
        if (screenIdentifier == null) {
            screenIdentifier = "";
        }
        m89571j(this, "coach_opened", null, null, null, AbstractC25247g0.m73990Y(new C23465k("screen_identifier", screenIdentifier), new C23465k("coach_state", m89565c(proactiveAnimationState))), 14, null);
    }

    /* JADX INFO: renamed from: h */
    public final String m89574h(CoachOnboardingStepID stepId) {
        AbstractC22676k.m65750j(stepId, "stepId");
        switch (b.f119244a[stepId.ordinal()]) {
            case 1:
                return "text_intro";
            case 2:
                return "plus_button_intro";
            case 3:
                return "interaction_ways_intro";
            case 4:
                return "keyboard_intro";
            case 5:
                return "voice_message_intro";
            case 6:
                return "onboarding_flow_conclusion";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m89575k(AbstractC12249e event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC12249e.f) {
            m89569g(((AbstractC12249e.f) event).getSource());
            return;
        }
        if (event instanceof AbstractC12249e.g) {
            AbstractC12249e.g gVar = (AbstractC12249e.g) event;
            m89572l(gVar.getScreenName(), gVar.getStepNumber());
            return;
        }
        if (event instanceof AbstractC12249e.a) {
            m89564a(((AbstractC12249e.a) event).getScreenName(), "get_started");
            return;
        }
        if (event instanceof AbstractC12249e.b) {
            m89564a(((AbstractC12249e.b) event).getScreenName(), "next");
            return;
        }
        if (event instanceof AbstractC12249e.e) {
            AbstractC12249e.e eVar = (AbstractC12249e.e) event;
            m89568f(eVar.getScreenIdentifier(), eVar.getWasTextCutoff());
        } else if (event instanceof AbstractC12249e.c) {
            AbstractC12249e.c cVar = (AbstractC12249e.c) event;
            m89566d(cVar.getScreenIdentifier(), cVar.getWasTextCutoff());
        } else {
            if (!(event instanceof AbstractC12249e.d)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC12249e.d dVar = (AbstractC12249e.d) event;
            m89567e(dVar.getScreenIdentifier(), dVar.getDrawerState(), dVar.getDismissType());
        }
    }
}
