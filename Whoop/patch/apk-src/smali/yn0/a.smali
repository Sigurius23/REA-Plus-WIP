.class public final Lyn0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lyn0/a;",
        "Lj02/k0;",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "Ljava/time/Clock;",
        "clock",
        "Lco0/a;",
        "jwtTokenParser",
        "<init>",
        "(Lj02/i0;Ljava/time/Clock;Lco0/a;)V",
        "",
        "jwtToken",
        "",
        "a",
        "(Ljava/lang/String;)Z",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "Lj02/i0;",
        "b",
        "Ljava/time/Clock;",
        "c",
        "Lco0/a;",
        "change-password_release"
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
.field private final a:Lj02/i0;

.field private final b:Ljava/time/Clock;

.field private final c:Lco0/a;


# direct methods
.method public constructor <init>(Lj02/i0;Ljava/time/Clock;Lco0/a;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jwtTokenParser"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lyn0/a;->a:Lj02/i0;

    .line 3
    iput-object p2, p0, Lyn0/a;->b:Ljava/time/Clock;

    .line 4
    iput-object p3, p0, Lyn0/a;->c:Lco0/a;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/i0;Ljava/time/Clock;Lco0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    new-instance p1, Lj02/i0;

    invoke-direct {p1}, Lj02/i0;-><init>()V

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 6
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p2

    const-string p5, "systemDefaultZone(...)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 7
    new-instance p3, Lco0/a;

    const/4 p4, 0x0

    const/4 p5, 0x1

    invoke-direct {p3, p4, p5, p4}, Lco0/a;-><init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lyn0/a;-><init>(Lj02/i0;Ljava/time/Clock;Lco0/a;)V

    return-void
.end method

.method private final a(Ljava/lang/String;)Z
    .locals 7

    iget-object v0, p0, Lyn0/a;->c:Lco0/a;

    invoke-virtual {v0, p1}, Lco0/a;->b(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object p1, p0, Lyn0/a;->b:Ljava/time/Clock;

    invoke-virtual {p1}, Ljava/time/Clock;->millis()J

    move-result-wide v3

    const/16 p1, 0x3e8

    int-to-long v5, p1

    div-long/2addr v3, v5

    cmp-long p1, v3, v1

    if-ltz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 10

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$o3;

    if-eqz v0, :cond_5

    check-cast p1, Lj02/m0$o3;

    invoke-virtual {p1}, Lj02/m0$o3;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    invoke-virtual {p1}, Lj02/m0$o3;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {p1}, Lj02/m0$o3;->c()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    iget-object v4, p0, Lyn0/a;->b:Ljava/time/Clock;

    invoke-virtual {v4}, Ljava/time/Clock;->millis()J

    move-result-wide v4

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    const/16 p1, 0x3e8

    int-to-long v8, p1

    mul-long/2addr v6, v8

    cmp-long p1, v4, v6

    if-ltz p1, :cond_4

    move v3, v2

    goto :goto_2

    :cond_3
    :goto_1
    const-string p1, "."

    invoke-static {v0, p1, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0, v0}, Lyn0/a;->a(Ljava/lang/String;)Z

    move-result v3

    :cond_4
    :goto_2
    new-instance p1, Ll83/k;

    const-string v4, "resetToken"

    invoke-direct {p1, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "isExpired"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v4, "email"

    invoke-direct {v0, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p1, v3, v0}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "resetPassword"

    invoke-static {v0, p1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Lyn0/a;->a:Lj02/i0;

    const-string v1, "toString(...)"

    invoke-static {p1, v1, v0}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v4

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object p1

    iput-boolean v2, p1, Leb/w0;->a:Z

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object v5

    new-instance v3, Lj02/j0$c;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_5
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
