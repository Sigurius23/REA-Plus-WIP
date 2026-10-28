.class public final La63/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La63/i0;


# instance fields
.field public final a:Lv53/c;

.field public b:I

.field public c:Lw53/b;


# direct methods
.method public constructor <init>(Lv53/c;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La63/c0;->a:Lv53/c;

    return-void
.end method


# virtual methods
.method public final a(Le63/d;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, La63/b0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La63/b0;

    iget v1, v0, La63/b0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La63/b0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, La63/b0;

    invoke-direct {v0, p0, p2}, La63/b0;-><init>(La63/c0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, La63/b0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La63/b0;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, La63/b0;->w:La63/c0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, La63/c0;->c:Lw53/b;

    if-eqz p2, :cond_3

    invoke-static {p2, v3}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_3
    iget p2, p0, La63/c0;->b:I

    const/16 v2, 0x14

    if-ge p2, v2, :cond_7

    add-int/2addr p2, v4

    iput p2, p0, La63/c0;->b:I

    iget-object p2, p0, La63/c0;->a:Lv53/c;

    iget-object p2, p2, Lv53/c;->G:Le63/f;

    iget-object v2, p1, Le63/d;->d:Ljava/lang/Object;

    iput-object p0, v0, La63/b0;->w:La63/c0;

    iput v4, v0, La63/b0;->z:I

    invoke-virtual {p2, p1, v2, v0}, Lr63/d;->a(Ljava/lang/Object;Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    instance-of v0, p2, Lw53/b;

    if-eqz v0, :cond_5

    move-object v3, p2

    check-cast v3, Lw53/b;

    :cond_5
    if-eqz v3, :cond_6

    iput-object v3, p1, La63/c0;->c:Lw53/b;

    return-object v3

    :cond_6
    const-string p1, "Failed to execute send pipeline. Expected [HttpClientCall], but received "

    invoke-static {p2, p1}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    new-instance p1, Lio/ktor/client/plugins/SendCountExceedException;

    const-string p2, "Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required."

    invoke-direct {p1, p2}, Lio/ktor/client/plugins/SendCountExceedException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
