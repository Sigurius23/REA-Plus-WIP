.class public final Lk30/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:Landroidx/fragment/app/FragmentContainerView;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Landroidx/fragment/app/FragmentContainerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk30/a;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lk30/a;->b:Landroidx/fragment/app/FragmentContainerView;

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lk30/a;->a:Landroid/widget/FrameLayout;

    return-object v0
.end method
