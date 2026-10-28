.class public final Ll62/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Ll62/b;",
        "Lj02/k0;",
        "Landroidx/fragment/app/r0;",
        "activity",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "Lh62/b;",
        "analyticsHelper",
        "<init>",
        "(Landroidx/fragment/app/r0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;Lh62/b;)V",
        "",
        "disableDefaultOpenSheetAnalytic",
        "c",
        "(Ljava/lang/Boolean;)Z",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "a",
        "Landroidx/fragment/app/r0;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Lj02/i0;",
        "d",
        "Lh62/b;",
        "refer-a-friend_release"
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
.field private final a:Landroidx/fragment/app/r0;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Lj02/i0;

.field private final d:Lh62/b;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/r0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;Lh62/b;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ll62/b;->a:Landroidx/fragment/app/r0;

    .line 3
    iput-object p2, p0, Ll62/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 4
    iput-object p3, p0, Ll62/b;->c:Lj02/i0;

    .line 5
    iput-object p4, p0, Ll62/b;->d:Lh62/b;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/r0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;Lh62/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 6
    new-instance p3, Lj02/i0;

    invoke-direct {p3}, Lj02/i0;-><init>()V

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Ll62/b;-><init>(Landroidx/fragment/app/r0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;Lh62/b;)V

    return-void
.end method

.method public static synthetic a(Ll62/b;Ljava/lang/String;Lh62/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll62/b;->b(Ll62/b;Ljava/lang/String;Lh62/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ll62/b;Ljava/lang/String;Lh62/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ll62/b;->d:Lh62/b;

    invoke-virtual {p0, p2, p1}, Lh62/b;->a(Lh62/a;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final c(Ljava/lang/Boolean;)Z
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "navigationScreen"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lj02/m0$b4;

    const-string v3, "text/plain"

    const-string v4, "android.intent.extra.TEXT"

    const-string v5, "android.intent.action.SEND"

    const/4 v11, 0x0

    if-eqz v2, :cond_5

    check-cast v1, Lj02/m0$b4;

    invoke-virtual {v1}, Lj02/m0$b4;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lj02/m0$b4;->c()Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->getSerializedValue()Ljava/lang/String;

    move-result-object v6

    :goto_0
    move-object v15, v6

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lj02/m0$b4;->d()Ljava/lang/Boolean;

    move-result-object v6

    invoke-direct {v0, v6}, Ll62/b;->c(Ljava/lang/Boolean;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, v0, Ll62/b;->d:Lh62/b;

    new-instance v7, Ll83/k;

    const-string v8, "Region"

    invoke-direct {v7, v8, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v7}, [Ll83/k;

    move-result-object v7

    invoke-static {v7}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v7

    invoke-virtual {v1}, Lj02/m0$b4;->b()Ljava/util/Map;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-interface {v7, v8}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_1
    new-instance v12, Lh62/a$d;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x3

    const/16 v18, 0x0

    move-object/from16 v16, v7

    invoke-direct/range {v12 .. v18}, Lh62/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6, v12, v2}, Lh62/b;->a(Lh62/a;Ljava/lang/String;)V

    :cond_2
    new-instance v6, Lo62/b;

    iget-object v7, v0, Ll62/b;->a:Landroidx/fragment/app/r0;

    invoke-virtual {v1}, Lj02/m0$b4;->b()Ljava/util/Map;

    move-result-object v8

    new-instance v9, Ljp1/c;

    const/16 v10, 0x15

    invoke-direct {v9, v10, v0, v2}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v6, v7, v15, v8, v9}, Lo62/b;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v6}, Lo62/b;->c()V

    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v6, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1}, Lj02/m0$b4;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v6, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v3, Landroid/content/Intent;

    iget-object v4, v0, Ll62/b;->a:Landroidx/fragment/app/r0;

    const-class v5, Lcom/whoop/referafriend/utils/SharingBroadcastReceiver;

    invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v4, "source"

    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "checkout_origin"

    invoke-virtual {v3, v2, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1}, Lj02/m0$b4;->b()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    const-string v1, "analytics_properties"

    invoke-virtual {v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_4
    iget-object v1, v0, Ll62/b;->a:Landroidx/fragment/app/r0;

    const/high16 v2, 0xa000000

    invoke-static {v1, v11, v3, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    iget-object v2, v0, Ll62/b;->a:Landroidx/fragment/app/r0;

    sget v3, Lf62/b;->f:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v1

    invoke-static {v6, v2, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;Landroid/content/IntentSender;)Landroid/content/Intent;

    move-result-object v1

    iget-object v2, v0, Ll62/b;->a:Landroidx/fragment/app/r0;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object v1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object v1

    :cond_5
    instance-of v2, v1, Lj02/m0$a4;

    if-eqz v2, :cond_9

    iget-object v2, v0, Ll62/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v6, "raf-hub-android"

    invoke-interface {v2, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_7

    move-object v2, v1

    check-cast v2, Lj02/m0$a4;

    invoke-virtual {v2}, Lj02/m0$a4;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_6

    goto :goto_3

    :cond_6
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v1, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v2}, Lj02/m0$a4;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v2, v0, Ll62/b;->a:Landroidx/fragment/app/r0;

    sget v3, Lf62/b;->f:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v1

    iget-object v2, v0, Ll62/b;->a:Landroidx/fragment/app/r0;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object v1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object v1

    :cond_7
    :goto_3
    iget-object v2, v0, Ll62/b;->c:Lj02/i0;

    check-cast v1, Lj02/m0$a4;

    invoke-virtual {v1}, Lj02/m0$a4;->d()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "android-app://com.whoop/referafriend?source="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1}, Lj02/m0$a4;->b()Ljava/lang/Integer;

    move-result-object v1

    sget v12, Lnf1/a;->o:I

    sget v15, Lnf1/a;->p:I

    const/4 v13, -0x1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v3, 0x1

    move v9, v1

    move v10, v3

    goto :goto_4

    :cond_8
    move v10, v11

    move v9, v13

    :goto_4
    new-instance v1, Lj02/j0$c;

    new-instance v6, Leb/x0;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v14, v13

    invoke-direct/range {v6 .. v15}, Leb/x0;-><init>(ZZIZZIIII)V

    sget-object v3, Lj02/p0$d;->a:Lj02/p0$d;

    invoke-direct {v1, v2, v6, v3}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;)V

    return-object v1

    :cond_9
    sget-object v1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object v1
.end method
