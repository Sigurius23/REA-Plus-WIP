.class final Lz41/j$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz41/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "La51/h;",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.amoeba.particles.ParticleViewKt$ParticleView$1$1$1$1"
    f = "ParticleView.kt"
    l = {
        0x42
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:J

.field final synthetic y:Lz41/e;

.field final synthetic z:J


# direct methods
.method public constructor <init>(JLz41/e;Lz41/b;JLp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lz41/e;",
            "Lz41/b;",
            "J",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lz41/j$a$a;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lz41/j$a$a;->x:J

    iput-object p3, p0, Lz41/j$a$a;->y:Lz41/e;

    iput-wide p5, p0, Lz41/j$a$a;->z:J

    iput-object p7, p0, Lz41/j$a$a;->E:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lz41/j$a$a;

    iget-wide v1, p0, Lz41/j$a$a;->x:J

    iget-object v3, p0, Lz41/j$a$a;->y:Lz41/e;

    iget-wide v5, p0, Lz41/j$a$a;->z:J

    iget-object v7, p0, Lz41/j$a$a;->E:Lp1/c1;

    const/4 v4, 0x0

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lz41/j$a$a;-><init>(JLz41/e;Lz41/b;JLp1/c1;Lq83/d;)V

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
            "Ljava/util/List<",
            "La51/h;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lz41/j$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lz41/j$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lz41/j$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lz41/j$a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lz41/j$a$a;->w:I

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

    iget-wide v3, p0, Lz41/j$a$a;->x:J

    iget-object p1, p0, Lz41/j$a$a;->y:Lz41/e;

    invoke-virtual {p1}, Lz41/e;->e()Lz41/g;

    move-result-object p1

    invoke-virtual {p1}, Lz41/g;->f()I

    move-result p1

    int-to-long v5, p1

    cmp-long p1, v3, v5

    if-gez p1, :cond_2

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_2
    iget-object p1, p0, Lz41/j$a$a;->y:Lz41/e;

    invoke-virtual {p1}, Lz41/e;->f()Z

    iget-object p1, p0, Lz41/j$a$a;->y:Lz41/e;

    iget-wide v3, p0, Lz41/j$a$a;->z:J

    long-to-float v1, v3

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v1, v3

    iget-object v3, p0, Lz41/j$a$a;->E:Lp1/c1;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb51/a;

    iput v2, p0, Lz41/j$a$a;->w:I

    invoke-virtual {p1, v1, v3, p0}, Lz41/e;->g(FLb51/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;

    return-object p1
.end method
