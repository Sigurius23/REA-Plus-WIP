.class public final Lvj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/g0;
.implements Landroidx/lifecycle/f2;
.implements Lpb/f;
.implements Lg/b0;


# instance fields
.field public final E:Landroidx/lifecycle/i0;

.field public final F:Lg/z;

.field public final G:Landroidx/lifecycle/e2;

.field public final w:Lpb/e;

.field public final x:Landroid/os/Bundle;

.field public final y:Landroid/view/View;

.field public final z:Landroidx/lifecycle/i0;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/app/Activity;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lrb/a;

    new-instance v0, Lm83/p;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, p0, v0}, Lrb/a;-><init>(Lpb/f;Lm83/p;)V

    new-instance v0, Lpb/e;

    invoke-direct {v0, p1}, Lpb/e;-><init>(Lrb/a;)V

    iput-object v0, p0, Lvj/a;->w:Lpb/e;

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p0, Lvj/a;->x:Landroid/os/Bundle;

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const-string p2, "activity.window.decorView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lvj/a;->y:Landroid/view/View;

    new-instance p1, Landroidx/lifecycle/i0;

    invoke-direct {p1, p0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/g0;)V

    iput-object p1, p0, Lvj/a;->z:Landroidx/lifecycle/i0;

    iput-object p1, p0, Lvj/a;->E:Landroidx/lifecycle/i0;

    new-instance p1, Lg/z;

    new-instance p2, Lb3/n;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Lb3/n;-><init>(I)V

    invoke-direct {p1, p2}, Lg/z;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, Lvj/a;->F:Lg/z;

    new-instance p1, Landroidx/lifecycle/e2;

    invoke-direct {p1}, Landroidx/lifecycle/e2;-><init>()V

    iput-object p1, p0, Lvj/a;->G:Landroidx/lifecycle/e2;

    return-void
.end method


# virtual methods
.method public final getLifecycle()Landroidx/lifecycle/x;
    .locals 1

    iget-object v0, p0, Lvj/a;->E:Landroidx/lifecycle/i0;

    return-object v0
.end method

.method public final getOnBackPressedDispatcher()Lg/z;
    .locals 1

    iget-object v0, p0, Lvj/a;->F:Lg/z;

    return-object v0
.end method

.method public final getSavedStateRegistry()Lpb/d;
    .locals 1

    iget-object v0, p0, Lvj/a;->w:Lpb/e;

    iget-object v0, v0, Lpb/e;->b:Lpb/d;

    return-object v0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/e2;
    .locals 1

    iget-object v0, p0, Lvj/a;->G:Landroidx/lifecycle/e2;

    return-object v0
.end method
