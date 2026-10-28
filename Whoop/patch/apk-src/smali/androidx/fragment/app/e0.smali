.class public final Landroidx/fragment/app/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:Landroidx/fragment/app/m0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/e0;->w:Landroidx/fragment/app/m0;

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 0

    sget-object p1, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/e0;->w:Landroidx/fragment/app/m0;

    iget-object p1, p1, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_0
    return-void
.end method
