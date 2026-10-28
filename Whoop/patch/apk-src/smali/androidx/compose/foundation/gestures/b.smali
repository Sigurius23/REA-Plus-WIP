.class public abstract Landroidx/compose/foundation/gestures/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgm1/b;

.field public static final b:Lh0/n2;

.field public static final c:Lh0/m2;

.field public static final d:Lh0/o2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgm1/b;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lgm1/b;-><init>(I)V

    sput-object v0, Landroidx/compose/foundation/gestures/b;->a:Lgm1/b;

    new-instance v0, Lh0/n2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/b;->b:Lh0/n2;

    new-instance v0, Lh0/m2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/b;->c:Lh0/m2;

    new-instance v0, Lh0/o2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/b;->d:Lh0/o2;

    return-void
.end method

.method public static final a(Lh0/c3;JLs83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p3, Lh0/p2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh0/p2;

    iget v1, v0, Lh0/p2;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/p2;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/p2;

    invoke-direct {v0, p3}, Lh0/p2;-><init>(Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lh0/p2;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/p2;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lh0/p2;->x:Lkotlin/jvm/internal/d0;

    iget-object p1, v0, Lh0/p2;->w:Lh0/c3;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, p0

    move-object p0, p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v8, Lkotlin/jvm/internal/d0;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    sget-object p3, Lf0/z0;->w:Lf0/z0;

    new-instance v4, Lf0/c;

    const/4 v9, 0x0

    const/4 v10, 0x3

    move-object v5, p0

    move-wide v6, p1

    invoke-direct/range {v4 .. v10}, Lf0/c;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lq83/d;I)V

    iput-object v5, v0, Lh0/p2;->w:Lh0/c3;

    iput-object v8, v0, Lh0/p2;->x:Lkotlin/jvm/internal/d0;

    iput v3, v0, Lh0/p2;->z:I

    invoke-virtual {v5, p3, v4, v0}, Lh0/c3;->f(Lf0/z0;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, v5

    :goto_1
    iget p1, v8, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {p0, p1}, Lh0/c3;->h(F)J

    move-result-wide p0

    new-instance p2, Lh2/b;

    invoke-direct {p2, p0, p1}, Lh2/b;-><init>(J)V

    return-object p2
.end method

.method public static b(Landroidx/compose/ui/Modifier;Lh0/x2;Lh0/d2;ZZLj0/i;I)Landroidx/compose/ui/Modifier;
    .locals 6

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_0

    const/4 p3, 0x1

    :cond_0
    move v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x20

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move-object v5, p5

    new-instance v0, Landroidx/compose/foundation/gestures/ScrollableElement;

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/ScrollableElement;-><init>(Lh0/x2;Lh0/d2;ZZLj0/i;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
