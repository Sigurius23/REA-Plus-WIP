.class public final synthetic Lf41/m;
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

.field public final synthetic L:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lkd1/o;Lf41/b;JIZLjava/lang/String;Lc93/m;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lf41/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf41/m;->y:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lf41/m;->I:Ljava/lang/Object;

    iput-object p3, p0, Lf41/m;->J:Ljava/lang/Object;

    iput-object p4, p0, Lf41/m;->K:Ljava/lang/Object;

    iput-wide p5, p0, Lf41/m;->z:J

    iput p7, p0, Lf41/m;->F:I

    iput-boolean p8, p0, Lf41/m;->E:Z

    iput-object p9, p0, Lf41/m;->x:Ljava/lang/Object;

    iput-object p10, p0, Lf41/m;->L:Ll83/e;

    iput p11, p0, Lf41/m;->G:I

    iput p12, p0, Lf41/m;->H:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lf41/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf41/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Lf41/m;->y:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lf41/m;->I:Ljava/lang/Object;

    iput-wide p4, p0, Lf41/m;->z:J

    iput-object p6, p0, Lf41/m;->J:Ljava/lang/Object;

    iput-boolean p7, p0, Lf41/m;->E:Z

    iput-object p8, p0, Lf41/m;->K:Ljava/lang/Object;

    iput p9, p0, Lf41/m;->F:I

    iput-object p10, p0, Lf41/m;->L:Ll83/e;

    iput p11, p0, Lf41/m;->G:I

    iput p12, p0, Lf41/m;->H:I

    return-void
.end method

.method public synthetic constructor <init>(Ll3/g;JLl3/v0;Landroidx/compose/ui/Modifier;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lf41/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf41/m;->I:Ljava/lang/Object;

    iput-wide p2, p0, Lf41/m;->z:J

    iput-object p4, p0, Lf41/m;->J:Ljava/lang/Object;

    iput-object p5, p0, Lf41/m;->y:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Lf41/m;->K:Ljava/lang/Object;

    iput-boolean p7, p0, Lf41/m;->E:Z

    iput p8, p0, Lf41/m;->F:I

    iput p9, p0, Lf41/m;->G:I

    iput-object p10, p0, Lf41/m;->x:Ljava/lang/Object;

    iput-object p11, p0, Lf41/m;->L:Ll83/e;

    iput p12, p0, Lf41/m;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lf41/m;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lf41/m;->I:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ll3/g;

    iget-object v1, v0, Lf41/m;->J:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ll3/v0;

    iget-object v1, v0, Lf41/m;->x:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lf41/m;->L:Ll83/e;

    move-object v12, v1

    check-cast v12, Lkotlin/jvm/functions/Function1;

    move-object/from16 v13, p1

    check-cast v13, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lf41/m;->H:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v14

    iget-wide v3, v0, Lf41/m;->z:J

    iget-object v6, v0, Lf41/m;->y:Landroidx/compose/ui/Modifier;

    iget-object v7, v0, Lf41/m;->K:Ljava/lang/Object;

    iget-boolean v8, v0, Lf41/m;->E:Z

    iget v9, v0, Lf41/m;->F:I

    iget v10, v0, Lf41/m;->G:I

    invoke-static/range {v2 .. v14}, Lup/d;->b(Ll3/g;JLl3/v0;Landroidx/compose/ui/Modifier;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lf41/m;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    iget-object v1, v0, Lf41/m;->I:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ljava/util/Map;

    iget-object v1, v0, Lf41/m;->J:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Ll3/v0;

    iget-object v1, v0, Lf41/m;->K:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Ll3/m0;

    iget-object v1, v0, Lf41/m;->L:Ll83/e;

    move-object v11, v1

    check-cast v11, Lc93/a;

    move-object/from16 v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lf41/m;->G:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v13

    iget-object v3, v0, Lf41/m;->y:Landroidx/compose/ui/Modifier;

    iget-wide v5, v0, Lf41/m;->z:J

    iget-boolean v8, v0, Lf41/m;->E:Z

    iget v10, v0, Lf41/m;->F:I

    iget v14, v0, Lf41/m;->H:I

    invoke-static/range {v2 .. v14}, Lup/d;->d(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    iget-object v1, v0, Lf41/m;->I:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lf41/m;->J:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lkd1/o;

    iget-object v1, v0, Lf41/m;->K:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lf41/b;

    iget-object v1, v0, Lf41/m;->x:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Ljava/lang/String;

    iget-object v1, v0, Lf41/m;->L:Ll83/e;

    move-object v11, v1

    check-cast v11, Lc93/m;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v2, v0, Lf41/m;->y:Landroidx/compose/ui/Modifier;

    iget-wide v6, v0, Lf41/m;->z:J

    iget v8, v0, Lf41/m;->F:I

    iget-boolean v9, v0, Lf41/m;->E:Z

    iget v12, v0, Lf41/m;->G:I

    iget v13, v0, Lf41/m;->H:I

    invoke-static/range {v2 .. v15}, Lf41/p;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lkd1/o;Lf41/b;JIZLjava/lang/String;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
