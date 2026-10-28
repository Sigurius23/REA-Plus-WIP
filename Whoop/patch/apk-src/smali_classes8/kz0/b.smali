.class public final synthetic Lkz0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Ljava/util/List;

.field public final synthetic G:I

.field public final synthetic H:F

.field public final synthetic I:Li2/a1;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;IIJJLjava/util/List;IFLi2/a1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkz0/b;->w:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lkz0/b;->x:I

    iput p3, p0, Lkz0/b;->y:I

    iput-wide p4, p0, Lkz0/b;->z:J

    iput-wide p6, p0, Lkz0/b;->E:J

    iput-object p8, p0, Lkz0/b;->F:Ljava/util/List;

    iput p9, p0, Lkz0/b;->G:I

    iput p10, p0, Lkz0/b;->H:F

    iput-object p11, p0, Lkz0/b;->I:Li2/a1;

    iput p12, p0, Lkz0/b;->J:I

    iput p13, p0, Lkz0/b;->K:I

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

    iget-object v1, v0, Lkz0/b;->w:Landroidx/compose/ui/Modifier;

    iget v2, v0, Lkz0/b;->x:I

    iget v3, v0, Lkz0/b;->y:I

    iget-wide v4, v0, Lkz0/b;->z:J

    iget-wide v6, v0, Lkz0/b;->E:J

    iget-object v8, v0, Lkz0/b;->F:Ljava/util/List;

    iget v9, v0, Lkz0/b;->G:I

    iget v10, v0, Lkz0/b;->H:F

    iget-object v11, v0, Lkz0/b;->I:Li2/a1;

    iget v12, v0, Lkz0/b;->J:I

    iget v13, v0, Lkz0/b;->K:I

    invoke-static/range {v1 .. v15}, Lkz0/c;->a(Landroidx/compose/ui/Modifier;IIJJLjava/util/List;IFLi2/a1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
