.class public final synthetic Lz51/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:Lb2/f;

.field public final synthetic H:Ll0/j;

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJILb2/f;Ll0/j;ZZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz51/c;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lz51/c;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lz51/c;->y:Lcom/whoop/design/util/TextResource;

    iput-wide p4, p0, Lz51/c;->z:J

    iput-wide p6, p0, Lz51/c;->E:J

    iput p8, p0, Lz51/c;->F:I

    iput-object p9, p0, Lz51/c;->G:Lb2/f;

    iput-object p10, p0, Lz51/c;->H:Ll0/j;

    iput-boolean p11, p0, Lz51/c;->I:Z

    iput-boolean p12, p0, Lz51/c;->J:Z

    iput p13, p0, Lz51/c;->K:I

    iput p14, p0, Lz51/c;->L:I

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

    iget-object v1, v0, Lz51/c;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lz51/c;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lz51/c;->y:Lcom/whoop/design/util/TextResource;

    iget-wide v4, v0, Lz51/c;->z:J

    iget-wide v6, v0, Lz51/c;->E:J

    iget v8, v0, Lz51/c;->F:I

    iget-object v9, v0, Lz51/c;->G:Lb2/f;

    iget-object v10, v0, Lz51/c;->H:Ll0/j;

    iget-boolean v11, v0, Lz51/c;->I:Z

    iget-boolean v12, v0, Lz51/c;->J:Z

    iget v13, v0, Lz51/c;->K:I

    iget v14, v0, Lz51/c;->L:I

    invoke-static/range {v1 .. v16}, Lz51/d;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJILb2/f;Ll0/j;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
