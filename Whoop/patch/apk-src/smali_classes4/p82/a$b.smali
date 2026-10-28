.class final Lp82/a$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp82/a;->a(JLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.sensorDataUpload.ProcessNowAnalyticsReporter"
    f = "ProcessNowAnalyticsReporter.kt"
    l = {
        0x48,
        0x6a,
        0x6f
    }
    m = "reportAnalytics"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:Ljava/lang/Object;

.field M:Ljava/lang/Object;

.field synthetic N:Ljava/lang/Object;

.field final synthetic O:Lp82/a;

.field P:I

.field w:J

.field x:J

.field y:J

.field z:J


# direct methods
.method public constructor <init>(Lp82/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp82/a;",
            "Lq83/d<",
            "-",
            "Lp82/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lp82/a$b;->O:Lp82/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lp82/a$b;->N:Ljava/lang/Object;

    iget p1, p0, Lp82/a$b;->P:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp82/a$b;->P:I

    iget-object p1, p0, Lp82/a$b;->O:Lp82/a;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lp82/a;->a(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
