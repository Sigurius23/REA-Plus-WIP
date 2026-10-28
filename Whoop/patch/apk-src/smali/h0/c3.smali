.class public final Lh0/c3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lh0/x2;

.field public b:Lf0/k;

.field public c:Lh0/o1;

.field public d:Lh0/d2;

.field public e:Z

.field public f:Lt2/d;

.field public final g:Lh0/w2;

.field public final h:La6/l0;

.field public i:Z

.field public j:I

.field public k:Lh0/k2;

.field public final l:Lh0/a3;

.field public final m:La6/i;


# direct methods
.method public constructor <init>(Lh0/x2;Lf0/k;Lh0/o1;Lh0/d2;ZLt2/d;Lh0/w2;La6/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/c3;->a:Lh0/x2;

    iput-object p2, p0, Lh0/c3;->b:Lf0/k;

    iput-object p3, p0, Lh0/c3;->c:Lh0/o1;

    iput-object p4, p0, Lh0/c3;->d:Lh0/d2;

    iput-boolean p5, p0, Lh0/c3;->e:Z

    iput-object p6, p0, Lh0/c3;->f:Lt2/d;

    iput-object p7, p0, Lh0/c3;->g:Lh0/w2;

    iput-object p8, p0, Lh0/c3;->h:La6/l0;

    const/4 p1, 0x1

    iput p1, p0, Lh0/c3;->j:I

    sget-object p1, Landroidx/compose/foundation/gestures/b;->b:Lh0/n2;

    iput-object p1, p0, Lh0/c3;->k:Lh0/k2;

    new-instance p1, Lh0/a3;

    invoke-direct {p1, p0}, Lh0/a3;-><init>(Lh0/c3;)V

    iput-object p1, p0, Lh0/c3;->l:Lh0/a3;

    new-instance p1, La6/i;

    const/16 p2, 0x11

    invoke-direct {p1, p0, p2}, La6/i;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lh0/c3;->m:La6/i;

    return-void
.end method


# virtual methods
.method public final a(JLs83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p3, Lh0/y2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh0/y2;

    iget v1, v0, Lh0/y2;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/y2;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/y2;

    invoke-direct {v0, p0, p3}, Lh0/y2;-><init>(Lh0/c3;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lh0/y2;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/y2;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lh0/y2;->w:Lkotlin/jvm/internal/f0;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, p0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v6, p0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v7, Lkotlin/jvm/internal/f0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iput-wide p1, v7, Lkotlin/jvm/internal/f0;->w:J

    iput-boolean v4, p0, Lh0/c3;->i:Z

    :try_start_1
    sget-object p3, Lf0/z0;->w:Lf0/z0;

    new-instance v5, Lh0/z2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v10, 0x0

    move-object v6, p0

    move-wide v8, p1

    :try_start_2
    invoke-direct/range {v5 .. v10}, Lh0/z2;-><init>(Lh0/c3;Lkotlin/jvm/internal/f0;JLq83/d;)V

    iput-object v7, v0, Lh0/y2;->w:Lkotlin/jvm/internal/f0;

    iput v4, v0, Lh0/y2;->z:I

    invoke-virtual {p0, p3, v5, v0}, Lh0/c3;->f(Lf0/z0;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v7

    :goto_1
    iput-boolean v3, v6, Lh0/c3;->i:Z

    iget-wide p1, p1, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {p1, p2}, Ly3/q;->a(J)Ly3/q;

    move-result-object p1

    return-object p1

    :catchall_1
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v6, p0

    goto :goto_2

    :goto_3
    iput-boolean v3, v6, Lh0/c3;->i:Z

    throw p1
.end method

.method public final b(JZLs83/i;)Ljava/lang/Object;
    .locals 2

    if-eqz p3, :cond_0

    iget-object p3, p0, Lh0/c3;->c:Lh0/o1;

    sget-object v0, Landroidx/compose/foundation/gestures/b;->a:Lgm1/b;

    instance-of p3, p3, Lh0/b0;

    if-eqz p3, :cond_0

    goto :goto_2

    :cond_0
    iget-object p3, p0, Lh0/c3;->d:Lh0/d2;

    sget-object v0, Lh0/d2;->x:Lh0/d2;

    const/4 v1, 0x0

    if-ne p3, v0, :cond_1

    const/4 p3, 0x1

    :goto_0
    invoke-static {v1, v1, p1, p2, p3}, Ly3/q;->b(FFJI)J

    move-result-wide p1

    goto :goto_1

    :cond_1
    const/4 p3, 0x2

    goto :goto_0

    :goto_1
    new-instance p3, Lh0/b3;

    const/4 v0, 0x0

    invoke-direct {p3, p0, v0}, Lh0/b3;-><init>(Lh0/c3;Lq83/d;)V

    iget-object v0, p0, Lh0/c3;->b:Lf0/k;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lh0/c3;->a:Lh0/x2;

    invoke-interface {v1}, Lh0/x2;->d()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lh0/c3;->a:Lh0/x2;

    invoke-interface {v1}, Lh0/x2;->c()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    invoke-virtual {v0, p1, p2, p3, p4}, Lf0/k;->b(JLc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_4

    return-object p1

    :cond_3
    invoke-static {p1, p2}, Ly3/q;->a(J)Ly3/q;

    move-result-object p1

    invoke-virtual {p3, p1, p4}, Lh0/b3;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_4

    return-object p1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final c(Lh0/k2;JI)J
    .locals 14

    move-wide/from16 v0, p2

    iget-object v2, p0, Lh0/c3;->f:Lt2/d;

    iget-object v2, v2, Lt2/d;->a:Lt2/g;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-boolean v4, v2, Lb2/v;->N:Z

    if-eqz v4, :cond_0

    invoke-static {v2}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object v2

    check-cast v2, Lt2/g;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    const-wide/16 v4, 0x0

    move/from16 v11, p4

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0, v1, v11}, Lt2/g;->l0(JI)J

    move-result-wide v6

    move-wide v12, v6

    goto :goto_1

    :cond_1
    move-wide v12, v4

    :goto_1
    invoke-static {v0, v1, v12, v13}, Lh2/b;->g(JJ)J

    move-result-wide v0

    iget-object v2, p0, Lh0/c3;->d:Lh0/d2;

    sget-object v6, Lh0/d2;->x:Lh0/d2;

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-ne v2, v6, :cond_2

    invoke-static {v8, v8, v0, v1, v7}, Lh2/b;->a(FFJI)J

    move-result-wide v8

    goto :goto_2

    :cond_2
    const/4 v2, 0x2

    invoke-static {v8, v8, v0, v1, v2}, Lh2/b;->a(FFJI)J

    move-result-wide v8

    :goto_2
    invoke-virtual {p0, v8, v9}, Lh0/c3;->e(J)J

    move-result-wide v8

    invoke-virtual {p0, v8, v9}, Lh0/c3;->g(J)F

    move-result v2

    invoke-interface {p1, v2}, Lh0/k2;->a(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lh0/c3;->h(F)J

    move-result-wide v8

    invoke-virtual {p0, v8, v9}, Lh0/c3;->e(J)J

    move-result-wide v8

    iget-object p1, p0, Lh0/c3;->g:Lh0/w2;

    iget-boolean v2, p1, Lb2/v;->N:Z

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {p1}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    :try_start_0
    sget-object v2, Landroidx/compose/ui/platform/AndroidComposeView;->m1:Ljava/lang/reflect/Method;

    if-nez v2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v6, "dispatchOnScrollChanged"

    invoke-virtual {v2, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v2, Landroidx/compose/ui/platform/AndroidComposeView;->m1:Ljava/lang/reflect/Method;

    :cond_4
    sget-object v2, Landroidx/compose/ui/platform/AndroidComposeView;->m1:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_5

    invoke-virtual {v2, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_5
    :goto_3
    invoke-static {v0, v1, v8, v9}, Lh2/b;->g(JJ)J

    move-result-wide v0

    iget-object p1, p0, Lh0/c3;->f:Lt2/d;

    iget-object p1, p1, Lt2/d;->a:Lt2/g;

    if-eqz p1, :cond_6

    iget-boolean v2, p1, Lb2/v;->N:Z

    if-eqz v2, :cond_6

    invoke-static {p1}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lt2/g;

    :cond_6
    move-object v6, v3

    move-wide v7, v8

    if-eqz v6, :cond_7

    move-wide v9, v0

    invoke-virtual/range {v6 .. v11}, Lt2/g;->J(JJI)J

    move-result-wide v4

    :cond_7
    invoke-static {v12, v13, v7, v8}, Lh2/b;->h(JJ)J

    move-result-wide v0

    invoke-static {v0, v1, v4, v5}, Lh2/b;->h(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(F)F
    .locals 1

    iget-boolean v0, p0, Lh0/c3;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    int-to-float v0, v0

    mul-float/2addr p1, v0

    :cond_0
    return p1
.end method

.method public final e(J)J
    .locals 1

    iget-boolean v0, p0, Lh0/c3;->e:Z

    if-eqz v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {v0, p1, p2}, Lh2/b;->i(FJ)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public final f(Lf0/z0;Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lh0/c3;->a:Lh0/x2;

    new-instance v1, Lg20/p;

    const/4 v2, 0x0

    const/16 v3, 0xa

    invoke-direct {v1, p0, p2, v2, v3}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-interface {v0, p1, v1, p3}, Lh0/x2;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final g(J)F
    .locals 2

    iget-object v0, p0, Lh0/c3;->d:Lh0/d2;

    sget-object v1, Lh0/d2;->x:Lh0/d2;

    if-ne v0, v1, :cond_0

    const/16 v0, 0x20

    shr-long/2addr p1, v0

    :goto_0
    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1

    :cond_0
    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    goto :goto_0
.end method

.method public final h(F)J
    .locals 8

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-nez v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-object v1, p0, Lh0/c3;->d:Lh0/d2;

    sget-object v2, Lh0/d2;->x:Lh0/d2;

    const-wide v3, 0xffffffffL

    const/16 v5, 0x20

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v1, p1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v6, p1

    shl-long v0, v1, v5

    :goto_0
    and-long v2, v6, v3

    or-long/2addr v0, v2

    return-wide v0

    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v6, p1

    shl-long/2addr v0, v5

    goto :goto_0
.end method
