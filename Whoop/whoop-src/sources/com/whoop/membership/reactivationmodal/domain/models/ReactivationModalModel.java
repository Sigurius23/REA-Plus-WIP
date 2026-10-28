package com.whoop.membership.reactivationmodal.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33691b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010B{\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010)Jv\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b?\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;", "", "", "mediaUrl", "imageUrl", "icon", "tagText", "title", "subtitle", "", "Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;", "memberStatistics", "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;", "cta", "secondaryCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;)Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMediaUrl", "getImageUrl", "getIcon", "getTagText", "getTitle", "getSubtitle", "Ljava/util/List;", "getMemberStatistics", "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;", "getCta", "getSecondaryCta", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReactivationModalModel {
    private final ReactivationModalCtaModel cta;
    private final String icon;
    private final String imageUrl;
    private final String mediaUrl;
    private final List<MemberStatisticsModel> memberStatistics;
    private final ReactivationModalCtaModel secondaryCta;
    private final String subtitle;
    private final String tagText;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33691b(27)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReactivationModalModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReactivationModalModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, List list, ReactivationModalCtaModel reactivationModalCtaModel, ReactivationModalCtaModel reactivationModalCtaModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, ReactivationModalModel$$serializer.INSTANCE.getDescriptor());
        }
        this.mediaUrl = str;
        this.imageUrl = str2;
        this.icon = str3;
        this.tagText = str4;
        this.title = str5;
        this.subtitle = str6;
        this.memberStatistics = list;
        this.cta = reactivationModalCtaModel;
        this.secondaryCta = reactivationModalCtaModel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(MemberStatisticsModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactivationModalModel copy$default(ReactivationModalModel reactivationModalModel, String str, String str2, String str3, String str4, String str5, String str6, List list, ReactivationModalCtaModel reactivationModalCtaModel, ReactivationModalCtaModel reactivationModalCtaModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reactivationModalModel.mediaUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = reactivationModalModel.imageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = reactivationModalModel.icon;
        }
        if ((i13 & 8) != 0) {
            str4 = reactivationModalModel.tagText;
        }
        if ((i13 & 16) != 0) {
            str5 = reactivationModalModel.title;
        }
        if ((i13 & 32) != 0) {
            str6 = reactivationModalModel.subtitle;
        }
        if ((i13 & 64) != 0) {
            list = reactivationModalModel.memberStatistics;
        }
        if ((i13 & 128) != 0) {
            reactivationModalCtaModel = reactivationModalModel.cta;
        }
        if ((i13 & 256) != 0) {
            reactivationModalCtaModel2 = reactivationModalModel.secondaryCta;
        }
        ReactivationModalCtaModel reactivationModalCtaModel3 = reactivationModalCtaModel;
        ReactivationModalCtaModel reactivationModalCtaModel4 = reactivationModalCtaModel2;
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return reactivationModalModel.copy(str, str2, str9, str4, str8, str7, list2, reactivationModalCtaModel3, reactivationModalCtaModel4);
    }

    public static final /* synthetic */ void write$Self$membership_release(ReactivationModalModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.mediaUrl);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.imageUrl);
        output.encodeStringElement(serialDesc, 2, self.icon);
        output.encodeStringElement(serialDesc, 3, self.tagText);
        output.encodeStringElement(serialDesc, 4, self.title);
        output.encodeStringElement(serialDesc, 5, self.subtitle);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.memberStatistics);
        ReactivationModalCtaModel$$serializer reactivationModalCtaModel$$serializer = ReactivationModalCtaModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 7, reactivationModalCtaModel$$serializer, self.cta);
        output.encodeNullableSerializableElement(serialDesc, 8, reactivationModalCtaModel$$serializer, self.secondaryCta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTagText() {
        return this.tagText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<MemberStatisticsModel> component7() {
        return this.memberStatistics;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ReactivationModalCtaModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ReactivationModalCtaModel getSecondaryCta() {
        return this.secondaryCta;
    }

    public final ReactivationModalModel copy(String mediaUrl, String imageUrl, String icon, String tagText, String title, String subtitle, List<MemberStatisticsModel> memberStatistics, ReactivationModalCtaModel cta, ReactivationModalCtaModel secondaryCta) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(tagText, "tagText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(memberStatistics, "memberStatistics");
        AbstractC22676k.m65750j(cta, "cta");
        return new ReactivationModalModel(mediaUrl, imageUrl, icon, tagText, title, subtitle, memberStatistics, cta, secondaryCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactivationModalModel)) {
            return false;
        }
        ReactivationModalModel reactivationModalModel = (ReactivationModalModel) other;
        return AbstractC22676k.m65745e(this.mediaUrl, reactivationModalModel.mediaUrl) && AbstractC22676k.m65745e(this.imageUrl, reactivationModalModel.imageUrl) && AbstractC22676k.m65745e(this.icon, reactivationModalModel.icon) && AbstractC22676k.m65745e(this.tagText, reactivationModalModel.tagText) && AbstractC22676k.m65745e(this.title, reactivationModalModel.title) && AbstractC22676k.m65745e(this.subtitle, reactivationModalModel.subtitle) && AbstractC22676k.m65745e(this.memberStatistics, reactivationModalModel.memberStatistics) && AbstractC22676k.m65745e(this.cta, reactivationModalModel.cta) && AbstractC22676k.m65745e(this.secondaryCta, reactivationModalModel.secondaryCta);
    }

    public final ReactivationModalCtaModel getCta() {
        return this.cta;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    public final List<MemberStatisticsModel> getMemberStatistics() {
        return this.memberStatistics;
    }

    public final ReactivationModalCtaModel getSecondaryCta() {
        return this.secondaryCta;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTagText() {
        return this.tagText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.mediaUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageUrl;
        int iHashCode2 = (this.cta.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.icon), 31, this.tagText), 31, this.title), 31, this.subtitle), 31, this.memberStatistics)) * 31;
        ReactivationModalCtaModel reactivationModalCtaModel = this.secondaryCta;
        return iHashCode2 + (reactivationModalCtaModel != null ? reactivationModalCtaModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.mediaUrl;
        String str2 = this.imageUrl;
        String str3 = this.icon;
        String str4 = this.tagText;
        String str5 = this.title;
        String str6 = this.subtitle;
        List<MemberStatisticsModel> list = this.memberStatistics;
        ReactivationModalCtaModel reactivationModalCtaModel = this.cta;
        ReactivationModalCtaModel reactivationModalCtaModel2 = this.secondaryCta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReactivationModalModel(mediaUrl=", str, ", imageUrl=", str2, ", icon=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", tagText=", str4, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", subtitle=", str6, ", memberStatistics=");
        sbM32001t.append(list);
        sbM32001t.append(", cta=");
        sbM32001t.append(reactivationModalCtaModel);
        sbM32001t.append(", secondaryCta=");
        sbM32001t.append(reactivationModalCtaModel2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ReactivationModalModel(String str, String str2, String icon, String tagText, String title, String subtitle, List<MemberStatisticsModel> memberStatistics, ReactivationModalCtaModel cta, ReactivationModalCtaModel reactivationModalCtaModel) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(tagText, "tagText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(memberStatistics, "memberStatistics");
        AbstractC22676k.m65750j(cta, "cta");
        this.mediaUrl = str;
        this.imageUrl = str2;
        this.icon = icon;
        this.tagText = tagText;
        this.title = title;
        this.subtitle = subtitle;
        this.memberStatistics = memberStatistics;
        this.cta = cta;
        this.secondaryCta = reactivationModalCtaModel;
    }
}
