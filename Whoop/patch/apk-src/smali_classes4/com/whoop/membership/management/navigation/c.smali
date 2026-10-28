.class public final Lcom/whoop/membership/management/navigation/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/membership/management/navigation/c;",
        "",
        "Leb/a0;",
        "navController",
        "Leb/u0;",
        "composeNavController",
        "Lo02/d;",
        "navigationReducer",
        "Lj02/o0;",
        "navigator",
        "Lax1/b;",
        "analyticsHelper",
        "<init>",
        "(Leb/a0;Leb/u0;Lo02/d;Lj02/o0;Lax1/b;)V",
        "Lcom/whoop/membership/management/navigation/b;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lcom/whoop/membership/management/navigation/b;)V",
        "Leb/a0;",
        "b",
        "Leb/u0;",
        "c",
        "Lo02/d;",
        "d",
        "Lj02/o0;",
        "e",
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
.field private final a:Leb/a0;

.field private final b:Leb/u0;

.field private final c:Lo02/d;

.field private final d:Lj02/o0;

.field private final e:Lax1/b;


# direct methods
.method public constructor <init>(Leb/a0;Leb/u0;Lo02/d;Lj02/o0;Lax1/b;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "composeNavController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/membership/management/navigation/c;->a:Leb/a0;

    iput-object p2, p0, Lcom/whoop/membership/management/navigation/c;->b:Leb/u0;

    iput-object p3, p0, Lcom/whoop/membership/management/navigation/c;->c:Lo02/d;

    iput-object p4, p0, Lcom/whoop/membership/management/navigation/c;->d:Lj02/o0;

    iput-object p5, p0, Lcom/whoop/membership/management/navigation/c;->e:Lax1/b;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/membership/management/navigation/b;)V
    .locals 12

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/membership/management/navigation/b$e;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/management/navigation/c;->b:Leb/u0;

    invoke-virtual {p1}, Leb/a0;->k()Leb/r0;

    move-result-object p1

    iget v3, p1, Leb/r0;->M:I

    new-instance v0, Leb/x0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    move v7, v6

    move v8, v6

    move v9, v6

    invoke-direct/range {v0 .. v9}, Leb/x0;-><init>(ZZIZZIIII)V

    iget-object p1, p0, Lcom/whoop/membership/management/navigation/c;->b:Leb/u0;

    sget-object v1, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$c;->a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$c;

    invoke-virtual {v1}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;->getBaseRoute$membership_release()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {p1, v1, v0, v2}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/whoop/membership/management/navigation/b$c;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/whoop/membership/management/navigation/c;->b:Leb/u0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/whoop/membership/management/navigation/c;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_1
    instance-of v0, p1, Lcom/whoop/membership/management/navigation/b$b;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/whoop/membership/management/navigation/c;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    instance-of v0, p1, Lcom/whoop/membership/management/navigation/b$a;

    const/4 v1, 0x6

    const/4 v2, 0x0

    const-string v3, "UTF-8"

    if-eqz v0, :cond_3

    check-cast p1, Lcom/whoop/membership/management/navigation/b$a;

    invoke-virtual {p1}, Lcom/whoop/membership/management/navigation/b$a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/membership/management/navigation/b$a;->c()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lix1/d;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/whoop/membership/management/navigation/c;->b:Leb/u0;

    sget-object v5, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;->a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/membership/management/navigation/b$a;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/membership/management/navigation/b$a;->d()Z

    move-result p1

    invoke-virtual {v5, v0, v3, v6, p1}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Z)Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_3
    instance-of v0, p1, Lcom/whoop/membership/management/navigation/b$d;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/whoop/membership/management/navigation/c;->c:Lo02/d;

    check-cast p1, Lcom/whoop/membership/management/navigation/b$d;

    invoke-virtual {p1}, Lcom/whoop/membership/management/navigation/b$d;->a()Lcom/whoop/navigation/e;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v4

    invoke-interface {v0, v4}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object v0

    instance-of v4, v0, Lj02/m0;

    if-eqz v4, :cond_8

    move-object v4, v0

    check-cast v4, Lj02/m0;

    instance-of v5, v4, Lj02/m0$x2;

    if-eqz v5, :cond_5

    check-cast v0, Lj02/m0$x2;

    invoke-virtual {v0}, Lj02/m0$x2;->d()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    iget-object p1, p0, Lcom/whoop/membership/management/navigation/c;->e:Lax1/b;

    new-instance v3, Lax1/a$l;

    invoke-virtual {v0}, Lj02/m0$x2;->c()Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0x2b

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lax1/a$l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v3}, Lax1/b;->a(Lax1/a;)V

    :cond_4
    invoke-virtual {v0}, Lj02/m0$x2;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lix1/d;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/membership/management/navigation/c;->b:Leb/u0;

    sget-object v3, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;->a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;

    invoke-virtual {v3, p1}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_5
    instance-of v5, v4, Lj02/m0$a3;

    if-eqz v5, :cond_6

    iget-object p1, p0, Lcom/whoop/membership/management/navigation/c;->b:Leb/u0;

    sget-object v0, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;->a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$d;

    invoke-virtual {v0}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;->getBaseRoute$membership_release()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_6
    instance-of v4, v4, Lj02/m0$k0;

    if-eqz v4, :cond_7

    check-cast v0, Lj02/m0$k0;

    invoke-virtual {v0}, Lj02/m0$k0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lj02/m0$k0;->d()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lix1/d;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lcom/whoop/membership/management/navigation/c;->b:Leb/u0;

    sget-object v4, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;->a:Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;->b(Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination$a;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_7
    iget-object v0, p0, Lcom/whoop/membership/management/navigation/c;->d:Lj02/o0;

    invoke-virtual {p1}, Lcom/whoop/membership/management/navigation/b$d;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    :cond_8
    return-void

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
