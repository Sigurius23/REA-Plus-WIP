.class public final Ljv0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lat0/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Ljv0/a;",
        "Lat0/b;",
        "Lhv0/a;",
        "consolePacketDataToDtoMapper",
        "Lyt0/d;",
        "consolePacketsDao",
        "Lgv0/a;",
        "consolePacketUploader",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lhv0/a;Lyt0/d;Lgv0/a;Ltr2/n;)V",
        "Lat0/a;",
        "packetData",
        "Ll83/a0;",
        "a",
        "(Lat0/a;Lq83/d;)Ljava/lang/Object;",
        "Ll83/n;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lhv0/a;",
        "getConsolePacketDataToDtoMapper",
        "()Lhv0/a;",
        "Lyt0/d;",
        "getConsolePacketsDao",
        "()Lyt0/d;",
        "c",
        "Lgv0/a;",
        "d",
        "Ltr2/n;",
        "getLogger",
        "()Ltr2/n;",
        "console-packets_release"
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
.field private final a:Lhv0/a;

.field private final b:Lyt0/d;

.field private final c:Lgv0/a;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lhv0/a;Lyt0/d;Lgv0/a;Ltr2/n;)V
    .locals 1

    const-string v0, "consolePacketDataToDtoMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consolePacketsDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consolePacketUploader"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ljv0/a;->a:Lhv0/a;

    .line 3
    iput-object p2, p0, Ljv0/a;->b:Lyt0/d;

    .line 4
    iput-object p3, p0, Ljv0/a;->c:Lgv0/a;

    .line 5
    iput-object p4, p0, Ljv0/a;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lhv0/a;Lyt0/d;Lgv0/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "ConsolePacketService"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Ljv0/a;-><init>(Lhv0/a;Lyt0/d;Lgv0/a;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public a(Lat0/a;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lat0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ljv0/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljv0/a$a;

    iget v1, v0, Ljv0/a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljv0/a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ljv0/a$a;

    invoke-direct {v0, p0, p2}, Ljv0/a$a;-><init>(Ljv0/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ljv0/a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ljv0/a$a;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ljv0/a$a;->x:Ljava/lang/Object;

    check-cast p1, Lzt0/b;

    iget-object p1, v0, Ljv0/a$a;->w:Ljava/lang/Object;

    check-cast p1, Lat0/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Ljv0/a;->a:Lhv0/a;

    invoke-virtual {p2, p1}, Lhv0/a;->a(Lat0/a;)Lzt0/b;

    move-result-object p1

    iget-object p2, p0, Ljv0/a;->b:Lyt0/d;

    const/4 v2, 0x0

    iput-object v2, v0, Ljv0/a$a;->w:Ljava/lang/Object;

    iput-object v2, v0, Ljv0/a$a;->x:Ljava/lang/Object;

    iput v3, v0, Ljv0/a$a;->E:I

    invoke-interface {p2, p1, v0}, Lyt0/d;->f(Lzt0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    iget-object p2, p0, Ljv0/a;->d:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Failed to save console packets due to "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public b(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Ljv0/a$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljv0/a$b;

    iget v1, v0, Ljv0/a$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljv0/a$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ljv0/a$b;

    invoke-direct {v0, p0, p1}, Ljv0/a$b;-><init>(Ljv0/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ljv0/a$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ljv0/a$b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ljv0/a;->c:Lgv0/a;

    iput v3, v0, Ljv0/a$b;->y:I

    invoke-virtual {p1, v0}, Lgv0/a;->k(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
