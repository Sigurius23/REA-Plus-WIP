.class public final synthetic Ld41/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic M:Ljava/lang/Object;

.field public final synthetic N:Ljava/lang/Object;

.field public final synthetic O:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;III)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ld41/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld41/c;->I:Ljava/lang/Object;

    iput-boolean p2, p0, Ld41/c;->x:Z

    iput-object p3, p0, Ld41/c;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Ld41/c;->J:Ljava/lang/Object;

    iput-object p5, p0, Ld41/c;->K:Ljava/lang/Object;

    iput-object p6, p0, Ld41/c;->L:Ljava/lang/Object;

    iput-object p7, p0, Ld41/c;->z:Ljava/lang/Integer;

    iput-object p8, p0, Ld41/c;->M:Ljava/lang/Object;

    iput-boolean p9, p0, Ld41/c;->E:Z

    iput-object p10, p0, Ld41/c;->N:Ljava/lang/Object;

    iput-object p11, p0, Ld41/c;->O:Ljava/lang/Object;

    iput p12, p0, Ld41/c;->F:I

    iput p13, p0, Ld41/c;->G:I

    iput p14, p0, Ld41/c;->H:I

    return-void
.end method

.method public synthetic constructor <init>(Ld41/g;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLd41/j;ZIII)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ld41/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld41/c;->I:Ljava/lang/Object;

    iput-object p2, p0, Ld41/c;->J:Ljava/lang/Object;

    iput-object p3, p0, Ld41/c;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Ld41/c;->z:Ljava/lang/Integer;

    iput-object p5, p0, Ld41/c;->K:Ljava/lang/Object;

    iput-object p6, p0, Ld41/c;->L:Ljava/lang/Object;

    iput-object p7, p0, Ld41/c;->M:Ljava/lang/Object;

    iput-object p8, p0, Ld41/c;->N:Ljava/lang/Object;

    iput-boolean p9, p0, Ld41/c;->x:Z

    iput-object p10, p0, Ld41/c;->O:Ljava/lang/Object;

    iput-boolean p11, p0, Ld41/c;->E:Z

    iput p12, p0, Ld41/c;->F:I

    iput p13, p0, Ld41/c;->G:I

    iput p14, p0, Ld41/c;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Ld41/c;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Ld41/c;->I:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v1, v0, Ld41/c;->J:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lb91/a;

    iget-object v1, v0, Ld41/c;->K:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lg1/u0;

    iget-object v1, v0, Ld41/c;->L:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lf0/t;

    iget-object v1, v0, Ld41/c;->M:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Landroidx/compose/ui/Modifier;

    iget-object v1, v0, Ld41/c;->N:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Ll0/k1;

    iget-object v1, v0, Ld41/c;->O:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Lc93/a;

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-boolean v3, v0, Ld41/c;->x:Z

    iget-object v4, v0, Ld41/c;->y:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, Ld41/c;->z:Ljava/lang/Integer;

    iget-boolean v10, v0, Ld41/c;->E:Z

    iget v13, v0, Ld41/c;->F:I

    iget v14, v0, Ld41/c;->G:I

    iget v15, v0, Ld41/c;->H:I

    invoke-static/range {v2 .. v17}, Lny0/o0;->a(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Ld41/c;->I:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ld41/g;

    iget-object v1, v0, Ld41/c;->J:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lkd1/o;

    iget-object v1, v0, Ld41/c;->K:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Ld41/c;->L:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Ld41/c;->M:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Ld41/c;->N:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Ld41/c;->O:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Ld41/j;

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v4, v0, Ld41/c;->y:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Ld41/c;->z:Ljava/lang/Integer;

    iget-boolean v10, v0, Ld41/c;->x:Z

    iget-boolean v12, v0, Ld41/c;->E:Z

    iget v13, v0, Ld41/c;->F:I

    iget v14, v0, Ld41/c;->G:I

    iget v15, v0, Ld41/c;->H:I

    invoke-static/range {v2 .. v17}, Ld41/e;->k(Ld41/g;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLd41/j;ZIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
