.class public final Lqj0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqj0/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lqj0/a;",
        "Lqj0/e;",
        "Lpj0/b;",
        "transports",
        "Lut0/b;",
        "wires",
        "",
        "Lnj0/f;",
        "Lkt0/b;",
        "handshakes",
        "Ljava/time/Clock;",
        "clock",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lpj0/b;Lut0/b;Ljava/util/Map;Ljava/time/Clock;Ltr2/n;)V",
        "Lqj0/h;",
        "handle",
        "Lqj0/d;",
        "a",
        "(Lqj0/h;)Lqj0/d;",
        "Lpj0/b;",
        "b",
        "Lut0/b;",
        "c",
        "Ljava/util/Map;",
        "d",
        "Ljava/time/Clock;",
        "e",
        "Ltr2/n;",
        "whoop-ble_release"
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
.field private final a:Lpj0/b;

.field private final b:Lut0/b;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnj0/f;",
            "Lkt0/b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/time/Clock;

.field private final e:Ltr2/n;


# direct methods
.method public constructor <init>(Lpj0/b;Lut0/b;Ljava/util/Map;Ljava/time/Clock;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpj0/b;",
            "Lut0/b;",
            "Ljava/util/Map<",
            "Lnj0/f;",
            "+",
            "Lkt0/b;",
            ">;",
            "Ljava/time/Clock;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "transports"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wires"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handshakes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqj0/a;->a:Lpj0/b;

    iput-object p2, p0, Lqj0/a;->b:Lut0/b;

    iput-object p3, p0, Lqj0/a;->c:Ljava/util/Map;

    iput-object p4, p0, Lqj0/a;->d:Ljava/time/Clock;

    iput-object p5, p0, Lqj0/a;->e:Ltr2/n;

    return-void
.end method

.method public static synthetic b(Lqj0/h;Lmj0/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lqj0/a;->c(Lqj0/h;Lmj0/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lqj0/h;Lmj0/b;)Ll83/a0;
    .locals 1

    const-string v0, "phase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmj0/c$a;

    invoke-direct {v0, p1}, Lmj0/c$a;-><init>(Lmj0/b;)V

    invoke-virtual {p0, v0}, Lqj0/h;->h(Lmj0/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public a(Lqj0/h;)Lqj0/d;
    .locals 14

    const-string v0, "handle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lqj0/h;->getProtocol()Lnj0/f;

    move-result-object v2

    iget-object v0, p0, Lqj0/a;->c:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    move-object v5, v0

    check-cast v5, Lkt0/b;

    invoke-interface {v2}, Lnj0/f;->d()Lnj0/b;

    move-result-object v0

    sget-object v1, Lnj0/c;->CmdToStrap:Lnj0/c;

    invoke-virtual {v0, v1}, Lnj0/b;->a(Lnj0/c;)Ljava/util/UUID;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Lnj0/f;->d()Lnj0/b;

    move-result-object v1

    sget-object v3, Lnj0/c;->CmdFromStrap:Lnj0/c;

    invoke-virtual {v1, v3}, Lnj0/b;->a(Lnj0/c;)Ljava/util/UUID;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v3, p0, Lqj0/a;->a:Lpj0/b;

    invoke-virtual {p1}, Lqj0/h;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2}, Lnj0/f;->c()Ljava/util/UUID;

    move-result-object v6

    invoke-interface {v2}, Lnj0/f;->d()Lnj0/b;

    move-result-object v7

    invoke-virtual {v7}, Lnj0/b;->b()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v7

    invoke-interface {v3, v4, v6, v7}, Lpj0/b;->a(Ljava/lang/String;Ljava/util/UUID;Ljava/util/Set;)Lpj0/a;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    iget-object v0, p0, Lqj0/a;->e:Ltr2/n;

    invoke-virtual {p1}, Lqj0/h;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "No transport for "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v4

    :cond_0
    sget-object v6, Ltr2/n;->a:Ltr2/n$a;

    invoke-virtual {p1}, Lqj0/h;->a()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "WhoopBle-"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v8

    move-object v13, v8

    new-instance v8, Lqj0/b;

    iget-object v6, p0, Lqj0/a;->b:Lut0/b;

    invoke-interface {v6, v2}, Lut0/b;->a(Lnj0/f;)Lut0/a;

    move-result-object v9

    new-instance v10, Lqj0/a$a;

    invoke-direct {v10, v3, v0, v4}, Lqj0/a$a;-><init>(Lpj0/a;Ljava/util/UUID;Lq83/d;)V

    invoke-interface {v3, v1}, Lpj0/a;->h(Ljava/util/UUID;)Lec3/l;

    move-result-object v11

    invoke-virtual {p1}, Lqj0/h;->c()Lbc3/c0;

    move-result-object v12

    invoke-direct/range {v8 .. v13}, Lqj0/b;-><init>(Lut0/a;Lc93/m;Lec3/l;Lbc3/c0;Ltr2/n;)V

    move-object v4, v8

    invoke-virtual {v4}, Lqj0/b;->l()V

    iget-object v6, p0, Lqj0/a;->d:Ljava/time/Clock;

    new-instance v7, Lpf/b;

    const/16 v0, 0xd

    invoke-direct {v7, p1, v0}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lqj0/g;

    move-object v8, v13

    invoke-direct/range {v1 .. v8}, Lqj0/g;-><init>(Lnj0/f;Lpj0/a;Lqj0/b;Lkt0/b;Ljava/time/Clock;Lkotlin/jvm/functions/Function1;Ltr2/n;)V

    return-object v1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has no CmdFromStrap characteristic"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has no CmdToStrap characteristic"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "No handshake registered for "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
