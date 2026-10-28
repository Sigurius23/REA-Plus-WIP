package com.whoop.healthspan.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBk\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0095\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010!J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u008a\u0001\u0010'\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\n2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010\u001cJ\u0010\u0010*\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b=\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b>\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b?\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010!R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bB\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bC\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bD\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bE\u0010!R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\bF\u0010\u001a¨\u0006I"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;", "", "", "Lcom/whoop/healthspan/domain/models/ContributorRangeDivision;", "rangeDivisions", "", "rangeLeftLabelDisplay", "rangeLeftLabelStyle", "rangeRightLabelDisplay", "rangeRightLabelStyle", "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;", "topRangeValue", "impactValueDisplay", "impactValueLabelDisplay", "impactValueStyle", "expandedBottomRangeValue", "Lcom/whoop/design/models/DesignSystemModel;", "expandedItems", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/whoop/healthspan/domain/models/ContributorRangeValue;", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;)Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$healthspan_release", "(Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/util/List;", "getRangeDivisions", "Ljava/lang/String;", "getRangeLeftLabelDisplay", "getRangeLeftLabelStyle", "getRangeRightLabelDisplay", "getRangeRightLabelStyle", "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;", "getTopRangeValue", "getImpactValueDisplay", "getImpactValueLabelDisplay", "getImpactValueStyle", "getExpandedBottomRangeValue", "getExpandedItems", "Companion", "$serializer", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SingleContributorContainerContent {
    private static final InterfaceC23462h[] $childSerializers;
    private final ContributorRangeValue expandedBottomRangeValue;
    private final List<DesignSystemModel> expandedItems;
    private final String impactValueDisplay;
    private final String impactValueLabelDisplay;
    private final String impactValueStyle;
    private final List<ContributorRangeDivision> rangeDivisions;
    private final String rangeLeftLabelDisplay;
    private final String rangeLeftLabelStyle;
    private final String rangeRightLabelDisplay;
    private final String rangeRightLabelStyle;
    private final ContributorRangeValue topRangeValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;", "serializer", "()Lwc3/c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SingleContributorContainerContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C15620a(21)), null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C15620a(22))};
    }

    public /* synthetic */ SingleContributorContainerContent(int i13, List list, String str, String str2, String str3, String str4, ContributorRangeValue contributorRangeValue, String str5, String str6, String str7, ContributorRangeValue contributorRangeValue2, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, SingleContributorContainerContent$$serializer.INSTANCE.getDescriptor());
        }
        this.rangeDivisions = list;
        this.rangeLeftLabelDisplay = str;
        this.rangeLeftLabelStyle = str2;
        this.rangeRightLabelDisplay = str3;
        this.rangeRightLabelStyle = str4;
        this.topRangeValue = contributorRangeValue;
        this.impactValueDisplay = str5;
        this.impactValueLabelDisplay = str6;
        this.impactValueStyle = str7;
        this.expandedBottomRangeValue = contributorRangeValue2;
        this.expandedItems = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ContributorRangeDivision$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SingleContributorContainerContent copy$default(SingleContributorContainerContent singleContributorContainerContent, List list, String str, String str2, String str3, String str4, ContributorRangeValue contributorRangeValue, String str5, String str6, String str7, ContributorRangeValue contributorRangeValue2, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = singleContributorContainerContent.rangeDivisions;
        }
        if ((i13 & 2) != 0) {
            str = singleContributorContainerContent.rangeLeftLabelDisplay;
        }
        if ((i13 & 4) != 0) {
            str2 = singleContributorContainerContent.rangeLeftLabelStyle;
        }
        if ((i13 & 8) != 0) {
            str3 = singleContributorContainerContent.rangeRightLabelDisplay;
        }
        if ((i13 & 16) != 0) {
            str4 = singleContributorContainerContent.rangeRightLabelStyle;
        }
        if ((i13 & 32) != 0) {
            contributorRangeValue = singleContributorContainerContent.topRangeValue;
        }
        if ((i13 & 64) != 0) {
            str5 = singleContributorContainerContent.impactValueDisplay;
        }
        if ((i13 & 128) != 0) {
            str6 = singleContributorContainerContent.impactValueLabelDisplay;
        }
        if ((i13 & 256) != 0) {
            str7 = singleContributorContainerContent.impactValueStyle;
        }
        if ((i13 & 512) != 0) {
            contributorRangeValue2 = singleContributorContainerContent.expandedBottomRangeValue;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list2 = singleContributorContainerContent.expandedItems;
        }
        ContributorRangeValue contributorRangeValue3 = contributorRangeValue2;
        List list3 = list2;
        String str8 = str6;
        String str9 = str7;
        ContributorRangeValue contributorRangeValue4 = contributorRangeValue;
        String str10 = str5;
        String str11 = str4;
        String str12 = str2;
        return singleContributorContainerContent.copy(list, str, str12, str3, str11, contributorRangeValue4, str10, str8, str9, contributorRangeValue3, list3);
    }

    public static final /* synthetic */ void write$Self$healthspan_release(SingleContributorContainerContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.rangeDivisions);
        output.encodeStringElement(serialDesc, 1, self.rangeLeftLabelDisplay);
        output.encodeStringElement(serialDesc, 2, self.rangeLeftLabelStyle);
        output.encodeStringElement(serialDesc, 3, self.rangeRightLabelDisplay);
        output.encodeStringElement(serialDesc, 4, self.rangeRightLabelStyle);
        ContributorRangeValue$$serializer contributorRangeValue$$serializer = ContributorRangeValue$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 5, contributorRangeValue$$serializer, self.topRangeValue);
        output.encodeStringElement(serialDesc, 6, self.impactValueDisplay);
        output.encodeStringElement(serialDesc, 7, self.impactValueLabelDisplay);
        output.encodeStringElement(serialDesc, 8, self.impactValueStyle);
        output.encodeSerializableElement(serialDesc, 9, contributorRangeValue$$serializer, self.expandedBottomRangeValue);
        output.encodeSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.expandedItems);
    }

    public final List<ContributorRangeDivision> component1() {
        return this.rangeDivisions;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ContributorRangeValue getExpandedBottomRangeValue() {
        return this.expandedBottomRangeValue;
    }

    public final List<DesignSystemModel> component11() {
        return this.expandedItems;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRangeLeftLabelDisplay() {
        return this.rangeLeftLabelDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRangeLeftLabelStyle() {
        return this.rangeLeftLabelStyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRangeRightLabelDisplay() {
        return this.rangeRightLabelDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRangeRightLabelStyle() {
        return this.rangeRightLabelStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ContributorRangeValue getTopRangeValue() {
        return this.topRangeValue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImpactValueDisplay() {
        return this.impactValueDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getImpactValueLabelDisplay() {
        return this.impactValueLabelDisplay;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getImpactValueStyle() {
        return this.impactValueStyle;
    }

    public final SingleContributorContainerContent copy(List<ContributorRangeDivision> rangeDivisions, String rangeLeftLabelDisplay, String rangeLeftLabelStyle, String rangeRightLabelDisplay, String rangeRightLabelStyle, ContributorRangeValue topRangeValue, String impactValueDisplay, String impactValueLabelDisplay, String impactValueStyle, ContributorRangeValue expandedBottomRangeValue, List<? extends DesignSystemModel> expandedItems) {
        AbstractC22676k.m65750j(rangeDivisions, "rangeDivisions");
        AbstractC22676k.m65750j(rangeLeftLabelDisplay, "rangeLeftLabelDisplay");
        AbstractC22676k.m65750j(rangeLeftLabelStyle, "rangeLeftLabelStyle");
        AbstractC22676k.m65750j(rangeRightLabelDisplay, "rangeRightLabelDisplay");
        AbstractC22676k.m65750j(rangeRightLabelStyle, "rangeRightLabelStyle");
        AbstractC22676k.m65750j(topRangeValue, "topRangeValue");
        AbstractC22676k.m65750j(impactValueDisplay, "impactValueDisplay");
        AbstractC22676k.m65750j(impactValueLabelDisplay, "impactValueLabelDisplay");
        AbstractC22676k.m65750j(impactValueStyle, "impactValueStyle");
        AbstractC22676k.m65750j(expandedBottomRangeValue, "expandedBottomRangeValue");
        AbstractC22676k.m65750j(expandedItems, "expandedItems");
        return new SingleContributorContainerContent(rangeDivisions, rangeLeftLabelDisplay, rangeLeftLabelStyle, rangeRightLabelDisplay, rangeRightLabelStyle, topRangeValue, impactValueDisplay, impactValueLabelDisplay, impactValueStyle, expandedBottomRangeValue, expandedItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleContributorContainerContent)) {
            return false;
        }
        SingleContributorContainerContent singleContributorContainerContent = (SingleContributorContainerContent) other;
        return AbstractC22676k.m65745e(this.rangeDivisions, singleContributorContainerContent.rangeDivisions) && AbstractC22676k.m65745e(this.rangeLeftLabelDisplay, singleContributorContainerContent.rangeLeftLabelDisplay) && AbstractC22676k.m65745e(this.rangeLeftLabelStyle, singleContributorContainerContent.rangeLeftLabelStyle) && AbstractC22676k.m65745e(this.rangeRightLabelDisplay, singleContributorContainerContent.rangeRightLabelDisplay) && AbstractC22676k.m65745e(this.rangeRightLabelStyle, singleContributorContainerContent.rangeRightLabelStyle) && AbstractC22676k.m65745e(this.topRangeValue, singleContributorContainerContent.topRangeValue) && AbstractC22676k.m65745e(this.impactValueDisplay, singleContributorContainerContent.impactValueDisplay) && AbstractC22676k.m65745e(this.impactValueLabelDisplay, singleContributorContainerContent.impactValueLabelDisplay) && AbstractC22676k.m65745e(this.impactValueStyle, singleContributorContainerContent.impactValueStyle) && AbstractC22676k.m65745e(this.expandedBottomRangeValue, singleContributorContainerContent.expandedBottomRangeValue) && AbstractC22676k.m65745e(this.expandedItems, singleContributorContainerContent.expandedItems);
    }

    public final ContributorRangeValue getExpandedBottomRangeValue() {
        return this.expandedBottomRangeValue;
    }

    public final List<DesignSystemModel> getExpandedItems() {
        return this.expandedItems;
    }

    public final String getImpactValueDisplay() {
        return this.impactValueDisplay;
    }

    public final String getImpactValueLabelDisplay() {
        return this.impactValueLabelDisplay;
    }

    public final String getImpactValueStyle() {
        return this.impactValueStyle;
    }

    public final List<ContributorRangeDivision> getRangeDivisions() {
        return this.rangeDivisions;
    }

    public final String getRangeLeftLabelDisplay() {
        return this.rangeLeftLabelDisplay;
    }

    public final String getRangeLeftLabelStyle() {
        return this.rangeLeftLabelStyle;
    }

    public final String getRangeRightLabelDisplay() {
        return this.rangeRightLabelDisplay;
    }

    public final String getRangeRightLabelStyle() {
        return this.rangeRightLabelStyle;
    }

    public final ContributorRangeValue getTopRangeValue() {
        return this.topRangeValue;
    }

    public int hashCode() {
        return this.expandedItems.hashCode() + ((this.expandedBottomRangeValue.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.topRangeValue.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.rangeDivisions.hashCode() * 31, 31, this.rangeLeftLabelDisplay), 31, this.rangeLeftLabelStyle), 31, this.rangeRightLabelDisplay), 31, this.rangeRightLabelStyle)) * 31, 31, this.impactValueDisplay), 31, this.impactValueLabelDisplay), 31, this.impactValueStyle)) * 31);
    }

    public String toString() {
        List<ContributorRangeDivision> list = this.rangeDivisions;
        String str = this.rangeLeftLabelDisplay;
        String str2 = this.rangeLeftLabelStyle;
        String str3 = this.rangeRightLabelDisplay;
        String str4 = this.rangeRightLabelStyle;
        ContributorRangeValue contributorRangeValue = this.topRangeValue;
        String str5 = this.impactValueDisplay;
        String str6 = this.impactValueLabelDisplay;
        String str7 = this.impactValueStyle;
        ContributorRangeValue contributorRangeValue2 = this.expandedBottomRangeValue;
        List<DesignSystemModel> list2 = this.expandedItems;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("SingleContributorContainerContent(rangeDivisions=", ", rangeLeftLabelDisplay=", str, ", rangeLeftLabelStyle=", list);
        AbstractC11266d.m30444B(sbM79507k, str2, ", rangeRightLabelDisplay=", str3, ", rangeRightLabelStyle=");
        sbM79507k.append(str4);
        sbM79507k.append(", topRangeValue=");
        sbM79507k.append(contributorRangeValue);
        sbM79507k.append(", impactValueDisplay=");
        AbstractC11266d.m30444B(sbM79507k, str5, ", impactValueLabelDisplay=", str6, ", impactValueStyle=");
        sbM79507k.append(str7);
        sbM79507k.append(", expandedBottomRangeValue=");
        sbM79507k.append(contributorRangeValue2);
        sbM79507k.append(", expandedItems=");
        return AbstractC3855a.m11829m(sbM79507k, list2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleContributorContainerContent(List<ContributorRangeDivision> rangeDivisions, String rangeLeftLabelDisplay, String rangeLeftLabelStyle, String rangeRightLabelDisplay, String rangeRightLabelStyle, ContributorRangeValue topRangeValue, String impactValueDisplay, String impactValueLabelDisplay, String impactValueStyle, ContributorRangeValue expandedBottomRangeValue, List<? extends DesignSystemModel> expandedItems) {
        AbstractC22676k.m65750j(rangeDivisions, "rangeDivisions");
        AbstractC22676k.m65750j(rangeLeftLabelDisplay, "rangeLeftLabelDisplay");
        AbstractC22676k.m65750j(rangeLeftLabelStyle, "rangeLeftLabelStyle");
        AbstractC22676k.m65750j(rangeRightLabelDisplay, "rangeRightLabelDisplay");
        AbstractC22676k.m65750j(rangeRightLabelStyle, "rangeRightLabelStyle");
        AbstractC22676k.m65750j(topRangeValue, "topRangeValue");
        AbstractC22676k.m65750j(impactValueDisplay, "impactValueDisplay");
        AbstractC22676k.m65750j(impactValueLabelDisplay, "impactValueLabelDisplay");
        AbstractC22676k.m65750j(impactValueStyle, "impactValueStyle");
        AbstractC22676k.m65750j(expandedBottomRangeValue, "expandedBottomRangeValue");
        AbstractC22676k.m65750j(expandedItems, "expandedItems");
        this.rangeDivisions = rangeDivisions;
        this.rangeLeftLabelDisplay = rangeLeftLabelDisplay;
        this.rangeLeftLabelStyle = rangeLeftLabelStyle;
        this.rangeRightLabelDisplay = rangeRightLabelDisplay;
        this.rangeRightLabelStyle = rangeRightLabelStyle;
        this.topRangeValue = topRangeValue;
        this.impactValueDisplay = impactValueDisplay;
        this.impactValueLabelDisplay = impactValueLabelDisplay;
        this.impactValueStyle = impactValueStyle;
        this.expandedBottomRangeValue = expandedBottomRangeValue;
        this.expandedItems = expandedItems;
    }
}
