.class public final Lh3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp1/k1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lh3/j;->a:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/AndroidComposeView;Li3/r;Lq83/j;Ljava/util/function/Consumer;)V
    .locals 10

    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v1, v1, [Lh3/k;

    invoke-direct {v0, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    invoke-virtual {p2}, Li3/r;->a()Li3/p;

    move-result-object p2

    new-instance v1, Lh3/i;

    invoke-direct {v1, v0}, Lh3/i;-><init>(Lr1/c;)V

    invoke-static {p2, v1}, Lug/m;->U(Li3/p;Lh3/i;)V

    const/4 p2, 0x2

    new-array p2, p2, [Lkotlin/jvm/functions/Function1;

    sget-object v1, Lh3/b;->y:Lh3/b;

    const/4 v2, 0x0

    aput-object v1, p2, v2

    sget-object v1, Lh3/b;->z:Lh3/b;

    const/4 v3, 0x1

    aput-object v1, p2, v3

    invoke-static {p2}, Lq83/g;->p([Lkotlin/jvm/functions/Function1;)Lea2/l;

    move-result-object p2

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v4, v0, Lr1/c;->y:I

    invoke-static {v1, p2, v2, v4}, Lm83/n;->P0([Ljava/lang/Object;Ljava/util/Comparator;II)V

    iget p2, v0, Lr1/c;->y:I

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    sub-int/2addr p2, v3

    iget-object v0, v0, Lr1/c;->w:[Ljava/lang/Object;

    aget-object p2, v0, p2

    :goto_0
    check-cast p2, Lh3/k;

    if-nez p2, :cond_1

    return-void

    :cond_1
    invoke-static {p3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v7

    new-instance v4, Lh3/c;

    invoke-virtual {p2}, Lh3/k;->b()Li3/p;

    move-result-object v5

    invoke-virtual {p2}, Lh3/k;->c()Ly3/k;

    move-result-object v6

    move-object v8, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v9}, Lh3/c;-><init>(Li3/p;Ly3/k;Lhc3/d;Lh3/j;Landroidx/compose/ui/platform/AndroidComposeView;)V

    invoke-virtual {p2}, Lh3/k;->a()Ly2/y;

    move-result-object p1

    invoke-static {p1}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object p3

    invoke-interface {p3, p1, v3}, Ly2/y;->r(Ly2/y;Z)Lh2/c;

    move-result-object p1

    invoke-virtual {p2}, Lh3/k;->c()Ly3/k;

    move-result-object p3

    invoke-virtual {p3}, Ly3/k;->b()J

    move-result-wide v0

    invoke-static {p1}, Lvo/c;->c(Lh2/c;)Ly3/k;

    move-result-object p1

    invoke-static {p1}, Li2/w0;->E(Ly3/k;)Landroid/graphics/Rect;

    move-result-object p1

    new-instance p3, Landroid/graphics/Point;

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    const-wide v5, 0xffffffffL

    and-long/2addr v0, v5

    long-to-int v0, v0

    invoke-direct {p3, v2, v0}, Landroid/graphics/Point;-><init>(II)V

    invoke-static {v9, p1, p3, v4}, Lh3/h;->c(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/graphics/Rect;Landroid/graphics/Point;Lh3/c;)Landroid/view/ScrollCaptureTarget;

    move-result-object p1

    invoke-virtual {p2}, Lh3/k;->c()Ly3/k;

    move-result-object p2

    invoke-static {p2}, Li2/w0;->E(Ly3/k;)Landroid/graphics/Rect;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/ScrollCaptureTarget;->setScrollBounds(Landroid/graphics/Rect;)V

    invoke-interface {p4, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method
