.class public final Lsz1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lsz1/c;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Leb/a0;Lj02/o0;Ltr2/n;)V",
        "Ltz1/d$i;",
        "event",
        "Ll83/a0;",
        "a",
        "(Ltz1/d$i;)V",
        "Leb/a0;",
        "b",
        "Lj02/o0;",
        "c",
        "Ltr2/n;",
        "native-store_release"
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
.field private final a:Leb/a0;

.field private final b:Lj02/o0;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Ltr2/n;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsz1/c;->a:Leb/a0;

    .line 3
    iput-object p2, p0, Lsz1/c;->b:Lj02/o0;

    .line 4
    iput-object p3, p0, Lsz1/c;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Leb/a0;Lj02/o0;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "NativeStoreRouter"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lsz1/c;-><init>(Leb/a0;Lj02/o0;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Ltz1/d$i;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ltz1/d$b;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lsz1/c;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Ltz1/d$l;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lsz1/c;->b:Lj02/o0;

    new-instance v0, Lj02/m0$j4;

    const-string v1, "gear"

    invoke-direct {v0, v1}, Lj02/m0$j4;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_1
    instance-of v0, p1, Ltz1/d$d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lsz1/c;->b:Lj02/o0;

    check-cast p1, Ltz1/d$d;

    invoke-virtual {p1}, Ltz1/d$d;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_2
    instance-of v0, p1, Ltz1/d$c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lsz1/c;->b:Lj02/o0;

    check-cast p1, Ltz1/d$c;

    invoke-virtual {p1}, Ltz1/d$c;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
