.class public final Landroidx/lifecycle/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:Landroidx/lifecycle/w;

.field public final synthetic x:Landroidx/lifecycle/x;

.field public final synthetic y:Lbc3/m;

.field public final synthetic z:Lc93/a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/w;Landroidx/lifecycle/x;Lbc3/m;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/i2;->w:Landroidx/lifecycle/w;

    iput-object p2, p0, Landroidx/lifecycle/i2;->x:Landroidx/lifecycle/x;

    iput-object p3, p0, Landroidx/lifecycle/i2;->y:Lbc3/m;

    iput-object p4, p0, Landroidx/lifecycle/i2;->z:Lc93/a;

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/v;->Companion:Landroidx/lifecycle/t;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Landroidx/lifecycle/i2;->w:Landroidx/lifecycle/w;

    invoke-static {p1}, Landroidx/lifecycle/t;->b(Landroidx/lifecycle/w;)Landroidx/lifecycle/v;

    move-result-object p1

    iget-object v0, p0, Landroidx/lifecycle/i2;->y:Lbc3/m;

    iget-object v1, p0, Landroidx/lifecycle/i2;->x:Landroidx/lifecycle/x;

    if-ne p2, p1, :cond_0

    invoke-virtual {v1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    iget-object p1, p0, Landroidx/lifecycle/i2;->z:Lc93/a;

    :try_start_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object p1, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_1

    invoke-virtual {v1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    new-instance p1, Landroidx/lifecycle/LifecycleDestroyedException;

    invoke-direct {p1}, Landroidx/lifecycle/LifecycleDestroyedException;-><init>()V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
