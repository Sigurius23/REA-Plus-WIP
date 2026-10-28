package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006%"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/PinPointer;", "", "Lcom/amplitude/android/engagement/types/PinPointerType;", "type", "<init>", "(Lcom/amplitude/android/engagement/types/PinPointerType;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/PinPointerType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/PinPointer;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/PinPointerType;", "copy", "(Lcom/amplitude/android/engagement/types/PinPointerType;)Lcom/amplitude/android/engagement/types/PinPointer;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/PinPointerType;", "getType", "Companion", "$serializer", "com/amplitude/android/engagement/types/a1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PinPointer {
    public static final int $stable = 0;
    private final PinPointerType type;
    public static final C4866a1 Companion = new C4866a1();
    private static final InterfaceC37138c[] $childSerializers = {PinPointerType.Companion.serializer()};

    @InterfaceC23457c
    public /* synthetic */ PinPointer(int i13, PinPointerType pinPointerType, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, PinPointer$$serializer.INSTANCE.getDescriptor());
        }
        this.type = pinPointerType;
    }

    public static /* synthetic */ PinPointer copy$default(PinPointer pinPointer, PinPointerType pinPointerType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            pinPointerType = pinPointer.type;
        }
        return pinPointer.copy(pinPointerType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PinPointerType getType() {
        return this.type;
    }

    public final PinPointer copy(PinPointerType type) {
        AbstractC22676k.m65750j(type, "type");
        return new PinPointer(type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PinPointer) && this.type == ((PinPointer) other).type;
    }

    public final PinPointerType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public String toString() {
        return "PinPointer(type=" + this.type + ')';
    }

    public PinPointer(PinPointerType type) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
    }
}
