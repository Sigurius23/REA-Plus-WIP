.class final Lo12/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo12/c;->t(Lec3/l;)Lec3/l;
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
        "Lo12/h;",
        "acc",
        "Lo12/a;",
        "domainAction",
        "<anonymous>",
        "(Lo12/h;Lo12/a;)Lo12/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.onboarding.story.OnboardingStoryInteractor$interact$1"
    f = "OnboardingStoryInteractor.kt"
    l = {
        0x1d,
        0x20,
        0x22
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lo12/c;


# direct methods
.method public constructor <init>(Lo12/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo12/c;",
            "Lq83/d<",
            "-",
            "Lo12/c$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo12/c$e;->z:Lo12/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lo12/h;Lo12/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo12/h;",
            "Lo12/a;",
            "Lq83/d<",
            "-",
            "Lo12/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lo12/c$e;

    iget-object v1, p0, Lo12/c$e;->z:Lo12/c;

    invoke-direct {v0, v1, p3}, Lo12/c$e;-><init>(Lo12/c;Lq83/d;)V

    iput-object p1, v0, Lo12/c$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lo12/c$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lo12/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo12/h;

    check-cast p2, Lo12/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lo12/c$e;->f(Lo12/h;Lo12/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lo12/c$e;->x:Ljava/lang/Object;

    check-cast v0, Lo12/h;

    iget-object v1, p0, Lo12/c$e;->y:Ljava/lang/Object;

    check-cast v1, Lo12/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lo12/c$e;->w:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lo12/a$f;

    const/4 v3, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lo12/c$e;->z:Lo12/c;

    check-cast v1, Lo12/a$f;

    invoke-virtual {v1}, Lo12/a$f;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v3, p0, Lo12/c$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lo12/c$e;->y:Ljava/lang/Object;

    iput v6, p0, Lo12/c$e;->w:I

    invoke-static {p1, v0, p0}, Lo12/c;->h(Lo12/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    check-cast p1, Lo12/h;

    return-object p1

    :cond_5
    instance-of p1, v1, Lo12/a$e;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lo12/c$e;->z:Lo12/c;

    invoke-static {p1, v0}, Lo12/c;->e(Lo12/c;Lo12/h;)Lo12/h;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v1, Lo12/a$a;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lo12/c$e;->z:Lo12/c;

    check-cast v1, Lo12/a$a;

    invoke-virtual {v1}, Lo12/a$a;->a()I

    move-result v1

    invoke-static {p1, v0, v1}, Lo12/c;->d(Lo12/c;Lo12/h;I)Lo12/h;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p1, v1, Lo12/a$c;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lo12/c$e;->z:Lo12/c;

    check-cast v1, Lo12/a$c;

    invoke-virtual {v1}, Lo12/a$c;->a()I

    move-result v1

    iput-object v3, p0, Lo12/c$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lo12/c$e;->y:Ljava/lang/Object;

    iput v5, p0, Lo12/c$e;->w:I

    invoke-static {p1, v0, v1, p0}, Lo12/c;->b(Lo12/c;Lo12/h;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_8

    goto :goto_2

    :cond_8
    :goto_1
    check-cast p1, Lo12/h;

    return-object p1

    :cond_9
    instance-of p1, v1, Lo12/a$d;

    if-eqz p1, :cond_a

    iget-object p1, p0, Lo12/c$e;->z:Lo12/c;

    check-cast v1, Lo12/a$d;

    invoke-virtual {v1}, Lo12/a$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lo12/c;->c(Lo12/c;Lo12/h;Ljava/lang/String;)Lo12/h;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of p1, v1, Lo12/a$g;

    if-eqz p1, :cond_c

    iget-object p1, p0, Lo12/c$e;->z:Lo12/c;

    iput-object v3, p0, Lo12/c$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lo12/c$e;->y:Ljava/lang/Object;

    iput v4, p0, Lo12/c$e;->w:I

    invoke-static {p1, v0, p0}, Lo12/c;->f(Lo12/c;Lo12/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_b

    :goto_2
    return-object v2

    :cond_b
    :goto_3
    check-cast p1, Lo12/h;

    return-object p1

    :cond_c
    instance-of p1, v1, Lo12/a$b;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lo12/c$e;->z:Lo12/c;

    check-cast v1, Lo12/a$b;

    invoke-virtual {v1}, Lo12/a$b;->a()I

    move-result v1

    invoke-static {p1, v0, v1}, Lo12/c;->a(Lo12/c;Lo12/h;I)Lo12/h;

    move-result-object p1

    return-object p1

    :cond_d
    instance-of p1, v1, Lo12/a$h;

    if-eqz p1, :cond_e

    iget-object p1, p0, Lo12/c$e;->z:Lo12/c;

    check-cast v1, Lo12/a$h;

    invoke-virtual {v1}, Lo12/a$h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lo12/c;->g(Lo12/c;Lo12/h;Ljava/lang/String;)Lo12/h;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
