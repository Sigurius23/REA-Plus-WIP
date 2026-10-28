package com.whoop.membership.dunning.domain.models;

import com.whoop.membership.reactivationmodal.domain.models.MemberStatisticsModel;
import com.whoop.membership.reactivationmodal.domain.models.MemberStatisticsModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import yo0.C39681c;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\\\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b9\u0010\u001e¨\u0006="}, m65681d2 = {"Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;", "", "", "headerImg", "title", "subtitle", "body", "", "Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;", "cycleData", "Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetCtaModel;", "cta", "closeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetCtaModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetCtaModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetCtaModel;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetCtaModel;Ljava/lang/String;)Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeaderImg", "getTitle", "getSubtitle", "getBody", "Ljava/util/List;", "getCycleData", "Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetCtaModel;", "getCta", "getCloseText", "Companion", "$serializer", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CycleDataDunningBottomSheetModel {
    private final String body;
    private final String closeText;
    private final CycleDataDunningBottomSheetCtaModel cta;
    private final List<MemberStatisticsModel> cycleData;
    private final String headerImg;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C39681c(11)), null, null};

    /* JADX INFO: renamed from: com.whoop.membership.dunning.domain.models.CycleDataDunningBottomSheetModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CycleDataDunningBottomSheetModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CycleDataDunningBottomSheetModel(int i13, String str, String str2, String str3, String str4, List list, CycleDataDunningBottomSheetCtaModel cycleDataDunningBottomSheetCtaModel, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, CycleDataDunningBottomSheetModel$$serializer.INSTANCE.getDescriptor());
        }
        this.headerImg = str;
        this.title = str2;
        this.subtitle = str3;
        this.body = str4;
        this.cycleData = list;
        this.cta = cycleDataDunningBottomSheetCtaModel;
        this.closeText = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(MemberStatisticsModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CycleDataDunningBottomSheetModel copy$default(CycleDataDunningBottomSheetModel cycleDataDunningBottomSheetModel, String str, String str2, String str3, String str4, List list, CycleDataDunningBottomSheetCtaModel cycleDataDunningBottomSheetCtaModel, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cycleDataDunningBottomSheetModel.headerImg;
        }
        if ((i13 & 2) != 0) {
            str2 = cycleDataDunningBottomSheetModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = cycleDataDunningBottomSheetModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = cycleDataDunningBottomSheetModel.body;
        }
        if ((i13 & 16) != 0) {
            list = cycleDataDunningBottomSheetModel.cycleData;
        }
        if ((i13 & 32) != 0) {
            cycleDataDunningBottomSheetCtaModel = cycleDataDunningBottomSheetModel.cta;
        }
        if ((i13 & 64) != 0) {
            str5 = cycleDataDunningBottomSheetModel.closeText;
        }
        CycleDataDunningBottomSheetCtaModel cycleDataDunningBottomSheetCtaModel2 = cycleDataDunningBottomSheetCtaModel;
        String str6 = str5;
        List list2 = list;
        String str7 = str3;
        return cycleDataDunningBottomSheetModel.copy(str, str2, str7, str4, list2, cycleDataDunningBottomSheetCtaModel2, str6);
    }

    public static final /* synthetic */ void write$Self$membership_release(CycleDataDunningBottomSheetModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.headerImg);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeStringElement(serialDesc, 3, self.body);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.cycleData);
        output.encodeSerializableElement(serialDesc, 5, CycleDataDunningBottomSheetCtaModel$$serializer.INSTANCE, self.cta);
        output.encodeStringElement(serialDesc, 6, self.closeText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeaderImg() {
        return this.headerImg;
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

    public final List<MemberStatisticsModel> component5() {
        return this.cycleData;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CycleDataDunningBottomSheetCtaModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCloseText() {
        return this.closeText;
    }

    public final CycleDataDunningBottomSheetModel copy(String headerImg, String title, String subtitle, String body, List<MemberStatisticsModel> cycleData, CycleDataDunningBottomSheetCtaModel cta, String closeText) {
        AbstractC22676k.m65750j(headerImg, "headerImg");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cycleData, "cycleData");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(closeText, "closeText");
        return new CycleDataDunningBottomSheetModel(headerImg, title, subtitle, body, cycleData, cta, closeText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CycleDataDunningBottomSheetModel)) {
            return false;
        }
        CycleDataDunningBottomSheetModel cycleDataDunningBottomSheetModel = (CycleDataDunningBottomSheetModel) other;
        return AbstractC22676k.m65745e(this.headerImg, cycleDataDunningBottomSheetModel.headerImg) && AbstractC22676k.m65745e(this.title, cycleDataDunningBottomSheetModel.title) && AbstractC22676k.m65745e(this.subtitle, cycleDataDunningBottomSheetModel.subtitle) && AbstractC22676k.m65745e(this.body, cycleDataDunningBottomSheetModel.body) && AbstractC22676k.m65745e(this.cycleData, cycleDataDunningBottomSheetModel.cycleData) && AbstractC22676k.m65745e(this.cta, cycleDataDunningBottomSheetModel.cta) && AbstractC22676k.m65745e(this.closeText, cycleDataDunningBottomSheetModel.closeText);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCloseText() {
        return this.closeText;
    }

    public final CycleDataDunningBottomSheetCtaModel getCta() {
        return this.cta;
    }

    public final List<MemberStatisticsModel> getCycleData() {
        return this.cycleData;
    }

    public final String getHeaderImg() {
        return this.headerImg;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.closeText.hashCode() + ((this.cta.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.headerImg.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.body), 31, this.cycleData)) * 31);
    }

    public String toString() {
        String str = this.headerImg;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.body;
        List<MemberStatisticsModel> list = this.cycleData;
        CycleDataDunningBottomSheetCtaModel cycleDataDunningBottomSheetCtaModel = this.cta;
        String str5 = this.closeText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CycleDataDunningBottomSheetModel(headerImg=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", body=", str4, ", cycleData=");
        sbM32001t.append(list);
        sbM32001t.append(", cta=");
        sbM32001t.append(cycleDataDunningBottomSheetCtaModel);
        sbM32001t.append(", closeText=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public CycleDataDunningBottomSheetModel(String headerImg, String title, String subtitle, String body, List<MemberStatisticsModel> cycleData, CycleDataDunningBottomSheetCtaModel cta, String closeText) {
        AbstractC22676k.m65750j(headerImg, "headerImg");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cycleData, "cycleData");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(closeText, "closeText");
        this.headerImg = headerImg;
        this.title = title;
        this.subtitle = subtitle;
        this.body = body;
        this.cycleData = cycleData;
        this.cta = cta;
        this.closeText = closeText;
    }
}
