.class final Ln60/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln60/c;->g(Lec3/l;)Lec3/l;
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
        "Ln60/b;",
        "<unused var>",
        "Ln60/a;",
        "action",
        "<anonymous>",
        "(Ln60/b;Ln60/a;)Ln60/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.achievements.celebration.domain.AchievementCelebrationInteractor$interact$1"
    f = "AchievementCelebrationInteractor.kt"
    l = {
        0x15,
        0x18
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Ln60/c;


# direct methods
.method public constructor <init>(Ln60/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln60/c;",
            "Lq83/d<",
            "-",
            "Ln60/c$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ln60/c$e;->y:Ln60/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ln60/b;Ln60/a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln60/b;",
            "Ln60/a;",
            "Lq83/d<",
            "-",
            "Ln60/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Ln60/c$e;

    iget-object v0, p0, Ln60/c$e;->y:Ln60/c;

    invoke-direct {p1, v0, p3}, Ln60/c$e;-><init>(Ln60/c;Lq83/d;)V

    iput-object p2, p1, Ln60/c$e;->x:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln60/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln60/b;

    check-cast p2, Ln60/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ln60/c$e;->f(Ln60/b;Ln60/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Ln60/c$e;->x:Ljava/lang/Object;

    check-cast v0, Ln60/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ln60/c$e;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

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

    instance-of p1, v0, Ln60/a$a;

    const/4 v2, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Ln60/c$e;->y:Ln60/c;

    check-cast v0, Ln60/a$a;

    invoke-virtual {v0}, Ln60/a$a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v2, p0, Ln60/c$e;->x:Ljava/lang/Object;

    iput v4, p0, Ln60/c$e;->w:I

    invoke-static {p1, v0, p0}, Ln60/c;->a(Ln60/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ln60/b;

    return-object p1

    :cond_4
    instance-of p1, v0, Ln60/a$b;

    if-eqz p1, :cond_6

    iget-object p1, p0, Ln60/c$e;->y:Ln60/c;

    check-cast v0, Ln60/a$b;

    invoke-virtual {v0}, Ln60/a$b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v2, p0, Ln60/c$e;->x:Ljava/lang/Object;

    iput v3, p0, Ln60/c$e;->w:I

    invoke-static {p1, v0, p0}, Ln60/c;->b(Ln60/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_1
    return-object v1

    :cond_5
    :goto_2
    check-cast p1, Ln60/b;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
