.class final Luy1/c$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luy1/c;->p(Lec3/l;)Lec3/l;
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
        "Luy1/b;",
        "state",
        "Luy1/d;",
        "action",
        "<anonymous>",
        "(Luy1/b;Luy1/d;)Luy1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.mfa.management.MfaManagementInteractor$interact$2"
    f = "MfaManagementInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Luy1/c;


# direct methods
.method public constructor <init>(Luy1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luy1/c;",
            "Lq83/d<",
            "-",
            "Luy1/c$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Luy1/c$i;->z:Luy1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Luy1/b;Luy1/d;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luy1/b;",
            "Luy1/d;",
            "Lq83/d<",
            "-",
            "Luy1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Luy1/c$i;

    iget-object v1, p0, Luy1/c$i;->z:Luy1/c;

    invoke-direct {v0, v1, p3}, Luy1/c$i;-><init>(Luy1/c;Lq83/d;)V

    iput-object p1, v0, Luy1/c$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Luy1/c$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Luy1/c$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luy1/b;

    check-cast p2, Luy1/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Luy1/c$i;->f(Luy1/b;Luy1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Luy1/c$i;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Luy1/b;

    iget-object v0, p0, Luy1/c$i;->y:Ljava/lang/Object;

    check-cast v0, Luy1/d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Luy1/c$i;->w:I

    if-nez v2, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Luy1/d$c;

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    check-cast v0, Luy1/d$c;

    invoke-virtual {v0}, Luy1/d$c;->a()Z

    move-result v4

    invoke-virtual {v0}, Luy1/d$c;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Luy1/d$c;->b()Luy1/h;

    move-result-object p1

    sget-object v1, Luy1/h;->NONE:Luy1/h;

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    move v5, v2

    invoke-virtual {v0}, Luy1/d$c;->b()Luy1/h;

    move-result-object v6

    new-instance v3, Luy1/b;

    const/16 v12, 0x78

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-direct/range {v3 .. v13}, Luy1/b;-><init>(ZZLuy1/h;Luy1/g;Ljava/lang/String;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_2
    instance-of p1, v0, Luy1/d$b;

    if-eqz p1, :cond_3

    check-cast v0, Luy1/d$b;

    invoke-virtual {v0}, Luy1/d$b;->b()Luy1/g;

    move-result-object v5

    invoke-virtual {v0}, Luy1/d$b;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0xe7

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Luy1/b;->b(Luy1/b;ZZLuy1/h;Luy1/g;Ljava/lang/String;ZZZILjava/lang/Object;)Luy1/b;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Luy1/d$d;->a:Luy1/d$d;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/16 v10, 0xde

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Luy1/b;->b(Luy1/b;ZZLuy1/h;Luy1/g;Ljava/lang/String;ZZZILjava/lang/Object;)Luy1/b;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Luy1/d$a;

    if-eqz p1, :cond_7

    invoke-virtual {v1}, Luy1/b;->g()Luy1/g;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object v3, p0, Luy1/c$i;->z:Luy1/c;

    move-object v4, v0

    check-cast v4, Luy1/d$a;

    invoke-virtual {v4}, Luy1/d$a;->a()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v3}, Luy1/c;->c(Luy1/c;)Lpy1/a;

    move-result-object v3

    invoke-static {p1}, Lpy1/b;->d(Luy1/g;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lpy1/a;->i(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-static {v3}, Luy1/c;->c(Luy1/c;)Lpy1/a;

    move-result-object v3

    invoke-static {p1}, Lpy1/b;->d(Luy1/g;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lpy1/a;->a(Ljava/lang/String;)V

    :cond_6
    :goto_1
    check-cast v0, Luy1/d$a;

    invoke-virtual {v0}, Luy1/d$a;->a()Z

    move-result p1

    xor-int/2addr p1, v2

    invoke-virtual {v0}, Luy1/d$a;->a()Z

    move-result v0

    xor-int/lit8 v8, v0, 0x1

    const/16 v10, 0x9e

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move v2, p1

    invoke-static/range {v1 .. v11}, Luy1/b;->b(Luy1/b;ZZLuy1/h;Luy1/g;Ljava/lang/String;ZZZILjava/lang/Object;)Luy1/b;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
