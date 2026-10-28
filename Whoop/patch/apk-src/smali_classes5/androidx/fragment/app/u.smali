.class public final Landroidx/fragment/app/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic w:Landroidx/fragment/app/y;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/u;->w:Landroidx/fragment/app/y;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/u;->w:Landroidx/fragment/app/y;

    invoke-static {p1}, Landroidx/fragment/app/y;->access$000(Landroidx/fragment/app/y;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroidx/fragment/app/y;->access$000(Landroidx/fragment/app/y;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/y;->onCancel(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
