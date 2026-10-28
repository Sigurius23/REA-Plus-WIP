package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36960g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J@\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 ¨\u00064"}, m65681d2 = {"Lcom/whoop/design/models/items/JournalQuestionSliderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "label", "", "Lcom/whoop/design/models/items/JournalQuestionChoice;", "choices", "", "initial", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/JournalQuestionSliderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Double;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;)Lcom/whoop/design/models/items/JournalQuestionSliderModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLabel", "Ljava/util/List;", "getChoices", "Ljava/lang/Double;", "getInitial", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalQuestionSliderModel implements DesignSystemModel {
    private final List<JournalQuestionChoice> choices;
    private final String id;
    private final Double initial;
    private final String label;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36960g(4)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/JournalQuestionSliderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/JournalQuestionSliderModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalQuestionSliderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public JournalQuestionSliderModel() {
        this((String) null, (String) null, (List) null, (Double) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(JournalQuestionChoice$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalQuestionSliderModel copy$default(JournalQuestionSliderModel journalQuestionSliderModel, String str, String str2, List list, Double d3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = journalQuestionSliderModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = journalQuestionSliderModel.label;
        }
        if ((i13 & 4) != 0) {
            list = journalQuestionSliderModel.choices;
        }
        if ((i13 & 8) != 0) {
            d3 = journalQuestionSliderModel.initial;
        }
        return journalQuestionSliderModel.copy(str, str2, list, d3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(JournalQuestionSliderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.label, "")) {
            output.encodeStringElement(serialDesc, 1, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.choices, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.choices);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.initial == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, DoubleSerializer.INSTANCE, self.initial);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final List<JournalQuestionChoice> component3() {
        return this.choices;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getInitial() {
        return this.initial;
    }

    public final JournalQuestionSliderModel copy(String id4, String label, List<JournalQuestionChoice> choices, Double initial) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(choices, "choices");
        return new JournalQuestionSliderModel(id4, label, choices, initial);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalQuestionSliderModel)) {
            return false;
        }
        JournalQuestionSliderModel journalQuestionSliderModel = (JournalQuestionSliderModel) other;
        return AbstractC22676k.m65745e(this.id, journalQuestionSliderModel.id) && AbstractC22676k.m65745e(this.label, journalQuestionSliderModel.label) && AbstractC22676k.m65745e(this.choices, journalQuestionSliderModel.choices) && AbstractC22676k.m65745e(this.initial, journalQuestionSliderModel.initial);
    }

    public final List<JournalQuestionChoice> getChoices() {
        return this.choices;
    }

    public final String getId() {
        return this.id;
    }

    public final Double getInitial() {
        return this.initial;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.label), 31, this.choices);
        Double d3 = this.initial;
        return iM31983b + (d3 == null ? 0 : d3.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        List<JournalQuestionChoice> list = this.choices;
        Double d3 = this.initial;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("JournalQuestionSliderModel(id=", str, ", label=", str2, ", choices=");
        sbM32001t.append(list);
        sbM32001t.append(", initial=");
        sbM32001t.append(d3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ JournalQuestionSliderModel(int i13, String str, String str2, List list, Double d3, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.choices = C25271y.f99162w;
        } else {
            this.choices = list;
        }
        if ((i13 & 8) == 0) {
            this.initial = null;
        } else {
            this.initial = d3;
        }
    }

    public JournalQuestionSliderModel(String id4, String label, List<JournalQuestionChoice> choices, Double d3) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(choices, "choices");
        this.id = id4;
        this.label = label;
        this.choices = choices;
        this.initial = d3;
    }

    public /* synthetic */ JournalQuestionSliderModel(String str, String str2, List list, Double d3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : d3);
    }
}
