.class public final Lcom/whoop/membership/familyPlan/navigation/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/membership/familyPlan/navigation/b;",
        "",
        "Leb/a0;",
        "navController",
        "Leb/u0;",
        "composeNavController",
        "Lo02/d;",
        "navigationReducer",
        "Lj02/o0;",
        "navigator",
        "Ltr2/n;",
        "logger",
        "Lnw1/a;",
        "analyticsHelper",
        "<init>",
        "(Leb/a0;Leb/u0;Lo02/d;Lj02/o0;Ltr2/n;Lnw1/a;)V",
        "Lm91/u;",
        "Ll83/a0;",
        "c",
        "(Lm91/u;)V",
        "Lww1/e;",
        "event",
        "d",
        "(Lww1/e;)V",
        "a",
        "Leb/a0;",
        "b",
        "Leb/u0;",
        "Lo02/d;",
        "Lj02/o0;",
        "e",
        "Ltr2/n;",
        "f",
        "Lnw1/a;",
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

.field private final e:Ltr2/n;

.field private final f:Lnw1/a;


# direct methods
.method public constructor <init>(Leb/a0;Leb/u0;Lo02/d;Lj02/o0;Ltr2/n;Lnw1/a;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "composeNavController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/membership/familyPlan/navigation/b;->a:Leb/a0;

    .line 3
    iput-object p2, p0, Lcom/whoop/membership/familyPlan/navigation/b;->b:Leb/u0;

    .line 4
    iput-object p3, p0, Lcom/whoop/membership/familyPlan/navigation/b;->c:Lo02/d;

    .line 5
    iput-object p4, p0, Lcom/whoop/membership/familyPlan/navigation/b;->d:Lj02/o0;

    .line 6
    iput-object p5, p0, Lcom/whoop/membership/familyPlan/navigation/b;->e:Ltr2/n;

    .line 7
    iput-object p6, p0, Lcom/whoop/membership/familyPlan/navigation/b;->f:Lnw1/a;

    return-void
.end method

.method public synthetic constructor <init>(Leb/a0;Leb/u0;Lo02/d;Lj02/o0;Ltr2/n;Lnw1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    .line 8
    sget-object p5, Ltr2/n;->a:Ltr2/n$a;

    const-string p7, "FamilyPlanRouter"

    invoke-virtual {p5, p7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/whoop/membership/familyPlan/navigation/b;-><init>(Leb/a0;Leb/u0;Lo02/d;Lj02/o0;Ltr2/n;Lnw1/a;)V

    return-void
.end method

.method public static synthetic a(Leb/k1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/familyPlan/navigation/b;->f(Leb/k1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Integer;Leb/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/membership/familyPlan/navigation/b;->e(Ljava/lang/Integer;Leb/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lm91/u;)V
    .locals 3

    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/membership/familyPlan/navigation/b;->d:Lj02/o0;

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/membership/familyPlan/navigation/b;->e:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unhandled ItemViewState for app-driven navigation: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private static final e(Ljava/lang/Integer;Leb/y0;)Ll83/a0;
    .locals 2

    const-string v0, "$this$navigate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    new-instance v0, Lt71/i;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lt71/i;-><init>(I)V

    invoke-virtual {p1, p0, v0}, Leb/y0;->a(ILkotlin/jvm/functions/Function1;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Leb/k1;)Ll83/a0;
    .locals 1

    const-string v0, "$this$popUpTo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Leb/k1;->a()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final d(Lww1/e;)V
    .locals 7

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lww1/e$d;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/familyPlan/navigation/b;->b:Leb/u0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lcom/whoop/membership/familyPlan/navigation/b;->f:Lnw1/a;

    sget-object v0, Lww1/m;->a:Lww1/m;

    invoke-virtual {p1, v0}, Lnw1/a;->a(Lww1/a;)V

    iget-object p1, p0, Lcom/whoop/membership/familyPlan/navigation/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Lww1/e$b;

    const/4 v1, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/whoop/membership/familyPlan/navigation/b;->c:Lo02/d;

    check-cast p1, Lww1/e$b;

    invoke-virtual {p1}, Lww1/e$b;->b()Lcom/whoop/navigation/e;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v5

    invoke-interface {v0, v5}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object v0

    instance-of v5, v0, Lj02/m0;

    if-eqz v5, :cond_7

    move-object v5, v0

    check-cast v5, Lj02/m0;

    instance-of v6, v5, Lj02/m0$i1;

    if-eqz v6, :cond_1

    iget-object v3, p0, Lcom/whoop/membership/familyPlan/navigation/b;->f:Lnw1/a;

    new-instance v4, Lww1/k;

    check-cast v0, Lj02/m0$i1;

    invoke-virtual {v0}, Lj02/m0$i1;->b()Z

    move-result v5

    invoke-virtual {p1}, Lww1/e$b;->a()Luw1/c$c;

    move-result-object p1

    invoke-direct {v4, v5, p1}, Lww1/k;-><init>(ZLuw1/c$c;)V

    invoke-virtual {v3, v4}, Lnw1/a;->a(Lww1/a;)V

    iget-object p1, p0, Lcom/whoop/membership/familyPlan/navigation/b;->b:Leb/u0;

    sget-object v3, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;->a:Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;

    invoke-virtual {v0}, Lj02/m0$i1;->b()Z

    move-result v0

    invoke-virtual {v3, v0}, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;->a(Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_1
    instance-of v1, v5, Lj02/m0$b4;

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/whoop/membership/familyPlan/navigation/b;->f:Lnw1/a;

    sget-object v1, Lww1/l;->a:Lww1/l;

    invoke-virtual {v0, v1}, Lnw1/a;->a(Lww1/a;)V

    iget-object v0, p0, Lcom/whoop/membership/familyPlan/navigation/b;->d:Lj02/o0;

    invoke-virtual {p1}, Lww1/e$b;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_2
    instance-of v1, v5, Lj02/m0$d0;

    if-eqz v1, :cond_5

    check-cast v0, Lj02/m0$d0;

    invoke-virtual {v0}, Lj02/m0$d0;->e()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v0, "gift"

    invoke-static {p1, v0, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    :cond_3
    if-eqz v4, :cond_4

    iget-object p1, p0, Lcom/whoop/membership/familyPlan/navigation/b;->f:Lnw1/a;

    sget-object v0, Lww1/j;->a:Lww1/j;

    invoke-virtual {p1, v0}, Lnw1/a;->a(Lww1/a;)V

    :cond_4
    iget-object p1, p0, Lcom/whoop/membership/familyPlan/navigation/b;->d:Lj02/o0;

    invoke-interface {p1, v5}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_5
    iget-object v0, p0, Lcom/whoop/membership/familyPlan/navigation/b;->d:Lj02/o0;

    invoke-virtual {p1}, Lww1/e$b;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_6
    instance-of v0, p1, Lww1/e$c;

    if-eqz v0, :cond_8

    iget-object p1, p0, Lcom/whoop/membership/familyPlan/navigation/b;->f:Lnw1/a;

    sget-object v0, Lww1/b;->a:Lww1/b;

    invoke-virtual {p1, v0}, Lnw1/a;->a(Lww1/a;)V

    iget-object p1, p0, Lcom/whoop/membership/familyPlan/navigation/b;->b:Leb/u0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lcom/whoop/membership/familyPlan/navigation/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    :cond_7
    return-void

    :cond_8
    instance-of v0, p1, Lww1/e$e;

    if-eqz v0, :cond_d

    sget-object v0, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;->a:Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;

    check-cast p1, Lww1/e$e;

    invoke-virtual {p1}, Lww1/e$e;->a()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;->a(Z)Ljava/lang/String;

    move-result-object p1

    iget-object v5, p0, Lcom/whoop/membership/familyPlan/navigation/b;->b:Leb/u0;

    invoke-virtual {v5}, Leb/a0;->h()Leb/q;

    move-result-object v5

    if-eqz v5, :cond_9

    iget-object v5, v5, Leb/q;->x:Leb/n0;

    if-eqz v5, :cond_9

    iget-object v5, v5, Leb/n0;->I:Ljava/lang/String;

    goto :goto_0

    :cond_9
    move-object v5, v2

    :goto_0
    if-eqz v5, :cond_a

    invoke-virtual {v0}, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;->getBaseRoute$membership_release()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-ne v0, v3, :cond_a

    goto :goto_1

    :cond_a
    move v3, v4

    :goto_1
    if-eqz v3, :cond_c

    iget-object v0, p0, Lcom/whoop/membership/familyPlan/navigation/b;->b:Leb/u0;

    invoke-virtual {v0}, Leb/a0;->h()Leb/q;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    if-eqz v0, :cond_b

    iget v0, v0, Leb/n0;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_b
    iget-object v0, p0, Lcom/whoop/membership/familyPlan/navigation/b;->b:Leb/u0;

    new-instance v1, Lde/a;

    const/4 v3, 0x1

    invoke-direct {v1, v3, v2}, Lde/a;-><init>(ILjava/lang/Integer;)V

    invoke-virtual {v0, p1, v1}, Leb/a0;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_c
    iget-object v0, p0, Lcom/whoop/membership/familyPlan/navigation/b;->b:Leb/u0;

    invoke-static {v0, p1, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_d
    instance-of v0, p1, Lww1/e$a;

    if-eqz v0, :cond_e

    check-cast p1, Lww1/e$a;

    invoke-virtual {p1}, Lww1/e$a;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/membership/familyPlan/navigation/b;->c(Lm91/u;)V

    return-void

    :cond_e
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
