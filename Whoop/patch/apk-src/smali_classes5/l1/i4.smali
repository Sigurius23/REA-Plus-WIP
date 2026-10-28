.class public final synthetic Ll1/i4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Lc93/m;

.field public final synthetic H:Z

.field public final synthetic I:Ll1/k4;

.field public final synthetic J:Lm1/k0;

.field public final synthetic K:Lx1/b;

.field public final synthetic L:Lc93/m;

.field public final synthetic M:Ll0/k1;

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic w:Lc93/m;

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lkotlin/jvm/functions/Function3;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLl1/k4;Lm1/k0;Lx1/b;Lc93/m;Ll0/k1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/i4;->w:Lc93/m;

    iput-object p2, p0, Ll1/i4;->x:Lc93/m;

    iput-object p3, p0, Ll1/i4;->y:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Ll1/i4;->z:Lc93/m;

    iput-object p5, p0, Ll1/i4;->E:Lc93/m;

    iput-object p6, p0, Ll1/i4;->F:Lc93/m;

    iput-object p7, p0, Ll1/i4;->G:Lc93/m;

    iput-boolean p8, p0, Ll1/i4;->H:Z

    iput-object p9, p0, Ll1/i4;->I:Ll1/k4;

    iput-object p10, p0, Ll1/i4;->J:Lm1/k0;

    iput-object p11, p0, Ll1/i4;->K:Lx1/b;

    iput-object p12, p0, Ll1/i4;->L:Lc93/m;

    iput-object p13, p0, Ll1/i4;->M:Ll0/k1;

    iput p14, p0, Ll1/i4;->N:I

    iput p15, p0, Ll1/i4;->O:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Ll1/i4;->N:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v15

    iget v1, v0, Ll1/i4;->O:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v16

    iget-object v1, v0, Ll1/i4;->w:Lc93/m;

    iget-object v2, v0, Ll1/i4;->x:Lc93/m;

    iget-object v3, v0, Ll1/i4;->y:Lkotlin/jvm/functions/Function3;

    iget-object v4, v0, Ll1/i4;->z:Lc93/m;

    iget-object v5, v0, Ll1/i4;->E:Lc93/m;

    iget-object v6, v0, Ll1/i4;->F:Lc93/m;

    iget-object v7, v0, Ll1/i4;->G:Lc93/m;

    iget-boolean v8, v0, Ll1/i4;->H:Z

    iget-object v9, v0, Ll1/i4;->I:Ll1/k4;

    iget-object v10, v0, Ll1/i4;->J:Lm1/k0;

    iget-object v11, v0, Ll1/i4;->K:Lx1/b;

    iget-object v12, v0, Ll1/i4;->L:Lc93/m;

    iget-object v13, v0, Ll1/i4;->M:Ll0/k1;

    invoke-static/range {v1 .. v16}, Ll1/j4;->b(Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLl1/k4;Lm1/k0;Lx1/b;Lc93/m;Ll0/k1;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
