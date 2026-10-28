.class public final Lcom/stripe/android/link/LinkActivity;
.super Lg/l;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivity;",
        "Lg/l;",
        "<init>",
        "()V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic E:I


# instance fields
.field public final w:Ll8/d;

.field public x:Lwz/y;

.field public y:Lj/d;

.field public z:Lj/d;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lg/l;-><init>()V

    new-instance v0, Lb0/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lb0/b;-><init>(I)V

    new-instance v1, Lwo1/e0;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lwo1/e0;-><init>(I)V

    const-class v2, Lwz/y;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lb0/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lb0/b;->c()Ll8/d;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/LinkActivity;->w:Ll8/d;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {p0}, Lb3/g1;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 12

    const-string v0, "modelClass"

    const-string v1, "factory"

    invoke-super {p0, p1}, Lg/l;->onCreate(Landroid/os/Bundle;)V

    :try_start_0
    iget-object p1, p0, Lcom/stripe/android/link/LinkActivity;->w:Ll8/d;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v1

    invoke-interface {p0}, Landroidx/lifecycle/r;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object v2

    const-string v3, "store"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "defaultCreationExtras"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lzt/q;

    invoke-direct {v3, v1, p1, v2}, Lzt/q;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    const-class p1, Lwz/y;

    invoke-static {p1}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, p1}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object p1

    check-cast p1, Lwz/y;

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity;->x:Lwz/y;

    goto :goto_0

    :cond_0
    const-string p1, "Local and anonymous classes can not be ViewModels"

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/stripe/android/link/NoArgsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivity;->finish()V

    :goto_0
    iget-object p1, p0, Lcom/stripe/android/link/LinkActivity;->x:Lwz/y;

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object v0, p1, Lwz/y;->K:Lwz/n0;

    instance-of v1, v0, Lwz/l0;

    if-nez v1, :cond_4

    instance-of v1, v0, Lwz/m0;

    if-nez v1, :cond_4

    instance-of v1, v0, Lwz/i0;

    if-nez v1, :cond_4

    instance-of v1, v0, Lwz/j0;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    instance-of v0, v0, Lwz/k0;

    if-eqz v0, :cond_3

    const v0, 0x7f1502e0

    invoke-virtual {p0, v0}, Landroid/content/Context;->setTheme(I)V

    goto :goto_2

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_1
    const v0, 0x7f1502dd

    invoke-virtual {p0, v0}, Landroid/content/Context;->setTheme(I)V

    :goto_2
    invoke-static {p0}, Le4/a;->P(Lg/l;)V

    iget-object v0, p1, Lwz/y;->L:Li20/y0;

    invoke-virtual {v0, p0, p0}, Li20/y0;->a(Lg/l;Lg/l;)V

    iget-object v0, p1, Lwz/y;->N:Le10/r0;

    invoke-virtual {v0, p0, p0}, Le10/r0;->f(Lj/c;Landroidx/lifecycle/g0;)V

    iget-object v0, p1, Lwz/y;->w:Lc00/a;

    new-instance v1, Lcom/stripe/android/link/WebLinkActivityContract;

    new-instance v2, Lb10/z0;

    iget-object v3, v0, Lc00/a;->b:Landroid/app/Application;

    iget-object v4, v0, Lc00/a;->c:Lwz/r;

    iget-object v5, v0, Lc00/a;->d:Lb10/d;

    iget-object v6, v0, Lc00/a;->q:Lv03/h;

    invoke-interface {v6}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lq83/j;

    iget-object v7, v0, Lc00/a;->r:Lv03/h;

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Set;

    new-instance v8, Lb10/b;

    iget-object v9, v0, Lc00/a;->b:Landroid/app/Application;

    iget-object v10, v0, Lc00/a;->r:Lv03/h;

    invoke-interface {v10}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Set;

    invoke-direct {v8, v9, v10, v4}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    new-instance v9, Lyy/j;

    iget-object v10, v0, Lc00/a;->u:Lv03/h;

    invoke-interface {v10}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lqy/d;

    iget-object v11, v0, Lc00/a;->q:Lv03/h;

    invoke-interface {v11}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lq83/j;

    invoke-direct {v9, v10, v11}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    iget-object v10, v0, Lc00/a;->u:Lv03/h;

    invoke-interface {v10}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lqy/d;

    invoke-direct/range {v2 .. v10}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lq83/j;Ljava/util/Set;Lb10/b;Lyy/j;Lqy/d;)V

    iget-object v0, v0, Lc00/a;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb20/f;

    invoke-direct {v1, v2, v0}, Lcom/stripe/android/link/WebLinkActivityContract;-><init>(Lb10/c1;Lb20/f;)V

    new-instance v0, Lwz/i;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2}, Lwz/i;-><init>(Lwz/y;I)V

    invoke-virtual {p0, v1, v0}, Lg/l;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/LinkActivity;->y:Lj/d;

    sget-object v0, Lcom/stripe/android/link/WebLinkAuthActivityContract;->a:Lcom/stripe/android/link/WebLinkAuthActivityContract;

    new-instance v1, Lwz/i;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lwz/i;-><init>(Lwz/y;I)V

    invoke-virtual {p0, v0, v1}, Lg/l;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/LinkActivity;->z:Lj/d;

    new-instance v1, Landroidx/room/v0;

    const/4 v7, 0x0

    const/16 v8, 0x16

    const/4 v2, 0x2

    const-class v4, Lcom/stripe/android/link/LinkActivity;

    const-string v5, "launchWebFlow"

    const-string v6, "launchWebFlow(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V"

    move-object v3, p0

    invoke-direct/range {v1 .. v8}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iput-object v1, p1, Lwz/y;->W:Landroidx/room/v0;

    invoke-virtual {p0}, Lg/l;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    invoke-virtual {p0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object v0

    new-instance v1, Luo1/b;

    const/16 v2, 0x17

    invoke-direct {v1, p0, v2}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    const/4 v4, 0x3

    invoke-static {v0, v2, v1, v4}, Lo73/a;->n(Lg/z;Lc4/d0;Lkotlin/jvm/functions/Function1;I)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Ls40/c0;

    const/16 v5, 0x16

    invoke-direct {v1, p1, p0, v2, v5}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v2, v2, v1, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Lu10/f;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1, p0}, Lu10/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lx1/b;

    const/4 v1, 0x1

    const v2, 0x5a46c849

    invoke-direct {p1, v0, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p1}, Lh/f;->a(Lg/l;Lx1/b;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity;->x:Lwz/y;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, v0, Lwz/y;->W:Landroidx/room/v0;

    :cond_0
    if-eqz v0, :cond_1

    iput-object v1, v0, Lwz/y;->W:Landroidx/room/v0;

    :cond_1
    return-void
.end method
