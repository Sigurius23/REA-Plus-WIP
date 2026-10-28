package com.whoop.smart.alarm.data.network.model;

import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import or2.AbstractC28184n0;
import or2.C28204u;
import org.joda.time.DateTime;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, m65681d2 = {"Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound;", "", "", "time", MapboxMap.QFE_OFFSET, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$smart_alarm_release", "(Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTime", "getOffset", "Companion", "a", "$serializer", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpperTimeBound {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String offset;
    private final String time;

    /* JADX INFO: renamed from: com.whoop.smart.alarm.data.network.model.UpperTimeBound$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound$a;", "", "<init>", "()V", "Lorg/joda/time/DateTime;", "time", "Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound;", "a", "(Lorg/joda/time/DateTime;)Lcom/whoop/smart/alarm/data/network/model/UpperTimeBound;", "Lwc3/c;", "serializer", "()Lwc3/c;", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UpperTimeBound m25961a(DateTime time) {
            AbstractC22676k.m65750j(time, "time");
            String string = time.toLocalTime().toString(C28204u.INSTANCE.m85368k());
            AbstractC22676k.m65749i(string, "toString(...)");
            String strM85305c = AbstractC28184n0.m85305c(time);
            AbstractC22676k.m65749i(strM85305c, "dateTimeZoneToUserOffset(...)");
            return new UpperTimeBound(string, strM85305c);
        }

        public final InterfaceC37138c serializer() {
            return UpperTimeBound$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UpperTimeBound(int i13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, UpperTimeBound$$serializer.INSTANCE.getDescriptor());
        }
        this.time = str;
        this.offset = str2;
    }

    public static /* synthetic */ UpperTimeBound copy$default(UpperTimeBound upperTimeBound, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = upperTimeBound.time;
        }
        if ((i13 & 2) != 0) {
            str2 = upperTimeBound.offset;
        }
        return upperTimeBound.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$smart_alarm_release(UpperTimeBound self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.time);
        output.encodeStringElement(serialDesc, 1, self.offset);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOffset() {
        return this.offset;
    }

    public final UpperTimeBound copy(String time, String offset) {
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(offset, "offset");
        return new UpperTimeBound(time, offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpperTimeBound)) {
            return false;
        }
        UpperTimeBound upperTimeBound = (UpperTimeBound) other;
        return AbstractC22676k.m65745e(this.time, upperTimeBound.time) && AbstractC22676k.m65745e(this.offset, upperTimeBound.offset);
    }

    public final String getOffset() {
        return this.offset;
    }

    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.offset.hashCode() + (this.time.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("UpperTimeBound(time=", this.time, ", offset=", this.offset, ")");
    }

    public UpperTimeBound(String time, String offset) {
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(offset, "offset");
        this.time = time;
        this.offset = offset;
    }
}
