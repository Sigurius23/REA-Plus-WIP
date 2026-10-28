.class final Lxy1/b$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxy1/b;->f(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxy1/b$e$a;
    }
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
        "Lxy1/a;",
        "domainState",
        "Lxy1/b$a;",
        "internalDomainAction",
        "<anonymous>",
        "(Lxy1/a;Lxy1/b$a;)Lxy1/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.mfa.setup.domain.MfaInputInteractor$interact$2"
    f = "MfaInputInteractor.kt"
    l = {
        0x3b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lxy1/b;

.field w:F

.field x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lxy1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxy1/b;",
            "Lq83/d<",
            "-",
            "Lxy1/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxy1/b$e;->E:Lxy1/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lxy1/a;Lxy1/b$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxy1/a;",
            "Lxy1/b$a;",
            "Lq83/d<",
            "-",
            "Lxy1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lxy1/b$e;

    iget-object v1, p0, Lxy1/b$e;->E:Lxy1/b;

    invoke-direct {v0, v1, p3}, Lxy1/b$e;-><init>(Lxy1/b;Lq83/d;)V

    iput-object p1, v0, Lxy1/b$e;->y:Ljava/lang/Object;

    iput-object p2, v0, Lxy1/b$e;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lxy1/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxy1/a;

    check-cast p2, Lxy1/b$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lxy1/b$e;->f(Lxy1/a;Lxy1/b$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lxy1/b$e;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxy1/a;

    iget-object v0, p0, Lxy1/b$e;->z:Ljava/lang/Object;

    check-cast v0, Lxy1/b$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lxy1/b$e;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget v0, p0, Lxy1/b$e;->w:F

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move v4, v0

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lxy1/b$a$a;

    if-eqz p1, :cond_a

    check-cast v0, Lxy1/b$a$a;

    invoke-virtual {v0}, Lxy1/b$a$a;->a()Lwy1/a;

    move-result-object p1

    instance-of v3, p1, Lwy1/a$b;

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lxy1/b$a$a;->a()Lwy1/a;

    move-result-object p1

    check-cast p1, Lwy1/a$b;

    invoke-virtual {p1}, Lwy1/a$b;->a()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lxy1/f;->IDLE:Lxy1/f;

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lxy1/a;->b(Lxy1/a;Lxy1/c;Ljava/lang/String;FLxy1/f;ILjava/lang/Object;)Lxy1/a;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v3, p1, Lwy1/a$c;

    if-eqz v3, :cond_6

    invoke-virtual {v1}, Lxy1/a;->c()Lxy1/c;

    move-result-object p1

    sget-object v0, Lxy1/b$e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v4, :cond_5

    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    sget-object p1, Lxy1/c;->PHONE:Lxy1/c;

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    sget-object p1, Lxy1/c;->EMAIL:Lxy1/c;

    goto :goto_0

    :goto_1
    sget-object v5, Lxy1/f;->IDLE:Lxy1/f;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lxy1/a;->b(Lxy1/a;Lxy1/c;Ljava/lang/String;FLxy1/f;ILjava/lang/Object;)Lxy1/a;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of v3, p1, Lwy1/a$a;

    if-eqz v3, :cond_7

    iget-object p1, p0, Lxy1/b$e;->E:Lxy1/b;

    invoke-static {p1}, Lxy1/b;->b(Lxy1/b;)Lpy1/a;

    move-result-object p1

    invoke-virtual {v0}, Lxy1/b$a$a;->a()Lwy1/a;

    move-result-object v3

    check-cast v3, Lwy1/a$a;

    invoke-virtual {v3}, Lwy1/a$a;->b()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {p1, v5, v3, v4, v5}, Lpy1/a;->s(Lpy1/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lxy1/b$a$a;->a()Lwy1/a;

    move-result-object p1

    check-cast p1, Lwy1/a$a;

    invoke-virtual {p1}, Lwy1/a$a;->a()F

    move-result v0

    iget-object p1, p0, Lxy1/b$e;->E:Lxy1/b;

    iput-object v1, p0, Lxy1/b$e;->y:Ljava/lang/Object;

    iput-object v5, p0, Lxy1/b$e;->z:Ljava/lang/Object;

    iput v0, p0, Lxy1/b$e;->w:F

    iput v4, p0, Lxy1/b$e;->x:I

    invoke-static {p1, p0}, Lxy1/b;->a(Lxy1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_0

    return-object v2

    :goto_2
    move-object v2, p1

    check-cast v2, Lxy1/c;

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lxy1/a;->b(Lxy1/a;Lxy1/c;Ljava/lang/String;FLxy1/f;ILjava/lang/Object;)Lxy1/a;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of v0, p1, Lwy1/a$d;

    if-eqz v0, :cond_8

    sget-object v5, Lxy1/f;->IDLE:Lxy1/f;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lxy1/a;->b(Lxy1/a;Lxy1/c;Ljava/lang/String;FLxy1/f;ILjava/lang/Object;)Lxy1/a;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p1, p1, Lwy1/a$e;

    if-eqz p1, :cond_9

    return-object v1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    instance-of p1, v0, Lxy1/b$a$b;

    if-eqz p1, :cond_b

    sget-object v5, Lxy1/f;->LOADING:Lxy1/f;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lxy1/a;->b(Lxy1/a;Lxy1/c;Ljava/lang/String;FLxy1/f;ILjava/lang/Object;)Lxy1/a;

    move-result-object p1

    return-object p1

    :cond_b
    instance-of p1, v0, Lxy1/b$a$c;

    if-eqz p1, :cond_d

    check-cast v0, Lxy1/b$a$c;

    invoke-virtual {v0}, Lxy1/b$a$c;->a()Z

    move-result p1

    if-eqz p1, :cond_c

    sget-object p1, Lxy1/f;->SUCCESS:Lxy1/f;

    :goto_3
    move-object v5, p1

    goto :goto_4

    :cond_c
    sget-object p1, Lxy1/f;->FAILURE:Lxy1/f;

    goto :goto_3

    :goto_4
    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lxy1/a;->b(Lxy1/a;Lxy1/c;Ljava/lang/String;FLxy1/f;ILjava/lang/Object;)Lxy1/a;

    move-result-object p1

    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
