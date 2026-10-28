.class public final synthetic Lc41/q3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:J

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:J

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;IIJLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/q3;->w:Lcom/whoop/design/util/TextResource;

    iput p2, p0, Lc41/q3;->x:I

    iput p3, p0, Lc41/q3;->y:I

    iput-wide p4, p0, Lc41/q3;->z:J

    iput-object p6, p0, Lc41/q3;->E:Lcom/whoop/design/util/TextResource;

    iput-wide p7, p0, Lc41/q3;->F:J

    iput-object p9, p0, Lc41/q3;->G:Lcom/whoop/design/util/TextResource;

    iput-wide p10, p0, Lc41/q3;->H:J

    iput-object p12, p0, Lc41/q3;->I:Lkotlin/jvm/functions/Function1;

    iput p13, p0, Lc41/q3;->J:I

    iput p14, p0, Lc41/q3;->K:I

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

    iget-object v1, v0, Lc41/q3;->w:Lcom/whoop/design/util/TextResource;

    iget v2, v0, Lc41/q3;->x:I

    iget v3, v0, Lc41/q3;->y:I

    iget-wide v4, v0, Lc41/q3;->z:J

    iget-object v6, v0, Lc41/q3;->E:Lcom/whoop/design/util/TextResource;

    iget-wide v7, v0, Lc41/q3;->F:J

    iget-object v9, v0, Lc41/q3;->G:Lcom/whoop/design/util/TextResource;

    iget-wide v10, v0, Lc41/q3;->H:J

    iget-object v12, v0, Lc41/q3;->I:Lkotlin/jvm/functions/Function1;

    iget v13, v0, Lc41/q3;->J:I

    iget v14, v0, Lc41/q3;->K:I

    invoke-static/range {v1 .. v16}, Lc41/u3;->f(Lcom/whoop/design/util/TextResource;IIJLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
