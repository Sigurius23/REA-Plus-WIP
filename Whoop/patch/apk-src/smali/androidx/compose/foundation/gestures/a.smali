.class public abstract Landroidx/compose/foundation/gestures/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgm1/b;

.field public static final b:Ld0/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgm1/b;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lgm1/b;-><init>(I)V

    sput-object v0, Landroidx/compose/foundation/gestures/a;->a:Lgm1/b;

    new-instance v0, Lio/sentry/hints/j;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    new-instance v1, Ld0/x;

    invoke-direct {v1, v0}, Ld0/x;-><init>(Ld0/e0;)V

    sput-object v1, Landroidx/compose/foundation/gestures/a;->b:Ld0/x;

    return-void
.end method

.method public static final a(Lc93/a;Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lh0/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh0/e;

    iget v1, v0, Lh0/e;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/e;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/e;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh0/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/e;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/foundation/gestures/AnchoredDragFinishedSignal; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p2, La6/v;

    const/4 v2, 0x0

    const/16 v4, 0x9

    invoke-direct {p2, p0, p1, v2, v4}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Lh0/e;->x:I

    invoke-static {p2, v0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Landroidx/compose/foundation/gestures/AnchoredDragFinishedSignal; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_3

    return-object v1

    :catch_0
    :cond_3
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static b(Lh0/p;ZLj0/i;Lh0/p3;I)Landroidx/compose/ui/Modifier;
    .locals 2

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    and-int/lit8 v0, p4, 0x4

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 v0, p4, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p4, p4, 0x20

    if-eqz p4, :cond_2

    move-object p3, v1

    :cond_2
    new-instance p4, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;

    invoke-direct {p4, p0, p1, p2, p3}, Landroidx/compose/foundation/gestures/AnchoredDraggableElement;-><init>(Lh0/p;ZLj0/i;Lh0/o1;)V

    return-object p4
.end method

.method public static final c(Lh0/p;Ljava/lang/Enum;Ld0/e2;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lh0/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lh0/d;-><init>(Lh0/p;Ld0/l;Lq83/d;)V

    sget-object p2, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {p0, p1, p2, v0, p3}, Lh0/p;->a(Ljava/lang/Object;Lf0/z0;Lc93/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
