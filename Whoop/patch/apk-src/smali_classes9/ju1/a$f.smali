.class final Lju1/a$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lju1/a;->q(Lvk0/i;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.labradorService.domain.LabradorServiceImpl"
    f = "LabradorServiceImpl.kt"
    l = {
        0x8c,
        0x8d,
        0x8e,
        0x94,
        0x94
    }
    m = "stopHistoricalAndRealtimeEcgCRP"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lju1/a;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lju1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lju1/a;",
            "Lq83/d<",
            "-",
            "Lju1/a$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lju1/a$f;->F:Lju1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lju1/a$f;->E:Ljava/lang/Object;

    iget p1, p0, Lju1/a$f;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lju1/a$f;->G:I

    iget-object p1, p0, Lju1/a$f;->F:Lju1/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lju1/a;->g(Lju1/a;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
