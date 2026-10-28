package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J>\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/items/ExerciseBreakdownCell;", "", "", "achievementIcon", "units", "value", "valueStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ExerciseBreakdownCell;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/ExerciseBreakdownCell;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAchievementIcon", "getUnits", "getValue", "getValueStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExerciseBreakdownCell {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String achievementIcon;
    private final String units;
    private final String value;
    private final String valueStyle;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ExerciseBreakdownCell$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ExerciseBreakdownCell;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExerciseBreakdownCell$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExerciseBreakdownCell(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i13 & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4, ExerciseBreakdownCell$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.achievementIcon = null;
        } else {
            this.achievementIcon = str;
        }
        if ((i13 & 2) == 0) {
            this.units = null;
        } else {
            this.units = str2;
        }
        this.value = str3;
        if ((i13 & 8) == 0) {
            this.valueStyle = null;
        } else {
            this.valueStyle = str4;
        }
    }

    public static /* synthetic */ ExerciseBreakdownCell copy$default(ExerciseBreakdownCell exerciseBreakdownCell, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = exerciseBreakdownCell.achievementIcon;
        }
        if ((i13 & 2) != 0) {
            str2 = exerciseBreakdownCell.units;
        }
        if ((i13 & 4) != 0) {
            str3 = exerciseBreakdownCell.value;
        }
        if ((i13 & 8) != 0) {
            str4 = exerciseBreakdownCell.valueStyle;
        }
        return exerciseBreakdownCell.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ExerciseBreakdownCell self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.achievementIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.achievementIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.units != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.units);
        }
        output.encodeStringElement(serialDesc, 2, self.value);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.valueStyle == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.valueStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAchievementIcon() {
        return this.achievementIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUnits() {
        return this.units;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValueStyle() {
        return this.valueStyle;
    }

    public final ExerciseBreakdownCell copy(String achievementIcon, String units, String value, String valueStyle) {
        AbstractC22676k.m65750j(value, "value");
        return new ExerciseBreakdownCell(achievementIcon, units, value, valueStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseBreakdownCell)) {
            return false;
        }
        ExerciseBreakdownCell exerciseBreakdownCell = (ExerciseBreakdownCell) other;
        return AbstractC22676k.m65745e(this.achievementIcon, exerciseBreakdownCell.achievementIcon) && AbstractC22676k.m65745e(this.units, exerciseBreakdownCell.units) && AbstractC22676k.m65745e(this.value, exerciseBreakdownCell.value) && AbstractC22676k.m65745e(this.valueStyle, exerciseBreakdownCell.valueStyle);
    }

    public final String getAchievementIcon() {
        return this.achievementIcon;
    }

    public final String getUnits() {
        return this.units;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getValueStyle() {
        return this.valueStyle;
    }

    public int hashCode() {
        String str = this.achievementIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.units;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.value);
        String str3 = this.valueStyle;
        return iM30450d + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.achievementIcon;
        String str2 = this.units;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ExerciseBreakdownCell(achievementIcon=", str, ", units=", str2, ", value="), this.value, ", valueStyle=", this.valueStyle, ")");
    }

    public ExerciseBreakdownCell(String str, String str2, String value, String str3) {
        AbstractC22676k.m65750j(value, "value");
        this.achievementIcon = str;
        this.units = str2;
        this.value = value;
        this.valueStyle = str3;
    }

    public /* synthetic */ ExerciseBreakdownCell(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, str3, (i13 & 8) != 0 ? null : str4);
    }
}
