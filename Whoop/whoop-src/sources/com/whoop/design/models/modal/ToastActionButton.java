package com.whoop.design.models.modal;

import com.whoop.design.models.calendar.archmini.C7011a;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/modal/ToastActionButton;", "", "", "text", "icon", "Lcom/whoop/design/models/modal/ToastActionButtonAlignment;", "alignment", "Lcom/whoop/navigation/e;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastActionButtonAlignment;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastActionButtonAlignment;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/modal/ToastActionButton;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/modal/ToastActionButtonAlignment;", "component4", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastActionButtonAlignment;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/modal/ToastActionButton;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getIcon", "Lcom/whoop/design/models/modal/ToastActionButtonAlignment;", "getAlignment", "Lcom/whoop/navigation/e;", "getAction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ToastActionButton {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e action;
    private final ToastActionButtonAlignment alignment;
    private final String icon;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/modal/ToastActionButton$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/modal/ToastActionButton;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ToastActionButton$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C7011a(25)), AbstractC30060g.m92087G(enumC23463i, new C7011a(26))};
    }

    public /* synthetic */ ToastActionButton(int i13, String str, String str2, ToastActionButtonAlignment toastActionButtonAlignment, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ToastActionButton$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        if ((i13 & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = str2;
        }
        if ((i13 & 4) == 0) {
            this.alignment = ToastActionButtonAlignment.LEADING;
        } else {
            this.alignment = toastActionButtonAlignment;
        }
        if ((i13 & 8) == 0) {
            this.action = null;
        } else {
            this.action = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ToastActionButtonAlignment.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ToastActionButton copy$default(ToastActionButton toastActionButton, String str, String str2, ToastActionButtonAlignment toastActionButtonAlignment, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = toastActionButton.text;
        }
        if ((i13 & 2) != 0) {
            str2 = toastActionButton.icon;
        }
        if ((i13 & 4) != 0) {
            toastActionButtonAlignment = toastActionButton.alignment;
        }
        if ((i13 & 8) != 0) {
            c9598e = toastActionButton.action;
        }
        return toastActionButton.copy(str, str2, toastActionButtonAlignment, c9598e);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ToastActionButton self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.text);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.alignment != ToastActionButtonAlignment.LEADING) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.alignment);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.action == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.action);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ToastActionButtonAlignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getAction() {
        return this.action;
    }

    public final ToastActionButton copy(String text, String icon, ToastActionButtonAlignment alignment, C9598e action) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(alignment, "alignment");
        return new ToastActionButton(text, icon, alignment, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToastActionButton)) {
            return false;
        }
        ToastActionButton toastActionButton = (ToastActionButton) other;
        return AbstractC22676k.m65745e(this.text, toastActionButton.text) && AbstractC22676k.m65745e(this.icon, toastActionButton.icon) && this.alignment == toastActionButton.alignment && AbstractC22676k.m65745e(this.action, toastActionButton.action);
    }

    public final C9598e getAction() {
        return this.action;
    }

    public final ToastActionButtonAlignment getAlignment() {
        return this.alignment;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.icon;
        int iHashCode2 = (this.alignment.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        C9598e c9598e = this.action;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.icon;
        ToastActionButtonAlignment toastActionButtonAlignment = this.alignment;
        C9598e c9598e = this.action;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ToastActionButton(text=", str, ", icon=", str2, ", alignment=");
        sbM32001t.append(toastActionButtonAlignment);
        sbM32001t.append(", action=");
        sbM32001t.append(c9598e);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ToastActionButton(String text, String str, ToastActionButtonAlignment alignment, C9598e c9598e) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(alignment, "alignment");
        this.text = text;
        this.icon = str;
        this.alignment = alignment;
        this.action = c9598e;
    }

    public /* synthetic */ ToastActionButton(String str, String str2, ToastActionButtonAlignment toastActionButtonAlignment, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? ToastActionButtonAlignment.LEADING : toastActionButtonAlignment, (i13 & 8) != 0 ? null : c9598e);
    }
}
