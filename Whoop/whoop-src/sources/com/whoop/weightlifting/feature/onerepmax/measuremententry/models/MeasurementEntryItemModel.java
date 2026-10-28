package com.whoop.weightlifting.feature.onerepmax.measuremententry.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlin.C2012k;
import kotlinx.serialization.internal.EnumsKt;
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
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DEBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u007f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J~\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b>\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b?\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b@\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010\"¨\u0006F"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "titleSuffix", "subtitle", "subtitleSuffix", "leadingIcon", "Ly81/f;", "leadingIconColor", "subtitleColor", "trailingIcon", "trailingIconColor", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ly81/f;", "component7", "component8", "component9", "component10", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;Ljava/lang/String;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getTitleSuffix", "getSubtitle", "getSubtitleSuffix", "getLeadingIcon", "Ly81/f;", "getLeadingIconColor", "getSubtitleColor", "getTrailingIcon", "getTrailingIconColor", "Lcom/whoop/navigation/models/GenericInteraction;", "getGenericInteraction", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MeasurementEntryItemModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final GenericInteraction genericInteraction;
    private final String leadingIcon;
    private final EnumC39333f leadingIconColor;
    private final String subtitle;
    private final EnumC39333f subtitleColor;
    private final String subtitleSuffix;
    private final String title;
    private final String titleSuffix;
    private final String trailingIcon;
    private final EnumC39333f trailingIconColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.onerepmax.measuremententry.models.MeasurementEntryItemModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MeasurementEntryItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C2012k(8)), AbstractC30060g.m92087G(enumC23463i, new C2012k(9)), null, AbstractC30060g.m92087G(enumC23463i, new C2012k(10)), null};
    }

    public /* synthetic */ MeasurementEntryItemModel(int i13, String str, String str2, String str3, String str4, String str5, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, String str6, EnumC39333f enumC39333f3, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MeasurementEntryItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.titleSuffix = str2;
        this.subtitle = str3;
        this.subtitleSuffix = str4;
        this.leadingIcon = str5;
        if ((i13 & 32) == 0) {
            this.leadingIconColor = null;
        } else {
            this.leadingIconColor = enumC39333f;
        }
        if ((i13 & 64) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = enumC39333f2;
        }
        if ((i13 & 128) == 0) {
            this.trailingIcon = null;
        } else {
            this.trailingIcon = str6;
        }
        if ((i13 & 256) == 0) {
            this.trailingIconColor = null;
        } else {
            this.trailingIconColor = enumC39333f3;
        }
        if ((i13 & 512) == 0) {
            this.genericInteraction = null;
        } else {
            this.genericInteraction = genericInteraction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    public static /* synthetic */ MeasurementEntryItemModel copy$default(MeasurementEntryItemModel measurementEntryItemModel, String str, String str2, String str3, String str4, String str5, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, String str6, EnumC39333f enumC39333f3, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = measurementEntryItemModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = measurementEntryItemModel.titleSuffix;
        }
        if ((i13 & 4) != 0) {
            str3 = measurementEntryItemModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = measurementEntryItemModel.subtitleSuffix;
        }
        if ((i13 & 16) != 0) {
            str5 = measurementEntryItemModel.leadingIcon;
        }
        if ((i13 & 32) != 0) {
            enumC39333f = measurementEntryItemModel.leadingIconColor;
        }
        if ((i13 & 64) != 0) {
            enumC39333f2 = measurementEntryItemModel.subtitleColor;
        }
        if ((i13 & 128) != 0) {
            str6 = measurementEntryItemModel.trailingIcon;
        }
        if ((i13 & 256) != 0) {
            enumC39333f3 = measurementEntryItemModel.trailingIconColor;
        }
        if ((i13 & 512) != 0) {
            genericInteraction = measurementEntryItemModel.genericInteraction;
        }
        EnumC39333f enumC39333f4 = enumC39333f3;
        GenericInteraction genericInteraction2 = genericInteraction;
        EnumC39333f enumC39333f5 = enumC39333f2;
        String str7 = str6;
        String str8 = str5;
        EnumC39333f enumC39333f6 = enumC39333f;
        return measurementEntryItemModel.copy(str, str2, str3, str4, str8, enumC39333f6, enumC39333f5, str7, enumC39333f4, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(MeasurementEntryItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.titleSuffix);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeStringElement(serialDesc, 3, self.subtitleSuffix);
        output.encodeStringElement(serialDesc, 4, self.leadingIcon);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.leadingIconColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.leadingIconColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.subtitleColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.subtitleColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.trailingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.trailingIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.trailingIconColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.trailingIconColor);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.genericInteraction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, GenericInteraction$$serializer.INSTANCE, self.genericInteraction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleSuffix() {
        return this.titleSuffix;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitleSuffix() {
        return this.subtitleSuffix;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC39333f getLeadingIconColor() {
        return this.leadingIconColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EnumC39333f getSubtitleColor() {
        return this.subtitleColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTrailingIcon() {
        return this.trailingIcon;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final EnumC39333f getTrailingIconColor() {
        return this.trailingIconColor;
    }

    public final MeasurementEntryItemModel copy(String title, String titleSuffix, String subtitle, String subtitleSuffix, String leadingIcon, EnumC39333f leadingIconColor, EnumC39333f subtitleColor, String trailingIcon, EnumC39333f trailingIconColor, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleSuffix, "titleSuffix");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(subtitleSuffix, "subtitleSuffix");
        AbstractC22676k.m65750j(leadingIcon, "leadingIcon");
        return new MeasurementEntryItemModel(title, titleSuffix, subtitle, subtitleSuffix, leadingIcon, leadingIconColor, subtitleColor, trailingIcon, trailingIconColor, genericInteraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasurementEntryItemModel)) {
            return false;
        }
        MeasurementEntryItemModel measurementEntryItemModel = (MeasurementEntryItemModel) other;
        return AbstractC22676k.m65745e(this.title, measurementEntryItemModel.title) && AbstractC22676k.m65745e(this.titleSuffix, measurementEntryItemModel.titleSuffix) && AbstractC22676k.m65745e(this.subtitle, measurementEntryItemModel.subtitle) && AbstractC22676k.m65745e(this.subtitleSuffix, measurementEntryItemModel.subtitleSuffix) && AbstractC22676k.m65745e(this.leadingIcon, measurementEntryItemModel.leadingIcon) && this.leadingIconColor == measurementEntryItemModel.leadingIconColor && this.subtitleColor == measurementEntryItemModel.subtitleColor && AbstractC22676k.m65745e(this.trailingIcon, measurementEntryItemModel.trailingIcon) && this.trailingIconColor == measurementEntryItemModel.trailingIconColor && AbstractC22676k.m65745e(this.genericInteraction, measurementEntryItemModel.genericInteraction);
    }

    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final String getLeadingIcon() {
        return this.leadingIcon;
    }

    public final EnumC39333f getLeadingIconColor() {
        return this.leadingIconColor;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final EnumC39333f getSubtitleColor() {
        return this.subtitleColor;
    }

    public final String getSubtitleSuffix() {
        return this.subtitleSuffix;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleSuffix() {
        return this.titleSuffix;
    }

    public final String getTrailingIcon() {
        return this.trailingIcon;
    }

    public final EnumC39333f getTrailingIconColor() {
        return this.trailingIconColor;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.titleSuffix), 31, this.subtitle), 31, this.subtitleSuffix), 31, this.leadingIcon);
        EnumC39333f enumC39333f = this.leadingIconColor;
        int iHashCode = (iM30450d + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        EnumC39333f enumC39333f2 = this.subtitleColor;
        int iHashCode2 = (iHashCode + (enumC39333f2 == null ? 0 : enumC39333f2.hashCode())) * 31;
        String str = this.trailingIcon;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        EnumC39333f enumC39333f3 = this.trailingIconColor;
        int iHashCode4 = (iHashCode3 + (enumC39333f3 == null ? 0 : enumC39333f3.hashCode())) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        return iHashCode4 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.titleSuffix;
        String str3 = this.subtitle;
        String str4 = this.subtitleSuffix;
        String str5 = this.leadingIcon;
        EnumC39333f enumC39333f = this.leadingIconColor;
        EnumC39333f enumC39333f2 = this.subtitleColor;
        String str6 = this.trailingIcon;
        EnumC39333f enumC39333f3 = this.trailingIconColor;
        GenericInteraction genericInteraction = this.genericInteraction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MeasurementEntryItemModel(title=", str, ", titleSuffix=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitleSuffix=", str4, ", leadingIcon=");
        sbM32001t.append(str5);
        sbM32001t.append(", leadingIconColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", subtitleColor=");
        sbM32001t.append(enumC39333f2);
        sbM32001t.append(", trailingIcon=");
        sbM32001t.append(str6);
        sbM32001t.append(", trailingIconColor=");
        sbM32001t.append(enumC39333f3);
        sbM32001t.append(", genericInteraction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MeasurementEntryItemModel(String title, String titleSuffix, String subtitle, String subtitleSuffix, String leadingIcon, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, String str, EnumC39333f enumC39333f3, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleSuffix, "titleSuffix");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(subtitleSuffix, "subtitleSuffix");
        AbstractC22676k.m65750j(leadingIcon, "leadingIcon");
        this.title = title;
        this.titleSuffix = titleSuffix;
        this.subtitle = subtitle;
        this.subtitleSuffix = subtitleSuffix;
        this.leadingIcon = leadingIcon;
        this.leadingIconColor = enumC39333f;
        this.subtitleColor = enumC39333f2;
        this.trailingIcon = str;
        this.trailingIconColor = enumC39333f3;
        this.genericInteraction = genericInteraction;
    }

    public /* synthetic */ MeasurementEntryItemModel(String str, String str2, String str3, String str4, String str5, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, String str6, EnumC39333f enumC39333f3, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i13 & 32) != 0 ? null : enumC39333f, (i13 & 64) != 0 ? null : enumC39333f2, (i13 & 128) != 0 ? null : str6, (i13 & 256) != 0 ? null : enumC39333f3, (i13 & 512) != 0 ? null : genericInteraction);
    }
}
