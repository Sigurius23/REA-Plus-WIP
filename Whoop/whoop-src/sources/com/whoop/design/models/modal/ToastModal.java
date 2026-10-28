package com.whoop.design.models.modal;

import com.whoop.design.models.calendar.archmini.C7011a;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJZ\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010#J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b<\u0010\u001e¨\u0006?"}, m65681d2 = {"Lcom/whoop/design/models/modal/ToastModal;", "Lcom/whoop/design/models/modal/Modal;", "", "id", "message", "Lcom/whoop/design/models/modal/ToastStyleModel;", "style", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "includeDismiss", "Lcom/whoop/design/models/modal/ToastActionButton;", "actionButton", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/modal/ToastModal;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/modal/ToastStyleModel;", "component4", "()I", "component5", "()Z", "component6", "()Lcom/whoop/design/models/modal/ToastActionButton;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/ToastStyleModel;IZLcom/whoop/design/models/modal/ToastActionButton;Ljava/lang/String;)Lcom/whoop/design/models/modal/ToastModal;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getMessage", "Lcom/whoop/design/models/modal/ToastStyleModel;", "getStyle", "I", "getDuration", "Z", "getIncludeDismiss", "Lcom/whoop/design/models/modal/ToastActionButton;", "getActionButton", "getIcon", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ToastModal implements Modal {
    private final ToastActionButton actionButton;
    private final int duration;
    private final String icon;
    private final String id;
    private final boolean includeDismiss;
    private final String message;
    private final ToastStyleModel style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C7011a(28)), null, null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/modal/ToastModal$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/modal/ToastModal;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ToastModal$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ToastModal(int i13, String str, String str2, ToastStyleModel toastStyleModel, int i14, boolean z4, ToastActionButton toastActionButton, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i13 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 11, ToastModal$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.message = str2;
        if ((i13 & 4) == 0) {
            this.style = ToastStyleModel.UNKNOWN;
        } else {
            this.style = toastStyleModel;
        }
        this.duration = i14;
        if ((i13 & 16) == 0) {
            this.includeDismiss = true;
        } else {
            this.includeDismiss = z4;
        }
        if ((i13 & 32) == 0) {
            this.actionButton = null;
        } else {
            this.actionButton = toastActionButton;
        }
        if ((i13 & 64) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ToastStyleModel.INSTANCE.serializer();
    }

    public static /* synthetic */ ToastModal copy$default(ToastModal toastModal, String str, String str2, ToastStyleModel toastStyleModel, int i13, boolean z4, ToastActionButton toastActionButton, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = toastModal.id;
        }
        if ((i14 & 2) != 0) {
            str2 = toastModal.message;
        }
        if ((i14 & 4) != 0) {
            toastStyleModel = toastModal.style;
        }
        if ((i14 & 8) != 0) {
            i13 = toastModal.duration;
        }
        if ((i14 & 16) != 0) {
            z4 = toastModal.includeDismiss;
        }
        if ((i14 & 32) != 0) {
            toastActionButton = toastModal.actionButton;
        }
        if ((i14 & 64) != 0) {
            str3 = toastModal.icon;
        }
        ToastActionButton toastActionButton2 = toastActionButton;
        String str4 = str3;
        boolean z13 = z4;
        ToastStyleModel toastStyleModel2 = toastStyleModel;
        return toastModal.copy(str, str2, toastStyleModel2, i13, z13, toastActionButton2, str4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ToastModal self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.message);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.style != ToastStyleModel.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
        }
        output.encodeIntElement(serialDesc, 3, self.duration);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !self.includeDismiss) {
            output.encodeBooleanElement(serialDesc, 4, self.includeDismiss);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.actionButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ToastActionButton$$serializer.INSTANCE, self.actionButton);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.icon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.icon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ToastStyleModel getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIncludeDismiss() {
        return this.includeDismiss;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ToastActionButton getActionButton() {
        return this.actionButton;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final ToastModal copy(String id4, String message, ToastStyleModel style, int duration, boolean includeDismiss, ToastActionButton actionButton, String icon) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(style, "style");
        return new ToastModal(id4, message, style, duration, includeDismiss, actionButton, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToastModal)) {
            return false;
        }
        ToastModal toastModal = (ToastModal) other;
        return AbstractC22676k.m65745e(this.id, toastModal.id) && AbstractC22676k.m65745e(this.message, toastModal.message) && this.style == toastModal.style && this.duration == toastModal.duration && this.includeDismiss == toastModal.includeDismiss && AbstractC22676k.m65745e(this.actionButton, toastModal.actionButton) && AbstractC22676k.m65745e(this.icon, toastModal.icon);
    }

    public final ToastActionButton getActionButton() {
        return this.actionButton;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getIncludeDismiss() {
        return this.includeDismiss;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ToastStyleModel getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.duration, (this.style.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.message)) * 31, 31), 31, this.includeDismiss);
        ToastActionButton toastActionButton = this.actionButton;
        int iHashCode = (iM8289b + (toastActionButton == null ? 0 : toastActionButton.hashCode())) * 31;
        String str = this.icon;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.message;
        ToastStyleModel toastStyleModel = this.style;
        int i13 = this.duration;
        boolean z4 = this.includeDismiss;
        ToastActionButton toastActionButton = this.actionButton;
        String str3 = this.icon;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ToastModal(id=", str, ", message=", str2, ", style=");
        sbM32001t.append(toastStyleModel);
        sbM32001t.append(", duration=");
        sbM32001t.append(i13);
        sbM32001t.append(", includeDismiss=");
        sbM32001t.append(z4);
        sbM32001t.append(", actionButton=");
        sbM32001t.append(toastActionButton);
        sbM32001t.append(", icon=");
        return AbstractC25012a.m73376i(str3, ")", sbM32001t);
    }

    public ToastModal(String id4, String message, ToastStyleModel style, int i13, boolean z4, ToastActionButton toastActionButton, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.message = message;
        this.style = style;
        this.duration = i13;
        this.includeDismiss = z4;
        this.actionButton = toastActionButton;
        this.icon = str;
    }

    public /* synthetic */ ToastModal(String str, String str2, ToastStyleModel toastStyleModel, int i13, boolean z4, ToastActionButton toastActionButton, String str3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i14 & 4) != 0 ? ToastStyleModel.UNKNOWN : toastStyleModel, i13, (i14 & 16) != 0 ? true : z4, (i14 & 32) != 0 ? null : toastActionButton, (i14 & 64) != 0 ? null : str3);
    }
}
