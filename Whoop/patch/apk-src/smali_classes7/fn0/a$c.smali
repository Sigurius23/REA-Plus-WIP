.class public final Lfn0/a$c;
.super Landroid/companion/CompanionDeviceManager$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn0/a;->b(Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\r\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "fn0/a$c",
        "Landroid/companion/CompanionDeviceManager$Callback;",
        "Landroid/content/IntentSender;",
        "intentSender",
        "Ll83/a0;",
        "onAssociationPending",
        "(Landroid/content/IntentSender;)V",
        "chooserLauncher",
        "onDeviceFound",
        "",
        "error",
        "onFailure",
        "(Ljava/lang/CharSequence;)V",
        "connectivity_release"
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

.field final synthetic b:Landroid/companion/CompanionDeviceManager$Callback;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Landroid/companion/CompanionDeviceManager$Callback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Landroid/companion/CompanionDeviceManager$Callback;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lfn0/a$c;->a:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lfn0/a$c;->b:Landroid/companion/CompanionDeviceManager$Callback;

    invoke-direct {p0}, Landroid/companion/CompanionDeviceManager$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAssociationPending(Landroid/content/IntentSender;)V
    .locals 1

    const-string v0, "intentSender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lfn0/a$c;->onDeviceFound(Landroid/content/IntentSender;)V

    return-void
.end method

.method public onDeviceFound(Landroid/content/IntentSender;)V
    .locals 2

    const-string v0, "chooserLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfn0/a$c;->a:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lfn0/a$c;->b:Landroid/companion/CompanionDeviceManager$Callback;

    invoke-virtual {v0, p1}, Landroid/companion/CompanionDeviceManager$Callback;->onDeviceFound(Landroid/content/IntentSender;)V

    return-void
.end method

.method public onFailure(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, Lfn0/a$c;->a:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lfn0/a$c;->b:Landroid/companion/CompanionDeviceManager$Callback;

    invoke-virtual {v0, p1}, Landroid/companion/CompanionDeviceManager$Callback;->onFailure(Ljava/lang/CharSequence;)V

    return-void
.end method
