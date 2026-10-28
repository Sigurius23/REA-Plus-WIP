.class public final Lnx1/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnx1/c;->g(Ljx1/l$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic y:Lkotlin/jvm/functions/Function1;

.field final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lnx1/c$e;->w:Ljava/util/List;

    iput-object p2, p0, Lnx1/c$e;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lnx1/c$e;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lnx1/c$e;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 11

    and-int/lit8 v0, p4, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

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

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p4, v0, :cond_4

    move p4, v3

    goto :goto_3

    :cond_4
    move p4, v2

    :goto_3
    and-int/2addr p1, v3

    move-object v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p1, p4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lnx1/c$e;->w:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljx1/f0;

    const p2, -0x54651fa7

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    const/4 p2, 0x3

    int-to-float p3, p2

    int-to-float p4, v1

    mul-float/2addr p3, p4

    invoke-static {p3}, Ll0/m;->i(F)Ll0/k;

    move-result-object p3

    sget-object p4, Lb2/e;->M:Lb2/k;

    const/4 v0, 0x6

    invoke-static {p3, p4, v8, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p3

    iget-wide v0, v8, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result p4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-eqz v5, :cond_5

    invoke-virtual {v8, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v8, v4, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->f:La3/i;

    invoke-static {v8, p3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->j:La3/i;

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    invoke-static {p4, v8, p4, p3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object p3, La3/k;->d:La3/i;

    invoke-static {v8, p3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p3, 0x2281b0cd

    invoke-virtual {v8, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Ljx1/f0;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p1, p4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v4, p4

    check-cast v4, Lm91/u;

    invoke-static {}, Ljx1/b0;->b()Lm91/p;

    move-result-object v5

    sget-object v6, Lnx1/c$a;->w:Lnx1/c$a;

    iget-object p4, p0, Lnx1/c$e;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    iget-object v0, p0, Lnx1/c$e;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    iget-object v0, p0, Lnx1/c$e;->z:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p4, :cond_8

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne v0, p4, :cond_9

    :cond_8
    new-instance v0, Lnx1/c$b;

    iget-object p4, p0, Lnx1/c$e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnx1/c$e;->y:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lnx1/c$e;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, p4, v1, v7}, Lnx1/c$b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget p4, Lm91/p;->b:I

    shl-int/lit8 v9, p4, 0x3

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p4, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    invoke-static {v8, v2, v3, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    return-void

    :cond_b
    invoke-virtual {v8}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lnx1/c$e;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
