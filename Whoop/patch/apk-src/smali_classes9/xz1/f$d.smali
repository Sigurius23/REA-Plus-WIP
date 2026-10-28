.class final Lxz1/f$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxz1/f;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lxz1/e;",
        "state",
        "Lxz1/g;",
        "action",
        "<anonymous>",
        "(Lxz1/e;Lxz1/g;)Lxz1/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.nativestore.pdp.domain.PdpInteractor$interact$2"
    f = "PdpInteractor.kt"
    l = {
        0x31
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lxz1/f;


# direct methods
.method public constructor <init>(Lxz1/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxz1/f;",
            "Lq83/d<",
            "-",
            "Lxz1/f$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxz1/f$d;->z:Lxz1/f;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lxz1/e;Lxz1/g;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxz1/e;",
            "Lxz1/g;",
            "Lq83/d<",
            "-",
            "Lxz1/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lxz1/f$d;

    iget-object v1, p0, Lxz1/f$d;->z:Lxz1/f;

    invoke-direct {v0, v1, p3}, Lxz1/f$d;-><init>(Lxz1/f;Lq83/d;)V

    iput-object p1, v0, Lxz1/f$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lxz1/f$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lxz1/f$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxz1/e;

    check-cast p2, Lxz1/g;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lxz1/f$d;->f(Lxz1/e;Lxz1/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lxz1/f$d;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxz1/e;

    iget-object v0, p0, Lxz1/f$d;->y:Ljava/lang/Object;

    check-cast v0, Lxz1/g;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lxz1/f$d;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lxz1/g$b;->a:Lxz1/g$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object v2, Lxz1/d$c;->a:Lxz1/d$c;

    const/16 v12, 0x3fe

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Lxz1/e;->b(Lxz1/e;Lxz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lxz1/e;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v0, Lxz1/g$a;

    if-eqz p1, :cond_4

    move-object v2, v1

    iget-object v1, p0, Lxz1/f$d;->z:Lxz1/f;

    check-cast v0, Lxz1/g$a;

    move p1, v3

    invoke-virtual {v0}, Lxz1/g$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lxz1/g$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lxz1/g$a;->c()Ljava/lang/String;

    move-result-object v5

    const/4 v0, 0x0

    iput-object v0, p0, Lxz1/f$d;->x:Ljava/lang/Object;

    iput-object v0, p0, Lxz1/f$d;->y:Ljava/lang/Object;

    iput p1, p0, Lxz1/f$d;->w:I

    move-object v6, p0

    invoke-static/range {v1 .. v6}, Lxz1/f;->c(Lxz1/f;Lxz1/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_3

    return-object v7

    :cond_3
    :goto_0
    check-cast p1, Lxz1/e;

    return-object p1

    :cond_4
    move-object v6, p0

    instance-of p1, v0, Lxz1/g$c;

    if-eqz p1, :cond_5

    iget-object p1, v6, Lxz1/f$d;->z:Lxz1/f;

    check-cast v0, Lxz1/g$c;

    invoke-virtual {v0}, Lxz1/g$c;->a()Lxz1/j;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lxz1/f;->e(Lxz1/f;Lxz1/e;Lxz1/j;)Lxz1/e;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v0, Lxz1/g$d;

    if-eqz p1, :cond_6

    iget-object p1, v6, Lxz1/f$d;->z:Lxz1/f;

    check-cast v0, Lxz1/g$d;

    invoke-virtual {v0}, Lxz1/g$d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lxz1/f;->f(Lxz1/f;Lxz1/e;Ljava/lang/String;)Lxz1/e;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
