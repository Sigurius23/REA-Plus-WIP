package com.whoop.advancedlabs.domain.models;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import tb0.C33690a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 e2\u00020\u0001:\u0002feB¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cBÛ\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010#J\u0010\u0010+\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010#J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010#J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010#J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010#J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010#J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b7\u0010&J\u0012\u00108\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b:\u0010&Jì\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010#J\u0010\u0010>\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bA\u0010BJ'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001¢\u0006\u0004\bI\u0010JR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010L\u001a\u0004\bN\u0010#R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010O\u001a\u0004\bP\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bR\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bS\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bT\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\bV\u0010,R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010W\u001a\u0004\bX\u0010.R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010W\u001a\u0004\bY\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\b[\u00101R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\b\\\u0010#R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\b]\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\b^\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\b_\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\b`\u0010#R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\ba\u0010&R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010b\u001a\u0004\bc\u00109R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010O\u001a\u0004\bd\u0010&¨\u0006g"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;", "", "", "biomarkerName", "biomarkerId", "", "calculatedFromBiomarkers", "", "value", "valueText", "unit", "", "included", "minValue", "maxValue", "Lcom/whoop/design/models/InfoCalloutTileModel;", "infoCallout", "valueLabel", "unitLabel", "subtitle", "warning", "rightIcon", "dependentOnBiomarkers", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;", "dependentOnBiomarkersWarning", "Lcom/whoop/advancedlabs/domain/models/CategoricalMapping;", "categoricalOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "()Z", "component8", "()D", "component9", "component10", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getBiomarkerName", "getBiomarkerId", "Ljava/util/List;", "getCalculatedFromBiomarkers", "Ljava/lang/Double;", "getValue", "getValueText", "getUnit", "Z", "getIncluded", "D", "getMinValue", "getMaxValue", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getInfoCallout", "getValueLabel", "getUnitLabel", "getSubtitle", "getWarning", "getRightIcon", "getDependentOnBiomarkers", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;", "getDependentOnBiomarkersWarning", "getCategoricalOptions", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EditBiomarkerItem {
    private static final InterfaceC23462h[] $childSerializers;
    private final String biomarkerId;
    private final String biomarkerName;
    private final List<String> calculatedFromBiomarkers;
    private final List<CategoricalMapping> categoricalOptions;
    private final List<String> dependentOnBiomarkers;
    private final EditBiomarkerDialog dependentOnBiomarkersWarning;
    private final boolean included;
    private final InfoCalloutTileModel infoCallout;
    private final double maxValue;
    private final double minValue;
    private final String rightIcon;
    private final String subtitle;
    private final String unit;
    private final String unitLabel;
    private final Double value;
    private final String valueLabel;
    private final String valueText;
    private final String warning;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EditBiomarkerItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C33690a(3)), null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C33690a(4)), null, AbstractC30060g.m92087G(enumC23463i, new C33690a(5))};
    }

    public /* synthetic */ EditBiomarkerItem(int i13, String str, String str2, List list, Double d3, String str3, String str4, boolean z4, double d14, double d15, InfoCalloutTileModel infoCalloutTileModel, String str5, String str6, String str7, String str8, String str9, List list2, EditBiomarkerDialog editBiomarkerDialog, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (262143 != (i13 & 262143)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 262143, EditBiomarkerItem$$serializer.INSTANCE.getDescriptor());
        }
        this.biomarkerName = str;
        this.biomarkerId = str2;
        this.calculatedFromBiomarkers = list;
        this.value = d3;
        this.valueText = str3;
        this.unit = str4;
        this.included = z4;
        this.minValue = d14;
        this.maxValue = d15;
        this.infoCallout = infoCalloutTileModel;
        this.valueLabel = str5;
        this.unitLabel = str6;
        this.subtitle = str7;
        this.warning = str8;
        this.rightIcon = str9;
        this.dependentOnBiomarkers = list2;
        this.dependentOnBiomarkersWarning = editBiomarkerDialog;
        this.categoricalOptions = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(CategoricalMapping$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditBiomarkerItem copy$default(EditBiomarkerItem editBiomarkerItem, String str, String str2, List list, Double d3, String str3, String str4, boolean z4, double d14, double d15, InfoCalloutTileModel infoCalloutTileModel, String str5, String str6, String str7, String str8, String str9, List list2, EditBiomarkerDialog editBiomarkerDialog, List list3, int i13, Object obj) {
        List list4;
        EditBiomarkerDialog editBiomarkerDialog2;
        String str10 = (i13 & 1) != 0 ? editBiomarkerItem.biomarkerName : str;
        String str11 = (i13 & 2) != 0 ? editBiomarkerItem.biomarkerId : str2;
        List list5 = (i13 & 4) != 0 ? editBiomarkerItem.calculatedFromBiomarkers : list;
        Double d16 = (i13 & 8) != 0 ? editBiomarkerItem.value : d3;
        String str12 = (i13 & 16) != 0 ? editBiomarkerItem.valueText : str3;
        String str13 = (i13 & 32) != 0 ? editBiomarkerItem.unit : str4;
        boolean z13 = (i13 & 64) != 0 ? editBiomarkerItem.included : z4;
        double d17 = (i13 & 128) != 0 ? editBiomarkerItem.minValue : d14;
        double d18 = (i13 & 256) != 0 ? editBiomarkerItem.maxValue : d15;
        InfoCalloutTileModel infoCalloutTileModel2 = (i13 & 512) != 0 ? editBiomarkerItem.infoCallout : infoCalloutTileModel;
        String str14 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? editBiomarkerItem.valueLabel : str5;
        String str15 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? editBiomarkerItem.unitLabel : str6;
        String str16 = str10;
        String str17 = (i13 & 4096) != 0 ? editBiomarkerItem.subtitle : str7;
        String str18 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? editBiomarkerItem.warning : str8;
        String str19 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? editBiomarkerItem.rightIcon : str9;
        List list6 = (i13 & 32768) != 0 ? editBiomarkerItem.dependentOnBiomarkers : list2;
        EditBiomarkerDialog editBiomarkerDialog3 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? editBiomarkerItem.dependentOnBiomarkersWarning : editBiomarkerDialog;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            editBiomarkerDialog2 = editBiomarkerDialog3;
            list4 = editBiomarkerItem.categoricalOptions;
        } else {
            list4 = list3;
            editBiomarkerDialog2 = editBiomarkerDialog3;
        }
        return editBiomarkerItem.copy(str16, str11, list5, d16, str12, str13, z13, d17, d18, infoCalloutTileModel2, str14, str15, str17, str18, str19, list6, editBiomarkerDialog2, list4);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(EditBiomarkerItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.biomarkerName);
        output.encodeStringElement(serialDesc, 1, self.biomarkerId);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.calculatedFromBiomarkers);
        output.encodeNullableSerializableElement(serialDesc, 3, DoubleSerializer.INSTANCE, self.value);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.valueText);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.unit);
        output.encodeBooleanElement(serialDesc, 6, self.included);
        output.encodeDoubleElement(serialDesc, 7, self.minValue);
        output.encodeDoubleElement(serialDesc, 8, self.maxValue);
        output.encodeNullableSerializableElement(serialDesc, 9, InfoCalloutTileModel$$serializer.INSTANCE, self.infoCallout);
        output.encodeStringElement(serialDesc, 10, self.valueLabel);
        output.encodeStringElement(serialDesc, 11, self.unitLabel);
        output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.warning);
        output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.rightIcon);
        output.encodeNullableSerializableElement(serialDesc, 15, (InterfaceC37145j) interfaceC23462hArr[15].getValue(), self.dependentOnBiomarkers);
        output.encodeNullableSerializableElement(serialDesc, 16, EditBiomarkerDialog$$serializer.INSTANCE, self.dependentOnBiomarkersWarning);
        output.encodeNullableSerializableElement(serialDesc, 17, (InterfaceC37145j) interfaceC23462hArr[17].getValue(), self.categoricalOptions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiomarkerName() {
        return this.biomarkerName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final InfoCalloutTileModel getInfoCallout() {
        return this.infoCallout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getValueLabel() {
        return this.valueLabel;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUnitLabel() {
        return this.unitLabel;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final List<String> component16() {
        return this.dependentOnBiomarkers;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final EditBiomarkerDialog getDependentOnBiomarkersWarning() {
        return this.dependentOnBiomarkersWarning;
    }

    public final List<CategoricalMapping> component18() {
        return this.categoricalOptions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBiomarkerId() {
        return this.biomarkerId;
    }

    public final List<String> component3() {
        return this.calculatedFromBiomarkers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValueText() {
        return this.valueText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIncluded() {
        return this.included;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getMaxValue() {
        return this.maxValue;
    }

    public final EditBiomarkerItem copy(String biomarkerName, String biomarkerId, List<String> calculatedFromBiomarkers, Double value, String valueText, String unit, boolean included, double minValue, double maxValue, InfoCalloutTileModel infoCallout, String valueLabel, String unitLabel, String subtitle, String warning, String rightIcon, List<String> dependentOnBiomarkers, EditBiomarkerDialog dependentOnBiomarkersWarning, List<CategoricalMapping> categoricalOptions) {
        AbstractC22676k.m65750j(biomarkerName, "biomarkerName");
        AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
        AbstractC22676k.m65750j(valueLabel, "valueLabel");
        AbstractC22676k.m65750j(unitLabel, "unitLabel");
        return new EditBiomarkerItem(biomarkerName, biomarkerId, calculatedFromBiomarkers, value, valueText, unit, included, minValue, maxValue, infoCallout, valueLabel, unitLabel, subtitle, warning, rightIcon, dependentOnBiomarkers, dependentOnBiomarkersWarning, categoricalOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditBiomarkerItem)) {
            return false;
        }
        EditBiomarkerItem editBiomarkerItem = (EditBiomarkerItem) other;
        return AbstractC22676k.m65745e(this.biomarkerName, editBiomarkerItem.biomarkerName) && AbstractC22676k.m65745e(this.biomarkerId, editBiomarkerItem.biomarkerId) && AbstractC22676k.m65745e(this.calculatedFromBiomarkers, editBiomarkerItem.calculatedFromBiomarkers) && AbstractC22676k.m65745e(this.value, editBiomarkerItem.value) && AbstractC22676k.m65745e(this.valueText, editBiomarkerItem.valueText) && AbstractC22676k.m65745e(this.unit, editBiomarkerItem.unit) && this.included == editBiomarkerItem.included && Double.compare(this.minValue, editBiomarkerItem.minValue) == 0 && Double.compare(this.maxValue, editBiomarkerItem.maxValue) == 0 && AbstractC22676k.m65745e(this.infoCallout, editBiomarkerItem.infoCallout) && AbstractC22676k.m65745e(this.valueLabel, editBiomarkerItem.valueLabel) && AbstractC22676k.m65745e(this.unitLabel, editBiomarkerItem.unitLabel) && AbstractC22676k.m65745e(this.subtitle, editBiomarkerItem.subtitle) && AbstractC22676k.m65745e(this.warning, editBiomarkerItem.warning) && AbstractC22676k.m65745e(this.rightIcon, editBiomarkerItem.rightIcon) && AbstractC22676k.m65745e(this.dependentOnBiomarkers, editBiomarkerItem.dependentOnBiomarkers) && AbstractC22676k.m65745e(this.dependentOnBiomarkersWarning, editBiomarkerItem.dependentOnBiomarkersWarning) && AbstractC22676k.m65745e(this.categoricalOptions, editBiomarkerItem.categoricalOptions);
    }

    public final String getBiomarkerId() {
        return this.biomarkerId;
    }

    public final String getBiomarkerName() {
        return this.biomarkerName;
    }

    public final List<String> getCalculatedFromBiomarkers() {
        return this.calculatedFromBiomarkers;
    }

    public final List<CategoricalMapping> getCategoricalOptions() {
        return this.categoricalOptions;
    }

    public final List<String> getDependentOnBiomarkers() {
        return this.dependentOnBiomarkers;
    }

    public final EditBiomarkerDialog getDependentOnBiomarkersWarning() {
        return this.dependentOnBiomarkersWarning;
    }

    public final boolean getIncluded() {
        return this.included;
    }

    public final InfoCalloutTileModel getInfoCallout() {
        return this.infoCallout;
    }

    public final double getMaxValue() {
        return this.maxValue;
    }

    public final double getMinValue() {
        return this.minValue;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final String getUnitLabel() {
        return this.unitLabel;
    }

    public final Double getValue() {
        return this.value;
    }

    public final String getValueLabel() {
        return this.valueLabel;
    }

    public final String getValueText() {
        return this.valueText;
    }

    public final String getWarning() {
        return this.warning;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.biomarkerName.hashCode() * 31, 31, this.biomarkerId);
        List<String> list = this.calculatedFromBiomarkers;
        int iHashCode = (iM30450d + (list == null ? 0 : list.hashCode())) * 31;
        Double d3 = this.value;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.valueText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unit;
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC2875y.m8289b((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.included), 31, this.minValue), 31, this.maxValue);
        InfoCalloutTileModel infoCalloutTileModel = this.infoCallout;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM48499a + (infoCalloutTileModel == null ? 0 : infoCalloutTileModel.hashCode())) * 31, 31, this.valueLabel), 31, this.unitLabel);
        String str3 = this.subtitle;
        int iHashCode4 = (iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.warning;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rightIcon;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list2 = this.dependentOnBiomarkers;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        EditBiomarkerDialog editBiomarkerDialog = this.dependentOnBiomarkersWarning;
        int iHashCode8 = (iHashCode7 + (editBiomarkerDialog == null ? 0 : editBiomarkerDialog.hashCode())) * 31;
        List<CategoricalMapping> list3 = this.categoricalOptions;
        return iHashCode8 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        String str = this.biomarkerName;
        String str2 = this.biomarkerId;
        List<String> list = this.calculatedFromBiomarkers;
        Double d3 = this.value;
        String str3 = this.valueText;
        String str4 = this.unit;
        boolean z4 = this.included;
        double d14 = this.minValue;
        double d15 = this.maxValue;
        InfoCalloutTileModel infoCalloutTileModel = this.infoCallout;
        String str5 = this.valueLabel;
        String str6 = this.unitLabel;
        String str7 = this.subtitle;
        String str8 = this.warning;
        String str9 = this.rightIcon;
        List<String> list2 = this.dependentOnBiomarkers;
        EditBiomarkerDialog editBiomarkerDialog = this.dependentOnBiomarkersWarning;
        List<CategoricalMapping> list3 = this.categoricalOptions;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EditBiomarkerItem(biomarkerName=", str, ", biomarkerId=", str2, ", calculatedFromBiomarkers=");
        sbM32001t.append(list);
        sbM32001t.append(", value=");
        sbM32001t.append(d3);
        sbM32001t.append(", valueText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", unit=", str4, ", included=");
        sbM32001t.append(z4);
        sbM32001t.append(", minValue=");
        sbM32001t.append(d14);
        AbstractC31061c.m95622B(sbM32001t, ", maxValue=", d15, ", infoCallout=");
        sbM32001t.append(infoCalloutTileModel);
        sbM32001t.append(", valueLabel=");
        sbM32001t.append(str5);
        sbM32001t.append(", unitLabel=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", subtitle=", str7, ", warning=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", rightIcon=", str9, ", dependentOnBiomarkers=");
        sbM32001t.append(list2);
        sbM32001t.append(", dependentOnBiomarkersWarning=");
        sbM32001t.append(editBiomarkerDialog);
        sbM32001t.append(", categoricalOptions=");
        return AbstractC3855a.m11829m(sbM32001t, list3, ")");
    }

    public EditBiomarkerItem(String biomarkerName, String biomarkerId, List<String> list, Double d3, String str, String str2, boolean z4, double d14, double d15, InfoCalloutTileModel infoCalloutTileModel, String valueLabel, String unitLabel, String str3, String str4, String str5, List<String> list2, EditBiomarkerDialog editBiomarkerDialog, List<CategoricalMapping> list3) {
        AbstractC22676k.m65750j(biomarkerName, "biomarkerName");
        AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
        AbstractC22676k.m65750j(valueLabel, "valueLabel");
        AbstractC22676k.m65750j(unitLabel, "unitLabel");
        this.biomarkerName = biomarkerName;
        this.biomarkerId = biomarkerId;
        this.calculatedFromBiomarkers = list;
        this.value = d3;
        this.valueText = str;
        this.unit = str2;
        this.included = z4;
        this.minValue = d14;
        this.maxValue = d15;
        this.infoCallout = infoCalloutTileModel;
        this.valueLabel = valueLabel;
        this.unitLabel = unitLabel;
        this.subtitle = str3;
        this.warning = str4;
        this.rightIcon = str5;
        this.dependentOnBiomarkers = list2;
        this.dependentOnBiomarkersWarning = editBiomarkerDialog;
        this.categoricalOptions = list3;
    }
}
