package com.whoop.coacheverywherecommon.models;

import com.whoop.navigation.AiAction;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.DrawerPresentation;
import com.whoop.navigation.NavigationScreenModel;
import ep0.C13404j;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.whoop.coacheverywherecommon.models.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "Lep0/j;", "a", "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;", "Lcom/whoop/navigation/AiAction;", "", "isWceEnabled", "b", "(Lcom/whoop/navigation/AiAction;Z)Lep0/j;", "coach-everywhere-common_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6219a {
    /* JADX INFO: renamed from: a */
    public static final C13404j m18523a(AiContextMetadata aiContextMetadata) {
        AbstractC22676k.m65750j(aiContextMetadata, "<this>");
        AiAction aiAction = aiContextMetadata.getAiAction();
        if (aiAction != null) {
            C13404j c13404jM18524b = m18524b(aiAction, aiContextMetadata.isWceEnabled());
            String screenIdentifier = aiContextMetadata.getScreenIdentifier();
            if (screenIdentifier.length() == 0) {
                screenIdentifier = c13404jM18524b.getScreenName();
            }
            String str = screenIdentifier;
            Boolean boolIsWcePrefetch = aiContextMetadata.isWcePrefetch();
            CoachEducationType onboardingEducation = aiContextMetadata.getOnboardingEducation();
            if (onboardingEducation == null) {
                onboardingEducation = c13404jM18524b.getEducationType();
            }
            return C13404j.m37844b(c13404jM18524b, str, null, false, boolIsWcePrefetch, null, null, null, null, null, null, null, null, null, false, onboardingEducation, null, null, null, false, null, null, aiContextMetadata.getCoachEntry(), false, 6275062, null);
        }
        C9598e destination = aiContextMetadata.getDestination();
        NavigationScreenModel parameters = destination != null ? destination.getParameters() : null;
        boolean z4 = parameters instanceof AiCoachChatScreenModel;
        C25272z c25272z = C25272z.f99163w;
        if (z4) {
            String screenIdentifier2 = aiContextMetadata.getScreenIdentifier();
            boolean zIsWceEnabled = aiContextMetadata.isWceEnabled();
            Boolean boolIsWcePrefetch2 = aiContextMetadata.isWcePrefetch();
            AiCoachChatScreenModel aiCoachChatScreenModel = (AiCoachChatScreenModel) parameters;
            String sourceId = aiCoachChatScreenModel.getSourceId();
            String sourceType = aiCoachChatScreenModel.getSourceType();
            String fingerprint = aiCoachChatScreenModel.getFingerprint();
            String staticInitialMessage = aiCoachChatScreenModel.getStaticInitialMessage();
            String userMessage = aiCoachChatScreenModel.getUserMessage();
            String presetQuestionKey = aiCoachChatScreenModel.getPresetQuestionKey();
            String staticInitialMessage2 = aiCoachChatScreenModel.getStaticInitialMessage();
            boolean z13 = !(staticInitialMessage2 == null || AbstractC39414r.m125890i0(staticInitialMessage2));
            CoachEducationType onboardingEducation2 = aiContextMetadata.getOnboardingEducation();
            Map<String, JsonElement> args = aiCoachChatScreenModel.getArgs();
            return new C13404j(screenIdentifier2, null, zIsWceEnabled, boolIsWcePrefetch2, sourceType, sourceId, null, fingerprint, staticInitialMessage, userMessage, null, null, presetQuestionKey, z13, onboardingEducation2, null, args == null ? c25272z : args, null, aiCoachChatScreenModel.getShouldOpenFullSize(), null, null, aiContextMetadata.getCoachEntry(), false, 5932098, null);
        }
        if (!(parameters instanceof CoachScreenModel)) {
            return null;
        }
        String screenIdentifier3 = aiContextMetadata.getScreenIdentifier();
        boolean zIsWceEnabled2 = aiContextMetadata.isWceEnabled();
        Boolean boolIsWcePrefetch3 = aiContextMetadata.isWcePrefetch();
        CoachScreenModel coachScreenModel = (CoachScreenModel) parameters;
        String sourceId2 = coachScreenModel.getSourceId();
        String sourceType2 = coachScreenModel.getSourceType();
        String conversationSeedId = coachScreenModel.getConversationSeedId();
        String entryText = coachScreenModel.getEntryText();
        String presetQuestion = coachScreenModel.getPresetQuestion();
        boolean includeInitialMessage = coachScreenModel.getIncludeInitialMessage();
        CoachEducationType onboardingEducation3 = aiContextMetadata.getOnboardingEducation();
        Map<String, JsonElement> args2 = coachScreenModel.getArgs();
        return new C13404j(screenIdentifier3, null, zIsWceEnabled2, boolIsWcePrefetch3, sourceType2, sourceId2, conversationSeedId, null, entryText, null, null, presetQuestion, null, includeInitialMessage, onboardingEducation3, null, args2 == null ? c25272z : args2, coachScreenModel.getSource(), coachScreenModel.getShouldOpenFullSize(), null, null, aiContextMetadata.getCoachEntry(), false, 5805698, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX INFO: renamed from: b */
    public static final C13404j m18524b(AiAction aiAction, boolean z4) {
        String entryText;
        boolean z13;
        boolean zBooleanValue;
        String source;
        boolean z14;
        AbstractC22676k.m65750j(aiAction, "<this>");
        String staticInitialMessage = aiAction.getStaticInitialMessage();
        if (staticInitialMessage == null) {
            entryText = aiAction.getEntryText();
        } else {
            entryText = (AbstractC39414r.m125890i0(staticInitialMessage) || staticInitialMessage.equals("null")) ? null : staticInitialMessage;
            if (entryText == null) {
                entryText = aiAction.getEntryText();
            }
        }
        String str = entryText;
        if (staticInitialMessage == null) {
            Boolean includeInitialMessage = aiAction.getIncludeInitialMessage();
            if (includeInitialMessage != null) {
                zBooleanValue = includeInitialMessage.booleanValue();
            } else {
                z13 = true;
            }
            source = aiAction.getSource();
            if (source == null) {
                source = "";
            }
            String str2 = source;
            String screenId = aiAction.getScreenId();
            String fingerprint = aiAction.getFingerprint();
            String conversationSeedId = aiAction.getConversationSeedId();
            String sourceType = aiAction.getSourceType();
            String sourceId = aiAction.getSourceId();
            String userMessage = aiAction.getUserMessage();
            String presetQuestion = aiAction.getPresetQuestion();
            CoachEducationType coachEducationTypeM18519a = CoachEducationType.INSTANCE.m18519a(aiAction.getEducationType());
            Map<String, JsonElement> args = aiAction.getArgs();
            String source2 = aiAction.getSource();
            if (!aiAction.getShouldOpenFullSize() || aiAction.getDrawerPresentation() == DrawerPresentation.FULL_SCREEN) {
                z14 = true;
            } else {
                z14 = false;
            }
            return new C13404j(str2, screenId, z4, null, sourceType, sourceId, conversationSeedId, fingerprint, str, userMessage, null, presetQuestion, null, z13, coachEducationTypeM18519a, null, args, source2, z14, aiAction.getEntrypointExperience(), aiAction.getDrawerPresentation(), null, false, 6329352, null);
        }
        zBooleanValue = (AbstractC39414r.m125890i0(staticInitialMessage) || staticInitialMessage.equals("null")) ? false : true;
        z13 = zBooleanValue;
        source = aiAction.getSource();
        if (source == null) {
            source = "";
        }
        String str3 = source;
        String screenId2 = aiAction.getScreenId();
        String fingerprint2 = aiAction.getFingerprint();
        String conversationSeedId2 = aiAction.getConversationSeedId();
        String sourceType2 = aiAction.getSourceType();
        String sourceId2 = aiAction.getSourceId();
        String userMessage2 = aiAction.getUserMessage();
        String presetQuestion2 = aiAction.getPresetQuestion();
        CoachEducationType coachEducationTypeM18519a2 = CoachEducationType.INSTANCE.m18519a(aiAction.getEducationType());
        Map<String, JsonElement> args2 = aiAction.getArgs();
        String source3 = aiAction.getSource();
        if (aiAction.getShouldOpenFullSize()) {
            z14 = true;
        } else {
            z14 = true;
        }
        return new C13404j(str3, screenId2, z4, null, sourceType2, sourceId2, conversationSeedId2, fingerprint2, str, userMessage2, null, presetQuestion2, null, z13, coachEducationTypeM18519a2, null, args2, source3, z14, aiAction.getEntrypointExperience(), aiAction.getDrawerPresentation(), null, false, 6329352, null);
    }
}
