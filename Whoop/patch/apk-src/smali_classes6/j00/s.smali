.class public final synthetic Lj00/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lg40/m3;

.field public final synthetic F:Ln00/d;

.field public final synthetic G:Z

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic K:Z

.field public final synthetic L:Z

.field public final synthetic M:Ljava/lang/String;

.field public final synthetic N:Lc93/a;

.field public final synthetic O:Lc93/a;

.field public final synthetic P:Landroidx/compose/ui/Modifier;

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:La33/d;

.field public final synthetic y:Lg40/m3;

.field public final synthetic z:Lg40/z1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;La33/d;Lg40/m3;Lg40/z1;Lg40/m3;Ln00/d;ZZZZZZLjava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj00/s;->w:Ljava/lang/String;

    iput-object p2, p0, Lj00/s;->x:La33/d;

    iput-object p3, p0, Lj00/s;->y:Lg40/m3;

    iput-object p4, p0, Lj00/s;->z:Lg40/z1;

    iput-object p5, p0, Lj00/s;->E:Lg40/m3;

    iput-object p6, p0, Lj00/s;->F:Ln00/d;

    iput-boolean p7, p0, Lj00/s;->G:Z

    iput-boolean p8, p0, Lj00/s;->H:Z

    iput-boolean p9, p0, Lj00/s;->I:Z

    iput-boolean p10, p0, Lj00/s;->J:Z

    iput-boolean p11, p0, Lj00/s;->K:Z

    iput-boolean p12, p0, Lj00/s;->L:Z

    iput-object p13, p0, Lj00/s;->M:Ljava/lang/String;

    iput-object p14, p0, Lj00/s;->N:Lc93/a;

    iput-object p15, p0, Lj00/s;->O:Lc93/a;

    move-object/from16 p1, p16

    iput-object p1, p0, Lj00/s;->P:Landroidx/compose/ui/Modifier;

    move/from16 p1, p17

    iput p1, p0, Lj00/s;->Q:I

    move/from16 p1, p18

    iput p1, p0, Lj00/s;->R:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    check-cast v17, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lj00/s;->Q:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v18

    iget v1, v0, Lj00/s;->R:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v19

    iget-object v1, v0, Lj00/s;->w:Ljava/lang/String;

    iget-object v2, v0, Lj00/s;->x:La33/d;

    iget-object v3, v0, Lj00/s;->y:Lg40/m3;

    iget-object v4, v0, Lj00/s;->z:Lg40/z1;

    iget-object v5, v0, Lj00/s;->E:Lg40/m3;

    iget-object v6, v0, Lj00/s;->F:Ln00/d;

    iget-boolean v7, v0, Lj00/s;->G:Z

    iget-boolean v8, v0, Lj00/s;->H:Z

    iget-boolean v9, v0, Lj00/s;->I:Z

    iget-boolean v10, v0, Lj00/s;->J:Z

    iget-boolean v11, v0, Lj00/s;->K:Z

    iget-boolean v12, v0, Lj00/s;->L:Z

    iget-object v13, v0, Lj00/s;->M:Ljava/lang/String;

    iget-object v14, v0, Lj00/s;->N:Lc93/a;

    iget-object v15, v0, Lj00/s;->O:Lc93/a;

    move-object/from16 v16, v1

    iget-object v1, v0, Lj00/s;->P:Landroidx/compose/ui/Modifier;

    move-object/from16 v20, v16

    move-object/from16 v16, v1

    move-object/from16 v1, v20

    invoke-static/range {v1 .. v19}, Luf/c0;->q(Ljava/lang/String;La33/d;Lg40/m3;Lg40/z1;Lg40/m3;Ln00/d;ZZZZZZLjava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
