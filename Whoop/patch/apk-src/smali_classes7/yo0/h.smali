.class public final synthetic Lyo0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:J

.field public final synthetic G:J

.field public final synthetic H:Lc93/a;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lb91/a;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;JIJJLc93/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo0/h;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lyo0/h;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lyo0/h;->y:Lb91/a;

    iput-wide p4, p0, Lyo0/h;->z:J

    iput p6, p0, Lyo0/h;->E:I

    iput-wide p7, p0, Lyo0/h;->F:J

    iput-wide p9, p0, Lyo0/h;->G:J

    iput-object p11, p0, Lyo0/h;->H:Lc93/a;

    iput p12, p0, Lyo0/h;->I:I

    iput p13, p0, Lyo0/h;->J:I

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

    iget-object v1, v0, Lyo0/h;->w:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lyo0/h;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lyo0/h;->y:Lb91/a;

    iget-wide v4, v0, Lyo0/h;->z:J

    iget v6, v0, Lyo0/h;->E:I

    iget-wide v7, v0, Lyo0/h;->F:J

    iget-wide v9, v0, Lyo0/h;->G:J

    iget-object v11, v0, Lyo0/h;->H:Lc93/a;

    iget v12, v0, Lyo0/h;->I:I

    iget v13, v0, Lyo0/h;->J:I

    invoke-static/range {v1 .. v15}, Lyo0/i;->b(Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lb91/a;JIJJLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
