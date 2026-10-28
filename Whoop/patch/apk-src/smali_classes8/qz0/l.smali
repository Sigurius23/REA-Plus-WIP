.class public final Lqz0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u000b\u001a\u0004\u0008\u000f\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168G\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8G\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8G\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lqz0/l;",
        "",
        "<init>",
        "()V",
        "",
        "isError",
        "Lg1/e8;",
        "c",
        "(ZLandroidx/compose/runtime/Composer;I)Lg1/e8;",
        "Ly3/f;",
        "b",
        "F",
        "f",
        "()F",
        "horizontalContentPadding",
        "i",
        "verticalContentPadding",
        "Ll0/k1;",
        "d",
        "Ll0/k1;",
        "()Ll0/k1;",
        "contentPadding",
        "Lb91/a;",
        "h",
        "(Landroidx/compose/runtime/Composer;I)Lb91/a;",
        "textStyle",
        "Li2/a1;",
        "g",
        "(Landroidx/compose/runtime/Composer;I)Li2/a1;",
        "shape",
        "Lu0/q0;",
        "e",
        "(Landroidx/compose/runtime/Composer;I)Lu0/q0;",
        "DefaultKeyboardActions",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lqz0/l;

.field private static final b:F

.field private static final c:F

.field private static final d:Ll0/k1;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lqz0/l;

    invoke-direct {v0}, Lqz0/l;-><init>()V

    sput-object v0, Lqz0/l;->a:Lqz0/l;

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lqz0/l;->b:F

    const-wide/high16 v2, 0x3ffc000000000000L    # 1.75

    double-to-float v2, v2

    mul-float/2addr v2, v1

    sput v2, Lqz0/l;->c:F

    new-instance v1, Ll0/l1;

    invoke-direct {v1, v0, v2, v0, v2}, Ll0/l1;-><init>(FFFF)V

    sput-object v1, Lqz0/l;->d:Ll0/k1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lqz0/l;->b(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c(ZLandroidx/compose/runtime/Composer;I)Lg1/e8;
    .locals 29

    move-object/from16 v0, p2

    sget-object v1, Lg1/i8;->a:Lg1/i8;

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    const/4 v5, 0x0

    move-object v6, v0

    check-cast v6, Lp1/q;

    if-eqz p1, :cond_0

    const v7, -0x652dc5a5

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c()J

    move-result-wide v7

    :goto_0
    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    move-wide v5, v7

    goto :goto_1

    :cond_0
    const v7, -0x652dc070

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->r()J

    move-result-wide v7

    goto :goto_0

    :goto_1
    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v11

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->W0()J

    move-result-wide v13

    invoke-virtual {v1, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b()J

    move-result-wide v17

    const-wide/16 v25, 0x0

    const v28, 0x1ffe82

    move-wide v1, v3

    const-wide/16 v3, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    move-object/from16 v27, v0

    invoke-static/range {v1 .. v28}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ll0/k1;
    .locals 1

    sget-object v0, Lqz0/l;->d:Ll0/k1;

    return-object v0
.end method

.method public final e(Landroidx/compose/runtime/Composer;I)Lu0/q0;
    .locals 8

    sget-object p2, Lb3/v1;->i:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg2/i;

    invoke-virtual {p1, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_0

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_1

    :cond_0
    new-instance v1, Lb30/l1;

    const/16 v0, 0x11

    invoke-direct {v1, p2, v0}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lu0/q0;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3e

    invoke-direct/range {v2 .. v7}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    return-object v2
.end method

.method public final f()F
    .locals 1

    sget v0, Lqz0/l;->b:F

    return v0
.end method

.method public final g(Landroidx/compose/runtime/Composer;I)Li2/a1;
    .locals 0

    sget-object p2, Lg1/i8;->a:Lg1/i8;

    invoke-static {p1}, Lg1/i8;->d(Landroidx/compose/runtime/Composer;)Lt0/a;

    move-result-object p1

    return-object p1
.end method

.method public final h(Landroidx/compose/runtime/Composer;I)Lb91/a;
    .locals 1

    sget-object p2, Lx81/d;->a:Lx81/d;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->a()Lb91/a;

    move-result-object p1

    return-object p1
.end method

.method public final i()F
    .locals 1

    sget v0, Lqz0/l;->c:F

    return v0
.end method
