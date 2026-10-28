package com.whoop.bot.models.conversation;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import j02.C21179y0;
import kotlinx.serialization.internal.EnumsKt;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJT\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b1\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b2\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b3\u0010\u001d¨\u00066"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/AdditionalContextModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lgz0/m0;", "icon", "", "s3IconUrl", "title", "subtitle", "value", "style", "<init>", "(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/AdditionalContextModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lgz0/m0;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/bot/models/conversation/AdditionalContextModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgz0/m0;", "getIcon", "Ljava/lang/String;", "getS3IconUrl", "getTitle", "getSubtitle", "getValue", "getStyle", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AdditionalContextModel implements DesignSystemModel {
    public static final int $stable = 0;
    private final EnumC16313m0 icon;
    private final String s3IconUrl;
    private final String style;
    private final String subtitle;
    private final String title;
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21179y0(23)), null, null, null, null, null};

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/AdditionalContextModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/AdditionalContextModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AdditionalContextModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdditionalContextModel(int i13, EnumC16313m0 enumC16313m0, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, AdditionalContextModel$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = enumC16313m0;
        this.s3IconUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.value = str4;
        this.style = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ AdditionalContextModel copy$default(AdditionalContextModel additionalContextModel, EnumC16313m0 enumC16313m0, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC16313m0 = additionalContextModel.icon;
        }
        if ((i13 & 2) != 0) {
            str = additionalContextModel.s3IconUrl;
        }
        if ((i13 & 4) != 0) {
            str2 = additionalContextModel.title;
        }
        if ((i13 & 8) != 0) {
            str3 = additionalContextModel.subtitle;
        }
        if ((i13 & 16) != 0) {
            str4 = additionalContextModel.value;
        }
        if ((i13 & 32) != 0) {
            str5 = additionalContextModel.style;
        }
        String str6 = str4;
        String str7 = str5;
        return additionalContextModel.copy(enumC16313m0, str, str2, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$bot_release(AdditionalContextModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.icon);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.s3IconUrl);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.value);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getS3IconUrl() {
        return this.s3IconUrl;
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
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final AdditionalContextModel copy(EnumC16313m0 icon, String s3IconUrl, String title, String subtitle, String value, String style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new AdditionalContextModel(icon, s3IconUrl, title, subtitle, value, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalContextModel)) {
            return false;
        }
        AdditionalContextModel additionalContextModel = (AdditionalContextModel) other;
        return this.icon == additionalContextModel.icon && AbstractC22676k.m65745e(this.s3IconUrl, additionalContextModel.s3IconUrl) && AbstractC22676k.m65745e(this.title, additionalContextModel.title) && AbstractC22676k.m65745e(this.subtitle, additionalContextModel.subtitle) && AbstractC22676k.m65745e(this.value, additionalContextModel.value) && AbstractC22676k.m65745e(this.style, additionalContextModel.style);
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final String getS3IconUrl() {
        return this.s3IconUrl;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode = (enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31;
        String str = this.s3IconUrl;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.subtitle);
        String str2 = this.value;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.style;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        String str = this.s3IconUrl;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.value;
        String str5 = this.style;
        StringBuilder sb4 = new StringBuilder("AdditionalContextModel(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", s3IconUrl=");
        sb4.append(str);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str2, ", subtitle=", str3, ", value=");
        return AbstractC11266d.m30464r(sb4, str4, ", style=", str5, ")");
    }

    public AdditionalContextModel(EnumC16313m0 enumC16313m0, String str, String title, String subtitle, String str2, String str3) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.icon = enumC16313m0;
        this.s3IconUrl = str;
        this.title = title;
        this.subtitle = subtitle;
        this.value = str2;
        this.style = str3;
    }
}
