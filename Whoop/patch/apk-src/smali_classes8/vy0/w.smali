.class public final synthetic Lvy0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Z

.field public final synthetic G:F

.field public final synthetic H:F

.field public final synthetic I:Lc93/a;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ly71/g;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;JJZFFLc93/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvy0/w;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lvy0/w;->x:Ly71/g;

    iput-object p3, p0, Lvy0/w;->y:Lcom/whoop/design/util/TextResource;

    iput-wide p4, p0, Lvy0/w;->z:J

    iput-wide p6, p0, Lvy0/w;->E:J

    iput-boolean p8, p0, Lvy0/w;->F:Z

    iput p9, p0, Lvy0/w;->G:F

    iput p10, p0, Lvy0/w;->H:F

    iput-object p11, p0, Lvy0/w;->I:Lc93/a;

    iput p12, p0, Lvy0/w;->J:I

    iput p13, p0, Lvy0/w;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v1, v0, Lvy0/w;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lvy0/w;->x:Ly71/g;

    iget-object v3, v0, Lvy0/w;->y:Lcom/whoop/design/util/TextResource;

    iget-wide v4, v0, Lvy0/w;->z:J

    iget-wide v6, v0, Lvy0/w;->E:J

    iget-boolean v8, v0, Lvy0/w;->F:Z

    iget v9, v0, Lvy0/w;->G:F

    iget v10, v0, Lvy0/w;->H:F

    iget-object v11, v0, Lvy0/w;->I:Lc93/a;

    iget v12, v0, Lvy0/w;->J:I

    iget v13, v0, Lvy0/w;->K:I

    invoke-static/range {v1 .. v15}, Lvy0/x;->c(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;JJZFFLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
