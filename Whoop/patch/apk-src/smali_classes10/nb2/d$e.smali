.class final Lnb2/d$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnb2/d;->interact(Lec3/l;)Lec3/l;
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
        "Lnb2/c;",
        "internalState",
        "Lnb2/e;",
        "action",
        "<anonymous>",
        "(Lnb2/c;Lnb2/e;)Lnb2/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.gifthub.domain.GiftHubInteractor$interact$2"
    f = "GiftHubInteractor.kt"
    l = {
        0x26
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lnb2/d;


# direct methods
.method public constructor <init>(Lnb2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnb2/d;",
            "Lq83/d<",
            "-",
            "Lnb2/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnb2/d$e;->z:Lnb2/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lnb2/c;Lnb2/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnb2/c;",
            "Lnb2/e;",
            "Lq83/d<",
            "-",
            "Lnb2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lnb2/d$e;

    iget-object v1, p0, Lnb2/d$e;->z:Lnb2/d;

    invoke-direct {v0, v1, p3}, Lnb2/d$e;-><init>(Lnb2/d;Lq83/d;)V

    iput-object p1, v0, Lnb2/d$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lnb2/d$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lnb2/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnb2/c;

    check-cast p2, Lnb2/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lnb2/d$e;->f(Lnb2/c;Lnb2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lnb2/d$e;->x:Ljava/lang/Object;

    check-cast v0, Lnb2/c;

    iget-object v1, p0, Lnb2/d$e;->y:Ljava/lang/Object;

    check-cast v1, Lnb2/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lnb2/d$e;->w:I

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

    sget-object p1, Lnb2/e$b;->a:Lnb2/e$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lnb2/b$c;->a:Lnb2/b$c;

    invoke-virtual {v0, p1}, Lnb2/c;->a(Lnb2/b;)Lnb2/c;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v1, Lnb2/e$a;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lnb2/d$e;->z:Lnb2/d;

    iput-object v0, p0, Lnb2/d$e;->x:Ljava/lang/Object;

    iput-object v1, p0, Lnb2/d$e;->y:Ljava/lang/Object;

    iput v4, p0, Lnb2/d$e;->w:I

    invoke-static {p1, p0}, Lnb2/d;->c(Lnb2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;

    if-eqz p1, :cond_4

    iget-object v2, p0, Lnb2/d$e;->z:Lnb2/d;

    invoke-static {v2}, Lnb2/d;->d(Lnb2/d;)Llb2/b;

    move-result-object v2

    new-instance v3, Llb2/a$c;

    iget-object v4, p0, Lnb2/d$e;->z:Lnb2/d;

    invoke-virtual {p1}, Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;->getStyle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/settings/gifthub/domain/models/GiftHubResponseKt;->toGiftHubStyle(Ljava/lang/String;)Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;

    move-result-object v5

    invoke-static {v4, v5}, Lnb2/d;->f(Lnb2/d;Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;)Ljava/lang/String;

    move-result-object v5

    check-cast v1, Lnb2/e$a;

    invoke-virtual {v1}, Lnb2/e$a;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x9

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Llb2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v3}, Llb2/b;->a(Llb2/a;)V

    new-instance v1, Lnb2/b$b;

    invoke-direct {v1, p1}, Lnb2/b$b;-><init>(Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;)V

    invoke-virtual {v0, v1}, Lnb2/c;->a(Lnb2/b;)Lnb2/c;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object p1, p0, Lnb2/d$e;->z:Lnb2/d;

    invoke-static {p1}, Lnb2/d;->d(Lnb2/d;)Llb2/b;

    move-result-object p1

    new-instance v1, Llb2/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v4, v2}, Llb2/a$b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v1}, Llb2/b;->a(Llb2/a;)V

    sget-object p1, Lnb2/b$a;->a:Lnb2/b$a;

    invoke-virtual {v0, p1}, Lnb2/c;->a(Lnb2/b;)Lnb2/c;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
