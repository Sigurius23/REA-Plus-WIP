package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25235a0;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36955b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/design/models/items/ComparisonTableModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "", "highlightedColumns", "", "Lcom/whoop/design/models/items/ComparisonTableCell;", "rows", "<init>", "(Ljava/util/Set;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Set;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ComparisonTableModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/Set;", "component2", "()Ljava/util/List;", "copy", "(Ljava/util/Set;Ljava/util/List;)Lcom/whoop/design/models/items/ComparisonTableModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getHighlightedColumns", "Ljava/util/List;", "getRows", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ComparisonTableModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Set<Integer> highlightedColumns;
    private final List<List<ComparisonTableCell>> rows;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ComparisonTableModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ComparisonTableModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
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
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C36955b(9)), AbstractC30060g.m92087G(enumC23463i, new C36955b(10))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonTableModel() {
        this((Set) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashSetSerializer(IntSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(new ArrayListSerializer(ComparisonTableCell$$serializer.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComparisonTableModel copy$default(ComparisonTableModel comparisonTableModel, Set set, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            set = comparisonTableModel.highlightedColumns;
        }
        if ((i13 & 2) != 0) {
            list = comparisonTableModel.rows;
        }
        return comparisonTableModel.copy(set, list);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ComparisonTableModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.highlightedColumns, C25235a0.f99113w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.highlightedColumns);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.rows, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.rows);
    }

    public final Set<Integer> component1() {
        return this.highlightedColumns;
    }

    public final List<List<ComparisonTableCell>> component2() {
        return this.rows;
    }

    public final ComparisonTableModel copy(Set<Integer> highlightedColumns, List<? extends List<ComparisonTableCell>> rows) {
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

    public final Set<Integer> getHighlightedColumns() {
        return this.highlightedColumns;
    }

    public final List<List<ComparisonTableCell>> getRows() {
        return this.rows;
    }

    public int hashCode() {
        return this.rows.hashCode() + (this.highlightedColumns.hashCode() * 31);
    }

    public String toString() {
        return "ComparisonTableModel(highlightedColumns=" + this.highlightedColumns + ", rows=" + this.rows + ")";
    }

    public /* synthetic */ ComparisonTableModel(int i13, Set set, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.highlightedColumns = (i13 & 1) == 0 ? C25235a0.f99113w : set;
        if ((i13 & 2) == 0) {
            this.rows = C25271y.f99162w;
        } else {
            this.rows = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonTableModel(Set<Integer> highlightedColumns, List<? extends List<ComparisonTableCell>> rows) {
        AbstractC22676k.m65750j(highlightedColumns, "highlightedColumns");
        AbstractC22676k.m65750j(rows, "rows");
        this.highlightedColumns = highlightedColumns;
        this.rows = rows;
    }

    public /* synthetic */ ComparisonTableModel(Set set, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25235a0.f99113w : set, (i13 & 2) != 0 ? C25271y.f99162w : list);
    }
}
