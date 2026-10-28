.class public final Lm20/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final a:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Lcom/stripe/android/paymentsheet/ui/PrimaryButton;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm20/a;->a:Landroid/widget/FrameLayout;

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lm20/a;->a:Landroid/widget/FrameLayout;

    return-object v0
.end method
