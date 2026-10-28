.class public final Landroidx/lifecycle/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;


# instance fields
.field public final w:Landroidx/lifecycle/p0;

.field public final x:Landroidx/lifecycle/v0;

.field public y:I


# direct methods
.method public constructor <init>(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/lifecycle/s0;->y:I

    iput-object p1, p0, Landroidx/lifecycle/s0;->w:Landroidx/lifecycle/p0;

    iput-object p2, p0, Landroidx/lifecycle/s0;->x:Landroidx/lifecycle/v0;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Landroidx/lifecycle/s0;->y:I

    iget-object v1, p0, Landroidx/lifecycle/s0;->w:Landroidx/lifecycle/p0;

    invoke-virtual {v1}, Landroidx/lifecycle/p0;->getVersion()I

    move-result v2

    if-eq v0, v2, :cond_0

    invoke-virtual {v1}, Landroidx/lifecycle/p0;->getVersion()I

    move-result v0

    iput v0, p0, Landroidx/lifecycle/s0;->y:I

    iget-object v0, p0, Landroidx/lifecycle/s0;->x:Landroidx/lifecycle/v0;

    invoke-interface {v0, p1}, Landroidx/lifecycle/v0;->onChanged(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
