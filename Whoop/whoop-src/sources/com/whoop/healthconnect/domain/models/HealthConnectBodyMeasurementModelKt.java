package com.whoop.healthconnect.domain.models;

import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import java.time.ZoneOffset;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p322m7.C25131b0;
import p322m7.C25142f;
import p322m7.C25147g1;
import p322m7.C25149h0;
import p322m7.C25154j0;
import p452r7.EnumC31001a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rj1.C31487a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\t\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u000b\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, m65681d2 = {"Lm7/b0;", "Lrj1/a;", "healthConnectIntentActivityMatcher", "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;", "toModel", "(Lm7/b0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;", "Lm7/g1;", "(Lm7/g1;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;", "Lm7/j0;", "(Lm7/j0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;", "Lm7/h0;", "(Lm7/h0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;", "Lm7/f;", "(Lm7/f;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;", "", "HEIGHT_RECORD_IN_METERS_TYPE", "Ljava/lang/String;", "WEIGHT_RECORD_IN_KILOGRAMS_TYPE", "MENSTRUATION_FLOW_RECORD_TYPE", "LEAN_BODY_MASS_RECORD_TYPE", "BODY_FAT_RECORD_TYPE", "health-connect_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HealthConnectBodyMeasurementModelKt {
    private static final String BODY_FAT_RECORD_TYPE = "BodyFatRecord";
    private static final String HEIGHT_RECORD_IN_METERS_TYPE = "HeightMetersRecord";
    private static final String LEAN_BODY_MASS_RECORD_TYPE = "LeanBodyMassRecord";
    private static final String MENSTRUATION_FLOW_RECORD_TYPE = "MenstrualFlowRecord";
    private static final String WEIGHT_RECORD_IN_KILOGRAMS_TYPE = "WeightKilogramsRecord";

    public static final HealthConnectBodyMeasurementModel toModel(C25131b0 c25131b0, C31487a healthConnectIntentActivityMatcher) {
        AbstractC22676k.m65750j(c25131b0, "<this>");
        AbstractC22676k.m65750j(healthConnectIntentActivityMatcher, "healthConnectIntentActivityMatcher");
        double dM95562a = c25131b0.f98515c.m95562a();
        String string = new DateTime(c25131b0.f98513a.toEpochMilli(), DateTimeZone.UTC).toString(StreamDateFormatter.DATE_FORMAT);
        AbstractC22676k.m65749i(string, "toString(...)");
        ZoneOffset zoneOffset = c25131b0.f98514b;
        String id4 = zoneOffset != null ? zoneOffset.getId() : null;
        HealthConnectMetadataModel model = HealthConnectMetadataModelKt.toModel(c25131b0.f98516d, healthConnectIntentActivityMatcher);
        String id5 = DateTimeZone.getDefault().getID();
        AbstractC22676k.m65749i(id5, "getID(...)");
        return new HealthConnectBodyMeasurementModel(HEIGHT_RECORD_IN_METERS_TYPE, dM95562a, string, id4, model, id5);
    }

    public static final HealthConnectBodyMeasurementModel toModel(C25147g1 c25147g1, C31487a healthConnectIntentActivityMatcher) {
        AbstractC22676k.m65750j(c25147g1, "<this>");
        AbstractC22676k.m65750j(healthConnectIntentActivityMatcher, "healthConnectIntentActivityMatcher");
        double dM95539a = c25147g1.f98598c.m95539a(EnumC31001a0.f127983x);
        String string = new DateTime(c25147g1.f98596a.toEpochMilli(), DateTimeZone.UTC).toString(StreamDateFormatter.DATE_FORMAT);
        AbstractC22676k.m65749i(string, "toString(...)");
        ZoneOffset zoneOffset = c25147g1.f98597b;
        String id4 = zoneOffset != null ? zoneOffset.getId() : null;
        HealthConnectMetadataModel model = HealthConnectMetadataModelKt.toModel(c25147g1.f98599d, healthConnectIntentActivityMatcher);
        String id5 = DateTimeZone.getDefault().getID();
        AbstractC22676k.m65749i(id5, "getID(...)");
        return new HealthConnectBodyMeasurementModel(WEIGHT_RECORD_IN_KILOGRAMS_TYPE, dM95539a, string, id4, model, id5);
    }

    public static final HealthConnectBodyMeasurementModel toModel(C25154j0 c25154j0, C31487a healthConnectIntentActivityMatcher) {
        AbstractC22676k.m65750j(c25154j0, "<this>");
        AbstractC22676k.m65750j(healthConnectIntentActivityMatcher, "healthConnectIntentActivityMatcher");
        double d3 = c25154j0.f98632c;
        String string = new DateTime(c25154j0.f98630a.toEpochMilli(), DateTimeZone.UTC).toString(StreamDateFormatter.DATE_FORMAT);
        AbstractC22676k.m65749i(string, "toString(...)");
        ZoneOffset zoneOffset = c25154j0.f98631b;
        String id4 = zoneOffset != null ? zoneOffset.getId() : null;
        HealthConnectMetadataModel model = HealthConnectMetadataModelKt.toModel(c25154j0.f98633d, healthConnectIntentActivityMatcher);
        String id5 = DateTimeZone.getDefault().getID();
        AbstractC22676k.m65749i(id5, "getID(...)");
        return new HealthConnectBodyMeasurementModel(MENSTRUATION_FLOW_RECORD_TYPE, d3, string, id4, model, id5);
    }

    public static final HealthConnectBodyMeasurementModel toModel(C25149h0 c25149h0, C31487a healthConnectIntentActivityMatcher) {
        AbstractC22676k.m65750j(c25149h0, "<this>");
        AbstractC22676k.m65750j(healthConnectIntentActivityMatcher, "healthConnectIntentActivityMatcher");
        double dM95539a = c25149h0.f98608c.m95539a(EnumC31001a0.f127983x);
        String string = new DateTime(c25149h0.f98606a.toEpochMilli(), DateTimeZone.UTC).toString(StreamDateFormatter.DATE_FORMAT);
        AbstractC22676k.m65749i(string, "toString(...)");
        ZoneOffset zoneOffset = c25149h0.f98607b;
        String id4 = zoneOffset != null ? zoneOffset.getId() : null;
        HealthConnectMetadataModel model = HealthConnectMetadataModelKt.toModel(c25149h0.f98609d, healthConnectIntentActivityMatcher);
        String id5 = DateTimeZone.getDefault().getID();
        AbstractC22676k.m65749i(id5, "getID(...)");
        return new HealthConnectBodyMeasurementModel(LEAN_BODY_MASS_RECORD_TYPE, dM95539a, string, id4, model, id5);
    }

    public static final HealthConnectBodyMeasurementModel toModel(C25142f c25142f, C31487a healthConnectIntentActivityMatcher) {
        AbstractC22676k.m65750j(c25142f, "<this>");
        AbstractC22676k.m65750j(healthConnectIntentActivityMatcher, "healthConnectIntentActivityMatcher");
        double d3 = c25142f.f98581c.f127992w;
        String string = new DateTime(c25142f.f98579a.toEpochMilli(), DateTimeZone.UTC).toString(StreamDateFormatter.DATE_FORMAT);
        AbstractC22676k.m65749i(string, "toString(...)");
        ZoneOffset zoneOffset = c25142f.f98580b;
        String id4 = zoneOffset != null ? zoneOffset.getId() : null;
        HealthConnectMetadataModel model = HealthConnectMetadataModelKt.toModel(c25142f.f98582d, healthConnectIntentActivityMatcher);
        String id5 = DateTimeZone.getDefault().getID();
        AbstractC22676k.m65749i(id5, "getID(...)");
        return new HealthConnectBodyMeasurementModel(BODY_FAT_RECORD_TYPE, d3, string, id4, model, id5);
    }
}
