.class final Lhg1/b$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhg1/b;->a(Lfg1/b;Lq83/d;)Ljava/lang/Object;
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
        "Ll83/a0;",
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
    c = "com.whoop.firmwareEvents.uploader.StrapEventsUploaderToApiImpl$uploadToCloud$2"
    f = "StrapEventsUploaderToApi.kt"
    l = {
        0x27
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field final synthetic x:Lhg1/b;

.field final synthetic y:Lud3/v0;

.field final synthetic z:Loh2/a;


# direct methods
.method public constructor <init>(Lhg1/b;Lud3/v0;Loh2/a;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhg1/b;",
            "Lud3/v0;",
            "Loh2/a;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lhg1/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhg1/b$b;->x:Lhg1/b;

    iput-object p2, p0, Lhg1/b$b;->y:Lud3/v0;

    iput-object p3, p0, Lhg1/b$b;->z:Loh2/a;

    iput-object p4, p0, Lhg1/b$b;->E:Ljava/lang/String;

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

    new-instance v0, Lhg1/b$b;

    iget-object v1, p0, Lhg1/b$b;->x:Lhg1/b;

    iget-object v2, p0, Lhg1/b$b;->y:Lud3/v0;

    iget-object v3, p0, Lhg1/b$b;->z:Loh2/a;

    iget-object v4, p0, Lhg1/b$b;->E:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lhg1/b$b;-><init>(Lhg1/b;Lud3/v0;Loh2/a;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lhg1/b$b;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lhg1/b$b;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lhg1/b$b;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lhg1/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v12, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lhg1/b$b;->w:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lhg1/b$b;->x:Lhg1/b;

    invoke-static {v0}, Lhg1/b;->b(Lhg1/b;)Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;

    move-result-object v0

    iget-object v2, p0, Lhg1/b$b;->y:Lud3/v0;

    iget-object v3, p0, Lhg1/b$b;->z:Loh2/a;

    const-string v4, ""

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Loh2/a;->d()Loh2/c;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Loh2/c;->d()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    :cond_2
    move-object v3, v4

    :cond_3
    iget-object v5, p0, Lhg1/b$b;->z:Loh2/a;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Loh2/a;->c()Loh2/b;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-interface {v5}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    :cond_4
    move-object v5, v4

    :cond_5
    iget-object v6, p0, Lhg1/b$b;->z:Loh2/a;

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Loh2/a;->b()Loh2/b;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-interface {v6}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_7

    :cond_6
    move-object v6, v4

    :cond_7
    iget-object v7, p0, Lhg1/b$b;->z:Loh2/a;

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Loh2/a;->e()Loh2/e;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Loh2/e;->f()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_9

    :cond_8
    move-object v7, v4

    :cond_9
    iget-object v8, p0, Lhg1/b$b;->z:Loh2/a;

    if-eqz v8, :cond_b

    invoke-virtual {v8}, Loh2/a;->f()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_a

    goto :goto_0

    :cond_a
    move-object v4, v8

    :cond_b
    :goto_0
    iget-object v8, p0, Lhg1/b$b;->x:Lhg1/b;

    invoke-static {v8}, Lhg1/b;->d(Lhg1/b;)Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lhg1/b$b;->x:Lhg1/b;

    invoke-static {v9}, Lhg1/b;->c(Lhg1/b;)Ljava/lang/String;

    move-result-object v9

    iget-object v10, p0, Lhg1/b$b;->z:Loh2/a;

    if-eqz v10, :cond_c

    invoke-virtual {v10}, Loh2/a;->g()B

    move-result v10

    goto :goto_1

    :cond_c
    const/4 v10, 0x4

    :goto_1
    iget-object v13, p0, Lhg1/b$b;->E:Ljava/lang/String;

    iput v1, p0, Lhg1/b$b;->w:I

    move-object v1, v6

    move-object v6, v4

    move-object v4, v1

    move-object v11, p0

    move-object v1, v2

    move-object v2, v3

    move-object v3, v5

    move-object v5, v7

    move-object v7, v8

    move-object v8, v9

    move v9, v10

    move-object v10, v13

    invoke-interface/range {v0 .. v11}, Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;->uploadFirmwareEvents(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_d

    return-object v12

    :cond_d
    return-object v0
.end method
