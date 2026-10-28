.class public final Lch0/u$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/u;->p(Lzg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
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

    iput-object p1, p0, Lch0/u$f;->w:Ljava/util/List;

    iput-object p2, p0, Lch0/u$f;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 11

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

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
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x93

    const/16 v1, 0x92

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p4, v1, :cond_4

    move p4, v3

    goto :goto_3

    :cond_4
    move p4, v2

    :goto_3
    and-int/2addr v0, v3

    move-object v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v0, p4}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_c

    iget-object p3, p0, Lch0/u$f;->w:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lzg0/a;

    const p3, -0x57ebcf7c

    invoke-virtual {v8, p3}, Lp1/q;->e0(I)V

    sget-object p3, Lb2/t;->w:Lb2/t;

    const/4 p4, 0x7

    invoke-static {p1, p3, p4}, Landroidx/compose/foundation/lazy/a;->a(Landroidx/compose/foundation/lazy/a;Landroidx/compose/ui/Modifier;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p3, Lb2/e;->w:Lb2/m;

    invoke-static {p3, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p3

    iget-wide v0, v8, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result p4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v0

    invoke-static {v8, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v1, La3/l;->a:La3/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_5

    invoke-virtual {v8, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v8, v1, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->f:La3/i;

    invoke-static {v8, p3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->j:La3/i;

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    invoke-static {p4, v8, p4, p3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object p3, La3/k;->d:La3/i;

    invoke-static {v8, p3, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lzg0/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p2}, Lzg0/a;->b()Lkd1/o;

    move-result-object v5

    iget-object p1, p0, Lch0/u$f;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p1, p3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_8

    if-ne p3, p4, :cond_9

    :cond_8
    new-instance p3, Lch0/u$a;

    iget-object p1, p0, Lch0/u$f;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p3, p1, p2}, Lch0/u$a;-><init>(Lkotlin/jvm/functions/Function1;Lzg0/a;)V

    invoke-virtual {v8, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v6, p3

    check-cast v6, Lc93/a;

    iget-object p1, p0, Lch0/u$f;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p1, p3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p1, :cond_a

    if-ne p3, p4, :cond_b

    :cond_a
    new-instance p3, Lch0/u$b;

    iget-object p1, p0, Lch0/u$f;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p3, p1, p2}, Lch0/u$b;-><init>(Lkotlin/jvm/functions/Function1;Lzg0/a;)V

    invoke-virtual {v8, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v7, p3

    check-cast v7, Lc93/a;

    sget p1, Lcom/whoop/design/util/TextResource;->$stable:I

    sget p2, Lkd1/o;->a:I

    shl-int/lit8 p2, p2, 0x3

    or-int v9, p1, p2

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lsl0/i1;->f(Lcom/whoop/design/util/TextResource;Lkd1/o;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_c
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

    invoke-virtual {p0, p1, p2, p3, p4}, Lch0/u$f;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
