.class public final Lf01/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf01/g0;->g(Landroidx/compose/runtime/Composer;I)V
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
    .locals 7

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
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    const p2, 0x4c3a69cc    # 4.886712E7f

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    int-to-float p2, v2

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p2, v0

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {p2, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    int-to-float v3, v3

    mul-float/2addr v3, v0

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v0, v3, p1, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v3, p1, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v6, p1, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {p1, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p1, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p1, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, p1, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, p1, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p1, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance p2, Lf01/h0;

    new-instance v0, Lf01/e0;

    const-string v3, "Why Does It Matter?"

    const-string v4, "If your blood pressure is higher than normal, your heart is working harder than usual to pump blood. This can affect your **health and well-being** today and long term.\n\nLearn more at [whoop.com/health](https://whoop.com)"

    invoke-direct {v0, v3, v4, v2}, Lf01/e0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v3, Lf01/e0;

    const-string v4, "What Should I Do?"

    const-string v5, "Consider lifestyle changes like reducing salt intake, managing stress, and staying active. Consistent high readings should be discussed with a healthcare provider."

    invoke-direct {v3, v4, v5, v2}, Lf01/e0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v4, Lf01/e0;

    const-string v5, "Track Your Progress"

    const-string v6, "Monitor your blood pressure regularly to see how your behaviors impact your cardiovascular health over time."

    invoke-direct {v4, v5, v6, v2}, Lf01/e0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    filled-new-array {v0, v3, v4}, [Lf01/e0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p2, v0}, Lf01/h0;-><init>(Ljava/util/List;)V

    const/4 v0, 0x0

    invoke-static {v0, p2, p1, v1, v2}, Lf01/g0;->d(Landroidx/compose/ui/Modifier;Lf01/h0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

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

    invoke-virtual {p0, p1, p2}, Lf01/g0$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
