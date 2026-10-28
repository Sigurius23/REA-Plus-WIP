.class public abstract Lu2/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu2/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lu2/k;

    sget-object v1, Lm83/y;->w:Lm83/y;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu2/k;-><init>(Ljava/util/List;Lf1/p1;)V

    sput-object v0, Lu2/c0;->a:Lu2/k;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lu2/h0;
    .locals 2

    new-instance v0, Lu2/h0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, p0}, Lu2/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v0, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    const/4 v3, 0x0

    const/4 v5, 0x6

    const/4 v2, 0x0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/m;)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v0, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    new-instance v4, Lu2/b0;

    invoke-direct {v4, p2}, Lu2/b0;-><init>(Lc93/m;)V

    const/4 v5, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v0, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    const/4 v2, 0x0

    const/4 v5, 0x3

    const/4 v1, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
