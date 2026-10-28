.class public abstract Lch/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lch/j;

.field public static final b:Lqt/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lch/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lch/k;->a:Lch/j;

    new-instance v0, Lqt/e;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Lch/k;->b:Lqt/e;

    return-void
.end method

.method public static final a(Lmh/j;Lbh/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly2/k;Lqt/e;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;
    .locals 0

    check-cast p6, Lp1/q;

    const p7, 0x62169369

    invoke-virtual {p6, p7}, Lp1/q;->f0(I)V

    and-int/lit8 p7, p8, 0x40

    if-eqz p7, :cond_0

    sget-object p5, Lch/k;->b:Lqt/e;

    :cond_0
    new-instance p7, Lch/l;

    invoke-direct {p7, p0, p5, p1}, Lch/l;-><init>(Ljava/lang/Object;Lqt/e;Lbh/e;)V

    invoke-static {p7, p2, p3, p4, p6}, Lch/k;->b(Lch/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly2/k;Landroidx/compose/runtime/Composer;)Lcoil/compose/AsyncImagePainter;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p6, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method public static final b(Lch/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly2/k;Landroidx/compose/runtime/Composer;)Lcoil/compose/AsyncImagePainter;
    .locals 3

    check-cast p4, Lp1/q;

    const v0, 0x38ccb86a

    invoke-virtual {p4, v0}, Lp1/q;->f0(I)V

    const-string v0, "rememberAsyncImagePainter"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lch/l;->a:Ljava/lang/Object;

    iget-object p0, p0, Lch/l;->c:Lbh/e;

    invoke-static {v0, p4}, Lch/v;->b(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lmh/j;

    move-result-object v0

    invoke-static {v0}, Lch/k;->d(Lmh/j;)V

    const v1, 0x413fabbd

    invoke-virtual {p4, v1}, Lp1/q;->f0(I)V

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_0

    new-instance v1, Lcoil/compose/AsyncImagePainter;

    invoke-direct {v1, v0, p0}, Lcoil/compose/AsyncImagePainter;-><init>(Lmh/j;Lbh/e;)V

    invoke-virtual {p4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v1, Lcoil/compose/AsyncImagePainter;

    const/4 v2, 0x0

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    iput-object p1, v1, Lcoil/compose/AsyncImagePainter;->L:Lkotlin/jvm/functions/Function1;

    iput-object p2, v1, Lcoil/compose/AsyncImagePainter;->M:Lkotlin/jvm/functions/Function1;

    iput-object p3, v1, Lcoil/compose/AsyncImagePainter;->N:Ly2/k;

    const/4 p1, 0x1

    iput p1, v1, Lcoil/compose/AsyncImagePainter;->O:I

    sget-object p1, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {p4, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v1, Lcoil/compose/AsyncImagePainter;->P:Z

    iget-object p1, v1, Lcoil/compose/AsyncImagePainter;->S:Lp1/k1;

    invoke-virtual {p1, p0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object p0, v1, Lcoil/compose/AsyncImagePainter;->R:Lp1/k1;

    invoke-virtual {p0, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcoil/compose/AsyncImagePainter;->a()V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object v1

    :catchall_0
    move-exception p0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p0
.end method

.method public static c(Ljava/lang/String;)V
    .locals 4

    const-string v0, "If you wish to display this "

    const-string v1, ", use androidx.compose.foundation.Image."

    invoke-static {v0, p0, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported type: "

    const-string v3, ". "

    invoke-static {v2, p0, v3, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final d(Lmh/j;)V
    .locals 3

    iget-object v0, p0, Lmh/j;->b:Ljava/lang/Object;

    instance-of v1, v0, Lmh/h;

    if-nez v1, :cond_4

    instance-of v1, v0, Li2/g;

    const/4 v2, 0x0

    if-nez v1, :cond_3

    instance-of v1, v0, Lo2/e;

    if-nez v1, :cond_2

    instance-of v0, v0, Ln2/a;

    if-nez v0, :cond_1

    iget-object p0, p0, Lmh/j;->c:Loh/a;

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "request.target must be null."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-string p0, "Painter"

    invoke-static {p0}, Lch/k;->c(Ljava/lang/String;)V

    throw v2

    :cond_2
    const-string p0, "ImageVector"

    invoke-static {p0}, Lch/k;->c(Ljava/lang/String;)V

    throw v2

    :cond_3
    const-string p0, "ImageBitmap"

    invoke-static {p0}, Lch/k;->c(Ljava/lang/String;)V

    throw v2

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
