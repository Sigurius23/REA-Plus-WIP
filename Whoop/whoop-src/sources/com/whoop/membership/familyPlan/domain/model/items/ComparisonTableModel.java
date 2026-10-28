package com.whoop.membership.familyPlan.domain.model.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import sr2.C32940v;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBA\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J6\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "", "highlightedColumns", "Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonRowElement;", "rows", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getHighlightedColumns", "getRows", "Companion", "$serializer", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ComparisonTableModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<Integer> highlightedColumns;
    private final List<List<ComparisonRowElement>> rows;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.domain.model.items.ComparisonTableModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ComparisonTableModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C32940v(5)), AbstractC30060g.m92087G(enumC23463i, new C32940v(6))};
    }

    public /* synthetic */ ComparisonTableModel(int i13, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ComparisonTableModel$$serializer.INSTANCE.getDescriptor());
        }
        this.highlightedColumns = list;
        this.rows = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(IntSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(new ArrayListSerializer(ComparisonRowElement$$serializer.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComparisonTableModel copy$default(ComparisonTableModel comparisonTableModel, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = comparisonTableModel.highlightedColumns;
        }
        if ((i13 & 2) != 0) {
            list2 = comparisonTableModel.rows;
        }
        return comparisonTableModel.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$membership_release(ComparisonTableModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.highlightedColumns);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.rows);
    }

    public final List<Integer> component1() {
        return this.highlightedColumns;
    }

    public final List<List<ComparisonRowElement>> component2() {
        return this.rows;
    }

    public final ComparisonTableModel copy(List<Integer> highlightedColumns, List<? extends List<ComparisonRowElement>> rows) {
        AbstractC22676k.m65750j(highlightedColumns, "highlightedColumns");
        AbstractC22676k.m65750j(rows, "rows");
        return new ComparisonTableModel(highlightedColumns, rows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComparisonTableModel)) {
            return false;
        }
        ComparisonTableModel comparisonTableModel = (ComparisonTableModel) other;
        return AbstractC22676k.m65745e(this.highlightedColumns, comparisonTableModel.highlightedColumns) && AbstractC22676k.m65745e(this.rows, comparisonTableModel.rows);
    }

    public final List<Integer> getHighlightedColumns() {
        return this.highlightedColumns;
    }

    public final List<List<ComparisonRowElement>> getRows() {
        return this.rows;
    }

    public int hashCode() {
        return this.rows.hashCode() + (this.highlightedColumns.hashCode() * 31);
    }

    public String toString() {
        return AbstractC13673n.m38562i("ComparisonTableModel(highlightedColumns=", ", rows=", this.highlightedColumns, ")", this.rows);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonTableModel(List<Integer> highlightedColumns, List<? extends List<ComparisonRowElement>> rows) {
        AbstractC22676k.m65750j(highlightedColumns, "highlightedColumns");
        AbstractC22676k.m65750j(rows, "rows");
        this.highlightedColumns = highlightedColumns;
        this.rows = rows;
    }
}
