package com.whoop.advancedlabs.feature.hormonalcontext.domain.models;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hb1.C17089l;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001bJ\u009a\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010-\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b?\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b@\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\bE\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\bF\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bG\u0010\u001bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bJ\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\bK\u0010\u001bR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\bL\u0010\u001b¨\u0006O"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenContent;", "", "title", "subtitle", "imageUrl", "Lcom/whoop/design/models/InfoCalloutTileModel;", "infoCallout", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;", "bottomSheet", "footerText", "optionsHeader", "optionsHeaderIcon", "", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;", "options", "selectedOptionId", "nextButtonTitle", "saveButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component5", "()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getSubtitle", "getImageUrl", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getInfoCallout", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;", "getBottomSheet", "getFooterText", "getOptionsHeader", "getOptionsHeaderIcon", "Ljava/util/List;", "getOptions", "getSelectedOptionId", "getNextButtonTitle", "getSaveButtonTitle", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SingleSelectScreenContent implements HormonalContextScreenContent {
    private final HormonalContextBottomSheet bottomSheet;
    private final String footerText;
    private final String imageUrl;
    private final InfoCalloutTileModel infoCallout;
    private final String nextButtonTitle;
    private final List<HormonalContextMultipleChoiceOption> options;
    private final String optionsHeader;
    private final String optionsHeaderIcon;
    private final String saveButtonTitle;
    private final String selectedOptionId;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C17089l(3)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SingleSelectScreenContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SingleSelectScreenContent(int i13, String str, String str2, String str3, InfoCalloutTileModel infoCalloutTileModel, HormonalContextBottomSheet hormonalContextBottomSheet, String str4, String str5, String str6, List list, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, SingleSelectScreenContent$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.imageUrl = str3;
        this.infoCallout = infoCalloutTileModel;
        this.bottomSheet = hormonalContextBottomSheet;
        this.footerText = str4;
        this.optionsHeader = str5;
        this.optionsHeaderIcon = str6;
        this.options = list;
        this.selectedOptionId = str7;
        this.nextButtonTitle = str8;
        this.saveButtonTitle = str9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HormonalContextMultipleChoiceOption$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SingleSelectScreenContent copy$default(SingleSelectScreenContent singleSelectScreenContent, String str, String str2, String str3, InfoCalloutTileModel infoCalloutTileModel, HormonalContextBottomSheet hormonalContextBottomSheet, String str4, String str5, String str6, List list, String str7, String str8, String str9, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = singleSelectScreenContent.title;
        }
        if ((i13 & 2) != 0) {
            str2 = singleSelectScreenContent.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = singleSelectScreenContent.imageUrl;
        }
        if ((i13 & 8) != 0) {
            infoCalloutTileModel = singleSelectScreenContent.infoCallout;
        }
        if ((i13 & 16) != 0) {
            hormonalContextBottomSheet = singleSelectScreenContent.bottomSheet;
        }
        if ((i13 & 32) != 0) {
            str4 = singleSelectScreenContent.footerText;
        }
        if ((i13 & 64) != 0) {
            str5 = singleSelectScreenContent.optionsHeader;
        }
        if ((i13 & 128) != 0) {
            str6 = singleSelectScreenContent.optionsHeaderIcon;
        }
        if ((i13 & 256) != 0) {
            list = singleSelectScreenContent.options;
        }
        if ((i13 & 512) != 0) {
            str7 = singleSelectScreenContent.selectedOptionId;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str8 = singleSelectScreenContent.nextButtonTitle;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str9 = singleSelectScreenContent.saveButtonTitle;
        }
        String str10 = str8;
        String str11 = str9;
        List list2 = list;
        String str12 = str7;
        String str13 = str5;
        String str14 = str6;
        HormonalContextBottomSheet hormonalContextBottomSheet2 = hormonalContextBottomSheet;
        String str15 = str4;
        return singleSelectScreenContent.copy(str, str2, str3, infoCalloutTileModel, hormonalContextBottomSheet2, str15, str13, str14, list2, str12, str10, str11);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(SingleSelectScreenContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 3, InfoCalloutTileModel$$serializer.INSTANCE, self.infoCallout);
        output.encodeNullableSerializableElement(serialDesc, 4, HormonalContextBottomSheet$$serializer.INSTANCE, self.bottomSheet);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.footerText);
        output.encodeStringElement(serialDesc, 6, self.optionsHeader);
        output.encodeStringElement(serialDesc, 7, self.optionsHeaderIcon);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.options);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.selectedOptionId);
        output.encodeStringElement(serialDesc, 10, self.nextButtonTitle);
        output.encodeStringElement(serialDesc, 11, self.saveButtonTitle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSelectedOptionId() {
        return this.selectedOptionId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNextButtonTitle() {
        return this.nextButtonTitle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSaveButtonTitle() {
        return this.saveButtonTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InfoCalloutTileModel getInfoCallout() {
        return this.infoCallout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HormonalContextBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOptionsHeader() {
        return this.optionsHeader;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOptionsHeaderIcon() {
        return this.optionsHeaderIcon;
    }

    public final List<HormonalContextMultipleChoiceOption> component9() {
        return this.options;
    }

    public final SingleSelectScreenContent copy(String title, String subtitle, String imageUrl, InfoCalloutTileModel infoCallout, HormonalContextBottomSheet bottomSheet, String footerText, String optionsHeader, String optionsHeaderIcon, List<HormonalContextMultipleChoiceOption> options, String selectedOptionId, String nextButtonTitle, String saveButtonTitle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(optionsHeader, "optionsHeader");
        AbstractC22676k.m65750j(optionsHeaderIcon, "optionsHeaderIcon");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(nextButtonTitle, "nextButtonTitle");
        AbstractC22676k.m65750j(saveButtonTitle, "saveButtonTitle");
        return new SingleSelectScreenContent(title, subtitle, imageUrl, infoCallout, bottomSheet, footerText, optionsHeader, optionsHeaderIcon, options, selectedOptionId, nextButtonTitle, saveButtonTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleSelectScreenContent)) {
            return false;
        }
        SingleSelectScreenContent singleSelectScreenContent = (SingleSelectScreenContent) other;
        return AbstractC22676k.m65745e(this.title, singleSelectScreenContent.title) && AbstractC22676k.m65745e(this.subtitle, singleSelectScreenContent.subtitle) && AbstractC22676k.m65745e(this.imageUrl, singleSelectScreenContent.imageUrl) && AbstractC22676k.m65745e(this.infoCallout, singleSelectScreenContent.infoCallout) && AbstractC22676k.m65745e(this.bottomSheet, singleSelectScreenContent.bottomSheet) && AbstractC22676k.m65745e(this.footerText, singleSelectScreenContent.footerText) && AbstractC22676k.m65745e(this.optionsHeader, singleSelectScreenContent.optionsHeader) && AbstractC22676k.m65745e(this.optionsHeaderIcon, singleSelectScreenContent.optionsHeaderIcon) && AbstractC22676k.m65745e(this.options, singleSelectScreenContent.options) && AbstractC22676k.m65745e(this.selectedOptionId, singleSelectScreenContent.selectedOptionId) && AbstractC22676k.m65745e(this.nextButtonTitle, singleSelectScreenContent.nextButtonTitle) && AbstractC22676k.m65745e(this.saveButtonTitle, singleSelectScreenContent.saveButtonTitle);
    }

    public final HormonalContextBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final InfoCalloutTileModel getInfoCallout() {
        return this.infoCallout;
    }

    public final String getNextButtonTitle() {
        return this.nextButtonTitle;
    }

    public final List<HormonalContextMultipleChoiceOption> getOptions() {
        return this.options;
    }

    public final String getOptionsHeader() {
        return this.optionsHeader;
    }

    public final String getOptionsHeaderIcon() {
        return this.optionsHeaderIcon;
    }

    public final String getSaveButtonTitle() {
        return this.saveButtonTitle;
    }

    public final String getSelectedOptionId() {
        return this.selectedOptionId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.infoCallout;
        int iHashCode4 = (iHashCode3 + (infoCalloutTileModel == null ? 0 : infoCalloutTileModel.hashCode())) * 31;
        HormonalContextBottomSheet hormonalContextBottomSheet = this.bottomSheet;
        int iHashCode5 = (iHashCode4 + (hormonalContextBottomSheet == null ? 0 : hormonalContextBottomSheet.hashCode())) * 31;
        String str3 = this.footerText;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.optionsHeader), 31, this.optionsHeaderIcon), 31, this.options);
        String str4 = this.selectedOptionId;
        return this.saveButtonTitle.hashCode() + AbstractC11266d.m30450d((iM31983b + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.nextButtonTitle);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.imageUrl;
        InfoCalloutTileModel infoCalloutTileModel = this.infoCallout;
        HormonalContextBottomSheet hormonalContextBottomSheet = this.bottomSheet;
        String str4 = this.footerText;
        String str5 = this.optionsHeader;
        String str6 = this.optionsHeaderIcon;
        List<HormonalContextMultipleChoiceOption> list = this.options;
        String str7 = this.selectedOptionId;
        String str8 = this.nextButtonTitle;
        String str9 = this.saveButtonTitle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SingleSelectScreenContent(title=", str, ", subtitle=", str2, ", imageUrl=");
        sbM32001t.append(str3);
        sbM32001t.append(", infoCallout=");
        sbM32001t.append(infoCalloutTileModel);
        sbM32001t.append(", bottomSheet=");
        sbM32001t.append(hormonalContextBottomSheet);
        sbM32001t.append(", footerText=");
        sbM32001t.append(str4);
        sbM32001t.append(", optionsHeader=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", optionsHeaderIcon=", str6, ", options=");
        AbstractC17176i.m48511m(", selectedOptionId=", str7, ", nextButtonTitle=", sbM32001t, list);
        return AbstractC11266d.m30464r(sbM32001t, str8, ", saveButtonTitle=", str9, ")");
    }

    public SingleSelectScreenContent(String title, String str, String str2, InfoCalloutTileModel infoCalloutTileModel, HormonalContextBottomSheet hormonalContextBottomSheet, String str3, String optionsHeader, String optionsHeaderIcon, List<HormonalContextMultipleChoiceOption> options, String str4, String nextButtonTitle, String saveButtonTitle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(optionsHeader, "optionsHeader");
        AbstractC22676k.m65750j(optionsHeaderIcon, "optionsHeaderIcon");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(nextButtonTitle, "nextButtonTitle");
        AbstractC22676k.m65750j(saveButtonTitle, "saveButtonTitle");
        this.title = title;
        this.subtitle = str;
        this.imageUrl = str2;
        this.infoCallout = infoCalloutTileModel;
        this.bottomSheet = hormonalContextBottomSheet;
        this.footerText = str3;
        this.optionsHeader = optionsHeader;
        this.optionsHeaderIcon = optionsHeaderIcon;
        this.options = options;
        this.selectedOptionId = str4;
        this.nextButtonTitle = nextButtonTitle;
        this.saveButtonTitle = saveButtonTitle;
    }
}
