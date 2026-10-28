.class public final Landroidx/databinding/z;
.super Landroidx/databinding/i;
.source "SourceFile"

# interfaces
.implements Landroidx/databinding/m;


# instance fields
.field public final w:Landroidx/databinding/d0;


# direct methods
.method public constructor <init>(Landroidx/databinding/a0;ILjava/lang/ref/ReferenceQueue;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/databinding/d0;

    invoke-direct {v0, p1, p2, p0, p3}, Landroidx/databinding/d0;-><init>(Landroidx/databinding/a0;ILandroidx/databinding/m;Ljava/lang/ref/ReferenceQueue;)V

    iput-object v0, p0, Landroidx/databinding/z;->w:Landroidx/databinding/d0;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/g0;)V
    .locals 0

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/databinding/j;

    invoke-interface {p1, p0}, Landroidx/databinding/j;->removeOnPropertyChangedCallback(Landroidx/databinding/i;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/databinding/j;

    invoke-interface {p1, p0}, Landroidx/databinding/j;->addOnPropertyChangedCallback(Landroidx/databinding/i;)V

    return-void
.end method

.method public final d()Landroidx/databinding/d0;
    .locals 1

    iget-object v0, p0, Landroidx/databinding/z;->w:Landroidx/databinding/d0;

    return-object v0
.end method
