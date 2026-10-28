.class public final synthetic Liz0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Liz0/m;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic J:Z

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Laf3/t;Landroidx/compose/ui/Modifier;Liz0/m;ZLkotlin/jvm/functions/Function1;IIIZII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Liz0/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liz0/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Liz0/f;->y:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Liz0/f;->E:Liz0/m;

    iput-boolean p4, p0, Liz0/f;->z:Z

    iput-object p5, p0, Liz0/f;->F:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Liz0/f;->G:I

    iput p7, p0, Liz0/f;->H:I

    iput p8, p0, Liz0/f;->I:I

    iput-boolean p9, p0, Liz0/f;->J:Z

    iput p10, p0, Liz0/f;->K:I

    iput p11, p0, Liz0/f;->L:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZIII)V
    .locals 0

    .line 2
    iput p12, p0, Liz0/f;->w:I

    iput-object p1, p0, Liz0/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Liz0/f;->y:Landroidx/compose/ui/Modifier;

    iput-boolean p3, p0, Liz0/f;->z:Z

    iput-object p4, p0, Liz0/f;->E:Liz0/m;

    iput-object p5, p0, Liz0/f;->F:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Liz0/f;->G:I

    iput p7, p0, Liz0/f;->H:I

    iput p8, p0, Liz0/f;->I:I

    iput-boolean p9, p0, Liz0/f;->J:Z

    iput p10, p0, Liz0/f;->K:I

    iput p11, p0, Liz0/f;->L:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Liz0/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liz0/f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v2, p0, Liz0/f;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v3, p0, Liz0/f;->z:Z

    iget-object v4, p0, Liz0/f;->E:Liz0/m;

    iget-object v5, p0, Liz0/f;->F:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Liz0/f;->G:I

    iget v7, p0, Liz0/f;->H:I

    iget v8, p0, Liz0/f;->I:I

    iget-boolean v9, p0, Liz0/f;->J:Z

    iget v10, p0, Liz0/f;->K:I

    iget v11, p0, Liz0/f;->L:I

    invoke-static/range {v1 .. v13}, Liz0/g;->u(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Liz0/f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Laf3/t;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v2, p0, Liz0/f;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Liz0/f;->E:Liz0/m;

    iget-boolean v4, p0, Liz0/f;->z:Z

    iget-object v5, p0, Liz0/f;->F:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Liz0/f;->G:I

    iget v7, p0, Liz0/f;->H:I

    iget v8, p0, Liz0/f;->I:I

    iget-boolean v9, p0, Liz0/f;->J:Z

    iget v10, p0, Liz0/f;->K:I

    iget v11, p0, Liz0/f;->L:I

    invoke-static/range {v1 .. v13}, Liz0/g;->H(Laf3/t;Landroidx/compose/ui/Modifier;Liz0/m;ZLkotlin/jvm/functions/Function1;IIIZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Liz0/f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Laf3/t;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v2, p0, Liz0/f;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Liz0/f;->E:Liz0/m;

    iget-boolean v4, p0, Liz0/f;->z:Z

    iget-object v5, p0, Liz0/f;->F:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Liz0/f;->G:I

    iget v7, p0, Liz0/f;->H:I

    iget v8, p0, Liz0/f;->I:I

    iget-boolean v9, p0, Liz0/f;->J:Z

    iget v10, p0, Liz0/f;->K:I

    iget v11, p0, Liz0/f;->L:I

    invoke-static/range {v1 .. v13}, Liz0/g;->D(Laf3/t;Landroidx/compose/ui/Modifier;Liz0/m;ZLkotlin/jvm/functions/Function1;IIIZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
