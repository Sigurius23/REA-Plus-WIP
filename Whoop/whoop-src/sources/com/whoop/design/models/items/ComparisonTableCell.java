package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import ge3.AbstractC15751g;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import w91.C36955b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0003()'B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/design/models/items/ComparisonTableCell;", "", "Lcom/whoop/design/models/items/ComparisonTableCell$CellType;", "cellType", "", "content", "<init>", "(Lcom/whoop/design/models/items/ComparisonTableCell$CellType;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/ComparisonTableCell$CellType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ComparisonTableCell;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/ComparisonTableCell$CellType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/models/items/ComparisonTableCell$CellType;Ljava/lang/String;)Lcom/whoop/design/models/items/ComparisonTableCell;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/ComparisonTableCell$CellType;", "getCellType", "Ljava/lang/String;", "getContent", "Companion", "CellType", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ComparisonTableCell {
    public static final int $stable = 0;
    private final CellType cellType;
    private final String content;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36955b(8)), null};

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/design/models/items/ComparisonTableCell$CellType;", "", "<init>", "(Ljava/lang/String;I)V", "EMPTY", ShippingAddressField.TEXT_FIELD_TYPE, "NUMBER_TEXT", "IMAGE", "ICON", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum CellType {
        EMPTY,
        TEXT,
        NUMBER_TEXT,
        IMAGE,
        ICON;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ComparisonTableCell$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ComparisonTableCell;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ComparisonTableCell$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ComparisonTableCell(int i13, CellType cellType, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ComparisonTableCell$$serializer.INSTANCE.getDescriptor());
        }
        this.cellType = cellType;
        if ((i13 & 2) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ComparisonTableCell.CellType", CellType.values());
    }

    public static /* synthetic */ ComparisonTableCell copy$default(ComparisonTableCell comparisonTableCell, CellType cellType, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            cellType = comparisonTableCell.cellType;
        }
        if ((i13 & 2) != 0) {
            str = comparisonTableCell.content;
        }
        return comparisonTableCell.copy(cellType, str);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ComparisonTableCell self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.cellType);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.content == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.content);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CellType getCellType() {
        return this.cellType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final ComparisonTableCell copy(CellType cellType, String content) {
        AbstractC22676k.m65750j(cellType, "cellType");
        return new ComparisonTableCell(cellType, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComparisonTableCell)) {
            return false;
        }
        ComparisonTableCell comparisonTableCell = (ComparisonTableCell) other;
        return this.cellType == comparisonTableCell.cellType && AbstractC22676k.m65745e(this.content, comparisonTableCell.content);
    }

    public final CellType getCellType() {
        return this.cellType;
    }

    public final String getContent() {
        return this.content;
    }

    public int hashCode() {
        int iHashCode = this.cellType.hashCode() * 31;
        String str = this.content;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ComparisonTableCell(cellType=" + this.cellType + ", content=" + this.content + ")";
    }

    public ComparisonTableCell(CellType cellType, String str) {
        AbstractC22676k.m65750j(cellType, "cellType");
        this.cellType = cellType;
        this.content = str;
    }

    public /* synthetic */ ComparisonTableCell(CellType cellType, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(cellType, (i13 & 2) != 0 ? null : str);
    }
}
