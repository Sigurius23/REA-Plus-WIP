.class public final Lcoil/compose/AsyncImagePainter;
.super Ln2/a;
.source "SourceFile"

# interfaces
.implements Lp1/z1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcoil/compose/AsyncImagePainter;",
        "Ln2/a;",
        "Lp1/z1;",
        "ch/f",
        "coil-compose-base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final T:La11/g;


# instance fields
.field public E:Lhc3/d;

.field public final F:Lec3/h2;

.field public final G:Lp1/k1;

.field public final H:Lp1/g1;

.field public final I:Lp1/k1;

.field public J:Lch/f;

.field public K:Ln2/a;

.field public L:Lkotlin/jvm/functions/Function1;

.field public M:Lkotlin/jvm/functions/Function1;

.field public N:Ly2/k;

.field public O:I

.field public P:Z

.field public final Q:Lp1/k1;

.field public final R:Lp1/k1;

.field public final S:Lp1/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La11/g;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, La11/g;-><init>(I)V

    sput-object v0, Lcoil/compose/AsyncImagePainter;->T:La11/g;

    return-void
.end method

.method public constructor <init>(Lmh/j;Lbh/e;)V
    .locals 3

    invoke-direct {p0}, Ln2/a;-><init>()V

    new-instance v0, Lh2/e;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lh2/e;-><init>(J)V

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lcoil/compose/AsyncImagePainter;->F:Lec3/h2;

    const/4 v0, 0x0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lcoil/compose/AsyncImagePainter;->G:Lp1/k1;

    new-instance v1, Lp1/g1;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v1, v2}, Lp1/g1;-><init>(F)V

    iput-object v1, p0, Lcoil/compose/AsyncImagePainter;->H:Lp1/g1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lcoil/compose/AsyncImagePainter;->I:Lp1/k1;

    sget-object v0, Lch/e;->a:Lch/e;

    iput-object v0, p0, Lcoil/compose/AsyncImagePainter;->J:Lch/f;

    sget-object v1, Lcoil/compose/AsyncImagePainter;->T:La11/g;

    iput-object v1, p0, Lcoil/compose/AsyncImagePainter;->L:Lkotlin/jvm/functions/Function1;

    sget-object v1, Ly2/j;->b:Ly2/b1;

    iput-object v1, p0, Lcoil/compose/AsyncImagePainter;->N:Ly2/k;

    const/4 v1, 0x1

    iput v1, p0, Lcoil/compose/AsyncImagePainter;->O:I

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lcoil/compose/AsyncImagePainter;->Q:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lcoil/compose/AsyncImagePainter;->R:Lp1/k1;

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lcoil/compose/AsyncImagePainter;->S:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    const-string v0, "AsyncImagePainter.onRemembered"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->E:Lhc3/d;

    if-nez v0, :cond_4

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v1, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v1}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v1

    invoke-static {v0, v1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    iput-object v0, p0, Lcoil/compose/AsyncImagePainter;->E:Lhc3/d;

    iget-object v1, p0, Lcoil/compose/AsyncImagePainter;->K:Ln2/a;

    instance-of v2, v1, Lp1/z1;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lp1/z1;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Lp1/z1;->a()V

    :cond_1
    iget-boolean v1, p0, Lcoil/compose/AsyncImagePainter;->P:Z

    if-eqz v1, :cond_3

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->R:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/j;

    invoke-static {v0}, Lmh/j;->a(Lmh/j;)Lmh/h;

    move-result-object v0

    iget-object v1, p0, Lcoil/compose/AsyncImagePainter;->S:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbh/e;

    check-cast v1, Lbh/j;

    iget-object v1, v1, Lbh/j;->b:Lmh/c;

    iput-object v1, v0, Lmh/h;->b:Lmh/c;

    iput-object v3, v0, Lmh/h;->y:Lnh/g;

    invoke-virtual {v0}, Lmh/h;->a()Lmh/j;

    move-result-object v0

    new-instance v1, Lcoil/compose/AsyncImagePainter$State$Loading;

    iget-object v2, v0, Lmh/j;->B:Ljava/lang/Integer;

    iget-object v4, v0, Lmh/j;->F:Lmh/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2}, Lqh/b;->b(Lmh/j;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lcoil/compose/AsyncImagePainter;->j(Landroid/graphics/drawable/Drawable;)Ln2/a;

    move-result-object v3

    :cond_2
    invoke-direct {v1, v3}, Lcoil/compose/AsyncImagePainter$State$Loading;-><init>(Ln2/a;)V

    invoke-virtual {p0, v1}, Lcoil/compose/AsyncImagePainter;->k(Lch/f;)V

    goto :goto_1

    :cond_3
    new-instance v1, Landroidx/room/z1;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v3, v2}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method

