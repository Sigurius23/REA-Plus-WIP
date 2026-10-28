package p027b3;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.graphics.ColorSpace;
import android.graphics.RectF;
import android.health.connect.HealthConnectException;
import android.health.connect.InsertRecordsResponse;
import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.Device;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseLap;
import android.health.connect.datatypes.ExerciseRoute;
import android.health.connect.datatypes.ExerciseSegment;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.Record;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.health.connect.datatypes.units.BloodGlucose;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.Velocity;
import android.health.connect.datatypes.units.Volume;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.util.Log;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import android.window.BackEvent;
import ck1.C4780c;
import com.whoop.android.R;
import com.whoop.profile.view.edit.C9790n;
import j93.AbstractC21478l0;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kk1.C22541b;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import o73.C27648a;
import p026b2.C2298d;
import p078d1.C11454g;
import p078d1.C11455h;
import p097ds.AbstractC12314q;
import p133f1.C13977s1;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p213i7.AbstractC18188a;
import p213i7.AbstractC18195h;
import p240j2.AbstractC21222c;
import p240j2.C21223d;
import p294l3.C23254g;
import p294l3.C23273p0;
import p294l3.C23275q0;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p294l3.C23286w;
import p318m3.C24983m;
import p322m7.C25127a;
import p322m7.C25128a0;
import p322m7.C25129a1;
import p322m7.C25130b;
import p322m7.C25131b0;
import p322m7.C25132b1;
import p322m7.C25133c;
import p322m7.C25135c1;
import p322m7.C25136d;
import p322m7.C25137d0;
import p322m7.C25138d1;
import p322m7.C25139e;
import p322m7.C25141e1;
import p322m7.C25142f;
import p322m7.C25143f0;
import p322m7.C25144f1;
import p322m7.C25147g1;
import p322m7.C25148h;
import p322m7.C25149h0;
import p322m7.C25150h1;
import p322m7.C25151i;
import p322m7.C25153j;
import p322m7.C25154j0;
import p322m7.C25155k;
import p322m7.C25156k0;
import p322m7.C25157l;
import p322m7.C25159m;
import p322m7.C25160m0;
import p322m7.C25161n;
import p322m7.C25162n0;
import p322m7.C25163o;
import p322m7.C25164o0;
import p322m7.C25165p;
import p322m7.C25166p0;
import p322m7.C25167q;
import p322m7.C25168q0;
import p322m7.C25169r;
import p322m7.C25171s;
import p322m7.C25172s0;
import p322m7.C25173t;
import p322m7.C25174t0;
import p322m7.C25175u;
import p322m7.C25177v;
import p322m7.C25178v0;
import p322m7.C25179w;
import p322m7.C25180w0;
import p322m7.C25181x;
import p322m7.C25182x0;
import p322m7.C25183y;
import p322m7.C25185z;
import p322m7.C25186z0;
import p322m7.InterfaceC25170r0;
import p332n3.C26206a;
import p336n7.C26411a;
import p336n7.C26412b;
import p336n7.C26413c;
import p396p7.C28951b;
import p412q3.C29860a;
import p412q3.C29870f;
import p412q3.C29890x;
import p412q3.InterfaceC29874h;
import p452r7.C31003b0;
import p452r7.C31005c0;
import p452r7.C31006d;
import p452r7.C31007d0;
import p452r7.C31008e;
import p452r7.C31015h0;
import p452r7.C31019j0;
import p452r7.C31020k;
import p452r7.C31021k0;
import p452r7.C31022l;
import p452r7.C31023l0;
import p452r7.C31033q0;
import p452r7.C31035r0;
import p452r7.C31036s;
import p452r7.C31038t;
import p452r7.C31045w0;
import p452r7.EnumC31018j;
import p452r7.EnumC31043v0;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p510u0.EnumC34318g0;
import p619xl.C38445a;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import wb3.AbstractC37056f;
import yb3.C39412p;

