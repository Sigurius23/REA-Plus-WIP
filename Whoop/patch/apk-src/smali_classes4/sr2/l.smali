.class public final Lsr2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lsr2/l;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "Lxf3/c;",
        "Landroidx/fragment/app/r0;",
        "context",
        "",
        "Lj02/k0;",
        "d",
        "(Lxf3/c;Landroidx/fragment/app/r0;)Ljava/util/List;",
        "app_prodStandardRelease"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lsr2/l;Lxf3/c;Luf3/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lsr2/l;->c(Lsr2/l;Lxf3/c;Luf3/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lsr2/l;Ltf3/a;)Ll83/a0;
    .locals 8

    const-string v0, "$this$module"

    const-string v1, "key-navigators"

    invoke-static {p1, v0, v1}, Lm4/a;->s(Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v5

    new-instance v6, Lc41/l3;

    const/16 v0, 0xd

    invoke-direct {v6, p0, v0}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lqf3/b;

    const-class p0, Ljava/util/List;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v3, Lwf3/a;->e:Lvf3/c;

    const/4 v7, 0x2

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v4, v5, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {v2, p1, p0, v0}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final c(Lsr2/l;Lxf3/c;Luf3/a;)Ljava/util/List;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Landroidx/fragment/app/r0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/fragment/app/r0;

    invoke-virtual {p0, p1, p2}, Lsr2/l;->d(Lxf3/c;Landroidx/fragment/app/r0;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(Lxf3/c;Landroidx/fragment/app/r0;)Ljava/util/List;
    .locals 78
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf3/c;",
            "Landroidx/fragment/app/r0;",
            ")",
            "Ljava/util/List<",
            "Lj02/k0;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lt50/a;

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-direct {v8, v9, v10, v9}, Lt50/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lo60/b;

    invoke-direct {v11, v9, v10, v9}, Lo60/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lt60/b;

    invoke-direct {v12, v9, v10, v9}, Lt60/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Len2/a;

    invoke-direct {v13, v9, v10, v9}, Len2/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Ll80/r;

    sget v15, Lhi0/e;->D2:I

    sget v16, Lhi0/e;->W:I

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Ll80/r;-><init>(IILj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lrf0/b;

    invoke-direct {v15, v9, v10, v9}, Lrf0/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lng0/b;

    invoke-direct {v1, v9, v10, v9}, Lng0/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lko0/a;

    invoke-direct {v3, v9, v10, v9}, Lko0/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lqi0/c;

    invoke-direct {v4, v9, v10, v9}, Lqi0/c;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lpc0/b;

    invoke-direct {v5, v9, v10, v9}, Lpc0/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lj02/r0;

    invoke-direct {v6, v2}, Lj02/r0;-><init>(Landroid/app/Activity;)V

    new-instance v7, Lw22/b;

    invoke-direct {v7, v9, v10, v9}, Lw22/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v4

    new-instance v4, Lqi0/e;

    invoke-direct {v4, v9, v10, v9}, Lqi0/e;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v4

    new-instance v4, Lfh1/b;

    invoke-direct {v4, v9, v10, v9}, Lfh1/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v4

    new-instance v4, Lmh1/b;

    invoke-direct {v4, v9, v10, v9}, Lmh1/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v4

    new-instance v4, Lx70/b;

    invoke-direct {v4, v9, v10, v9}, Lx70/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v4

    new-instance v4, Ljd0/b;

    move-object/from16 v21, v6

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    move-object/from16 v22, v7

    const-class v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v9, v10, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v24, v1

    const/4 v1, 0x1

    invoke-direct {v4, v9, v10, v1, v9}, Ljd0/b;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lyf0/b;

    invoke-direct {v10, v9, v1, v9}, Lyf0/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v25, v4

    new-instance v4, Lfg0/b;

    invoke-direct {v4, v9, v1, v9}, Lfg0/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v26, v4

    new-instance v4, Luh0/c;

    invoke-direct {v4, v9, v1, v9}, Luh0/c;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v27, v4

    new-instance v4, Lj02/h;

    invoke-direct {v4, v9, v1, v9}, Lj02/h;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v28, v4

    new-instance v4, Lj02/i;

    invoke-direct {v4, v9, v1, v9}, Lj02/i;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v29, v4

    new-instance v4, Lj02/t0;

    invoke-direct {v4, v9, v1, v9}, Lj02/t0;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v30, Lj02/k;

    const-class v1, Landroid/content/Context;

    invoke-virtual {v6, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v9, v2, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v31, v2

    check-cast v31, Landroid/content/Context;

    const/16 v36, 0x1e

    const/16 v37, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v30 .. v37}, Lj02/k;-><init>(Landroid/content/Context;Lj02/i0;Landroid/content/Intent;Leb/x0;Landroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lby0/b;

    move-object/from16 v31, v1

    const/4 v1, 0x1

    invoke-direct {v2, v9, v1, v9}, Lby0/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v32, v4

    new-instance v4, Law1/c;

    invoke-direct {v4, v9, v1, v9}, Law1/c;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v33, v4

    new-instance v4, Lee1/a;

    invoke-direct {v4, v9, v1, v9}, Lee1/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v34, v4

    new-instance v4, Lj02/z;

    invoke-direct {v4, v9, v1, v9}, Lj02/z;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v35, v4

    new-instance v4, Lkw1/e;

    invoke-direct {v4, v9, v1, v9}, Lkw1/e;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v36, v4

    new-instance v4, Ltw1/c;

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v37, v2

    const/4 v2, 0x1

    invoke-direct {v4, v9, v1, v2, v9}, Ltw1/c;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lvf1/b;

    invoke-direct {v1, v9, v2, v9}, Lvf1/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v38, v4

    new-instance v4, Lxr1/a;

    invoke-direct {v4, v9, v2, v9}, Lxr1/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v39, v4

    new-instance v4, Lx12/a;

    invoke-direct {v4, v9, v2, v9}, Lx12/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v40, v4

    new-instance v4, Lpb2/b;

    invoke-direct {v4, v9, v2, v9}, Lpb2/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v41, v4

    new-instance v4, Lhp0/a;

    invoke-direct {v4, v9, v2, v9}, Lhp0/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v42, v4

    new-instance v4, Lne1/c;

    invoke-direct {v4, v9, v2, v9}, Lne1/c;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v43, v4

    new-instance v4, Lxw2/a;

    invoke-direct {v4, v9, v2, v9}, Lxw2/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v44, v4

    new-instance v4, Lbv1/b;

    invoke-direct {v4, v9, v2, v9}, Lbv1/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v45, v4

    new-instance v4, Lj02/h0;

    invoke-direct {v4, v9, v2, v9}, Lj02/h0;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v46, v4

    new-instance v4, Lbj1/b;

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v9, v2, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v47, v1

    const/4 v1, 0x1

    invoke-direct {v4, v9, v2, v1, v9}, Lbj1/b;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lhk1/b;

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v48, v3

    const/4 v3, 0x1

    invoke-direct {v2, v9, v1, v3, v9}, Lhk1/b;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lil2/a;

    invoke-direct {v1, v9, v3, v9}, Lil2/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v49, v4

    new-instance v4, Lzb2/a;

    invoke-direct {v4, v9, v3, v9}, Lzb2/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v50, v4

    new-instance v4, Lko1/b;

    invoke-direct {v4, v9, v3, v9}, Lko1/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v51, v4

    new-instance v4, Lro1/h;

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v0, v9, v3, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v52, v1

    const/4 v1, 0x1

    invoke-direct {v4, v9, v3, v1, v9}, Lro1/h;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lf22/e;

    invoke-direct {v3, v9, v1, v9}, Lf22/e;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v53, v4

    new-instance v4, Lyy1/b;

    invoke-direct {v4, v9, v1, v9}, Lyy1/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v54, v4

    new-instance v4, Lsz1/b;

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v55, v8

    const/4 v8, 0x2

    invoke-direct {v4, v1, v9, v8, v9}, Lsz1/b;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Ld02/b;

    move/from16 v56, v8

    const/4 v8, 0x1

    invoke-direct {v1, v9, v8, v9}, Ld02/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v57, v4

    new-instance v4, Lcg2/b;

    invoke-direct {v4, v9, v8, v9}, Lcg2/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v58, v4

    new-instance v4, Lcom/whoop/profile/navigation/ProfileNavigationProvider;

    invoke-direct {v4, v9, v8, v9}, Lcom/whoop/profile/navigation/ProfileNavigationProvider;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v59, v4

    new-instance v4, Lix1/b;

    const-class v8, Lax1/b;

    invoke-virtual {v6, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v9, v8, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lax1/b;

    move-object/from16 v60, v1

    const/4 v1, 0x1

    invoke-direct {v4, v9, v8, v1, v9}, Lix1/b;-><init>(Lj02/i0;Lax1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v61, Lyn0/a;

    const/16 v65, 0x7

    const/16 v66, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    invoke-direct/range {v61 .. v66}, Lyn0/a;-><init>(Lj02/i0;Ljava/time/Clock;Lco0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lbp1/a;

    invoke-direct {v8, v9, v1, v9}, Lbp1/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Ll62/b;

    move-object/from16 v62, v1

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v63, v1

    const-class v1, Lh62/b;

    invoke-virtual {v6, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh62/b;

    move-object/from16 v64, v6

    const/4 v6, 0x4

    move-object/from16 v65, v7

    const/4 v7, 0x0

    move-object/from16 v66, v4

    const/4 v4, 0x0

    move-object/from16 v67, v57

    move-object/from16 v57, v3

    move-object/from16 v3, v63

    move-object/from16 v63, v59

    move-object/from16 v59, v67

    move-object/from16 v69, v31

    move-object/from16 v67, v64

    move-object/from16 v68, v65

    move-object/from16 v31, v29

    move-object/from16 v29, v28

    move-object/from16 v28, v27

    move-object/from16 v27, v26

    move-object/from16 v26, v25

    move-object/from16 v25, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v18

    move-object/from16 v18, v17

    move-object/from16 v17, v5

    move-object v5, v1

    move-object/from16 v1, v62

    move-object/from16 v62, v58

    move-object/from16 v58, v54

    move-object/from16 v54, v53

    move-object/from16 v53, v51

    move-object/from16 v51, v50

    move-object/from16 v50, v2

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v7}, Ll62/b;-><init>(Landroidx/fragment/app/r0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;Lh62/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lxx1/c;

    const/4 v3, 0x1

    invoke-direct {v2, v9, v3, v9}, Lxx1/c;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v70, Lf72/c;

    move-object/from16 v3, v67

    move-object/from16 v4, v68

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v9, v5, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v72, v5

    check-cast v72, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v5, Lzr2/a;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v9, v5, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v73, v5

    check-cast v73, Lzr2/a;

    const/16 v75, 0x9

    const/16 v76, 0x0

    const/16 v71, 0x0

    const/16 v74, 0x0

    invoke-direct/range {v70 .. v76}, Lf72/c;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lzr2/a;Lorg/joda/time/LocalDate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lf72/a;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v9, v6, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/4 v7, 0x1

    invoke-direct {v5, v9, v6, v7, v9}, Lf72/a;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lf72/e;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v0, v9, v7, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 p2, v1

    const/4 v1, 0x1

    invoke-direct {v6, v9, v7, v1, v9}, Lf72/e;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lv72/a;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v64, v2

    const/4 v2, 0x1

    invoke-direct {v7, v9, v1, v2, v9}, Lv72/a;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v71, Llj2/b;

    const-class v1, Lwe1/a;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v73, v1

    check-cast v73, Lwe1/a;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v74, v1

    check-cast v74, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/16 v75, 0x1

    const/16 v72, 0x0

    invoke-direct/range {v71 .. v76}, Llj2/b;-><init>(Lj02/i0;Lwe1/a;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lsi2/c;

    const/4 v2, 0x1

    invoke-direct {v1, v9, v2, v9}, Lsi2/c;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v1

    new-instance v1, Lwc2/a;

    invoke-direct {v1, v9, v2, v9}, Lwc2/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v65, v1

    new-instance v1, Lvn2/c;

    invoke-direct {v1, v9, v2, v9}, Lvn2/c;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v67, v1

    new-instance v1, Loo2/b;

    invoke-direct {v1, v9, v2, v9}, Loo2/b;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v72, Lj02/w0;

    move-object/from16 v2, v69

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v9, v2, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v73, v2

    check-cast v73, Landroid/content/Context;

    const/16 v76, 0x6

    const/16 v77, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    invoke-direct/range {v72 .. v77}, Lj02/w0;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lrt2/a;

    move-object/from16 v69, v1

    const/4 v1, 0x1

    invoke-direct {v2, v9, v1, v9}, Lrt2/a;-><init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lml0/b;

    move-object/from16 v73, v2

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v9, v2, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v74, v5

    const/4 v5, 0x1

    invoke-direct {v1, v9, v2, v5, v9}, Lml0/b;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lgs2/b;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v0, v9, v3, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {v2, v9, v0, v5, v9}, Lgs2/b;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v0, 0x45

    new-array v0, v0, [Lj02/k0;

    const/4 v3, 0x0

    aput-object v55, v0, v3

    aput-object v11, v0, v5

    aput-object v12, v0, v56

    const/4 v3, 0x3

    aput-object v13, v0, v3

    const/4 v3, 0x4

    aput-object v14, v0, v3

    const/4 v3, 0x5

    aput-object v15, v0, v3

    const/4 v3, 0x6

    aput-object v24, v0, v3

    const/4 v3, 0x7

    aput-object v48, v0, v3

    const/16 v3, 0x8

    aput-object v16, v0, v3

    const/16 v3, 0x9

    aput-object v17, v0, v3

    const/16 v3, 0xa

    aput-object v21, v0, v3

    const/16 v3, 0xb

    aput-object v22, v0, v3

    const/16 v3, 0xc

    aput-object v18, v0, v3

    const/16 v3, 0xd

    aput-object v19, v0, v3

    const/16 v3, 0xe

    aput-object v20, v0, v3

    const/16 v3, 0xf

    aput-object v25, v0, v3

    const/16 v3, 0x10

    aput-object v26, v0, v3

    const/16 v3, 0x11

    aput-object v10, v0, v3

    const/16 v3, 0x12

    aput-object v27, v0, v3

    const/16 v3, 0x13

    aput-object v28, v0, v3

    const/16 v3, 0x14

    aput-object v29, v0, v3

    const/16 v3, 0x15

    aput-object v31, v0, v3

    const/16 v3, 0x16

    aput-object v32, v0, v3

    const/16 v3, 0x17

    aput-object v30, v0, v3

    const/16 v3, 0x18

    aput-object v37, v0, v3

    const/16 v3, 0x19

    aput-object v33, v0, v3

    const/16 v3, 0x1a

    aput-object v34, v0, v3

    const/16 v3, 0x1b

    aput-object v35, v0, v3

    const/16 v3, 0x1c

    aput-object v36, v0, v3

    const/16 v3, 0x1d

    aput-object v38, v0, v3

    const/16 v3, 0x1e

    aput-object v47, v0, v3

    const/16 v3, 0x1f

    aput-object v39, v0, v3

    const/16 v3, 0x20

    aput-object v40, v0, v3

    const/16 v3, 0x21

    aput-object v41, v0, v3

    const/16 v3, 0x22

    aput-object v42, v0, v3

    const/16 v3, 0x23

    aput-object v43, v0, v3

    const/16 v3, 0x24

    aput-object v44, v0, v3

    const/16 v3, 0x25

    aput-object v45, v0, v3

    const/16 v3, 0x26

    aput-object v46, v0, v3

    const/16 v3, 0x27

    aput-object v49, v0, v3

    const/16 v3, 0x28

    aput-object v50, v0, v3

    const/16 v3, 0x29

    aput-object v52, v0, v3

    const/16 v3, 0x2a

    aput-object v51, v0, v3

    const/16 v3, 0x2b

    aput-object v53, v0, v3

    const/16 v3, 0x2c

    aput-object v54, v0, v3

    const/16 v3, 0x2d

    aput-object v57, v0, v3

    const/16 v3, 0x2e

    aput-object v58, v0, v3

    const/16 v3, 0x2f

    aput-object v59, v0, v3

    const/16 v3, 0x30

    aput-object v60, v0, v3

    const/16 v3, 0x31

    aput-object v62, v0, v3

    const/16 v3, 0x32

    aput-object v63, v0, v3

    const/16 v3, 0x33

    aput-object v66, v0, v3

    const/16 v3, 0x34

    aput-object v61, v0, v3

    const/16 v3, 0x35

    aput-object v8, v0, v3

    const/16 v3, 0x36

    aput-object p2, v0, v3

    const/16 v3, 0x37

    aput-object v64, v0, v3

    const/16 v3, 0x38

    aput-object v70, v0, v3

    const/16 v3, 0x39

    aput-object v74, v0, v3

    const/16 v3, 0x3a

    aput-object v6, v0, v3

    const/16 v3, 0x3b

    aput-object v7, v0, v3

    const/16 v3, 0x3c

    aput-object v71, v0, v3

    const/16 v3, 0x3d

    aput-object v23, v0, v3

    const/16 v3, 0x3e

    aput-object v65, v0, v3

    const/16 v3, 0x3f

    aput-object v67, v0, v3

    const/16 v3, 0x40

    aput-object v69, v0, v3

    const/16 v3, 0x41

    aput-object v72, v0, v3

    const/16 v3, 0x42

    aput-object v73, v0, v3

    const/16 v3, 0x43

    aput-object v1, v0, v3

    const/16 v1, 0x44

    aput-object v2, v0, v1

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {p0, v0}, Lsr2/l;->b(Lsr2/l;Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public bridge getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lnd1/j;->getDependencies()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
