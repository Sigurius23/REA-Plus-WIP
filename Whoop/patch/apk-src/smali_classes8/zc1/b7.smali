.class public abstract Lzc1/b7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000e\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\"\u0017\u0010\u0008\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\"\u0017\u0010\u000b\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0005\u001a\u0004\u0008\n\u0010\u0007\"\u0017\u0010\u000e\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0005\u001a\u0004\u0008\r\u0010\u0007\" \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\" \u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0012\u001a\u0004\u0008\u0017\u0010\u0014\" \u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0012\u001a\u0004\u0008\u0019\u0010\u0014\" \u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0012\u001a\u0004\u0008\u001c\u0010\u0014\u00a8\u0006\u001e"
    }
    d2 = {
        "Ll83/a0;",
        "f",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lsz0/c;",
        "a",
        "Lsz0/c;",
        "getSampleMedicalDisclaimerBothFeatures",
        "()Lsz0/c;",
        "sampleMedicalDisclaimerBothFeatures",
        "b",
        "getSampleMedicalDisclaimerECG",
        "sampleMedicalDisclaimerECG",
        "c",
        "getSampleMedicalDisclaimerIHRN",
        "sampleMedicalDisclaimerIHRN",
        "",
        "Lq31/a;",
        "d",
        "Ljava/util/List;",
        "getSampleSegment5ContentList",
        "()Ljava/util/List;",
        "sampleSegment5ContentList",
        "e",
        "getSampleSegment3ContentList",
        "sampleSegment3ContentList",
        "getSampleSegment2ContentList",
        "sampleSegment2ContentList",
        "g",
        "getSampleSegment3ContentWithSubTextList",
        "sampleSegment3ContentWithSubTextList",
        "design-showcase_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lsz0/c;

.field private static final b:Lsz0/c;

.field private static final c:Lsz0/c;

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq31/a;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq31/a;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq31/a;",
            ">;"
        }
    .end annotation
.end field

