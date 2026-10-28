.class public final Lq81/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq81/g;->A(Landroidx/compose/runtime/Composer;I)V
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
    .locals 12

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
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    const p2, -0x6604ced5

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p2}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v1, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v1, v4

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v1, v4, p1, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, p1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v7, p1, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {p1, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p1, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p1, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, p1, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, p1, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p1, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0xc8

    int-to-float v0, v0

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v4, Lq81/c;

    sget-object v5, Lq81/i;->ACTIVE:Lq81/i;

    new-instance v6, Lcom/whoop/design/util/TextResource$e;

    const-string v7, "ACTIVE"

    invoke-direct {v6, v7}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    const-string v9, "05:30"

    invoke-direct {v8, v9}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v4, v5, v6, v8, v9}, Lq81/c;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;F)V

    const/16 v6, 0x30

    invoke-static {v4, v1, p1, v6}, Lq81/g;->o(Lq81/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/16 v1, 0xb4

    int-to-float v1, v1

    invoke-static {v1, p2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v4, Lq81/c;

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v8, v7}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v10, Lcom/whoop/design/util/TextResource$e;

    const-string v11, "02:13"

    invoke-direct {v10, v11}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    const v11, 0x3f333333    # 0.7f

    invoke-direct {v4, v5, v8, v10, v11}, Lq81/c;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;F)V

    invoke-static {v4, v1, p1, v6}, Lq81/g;->o(Lq81/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Lq81/g;->R()F

    move-result v1

    invoke-static {v1, p2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v4, Lq81/c;

    sget-object v5, Lq81/i;->REST:Lq81/i;

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    const-string v10, "REST"

    invoke-direct {v8, v10}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v10, Lcom/whoop/design/util/TextResource$e;

    const-string v11, "00:12"

    invoke-direct {v10, v11}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v4, v5, v8, v10, v9}, Lq81/c;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;F)V

    invoke-static {v4, v1, p1, v6}, Lq81/g;->o(Lq81/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v4, Lq81/c;

    sget-object v5, Lq81/i;->WARMUP:Lq81/i;

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    const-string v10, "WARMUP"

    invoke-direct {v8, v10}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v10, Lcom/whoop/design/util/TextResource$e;

    const-string v11, "00:00"

    invoke-direct {v10, v11}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v4, v5, v8, v10, v9}, Lq81/c;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;F)V

    invoke-static {v4, v1, p1, v6}, Lq81/g;->o(Lq81/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v1, Lq81/c;

    sget-object v4, Lq81/i;->COOLDOWN:Lq81/i;

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    const-string v8, "COOLDOWN"

    invoke-direct {v5, v8}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    const-string v10, "11:47"

    invoke-direct {v8, v10}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v1, v4, v5, v8, v9}, Lq81/c;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;F)V

    invoke-static {v1, v0, p1, v6}, Lq81/g;->o(Lq81/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/16 v0, 0xdc

    int-to-float v0, v0

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    new-instance v0, Lq81/c;

    sget-object v1, Lq81/i;->TARGET_TIME_ELAPSED:Lq81/i;

    new-instance v4, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v4, v7}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    const-string v7, "00:06"

    invoke-direct {v5, v7}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v0, v1, v4, v5, v9}, Lq81/c;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;F)V

    invoke-static {v0, p2, p1, v6}, Lq81/g;->o(Lq81/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lq81/g$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
