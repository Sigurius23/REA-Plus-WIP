.class public final Lcom/whoop/ui/main/LinkingActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/main/LinkingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\n\u001a\n \t*\u0004\u0018\u00010\u00080\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ/\u0010\u000f\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00080\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/ui/main/LinkingActivity$a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lcom/whoop/domain/model/WhoopUri;",
        "uri",
        "Landroid/content/Intent;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Landroid/content/Context;Lcom/whoop/domain/model/WhoopUri;)Landroid/content/Intent;",
        "Lh92/a;",
        "deepLinkParser",
        "",
        "b",
        "(Landroid/content/Context;Lcom/whoop/domain/model/WhoopUri;Lh92/a;)[Landroid/content/Intent;",
        "",
        "EXTERNAL_AUTH_PATH",
        "Ljava/lang/String;",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/ui/main/LinkingActivity$a;-><init>()V

    return-void
.end method

.method private final a(Landroid/content/Context;Lcom/whoop/domain/model/WhoopUri;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Lhj0/q;

    const-class v1, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {v0, p1, v1}, Lhj0/q;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {p2}, Lcom/whoop/domain/model/WhoopUriKt;->asUri(Lcom/whoop/domain/model/WhoopUri;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Lhj0/q;->o(Landroid/net/Uri;)Lhj0/q;

    invoke-virtual {v0}, Lhj0/q;->f()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(Landroid/content/Context;Lcom/whoop/domain/model/WhoopUri;Lh92/a;)[Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deepLinkParser"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhj0/q;

    const-class v1, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {v0, p1, v1}, Lhj0/q;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0}, Lhj0/q;->f()Landroid/content/Intent;

    move-result-object v0

    invoke-static {p1}, Landroidx/core/app/TaskStackBuilder;->create(Landroid/content/Context;)Landroidx/core/app/TaskStackBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/core/app/TaskStackBuilder;->addNextIntent(Landroid/content/Intent;)Landroidx/core/app/TaskStackBuilder;

    move-result-object v0

    const-string v1, "addNextIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Lh92/a;->a(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/domain/model/WhoopUri;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p1}, Landroidx/core/app/TaskStackBuilder;->create(Landroid/content/Context;)Landroidx/core/app/TaskStackBuilder;

    move-result-object p3

    invoke-direct {p0, p1, p2}, Lcom/whoop/ui/main/LinkingActivity$a;->a(Landroid/content/Context;Lcom/whoop/domain/model/WhoopUri;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroidx/core/app/TaskStackBuilder;->addNextIntent(Landroid/content/Intent;)Landroidx/core/app/TaskStackBuilder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/TaskStackBuilder;->getIntents()[Landroid/content/Intent;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {v0}, Landroidx/core/app/TaskStackBuilder;->getIntents()[Landroid/content/Intent;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method
