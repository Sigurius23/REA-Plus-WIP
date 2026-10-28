.class public final Lt9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/e0;


# instance fields
.field public final a:Lt9/e;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J


# direct methods
.method public constructor <init>(Lt9/e;JJJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt9/c;->a:Lt9/e;

    iput-wide p2, p0, Lt9/c;->b:J

    iput-wide p4, p0, Lt9/c;->c:J

    iput-wide p6, p0, Lt9/c;->d:J

    iput-wide p8, p0, Lt9/c;->e:J

    iput-wide p10, p0, Lt9/c;->f:J

    return-void
.end method


# virtual methods
.method public final c(J)Lt9/d0;
    .locals 13

    iget-object v0, p0, Lt9/c;->a:Lt9/e;

    invoke-interface {v0, p1, p2}, Lt9/e;->d(J)J

    move-result-wide v1

    iget-wide v9, p0, Lt9/c;->e:J

    iget-wide v11, p0, Lt9/c;->f:J

    const-wide/16 v3, 0x0

    iget-wide v5, p0, Lt9/c;->c:J

    iget-wide v7, p0, Lt9/c;->d:J

    invoke-static/range {v1 .. v12}, Lt9/d;->a(JJJJJJ)J

    move-result-wide v0

    new-instance v2, Lt9/d0;

    new-instance v3, Lt9/f0;

    invoke-direct {v3, p1, p2, v0, v1}, Lt9/f0;-><init>(JJ)V

    invoke-direct {v2, v3, v3}, Lt9/d0;-><init>(Lt9/f0;Lt9/f0;)V

    return-object v2
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lt9/c;->b:J

    return-wide v0
.end method
