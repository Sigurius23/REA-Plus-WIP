package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001c¨\u00060"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/LinkAction;", "Lcom/amplitude/android/engagement/types/Action;", "", "value", "Lcom/amplitude/android/engagement/types/LinkOperation;", "operation", "Lcom/amplitude/android/engagement/types/LinkActionMeta;", "meta", "<init>", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/LinkOperation;Lcom/amplitude/android/engagement/types/LinkActionMeta;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/amplitude/android/engagement/types/LinkOperation;Lcom/amplitude/android/engagement/types/LinkActionMeta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/LinkAction;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/amplitude/android/engagement/types/LinkOperation;", "component3", "()Lcom/amplitude/android/engagement/types/LinkActionMeta;", "copy", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/LinkOperation;Lcom/amplitude/android/engagement/types/LinkActionMeta;)Lcom/amplitude/android/engagement/types/LinkAction;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "Lcom/amplitude/android/engagement/types/LinkOperation;", "getOperation", "Lcom/amplitude/android/engagement/types/LinkActionMeta;", "getMeta", "Companion", "$serializer", "com/amplitude/android/engagement/types/i0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("link")
@InterfaceC37144i
public final /* data */ class LinkAction extends Action {
    public static final int $stable = 0;
    private final LinkActionMeta meta;
    private final LinkOperation operation;
    private final String value;
    public static final C4897i0 Companion = new C4897i0();
    private static final InterfaceC37138c[] $childSerializers = {null, LinkOperation.Companion.serializer(), null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public /* synthetic */ LinkAction(int i13, String str, LinkOperation linkOperation, LinkActionMeta linkActionMeta, SerializationConstructorMarker serializationConstructorMarker) {
        super(i13, serializationConstructorMarker);
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, LinkAction$$serializer.INSTANCE.getDescriptor());
        }
        this.value = str;
        if ((i13 & 2) == 0) {
            this.operation = null;
        } else {
            this.operation = linkOperation;
        }
        if ((i13 & 4) == 0) {
            this.meta = null;
        } else {
            this.meta = linkActionMeta;
        }
    }

    public static /* synthetic */ LinkAction copy$default(LinkAction linkAction, String str, LinkOperation linkOperation, LinkActionMeta linkActionMeta, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = linkAction.value;
        }
        if ((i13 & 2) != 0) {
            linkOperation = linkAction.operation;
        }
        if ((i13 & 4) != 0) {
            linkActionMeta = linkAction.meta;
        }
        return linkAction.copy(str, linkOperation, linkActionMeta);
    }

    public static final /* synthetic */ void write$Self(LinkAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        Action.write$Self(self, output, serialDesc);
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.value);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.operation != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.operation);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.meta == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, LinkActionMeta$$serializer.INSTANCE, self.meta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LinkOperation getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LinkActionMeta getMeta() {
        return this.meta;
    }

    public final LinkAction copy(String value, LinkOperation operation, LinkActionMeta meta) {
        AbstractC22676k.m65750j(value, "value");
        return new LinkAction(value, operation, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAction)) {
            return false;
        }
        LinkAction linkAction = (LinkAction) other;
        return AbstractC22676k.m65745e(this.value, linkAction.value) && this.operation == linkAction.operation && AbstractC22676k.m65745e(this.meta, linkAction.meta);
    }

    public final LinkActionMeta getMeta() {
        return this.meta;
    }

    public final LinkOperation getOperation() {
        return this.operation;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        LinkOperation linkOperation = this.operation;
        int iHashCode2 = (iHashCode + (linkOperation == null ? 0 : linkOperation.hashCode())) * 31;
        LinkActionMeta linkActionMeta = this.meta;
        return iHashCode2 + (linkActionMeta != null ? linkActionMeta.hashCode() : 0);
    }

    public String toString() {
        return "LinkAction(value=" + this.value + ", operation=" + this.operation + ", meta=" + this.meta + ')';
    }

    public /* synthetic */ LinkAction(String str, LinkOperation linkOperation, LinkActionMeta linkActionMeta, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : linkOperation, (i13 & 4) != 0 ? null : linkActionMeta);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAction(String value, LinkOperation linkOperation, LinkActionMeta linkActionMeta) {
        super(null);
        AbstractC22676k.m65750j(value, "value");
        this.value = value;
        this.operation = linkOperation;
        this.meta = linkActionMeta;
    }
}
