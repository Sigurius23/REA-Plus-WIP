.class public abstract Lh0/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh0/j1;

.field public static final b:Lh0/j1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lh0/j1;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lh0/j1;-><init>(IILq83/d;)V

    sput-object v0, Lh0/k1;->a:Lh0/j1;

    new-instance v0, Lh0/j1;

    const/4 v1, 0x1

    invoke-direct {v0, v2, v1, v3}, Lh0/j1;-><init>(IILq83/d;)V

    sput-object v0, Lh0/k1;->b:Lh0/j1;

    return-void
.end method

.method public static a(Landroidx/compose/ui/Modifier;Lh0/n1;Lh0/d2;ZLj0/i;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZI)Landroidx/compose/ui/Modifier;
    .locals 9

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    const/4 p3, 0x1

    :cond_0
    move v3, p3

    and-int/lit8 p3, v0, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, v0, 0x10

    const/4 p4, 0x0

    if-eqz p3, :cond_2

    move v5, p4

    goto :goto_0

    :cond_2
    move v5, p5

    :goto_0
    and-int/lit8 p3, v0, 0x20

    if-eqz p3, :cond_3

    sget-object p3, Lh0/k1;->a:Lh0/j1;

    move-object v6, p3

    goto :goto_1

    :cond_3
    move-object v6, p6

    :goto_1
    and-int/lit16 p3, v0, 0x80

    if-eqz p3, :cond_4

    move v8, p4

    goto :goto_2

    :cond_4
    move/from16 v8, p8

    :goto_2
    new-instance v0, Landroidx/compose/foundation/gestures/DraggableElement;

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/DraggableElement;-><init>(Lh0/n1;Lh0/d2;ZLj0/i;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Lp1/q;)Lh0/n1;
    .locals 2

    invoke-static {p0, p1}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lf1/a0;

    const/16 v1, 0xd

    invoke-direct {v0, v1, p0}, Lf1/a0;-><init>(ILp1/c1;)V

    new-instance p0, Lh0/z;

    invoke-direct {p0, v0}, Lh0/z;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, p0

    :cond_0
    check-cast v0, Lh0/n1;

    return-object v0
.end method
