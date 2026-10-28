.class final Lwk2/j$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwk2/j;->b(Lxk2/f;Lyg2/d;Ljava/lang/String;JLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.trackactivity.service.accumulators.StrainCaloriesAccumulator"
    f = "StrainCaloriesAccumulator.kt"
    l = {
        0x2a
    }
    m = "accumulate"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lwk2/j;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:J


# direct methods
.method public constructor <init>(Lwk2/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwk2/j;",
            "Lq83/d<",
            "-",
            "Lwk2/j$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwk2/j$c;->F:Lwk2/j;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lwk2/j$c;->E:Ljava/lang/Object;

    iget p1, p0, Lwk2/j$c;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwk2/j$c;->G:I

    iget-object v0, p0, Lwk2/j$c;->F:Lwk2/j;

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lwk2/j;->b(Lxk2/f;Lyg2/d;Ljava/lang/String;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
