package p213i7;

import android.health.connect.datatypes.ExerciseLap;
import android.health.connect.datatypes.ExerciseRoute;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Volume;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: renamed from: i7.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC18190c {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ExerciseLap.Builder m52179a(Instant instant, Instant instant2) {
        return new ExerciseLap.Builder(instant, instant2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ExerciseRoute.Location.Builder m52180b(Instant instant, double d3, double d14) {
        return new ExerciseRoute.Location.Builder(instant, d3, d14);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ExerciseRoute m52181c(ArrayList arrayList) {
        return new ExerciseRoute(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ HeartRateVariabilityRmssdRecord.Builder m52182d(Metadata metadata, Instant instant, double d3) {
        return new HeartRateVariabilityRmssdRecord.Builder(metadata, instant, d3);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ HeightRecord.Builder m52183e(Metadata metadata, Instant instant, Length length) {
        return new HeightRecord.Builder(metadata, instant, length);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ HydrationRecord.Builder m52184f(Metadata metadata, Instant instant, Instant instant2, Volume volume) {
        return new HydrationRecord.Builder(metadata, instant, instant2, volume);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ NutritionRecord.Builder m52185g(Metadata metadata, Instant instant, Instant instant2) {
        return new NutritionRecord.Builder(metadata, instant, instant2);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ OxygenSaturationRecord.Builder m52186h(Metadata metadata, Instant instant, Percentage percentage) {
        return new OxygenSaturationRecord.Builder(metadata, instant, percentage);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ RespiratoryRateRecord.Builder m52187i(Metadata metadata, Instant instant, double d3) {
        return new RespiratoryRateRecord.Builder(metadata, instant, d3);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ RestingHeartRateRecord.Builder m52188j(Metadata metadata, Instant instant, long j7) {
        return new RestingHeartRateRecord.Builder(metadata, instant, j7);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ StepsRecord.Builder m52189k(Metadata metadata, Instant instant, Instant instant2, long j7) {
        return new StepsRecord.Builder(metadata, instant, instant2, j7);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ WeightRecord.Builder m52190l(Metadata metadata, Instant instant, Mass mass) {
        return new WeightRecord.Builder(metadata, instant, mass);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m52191m() {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m52192n() {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m52193o() {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m52194p() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m52195q() {
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m52196r() {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m52197s() {
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m52198t() {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m52199u() {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m52200v() {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m52201w() {
    }
}
