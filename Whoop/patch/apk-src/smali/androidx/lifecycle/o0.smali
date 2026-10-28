.class public abstract Landroidx/lifecycle/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final w:Landroidx/lifecycle/v0;

.field public x:Z

.field public y:I

.field public final synthetic z:Landroidx/lifecycle/p0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/o0;->z:Landroidx/lifecycle/p0;

    const/4 p1, -0x1

    iput p1, p0, Landroidx/lifecycle/o0;->y:I

    iput-object p2, p0, Landroidx/lifecycle/o0;->w:Landroidx/lifecycle/v0;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/lifecycle/o0;->x:Z

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    iput-boolean p1, p0, Landroidx/lifecycle/o0;->x:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    iget-object v0, p0, Landroidx/lifecycle/o0;->z:Landroidx/lifecycle/p0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/p0;->changeActiveCounter(I)V

    iget-boolean p1, p0, Landroidx/lifecycle/o0;->x:Z

    if-eqz p1, :cond_2

    invoke-virtual {v0, p0}, Landroidx/lifecycle/p0;->dispatchingValue(Landroidx/lifecycle/o0;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Landroidx/lifecycle/g0;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public abstract d()Z
.end method
