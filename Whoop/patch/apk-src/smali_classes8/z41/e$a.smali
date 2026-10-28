.class final Lz41/e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz41/e;->g(FLb51/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.design.atomic.organism.amoeba.particles.ParticleSystem$render$2"
    f = "ParticleSystem.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lz41/e;

.field final synthetic y:F

.field final synthetic z:Lb51/a;


# direct methods
.method public constructor <init>(Lz41/e;FLb51/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz41/e;",
            "F",
            "Lb51/a;",
            "Lq83/d<",
            "-",
            "Lz41/e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz41/e$a;->x:Lz41/e;

    iput p2, p0, Lz41/e$a;->y:F

    iput-object p3, p0, Lz41/e$a;->z:Lb51/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(La51/h;)Z
    .locals 0

    invoke-static {p0}, Lz41/e$a;->h(La51/h;)Z

    move-result p0

    return p0
.end method

.method private static final h(La51/h;)Z
    .locals 0

    invoke-virtual {p0}, La51/h;->h()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lz41/e$a;

    iget-object v0, p0, Lz41/e$a;->x:Lz41/e;

    iget v1, p0, Lz41/e$a;->y:F

    iget-object v2, p0, Lz41/e$a;->z:Lb51/a;

    invoke-direct {p1, v0, v1, v2, p2}, Lz41/e$a;-><init>(Lz41/e;FLb51/a;Lq83/d;)V

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
            "Ljava/util/List<",
            "La51/h;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lz41/e$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lz41/e$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lz41/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lz41/e$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lz41/e$a;->w:I

    if-nez v0, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lz41/e$a;->x:Lz41/e;

    invoke-virtual {p1}, Lz41/e;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz41/e$a;->x:Lz41/e;

    invoke-static {p1}, Lz41/e;->a(Lz41/e;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lz41/e$a;->x:Lz41/e;

    invoke-static {v0}, Lz41/e;->b(Lz41/e;)La51/b;

    move-result-object v0

    iget v1, p0, Lz41/e$a;->y:F

    iget-object v2, p0, Lz41/e$a;->x:Lz41/e;

    invoke-virtual {v2}, Lz41/e;->e()Lz41/g;

    move-result-object v2

    iget-object v3, p0, Lz41/e$a;->z:Lb51/a;

    invoke-virtual {v0, v1, v2, v3}, La51/b;->a(FLz41/g;Lb51/a;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object p1, p0, Lz41/e$a;->x:Lz41/e;

    invoke-virtual {p1}, Lz41/e;->e()Lz41/g;

    move-result-object p1

    invoke-virtual {p1}, Lz41/g;->g()La51/f;

    move-result-object p1

    invoke-virtual {p1}, La51/f;->c()La51/d;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lz41/e$a;->x:Lz41/e;

    invoke-virtual {v2}, Lz41/e;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    sget-object v2, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, Lz41/e$a;->z:Lb51/a;

    invoke-virtual {p1, v0, v1}, La51/d;->a(FLb51/a;)La51/e;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lz41/e$a;->x:Lz41/e;

    invoke-static {v0}, Lz41/e;->a(Lz41/e;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget v1, p0, Lz41/e$a;->y:F

    iget-object v2, p0, Lz41/e$a;->z:Lb51/a;

    iget-object v3, p0, Lz41/e$a;->x:Lz41/e;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La51/h;

    invoke-virtual {v3}, Lz41/e;->e()Lz41/g;

    move-result-object v5

    invoke-virtual {v5}, Lz41/g;->o()F

    move-result v5

    invoke-virtual {v4, v1, v2, p1, v5}, La51/h;->j(FLb51/a;La51/e;F)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lz41/e$a;->x:Lz41/e;

    invoke-static {p1}, Lz41/e;->a(Lz41/e;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lz41/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0}, Lm83/s;->j1(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lz41/e$a;->x:Lz41/e;

    invoke-static {p1}, Lz41/e;->a(Lz41/e;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, La51/h;

    invoke-virtual {v2}, La51/h;->d()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    return-object v0

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
