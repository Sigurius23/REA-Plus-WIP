package com.whoop.healthconnect.domain.models;

import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import java.time.ZoneOffset;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p322m7.C25179w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rj1.C31487a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lm7/w;", "Lrj1/a;", "healthConnectIntentActivityMatcher", "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;", "toModel", "(Lm7/w;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;", "health-connect_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HealthConnectExerciseSessionModelKt {
    public static final HealthConnectExerciseSessionModel toModel(C25179w c25179w, C31487a healthConnectIntentActivityMatcher) {
        AbstractC22676k.m65750j(c25179w, "<this>");
        AbstractC22676k.m65750j(healthConnectIntentActivityMatcher, "healthConnectIntentActivityMatcher");
        int i13 = c25179w.f98785e;
        String str = c25179w.f98787g;
        String str2 = c25179w.f98786f;
        long epochMilli = c25179w.f98781a.toEpochMilli();
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        String string = new DateTime(epochMilli, dateTimeZone).toString(StreamDateFormatter.DATE_FORMAT);
        AbstractC22676k.m65749i(string, "toString(...)");
        ZoneOffset zoneOffset = c25179w.f98782b;
        String id4 = zoneOffset != null ? zoneOffset.getId() : null;
        String string2 = new DateTime(c25179w.f98783c.toEpochMilli(), dateTimeZone).toString(StreamDateFormatter.DATE_FORMAT);
        AbstractC22676k.m65749i(string2, "toString(...)");
        ZoneOffset zoneOffset2 = c25179w.f98784d;
        return new HealthConnectExerciseSessionModel(i13, str, str2, string, id4, string2, zoneOffset2 != null ? zoneOffset2.getId() : null, HealthConnectMetadataModelKt.toModel(c25179w.f98788h, healthConnectIntentActivityMatcher), DateTimeZone.getDefault().getID());
    }
}
