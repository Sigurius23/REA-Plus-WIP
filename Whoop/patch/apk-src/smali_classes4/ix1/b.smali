.class public final Lix1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lix1/b;",
        "Lj02/k0;",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "Lax1/b;",
        "analyticsHelper",
        "<init>",
        "(Lj02/i0;Lax1/b;)V",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "a",
        "Lj02/i0;",
        "b",
        "Lax1/b;",
        "membership_release"
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

.field private final b:Lax1/b;


# direct methods
.method public constructor <init>(Lj02/i0;Lax1/b;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lix1/b;->a:Lj02/i0;

    .line 3
    iput-object p2, p0, Lix1/b;->b:Lax1/b;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/i0;Lax1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 4
    new-instance p1, Lj02/i0;

    invoke-direct {p1}, Lj02/i0;-><init>()V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lix1/b;-><init>(Lj02/i0;Lax1/b;)V

    return-void
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 11

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$z2;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lix1/b;->a:Lj02/i0;

    const-string v0, "android-app://com.whoop/membershipManagement?startDestination=MEMBERSHIP_AND_BILLING"

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    sget v6, Lnf1/a;->o:I

    sget v9, Lnf1/a;->p:I

    new-instance v0, Leb/x0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v7, v3

    move v8, v3

    invoke-direct/range {v0 .. v9}, Leb/x0;-><init>(ZZIZZIIII)V

    new-instance v1, Lj02/j0$c;

    sget-object v2, Lj02/p0$d;->a:Lj02/p0$d;

    invoke-direct {v1, p1, v0, v2}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lj02/m0$x2;

    const-string v1, "UTF-8"

    if-eqz v0, :cond_2

    check-cast p1, Lj02/m0$x2;

    invoke-virtual {p1}, Lj02/m0$x2;->d()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    iget-object v0, p0, Lix1/b;->b:Lax1/b;

    new-instance v2, Lax1/a$l;

    invoke-virtual {p1}, Lj02/m0$x2;->c()Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0x2b

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lax1/a$l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lax1/b;->a(Lax1/a;)V

    :cond_1
    invoke-virtual {p1}, Lj02/m0$x2;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lix1/d;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lix1/b;->a:Lj02/i0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/membershipManagement?startDestination=MEMBERSHIP_ADJUSTMENT_CHECKOUT&payload="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    sget v6, Lnf1/a;->o:I

    sget v9, Lnf1/a;->p:I

    new-instance v0, Leb/x0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v7, v3

    move v8, v3

    invoke-direct/range {v0 .. v9}, Leb/x0;-><init>(ZZIZZIIII)V

    new-instance v1, Lj02/j0$c;

    sget-object v2, Lj02/p0$d;->a:Lj02/p0$d;

    invoke-direct {v1, p1, v0, v2}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;)V

    return-object v1

    :cond_2
    instance-of v0, p1, Lj02/m0$a3;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lix1/b;->a:Lj02/i0;

    const-string v0, "android-app://com.whoop/membershipManagement?startDestination=MEMBERSHIP_MANAGEMENT"

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    sget v6, Lnf1/a;->o:I

    sget v9, Lnf1/a;->p:I

    new-instance v0, Leb/x0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v7, v3

    move v8, v3

    invoke-direct/range {v0 .. v9}, Leb/x0;-><init>(ZZIZZIIII)V

    new-instance v1, Lj02/j0$c;

    sget-object v2, Lj02/p0$d;->a:Lj02/p0$d;

    invoke-direct {v1, p1, v0, v2}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;)V

    return-object v1

    :cond_3
    instance-of v0, p1, Lj02/m0$k0;

    if-eqz v0, :cond_4

    check-cast p1, Lj02/m0$k0;

    invoke-virtual {p1}, Lj02/m0$k0;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "path"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lj02/m0$k0;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lix1/d;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "payload"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lj02/m0$k0;->e()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v5, "payment_method_id"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lj02/m0$k0;->f()Ljava/lang/Boolean;

    move-result-object v0

    new-instance v5, Ll83/k;

    const-string v6, "skip_confirmation"

    invoke-direct {v5, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lj02/m0$k0;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v6, "category"

    invoke-direct {v0, v6, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v5, v0}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lix1/d;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lix1/b;->a:Lj02/i0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/membershipManagement?startDestination=CHECKOUT&payload="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    sget v6, Lnf1/a;->o:I

    sget v9, Lnf1/a;->p:I

    new-instance v0, Leb/x0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v7, v3

    move v8, v3

    invoke-direct/range {v0 .. v9}, Leb/x0;-><init>(ZZIZZIIII)V

    new-instance v1, Lj02/j0$c;

    sget-object v2, Lj02/p0$d;->a:Lj02/p0$d;

    invoke-direct {v1, p1, v0, v2}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;)V

    return-object v1

    :cond_4
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
