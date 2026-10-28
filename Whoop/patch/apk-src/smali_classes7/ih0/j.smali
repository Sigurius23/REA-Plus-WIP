.class public final synthetic Lih0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Z

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic M:Ljava/lang/Object;

.field public final synthetic N:Ljava/lang/Object;

.field public final synthetic O:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Z

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lq3/y;Lkotlin/jvm/functions/Function1;IZZZLql0/c;ZFLc93/a;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lih0/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih0/j;->x:Ljava/lang/String;

    iput-object p2, p0, Lih0/j;->M:Ljava/lang/Object;

    iput-object p3, p0, Lih0/j;->z:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lih0/j;->J:I

    iput-boolean p5, p0, Lih0/j;->y:Z

    iput-boolean p6, p0, Lih0/j;->G:Z

    iput-boolean p7, p0, Lih0/j;->H:Z

    iput-object p8, p0, Lih0/j;->O:Ljava/lang/Object;

    iput-boolean p9, p0, Lih0/j;->I:Z

    iput p10, p0, Lih0/j;->E:F

    iput-object p11, p0, Lih0/j;->F:Lc93/a;

    iput-object p12, p0, Lih0/j;->N:Ljava/lang/Object;

    iput p13, p0, Lih0/j;->K:I

    iput p14, p0, Lih0/j;->L:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLc93/a;ZZZLjava/lang/String;III)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lih0/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih0/j;->M:Ljava/lang/Object;

    iput-object p2, p0, Lih0/j;->x:Ljava/lang/String;

    iput-boolean p3, p0, Lih0/j;->y:Z

    iput-object p4, p0, Lih0/j;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lih0/j;->N:Ljava/lang/Object;

    iput p6, p0, Lih0/j;->E:F

    iput-object p7, p0, Lih0/j;->F:Lc93/a;

    iput-boolean p8, p0, Lih0/j;->G:Z

    iput-boolean p9, p0, Lih0/j;->H:Z

    iput-boolean p10, p0, Lih0/j;->I:Z

    iput-object p11, p0, Lih0/j;->O:Ljava/lang/Object;

    iput p12, p0, Lih0/j;->J:I

    iput p13, p0, Lih0/j;->K:I

    iput p14, p0, Lih0/j;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Lih0/j;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lih0/j;->M:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/util/List;

    iget-object v1, v0, Lih0/j;->N:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Landroidx/compose/ui/Modifier;

    iget-object v1, v0, Lih0/j;->O:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Ljava/lang/String;

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v3, v0, Lih0/j;->x:Ljava/lang/String;

    iget-boolean v4, v0, Lih0/j;->y:Z

    iget-object v5, v0, Lih0/j;->z:Lkotlin/jvm/functions/Function1;

    iget v7, v0, Lih0/j;->E:F

    iget-object v8, v0, Lih0/j;->F:Lc93/a;

    iget-boolean v9, v0, Lih0/j;->G:Z

    iget-boolean v10, v0, Lih0/j;->H:Z

    iget-boolean v11, v0, Lih0/j;->I:Z

    iget v13, v0, Lih0/j;->J:I

    iget v14, v0, Lih0/j;->K:I

    iget v15, v0, Lih0/j;->L:I

    invoke-static/range {v2 .. v17}, Ljm0/d;->h(Ljava/util/List;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLc93/a;ZZZLjava/lang/String;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lih0/j;->M:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lq3/y;

    iget-object v1, v0, Lih0/j;->O:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lql0/c;

    iget-object v1, v0, Lih0/j;->N:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v2, v0, Lih0/j;->x:Ljava/lang/String;

    iget-object v4, v0, Lih0/j;->z:Lkotlin/jvm/functions/Function1;

    iget v5, v0, Lih0/j;->J:I

    iget-boolean v6, v0, Lih0/j;->y:Z

    iget-boolean v7, v0, Lih0/j;->G:Z

    iget-boolean v8, v0, Lih0/j;->H:Z

    iget-boolean v10, v0, Lih0/j;->I:Z

    iget v11, v0, Lih0/j;->E:F

    iget-object v12, v0, Lih0/j;->F:Lc93/a;

    iget v14, v0, Lih0/j;->K:I

    iget v15, v0, Lih0/j;->L:I

    invoke-static/range {v2 .. v17}, Lih0/l;->u(Ljava/lang/String;Lq3/y;Lkotlin/jvm/functions/Function1;IZZZLql0/c;ZFLc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
