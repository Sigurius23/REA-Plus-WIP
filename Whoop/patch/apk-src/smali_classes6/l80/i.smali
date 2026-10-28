.class public final synthetic Ll80/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroid/content/Intent;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:Lf80/a;

.field public final synthetic L:Lf80/d;

.field public final synthetic M:Lf80/e;

.field public final synthetic N:Lc93/r;

.field public final synthetic O:I

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic w:Lg80/e;

.field public final synthetic x:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

.field public final synthetic y:Lb03/f;

.field public final synthetic z:Leb/u0;


# direct methods
.method public synthetic constructor <init>(Lg80/e;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lb03/f;Leb/u0;Landroid/content/Intent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lf80/a;Lf80/d;Lf80/e;Lc93/r;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll80/i;->w:Lg80/e;

    iput-object p2, p0, Ll80/i;->x:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    iput-object p3, p0, Ll80/i;->y:Lb03/f;

    iput-object p4, p0, Ll80/i;->z:Leb/u0;

    iput-object p5, p0, Ll80/i;->E:Landroid/content/Intent;

    iput-object p6, p0, Ll80/i;->F:Ljava/lang/String;

    iput-object p7, p0, Ll80/i;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Ll80/i;->H:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Ll80/i;->I:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Ll80/i;->J:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Ll80/i;->K:Lf80/a;

    iput-object p12, p0, Ll80/i;->L:Lf80/d;

    iput-object p13, p0, Ll80/i;->M:Lf80/e;

    iput-object p14, p0, Ll80/i;->N:Lc93/r;

    iput p15, p0, Ll80/i;->O:I

    move/from16 p1, p16

    iput p1, p0, Ll80/i;->P:I

    move/from16 p1, p17

    iput p1, p0, Ll80/i;->Q:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v19

    iget-object v1, v0, Ll80/i;->w:Lg80/e;

    iget-object v2, v0, Ll80/i;->x:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    iget-object v3, v0, Ll80/i;->y:Lb03/f;

    iget-object v4, v0, Ll80/i;->z:Leb/u0;

    iget-object v5, v0, Ll80/i;->E:Landroid/content/Intent;

    iget-object v6, v0, Ll80/i;->F:Ljava/lang/String;

    iget-object v7, v0, Ll80/i;->G:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Ll80/i;->H:Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, Ll80/i;->I:Lkotlin/jvm/functions/Function1;

    iget-object v10, v0, Ll80/i;->J:Lkotlin/jvm/functions/Function1;

    iget-object v11, v0, Ll80/i;->K:Lf80/a;

    iget-object v12, v0, Ll80/i;->L:Lf80/d;

    iget-object v13, v0, Ll80/i;->M:Lf80/e;

    iget-object v14, v0, Ll80/i;->N:Lc93/r;

    iget v15, v0, Ll80/i;->O:I

    move-object/from16 v16, v1

    iget v1, v0, Ll80/i;->P:I

    move/from16 v17, v1

    iget v1, v0, Ll80/i;->Q:I

    move/from16 v20, v17

    move/from16 v17, v1

    move-object/from16 v1, v16

    move/from16 v16, v20

    invoke-static/range {v1 .. v19}, Ll80/n;->k(Lg80/e;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lb03/f;Leb/u0;Landroid/content/Intent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lf80/a;Lf80/d;Lf80/e;Lc93/r;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
