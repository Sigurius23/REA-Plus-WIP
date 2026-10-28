.class public final Lcom/whoop/puffin/sync/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvk0/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B;\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0010R \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0014\u001a\u0004\u0008\u0018\u0010\u0016R\u001a\u0010\u0008\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lcom/whoop/puffin/sync/b;",
        "Lvk0/j;",
        "Lec3/p1;",
        "Lvk0/k;",
        "serviceFlow",
        "Lvk0/i;",
        "iGattService",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/puffin/sync/c;",
        "batterySyncHolder",
        "<init>",
        "(Lec3/p1;Lec3/p1;Ltr2/n;Lcom/whoop/puffin/sync/c;)V",
        "gattService",
        "Lvk0/e;",
        "x",
        "(Lvk0/i;Lq83/d;)Ljava/lang/Object;",
        "Ll83/a0;",
        "H",
        "a",
        "Lec3/p1;",
        "o",
        "()Lec3/p1;",
        "b",
        "l",
        "c",
        "Ltr2/n;",
        "h",
        "()Ltr2/n;",
        "d",
        "Lcom/whoop/puffin/sync/c;",
        "",
        "e",
        "Ljava/lang/String;",
        "F",
        "()Ljava/lang/String;",
        "taskName",
        "puffin_release"
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
.field private final a:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final b:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final c:Ltr2/n;

.field private final d:Lcom/whoop/puffin/sync/c;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/p1;Lec3/p1;Ltr2/n;Lcom/whoop/puffin/sync/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/p1;",
            "Lec3/p1;",
            "Ltr2/n;",
            "Lcom/whoop/puffin/sync/c;",
            ")V"
        }
    .end annotation

    const-string v0, "serviceFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iGattService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batterySyncHolder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/puffin/sync/b;->a:Lec3/p1;

    .line 3
    iput-object p2, p0, Lcom/whoop/puffin/sync/b;->b:Lec3/p1;

    .line 4
    iput-object p3, p0, Lcom/whoop/puffin/sync/b;->c:Ltr2/n;

    .line 5
    iput-object p4, p0, Lcom/whoop/puffin/sync/b;->d:Lcom/whoop/puffin/sync/c;

    .line 6
    const-string p1, "PuffinHistoricalPullTask"

    iput-object p1, p0, Lcom/whoop/puffin/sync/b;->e:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lec3/p1;Lec3/p1;Ltr2/n;Lcom/whoop/puffin/sync/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 7
    sget-object p1, Lvk0/k$a;->a:Lvk0/k$a;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x0

    .line 8
    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    .line 9
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "PuffinHistoricalPullTask"

    invoke-virtual {p3, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 10
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/puffin/sync/b;-><init>(Lec3/p1;Lec3/p1;Ltr2/n;Lcom/whoop/puffin/sync/c;)V

    return-void
.end method


# virtual methods
.method public F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/puffin/sync/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public H(Lvk0/i;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/puffin/sync/b;->d:Lcom/whoop/puffin/sync/c;

    invoke-virtual {v0, p1, p2}, Lcom/whoop/puffin/sync/c;->j(Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public h()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lcom/whoop/puffin/sync/b;->c:Ltr2/n;

    return-object v0
.end method

.method public l()Lec3/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/p1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/puffin/sync/b;->b:Lec3/p1;

    return-object v0
.end method

.method public o()Lec3/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/p1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/puffin/sync/b;->a:Lec3/p1;

    return-object v0
.end method

.method public x(Lvk0/i;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Lvk0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/puffin/sync/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/puffin/sync/b$a;

    iget v1, v0, Lcom/whoop/puffin/sync/b$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/puffin/sync/b$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/puffin/sync/b$a;

    invoke-direct {v0, p0, p2}, Lcom/whoop/puffin/sync/b$a;-><init>(Lcom/whoop/puffin/sync/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/puffin/sync/b$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/puffin/sync/b$a;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/whoop/puffin/sync/b$a;->x:Ljava/lang/Object;

    check-cast p1, Ly42/a;

    iget-object p1, v0, Lcom/whoop/puffin/sync/b$a;->w:Ljava/lang/Object;

    check-cast p1, Lvk0/i;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/puffin/sync/b;->h()Ltr2/n;

    move-result-object p2

    const-string v2, "beginning puffin hps execution"

    new-array v6, v3, [Lqr2/a$a;

    invoke-interface {p2, v2, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    instance-of p2, p1, Ly42/a;

    if-eqz p2, :cond_3

    check-cast p1, Ly42/a;

    goto :goto_1

    :cond_3
    move-object p1, v5

    :goto_1
    if-nez p1, :cond_4

    new-instance p1, Lvk0/e$a;

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Could not cast gattService to Puffin"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lvk0/e$a;-><init>(Ljava/lang/Exception;)V

    return-object p1

    :cond_4
    invoke-interface {p1}, Ly42/a;->l()Lec3/t1;

    move-result-object p2

    invoke-interface {p2}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    sget-object v2, Lc52/b$f;->a:Lc52/b$f;

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    new-instance p1, Lvk0/e$a;

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Puffin must be in Ready state to execute HPS"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lvk0/e$a;-><init>(Ljava/lang/Exception;)V

    return-object p1

    :cond_5
    iget-object p2, p0, Lcom/whoop/puffin/sync/b;->d:Lcom/whoop/puffin/sync/c;

    iput-object v5, v0, Lcom/whoop/puffin/sync/b$a;->w:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/puffin/sync/b$a;->x:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/puffin/sync/b$a;->E:I

    invoke-virtual {p2, p1, v0}, Lcom/whoop/puffin/sync/c;->h(Ly42/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    check-cast p2, Lcom/whoop/puffin/sync/f$b;

    invoke-virtual {p0}, Lcom/whoop/puffin/sync/b;->h()Ltr2/n;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "puffin HPS ended with "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    instance-of p1, p2, Lcom/whoop/puffin/sync/f$b$c;

    if-eqz p1, :cond_7

    new-instance p1, Lvk0/e$b;

    invoke-direct {p1, v5}, Lvk0/e$b;-><init>(Lzj0/h;)V

    return-object p1

    :cond_7
    new-instance p1, Lvk0/e$a;

    new-instance v0, Lcom/whoop/puffin/sync/BatteryPackHpsException;

    invoke-direct {v0, p2}, Lcom/whoop/puffin/sync/BatteryPackHpsException;-><init>(Lcom/whoop/puffin/sync/f$b;)V

    invoke-direct {p1, v0}, Lvk0/e$a;-><init>(Ljava/lang/Exception;)V

    return-object p1
.end method
