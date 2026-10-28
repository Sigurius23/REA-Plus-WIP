package p110e7;

import android.health.connect.changelog.ChangeLogsRequest;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: renamed from: e7.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC12787h {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ChangeLogsRequest.Builder m35808a(String str) {
        return new ChangeLogsRequest.Builder(str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ExerciseSessionRecord.Builder m35809b(Metadata metadata, Instant instant, Instant instant2, int i13) {
        return new ExerciseSessionRecord.Builder(metadata, instant, instant2, i13);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ FloorsClimbedRecord.Builder m35810c(Metadata metadata, Instant instant, Instant instant2, double d3) {
        return new FloorsClimbedRecord.Builder(metadata, instant, instant2, d3);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ HeartRateRecord.Builder m35811d(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new HeartRateRecord.Builder(metadata, instant, instant2, arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ HeartRateRecord.HeartRateSample m35812e(long j7, Instant instant) {
        return new HeartRateRecord.HeartRateSample(j7, instant);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ IntermenstrualBleedingRecord.Builder m35813f(Metadata metadata, Instant instant) {
        return new IntermenstrualBleedingRecord.Builder(metadata, instant);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ MenstruationFlowRecord.Builder m35814g(Metadata metadata, Instant instant, int i13) {
        return new MenstruationFlowRecord.Builder(metadata, instant, i13);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ MenstruationPeriodRecord.Builder m35815h(Metadata metadata, Instant instant, Instant instant2) {
        return new MenstruationPeriodRecord.Builder(metadata, instant, instant2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ OvulationTestRecord.Builder m35816i(Metadata metadata, Instant instant, int i13) {
        return new OvulationTestRecord.Builder(metadata, instant, i13);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ PowerRecord.Builder m35817j(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new PowerRecord.Builder(metadata, instant, instant2, arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ SexualActivityRecord.Builder m35818k(Metadata metadata, Instant instant, int i13) {
        return new SexualActivityRecord.Builder(metadata, instant, i13);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ SleepSessionRecord.Builder m35819l(Metadata metadata, Instant instant, Instant instant2) {
        return new SleepSessionRecord.Builder(metadata, instant, instant2);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ SpeedRecord.Builder m35820m(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new SpeedRecord.Builder(metadata, instant, instant2, arrayList);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ StepsCadenceRecord.Builder m35821n(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new StepsCadenceRecord.Builder(metadata, instant, instant2, arrayList);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ StepsCadenceRecord.StepsCadenceRecordSample m35822o(double d3, Instant instant) {
        return new StepsCadenceRecord.StepsCadenceRecordSample(d3, instant);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Vo2MaxRecord.Builder m35823p(Metadata metadata, Instant instant, int i13, double d3) {
        return new Vo2MaxRecord.Builder(metadata, instant, i13, d3);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m35824q() {
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m35825r() {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m35826s() {
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m35827t() {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m35828u() {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m35829v() {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m35830w() {
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m35831x() {
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m35832y() {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m35833z() {
    }
}
