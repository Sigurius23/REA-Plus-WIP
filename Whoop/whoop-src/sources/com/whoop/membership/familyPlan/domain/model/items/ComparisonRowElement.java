package com.whoop.membership.familyPlan.domain.model.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonRowElement;", "", "Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonElementType;", "cellType", "", "content", "<init>", "(Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonElementType;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/membership/familyPlan/domain/model/items/ComparisonElementType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonRowElement;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonElementType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonElementType;Ljava/lang/String;)Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonRowElement;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonElementType;", "getCellType", "Ljava/lang/String;", "getContent", "Companion", "$serializer", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ComparisonRowElement {
    public static final int $stable = 0;
    private final ComparisonElementType cellType;
    private final String content;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32940v(4)), null};

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.domain.model.items.ComparisonRowElement$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonRowElement$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonRowElement;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ComparisonRowElement$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ComparisonRowElement(int i13, ComparisonElementType comparisonElementType, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ComparisonRowElement$$serializer.INSTANCE.getDescriptor());
        }
        this.cellType = comparisonElementType;
        this.content = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ComparisonElementType.INSTANCE.serializer();
    }

    public static /* synthetic */ ComparisonRowElement copy$default(ComparisonRowElement comparisonRowElement, ComparisonElementType comparisonElementType, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            comparisonElementType = comparisonRowElement.cellType;
        }
        if ((i13 & 2) != 0) {
            str = comparisonRowElement.content;
        }
        return comparisonRowElement.copy(comparisonElementType, str);
    }

    public static final /* synthetic */ void write$Self$membership_release(ComparisonRowElement self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.cellType);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.content);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ComparisonElementType getCellType() {
        return this.cellType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final ComparisonRowElement copy(ComparisonElementType cellType, String content) {
        AbstractC22676k.m65750j(cellType, "cellType");
        return new ComparisonRowElement(cellType, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComparisonRowElement)) {
            return false;
        }
        ComparisonRowElement comparisonRowElement = (ComparisonRowElement) other;
        return this.cellType == comparisonRowElement.cellType && AbstractC22676k.m65745e(this.content, comparisonRowElement.content);
    }

    public final ComparisonElementType getCellType() {
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
        return "ComparisonRowElement(cellType=" + this.cellType + ", content=" + this.content + ")";
    }

    public ComparisonRowElement(ComparisonElementType cellType, String str) {
        AbstractC22676k.m65750j(cellType, "cellType");
        this.cellType = cellType;
        this.content = str;
    }
}
