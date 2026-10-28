.class final Lcq0/a$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq0/a;->f(IILq83/d;)Ljava/lang/Object;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lbc3/c0;",
        "Lcom/whoop/data/remote/commons/Resource;",
        "",
        "Lbq0/b;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.community.data.repository.ChatRepository$getDataWidgets$2"
    f = "ChatRepository.kt"
    l = {
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcq0/a;

.field final synthetic y:I

.field final synthetic z:I


# direct methods
.method public constructor <init>(Lcq0/a;IILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq0/a;",
            "II",
            "Lq83/d<",
            "-",
            "Lcq0/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcq0/a$d;->x:Lcq0/a;

    iput p2, p0, Lcq0/a$d;->y:I

    iput p3, p0, Lcq0/a$d;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lcq0/a$d;

    iget-object v0, p0, Lcq0/a$d;->x:Lcq0/a;

    iget v1, p0, Lcq0/a$d;->y:I

    iget v2, p0, Lcq0/a$d;->z:I

    invoke-direct {p1, v0, v1, v2, p2}, Lcq0/a$d;-><init>(Lcq0/a;IILq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "+",
            "Ljava/util/List<",
            "Lbq0/b;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcq0/a$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcq0/a$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcq0/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcq0/a$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcq0/a$d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcq0/a$d;->x:Lcq0/a;

    invoke-static {p1}, Lcq0/a;->b(Lcq0/a;)Lcom/whoop/community/data/network/ChatApi;

    move-result-object p1

    iget v1, p0, Lcq0/a$d;->y:I

    iget v3, p0, Lcq0/a$d;->z:I

    iput v2, p0, Lcq0/a$d;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/community/data/network/ChatApi;->getDataWidgets(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_4

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/community/data/network/DataWidgetDto;

    invoke-virtual {v1}, Lcom/whoop/community/data/network/DataWidgetDto;->toDataWidget()Lbq0/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    sget-object v0, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    invoke-virtual {v0, p1}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :goto_3
    iget-object v0, p0, Lcq0/a$d;->x:Lcq0/a;

    invoke-static {v0}, Lcq0/a;->d(Lcq0/a;)Ltr2/n;

    move-result-object v0

    iget-object v1, p0, Lcq0/a$d;->x:Lcq0/a;

    invoke-static {v1}, Lcq0/a;->c(Lcq0/a;)Lrr2/c;

    move-result-object v1

    const-string v2, "Exception occurred while getting the data widgets"

    invoke-static {p1, v2, v0, v1}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    move-result-object v4

    sget-object v3, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    sget-object v0, Lcom/whoop/network/exception/DomainException;->x:Lcom/whoop/network/exception/DomainException$a;

    invoke-virtual {v0, p1}, Lcom/whoop/network/exception/DomainException$a;->a(Ljava/lang/Throwable;)Lcom/whoop/network/exception/DomainException;

    move-result-object v7

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1
.end method
