.class public final Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "com/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$a",
        "Landroid/view/View$OnAttachStateChangeListener;",
        "Landroid/view/View;",
        "view",
        "Ll83/a0;",
        "onViewAttachedToWindow",
        "(Landroid/view/View;)V",
        "onViewDetachedFromWindow",
        "core-ktx_release"
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
.field final synthetic w:Landroid/view/View;

.field final synthetic x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

.field final synthetic y:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$a;->w:Landroid/view/View;

    iput-object p2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$a;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    iput-object p3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$a;->y:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$a;->w:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$a;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$a;->y:Landroid/view/View;

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Lh5/i0;->a(Landroid/view/View;)Lh5/q1;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->i0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;Landroid/view/View;Lh5/q1;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
