.class public final Lhz0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhz0/b;->e(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 20

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    const v0, 0x1e1163d6

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ly81/f;->BACKGROUND_DARK_STD:Ly81/f;

    const/4 v1, 0x6

    invoke-virtual {v0, v4, v1}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    sget-object v0, Li2/w0;->a:Li2/v0;

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v5, v6, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v5, 0x10

    int-to-float v5, v5

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v4, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v4, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v4, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v4, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v5, Lhz0/c;

    const/high16 v10, 0x3f400000    # 0.75f

    sget-object v11, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    const-string v6, "Left Label"

    const-string v7, "Left Sublabel"

    const-string v8, "Right Label"

    const-string v9, "Right Sublabel"

    invoke-direct/range {v5 .. v11}, Lhz0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLy81/f;)V

    const/4 v0, 0x0

    invoke-static {v0, v5, v4, v2, v3}, Lhz0/b;->c(Landroidx/compose/ui/Modifier;Lhz0/c;Landroidx/compose/runtime/Composer;II)V

    new-instance v6, Lhz0/c;

    const/16 v13, 0x2a

    const/4 v14, 0x0

    const-string v7, "Only Labels"

    const/4 v8, 0x0

    const-string v9, "No Sublabels"

    const/4 v10, 0x0

    const/high16 v11, 0x3f000000    # 0.5f

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lhz0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v6, v4, v2, v3}, Lhz0/b;->c(Landroidx/compose/ui/Modifier;Lhz0/c;Landroidx/compose/runtime/Composer;II)V

    new-instance v7, Lhz0/c;

    const/16 v14, 0x25

    const/4 v15, 0x0

    const-string v9, "Only Sublabels"

    const-string v11, "No Labels"

    const/high16 v12, 0x3f000000    # 0.5f

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lhz0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v7, v4, v2, v3}, Lhz0/b;->c(Landroidx/compose/ui/Modifier;Lhz0/c;Landroidx/compose/runtime/Composer;II)V

    new-instance v8, Lhz0/c;

    const/16 v15, 0x26

    const/16 v16, 0x0

    const-string v9, "Left label"

    const/4 v11, 0x0

    const-string v12, "Right Sublabel"

    const/high16 v13, 0x3e800000    # 0.25f

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lhz0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v8, v4, v2, v3}, Lhz0/b;->c(Landroidx/compose/ui/Modifier;Lhz0/c;Landroidx/compose/runtime/Composer;II)V

    new-instance v9, Lhz0/c;

    const/16 v16, 0x2c

    const/16 v17, 0x0

    const-string v10, "Left label"

    const-string v11, "Left sublabel"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/high16 v14, 0x3e800000    # 0.25f

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lhz0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v9, v4, v2, v3}, Lhz0/b;->c(Landroidx/compose/ui/Modifier;Lhz0/c;Landroidx/compose/runtime/Composer;II)V

    new-instance v10, Lhz0/c;

    const/16 v17, 0x23

    const/16 v18, 0x0

    const/4 v11, 0x0

    const-string v13, "Right label"

    const-string v14, "Right sublabel"

    const/high16 v15, 0x3e800000    # 0.25f

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lhz0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v10, v4, v2, v3}, Lhz0/b;->c(Landroidx/compose/ui/Modifier;Lhz0/c;Landroidx/compose/runtime/Composer;II)V

    new-instance v11, Lhz0/c;

    const/16 v18, 0x2f

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, 0x3dcccccd    # 0.1f

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Lhz0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v11, v4, v2, v3}, Lhz0/b;->c(Landroidx/compose/ui/Modifier;Lhz0/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lhz0/b$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
