.class final Lcom/whoop/service/rearchitect/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/service/rearchitect/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/service/rearchitect/c$a;",
        "",
        "<init>",
        "(Lcom/whoop/service/rearchitect/c;)V",
        "Lfk2/a;",
        "strapTimeParam",
        "",
        "b",
        "(Lfk2/a;Lq83/d;)Ljava/lang/Object;",
        "timeStamp",
        "a",
        "(Lfk2/a;)Z",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/service/rearchitect/c;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$a;->a:Lcom/whoop/service/rearchitect/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lfk2/a;)Z
    .locals 5

    const-string v0, "timeStamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lfk2/a;->g()Lfk2/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lfk2/a;->c(Lfk2/a;)Lfk2/a$b;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$a;->a:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "RTC time delta = {"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Loh3/d;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lfk2/a$b;->f()J

    move-result-wide v0

    const-wide/16 v3, 0x2

    cmp-long p1, v0, v3

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v2
.end method

.method public final b(Lfk2/a;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfk2/a;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/service/rearchitect/c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/service/rearchitect/c$a$a;

    iget v1, v0, Lcom/whoop/service/rearchitect/c$a$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/service/rearchitect/c$a$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/service/rearchitect/c$a$a;

    invoke-direct {v0, p0, p2}, Lcom/whoop/service/rearchitect/c$a$a;-><init>(Lcom/whoop/service/rearchitect/c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/service/rearchitect/c$a$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/service/rearchitect/c$a$a;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lcom/whoop/service/rearchitect/c$a$a;->y:I

    iget-object v2, v0, Lcom/whoop/service/rearchitect/c$a$a;->x:Ljava/lang/Object;

    check-cast v2, Lfk2/a;

    iget-object v7, v0, Lcom/whoop/service/rearchitect/c$a$a;->w:Ljava/lang/Object;

    check-cast v7, Lfk2/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v2

    move v2, p1

    move-object p1, v9

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lcom/whoop/service/rearchitect/c$a$a;->y:I

    iget-object v2, v0, Lcom/whoop/service/rearchitect/c$a$a;->x:Ljava/lang/Object;

    check-cast v2, Lfk2/a;

    iget-object v7, v0, Lcom/whoop/service/rearchitect/c$a$a;->w:Ljava/lang/Object;

    check-cast v7, Lfk2/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v2

    move v2, p1

    move-object p1, v9

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move p2, v5

    :goto_1
    add-int/lit8 v2, p2, 0x1

    if-ge p2, v6, :cond_b

    if-nez p1, :cond_7

    iget-object p2, p0, Lcom/whoop/service/rearchitect/c$a;->a:Lcom/whoop/service/rearchitect/c;

    invoke-static {p2}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object p2

    const-string v7, "synchronizeClockSynchronously found null strapTime getting clock from strap"

    new-array v8, v5, [Ljava/lang/Object;

    invoke-virtual {p2, v7, v8}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/service/rearchitect/c$a;->a:Lcom/whoop/service/rearchitect/c;

    invoke-static {p2}, Lcom/whoop/service/rearchitect/c;->B2(Lcom/whoop/service/rearchitect/c;)Lin2/d;

    move-result-object p2

    invoke-interface {p2}, Lin2/d;->getDefault()Lq83/j;

    move-result-object p2

    new-instance v7, Lcom/whoop/service/rearchitect/c$a$b;

    iget-object v8, p0, Lcom/whoop/service/rearchitect/c$a;->a:Lcom/whoop/service/rearchitect/c;

    invoke-direct {v7, v8, v4}, Lcom/whoop/service/rearchitect/c$a$b;-><init>(Lcom/whoop/service/rearchitect/c;Lq83/d;)V

    iput-object v4, v0, Lcom/whoop/service/rearchitect/c$a$a;->w:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/service/rearchitect/c$a$a;->x:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/service/rearchitect/c$a$a;->y:I

    iput v6, v0, Lcom/whoop/service/rearchitect/c$a$a;->F:I

    invoke-static {p2, v7, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_5

    :cond_4
    :goto_2
    check-cast p2, Lzj0/g;

    if-eqz p2, :cond_6

    invoke-interface {p2}, Lzj0/g;->getTime()Lfk2/a;

    move-result-object p2

    if-nez p2, :cond_5

    goto :goto_3

    :cond_5
    move-object p1, p2

    goto :goto_4

    :cond_6
    :goto_3
    move p2, v2

    goto :goto_1

    :cond_7
    :goto_4
    invoke-virtual {p0, p1}, Lcom/whoop/service/rearchitect/c$a;->a(Lfk2/a;)Z

    move-result p2

    if-eqz p2, :cond_a

    iget-object p2, p0, Lcom/whoop/service/rearchitect/c$a;->a:Lcom/whoop/service/rearchitect/c;

    invoke-static {p2}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object p2

    const-string v7, "synchronizeClockSynchronously found clock drift, setting the whoop strap clock"

    new-array v8, v5, [Ljava/lang/Object;

    invoke-virtual {p2, v7, v8}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/service/rearchitect/c$a;->a:Lcom/whoop/service/rearchitect/c;

    invoke-static {p2}, Lcom/whoop/service/rearchitect/c;->B2(Lcom/whoop/service/rearchitect/c;)Lin2/d;

    move-result-object p2

    invoke-interface {p2}, Lin2/d;->getDefault()Lq83/j;

    move-result-object p2

    new-instance v7, Lcom/whoop/service/rearchitect/c$a$c;

    iget-object v8, p0, Lcom/whoop/service/rearchitect/c$a;->a:Lcom/whoop/service/rearchitect/c;

    invoke-direct {v7, v8, v4}, Lcom/whoop/service/rearchitect/c$a$c;-><init>(Lcom/whoop/service/rearchitect/c;Lq83/d;)V

    iput-object v4, v0, Lcom/whoop/service/rearchitect/c$a$a;->w:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/service/rearchitect/c$a$a;->x:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/service/rearchitect/c$a$a;->y:I

    iput v3, v0, Lcom/whoop/service/rearchitect/c$a$a;->F:I

    invoke-static {p2, v7, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    :goto_5
    return-object v1

    :cond_8
    :goto_6
    check-cast p2, Lzj0/h;

    if-nez p2, :cond_9

    goto :goto_3

    :cond_9
    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$a;->a:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "synchronizeClockSynchronously SetClockPacket response: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v5, [Ljava/lang/Object;

    invoke-virtual {p1, p2, v0}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_a
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_b
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method