.field private static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq31/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 18

    invoke-static {}, Lsz0/b;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lsz0/c;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lsz0/c;-><init>(Ljava/lang/String;Z)V

    sput-object v1, Lzc1/b7;->a:Lsz0/c;

    invoke-static {}, Lsz0/b;->e()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lsz0/c;

    invoke-direct {v3, v0, v2}, Lsz0/c;-><init>(Ljava/lang/String;Z)V

    sput-object v3, Lzc1/b7;->b:Lsz0/c;

    invoke-static {}, Lsz0/b;->f()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lsz0/c;

    invoke-direct {v4, v0, v2}, Lsz0/c;-><init>(Ljava/lang/String;Z)V

    sput-object v4, Lzc1/b7;->c:Lsz0/c;

    new-instance v5, Lq31/a;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/16 v12, 0x30

    const/4 v13, 0x0

    const-string v6, "Tab 1"

    const-string v7, "Tab 1"

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lq31/a;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const/16 v13, 0x30

    const/4 v14, 0x0

    const-string v7, "Tab 2"

    const-string v8, "Tab 2"

    const/4 v9, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lq31/a;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const/16 v14, 0x30

    const/4 v15, 0x0

    const-string v8, "Tab 3"

    const-string v9, "Tab 3"

    const/4 v10, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lq31/a;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/16 v15, 0x30

    const/16 v16, 0x0

    const-string v9, "Tab 4"

    const-string v10, "Tab 4"

    const/4 v11, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lq31/a;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const/16 v16, 0x30

    const/16 v17, 0x0

    const-string v10, "Tab 5"

    const-string v11, "Tab 5"

    const/4 v12, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5, v6, v7, v8, v9}, [Lq31/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzc1/b7;->d:Ljava/util/List;

    new-instance v5, Lq31/a;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/16 v12, 0x30

    const/4 v13, 0x0

    const-string v6, "GOOD"

    const-string v7, "GOOD"

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lq31/a;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const/16 v13, 0x30

    const-string v7, "NEUTRAL"

    const-string v8, "NEUTRAL"

    const/4 v9, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lq31/a;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const/16 v14, 0x30

    const-string v8, "POOR"

    const-string v9, "POOR"

    const/4 v10, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5, v6, v7}, [Lq31/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzc1/b7;->e:Ljava/util/List;

    new-instance v5, Lq31/a;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/16 v12, 0x30

    const-string v6, "GOOD"

    const-string v7, "GOOD"

    const/4 v8, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lq31/a;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const/16 v13, 0x30

    const/4 v14, 0x0

    const-string v7, "POOR"

    const-string v8, "POOR"

    const/4 v9, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5, v6}, [Lq31/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzc1/b7;->f:Ljava/util/List;

    new-instance v5, Lq31/a;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/16 v12, 0x30

    const/4 v13, 0x0

    const-string v6, "GOOD"

    const-string v7, "GOOD"

    const-string v8, "Sub Text 1"

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v13}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lq31/a;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const/16 v13, 0x30

    const-string v7, "NEUTRAL"

    const-string v8, "NEUTRAL"

    const-string v9, "Sub Text 2"

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lq31/a;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const/16 v14, 0x30

    const-string v8, "POOR"

    const-string v9, "POOR"

    const-string v10, "Sub Text 3"

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lq31/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5, v6, v7}, [Lq31/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzc1/b7;->g:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/b7;->i(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/b7;->j(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/b7;->g(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/b7;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/b7;->h(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move/from16 v0, p1

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, 0x76a4b598

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v7, 0x1

    if-eqz v0, :cond_0

    move v1, v7

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_10

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v4, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/content/Context;

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v1, v2, v4, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v4, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v4, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v2, v4, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v1, v10, :cond_4

    new-instance v11, Lq31/f;

    sget-object v15, Lzc1/b7;->e:Ljava/util/List;

    const/16 v17, 0x12

    const/16 v18, 0x0

    const-string v12, "0"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Lq31/f;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v11

    :cond_4
    move-object v11, v1

    check-cast v11, Lq31/f;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_5

    new-instance v12, Lq31/f;

    sget-object v16, Lzc1/b7;->f:Ljava/util/List;

    const/16 v18, 0x12

    const/16 v19, 0x0

    const-string v13, "0"

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lq31/f;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v12

    :cond_5
    move-object v12, v1

    check-cast v12, Lq31/f;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_6

    new-instance v13, Lq31/f;

    sget-object v17, Lzc1/b7;->d:Ljava/util/List;

    const/16 v19, 0x12

    const/16 v20, 0x0

    const-string v14, "0"

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v20}, Lq31/f;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v13

    :cond_6
    move-object v2, v1

    check-cast v2, Lq31/f;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_7

    new-instance v13, Lq31/f;

    sget-object v17, Lzc1/b7;->g:Ljava/util/List;

    const/16 v19, 0x12

    const/16 v20, 0x0

    const-string v14, "0"

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v20}, Lq31/f;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v13

    :cond_7
    move-object v13, v1

    check-cast v13, Lq31/f;

    const-string v1, "Segmented Content 5 tabs - Interactive"

    invoke-static {v1, v4, v9}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_8

    if-ne v3, v10, :cond_9

    :cond_8
    new-instance v3, Lzc1/m4;

    const/16 v1, 0xa

    invoke-direct {v3, v8, v1}, Lzc1/m4;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v1, Lq31/f;->f:I

    shl-int/lit8 v5, v1, 0x3

    const/4 v6, 0x1

    const/4 v1, 0x0

    invoke-static/range {v1 .. v6}, Lq31/d;->h(Landroidx/compose/ui/Modifier;Lq31/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Segmented Content 3 tabs - Interactive"

    invoke-static {v1, v4, v9}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_a

    if-ne v2, v10, :cond_b

    :cond_a
    new-instance v2, Lzc1/m4;

    const/16 v1, 0xb

    invoke-direct {v2, v8, v1}, Lzc1/m4;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object v2, v11

    invoke-static/range {v1 .. v6}, Lq31/d;->h(Landroidx/compose/ui/Modifier;Lq31/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Segmented Content 2 tabs - Interactive"

    invoke-static {v1, v4, v9}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_c

    if-ne v2, v10, :cond_d

    :cond_c
    new-instance v2, Lzc1/m4;

    const/16 v1, 0xc

    invoke-direct {v2, v8, v1}, Lzc1/m4;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object v2, v12

    invoke-static/range {v1 .. v6}, Lq31/d;->h(Landroidx/compose/ui/Modifier;Lq31/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Segmented Content 3 tabs With sub text - Interactive"

    invoke-static {v1, v4, v9}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_e

    if-ne v2, v10, :cond_f

    :cond_e
    new-instance v2, Lzc1/m4;

    const/16 v1, 0xd

    invoke-direct {v2, v8, v1}, Lzc1/m4;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object v2, v13

    invoke-static/range {v1 .. v6}, Lq31/d;->h(Landroidx/compose/ui/Modifier;Lq31/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_10
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_11

    new-instance v2, Lzc1/g6;

    const/16 v3, 0x10

    invoke-direct {v2, v0, v3}, Lzc1/g6;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final g(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Event from Item: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Event from Item: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Event from Item: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Event from Item: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/b7;->f(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
