package com.whoop.membership.extensions.domain.models;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gw1.C16268a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'Jb\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b6\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b9\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'¨\u0006>"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "", "Lcom/whoop/membership/extensions/domain/models/ProgressContentType;", "type", "", "icon", "title", "subtitle", "Lcom/whoop/membership/extensions/domain/models/Cta;", "primaryCta", "secondaryCta", "Lcom/whoop/membership/extensions/domain/models/CtaAction;", "autoDismissAction", "<init>", "(Lcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/membership/extensions/domain/models/ProgressContentType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/whoop/membership/extensions/domain/models/Cta;", "component6", "component7", "()Lcom/whoop/membership/extensions/domain/models/CtaAction;", "copy", "(Lcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/membership/extensions/domain/models/ProgressContentType;", "getType", "Ljava/lang/String;", "getIcon", "getTitle", "getSubtitle", "Lcom/whoop/membership/extensions/domain/models/Cta;", "getPrimaryCta", "getSecondaryCta", "Lcom/whoop/membership/extensions/domain/models/CtaAction;", "getAutoDismissAction", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressContent {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("auto_dismiss_action")
    @JsonAdapter(CtaActionAdapter.class)
    private final CtaAction autoDismissAction;

    @SerializedName("icon")
    private final String icon;

    @SerializedName("primary_cta")
    private final Cta primaryCta;

    @SerializedName("secondary_cta")
    private final Cta secondaryCta;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("type")
    @JsonAdapter(PlaceOrderResponseTypeAdapter.class)
    private final ProgressContentType type;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/ProgressContent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C16268a(7)), null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C16268a(8))};
    }

    public /* synthetic */ ProgressContent(int i13, ProgressContentType progressContentType, String str, String str2, String str3, Cta cta, Cta cta2, CtaAction ctaAction, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, ProgressContent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = progressContentType;
        this.icon = str;
        this.title = str2;
        this.subtitle = str3;
        this.primaryCta = cta;
        this.secondaryCta = cta2;
        this.autoDismissAction = ctaAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ProgressContentType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return CtaAction.INSTANCE.serializer();
    }

    public static /* synthetic */ ProgressContent copy$default(ProgressContent progressContent, ProgressContentType progressContentType, String str, String str2, String str3, Cta cta, Cta cta2, CtaAction ctaAction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            progressContentType = progressContent.type;
        }
        if ((i13 & 2) != 0) {
            str = progressContent.icon;
        }
        if ((i13 & 4) != 0) {
            str2 = progressContent.title;
        }
        if ((i13 & 8) != 0) {
            str3 = progressContent.subtitle;
        }
        if ((i13 & 16) != 0) {
            cta = progressContent.primaryCta;
        }
        if ((i13 & 32) != 0) {
            cta2 = progressContent.secondaryCta;
        }
        if ((i13 & 64) != 0) {
            ctaAction = progressContent.autoDismissAction;
        }
        Cta cta3 = cta2;
        CtaAction ctaAction2 = ctaAction;
        Cta cta4 = cta;
        String str4 = str2;
        return progressContent.copy(progressContentType, str, str4, str3, cta4, cta3, ctaAction2);
    }

    public static final /* synthetic */ void write$Self$membership_release(ProgressContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.type);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.subtitle);
        Cta$$serializer cta$$serializer = Cta$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, cta$$serializer, self.primaryCta);
        output.encodeNullableSerializableElement(serialDesc, 5, cta$$serializer, self.secondaryCta);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.autoDismissAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProgressContentType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Cta getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Cta getSecondaryCta() {
        return this.secondaryCta;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CtaAction getAutoDismissAction() {
        return this.autoDismissAction;
    }

    public final ProgressContent copy(ProgressContentType type, String icon, String title, String subtitle, Cta primaryCta, Cta secondaryCta, CtaAction autoDismissAction) {
        AbstractC22676k.m65750j(type, "type");
        return new ProgressContent(type, icon, title, subtitle, primaryCta, secondaryCta, autoDismissAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressContent)) {
            return false;
        }
        ProgressContent progressContent = (ProgressContent) other;
        return this.type == progressContent.type && AbstractC22676k.m65745e(this.icon, progressContent.icon) && AbstractC22676k.m65745e(this.title, progressContent.title) && AbstractC22676k.m65745e(this.subtitle, progressContent.subtitle) && AbstractC22676k.m65745e(this.primaryCta, progressContent.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, progressContent.secondaryCta) && this.autoDismissAction == progressContent.autoDismissAction;
    }

    public final CtaAction getAutoDismissAction() {
        return this.autoDismissAction;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final Cta getPrimaryCta() {
        return this.primaryCta;
    }

    public final Cta getSecondaryCta() {
        return this.secondaryCta;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ProgressContentType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Cta cta = this.primaryCta;
        int iHashCode5 = (iHashCode4 + (cta == null ? 0 : cta.hashCode())) * 31;
        Cta cta2 = this.secondaryCta;
        int iHashCode6 = (iHashCode5 + (cta2 == null ? 0 : cta2.hashCode())) * 31;
        CtaAction ctaAction = this.autoDismissAction;
        return iHashCode6 + (ctaAction != null ? ctaAction.hashCode() : 0);
    }

    public String toString() {
        ProgressContentType progressContentType = this.type;
        String str = this.icon;
        String str2 = this.title;
        String str3 = this.subtitle;
        Cta cta = this.primaryCta;
        Cta cta2 = this.secondaryCta;
        CtaAction ctaAction = this.autoDismissAction;
        StringBuilder sb4 = new StringBuilder("ProgressContent(type=");
        sb4.append(progressContentType);
        sb4.append(", icon=");
        sb4.append(str);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str2, ", subtitle=", str3, ", primaryCta=");
        sb4.append(cta);
        sb4.append(", secondaryCta=");
        sb4.append(cta2);
        sb4.append(", autoDismissAction=");
        sb4.append(ctaAction);
        sb4.append(")");
        return sb4.toString();
    }

    public ProgressContent(ProgressContentType type, String str, String str2, String str3, Cta cta, Cta cta2, CtaAction ctaAction) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.icon = str;
        this.title = str2;
        this.subtitle = str3;
        this.primaryCta = cta;
        this.secondaryCta = cta2;
        this.autoDismissAction = ctaAction;
    }
}
