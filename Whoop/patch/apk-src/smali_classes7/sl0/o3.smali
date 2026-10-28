.class public final synthetic Lsl0/o3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Lql0/c;

.field public final synthetic H:I

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic M:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lq3/y;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;Lq3/y;Lc93/a;ZZLql0/c;ZZLsl0/x1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lsl0/o3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lsl0/o3;->H:I

    iput-object p2, p0, Lsl0/o3;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lsl0/o3;->x:Lq3/y;

    iput-object p4, p0, Lsl0/o3;->z:Lc93/a;

    iput-boolean p5, p0, Lsl0/o3;->E:Z

    iput-boolean p6, p0, Lsl0/o3;->F:Z

    iput-object p7, p0, Lsl0/o3;->G:Lql0/c;

    iput-boolean p8, p0, Lsl0/o3;->I:Z

    iput-boolean p9, p0, Lsl0/o3;->J:Z

    iput-object p10, p0, Lsl0/o3;->M:Ljava/lang/Object;

    iput p11, p0, Lsl0/o3;->K:I

    iput p12, p0, Lsl0/o3;->L:I

    return-void
.end method

.method public synthetic constructor <init>(Lq3/y;Lkotlin/jvm/functions/Function1;Lc93/a;ZZLql0/c;ILc93/a;ZZII)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lsl0/o3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/o3;->x:Lq3/y;

    iput-object p2, p0, Lsl0/o3;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lsl0/o3;->z:Lc93/a;

    iput-boolean p4, p0, Lsl0/o3;->E:Z

    iput-boolean p5, p0, Lsl0/o3;->F:Z

    iput-object p6, p0, Lsl0/o3;->G:Lql0/c;

    iput p7, p0, Lsl0/o3;->H:I

    iput-object p8, p0, Lsl0/o3;->M:Ljava/lang/Object;

    iput-boolean p9, p0, Lsl0/o3;->I:Z

    iput-boolean p10, p0, Lsl0/o3;->J:Z

    iput p11, p0, Lsl0/o3;->K:I

    iput p12, p0, Lsl0/o3;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lsl0/o3;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lsl0/o3;->M:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lc93/a;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v2, v0, Lsl0/o3;->x:Lq3/y;

    iget-object v3, v0, Lsl0/o3;->y:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lsl0/o3;->z:Lc93/a;

    iget-boolean v5, v0, Lsl0/o3;->E:Z

    iget-boolean v6, v0, Lsl0/o3;->F:Z

    iget-object v7, v0, Lsl0/o3;->G:Lql0/c;

    iget v8, v0, Lsl0/o3;->H:I

    iget-boolean v10, v0, Lsl0/o3;->I:Z

    iget-boolean v11, v0, Lsl0/o3;->J:Z

    iget v12, v0, Lsl0/o3;->K:I

    iget v13, v0, Lsl0/o3;->L:I

    invoke-static/range {v2 .. v15}, Lsl0/p3;->m(Lq3/y;Lkotlin/jvm/functions/Function1;Lc93/a;ZZLql0/c;ILc93/a;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lsl0/o3;->M:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lsl0/x1;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget v2, v0, Lsl0/o3;->H:I

    iget-object v3, v0, Lsl0/o3;->y:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lsl0/o3;->x:Lq3/y;

    iget-object v5, v0, Lsl0/o3;->z:Lc93/a;

    iget-boolean v6, v0, Lsl0/o3;->E:Z

    iget-boolean v7, v0, Lsl0/o3;->F:Z

    iget-object v8, v0, Lsl0/o3;->G:Lql0/c;

    iget-boolean v9, v0, Lsl0/o3;->I:Z

    iget-boolean v10, v0, Lsl0/o3;->J:Z

    iget v12, v0, Lsl0/o3;->K:I

    iget v13, v0, Lsl0/o3;->L:I

    invoke-static/range {v2 .. v15}, Lsl0/p3;->j(ILkotlin/jvm/functions/Function1;Lq3/y;Lc93/a;ZZLql0/c;ZZLsl0/x1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
