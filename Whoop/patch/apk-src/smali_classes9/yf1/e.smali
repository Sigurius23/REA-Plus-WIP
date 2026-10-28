.class public final synthetic Lyf1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iput p4, p0, Lyf1/e;->w:I

    iput-object p1, p0, Lyf1/e;->z:Ljava/lang/Object;

    iput-object p2, p0, Lyf1/e;->x:Ljava/lang/Object;

    iput p3, p0, Lyf1/e;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lyf1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Ll0/y;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lay2/a$b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzx2/a;->j(Ll0/y;Lay2/a$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lay2/a$b;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzx2/a;->e(Lay2/a$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lzt2/n;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzt2/m;->a(Lzt2/n;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lzt2/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzt2/g;->a(Landroidx/compose/ui/Modifier;Lzt2/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lzq0/y$a;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzq0/x;->c(Lzq0/y$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lxo2/c$c;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzo2/f;->d(Lxo2/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lxo2/c;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzo2/d;->a(Lxo2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lxo2/c$b;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzo2/c;->d(Lxo2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lgz0/m0;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/design/util/TextResource;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzm1/e;->b(Lgz0/m0;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lyi1/i;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzi1/q;->d(Lyi1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lj71/c;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzi1/q;->g(Lj71/c;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lyi1/l;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzi1/o;->b(Lyi1/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lxi1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzi1/i;->a(Lcom/whoop/design/util/TextResource;Lxi1/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzc1/y7;->b(Ljava/lang/String;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Li2/x;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzc1/u7;->b(Li2/x;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lj71/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lzc1/v2;->c(Ljava/lang/String;Lj71/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lx72/a;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lz72/i;->d(Lx72/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lj71/b$j;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lz61/b;->a(Landroidx/compose/ui/Modifier;Lj71/b$j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Luw1/d$c;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyw1/m;->e(Luw1/d$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Luw1/d$b;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyw1/k;->d(Luw1/d$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Luw1/c$c;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyw1/i;->j(Luw1/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Luw1/c$b;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyw1/d;->d(Luw1/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lxu2/b;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyu2/e;->l(Lxu2/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lkd1/o;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyq2/a;->b(Lkd1/o;Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lyo0/g;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyo0/e;->h(Lyo0/g;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Ltk2/i;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyk2/l;->l(Ltk2/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Ltk2/m$a;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyk2/l;->C(Ltk2/m$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lti0/d;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyi0/d;->h(Lti0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lwf1/c$d;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyf1/g;->g(Lwf1/c$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lyf1/e;->z:Ljava/lang/Object;

    check-cast v0, Lwf1/c;

    iget-object v1, p0, Lyf1/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lyf1/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyf1/f;->b(Lwf1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
