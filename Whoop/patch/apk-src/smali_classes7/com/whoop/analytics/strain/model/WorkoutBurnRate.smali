.class public Lcom/whoop/analytics/strain/model/WorkoutBurnRate;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private intercept:D

.field private slope:D


# direct methods
.method public constructor <init>(DD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/WorkoutBurnRate;->slope:D

    iput-wide p3, p0, Lcom/whoop/analytics/strain/model/WorkoutBurnRate;->intercept:D

    return-void
.end method


# virtual methods
.method public getIntercept()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/WorkoutBurnRate;->intercept:D

    return-wide v0
.end method

.method public getSlope()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/WorkoutBurnRate;->slope:D

    return-wide v0
.end method
