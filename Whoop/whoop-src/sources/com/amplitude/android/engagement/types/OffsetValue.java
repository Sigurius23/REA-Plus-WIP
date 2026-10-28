package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0015¨\u0006&"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/OffsetValue;", "", "", "x", "y", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/OffsetValue;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/amplitude/android/engagement/types/OffsetValue;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getX", "getY", "Companion", "$serializer", "com/amplitude/android/engagement/types/w0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OffsetValue {
    public static final int $stable = 0;
    public static final C4944w0 Companion = new C4944w0();
    private final String x;
    private final String y;

    @InterfaceC23457c
    public /* synthetic */ OffsetValue(int i13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, OffsetValue$$serializer.INSTANCE.getDescriptor());
        }
        this.x = str;
        this.y = str2;
    }

    public static /* synthetic */ OffsetValue copy$default(OffsetValue offsetValue, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = offsetValue.x;
        }
        if ((i13 & 2) != 0) {
            str2 = offsetValue.y;
        }
        return offsetValue.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self(OffsetValue self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.x);
        output.encodeStringElement(serialDesc, 1, self.y);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getY() {
        return this.y;
    }

    public final OffsetValue copy(String x3, String y13) {
        AbstractC22676k.m65750j(x3, "x");
        AbstractC22676k.m65750j(y13, "y");
        return new OffsetValue(x3, y13);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OffsetValue)) {
            return false;
        }
        OffsetValue offsetValue = (OffsetValue) other;
        return AbstractC22676k.m65745e(this.x, offsetValue.x) && AbstractC22676k.m65745e(this.y, offsetValue.y);
    }

    public final String getX() {
        return this.x;
    }

    public final String getY() {
        return this.y;
    }

    public int hashCode() {
        return this.y.hashCode() + (this.x.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("OffsetValue(x=");
        sb4.append(this.x);
        sb4.append(", y=");
        return AbstractC25012a.m73377j(sb4, this.y, ')');
    }

    public OffsetValue(String x3, String y13) {
        AbstractC22676k.m65750j(x3, "x");
        AbstractC22676k.m65750j(y13, "y");
        this.x = x3;
        this.y = y13;
    }
}
