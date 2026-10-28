.class public final Lrb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lpb/f;

.field public final b:Lm83/p;

.field public final c:Ljc/b;

.field public final d:Ljava/util/LinkedHashMap;

.field public e:Z

.field public f:Landroid/os/Bundle;

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>(Lpb/f;Lm83/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrb/a;->a:Lpb/f;

    iput-object p2, p0, Lrb/a;->b:Lm83/p;

    new-instance p1, Ljc/b;

    const/16 p2, 0x16

    invoke-direct {p1, p2}, Ljc/b;-><init>(I)V

    iput-object p1, p0, Lrb/a;->c:Ljc/b;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lrb/a;->d:Ljava/util/LinkedHashMap;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lrb/a;->h:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lrb/a;->a:Lpb/f;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Lrb/a;->e:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lrb/a;->b:Lm83/p;

    invoke-virtual {v1}, Lm83/p;->invoke()Ljava/lang/Object;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    new-instance v1, Lb3/i3;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lb3/i3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lrb/a;->e:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SavedStateRegistry was already attached."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
