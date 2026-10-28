.class public final synthetic Lsc2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic a:Lcom/whoop/settings/strap/EditDeviceNameActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc2/b;->a:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lsc2/b;->a:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    invoke-static {v0, p1, p2, p3}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->A(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
