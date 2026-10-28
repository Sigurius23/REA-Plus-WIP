.class public final Ljr1/g$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljr1/g;->k(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Ljr1/g$e;->w:Ljava/util/List;

    iput-object p2, p0, Ljr1/g$e;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 3

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

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p4, v0, :cond_4

    move p4, v1

    goto :goto_3

    :cond_4
    move p4, v2

    :goto_3
    and-int/2addr p1, v1

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p1, p4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Ljr1/g$e;->w:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgr1/g;

    const p2, -0x3c62fbbe

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    instance-of p2, p1, Lgr1/h;

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-eqz p2, :cond_7

    const p2, -0x3c623b73

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    move-object p2, p1

    check-cast p2, Lgr1/h;

    iget-object v0, p0, Ljr1/g$e;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_5

    if-ne v1, p4, :cond_6

    :cond_5
    new-instance v1, Ljr1/g$a;

    iget-object p4, p0, Ljr1/g$e;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, p4, p1}, Ljr1/g$a;-><init>(Lkotlin/jvm/functions/Function1;Lgr1/g;)V

    invoke-virtual {p3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v1, p3, v2}, Ljr1/g;->p(Lgr1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    instance-of p2, p1, Lgr1/i;

    if-eqz p2, :cond_a

    const p2, -0x3c5e7eb0

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    move-object p2, p1

    check-cast p2, Lgr1/i;

    iget-object v0, p0, Ljr1/g$e;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_8

    if-ne v1, p4, :cond_9

    :cond_8
    new-instance v1, Ljr1/g$b;

    iget-object p4, p0, Ljr1/g$e;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, p4, p1}, Ljr1/g$b;-><init>(Lkotlin/jvm/functions/Function1;Lgr1/g;)V

    invoke-virtual {p3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v1, p3, v2}, Ljr1/a;->d(Lgr1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_a
    instance-of p2, p1, Lgr1/j;

    if-eqz p2, :cond_d

    const p2, -0x3c5ac133

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    move-object p2, p1

    check-cast p2, Lgr1/j;

    iget-object v0, p0, Ljr1/g$e;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_b

    if-ne v1, p4, :cond_c

    :cond_b
    new-instance v1, Ljr1/g$c;

    iget-object p4, p0, Ljr1/g$e;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, p4, p1}, Ljr1/g$c;-><init>(Lkotlin/jvm/functions/Function1;Lgr1/g;)V

    invoke-virtual {p3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v1, p3, v2}, Ljr1/g;->s(Lgr1/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_d
    const p1, 0x50a1f7e1

    invoke-static {p1, p3, v2}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p1

    throw p1

    :cond_e
    invoke-virtual {p3}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Ljr1/g$e;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
