package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import j00.C21118u;
import j02.EnumC21172v;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001c¨\u00061"}, m65681d2 = {"Lcom/whoop/navigation/DismissEventModel;", "", "Lj02/v;", "type", "Lcom/whoop/navigation/PopUpToModel;", "popUpTo", "", "popBackCount", "<init>", "(Lj02/v;Lcom/whoop/navigation/PopUpToModel;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILj02/v;Lcom/whoop/navigation/PopUpToModel;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/DismissEventModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lj02/v;", "component2", "()Lcom/whoop/navigation/PopUpToModel;", "component3", "()Ljava/lang/Integer;", "copy", "(Lj02/v;Lcom/whoop/navigation/PopUpToModel;Ljava/lang/Integer;)Lcom/whoop/navigation/DismissEventModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj02/v;", "getType", "Lcom/whoop/navigation/PopUpToModel;", "getPopUpTo", "Ljava/lang/Integer;", "getPopBackCount", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DismissEventModel {
    private final Integer popBackCount;
    private final PopUpToModel popUpTo;
    private final EnumC21172v type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21118u(16)), null, null};

    /* JADX INFO: renamed from: com.whoop.navigation.DismissEventModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/DismissEventModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/DismissEventModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DismissEventModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DismissEventModel(int i13, EnumC21172v enumC21172v, PopUpToModel popUpToModel, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, DismissEventModel$$serializer.INSTANCE.getDescriptor());
        }
        this.type = enumC21172v;
        this.popUpTo = popUpToModel;
        this.popBackCount = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.navigation.DismissalType", EnumC21172v.values());
    }

    public static /* synthetic */ DismissEventModel copy$default(DismissEventModel dismissEventModel, EnumC21172v enumC21172v, PopUpToModel popUpToModel, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC21172v = dismissEventModel.type;
        }
        if ((i13 & 2) != 0) {
            popUpToModel = dismissEventModel.popUpTo;
        }
        if ((i13 & 4) != 0) {
            num = dismissEventModel.popBackCount;
        }
        return dismissEventModel.copy(enumC21172v, popUpToModel, num);
    }

    public static final /* synthetic */ void write$Self$navigation_release(DismissEventModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.type);
        output.encodeNullableSerializableElement(serialDesc, 1, PopUpToModel$$serializer.INSTANCE, self.popUpTo);
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.popBackCount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC21172v getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PopUpToModel getPopUpTo() {
        return this.popUpTo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPopBackCount() {
        return this.popBackCount;
    }

    public final DismissEventModel copy(EnumC21172v type, PopUpToModel popUpTo, Integer popBackCount) {
        AbstractC22676k.m65750j(type, "type");
        return new DismissEventModel(type, popUpTo, popBackCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DismissEventModel)) {
            return false;
        }
        DismissEventModel dismissEventModel = (DismissEventModel) other;
        return this.type == dismissEventModel.type && AbstractC22676k.m65745e(this.popUpTo, dismissEventModel.popUpTo) && AbstractC22676k.m65745e(this.popBackCount, dismissEventModel.popBackCount);
    }

    public final Integer getPopBackCount() {
        return this.popBackCount;
    }

    public final PopUpToModel getPopUpTo() {
        return this.popUpTo;
    }

    public final EnumC21172v getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        PopUpToModel popUpToModel = this.popUpTo;
        int iHashCode2 = (iHashCode + (popUpToModel == null ? 0 : popUpToModel.hashCode())) * 31;
        Integer num = this.popBackCount;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        EnumC21172v enumC21172v = this.type;
        PopUpToModel popUpToModel = this.popUpTo;
        Integer num = this.popBackCount;
        StringBuilder sb4 = new StringBuilder("DismissEventModel(type=");
        sb4.append(enumC21172v);
        sb4.append(", popUpTo=");
        sb4.append(popUpToModel);
        sb4.append(", popBackCount=");
        return AbstractC11478a.m30859k(sb4, num, ")");
    }

    public DismissEventModel(EnumC21172v type, PopUpToModel popUpToModel, Integer num) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.popUpTo = popUpToModel;
        this.popBackCount = num;
    }
}
