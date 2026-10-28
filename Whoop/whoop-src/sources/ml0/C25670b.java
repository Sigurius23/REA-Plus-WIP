package ml0;

import ad3.AbstractC0757c;
import android.net.Uri;
import com.whoop.data.repositories.FeatureFlagChecker;
import j02.AbstractC21155m0;
import j02.AbstractC21161p0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import or2.AbstractC28152c1;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ml0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lml0/b;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "", "Lkotlinx/serialization/json/JsonElement;", "args", "a", "(Ljava/util/Map;)Ljava/lang/String;", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "Lj02/i0;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25670b implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C25670b(C21147i0 navDeepLinkRequestHelper, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    private final String m75584a(Map<String, ? extends JsonElement> args) {
        if (args.isEmpty()) {
            return "";
        }
        try {
            String strEncode = URLEncoder.encode(AbstractC0757c.f2762d.m1833d(JsonElement.Companion.serializer(), new JsonObject(args)), "UTF-8");
            AbstractC22676k.m65747g(strEncode);
            return strEncode;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) throws UnsupportedEncodingException {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.z)) {
            return InterfaceC21149j0.d.f80241a;
        }
        if (this.featureFlagChecker.isFeatureEnabled("whoop-coach-tool-calling-mobile")) {
            return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/whoop-coach"), AbstractC28152c1.m85184b(), AbstractC21161p0.d.f80690a);
        }
        AbstractC21155m0.z zVar = (AbstractC21155m0.z) navigationScreen;
        String suggestionCategory = zVar.getSuggestionCategory();
        String strEncode = URLEncoder.encode(zVar.getHint(), "UTF-8");
        String strEncode2 = Uri.encode(zVar.getContextualMessage());
        String conversationIdSeed = zVar.getConversationIdSeed();
        String sourcePillar = zVar.getSourcePillar();
        if (sourcePillar == null) {
            sourcePillar = "";
        }
        String sourceType = zVar.getSourceType();
        if (sourceType == null) {
            sourceType = "";
        }
        String presetQuestion = zVar.getPresetQuestion();
        boolean includeInitialMessage = zVar.getIncludeInitialMessage();
        String sourceId = zVar.getSourceId();
        String source = zVar.getSource();
        String str = source != null ? source : "";
        String strM75584a = m75584a(zVar.m59369b());
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/ai-coach?suggestion=", suggestionCategory, "&hint=", strEncode, "&contextualMessage=");
        AbstractC11266d.m30444B(sbM32001t, strEncode2, "&conversationIdSeed=", conversationIdSeed, "&sourcePillar=");
        AbstractC11266d.m30444B(sbM32001t, sourcePillar, "&sourceType=", sourceType, "&includeInitialMessage=");
        sbM32001t.append(includeInitialMessage);
        sbM32001t.append("&sourceId=");
        sbM32001t.append(sourceId);
        String string = sbM32001t.toString();
        if (presetQuestion != null) {
            string = ((Object) string) + "&presetQuestion=" + presetQuestion;
        }
        if (strM75584a.length() > 0) {
            string = ((Object) string) + "&args=" + strM75584a;
        }
        return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a(((Object) string) + "&source=" + str), AbstractC28152c1.m85184b(), AbstractC21161p0.d.f80690a);
    }

    public /* synthetic */ C25670b(C21147i0 c21147i0, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0, featureFlagChecker);
    }
}
