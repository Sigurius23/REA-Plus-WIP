.class final Lil1/r$n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil1/r;->q(Lil1/u$a;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lqw2/b;",
        "state",
        "Lec3/l;",
        "",
        "<anonymous>",
        "(Lqw2/b;)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.HomeFeedDomainInteractor$performAction$2"
    f = "HomeFeedDomainInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lil1/r$n;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lil1/r$n;

    invoke-direct {v0, p2}, Lil1/r$n;-><init>(Lq83/d;)V

    iput-object p1, v0, Lil1/r$n;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lqw2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw2/b;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lil1/r$n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lil1/r$n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lil1/r$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqw2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lil1/r$n;->f(Lqw2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lil1/r$n;->x:Ljava/lang/Object;

    check-cast v0, Lqw2/b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lil1/r$n;->w:I

    if-nez v1, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lqw2/b$f;

    const/4 v1, 0x1

    if-nez p1, :cond_4

    instance-of p1, v0, Lqw2/b$n;

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of p1, v0, Lqw2/b$c;

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez p1, :cond_3

    instance-of p1, v0, Lqw2/b$i;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    instance-of p1, v0, Lqw2/b$a;

    if-eqz p1, :cond_2

    new-instance p1, Lil1/r$b;

    new-instance v4, Lil1/r$a$a;

    check-cast v0, Lqw2/b$a;

    invoke-virtual {v0}, Lqw2/b$a;->c()Ljava/lang/String;

    move-result-object v0

    const-string v5, "network"

    invoke-static {v0, v5, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v8

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v10}, Lil1/r$a$a;-><init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v4, v3, v2, v3}, Lil1/r$b;-><init>(Lil1/r$a;Lfm1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, La6/u;

    invoke-direct {v0, p1, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_2
    sget-object p1, Lec3/k;->w:Lec3/k;

    return-object p1

    :cond_3
    :goto_0
    new-instance p1, Lil1/r$b;

    sget-object v0, Lil1/r$a$c;->a:Lil1/r$a$c;

    invoke-direct {p1, v0, v3, v2, v3}, Lil1/r$b;-><init>(Lil1/r$a;Lfm1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, La6/u;

    invoke-direct {v0, p1, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_4
    :goto_1
    new-instance v2, Lil1/u$c;

    sget-object v6, Lem1/r;->OVERRIDE:Lem1/r;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lil1/u$c;-><init>(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, La6/u;

    invoke-direct {p1, v2, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
