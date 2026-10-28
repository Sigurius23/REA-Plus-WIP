package p213i7;

import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseSegment;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Velocity;
import java.time.Instant;

/* JADX INFO: renamed from: i7.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC18191d {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ElevationGainedRecord.Builder m52202a(Metadata metadata, Instant instant, Instant instant2, Length length) {
        return new ElevationGainedRecord.Builder(metadata, instant, instant2, length);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ExerciseSegment.Builder m52203b(Instant instant, Instant instant2, int i13) {
        return new ExerciseSegment.Builder(instant, instant2, i13);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ LeanBodyMassRecord.Builder m52204c(Metadata metadata, Instant instant, Mass mass) {
        return new LeanBodyMassRecord.Builder(metadata, instant, mass);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ PowerRecord.PowerRecordSample m52205d(Power power, Instant instant) {
        return new PowerRecord.PowerRecordSample(power, instant);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ SleepSessionRecord.Stage m52206e(Instant instant, Instant instant2, int i13) {
        return new SleepSessionRecord.Stage(instant, instant2, i13);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ SpeedRecord.SpeedRecordSample m52207f(Velocity velocity, Instant instant) {
        return new SpeedRecord.SpeedRecordSample(velocity, instant);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ TotalCaloriesBurnedRecord.Builder m52208g(Metadata metadata, Instant instant, Instant instant2, Energy energy) {
        return new TotalCaloriesBurnedRecord.Builder(metadata, instant, instant2, energy);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m52209h() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m52210i() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m52211j() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m52212k() {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m52213l() {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m52214m() {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m52215n() {
    }
}
