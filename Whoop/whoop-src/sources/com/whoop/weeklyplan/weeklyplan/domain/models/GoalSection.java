package com.whoop.weeklyplan.weeklyplan.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import hy0.EnumC17740f;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ur0.C35180a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002VUB\u008b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B£\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b.\u0010/J®\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b2\u0010 J\u0010\u00103\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bF\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bG\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bH\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bI\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bK\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010(R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u0010*R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bP\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bQ\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bR\u0010 R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bT\u0010/¨\u0006W"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;", "", "Lcom/whoop/navigation/e;", "action", "", "titleDisplay", "titleImage", "subtitleDisplay", "actionDisplay", "icon", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;", "style", "Lhy0/f;", "titleStyle", "", "Lcom/whoop/design/models/DesignSystemModel;", "goalCards", "calloutDisplay", "calloutCtaDisplay", "id", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "secondaryButton", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/navigation/e;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;", "component8", "()Lhy0/f;", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "component13", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "copy", "(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;Lhy0/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/navigation/e;", "getAction", "Ljava/lang/String;", "getTitleDisplay", "getTitleImage", "getSubtitleDisplay", "getActionDisplay", "getIcon", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSectionStyle;", "getStyle", "Lhy0/f;", "getTitleStyle", "Ljava/util/List;", "getGoalCards", "getCalloutDisplay", "getCalloutCtaDisplay", "getId", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getSecondaryButton", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GoalSection {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e action;
    private final String actionDisplay;
    private final String calloutCtaDisplay;
    private final String calloutDisplay;
    private final List<DesignSystemModel> goalCards;
    private final String icon;
    private final String id;
    private final SecondaryButtonModel secondaryButton;
    private final GoalSectionStyle style;
    private final String subtitleDisplay;
    private final String titleDisplay;
    private final String titleImage;
    private final EnumC17740f titleStyle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GoalSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C35180a(21)), null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35180a(22)), AbstractC30060g.m92087G(enumC23463i, new C35180a(23)), AbstractC30060g.m92087G(enumC23463i, new C35180a(24)), null, null, null, null};
    }

    public /* synthetic */ GoalSection(int i13, C9598e c9598e, String str, String str2, String str3, String str4, String str5, GoalSectionStyle goalSectionStyle, EnumC17740f enumC17740f, List list, String str6, String str7, String str8, SecondaryButtonModel secondaryButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i13 & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 8191, GoalSection$$serializer.INSTANCE.getDescriptor());
        }
        this.action = c9598e;
        this.titleDisplay = str;
        this.titleImage = str2;
        this.subtitleDisplay = str3;
        this.actionDisplay = str4;
        this.icon = str5;
        this.style = goalSectionStyle;
        this.titleStyle = enumC17740f;
        this.goalCards = list;
        this.calloutDisplay = str6;
        this.calloutCtaDisplay = str7;
        this.id = str8;
        this.secondaryButton = secondaryButtonModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return GoalSectionStyle.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.DividerTextPosition", EnumC17740f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoalSection copy$default(GoalSection goalSection, C9598e c9598e, String str, String str2, String str3, String str4, String str5, GoalSectionStyle goalSectionStyle, EnumC17740f enumC17740f, List list, String str6, String str7, String str8, SecondaryButtonModel secondaryButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c9598e = goalSection.action;
        }
        return goalSection.copy(c9598e, (i13 & 2) != 0 ? goalSection.titleDisplay : str, (i13 & 4) != 0 ? goalSection.titleImage : str2, (i13 & 8) != 0 ? goalSection.subtitleDisplay : str3, (i13 & 16) != 0 ? goalSection.actionDisplay : str4, (i13 & 32) != 0 ? goalSection.icon : str5, (i13 & 64) != 0 ? goalSection.style : goalSectionStyle, (i13 & 128) != 0 ? goalSection.titleStyle : enumC17740f, (i13 & 256) != 0 ? goalSection.goalCards : list, (i13 & 512) != 0 ? goalSection.calloutDisplay : str6, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? goalSection.calloutCtaDisplay : str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? goalSection.id : str8, (i13 & 4096) != 0 ? goalSection.secondaryButton : secondaryButtonModel);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(GoalSection self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.action);
        output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.titleImage);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.subtitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.actionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.style);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.titleStyle);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.goalCards);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.calloutDisplay);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.calloutCtaDisplay);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.id);
        output.encodeNullableSerializableElement(serialDesc, 12, SecondaryButtonModel$$serializer.INSTANCE, self.secondaryButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C9598e getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCalloutDisplay() {
        return this.calloutDisplay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCalloutCtaDisplay() {
        return this.calloutCtaDisplay;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final SecondaryButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleImage() {
        return this.titleImage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getActionDisplay() {
        return this.actionDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GoalSectionStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final EnumC17740f getTitleStyle() {
        return this.titleStyle;
    }

    public final List<DesignSystemModel> component9() {
        return this.goalCards;
    }

    public final GoalSection copy(C9598e action, String titleDisplay, String titleImage, String subtitleDisplay, String actionDisplay, String icon, GoalSectionStyle style, EnumC17740f titleStyle, List<? extends DesignSystemModel> goalCards, String calloutDisplay, String calloutCtaDisplay, String id4, SecondaryButtonModel secondaryButton) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(goalCards, "goalCards");
        return new GoalSection(action, titleDisplay, titleImage, subtitleDisplay, actionDisplay, icon, style, titleStyle, goalCards, calloutDisplay, calloutCtaDisplay, id4, secondaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoalSection)) {
            return false;
        }
        GoalSection goalSection = (GoalSection) other;
        return AbstractC22676k.m65745e(this.action, goalSection.action) && AbstractC22676k.m65745e(this.titleDisplay, goalSection.titleDisplay) && AbstractC22676k.m65745e(this.titleImage, goalSection.titleImage) && AbstractC22676k.m65745e(this.subtitleDisplay, goalSection.subtitleDisplay) && AbstractC22676k.m65745e(this.actionDisplay, goalSection.actionDisplay) && AbstractC22676k.m65745e(this.icon, goalSection.icon) && this.style == goalSection.style && this.titleStyle == goalSection.titleStyle && AbstractC22676k.m65745e(this.goalCards, goalSection.goalCards) && AbstractC22676k.m65745e(this.calloutDisplay, goalSection.calloutDisplay) && AbstractC22676k.m65745e(this.calloutCtaDisplay, goalSection.calloutCtaDisplay) && AbstractC22676k.m65745e(this.id, goalSection.id) && AbstractC22676k.m65745e(this.secondaryButton, goalSection.secondaryButton);
    }

    public final C9598e getAction() {
        return this.action;
    }

    public final String getActionDisplay() {
        return this.actionDisplay;
    }

    public final String getCalloutCtaDisplay() {
        return this.calloutCtaDisplay;
    }

    public final String getCalloutDisplay() {
        return this.calloutDisplay;
    }

    public final List<DesignSystemModel> getGoalCards() {
        return this.goalCards;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final SecondaryButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final GoalSectionStyle getStyle() {
        return this.style;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final String getTitleImage() {
        return this.titleImage;
    }

    public final EnumC17740f getTitleStyle() {
        return this.titleStyle;
    }

    public int hashCode() {
        C9598e c9598e = this.action;
        int iM30450d = AbstractC11266d.m30450d((c9598e == null ? 0 : c9598e.hashCode()) * 31, 31, this.titleDisplay);
        String str = this.titleImage;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitleDisplay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionDisplay;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        GoalSectionStyle goalSectionStyle = this.style;
        int iHashCode5 = (iHashCode4 + (goalSectionStyle == null ? 0 : goalSectionStyle.hashCode())) * 31;
        EnumC17740f enumC17740f = this.titleStyle;
        int iM31983b = AbstractC11895b.m31983b((iHashCode5 + (enumC17740f == null ? 0 : enumC17740f.hashCode())) * 31, 31, this.goalCards);
        String str5 = this.calloutDisplay;
        int iHashCode6 = (iM31983b + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.calloutCtaDisplay;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.id;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        SecondaryButtonModel secondaryButtonModel = this.secondaryButton;
        return iHashCode8 + (secondaryButtonModel != null ? secondaryButtonModel.hashCode() : 0);
    }

    public String toString() {
        C9598e c9598e = this.action;
        String str = this.titleDisplay;
        String str2 = this.titleImage;
        String str3 = this.subtitleDisplay;
        String str4 = this.actionDisplay;
        String str5 = this.icon;
        GoalSectionStyle goalSectionStyle = this.style;
        EnumC17740f enumC17740f = this.titleStyle;
        List<DesignSystemModel> list = this.goalCards;
        String str6 = this.calloutDisplay;
        String str7 = this.calloutCtaDisplay;
        String str8 = this.id;
        SecondaryButtonModel secondaryButtonModel = this.secondaryButton;
        StringBuilder sb4 = new StringBuilder("GoalSection(action=");
        sb4.append(c9598e);
        sb4.append(", titleDisplay=");
        sb4.append(str);
        sb4.append(", titleImage=");
        AbstractC11266d.m30444B(sb4, str2, ", subtitleDisplay=", str3, ", actionDisplay=");
        AbstractC11266d.m30444B(sb4, str4, ", icon=", str5, ", style=");
        sb4.append(goalSectionStyle);
        sb4.append(", titleStyle=");
        sb4.append(enumC17740f);
        sb4.append(", goalCards=");
        AbstractC17176i.m48511m(", calloutDisplay=", str6, ", calloutCtaDisplay=", sb4, list);
        AbstractC11266d.m30444B(sb4, str7, ", id=", str8, ", secondaryButton=");
        sb4.append(secondaryButtonModel);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoalSection(C9598e c9598e, String titleDisplay, String str, String str2, String str3, String str4, GoalSectionStyle goalSectionStyle, EnumC17740f enumC17740f, List<? extends DesignSystemModel> goalCards, String str5, String str6, String str7, SecondaryButtonModel secondaryButtonModel) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(goalCards, "goalCards");
        this.action = c9598e;
        this.titleDisplay = titleDisplay;
        this.titleImage = str;
        this.subtitleDisplay = str2;
        this.actionDisplay = str3;
        this.icon = str4;
        this.style = goalSectionStyle;
        this.titleStyle = enumC17740f;
        this.goalCards = goalCards;
        this.calloutDisplay = str5;
        this.calloutCtaDisplay = str6;
        this.id = str7;
        this.secondaryButton = secondaryButtonModel;
    }
}
