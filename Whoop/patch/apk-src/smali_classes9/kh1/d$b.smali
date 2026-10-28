.class final Lkh1/d$b;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lkh1/f;",
        "state",
        "Lkh1/b;",
        "action",
        "<anonymous>",
        "(Lkh1/f;Lkh1/b;)Lkh1/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$interact$1"
    f = "GiftingInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lkh1/d$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lkh1/f;Lkh1/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkh1/f;",
            "Lkh1/b;",
            "Lq83/d<",
            "-",
            "Lkh1/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkh1/d$b;

    invoke-direct {v0, p3}, Lkh1/d$b;-><init>(Lq83/d;)V

    iput-object p1, v0, Lkh1/d$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkh1/d$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkh1/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkh1/f;

    check-cast p2, Lkh1/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkh1/d$b;->f(Lkh1/f;Lkh1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lkh1/d$b;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkh1/f;

    iget-object v0, p0, Lkh1/d$b;->y:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkh1/b;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lkh1/d$b;->w:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v6, Lkh1/b$g;

    if-eqz p1, :cond_0

    move-object p1, v6

    check-cast p1, Lkh1/b$g;

    invoke-virtual {p1}, Lkh1/b$g;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkh1/b$g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkh1/b$g;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lkh1/b$g;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v1 .. v6}, Lkh1/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/b;)Lkh1/f;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v6, Lkh1/b$e;

    if-eqz p1, :cond_1

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkh1/f;->b(Lkh1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/b;ILjava/lang/Object;)Lkh1/f;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v6, Lkh1/b$c;

    if-eqz p1, :cond_2

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkh1/f;->b(Lkh1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/b;ILjava/lang/Object;)Lkh1/f;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkh1/f;->b(Lkh1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/b;ILjava/lang/Object;)Lkh1/f;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
