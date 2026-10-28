.class public final Ly1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/f;
.implements Lpb/f;


# instance fields
.field public final synthetic w:Ly1/g;

.field public final x:Lpb/e;

.field public final y:Landroidx/lifecycle/i0;

.field public final z:Lpb/d;


# direct methods
.method public constructor <init>(Ly1/g;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/i;->w:Ly1/g;

    new-instance v0, Lrb/a;

    new-instance v1, Lm83/p;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, p0, v1}, Lrb/a;-><init>(Lpb/f;Lm83/p;)V

    new-instance v1, Lpb/e;

    invoke-direct {v1, v0}, Lpb/e;-><init>(Lrb/a;)V

    iput-object v1, p0, Ly1/i;->x:Lpb/e;

    new-instance v0, Landroidx/lifecycle/i0;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/g0;Z)V

    iput-object v0, p0, Ly1/i;->y:Landroidx/lifecycle/i0;

    iget-object v0, v1, Lpb/e;->b:Lpb/d;

    iput-object v0, p0, Ly1/i;->z:Lpb/d;

    const-string v0, "androidx.savedstate.SavedStateRegistry"

    invoke-virtual {p1, v0}, Ly1/g;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Landroid/os/Bundle;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/os/Bundle;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Lpb/e;->a(Landroid/os/Bundle;)V

    new-instance v1, Lm83/p;

    const/16 v2, 0x1a

    invoke-direct {v1, p0, v2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1, v0}, Ly1/g;->b(Lc93/a;Ljava/lang/String;)Ly1/e;

    return-void
.end method


# virtual methods
.method public final b(Lc93/a;Ljava/lang/String;)Ly1/e;
    .locals 1

    iget-object v0, p0, Ly1/i;->w:Ly1/g;

    invoke-virtual {v0, p1, p2}, Ly1/g;->b(Lc93/a;Ljava/lang/String;)Ly1/e;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ly1/i;->w:Ly1/g;

    invoke-virtual {v0, p1}, Ly1/g;->d(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Ly1/i;->w:Ly1/g;

    invoke-virtual {v0}, Ly1/g;->e()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly1/i;->w:Ly1/g;

    invoke-virtual {v0, p1}, Ly1/g;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getLifecycle()Landroidx/lifecycle/x;
    .locals 1

    iget-object v0, p0, Ly1/i;->y:Landroidx/lifecycle/i0;

    return-object v0
.end method

.method public final getSavedStateRegistry()Lpb/d;
    .locals 1

    iget-object v0, p0, Ly1/i;->z:Lpb/d;

    return-object v0
.end method
