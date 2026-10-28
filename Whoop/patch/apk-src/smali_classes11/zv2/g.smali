.class public final synthetic Lzv2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lzv2/b;

.field public final synthetic F:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic H:Ljava/lang/String;

.field public final synthetic I:Ljava/lang/String;

.field public final synthetic J:Lc93/a;

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lzv2/i;

.field public final synthetic z:Lzv2/b;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lzv2/i;Lzv2/b;Lzv2/b;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p13, p0, Lzv2/g;->w:I

    iput-object p1, p0, Lzv2/g;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lzv2/g;->y:Lzv2/i;

    iput-object p3, p0, Lzv2/g;->z:Lzv2/b;

    iput-object p4, p0, Lzv2/g;->E:Lzv2/b;

    iput-object p5, p0, Lzv2/g;->F:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    iput-object p6, p0, Lzv2/g;->G:Ljava/lang/String;

    iput-object p7, p0, Lzv2/g;->H:Ljava/lang/String;

    iput-object p8, p0, Lzv2/g;->I:Ljava/lang/String;

    iput-object p9, p0, Lzv2/g;->J:Lc93/a;

    iput-object p10, p0, Lzv2/g;->K:Lkotlin/jvm/functions/Function1;

    iput p11, p0, Lzv2/g;->L:I

    iput p12, p0, Lzv2/g;->M:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lzv2/g;->w:I

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v2, v0, Lzv2/g;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lzv2/g;->y:Lzv2/i;

    iget-object v4, v0, Lzv2/g;->z:Lzv2/b;

    iget-object v5, v0, Lzv2/g;->E:Lzv2/b;

    iget-object v6, v0, Lzv2/g;->F:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    iget-object v7, v0, Lzv2/g;->G:Ljava/lang/String;

    iget-object v8, v0, Lzv2/g;->H:Ljava/lang/String;

    iget-object v9, v0, Lzv2/g;->I:Ljava/lang/String;

    iget-object v10, v0, Lzv2/g;->J:Lc93/a;

    iget-object v11, v0, Lzv2/g;->K:Lkotlin/jvm/functions/Function1;

    iget v12, v0, Lzv2/g;->L:I

    iget v13, v0, Lzv2/g;->M:I

    invoke-static/range {v2 .. v15}, Lzv2/h;->i(Landroidx/compose/ui/Modifier;Lzv2/i;Lzv2/b;Lzv2/b;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v2, v0, Lzv2/g;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lzv2/g;->y:Lzv2/i;

    iget-object v4, v0, Lzv2/g;->z:Lzv2/b;

    iget-object v5, v0, Lzv2/g;->E:Lzv2/b;

    iget-object v6, v0, Lzv2/g;->F:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    iget-object v7, v0, Lzv2/g;->G:Ljava/lang/String;

    iget-object v8, v0, Lzv2/g;->H:Ljava/lang/String;

    iget-object v9, v0, Lzv2/g;->I:Ljava/lang/String;

    iget-object v10, v0, Lzv2/g;->J:Lc93/a;

    iget-object v11, v0, Lzv2/g;->K:Lkotlin/jvm/functions/Function1;

    iget v12, v0, Lzv2/g;->L:I

    iget v13, v0, Lzv2/g;->M:I

    invoke-static/range {v2 .. v15}, Lzv2/h;->h(Landroidx/compose/ui/Modifier;Lzv2/i;Lzv2/b;Lzv2/b;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v2, v0, Lzv2/g;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lzv2/g;->y:Lzv2/i;

    iget-object v4, v0, Lzv2/g;->z:Lzv2/b;

    iget-object v5, v0, Lzv2/g;->E:Lzv2/b;

    iget-object v6, v0, Lzv2/g;->F:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    iget-object v7, v0, Lzv2/g;->G:Ljava/lang/String;

    iget-object v8, v0, Lzv2/g;->H:Ljava/lang/String;

    iget-object v9, v0, Lzv2/g;->I:Ljava/lang/String;

    iget-object v10, v0, Lzv2/g;->J:Lc93/a;

    iget-object v11, v0, Lzv2/g;->K:Lkotlin/jvm/functions/Function1;

    iget v12, v0, Lzv2/g;->L:I

    iget v13, v0, Lzv2/g;->M:I

    invoke-static/range {v2 .. v15}, Lzv2/h;->g(Landroidx/compose/ui/Modifier;Lzv2/i;Lzv2/b;Lzv2/b;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