.method public final b(F)V
    .locals 1

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->H:Lp1/g1;

    invoke-virtual {v0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->E:Lhc3/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v1, p0, Lcoil/compose/AsyncImagePainter;->E:Lhc3/d;

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->K:Ln2/a;

    instance-of v2, v0, Lp1/z1;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Lp1/z1;

    :cond_1
    if-eqz v1, :cond_2

    invoke-interface {v1}, Lp1/z1;->c()V

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->E:Lhc3/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v1, p0, Lcoil/compose/AsyncImagePainter;->E:Lhc3/d;

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->K:Ln2/a;

    instance-of v2, v0, Lp1/z1;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Lp1/z1;

    :cond_1
    if-eqz v1, :cond_2

    invoke-interface {v1}, Lp1/z1;->d()V

    :cond_2
    return-void
.end method

.method public final e(Li2/y;)V
    .locals 1

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->I:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final h()J
    .locals 2

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->G:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln2/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln2/a;->h()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    return-wide v0
.end method

.method public final i(Lk2/e;)V
    .locals 7

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v0

    new-instance v2, Lh2/e;

    invoke-direct {v2, v0, v1}, Lh2/e;-><init>(J)V

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->F:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->G:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ln2/a;

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v3

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->H:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v5

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->I:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Li2/y;

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Ln2/a;->g(Lk2/e;JFLi2/y;)V

    :cond_0
    return-void
.end method

.method public final j(Landroid/graphics/drawable/Drawable;)Ln2/a;
    .locals 1

    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    new-instance v0, Li2/g;

    invoke-direct {v0, p1}, Li2/g;-><init>(Landroid/graphics/Bitmap;)V

    iget p1, p0, Lcoil/compose/AsyncImagePainter;->O:I

    invoke-static {v0, p1}, Lts/o;->a(Li2/g;I)Landroidx/compose/ui/graphics/painter/BitmapPainter;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/accompanist/drawablepainter/DrawablePainter;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/accompanist/drawablepainter/DrawablePainter;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method public final k(Lch/f;)V
    .locals 12

    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->J:Lch/f;

    iget-object v1, p0, Lcoil/compose/AsyncImagePainter;->L:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lch/f;

    iput-object p1, p0, Lcoil/compose/AsyncImagePainter;->J:Lch/f;

    iget-object v1, p0, Lcoil/compose/AsyncImagePainter;->Q:Lp1/k1;

    invoke-virtual {v1, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    instance-of v1, p1, Lcoil/compose/AsyncImagePainter$State$Success;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lcoil/compose/AsyncImagePainter$State$Success;

    iget-object v1, v1, Lcoil/compose/AsyncImagePainter$State$Success;->a:Lmh/o;

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lcoil/compose/AsyncImagePainter$State$Error;

    if-eqz v1, :cond_4

    move-object v1, p1

    check-cast v1, Lcoil/compose/AsyncImagePainter$State$Error;

    iget-object v1, v1, Lcoil/compose/AsyncImagePainter$State$Error;->a:Lmh/e;

    :goto_0
    invoke-virtual {v1}, Lmh/k;->b()Lmh/j;

    move-result-object v3

    iget-object v3, v3, Lmh/j;->j:Lph/e;

    sget-object v4, Lch/k;->a:Lch/j;

    invoke-interface {v3, v4, v1}, Lph/e;->a(Lch/j;Lmh/k;)Lph/f;

    move-result-object v3

    instance-of v4, v3, Lph/b;

    if-eqz v4, :cond_4

    invoke-virtual {v0}, Lch/f;->a()Ln2/a;

    move-result-object v4

    instance-of v5, v0, Lcoil/compose/AsyncImagePainter$State$Loading;

    if-eqz v5, :cond_1

    move-object v7, v4

    goto :goto_1

    :cond_1
    move-object v7, v2

    :goto_1
    invoke-virtual {p1}, Lch/f;->a()Ln2/a;

    move-result-object v8

    iget-object v9, p0, Lcoil/compose/AsyncImagePainter;->N:Ly2/k;

    check-cast v3, Lph/b;

    iget v10, v3, Lph/b;->c:I

    instance-of v3, v1, Lmh/o;

    if-eqz v3, :cond_3

    check-cast v1, Lmh/o;

    iget-boolean v1, v1, Lmh/o;->g:Z

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    const/4 v1, 0x0

    :goto_2
    move v11, v1

    goto :goto_4

    :cond_3
    :goto_3
    const/4 v1, 0x1

    goto :goto_2

    :goto_4
    new-instance v6, Lcoil/compose/CrossfadePainter;

    invoke-direct/range {v6 .. v11}, Lcoil/compose/CrossfadePainter;-><init>(Ln2/a;Ln2/a;Ly2/k;IZ)V

    goto :goto_5

    :cond_4
    move-object v6, v2

    :goto_5
    if-eqz v6, :cond_5

    goto :goto_6

    :cond_5
    invoke-virtual {p1}, Lch/f;->a()Ln2/a;

    move-result-object v6

    :goto_6
    iput-object v6, p0, Lcoil/compose/AsyncImagePainter;->K:Ln2/a;

    iget-object v1, p0, Lcoil/compose/AsyncImagePainter;->G:Lp1/k1;

    invoke-virtual {v1, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, Lcoil/compose/AsyncImagePainter;->E:Lhc3/d;

    if-eqz v1, :cond_9

    invoke-virtual {v0}, Lch/f;->a()Ln2/a;

    move-result-object v1

    invoke-virtual {p1}, Lch/f;->a()Ln2/a;

    move-result-object v3

    if-eq v1, v3, :cond_9

    invoke-virtual {v0}, Lch/f;->a()Ln2/a;

    move-result-object v0

    instance-of v1, v0, Lp1/z1;

    if-eqz v1, :cond_6

    check-cast v0, Lp1/z1;

    goto :goto_7

    :cond_6
    move-object v0, v2

    :goto_7
    if-eqz v0, :cond_7

    invoke-interface {v0}, Lp1/z1;->d()V

    :cond_7
    invoke-virtual {p1}, Lch/f;->a()Ln2/a;

    move-result-object v0

    instance-of v1, v0, Lp1/z1;

    if-eqz v1, :cond_8

    move-object v2, v0

    check-cast v2, Lp1/z1;

    :cond_8
    if-eqz v2, :cond_9

    invoke-interface {v2}, Lp1/z1;->a()V

    :cond_9
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->M:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_a

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    return-void
.end method
