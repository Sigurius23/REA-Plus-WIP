.class public final Lpq/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:Lpq/k;


# direct methods
.method public constructor <init>(Lpq/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpq/g;->w:Lpq/k;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lpq/g;->w:Lpq/k;

    iget-boolean v0, p1, Lpq/k;->K:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lpq/k;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lpq/k;->cancel()V

    :cond_0
    return-void
.end method
