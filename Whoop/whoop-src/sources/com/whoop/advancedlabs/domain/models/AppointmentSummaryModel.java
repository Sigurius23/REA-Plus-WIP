package com.whoop.advancedlabs.domain.models;

import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t91.C33662a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0002SRB\u0083\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B§\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J¦\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010\u001eJ\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bD\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bE\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bF\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bG\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bH\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bI\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bJ\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bK\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bL\u0010\u001eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bO\u0010)R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\bQ\u0010,¨\u0006T"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;", "header", "", "dateLabel", "dateValue", "timeLabel", "timeValue", "locationLabel", "locationValue", "confirmationLabel", "confirmationValue", "referenceIdLabel", "referenceIdValue", "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "referenceNumberBottomSheet", "confirmationNumberBottomSheet", "Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;", "referenceIdStyle", "<init>", "(Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "component13", "component14", "()Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;", "copy", "(Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;", "getHeader", "Ljava/lang/String;", "getDateLabel", "getDateValue", "getTimeLabel", "getTimeValue", "getLocationLabel", "getLocationValue", "getConfirmationLabel", "getConfirmationValue", "getReferenceIdLabel", "getReferenceIdValue", "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "getReferenceNumberBottomSheet", "getConfirmationNumberBottomSheet", "Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;", "getReferenceIdStyle", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AppointmentSummaryModel implements DesignSystemModel {
    public static final int $stable = 0;
    private final String confirmationLabel;
    private final AppointmentSummaryBottomSheet confirmationNumberBottomSheet;
    private final String confirmationValue;
    private final String dateLabel;
    private final String dateValue;
    private final TestHeaderModel header;
    private final String locationLabel;
    private final String locationValue;
    private final String referenceIdLabel;
    private final ReferenceIdStyle referenceIdStyle;
    private final String referenceIdValue;
    private final AppointmentSummaryBottomSheet referenceNumberBottomSheet;
    private final String timeLabel;
    private final String timeValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33662a(16))};

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AppointmentSummaryModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppointmentSummaryModel(int i13, TestHeaderModel testHeaderModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet2, ReferenceIdStyle referenceIdStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i13 & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 8191, AppointmentSummaryModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = testHeaderModel;
        this.dateLabel = str;
        this.dateValue = str2;
        this.timeLabel = str3;
        this.timeValue = str4;
        this.locationLabel = str5;
        this.locationValue = str6;
        this.confirmationLabel = str7;
        this.confirmationValue = str8;
        this.referenceIdLabel = str9;
        this.referenceIdValue = str10;
        this.referenceNumberBottomSheet = appointmentSummaryBottomSheet;
        this.confirmationNumberBottomSheet = appointmentSummaryBottomSheet2;
        this.referenceIdStyle = (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? ReferenceIdStyle.NONE : referenceIdStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.advancedlabs.domain.models.ReferenceIdStyle", ReferenceIdStyle.values());
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(AppointmentSummaryModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, TestHeaderModel$$serializer.INSTANCE, self.header);
        output.encodeStringElement(serialDesc, 1, self.dateLabel);
        output.encodeStringElement(serialDesc, 2, self.dateValue);
        output.encodeStringElement(serialDesc, 3, self.timeLabel);
        output.encodeStringElement(serialDesc, 4, self.timeValue);
        output.encodeStringElement(serialDesc, 5, self.locationLabel);
        output.encodeStringElement(serialDesc, 6, self.locationValue);
        output.encodeStringElement(serialDesc, 7, self.confirmationLabel);
        output.encodeStringElement(serialDesc, 8, self.confirmationValue);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.referenceIdLabel);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.referenceIdValue);
        AppointmentSummaryBottomSheet$$serializer appointmentSummaryBottomSheet$$serializer = AppointmentSummaryBottomSheet$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 11, appointmentSummaryBottomSheet$$serializer, self.referenceNumberBottomSheet);
        output.encodeNullableSerializableElement(serialDesc, 12, appointmentSummaryBottomSheet$$serializer, self.confirmationNumberBottomSheet);
        if (!output.shouldEncodeElementDefault(serialDesc, 13) && self.referenceIdStyle == ReferenceIdStyle.NONE) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.referenceIdStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TestHeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReferenceIdLabel() {
        return this.referenceIdLabel;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getReferenceIdValue() {
        return this.referenceIdValue;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final AppointmentSummaryBottomSheet getReferenceNumberBottomSheet() {
        return this.referenceNumberBottomSheet;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final AppointmentSummaryBottomSheet getConfirmationNumberBottomSheet() {
        return this.confirmationNumberBottomSheet;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ReferenceIdStyle getReferenceIdStyle() {
        return this.referenceIdStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDateLabel() {
        return this.dateLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDateValue() {
        return this.dateValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimeLabel() {
        return this.timeLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeValue() {
        return this.timeValue;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLocationLabel() {
        return this.locationLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLocationValue() {
        return this.locationValue;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getConfirmationLabel() {
        return this.confirmationLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getConfirmationValue() {
        return this.confirmationValue;
    }

    public final AppointmentSummaryModel copy(TestHeaderModel header, String dateLabel, String dateValue, String timeLabel, String timeValue, String locationLabel, String locationValue, String confirmationLabel, String confirmationValue, String referenceIdLabel, String referenceIdValue, AppointmentSummaryBottomSheet referenceNumberBottomSheet, AppointmentSummaryBottomSheet confirmationNumberBottomSheet, ReferenceIdStyle referenceIdStyle) {
        AbstractC22676k.m65750j(dateLabel, "dateLabel");
        AbstractC22676k.m65750j(dateValue, "dateValue");
        AbstractC22676k.m65750j(timeLabel, "timeLabel");
        AbstractC22676k.m65750j(timeValue, "timeValue");
        AbstractC22676k.m65750j(locationLabel, "locationLabel");
        AbstractC22676k.m65750j(locationValue, "locationValue");
        AbstractC22676k.m65750j(confirmationLabel, "confirmationLabel");
        AbstractC22676k.m65750j(confirmationValue, "confirmationValue");
        AbstractC22676k.m65750j(referenceIdStyle, "referenceIdStyle");
        return new AppointmentSummaryModel(header, dateLabel, dateValue, timeLabel, timeValue, locationLabel, locationValue, confirmationLabel, confirmationValue, referenceIdLabel, referenceIdValue, referenceNumberBottomSheet, confirmationNumberBottomSheet, referenceIdStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentSummaryModel)) {
            return false;
        }
        AppointmentSummaryModel appointmentSummaryModel = (AppointmentSummaryModel) other;
        return AbstractC22676k.m65745e(this.header, appointmentSummaryModel.header) && AbstractC22676k.m65745e(this.dateLabel, appointmentSummaryModel.dateLabel) && AbstractC22676k.m65745e(this.dateValue, appointmentSummaryModel.dateValue) && AbstractC22676k.m65745e(this.timeLabel, appointmentSummaryModel.timeLabel) && AbstractC22676k.m65745e(this.timeValue, appointmentSummaryModel.timeValue) && AbstractC22676k.m65745e(this.locationLabel, appointmentSummaryModel.locationLabel) && AbstractC22676k.m65745e(this.locationValue, appointmentSummaryModel.locationValue) && AbstractC22676k.m65745e(this.confirmationLabel, appointmentSummaryModel.confirmationLabel) && AbstractC22676k.m65745e(this.confirmationValue, appointmentSummaryModel.confirmationValue) && AbstractC22676k.m65745e(this.referenceIdLabel, appointmentSummaryModel.referenceIdLabel) && AbstractC22676k.m65745e(this.referenceIdValue, appointmentSummaryModel.referenceIdValue) && AbstractC22676k.m65745e(this.referenceNumberBottomSheet, appointmentSummaryModel.referenceNumberBottomSheet) && AbstractC22676k.m65745e(this.confirmationNumberBottomSheet, appointmentSummaryModel.confirmationNumberBottomSheet) && this.referenceIdStyle == appointmentSummaryModel.referenceIdStyle;
    }

    public final String getConfirmationLabel() {
        return this.confirmationLabel;
    }

    public final AppointmentSummaryBottomSheet getConfirmationNumberBottomSheet() {
        return this.confirmationNumberBottomSheet;
    }

    public final String getConfirmationValue() {
        return this.confirmationValue;
    }

    public final String getDateLabel() {
        return this.dateLabel;
    }

    public final String getDateValue() {
        return this.dateValue;
    }

    public final TestHeaderModel getHeader() {
        return this.header;
    }

    public final String getLocationLabel() {
        return this.locationLabel;
    }

    public final String getLocationValue() {
        return this.locationValue;
    }

    public final String getReferenceIdLabel() {
        return this.referenceIdLabel;
    }

    public final ReferenceIdStyle getReferenceIdStyle() {
        return this.referenceIdStyle;
    }

    public final String getReferenceIdValue() {
        return this.referenceIdValue;
    }

    public final AppointmentSummaryBottomSheet getReferenceNumberBottomSheet() {
        return this.referenceNumberBottomSheet;
    }

    public final String getTimeLabel() {
        return this.timeLabel;
    }

    public final String getTimeValue() {
        return this.timeValue;
    }

    public int hashCode() {
        TestHeaderModel testHeaderModel = this.header;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((testHeaderModel == null ? 0 : testHeaderModel.hashCode()) * 31, 31, this.dateLabel), 31, this.dateValue), 31, this.timeLabel), 31, this.timeValue), 31, this.locationLabel), 31, this.locationValue), 31, this.confirmationLabel), 31, this.confirmationValue);
        String str = this.referenceIdLabel;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.referenceIdValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet = this.referenceNumberBottomSheet;
        int iHashCode3 = (iHashCode2 + (appointmentSummaryBottomSheet == null ? 0 : appointmentSummaryBottomSheet.hashCode())) * 31;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet2 = this.confirmationNumberBottomSheet;
        return this.referenceIdStyle.hashCode() + ((iHashCode3 + (appointmentSummaryBottomSheet2 != null ? appointmentSummaryBottomSheet2.hashCode() : 0)) * 31);
    }

    public String toString() {
        TestHeaderModel testHeaderModel = this.header;
        String str = this.dateLabel;
        String str2 = this.dateValue;
        String str3 = this.timeLabel;
        String str4 = this.timeValue;
        String str5 = this.locationLabel;
        String str6 = this.locationValue;
        String str7 = this.confirmationLabel;
        String str8 = this.confirmationValue;
        String str9 = this.referenceIdLabel;
        String str10 = this.referenceIdValue;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet = this.referenceNumberBottomSheet;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet2 = this.confirmationNumberBottomSheet;
        ReferenceIdStyle referenceIdStyle = this.referenceIdStyle;
        StringBuilder sb4 = new StringBuilder("AppointmentSummaryModel(header=");
        sb4.append(testHeaderModel);
        sb4.append(", dateLabel=");
        sb4.append(str);
        sb4.append(", dateValue=");
        AbstractC11266d.m30444B(sb4, str2, ", timeLabel=", str3, ", timeValue=");
        AbstractC11266d.m30444B(sb4, str4, ", locationLabel=", str5, ", locationValue=");
        AbstractC11266d.m30444B(sb4, str6, ", confirmationLabel=", str7, ", confirmationValue=");
        AbstractC11266d.m30444B(sb4, str8, ", referenceIdLabel=", str9, ", referenceIdValue=");
        sb4.append(str10);
        sb4.append(", referenceNumberBottomSheet=");
        sb4.append(appointmentSummaryBottomSheet);
        sb4.append(", confirmationNumberBottomSheet=");
        sb4.append(appointmentSummaryBottomSheet2);
        sb4.append(", referenceIdStyle=");
        sb4.append(referenceIdStyle);
        sb4.append(")");
        return sb4.toString();
    }

    public AppointmentSummaryModel(TestHeaderModel testHeaderModel, String dateLabel, String dateValue, String timeLabel, String timeValue, String locationLabel, String locationValue, String confirmationLabel, String confirmationValue, String str, String str2, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet2, ReferenceIdStyle referenceIdStyle) {
        AbstractC22676k.m65750j(dateLabel, "dateLabel");
        AbstractC22676k.m65750j(dateValue, "dateValue");
        AbstractC22676k.m65750j(timeLabel, "timeLabel");
        AbstractC22676k.m65750j(timeValue, "timeValue");
        AbstractC22676k.m65750j(locationLabel, "locationLabel");
        AbstractC22676k.m65750j(locationValue, "locationValue");
        AbstractC22676k.m65750j(confirmationLabel, "confirmationLabel");
        AbstractC22676k.m65750j(confirmationValue, "confirmationValue");
        AbstractC22676k.m65750j(referenceIdStyle, "referenceIdStyle");
        this.header = testHeaderModel;
        this.dateLabel = dateLabel;
        this.dateValue = dateValue;
        this.timeLabel = timeLabel;
        this.timeValue = timeValue;
        this.locationLabel = locationLabel;
        this.locationValue = locationValue;
        this.confirmationLabel = confirmationLabel;
        this.confirmationValue = confirmationValue;
        this.referenceIdLabel = str;
        this.referenceIdValue = str2;
        this.referenceNumberBottomSheet = appointmentSummaryBottomSheet;
        this.confirmationNumberBottomSheet = appointmentSummaryBottomSheet2;
        this.referenceIdStyle = referenceIdStyle;
    }

    public /* synthetic */ AppointmentSummaryModel(TestHeaderModel testHeaderModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet2, ReferenceIdStyle referenceIdStyle, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(testHeaderModel, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, appointmentSummaryBottomSheet, appointmentSummaryBottomSheet2, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? ReferenceIdStyle.NONE : referenceIdStyle);
    }
}
