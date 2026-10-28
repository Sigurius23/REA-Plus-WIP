package p110e7;

import android.health.connect.HealthConnectManager;
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
import android.health.connect.datatypes.units.BloodGlucose;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.Volume;
import bc3.C3033m;
import ge3.AbstractC15751g;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p027b3.AbstractC2378g1;
import p029b5.C2726e;
import p213i7.AbstractC18188a;
import p213i7.AbstractC18190c;
import p213i7.AbstractC18191d;
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
import p322m7.C25172s0;
import p322m7.C25173t;
import p322m7.C25174t0;
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
import p452r7.C31003b0;
import p452r7.C31020k;
import p452r7.C31036s;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: e7.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C12794o extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public List f43785w;

    /* JADX INFO: renamed from: x */
    public int f43786x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12797r f43787y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ List f43788z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12794o(C12797r c12797r, List list, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f43787y = c12797r;
        this.f43788z = list;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C12794o(this.f43787y, this.f43788z, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C12794o) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v70, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v77, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v47, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v48, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v30, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, java.util.Map] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Record recordM7319G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f43786x;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = this.f43785w;
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        List list2 = this.f43788z;
        this.f43785w = list2;
        this.f43786x = 1;
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(this));
        c3033m.m8774s();
        C12797r c12797r = this.f43787y;
        HealthConnectManager healthConnectManager = c12797r.f43797d;
        List<InterfaceC25170r0> list3 = list2;
        int i14 = 10;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        for (InterfaceC25170r0 interfaceC25170r0 : list3) {
            AbstractC22676k.m65750j(interfaceC25170r0, "<this>");
            if (interfaceC25170r0 instanceof C25127a) {
                C25127a c25127a = (C25127a) interfaceC25170r0;
                ActiveCaloriesBurnedRecord.Builder builder = new ActiveCaloriesBurnedRecord.Builder(AbstractC2378g1.m7315C(c25127a.f98493f), c25127a.f98488a, c25127a.f98490c, AbstractC2378g1.m7351z(c25127a.f98492e));
                ZoneOffset zoneOffset = c25127a.f98489b;
                if (zoneOffset != null) {
                    builder.setStartZoneOffset(zoneOffset);
                }
                ZoneOffset zoneOffset2 = c25127a.f98491d;
                if (zoneOffset2 != null) {
                    builder.setEndZoneOffset(zoneOffset2);
                }
                recordM7319G = builder.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformActiveCaloriesBu…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25130b) {
                C25130b c25130b = (C25130b) interfaceC25170r0;
                Metadata metadataM7315C = AbstractC2378g1.m7315C(c25130b.f98511e);
                Instant instant = c25130b.f98507a;
                Integer num = (Integer) AbstractC18188a.f70562m.get(Integer.valueOf(c25130b.f98510d));
                int iIntValue = num != null ? num.intValue() : 0;
                Temperature temperatureFromCelsius = Temperature.fromCelsius(c25130b.f98509c.f128013w);
                AbstractC22676k.m65749i(temperatureFromCelsius, "fromCelsius(inCelsius)");
                BasalBodyTemperatureRecord.Builder builder2 = new BasalBodyTemperatureRecord.Builder(metadataM7315C, instant, iIntValue, temperatureFromCelsius);
                ZoneOffset zoneOffset3 = c25130b.f98508b;
                if (zoneOffset3 != null) {
                    builder2.setZoneOffset(zoneOffset3);
                }
                recordM7319G = builder2.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformBasalBodyTempera…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25133c) {
                C25133c c25133c = (C25133c) interfaceC25170r0;
                BasalMetabolicRateRecord.Builder builder3 = new BasalMetabolicRateRecord.Builder(AbstractC2378g1.m7315C(c25133c.f98523d), c25133c.f98520a, AbstractC2378g1.m7316D(c25133c.f98522c));
                ZoneOffset zoneOffset4 = c25133c.f98521b;
                if (zoneOffset4 != null) {
                    builder3.setZoneOffset(zoneOffset4);
                }
                recordM7319G = builder3.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformBasalMetabolicRa…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25136d) {
                C25136d c25136d = (C25136d) interfaceC25170r0;
                Metadata metadataM7315C2 = AbstractC2378g1.m7315C(c25136d.f98542g);
                Instant instant2 = c25136d.f98536a;
                Integer num2 = (Integer) AbstractC18188a.f70572w.get(Integer.valueOf(c25136d.f98539d));
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                BloodGlucose bloodGlucoseFromMillimolesPerLiter = BloodGlucose.fromMillimolesPerLiter(c25136d.f98538c.m95543a());
                AbstractC22676k.m65749i(bloodGlucoseFromMillimolesPerLiter, "fromMillimolesPerLiter(inMillimolesPerLiter)");
                Integer num3 = (Integer) AbstractC18188a.f70574y.get(Integer.valueOf(c25136d.f98541f));
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                Integer num4 = (Integer) AbstractC18188a.f70556g.get(Integer.valueOf(c25136d.f98540e));
                BloodGlucoseRecord.Builder builder4 = new BloodGlucoseRecord.Builder(metadataM7315C2, instant2, iIntValue2, bloodGlucoseFromMillimolesPerLiter, iIntValue3, num4 != null ? num4.intValue() : 0);
                ZoneOffset zoneOffset5 = c25136d.f98537b;
                if (zoneOffset5 != null) {
                    builder4.setZoneOffset(zoneOffset5);
                }
                recordM7319G = builder4.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformBloodGlucoseReco…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25139e) {
                C25139e c25139e = (C25139e) interfaceC25170r0;
                Metadata metadataM7315C3 = AbstractC2378g1.m7315C(c25139e.f98570g);
                Instant instant3 = c25139e.f98564a;
                Integer num5 = (Integer) AbstractC18188a.f70564o.get(Integer.valueOf(c25139e.f98569f));
                int iIntValue4 = num5 != null ? num5.intValue() : 0;
                Pressure pressureFromMillimetersOfMercury = Pressure.fromMillimetersOfMercury(c25139e.f98566c.f128008w);
                AbstractC22676k.m65749i(pressureFromMillimetersOfMercury, "fromMillimetersOfMercury(inMillimetersOfMercury)");
                Pressure pressureFromMillimetersOfMercury2 = Pressure.fromMillimetersOfMercury(c25139e.f98567d.f128008w);
                AbstractC22676k.m65749i(pressureFromMillimetersOfMercury2, "fromMillimetersOfMercury(inMillimetersOfMercury)");
                Integer num6 = (Integer) AbstractC18188a.f70552c.get(Integer.valueOf(c25139e.f98568e));
                BloodPressureRecord.Builder builder5 = new BloodPressureRecord.Builder(metadataM7315C3, instant3, iIntValue4, pressureFromMillimetersOfMercury, pressureFromMillimetersOfMercury2, num6 != null ? num6.intValue() : 0);
                ZoneOffset zoneOffset6 = c25139e.f98565b;
                if (zoneOffset6 != null) {
                    builder5.setZoneOffset(zoneOffset6);
                }
                recordM7319G = builder5.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformBloodPressureRec…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25142f) {
                C25142f c25142f = (C25142f) interfaceC25170r0;
                Metadata metadataM7315C4 = AbstractC2378g1.m7315C(c25142f.f98582d);
                Instant instant4 = c25142f.f98579a;
                Percentage percentageFromValue = Percentage.fromValue(c25142f.f98581c.f127992w);
                AbstractC22676k.m65749i(percentageFromValue, "fromValue(value)");
                BodyFatRecord.Builder builder6 = new BodyFatRecord.Builder(metadataM7315C4, instant4, percentageFromValue);
                ZoneOffset zoneOffset7 = c25142f.f98580b;
                if (zoneOffset7 != null) {
                    builder6.setZoneOffset(zoneOffset7);
                }
                recordM7319G = builder6.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformBodyFatRecordBui…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25148h) {
                C25148h c25148h = (C25148h) interfaceC25170r0;
                Metadata metadataM7315C5 = AbstractC2378g1.m7315C(c25148h.f98604e);
                Instant instant5 = c25148h.f98600a;
                Integer num7 = (Integer) AbstractC18188a.f70562m.get(Integer.valueOf(c25148h.f98603d));
                int iIntValue5 = num7 != null ? num7.intValue() : 0;
                Temperature temperatureFromCelsius2 = Temperature.fromCelsius(c25148h.f98602c.f128013w);
                AbstractC22676k.m65749i(temperatureFromCelsius2, "fromCelsius(inCelsius)");
                BodyTemperatureRecord.Builder builder7 = new BodyTemperatureRecord.Builder(metadataM7315C5, instant5, iIntValue5, temperatureFromCelsius2);
                ZoneOffset zoneOffset8 = c25148h.f98601b;
                if (zoneOffset8 != null) {
                    builder7.setZoneOffset(zoneOffset8);
                }
                recordM7319G = builder7.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformBodyTemperatureR…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25151i) {
                C25151i c25151i = (C25151i) interfaceC25170r0;
                BodyWaterMassRecord.Builder builder8 = new BodyWaterMassRecord.Builder(AbstractC2378g1.m7315C(c25151i.f98620d), c25151i.f98617a, AbstractC2378g1.m7314B(c25151i.f98619c));
                ZoneOffset zoneOffset9 = c25151i.f98618b;
                if (zoneOffset9 != null) {
                    builder8.setZoneOffset(zoneOffset9);
                }
                recordM7319G = builder8.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformBodyWaterMassRec…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25153j) {
                C25153j c25153j = (C25153j) interfaceC25170r0;
                BoneMassRecord.Builder builder9 = new BoneMassRecord.Builder(AbstractC2378g1.m7315C(c25153j.f98627d), c25153j.f98624a, AbstractC2378g1.m7314B(c25153j.f98626c));
                ZoneOffset zoneOffset10 = c25153j.f98625b;
                if (zoneOffset10 != null) {
                    builder9.setZoneOffset(zoneOffset10);
                }
                recordM7319G = builder9.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformBoneMassRecordBu…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25155k) {
                C25155k c25155k = (C25155k) interfaceC25170r0;
                Metadata metadataM7315C6 = AbstractC2378g1.m7315C(c25155k.f98642e);
                Instant instant6 = c25155k.f98638a;
                Integer num8 = (Integer) AbstractC18188a.f70568s.get(Integer.valueOf(c25155k.f98641d));
                int iIntValue6 = num8 != null ? num8.intValue() : 0;
                Integer num9 = (Integer) AbstractC18188a.f70550a.get(Integer.valueOf(c25155k.f98640c));
                CervicalMucusRecord.Builder builder10 = new CervicalMucusRecord.Builder(metadataM7315C6, instant6, iIntValue6, num9 != null ? num9.intValue() : 0);
                ZoneOffset zoneOffset11 = c25155k.f98639b;
                if (zoneOffset11 != null) {
                    builder10.setZoneOffset(zoneOffset11);
                }
                recordM7319G = builder10.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformCervicalMucusRec…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25159m) {
                C25159m c25159m = (C25159m) interfaceC25170r0;
                Metadata metadataM7315C7 = AbstractC2378g1.m7315C(c25159m.f98658f);
                Instant instant7 = c25159m.f98653a;
                Instant instant8 = c25159m.f98655c;
                List<C25157l> list4 = c25159m.f98657e;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list4, i14));
                for (C25157l c25157l : list4) {
                    arrayList2.add(new CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample(c25157l.f98650b, c25157l.f98649a));
                    c25159m = c25159m;
                }
                CyclingPedalingCadenceRecord.Builder builder11 = new CyclingPedalingCadenceRecord.Builder(metadataM7315C7, instant7, instant8, arrayList2);
                ZoneOffset zoneOffset12 = c25159m.f98654b;
                if (zoneOffset12 != null) {
                    builder11.setStartZoneOffset(zoneOffset12);
                }
                ZoneOffset zoneOffset13 = c25159m.f98656d;
                if (zoneOffset13 != null) {
                    builder11.setEndZoneOffset(zoneOffset13);
                }
                recordM7319G = builder11.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformCyclingPedalingC…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25161n) {
                C25161n c25161n = (C25161n) interfaceC25170r0;
                DistanceRecord.Builder builder12 = new DistanceRecord.Builder(AbstractC2378g1.m7315C(c25161n.f98719f), c25161n.f98714a, c25161n.f98716c, AbstractC2378g1.m7313A(c25161n.f98718e));
                ZoneOffset zoneOffset14 = c25161n.f98715b;
                if (zoneOffset14 != null) {
                    builder12.setStartZoneOffset(zoneOffset14);
                }
                ZoneOffset zoneOffset15 = c25161n.f98717d;
                if (zoneOffset15 != null) {
                    builder12.setEndZoneOffset(zoneOffset15);
                }
                recordM7319G = builder12.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformDistanceRecordBu…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25163o) {
                C25163o c25163o = (C25163o) interfaceC25170r0;
                ElevationGainedRecord.Builder builderM52202a = AbstractC18191d.m52202a(AbstractC2378g1.m7315C(c25163o.f98733f), c25163o.f98728a, c25163o.f98730c, AbstractC2378g1.m7313A(c25163o.f98732e));
                ZoneOffset zoneOffset16 = c25163o.f98729b;
                if (zoneOffset16 != null) {
                    builderM52202a.setStartZoneOffset(zoneOffset16);
                }
                ZoneOffset zoneOffset17 = c25163o.f98731d;
                if (zoneOffset17 != null) {
                    builderM52202a.setEndZoneOffset(zoneOffset17);
                }
                recordM7319G = builderM52202a.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformElevationGainedR…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25179w) {
                C25179w c25179w = (C25179w) interfaceC25170r0;
                Metadata metadataM7315C8 = AbstractC2378g1.m7315C(c25179w.f98788h);
                Instant instant9 = c25179w.f98781a;
                Instant instant10 = c25179w.f98783c;
                Integer num10 = (Integer) AbstractC18188a.f70554e.get(Integer.valueOf(c25179w.f98785e));
                ExerciseSessionRecord.Builder builderM35809b = AbstractC12787h.m35809b(metadataM7315C8, instant9, instant10, num10 != null ? num10.intValue() : 0);
                ZoneOffset zoneOffset18 = c25179w.f98782b;
                if (zoneOffset18 != null) {
                    builderM35809b.setStartZoneOffset(zoneOffset18);
                }
                ZoneOffset zoneOffset19 = c25179w.f98784d;
                if (zoneOffset19 != null) {
                    builderM35809b.setEndZoneOffset(zoneOffset19);
                }
                String str = c25179w.f98787g;
                if (str != null) {
                    builderM35809b.setNotes(str);
                }
                String str2 = c25179w.f98786f;
                if (str2 != null) {
                    builderM35809b.setTitle(str2);
                }
                List<C25165p> list5 = c25179w.f98790j;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
                for (C25165p c25165p : list5) {
                    AbstractC18191d.m52209h();
                    ExerciseLap.Builder builderM52179a = AbstractC18190c.m52179a(c25165p.f98738a, c25165p.f98739b);
                    C31036s c31036s = c25165p.f98740c;
                    if (c31036s != null) {
                        builderM52179a.setLength(AbstractC2378g1.m7313A(c31036s));
                    }
                    ExerciseLap exerciseLapBuild = builderM52179a.build();
                    AbstractC22676k.m65749i(exerciseLapBuild, "PlatformExerciseLapBuild…h()) } }\n        .build()");
                    arrayList3.add(exerciseLapBuild);
                }
                builderM35809b.setLaps(arrayList3);
                List<C25177v> list6 = c25179w.f98789i;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list6, 10));
                for (C25177v c25177v : list6) {
                    AbstractC18191d.m52215n();
                    Instant instant11 = c25177v.f98769a;
                    Instant instant12 = c25177v.f98770b;
                    Integer num11 = (Integer) AbstractC18188a.f70546C.get(Integer.valueOf(c25177v.f98771c));
                    ExerciseSegment exerciseSegmentBuild = AbstractC18191d.m52203b(instant11, instant12, num11 != null ? num11.intValue() : 0).setRepetitionsCount(c25177v.f98772d).build();
                    AbstractC22676k.m65749i(exerciseSegmentBuild, "PlatformExerciseSegmentB…titions)\n        .build()");
                    arrayList4.add(exerciseSegmentBuild);
                }
                builderM35809b.setSegments(arrayList4);
                AbstractC22674j abstractC22674j = c25179w.f98791k;
                if (abstractC22674j instanceof C25173t) {
                    ArrayList<C25167q> arrayList5 = ((C25173t) abstractC22674j).f98761a.f98756a;
                    ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(arrayList5, 10));
                    for (C25167q c25167q : arrayList5) {
                        AbstractC18190c.m52193o();
                        ExerciseRoute.Location.Builder builderM52180b = AbstractC18190c.m52180b(c25167q.f98743a, c25167q.f98744b, c25167q.f98745c);
                        C31036s c31036s2 = c25167q.f98746d;
                        if (c31036s2 != null) {
                            builderM52180b.setHorizontalAccuracy(AbstractC2378g1.m7313A(c31036s2));
                        }
                        C31036s c31036s3 = c25167q.f98747e;
                        if (c31036s3 != null) {
                            builderM52180b.setVerticalAccuracy(AbstractC2378g1.m7313A(c31036s3));
                        }
                        C31036s c31036s4 = c25167q.f98748f;
                        if (c31036s4 != null) {
                            builderM52180b.setAltitude(AbstractC2378g1.m7313A(c31036s4));
                        }
                        arrayList6.add(builderM52180b.build());
                    }
                    builderM35809b.setRoute(AbstractC18190c.m52181c(arrayList6));
                }
                recordM7319G = builderM35809b.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformExerciseSessionR…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25181x) {
                C25181x c25181x = (C25181x) interfaceC25170r0;
                AbstractC12787h.m35825r();
                FloorsClimbedRecord.Builder builderM35810c = AbstractC12787h.m35810c(AbstractC2378g1.m7315C(c25181x.f98800f), c25181x.f98795a, c25181x.f98797c, c25181x.f98799e);
                ZoneOffset zoneOffset20 = c25181x.f98796b;
                if (zoneOffset20 != null) {
                    builderM35810c.setStartZoneOffset(zoneOffset20);
                }
                ZoneOffset zoneOffset21 = c25181x.f98798d;
                if (zoneOffset21 != null) {
                    builderM35810c.setEndZoneOffset(zoneOffset21);
                }
                recordM7319G = builderM35810c.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformFloorsClimbedRec…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25185z) {
                C25185z c25185z = (C25185z) interfaceC25170r0;
                Metadata metadataM7315C9 = AbstractC2378g1.m7315C(c25185z.f98826f);
                Instant instant13 = c25185z.f98821a;
                Instant instant14 = c25185z.f98823c;
                List<C25183y> list7 = c25185z.f98825e;
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(list7, 10));
                for (C25183y c25183y : list7) {
                    AbstractC18190c.m52197s();
                    arrayList7.add(AbstractC12787h.m35812e(c25183y.f98812b, c25183y.f98811a));
                }
                HeartRateRecord.Builder builderM35811d = AbstractC12787h.m35811d(metadataM7315C9, instant13, instant14, arrayList7);
                ZoneOffset zoneOffset22 = c25185z.f98822b;
                if (zoneOffset22 != null) {
                    builderM35811d.setStartZoneOffset(zoneOffset22);
                }
                ZoneOffset zoneOffset23 = c25185z.f98824d;
                if (zoneOffset23 != null) {
                    builderM35811d.setEndZoneOffset(zoneOffset23);
                }
                recordM7319G = builderM35811d.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformHeartRateRecordB…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25128a0) {
                C25128a0 c25128a0 = (C25128a0) interfaceC25170r0;
                AbstractC18190c.m52198t();
                HeartRateVariabilityRmssdRecord.Builder builderM52182d = AbstractC18190c.m52182d(AbstractC2378g1.m7315C(c25128a0.f98497d), c25128a0.f98494a, c25128a0.f98496c);
                ZoneOffset zoneOffset24 = c25128a0.f98495b;
                if (zoneOffset24 != null) {
                    builderM52182d.setZoneOffset(zoneOffset24);
                }
                recordM7319G = builderM52182d.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformHeartRateVariabi…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25131b0) {
                C25131b0 c25131b0 = (C25131b0) interfaceC25170r0;
                AbstractC18190c.m52195q();
                HeightRecord.Builder builderM52183e = AbstractC18190c.m52183e(AbstractC2378g1.m7315C(c25131b0.f98516d), c25131b0.f98513a, AbstractC2378g1.m7313A(c25131b0.f98515c));
                ZoneOffset zoneOffset25 = c25131b0.f98514b;
                if (zoneOffset25 != null) {
                    builderM52183e.setZoneOffset(zoneOffset25);
                }
                recordM7319G = builderM52183e.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformHeightRecordBuil…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25137d0) {
                C25137d0 c25137d0 = (C25137d0) interfaceC25170r0;
                AbstractC18190c.m52194p();
                Metadata metadataM7315C10 = AbstractC2378g1.m7315C(c25137d0.f98549f);
                Instant instant15 = c25137d0.f98544a;
                Instant instant16 = c25137d0.f98546c;
                Volume volumeFromLiters = Volume.fromLiters(c25137d0.f98548e.m95569a());
                AbstractC22676k.m65749i(volumeFromLiters, "fromLiters(inLiters)");
                HydrationRecord.Builder builderM52184f = AbstractC18190c.m52184f(metadataM7315C10, instant15, instant16, volumeFromLiters);
                ZoneOffset zoneOffset26 = c25137d0.f98545b;
                if (zoneOffset26 != null) {
                    builderM52184f.setStartZoneOffset(zoneOffset26);
                }
                ZoneOffset zoneOffset27 = c25137d0.f98547d;
                if (zoneOffset27 != null) {
                    builderM52184f.setEndZoneOffset(zoneOffset27);
                }
                recordM7319G = builderM52184f.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformHydrationRecordB…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25143f0) {
                C25143f0 c25143f0 = (C25143f0) interfaceC25170r0;
                AbstractC12787h.m35829v();
                IntermenstrualBleedingRecord.Builder builderM35813f = AbstractC12787h.m35813f(AbstractC2378g1.m7315C(c25143f0.f98585c), c25143f0.f98583a);
                ZoneOffset zoneOffset28 = c25143f0.f98584b;
                if (zoneOffset28 != null) {
                    builderM35813f.setZoneOffset(zoneOffset28);
                }
                recordM7319G = builderM35813f.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformIntermenstrualBl…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25149h0) {
                C25149h0 c25149h0 = (C25149h0) interfaceC25170r0;
                AbstractC18191d.m52210i();
                LeanBodyMassRecord.Builder builderM52204c = AbstractC18191d.m52204c(AbstractC2378g1.m7315C(c25149h0.f98609d), c25149h0.f98606a, AbstractC2378g1.m7314B(c25149h0.f98608c));
                ZoneOffset zoneOffset29 = c25149h0.f98607b;
                if (zoneOffset29 != null) {
                    builderM52204c.setZoneOffset(zoneOffset29);
                }
                recordM7319G = builderM52204c.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformLeanBodyMassReco…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25154j0) {
                C25154j0 c25154j0 = (C25154j0) interfaceC25170r0;
                AbstractC12787h.m35832y();
                Metadata metadataM7315C11 = AbstractC2378g1.m7315C(c25154j0.f98633d);
                Instant instant17 = c25154j0.f98630a;
                Integer num12 = (Integer) AbstractC18188a.f70560k.get(Integer.valueOf(c25154j0.f98632c));
                MenstruationFlowRecord.Builder builderM35814g = AbstractC12787h.m35814g(metadataM7315C11, instant17, num12 != null ? num12.intValue() : 0);
                ZoneOffset zoneOffset30 = c25154j0.f98631b;
                if (zoneOffset30 != null) {
                    builderM35814g.setZoneOffset(zoneOffset30);
                }
                recordM7319G = builderM35814g.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformMenstruationFlow…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25156k0) {
                C25156k0 c25156k0 = (C25156k0) interfaceC25170r0;
                AbstractC12787h.m35831x();
                MenstruationPeriodRecord.Builder builderM35815h = AbstractC12787h.m35815h(AbstractC2378g1.m7315C(c25156k0.f98648e), c25156k0.f98644a, c25156k0.f98646c);
                ZoneOffset zoneOffset31 = c25156k0.f98645b;
                if (zoneOffset31 != null) {
                    builderM35815h.setStartZoneOffset(zoneOffset31);
                }
                ZoneOffset zoneOffset32 = c25156k0.f98647d;
                if (zoneOffset32 != null) {
                    builderM35815h.setEndZoneOffset(zoneOffset32);
                }
                recordM7319G = builderM35815h.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformMenstruationPeri…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25160m0) {
                C25160m0 c25160m0 = (C25160m0) interfaceC25170r0;
                AbstractC18190c.m52201w();
                NutritionRecord.Builder builderM52185g = AbstractC18190c.m52185g(AbstractC2378g1.m7315C(c25160m0.f98686W), c25160m0.f98687a, c25160m0.f98689c);
                Integer num13 = (Integer) AbstractC18188a.f70556g.get(Integer.valueOf(c25160m0.f98685V));
                NutritionRecord.Builder mealType = builderM52185g.setMealType(num13 != null ? num13.intValue() : 0);
                ZoneOffset zoneOffset33 = c25160m0.f98688b;
                if (zoneOffset33 != null) {
                    mealType.setStartZoneOffset(zoneOffset33);
                }
                ZoneOffset zoneOffset34 = c25160m0.f98690d;
                if (zoneOffset34 != null) {
                    mealType.setEndZoneOffset(zoneOffset34);
                }
                C31003b0 c31003b0 = c25160m0.f98691e;
                if (c31003b0 != null) {
                    mealType.setBiotin(AbstractC2378g1.m7314B(c31003b0));
                }
                C31003b0 c31003b1 = c25160m0.f98692f;
                if (c31003b1 != null) {
                    mealType.setCaffeine(AbstractC2378g1.m7314B(c31003b1));
                }
                C31003b0 c31003b2 = c25160m0.f98693g;
                if (c31003b2 != null) {
                    mealType.setCalcium(AbstractC2378g1.m7314B(c31003b2));
                }
                C31003b0 c31003b3 = c25160m0.f98696j;
                if (c31003b3 != null) {
                    mealType.setChloride(AbstractC2378g1.m7314B(c31003b3));
                }
                C31003b0 c31003b4 = c25160m0.f98697k;
                if (c31003b4 != null) {
                    mealType.setCholesterol(AbstractC2378g1.m7314B(c31003b4));
                }
                C31003b0 c31003b5 = c25160m0.f98698l;
                if (c31003b5 != null) {
                    mealType.setChromium(AbstractC2378g1.m7314B(c31003b5));
                }
                C31003b0 c31003b6 = c25160m0.f98699m;
                if (c31003b6 != null) {
                    mealType.setCopper(AbstractC2378g1.m7314B(c31003b6));
                }
                C31003b0 c31003b7 = c25160m0.f98700n;
                if (c31003b7 != null) {
                    mealType.setDietaryFiber(AbstractC2378g1.m7314B(c31003b7));
                }
                C31020k c31020k = c25160m0.f98694h;
                if (c31020k != null) {
                    mealType.setEnergy(AbstractC2378g1.m7351z(c31020k));
                }
                C31020k c31020k2 = c25160m0.f98695i;
                if (c31020k2 != null) {
                    mealType.setEnergyFromFat(AbstractC2378g1.m7351z(c31020k2));
                }
                C31003b0 c31003b8 = c25160m0.f98701o;
                if (c31003b8 != null) {
                    mealType.setFolate(AbstractC2378g1.m7314B(c31003b8));
                }
                C31003b0 c31003b9 = c25160m0.f98702p;
                if (c31003b9 != null) {
                    mealType.setFolicAcid(AbstractC2378g1.m7314B(c31003b9));
                }
                C31003b0 c31003b10 = c25160m0.f98703q;
                if (c31003b10 != null) {
                    mealType.setIodine(AbstractC2378g1.m7314B(c31003b10));
                }
                C31003b0 c31003b11 = c25160m0.f98704r;
                if (c31003b11 != null) {
                    mealType.setIron(AbstractC2378g1.m7314B(c31003b11));
                }
                C31003b0 c31003b12 = c25160m0.f98705s;
                if (c31003b12 != null) {
                    mealType.setMagnesium(AbstractC2378g1.m7314B(c31003b12));
                }
                C31003b0 c31003b13 = c25160m0.f98706t;
                if (c31003b13 != null) {
                    mealType.setManganese(AbstractC2378g1.m7314B(c31003b13));
                }
                C31003b0 c31003b14 = c25160m0.f98707u;
                if (c31003b14 != null) {
                    mealType.setMolybdenum(AbstractC2378g1.m7314B(c31003b14));
                }
                C31003b0 c31003b15 = c25160m0.f98708v;
                if (c31003b15 != null) {
                    mealType.setMonounsaturatedFat(AbstractC2378g1.m7314B(c31003b15));
                }
                String str3 = c25160m0.f98684U;
                if (str3 != null) {
                    mealType.setMealName(str3);
                }
                C31003b0 c31003b16 = c25160m0.f98709w;
                if (c31003b16 != null) {
                    mealType.setNiacin(AbstractC2378g1.m7314B(c31003b16));
                }
                C31003b0 c31003b17 = c25160m0.f98710x;
                if (c31003b17 != null) {
                    mealType.setPantothenicAcid(AbstractC2378g1.m7314B(c31003b17));
                }
                C31003b0 c31003b18 = c25160m0.f98711y;
                if (c31003b18 != null) {
                    mealType.setPhosphorus(AbstractC2378g1.m7314B(c31003b18));
                }
                C31003b0 c31003b19 = c25160m0.f98712z;
                if (c31003b19 != null) {
                    mealType.setPolyunsaturatedFat(AbstractC2378g1.m7314B(c31003b19));
                }
                C31003b0 c31003b20 = c25160m0.f98664A;
                if (c31003b20 != null) {
                    mealType.setPotassium(AbstractC2378g1.m7314B(c31003b20));
                }
                C31003b0 c31003b21 = c25160m0.f98665B;
                if (c31003b21 != null) {
                    mealType.setProtein(AbstractC2378g1.m7314B(c31003b21));
                }
                C31003b0 c31003b22 = c25160m0.f98666C;
                if (c31003b22 != null) {
                    mealType.setRiboflavin(AbstractC2378g1.m7314B(c31003b22));
                }
                C31003b0 c31003b23 = c25160m0.f98667D;
                if (c31003b23 != null) {
                    mealType.setSaturatedFat(AbstractC2378g1.m7314B(c31003b23));
                }
                C31003b0 c31003b24 = c25160m0.f98668E;
                if (c31003b24 != null) {
                    mealType.setSelenium(AbstractC2378g1.m7314B(c31003b24));
                }
                C31003b0 c31003b25 = c25160m0.f98669F;
                if (c31003b25 != null) {
                    mealType.setSodium(AbstractC2378g1.m7314B(c31003b25));
                }
                C31003b0 c31003b26 = c25160m0.f98670G;
                if (c31003b26 != null) {
                    mealType.setSugar(AbstractC2378g1.m7314B(c31003b26));
                }
                C31003b0 c31003b27 = c25160m0.f98671H;
                if (c31003b27 != null) {
                    mealType.setThiamin(AbstractC2378g1.m7314B(c31003b27));
                }
                C31003b0 c31003b28 = c25160m0.f98672I;
                if (c31003b28 != null) {
                    mealType.setTotalCarbohydrate(AbstractC2378g1.m7314B(c31003b28));
                }
                C31003b0 c31003b29 = c25160m0.f98673J;
                if (c31003b29 != null) {
                    mealType.setTotalFat(AbstractC2378g1.m7314B(c31003b29));
                }
                C31003b0 c31003b30 = c25160m0.f98674K;
                if (c31003b30 != null) {
                    mealType.setTransFat(AbstractC2378g1.m7314B(c31003b30));
                }
                C31003b0 c31003b31 = c25160m0.f98675L;
                if (c31003b31 != null) {
                    mealType.setUnsaturatedFat(AbstractC2378g1.m7314B(c31003b31));
                }
                C31003b0 c31003b32 = c25160m0.f98676M;
                if (c31003b32 != null) {
                    mealType.setVitaminA(AbstractC2378g1.m7314B(c31003b32));
                }
                C31003b0 c31003b33 = c25160m0.f98678O;
                if (c31003b33 != null) {
                    mealType.setVitaminB6(AbstractC2378g1.m7314B(c31003b33));
                }
                C31003b0 c31003b34 = c25160m0.f98677N;
                if (c31003b34 != null) {
                    mealType.setVitaminB12(AbstractC2378g1.m7314B(c31003b34));
                }
                C31003b0 c31003b35 = c25160m0.f98679P;
                if (c31003b35 != null) {
                    mealType.setVitaminC(AbstractC2378g1.m7314B(c31003b35));
                }
                C31003b0 c31003b36 = c25160m0.f98680Q;
                if (c31003b36 != null) {
                    mealType.setVitaminD(AbstractC2378g1.m7314B(c31003b36));
                }
                C31003b0 c31003b37 = c25160m0.f98681R;
                if (c31003b37 != null) {
                    mealType.setVitaminE(AbstractC2378g1.m7314B(c31003b37));
                }
                C31003b0 c31003b38 = c25160m0.f98682S;
                if (c31003b38 != null) {
                    mealType.setVitaminK(AbstractC2378g1.m7314B(c31003b38));
                }
                C31003b0 c31003b39 = c25160m0.f98683T;
                if (c31003b39 != null) {
                    mealType.setZinc(AbstractC2378g1.m7314B(c31003b39));
                }
                recordM7319G = mealType.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformNutritionRecordB…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25162n0) {
                C25162n0 c25162n0 = (C25162n0) interfaceC25170r0;
                AbstractC12787h.m35827t();
                Metadata metadataM7315C12 = AbstractC2378g1.m7315C(c25162n0.f98725d);
                Instant instant18 = c25162n0.f98722a;
                Integer num14 = (Integer) AbstractC18188a.f70566q.get(Integer.valueOf(c25162n0.f98724c));
                OvulationTestRecord.Builder builderM35816i = AbstractC12787h.m35816i(metadataM7315C12, instant18, num14 != null ? num14.intValue() : 0);
                ZoneOffset zoneOffset35 = c25162n0.f98723b;
                if (zoneOffset35 != null) {
                    builderM35816i.setZoneOffset(zoneOffset35);
                }
                recordM7319G = builderM35816i.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformOvulationTestRec…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25164o0) {
                C25164o0 c25164o0 = (C25164o0) interfaceC25170r0;
                AbstractC18190c.m52192n();
                Metadata metadataM7315C13 = AbstractC2378g1.m7315C(c25164o0.f98737d);
                Instant instant19 = c25164o0.f98734a;
                Percentage percentageFromValue2 = Percentage.fromValue(c25164o0.f98736c.f127992w);
                AbstractC22676k.m65749i(percentageFromValue2, "fromValue(value)");
                OxygenSaturationRecord.Builder builderM52186h = AbstractC18190c.m52186h(metadataM7315C13, instant19, percentageFromValue2);
                ZoneOffset zoneOffset36 = c25164o0.f98735b;
                if (zoneOffset36 != null) {
                    builderM52186h.setZoneOffset(zoneOffset36);
                }
                recordM7319G = builderM52186h.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformOxygenSaturation…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25168q0) {
                C25168q0 c25168q0 = (C25168q0) interfaceC25170r0;
                Metadata metadataM7315C14 = AbstractC2378g1.m7315C(c25168q0.f98755f);
                Instant instant20 = c25168q0.f98750a;
                Instant instant21 = c25168q0.f98752c;
                List<C25166p0> list8 = c25168q0.f98754e;
                ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(list8, 10));
                for (C25166p0 c25166p0 : list8) {
                    AbstractC18191d.m52213l();
                    arrayList8.add(AbstractC18191d.m52205d(AbstractC2378g1.m7316D(c25166p0.f98742b), c25166p0.f98741a));
                }
                PowerRecord.Builder builderM35817j = AbstractC12787h.m35817j(metadataM7315C14, instant20, instant21, arrayList8);
                ZoneOffset zoneOffset37 = c25168q0.f98751b;
                if (zoneOffset37 != null) {
                    builderM35817j.setStartZoneOffset(zoneOffset37);
                }
                ZoneOffset zoneOffset38 = c25168q0.f98753d;
                if (zoneOffset38 != null) {
                    builderM35817j.setEndZoneOffset(zoneOffset38);
                }
                recordM7319G = builderM35817j.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformPowerRecordBuild…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25172s0) {
                C25172s0 c25172s0 = (C25172s0) interfaceC25170r0;
                AbstractC18190c.m52196r();
                RespiratoryRateRecord.Builder builderM52187i = AbstractC18190c.m52187i(AbstractC2378g1.m7315C(c25172s0.f98760d), c25172s0.f98757a, c25172s0.f98759c);
                ZoneOffset zoneOffset39 = c25172s0.f98758b;
                if (zoneOffset39 != null) {
                    builderM52187i.setZoneOffset(zoneOffset39);
                }
                recordM7319G = builderM52187i.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformRespiratoryRateR…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25174t0) {
                C25174t0 c25174t0 = (C25174t0) interfaceC25170r0;
                AbstractC18190c.m52199u();
                RestingHeartRateRecord.Builder builderM52188j = AbstractC18190c.m52188j(AbstractC2378g1.m7315C(c25174t0.f98765d), c25174t0.f98762a, c25174t0.f98764c);
                ZoneOffset zoneOffset40 = c25174t0.f98763b;
                if (zoneOffset40 != null) {
                    builderM52188j.setZoneOffset(zoneOffset40);
                }
                recordM7319G = builderM52188j.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformRestingHeartRate…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25178v0) {
                C25178v0 c25178v0 = (C25178v0) interfaceC25170r0;
                AbstractC12787h.m35826s();
                Metadata metadataM7315C15 = AbstractC2378g1.m7315C(c25178v0.f98778d);
                Instant instant22 = c25178v0.f98775a;
                Integer num15 = (Integer) AbstractC18188a.f70570u.get(Integer.valueOf(c25178v0.f98777c));
                SexualActivityRecord.Builder builderM35818k = AbstractC12787h.m35818k(metadataM7315C15, instant22, num15 != null ? num15.intValue() : 0);
                ZoneOffset zoneOffset41 = c25178v0.f98776b;
                if (zoneOffset41 != null) {
                    builderM35818k.setZoneOffset(zoneOffset41);
                }
                recordM7319G = builderM35818k.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformSexualActivityRe…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25182x0) {
                C25182x0 c25182x0 = (C25182x0) interfaceC25170r0;
                AbstractC12787h.m35828u();
                SleepSessionRecord.Builder builderM35819l = AbstractC12787h.m35819l(AbstractC2378g1.m7315C(c25182x0.f98810h), c25182x0.f98803a, c25182x0.f98805c);
                ZoneOffset zoneOffset42 = c25182x0.f98804b;
                if (zoneOffset42 != null) {
                    builderM35819l.setStartZoneOffset(zoneOffset42);
                }
                ZoneOffset zoneOffset43 = c25182x0.f98806d;
                if (zoneOffset43 != null) {
                    builderM35819l.setEndZoneOffset(zoneOffset43);
                }
                String str4 = c25182x0.f98808f;
                if (str4 != null) {
                    builderM35819l.setNotes(str4);
                }
                String str5 = c25182x0.f98807e;
                if (str5 != null) {
                    builderM35819l.setTitle(str5);
                }
                List<C25180w0> list9 = c25182x0.f98809g;
                ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(list9, 10));
                for (C25180w0 c25180w0 : list9) {
                    AbstractC18191d.m52214m();
                    Instant instant23 = c25180w0.f98792a;
                    Instant instant24 = c25180w0.f98793b;
                    Integer num16 = (Integer) AbstractC18188a.f70544A.get(Integer.valueOf(c25180w0.f98794c));
                    arrayList9.add(AbstractC18191d.m52206e(instant23, instant24, num16 != null ? num16.intValue() : 0));
                }
                builderM35819l.setStages(arrayList9);
                recordM7319G = builderM35819l.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformSleepSessionReco…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25129a1) {
                C25129a1 c25129a1 = (C25129a1) interfaceC25170r0;
                Metadata metadataM7315C16 = AbstractC2378g1.m7315C(c25129a1.f98504f);
                Instant instant25 = c25129a1.f98499a;
                Instant instant26 = c25129a1.f98501c;
                List<C25186z0> list10 = c25129a1.f98503e;
                ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(list10, 10));
                for (C25186z0 c25186z0 : list10) {
                    AbstractC18191d.m52212k();
                    arrayList10.add(AbstractC18191d.m52207f(AbstractC2378g1.m7318F(c25186z0.f98828b), c25186z0.f98827a));
                }
                SpeedRecord.Builder builderM35820m = AbstractC12787h.m35820m(metadataM7315C16, instant25, instant26, arrayList10);
                ZoneOffset zoneOffset44 = c25129a1.f98500b;
                if (zoneOffset44 != null) {
                    builderM35820m.setStartZoneOffset(zoneOffset44);
                }
                ZoneOffset zoneOffset45 = c25129a1.f98502d;
                if (zoneOffset45 != null) {
                    builderM35820m.setEndZoneOffset(zoneOffset45);
                }
                recordM7319G = builderM35820m.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformSpeedRecordBuild…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25135c1) {
                C25135c1 c25135c1 = (C25135c1) interfaceC25170r0;
                Metadata metadataM7315C17 = AbstractC2378g1.m7315C(c25135c1.f98530f);
                Instant instant27 = c25135c1.f98525a;
                Instant instant28 = c25135c1.f98527c;
                List<C25132b1> list11 = c25135c1.f98529e;
                ArrayList arrayList11 = new ArrayList(AbstractC25267u.m74163i0(list11, 10));
                for (C25132b1 c25132b1 : list11) {
                    AbstractC12787h.m35830w();
                    arrayList11.add(AbstractC12787h.m35822o(c25132b1.f98518b, c25132b1.f98517a));
                }
                StepsCadenceRecord.Builder builderM35821n = AbstractC12787h.m35821n(metadataM7315C17, instant27, instant28, arrayList11);
                ZoneOffset zoneOffset46 = c25135c1.f98526b;
                if (zoneOffset46 != null) {
                    builderM35821n.setStartZoneOffset(zoneOffset46);
                }
                ZoneOffset zoneOffset47 = c25135c1.f98528d;
                if (zoneOffset47 != null) {
                    builderM35821n.setEndZoneOffset(zoneOffset47);
                }
                recordM7319G = builderM35821n.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformStepsCadenceReco…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25138d1) {
                C25138d1 c25138d1 = (C25138d1) interfaceC25170r0;
                AbstractC18190c.m52191m();
                StepsRecord.Builder builderM52189k = AbstractC18190c.m52189k(AbstractC2378g1.m7315C(c25138d1.f98555f), c25138d1.f98550a, c25138d1.f98552c, c25138d1.f98554e);
                ZoneOffset zoneOffset48 = c25138d1.f98551b;
                if (zoneOffset48 != null) {
                    builderM52189k.setStartZoneOffset(zoneOffset48);
                }
                ZoneOffset zoneOffset49 = c25138d1.f98553d;
                if (zoneOffset49 != null) {
                    builderM52189k.setEndZoneOffset(zoneOffset49);
                }
                recordM7319G = builderM52189k.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformStepsRecordBuild…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25141e1) {
                C25141e1 c25141e1 = (C25141e1) interfaceC25170r0;
                AbstractC18191d.m52211j();
                TotalCaloriesBurnedRecord.Builder builderM52208g = AbstractC18191d.m52208g(AbstractC2378g1.m7315C(c25141e1.f98577f), c25141e1.f98572a, c25141e1.f98574c, AbstractC2378g1.m7351z(c25141e1.f98576e));
                ZoneOffset zoneOffset50 = c25141e1.f98573b;
                if (zoneOffset50 != null) {
                    builderM52208g.setStartZoneOffset(zoneOffset50);
                }
                ZoneOffset zoneOffset51 = c25141e1.f98575d;
                if (zoneOffset51 != null) {
                    builderM52208g.setEndZoneOffset(zoneOffset51);
                }
                recordM7319G = builderM52208g.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformTotalCaloriesBur…       }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25144f1) {
                C25144f1 c25144f1 = (C25144f1) interfaceC25170r0;
                AbstractC12787h.m35833z();
                Metadata metadataM7315C18 = AbstractC2378g1.m7315C(c25144f1.f98592e);
                Instant instant29 = c25144f1.f98588a;
                Integer num17 = (Integer) AbstractC18188a.f70558i.get(Integer.valueOf(c25144f1.f98591d));
                Vo2MaxRecord.Builder builderM35823p = AbstractC12787h.m35823p(metadataM7315C18, instant29, num17 != null ? num17.intValue() : 0, c25144f1.f98590c);
                ZoneOffset zoneOffset52 = c25144f1.f98589b;
                if (zoneOffset52 != null) {
                    builderM35823p.setZoneOffset(zoneOffset52);
                }
                recordM7319G = builderM35823p.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformVo2MaxRecordBuil…(it) } }\n        .build()");
            } else if (interfaceC25170r0 instanceof C25147g1) {
                C25147g1 c25147g1 = (C25147g1) interfaceC25170r0;
                AbstractC18190c.m52200v();
                WeightRecord.Builder builderM52190l = AbstractC18190c.m52190l(AbstractC2378g1.m7315C(c25147g1.f98599d), c25147g1.f98596a, AbstractC2378g1.m7314B(c25147g1.f98598c));
                ZoneOffset zoneOffset53 = c25147g1.f98597b;
                if (zoneOffset53 != null) {
                    builderM52190l.setZoneOffset(zoneOffset53);
                }
                recordM7319G = builderM52190l.build();
                AbstractC22676k.m65749i(recordM7319G, "PlatformWeightRecordBuil…(it) } }\n        .build()");
            } else {
                if (!(interfaceC25170r0 instanceof C25150h1)) {
                    throw new IllegalArgumentException("Unsupported record " + interfaceC25170r0);
                }
                recordM7319G = AbstractC2378g1.m7319G((C25150h1) interfaceC25170r0);
            }
            arrayList.add(recordM7319G);
            i14 = 10;
        }
        healthConnectManager.insertRecords(arrayList, c12797r.f43795b, new C2726e(c3033m));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
        return objM8773r == enumC31071a ? enumC31071a : objM8773r;
    }
}
