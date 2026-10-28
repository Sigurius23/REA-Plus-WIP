.class public final synthetic Ll1/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic F:Ll1/w3;

.field public final synthetic G:F

.field public final synthetic H:Z

.field public final synthetic I:Li2/a1;

.field public final synthetic J:J

.field public final synthetic K:J

.field public final synthetic L:F

.field public final synthetic M:Lc93/m;

.field public final synthetic N:Lc93/m;

.field public final synthetic O:Lx1/b;

.field public final synthetic w:Ld0/e;

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ld0/e;Lbc3/c0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ll1/w3;FZLi2/a1;JJFLc93/m;Lc93/m;Lx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/h2;->w:Ld0/e;

    iput-object p2, p0, Ll1/h2;->x:Lbc3/c0;

    iput-object p3, p0, Ll1/h2;->y:Lc93/a;

    iput-object p4, p0, Ll1/h2;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ll1/h2;->E:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Ll1/h2;->F:Ll1/w3;

    iput p7, p0, Ll1/h2;->G:F

    iput-boolean p8, p0, Ll1/h2;->H:Z

    iput-object p9, p0, Ll1/h2;->I:Li2/a1;

    iput-wide p10, p0, Ll1/h2;->J:J

    iput-wide p12, p0, Ll1/h2;->K:J

    iput p14, p0, Ll1/h2;->L:F

    iput-object p15, p0, Ll1/h2;->M:Lc93/m;

    move-object/from16 p1, p16

    iput-object p1, p0, Ll1/h2;->N:Lc93/m;

    move-object/from16 p1, p17

    iput-object p1, p0, Ll1/h2;->O:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0x47

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v19

    iget-object v1, v0, Ll1/h2;->w:Ld0/e;

    iget-object v2, v0, Ll1/h2;->x:Lbc3/c0;

    iget-object v3, v0, Ll1/h2;->y:Lc93/a;

    iget-object v4, v0, Ll1/h2;->z:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Ll1/h2;->E:Landroidx/compose/ui/Modifier;

    iget-object v6, v0, Ll1/h2;->F:Ll1/w3;

    iget v7, v0, Ll1/h2;->G:F

    iget-boolean v8, v0, Ll1/h2;->H:Z

    iget-object v9, v0, Ll1/h2;->I:Li2/a1;

    iget-wide v10, v0, Ll1/h2;->J:J

    iget-wide v12, v0, Ll1/h2;->K:J

    iget v14, v0, Ll1/h2;->L:F

    iget-object v15, v0, Ll1/h2;->M:Lc93/m;

    move-object/from16 v16, v1

    iget-object v1, v0, Ll1/h2;->N:Lc93/m;

    move-object/from16 v17, v1

    iget-object v1, v0, Ll1/h2;->O:Lx1/b;

    move-object/from16 v20, v17

    move-object/from16 v17, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v20

    invoke-static/range {v1 .. v19}, Ll1/n2;->c(Ld0/e;Lbc3/c0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ll1/w3;FZLi2/a1;JJFLc93/m;Lc93/m;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
