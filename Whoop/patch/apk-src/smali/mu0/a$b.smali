.class final Lmu0/a$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmu0/a;->c(Lmu0/a;JIJJILq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.connectivityDataPacketsModels.metrics.dao.MetricsDataDao"
    f = "MetricsDataDao.kt"
    l = {
        0x4e,
        0x4f
    }
    m = "deleteMetricsDataByTimeStampAndVersionId$suspendImpl"
    v = 0x2
.end annotation


# instance fields
.field E:J

.field F:I

.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lmu0/a;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:J

.field z:J


# direct methods
.method public constructor <init>(Lmu0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu0/a;",
            "Lq83/d<",
            "-",
            "Lmu0/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmu0/a$b;->I:Lmu0/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iput-object p1, p0, Lmu0/a$b;->H:Ljava/lang/Object;

    iget p1, p0, Lmu0/a$b;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmu0/a$b;->J:I

    iget-object v0, p0, Lmu0/a$b;->I:Lmu0/a;

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Lmu0/a;->c(Lmu0/a;JIJJILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
