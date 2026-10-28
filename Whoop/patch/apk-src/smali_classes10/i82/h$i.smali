.class final Li82/h$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li82/h;->t(Ljava/lang/String;Ljava/lang/String;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Li82/h$b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.searcharchmini.domain.SearchArchMiniInteractor$searchWithQuery$1"
    f = "SearchArchMiniInteractor.kt"
    l = {
        0xaa,
        0xab,
        0xad
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Li82/h;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Li82/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Li82/h;",
            "Lq83/d<",
            "-",
            "Li82/h$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li82/h$i;->z:Ljava/lang/String;

    iput-object p2, p0, Li82/h$i;->E:Ljava/lang/String;

    iput-object p3, p0, Li82/h$i;->F:Li82/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Li82/h$i;

    iget-object v1, p0, Li82/h$i;->z:Ljava/lang/String;

    iget-object v2, p0, Li82/h$i;->E:Ljava/lang/String;

    iget-object v3, p0, Li82/h$i;->F:Li82/h;

    invoke-direct {v0, v1, v2, v3, p2}, Li82/h$i;-><init>(Ljava/lang/String;Ljava/lang/String;Li82/h;Lq83/d;)V

    iput-object p1, v0, Li82/h$i;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Li82/h$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Li82/h$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Li82/h$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Li82/h$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Li82/h$i;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Li82/h$i;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Li82/h$i;->w:Ljava/lang/Object;

    check-cast v0, Li82/h$b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Li82/h$i;->w:Ljava/lang/Object;

    check-cast v2, Li82/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Li82/h$i;->z:Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    new-instance p1, Li82/h$b$k;

    iget-object v2, p0, Li82/h$i;->z:Ljava/lang/String;

    iget-object v7, p0, Li82/h$i;->E:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-direct {p1, v2, v7, v8}, Li82/h$b$k;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Li82/h$i;->y:Ljava/lang/Object;

    iput v6, p0, Li82/h$i;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_0
    iget-object v2, p0, Li82/h$i;->F:Li82/h;

    iget-object p1, p0, Li82/h$i;->z:Ljava/lang/String;

    iget-object v6, p0, Li82/h$i;->E:Ljava/lang/String;

    iput-object v0, p0, Li82/h$i;->y:Ljava/lang/Object;

    iput-object v2, p0, Li82/h$i;->w:Ljava/lang/Object;

    iput v5, p0, Li82/h$i;->x:I

    invoke-static {v2, p1, v6, p0}, Li82/h;->d(Li82/h;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    check-cast p1, Lu02/a;

    invoke-static {v2, p1}, Li82/h;->c(Li82/h;Lu02/a;)Li82/h$b;

    move-result-object p1

    instance-of v2, p1, Li82/h$b$b;

    if-eqz v2, :cond_7

    iget-object v2, p0, Li82/h$i;->F:Li82/h;

    invoke-static {v2}, Li82/h;->i(Li82/h;)Li82/d;

    move-result-object v2

    move-object v5, p1

    check-cast v5, Li82/h$b$b;

    invoke-virtual {v5}, Li82/h$b$b;->a()Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;

    move-result-object v5

    invoke-virtual {v2, v5}, Li82/d;->b(Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;)V

    :cond_7
    const/4 v2, 0x0

    iput-object v2, p0, Li82/h$i;->y:Ljava/lang/Object;

    iput-object v2, p0, Li82/h$i;->w:Ljava/lang/Object;

    iput v4, p0, Li82/h$i;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_2
    return-object v1

    :cond_8
    :goto_3
    return-object v3
.end method
