.class public final Lb20/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;


# direct methods
.method public synthetic constructor <init>(Lv03/h;Lv03/h;I)V
    .locals 0

    iput p3, p0, Lb20/g;->w:I

    iput-object p1, p0, Lb20/g;->x:Lv03/h;

    iput-object p2, p0, Lb20/g;->y:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lb20/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqy/d;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq83/j;

    new-instance v2, Lyy/j;

    invoke-direct {v2, v0, v1}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    return-object v2

    :pswitch_0
    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc93/a;

    new-instance v2, Lyy/f;

    invoke-direct {v2, v0, v1}, Lyy/f;-><init>(Lc93/a;Lc93/a;)V

    return-object v2

    :pswitch_1
    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb10/c1;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb20/f;

    new-instance v2, Lcom/stripe/android/link/WebLinkActivityContract;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/link/WebLinkActivityContract;-><init>(Lb10/c1;Lb20/f;)V

    return-object v2

    :pswitch_2
    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb10/d;

    new-instance v2, Lcom/stripe/android/link/NativeLinkActivityContract;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/link/NativeLinkActivityContract;-><init>(Ljava/lang/String;Lb10/d;)V

    return-object v2

    :pswitch_3
    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsz/c0;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsz/e;

    const-string v2, "googlePayConfig"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentsClientFactory"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lsz/c0;->w:Lsz/g;

    const-string v2, "environment"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ld0/o2;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ld0/o2;-><init>(I)V

    iget v0, v0, Lsz/g;->w:I

    invoke-virtual {v2, v0}, Ld0/o2;->o(I)V

    new-instance v7, Ldq/t;

    invoke-direct {v7, v2}, Ldq/t;-><init>(Ld0/o2;)V

    iget-object v4, v1, Lsz/e;->a:Landroid/content/Context;

    new-instance v3, Ldq/p;

    sget-object v6, Ldq/u;->a:Lcom/google/android/gms/common/api/f;

    sget-object v8, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    return-object v3

    :pswitch_4
    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm40/w;

    new-instance v2, Lq20/l;

    invoke-direct {v2, v0, v1}, Lq20/l;-><init>(Landroid/content/res/Resources;Lm40/w;)V

    return-object v2

    :pswitch_5
    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln20/u;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lwz/r0;

    const-string v1, "viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "walletsButtonLinkLauncher"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb30/f4;

    iget-object v2, v0, Ln20/u;->y:Ln20/b;

    iget-object v3, v2, Ln20/b;->Y:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh20/x;

    new-instance v6, Lb20/f;

    new-instance v4, Lyy/j;

    iget-object v5, v2, Ln20/b;->g:Lv03/h;

    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqy/d;

    iget-object v7, v2, Ln20/b;->h:Lv03/h;

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq83/j;

    invoke-direct {v4, v5, v7}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v5, Lb10/b;

    iget-object v7, v2, Ln20/b;->k:Lv03/h;

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    iget-object v9, v2, Ln20/b;->l:Lp20/i;

    const-string v10, "paymentConfiguration"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ln10/j0;

    const/4 v11, 0x2

    invoke-direct {v10, v9, v11}, Ln10/j0;-><init>(Lk83/a;I)V

    iget-object v9, v2, Ln20/b;->n:Lv03/h;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Set;

    invoke-direct {v5, v7, v9, v10}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-direct {v6, v4, v5}, Lb20/f;-><init>(Lyy/j;Lyy/c;)V

    iget-object v3, v3, Lh20/x;->a:Lwz/l1;

    iget-object v3, v3, Lwz/l1;->c:Ln53/e;

    iget-object v4, v0, Ln20/u;->H:Lec3/r1;

    iget-object v5, v0, Ln20/u;->G:Lec3/r1;

    new-instance v7, Lb30/a1;

    const/4 v9, 0x0

    invoke-direct {v7, v0, v9}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    invoke-static {v3, v4, v5, v7}, Lbi/g;->t(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Ln53/e;

    move-result-object v3

    iget-object v4, v2, Ln20/b;->X:Lv03/h;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le10/r0;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v5

    iget-object v7, v2, Ln20/b;->g0:Lv03/h;

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ls00/a;

    iget-object v9, v2, Ln20/b;->T:Lv03/h;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lxz/f0;

    iget-object v10, v2, Ln20/b;->a0:Lp20/i;

    new-instance v2, Ld1/j;

    new-instance v11, La1/b;

    const/16 v12, 0x10

    invoke-direct {v11, v0, v12}, La1/b;-><init>(Ljava/lang/Object;I)V

    invoke-direct/range {v2 .. v11}, Ld1/j;-><init>(Ln53/e;Le10/r0;Ln8/a;Lb20/f;Ls00/a;Lwz/r0;Lxz/f0;Lp20/i;La1/b;)V

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    return-object v1

    :pswitch_6
    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le10/r0;

    new-instance v2, Ln20/k;

    invoke-direct {v2, v0, v1}, Ln20/k;-><init>(Lbc3/c0;Le10/r0;)V

    return-object v2

    :pswitch_7
    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq83/j;

    new-instance v2, Lh20/h;

    invoke-direct {v2, v0, v1}, Lh20/h;-><init>(Landroid/content/Context;Lq83/j;)V

    return-object v2

    :pswitch_8
    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqy/d;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq83/j;

    const-string v2, "logger"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "workContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lux/j0;->c:Ljava/lang/String;

    new-instance v3, Lab/i0;

    const/16 v4, 0xe

    invoke-direct {v3, v1, v0, v4}, Lab/i0;-><init>(Lq83/j;Lqy/d;I)V

    new-instance v0, Lg30/g;

    invoke-direct {v0, v3, v2}, Lg30/g;-><init>(Lab/i0;Ljava/lang/String;)V

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqy/d;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq83/j;

    const-string v2, "logger"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "workContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lux/j0;->c:Ljava/lang/String;

    new-instance v3, Lab/i0;

    const/16 v4, 0xe

    invoke-direct {v3, v1, v0, v4}, Lab/i0;-><init>(Lq83/j;Lqy/d;I)V

    new-instance v0, Lg30/g;

    invoke-direct {v0, v3, v2}, Lg30/g;-><init>(Lab/i0;Ljava/lang/String;)V

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lb20/g;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyy/j;

    iget-object v1, p0, Lb20/g;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyy/c;

    new-instance v2, Lb20/f;

    invoke-direct {v2, v0, v1}, Lb20/f;-><init>(Lyy/j;Lyy/c;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
