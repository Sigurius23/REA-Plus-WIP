.class public final synthetic Lt20/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lg40/m3;

.field public final synthetic G:Lg40/m3;

.field public final synthetic H:Lg40/z1;

.field public final synthetic I:Lg40/e;

.field public final synthetic J:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final synthetic K:Lg40/v2;

.field public final synthetic L:Lx30/i1;

.field public final synthetic M:Lx30/n1;

.field public final synthetic N:Landroidx/compose/ui/Modifier;

.field public final synthetic O:Z

.field public final synthetic P:Lc93/a;

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic w:Lt20/g;

.field public final synthetic x:Ls20/a;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lt20/g;Ls20/a;ZZZLg40/m3;Lg40/m3;Lg40/z1;Lg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;Lx30/i1;Lx30/n1;Landroidx/compose/ui/Modifier;ZLc93/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt20/p;->w:Lt20/g;

    iput-object p2, p0, Lt20/p;->x:Ls20/a;

    iput-boolean p3, p0, Lt20/p;->y:Z

    iput-boolean p4, p0, Lt20/p;->z:Z

    iput-boolean p5, p0, Lt20/p;->E:Z

    iput-object p6, p0, Lt20/p;->F:Lg40/m3;

    iput-object p7, p0, Lt20/p;->G:Lg40/m3;

    iput-object p8, p0, Lt20/p;->H:Lg40/z1;

    iput-object p9, p0, Lt20/p;->I:Lg40/e;

    iput-object p10, p0, Lt20/p;->J:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p11, p0, Lt20/p;->K:Lg40/v2;

    iput-object p12, p0, Lt20/p;->L:Lx30/i1;

    iput-object p13, p0, Lt20/p;->M:Lx30/n1;

    iput-object p14, p0, Lt20/p;->N:Landroidx/compose/ui/Modifier;

    iput-boolean p15, p0, Lt20/p;->O:Z

    move-object/from16 p1, p16

    iput-object p1, p0, Lt20/p;->P:Lc93/a;

    move/from16 p1, p17

    iput p1, p0, Lt20/p;->Q:I

    move/from16 p1, p18

    iput p1, p0, Lt20/p;->R:I

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

    iget v1, v0, Lt20/p;->Q:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v18

    iget v1, v0, Lt20/p;->R:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v19

    iget-object v1, v0, Lt20/p;->w:Lt20/g;

    iget-object v2, v0, Lt20/p;->x:Ls20/a;

    iget-boolean v3, v0, Lt20/p;->y:Z

    iget-boolean v4, v0, Lt20/p;->z:Z

    iget-boolean v5, v0, Lt20/p;->E:Z

    iget-object v6, v0, Lt20/p;->F:Lg40/m3;

    iget-object v7, v0, Lt20/p;->G:Lg40/m3;

    iget-object v8, v0, Lt20/p;->H:Lg40/z1;

    iget-object v9, v0, Lt20/p;->I:Lg40/e;

    iget-object v10, v0, Lt20/p;->J:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v11, v0, Lt20/p;->K:Lg40/v2;

    iget-object v12, v0, Lt20/p;->L:Lx30/i1;

    iget-object v13, v0, Lt20/p;->M:Lx30/n1;

    iget-object v14, v0, Lt20/p;->N:Landroidx/compose/ui/Modifier;

    iget-boolean v15, v0, Lt20/p;->O:Z

    move-object/from16 v16, v1

    iget-object v1, v0, Lt20/p;->P:Lc93/a;

    move-object/from16 v20, v16

    move-object/from16 v16, v1

    move-object/from16 v1, v20

    invoke-static/range {v1 .. v19}, Ls9/f;->f(Lt20/g;Ls20/a;ZZZLg40/m3;Lg40/m3;Lg40/z1;Lg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/v2;Lx30/i1;Lx30/n1;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
