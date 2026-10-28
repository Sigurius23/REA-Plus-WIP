.class public final synthetic La11/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Integer;

.field public final synthetic F:Z

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Lcom/whoop/design/util/TextResource;

.field public final synthetic I:Lcom/whoop/design/util/TextResource;

.field public final synthetic J:Z

.field public final synthetic K:La11/d;

.field public final synthetic L:La11/c;

.field public final synthetic M:La11/b;

.field public final synthetic N:La11/a;

.field public final synthetic O:Lkotlin/jvm/functions/Function1;

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La11/n;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, La11/n;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, La11/n;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, La11/n;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, La11/n;->E:Ljava/lang/Integer;

    iput-boolean p6, p0, La11/n;->F:Z

    iput-object p7, p0, La11/n;->G:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, La11/n;->H:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, La11/n;->I:Lcom/whoop/design/util/TextResource;

    iput-boolean p10, p0, La11/n;->J:Z

    iput-object p11, p0, La11/n;->K:La11/d;

    iput-object p12, p0, La11/n;->L:La11/c;

    iput-object p13, p0, La11/n;->M:La11/b;

    iput-object p14, p0, La11/n;->N:La11/a;

    iput-object p15, p0, La11/n;->O:Lkotlin/jvm/functions/Function1;

    move/from16 p1, p16

    iput p1, p0, La11/n;->P:I

    move/from16 p1, p17

    iput p1, p0, La11/n;->Q:I

    move/from16 p1, p18

    iput p1, p0, La11/n;->R:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v19, p1

    check-cast v19, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v20

    iget-object v1, v0, La11/n;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, La11/n;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, La11/n;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, La11/n;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, La11/n;->E:Ljava/lang/Integer;

    iget-boolean v6, v0, La11/n;->F:Z

    iget-object v7, v0, La11/n;->G:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, La11/n;->H:Lcom/whoop/design/util/TextResource;

    iget-object v9, v0, La11/n;->I:Lcom/whoop/design/util/TextResource;

    iget-boolean v10, v0, La11/n;->J:Z

    iget-object v11, v0, La11/n;->K:La11/d;

    iget-object v12, v0, La11/n;->L:La11/c;

    iget-object v13, v0, La11/n;->M:La11/b;

    iget-object v14, v0, La11/n;->N:La11/a;

    iget-object v15, v0, La11/n;->O:Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, v1

    iget v1, v0, La11/n;->P:I

    move/from16 v17, v1

    iget v1, v0, La11/n;->Q:I

    move/from16 v18, v1

    iget v1, v0, La11/n;->R:I

    move/from16 v21, v18

    move/from16 v18, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move/from16 v17, v21

    invoke-static/range {v1 .. v20}, La11/q;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
