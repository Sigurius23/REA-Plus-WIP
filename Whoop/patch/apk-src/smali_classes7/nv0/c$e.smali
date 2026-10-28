.class final Lnv0/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnv0/c;->l(Ljava/lang/String;Lnv0/b$c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.contentsearch.domain.ContentSearchInteractor$getNextPage$2"
    f = "ContentSearchInteractor.kt"
    l = {
        0x4a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field final synthetic x:Lnv0/c;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lnv0/b$c;


# direct methods
.method public constructor <init>(Lnv0/c;Ljava/lang/String;Lnv0/b$c;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnv0/c;",
            "Ljava/lang/String;",
            "Lnv0/b$c;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lnv0/c$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnv0/c$e;->x:Lnv0/c;

    iput-object p2, p0, Lnv0/c$e;->y:Ljava/lang/String;

    iput-object p3, p0, Lnv0/c$e;->z:Lnv0/b$c;

    iput-object p4, p0, Lnv0/c$e;->E:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnv0/c$e;

    iget-object v1, p0, Lnv0/c$e;->x:Lnv0/c;

    iget-object v2, p0, Lnv0/c$e;->y:Ljava/lang/String;

    iget-object v3, p0, Lnv0/c$e;->z:Lnv0/b$c;

    iget-object v4, p0, Lnv0/c$e;->E:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lnv0/c$e;-><init>(Lnv0/c;Ljava/lang/String;Lnv0/b$c;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lnv0/c$e;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lnv0/c$e;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnv0/c$e;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lnv0/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lnv0/c$e;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lnv0/c$e;->x:Lnv0/c;

    invoke-static {p1}, Lnv0/c;->b(Lnv0/c;)Lcom/whoop/contentsearch/domain/ContentSearchApi;

    move-result-object v3

    iget-object v4, p0, Lnv0/c$e;->y:Ljava/lang/String;

    iget-object p1, p0, Lnv0/c$e;->x:Lnv0/c;

    iget-object v1, p0, Lnv0/c$e;->z:Lnv0/b$c;

    invoke-static {p1, v1}, Lnv0/c;->e(Lnv0/c;Lnv0/b;)Ljava/lang/String;

    move-result-object v5

    iget-object v7, p0, Lnv0/c$e;->E:Ljava/lang/String;

    iput v2, p0, Lnv0/c$e;->w:I

    const/4 v6, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lcom/whoop/contentsearch/domain/ContentSearchApi;->a(Lcom/whoop/contentsearch/domain/ContentSearchApi;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
