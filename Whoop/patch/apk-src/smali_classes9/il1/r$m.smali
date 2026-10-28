.class final Lil1/r$m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


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
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Lqw2/b;",
        "",
        "e",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.HomeFeedDomainInteractor$performAction$1"
    f = "HomeFeedDomainInteractor.kt"
    l = {
        0xcf
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lil1/r;


# direct methods
.method public constructor <init>(Lil1/r;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil1/r;",
            "Lq83/d<",
            "-",
            "Lil1/r$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lil1/r$m;->z:Lil1/r;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lil1/r$m;

    iget-object v1, p0, Lil1/r$m;->z:Lil1/r;

    invoke-direct {v0, v1, p3}, Lil1/r$m;-><init>(Lil1/r;Lq83/d;)V

    iput-object p1, v0, Lil1/r$m;->x:Ljava/lang/Object;

    iput-object p2, v0, Lil1/r$m;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lil1/r$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lil1/r$m;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lil1/r$m;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, p0, Lil1/r$m;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lil1/r$m;->w:I

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

    iget-object p1, p0, Lil1/r$m;->z:Lil1/r;

    invoke-static {p1}, Lil1/r;->h(Lil1/r;)Ltr2/n;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const-string v5, "Failed to perform action: "

    invoke-static {v5, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {p1, v3, v5}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v6, Lqw2/b$a;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "unknown"

    :cond_2
    move-object v7, p1

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqw2/b$a;-><init>(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lil1/r$m;->x:Ljava/lang/Object;

    iput-object p1, p0, Lil1/r$m;->y:Ljava/lang/Object;

    iput v4, p0, Lil1/r$m;->w:I

    invoke-interface {v0, v6, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
