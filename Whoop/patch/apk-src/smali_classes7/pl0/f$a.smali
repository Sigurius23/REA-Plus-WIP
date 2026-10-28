.class public final Lpl0/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpl0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lpl0/f$a;",
        "",
        "<init>",
        "()V",
        "Ll83/k;",
        "Liz0/m;",
        "Lzk0/i0;",
        "a",
        "()Ll83/k;",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpl0/f$a;-><init>()V

    return-void
.end method

.method private static final b(JLl3/v0;DD)Ll3/v0;
    .locals 20

    move-wide/from16 v0, p0

    move-wide/from16 v2, p3

    double-to-float v2, v2

    invoke-static {v0, v1}, Lv63/c;->a(J)V

    const-wide v3, 0xff00000000L

    and-long/2addr v3, v0

    invoke-static {v0, v1, v3, v4, v2}, Ld13/a;->d(JJF)J

    move-result-wide v8

    sget-object v10, Lp3/r;->I:Lp3/r;

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    move-wide/from16 v2, p5

    double-to-float v2, v2

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v6

    const/16 v18, 0x0

    const v19, 0xfffff8

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v5, p2

    invoke-static/range {v5 .. v19}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Ll83/k;
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/k;"
        }
    .end annotation

    sget-object v0, Lzk0/d;->a:Lzk0/d;

    invoke-virtual {v0}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lv63/c;->g(D)J

    move-result-wide v2

    sget-object v0, Lzk0/g;->a:Lzk0/g;

    invoke-virtual {v0}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v1, Lzk0/f;->a:Lzk0/f;

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Lv63/c;->g(D)J

    move-result-wide v9

    sget-object v1, Lzk0/h;->a:Lzk0/h;

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    double-to-float v1, v4

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->G()Lb91/a;

    move-result-object v4

    invoke-virtual {v4}, Lb91/a;->d()Ll3/v0;

    move-result-object v4

    sget-object v7, Lp3/r;->F:Lp3/r;

    int-to-float v0, v0

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v0, v5

    invoke-static {v2, v3}, Lv63/c;->a(J)V

    const-wide v5, 0xff00000000L

    and-long/2addr v5, v2

    invoke-static {v2, v3, v5, v6, v0}, Ld13/a;->d(JJF)J

    move-result-wide v12

    const/4 v15, 0x0

    const v16, 0xfdff79

    move-wide v5, v2

    move-object v2, v4

    const-wide/16 v3, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v4

    move-wide v2, v5

    sget-object v0, Lzk0/p;->a:Lzk0/p;

    invoke-virtual {v0}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    sget-object v0, Lzk0/o;->a:Lzk0/o;

    invoke-virtual {v0}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-static/range {v2 .. v8}, Lpl0/f$a;->b(JLl3/v0;DD)Ll3/v0;

    move-result-object v0

    sget-object v5, Lzk0/u;->a:Lzk0/u;

    invoke-virtual {v5}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    sget-object v7, Lzk0/t;->a:Lzk0/t;

    invoke-virtual {v7}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-static/range {v2 .. v8}, Lpl0/f$a;->b(JLl3/v0;DD)Ll3/v0;

    move-result-object v9

    sget-object v5, Lzk0/z;->a:Lzk0/z;

    invoke-virtual {v5}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    sget-object v7, Lzk0/y;->a:Lzk0/y;

    invoke-virtual {v7}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-static/range {v2 .. v8}, Lpl0/f$a;->b(JLl3/v0;DD)Ll3/v0;

    move-result-object v2

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v5

    invoke-static {v1, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v19

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->k0()J

    move-result-wide v21

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X()J

    move-result-wide v5

    sget-object v1, Lzk0/a;->a:Lzk0/a;

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    double-to-float v1, v7

    invoke-static {v1, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v23

    sget-object v25, Lp3/r;->I:Lp3/r;

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v5

    sget-object v1, Lzk0/i;->a:Lzk0/i;

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    double-to-float v1, v7

    invoke-static {v1, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v26

    new-instance v1, Liz0/a;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->N()Lb91/a;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v3, v0, v5, v6, v5}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v0

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->O()Lb91/a;

    move-result-object v3

    invoke-static {v3, v9, v5, v6, v5}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v3

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->P()Lb91/a;

    move-result-object v7

    invoke-static {v7, v2, v5, v6, v5}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v2

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->Q()Lb91/a;

    move-result-object v5

    invoke-direct {v1, v0, v3, v2, v5}, Liz0/a;-><init>(Lb91/a;Lb91/a;Lb91/a;Lb91/a;)V

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v29

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v32

    const/4 v0, 0x0

    int-to-float v0, v0

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v34, v0, v2

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v35, v0, v2

    new-instance v17, Liz0/m;

    const/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v28, 0x1

    const/16 v36, 0x0

    move/from16 v38, v34

    move-object/from16 v31, v1

    move-object/from16 v18, v4

    invoke-direct/range {v17 .. v39}, Liz0/m;-><init>(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v17

    new-instance v1, Ll83/k;

    new-instance v2, Lzk0/i0;

    const v21, 0x3ffff

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v2 .. v22}, Lzk0/i0;-><init>(FFFFFFFZFFFFFFFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
