package zo0;

import com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow;
import com.whoop.coacheverywherecommon.models.BottomNavOverride;
import com.whoop.coacheverywherecommon.models.CoachEducationType;
import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.CommunityScreenModel;
import com.whoop.navigation.DrawerPresentation;
import com.whoop.navigation.HealthTabScreenModel;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import ep0.C13404j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import l83.C23465k;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zo0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u00180\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lzo0/a;", "", "<init>", "()V", "Lcom/whoop/navigation/AiAction;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "storedMetadata", "Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;", "tabOverride", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "coachEntry", "Lep0/j;", "e", "(Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lep0/j;", "metadata", "Ll83/a0;", "d", "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;)V", "", "bottomNavTab", "c", "(Ljava/lang/String;)Lep0/j;", "b", "", "Ll83/k;", "a", "()Ljava/util/List;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40913a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private AiContextMetadataBottomRow metadata;

    /* JADX INFO: renamed from: e */
    private final C13404j m132603e(AiAction aiAction, AiContextMetadataBottomRow aiContextMetadataBottomRow, BottomNavOverride bottomNavOverride, CoachEntry coachEntry) {
        String screenId = aiAction.getScreenId();
        String sourceType = aiAction.getSourceType();
        String sourceId = aiAction.getSourceId();
        String conversationSeedId = aiAction.getConversationSeedId();
        String fingerprint = aiAction.getFingerprint();
        String entryText = aiAction.getEntryText();
        if (entryText == null) {
            entryText = aiAction.getStaticInitialMessage();
        }
        String str = entryText;
        String presetQuestion = aiAction.getPresetQuestion();
        Boolean includeInitialMessage = aiAction.getIncludeInitialMessage();
        boolean z4 = true;
        boolean zBooleanValue = includeInitialMessage != null ? includeInitialMessage.booleanValue() : true;
        Boolean boolIsWcePrefetch = bottomNavOverride.isWcePrefetch();
        Map<String, JsonElement> args = aiAction.getArgs();
        CoachEducationType onboardingEducation = aiContextMetadataBottomRow.getOnboardingEducation();
        String source = aiAction.getSource();
        if (!aiAction.getShouldOpenFullSize() && aiAction.getDrawerPresentation() != DrawerPresentation.FULL_SCREEN) {
            z4 = false;
        }
        return new C13404j(null, screenId, false, boolIsWcePrefetch, sourceType, sourceId, conversationSeedId, fingerprint, str, null, null, presetQuestion, null, zBooleanValue, onboardingEducation, null, args, source, z4, null, aiAction.getDrawerPresentation(), coachEntry, true, 562689, null);
    }

    /* JADX INFO: renamed from: a */
    public final List<C23465k> m132604a() {
        AiContextMetadataBottomRow aiContextMetadataBottomRow = this.metadata;
        if (aiContextMetadataBottomRow == null) {
            return C25271y.f99162w;
        }
        List<BottomNavOverride> bottomNavOverrides = aiContextMetadataBottomRow.getBottomNavOverrides();
        ArrayList arrayList = new ArrayList();
        for (BottomNavOverride bottomNavOverride : bottomNavOverrides) {
            C13404j c13404jM132606c = m132606c(bottomNavOverride.getType());
            C23465k c23465k = c13404jM132606c != null ? new C23465k(bottomNavOverride.getType(), c13404jM132606c) : null;
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final C13404j m132605b(String bottomNavTab) {
        Object next;
        AbstractC22676k.m65750j(bottomNavTab, "bottomNavTab");
        AiContextMetadataBottomRow aiContextMetadataBottomRow = this.metadata;
        if (aiContextMetadataBottomRow == null) {
            return null;
        }
        Iterator<T> it = aiContextMetadataBottomRow.getBottomNavOverrides().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((BottomNavOverride) next).getType(), bottomNavTab));
        BottomNavOverride bottomNavOverride = (BottomNavOverride) next;
        if (bottomNavOverride == null) {
            return null;
        }
        C9598e destination = bottomNavOverride.getDestination();
        NavigationScreenModel parameters = destination != null ? destination.getParameters() : null;
        boolean z4 = parameters instanceof CoachScreenModel;
        C25272z c25272z = C25272z.f99163w;
        if (z4) {
            CoachScreenModel coachScreenModel = (CoachScreenModel) parameters;
            String sourceType = coachScreenModel.getSourceType();
            String sourceId = coachScreenModel.getSourceId();
            String conversationSeedId = coachScreenModel.getConversationSeedId();
            String entryText = coachScreenModel.getEntryText();
            String presetQuestion = coachScreenModel.getPresetQuestion();
            boolean includeInitialMessage = coachScreenModel.getIncludeInitialMessage();
            boolean zIsWceEnabled = aiContextMetadataBottomRow.isWceEnabled();
            Map<String, JsonElement> args = coachScreenModel.getArgs();
            return new C13404j(null, null, zIsWceEnabled, null, sourceType, sourceId, conversationSeedId, null, entryText, null, null, presetQuestion, null, includeInitialMessage, aiContextMetadataBottomRow.getOnboardingEducation(), null, args == null ? c25272z : args, coachScreenModel.getSource(), coachScreenModel.getShouldOpenFullSize(), null, null, null, false, 7902731, null);
        }
        if (!(parameters instanceof AiCoachChatScreenModel)) {
            return null;
        }
        AiCoachChatScreenModel aiCoachChatScreenModel = (AiCoachChatScreenModel) parameters;
        String sourceType2 = aiCoachChatScreenModel.getSourceType();
        String sourceId2 = aiCoachChatScreenModel.getSourceId();
        String fingerprint = aiCoachChatScreenModel.getFingerprint();
        String staticInitialMessage = aiCoachChatScreenModel.getStaticInitialMessage();
        boolean zIsWceEnabled2 = aiContextMetadataBottomRow.isWceEnabled();
        Map<String, JsonElement> args2 = aiCoachChatScreenModel.getArgs();
        return new C13404j(null, null, zIsWceEnabled2, null, sourceType2, sourceId2, null, fingerprint, staticInitialMessage, null, null, null, null, false, aiContextMetadataBottomRow.getOnboardingEducation(), null, args2 == null ? c25272z : args2, null, aiCoachChatScreenModel.getShouldOpenFullSize(), null, null, null, false, 7910923, null);
    }

    /* JADX INFO: renamed from: c */
    public final C13404j m132606c(String bottomNavTab) {
        Object next;
        AiAction aiAction;
        AbstractC22676k.m65750j(bottomNavTab, "bottomNavTab");
        AiContextMetadataBottomRow aiContextMetadataBottomRow = this.metadata;
        if (aiContextMetadataBottomRow == null) {
            return null;
        }
        Iterator<T> it = aiContextMetadataBottomRow.getBottomNavOverrides().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((BottomNavOverride) next).getType(), bottomNavTab));
        BottomNavOverride bottomNavOverride = (BottomNavOverride) next;
        if (bottomNavOverride == null) {
            return null;
        }
        CoachEntry coachEntry = bottomNavOverride.getCoachEntry();
        if (coachEntry == null) {
            coachEntry = aiContextMetadataBottomRow.getCoachEntry();
        }
        AiAction aiAction2 = bottomNavOverride.getAiAction();
        if (aiAction2 != null) {
            return m132603e(aiAction2, aiContextMetadataBottomRow, bottomNavOverride, coachEntry);
        }
        C9598e destination = bottomNavOverride.getDestination();
        NavigationScreenModel parameters = destination != null ? destination.getParameters() : null;
        boolean z4 = parameters instanceof CoachScreenModel;
        C25272z c25272z = C25272z.f99163w;
        if (z4) {
            CoachScreenModel coachScreenModel = (CoachScreenModel) parameters;
            String sourceType = coachScreenModel.getSourceType();
            String sourceId = coachScreenModel.getSourceId();
            String conversationSeedId = coachScreenModel.getConversationSeedId();
            String entryText = coachScreenModel.getEntryText();
            String presetQuestion = coachScreenModel.getPresetQuestion();
            boolean includeInitialMessage = coachScreenModel.getIncludeInitialMessage();
            Boolean boolIsWcePrefetch = bottomNavOverride.isWcePrefetch();
            Map<String, JsonElement> args = coachScreenModel.getArgs();
            return new C13404j(null, bottomNavTab, false, boolIsWcePrefetch, sourceType, sourceId, conversationSeedId, null, entryText, null, null, presetQuestion, null, includeInitialMessage, aiContextMetadataBottomRow.getOnboardingEducation(), null, args == null ? c25272z : args, coachScreenModel.getSource(), coachScreenModel.getShouldOpenFullSize(), null, null, coachEntry, true, 1611393, null);
        }
        CoachEntry coachEntry2 = coachEntry;
        if (parameters instanceof AiCoachChatScreenModel) {
            AiCoachChatScreenModel aiCoachChatScreenModel = (AiCoachChatScreenModel) parameters;
            String sourceType2 = aiCoachChatScreenModel.getSourceType();
            String sourceId2 = aiCoachChatScreenModel.getSourceId();
            String fingerprint = aiCoachChatScreenModel.getFingerprint();
            String staticInitialMessage = aiCoachChatScreenModel.getStaticInitialMessage();
            Boolean boolIsWcePrefetch2 = bottomNavOverride.isWcePrefetch();
            Map<String, JsonElement> args2 = aiCoachChatScreenModel.getArgs();
            return new C13404j(null, bottomNavTab, false, boolIsWcePrefetch2, sourceType2, sourceId2, null, fingerprint, staticInitialMessage, null, null, null, null, false, aiContextMetadataBottomRow.getOnboardingEducation(), null, args2 == null ? c25272z : args2, null, aiCoachChatScreenModel.getShouldOpenFullSize(), null, null, coachEntry2, true, 1619521, null);
        }
        if (parameters instanceof HomeScreenModel) {
            AiAction aiAction3 = ((HomeScreenModel) parameters).getAiAction();
            if (aiAction3 != null) {
                return m132603e(aiAction3, aiContextMetadataBottomRow, bottomNavOverride, coachEntry2);
            }
            return null;
        }
        if (parameters instanceof HealthTabScreenModel) {
            AiAction aiAction4 = ((HealthTabScreenModel) parameters).getAiAction();
            if (aiAction4 != null) {
                return m132603e(aiAction4, aiContextMetadataBottomRow, bottomNavOverride, coachEntry2);
            }
            return null;
        }
        if (!(parameters instanceof CommunityScreenModel) || (aiAction = ((CommunityScreenModel) parameters).getAiAction()) == null) {
            return null;
        }
        return m132603e(aiAction, aiContextMetadataBottomRow, bottomNavOverride, coachEntry2);
    }

    /* JADX INFO: renamed from: d */
    public final void m132607d(AiContextMetadataBottomRow metadata) {
        this.metadata = metadata;
    }
}
