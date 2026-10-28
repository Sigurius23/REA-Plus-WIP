.class public final Lcom/whoop/home/view/HomeFragment$b;
.super Landroid/companion/CompanionDeviceManager$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/home/view/HomeFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/whoop/home/view/HomeFragment$b",
        "Landroid/companion/CompanionDeviceManager$Callback;",
        "Landroid/content/IntentSender;",
        "chooserLauncher",
        "Ll83/a0;",
        "onDeviceFound",
        "(Landroid/content/IntentSender;)V",
        "",
        "error",
        "onFailure",
        "(Ljava/lang/CharSequence;)V",
        "home_release"
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
.field final synthetic a:Lcom/whoop/home/view/HomeFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/home/view/HomeFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/home/view/HomeFragment$b;->a:Lcom/whoop/home/view/HomeFragment;

    invoke-direct {p0}, Landroid/companion/CompanionDeviceManager$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeviceFound(Landroid/content/IntentSender;)V
    .locals 3
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "chooserLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/home/view/HomeFragment$b;->a:Lcom/whoop/home/view/HomeFragment;

    invoke-static {v0}, Lcom/whoop/home/view/HomeFragment;->z0(Lcom/whoop/home/view/HomeFragment;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "CDM: Launching CDM Dialog"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lcom/google/android/material/textfield/p;

    invoke-direct {v0, p1}, Lcom/google/android/material/textfield/p;-><init>(Landroid/content/IntentSender;)V

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->a()Lj/l;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/home/view/HomeFragment$b;->a:Lcom/whoop/home/view/HomeFragment;

    invoke-static {v0}, Lcom/whoop/home/view/HomeFragment;->w0(Lcom/whoop/home/view/HomeFragment;)Lj/d;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :cond_0
    const-string p1, "activityLauncher"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public onFailure(Ljava/lang/CharSequence;)V
    .locals 0

    return-void
.end method
