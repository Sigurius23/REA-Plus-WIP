.class public final Lm20/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final a:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

.field public final b:Landroid/widget/ImageView;

.field public final c:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

.field public final d:Landroidx/compose/ui/platform/ComposeView;

.field public final e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/PrimaryButton;Landroid/widget/ImageView;Lcom/google/android/material/progressindicator/CircularProgressIndicator;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm20/b;->a:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    iput-object p2, p0, Lm20/b;->b:Landroid/widget/ImageView;

    iput-object p3, p0, Lm20/b;->c:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    iput-object p4, p0, Lm20/b;->d:Landroidx/compose/ui/platform/ComposeView;

    iput-object p5, p0, Lm20/b;->e:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lm20/b;->a:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    return-object v0
.end method
