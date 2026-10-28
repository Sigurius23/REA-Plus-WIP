.class final Lib2/a$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lib2/a;->e(Lec3/l;)Lec3/l;
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
        "Lib2/f;",
        "previousState",
        "Lib2/c;",
        "event",
        "<anonymous>",
        "(Lib2/f;Lib2/c;)Lib2/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.email.EditEmailInteractor$interact$1"
    f = "EditEmailInteractor.kt"
    l = {
        0x21,
        0x2b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lib2/a;


# direct methods
.method public constructor <init>(Lib2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib2/a;",
            "Lq83/d<",
            "-",
            "Lib2/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lib2/a$d;->z:Lib2/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lib2/f;Lib2/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib2/f;",
            "Lib2/c;",
            "Lq83/d<",
            "-",
            "Lib2/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lib2/a$d;

    iget-object v1, p0, Lib2/a$d;->z:Lib2/a;

    invoke-direct {v0, v1, p3}, Lib2/a$d;-><init>(Lib2/a;Lq83/d;)V

    iput-object p1, v0, Lib2/a$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lib2/a$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lib2/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lib2/f;

    check-cast p2, Lib2/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lib2/a$d;->f(Lib2/f;Lib2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lib2/a$d;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lib2/f;

    iget-object v0, p0, Lib2/a$d;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lib2/c;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lib2/a$d;->w:I

    const-string v3, ""

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lib2/c$a;->a:Lib2/c$a;

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lib2/a$d;->z:Lib2/a;

    invoke-static {p1}, Lib2/a;->a(Lib2/a;)Ly92/a;

    move-result-object p1

    iput-object v1, p0, Lib2/a$d;->x:Ljava/lang/Object;

    iput-object v4, p0, Lib2/a$d;->y:Ljava/lang/Object;

    iput v6, p0, Lib2/a$d;->w:I

    invoke-virtual {p1, p0}, Ly92/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/User;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getEmailAddress()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    move-object v3, p1

    :cond_5
    :goto_1
    const/4 p1, 0x0

    invoke-virtual {v1, p1, v3, v4}, Lib2/f;->a(Ljava/lang/String;Ljava/lang/String;Lib2/c;)Lib2/f;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v4, Lib2/c$b;

    if-eqz p1, :cond_7

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lib2/f;->b(Lib2/f;Ljava/lang/String;Ljava/lang/String;Lib2/c;ILjava/lang/Object;)Lib2/f;

    move-result-object p1

    return-object p1

    :cond_7
    sget-object p1, Lib2/c$c;->a:Lib2/c$c;

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lib2/a$d;->z:Lib2/a;

    invoke-static {p1}, Lib2/a;->a(Lib2/a;)Ly92/a;

    move-result-object p1

    iput-object v1, p0, Lib2/a$d;->x:Ljava/lang/Object;

    iput-object v4, p0, Lib2/a$d;->y:Ljava/lang/Object;

    iput v5, p0, Lib2/a$d;->w:I

    invoke-virtual {p1, p0}, Ly92/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_2
    return-object v0

    :cond_8
    :goto_3
    check-cast p1, Lcom/whoop/domain/model/User;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getEmailAddress()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_9

    goto :goto_4

    :cond_9
    move-object v3, p1

    :cond_a
    :goto_4
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lib2/f;->b(Lib2/f;Ljava/lang/String;Ljava/lang/String;Lib2/c;ILjava/lang/Object;)Lib2/f;

    move-result-object p1

    return-object p1

    :cond_b
    instance-of p1, v4, Lib2/c$d;

    if-eqz p1, :cond_c

    move-object p1, v4

    check-cast p1, Lib2/c$d;

    invoke-virtual {p1}, Lib2/c$d;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lib2/f;->b(Lib2/f;Ljava/lang/String;Ljava/lang/String;Lib2/c;ILjava/lang/Object;)Lib2/f;

    move-result-object p1

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
