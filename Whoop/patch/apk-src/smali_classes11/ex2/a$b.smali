.class final Lex2/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lex2/a;->b(Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse;",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.data.repositories.DwlLandingRepository$fetchLanding$result$1"
    f = "DwlLandingRepository.kt"
    l = {
        0x22
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lex2/a;

.field final synthetic y:Lcom/whoop/domain/model/WhoopStrapInfo;


# direct methods
.method public constructor <init>(Lex2/a;Lcom/whoop/domain/model/WhoopStrapInfo;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lex2/a;",
            "Lcom/whoop/domain/model/WhoopStrapInfo;",
            "Lq83/d<",
            "-",
            "Lex2/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lex2/a$b;->x:Lex2/a;

    iput-object p2, p0, Lex2/a$b;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lex2/a$b;

    iget-object v1, p0, Lex2/a$b;->x:Lex2/a;

    iget-object v2, p0, Lex2/a$b;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-direct {v0, v1, v2, p1}, Lex2/a$b;-><init>(Lex2/a;Lcom/whoop/domain/model/WhoopStrapInfo;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lex2/a$b;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lpg3/v0<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lex2/a$b;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lex2/a$b;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lex2/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lex2/a$b;->w:I

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

    iget-object p1, p0, Lex2/a$b;->x:Lex2/a;

    invoke-static {p1}, Lex2/a;->a(Lex2/a;)Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;

    move-result-object v3

    iget-object p1, p0, Lex2/a$b;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getHardwareVersion()Loh2/c;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Loh2/c;->d()Ljava/lang/String;

    move-result-object p1

    move-object v4, p1

    goto :goto_0

    :cond_2
    move-object v4, v1

    :goto_0
    iget-object p1, p0, Lex2/a$b;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getMaximVersion()Loh2/b;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object p1

    move-object v5, p1

    goto :goto_1

    :cond_3
    move-object v5, v1

    :goto_1
    iget-object p1, p0, Lex2/a$b;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getBluetoothVersion()Loh2/b;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object p1

    move-object v6, p1

    goto :goto_2

    :cond_4
    move-object v6, v1

    :goto_2
    iget-object p1, p0, Lex2/a$b;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSigProcVersion()Loh2/e;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Loh2/e;->f()Ljava/lang/String;

    move-result-object p1

    move-object v7, p1

    goto :goto_3

    :cond_5
    move-object v7, v1

    :goto_3
    iget-object p1, p0, Lex2/a$b;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getRawSerialNumber()Ljava/lang/String;

    move-result-object v1

    :cond_6
    move-object v8, v1

    iput v2, p0, Lex2/a$b;->w:I

    move-object v9, p0

    invoke-interface/range {v3 .. v9}, Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;->fetchHome(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    return-object p1
.end method
