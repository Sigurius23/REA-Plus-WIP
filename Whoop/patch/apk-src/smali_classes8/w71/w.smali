.class public final synthetic Lw71/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Integer;

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Landroidx/compose/ui/Modifier;

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw71/w;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lw71/w;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lw71/w;->y:Lcom/whoop/design/util/TextResource;

    iput p4, p0, Lw71/w;->z:I

    iput p5, p0, Lw71/w;->E:I

    iput p6, p0, Lw71/w;->F:I

    iput-object p7, p0, Lw71/w;->G:Ljava/lang/Integer;

    iput-boolean p8, p0, Lw71/w;->H:Z

    iput-boolean p9, p0, Lw71/w;->I:Z

    iput-object p10, p0, Lw71/w;->J:Landroidx/compose/ui/Modifier;

    iput-object p11, p0, Lw71/w;->K:Lkotlin/jvm/functions/Function1;

    iput p12, p0, Lw71/w;->L:I

    iput p13, p0, Lw71/w;->M:I

    iput p14, p0, Lw71/w;->N:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v1, v0, Lw71/w;->w:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lw71/w;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lw71/w;->y:Lcom/whoop/design/util/TextResource;

    iget v4, v0, Lw71/w;->z:I

    iget v5, v0, Lw71/w;->E:I

    iget v6, v0, Lw71/w;->F:I

    iget-object v7, v0, Lw71/w;->G:Ljava/lang/Integer;

    iget-boolean v8, v0, Lw71/w;->H:Z

    iget-boolean v9, v0, Lw71/w;->I:Z

    iget-object v10, v0, Lw71/w;->J:Landroidx/compose/ui/Modifier;

    iget-object v11, v0, Lw71/w;->K:Lkotlin/jvm/functions/Function1;

    iget v12, v0, Lw71/w;->L:I

    iget v13, v0, Lw71/w;->M:I

    iget v14, v0, Lw71/w;->N:I

    invoke-static/range {v1 .. v16}, Lw71/x;->a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
