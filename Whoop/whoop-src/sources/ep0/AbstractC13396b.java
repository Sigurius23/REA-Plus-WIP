package ep0;

import ad3.AbstractC0770m;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.coacheverywherecommon.models.CoachEducationType;
import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.ChatEntrypointExperience;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.DrawerPresentation;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ep0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lep0/j;", "a", "Lep0/j;", "()Lep0/j;", "sampleScreenContextMetadata", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "b", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "getSampleAiContextMetadata", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "sampleAiContextMetadata", "Lcom/whoop/navigation/AiAction;", "c", "Lcom/whoop/navigation/AiAction;", "getSampleAiAction", "()Lcom/whoop/navigation/AiAction;", "sampleAiAction", "coach-everywhere-common_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13396b {

    /* JADX INFO: renamed from: a */
    private static final C13404j f46920a;

    /* JADX INFO: renamed from: b */
    private static final AiContextMetadata f46921b;

    /* JADX INFO: renamed from: c */
    private static final AiAction f46922c;

    static {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("context", AbstractC0770m.m1841c("Test Screen")), new C23465k("key1", AbstractC0770m.m1841c("value1")), new C23465k("key2", AbstractC0770m.m1841c("value2")));
        CoachEducationType coachEducationType = CoachEducationType.COACH_EVERYWHERE_DAY_ZERO;
        Boolean bool = Boolean.FALSE;
        f46920a = new C13404j("test_screen", null, true, bool, "test_type", "source123", "seed123", null, "Entry text", null, null, "Preset question", null, false, coachEducationType, null, mapM73990Y, "", false, null, null, null, false, 8163970, null);
        f46921b = new AiContextMetadata(true, bool, new C9598e(AppScreen.C9345k1.f27714w, new CoachScreenModel("test_type", "Entry text", "seed123", (Integer) null, (String) null, "Preset question", false, "source123", AbstractC25247g0.m73990Y(new C23465k("context", AbstractC0770m.m1841c("Test Screen")), new C23465k("key1", AbstractC0770m.m1841c("value1")), new C23465k("key2", AbstractC0770m.m1841c("value2"))), "", (String) null, (String) null, (String) null, false, 15384, (DefaultConstructorMarker) null), null, 4, null), coachEducationType, "test_screen", (AiAction) null, (CoachEntry) null, 96, (DefaultConstructorMarker) null);
        f46922c = new AiAction("", (String) null, "test_type", "source123", (String) null, "seed123", "fp_fallback", "Preset question", "COACH_EVERYWHERE_DAY_ZERO", false, "Entry text", bool, (String) null, (String) null, (ChatEntrypointExperience) null, AbstractC25247g0.m73990Y(new C23465k("context", AbstractC0770m.m1841c("Test Screen")), new C23465k("key1", AbstractC0770m.m1841c("value1")), new C23465k("key2", AbstractC0770m.m1841c("value2"))), (DrawerPresentation) null, 90112, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: a */
    public static final C13404j m37823a() {
        return f46920a;
    }
}
