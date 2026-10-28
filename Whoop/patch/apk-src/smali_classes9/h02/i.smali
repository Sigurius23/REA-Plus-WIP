.class public final synthetic Lh02/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput p2, p0, Lh02/i;->w:I

    iput-object p3, p0, Lh02/i;->z:Ljava/lang/Object;

    iput-object p5, p0, Lh02/i;->x:Ljava/lang/Object;

    iput-object p4, p0, Lh02/i;->E:Ljava/lang/Object;

    iput p1, p0, Lh02/i;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Ll1/y;I)V
    .locals 0

    .line 2
    const/16 p5, 0x1d

    iput p5, p0, Lh02/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh02/i;->z:Ljava/lang/Object;

    iput p2, p0, Lh02/i;->y:I

    iput-object p3, p0, Lh02/i;->x:Ljava/lang/Object;

    iput-object p4, p0, Lh02/i;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 3
    iput p5, p0, Lh02/i;->w:I

    iput-object p1, p0, Lh02/i;->z:Ljava/lang/Object;

    iput-object p2, p0, Lh02/i;->E:Ljava/lang/Object;

    iput-object p3, p0, Lh02/i;->x:Ljava/lang/Object;

    iput p4, p0, Lh02/i;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lh02/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ll1/y;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x7

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget v2, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Ll1/f1;->f(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll01/d;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li91/a;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ll01/t;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Ll01/m;->b(Ll01/d;Li91/a;Ll01/t;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lky2/f;->b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lky2/g;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lky2/e;->g(Lky2/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lky2/g$a$b;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lky2/c;->c(Lky2/g$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lky2/g$a$a;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lky2/b;->b(Lky2/g$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkd1/o;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lkh0/e;->b(Lkd1/o;Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkd0/c$b;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lkf0/f;->j(Lkd0/c$b;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkd0/c$d;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lkf0/b;->f(Ll0/u;Lkd0/c$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lje2/c;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lke2/c;->m(Lje2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhs2/e$a;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Ljs2/c;->a(Ll0/u;Lhs2/e$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/m;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/m;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/m;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lj11/n;->f(Lc93/m;Lc93/m;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Laf3/t;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ll3/d;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Liz0/m;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Liz0/g;->k(Laf3/t;Ll3/d;Liz0/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Liw0/f;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Liw0/x;->b0(Liw0/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lis0/f;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lis0/x0;->b(Lis0/f;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lim1/d0;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lfm1/d;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lim1/c;->e(Ljava/util/List;Lim1/d0;Lfm1/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lgh1/d$b;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lih1/e;->a(Ll0/u;Lgh1/d$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgg0/c$d;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lgg0/c$c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lig0/g;->d(Lgg0/c$d;Lkotlin/jvm/functions/Function1;Lgg0/c$c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lgg0/c$b;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lig0/e;->c(Ll0/u;Lgg0/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lib2/e$a;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lib2/b;->m(Lib2/e$a;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly81/f;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ly11/r;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Li21/c;->d(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhy0/h0;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lb2/h;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lhy0/f0;->c(Landroidx/compose/ui/Modifier;Lhy0/h0;Lb2/h;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln2/a;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly2/k;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lb2/h;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lhy0/n;->d(Ln2/a;Ly2/k;Lb2/h;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhy0/r;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkd1/o;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lhy0/n;->c(Landroidx/compose/ui/Modifier;Lhy0/r;Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhy0/r;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkd1/u;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lhy0/n;->f(Landroidx/compose/ui/Modifier;Lhy0/r;Lkd1/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/stealthmode/view/StealthModeFragment;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Leb/u0;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lhh2/g;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lcom/whoop/stealthmode/view/StealthModeFragment;->A(Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/u0;Lhh2/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly31/e;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lhb2/d;->d(Ljava/lang/String;Ly31/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lh90/c;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/domain/model/UnitSystem;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lh90/b;->b(Lh90/c;Lcom/whoop/domain/model/UnitSystem;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lf60/c$a;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lh60/e;->b(Ll0/u;Lf60/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lh02/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lh02/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;

    iget-object v0, p0, Lh02/i;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lh02/i;->y:I

    invoke-static/range {v1 .. v6}, Lh02/j;->d(Ljava/util/List;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

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
