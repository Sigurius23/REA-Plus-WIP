.class public final Lv21/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv21/b;->m(Landroidx/compose/runtime/Composer;I)V
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

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    const v0, 0x12790eaf

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v0}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, v8, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v8, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v6, Lv21/c;

    new-instance v10, Lcom/whoop/design/util/TextResource$e;

    const-string v0, "This is neutral information."

    invoke-direct {v10, v0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sget-object v13, Ly81/f;->RECOVERY:Ly81/f;

    sget-object v14, Ly81/f;->NEUTRAL_15:Ly81/f;

    const/16 v16, 0x20

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    move-object v9, v6

    invoke-direct/range {v9 .. v17}, Lv21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly81/e;Ly81/e;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x5

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lv21/b;->g(Landroidx/compose/ui/Modifier;Lv21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v6, Lv21/c;

    new-instance v12, Lcom/whoop/design/util/TextResource$e;

    const-string v0, "Confirm your cycle phase to unlock personalized hormone insights."

    invoke-direct {v12, v0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    move-object v15, v13

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    const-string v0, "CONFIRM"

    invoke-direct {v13, v0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    const/16 v18, 0x20

    const/16 v19, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object v11, v6

    invoke-direct/range {v11 .. v19}, Lv21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly81/e;Ly81/e;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v5 .. v10}, Lv21/b;->g(Landroidx/compose/ui/Modifier;Lv21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v6, Lv21/c;

    new-instance v10, Lcom/whoop/design/util/TextResource$e;

    const-string v0, "This is concerning information with a call to action."

    invoke-direct {v10, v0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v11, Lcom/whoop/design/util/TextResource$e;

    const-string v0, "TAKE ACTION"

    invoke-direct {v11, v0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sget-object v13, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    sget-object v14, Ly81/f;->ACCENT_NEGATIVE_TREND_15:Ly81/f;

    const/16 v16, 0x20

    const/4 v12, 0x0

    const/4 v15, 0x0

    move-object v9, v6

    invoke-direct/range {v9 .. v17}, Lv21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly81/e;Ly81/e;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x5

    invoke-static/range {v5 .. v10}, Lv21/b;->g(Landroidx/compose/ui/Modifier;Lv21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v6, Lv21/c;

    new-instance v10, Lcom/whoop/design/util/TextResource$e;

    const-string v3, "This is alerting information with a call to action."

    invoke-direct {v10, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v11, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v11, v0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sget-object v13, Ly81/f;->ACCENT_ALERT:Ly81/f;

    sget-object v14, Ly81/f;->ACCENT_ALERT_TREND_15:Ly81/f;

    move-object v9, v6

    invoke-direct/range {v9 .. v17}, Lv21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly81/e;Ly81/e;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x5

    invoke-static/range {v5 .. v10}, Lv21/b;->g(Landroidx/compose/ui/Modifier;Lv21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v6, Lv21/c;

    new-instance v10, Lcom/whoop/design/util/TextResource$e;

    const-string v0, "This is positive information."

    invoke-direct {v10, v0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v11, Lcom/whoop/design/util/TextResource$e;

    const-string v0, "VIEW DETAILS"

    invoke-direct {v11, v0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sget-object v13, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    sget-object v14, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    move-object v9, v6

    invoke-direct/range {v9 .. v17}, Lv21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly81/e;Ly81/e;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x5

    invoke-static/range {v5 .. v10}, Lv21/b;->g(Landroidx/compose/ui/Modifier;Lv21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv21/b$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
