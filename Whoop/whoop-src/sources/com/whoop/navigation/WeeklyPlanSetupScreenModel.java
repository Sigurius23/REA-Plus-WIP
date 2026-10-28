package com.whoop.navigation;

import com.mapbox.common.HttpHeaders;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UVB»\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016B·\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001dJÈ\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00102\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bE\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bF\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bI\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bJ\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bK\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bL\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bM\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bN\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bO\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bP\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bQ\u0010\u001dR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bR\u0010\u001dR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bS\u0010\u001d¨\u0006W"}, m65681d2 = {"Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "planName", "", "locked", "noPlanShowMetricSelection", "analyticsSource", "Lcom/whoop/navigation/InitialSelectionModel;", "initialSelection", HttpHeaders.DATE, "source", "presetPlanCategory", "planTitle", "description", "explanationTitle", "explanation", "templateId", "category", "carouselPlacement", "dismissalType", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "()Lcom/whoop/navigation/InitialSelectionModel;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getPlanName", "Z", "getLocked", "getNoPlanShowMetricSelection", "getAnalyticsSource", "Lcom/whoop/navigation/InitialSelectionModel;", "getInitialSelection", "getDate", "getSource", "getPresetPlanCategory", "getPlanTitle", "getDescription", "getExplanationTitle", "getExplanation", "getTemplateId", "getCategory", "getCarouselPlacement", "getDismissalType", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeeklyPlanSetupScreenModel implements CommonNavigationScreenModel {
    private final String analyticsSource;
    private final String carouselPlacement;
    private final String category;
    private final String date;
    private final String description;
    private final String dismissalType;
    private final String explanation;
    private final String explanationTitle;
    private final InitialSelectionModel initialSelection;
    private final boolean locked;
    private final boolean noPlanShowMetricSelection;
    private final String planName;
    private final String planTitle;
    private final String presetPlanCategory;
    private final String source;
    private final String templateId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.WeeklyPlanSetupScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/WeeklyPlanSetupScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeeklyPlanSetupScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WeeklyPlanSetupScreenModel(int i13, String str, boolean z4, boolean z13, String str2, InitialSelectionModel initialSelectionModel, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i13 & 9)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 9, WeeklyPlanSetupScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.planName = str;
        if ((i13 & 2) == 0) {
            this.locked = false;
        } else {
            this.locked = z4;
        }
        if ((i13 & 4) == 0) {
            this.noPlanShowMetricSelection = false;
        } else {
            this.noPlanShowMetricSelection = z13;
        }
        this.analyticsSource = str2;
        if ((i13 & 16) == 0) {
            this.initialSelection = null;
        } else {
            this.initialSelection = initialSelectionModel;
        }
        if ((i13 & 32) == 0) {
            this.date = null;
        } else {
            this.date = str3;
        }
        if ((i13 & 64) == 0) {
            this.source = null;
        } else {
            this.source = str4;
        }
        if ((i13 & 128) == 0) {
            this.presetPlanCategory = null;
        } else {
            this.presetPlanCategory = str5;
        }
        if ((i13 & 256) == 0) {
            this.planTitle = null;
        } else {
            this.planTitle = str6;
        }
        if ((i13 & 512) == 0) {
            this.description = null;
        } else {
            this.description = str7;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.explanationTitle = null;
        } else {
            this.explanationTitle = str8;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.explanation = null;
        } else {
            this.explanation = str9;
        }
        if ((i13 & 4096) == 0) {
            this.templateId = null;
        } else {
            this.templateId = str10;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.category = null;
        } else {
            this.category = str11;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.carouselPlacement = null;
        } else {
            this.carouselPlacement = str12;
        }
        if ((i13 & 32768) == 0) {
            this.dismissalType = null;
        } else {
            this.dismissalType = str13;
        }
    }

    public static final /* synthetic */ void write$Self$navigation_release(WeeklyPlanSetupScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.planName);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.locked) {
            output.encodeBooleanElement(serialDesc, 1, self.locked);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.noPlanShowMetricSelection) {
            output.encodeBooleanElement(serialDesc, 2, self.noPlanShowMetricSelection);
        }
        output.encodeStringElement(serialDesc, 3, self.analyticsSource);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.initialSelection != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, InitialSelectionModel$$serializer.INSTANCE, self.initialSelection);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.date != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.date);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.source != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.source);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.presetPlanCategory != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.presetPlanCategory);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.planTitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.planTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.description != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.explanationTitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.explanationTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.explanation != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.explanation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.templateId != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.templateId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.category != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.category);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.carouselPlacement != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.carouselPlacement);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 15) && self.dismissalType == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.dismissalType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlanName() {
        return this.planName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getExplanationTitle() {
        return this.explanationTitle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getExplanation() {
        return this.explanation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCarouselPlacement() {
        return this.carouselPlacement;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDismissalType() {
        return this.dismissalType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getLocked() {
        return this.locked;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getNoPlanShowMetricSelection() {
        return this.noPlanShowMetricSelection;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAnalyticsSource() {
        return this.analyticsSource;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InitialSelectionModel getInitialSelection() {
        return this.initialSelection;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPresetPlanCategory() {
        return this.presetPlanCategory;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPlanTitle() {
        return this.planTitle;
    }

    public final WeeklyPlanSetupScreenModel copy(String planName, boolean locked, boolean noPlanShowMetricSelection, String analyticsSource, InitialSelectionModel initialSelection, String date, String source, String presetPlanCategory, String planTitle, String description, String explanationTitle, String explanation, String templateId, String category, String carouselPlacement, String dismissalType) {
        AbstractC22676k.m65750j(planName, "planName");
        AbstractC22676k.m65750j(analyticsSource, "analyticsSource");
        return new WeeklyPlanSetupScreenModel(planName, locked, noPlanShowMetricSelection, analyticsSource, initialSelection, date, source, presetPlanCategory, planTitle, description, explanationTitle, explanation, templateId, category, carouselPlacement, dismissalType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyPlanSetupScreenModel)) {
            return false;
        }
        WeeklyPlanSetupScreenModel weeklyPlanSetupScreenModel = (WeeklyPlanSetupScreenModel) other;
        return AbstractC22676k.m65745e(this.planName, weeklyPlanSetupScreenModel.planName) && this.locked == weeklyPlanSetupScreenModel.locked && this.noPlanShowMetricSelection == weeklyPlanSetupScreenModel.noPlanShowMetricSelection && AbstractC22676k.m65745e(this.analyticsSource, weeklyPlanSetupScreenModel.analyticsSource) && AbstractC22676k.m65745e(this.initialSelection, weeklyPlanSetupScreenModel.initialSelection) && AbstractC22676k.m65745e(this.date, weeklyPlanSetupScreenModel.date) && AbstractC22676k.m65745e(this.source, weeklyPlanSetupScreenModel.source) && AbstractC22676k.m65745e(this.presetPlanCategory, weeklyPlanSetupScreenModel.presetPlanCategory) && AbstractC22676k.m65745e(this.planTitle, weeklyPlanSetupScreenModel.planTitle) && AbstractC22676k.m65745e(this.description, weeklyPlanSetupScreenModel.description) && AbstractC22676k.m65745e(this.explanationTitle, weeklyPlanSetupScreenModel.explanationTitle) && AbstractC22676k.m65745e(this.explanation, weeklyPlanSetupScreenModel.explanation) && AbstractC22676k.m65745e(this.templateId, weeklyPlanSetupScreenModel.templateId) && AbstractC22676k.m65745e(this.category, weeklyPlanSetupScreenModel.category) && AbstractC22676k.m65745e(this.carouselPlacement, weeklyPlanSetupScreenModel.carouselPlacement) && AbstractC22676k.m65745e(this.dismissalType, weeklyPlanSetupScreenModel.dismissalType);
    }

    public final String getAnalyticsSource() {
        return this.analyticsSource;
    }

    public final String getCarouselPlacement() {
        return this.carouselPlacement;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDismissalType() {
        return this.dismissalType;
    }

    public final String getExplanation() {
        return this.explanation;
    }

    public final String getExplanationTitle() {
        return this.explanationTitle;
    }

    public final InitialSelectionModel getInitialSelection() {
        return this.initialSelection;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final boolean getNoPlanShowMetricSelection() {
        return this.noPlanShowMetricSelection;
    }

    public final String getPlanName() {
        return this.planName;
    }

    public final String getPlanTitle() {
        return this.planTitle;
    }

    public final String getPresetPlanCategory() {
        return this.presetPlanCategory;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.planName.hashCode() * 31, 31, this.locked), 31, this.noPlanShowMetricSelection), 31, this.analyticsSource);
        InitialSelectionModel initialSelectionModel = this.initialSelection;
        int iHashCode = (iM30450d + (initialSelectionModel == null ? 0 : initialSelectionModel.hashCode())) * 31;
        String str = this.date;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.presetPlanCategory;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.planTitle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.explanationTitle;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.explanation;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.templateId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.category;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.carouselPlacement;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.dismissalType;
        return iHashCode11 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        String str = this.planName;
        boolean z4 = this.locked;
        boolean z13 = this.noPlanShowMetricSelection;
        String str2 = this.analyticsSource;
        InitialSelectionModel initialSelectionModel = this.initialSelection;
        String str3 = this.date;
        String str4 = this.source;
        String str5 = this.presetPlanCategory;
        String str6 = this.planTitle;
        String str7 = this.description;
        String str8 = this.explanationTitle;
        String str9 = this.explanation;
        String str10 = this.templateId;
        String str11 = this.category;
        String str12 = this.carouselPlacement;
        String str13 = this.dismissalType;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("WeeklyPlanSetupScreenModel(planName=", str, ", locked=", ", noPlanShowMetricSelection=", z4);
        AbstractC38963t7.m124391u(sbM73379l, z13, ", analyticsSource=", str2, ", initialSelection=");
        sbM73379l.append(initialSelectionModel);
        sbM73379l.append(", date=");
        sbM73379l.append(str3);
        sbM73379l.append(", source=");
        AbstractC11266d.m30444B(sbM73379l, str4, ", presetPlanCategory=", str5, ", planTitle=");
        AbstractC11266d.m30444B(sbM73379l, str6, ", description=", str7, ", explanationTitle=");
        AbstractC11266d.m30444B(sbM73379l, str8, ", explanation=", str9, ", templateId=");
        AbstractC11266d.m30444B(sbM73379l, str10, ", category=", str11, ", carouselPlacement=");
        return AbstractC11266d.m30464r(sbM73379l, str12, ", dismissalType=", str13, ")");
    }

    public WeeklyPlanSetupScreenModel(String planName, boolean z4, boolean z13, String analyticsSource, InitialSelectionModel initialSelectionModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        AbstractC22676k.m65750j(planName, "planName");
        AbstractC22676k.m65750j(analyticsSource, "analyticsSource");
        this.planName = planName;
        this.locked = z4;
        this.noPlanShowMetricSelection = z13;
        this.analyticsSource = analyticsSource;
        this.initialSelection = initialSelectionModel;
        this.date = str;
        this.source = str2;
        this.presetPlanCategory = str3;
        this.planTitle = str4;
        this.description = str5;
        this.explanationTitle = str6;
        this.explanation = str7;
        this.templateId = str8;
        this.category = str9;
        this.carouselPlacement = str10;
        this.dismissalType = str11;
    }

    public /* synthetic */ WeeklyPlanSetupScreenModel(String str, boolean z4, boolean z13, String str2, InitialSelectionModel initialSelectionModel, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13, str2, (i13 & 16) != 0 ? null : initialSelectionModel, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? null : str5, (i13 & 256) != 0 ? null : str6, (i13 & 512) != 0 ? null : str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str9, (i13 & 4096) != 0 ? null : str10, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str11, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str12, (i13 & 32768) != 0 ? null : str13);
    }
}
