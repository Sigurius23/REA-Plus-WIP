.class final Lj51/f$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj51/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.design.atomic.organism.challengeprogressgauge.ChallengeProgressGaugeKt$ChallengeProgressGauge$1$1$1"
    f = "ChallengeProgressGauge.kt"
    l = {
        0x55
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lj51/g;

.field final synthetic y:Lp1/z0;


# direct methods
.method public constructor <init>(Lj51/g;Lp1/z0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj51/g;",
            "Lp1/z0;",
            "Lq83/d<",
            "-",
            "Lj51/f$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj51/f$a$a;->x:Lj51/g;

    iput-object p2, p0, Lj51/f$a$a;->y:Lp1/z0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/z0;FF)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lj51/f$a$a;->h(Lp1/z0;FF)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lp1/z0;FF)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lj51/f;->q(Lp1/z0;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lj51/f$a$a;

    iget-object v0, p0, Lj51/f$a$a;->x:Lj51/g;

    iget-object v1, p0, Lj51/f$a$a;->y:Lp1/z0;

    invoke-direct {p1, v0, v1, p2}, Lj51/f$a$a;-><init>(Lj51/g;Lp1/z0;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lj51/f$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj51/f$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj51/f$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj51/f$a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj51/f$a$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj51/f$a$a;->x:Lj51/g;

    invoke-virtual {p1}, Lj51/g;->j()F

    move-result p1

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr p1, v1

    const/high16 v1, 0x42c80000    # 100.0f

    add-float v4, p1, v1

    iget-object p1, p0, Lj51/f$a$a;->x:Lj51/g;

    invoke-virtual {p1}, Lj51/g;->h()I

    move-result p1

    const/4 v1, 0x0

    const/4 v3, 0x6

    const/4 v5, 0x0

    invoke-static {p1, v1, v5, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v5

    iget-object p1, p0, Lj51/f$a$a;->y:Lp1/z0;

    new-instance v6, Lj51/e;

    invoke-direct {v6, p1, v1}, Lj51/e;-><init>(Lp1/z0;I)V

    iput v2, p0, Lj51/f$a$a;->w:I

    const/4 v3, 0x0

    const/4 v8, 0x4

    move-object v7, p0

    invoke-static/range {v3 .. v8}, Ld0/f;->e(FFLd0/l;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
