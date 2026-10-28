.class public final Lew0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lew0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lew0/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Lbw0/b;",
        "analyticsManager",
        "",
        "activityId",
        "Lcom/whoop/navigation/ActivityDetailType;",
        "activityType",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Leb/a0;Lj02/o0;Lbw0/b;Ljava/lang/String;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lew0/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lew0/a;)V",
        "Leb/a0;",
        "b",
        "Lj02/o0;",
        "c",
        "Lbw0/b;",
        "d",
        "Ljava/lang/String;",
        "e",
        "Lcom/whoop/navigation/ActivityDetailType;",
        "f",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "core-details_release"
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

.field private final c:Lbw0/b;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/whoop/navigation/ActivityDetailType;

.field private final f:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Lbw0/b;Ljava/lang/String;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lew0/b;->a:Leb/a0;

    iput-object p2, p0, Lew0/b;->b:Lj02/o0;

    iput-object p3, p0, Lew0/b;->c:Lbw0/b;

    iput-object p4, p0, Lew0/b;->d:Ljava/lang/String;

    iput-object p5, p0, Lew0/b;->e:Lcom/whoop/navigation/ActivityDetailType;

    iput-object p6, p0, Lew0/b;->f:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public final a(Lew0/a;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "event"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lew0/a$a;->a:Lew0/a$a;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v0, Lew0/b;->a:Leb/a0;

    invoke-virtual {v1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v2, v1, Lew0/a$h;

    if-eqz v2, :cond_1

    iget-object v2, v0, Lew0/b;->c:Lbw0/b;

    new-instance v3, Lbw0/a$i;

    check-cast v1, Lew0/a$h;

    invoke-virtual {v1}, Lew0/a$h;->a()Ljava/lang/String;

    move-result-object v1

    const-string v4, ""

    invoke-direct {v3, v4, v4, v1}, Lbw0/a$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lbw0/b;->e(Lbw0/a;)V

    return-void

    :cond_1
    sget-object v2, Lew0/a$f;->a:Lew0/a$f;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const-string v4, "uri"

    if-eqz v2, :cond_3

    iget-object v1, v0, Lew0/b;->f:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "weekly-plan-home-tile-behavior-impacts"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lew0/b;->a:Leb/a0;

    const-string v2, "android-app://com.whoop/behavior_impact?source=Recovery Details"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2, v4, v2, v3, v3}, Ld13/a;->f(Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_2
    iget-object v1, v0, Lew0/b;->a:Leb/a0;

    const-string v2, "android-app://com.whoop/coaching?tab=1&source=Recovery Details"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2, v4, v2, v3, v3}, Ld13/a;->f(Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_3
    instance-of v2, v1, Lew0/a$g;

    if-eqz v2, :cond_5

    check-cast v1, Lew0/a$g;

    invoke-virtual {v1}, Lew0/a$g;->b()Ljava/lang/String;

    move-result-object v2

    const-string v5, "Edit Activity"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v0, Lew0/b;->a:Leb/a0;

    invoke-virtual {v2}, Leb/a0;->z()Z

    :cond_4
    invoke-virtual {v1}, Lew0/a$g;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lew0/a$g;->b()Ljava/lang/String;

    move-result-object v1

    const-string v5, "whoop://strength.builder?screen=linkWorkoutScreen&activityId="

    const-string v6, "&source="

    invoke-static {v5, v2, v6, v1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lew0/b;->a:Leb/a0;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1, v4, v1, v3, v3}, Ld13/a;->f(Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v2, v1}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_5
    instance-of v2, v1, Lew0/a$e;

    if-eqz v2, :cond_7

    check-cast v1, Lew0/a$e;

    invoke-virtual {v1}, Lew0/a$e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, v0, Lew0/b;->b:Lj02/o0;

    new-instance v3, Lj02/m0$e1;

    invoke-virtual {v1}, Lew0/a$e;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lew0/a$e;->b()Z

    move-result v8

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v5, 0x0

    const-string v6, "Activity Details"

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v10}, Lj02/m0$e1;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    :cond_6
    return-void

    :cond_7
    instance-of v2, v1, Lew0/a$c;

    if-eqz v2, :cond_b

    const-string v2, "weightlifting"

    const-string v3, "weightlifting_msk"

    const-string v4, "powerlifting"

    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object v3, v0, Lew0/b;->b:Lj02/o0;

    new-instance v4, Lj02/m0$z;

    check-cast v1, Lew0/a$c;

    invoke-virtual {v1}, Lew0/a$c;->b()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lew0/b;->d:Ljava/lang/String;

    invoke-virtual {v1}, Lew0/a$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Ls01/a;->WEIGHTLIFTING_ACTIVITY:Ls01/a;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v10, v1

    goto :goto_2

    :cond_8
    iget-object v1, v0, Lew0/b;->e:Lcom/whoop/navigation/ActivityDetailType;

    sget-object v2, Lew0/b$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_a

    const/4 v2, 0x2

    if-eq v1, v2, :cond_9

    sget-object v1, Ls01/a;->STRAIN_ACTIVITY:Ls01/a;

    goto :goto_1

    :cond_9
    sget-object v1, Ls01/a;->RECOVERY_ACTIVITY:Ls01/a;

    goto :goto_1

    :cond_a
    sget-object v1, Ls01/a;->STRAIN_ACTIVITY:Ls01/a;

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :goto_2
    const/16 v17, 0xfc3

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v9, "VoW_Activity_Details"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v4 .. v18}, Lj02/m0$z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v4}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_b
    instance-of v2, v1, Lew0/a$d;

    if-eqz v2, :cond_c

    iget-object v2, v0, Lew0/b;->b:Lj02/o0;

    new-instance v3, Lj02/m0$c1;

    check-cast v1, Lew0/a$d;

    invoke-virtual {v1}, Lew0/a$d;->e()Lorg/joda/time/LocalDateTime;

    move-result-object v4

    invoke-virtual {v1}, Lew0/a$d;->d()Lorg/joda/time/LocalDateTime;

    move-result-object v5

    invoke-virtual {v1}, Lew0/a$d;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lew0/a$d;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lew0/a$d;->a()Ljava/lang/String;

    move-result-object v8

    const/16 v11, 0x60

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lj02/m0$c1;-><init>(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_c
    instance-of v2, v1, Lew0/a$b;

    if-eqz v2, :cond_d

    iget-object v2, v0, Lew0/b;->b:Lj02/o0;

    check-cast v1, Lew0/a$b;

    invoke-virtual {v1}, Lew0/a$b;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-interface {v2, v1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
