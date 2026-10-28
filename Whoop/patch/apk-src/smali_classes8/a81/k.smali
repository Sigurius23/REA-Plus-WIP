.class public final synthetic La81/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    .line 1
    iput p6, p0, La81/k;->w:I

    iput-object p1, p0, La81/k;->z:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, La81/k;->x:Ljava/util/List;

    iput-object p3, p0, La81/k;->y:Lkotlin/jvm/functions/Function1;

    iput p4, p0, La81/k;->E:I

    iput p5, p0, La81/k;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x5

    iput v0, p0, La81/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La81/k;->x:Ljava/util/List;

    iput-object p2, p0, La81/k;->z:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, La81/k;->y:Lkotlin/jvm/functions/Function1;

    iput p4, p0, La81/k;->E:I

    iput p5, p0, La81/k;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;III)V
    .locals 0

    .line 3
    iput p6, p0, La81/k;->w:I

    iput-object p1, p0, La81/k;->x:Ljava/util/List;

    iput-object p2, p0, La81/k;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La81/k;->z:Landroidx/compose/ui/Modifier;

    iput p4, p0, La81/k;->E:I

    iput p5, p0, La81/k;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, La81/k;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, La81/k;->z:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, La81/k;->x:Ljava/util/List;

    iget-object v3, p0, La81/k;->y:Lkotlin/jvm/functions/Function1;

    iget v4, p0, La81/k;->E:I

    iget v5, p0, La81/k;->F:I

    invoke-static/range {v1 .. v7}, Lkh0/f;->a(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, La81/k;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v3

    iget-object v0, p0, La81/k;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, La81/k;->x:Ljava/util/List;

    iget-object v2, p0, La81/k;->y:Lkotlin/jvm/functions/Function1;

    iget v5, p0, La81/k;->F:I

    invoke-static/range {v0 .. v5}, Lse/b;->l(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, La81/k;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, La81/k;->x:Ljava/util/List;

    iget-object v2, p0, La81/k;->y:Lkotlin/jvm/functions/Function1;

    iget v3, p0, La81/k;->E:I

    iget v4, p0, La81/k;->F:I

    invoke-static/range {v0 .. v6}, Lgz2/c;->b(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, La81/k;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, La81/k;->x:Ljava/util/List;

    iget-object v2, p0, La81/k;->y:Lkotlin/jvm/functions/Function1;

    iget v3, p0, La81/k;->E:I

    iget v4, p0, La81/k;->F:I

    invoke-static/range {v0 .. v6}, Le81/k;->p(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, La81/k;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, La81/k;->x:Ljava/util/List;

    iget-object v2, p0, La81/k;->y:Lkotlin/jvm/functions/Function1;

    iget v3, p0, La81/k;->E:I

    iget v4, p0, La81/k;->F:I

    invoke-static/range {v0 .. v6}, La81/o;->n(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, La81/k;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, La81/k;->x:Ljava/util/List;

    iget-object v2, p0, La81/k;->y:Lkotlin/jvm/functions/Function1;

    iget v3, p0, La81/k;->E:I

    iget v4, p0, La81/k;->F:I

    invoke-static/range {v0 .. v6}, La81/o;->g(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
