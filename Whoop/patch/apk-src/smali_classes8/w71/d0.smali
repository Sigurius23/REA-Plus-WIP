.class public final synthetic Lw71/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:Z

.field public final synthetic H:Z

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;JJJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw71/d0;->w:Lcom/whoop/design/util/TextResource;

    iput-wide p2, p0, Lw71/d0;->x:J

    iput-wide p4, p0, Lw71/d0;->y:J

    iput-wide p6, p0, Lw71/d0;->z:J

    iput-object p8, p0, Lw71/d0;->E:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Lw71/d0;->F:Lcom/whoop/design/util/TextResource;

    iput-boolean p10, p0, Lw71/d0;->G:Z

    iput-boolean p11, p0, Lw71/d0;->H:Z

    iput-object p12, p0, Lw71/d0;->I:Lkotlin/jvm/functions/Function1;

    iput p13, p0, Lw71/d0;->J:I

    iput p14, p0, Lw71/d0;->K:I

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

    iget-object v1, v0, Lw71/d0;->w:Lcom/whoop/design/util/TextResource;

    iget-wide v2, v0, Lw71/d0;->x:J

    iget-wide v4, v0, Lw71/d0;->y:J

    iget-wide v6, v0, Lw71/d0;->z:J

    iget-object v8, v0, Lw71/d0;->E:Lcom/whoop/design/util/TextResource;

    iget-object v9, v0, Lw71/d0;->F:Lcom/whoop/design/util/TextResource;

    iget-boolean v10, v0, Lw71/d0;->G:Z

    iget-boolean v11, v0, Lw71/d0;->H:Z

    iget-object v12, v0, Lw71/d0;->I:Lkotlin/jvm/functions/Function1;

    iget v13, v0, Lw71/d0;->J:I

    iget v14, v0, Lw71/d0;->K:I

    invoke-static/range {v1 .. v16}, Lw71/e0;->c(Lcom/whoop/design/util/TextResource;JJJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
