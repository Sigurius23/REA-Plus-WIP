.class public final synthetic Lrm1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;II)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lrm1/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm1/l;->G:Ljava/lang/Object;

    iput p2, p0, Lrm1/l;->x:I

    iput p3, p0, Lrm1/l;->y:I

    iput-object p4, p0, Lrm1/l;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lrm1/l;->H:Ljava/lang/Object;

    iput-object p6, p0, Lrm1/l;->I:Ljava/lang/Object;

    iput p7, p0, Lrm1/l;->E:I

    iput p8, p0, Lrm1/l;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lz51/l;Ld0/z1;IILkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lrm1/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm1/l;->G:Ljava/lang/Object;

    iput-object p2, p0, Lrm1/l;->H:Ljava/lang/Object;

    iput-object p3, p0, Lrm1/l;->I:Ljava/lang/Object;

    iput p4, p0, Lrm1/l;->x:I

    iput p5, p0, Lrm1/l;->y:I

    iput-object p6, p0, Lrm1/l;->z:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Lrm1/l;->E:I

    iput p8, p0, Lrm1/l;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Lw71/l;Lw71/y;IILjava/lang/Integer;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lrm1/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm1/l;->G:Ljava/lang/Object;

    iput-object p2, p0, Lrm1/l;->H:Ljava/lang/Object;

    iput p3, p0, Lrm1/l;->x:I

    iput p4, p0, Lrm1/l;->y:I

    iput-object p5, p0, Lrm1/l;->I:Ljava/lang/Object;

    iput-object p6, p0, Lrm1/l;->z:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Lrm1/l;->E:I

    iput p8, p0, Lrm1/l;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lrm1/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrm1/l;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lrm1/l;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lrm1/l;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function3;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v2, p0, Lrm1/l;->x:I

    iget v3, p0, Lrm1/l;->y:I

    iget-object v4, p0, Lrm1/l;->z:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lrm1/l;->E:I

    iget v8, p0, Lrm1/l;->F:I

    invoke-static/range {v1 .. v10}, Lw81/c;->g(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrm1/l;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw71/l;

    iget-object v0, p0, Lrm1/l;->H:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lw71/y;

    iget-object v0, p0, Lrm1/l;->I:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v3, p0, Lrm1/l;->x:I

    iget v4, p0, Lrm1/l;->y:I

    iget-object v6, p0, Lrm1/l;->z:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lrm1/l;->E:I

    iget v8, p0, Lrm1/l;->F:I

    invoke-static/range {v1 .. v10}, Lw71/l;->A(Lw71/l;Lw71/y;IILjava/lang/Integer;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lrm1/l;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lrm1/l;->H:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lz51/l;

    iget-object v0, p0, Lrm1/l;->I:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ld0/z1;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v4, p0, Lrm1/l;->x:I

    iget v5, p0, Lrm1/l;->y:I

    iget-object v6, p0, Lrm1/l;->z:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lrm1/l;->E:I

    iget v8, p0, Lrm1/l;->F:I

    invoke-static/range {v1 .. v10}, Lrm1/m;->n(Landroidx/compose/ui/Modifier;Lz51/l;Ld0/z1;IILkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
