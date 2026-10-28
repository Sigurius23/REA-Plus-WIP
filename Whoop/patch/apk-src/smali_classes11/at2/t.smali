.class public final synthetic Lat2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput p2, p0, Lat2/t;->w:I

    iput-object p3, p0, Lat2/t;->z:Ljava/lang/Object;

    iput p1, p0, Lat2/t;->y:I

    iput-object p4, p0, Lat2/t;->E:Ljava/lang/Object;

    iput-object p5, p0, Lat2/t;->F:Ljava/lang/Object;

    iput-object p6, p0, Lat2/t;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkm0/e;Lbc3/c0;Lv41/f$a;ILkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lat2/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lat2/t;->z:Ljava/lang/Object;

    iput-object p2, p0, Lat2/t;->E:Ljava/lang/Object;

    iput-object p3, p0, Lat2/t;->F:Ljava/lang/Object;

    iput p4, p0, Lat2/t;->y:I

    iput-object p5, p0, Lat2/t;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lm91/a;Lkotlin/jvm/functions/Function1;ILeu2/p;Landroidx/compose/ui/Modifier;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lat2/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lat2/t;->z:Ljava/lang/Object;

    iput-object p2, p0, Lat2/t;->x:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lat2/t;->y:I

    iput-object p4, p0, Lat2/t;->E:Ljava/lang/Object;

    iput-object p5, p0, Lat2/t;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lat2/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/t;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lat2/t;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/a1;

    iget-object v0, p0, Lat2/t;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lwr0/x0;

    move-object v6, p1

    check-cast v6, Ll0/v;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v2, p0, Lat2/t;->y:I

    iget-object v5, p0, Lat2/t;->x:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v8}, Lwr0/u0;->j(Ljava/util/List;ILp1/a1;Lwr0/x0;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lat2/t;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lot2/a;

    iget-object v0, p0, Lat2/t;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    iget-object v0, p0, Lat2/t;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lv41/f$a;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v2, p0, Lat2/t;->y:I

    iget-object v5, p0, Lat2/t;->x:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v8}, Lpt2/i;->b(Lot2/a;ILbc3/c0;Lv41/f$a;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lat2/t;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkm0/e;

    iget-object v0, p0, Lat2/t;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lat2/t;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lv41/f$a;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v4, p0, Lat2/t;->y:I

    iget-object v5, p0, Lat2/t;->x:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v8}, Lp12/x;->a(Lkm0/e;Lbc3/c0;Lv41/f$a;ILkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lat2/t;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lm91/a;

    iget-object v0, p0, Lat2/t;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Leu2/p;

    iget-object v0, p0, Lat2/t;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Lc0/i0;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v2, p0, Lat2/t;->x:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lat2/t;->y:I

    invoke-static/range {v1 .. v8}, Leu2/o;->d(Lm91/a;Lkotlin/jvm/functions/Function1;ILeu2/p;Landroidx/compose/ui/Modifier;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lat2/t;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lys2/e$i;

    iget-object v0, p0, Lat2/t;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    iget-object v0, p0, Lat2/t;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lv41/f$a;

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v2, p0, Lat2/t;->y:I

    iget-object v5, p0, Lat2/t;->x:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v8}, Lat2/w;->c(Lys2/e$i;ILbc3/c0;Lv41/f$a;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
