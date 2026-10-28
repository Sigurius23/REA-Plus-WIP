.class final Ltd1/g$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd1/g;-><init>(Ltd1/b;Lq92/h;Lbc3/c0;)V
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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ltd1/f;",
        "accumulator",
        "value",
        "<anonymous>",
        "(Ltd1/f;Ltd1/f;)Ltd1/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.domain.strap.WhoopStrapStatusFlowWrapper$whoopStrapStatusFlow$2"
    f = "WhoopStrapStatusFlowWrapper.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ltd1/g$d;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ltd1/f;Ltd1/f;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltd1/f;",
            "Ltd1/f;",
            "Lq83/d<",
            "-",
            "Ltd1/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ltd1/g$d;

    invoke-direct {v0, p3}, Ltd1/g$d;-><init>(Lq83/d;)V

    iput-object p1, v0, Ltd1/g$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Ltd1/g$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ltd1/g$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltd1/f;

    check-cast p2, Ltd1/f;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ltd1/g$d;->f(Ltd1/f;Ltd1/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltd1/g$d;->x:Ljava/lang/Object;

    check-cast v0, Ltd1/f;

    iget-object v1, p0, Ltd1/g$d;->y:Ljava/lang/Object;

    check-cast v1, Ltd1/f;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ltd1/g$d;->w:I

    if-nez v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Ltd1/f;->PAIR_DEVICE:Ltd1/f;

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ltd1/f;->CONNECTING:Ltd1/f;

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    if-ne v0, p1, :cond_2

    sget-object v2, Ltd1/f;->CONNECTED:Ltd1/f;

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    if-ne v0, p1, :cond_3

    sget-object p1, Ltd1/f;->CONNECTION_FAILED:Ltd1/f;

    if-ne v1, p1, :cond_3

    :goto_0
    return-object v1

    :cond_3
    sget-object p1, Ltd1/f;->NA:Ltd1/f;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
