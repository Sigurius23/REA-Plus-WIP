package com.amplitude.android.engagement.types;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002!\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014¨\u0006#"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/EventData;", "", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/EventData;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/amplitude/android/engagement/types/EventData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEvent", "Companion", "$serializer", "com/amplitude/android/engagement/types/v", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EventData {
    public static final int $stable = 0;
    public static final C4940v Companion = new C4940v();
    private final String event;

    @InterfaceC23457c
    public /* synthetic */ EventData(int i13, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, EventData$$serializer.INSTANCE.getDescriptor());
        }
        this.event = str;
    }

    public static /* synthetic */ EventData copy$default(EventData eventData, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = eventData.event;
        }
        return eventData.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    public final EventData copy(String event) {
        AbstractC22676k.m65750j(event, "event");
        return new EventData(event);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EventData) && AbstractC22676k.m65745e(this.event, ((EventData) other).event);
    }

    public final String getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.event.hashCode();
    }

    public String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("EventData(event="), this.event, ')');
    }

    public EventData(String event) {
        AbstractC22676k.m65750j(event, "event");
        this.event = event;
    }
}
