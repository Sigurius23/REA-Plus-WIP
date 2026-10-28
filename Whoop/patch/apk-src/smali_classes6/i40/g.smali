.class public final Li40/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Z

.field public final synthetic H:Lq3/g0;

.field public final synthetic I:Z

.field public final synthetic J:Lj0/i;

.field public final synthetic K:Li2/a1;

.field public final synthetic L:Lg1/y1;

.field public final synthetic M:Ll0/l1;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Z

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Lc93/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLc93/m;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;ZLj0/i;Li2/a1;Lg1/y1;Ll0/l1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li40/g;->w:Ljava/lang/String;

    iput-boolean p2, p0, Li40/g;->x:Z

    iput-object p3, p0, Li40/g;->y:Lc93/m;

    iput-object p4, p0, Li40/g;->z:Lc93/m;

    iput-object p5, p0, Li40/g;->E:Lc93/m;

    iput-object p6, p0, Li40/g;->F:Lc93/m;

    iput-boolean p7, p0, Li40/g;->G:Z

    iput-object p8, p0, Li40/g;->H:Lq3/g0;

    iput-boolean p9, p0, Li40/g;->I:Z

    iput-object p10, p0, Li40/g;->J:Lj0/i;

    iput-object p11, p0, Li40/g;->K:Li2/a1;

    iput-object p12, p0, Li40/g;->L:Lg1/y1;

    iput-object p13, p0, Li40/g;->M:Ll0/l1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lc93/m;

    move-object/from16 v15, p2

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const-string v3, "innerTextField"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_1

    move-object v3, v15

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v1, v3

    :cond_1
    and-int/lit8 v3, v1, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    move-object v3, v15

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    goto :goto_2

    :cond_3
    :goto_1
    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v16, v1, 0x70

    iget-object v1, v0, Li40/g;->w:Ljava/lang/String;

    iget-boolean v3, v0, Li40/g;->x:Z

    iget-object v4, v0, Li40/g;->y:Lc93/m;

    iget-object v5, v0, Li40/g;->z:Lc93/m;

    iget-object v6, v0, Li40/g;->E:Lc93/m;

    iget-object v7, v0, Li40/g;->F:Lc93/m;

    iget-boolean v8, v0, Li40/g;->G:Z

    iget-object v9, v0, Li40/g;->H:Lq3/g0;

    iget-boolean v10, v0, Li40/g;->I:Z

    iget-object v11, v0, Li40/g;->J:Lj0/i;

    iget-object v12, v0, Li40/g;->K:Li2/a1;

    iget-object v13, v0, Li40/g;->L:Lg1/y1;

    iget-object v14, v0, Li40/g;->M:Ll0/l1;

    invoke-static/range {v1 .. v16}, Lvp/c;->n(Ljava/lang/String;Lc93/m;ZLc93/m;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;ZLj0/i;Li2/a1;Lg1/e8;Ll0/k1;Landroidx/compose/runtime/Composer;I)V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
