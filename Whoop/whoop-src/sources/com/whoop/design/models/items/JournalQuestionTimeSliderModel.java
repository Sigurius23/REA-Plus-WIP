package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u001a¨\u00064"}, m65681d2 = {"Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "label", "lowerBound", "upperBound", "", "incrementMinutes", "initial", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLabel", "getLowerBound", "getUpperBound", "I", "getIncrementMinutes", "getInitial", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalQuestionTimeSliderModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private final int incrementMinutes;
    private final String initial;
    private final String label;
    private final String lowerBound;
    private final String upperBound;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalQuestionTimeSliderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public JournalQuestionTimeSliderModel() {
        this((String) null, (String) null, (String) null, (String) null, 0, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ JournalQuestionTimeSliderModel copy$default(JournalQuestionTimeSliderModel journalQuestionTimeSliderModel, String str, String str2, String str3, String str4, int i13, String str5, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = journalQuestionTimeSliderModel.id;
        }
        if ((i14 & 2) != 0) {
            str2 = journalQuestionTimeSliderModel.label;
        }
        if ((i14 & 4) != 0) {
            str3 = journalQuestionTimeSliderModel.lowerBound;
        }
        if ((i14 & 8) != 0) {
            str4 = journalQuestionTimeSliderModel.upperBound;
        }
        if ((i14 & 16) != 0) {
            i13 = journalQuestionTimeSliderModel.incrementMinutes;
        }
        if ((i14 & 32) != 0) {
            str5 = journalQuestionTimeSliderModel.initial;
        }
        int i15 = i13;
        String str6 = str5;
        return journalQuestionTimeSliderModel.copy(str, str2, str3, str4, i15, str6);
    }

    public static final /* synthetic */ void write$Self$design_models_release(JournalQuestionTimeSliderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.label, "")) {
            output.encodeStringElement(serialDesc, 1, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.lowerBound, "")) {
            output.encodeStringElement(serialDesc, 2, self.lowerBound);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.upperBound, "")) {
            output.encodeStringElement(serialDesc, 3, self.upperBound);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.incrementMinutes != 30) {
            output.encodeIntElement(serialDesc, 4, self.incrementMinutes);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.initial == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.initial);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLowerBound() {
        return this.lowerBound;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUpperBound() {
        return this.upperBound;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIncrementMinutes() {
        return this.incrementMinutes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInitial() {
        return this.initial;
    }

    public final JournalQuestionTimeSliderModel copy(String id4, String label, String lowerBound, String upperBound, int incrementMinutes, String initial) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
        return new JournalQuestionTimeSliderModel(id4, label, lowerBound, upperBound, incrementMinutes, initial);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalQuestionTimeSliderModel)) {
            return false;
        }
        JournalQuestionTimeSliderModel journalQuestionTimeSliderModel = (JournalQuestionTimeSliderModel) other;
        return AbstractC22676k.m65745e(this.id, journalQuestionTimeSliderModel.id) && AbstractC22676k.m65745e(this.label, journalQuestionTimeSliderModel.label) && AbstractC22676k.m65745e(this.lowerBound, journalQuestionTimeSliderModel.lowerBound) && AbstractC22676k.m65745e(this.upperBound, journalQuestionTimeSliderModel.upperBound) && this.incrementMinutes == journalQuestionTimeSliderModel.incrementMinutes && AbstractC22676k.m65745e(this.initial, journalQuestionTimeSliderModel.initial);
    }

    public final String getId() {
        return this.id;
    }

    public final int getIncrementMinutes() {
        return this.incrementMinutes;
    }

    public final String getInitial() {
        return this.initial;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLowerBound() {
        return this.lowerBound;
    }

    public final String getUpperBound() {
        return this.upperBound;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.incrementMinutes, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.label), 31, this.lowerBound), 31, this.upperBound), 31);
        String str = this.initial;
        return iM30448b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        String str3 = this.lowerBound;
        String str4 = this.upperBound;
        int i13 = this.incrementMinutes;
        String str5 = this.initial;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("JournalQuestionTimeSliderModel(id=", str, ", label=", str2, ", lowerBound=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", upperBound=", str4, ", incrementMinutes=");
        return AbstractC38963t7.m124376f(i13, ", initial=", str5, ")", sbM32001t);
    }

    public /* synthetic */ JournalQuestionTimeSliderModel(int i13, String str, String str2, String str3, String str4, int i14, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i13 & 4) == 0) {
            this.lowerBound = "";
        } else {
            this.lowerBound = str3;
        }
        if ((i13 & 8) == 0) {
            this.upperBound = "";
        } else {
            this.upperBound = str4;
        }
        if ((i13 & 16) == 0) {
            this.incrementMinutes = 30;
        } else {
            this.incrementMinutes = i14;
        }
        if ((i13 & 32) == 0) {
            this.initial = null;
        } else {
            this.initial = str5;
        }
    }

    public JournalQuestionTimeSliderModel(String id4, String label, String lowerBound, String upperBound, int i13, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
        this.id = id4;
        this.label = label;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.incrementMinutes = i13;
        this.initial = str;
    }

    public /* synthetic */ JournalQuestionTimeSliderModel(String str, String str2, String str3, String str4, int i13, String str5, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? "" : str3, (i14 & 8) != 0 ? "" : str4, (i14 & 16) != 0 ? 30 : i13, (i14 & 32) != 0 ? null : str5);
    }
}
