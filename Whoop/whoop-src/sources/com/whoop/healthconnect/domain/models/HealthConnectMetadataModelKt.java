package com.whoop.healthconnect.domain.models;

import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p336n7.C26411a;
import p336n7.C26412b;
import p336n7.C26413c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rj1.C31487a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0004\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b\u001a\u0019\u0010\u0004\u001a\u00020\n*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ln7/c;", "Lrj1/a;", "healthConnectIntentActivityMatcher", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "toModel", "(Ln7/c;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "Ln7/b;", "Lcom/whoop/healthconnect/domain/models/DeviceModel;", "(Ln7/b;)Lcom/whoop/healthconnect/domain/models/DeviceModel;", "Ln7/a;", "Lcom/whoop/healthconnect/domain/models/DataOriginModel;", "(Ln7/a;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/DataOriginModel;", "health-connect_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HealthConnectMetadataModelKt {
    public static final HealthConnectMetadataModel toModel(C26413c c26413c, C31487a healthConnectIntentActivityMatcher) {
        AbstractC22676k.m65750j(c26413c, "<this>");
        AbstractC22676k.m65750j(healthConnectIntentActivityMatcher, "healthConnectIntentActivityMatcher");
        String str = c26413c.f104891a;
        String str2 = c26413c.f104894d;
        long j7 = c26413c.f104895e;
        C26412b c26412b = c26413c.f104896f;
        return new HealthConnectMetadataModel(str, str2, j7, c26412b != null ? toModel(c26412b) : null, toModel(c26413c.f104892b, healthConnectIntentActivityMatcher), new DateTime(c26413c.f104893c.toEpochMilli(), DateTimeZone.UTC).toString(StreamDateFormatter.DATE_FORMAT));
    }

    public static final DeviceModel toModel(C26412b c26412b) {
        AbstractC22676k.m65750j(c26412b, "<this>");
        return new DeviceModel(c26412b.f104887a, c26412b.f104888b, c26412b.f104889c);
    }

    public static final DataOriginModel toModel(C26411a c26411a, C31487a healthConnectIntentActivityMatcher) {
        AbstractC22676k.m65750j(c26411a, "<this>");
        AbstractC22676k.m65750j(healthConnectIntentActivityMatcher, "healthConnectIntentActivityMatcher");
        String str = c26411a.f104886a;
        return new DataOriginModel(str, healthConnectIntentActivityMatcher.m96982a(str));
    }
}
