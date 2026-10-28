.class public final synthetic Lat2/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILcj1/i$d;Lm91/u;Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lat2/a0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lat2/a0;->x:I

    iput-object p2, p0, Lat2/a0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lat2/a0;->E:Ljava/lang/Object;

    iput-object p4, p0, Lat2/a0;->F:Ljava/lang/Object;

    iput-object p5, p0, Lat2/a0;->G:Ljava/lang/Object;

    iput-object p6, p0, Lat2/a0;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lv41/f$a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    .line 2
    iput p7, p0, Lat2/a0;->w:I

    iput-object p1, p0, Lat2/a0;->z:Ljava/lang/Object;

    iput-object p2, p0, Lat2/a0;->E:Ljava/lang/Object;

    iput p3, p0, Lat2/a0;->x:I

    iput-object p4, p0, Lat2/a0;->F:Ljava/lang/Object;

    iput-object p5, p0, Lat2/a0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lat2/a0;->G:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lat2/a0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/a0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lot2/c;

    iget-object v0, p0, Lat2/a0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lv41/f$a;

    iget-object v0, p0, Lat2/a0;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lbc3/c0;

    iget-object v0, p0, Lat2/a0;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    move-object v7, p1

    check-cast v7, Ll0/y;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v3, p0, Lat2/a0;->x:I

    iget-object v5, p0, Lat2/a0;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v9}, Lpt2/l;->j(Lot2/c;Lv41/f$a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lat2/a0;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcj1/i$d;

    iget-object v0, p0, Lat2/a0;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lm91/u;

    iget-object v0, p0, Lat2/a0;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    iget-object v0, p0, Lat2/a0;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ln71/r;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/lazy/a;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lat2/a0;->x:I

    iget-object v6, p0, Lat2/a0;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v9}, Lej1/o;->c(ILcj1/i$d;Lm91/u;Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lat2/a0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lys2/e$j;

    iget-object v0, p0, Lat2/a0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lv41/f$a;

    iget-object v0, p0, Lat2/a0;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lbc3/c0;

    iget-object v0, p0, Lat2/a0;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    move-object v7, p1

    check-cast v7, Ll0/y;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v3, p0, Lat2/a0;->x:I

    iget-object v5, p0, Lat2/a0;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v9}, Lat2/c0;->b(Lys2/e$j;Lv41/f$a;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
