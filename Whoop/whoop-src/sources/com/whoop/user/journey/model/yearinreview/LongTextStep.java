package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
import cq2.C11062a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJJ\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b0\u0010\u001c¨\u00063"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/LongTextStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "", "texts", "name", "backgroundImageUrl", "theme", "themeVariant", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/LongTextStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/LongTextStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTexts", "Ljava/lang/String;", "getName", "getBackgroundImageUrl", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LongTextStep implements UserJourneyStep {
    private final String backgroundImageUrl;
    private final String name;
    private final List<String> texts;
    private final String theme;
    private final String themeVariant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11062a(7)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/LongTextStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/LongTextStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LongTextStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LongTextStep(int i13, List list, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (27 != (i13 & 27)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 27, LongTextStep$$serializer.INSTANCE.getDescriptor());
        }
        this.texts = list;
        this.name = str;
        if ((i13 & 4) == 0) {
            this.backgroundImageUrl = null;
        } else {
            this.backgroundImageUrl = str2;
        }
        this.theme = str3;
        this.themeVariant = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LongTextStep copy$default(LongTextStep longTextStep, List list, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = longTextStep.texts;
        }
        if ((i13 & 2) != 0) {
            str = longTextStep.name;
        }
        if ((i13 & 4) != 0) {
            str2 = longTextStep.backgroundImageUrl;
        }
        if ((i13 & 8) != 0) {
            str3 = longTextStep.theme;
        }
        if ((i13 & 16) != 0) {
            str4 = longTextStep.themeVariant;
        }
        String str5 = str4;
        String str6 = str2;
        return longTextStep.copy(list, str, str6, str3, str5);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(LongTextStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.texts);
        output.encodeStringElement(serialDesc, 1, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.backgroundImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.backgroundImageUrl);
        }
        output.encodeStringElement(serialDesc, 3, self.theme);
        output.encodeStringElement(serialDesc, 4, self.themeVariant);
    }

    public final List<String> component1() {
        return this.texts;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final LongTextStep copy(List<String> texts, String name, String backgroundImageUrl, String theme, String themeVariant) {
        AbstractC22676k.m65750j(texts, "texts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new LongTextStep(texts, name, backgroundImageUrl, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LongTextStep)) {
            return false;
        }
        LongTextStep longTextStep = (LongTextStep) other;
        return AbstractC22676k.m65745e(this.texts, longTextStep.texts) && AbstractC22676k.m65745e(this.name, longTextStep.name) && AbstractC22676k.m65745e(this.backgroundImageUrl, longTextStep.backgroundImageUrl) && AbstractC22676k.m65745e(this.theme, longTextStep.theme) && AbstractC22676k.m65745e(this.themeVariant, longTextStep.themeVariant);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getTexts() {
        return this.texts;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.texts.hashCode() * 31, 31, this.name);
        String str = this.backgroundImageUrl;
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.theme);
    }

    public String toString() {
        List<String> list = this.texts;
        String str = this.name;
        String str2 = this.backgroundImageUrl;
        String str3 = this.theme;
        String str4 = this.themeVariant;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("LongTextStep(texts=", ", name=", str, ", backgroundImageUrl=", list);
        AbstractC11266d.m30444B(sbM79507k, str2, ", theme=", str3, ", themeVariant=");
        return AbstractC25012a.m73376i(str4, ")", sbM79507k);
    }

    public LongTextStep(List<String> texts, String name, String str, String theme, String themeVariant) {
        AbstractC22676k.m65750j(texts, "texts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.texts = texts;
        this.name = name;
        this.backgroundImageUrl = str;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }

    public /* synthetic */ LongTextStep(List list, String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i13 & 4) != 0 ? null : str2, str3, str4);
    }
}
