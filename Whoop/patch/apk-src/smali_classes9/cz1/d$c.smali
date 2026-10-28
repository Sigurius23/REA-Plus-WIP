.class final Lcz1/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcz1/d;->f(Lec3/l;)Lec3/l;
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
        "Lcz1/c;",
        "prevState",
        "Lcz1/b;",
        "action",
        "<anonymous>",
        "(Lcz1/c;Lcz1/b;)Lcz1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.milestonepill.domain.MilestonePillInteractor$interact$1"
    f = "MilestonePillInteractor.kt"
    l = {
        0x13
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcz1/d;


# direct methods
.method public constructor <init>(Lcz1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcz1/d;",
            "Lq83/d<",
            "-",
            "Lcz1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcz1/d$c;->z:Lcz1/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcz1/c;Lcz1/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcz1/c;",
            "Lcz1/b;",
            "Lq83/d<",
            "-",
            "Lcz1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcz1/d$c;

    iget-object v1, p0, Lcz1/d$c;->z:Lcz1/d;

    invoke-direct {v0, v1, p3}, Lcz1/d$c;-><init>(Lcz1/d;Lq83/d;)V

    iput-object p1, v0, Lcz1/d$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcz1/d$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcz1/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcz1/c;

    check-cast p2, Lcz1/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcz1/d$c;->f(Lcz1/c;Lcz1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcz1/d$c;->x:Ljava/lang/Object;

    check-cast v0, Lcz1/c;

    iget-object v1, p0, Lcz1/d$c;->y:Ljava/lang/Object;

    check-cast v1, Lcz1/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lcz1/d$c;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lcz1/b$b;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcz1/d$c;->z:Lcz1/d;

    check-cast v1, Lcz1/b$b;

    invoke-virtual {v1}, Lcz1/b$b;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, Lcz1/d$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Lcz1/d$c;->y:Ljava/lang/Object;

    iput v4, p0, Lcz1/d$c;->w:I

    invoke-static {p1, v1, v0, p0}, Lcz1/d;->a(Lcz1/d;Ljava/lang/String;Lcz1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    check-cast p1, Lcz1/c;

    return-object p1

    :cond_3
    instance-of p1, v1, Lcz1/b$a;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcz1/d$c;->z:Lcz1/d;

    invoke-static {p1, v0}, Lcz1/d;->c(Lcz1/d;Lcz1/c;)Lcz1/c;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
