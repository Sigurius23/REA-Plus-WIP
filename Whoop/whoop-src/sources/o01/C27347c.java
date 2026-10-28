package o01;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: o01.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J|\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b&\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b'\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b(\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lo01/c;", "Lm91/u;", "", "accessibilityLabel", "hintText", "Lo01/e;", "suggestionCategory", "contextualMessage", "educationType", "conversationSeedId", "sourceType", "sourceId", "", "onboardingGlow", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lo01/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lo01/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;)Lo01/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lo01/e;", "l", "()Lo01/e;", "d", "e", "g", "f", "k", "j", "i", "Z", "()Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27347c implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f109538k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String accessibilityLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String hintText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC27349e suggestionCategory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String contextualMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String educationType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String conversationSeedId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String sourceType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String sourceId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean onboardingGlow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Object event;

    public C27347c(String accessibilityLabel, String hintText, EnumC27349e suggestionCategory, String contextualMessage, String str, String str2, String str3, String str4, boolean z4, Object event) {
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        AbstractC22676k.m65750j(hintText, "hintText");
        AbstractC22676k.m65750j(suggestionCategory, "suggestionCategory");
        AbstractC22676k.m65750j(contextualMessage, "contextualMessage");
        AbstractC22676k.m65750j(event, "event");
        this.accessibilityLabel = accessibilityLabel;
        this.hintText = hintText;
        this.suggestionCategory = suggestionCategory;
        this.contextualMessage = contextualMessage;
        this.educationType = str;
        this.conversationSeedId = str2;
        this.sourceType = str3;
        this.sourceId = str4;
        this.onboardingGlow = z4;
        this.event = event;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27347c m82506b(C27347c c27347c, String str, String str2, EnumC27349e enumC27349e, String str3, String str4, String str5, String str6, String str7, boolean z4, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            str = c27347c.accessibilityLabel;
        }
        if ((i13 & 2) != 0) {
            str2 = c27347c.hintText;
        }
        if ((i13 & 4) != 0) {
            enumC27349e = c27347c.suggestionCategory;
        }
        if ((i13 & 8) != 0) {
            str3 = c27347c.contextualMessage;
        }
        if ((i13 & 16) != 0) {
            str4 = c27347c.educationType;
        }
        if ((i13 & 32) != 0) {
            str5 = c27347c.conversationSeedId;
        }
        if ((i13 & 64) != 0) {
            str6 = c27347c.sourceType;
        }
        if ((i13 & 128) != 0) {
            str7 = c27347c.sourceId;
        }
        if ((i13 & 256) != 0) {
            z4 = c27347c.onboardingGlow;
        }
        if ((i13 & 512) != 0) {
            obj = c27347c.event;
        }
        boolean z13 = z4;
        Object obj3 = obj;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return c27347c.m82507a(str, str2, enumC27349e, str3, str10, str11, str8, str9, z13, obj3);
    }

    /* JADX INFO: renamed from: a */
    public final C27347c m82507a(String accessibilityLabel, String hintText, EnumC27349e suggestionCategory, String contextualMessage, String educationType, String conversationSeedId, String sourceType, String sourceId, boolean onboardingGlow, Object event) {
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        AbstractC22676k.m65750j(hintText, "hintText");
        AbstractC22676k.m65750j(suggestionCategory, "suggestionCategory");
        AbstractC22676k.m65750j(contextualMessage, "contextualMessage");
        AbstractC22676k.m65750j(event, "event");
        return new C27347c(accessibilityLabel, hintText, suggestionCategory, contextualMessage, educationType, conversationSeedId, sourceType, sourceId, onboardingGlow, event);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getContextualMessage() {
        return this.contextualMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27347c)) {
            return false;
        }
        C27347c c27347c = (C27347c) other;
        return AbstractC22676k.m65745e(this.accessibilityLabel, c27347c.accessibilityLabel) && AbstractC22676k.m65745e(this.hintText, c27347c.hintText) && this.suggestionCategory == c27347c.suggestionCategory && AbstractC22676k.m65745e(this.contextualMessage, c27347c.contextualMessage) && AbstractC22676k.m65745e(this.educationType, c27347c.educationType) && AbstractC22676k.m65745e(this.conversationSeedId, c27347c.conversationSeedId) && AbstractC22676k.m65745e(this.sourceType, c27347c.sourceType) && AbstractC22676k.m65745e(this.sourceId, c27347c.sourceId) && this.onboardingGlow == c27347c.onboardingGlow && AbstractC22676k.m65745e(this.event, c27347c.event);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getEducationType() {
        return this.educationType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.suggestionCategory.hashCode() + AbstractC11266d.m30450d(this.accessibilityLabel.hashCode() * 31, 31, this.hintText)) * 31, 31, this.contextualMessage);
        String str = this.educationType;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.conversationSeedId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sourceId;
        return this.event.hashCode() + AbstractC2875y.m8289b((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.onboardingGlow);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getOnboardingGlow() {
        return this.onboardingGlow;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC27349e getSuggestionCategory() {
        return this.suggestionCategory;
    }

    public String toString() {
        String str = this.accessibilityLabel;
        String str2 = this.hintText;
        EnumC27349e enumC27349e = this.suggestionCategory;
        String str3 = this.contextualMessage;
        String str4 = this.educationType;
        String str5 = this.conversationSeedId;
        String str6 = this.sourceType;
        String str7 = this.sourceId;
        boolean z4 = this.onboardingGlow;
        Object obj = this.event;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiChatEntryViewState(accessibilityLabel=", str, ", hintText=", str2, ", suggestionCategory=");
        sbM32001t.append(enumC27349e);
        sbM32001t.append(", contextualMessage=");
        sbM32001t.append(str3);
        sbM32001t.append(", educationType=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", conversationSeedId=", str5, ", sourceType=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", sourceId=", str7, ", onboardingGlow=");
        sbM32001t.append(z4);
        sbM32001t.append(", event=");
        sbM32001t.append(obj);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C27347c(String str, String str2, EnumC27349e enumC27349e, String str3, String str4, String str5, String str6, String str7, boolean z4, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? EnumC27349e.GENERAL : enumC27349e, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, (i13 & 128) != 0 ? null : str7, (i13 & 256) != 0 ? false : z4, (i13 & 512) != 0 ? C23454a0.f92919a : obj);
    }
}
