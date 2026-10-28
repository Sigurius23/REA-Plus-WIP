.class public final Lmf/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/e;


# instance fields
.field public final a:Lpf/a;


# direct methods
.method public constructor <init>(Lpf/a;)V
    .locals 1

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf/u;->a:Lpf/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Luf/u;

    invoke-virtual {p1}, Luf/u;->b()Ldg/a;

    move-result-object v0

    invoke-virtual {p1}, Luf/u;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvf/b;

    invoke-virtual {p1}, Lvf/b;->b()Lvf/h;

    move-result-object p1

    invoke-virtual {p0, v0, p1, p2}, Lmf/u;->b(Ldg/a;Lvf/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ldg/a;Lvf/h;Ls83/c;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lmf/u;->a:Lpf/a;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v1

    invoke-static {v1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object v1

    invoke-interface {v1}, Lbc3/k1;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    invoke-static {v0, v1}, Lse/g;->s(Lpf/a;Lq83/j;)Lq83/j;

    move-result-object v1

    new-instance v2, Lpf/u;

    invoke-direct {v2, v1}, Lpf/u;-><init>(Lq83/j;)V

    invoke-interface {v1, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    new-instance v2, Lg20/p;

    const/16 v7, 0x1c

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v2 .. v7}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x2

    invoke-static {v0, v1, v2, p1}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p1

    invoke-virtual {p1, p3}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1

    :cond_0
    new-instance p1, Laws/smithy/kotlin/runtime/http/engine/HttpClientEngineClosedException;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/http/engine/HttpClientEngineClosedException;-><init>(I)V

    throw p1
.end method
