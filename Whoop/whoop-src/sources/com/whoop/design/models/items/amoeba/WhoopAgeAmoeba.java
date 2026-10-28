package com.whoop.design.models.items.amoeba;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J~\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b;\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b<\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b=\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b>\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b@\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bA\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bB\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\b\u000f\u0010$¨\u0006F"}, m65681d2 = {"Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;", "styleValues", "", "ageValueDisplay", "ageTitleDisplay", "ageSubtitleDisplay", "ageSubtitleStyle", "yearsDifferenceValueDisplay", "yearsDifferenceValueStyle", "yearsDifferenceSubtitleDisplay", "paceOfAgingDisplay", "paceOfAgingSubtitleDisplay", "", "isCalibrating", "<init>", "(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Z", "copy", "(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;", "getStyleValues", "Ljava/lang/String;", "getAgeValueDisplay", "getAgeTitleDisplay", "getAgeSubtitleDisplay", "getAgeSubtitleStyle", "getYearsDifferenceValueDisplay", "getYearsDifferenceValueStyle", "getYearsDifferenceSubtitleDisplay", "getPaceOfAgingDisplay", "getPaceOfAgingSubtitleDisplay", "Z", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopAgeAmoeba implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String ageSubtitleDisplay;
    private final String ageSubtitleStyle;
    private final String ageTitleDisplay;
    private final String ageValueDisplay;
    private final boolean isCalibrating;
    private final String paceOfAgingDisplay;
    private final String paceOfAgingSubtitleDisplay;
    private final WhoopAgeAmoebaStyleValues styleValues;
    private final String yearsDifferenceSubtitleDisplay;
    private final String yearsDifferenceValueDisplay;
    private final String yearsDifferenceValueStyle;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhoopAgeAmoeba$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WhoopAgeAmoeba(int i13, WhoopAgeAmoebaStyleValues whoopAgeAmoebaStyleValues, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, WhoopAgeAmoeba$$serializer.INSTANCE.getDescriptor());
        }
        this.styleValues = whoopAgeAmoebaStyleValues;
        this.ageValueDisplay = str;
        this.ageTitleDisplay = str2;
        this.ageSubtitleDisplay = str3;
        this.ageSubtitleStyle = str4;
        this.yearsDifferenceValueDisplay = str5;
        this.yearsDifferenceValueStyle = str6;
        this.yearsDifferenceSubtitleDisplay = str7;
        this.paceOfAgingDisplay = str8;
        this.paceOfAgingSubtitleDisplay = str9;
        this.isCalibrating = z4;
    }

    public static /* synthetic */ WhoopAgeAmoeba copy$default(WhoopAgeAmoeba whoopAgeAmoeba, WhoopAgeAmoebaStyleValues whoopAgeAmoebaStyleValues, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            whoopAgeAmoebaStyleValues = whoopAgeAmoeba.styleValues;
        }
        if ((i13 & 2) != 0) {
            str = whoopAgeAmoeba.ageValueDisplay;
        }
        if ((i13 & 4) != 0) {
            str2 = whoopAgeAmoeba.ageTitleDisplay;
        }
        if ((i13 & 8) != 0) {
            str3 = whoopAgeAmoeba.ageSubtitleDisplay;
        }
        if ((i13 & 16) != 0) {
            str4 = whoopAgeAmoeba.ageSubtitleStyle;
        }
        if ((i13 & 32) != 0) {
            str5 = whoopAgeAmoeba.yearsDifferenceValueDisplay;
        }
        if ((i13 & 64) != 0) {
            str6 = whoopAgeAmoeba.yearsDifferenceValueStyle;
        }
        if ((i13 & 128) != 0) {
            str7 = whoopAgeAmoeba.yearsDifferenceSubtitleDisplay;
        }
        if ((i13 & 256) != 0) {
            str8 = whoopAgeAmoeba.paceOfAgingDisplay;
        }
        if ((i13 & 512) != 0) {
            str9 = whoopAgeAmoeba.paceOfAgingSubtitleDisplay;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z4 = whoopAgeAmoeba.isCalibrating;
        }
        String str10 = str9;
        boolean z13 = z4;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        String str15 = str4;
        String str16 = str2;
        return whoopAgeAmoeba.copy(whoopAgeAmoebaStyleValues, str, str16, str3, str15, str13, str14, str11, str12, str10, z13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(WhoopAgeAmoeba self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, WhoopAgeAmoebaStyleValues$$serializer.INSTANCE, self.styleValues);
        output.encodeStringElement(serialDesc, 1, self.ageValueDisplay);
        output.encodeStringElement(serialDesc, 2, self.ageTitleDisplay);
        output.encodeStringElement(serialDesc, 3, self.ageSubtitleDisplay);
        output.encodeStringElement(serialDesc, 4, self.ageSubtitleStyle);
        output.encodeStringElement(serialDesc, 5, self.yearsDifferenceValueDisplay);
        output.encodeStringElement(serialDesc, 6, self.yearsDifferenceValueStyle);
        output.encodeStringElement(serialDesc, 7, self.yearsDifferenceSubtitleDisplay);
        output.encodeStringElement(serialDesc, 8, self.paceOfAgingDisplay);
        output.encodeStringElement(serialDesc, 9, self.paceOfAgingSubtitleDisplay);
        output.encodeBooleanElement(serialDesc, 10, self.isCalibrating);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WhoopAgeAmoebaStyleValues getStyleValues() {
        return this.styleValues;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPaceOfAgingSubtitleDisplay() {
        return this.paceOfAgingSubtitleDisplay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsCalibrating() {
        return this.isCalibrating;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgeValueDisplay() {
        return this.ageValueDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAgeTitleDisplay() {
        return this.ageTitleDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgeSubtitleDisplay() {
        return this.ageSubtitleDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAgeSubtitleStyle() {
        return this.ageSubtitleStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getYearsDifferenceValueDisplay() {
        return this.yearsDifferenceValueDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getYearsDifferenceValueStyle() {
        return this.yearsDifferenceValueStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getYearsDifferenceSubtitleDisplay() {
        return this.yearsDifferenceSubtitleDisplay;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPaceOfAgingDisplay() {
        return this.paceOfAgingDisplay;
    }

    public final WhoopAgeAmoeba copy(WhoopAgeAmoebaStyleValues styleValues, String ageValueDisplay, String ageTitleDisplay, String ageSubtitleDisplay, String ageSubtitleStyle, String yearsDifferenceValueDisplay, String yearsDifferenceValueStyle, String yearsDifferenceSubtitleDisplay, String paceOfAgingDisplay, String paceOfAgingSubtitleDisplay, boolean isCalibrating) {
        AbstractC22676k.m65750j(styleValues, "styleValues");
        AbstractC22676k.m65750j(ageValueDisplay, "ageValueDisplay");
        AbstractC22676k.m65750j(ageTitleDisplay, "ageTitleDisplay");
        AbstractC22676k.m65750j(ageSubtitleDisplay, "ageSubtitleDisplay");
        AbstractC22676k.m65750j(ageSubtitleStyle, "ageSubtitleStyle");
        AbstractC22676k.m65750j(yearsDifferenceValueDisplay, "yearsDifferenceValueDisplay");
        AbstractC22676k.m65750j(yearsDifferenceValueStyle, "yearsDifferenceValueStyle");
        AbstractC22676k.m65750j(yearsDifferenceSubtitleDisplay, "yearsDifferenceSubtitleDisplay");
        AbstractC22676k.m65750j(paceOfAgingDisplay, "paceOfAgingDisplay");
        AbstractC22676k.m65750j(paceOfAgingSubtitleDisplay, "paceOfAgingSubtitleDisplay");
        return new WhoopAgeAmoeba(styleValues, ageValueDisplay, ageTitleDisplay, ageSubtitleDisplay, ageSubtitleStyle, yearsDifferenceValueDisplay, yearsDifferenceValueStyle, yearsDifferenceSubtitleDisplay, paceOfAgingDisplay, paceOfAgingSubtitleDisplay, isCalibrating);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopAgeAmoeba)) {
            return false;
        }
        WhoopAgeAmoeba whoopAgeAmoeba = (WhoopAgeAmoeba) other;
        return AbstractC22676k.m65745e(this.styleValues, whoopAgeAmoeba.styleValues) && AbstractC22676k.m65745e(this.ageValueDisplay, whoopAgeAmoeba.ageValueDisplay) && AbstractC22676k.m65745e(this.ageTitleDisplay, whoopAgeAmoeba.ageTitleDisplay) && AbstractC22676k.m65745e(this.ageSubtitleDisplay, whoopAgeAmoeba.ageSubtitleDisplay) && AbstractC22676k.m65745e(this.ageSubtitleStyle, whoopAgeAmoeba.ageSubtitleStyle) && AbstractC22676k.m65745e(this.yearsDifferenceValueDisplay, whoopAgeAmoeba.yearsDifferenceValueDisplay) && AbstractC22676k.m65745e(this.yearsDifferenceValueStyle, whoopAgeAmoeba.yearsDifferenceValueStyle) && AbstractC22676k.m65745e(this.yearsDifferenceSubtitleDisplay, whoopAgeAmoeba.yearsDifferenceSubtitleDisplay) && AbstractC22676k.m65745e(this.paceOfAgingDisplay, whoopAgeAmoeba.paceOfAgingDisplay) && AbstractC22676k.m65745e(this.paceOfAgingSubtitleDisplay, whoopAgeAmoeba.paceOfAgingSubtitleDisplay) && this.isCalibrating == whoopAgeAmoeba.isCalibrating;
    }

    public final String getAgeSubtitleDisplay() {
        return this.ageSubtitleDisplay;
    }

    public final String getAgeSubtitleStyle() {
        return this.ageSubtitleStyle;
    }

    public final String getAgeTitleDisplay() {
        return this.ageTitleDisplay;
    }

    public final String getAgeValueDisplay() {
        return this.ageValueDisplay;
    }

    public final String getPaceOfAgingDisplay() {
        return this.paceOfAgingDisplay;
    }

    public final String getPaceOfAgingSubtitleDisplay() {
        return this.paceOfAgingSubtitleDisplay;
    }

    public final WhoopAgeAmoebaStyleValues getStyleValues() {
        return this.styleValues;
    }

    public final String getYearsDifferenceSubtitleDisplay() {
        return this.yearsDifferenceSubtitleDisplay;
    }

    public final String getYearsDifferenceValueDisplay() {
        return this.yearsDifferenceValueDisplay;
    }

    public final String getYearsDifferenceValueStyle() {
        return this.yearsDifferenceValueStyle;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCalibrating) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.styleValues.hashCode() * 31, 31, this.ageValueDisplay), 31, this.ageTitleDisplay), 31, this.ageSubtitleDisplay), 31, this.ageSubtitleStyle), 31, this.yearsDifferenceValueDisplay), 31, this.yearsDifferenceValueStyle), 31, this.yearsDifferenceSubtitleDisplay), 31, this.paceOfAgingDisplay), 31, this.paceOfAgingSubtitleDisplay);
    }

    public final boolean isCalibrating() {
        return this.isCalibrating;
    }

    public String toString() {
        WhoopAgeAmoebaStyleValues whoopAgeAmoebaStyleValues = this.styleValues;
        String str = this.ageValueDisplay;
        String str2 = this.ageTitleDisplay;
        String str3 = this.ageSubtitleDisplay;
        String str4 = this.ageSubtitleStyle;
        String str5 = this.yearsDifferenceValueDisplay;
        String str6 = this.yearsDifferenceValueStyle;
        String str7 = this.yearsDifferenceSubtitleDisplay;
        String str8 = this.paceOfAgingDisplay;
        String str9 = this.paceOfAgingSubtitleDisplay;
        boolean z4 = this.isCalibrating;
        StringBuilder sb4 = new StringBuilder("WhoopAgeAmoeba(styleValues=");
        sb4.append(whoopAgeAmoebaStyleValues);
        sb4.append(", ageValueDisplay=");
        sb4.append(str);
        sb4.append(", ageTitleDisplay=");
        AbstractC11266d.m30444B(sb4, str2, ", ageSubtitleDisplay=", str3, ", ageSubtitleStyle=");
        AbstractC11266d.m30444B(sb4, str4, ", yearsDifferenceValueDisplay=", str5, ", yearsDifferenceValueStyle=");
        AbstractC11266d.m30444B(sb4, str6, ", yearsDifferenceSubtitleDisplay=", str7, ", paceOfAgingDisplay=");
        AbstractC11266d.m30444B(sb4, str8, ", paceOfAgingSubtitleDisplay=", str9, ", isCalibrating=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public WhoopAgeAmoeba(WhoopAgeAmoebaStyleValues styleValues, String ageValueDisplay, String ageTitleDisplay, String ageSubtitleDisplay, String ageSubtitleStyle, String yearsDifferenceValueDisplay, String yearsDifferenceValueStyle, String yearsDifferenceSubtitleDisplay, String paceOfAgingDisplay, String paceOfAgingSubtitleDisplay, boolean z4) {
        AbstractC22676k.m65750j(styleValues, "styleValues");
        AbstractC22676k.m65750j(ageValueDisplay, "ageValueDisplay");
        AbstractC22676k.m65750j(ageTitleDisplay, "ageTitleDisplay");
        AbstractC22676k.m65750j(ageSubtitleDisplay, "ageSubtitleDisplay");
        AbstractC22676k.m65750j(ageSubtitleStyle, "ageSubtitleStyle");
        AbstractC22676k.m65750j(yearsDifferenceValueDisplay, "yearsDifferenceValueDisplay");
        AbstractC22676k.m65750j(yearsDifferenceValueStyle, "yearsDifferenceValueStyle");
        AbstractC22676k.m65750j(yearsDifferenceSubtitleDisplay, "yearsDifferenceSubtitleDisplay");
        AbstractC22676k.m65750j(paceOfAgingDisplay, "paceOfAgingDisplay");
        AbstractC22676k.m65750j(paceOfAgingSubtitleDisplay, "paceOfAgingSubtitleDisplay");
        this.styleValues = styleValues;
        this.ageValueDisplay = ageValueDisplay;
        this.ageTitleDisplay = ageTitleDisplay;
        this.ageSubtitleDisplay = ageSubtitleDisplay;
        this.ageSubtitleStyle = ageSubtitleStyle;
        this.yearsDifferenceValueDisplay = yearsDifferenceValueDisplay;
        this.yearsDifferenceValueStyle = yearsDifferenceValueStyle;
        this.yearsDifferenceSubtitleDisplay = yearsDifferenceSubtitleDisplay;
        this.paceOfAgingDisplay = paceOfAgingDisplay;
        this.paceOfAgingSubtitleDisplay = paceOfAgingSubtitleDisplay;
        this.isCalibrating = z4;
    }
}
