.class public final synthetic Ll1/f4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lq3/g0;

.field public final synthetic G:Lj0/i;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:Li2/a1;

.field public final synthetic J:Ll1/e4;

.field public final synthetic K:Ll0/k1;

.field public final synthetic L:Lc93/m;

.field public final synthetic M:I

.field public final synthetic w:Ll1/h4;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ll1/h4;Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;Lc93/m;Li2/a1;Ll1/e4;Ll0/k1;Lc93/m;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/f4;->w:Ll1/h4;

    iput-object p2, p0, Ll1/f4;->x:Ljava/lang/String;

    iput-object p3, p0, Ll1/f4;->y:Lc93/m;

    iput-boolean p4, p0, Ll1/f4;->z:Z

    iput-boolean p5, p0, Ll1/f4;->E:Z

    iput-object p6, p0, Ll1/f4;->F:Lq3/g0;

    iput-object p7, p0, Ll1/f4;->G:Lj0/i;

    iput-object p8, p0, Ll1/f4;->H:Lc93/m;

    iput-object p9, p0, Ll1/f4;->I:Li2/a1;

    iput-object p10, p0, Ll1/f4;->J:Ll1/e4;

    iput-object p11, p0, Ll1/f4;->K:Ll0/k1;

    iput-object p12, p0, Ll1/f4;->L:Lc93/m;

    iput p13, p0, Ll1/f4;->M:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ll1/f4;->M:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v13

    iget-object v0, p0, Ll1/f4;->w:Ll1/h4;

    iget-object v1, p0, Ll1/f4;->x:Ljava/lang/String;

    iget-object v2, p0, Ll1/f4;->y:Lc93/m;

    iget-boolean v3, p0, Ll1/f4;->z:Z

    iget-boolean v4, p0, Ll1/f4;->E:Z

    iget-object v5, p0, Ll1/f4;->F:Lq3/g0;

    iget-object v6, p0, Ll1/f4;->G:Lj0/i;

    iget-object v7, p0, Ll1/f4;->H:Lc93/m;

    iget-object v8, p0, Ll1/f4;->I:Li2/a1;

    iget-object v9, p0, Ll1/f4;->J:Ll1/e4;

    iget-object v10, p0, Ll1/f4;->K:Ll0/k1;

    iget-object v11, p0, Ll1/f4;->L:Lc93/m;

    invoke-virtual/range {v0 .. v13}, Ll1/h4;->b(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;Lc93/m;Li2/a1;Ll1/e4;Ll0/k1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
