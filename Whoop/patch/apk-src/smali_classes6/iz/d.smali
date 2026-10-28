.class public final Liz/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field public final b:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

.field public final c:Landroidx/appcompat/widget/Toolbar;

.field public final d:Lcom/stripe/android/view/PaymentAuthWebView;

.field public final e:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/progressindicator/CircularProgressIndicator;Landroidx/appcompat/widget/Toolbar;Lcom/stripe/android/view/PaymentAuthWebView;Landroid/widget/FrameLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liz/d;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object p2, p0, Liz/d;->b:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    iput-object p3, p0, Liz/d;->c:Landroidx/appcompat/widget/Toolbar;

    iput-object p4, p0, Liz/d;->d:Lcom/stripe/android/view/PaymentAuthWebView;

    iput-object p5, p0, Liz/d;->e:Landroid/widget/FrameLayout;

    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;)Liz/d;
    .locals 8

    const v0, 0x7f0d065c

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a20

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    if-eqz v4, :cond_0

    const v0, 0x7f0a0cae

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/appcompat/widget/Toolbar;

    if-eqz v5, :cond_0

    const v0, 0x7f0a0d85

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/view/PaymentAuthWebView;

    if-eqz v6, :cond_0

    const v0, 0x7f0a0d86

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/FrameLayout;

    if-eqz v7, :cond_0

    new-instance v2, Liz/d;

    move-object v3, p0

    check-cast v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-direct/range {v2 .. v7}, Liz/d;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/progressindicator/CircularProgressIndicator;Landroidx/appcompat/widget/Toolbar;Lcom/stripe/android/view/PaymentAuthWebView;Landroid/widget/FrameLayout;)V

    return-object v2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Liz/d;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    return-object v0
.end method
