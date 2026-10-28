package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006("}, m65681d2 = {"Lcom/amplitude/android/engagement/types/Required;", "", "", "value", "", "message", "<init>", "(ZLjava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/Required;Lzc3/c;Lyc3/g;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/amplitude/android/engagement/types/Required;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getValue", "Ljava/lang/String;", "getMessage", "Companion", "$serializer", "com/amplitude/android/engagement/types/c1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Required {
    public static final int $stable = 0;
    public static final C4874c1 Companion = new C4874c1();
    private final String message;
    private final boolean value;

    @InterfaceC23457c
    public /* synthetic */ Required(int i13, boolean z4, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, Required$$serializer.INSTANCE.getDescriptor());
        }
        this.value = z4;
        if ((i13 & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    public static /* synthetic */ Required copy$default(Required required, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = required.value;
        }
        if ((i13 & 2) != 0) {
            str = required.message;
        }
        return required.copy(z4, str);
    }

    public static final /* synthetic */ void write$Self(Required self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.value);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.message == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final Required copy(boolean value, String message) {
        return new Required(value, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Required)) {
            return false;
        }
        Required required = (Required) other;
        return this.value == required.value && AbstractC22676k.m65745e(this.message, required.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z4 = this.value;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int i13 = r10 * 31;
        String str = this.message;
        return i13 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("Required(value=");
        sb4.append(this.value);
        sb4.append(", message=");
        return AbstractC25012a.m73377j(sb4, this.message, ')');
    }

    public Required(boolean z4, String str) {
        this.value = z4;
        this.message = str;
    }

    public /* synthetic */ Required(boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? null : str);
    }
}
