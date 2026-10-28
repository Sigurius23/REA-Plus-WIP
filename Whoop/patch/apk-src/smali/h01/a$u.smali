.class final Lh01/a$u;
.super Lh01/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh01/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "u"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\u00ca\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "com/whoop/design/atomic/molecule/card/notification/HomeNotificationCardStyle.AMERICA_250",
        "Lh01/a;",
        "Landroidx/compose/ui/Modifier;",
        "w",
        "Landroidx/compose/ui/Modifier;",
        "getStyleModifier",
        "()Landroidx/compose/ui/Modifier;",
        "styleModifier",
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


# instance fields
.field private final w:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    new-instance v4, Ld11/j;

    sget-object v0, Li2/t;->b:Li2/s;

    sget-object v1, Ly81/f;->PATRIOTIC_BLUE:Ly81/f;

    invoke-virtual {v1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v2

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    sget-object v2, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-virtual {v2}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v6

    new-instance v3, Li2/x;

    invoke-direct {v3, v6, v7}, Li2/x;-><init>(J)V

    sget-object v6, Ly81/f;->PATRIOTIC_RED:Ly81/f;

    invoke-virtual {v6}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v7

    new-instance v9, Li2/x;

    invoke-direct {v9, v7, v8}, Li2/x;-><init>(J)V

    filled-new-array {v5, v3, v9}, [Li2/x;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v5, 0x0

    const/16 v7, 0xe

    invoke-static {v0, v3, v5, v5, v7}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v3

    invoke-static {v3}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v3

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-direct {v4, v3, v5, v8, v9}, Ld11/j;-><init>(Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v2, v6}, [Ly81/f;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    int-to-float v3, v3

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v3, v10

    move v11, v3

    new-instance v3, Li91/d;

    invoke-virtual {v1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v12

    const v1, 0x3e99999a    # 0.3f

    invoke-static {v1, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    invoke-static {}, Lh01/b;->a()J

    move-result-wide v14

    invoke-static {v12, v13, v14, v15}, Li2/w0;->p(JJ)J

    move-result-wide v12

    new-instance v14, Li2/x;

    invoke-direct {v14, v12, v13}, Li2/x;-><init>(J)V

    invoke-static {}, Lh01/b;->a()J

    move-result-wide v12

    new-instance v15, Li2/x;

    invoke-direct {v15, v12, v13}, Li2/x;-><init>(J)V

    invoke-virtual {v6}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v12

    invoke-static {v1, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    invoke-static {}, Lh01/b;->a()J

    move-result-wide v8

    invoke-static {v12, v13, v8, v9}, Li2/w0;->p(JJ)J

    move-result-wide v8

    new-instance v12, Li2/x;

    invoke-direct {v12, v8, v9}, Li2/x;-><init>(J)V

    filled-new-array {v14, v15, v12}, [Li2/x;

    move-result-object v8

    invoke-static {v8}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static {v0, v8, v5, v5, v7}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    invoke-static {v0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v6, 0x0

    invoke-direct {v3, v0, v5, v1, v6}, Li91/d;-><init>(Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v5, v2

    move v7, v11

    move/from16 v2, p2

    invoke-direct/range {v0 .. v9}, Lh01/a;-><init>(Ljava/lang/String;ILi91/a;Ld11/a;Ljava/util/List;Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lh01/a;->getBackground()Li91/a;

    move-result-object v1

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float/2addr v0, v10

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Li91/c;->e(Landroidx/compose/ui/Modifier;Li91/a;Li2/a1;Ljava/lang/Float;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lh01/a$u;->w:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public getStyleModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    iget-object v0, p0, Lh01/a$u;->w:Landroidx/compose/ui/Modifier;

    return-object v0
.end method
