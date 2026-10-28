.class public final Ll2/l;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final K:Lc4/c0;


# instance fields
.field public E:Landroid/graphics/Outline;

.field public F:Z

.field public G:Ly3/c;

.field public H:Ly3/m;

.field public I:Lkotlin/jvm/functions/Function1;

.field public J:Ll2/c;

.field public final w:Lm2/a;

.field public final x:Li2/w;

.field public final y:Lk2/b;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc4/c0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lc4/c0;-><init>(I)V

    sput-object v0, Ll2/l;->K:Lc4/c0;

    return-void
.end method

.method public constructor <init>(Lm2/a;Li2/w;Lk2/b;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Ll2/l;->w:Lm2/a;

    iput-object p2, p0, Ll2/l;->x:Li2/w;

    iput-object p3, p0, Ll2/l;->y:Lk2/b;

    sget-object p1, Ll2/l;->K:Lc4/c0;

    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll2/l;->F:Z

    sget-object p1, Lk2/d;->a:Ly3/d;

    iput-object p1, p0, Ll2/l;->G:Ly3/c;

    sget-object p1, Ly3/m;->w:Ly3/m;

    iput-object p1, p0, Ll2/l;->H:Ly3/m;

    sget-object p1, Ll2/e;->a:Ll2/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ll2/b;->y:Ll2/b;

    iput-object p1, p0, Ll2/l;->I:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v1, p0

    iget-object v0, v1, Ll2/l;->x:Li2/w;

    iget-object v2, v0, Li2/w;->a:Li2/c;

    iget-object v3, v2, Li2/c;->a:Landroid/graphics/Canvas;

    move-object/from16 v4, p1

    iput-object v4, v2, Li2/c;->a:Landroid/graphics/Canvas;

    iget-object v4, v1, Ll2/l;->G:Ly3/c;

    iget-object v5, v1, Ll2/l;->H:Ly3/m;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v7

    int-to-float v7, v7

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v8, v6

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    const/16 v10, 0x20

    shl-long/2addr v8, v10

    const-wide v10, 0xffffffffL

    and-long/2addr v6, v10

    or-long/2addr v6, v8

    iget-object v8, v1, Ll2/l;->J:Ll2/c;

    iget-object v9, v1, Ll2/l;->I:Lkotlin/jvm/functions/Function1;

    iget-object v10, v1, Ll2/l;->y:Lk2/b;

    iget-object v11, v10, Lk2/b;->x:La3/p;

    iget-object v12, v11, La3/p;->z:Ljava/lang/Object;

    check-cast v12, Lk2/b;

    iget-object v12, v12, Lk2/b;->w:Lk2/a;

    iget-object v13, v12, Lk2/a;->a:Ly3/c;

    iget-object v12, v12, Lk2/a;->b:Ly3/m;

    invoke-virtual {v11}, La3/p;->w()Li2/v;

    move-result-object v11

    iget-object v14, v10, Lk2/b;->x:La3/p;

    move-object v15, v11

    move-object/from16 p1, v12

    invoke-virtual {v14}, La3/p;->A()J

    move-result-wide v11

    move-object/from16 v16, v15

    iget-object v15, v14, La3/p;->y:Ljava/lang/Object;

    check-cast v15, Ll2/c;

    invoke-virtual {v14, v4}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v14, v5}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v14, v2}, La3/p;->P(Li2/v;)V

    invoke-virtual {v14, v6, v7}, La3/p;->U(J)V

    iput-object v8, v14, La3/p;->y:Ljava/lang/Object;

    invoke-virtual {v2}, Li2/c;->q()V

    :try_start_0
    invoke-interface {v9, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Li2/c;->g()V

    invoke-virtual {v14, v13}, La3/p;->Q(Ly3/c;)V

    move-object/from16 v4, p1

    invoke-virtual {v14, v4}, La3/p;->T(Ly3/m;)V

    move-object/from16 v5, v16

    invoke-virtual {v14, v5}, La3/p;->P(Li2/v;)V

    invoke-virtual {v14, v11, v12}, La3/p;->U(J)V

    iput-object v15, v14, La3/p;->y:Ljava/lang/Object;

    iget-object v0, v0, Li2/w;->a:Li2/c;

    iput-object v3, v0, Li2/c;->a:Landroid/graphics/Canvas;

    const/4 v0, 0x0

    iput-boolean v0, v1, Ll2/l;->z:Z

    return-void

    :catchall_0
    move-exception v0

    move-object/from16 v4, p1

    move-object/from16 v5, v16

    invoke-virtual {v2}, Li2/c;->g()V

    invoke-virtual {v14, v13}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v14, v4}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v14, v5}, La3/p;->P(Li2/v;)V

    invoke-virtual {v14, v11, v12}, La3/p;->U(J)V

    iput-object v15, v14, La3/p;->y:Ljava/lang/Object;

    throw v0
.end method

.method public final forceLayout()V
    .locals 0

    return-void
.end method

.method public final getCanUseCompositingLayer$ui_graphics_release()Z
    .locals 1

    iget-boolean v0, p0, Ll2/l;->F:Z

    return v0
.end method

.method public final getCanvasHolder()Li2/w;
    .locals 1

    iget-object v0, p0, Ll2/l;->x:Li2/w;

    return-object v0
.end method

.method public final getOwnerView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Ll2/l;->w:Lm2/a;

    return-object v0
.end method

.method public final hasOverlappingRendering()Z
    .locals 1

    iget-boolean v0, p0, Ll2/l;->F:Z

    return v0
.end method

.method public final invalidate()V
    .locals 1

    iget-boolean v0, p0, Ll2/l;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll2/l;->z:Z

    invoke-super {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public final setCanUseCompositingLayer$ui_graphics_release(Z)V
    .locals 1

    iget-boolean v0, p0, Ll2/l;->F:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Ll2/l;->F:Z

    invoke-virtual {p0}, Ll2/l;->invalidate()V

    :cond_0
    return-void
.end method

.method public final setInvalidated(Z)V
    .locals 0

    iput-boolean p1, p0, Ll2/l;->z:Z

    return-void
.end method