/* JADX INFO: renamed from: b3.g1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2378g1 {
    /* JADX INFO: renamed from: A */
    public static final Length m7313A(C31036s c31036s) {
        AbstractC22676k.m65750j(c31036s, "<this>");
        Length lengthFromMeters = Length.fromMeters(c31036s.m95562a());
        AbstractC22676k.m65749i(lengthFromMeters, "fromMeters(inMeters)");
        return lengthFromMeters;
    }

    /* JADX INFO: renamed from: B */
    public static final Mass m7314B(C31003b0 c31003b0) {
        AbstractC22676k.m65750j(c31003b0, "<this>");
        Mass massFromGrams = Mass.fromGrams(c31003b0.m95540b());
        AbstractC22676k.m65749i(massFromGrams, "fromGrams(inGrams)");
        return massFromGrams;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: C */
    public static final Metadata m7315C(C26413c c26413c) {
        AbstractC22676k.m65750j(c26413c, "<this>");
        Metadata.Builder builder = new Metadata.Builder();
        C26412b c26412b = c26413c.f104896f;
        if (c26412b != null) {
            Device.Builder builder2 = new Device.Builder();
            builder2.setType(c26412b.f104889c);
            String str = c26412b.f104887a;
            if (str != null) {
                builder2.setManufacturer(str);
            }
            String str2 = c26412b.f104888b;
            if (str2 != null) {
                builder2.setModel(str2);
            }
            Device deviceBuild = builder2.build();
            AbstractC22676k.m65749i(deviceBuild, "PlatformDeviceBuilder()\n…       }\n        .build()");
            builder.setDevice(deviceBuild);
        }
        builder.setLastModifiedTime(c26413c.f104893c);
        builder.setId(c26413c.f104891a);
        builder.setDataOrigin(m7350y(c26413c.f104892b));
        builder.setClientRecordId(c26413c.f104894d);
        builder.setClientRecordVersion(c26413c.f104895e);
        Integer num = (Integer) AbstractC18188a.f70548E.get(Integer.valueOf(c26413c.f104897g));
        builder.setRecordingMethod(num != null ? num.intValue() : 0);
        Metadata metadataBuild = builder.build();
        AbstractC22676k.m65749i(metadataBuild, "PlatformMetadataBuilder(…       }\n        .build()");
        return metadataBuild;
    }

    /* JADX INFO: renamed from: D */
    public static final Power m7316D(C31015h0 c31015h0) {
        Power powerFromWatts = Power.fromWatts(c31015h0.m95551a());
        AbstractC22676k.m65749i(powerFromWatts, "fromWatts(inWatts)");
        return powerFromWatts;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: E */
    public static final Class m7317E(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        Class cls = (Class) AbstractC18195h.f70577a.get(interfaceC21461d);
        if (cls != null) {
            return cls;
        }
        throw new IllegalArgumentException("Unsupported record type " + interfaceC21461d);
    }

    /* JADX INFO: renamed from: F */
    public static final Velocity m7318F(C31033q0 c31033q0) {
        Velocity velocityFromMetersPerSecond = Velocity.fromMetersPerSecond(c31033q0.m95561a());
        AbstractC22676k.m65749i(velocityFromMetersPerSecond, "fromMetersPerSecond(inMetersPerSecond)");
        return velocityFromMetersPerSecond;
    }

    /* JADX INFO: renamed from: G */
    public static final WheelchairPushesRecord m7319G(C25150h1 c25150h1) {
        WheelchairPushesRecord.Builder builder = new WheelchairPushesRecord.Builder(m7315C(c25150h1.f98615f), c25150h1.f98610a, c25150h1.f98612c, c25150h1.f98614e);
        ZoneOffset zoneOffset = c25150h1.f98611b;
        if (zoneOffset != null) {
            builder.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = c25150h1.f98613d;
        if (zoneOffset2 != null) {
            builder.setEndZoneOffset(zoneOffset2);
        }
        WheelchairPushesRecord wheelchairPushesRecordBuild = builder.build();
        AbstractC22676k.m65749i(wheelchairPushesRecordBuild, "PlatformWheelchairPushes…       }\n        .build()");
        return wheelchairPushesRecordBuild;
    }

    /* JADX INFO: renamed from: H */
    public static final C31020k m7320H(Energy energy) {
        C31008e c31008e = C31020k.f128009y;
        return new C31020k(energy.getInCalories(), EnumC31018j.f128003w);
    }

    /* JADX INFO: renamed from: I */
    public static final C25169r m7321I(ExerciseRoute exerciseRoute) {
        C31036s c31036sM95556a;
        C31036s c31036sM95556a2;
        List<ExerciseRoute.Location> routeLocations = exerciseRoute.getRouteLocations();
        AbstractC22676k.m65749i(routeLocations, "routeLocations");
        List<ExerciseRoute.Location> list = routeLocations;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (ExerciseRoute.Location location : list) {
            Instant time = location.getTime();
            AbstractC22676k.m65749i(time, "value.time");
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            Length horizontalAccuracy = location.getHorizontalAccuracy();
            C31036s c31036sM95556a3 = null;
            if (horizontalAccuracy != null) {
                C31022l c31022l = C31036s.f128022y;
                c31036sM95556a = C31022l.m95556a(horizontalAccuracy.getInMeters());
            } else {
                c31036sM95556a = null;
            }
            Length verticalAccuracy = location.getVerticalAccuracy();
            if (verticalAccuracy != null) {
                C31022l c31022l2 = C31036s.f128022y;
                c31036sM95556a2 = C31022l.m95556a(verticalAccuracy.getInMeters());
            } else {
                c31036sM95556a2 = null;
            }
            Length altitude = location.getAltitude();
            if (altitude != null) {
                C31022l c31022l3 = C31036s.f128022y;
                c31036sM95556a3 = C31022l.m95556a(altitude.getInMeters());
            }
            arrayList.add(new C25167q(time, latitude, longitude, c31036sM95556a, c31036sM95556a2, c31036sM95556a3));
        }
        return new C25169r(arrayList);
    }

    /* JADX INFO: renamed from: J */
    public static final C26413c m7322J(Metadata metadata) {
        String id4 = metadata.getId();
        DataOrigin dataOrigin = metadata.getDataOrigin();
        AbstractC22676k.m65749i(dataOrigin, "dataOrigin");
        String packageName = dataOrigin.getPackageName();
        AbstractC22676k.m65749i(packageName, "packageName");
        C26411a c26411a = new C26411a(packageName);
        Instant lastModifiedTime = metadata.getLastModifiedTime();
        String clientRecordId = metadata.getClientRecordId();
        long clientRecordVersion = metadata.getClientRecordVersion();
        Integer num = (Integer) AbstractC18188a.f70549F.get(Integer.valueOf(metadata.getRecordingMethod()));
        int iIntValue = num != null ? num.intValue() : 0;
        Device device = metadata.getDevice();
        AbstractC22676k.m65749i(device, "device");
        C26412b c26412b = new C26412b(device.getManufacturer(), device.getModel(), device.getType());
        AbstractC22676k.m65749i(id4, "id");
        AbstractC22676k.m65749i(lastModifiedTime, "lastModifiedTime");
        return new C26413c(id4, c26411a, lastModifiedTime, clientRecordId, clientRecordVersion, c26412b, iIntValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public static final InterfaceC25170r0 m7323K(Record record) {
        int iIntValue;
        C31003b0 c31003b0M95566a;
        C31003b0 c31003b0M95566a2;
        C31003b0 c31003b0M95566a3;
        C31003b0 c31003b0M95566a4;
        C31003b0 c31003b0M95566a5;
        C31003b0 c31003b0M95566a6;
        C31003b0 c31003b0M95566a7;
        C31003b0 c31003b0M95566a8;
        C31003b0 c31003b0M95566a9;
        C31003b0 c31003b0M95566a10;
        C31003b0 c31003b0M95566a11;
        C31003b0 c31003b0M95566a12;
        C31003b0 c31003b0M95566a13;
        C31003b0 c31003b0M95566a14;
        C31003b0 c31003b0M95566a15;
        C31003b0 c31003b0M95566a16;
        C31003b0 c31003b0M95566a17;
        C31003b0 c31003b0M95566a18;
        C31003b0 c31003b0M95566a19;
        C31003b0 c31003b0M95566a20;
        C31003b0 c31003b0M95566a21;
        C31003b0 c31003b0M95566a22;
        C31003b0 c31003b0M95566a23;
        C31003b0 c31003b0M95566a24;
        C31003b0 c31003b0M95566a25;
        C31003b0 c31003b0M95566a26;
        C31003b0 c31003b0M95566a27;
        C31003b0 c31003b0M95566a28;
        C31003b0 c31003b0M95566a29;
        C31003b0 c31003b0M95566a30;
        C31003b0 c31003b0M95566a31;
        C31003b0 c31003b0M95566a32;
        C31003b0 c31003b0M95566a33;
        C31003b0 c31003b0M95566a34;
        C31003b0 c31003b0M95566a35;
        C31003b0 c31003b0M95566a36;
        C31003b0 c31003b0M95566a37;
        C31003b0 c31003b0M95566a38;
        C31003b0 c31003b0M95566a39;
        C31036s c31036sM95556a;
        if (record instanceof ActiveCaloriesBurnedRecord) {
            ActiveCaloriesBurnedRecord activeCaloriesBurnedRecord = (ActiveCaloriesBurnedRecord) record;
            Instant startTime = activeCaloriesBurnedRecord.getStartTime();
            AbstractC22676k.m65749i(startTime, "startTime");
            ZoneOffset startZoneOffset = activeCaloriesBurnedRecord.getStartZoneOffset();
            Instant endTime = activeCaloriesBurnedRecord.getEndTime();
            AbstractC22676k.m65749i(endTime, "endTime");
            ZoneOffset endZoneOffset = activeCaloriesBurnedRecord.getEndZoneOffset();
            Energy energy = activeCaloriesBurnedRecord.getEnergy();
            AbstractC22676k.m65749i(energy, "energy");
            C31020k c31020kM7320H = m7320H(energy);
            Metadata metadata = activeCaloriesBurnedRecord.getMetadata();
            AbstractC22676k.m65749i(metadata, "metadata");
            return new C25127a(startTime, startZoneOffset, endTime, endZoneOffset, c31020kM7320H, m7322J(metadata));
        }
        if (record instanceof BasalBodyTemperatureRecord) {
            BasalBodyTemperatureRecord basalBodyTemperatureRecord = (BasalBodyTemperatureRecord) record;
            Instant time = basalBodyTemperatureRecord.getTime();
            AbstractC22676k.m65749i(time, "time");
            ZoneOffset zoneOffset = basalBodyTemperatureRecord.getZoneOffset();
            Temperature temperature = basalBodyTemperatureRecord.getTemperature();
            AbstractC22676k.m65749i(temperature, "temperature");
            C31021k0 c31021k0 = new C31021k0(temperature.getInCelsius());
            int measurementLocation = basalBodyTemperatureRecord.getMeasurementLocation();
            Metadata metadata2 = basalBodyTemperatureRecord.getMetadata();
            AbstractC22676k.m65749i(metadata2, "metadata");
            return new C25130b(time, zoneOffset, c31021k0, measurementLocation, m7322J(metadata2));
        }
        if (record instanceof BasalMetabolicRateRecord) {
            BasalMetabolicRateRecord basalMetabolicRateRecord = (BasalMetabolicRateRecord) record;
            Instant time2 = basalMetabolicRateRecord.getTime();
            AbstractC22676k.m65749i(time2, "time");
            ZoneOffset zoneOffset2 = basalMetabolicRateRecord.getZoneOffset();
            Power basalMetabolicRate = basalMetabolicRateRecord.getBasalMetabolicRate();
            AbstractC22676k.m65749i(basalMetabolicRate, "basalMetabolicRate");
            C31007d0 c31007d0 = C31015h0.f127999y;
            C31015h0 c31015h0M95545a = C31007d0.m95545a(basalMetabolicRate.getInWatts());
            Metadata metadata3 = basalMetabolicRateRecord.getMetadata();
            AbstractC22676k.m65749i(metadata3, "metadata");
            return new C25133c(time2, zoneOffset2, c31015h0M95545a, m7322J(metadata3));
        }
        if (record instanceof BloodGlucoseRecord) {
            BloodGlucoseRecord bloodGlucoseRecord = (BloodGlucoseRecord) record;
            Instant time3 = bloodGlucoseRecord.getTime();
            AbstractC22676k.m65749i(time3, "time");
            ZoneOffset zoneOffset3 = bloodGlucoseRecord.getZoneOffset();
            BloodGlucose level = bloodGlucoseRecord.getLevel();
            AbstractC22676k.m65749i(level, "level");
            LinkedHashMap linkedHashMap = C31006d.f127993y;
            C31006d c31006dM34312D = AbstractC12314q.m34312D(level.getInMillimolesPerLiter());
            Integer num = (Integer) AbstractC18188a.f70573x.get(Integer.valueOf(bloodGlucoseRecord.getSpecimenSource()));
            int iIntValue2 = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) AbstractC18188a.f70557h.get(Integer.valueOf(bloodGlucoseRecord.getMealType()));
            int iIntValue3 = num2 != null ? num2.intValue() : 0;
            Integer num3 = (Integer) AbstractC18188a.f70575z.get(Integer.valueOf(bloodGlucoseRecord.getRelationToMeal()));
            iIntValue = num3 != null ? num3.intValue() : 0;
            Metadata metadata4 = bloodGlucoseRecord.getMetadata();
            AbstractC22676k.m65749i(metadata4, "metadata");
            return new C25136d(time3, zoneOffset3, c31006dM34312D, iIntValue2, iIntValue3, iIntValue, m7322J(metadata4));
        }
        if (record instanceof BloodPressureRecord) {
            BloodPressureRecord bloodPressureRecord = (BloodPressureRecord) record;
            Instant time4 = bloodPressureRecord.getTime();
            AbstractC22676k.m65749i(time4, "time");
            ZoneOffset zoneOffset4 = bloodPressureRecord.getZoneOffset();
            Pressure systolic = bloodPressureRecord.getSystolic();
            AbstractC22676k.m65749i(systolic, "systolic");
            C31019j0 c31019j0 = new C31019j0(systolic.getInMillimetersOfMercury());
            Pressure diastolic = bloodPressureRecord.getDiastolic();
            AbstractC22676k.m65749i(diastolic, "diastolic");
            C31019j0 c31019j1 = new C31019j0(diastolic.getInMillimetersOfMercury());
            Integer num4 = (Integer) AbstractC18188a.f70553d.get(Integer.valueOf(bloodPressureRecord.getBodyPosition()));
            int iIntValue4 = num4 != null ? num4.intValue() : 0;
            Integer num5 = (Integer) AbstractC18188a.f70565p.get(Integer.valueOf(bloodPressureRecord.getMeasurementLocation()));
            iIntValue = num5 != null ? num5.intValue() : 0;
            Metadata metadata5 = bloodPressureRecord.getMetadata();
            AbstractC22676k.m65749i(metadata5, "metadata");
            return new C25139e(time4, zoneOffset4, c31019j0, c31019j1, iIntValue4, iIntValue, m7322J(metadata5));
        }
        if (record instanceof BodyFatRecord) {
            BodyFatRecord bodyFatRecord = (BodyFatRecord) record;
            Instant time5 = bodyFatRecord.getTime();
            AbstractC22676k.m65749i(time5, "time");
            ZoneOffset zoneOffset5 = bodyFatRecord.getZoneOffset();
            Percentage percentage = bodyFatRecord.getPercentage();
            AbstractC22676k.m65749i(percentage, "percentage");
            C31005c0 c31005c0 = new C31005c0(percentage.getValue());
            Metadata metadata6 = bodyFatRecord.getMetadata();
            AbstractC22676k.m65749i(metadata6, "metadata");
            return new C25142f(time5, zoneOffset5, c31005c0, m7322J(metadata6));
        }
        if (record instanceof BodyTemperatureRecord) {
            BodyTemperatureRecord bodyTemperatureRecord = (BodyTemperatureRecord) record;
            Instant time6 = bodyTemperatureRecord.getTime();
            AbstractC22676k.m65749i(time6, "time");
            ZoneOffset zoneOffset6 = bodyTemperatureRecord.getZoneOffset();
            Temperature temperature2 = bodyTemperatureRecord.getTemperature();
            AbstractC22676k.m65749i(temperature2, "temperature");
            C31021k0 c31021k1 = new C31021k0(temperature2.getInCelsius());
            Integer num6 = (Integer) AbstractC18188a.f70563n.get(Integer.valueOf(bodyTemperatureRecord.getMeasurementLocation()));
            iIntValue = num6 != null ? num6.intValue() : 0;
            Metadata metadata7 = bodyTemperatureRecord.getMetadata();
            AbstractC22676k.m65749i(metadata7, "metadata");
            return new C25148h(time6, zoneOffset6, c31021k1, iIntValue, m7322J(metadata7));
        }
        if (record instanceof BodyWaterMassRecord) {
            BodyWaterMassRecord bodyWaterMassRecord = (BodyWaterMassRecord) record;
            Instant time7 = bodyWaterMassRecord.getTime();
            AbstractC22676k.m65749i(time7, "time");
            ZoneOffset zoneOffset7 = bodyWaterMassRecord.getZoneOffset();
            Mass bodyWaterMass = bodyWaterMassRecord.getBodyWaterMass();
            AbstractC22676k.m65749i(bodyWaterMass, "bodyWaterMass");
            C31038t c31038t = C31003b0.f127986y;
            C31003b0 c31003b0M95566a40 = C31038t.m95566a(bodyWaterMass.getInGrams());
            Metadata metadata8 = bodyWaterMassRecord.getMetadata();
            AbstractC22676k.m65749i(metadata8, "metadata");
            return new C25151i(time7, zoneOffset7, c31003b0M95566a40, m7322J(metadata8));
        }
        if (record instanceof BoneMassRecord) {
            BoneMassRecord boneMassRecord = (BoneMassRecord) record;
            Instant time8 = boneMassRecord.getTime();
            AbstractC22676k.m65749i(time8, "time");
            ZoneOffset zoneOffset8 = boneMassRecord.getZoneOffset();
            Mass mass = boneMassRecord.getMass();
            AbstractC22676k.m65749i(mass, "mass");
            C31038t c31038t2 = C31003b0.f127986y;
            C31003b0 c31003b0M95566a41 = C31038t.m95566a(mass.getInGrams());
            Metadata metadata9 = boneMassRecord.getMetadata();
            AbstractC22676k.m65749i(metadata9, "metadata");
            return new C25153j(time8, zoneOffset8, c31003b0M95566a41, m7322J(metadata9));
        }
        if (record instanceof CervicalMucusRecord) {
            CervicalMucusRecord cervicalMucusRecord = (CervicalMucusRecord) record;
            Instant time9 = cervicalMucusRecord.getTime();
            AbstractC22676k.m65749i(time9, "time");
            ZoneOffset zoneOffset9 = cervicalMucusRecord.getZoneOffset();
            Integer num7 = (Integer) AbstractC18188a.f70551b.get(Integer.valueOf(cervicalMucusRecord.getAppearance()));
            int iIntValue5 = num7 != null ? num7.intValue() : 0;
            Integer num8 = (Integer) AbstractC18188a.f70569t.get(Integer.valueOf(cervicalMucusRecord.getSensation()));
            iIntValue = num8 != null ? num8.intValue() : 0;
            Metadata metadata10 = cervicalMucusRecord.getMetadata();
            AbstractC22676k.m65749i(metadata10, "metadata");
            return new C25155k(time9, zoneOffset9, iIntValue5, iIntValue, m7322J(metadata10));
        }
        int i13 = 10;
        if (record instanceof CyclingPedalingCadenceRecord) {
            CyclingPedalingCadenceRecord cyclingPedalingCadenceRecord = (CyclingPedalingCadenceRecord) record;
            Instant startTime2 = cyclingPedalingCadenceRecord.getStartTime();
            AbstractC22676k.m65749i(startTime2, "startTime");
            ZoneOffset startZoneOffset2 = cyclingPedalingCadenceRecord.getStartZoneOffset();
            Instant endTime2 = cyclingPedalingCadenceRecord.getEndTime();
            AbstractC22676k.m65749i(endTime2, "endTime");
            ZoneOffset endZoneOffset2 = cyclingPedalingCadenceRecord.getEndZoneOffset();
            List<CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample> samples = cyclingPedalingCadenceRecord.getSamples();
            AbstractC22676k.m65749i(samples, "samples");
            List<CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample> list = samples;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample it : list) {
                AbstractC22676k.m65749i(it, "it");
                Instant time10 = it.getTime();
                AbstractC22676k.m65749i(time10, "time");
                arrayList.add(new C25157l(it.getRevolutionsPerMinute(), time10));
            }
            List listM74152u1 = AbstractC25265s.m74152u1(arrayList, new C2298d(6));
            Metadata metadata11 = cyclingPedalingCadenceRecord.getMetadata();
            AbstractC22676k.m65749i(metadata11, "metadata");
            return new C25159m(startTime2, startZoneOffset2, endTime2, endZoneOffset2, listM74152u1, m7322J(metadata11));
        }
        if (record instanceof DistanceRecord) {
            DistanceRecord distanceRecord = (DistanceRecord) record;
            Instant startTime3 = distanceRecord.getStartTime();
            AbstractC22676k.m65749i(startTime3, "startTime");
            ZoneOffset startZoneOffset3 = distanceRecord.getStartZoneOffset();
            Instant endTime3 = distanceRecord.getEndTime();
            AbstractC22676k.m65749i(endTime3, "endTime");
            ZoneOffset endZoneOffset3 = distanceRecord.getEndZoneOffset();
            Length distance = distanceRecord.getDistance();
            AbstractC22676k.m65749i(distance, "distance");
            C31022l c31022l = C31036s.f128022y;
            C31036s c31036sM95556a2 = C31022l.m95556a(distance.getInMeters());
            Metadata metadata12 = distanceRecord.getMetadata();
            AbstractC22676k.m65749i(metadata12, "metadata");
            return new C25161n(startTime3, startZoneOffset3, endTime3, endZoneOffset3, c31036sM95556a2, m7322J(metadata12));
        }
        if (record instanceof ElevationGainedRecord) {
            ElevationGainedRecord elevationGainedRecord = (ElevationGainedRecord) record;
            Instant startTime4 = elevationGainedRecord.getStartTime();
            AbstractC22676k.m65749i(startTime4, "startTime");
            ZoneOffset startZoneOffset4 = elevationGainedRecord.getStartZoneOffset();
            Instant endTime4 = elevationGainedRecord.getEndTime();
            AbstractC22676k.m65749i(endTime4, "endTime");
            ZoneOffset endZoneOffset4 = elevationGainedRecord.getEndZoneOffset();
            Length elevation = elevationGainedRecord.getElevation();
            AbstractC22676k.m65749i(elevation, "elevation");
            C31022l c31022l2 = C31036s.f128022y;
            C31036s c31036sM95556a3 = C31022l.m95556a(elevation.getInMeters());
            Metadata metadata13 = elevationGainedRecord.getMetadata();
            AbstractC22676k.m65749i(metadata13, "metadata");
            return new C25163o(startTime4, startZoneOffset4, endTime4, endZoneOffset4, c31036sM95556a3, m7322J(metadata13));
        }
        Object objM95566a = null;
        if (record instanceof ExerciseSessionRecord) {
            ExerciseSessionRecord exerciseSessionRecord = (ExerciseSessionRecord) record;
            Instant startTime5 = exerciseSessionRecord.getStartTime();
            ZoneOffset startZoneOffset5 = exerciseSessionRecord.getStartZoneOffset();
            Instant endTime5 = exerciseSessionRecord.getEndTime();
            ZoneOffset endZoneOffset5 = exerciseSessionRecord.getEndZoneOffset();
            Integer num9 = (Integer) AbstractC18188a.f70555f.get(Integer.valueOf(exerciseSessionRecord.getExerciseType()));
            int iIntValue6 = num9 != null ? num9.intValue() : 0;
            CharSequence title = exerciseSessionRecord.getTitle();
            String string = title != null ? title.toString() : null;
            CharSequence notes = exerciseSessionRecord.getNotes();
            String string2 = notes != null ? notes.toString() : null;
            List<ExerciseLap> laps = exerciseSessionRecord.getLaps();
            AbstractC22676k.m65749i(laps, "laps");
            List<ExerciseLap> list2 = laps;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (ExerciseLap it3 : list2) {
                AbstractC22676k.m65749i(it3, "it");
                Instant startTime6 = it3.getStartTime();
                AbstractC22676k.m65749i(startTime6, "startTime");
                Instant endTime6 = it3.getEndTime();
                AbstractC22676k.m65749i(endTime6, "endTime");
                Length length = it3.getLength();
                if (length != null) {
                    C31022l c31022l3 = C31036s.f128022y;
                    c31036sM95556a = C31022l.m95556a(length.getInMeters());
                } else {
                    c31036sM95556a = null;
                }
                arrayList2.add(new C25165p(startTime6, endTime6, c31036sM95556a));
            }
            List listM74152u2 = AbstractC25265s.m74152u1(arrayList2, new C2298d(7));
            List<ExerciseSegment> segments = exerciseSessionRecord.getSegments();
            AbstractC22676k.m65749i(segments, "segments");
            List<ExerciseSegment> list3 = segments;
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
            for (ExerciseSegment it4 : list3) {
                AbstractC22676k.m65749i(it4, "it");
                Instant startTime7 = it4.getStartTime();
                AbstractC22676k.m65749i(startTime7, "startTime");
                Instant endTime7 = it4.getEndTime();
                AbstractC22676k.m65749i(endTime7, "endTime");
                Integer num10 = (Integer) AbstractC18188a.f70547D.get(Integer.valueOf(it4.getSegmentType()));
                arrayList3.add(new C25177v(startTime7, endTime7, num10 != null ? num10.intValue() : 0, it4.getRepetitionsCount()));
            }
            List listM74152u3 = AbstractC25265s.m74152u1(arrayList3, new C2298d(8));
            Metadata metadata14 = exerciseSessionRecord.getMetadata();
            AbstractC22676k.m65749i(metadata14, "metadata");
            C26413c c26413cM7322J = m7322J(metadata14);
            ExerciseRoute route = exerciseSessionRecord.getRoute();
            AbstractC22674j c25173t = route != null ? new C25173t(m7321I(route)) : exerciseSessionRecord.hasRoute() ? new C25171s() : new C25175u();
            AbstractC22676k.m65749i(startTime5, "startTime");
            AbstractC22676k.m65749i(endTime5, "endTime");
            return new C25179w(startTime5, startZoneOffset5, endTime5, endZoneOffset5, iIntValue6, string, string2, c26413cM7322J, listM74152u3, listM74152u2, c25173t);
        }
        if (record instanceof FloorsClimbedRecord) {
            FloorsClimbedRecord floorsClimbedRecord = (FloorsClimbedRecord) record;
            Instant startTime8 = floorsClimbedRecord.getStartTime();
            AbstractC22676k.m65749i(startTime8, "startTime");
            ZoneOffset startZoneOffset6 = floorsClimbedRecord.getStartZoneOffset();
            Instant endTime8 = floorsClimbedRecord.getEndTime();
            AbstractC22676k.m65749i(endTime8, "endTime");
            ZoneOffset endZoneOffset6 = floorsClimbedRecord.getEndZoneOffset();
            double floors = floorsClimbedRecord.getFloors();
            Metadata metadata15 = floorsClimbedRecord.getMetadata();
            AbstractC22676k.m65749i(metadata15, "metadata");
            return new C25181x(startTime8, startZoneOffset6, endTime8, endZoneOffset6, floors, m7322J(metadata15));
        }
        if (record instanceof HeartRateRecord) {
            HeartRateRecord heartRateRecord = (HeartRateRecord) record;
            Instant startTime9 = heartRateRecord.getStartTime();
            AbstractC22676k.m65749i(startTime9, "startTime");
            ZoneOffset startZoneOffset7 = heartRateRecord.getStartZoneOffset();
            Instant endTime9 = heartRateRecord.getEndTime();
            AbstractC22676k.m65749i(endTime9, "endTime");
            ZoneOffset endZoneOffset7 = heartRateRecord.getEndZoneOffset();
            List<HeartRateRecord.HeartRateSample> samples2 = heartRateRecord.getSamples();
            AbstractC22676k.m65749i(samples2, "samples");
            List<HeartRateRecord.HeartRateSample> list4 = samples2;
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
            for (HeartRateRecord.HeartRateSample it5 : list4) {
                AbstractC22676k.m65749i(it5, "it");
                Instant time11 = it5.getTime();
                AbstractC22676k.m65749i(time11, "time");
                arrayList4.add(new C25183y(it5.getBeatsPerMinute(), time11));
            }
            List listM74152u4 = AbstractC25265s.m74152u1(arrayList4, new C2298d(9));
            Metadata metadata16 = heartRateRecord.getMetadata();
            AbstractC22676k.m65749i(metadata16, "metadata");
            return new C25185z(startTime9, startZoneOffset7, endTime9, endZoneOffset7, listM74152u4, m7322J(metadata16));
        }
        if (record instanceof HeartRateVariabilityRmssdRecord) {
            HeartRateVariabilityRmssdRecord heartRateVariabilityRmssdRecord = (HeartRateVariabilityRmssdRecord) record;
            Instant time12 = heartRateVariabilityRmssdRecord.getTime();
            AbstractC22676k.m65749i(time12, "time");
            ZoneOffset zoneOffset10 = heartRateVariabilityRmssdRecord.getZoneOffset();
            double heartRateVariabilityMillis = heartRateVariabilityRmssdRecord.getHeartRateVariabilityMillis();
            Metadata metadata17 = heartRateVariabilityRmssdRecord.getMetadata();
            AbstractC22676k.m65749i(metadata17, "metadata");
            return new C25128a0(time12, zoneOffset10, heartRateVariabilityMillis, m7322J(metadata17));
        }
        if (record instanceof HeightRecord) {
            HeightRecord heightRecord = (HeightRecord) record;
            Instant time13 = heightRecord.getTime();
            AbstractC22676k.m65749i(time13, "time");
            ZoneOffset zoneOffset11 = heightRecord.getZoneOffset();
            Length height = heightRecord.getHeight();
            AbstractC22676k.m65749i(height, "height");
            C31022l c31022l4 = C31036s.f128022y;
            C31036s c31036sM95556a4 = C31022l.m95556a(height.getInMeters());
            Metadata metadata18 = heightRecord.getMetadata();
            AbstractC22676k.m65749i(metadata18, "metadata");
            return new C25131b0(time13, zoneOffset11, c31036sM95556a4, m7322J(metadata18));
        }
        if (record instanceof HydrationRecord) {
            HydrationRecord hydrationRecord = (HydrationRecord) record;
            Instant startTime10 = hydrationRecord.getStartTime();
            AbstractC22676k.m65749i(startTime10, "startTime");
            ZoneOffset startZoneOffset8 = hydrationRecord.getStartZoneOffset();
            Instant endTime10 = hydrationRecord.getEndTime();
            AbstractC22676k.m65749i(endTime10, "endTime");
            ZoneOffset endZoneOffset8 = hydrationRecord.getEndZoneOffset();
            Volume volume = hydrationRecord.getVolume();
            AbstractC22676k.m65749i(volume, "volume");
            C31035r0 c31035r0 = C31045w0.f128028y;
            C31045w0 c31045w0 = new C31045w0(volume.getInLiters(), EnumC31043v0.f128026w);
            Metadata metadata19 = hydrationRecord.getMetadata();
            AbstractC22676k.m65749i(metadata19, "metadata");
            return new C25137d0(startTime10, startZoneOffset8, endTime10, endZoneOffset8, c31045w0, m7322J(metadata19));
        }
        if (record instanceof IntermenstrualBleedingRecord) {
            IntermenstrualBleedingRecord intermenstrualBleedingRecord = (IntermenstrualBleedingRecord) record;
            Instant time14 = intermenstrualBleedingRecord.getTime();
            AbstractC22676k.m65749i(time14, "time");
            ZoneOffset zoneOffset12 = intermenstrualBleedingRecord.getZoneOffset();
            Metadata metadata20 = intermenstrualBleedingRecord.getMetadata();
            AbstractC22676k.m65749i(metadata20, "metadata");
            return new C25143f0(time14, zoneOffset12, m7322J(metadata20));
        }
        if (record instanceof LeanBodyMassRecord) {
            LeanBodyMassRecord leanBodyMassRecord = (LeanBodyMassRecord) record;
            Instant time15 = leanBodyMassRecord.getTime();
            AbstractC22676k.m65749i(time15, "time");
            ZoneOffset zoneOffset13 = leanBodyMassRecord.getZoneOffset();
            Mass mass2 = leanBodyMassRecord.getMass();
            AbstractC22676k.m65749i(mass2, "mass");
            C31038t c31038t3 = C31003b0.f127986y;
            C31003b0 c31003b0M95566a42 = C31038t.m95566a(mass2.getInGrams());
            Metadata metadata21 = leanBodyMassRecord.getMetadata();
            AbstractC22676k.m65749i(metadata21, "metadata");
            return new C25149h0(time15, zoneOffset13, c31003b0M95566a42, m7322J(metadata21));
        }
        if (record instanceof MenstruationFlowRecord) {
            MenstruationFlowRecord menstruationFlowRecord = (MenstruationFlowRecord) record;
            Instant time16 = menstruationFlowRecord.getTime();
            AbstractC22676k.m65749i(time16, "time");
            ZoneOffset zoneOffset14 = menstruationFlowRecord.getZoneOffset();
            Integer num11 = (Integer) AbstractC18188a.f70561l.get(Integer.valueOf(menstruationFlowRecord.getFlow()));
            iIntValue = num11 != null ? num11.intValue() : 0;
            Metadata metadata22 = menstruationFlowRecord.getMetadata();
            AbstractC22676k.m65749i(metadata22, "metadata");
            return new C25154j0(time16, zoneOffset14, iIntValue, m7322J(metadata22));
        }
        if (record instanceof MenstruationPeriodRecord) {
            MenstruationPeriodRecord menstruationPeriodRecord = (MenstruationPeriodRecord) record;
            Instant startTime11 = menstruationPeriodRecord.getStartTime();
            AbstractC22676k.m65749i(startTime11, "startTime");
            ZoneOffset startZoneOffset9 = menstruationPeriodRecord.getStartZoneOffset();
            Instant endTime11 = menstruationPeriodRecord.getEndTime();
            AbstractC22676k.m65749i(endTime11, "endTime");
            ZoneOffset endZoneOffset9 = menstruationPeriodRecord.getEndZoneOffset();
            Metadata metadata23 = menstruationPeriodRecord.getMetadata();
            AbstractC22676k.m65749i(metadata23, "metadata");
            return new C25156k0(startTime11, startZoneOffset9, endTime11, endZoneOffset9, m7322J(metadata23));
        }
        if (record instanceof NutritionRecord) {
            NutritionRecord nutritionRecord = (NutritionRecord) record;
            Instant startTime12 = nutritionRecord.getStartTime();
            ZoneOffset startZoneOffset10 = nutritionRecord.getStartZoneOffset();
            Instant endTime12 = nutritionRecord.getEndTime();
            ZoneOffset endZoneOffset10 = nutritionRecord.getEndZoneOffset();
            String mealName = nutritionRecord.getMealName();
            Integer num12 = (Integer) AbstractC18188a.f70557h.get(Integer.valueOf(nutritionRecord.getMealType()));
            int iIntValue7 = num12 != null ? num12.intValue() : 0;
            Metadata metadata24 = nutritionRecord.getMetadata();
            AbstractC22676k.m65749i(metadata24, "metadata");
            C26413c c26413cM7322J2 = m7322J(metadata24);
            Mass biotin = nutritionRecord.getBiotin();
            if (biotin != null) {
                C31038t c31038t4 = C31003b0.f127986y;
                c31003b0M95566a = C31038t.m95566a(biotin.getInGrams());
            } else {
                c31003b0M95566a = null;
            }
            Mass caffeine = nutritionRecord.getCaffeine();
            if (caffeine != null) {
                C31038t c31038t5 = C31003b0.f127986y;
                c31003b0M95566a2 = C31038t.m95566a(caffeine.getInGrams());
            } else {
                c31003b0M95566a2 = null;
            }
            Mass calcium = nutritionRecord.getCalcium();
            if (calcium != null) {
                C31038t c31038t6 = C31003b0.f127986y;
                c31003b0M95566a3 = C31038t.m95566a(calcium.getInGrams());
            } else {
                c31003b0M95566a3 = null;
            }
            Energy energy2 = nutritionRecord.getEnergy();
            C31020k c31020kM7320H2 = energy2 != null ? m7320H(energy2) : null;
            Energy energyFromFat = nutritionRecord.getEnergyFromFat();
            C31020k c31020kM7320H3 = energyFromFat != null ? m7320H(energyFromFat) : null;
            Mass chloride = nutritionRecord.getChloride();
            if (chloride != null) {
                C31038t c31038t7 = C31003b0.f127986y;
                c31003b0M95566a4 = C31038t.m95566a(chloride.getInGrams());
            } else {
                c31003b0M95566a4 = null;
            }
            Mass cholesterol = nutritionRecord.getCholesterol();
            if (cholesterol != null) {
                C31038t c31038t8 = C31003b0.f127986y;
                c31003b0M95566a5 = C31038t.m95566a(cholesterol.getInGrams());
            } else {
                c31003b0M95566a5 = null;
            }
            Mass chromium = nutritionRecord.getChromium();
            if (chromium != null) {
                C31038t c31038t9 = C31003b0.f127986y;
                c31003b0M95566a6 = C31038t.m95566a(chromium.getInGrams());
            } else {
                c31003b0M95566a6 = null;
            }
            Mass copper = nutritionRecord.getCopper();
            if (copper != null) {
                C31038t c31038t10 = C31003b0.f127986y;
                c31003b0M95566a7 = C31038t.m95566a(copper.getInGrams());
            } else {
                c31003b0M95566a7 = null;
            }
            Mass dietaryFiber = nutritionRecord.getDietaryFiber();
            if (dietaryFiber != null) {
                C31038t c31038t11 = C31003b0.f127986y;
                c31003b0M95566a8 = C31038t.m95566a(dietaryFiber.getInGrams());
            } else {
                c31003b0M95566a8 = null;
            }
            Mass folate = nutritionRecord.getFolate();
            if (folate != null) {
                C31038t c31038t12 = C31003b0.f127986y;
                c31003b0M95566a9 = C31038t.m95566a(folate.getInGrams());
            } else {
                c31003b0M95566a9 = null;
            }
            Mass folicAcid = nutritionRecord.getFolicAcid();
            if (folicAcid != null) {
                C31038t c31038t13 = C31003b0.f127986y;
                c31003b0M95566a10 = C31038t.m95566a(folicAcid.getInGrams());
            } else {
                c31003b0M95566a10 = null;
            }
            Mass iodine = nutritionRecord.getIodine();
            if (iodine != null) {
                C31038t c31038t14 = C31003b0.f127986y;
                c31003b0M95566a11 = C31038t.m95566a(iodine.getInGrams());
            } else {
                c31003b0M95566a11 = null;
            }
            Mass iron = nutritionRecord.getIron();
            if (iron != null) {
                C31038t c31038t15 = C31003b0.f127986y;
                c31003b0M95566a12 = C31038t.m95566a(iron.getInGrams());
            } else {
                c31003b0M95566a12 = null;
            }
            Mass magnesium = nutritionRecord.getMagnesium();
            if (magnesium != null) {
                C31038t c31038t16 = C31003b0.f127986y;
                c31003b0M95566a13 = C31038t.m95566a(magnesium.getInGrams());
            } else {
                c31003b0M95566a13 = null;
            }
            Mass manganese = nutritionRecord.getManganese();
            if (manganese != null) {
                C31038t c31038t17 = C31003b0.f127986y;
                c31003b0M95566a14 = C31038t.m95566a(manganese.getInGrams());
            } else {
                c31003b0M95566a14 = null;
            }
            Mass molybdenum = nutritionRecord.getMolybdenum();
            if (molybdenum != null) {
                C31038t c31038t18 = C31003b0.f127986y;
                c31003b0M95566a15 = C31038t.m95566a(molybdenum.getInGrams());
            } else {
                c31003b0M95566a15 = null;
            }
            Mass monounsaturatedFat = nutritionRecord.getMonounsaturatedFat();
            if (monounsaturatedFat != null) {
                C31038t c31038t19 = C31003b0.f127986y;
                c31003b0M95566a16 = C31038t.m95566a(monounsaturatedFat.getInGrams());
            } else {
                c31003b0M95566a16 = null;
            }
            Mass niacin = nutritionRecord.getNiacin();
            if (niacin != null) {
                C31038t c31038t20 = C31003b0.f127986y;
                c31003b0M95566a17 = C31038t.m95566a(niacin.getInGrams());
            } else {
                c31003b0M95566a17 = null;
            }
            Mass pantothenicAcid = nutritionRecord.getPantothenicAcid();
            if (pantothenicAcid != null) {
                C31038t c31038t21 = C31003b0.f127986y;
                c31003b0M95566a18 = C31038t.m95566a(pantothenicAcid.getInGrams());
            } else {
                c31003b0M95566a18 = null;
            }
            Mass phosphorus = nutritionRecord.getPhosphorus();
            if (phosphorus != null) {
                C31038t c31038t22 = C31003b0.f127986y;
                c31003b0M95566a19 = C31038t.m95566a(phosphorus.getInGrams());
            } else {
                c31003b0M95566a19 = null;
            }
            Mass polyunsaturatedFat = nutritionRecord.getPolyunsaturatedFat();
            if (polyunsaturatedFat != null) {
                C31038t c31038t23 = C31003b0.f127986y;
                c31003b0M95566a20 = C31038t.m95566a(polyunsaturatedFat.getInGrams());
            } else {
                c31003b0M95566a20 = null;
            }
            Mass potassium = nutritionRecord.getPotassium();
            if (potassium != null) {
                C31038t c31038t24 = C31003b0.f127986y;
                c31003b0M95566a21 = C31038t.m95566a(potassium.getInGrams());
            } else {
                c31003b0M95566a21 = null;
            }
            Mass protein = nutritionRecord.getProtein();
            if (protein != null) {
                C31038t c31038t25 = C31003b0.f127986y;
                c31003b0M95566a22 = C31038t.m95566a(protein.getInGrams());
            } else {
                c31003b0M95566a22 = null;
            }
            Mass riboflavin = nutritionRecord.getRiboflavin();
            if (riboflavin != null) {
                C31038t c31038t26 = C31003b0.f127986y;
                c31003b0M95566a23 = C31038t.m95566a(riboflavin.getInGrams());
            } else {
                c31003b0M95566a23 = null;
            }
            Mass saturatedFat = nutritionRecord.getSaturatedFat();
            if (saturatedFat != null) {
                C31038t c31038t27 = C31003b0.f127986y;
                c31003b0M95566a24 = C31038t.m95566a(saturatedFat.getInGrams());
            } else {
                c31003b0M95566a24 = null;
            }
            Mass selenium = nutritionRecord.getSelenium();
            if (selenium != null) {
                C31038t c31038t28 = C31003b0.f127986y;
                c31003b0M95566a25 = C31038t.m95566a(selenium.getInGrams());
            } else {
                c31003b0M95566a25 = null;
            }
            Mass sodium = nutritionRecord.getSodium();
            if (sodium != null) {
                C31038t c31038t29 = C31003b0.f127986y;
                c31003b0M95566a26 = C31038t.m95566a(sodium.getInGrams());
            } else {
                c31003b0M95566a26 = null;
            }
            Mass sugar = nutritionRecord.getSugar();
            if (sugar != null) {
                C31038t c31038t30 = C31003b0.f127986y;
                c31003b0M95566a27 = C31038t.m95566a(sugar.getInGrams());
            } else {
                c31003b0M95566a27 = null;
            }
            Mass thiamin = nutritionRecord.getThiamin();
            if (thiamin != null) {
                C31038t c31038t31 = C31003b0.f127986y;
                c31003b0M95566a28 = C31038t.m95566a(thiamin.getInGrams());
            } else {
                c31003b0M95566a28 = null;
            }
            Mass totalCarbohydrate = nutritionRecord.getTotalCarbohydrate();
            if (totalCarbohydrate != null) {
                C31038t c31038t32 = C31003b0.f127986y;
                c31003b0M95566a29 = C31038t.m95566a(totalCarbohydrate.getInGrams());
            } else {
                c31003b0M95566a29 = null;
            }
            Mass totalFat = nutritionRecord.getTotalFat();
            if (totalFat != null) {
                C31038t c31038t33 = C31003b0.f127986y;
                c31003b0M95566a30 = C31038t.m95566a(totalFat.getInGrams());
            } else {
                c31003b0M95566a30 = null;
            }
            Mass transFat = nutritionRecord.getTransFat();
            if (transFat != null) {
                C31038t c31038t34 = C31003b0.f127986y;
                c31003b0M95566a31 = C31038t.m95566a(transFat.getInGrams());
            } else {
                c31003b0M95566a31 = null;
            }
            Mass unsaturatedFat = nutritionRecord.getUnsaturatedFat();
            if (unsaturatedFat != null) {
                C31038t c31038t35 = C31003b0.f127986y;
                c31003b0M95566a32 = C31038t.m95566a(unsaturatedFat.getInGrams());
            } else {
                c31003b0M95566a32 = null;
            }
            Mass vitaminA = nutritionRecord.getVitaminA();
            if (vitaminA != null) {
                C31038t c31038t36 = C31003b0.f127986y;
                c31003b0M95566a33 = C31038t.m95566a(vitaminA.getInGrams());
            } else {
                c31003b0M95566a33 = null;
            }
            Mass vitaminB12 = nutritionRecord.getVitaminB12();
            if (vitaminB12 != null) {
                C31038t c31038t37 = C31003b0.f127986y;
                c31003b0M95566a34 = C31038t.m95566a(vitaminB12.getInGrams());
            } else {
                c31003b0M95566a34 = null;
            }
            Mass vitaminB6 = nutritionRecord.getVitaminB6();
            if (vitaminB6 != null) {
                C31038t c31038t38 = C31003b0.f127986y;
                c31003b0M95566a35 = C31038t.m95566a(vitaminB6.getInGrams());
            } else {
                c31003b0M95566a35 = null;
            }
            Mass vitaminC = nutritionRecord.getVitaminC();
            if (vitaminC != null) {
                C31038t c31038t39 = C31003b0.f127986y;
                c31003b0M95566a36 = C31038t.m95566a(vitaminC.getInGrams());
            } else {
                c31003b0M95566a36 = null;
            }
            Mass vitaminD = nutritionRecord.getVitaminD();
            if (vitaminD != null) {
                C31038t c31038t40 = C31003b0.f127986y;
                c31003b0M95566a37 = C31038t.m95566a(vitaminD.getInGrams());
            } else {
                c31003b0M95566a37 = null;
            }
            Mass vitaminE = nutritionRecord.getVitaminE();
            if (vitaminE != null) {
                C31038t c31038t41 = C31003b0.f127986y;
                c31003b0M95566a38 = C31038t.m95566a(vitaminE.getInGrams());
            } else {
                c31003b0M95566a38 = null;
            }
            Mass vitaminK = nutritionRecord.getVitaminK();
            if (vitaminK != null) {
                C31038t c31038t42 = C31003b0.f127986y;
                c31003b0M95566a39 = C31038t.m95566a(vitaminK.getInGrams());
            } else {
                c31003b0M95566a39 = null;
            }
            Mass zinc = nutritionRecord.getZinc();
            if (zinc != null) {
                C31038t c31038t43 = C31003b0.f127986y;
                objM95566a = C31038t.m95566a(zinc.getInGrams());
            }
            AbstractC22676k.m65749i(startTime12, "startTime");
            AbstractC22676k.m65749i(endTime12, "endTime");
            return new C25160m0(startTime12, startZoneOffset10, endTime12, endZoneOffset10, c31003b0M95566a, c31003b0M95566a2, c31003b0M95566a3, c31020kM7320H2, c31020kM7320H3, c31003b0M95566a4, c31003b0M95566a5, c31003b0M95566a6, c31003b0M95566a7, c31003b0M95566a8, c31003b0M95566a9, c31003b0M95566a10, c31003b0M95566a11, c31003b0M95566a12, c31003b0M95566a13, c31003b0M95566a14, c31003b0M95566a15, c31003b0M95566a16, c31003b0M95566a17, c31003b0M95566a18, c31003b0M95566a19, c31003b0M95566a20, c31003b0M95566a21, c31003b0M95566a22, c31003b0M95566a23, c31003b0M95566a24, c31003b0M95566a25, c31003b0M95566a26, c31003b0M95566a27, c31003b0M95566a28, c31003b0M95566a29, c31003b0M95566a30, c31003b0M95566a31, c31003b0M95566a32, c31003b0M95566a33, c31003b0M95566a34, c31003b0M95566a35, c31003b0M95566a36, c31003b0M95566a37, c31003b0M95566a38, c31003b0M95566a39, objM95566a, mealName, iIntValue7, c26413cM7322J2);
        }
        if (record instanceof OvulationTestRecord) {
            OvulationTestRecord ovulationTestRecord = (OvulationTestRecord) record;
            Instant time17 = ovulationTestRecord.getTime();
            AbstractC22676k.m65749i(time17, "time");
            ZoneOffset zoneOffset15 = ovulationTestRecord.getZoneOffset();
            Integer num13 = (Integer) AbstractC18188a.f70567r.get(Integer.valueOf(ovulationTestRecord.getResult()));
            iIntValue = num13 != null ? num13.intValue() : 0;
            Metadata metadata25 = ovulationTestRecord.getMetadata();
            AbstractC22676k.m65749i(metadata25, "metadata");
            return new C25162n0(time17, zoneOffset15, iIntValue, m7322J(metadata25));
        }
        if (record instanceof OxygenSaturationRecord) {
            OxygenSaturationRecord oxygenSaturationRecord = (OxygenSaturationRecord) record;
            Instant time18 = oxygenSaturationRecord.getTime();
            AbstractC22676k.m65749i(time18, "time");
            ZoneOffset zoneOffset16 = oxygenSaturationRecord.getZoneOffset();
            Percentage percentage2 = oxygenSaturationRecord.getPercentage();
            AbstractC22676k.m65749i(percentage2, "percentage");
            C31005c0 c31005c1 = new C31005c0(percentage2.getValue());
            Metadata metadata26 = oxygenSaturationRecord.getMetadata();
            AbstractC22676k.m65749i(metadata26, "metadata");
            return new C25164o0(time18, zoneOffset16, c31005c1, m7322J(metadata26));
        }
        if (record instanceof PowerRecord) {
            PowerRecord powerRecord = (PowerRecord) record;
            Instant startTime13 = powerRecord.getStartTime();
            AbstractC22676k.m65749i(startTime13, "startTime");
            ZoneOffset startZoneOffset11 = powerRecord.getStartZoneOffset();
            Instant endTime13 = powerRecord.getEndTime();
            AbstractC22676k.m65749i(endTime13, "endTime");
            ZoneOffset endZoneOffset11 = powerRecord.getEndZoneOffset();
            List<PowerRecord.PowerRecordSample> samples3 = powerRecord.getSamples();
            AbstractC22676k.m65749i(samples3, "samples");
            List<PowerRecord.PowerRecordSample> list5 = samples3;
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
            for (PowerRecord.PowerRecordSample it6 : list5) {
                AbstractC22676k.m65749i(it6, "it");
                Instant time19 = it6.getTime();
                AbstractC22676k.m65749i(time19, "time");
                Power power = it6.getPower();
                AbstractC22676k.m65749i(power, "power");
                C31007d0 c31007d1 = C31015h0.f127999y;
                arrayList5.add(new C25166p0(time19, C31007d0.m95545a(power.getInWatts())));
            }
            List listM74152u5 = AbstractC25265s.m74152u1(arrayList5, new C2298d(i13));
            Metadata metadata27 = powerRecord.getMetadata();
            AbstractC22676k.m65749i(metadata27, "metadata");
            return new C25168q0(startTime13, startZoneOffset11, endTime13, endZoneOffset11, listM74152u5, m7322J(metadata27));
        }
        if (record instanceof RespiratoryRateRecord) {
            RespiratoryRateRecord respiratoryRateRecord = (RespiratoryRateRecord) record;
            Instant time20 = respiratoryRateRecord.getTime();
            AbstractC22676k.m65749i(time20, "time");
            ZoneOffset zoneOffset17 = respiratoryRateRecord.getZoneOffset();
            double rate = respiratoryRateRecord.getRate();
            Metadata metadata28 = respiratoryRateRecord.getMetadata();
            AbstractC22676k.m65749i(metadata28, "metadata");
            return new C25172s0(time20, zoneOffset17, rate, m7322J(metadata28));
        }
        if (record instanceof RestingHeartRateRecord) {
            RestingHeartRateRecord restingHeartRateRecord = (RestingHeartRateRecord) record;
            Instant time21 = restingHeartRateRecord.getTime();
            AbstractC22676k.m65749i(time21, "time");
            ZoneOffset zoneOffset18 = restingHeartRateRecord.getZoneOffset();
            long beatsPerMinute = restingHeartRateRecord.getBeatsPerMinute();
            Metadata metadata29 = restingHeartRateRecord.getMetadata();
            AbstractC22676k.m65749i(metadata29, "metadata");
            return new C25174t0(time21, zoneOffset18, beatsPerMinute, m7322J(metadata29));
        }
        if (record instanceof SexualActivityRecord) {
            SexualActivityRecord sexualActivityRecord = (SexualActivityRecord) record;
            Instant time22 = sexualActivityRecord.getTime();
            AbstractC22676k.m65749i(time22, "time");
            ZoneOffset zoneOffset19 = sexualActivityRecord.getZoneOffset();
            Integer num14 = (Integer) AbstractC18188a.f70571v.get(Integer.valueOf(sexualActivityRecord.getProtectionUsed()));
            iIntValue = num14 != null ? num14.intValue() : 0;
            Metadata metadata30 = sexualActivityRecord.getMetadata();
            AbstractC22676k.m65749i(metadata30, "metadata");
            return new C25178v0(time22, zoneOffset19, iIntValue, m7322J(metadata30));
        }
        if (record instanceof SleepSessionRecord) {
            SleepSessionRecord sleepSessionRecord = (SleepSessionRecord) record;
            Instant startTime14 = sleepSessionRecord.getStartTime();
            ZoneOffset startZoneOffset12 = sleepSessionRecord.getStartZoneOffset();
            Instant endTime14 = sleepSessionRecord.getEndTime();
            ZoneOffset endZoneOffset12 = sleepSessionRecord.getEndZoneOffset();
            Metadata metadata31 = sleepSessionRecord.getMetadata();
            AbstractC22676k.m65749i(metadata31, "metadata");
            C26413c c26413cM7322J3 = m7322J(metadata31);
            CharSequence title2 = sleepSessionRecord.getTitle();
            String string3 = title2 != null ? title2.toString() : null;
            CharSequence notes2 = sleepSessionRecord.getNotes();
            String string4 = notes2 != null ? notes2.toString() : null;
            List<SleepSessionRecord.Stage> stages = sleepSessionRecord.getStages();
            AbstractC22676k.m65749i(stages, "stages");
            List<SleepSessionRecord.Stage> list6 = stages;
            ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(list6, 10));
            for (SleepSessionRecord.Stage it7 : list6) {
                AbstractC22676k.m65749i(it7, "it");
                Instant startTime15 = it7.getStartTime();
                AbstractC22676k.m65749i(startTime15, "startTime");
                Instant endTime15 = it7.getEndTime();
                AbstractC22676k.m65749i(endTime15, "endTime");
                Integer num15 = (Integer) AbstractC18188a.f70545B.get(Integer.valueOf(it7.getType()));
                arrayList6.add(new C25180w0(startTime15, endTime15, num15 != null ? num15.intValue() : 0));
            }
            List listM74152u6 = AbstractC25265s.m74152u1(arrayList6, new C2298d(11));
            AbstractC22676k.m65749i(startTime14, "startTime");
            AbstractC22676k.m65749i(endTime14, "endTime");
            return new C25182x0(startTime14, startZoneOffset12, endTime14, endZoneOffset12, string3, string4, listM74152u6, c26413cM7322J3);
        }
        if (record instanceof SpeedRecord) {
            SpeedRecord speedRecord = (SpeedRecord) record;
            Instant startTime16 = speedRecord.getStartTime();
            AbstractC22676k.m65749i(startTime16, "startTime");
            ZoneOffset startZoneOffset13 = speedRecord.getStartZoneOffset();
            Instant endTime16 = speedRecord.getEndTime();
            AbstractC22676k.m65749i(endTime16, "endTime");
            ZoneOffset endZoneOffset13 = speedRecord.getEndZoneOffset();
            List<SpeedRecord.SpeedRecordSample> samples4 = speedRecord.getSamples();
            AbstractC22676k.m65749i(samples4, "samples");
            List<SpeedRecord.SpeedRecordSample> list7 = samples4;
            ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(list7, 10));
            for (SpeedRecord.SpeedRecordSample it8 : list7) {
                AbstractC22676k.m65749i(it8, "it");
                Instant time23 = it8.getTime();
                AbstractC22676k.m65749i(time23, "time");
                Velocity speed = it8.getSpeed();
                AbstractC22676k.m65749i(speed, "speed");
                C31023l0 c31023l0 = C31033q0.f128016y;
                arrayList7.add(new C25186z0(time23, C31023l0.m95557a(speed.getInMetersPerSecond())));
            }
            List listM74152u7 = AbstractC25265s.m74152u1(arrayList7, new C2298d(12));
            Metadata metadata32 = speedRecord.getMetadata();
            AbstractC22676k.m65749i(metadata32, "metadata");
            return new C25129a1(startTime16, startZoneOffset13, endTime16, endZoneOffset13, listM74152u7, m7322J(metadata32));
        }
        if (record instanceof StepsCadenceRecord) {
            StepsCadenceRecord stepsCadenceRecord = (StepsCadenceRecord) record;
            Instant startTime17 = stepsCadenceRecord.getStartTime();
            AbstractC22676k.m65749i(startTime17, "startTime");
            ZoneOffset startZoneOffset14 = stepsCadenceRecord.getStartZoneOffset();
            Instant endTime17 = stepsCadenceRecord.getEndTime();
            AbstractC22676k.m65749i(endTime17, "endTime");
            ZoneOffset endZoneOffset14 = stepsCadenceRecord.getEndZoneOffset();
            List<StepsCadenceRecord.StepsCadenceRecordSample> samples5 = stepsCadenceRecord.getSamples();
            AbstractC22676k.m65749i(samples5, "samples");
            List<StepsCadenceRecord.StepsCadenceRecordSample> list8 = samples5;
            ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(list8, 10));
            for (StepsCadenceRecord.StepsCadenceRecordSample it9 : list8) {
                AbstractC22676k.m65749i(it9, "it");
                Instant time24 = it9.getTime();
                AbstractC22676k.m65749i(time24, "time");
                arrayList8.add(new C25132b1(it9.getRate(), time24));
            }
            List listM74152u8 = AbstractC25265s.m74152u1(arrayList8, new C2298d(13));
            Metadata metadata33 = stepsCadenceRecord.getMetadata();
            AbstractC22676k.m65749i(metadata33, "metadata");
            return new C25135c1(startTime17, startZoneOffset14, endTime17, endZoneOffset14, listM74152u8, m7322J(metadata33));
        }
        if (record instanceof StepsRecord) {
            StepsRecord stepsRecord = (StepsRecord) record;
            Instant startTime18 = stepsRecord.getStartTime();
            AbstractC22676k.m65749i(startTime18, "startTime");
            ZoneOffset startZoneOffset15 = stepsRecord.getStartZoneOffset();
            Instant endTime18 = stepsRecord.getEndTime();
            AbstractC22676k.m65749i(endTime18, "endTime");
            ZoneOffset endZoneOffset15 = stepsRecord.getEndZoneOffset();
            long count = stepsRecord.getCount();
            Metadata metadata34 = stepsRecord.getMetadata();
            AbstractC22676k.m65749i(metadata34, "metadata");
            return new C25138d1(startTime18, startZoneOffset15, endTime18, endZoneOffset15, count, m7322J(metadata34));
        }
        if (record instanceof TotalCaloriesBurnedRecord) {
            TotalCaloriesBurnedRecord totalCaloriesBurnedRecord = (TotalCaloriesBurnedRecord) record;
            Instant startTime19 = totalCaloriesBurnedRecord.getStartTime();
            AbstractC22676k.m65749i(startTime19, "startTime");
            ZoneOffset startZoneOffset16 = totalCaloriesBurnedRecord.getStartZoneOffset();
            Instant endTime19 = totalCaloriesBurnedRecord.getEndTime();
            AbstractC22676k.m65749i(endTime19, "endTime");
            ZoneOffset endZoneOffset16 = totalCaloriesBurnedRecord.getEndZoneOffset();
            Energy energy3 = totalCaloriesBurnedRecord.getEnergy();
            AbstractC22676k.m65749i(energy3, "energy");
            C31020k c31020kM7320H4 = m7320H(energy3);
            Metadata metadata35 = totalCaloriesBurnedRecord.getMetadata();
            AbstractC22676k.m65749i(metadata35, "metadata");
            return new C25141e1(startTime19, startZoneOffset16, endTime19, endZoneOffset16, c31020kM7320H4, m7322J(metadata35));
        }
        if (record instanceof Vo2MaxRecord) {
            Vo2MaxRecord vo2MaxRecord = (Vo2MaxRecord) record;
            Instant time25 = vo2MaxRecord.getTime();
            AbstractC22676k.m65749i(time25, "time");
            ZoneOffset zoneOffset20 = vo2MaxRecord.getZoneOffset();
            double vo2MillilitersPerMinuteKilogram = vo2MaxRecord.getVo2MillilitersPerMinuteKilogram();
            Integer num16 = (Integer) AbstractC18188a.f70559j.get(Integer.valueOf(vo2MaxRecord.getMeasurementMethod()));
            iIntValue = num16 != null ? num16.intValue() : 0;
            Metadata metadata36 = vo2MaxRecord.getMetadata();
            AbstractC22676k.m65749i(metadata36, "metadata");
            return new C25144f1(time25, zoneOffset20, vo2MillilitersPerMinuteKilogram, iIntValue, m7322J(metadata36));
        }
        if (record instanceof WeightRecord) {
            WeightRecord weightRecord = (WeightRecord) record;
            Instant time26 = weightRecord.getTime();
            AbstractC22676k.m65749i(time26, "time");
            ZoneOffset zoneOffset21 = weightRecord.getZoneOffset();
            Mass weight = weightRecord.getWeight();
            AbstractC22676k.m65749i(weight, "weight");
            C31038t c31038t44 = C31003b0.f127986y;
            C31003b0 c31003b0M95566a43 = C31038t.m95566a(weight.getInGrams());
            Metadata metadata37 = weightRecord.getMetadata();
            AbstractC22676k.m65749i(metadata37, "metadata");
            return new C25147g1(time26, zoneOffset21, c31003b0M95566a43, m7322J(metadata37));
        }
        if (!(record instanceof WheelchairPushesRecord)) {
            throw new IllegalArgumentException("Unsupported record " + record);
        }
        WheelchairPushesRecord wheelchairPushesRecord = (WheelchairPushesRecord) record;
        Instant startTime20 = wheelchairPushesRecord.getStartTime();
        AbstractC22676k.m65749i(startTime20, "startTime");
        ZoneOffset startZoneOffset17 = wheelchairPushesRecord.getStartZoneOffset();
        Instant endTime20 = wheelchairPushesRecord.getEndTime();
        AbstractC22676k.m65749i(endTime20, "endTime");
        ZoneOffset endZoneOffset17 = wheelchairPushesRecord.getEndZoneOffset();
        long count2 = wheelchairPushesRecord.getCount();
        Metadata metadata38 = wheelchairPushesRecord.getMetadata();
        AbstractC22676k.m65749i(metadata38, "metadata");
        return new C25150h1(startTime20, startZoneOffset17, endTime20, endZoneOffset17, count2, m7322J(metadata38));
    }

    /* JADX INFO: renamed from: L */
    public static float m7324L(BackEvent backEvent) {
        AbstractC22676k.m65750j(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: M */
    public static float m7325M(BackEvent backEvent) {
        AbstractC22676k.m65750j(backEvent, "backEvent");
        return backEvent.getTouchY();
    }

    /* JADX INFO: renamed from: a */
    public static final void m7326a(CursorAnchorInfo.Builder builder, C23277r0 c23277r0, C16618c c16618c) {
        if (c16618c.m47203i()) {
            return;
        }
        float f13 = c16618c.f63940b;
        C23286w c23286w = c23277r0.f92228b;
        int iM67375e = c23286w.m67375e(f13);
        int iM67375e2 = c23286w.m67375e(c16618c.f63942d);
        if (iM67375e > iM67375e2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(c23277r0.m67337f(iM67375e), c23286w.m67376f(iM67375e), c23277r0.m67338g(iM67375e), c23286w.m67372b(iM67375e));
            if (iM67375e == iM67375e2) {
                return;
            } else {
                iM67375e++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7327b(CursorAnchorInfo.Builder builder, C23277r0 c23277r0, C16618c c16618c) {
        if (c16618c.m47203i()) {
            return;
        }
        float f13 = c16618c.f63940b;
        C23286w c23286w = c23277r0.f92228b;
        int iM67375e = c23286w.m67375e(f13);
        int iM67375e2 = c23286w.m67375e(c16618c.f63942d);
        if (iM67375e > iM67375e2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(c23277r0.m67337f(iM67375e), c23286w.m67376f(iM67375e), c23277r0.m67338g(iM67375e), c23286w.m67372b(iM67375e));
            if (iM67375e == iM67375e2) {
                return;
            } else {
                iM67375e++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7328c(Activity activity) {
        AbstractC22676k.m65750j(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            activity.overrideActivityTransition(1, R.anim.stripe_transition_fade_in, R.anim.stripe_transition_fade_out);
        } else {
            activity.overridePendingTransition(R.anim.stripe_transition_fade_in, R.anim.stripe_transition_fade_out);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m7329d(HandwritingGesture handwritingGesture, C4780c c4780c) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c4780c.invoke(new C29860a(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: e */
    public static float m7330e(VelocityTracker velocityTracker, int i13) {
        return velocityTracker.getAxisVelocity(i13);
    }

    /* JADX INFO: renamed from: f */
    public static int[] m7331f(C24983m c24983m, RectF rectF, int i13, final C22541b c22541b) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i13 == 1) {
            graphemeClusterSegmentFinder = new C26206a(new C38445a(21, c24983m.f97768f.getText(), c24983m.m73316j()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(c24983m.f97768f.getText(), c24983m.f97763a);
        }
        return c24983m.f97768f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: m3.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) c22541b.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static float m7332g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    /* JADX INFO: renamed from: h */
    public static float m7333h(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    /* JADX INFO: renamed from: i */
    public static int m7334i(ViewConfiguration viewConfiguration, int i13, int i14, int i15) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i13, i14, i15);
    }

    /* JADX INFO: renamed from: j */
    public static int m7335j(ViewConfiguration viewConfiguration, int i13, int i14, int i15) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i13, i14, i15);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m7336k(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    /* JADX INFO: renamed from: l */
    public static final ColorSpace m7337l(AbstractC21222c abstractC21222c) {
        if (AbstractC22676k.m65745e(abstractC21222c, C21223d.f81040v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (AbstractC22676k.m65745e(abstractC21222c, C21223d.f81041w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static void m7338m(long j7, C23254g c23254g, boolean z4, C4780c c4780c) {
        if (z4) {
            int i13 = C23283u0.f92252c;
            int iCharCount = (int) (j7 >> 32);
            int iCharCount2 = (int) (j7 & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c23254g, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c23254g.f92135x.length() ? Character.codePointAt(c23254g, iCharCount2) : 10;
            if (C27648a.m83568S(iCodePointBefore) && (C27648a.m83567R(iCodePointAt) || C27648a.m83566Q(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c23254g, iCharCount);
                    }
                } while (C27648a.m83568S(iCodePointBefore));
                j7 = AbstractC21478l0.m60431f(iCharCount, iCharCount2);
            } else if (C27648a.m83568S(iCodePointAt) && (C27648a.m83567R(iCodePointBefore) || C27648a.m83566Q(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c23254g.f92135x.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c23254g, iCharCount2);
                    }
                } while (C27648a.m83568S(iCodePointAt));
                j7 = AbstractC21478l0.m60431f(iCharCount, iCharCount2);
            }
        }
        int i14 = (int) (4294967295L & j7);
        c4780c.invoke(new C11455h(new InterfaceC29874h[]{new C29890x(i14, i14), new C29870f(C23283u0.m67358d(j7), 0)}));
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0263  */
    /* JADX INFO: renamed from: n */
    public static int m7339n(C34354s0 c34354s0, HandwritingGesture handwritingGesture, C13977s1 c13977s1, InterfaceC2395j3 interfaceC2395j3, C4780c c4780c) {
        long jM67378h;
        int i13;
        C34346p1 c34346p1M108662d;
        C34346p1 c34346p1M108662d2;
        C23275q0 c23275q0;
        C23254g c23254g = c34354s0.f144316j;
        if (c23254g == null) {
            return 3;
        }
        C34346p1 c34346p1M108662d3 = c34354s0.m108662d();
        if (!c23254g.equals((c34346p1M108662d3 == null || (c23275q0 = c34346p1M108662d3.f144282a.f92227a) == null) ? null : c23275q0.f92216a)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jM83561L = C27648a.m83561L(c34354s0, AbstractC17918w0.m51509K(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (C23283u0.m67357c(jM83561L)) {
                return m7329d(selectGesture, c4780c);
            }
            c4780c.invoke(new C29890x((int) (jM83561L >> 32), (int) (jM83561L & 4294967295L)));
            if (c13977s1 != null) {
                c13977s1.m39778h(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i14 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jM83561L2 = C27648a.m83561L(c34354s0, AbstractC17918w0.m51509K(deleteGesture.getDeletionArea()), i14);
                if (C23283u0.m67357c(jM83561L2)) {
                    return m7329d(deleteGesture, c4780c);
                }
                m7338m(jM83561L2, c23254g, i14 == 1, c4780c);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i15 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jM83588k = C27648a.m83588k(c34354s0, AbstractC17918w0.m51509K(deleteRangeGesture.getDeletionStartArea()), AbstractC17918w0.m51509K(deleteRangeGesture.getDeletionEndArea()), i15);
                    if (C23283u0.m67357c(jM83588k)) {
                        return m7329d(deleteRangeGesture, c4780c);
                    }
                    m7338m(jM83588k, c23254g, i15 == 1, c4780c);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (interfaceC2395j3 == null) {
                        return m7329d(joinOrSplitGesture, c4780c);
                    }
                    int iM83587j = C27648a.m83587j(c34354s0, C27648a.m83590m(joinOrSplitGesture.getJoinOrSplitPoint()), interfaceC2395j3);
                    if (iM83587j == -1 || ((c34346p1M108662d2 = c34354s0.m108662d()) != null && C27648a.m83589l(c34346p1M108662d2.f144282a, iM83587j))) {
                        return m7329d(joinOrSplitGesture, c4780c);
                    }
                    int iCharCount = iM83587j;
                    while (iCharCount > 0) {
                        int iCodePointBefore = Character.codePointBefore(c23254g, iCharCount);
                        if (!C27648a.m83567R(iCodePointBefore)) {
                            break;
                        }
                        iCharCount -= Character.charCount(iCodePointBefore);
                    }
                    while (iM83587j < c23254g.f92135x.length()) {
                        int iCodePointAt = Character.codePointAt(c23254g, iM83587j);
                        if (!C27648a.m83567R(iCodePointAt)) {
                            break;
                        }
                        iM83587j += Character.charCount(iCodePointAt);
                    }
                    long jM60431f = AbstractC21478l0.m60431f(iCharCount, iM83587j);
                    if (!C23283u0.m67357c(jM60431f)) {
                        m7338m(jM60431f, c23254g, false, c4780c);
                        return 1;
                    }
                    int i16 = (int) (jM60431f >> 32);
                    c4780c.invoke(new C11455h(new InterfaceC29874h[]{new C29890x(i16, i16), new C29860a(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (interfaceC2395j3 == null) {
                        return m7329d(insertGesture, c4780c);
                    }
                    int iM83587j2 = C27648a.m83587j(c34354s0, C27648a.m83590m(insertGesture.getInsertionPoint()), interfaceC2395j3);
                    if (iM83587j2 == -1 || ((c34346p1M108662d = c34354s0.m108662d()) != null && C27648a.m83589l(c34346p1M108662d.f144282a, iM83587j2))) {
                        return m7329d(insertGesture, c4780c);
                    }
                    c4780c.invoke(new C11455h(new InterfaceC29874h[]{new C29890x(iM83587j2, iM83587j2), new C29860a(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                C34346p1 c34346p1M108662d4 = c34354s0.m108662d();
                C23277r0 c23277r0 = c34346p1M108662d4 != null ? c34346p1M108662d4.f144282a : null;
                long jM83590m = C27648a.m83590m(removeSpaceGesture.getStartPoint());
                long jM83590m2 = C27648a.m83590m(removeSpaceGesture.getEndPoint());
                InterfaceC39147y interfaceC39147yM108661c = c34354s0.m108661c();
                if (c23277r0 != null) {
                    C23286w c23286w = c23277r0.f92228b;
                    if (interfaceC39147yM108661c == null) {
                        jM67378h = C23283u0.f92251b;
                    } else {
                        long jMo3555y = interfaceC39147yM108661c.mo3555y(jM83590m);
                        long jMo3555y2 = interfaceC39147yM108661c.mo3555y(jM83590m2);
                        int iM83559J = C27648a.m83559J(c23286w, jMo3555y, interfaceC2395j3);
                        int iM83559J2 = C27648a.m83559J(c23286w, jMo3555y2, interfaceC2395j3);
                        if (iM83559J != -1) {
                            if (iM83559J2 != -1) {
                                iM83559J = Math.min(iM83559J, iM83559J2);
                            }
                            iM83559J2 = iM83559J;
                        } else if (iM83559J2 == -1) {
                            jM67378h = C23283u0.f92251b;
                        }
                        float fM67372b = (c23286w.m67372b(iM83559J2) + c23286w.m67376f(iM83559J2)) / 2;
                        int i17 = (int) (jMo3555y >> 32);
                        int i18 = (int) (jMo3555y2 >> 32);
                        jM67378h = c23286w.m67378h(new C16618c(Math.min(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)), fM67372b - 0.1f, Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)), fM67372b + 0.1f), 0, C23273p0.f92214a);
                    }
                } else {
                    jM67378h = C23283u0.f92251b;
                }
                if (C23283u0.m67357c(jM67378h)) {
                    return m7329d(removeSpaceGesture, c4780c);
                }
                C22665e0 c22665e0 = new C22665e0();
                c22665e0.f89334w = -1;
                C22665e0 c22665e1 = new C22665e0();
                c22665e1.f89334w = -1;
                String strM125853g = new C39412p("\\s+").m125853g(c23254g.subSequence(C23283u0.m67360f(jM67378h), C23283u0.m67359e(jM67378h)).f92135x, new C9790n(7, c22665e0, c22665e1));
                int i19 = c22665e0.f89334w;
                if (i19 == -1 || (i13 = c22665e1.f89334w) == -1) {
                    return m7329d(removeSpaceGesture, c4780c);
                }
                int i24 = (int) (jM67378h >> 32);
                String strSubstring = strM125853g.substring(i19, strM125853g.length() - (C23283u0.m67358d(jM67378h) - c22665e1.f89334w));
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                c4780c.invoke(new C11455h(new InterfaceC29874h[]{new C29890x(i24 + i19, i24 + i13), new C29860a(strSubstring, 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jM83588k2 = C27648a.m83588k(c34354s0, AbstractC17918w0.m51509K(selectRangeGesture.getSelectionStartArea()), AbstractC17918w0.m51509K(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (C23283u0.m67357c(jM83588k2)) {
                return m7329d(selectRangeGesture, c4780c);
            }
            c4780c.invoke(new C29890x((int) (jM83588k2 >> 32), (int) (jM83588k2 & 4294967295L)));
            if (c13977s1 != null) {
                c13977s1.m39778h(true);
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m7340o(C34354s0 c34354s0, PreviewableHandwritingGesture previewableHandwritingGesture, C13977s1 c13977s1, CancellationSignal cancellationSignal) {
        C23275q0 c23275q0;
        C23254g c23254g = c34354s0.f144316j;
        if (c23254g != null) {
            C34346p1 c34346p1M108662d = c34354s0.m108662d();
            if (c23254g.equals((c34346p1M108662d == null || (c23275q0 = c34346p1M108662d.f144282a.f92227a) == null) ? null : c23275q0.f92216a)) {
                if (previewableHandwritingGesture instanceof SelectGesture) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (c13977s1 != null) {
                        long jM83561L = C27648a.m83561L(c34354s0, AbstractC17918w0.m51509K(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        C34354s0 c34354s1 = c13977s1.f49848d;
                        if (c34354s1 != null) {
                            c34354s1.m108664f(jM83561L);
                        }
                        C34354s0 c34354s2 = c13977s1.f49848d;
                        if (c34354s2 != null) {
                            c34354s2.m108663e(C23283u0.f92251b);
                        }
                        if (!C23283u0.m67357c(jM83561L)) {
                            c13977s1.m39789s(false);
                            c13977s1.m39786p(EnumC34318g0.f144086w);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (c13977s1 != null) {
                        long jM83561L2 = C27648a.m83561L(c34354s0, AbstractC17918w0.m51509K(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        C34354s0 c34354s3 = c13977s1.f49848d;
                        if (c34354s3 != null) {
                            c34354s3.m108663e(jM83561L2);
                        }
                        C34354s0 c34354s4 = c13977s1.f49848d;
                        if (c34354s4 != null) {
                            c34354s4.m108664f(C23283u0.f92251b);
                        }
                        if (!C23283u0.m67357c(jM83561L2)) {
                            c13977s1.m39789s(false);
                            c13977s1.m39786p(EnumC34318g0.f144086w);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (c13977s1 != null) {
                        long jM83588k = C27648a.m83588k(c34354s0, AbstractC17918w0.m51509K(selectRangeGesture.getSelectionStartArea()), AbstractC17918w0.m51509K(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        C34354s0 c34354s5 = c13977s1.f49848d;
                        if (c34354s5 != null) {
                            c34354s5.m108664f(jM83588k);
                        }
                        C34354s0 c34354s6 = c13977s1.f49848d;
                        if (c34354s6 != null) {
                            c34354s6.m108663e(C23283u0.f92251b);
                        }
                        if (!C23283u0.m67357c(jM83588k)) {
                            c13977s1.m39789s(false);
                            c13977s1.m39786p(EnumC34318g0.f144086w);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (c13977s1 != null) {
                        long jM83588k2 = C27648a.m83588k(c34354s0, AbstractC17918w0.m51509K(deleteRangeGesture.getDeletionStartArea()), AbstractC17918w0.m51509K(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        C34354s0 c34354s7 = c13977s1.f49848d;
                        if (c34354s7 != null) {
                            c34354s7.m108663e(jM83588k2);
                        }
                        C34354s0 c34354s8 = c13977s1.f49848d;
                        if (c34354s8 != null) {
                            c34354s8.m108664f(C23283u0.f92251b);
                        }
                        if (!C23283u0.m67357c(jM83588k2)) {
                            c13977s1.m39789s(false);
                            c13977s1.m39786p(EnumC34318g0.f144086w);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new C11454g(c13977s1, 0));
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static float m7341p(BackEvent backEvent) {
        AbstractC22676k.m65750j(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: q */
    public static void m7342q(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e5) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e5);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m7343r(AccessibilityEvent accessibilityEvent, boolean z4) {
        accessibilityEvent.setAccessibilityDataSensitive(z4);
    }

    /* JADX INFO: renamed from: s */
    public static void m7344s(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(AbstractC37056f.m118959K(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(AbstractC25260n.m74059b1(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    /* JADX INFO: renamed from: t */
    public static void m7345t(TextView textView, int i13, float f13) {
        textView.setLineHeight(i13, f13);
    }

    /* JADX INFO: renamed from: u */
    public static void m7346u(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }

    /* JADX INFO: renamed from: v */
    public static int m7347v(BackEvent backEvent) {
        AbstractC22676k.m65750j(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: w */
    public static final Exception m7348w(HealthConnectException healthConnectException) {
        int errorCode = healthConnectException.getErrorCode();
        if (errorCode == 3) {
            return new IllegalArgumentException(healthConnectException);
        }
        if (errorCode == 4) {
            return new IOException(healthConnectException);
        }
        if (errorCode != 5) {
            return errorCode != 6 ? new IllegalStateException(healthConnectException) : new RemoteException(healthConnectException.getMessage());
        }
        return new SecurityException(healthConnectException);
    }

    /* JADX INFO: renamed from: x */
    public static final C28951b m7349x(InsertRecordsResponse insertRecordsResponse) {
        List<Record> records = insertRecordsResponse.getRecords();
        AbstractC22676k.m65749i(records, "records");
        List<Record> list = records;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String id4 = ((Record) it.next()).getMetadata().getId();
            AbstractC22676k.m65749i(id4, "record.metadata.id");
            arrayList.add(id4);
        }
        return new C28951b();
    }

    /* JADX INFO: renamed from: y */
    public static final DataOrigin m7350y(C26411a c26411a) {
        AbstractC22676k.m65750j(c26411a, "<this>");
        DataOrigin.Builder builder = new DataOrigin.Builder();
        builder.setPackageName(c26411a.f104886a);
        DataOrigin dataOriginBuild = builder.build();
        AbstractC22676k.m65749i(dataOriginBuild, "PlatformDataOriginBuilde…me(packageName) }.build()");
        return dataOriginBuild;
    }

    /* JADX INFO: renamed from: z */
    public static final Energy m7351z(C31020k c31020k) {
        AbstractC22676k.m65750j(c31020k, "<this>");
        Energy energyFromCalories = Energy.fromCalories(c31020k.m95554b());
        AbstractC22676k.m65749i(energyFromCalories, "fromCalories(inCalories)");
        return energyFromCalories;
    }
}
