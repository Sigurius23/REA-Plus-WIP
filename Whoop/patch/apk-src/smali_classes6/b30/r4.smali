.class public final synthetic Lb30/r4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;II)V
    .locals 0

    .line 1
    const/4 p9, 0x1

    iput p9, p0, Lb30/r4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/r4;->x:Z

    iput-object p2, p0, Lb30/r4;->G:Ljava/lang/Object;

    iput-object p3, p0, Lb30/r4;->y:Ljava/lang/Object;

    iput-object p4, p0, Lb30/r4;->H:Ljava/lang/Object;

    iput-boolean p5, p0, Lb30/r4;->z:Z

    iput-boolean p6, p0, Lb30/r4;->E:Z

    iput-object p7, p0, Lb30/r4;->I:Ljava/lang/Object;

    iput p8, p0, Lb30/r4;->F:I

    return-void
.end method

.method public synthetic constructor <init>(ZLq3/y;ZLql0/c;Lc93/a;Lc93/a;IZ)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lb30/r4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/r4;->x:Z

    iput-object p2, p0, Lb30/r4;->H:Ljava/lang/Object;

    iput-boolean p3, p0, Lb30/r4;->z:Z

    iput-object p4, p0, Lb30/r4;->y:Ljava/lang/Object;

    iput-object p5, p0, Lb30/r4;->G:Ljava/lang/Object;

    iput-object p6, p0, Lb30/r4;->I:Ljava/lang/Object;

    iput p7, p0, Lb30/r4;->F:I

    iput-boolean p8, p0, Lb30/r4;->E:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZLc93/a;Ll0/l1;Landroidx/compose/ui/Modifier;Lx1/b;I)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lb30/r4;->w:I

    sget-object v0, Ll0/m;->a:Ll0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/r4;->x:Z

    iput-boolean p2, p0, Lb30/r4;->z:Z

    iput-boolean p3, p0, Lb30/r4;->E:Z

    iput-object p4, p0, Lb30/r4;->G:Ljava/lang/Object;

    iput-object p5, p0, Lb30/r4;->H:Ljava/lang/Object;

    iput-object p6, p0, Lb30/r4;->y:Ljava/lang/Object;

    iput-object p7, p0, Lb30/r4;->I:Ljava/lang/Object;

    iput p8, p0, Lb30/r4;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lb30/r4;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, v0, Lb30/r4;->I:Ljava/lang/Object;

    iget-object v4, v0, Lb30/r4;->G:Ljava/lang/Object;

    iget-object v5, v0, Lb30/r4;->y:Ljava/lang/Object;

    iget-object v6, v0, Lb30/r4;->H:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object v8, v6

    check-cast v8, Lq3/y;

    move-object v10, v5

    check-cast v10, Lql0/c;

    move-object v11, v4

    check-cast v11, Lc93/a;

    move-object v12, v3

    check-cast v12, Lc93/a;

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-boolean v7, v0, Lb30/r4;->x:Z

    iget-boolean v9, v0, Lb30/r4;->z:Z

    iget v13, v0, Lb30/r4;->F:I

    iget-boolean v14, v0, Lb30/r4;->E:Z

    invoke-static/range {v7 .. v16}, Lsl0/p3;->d(ZLq3/y;ZLql0/c;Lc93/a;Lc93/a;IZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v4, Lg40/z1;

    check-cast v5, Landroidx/compose/ui/Modifier;

    check-cast v6, Lc93/m;

    move-object v9, v3

    check-cast v9, Lg2/s;

    move-object/from16 v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0x41

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v12

    iget-boolean v3, v0, Lb30/r4;->x:Z

    iget-boolean v7, v0, Lb30/r4;->z:Z

    iget-boolean v8, v0, Lb30/r4;->E:Z

    iget v10, v0, Lb30/r4;->F:I

    invoke-static/range {v3 .. v12}, Ldp/d;->f(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;ILandroidx/compose/runtime/Composer;I)V

    return-object v2

    :pswitch_1
    move-object/from16 v16, v4

    check-cast v16, Lc93/a;

    move-object/from16 v17, v6

    check-cast v17, Ll0/l1;

    sget-object v1, Ll0/m;->a:Ll0/e;

    move-object/from16 v18, v5

    check-cast v18, Landroidx/compose/ui/Modifier;

    move-object/from16 v19, v3

    check-cast v19, Lx1/b;

    move-object/from16 v20, p1

    check-cast v20, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lb30/r4;->F:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v21

    iget-boolean v13, v0, Lb30/r4;->x:Z

    iget-boolean v14, v0, Lb30/r4;->z:Z

    iget-boolean v15, v0, Lb30/r4;->E:Z

    invoke-static/range {v13 .. v21}, Lse/a;->m(ZZZLc93/a;Ll0/l1;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
