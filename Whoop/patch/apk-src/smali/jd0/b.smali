.class public final Ljd0/b;
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
        "Ljd0/b;",
        "Lj02/k0;",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "a",
        "Lj02/i0;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "advanced-labs_release"
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

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ljd0/b;->a:Lj02/i0;

    .line 3
    iput-object p2, p0, Ljd0/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 4
    new-instance p1, Lj02/i0;

    invoke-direct {p1}, Lj02/i0;-><init>()V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Ljd0/b;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-void
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "navigationScreen"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lj02/m0$p;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    check-cast v1, Lj02/m0$p;

    invoke-virtual {v1}, Lj02/m0$p;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    move-object v4, v1

    :cond_0
    iget-object v1, v0, Ljd0/b;->a:Lj02/i0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "android-app://com.whoop/AdvancedLabsFragment?source="

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v5

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v6

    new-instance v4, Lj02/j0$c;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_1
    instance-of v2, v1, Lj02/m0$x3;

    if-eqz v2, :cond_2

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    check-cast v1, Lj02/m0$x3;

    invoke-virtual {v1}, Lj02/m0$x3;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "android-app://com.whoop/rafReceiverFragment?code="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v5

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v6

    new-instance v4, Lj02/j0$c;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_2
    instance-of v2, v1, Lj02/m0$s;

    const-string v5, "schedulingFormFragment"

    const-string v6, "toString(...)"

    if-eqz v2, :cond_4

    check-cast v1, Lj02/m0$s;

    invoke-virtual {v1}, Lj02/m0$s;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lj02/m0$s;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lj02/m0$s;->d()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_3

    move-object v4, v1

    :cond_3
    new-instance v1, Ll83/k;

    const-string v8, "episode_id"

    invoke-direct {v1, v8, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v8, "biomarker_test_id"

    invoke-direct {v2, v8, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const-string v8, "test_type"

    invoke-direct {v7, v8, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v7}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v5, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_4
    instance-of v2, v1, Lj02/m0$t;

    const-string v7, "testType"

    if-eqz v2, :cond_5

    check-cast v1, Lj02/m0$t;

    invoke-virtual {v1}, Lj02/m0$t;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    const-string v5, "step"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lj02/m0$t;->c()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v2}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "schedulingStepFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_5
    instance-of v2, v1, Lj02/m0$o;

    const/4 v8, 0x2

    if-eqz v2, :cond_6

    invoke-static {v5, v4, v8, v4}, Lor2/z;->c(Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_6
    instance-of v2, v1, Lj02/m0$w;

    if-eqz v2, :cond_8

    check-cast v1, Lj02/m0$w;

    invoke-virtual {v1}, Lj02/m0$w;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_7

    move-object v4, v2

    :cond_7
    invoke-virtual {v1}, Lj02/m0$w;->d()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ll83/k;

    const-string v8, "url"

    invoke-direct {v5, v8, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lj02/m0$w;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v8, "testTokenId"

    invoke-direct {v2, v8, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v7, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v2, v1}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "advancedLabsTypeformWebviewFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_8
    instance-of v2, v1, Lj02/m0$g0;

    const-string v5, "source"

    if-eqz v2, :cond_a

    check-cast v1, Lj02/m0$g0;

    invoke-virtual {v1}, Lj02/m0$g0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lj02/m0$g0;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_9

    move-object v4, v1

    :cond_9
    new-instance v1, Ll83/k;

    const-string v7, "biomarkerId"

    invoke-direct {v1, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "biomarkerDetailsFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_a
    instance-of v2, v1, Lj02/m0$h0;

    if-eqz v2, :cond_c

    check-cast v1, Lj02/m0$h0;

    invoke-virtual {v1}, Lj02/m0$h0;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_b

    move-object v4, v1

    :cond_b
    new-instance v1, Ll83/k;

    const-string v2, "statusType"

    invoke-direct {v1, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "biomarkerSummaryFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_c
    instance-of v2, v1, Lj02/m0$q;

    if-eqz v2, :cond_e

    check-cast v1, Lj02/m0$q;

    invoke-virtual {v1}, Lj02/m0$q;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_d

    move-object v4, v1

    :cond_d
    new-instance v1, Ll83/k;

    invoke-direct {v1, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "schedulePrimerFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_e
    instance-of v2, v1, Lj02/m0$h;

    if-eqz v2, :cond_f

    check-cast v1, Lj02/m0$h;

    invoke-virtual {v1}, Lj02/m0$h;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    const-string v5, "test_id"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lj02/m0$h;->c()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v5, "is_ai_confirmation"

    invoke-direct {v2, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v2}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "editBiomarkersFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_f
    instance-of v2, v1, Lj02/m0$i;

    const-string v9, "testId"

    if-eqz v2, :cond_10

    check-cast v1, Lj02/m0$i;

    invoke-virtual {v1}, Lj02/m0$i;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v9, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "editTestDetailsFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_10
    instance-of v2, v1, Lj02/m0$d3;

    if-eqz v2, :cond_11

    check-cast v1, Lj02/m0$d3;

    invoke-virtual {v1}, Lj02/m0$d3;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v4, "consentAction"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lj02/m0$d3;->c()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v2}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "multiConsentFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    sget v15, Lnf1/a;->o:I

    sget v18, Lnf1/a;->p:I

    new-instance v9, Leb/x0;

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, -0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v16, v12

    move/from16 v17, v12

    invoke-direct/range {v9 .. v18}, Leb/x0;-><init>(ZZIZZIIII)V

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_11
    instance-of v2, v1, Lj02/m0$v;

    if-eqz v2, :cond_12

    check-cast v1, Lj02/m0$v;

    invoke-virtual {v1}, Lj02/m0$v;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v9, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "testResultsFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_12
    instance-of v2, v1, Lj02/m0$u;

    if-eqz v2, :cond_13

    const-string v1, "testHistoryFragment"

    invoke-static {v1, v4, v8, v4}, Lor2/z;->c(Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_13
    instance-of v2, v1, Lj02/m0$b0;

    if-eqz v2, :cond_14

    check-cast v1, Lj02/m0$b0;

    invoke-virtual {v1}, Lj02/m0$b0;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v4, "biomarkerName"

    invoke-direct {v2, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "allRecordingsFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_14
    instance-of v2, v1, Lj02/m0$l;

    if-eqz v2, :cond_16

    check-cast v1, Lj02/m0$l;

    invoke-virtual {v1}, Lj02/m0$l;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_15

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_15

    move-object v4, v2

    :cond_15
    invoke-virtual {v1}, Lj02/m0$l;->c()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v9, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v1}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "clinicalInsightsFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_16
    instance-of v2, v1, Lj02/m0$g;

    if-eqz v2, :cond_17

    check-cast v1, Lj02/m0$g;

    invoke-virtual {v1}, Lj02/m0$g;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v9, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "actionPlanFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_17
    instance-of v2, v1, Lj02/m0$k;

    if-eqz v2, :cond_19

    check-cast v1, Lj02/m0$k;

    invoke-virtual {v1}, Lj02/m0$k;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_18

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_18

    move-object v4, v2

    :cond_18
    invoke-virtual {v1}, Lj02/m0$k;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v7, "insightsId"

    invoke-direct {v2, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v1}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "insightsDeepDiveFragment"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_19
    instance-of v2, v1, Lj02/m0$y;

    if-eqz v2, :cond_1a

    const-string v1, "testUploadFragment"

    invoke-static {v1, v4, v8, v4}, Lor2/z;->c(Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_1a
    instance-of v2, v1, Lj02/m0$j;

    if-eqz v2, :cond_1d

    iget-object v2, v0, Ljd0/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v5, "mci-alabs-integration"

    invoke-interface {v2, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1c

    check-cast v1, Lj02/m0$j;

    invoke-virtual {v1}, Lj02/m0$j;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1b

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1b

    move-object v4, v1

    :cond_1b
    new-instance v1, Ll83/k;

    invoke-direct {v1, v9, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "hormonalContext"

    invoke-static {v2, v1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Ljd0/b;->a:Lj02/i0;

    invoke-static {v1, v6, v2}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object v8

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v1

    iput-boolean v3, v1, Leb/w0;->a:Z

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v9

    new-instance v7, Lj02/j0$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_1c
    sget-object v1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object v1

    :cond_1d
    sget-object v1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object v1
.end method
