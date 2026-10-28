.class public final Le2/b;
.super Landroid/view/View$DragShadowBuilder;
.source "SourceFile"


# instance fields
.field public final a:Ly3/d;

.field public final b:J

.field public final c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ly3/d;JLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/View$DragShadowBuilder;-><init>()V

    iput-object p1, p0, Le2/b;->a:Ly3/d;

    iput-wide p2, p0, Le2/b;->b:J

    iput-object p4, p0, Le2/b;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onDrawShadow(Landroid/graphics/Canvas;)V
    .locals 10

    new-instance v0, Lk2/b;

    invoke-direct {v0}, Lk2/b;-><init>()V

    sget-object v1, Ly3/m;->w:Ly3/m;

    sget-object v2, Li2/d;->a:Landroid/graphics/Canvas;

    new-instance v2, Li2/c;

    invoke-direct {v2}, Li2/c;-><init>()V

    iput-object p1, v2, Li2/c;->a:Landroid/graphics/Canvas;

    iget-object p1, v0, Lk2/b;->w:Lk2/a;

    iget-object v3, p1, Lk2/a;->a:Ly3/c;

    iget-object v4, p1, Lk2/a;->b:Ly3/m;

    iget-object v5, p1, Lk2/a;->c:Li2/v;

    iget-wide v6, p1, Lk2/a;->d:J

    iget-object v8, p0, Le2/b;->a:Ly3/d;

    iput-object v8, p1, Lk2/a;->a:Ly3/c;

    iput-object v1, p1, Lk2/a;->b:Ly3/m;

    iput-object v2, p1, Lk2/a;->c:Li2/v;

    iget-wide v8, p0, Le2/b;->b:J

    iput-wide v8, p1, Lk2/a;->d:J

    invoke-virtual {v2}, Li2/c;->q()V

    iget-object v1, p0, Le2/b;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Li2/c;->g()V

    iput-object v3, p1, Lk2/a;->a:Ly3/c;

    iput-object v4, p1, Lk2/a;->b:Ly3/m;

    iput-object v5, p1, Lk2/a;->c:Li2/v;

    iput-wide v6, p1, Lk2/a;->d:J

    return-void
.end method

.method public final onProvideShadowMetrics(Landroid/graphics/Point;Landroid/graphics/Point;)V
    .locals 6

    const/16 v0, 0x20

    iget-wide v1, p0, Le2/b;->b:J

    shr-long v3, v1, v0

    long-to-int v0, v3

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iget-object v3, p0, Le2/b;->a:Ly3/d;

    invoke-virtual {v3}, Ly3/d;->getDensity()F

    move-result v4

    div-float/2addr v0, v4

    invoke-interface {v3, v0}, Ly3/c;->F(F)I

    move-result v0

    const-wide v4, 0xffffffffL

    and-long/2addr v1, v4

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v3}, Ly3/d;->getDensity()F

    move-result v2

    div-float/2addr v1, v2

    invoke-interface {v3, v1}, Ly3/c;->F(F)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Point;->set(II)V

    iget v0, p1, Landroid/graphics/Point;->x:I

    div-int/lit8 v0, v0, 0x2

    iget p1, p1, Landroid/graphics/Point;->y:I

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p2, v0, p1}, Landroid/graphics/Point;->set(II)V

    return-void
.end method
