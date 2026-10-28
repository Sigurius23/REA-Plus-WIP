.class final Lj51/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj51/f;->d(Lj51/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.challengeprogressgauge.ChallengeProgressGaugeKt$ChallengeProgressGauge$1$1"
    f = "ChallengeProgressGauge.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/z0;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lj51/g;

.field final synthetic z:Lp1/z0;


# direct methods
.method public constructor <init>(Lj51/g;Lp1/z0;Lp1/z0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj51/g;",
            "Lp1/z0;",
            "Lp1/z0;",
            "Lq83/d<",
            "-",
            "Lj51/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj51/f$a;->y:Lj51/g;

    iput-object p2, p0, Lj51/f$a;->z:Lp1/z0;

    iput-object p3, p0, Lj51/f$a;->E:Lp1/z0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj51/f$a;

    iget-object v1, p0, Lj51/f$a;->y:Lj51/g;

    iget-object v2, p0, Lj51/f$a;->z:Lp1/z0;

    iget-object v3, p0, Lj51/f$a;->E:Lp1/z0;

    invoke-direct {v0, v1, v2, v3, p2}, Lj51/f$a;-><init>(Lj51/g;Lp1/z0;Lp1/z0;Lq83/d;)V

    iput-object p1, v0, Lj51/f$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lj51/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj51/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj51/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj51/f$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lj51/f$a;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj51/f$a;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj51/f$a;->y:Lj51/g;

    invoke-virtual {p1}, Lj51/g;->y()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lj51/f$a;->z:Lp1/z0;

    iget-object v0, p0, Lj51/f$a;->y:Lj51/g;

    invoke-virtual {v0}, Lj51/g;->j()F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    add-float/2addr v0, v1

    invoke-static {p1, v0}, Lj51/f;->q(Lp1/z0;F)V

    iget-object p1, p0, Lj51/f$a;->E:Lp1/z0;

    iget-object v0, p0, Lj51/f$a;->y:Lj51/g;

    invoke-virtual {v0}, Lj51/g;->n()F

    move-result v0

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Le93/b;->m(FFF)F

    move-result v0

    invoke-static {p1, v0}, Lj51/f;->r(Lp1/z0;F)V

    goto :goto_0

    :cond_0
    new-instance p1, Lj51/f$a$a;

    iget-object v1, p0, Lj51/f$a;->y:Lj51/g;

    iget-object v2, p0, Lj51/f$a;->z:Lp1/z0;

    const/4 v3, 0x0

    invoke-direct {p1, v1, v2, v3}, Lj51/f$a$a;-><init>(Lj51/g;Lp1/z0;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {v0, v3, v3, p1, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance p1, Lj51/f$a$b;

    iget-object v2, p0, Lj51/f$a;->y:Lj51/g;

    iget-object v4, p0, Lj51/f$a;->E:Lp1/z0;

    invoke-direct {p1, v2, v4, v3}, Lj51/f$a$b;-><init>(Lj51/g;Lp1/z0;Lq83/d;)V

    invoke-static {v0, v3, v3, p1, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
