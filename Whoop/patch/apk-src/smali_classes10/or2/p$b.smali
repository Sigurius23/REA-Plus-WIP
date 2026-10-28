.class public final Lor2/p$b;
.super Landroid/companion/CompanionDeviceManager$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lor2/p;->a(Lm/m;Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "or2/p$b",
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


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic b:Lm/m;

.field final synthetic c:Landroid/companion/CompanionDeviceManager$Callback;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lm/m;Landroid/companion/CompanionDeviceManager$Callback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lm/m;",
            "Landroid/companion/CompanionDeviceManager$Callback;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lor2/p$b;->a:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lor2/p$b;->b:Lm/m;

    iput-object p3, p0, Lor2/p$b;->c:Landroid/companion/CompanionDeviceManager$Callback;

    invoke-direct {p0}, Landroid/companion/CompanionDeviceManager$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeviceFound(Landroid/content/IntentSender;)V
    .locals 5

    const-string v0, "chooserLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lor2/p$b;->a:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lor2/p$b;->b:Lm/m;

    invoke-static {v0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v2, Lor2/p$b$a;

    iget-object v3, p0, Lor2/p$b;->b:Lm/m;

    iget-object v4, p0, Lor2/p$b;->c:Landroid/companion/CompanionDeviceManager$Callback;

    invoke-direct {v2, v3, v4, p1, v1}, Lor2/p$b$a;-><init>(Lm/m;Landroid/companion/CompanionDeviceManager$Callback;Landroid/content/IntentSender;Lq83/d;)V

    invoke-virtual {v0, v2}, Landroidx/lifecycle/b0;->b(Lc93/m;)V

    return-void
.end method

.method public onFailure(Ljava/lang/CharSequence;)V
    .locals 0

    return-void
.end method
