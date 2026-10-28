.class public abstract Lnb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
        "model",
        "Lc51/s;",
        "f",
        "(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "smallAmoebaMapper",
        "design-models_release"
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
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmd0/b;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lmd0/b;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lnb1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnb1/a;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;
    .locals 0

    invoke-static {p0}, Lnb1/a;->e(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Lnb1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmd0/b;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lmd0/b;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lnb1/a$a;

    invoke-direct {v2, v0}, Lnb1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lnb1/a;->f(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;
    .locals 28

    move-object/from16 v0, p0

    const-string v1, "model"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v3}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;-><init>(Lc51/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v3, v4}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;-><init>(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lc51/p;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Z)V

    invoke-virtual {v1, v2}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->reduce(Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult;)Lc51/s;

    move-result-object v5

    invoke-virtual {v5}, Lc51/s;->l()Lc51/m;

    move-result-object v0

    invoke-virtual {v0}, Lc51/m;->a()Lz41/g;

    move-result-object v6

    sget-object v0, Lnb1/b;->a:Lnb1/b;

    invoke-virtual {v0}, Lnb1/b;->d()F

    move-result v1

    invoke-virtual {v0}, Lnb1/b;->a()Li2/t;

    move-result-object v2

    new-instance v4, Lc51/m;

    invoke-virtual {v6}, Lz41/g;->r()F

    move-result v7

    invoke-virtual {v0}, Lnb1/b;->c()F

    move-result v8

    mul-float v9, v8, v7

    invoke-virtual {v6}, Lz41/g;->l()F

    move-result v7

    invoke-virtual {v0}, Lnb1/b;->c()F

    move-result v8

    mul-float v10, v8, v7

    invoke-virtual {v6}, Lz41/g;->q()Lz41/f;

    move-result-object v11

    invoke-virtual {v6}, Lz41/g;->q()Lz41/f;

    move-result-object v7

    invoke-virtual {v7}, Lz41/f;->c()F

    move-result v7

    invoke-virtual {v0}, Lnb1/b;->b()F

    move-result v0

    mul-float v12, v0, v7

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Lz41/f;->b(Lz41/f;FFLd0/z;Li93/f;ILjava/lang/Object;)Lz41/f;

    move-result-object v12

    invoke-virtual {v6}, Lz41/g;->n()F

    move-result v0

    const v7, 0x3f19999a    # 0.6f

    mul-float v20, v0, v7

    invoke-virtual {v6}, Lz41/g;->g()La51/f;

    move-result-object v13

    invoke-virtual {v6}, Lz41/g;->g()La51/f;

    move-result-object v0

    invoke-virtual {v0}, La51/f;->e()F

    move-result v0

    mul-float v15, v0, v7

    const/16 v17, 0x5

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, La51/f;->b(La51/f;Lkotlin/time/Duration;FLa51/d;ILjava/lang/Object;)La51/f;

    move-result-object v23

    const v26, 0x36fd3

    const/16 v27, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v6 .. v27}, Lz41/g;->b(Lz41/g;IIFFFLz41/f;Ljava/util/List;Ljava/util/List;JZFLz41/k;FIFLa51/f;Lz41/k;FILjava/lang/Object;)Lz41/g;

    move-result-object v0

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v4, v0, v6, v7, v3}, Lc51/m;-><init>(Lz41/g;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lc51/s;->o()Lc51/o;

    move-result-object v8

    if-eqz v8, :cond_0

    sget-object v14, Lb91/c;->N5:Lb91/c;

    const/16 v16, 0x1f

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x1

    invoke-static/range {v8 .. v17}, Lc51/o;->b(Lc51/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Lb91/c;ZILjava/lang/Object;)Lc51/o;

    move-result-object v3

    :cond_0
    move-object/from16 v21, v3

    invoke-virtual {v5}, Lc51/s;->i()Lc51/e;

    move-result-object v6

    const/4 v0, 0x6

    int-to-float v10, v0

    const/4 v11, 0x5

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x41c80000    # 25.0f

    const/4 v9, 0x0

    invoke-static/range {v6 .. v12}, Lc51/e;->b(Lc51/e;FFFFILjava/lang/Object;)Lc51/e;

    move-result-object v17

    const/16 v22, 0x15be

    const/16 v23, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    move v6, v1

    move-object v14, v2

    move-object/from16 v19, v4

    invoke-static/range {v5 .. v23}, Lc51/s;->c(Lc51/s;FFFDDLl83/k;Li2/t;Lc51/l;ZLc51/e;Lc51/y;Lc51/m;Lc51/r;Lc51/o;ILjava/lang/Object;)Lc51/s;

    move-result-object v0

    return-object v0
.end method
