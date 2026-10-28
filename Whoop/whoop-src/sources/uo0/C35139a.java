package uo0;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import j02.AbstractC21155m0;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import m83.C25272z;
import o02.InterfaceC27353d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: uo0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Luo0/a;", "Lo02/d;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/navigation/AiCoachChatScreenModel;", "model", "Lj02/m0$z;", "d", "(Lcom/whoop/navigation/AiCoachChatScreenModel;)Lj02/m0$z;", "Lcom/whoop/navigation/CoachScreenModel;", "e", "(Lcom/whoop/navigation/CoachScreenModel;)Lj02/m0$z;", "Lcom/whoop/navigation/NavigationScreenModel;", "navigationScreenModel", "Lj02/m0;", "c", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35139a implements InterfaceC27353d {

    /* JADX INFO: renamed from: c */
    public static final int f149090c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C35139a(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC21155m0.z m111099d(AiCoachChatScreenModel model) {
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("jj-coach-screen-model-deeplink");
        C25272z c25272z = C25272z.f99163w;
        if (zIsFeatureEnabled && AbstractC22676k.m65745e(model.getSourceType(), "CHAT_WITH_AGENT")) {
            String sourceType = model.getSourceType();
            String staticInitialMessage = model.getStaticInitialMessage();
            String str = staticInitialMessage == null ? "" : staticInitialMessage;
            String fingerprint = model.getFingerprint();
            String presetQuestionKey = model.getPresetQuestionKey();
            String staticInitialMessage2 = model.getStaticInitialMessage();
            boolean z4 = !(staticInitialMessage2 == null || AbstractC39414r.m125890i0(staticInitialMessage2));
            String sourceId = model.getSourceId();
            String str2 = sourceId == null ? "" : sourceId;
            Map<String, JsonElement> args = model.getArgs();
            return new AbstractC21155m0.z(null, null, str, fingerprint, null, sourceType, null, presetQuestionKey, z4, str2, args == null ? c25272z : args, null, 19, null);
        }
        String sourceType2 = model.getSourceType();
        String staticInitialMessage3 = model.getStaticInitialMessage();
        String str3 = staticInitialMessage3 == null ? "" : staticInitialMessage3;
        String fingerprint2 = model.getFingerprint();
        String presetQuestionKey2 = model.getPresetQuestionKey();
        String staticInitialMessage4 = model.getStaticInitialMessage();
        boolean z13 = !(staticInitialMessage4 == null || AbstractC39414r.m125890i0(staticInitialMessage4));
        String sourceId2 = model.getSourceId();
        String str4 = sourceId2 == null ? "" : sourceId2;
        Map<String, JsonElement> args2 = model.getArgs();
        return new AbstractC21155m0.z(null, null, str3, fingerprint2, null, sourceType2, null, presetQuestionKey2, z13, str4, args2 == null ? c25272z : args2, null, 19, null);
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC21155m0.z m111100e(CoachScreenModel model) {
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("jj-coach-screen-model-deeplink");
        C25272z c25272z = C25272z.f99163w;
        if (!zIsFeatureEnabled || !AbstractC22676k.m65745e(model.getSource(), "CHAT_WITH_AGENT")) {
            String sourceType = model.getSourceType();
            String entryText = model.getEntryText();
            String str = entryText == null ? "" : entryText;
            String conversationSeedId = model.getConversationSeedId();
            String presetQuestion = model.getPresetQuestion();
            boolean includeInitialMessage = model.getIncludeInitialMessage();
            String sourceId = model.getSourceId();
            String str2 = sourceId == null ? "" : sourceId;
            Map<String, JsonElement> args = model.getArgs();
            return new AbstractC21155m0.z(null, null, str, conversationSeedId, null, sourceType, presetQuestion, null, includeInitialMessage, str2, args == null ? c25272z : args, model.getSource(), 147, null);
        }
        String source = model.getSource();
        String str3 = source == null ? "" : source;
        String entryText2 = model.getEntryText();
        String str4 = entryText2 == null ? "" : entryText2;
        String deeplinkConversationId = model.getDeeplinkConversationId();
        if (deeplinkConversationId == null) {
            deeplinkConversationId = model.getConversationSeedId();
        }
        String str5 = deeplinkConversationId;
        String presetQuestion2 = model.getPresetQuestion();
        boolean includeInitialMessage2 = model.getIncludeInitialMessage();
        String deeplinkSourceId = model.getDeeplinkSourceId();
        String str6 = (deeplinkSourceId == null && (deeplinkSourceId = model.getSourceId()) == null) ? "" : deeplinkSourceId;
        Map<String, JsonElement> args2 = model.getArgs();
        return new AbstractC21155m0.z(null, null, str4, str5, null, str3, presetQuestion2, null, includeInitialMessage2, str6, args2 == null ? c25272z : args2, model.getSource(), 147, null);
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: b */
    public /* bridge */ InterfaceC27353d mo67682b(List<? extends InterfaceC27353d> list, Map<InterfaceC21461d, ? extends Function1> map) {
        return super.mo67682b(list, map);
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC21155m0 mo67681a(NavigationScreenModel navigationScreenModel) {
        AbstractC22676k.m65750j(navigationScreenModel, "navigationScreenModel");
        if (navigationScreenModel instanceof CoachScreenModel) {
            return m111100e((CoachScreenModel) navigationScreenModel);
        }
        return navigationScreenModel instanceof AiCoachChatScreenModel ? m111099d((AiCoachChatScreenModel) navigationScreenModel) : AbstractC21155m0.j3.f80414b;
    }
}
