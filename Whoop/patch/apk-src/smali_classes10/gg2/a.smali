.class public final Lgg2/a;
.super Landroidx/lifecycle/x;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lgg2/a;",
        "Landroidx/lifecycle/x;",
        "Landroidx/lifecycle/w;",
        "state",
        "",
        "simulateObserver",
        "<init>",
        "(Landroidx/lifecycle/w;Z)V",
        "Landroidx/lifecycle/f0;",
        "observer",
        "Ll83/a0;",
        "a",
        "(Landroidx/lifecycle/f0;)V",
        "d",
        "b",
        "Z",
        "c",
        "Landroidx/lifecycle/w;",
        "()Landroidx/lifecycle/w;",
        "currentState",
        "Landroidx/lifecycle/g0;",
        "Landroidx/lifecycle/g0;",
        "e",
        "()Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "snapshot-compose-host_release"
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
.field private final b:Z

.field private final c:Landroidx/lifecycle/w;

.field private final d:Landroidx/lifecycle/g0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/w;Z)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/x;-><init>()V

    .line 2
    iput-boolean p2, p0, Lgg2/a;->b:Z

    .line 3
    iput-object p1, p0, Lgg2/a;->c:Landroidx/lifecycle/w;

    .line 4
    new-instance p1, Lgg2/a$a;

    invoke-direct {p1, p0}, Lgg2/a$a;-><init>(Lgg2/a;)V

    iput-object p1, p0, Lgg2/a;->d:Landroidx/lifecycle/g0;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/lifecycle/w;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 5
    sget-object p1, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lgg2/a;-><init>(Landroidx/lifecycle/w;Z)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/f0;)V
    .locals 2

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lgg2/a;->b:Z

    if-eqz v0, :cond_1

    instance-of v0, p1, Landroidx/lifecycle/e0;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/lifecycle/e0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lgg2/a;->d:Landroidx/lifecycle/g0;

    sget-object v1, Landroidx/lifecycle/v;->ON_CREATE:Landroidx/lifecycle/v;

    invoke-interface {p1, v0, v1}, Landroidx/lifecycle/e0;->h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    :cond_1
    return-void
.end method

.method public b()Landroidx/lifecycle/w;
    .locals 1

    iget-object v0, p0, Lgg2/a;->c:Landroidx/lifecycle/w;

    return-object v0
.end method

.method public d(Landroidx/lifecycle/f0;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final e()Landroidx/lifecycle/g0;
    .locals 1

    iget-object v0, p0, Lgg2/a;->d:Landroidx/lifecycle/g0;

    return-object v0
.end method
