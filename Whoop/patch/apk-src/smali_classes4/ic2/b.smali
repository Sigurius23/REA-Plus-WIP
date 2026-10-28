.class public final Lic2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lic2/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "Lfi0/c;",
        "amplitude",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "ffChecker",
        "<init>",
        "(Lfi0/a;Lfi0/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "",
        "label",
        "value",
        "action",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "nameSpace",
        "a",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "c",
        "(Ljava/lang/String;)V",
        "d",
        "",
        "isNotificationOn",
        "e",
        "(Ljava/lang/String;Z)V",
        "f",
        "()V",
        "Lfi0/a;",
        "Lfi0/c;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "settings_release"
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
.field private final a:Lfi0/a;

.field private final b:Lfi0/c;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lfi0/a;Lfi0/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "amplitude"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ffChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic2/b;->a:Lfi0/a;

    iput-object p2, p0, Lic2/b;->b:Lfi0/c;

    iput-object p3, p0, Lic2/b;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method private final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "StressSummary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Stress Monitor"

    :cond_0
    return-object p1
.end method

.method private final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lic2/b;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "android-notification-unsub-monitoring"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lic2/b;->b:Lfi0/c;

    const-string v0, "screen_name"

    const-string v2, "notification_settings"

    invoke-static {v0, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const-string v2, "notification_permissions"

    const-string v5, "Push Notification"

    move-object v4, p1

    move-object v6, p2

    move-object v3, p3

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)V
    .locals 2

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disabled"

    const-string v1, "changed_notification_status"

    invoke-direct {p0, p1, v0, v1}, Lic2/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabled"

    const-string v1, "changed_notification_status"

    invoke-direct {p0, p1, v0, v1}, Lic2/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final e(Ljava/lang/String;Z)V
    .locals 3

    const-string v0, "nameSpace"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lic2/b;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "android-notification-unsub-monitoring"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    const-string p2, "enabled"

    goto :goto_0

    :cond_0
    const-string p2, "disabled"

    :goto_0
    const-string v0, "changed_notification_status"

    invoke-direct {p0, p1, p2, v0}, Lic2/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lic2/b;->a:Lfi0/a;

    if-eqz p2, :cond_2

    const-string p2, "Enable"

    goto :goto_1

    :cond_2
    const-string p2, "Disable"

    :goto_1
    invoke-direct {p0, p1}, Lic2/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Notifications"

    const-string v2, "Settings"

    invoke-interface {v0, v2, p2, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final f()V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "view_pn_settings_screen"

    invoke-direct {p0, v0, v0, v1}, Lic2/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
