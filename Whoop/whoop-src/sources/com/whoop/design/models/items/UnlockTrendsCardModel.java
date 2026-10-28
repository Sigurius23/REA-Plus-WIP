package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJR\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b2\u0010\u001f¨\u00065"}, m65681d2 = {"Lcom/whoop/design/models/items/UnlockTrendsCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "topImageUrl", "title", "subtitle", "body", "", "filledCount", "totalCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/UnlockTrendsCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/whoop/design/models/items/UnlockTrendsCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTopImageUrl", "getTitle", "getSubtitle", "getBody", "Ljava/lang/Integer;", "getFilledCount", "getTotalCount", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UnlockTrendsCardModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String body;
    private final Integer filledCount;
    private final String subtitle;
    private final String title;
    private final String topImageUrl;
    private final Integer totalCount;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/UnlockTrendsCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/UnlockTrendsCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UnlockTrendsCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UnlockTrendsCardModel(int i13, String str, String str2, String str3, String str4, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, UnlockTrendsCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.topImageUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.body = str4;
        this.filledCount = num;
        this.totalCount = num2;
    }

    public static /* synthetic */ UnlockTrendsCardModel copy$default(UnlockTrendsCardModel unlockTrendsCardModel, String str, String str2, String str3, String str4, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = unlockTrendsCardModel.topImageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = unlockTrendsCardModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = unlockTrendsCardModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = unlockTrendsCardModel.body;
        }
        if ((i13 & 16) != 0) {
            num = unlockTrendsCardModel.filledCount;
        }
        if ((i13 & 32) != 0) {
            num2 = unlockTrendsCardModel.totalCount;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return unlockTrendsCardModel.copy(str, str2, str3, str4, num3, num4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(UnlockTrendsCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.topImageUrl);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.body);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, intSerializer, self.filledCount);
        output.encodeNullableSerializableElement(serialDesc, 5, intSerializer, self.totalCount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopImageUrl() {
        return this.topImageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getFilledCount() {
        return this.filledCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final UnlockTrendsCardModel copy(String topImageUrl, String title, String subtitle, String body, Integer filledCount, Integer totalCount) {
        AbstractC22676k.m65750j(topImageUrl, "topImageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new UnlockTrendsCardModel(topImageUrl, title, subtitle, body, filledCount, totalCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnlockTrendsCardModel)) {
            return false;
        }
        UnlockTrendsCardModel unlockTrendsCardModel = (UnlockTrendsCardModel) other;
        return AbstractC22676k.m65745e(this.topImageUrl, unlockTrendsCardModel.topImageUrl) && AbstractC22676k.m65745e(this.title, unlockTrendsCardModel.title) && AbstractC22676k.m65745e(this.subtitle, unlockTrendsCardModel.subtitle) && AbstractC22676k.m65745e(this.body, unlockTrendsCardModel.body) && AbstractC22676k.m65745e(this.filledCount, unlockTrendsCardModel.filledCount) && AbstractC22676k.m65745e(this.totalCount, unlockTrendsCardModel.totalCount);
    }

    public final String getBody() {
        return this.body;
    }

    public final Integer getFilledCount() {
        return this.filledCount;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTopImageUrl() {
        return this.topImageUrl;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.topImageUrl.hashCode() * 31, 31, this.title), 31, this.subtitle);
        String str = this.body;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.filledCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.topImageUrl;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.body;
        Integer num = this.filledCount;
        Integer num2 = this.totalCount;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UnlockTrendsCardModel(topImageUrl=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", body=", str4, ", filledCount=");
        sbM32001t.append(num);
        sbM32001t.append(", totalCount=");
        sbM32001t.append(num2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public UnlockTrendsCardModel(String topImageUrl, String title, String subtitle, String str, Integer num, Integer num2) {
        AbstractC22676k.m65750j(topImageUrl, "topImageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.topImageUrl = topImageUrl;
        this.title = title;
        this.subtitle = subtitle;
        this.body = str;
        this.filledCount = num;
        this.totalCount = num2;
    }
}
