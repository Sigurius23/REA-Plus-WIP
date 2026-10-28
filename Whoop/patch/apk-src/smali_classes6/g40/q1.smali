.class public final synthetic Lg40/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll3/v0;

.field public final synthetic F:F

.field public final synthetic G:F

.field public final synthetic H:Ljava/lang/String;

.field public final synthetic I:Lg40/p1;

.field public final synthetic J:F

.field public final synthetic K:Lg2/s;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic w:Z

.field public final synthetic x:Lg40/o1;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Li2/a1;


# direct methods
.method public synthetic constructor <init>(ZLg40/o1;Landroidx/compose/ui/Modifier;Li2/a1;Ll3/v0;FFLjava/lang/String;Lg40/p1;FLg2/s;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg40/q1;->w:Z

    iput-object p2, p0, Lg40/q1;->x:Lg40/o1;

    iput-object p3, p0, Lg40/q1;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lg40/q1;->z:Li2/a1;

    iput-object p5, p0, Lg40/q1;->E:Ll3/v0;

    iput p6, p0, Lg40/q1;->F:F

    iput p7, p0, Lg40/q1;->G:F

    iput-object p8, p0, Lg40/q1;->H:Ljava/lang/String;

    iput-object p9, p0, Lg40/q1;->I:Lg40/p1;

    iput p10, p0, Lg40/q1;->J:F

    iput-object p11, p0, Lg40/q1;->K:Lg2/s;

    iput p12, p0, Lg40/q1;->L:I

    iput p13, p0, Lg40/q1;->M:I

    iput p14, p0, Lg40/q1;->N:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lg40/q1;->L:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v13

    iget v1, v0, Lg40/q1;->M:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v14

    iget-boolean v1, v0, Lg40/q1;->w:Z

    iget-object v2, v0, Lg40/q1;->x:Lg40/o1;

    iget-object v3, v0, Lg40/q1;->y:Landroidx/compose/ui/Modifier;

    iget-object v4, v0, Lg40/q1;->z:Li2/a1;

    iget-object v5, v0, Lg40/q1;->E:Ll3/v0;

    iget v6, v0, Lg40/q1;->F:F

    iget v7, v0, Lg40/q1;->G:F

    iget-object v8, v0, Lg40/q1;->H:Ljava/lang/String;

    iget-object v9, v0, Lg40/q1;->I:Lg40/p1;

    iget v10, v0, Lg40/q1;->J:F

    iget-object v11, v0, Lg40/q1;->K:Lg2/s;

    iget v15, v0, Lg40/q1;->N:I

    invoke-static/range {v1 .. v15}, Ldc/a;->g(ZLg40/o1;Landroidx/compose/ui/Modifier;Li2/a1;Ll3/v0;FFLjava/lang/String;Lg40/p1;FLg2/s;Landroidx/compose/runtime/Composer;III)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
