.class final Lu50/c$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu50/c;->interact(Lec3/l;)Lec3/l;
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
        "Lu50/b;",
        "previous",
        "Lu50/a;",
        "action",
        "<anonymous>",
        "(Lu50/b;Lu50/a;)Lu50/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.access.omronauth.domain.OmronAuthInteractor$interact$1"
    f = "OmronAuthInteractor.kt"
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
            "Lu50/c$d;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lu50/b;Lu50/a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu50/b;",
            "Lu50/a;",
            "Lq83/d<",
            "-",
            "Lu50/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lu50/c$d;

    invoke-direct {v0, p3}, Lu50/c$d;-><init>(Lq83/d;)V

    iput-object p1, v0, Lu50/c$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lu50/c$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lu50/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu50/b;

    check-cast p2, Lu50/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lu50/c$d;->f(Lu50/b;Lu50/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lu50/c$d;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lu50/b;

    iget-object v0, p0, Lu50/c$d;->y:Ljava/lang/Object;

    check-cast v0, Lu50/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lu50/c$d;->w:I

    if-nez v2, :cond_a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lu50/a$i;

    if-eqz p1, :cond_0

    sget-object v3, Lu50/e$e;->a:Lu50/e$e;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu50/b;->b(Lu50/b;Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;ZILjava/lang/Object;)Lu50/b;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Lu50/a$a;

    if-eqz p1, :cond_1

    check-cast v0, Lu50/a$a;

    invoke-virtual {v0}, Lu50/a$a;->a()Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    move-result-object v2

    sget-object v3, Lu50/e$c;->a:Lu50/e$c;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu50/b;->b(Lu50/b;Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;ZILjava/lang/Object;)Lu50/b;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Lu50/a$h;

    if-eqz p1, :cond_2

    sget-object v3, Lu50/e$d;->a:Lu50/e$d;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu50/b;->b(Lu50/b;Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;ZILjava/lang/Object;)Lu50/b;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v0, Lu50/a$d;

    if-eqz p1, :cond_3

    sget-object v3, Lu50/e$b;->a:Lu50/e$b;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu50/b;->b(Lu50/b;Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;ZILjava/lang/Object;)Lu50/b;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Lu50/a$b;

    if-eqz p1, :cond_4

    sget-object v3, Lu50/e$b;->a:Lu50/e$b;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-static/range {v1 .. v6}, Lu50/b;->b(Lu50/b;Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;ZILjava/lang/Object;)Lu50/b;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Lu50/a$g;

    if-eqz p1, :cond_6

    new-instance v3, Lu50/e$a;

    invoke-virtual {v1}, Lu50/b;->d()Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->getNavigateOnSuccess()Lcom/whoop/navigation/e;

    move-result-object p1

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v3, p1}, Lu50/e$a;-><init>(Lcom/whoop/navigation/e;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu50/b;->b(Lu50/b;Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;ZILjava/lang/Object;)Lu50/b;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v0, Lu50/a$f;

    if-eqz p1, :cond_7

    invoke-virtual {v1}, Lu50/b;->e()Lu50/e;

    move-result-object p1

    instance-of p1, p1, Lu50/e$b;

    if-eqz p1, :cond_9

    invoke-virtual {v1}, Lu50/b;->c()Z

    move-result p1

    if-nez p1, :cond_9

    sget-object v3, Lu50/e$c;->a:Lu50/e$c;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu50/b;->b(Lu50/b;Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;ZILjava/lang/Object;)Lu50/b;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p1, v0, Lu50/a$e;

    if-nez p1, :cond_9

    instance-of p1, v0, Lu50/a$c;

    if-eqz p1, :cond_8

    goto :goto_1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_1
    return-object v1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
