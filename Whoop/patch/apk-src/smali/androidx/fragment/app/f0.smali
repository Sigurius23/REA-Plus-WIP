.class public final Landroidx/fragment/app/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv/a;


# instance fields
.field public final synthetic w:Landroidx/fragment/app/m0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/f0;->w:Landroidx/fragment/app/m0;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Landroidx/fragment/app/f0;->w:Landroidx/fragment/app/m0;

    iget-object v0, p1, Landroidx/fragment/app/m0;->mHost:Landroidx/fragment/app/x0;

    instance-of v1, v0, Lj/k;

    if-eqz v1, :cond_0

    check-cast v0, Lj/k;

    invoke-interface {v0}, Lj/k;->getActivityResultRegistry()Lj/j;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    invoke-virtual {p1}, Lg/l;->getActivityResultRegistry()Lj/j;

    move-result-object p1

    return-object p1
.end method
