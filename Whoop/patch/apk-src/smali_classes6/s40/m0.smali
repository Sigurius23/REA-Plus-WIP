.class public final Ls40/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/g0;
.implements Landroidx/lifecycle/f2;
.implements Lpb/f;


# instance fields
.field public final w:Landroidx/lifecycle/i0;

.field public final x:Landroidx/lifecycle/e2;

.field public final y:Lpb/e;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/i0;

    invoke-direct {v0, p0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/g0;)V

    iput-object v0, p0, Ls40/m0;->w:Landroidx/lifecycle/i0;

    new-instance v0, Landroidx/lifecycle/e2;

    invoke-direct {v0}, Landroidx/lifecycle/e2;-><init>()V

    iput-object v0, p0, Ls40/m0;->x:Landroidx/lifecycle/e2;

    new-instance v0, Lrb/a;

    new-instance v1, Lm83/p;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, p0, v1}, Lrb/a;-><init>(Lpb/f;Lm83/p;)V

    new-instance v1, Lpb/e;

    invoke-direct {v1, v0}, Lpb/e;-><init>(Lrb/a;)V

    iput-object v1, p0, Ls40/m0;->y:Lpb/e;

    return-void
.end method


# virtual methods
.method public final getLifecycle()Landroidx/lifecycle/x;
    .locals 1

    iget-object v0, p0, Ls40/m0;->w:Landroidx/lifecycle/i0;

    return-object v0
.end method

.method public final getSavedStateRegistry()Lpb/d;
    .locals 1

    iget-object v0, p0, Ls40/m0;->y:Lpb/e;

    iget-object v0, v0, Lpb/e;->b:Lpb/d;

    return-object v0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/e2;
    .locals 1

    iget-object v0, p0, Ls40/m0;->x:Landroidx/lifecycle/e2;

    return-object v0
.end method
