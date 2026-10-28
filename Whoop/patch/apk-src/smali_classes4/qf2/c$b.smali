.class final Lqf2/c$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqf2/c;->g(Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ls83/c;"
    }
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
    c = "com.whoop.smart.alarm.data.repository.LatestWakeTimeResetRepository"
    f = "LatestWakeTimeResetRepository.kt"
    l = {
        0x4a,
        0x2f
    }
    m = "obtainLwtState"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lqf2/c;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lqf2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqf2/c;",
            "Lq83/d<",
            "-",
            "Lqf2/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqf2/c$b;->F:Lqf2/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqf2/c$b;->E:Ljava/lang/Object;

    iget p1, p0, Lqf2/c$b;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqf2/c$b;->G:I

    iget-object p1, p0, Lqf2/c$b;->F:Lqf2/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lqf2/c;->g(Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
