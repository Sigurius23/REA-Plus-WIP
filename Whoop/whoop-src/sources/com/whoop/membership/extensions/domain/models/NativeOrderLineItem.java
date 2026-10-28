package com.whoop.membership.extensions.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001bR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001bR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u001b¨\u00064"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;", "", "Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;", "icon", "", "title", "subtitle", "amount", "<init>", "(Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;", "getIcon", "getIcon$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "getAmount", "getAmount$annotations", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NativeOrderLineItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("amount")
    private final String amount;

    @SerializedName("icon")
    private final NativeOrderIcon icon;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NativeOrderLineItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NativeOrderLineItem(int i13, NativeOrderIcon nativeOrderIcon, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, NativeOrderLineItem$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = nativeOrderIcon;
        this.title = str;
        this.subtitle = str2;
        this.amount = str3;
    }

    public static /* synthetic */ NativeOrderLineItem copy$default(NativeOrderLineItem nativeOrderLineItem, NativeOrderIcon nativeOrderIcon, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            nativeOrderIcon = nativeOrderLineItem.icon;
        }
        if ((i13 & 2) != 0) {
            str = nativeOrderLineItem.title;
        }
        if ((i13 & 4) != 0) {
            str2 = nativeOrderLineItem.subtitle;
        }
        if ((i13 & 8) != 0) {
            str3 = nativeOrderLineItem.amount;
        }
        return nativeOrderLineItem.copy(nativeOrderIcon, str, str2, str3);
    }

    @InterfaceC37143h("amount")
    public static /* synthetic */ void getAmount$annotations() {
    }

    @InterfaceC37143h("icon")
    public static /* synthetic */ void getIcon$annotations() {
    }

    @InterfaceC37143h("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$membership_release(NativeOrderLineItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, NativeOrderIcon$$serializer.INSTANCE, self.icon);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeStringElement(serialDesc, 3, self.amount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NativeOrderIcon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    public final NativeOrderLineItem copy(NativeOrderIcon icon, String title, String subtitle, String amount) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(amount, "amount");
        return new NativeOrderLineItem(icon, title, subtitle, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeOrderLineItem)) {
            return false;
        }
        NativeOrderLineItem nativeOrderLineItem = (NativeOrderLineItem) other;
        return AbstractC22676k.m65745e(this.icon, nativeOrderLineItem.icon) && AbstractC22676k.m65745e(this.title, nativeOrderLineItem.title) && AbstractC22676k.m65745e(this.subtitle, nativeOrderLineItem.subtitle) && AbstractC22676k.m65745e(this.amount, nativeOrderLineItem.amount);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final NativeOrderIcon getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.amount.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle);
    }

    public String toString() {
        NativeOrderIcon nativeOrderIcon = this.icon;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.amount;
        StringBuilder sb4 = new StringBuilder("NativeOrderLineItem(icon=");
        sb4.append(nativeOrderIcon);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", subtitle=");
        return AbstractC11266d.m30464r(sb4, str2, ", amount=", str3, ")");
    }

    public NativeOrderLineItem(NativeOrderIcon icon, String title, String subtitle, String amount) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(amount, "amount");
        this.icon = icon;
        this.title = title;
        this.subtitle = subtitle;
        this.amount = amount;
    }
}
