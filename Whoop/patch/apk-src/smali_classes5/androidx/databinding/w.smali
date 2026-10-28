.class public final Landroidx/databinding/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f0;


# instance fields
.field public final w:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroidx/databinding/a0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/databinding/w;->w:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onStart()V
    .locals 1
    .annotation runtime Landroidx/lifecycle/w0;
        value = .enum Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;
    .end annotation

    iget-object v0, p0, Landroidx/databinding/w;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/databinding/a0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/databinding/a0;->executePendingBindings()V

    :cond_0
    return-void
.end method
