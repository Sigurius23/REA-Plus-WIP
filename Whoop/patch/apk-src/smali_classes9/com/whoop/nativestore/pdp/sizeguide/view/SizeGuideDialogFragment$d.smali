.class public final Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/lifecycle/w1;",
        "T",
        "Ljf3/a;",
        "<anonymous>",
        "()Ljf3/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation


# instance fields
.field final synthetic w:Landroid/content/ComponentCallbacks;


# direct methods
.method public constructor <init>(Landroid/content/ComponentCallbacks;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$d;->w:Landroid/content/ComponentCallbacks;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$d;->invoke()Ljf3/a;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljf3/a;
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$d;->w:Landroid/content/ComponentCallbacks;

    move-object v1, v0

    check-cast v1, Landroidx/lifecycle/f2;

    instance-of v2, v0, Lpb/f;

    if-eqz v2, :cond_0

    check-cast v0, Lpb/f;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    const-string v2, "storeOwner"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v2, Ljf3/a;

    .line 5
    invoke-interface {v1}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v1

    const-string v3, "storeOwner.viewModelStore"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {v2, v1, v0}, Ljf3/a;-><init>(Landroidx/lifecycle/e2;Lpb/f;)V

    return-object v2
.end method
