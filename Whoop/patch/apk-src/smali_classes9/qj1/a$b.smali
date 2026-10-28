.class final Lqj1/a$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj1/a;->i(Ljava/time/Instant;Ljava/time/Instant;Lb7/b;ZZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.healthconnect.repository.recordmanagers.HealthConnectBaseManager"
    f = "HealthConnectBaseManager.kt"
    l = {
        0x69,
        0x6f
    }
    m = "readRecordByTimeRange"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field F:Z

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lqj1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqj1/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lqj1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqj1/a<",
            "TT;>;",
            "Lq83/d<",
            "-",
            "Lqj1/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj1/a$b;->H:Lqj1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lqj1/a$b;->G:Ljava/lang/Object;

    iget p1, p0, Lqj1/a$b;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqj1/a$b;->I:I

    iget-object v0, p0, Lqj1/a$b;->H:Lqj1/a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lqj1/a;->e(Lqj1/a;Ljava/time/Instant;Ljava/time/Instant;Lb7/b;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
