package com.whoop.universalcheckout.features.shippingaddress.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lj1.C24474b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006*"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;", "", "", "dropdownKey", "", "", "dropdownValues", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDropdownKey", "Ljava/util/Map;", "getDropdownValues", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DropdownLookup {
    private final String dropdownKey;
    private final Map<String, List<String>> dropdownValues;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C24474b(27))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DropdownLookup$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DropdownLookup(int i13, String str, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, DropdownLookup$$serializer.INSTANCE.getDescriptor());
        }
        this.dropdownKey = str;
        this.dropdownValues = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, new ArrayListSerializer(stringSerializer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DropdownLookup copy$default(DropdownLookup dropdownLookup, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dropdownLookup.dropdownKey;
        }
        if ((i13 & 2) != 0) {
            map = dropdownLookup.dropdownValues;
        }
        return dropdownLookup.copy(str, map);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(DropdownLookup self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.dropdownKey);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.dropdownValues);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDropdownKey() {
        return this.dropdownKey;
    }

    public final Map<String, List<String>> component2() {
        return this.dropdownValues;
    }

    public final DropdownLookup copy(String dropdownKey, Map<String, ? extends List<String>> dropdownValues) {
        AbstractC22676k.m65750j(dropdownKey, "dropdownKey");
        AbstractC22676k.m65750j(dropdownValues, "dropdownValues");
        return new DropdownLookup(dropdownKey, dropdownValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownLookup)) {
            return false;
        }
        DropdownLookup dropdownLookup = (DropdownLookup) other;
        return AbstractC22676k.m65745e(this.dropdownKey, dropdownLookup.dropdownKey) && AbstractC22676k.m65745e(this.dropdownValues, dropdownLookup.dropdownValues);
    }

    public final String getDropdownKey() {
        return this.dropdownKey;
    }

    public final Map<String, List<String>> getDropdownValues() {
        return this.dropdownValues;
    }

    public int hashCode() {
        return this.dropdownValues.hashCode() + (this.dropdownKey.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114680h("DropdownLookup(dropdownKey=", this.dropdownKey, ", dropdownValues=", ")", this.dropdownValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropdownLookup(String dropdownKey, Map<String, ? extends List<String>> dropdownValues) {
        AbstractC22676k.m65750j(dropdownKey, "dropdownKey");
        AbstractC22676k.m65750j(dropdownValues, "dropdownValues");
        this.dropdownKey = dropdownKey;
        this.dropdownValues = dropdownValues;
    }
}
