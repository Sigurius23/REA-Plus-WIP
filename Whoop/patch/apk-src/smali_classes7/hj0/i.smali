.class public abstract Lhj0/i;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J+\u0010\u0010\u001a\u00020\u0006\"\u0004\u0008\u0000\u0010\u000c*\u0008\u0012\u0004\u0012\u00028\u00000\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u001a\u001a\u0004\u0008\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001a\u001a\u0004\u0008$\u0010%R\u0014\u0010*\u001a\u00020\'8$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lhj0/i;",
        "Lm/m;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onResume",
        "onPause",
        "onDestroy",
        "T",
        "Landroidx/lifecycle/p0;",
        "Landroidx/lifecycle/v0;",
        "observer",
        "y",
        "(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V",
        "",
        "w",
        "Z",
        "u",
        "()Z",
        "logLifecycle",
        "Ltr2/n;",
        "x",
        "Ll83/h;",
        "t",
        "()Ltr2/n;",
        "log",
        "Lhj0/r;",
        "s",
        "()Lhj0/r;",
        "lifecycleLogger",
        "Lhj0/e;",
        "z",
        "r",
        "()Lhj0/e;",
        "applicationLifecycleListener",
        "",
        "v",
        "()Ljava/lang/String;",
        "logTag",
        "feature_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# instance fields
.field private final w:Z

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lm/m;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhj0/i;->w:Z

    sget-object v0, Ll83/i;->y:Ll83/i;

    new-instance v1, Lhj0/h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lhj0/h;-><init>(Lhj0/i;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lhj0/i;->x:Ll83/h;

    new-instance v1, Lhj0/h;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lhj0/h;-><init>(Lhj0/i;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lhj0/i;->y:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lhj0/i$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lhj0/i$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lhj0/i;->z:Ll83/h;

    return-void
.end method

.method public static synthetic o(Lhj0/i;)Ltr2/n;
    .locals 0

    invoke-static {p0}, Lhj0/i;->x(Lhj0/i;)Ltr2/n;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lhj0/i;)Lhj0/r;
    .locals 0

    invoke-static {p0}, Lhj0/i;->w(Lhj0/i;)Lhj0/r;

    move-result-object p0

    return-object p0
.end method

.method private final r()Lhj0/e;
    .locals 1

    iget-object v0, p0, Lhj0/i;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhj0/e;

    return-object v0
.end method

.method private final s()Lhj0/r;
    .locals 1

    iget-object v0, p0, Lhj0/i;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhj0/r;

    return-object v0
.end method

.method private static final w(Lhj0/i;)Lhj0/r;
    .locals 1

    new-instance v0, Lhj0/r;

    invoke-virtual {p0}, Lhj0/i;->t()Ltr2/n;

    move-result-object p0

    invoke-direct {v0, p0}, Lhj0/r;-><init>(Ltr2/n;)V

    return-object v0
.end method

.method private static final x(Lhj0/i;)Ltr2/n;
    .locals 1

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    invoke-virtual {p0}, Lhj0/i;->v()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Lhj0/i;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg/l;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-direct {p0}, Lhj0/i;->s()Lhj0/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    :cond_0
    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lm/m;->onDestroy()V

    invoke-virtual {p0}, Lhj0/i;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg/l;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-direct {p0}, Lhj0/i;->s()Lhj0/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/r0;->onPause()V

    invoke-direct {p0}, Lhj0/i;->r()Lhj0/e;

    move-result-object v0

    invoke-interface {v0, p0}, Lhj0/e;->onActivityPaused(Landroid/app/Activity;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/r0;->onResume()V

    invoke-direct {p0}, Lhj0/i;->r()Lhj0/e;

    move-result-object v0

    invoke-interface {v0, p0}, Lhj0/e;->onActivityResumed(Landroid/app/Activity;)V

    return-void
.end method

.method public final t()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lhj0/i;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltr2/n;

    return-object v0
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Lhj0/i;->w:Z

    return v0
.end method

.method public abstract v()Ljava/lang/String;
.end method

.method public final y(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/p0;",
            "Landroidx/lifecycle/v0;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "observer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0, p2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method
