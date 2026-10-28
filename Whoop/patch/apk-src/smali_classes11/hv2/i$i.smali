.class public final Lhv2/i$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhv2/i;->d0(Lgv2/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lp1/c1;

.field final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lp1/c1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lhv2/i$i;->w:Ljava/util/List;

    iput-object p2, p0, Lhv2/i$i;->x:Lp1/c1;

    iput-object p3, p0, Lhv2/i$i;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 10

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int/2addr p1, p4

    goto :goto_1

    :cond_1
    move p1, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p2}, Lp1/q;->e(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x93

    const/16 v0, 0x92

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p4, v0, :cond_4

    move p4, v2

    goto :goto_3

    :cond_4
    move p4, v1

    :goto_3
    and-int/2addr p1, v2

    move-object v7, p3

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p1, p4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lhv2/i$i;->w:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm91/u;

    const p2, 0x1f6fedac

    invoke-virtual {v7, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p2, p3, :cond_5

    new-instance p2, Lhv2/i$f;

    iget-object p3, p0, Lhv2/i$i;->x:Lp1/c1;

    invoke-direct {p2, p3}, Lhv2/i$f;-><init>(Lp1/c1;)V

    invoke-virtual {v7, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v2, p2

    check-cast v2, Lc93/a;

    int-to-float p2, v1

    new-instance v5, Ll0/l1;

    invoke-direct {v5, p2, p2, p2, p2}, Ll0/l1;-><init>(FFFF)V

    new-instance p2, Lhv2/i$g;

    iget-object p3, p0, Lhv2/i$i;->y:Lkotlin/jvm/functions/Function1;

    iget-object p4, p0, Lhv2/i$i;->x:Lp1/c1;

    invoke-direct {p2, p1, p3, p4}, Lhv2/i$g;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    const p1, -0x153bbcfa

    invoke-static {p1, v7, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v8, 0x30c06

    const/16 v9, 0x16

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f0;->b(Lc93/a;Landroidx/compose/ui/Modifier;ZLl0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_6
    invoke-virtual {v7}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lhv2/i$i;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
