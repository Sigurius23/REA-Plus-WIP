package com.whoop.design.models.items;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36956c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b+\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/design/models/items/ExerciseBreakdownModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "numberOfColumns", "", "", "tableTitles", "Lcom/whoop/design/models/items/ExerciseBreakdownRow;", "rows", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ExerciseBreakdownModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "copy", "(ILjava/util/List;Ljava/util/List;)Lcom/whoop/design/models/items/ExerciseBreakdownModel;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getNumberOfColumns", "Ljava/util/List;", "getTableTitles", "getRows", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExerciseBreakdownModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final int numberOfColumns;
    private final List<ExerciseBreakdownRow> rows;
    private final List<String> tableTitles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ExerciseBreakdownModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ExerciseBreakdownModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExerciseBreakdownModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36956c(25)), AbstractC30060g.m92087G(enumC23463i, new C36956c(26))};
    }

    public /* synthetic */ ExerciseBreakdownModel(int i13, int i14, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ExerciseBreakdownModel$$serializer.INSTANCE.getDescriptor());
        }
        this.numberOfColumns = i14;
        this.tableTitles = list;
        this.rows = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ExerciseBreakdownRow$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExerciseBreakdownModel copy$default(ExerciseBreakdownModel exerciseBreakdownModel, int i13, List list, List list2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = exerciseBreakdownModel.numberOfColumns;
        }
        if ((i14 & 2) != 0) {
            list = exerciseBreakdownModel.tableTitles;
        }
        if ((i14 & 4) != 0) {
            list2 = exerciseBreakdownModel.rows;
        }
        return exerciseBreakdownModel.copy(i13, list, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ExerciseBreakdownModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.numberOfColumns);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.tableTitles);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.rows);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumberOfColumns() {
        return this.numberOfColumns;
    }

    public final List<String> component2() {
        return this.tableTitles;
    }

    public final List<ExerciseBreakdownRow> component3() {
        return this.rows;
    }

    public final ExerciseBreakdownModel copy(int numberOfColumns, List<String> tableTitles, List<ExerciseBreakdownRow> rows) {
        AbstractC22676k.m65750j(tableTitles, "tableTitles");
        AbstractC22676k.m65750j(rows, "rows");
        return new ExerciseBreakdownModel(numberOfColumns, tableTitles, rows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseBreakdownModel)) {
            return false;
        }
        ExerciseBreakdownModel exerciseBreakdownModel = (ExerciseBreakdownModel) other;
        return this.numberOfColumns == exerciseBreakdownModel.numberOfColumns && AbstractC22676k.m65745e(this.tableTitles, exerciseBreakdownModel.tableTitles) && AbstractC22676k.m65745e(this.rows, exerciseBreakdownModel.rows);
    }

    public final int getNumberOfColumns() {
        return this.numberOfColumns;
    }

    public final List<ExerciseBreakdownRow> getRows() {
        return this.rows;
    }

    public final List<String> getTableTitles() {
        return this.tableTitles;
    }

    public int hashCode() {
        return this.rows.hashCode() + AbstractC11895b.m31983b(Integer.hashCode(this.numberOfColumns) * 31, 31, this.tableTitles);
    }

    public String toString() {
        int i13 = this.numberOfColumns;
        List<String> list = this.tableTitles;
        List<ExerciseBreakdownRow> list2 = this.rows;
        StringBuilder sb4 = new StringBuilder("ExerciseBreakdownModel(numberOfColumns=");
        sb4.append(i13);
        sb4.append(", tableTitles=");
        sb4.append(list);
        sb4.append(", rows=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    public ExerciseBreakdownModel(int i13, List<String> tableTitles, List<ExerciseBreakdownRow> rows) {
        AbstractC22676k.m65750j(tableTitles, "tableTitles");
        AbstractC22676k.m65750j(rows, "rows");
        this.numberOfColumns = i13;
        this.tableTitles = tableTitles;
        this.rows = rows;
    }
}
