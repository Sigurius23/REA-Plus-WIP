.class public Lcom/google/android/gms/common/g;
.super Landroidx/fragment/app/y;
.source "SourceFile"


# instance fields
.field public w:Landroid/app/Dialog;

.field public x:Landroid/content/DialogInterface$OnCancelListener;

.field public y:Landroid/app/AlertDialog;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/y;-><init>()V

    return-void
.end method

.method public static z(Landroid/app/Dialog;Landroid/content/DialogInterface$OnCancelListener;)Lcom/google/android/gms/common/g;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/g;

    invoke-direct {v0}, Lcom/google/android/gms/common/g;-><init>()V

    const-string v1, "Cannot display null dialog"

    invoke-static {p0, v1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iput-object p0, v0, Lcom/google/android/gms/common/g;->w:Landroid/app/Dialog;

    if-eqz p1, :cond_0

    iput-object p1, v0, Lcom/google/android/gms/common/g;->x:Landroid/content/DialogInterface$OnCancelListener;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/g;->x:Landroid/content/DialogInterface$OnCancelListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method

.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/common/g;->w:Landroid/app/Dialog;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/y;->setShowsDialog(Z)V

    iget-object p1, p0, Lcom/google/android/gms/common/g;->y:Landroid/app/AlertDialog;

    if-nez p1, :cond_0

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/common/g;->y:Landroid/app/AlertDialog;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/common/g;->y:Landroid/app/AlertDialog;

    :cond_1
    return-object p1
.end method
