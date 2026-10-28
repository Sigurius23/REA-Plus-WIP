.class public abstract Lsz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0012\n\u0002\u0010 \n\u0002\u0008\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u0017\u0010\u000c\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0017\u0010\u000e\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\t\u001a\u0004\u0008\r\u0010\u000b\"\u0017\u0010\u0011\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\t\u001a\u0004\u0008\u0010\u0010\u000b\"\u0017\u0010\u0015\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0017\u0010\u0017\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0012\u001a\u0004\u0008\u0016\u0010\u0014\"\u0017\u0010\u0019\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0014\"\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lsz0/c;",
        "state",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lsz0/c;Landroidx/compose/runtime/Composer;II)V",
        "",
        "a",
        "Ljava/lang/String;",
        "d",
        "()Ljava/lang/String;",
        "sampleMedicalDisclaimerBothFeaturesText",
        "e",
        "sampleMedicalDisclaimerECGText",
        "c",
        "f",
        "sampleMedicalDisclaimerIHRNText",
        "Lsz0/c;",
        "getSampleMedicalDisclaimerBothFeatures",
        "()Lsz0/c;",
        "sampleMedicalDisclaimerBothFeatures",
        "getSampleMedicalDisclaimerECG",
        "sampleMedicalDisclaimerECG",
        "getSampleMedicalDisclaimerIHRN",
        "sampleMedicalDisclaimerIHRN",
        "",
        "g",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "sampleMedicalDisclaimerStates",
        "design_release"
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
.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Lsz0/c;

.field private static final e:Lsz0/c;

.field private static final f:Lsz0/c;

.field private static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsz0/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-string v0, "**The Heart Screener features - ECG and IHRN - are medically regulated features.** "

    const-string v1, "Healthspan, Health Monitor, Blood Pressure Monitor, and Stress Monitor are not medical devices and cannot diagnose or manage medical conditions. These features do not provide medical advice. Always consult your doctor for health concerns and never delay or modify medical care based on these features."

    invoke-static {v0, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lsz0/b;->a:Ljava/lang/String;

    const-string v2, "**The Heart Screener feature - ECG - is a medically regulated feature.** "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lsz0/b;->b:Ljava/lang/String;

    const-string v3, "**The Heart Screener feature - IHRN - is a medically regulated feature.** "

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lsz0/b;->c:Ljava/lang/String;

    new-instance v4, Lsz0/c;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v5}, Lsz0/c;-><init>(Ljava/lang/String;Z)V

    sput-object v4, Lsz0/b;->d:Lsz0/c;

    new-instance v0, Lsz0/c;

    invoke-direct {v0, v2, v5}, Lsz0/c;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lsz0/b;->e:Lsz0/c;

    new-instance v2, Lsz0/c;

    invoke-direct {v2, v3, v5}, Lsz0/c;-><init>(Ljava/lang/String;Z)V

    sput-object v2, Lsz0/b;->f:Lsz0/c;

    new-instance v3, Lsz0/c;

    invoke-direct {v3, v1, v5}, Lsz0/c;-><init>(Ljava/lang/String;Z)V

    filled-new-array {v4, v0, v2, v3}, [Lsz0/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lsz0/b;->g:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lsz0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsz0/b;->c(Landroidx/compose/ui/Modifier;Lsz0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lsz0/c;Landroidx/compose/runtime/Composer;II)V
    .locals 32

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v0, -0x25b74164

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v3, p3, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_3

    :cond_5
    move v5, v7

    :goto_3
    and-int/2addr v4, v8

    invoke-virtual {v12, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v14, v13

    goto :goto_4

    :cond_6
    move-object v14, v3

    :goto_4
    int-to-float v0, v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v16, v0, v3

    const/16 v18, 0x0

    const/16 v19, 0xd

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v29, v14

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    double-to-float v4, v4

    mul-float/2addr v4, v3

    const/4 v5, 0x0

    invoke-static {v0, v4, v5, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v4, v12, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_7

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v12, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v12, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    invoke-static {v4, v12, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v12, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lsz0/c;->a()Z

    move-result v0

    if-eqz v0, :cond_a

    const v0, 0x33fe2819

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v8

    mul-float v17, v0, v3

    const/16 v18, 0x7

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v14, 0x6

    const/16 v15, 0xfe

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v0, v7

    const/4 v7, 0x0

    move v1, v8

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    invoke-static/range {v3 .. v15}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    move v0, v7

    move v1, v8

    move-object v13, v12

    const v3, 0x33ff6eb0

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v2}, Lsz0/c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v13, v0}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Liz0/l;->a:Liz0/l;

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-static {v4, v13, v5}, Lih0/d0;->r(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v6

    invoke-virtual {v4, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v4

    const/high16 v27, 0x30000

    const/16 v28, 0x7ffc

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v25, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-wide/from16 v30, v4

    move-object v4, v6

    move-wide/from16 v5, v30

    invoke-virtual/range {v3 .. v28}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v6

    move-object/from16 v13, v25

    const/4 v3, 0x0

    const/16 v14, 0x1f6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v12, v13

    move v13, v3

    move-object v3, v0

    invoke-static/range {v3 .. v14}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v13, v12

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, v29

    goto :goto_7

    :cond_b
    move-object v13, v12

    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v1, v3

    :goto_7
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Lqk2/i;

    const/16 v5, 0x16

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Landroidx/compose/ui/Modifier;Lm91/u;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lsz0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lsz0/b;->b(Landroidx/compose/ui/Modifier;Lsz0/c;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d()Ljava/lang/String;
    .locals 1

    sget-object v0, Lsz0/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static final e()Ljava/lang/String;
    .locals 1

    sget-object v0, Lsz0/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static final f()Ljava/lang/String;
    .locals 1

    sget-object v0, Lsz0/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static final g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsz0/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lsz0/b;->g:Ljava/util/List;

    return-object v0
.end method
