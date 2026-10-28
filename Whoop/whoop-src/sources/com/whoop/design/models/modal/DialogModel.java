package com.whoop.design.models.modal;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.calendar.archmini.C7011a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0002QPBU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u000f\u0010\u0019J#\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b'\u0010(Jb\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b<\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b=\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b@\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010&R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010(R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IRE\u0010\u0016\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`J¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\t0M8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010E\u001a\u0004\bN\u0010G\"\u0004\bO\u0010I¨\u0006R"}, m65681d2 = {"Lcom/whoop/design/models/modal/DialogModel;", "Lcom/whoop/design/models/modal/Modal;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "title", "description", "Lcom/whoop/design/models/modal/DialogButton;", "primaryButton", "secondaryButton", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "", "showCloseButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/DialogButton;Lcom/whoop/design/models/modal/DialogButton;Ljava/util/List;Z)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/DialogButton;Lcom/whoop/design/models/modal/DialogButton;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/modal/DialogModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/modal/DialogButton;", "component5", "component6", "()Ljava/util/List;", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/DialogButton;Lcom/whoop/design/models/modal/DialogButton;Ljava/util/List;Z)Lcom/whoop/design/models/modal/DialogModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/modal/DialogModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getDescription", "Lcom/whoop/design/models/modal/DialogButton;", "getPrimaryButton", "getSecondaryButton", "Ljava/util/List;", "getItems", "Z", "getShowCloseButton", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DialogModel implements Modal, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String description;
    private final String id;
    private final List<DesignSystemModel> items;
    private final DialogButton primaryButton;
    private final DialogButton secondaryButton;
    private final boolean showCloseButton;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/modal/DialogModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/modal/DialogModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DialogModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C7011a(20)), null, AbstractC30060g.m92087G(enumC23463i, new C7011a(21)), null};
    }

    public /* synthetic */ DialogModel(int i13, String str, String str2, String str3, DialogButton dialogButton, DialogButton dialogButton2, List list, boolean z4, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, DialogModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        if ((i13 & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i13 & 8) == 0) {
            this.primaryButton = null;
        } else {
            this.primaryButton = dialogButton;
        }
        if ((i13 & 16) == 0) {
            this.secondaryButton = null;
        } else {
            this.secondaryButton = dialogButton2;
        }
        if ((i13 & 32) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 64) == 0) {
            this.showCloseButton = false;
        } else {
            this.showCloseButton = z4;
        }
        if ((i13 & 128) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 256) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogModel copy$default(DialogModel dialogModel, String str, String str2, String str3, DialogButton dialogButton, DialogButton dialogButton2, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dialogModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = dialogModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = dialogModel.description;
        }
        if ((i13 & 8) != 0) {
            dialogButton = dialogModel.primaryButton;
        }
        if ((i13 & 16) != 0) {
            dialogButton2 = dialogModel.secondaryButton;
        }
        if ((i13 & 32) != 0) {
            list = dialogModel.items;
        }
        if ((i13 & 64) != 0) {
            z4 = dialogModel.showCloseButton;
        }
        List list2 = list;
        boolean z13 = z4;
        DialogButton dialogButton3 = dialogButton2;
        String str4 = str3;
        return dialogModel.copy(str, str2, str4, dialogButton, dialogButton3, list2, z13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(DialogModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.description != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.primaryButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, DialogButton$$serializer.INSTANCE, self.primaryButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.secondaryButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, DialogButton$$serializer.INSTANCE, self.secondaryButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.showCloseButton) {
            output.encodeBooleanElement(serialDesc, 6, self.showCloseButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DialogButton getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DialogButton getSecondaryButton() {
        return this.secondaryButton;
    }

    public final List<DesignSystemModel> component6() {
        return this.items;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    public final DialogModel copy(String id4, String title, String description, DialogButton primaryButton, DialogButton secondaryButton, List<? extends DesignSystemModel> items, boolean showCloseButton) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        return new DialogModel(id4, title, description, primaryButton, secondaryButton, items, showCloseButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogModel)) {
            return false;
        }
        DialogModel dialogModel = (DialogModel) other;
        return AbstractC22676k.m65745e(this.id, dialogModel.id) && AbstractC22676k.m65745e(this.title, dialogModel.title) && AbstractC22676k.m65745e(this.description, dialogModel.description) && AbstractC22676k.m65745e(this.primaryButton, dialogModel.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, dialogModel.secondaryButton) && AbstractC22676k.m65745e(this.items, dialogModel.items) && this.showCloseButton == dialogModel.showCloseButton;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final DialogButton getPrimaryButton() {
        return this.primaryButton;
    }

    public final DialogButton getSecondaryButton() {
        return this.secondaryButton;
    }

    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        DialogButton dialogButton = this.primaryButton;
        int iHashCode2 = (iHashCode + (dialogButton == null ? 0 : dialogButton.hashCode())) * 31;
        DialogButton dialogButton2 = this.secondaryButton;
        return Boolean.hashCode(this.showCloseButton) + AbstractC11895b.m31983b((iHashCode2 + (dialogButton2 != null ? dialogButton2.hashCode() : 0)) * 31, 31, this.items);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        DialogButton dialogButton = this.primaryButton;
        DialogButton dialogButton2 = this.secondaryButton;
        List<DesignSystemModel> list = this.items;
        boolean z4 = this.showCloseButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DialogModel(id=", str, ", title=", str2, ", description=");
        sbM32001t.append(str3);
        sbM32001t.append(", primaryButton=");
        sbM32001t.append(dialogButton);
        sbM32001t.append(", secondaryButton=");
        sbM32001t.append(dialogButton2);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(", showCloseButton=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public DialogModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return DialogModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogModel(String id4, String title, String str, DialogButton dialogButton, DialogButton dialogButton2, List<? extends DesignSystemModel> items, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.title = title;
        this.description = str;
        this.primaryButton = dialogButton;
        this.secondaryButton = dialogButton2;
        this.items = items;
        this.showCloseButton = z4;
    }

    public /* synthetic */ DialogModel(String str, String str2, String str3, DialogButton dialogButton, DialogButton dialogButton2, List list, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : dialogButton, (i13 & 16) != 0 ? null : dialogButton2, (i13 & 32) != 0 ? C25271y.f99162w : list, (i13 & 64) != 0 ? false : z4);
    }
}
