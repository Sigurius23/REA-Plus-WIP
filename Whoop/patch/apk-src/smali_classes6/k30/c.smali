.class public final Lk30/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:Lcom/google/android/material/progressindicator/CircularProgressIndicator;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Lcom/google/android/material/progressindicator/CircularProgressIndicator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk30/c;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lk30/c;->b:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lk30/c;->a:Landroid/widget/FrameLayout;

    return-object v0
.end method
