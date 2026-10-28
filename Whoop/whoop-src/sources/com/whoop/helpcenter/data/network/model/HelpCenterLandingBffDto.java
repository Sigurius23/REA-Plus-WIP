package com.whoop.helpcenter.data.network.model;

import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import u91.C34656a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bu\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&Jn\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00109\u0012\u0004\b>\u0010<\u001a\u0004\b=\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b?\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b@\u0010\u0019R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010A\u0012\u0004\bC\u0010<\u001a\u0004\bB\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010 R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010&¨\u0006N"}, m65681d2 = {"Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;", "", "", "leftNavBarIcon", "rightNavBarIcon", "header", "pageTitle", "Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;", "commonQuestionsSection", "Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;", "browseAllSection", "Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;", "needMoreHelpSection", "Lcom/whoop/design/models/DesignSystemModel;", "callTile", "Lcom/whoop/helpcenter/data/network/model/CallSectionDto;", "callSection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/helpcenter/data/network/model/CallSectionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/helpcenter/data/network/model/CallSectionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;", "component6", "()Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;", "component7", "()Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;", "component8", "()Lcom/whoop/design/models/DesignSystemModel;", "component9", "()Lcom/whoop/helpcenter/data/network/model/CallSectionDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/helpcenter/data/network/model/CallSectionDto;)Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$help_center_release", "(Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getLeftNavBarIcon", "getLeftNavBarIcon$annotations", "()V", "getRightNavBarIcon", "getRightNavBarIcon$annotations", "getHeader", "getPageTitle", "Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;", "getCommonQuestionsSection", "getCommonQuestionsSection$annotations", "Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;", "getBrowseAllSection", "Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;", "getNeedMoreHelpSection", "Lcom/whoop/design/models/DesignSystemModel;", "getCallTile", "Lcom/whoop/helpcenter/data/network/model/CallSectionDto;", "getCallSection", "Companion", "$serializer", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HelpCenterLandingBffDto {

    @SerializedName("browse_all_section")
    private final BrowseAllSection browseAllSection;
    private final CallSectionDto callSection;
    private final DesignSystemModel callTile;

    @SerializedName("common_questions")
    private final CommonQuestionsSection commonQuestionsSection;

    @SerializedName("header")
    private final String header;

    @SerializedName("left_navbar_icon")
    private final String leftNavBarIcon;

    @SerializedName("need_more_help_section")
    private final NeedMoreHelpSection needMoreHelpSection;

    @SerializedName("page_title")
    private final String pageTitle;

    @SerializedName("right_navbar_icon")
    private final String rightNavBarIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34656a(27)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;", "serializer", "()Lwc3/c;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HelpCenterLandingBffDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HelpCenterLandingBffDto(int i13, String str, String str2, String str3, String str4, CommonQuestionsSection commonQuestionsSection, BrowseAllSection browseAllSection, NeedMoreHelpSection needMoreHelpSection, DesignSystemModel designSystemModel, CallSectionDto callSectionDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, HelpCenterLandingBffDto$$serializer.INSTANCE.getDescriptor());
        }
        this.leftNavBarIcon = str;
        this.rightNavBarIcon = str2;
        this.header = str3;
        this.pageTitle = str4;
        this.commonQuestionsSection = commonQuestionsSection;
        this.browseAllSection = browseAllSection;
        this.needMoreHelpSection = needMoreHelpSection;
        this.callTile = designSystemModel;
        this.callSection = callSectionDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ HelpCenterLandingBffDto copy$default(HelpCenterLandingBffDto helpCenterLandingBffDto, String str, String str2, String str3, String str4, CommonQuestionsSection commonQuestionsSection, BrowseAllSection browseAllSection, NeedMoreHelpSection needMoreHelpSection, DesignSystemModel designSystemModel, CallSectionDto callSectionDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = helpCenterLandingBffDto.leftNavBarIcon;
        }
        if ((i13 & 2) != 0) {
            str2 = helpCenterLandingBffDto.rightNavBarIcon;
        }
        if ((i13 & 4) != 0) {
            str3 = helpCenterLandingBffDto.header;
        }
        if ((i13 & 8) != 0) {
            str4 = helpCenterLandingBffDto.pageTitle;
        }
        if ((i13 & 16) != 0) {
            commonQuestionsSection = helpCenterLandingBffDto.commonQuestionsSection;
        }
        if ((i13 & 32) != 0) {
            browseAllSection = helpCenterLandingBffDto.browseAllSection;
        }
        if ((i13 & 64) != 0) {
            needMoreHelpSection = helpCenterLandingBffDto.needMoreHelpSection;
        }
        if ((i13 & 128) != 0) {
            designSystemModel = helpCenterLandingBffDto.callTile;
        }
        if ((i13 & 256) != 0) {
            callSectionDto = helpCenterLandingBffDto.callSection;
        }
        DesignSystemModel designSystemModel2 = designSystemModel;
        CallSectionDto callSectionDto2 = callSectionDto;
        BrowseAllSection browseAllSection2 = browseAllSection;
        NeedMoreHelpSection needMoreHelpSection2 = needMoreHelpSection;
        CommonQuestionsSection commonQuestionsSection2 = commonQuestionsSection;
        String str5 = str3;
        return helpCenterLandingBffDto.copy(str, str2, str5, str4, commonQuestionsSection2, browseAllSection2, needMoreHelpSection2, designSystemModel2, callSectionDto2);
    }

    @InterfaceC37143h("common_questions")
    public static /* synthetic */ void getCommonQuestionsSection$annotations() {
    }

    @InterfaceC37143h("left_navbar_icon")
    public static /* synthetic */ void getLeftNavBarIcon$annotations() {
    }

    @InterfaceC37143h("right_navbar_icon")
    public static /* synthetic */ void getRightNavBarIcon$annotations() {
    }

    public static final /* synthetic */ void write$Self$help_center_release(HelpCenterLandingBffDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.leftNavBarIcon);
        output.encodeStringElement(serialDesc, 1, self.rightNavBarIcon);
        output.encodeStringElement(serialDesc, 2, self.header);
        output.encodeStringElement(serialDesc, 3, self.pageTitle);
        output.encodeSerializableElement(serialDesc, 4, CommonQuestionsSection$$serializer.INSTANCE, self.commonQuestionsSection);
        output.encodeSerializableElement(serialDesc, 5, BrowseAllSection$$serializer.INSTANCE, self.browseAllSection);
        output.encodeSerializableElement(serialDesc, 6, NeedMoreHelpSection$$serializer.INSTANCE, self.needMoreHelpSection);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.callTile);
        output.encodeNullableSerializableElement(serialDesc, 8, CallSectionDto$$serializer.INSTANCE, self.callSection);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeftNavBarIcon() {
        return this.leftNavBarIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRightNavBarIcon() {
        return this.rightNavBarIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CommonQuestionsSection getCommonQuestionsSection() {
        return this.commonQuestionsSection;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BrowseAllSection getBrowseAllSection() {
        return this.browseAllSection;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final NeedMoreHelpSection getNeedMoreHelpSection() {
        return this.needMoreHelpSection;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DesignSystemModel getCallTile() {
        return this.callTile;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final CallSectionDto getCallSection() {
        return this.callSection;
    }

    public final HelpCenterLandingBffDto copy(String leftNavBarIcon, String rightNavBarIcon, String header, String pageTitle, CommonQuestionsSection commonQuestionsSection, BrowseAllSection browseAllSection, NeedMoreHelpSection needMoreHelpSection, DesignSystemModel callTile, CallSectionDto callSection) {
        AbstractC22676k.m65750j(leftNavBarIcon, "leftNavBarIcon");
        AbstractC22676k.m65750j(rightNavBarIcon, "rightNavBarIcon");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(commonQuestionsSection, "commonQuestionsSection");
        AbstractC22676k.m65750j(browseAllSection, "browseAllSection");
        AbstractC22676k.m65750j(needMoreHelpSection, "needMoreHelpSection");
        return new HelpCenterLandingBffDto(leftNavBarIcon, rightNavBarIcon, header, pageTitle, commonQuestionsSection, browseAllSection, needMoreHelpSection, callTile, callSection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpCenterLandingBffDto)) {
            return false;
        }
        HelpCenterLandingBffDto helpCenterLandingBffDto = (HelpCenterLandingBffDto) other;
        return AbstractC22676k.m65745e(this.leftNavBarIcon, helpCenterLandingBffDto.leftNavBarIcon) && AbstractC22676k.m65745e(this.rightNavBarIcon, helpCenterLandingBffDto.rightNavBarIcon) && AbstractC22676k.m65745e(this.header, helpCenterLandingBffDto.header) && AbstractC22676k.m65745e(this.pageTitle, helpCenterLandingBffDto.pageTitle) && AbstractC22676k.m65745e(this.commonQuestionsSection, helpCenterLandingBffDto.commonQuestionsSection) && AbstractC22676k.m65745e(this.browseAllSection, helpCenterLandingBffDto.browseAllSection) && AbstractC22676k.m65745e(this.needMoreHelpSection, helpCenterLandingBffDto.needMoreHelpSection) && AbstractC22676k.m65745e(this.callTile, helpCenterLandingBffDto.callTile) && AbstractC22676k.m65745e(this.callSection, helpCenterLandingBffDto.callSection);
    }

    public final BrowseAllSection getBrowseAllSection() {
        return this.browseAllSection;
    }

    public final CallSectionDto getCallSection() {
        return this.callSection;
    }

    public final DesignSystemModel getCallTile() {
        return this.callTile;
    }

    public final CommonQuestionsSection getCommonQuestionsSection() {
        return this.commonQuestionsSection;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getLeftNavBarIcon() {
        return this.leftNavBarIcon;
    }

    public final NeedMoreHelpSection getNeedMoreHelpSection() {
        return this.needMoreHelpSection;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final String getRightNavBarIcon() {
        return this.rightNavBarIcon;
    }

    public int hashCode() {
        int iHashCode = (this.needMoreHelpSection.hashCode() + ((this.browseAllSection.hashCode() + ((this.commonQuestionsSection.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.leftNavBarIcon.hashCode() * 31, 31, this.rightNavBarIcon), 31, this.header), 31, this.pageTitle)) * 31)) * 31)) * 31;
        DesignSystemModel designSystemModel = this.callTile;
        int iHashCode2 = (iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        CallSectionDto callSectionDto = this.callSection;
        return iHashCode2 + (callSectionDto != null ? callSectionDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.leftNavBarIcon;
        String str2 = this.rightNavBarIcon;
        String str3 = this.header;
        String str4 = this.pageTitle;
        CommonQuestionsSection commonQuestionsSection = this.commonQuestionsSection;
        BrowseAllSection browseAllSection = this.browseAllSection;
        NeedMoreHelpSection needMoreHelpSection = this.needMoreHelpSection;
        DesignSystemModel designSystemModel = this.callTile;
        CallSectionDto callSectionDto = this.callSection;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HelpCenterLandingBffDto(leftNavBarIcon=", str, ", rightNavBarIcon=", str2, ", header=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", pageTitle=", str4, ", commonQuestionsSection=");
        sbM32001t.append(commonQuestionsSection);
        sbM32001t.append(", browseAllSection=");
        sbM32001t.append(browseAllSection);
        sbM32001t.append(", needMoreHelpSection=");
        sbM32001t.append(needMoreHelpSection);
        sbM32001t.append(", callTile=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", callSection=");
        sbM32001t.append(callSectionDto);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HelpCenterLandingBffDto(String leftNavBarIcon, String rightNavBarIcon, String header, String pageTitle, CommonQuestionsSection commonQuestionsSection, BrowseAllSection browseAllSection, NeedMoreHelpSection needMoreHelpSection, DesignSystemModel designSystemModel, CallSectionDto callSectionDto) {
        AbstractC22676k.m65750j(leftNavBarIcon, "leftNavBarIcon");
        AbstractC22676k.m65750j(rightNavBarIcon, "rightNavBarIcon");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(commonQuestionsSection, "commonQuestionsSection");
        AbstractC22676k.m65750j(browseAllSection, "browseAllSection");
        AbstractC22676k.m65750j(needMoreHelpSection, "needMoreHelpSection");
        this.leftNavBarIcon = leftNavBarIcon;
        this.rightNavBarIcon = rightNavBarIcon;
        this.header = header;
        this.pageTitle = pageTitle;
        this.commonQuestionsSection = commonQuestionsSection;
        this.browseAllSection = browseAllSection;
        this.needMoreHelpSection = needMoreHelpSection;
        this.callTile = designSystemModel;
        this.callSection = callSectionDto;
    }
}
