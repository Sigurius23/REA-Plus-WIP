.class final Lx92/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx92/a;->a(Lfg1/a;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.store.statuspackets.FirmwareEventsStoreImpl$store$1"
    f = "FirmwareEventsStoreImpl.kt"
    l = {
        0x3c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lfg1/a;

.field w:Ljava/lang/Object;

.field x:J

.field y:I

.field final synthetic z:Lx92/a;


# direct methods
.method public constructor <init>(Lx92/a;Lfg1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx92/a;",
            "Lfg1/a;",
            "Lq83/d<",
            "-",
            "Lx92/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx92/a$a;->z:Lx92/a;

    iput-object p2, p0, Lx92/a$a;->E:Lfg1/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lx92/a$a;

    iget-object v0, p0, Lx92/a$a;->z:Lx92/a;

    iget-object v1, p0, Lx92/a$a;->E:Lfg1/a;

    invoke-direct {p1, v0, v1, p2}, Lx92/a$a;-><init>(Lx92/a;Lfg1/a;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lx92/a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx92/a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx92/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx92/a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx92/a$a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lx92/a$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lx92/a$a;->z:Lx92/a;

    iget-object v3, p0, Lx92/a$a;->E:Lfg1/a;

    invoke-virtual {v3}, Lfg1/a;->b()Loh2/a;

    move-result-object v3

    invoke-static {v1, v3}, Lx92/a;->e(Lx92/a;Loh2/a;)J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-object v1, p0, Lx92/a$a;->z:Lx92/a;

    invoke-static {v1}, Lx92/a;->d(Lx92/a;)Ltr2/n;

    move-result-object v1

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    const-string v6, "Firmware Events storage got a missing version ID for a packet batch!"

    invoke-interface {v1, v6, v5}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_2
    iget-object v1, p0, Lx92/a$a;->E:Lfg1/a;

    invoke-virtual {v1}, Lfg1/a;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg5/b;

    iget-object v6, v5, Lg5/b;->a:Ljava/lang/Object;

    check-cast v6, Lot0/b;

    iget-object v5, v5, Lg5/b;->b:Ljava/lang/Object;

    check-cast v5, Lmt0/b;

    new-instance v7, Lbu0/a;

    invoke-interface {v6}, Lot0/b;->getTimestamp()Lfk2/a;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lfk2/a;->f()J

    move-result-wide v8

    goto :goto_1

    :cond_3
    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v8

    invoke-virtual {v8}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v8

    :goto_1
    iget-object v10, p0, Lx92/a$a;->z:Lx92/a;

    invoke-static {v10, v6}, Lx92/a;->b(Lx92/a;Lot0/b;)Ljava/lang/Integer;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :goto_2
    move v10, v6

    goto :goto_3

    :cond_4
    const/4 v6, -0x1

    goto :goto_2

    :goto_3
    invoke-virtual {v5}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v11

    long-to-int v12, v3

    invoke-direct/range {v7 .. v12}, Lbu0/a;-><init>(JILjava/nio/ByteBuffer;I)V

    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lx92/a$a;->z:Lx92/a;

    invoke-static {v1}, Lx92/a;->c(Lx92/a;)Lfg1/c;

    move-result-object v1

    const/4 v5, 0x0

    iput-object v5, p0, Lx92/a$a;->w:Ljava/lang/Object;

    iput-wide v3, p0, Lx92/a$a;->x:J

    iput v2, p0, Lx92/a$a;->y:I

    invoke-interface {v1, p1, p0}, Lfg1/c;->c(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
