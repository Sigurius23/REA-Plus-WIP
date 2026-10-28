.class public final Lkh1/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkh1/d;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$interact$$inlined$flatMapLatest$1"
    f = "GiftingInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lkh1/d;


# direct methods
.method public constructor <init>(Lq83/d;Lkh1/d;)V
    .locals 0

    iput-object p2, p0, Lkh1/d$a;->z:Lkh1/d;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lkh1/f;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkh1/d$a;

    iget-object v1, p0, Lkh1/d$a;->z:Lkh1/d;

    invoke-direct {v0, p3, v1}, Lkh1/d$a;-><init>(Lq83/d;Lkh1/d;)V

    iput-object p1, v0, Lkh1/d$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkh1/d$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkh1/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkh1/d$a;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkh1/d$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lkh1/d$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkh1/d$a;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lkh1/d$a;->y:Ljava/lang/Object;

    check-cast v1, Lkh1/f;

    invoke-virtual {v1}, Lkh1/f;->d()Lkh1/b;

    move-result-object v3

    instance-of v4, v3, Lkh1/b$g;

    if-eqz v4, :cond_2

    iget-object v5, p0, Lkh1/d$a;->z:Lkh1/d;

    check-cast v3, Lkh1/b$g;

    invoke-virtual {v3}, Lkh1/b$g;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lkh1/b$g;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3}, Lkh1/b$g;->d()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lkh1/b$g;->b()Ljava/lang/String;

    move-result-object v10

    const/16 v12, 0x21

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lkh1/d;->k(Lkh1/d;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v1

    new-instance v3, Lkh1/d$d;

    invoke-direct {v3, v1}, Lkh1/d$d;-><init>(Lec3/l;)V

    goto :goto_0

    :cond_2
    instance-of v4, v3, Lkh1/b$c;

    if-eqz v4, :cond_3

    iget-object v5, p0, Lkh1/d$a;->z:Lkh1/d;

    invoke-virtual {v1}, Lkh1/f;->f()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lkh1/f;->c()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lkh1/f;->g()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lkh1/f;->e()Ljava/lang/String;

    move-result-object v10

    check-cast v3, Lkh1/b$c;

    invoke-virtual {v3}, Lkh1/b$c;->a()Ljava/lang/String;

    move-result-object v11

    const/4 v6, 0x1

    invoke-static/range {v5 .. v11}, Lkh1/d;->e(Lkh1/d;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    new-instance v3, Lkh1/d$e;

    invoke-direct {v3, v1}, Lkh1/d$e;-><init>(Lec3/l;)V

    goto :goto_0

    :cond_3
    instance-of v4, v3, Lkh1/b$e;

    if-eqz v4, :cond_4

    iget-object v4, p0, Lkh1/d$a;->z:Lkh1/d;

    check-cast v3, Lkh1/b$e;

    invoke-static {v4, v3, v1}, Lkh1/d;->f(Lkh1/d;Lkh1/b$e;Lkh1/f;)Lec3/l;

    move-result-object v3

    goto :goto_0

    :cond_4
    new-instance v1, Lkh1/e$a;

    invoke-direct {v1, v3}, Lkh1/e$a;-><init>(Lkh1/b;)V

    new-instance v3, La6/u;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, Lkh1/d$a;->x:Ljava/lang/Object;

    iput-object v1, p0, Lkh1/d$a;->y:Ljava/lang/Object;

    iput v2, p0, Lkh1/d$a;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
