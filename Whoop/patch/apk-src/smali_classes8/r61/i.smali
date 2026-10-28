.class public abstract Lr61/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0002\u001a\r\u0010\u0005\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "Lj71/c;",
        "e",
        "()Lj71/c;",
        "d",
        "c",
        "g",
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


# direct methods
.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lr61/i;->f(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lr61/i;->h(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Lj71/c;
    .locals 120

    new-instance v0, Lj71/c;

    new-instance v1, Lg61/b;

    new-instance v2, Lyy0/c;

    const-string v3, "0.0"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v4, Lr61/i$s;->w:Lr61/i$s;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lyy0/c;

    const-string v4, "1.0"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v5, Lr61/i$d0;->w:Lr61/i$d0;

    invoke-static {v5}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    const/16 v10, 0x20

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const v8, 0x3eaaaaab

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lyy0/c;

    const-string v5, "2.0"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Lr61/i$o0;->w:Lr61/i$o0;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/high16 v8, 0x3f000000    # 0.5f

    const v9, 0x3f2aaaab

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lyy0/c;

    const-string v6, "3.0"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v7, Lr61/i$z0;->w:Lr61/i$z0;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    const/16 v12, 0x20

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/high16 v9, 0x3f000000    # 0.5f

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v2, v3, v4, v5}, [Lyy0/c;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    sget-object v5, Lg61/d;->STANDARD:Lg61/d;

    const-string v12, ""

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/16 v10, 0xc0

    const v2, 0x3dcccccd    # 0.1f

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lg61/b;

    sget-object v17, Lg61/d;->TIME_MARKER:Lg61/d;

    const-string v2, "11:00 AM"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    const/16 v22, 0xc0

    const/16 v23, 0x0

    const v14, 0x3dcccccd    # 0.1f

    sget-object v8, Lm83/y;->w:Lm83/y;

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v13, v3

    move-object v15, v8

    invoke-direct/range {v13 .. v23}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lg61/b;

    new-instance v16, Lyy0/c;

    const-string v2, "9:00 AM"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v2, Lr61/i$k1;->w:Lr61/i$k1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v19

    const/16 v23, 0x20

    const/16 v24, 0x0

    const/16 v18, 0x0

    const v20, 0x3eaa7efa    # 0.333f

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v16 .. v24}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    new-instance v16, Lyy0/c;

    const-string v6, "10:00 AM"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v6, Lr61/i$v1;->w:Lr61/i$v1;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v19

    const v20, 0x3f2a7efa    # 0.666f

    invoke-direct/range {v16 .. v24}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v16

    filled-new-array {v2, v6}, [Lyy0/c;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/16 v13, 0xc0

    const/4 v14, 0x0

    move-object v8, v5

    const v5, 0x3e19999a    # 0.15f

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v14}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lj61/f;

    const/16 v13, 0x7e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v14}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lj61/f;

    const/16 v24, 0x7e

    const/16 v25, 0x0

    const v17, 0x3eaa7efa    # 0.333f

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v16 .. v25}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    new-instance v16, Lj61/f;

    const v17, 0x3f2a7efa    # 0.666f

    invoke-direct/range {v16 .. v25}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v16

    new-instance v16, Lj61/f;

    const/high16 v17, 0x3f800000    # 1.0f

    invoke-direct/range {v16 .. v25}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v16

    filled-new-array {v5, v2, v6, v7}, [Lj61/f;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v6, Lh2/c;

    const v2, 0x3d4ccccd    # 0.05f

    const/4 v5, 0x0

    invoke-direct {v6, v2, v2, v2, v5}, Lh2/c;-><init>(FFFF)V

    new-instance v8, Lj61/g;

    const-string v2, "stressHrGraphState"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/16 v13, 0xe

    invoke-direct/range {v8 .. v14}, Lj61/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    new-instance v1, Lj61/h;

    const/16 v16, 0x1f08

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    move-object v9, v8

    move-object v8, v15

    const/4 v15, 0x0

    invoke-direct/range {v1 .. v17}, Lj61/h;-><init>(Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lk61/c;

    sget-object v3, Lr61/i$g2;->w:Lr61/i$g2;

    invoke-static {v3}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v6

    const/16 v10, 0x37

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lu61/e;

    new-instance v4, La71/a;

    const-string v5, "0.9629"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v5, Lr61/i$r2;->w:Lr61/i$r2;

    invoke-static {v5}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v10

    const/16 v17, 0xfdb

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v4 .. v18}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0x1c

    move-object v9, v4

    const/4 v4, 0x0

    const v5, 0x3f76809d    # 0.9629f

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v11}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lu61/e;

    new-instance v5, La71/a;

    const-string v6, "0.8411"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget-object v6, Lr61/i$c3;->w:Lr61/i$c3;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    const/16 v18, 0xfdb

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v5 .. v19}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v11, 0x1c

    move-object v10, v5

    const v5, 0x3c23d70a    # 0.01f

    const v6, 0x3f575254    # 0.8411f

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v12}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lu61/e;

    new-instance v6, La71/a;

    const-string v7, "0.7581"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v7, Lr61/i$i;->w:Lr61/i$i;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v12

    const/16 v19, 0xfdb

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v6 .. v20}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x1c

    move-object v11, v6

    const v6, 0x3ca3d70a    # 0.02f

    const v7, 0x3f4212d7    # 0.7581f

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v13}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lu61/e;

    new-instance v7, La71/a;

    const-string v8, "0.7786"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v8, Lr61/i$j;->w:Lr61/i$j;

    invoke-static {v8}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v13

    const/16 v20, 0xfdb

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v7 .. v21}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v13, 0x1c

    move-object v12, v7

    const v7, 0x3cf5c28f    # 0.03f

    const v8, 0x3f475254    # 0.7786f

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v14}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lu61/e;

    new-instance v8, La71/a;

    const-string v9, "0.8158"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget-object v9, Lr61/i$k;->w:Lr61/i$k;

    invoke-static {v9}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v14

    const/16 v21, 0xfdb

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v8 .. v22}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0x1c

    move-object v13, v8

    const v8, 0x3d23d70a    # 0.04f

    const v9, 0x3f50d845    # 0.8158f

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v15}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lu61/e;

    new-instance v9, La71/a;

    const-string v10, "0.8423"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget-object v10, Lr61/i$l;->w:Lr61/i$l;

    invoke-static {v10}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v15

    const/16 v22, 0xfdb

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v9 .. v23}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v15, 0x1c

    move-object v14, v9

    const v9, 0x3d4ccccd    # 0.05f

    const v10, 0x3f57a0f9    # 0.8423f

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v16}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lu61/e;

    new-instance v10, La71/a;

    const-string v11, "0.6840"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget-object v11, Lr61/i$m;->w:Lr61/i$m;

    invoke-static {v11}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    const/16 v23, 0xfdb

    const/16 v24, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v10 .. v24}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x1c

    move-object v15, v10

    const v10, 0x3d75c28f    # 0.06f

    const v11, 0x3f2f1aa0    # 0.684f

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v17}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lu61/e;

    new-instance v16, La71/a;

    const-string v11, "0.8288"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget-object v11, Lr61/i$n;->w:Lr61/i$n;

    invoke-static {v11}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v17

    const/16 v24, 0xfdb

    const/4 v15, 0x0

    move-object/from16 v11, v16

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v11 .. v25}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x1c

    move-object/from16 v16, v11

    const v11, 0x3d8f5c29    # 0.07f

    const v12, 0x3f542c3d    # 0.8288f

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v18}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lu61/e;

    new-instance v17, La71/a;

    const-string v12, "0.6844"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v12, Lr61/i$o;->w:Lr61/i$o;

    invoke-static {v12}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v18

    const/16 v25, 0xfdb

    const/16 v26, 0x0

    const/16 v16, 0x0

    move-object/from16 v12, v17

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v12 .. v26}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x1c

    move-object/from16 v17, v12

    const v12, 0x3da3d70a    # 0.08f

    const v13, 0x3f2f34d7    # 0.6844f

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v19}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lu61/e;

    new-instance v18, La71/a;

    const-string v13, "0.7791"

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    sget-object v13, Lr61/i$p;->w:Lr61/i$p;

    invoke-static {v13}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v19

    const/16 v26, 0xfdb

    const/16 v27, 0x0

    const/16 v17, 0x0

    move-object/from16 v13, v18

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v13 .. v27}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v19, 0x1c

    move-object/from16 v18, v13

    const v13, 0x3db851ec    # 0.09f

    const v14, 0x3f477319    # 0.7791f

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v20}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lu61/e;

    new-instance v19, La71/a;

    const-string v14, "0.8201"

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v14, Lr61/i$q;->w:Lr61/i$q;

    invoke-static {v14}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v20

    const/16 v27, 0xfdb

    const/16 v28, 0x0

    const/16 v18, 0x0

    move-object/from16 v14, v19

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v14 .. v28}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x1c

    move-object/from16 v19, v14

    const v14, 0x3dcccccd    # 0.1f

    const v15, 0x3f51f213    # 0.8201f

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v21}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lu61/e;

    new-instance v20, La71/a;

    const-string v15, "0.7601"

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v15, Lr61/i$r;->w:Lr61/i$r;

    invoke-static {v15}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v21

    const/16 v28, 0xfdb

    const/16 v29, 0x0

    const/16 v19, 0x0

    move-object/from16 v15, v20

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v15 .. v29}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0x1c

    move-object/from16 v20, v15

    const v15, 0x3de147ae    # 0.11f

    const v16, 0x3f4295ea    # 0.7601f

    const/16 v18, 0x0

    invoke-direct/range {v14 .. v22}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lu61/e;

    new-instance v16, La71/a;

    const-string v17, "0.8167"

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    sget-object v17, Lr61/i$t;->w:Lr61/i$t;

    invoke-static/range {v17 .. v17}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v22

    const/16 v29, 0xfdb

    const/16 v30, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v16 .. v30}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0x1c

    move-object/from16 v21, v16

    const v16, 0x3df5c28f    # 0.12f

    const v17, 0x3f511340    # 0.8167f

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v23}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lu61/e;

    new-instance v17, La71/a;

    const-string v18, "0.7199"

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    sget-object v18, Lr61/i$u;->w:Lr61/i$u;

    invoke-static/range {v18 .. v18}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v23

    const/16 v30, 0xfdb

    const/16 v31, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v17 .. v31}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v23, 0x1c

    move-object/from16 v22, v17

    const v17, 0x3e051eb8    # 0.13f

    const v18, 0x3f384b5e    # 0.7199f

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v24}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v17, Lu61/e;

    new-instance v18, La71/a;

    const-string v19, "0.6645"

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    sget-object v19, Lr61/i$v;->w:Lr61/i$v;

    invoke-static/range {v19 .. v19}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v24

    const/16 v31, 0xfdb

    const/16 v32, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v18 .. v32}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v24, 0x1c

    move-object/from16 v23, v18

    const v18, 0x3e0f5c29    # 0.14f

    const v19, 0x3f2a1cac    # 0.6645f

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v25}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lu61/e;

    new-instance v19, La71/a;

    const-string v20, "0.6864"

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    sget-object v20, Lr61/i$w;->w:Lr61/i$w;

    invoke-static/range {v20 .. v20}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v25

    const/16 v32, 0xfdb

    const/16 v33, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v19 .. v33}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v25, 0x1c

    move-object/from16 v24, v19

    const v19, 0x3e19999a    # 0.15f

    const v20, 0x3f2fb7e9    # 0.6864f

    const/16 v22, 0x0

    invoke-direct/range {v18 .. v26}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v19, Lu61/e;

    new-instance v20, La71/a;

    const-string v21, "0.6991"

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    sget-object v21, Lr61/i$x;->w:Lr61/i$x;

    invoke-static/range {v21 .. v21}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v26

    const/16 v33, 0xfdb

    const/16 v34, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v20 .. v34}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v26, 0x1c

    move-object/from16 v25, v20

    const v20, 0x3e23d70a    # 0.16f

    const v21, 0x3f32f838    # 0.6991f

    const/16 v23, 0x0

    invoke-direct/range {v19 .. v27}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v20, Lu61/e;

    new-instance v21, La71/a;

    const-string v22, "0.6550"

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    sget-object v22, Lr61/i$y;->w:Lr61/i$y;

    invoke-static/range {v22 .. v22}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v27

    const/16 v34, 0xfdb

    const/16 v35, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v21 .. v35}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v27, 0x1c

    move-object/from16 v26, v21

    const v21, 0x3e2e147b    # 0.17f

    const v22, 0x3f27ae14    # 0.655f

    const/16 v24, 0x0

    invoke-direct/range {v20 .. v28}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v21, Lu61/e;

    new-instance v22, La71/a;

    const-string v23, "0.6024"

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    sget-object v23, Lr61/i$z;->w:Lr61/i$z;

    invoke-static/range {v23 .. v23}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v28

    const/16 v35, 0xfdb

    const/16 v36, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v22 .. v36}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v28, 0x1c

    move-object/from16 v27, v22

    const v22, 0x3e3851ec    # 0.18f

    const v23, 0x3f1a36e3    # 0.6024f

    const/16 v25, 0x0

    invoke-direct/range {v21 .. v29}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v22, Lu61/e;

    new-instance v23, La71/a;

    const-string v24, "0.6693"

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    sget-object v24, Lr61/i$a0;->w:Lr61/i$a0;

    invoke-static/range {v24 .. v24}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v29

    const/16 v36, 0xfdb

    const/16 v37, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v23 .. v37}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v29, 0x1c

    move-object/from16 v28, v23

    const v23, 0x3e428f5c    # 0.19f

    const v24, 0x3f2b573f    # 0.6693f

    const/16 v26, 0x0

    invoke-direct/range {v22 .. v30}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v23, Lu61/e;

    new-instance v24, La71/a;

    const-string v25, "0.4930"

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v27

    sget-object v25, Lr61/i$b0;->w:Lr61/i$b0;

    invoke-static/range {v25 .. v25}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v30

    const/16 v37, 0xfdb

    const/16 v38, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v24 .. v38}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v30, 0x1c

    move-object/from16 v29, v24

    const v24, 0x3e4ccccd    # 0.2f

    const v25, 0x3efc6a7f    # 0.493f

    const/16 v27, 0x0

    invoke-direct/range {v23 .. v31}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v24, Lu61/e;

    new-instance v25, La71/a;

    const-string v26, "0.6438"

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    sget-object v26, Lr61/i$c0;->w:Lr61/i$c0;

    invoke-static/range {v26 .. v26}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v31

    const/16 v38, 0xfdb

    const/16 v39, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v25 .. v39}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v31, 0x1c

    move-object/from16 v30, v25

    const v25, 0x3e570a3d    # 0.21f

    const v26, 0x3f24d014    # 0.6438f

    const/16 v28, 0x0

    invoke-direct/range {v24 .. v32}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v25, Lu61/e;

    new-instance v26, La71/a;

    const-string v27, "0.6486"

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    sget-object v27, Lr61/i$e0;->w:Lr61/i$e0;

    invoke-static/range {v27 .. v27}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v32

    const/16 v39, 0xfdb

    const/16 v40, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v26 .. v40}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v32, 0x1c

    move-object/from16 v31, v26

    const v26, 0x3e6147ae    # 0.22f

    const v27, 0x3f260aa6    # 0.6486f

    const/16 v29, 0x0

    invoke-direct/range {v25 .. v33}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v26, Lu61/e;

    new-instance v32, La71/a;

    const-string v27, "0.5388"

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v30

    sget-object v27, Lr61/i$f0;->w:Lr61/i$f0;

    invoke-static/range {v27 .. v27}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v33

    const/16 v40, 0xfdb

    const/16 v41, 0x0

    const/16 v31, 0x0

    move-object/from16 v27, v32

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v27 .. v41}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v33, 0x1c

    move-object/from16 v32, v27

    const v27, 0x3e6b851f    # 0.23f

    const v28, 0x3f09eecc    # 0.5388f

    const/16 v30, 0x0

    invoke-direct/range {v26 .. v34}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lu61/e;

    new-instance v33, La71/a;

    const-string v28, "0.6535"

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v31

    sget-object v28, Lr61/i$g0;->w:Lr61/i$g0;

    invoke-static/range {v28 .. v28}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v34

    const/16 v41, 0xfdb

    const/16 v42, 0x0

    const/16 v32, 0x0

    move-object/from16 v28, v33

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v28 .. v42}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v34, 0x1c

    move-object/from16 v33, v28

    const v28, 0x3e75c28f    # 0.24f

    const v29, 0x3f274bc7    # 0.6535f

    const/16 v31, 0x0

    invoke-direct/range {v27 .. v35}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v28, Lu61/e;

    new-instance v34, La71/a;

    const-string v29, "0.5849"

    invoke-static/range {v29 .. v29}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v32

    sget-object v29, Lr61/i$h0;->w:Lr61/i$h0;

    invoke-static/range {v29 .. v29}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v35

    const/16 v42, 0xfdb

    const/16 v43, 0x0

    const/16 v33, 0x0

    move-object/from16 v29, v34

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v41, 0x0

    invoke-direct/range {v29 .. v43}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v35, 0x1c

    move-object/from16 v34, v29

    const/high16 v29, 0x3e800000    # 0.25f

    const v30, 0x3f15bc02    # 0.5849f

    const/16 v32, 0x0

    invoke-direct/range {v28 .. v36}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v29, Lu61/e;

    new-instance v35, La71/a;

    const-string v30, "0.6391"

    invoke-static/range {v30 .. v30}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v33

    sget-object v30, Lr61/i$i0;->w:Lr61/i$i0;

    invoke-static/range {v30 .. v30}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v36

    const/16 v43, 0xfdb

    const/16 v44, 0x0

    const/16 v34, 0x0

    move-object/from16 v30, v35

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v42, 0x0

    invoke-direct/range {v30 .. v44}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v36, 0x1c

    move-object/from16 v35, v30

    const v30, 0x3e851eb8    # 0.26f

    const v31, 0x3f239c0f    # 0.6391f

    const/16 v33, 0x0

    invoke-direct/range {v29 .. v37}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v30, Lu61/e;

    new-instance v36, La71/a;

    const-string v31, "0.5077"

    invoke-static/range {v31 .. v31}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v34

    sget-object v31, Lr61/i$j0;->w:Lr61/i$j0;

    invoke-static/range {v31 .. v31}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v37

    const/16 v44, 0xfdb

    const/16 v45, 0x0

    const/16 v35, 0x0

    move-object/from16 v31, v36

    const/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v43, 0x0

    invoke-direct/range {v31 .. v45}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v37, 0x1c

    move-object/from16 v36, v31

    const v31, 0x3e8a3d71    # 0.27f

    const v32, 0x3f01f8a1    # 0.5077f

    const/16 v34, 0x0

    invoke-direct/range {v30 .. v38}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v31, Lu61/e;

    new-instance v32, La71/a;

    const-string v33, "0.4850"

    invoke-static/range {v33 .. v33}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v35

    sget-object v33, Lr61/i$k0;->w:Lr61/i$k0;

    invoke-static/range {v33 .. v33}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v38

    const/16 v45, 0xfdb

    const/16 v46, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v44, 0x0

    invoke-direct/range {v32 .. v46}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v38, 0x1c

    move-object/from16 v37, v32

    const v32, 0x3e8f5c29    # 0.28f

    const v33, 0x3ef851ec    # 0.485f

    const/16 v35, 0x0

    invoke-direct/range {v31 .. v39}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v32, Lu61/e;

    new-instance v33, La71/a;

    const-string v34, "0.5859"

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v36

    sget-object v34, Lr61/i$l0;->w:Lr61/i$l0;

    invoke-static/range {v34 .. v34}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v39

    const/16 v46, 0xfdb

    const/16 v47, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v45, 0x0

    invoke-direct/range {v33 .. v47}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v39, 0x1c

    move-object/from16 v38, v33

    const v33, 0x3e947ae1    # 0.29f

    const v34, 0x3f15fd8b    # 0.5859f

    const/16 v36, 0x0

    invoke-direct/range {v32 .. v40}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v33, Lu61/e;

    new-instance v34, La71/a;

    const-string v35, "0.4892"

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v37

    sget-object v35, Lr61/i$m0;->w:Lr61/i$m0;

    invoke-static/range {v35 .. v35}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v40

    const/16 v47, 0xfdb

    const/16 v48, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v46, 0x0

    invoke-direct/range {v34 .. v48}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v40, 0x1c

    move-object/from16 v39, v34

    const v34, 0x3e99999a    # 0.3f

    const v35, 0x3efa786c    # 0.4892f

    const/16 v37, 0x0

    invoke-direct/range {v33 .. v41}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lu61/e;

    new-instance v35, La71/a;

    const-string v36, "0.5674"

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v38

    sget-object v36, Lr61/i$n0;->w:Lr61/i$n0;

    invoke-static/range {v36 .. v36}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v41

    const/16 v48, 0xfdb

    const/16 v49, 0x0

    const/16 v36, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v47, 0x0

    invoke-direct/range {v35 .. v49}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v41, 0x1c

    move-object/from16 v40, v35

    const v35, 0x3e9eb852    # 0.31f

    const v36, 0x3f114120    # 0.5674f

    const/16 v38, 0x0

    invoke-direct/range {v34 .. v42}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v35, Lu61/e;

    new-instance v36, La71/a;

    const-string v37, "0.5334"

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v39

    sget-object v37, Lr61/i$p0;->w:Lr61/i$p0;

    invoke-static/range {v37 .. v37}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v42

    const/16 v49, 0xfdb

    const/16 v50, 0x0

    const/16 v37, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v48, 0x0

    invoke-direct/range {v36 .. v50}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v42, 0x1c

    move-object/from16 v41, v36

    const v36, 0x3ea3d70a    # 0.32f

    const v37, 0x3f088ce7    # 0.5334f

    const/16 v39, 0x0

    invoke-direct/range {v35 .. v43}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v36, Lu61/e;

    new-instance v37, La71/a;

    const-string v38, "0.5068"

    invoke-static/range {v38 .. v38}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    sget-object v38, Lr61/i$q0;->w:Lr61/i$q0;

    invoke-static/range {v38 .. v38}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v43

    const/16 v50, 0xfdb

    const/16 v51, 0x0

    const/16 v38, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v49, 0x0

    invoke-direct/range {v37 .. v51}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v43, 0x1c

    move-object/from16 v42, v37

    const v37, 0x3ea8f5c3    # 0.33f

    const v38, 0x3f01bda5    # 0.5068f

    const/16 v40, 0x0

    invoke-direct/range {v36 .. v44}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v37, Lu61/e;

    new-instance v38, La71/a;

    const-string v39, "0.5894"

    invoke-static/range {v39 .. v39}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v41

    sget-object v39, Lr61/i$r0;->w:Lr61/i$r0;

    invoke-static/range {v39 .. v39}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v44

    const/16 v51, 0xfdb

    const/16 v52, 0x0

    const/16 v39, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v50, 0x0

    invoke-direct/range {v38 .. v52}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v44, 0x1c

    move-object/from16 v43, v38

    const v38, 0x3eae147b    # 0.34f

    const v39, 0x3f16e2eb    # 0.5894f

    const/16 v41, 0x0

    invoke-direct/range {v37 .. v45}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v38, Lu61/e;

    new-instance v39, La71/a;

    const-string v40, "0.4416"

    invoke-static/range {v40 .. v40}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v42

    sget-object v40, Lr61/i$s0;->w:Lr61/i$s0;

    invoke-static/range {v40 .. v40}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v45

    const/16 v52, 0xfdb

    const/16 v53, 0x0

    const/16 v40, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v51, 0x0

    invoke-direct/range {v39 .. v53}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v45, 0x1c

    move-object/from16 v44, v39

    const v39, 0x3eb33333    # 0.35f

    const v40, 0x3ee21965    # 0.4416f

    const/16 v42, 0x0

    invoke-direct/range {v38 .. v46}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v39, Lu61/e;

    new-instance v40, La71/a;

    const-string v41, "0.4490"

    invoke-static/range {v41 .. v41}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v43

    sget-object v41, Lr61/i$t0;->w:Lr61/i$t0;

    invoke-static/range {v41 .. v41}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v46

    const/16 v53, 0xfdb

    const/16 v54, 0x0

    const/16 v41, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v52, 0x0

    invoke-direct/range {v40 .. v54}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v46, 0x1c

    move-object/from16 v45, v40

    const v40, 0x3eb851ec    # 0.36f

    const v41, 0x3ee5e354    # 0.449f

    const/16 v43, 0x0

    invoke-direct/range {v39 .. v47}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v40, Lu61/e;

    new-instance v41, La71/a;

    const-string v42, "0.4623"

    invoke-static/range {v42 .. v42}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v44

    sget-object v42, Lr61/i$u0;->w:Lr61/i$u0;

    invoke-static/range {v42 .. v42}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v47

    const/16 v54, 0xfdb

    const/16 v55, 0x0

    const/16 v42, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v53, 0x0

    invoke-direct/range {v41 .. v55}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v47, 0x1c

    move-object/from16 v46, v41

    const v41, 0x3ebd70a4    # 0.37f

    const v42, 0x3eecb296    # 0.4623f

    const/16 v44, 0x0

    invoke-direct/range {v40 .. v48}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v41, Lu61/e;

    new-instance v42, La71/a;

    const-string v43, "0.4163"

    invoke-static/range {v43 .. v43}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v45

    sget-object v43, Lr61/i$v0;->w:Lr61/i$v0;

    invoke-static/range {v43 .. v43}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v48

    const/16 v55, 0xfdb

    const/16 v56, 0x0

    const/16 v43, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v54, 0x0

    invoke-direct/range {v42 .. v56}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v48, 0x1c

    move-object/from16 v47, v42

    const v42, 0x3ec28f5c    # 0.38f

    const v43, 0x3ed52546    # 0.4163f

    const/16 v45, 0x0

    invoke-direct/range {v41 .. v49}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v42, Lu61/e;

    new-instance v48, La71/a;

    const-string v43, "0.3573"

    invoke-static/range {v43 .. v43}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v46

    sget-object v43, Lr61/i$w0;->w:Lr61/i$w0;

    invoke-static/range {v43 .. v43}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v49

    const/16 v56, 0xfdb

    const/16 v57, 0x0

    const/16 v47, 0x0

    move-object/from16 v43, v48

    const/16 v48, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v55, 0x0

    invoke-direct/range {v43 .. v57}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v49, 0x1c

    move-object/from16 v48, v43

    const v43, 0x3ec7ae14    # 0.39f

    const v44, 0x3eb6f007    # 0.3573f

    const/16 v46, 0x0

    invoke-direct/range {v42 .. v50}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v43, Lu61/e;

    new-instance v49, La71/a;

    const-string v44, "0.4263"

    invoke-static/range {v44 .. v44}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    sget-object v44, Lr61/i$x0;->w:Lr61/i$x0;

    invoke-static/range {v44 .. v44}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v50

    const/16 v57, 0xfdb

    const/16 v58, 0x0

    const/16 v48, 0x0

    move-object/from16 v44, v49

    const/16 v49, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v56, 0x0

    invoke-direct/range {v44 .. v58}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v50, 0x1c

    move-object/from16 v49, v44

    const v44, 0x3ecccccd    # 0.4f

    const v45, 0x3eda43fe    # 0.4263f

    const/16 v47, 0x0

    invoke-direct/range {v43 .. v51}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v44, Lu61/e;

    new-instance v50, La71/a;

    const-string v45, "0.4365"

    invoke-static/range {v45 .. v45}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v48

    sget-object v45, Lr61/i$y0;->w:Lr61/i$y0;

    invoke-static/range {v45 .. v45}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v51

    const/16 v58, 0xfdb

    const/16 v59, 0x0

    const/16 v49, 0x0

    move-object/from16 v45, v50

    const/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v57, 0x0

    invoke-direct/range {v45 .. v59}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v51, 0x1c

    move-object/from16 v50, v45

    const v45, 0x3ed1eb85    # 0.41f

    const v46, 0x3edf7cee    # 0.4365f

    const/16 v48, 0x0

    invoke-direct/range {v44 .. v52}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v45, Lu61/e;

    new-instance v51, La71/a;

    const-string v46, "0.3722"

    invoke-static/range {v46 .. v46}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v49

    sget-object v46, Lr61/i$a1;->w:Lr61/i$a1;

    invoke-static/range {v46 .. v46}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v52

    const/16 v59, 0xfdb

    const/16 v60, 0x0

    const/16 v50, 0x0

    move-object/from16 v46, v51

    const/16 v51, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v58, 0x0

    invoke-direct/range {v46 .. v60}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v52, 0x1c

    move-object/from16 v51, v46

    const v46, 0x3ed70a3d    # 0.42f

    const v47, 0x3ebe9100    # 0.3722f

    const/16 v49, 0x0

    invoke-direct/range {v45 .. v53}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v46, Lu61/e;

    new-instance v52, La71/a;

    const-string v47, "0.4456"

    invoke-static/range {v47 .. v47}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v50

    sget-object v47, Lr61/i$b1;->w:Lr61/i$b1;

    invoke-static/range {v47 .. v47}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v53

    const/16 v60, 0xfdb

    const/16 v61, 0x0

    const/16 v51, 0x0

    move-object/from16 v47, v52

    const/16 v52, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v59, 0x0

    invoke-direct/range {v47 .. v61}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v53, 0x1c

    move-object/from16 v52, v47

    const v47, 0x3edc28f6    # 0.43f

    const v48, 0x3ee425af    # 0.4456f

    const/16 v50, 0x0

    invoke-direct/range {v46 .. v54}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v47, Lu61/e;

    new-instance v48, La71/a;

    const-string v49, "0.4518"

    invoke-static/range {v49 .. v49}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v51

    sget-object v49, Lr61/i$c1;->w:Lr61/i$c1;

    invoke-static/range {v49 .. v49}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v54

    const/16 v61, 0xfdb

    const/16 v62, 0x0

    const/16 v49, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v60, 0x0

    invoke-direct/range {v48 .. v62}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v54, 0x1c

    move-object/from16 v53, v48

    const v48, 0x3ee147ae    # 0.44f

    const v49, 0x3ee75254    # 0.4518f

    const/16 v51, 0x0

    invoke-direct/range {v47 .. v55}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v48, Lu61/e;

    new-instance v49, La71/a;

    const-string v50, "0.3668"

    invoke-static/range {v50 .. v50}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v52

    sget-object v50, Lr61/i$d1;->w:Lr61/i$d1;

    invoke-static/range {v50 .. v50}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v55

    const/16 v62, 0xfdb

    const/16 v63, 0x0

    const/16 v50, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v61, 0x0

    invoke-direct/range {v49 .. v63}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v55, 0x1c

    move-object/from16 v54, v49

    const v49, 0x3ee66666    # 0.45f

    const v50, 0x3ebbcd36    # 0.3668f

    const/16 v52, 0x0

    invoke-direct/range {v48 .. v56}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v49, Lu61/e;

    new-instance v50, La71/a;

    const-string v51, "0.4673"

    invoke-static/range {v51 .. v51}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v53

    sget-object v51, Lr61/i$e1;->w:Lr61/i$e1;

    invoke-static/range {v51 .. v51}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v56

    const/16 v63, 0xfdb

    const/16 v64, 0x0

    const/16 v51, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v62, 0x0

    invoke-direct/range {v50 .. v64}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v56, 0x1c

    move-object/from16 v55, v50

    const v50, 0x3eeb851f    # 0.46f

    const v51, 0x3eef41f2    # 0.4673f

    const/16 v53, 0x0

    invoke-direct/range {v49 .. v57}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v50, Lu61/e;

    new-instance v51, La71/a;

    const-string v52, "0.3794"

    invoke-static/range {v52 .. v52}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v54

    sget-object v52, Lr61/i$f1;->w:Lr61/i$f1;

    invoke-static/range {v52 .. v52}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v57

    const/16 v64, 0xfdb

    const/16 v65, 0x0

    const/16 v52, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v63, 0x0

    invoke-direct/range {v51 .. v65}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v57, 0x1c

    move-object/from16 v56, v51

    const v51, 0x3ef0a3d7    # 0.47f

    const v52, 0x3ec240b8    # 0.3794f

    const/16 v54, 0x0

    invoke-direct/range {v50 .. v58}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v51, Lu61/e;

    new-instance v52, La71/a;

    const-string v53, "0.3785"

    invoke-static/range {v53 .. v53}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v55

    sget-object v53, Lr61/i$g1;->w:Lr61/i$g1;

    invoke-static/range {v53 .. v53}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v58

    const/16 v65, 0xfdb

    const/16 v66, 0x0

    const/16 v53, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v64, 0x0

    invoke-direct/range {v52 .. v66}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v58, 0x1c

    move-object/from16 v57, v52

    const v52, 0x3ef5c28f    # 0.48f

    const v53, 0x3ec1cac1    # 0.3785f

    const/16 v55, 0x0

    invoke-direct/range {v51 .. v59}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v52, Lu61/e;

    new-instance v53, La71/a;

    const-string v54, "0.4058"

    invoke-static/range {v54 .. v54}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v56

    sget-object v54, Lr61/i$h1;->w:Lr61/i$h1;

    invoke-static/range {v54 .. v54}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v59

    const/16 v66, 0xfdb

    const/16 v67, 0x0

    const/16 v54, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v65, 0x0

    invoke-direct/range {v53 .. v67}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v59, 0x1c

    move-object/from16 v58, v53

    const v53, 0x3efae148    # 0.49f

    const v54, 0x3ecfc505    # 0.4058f

    const/16 v56, 0x0

    invoke-direct/range {v52 .. v60}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v53, Lu61/e;

    new-instance v54, La71/a;

    const-string v55, "0.3326"

    invoke-static/range {v55 .. v55}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v57

    sget-object v55, Lr61/i$i1;->w:Lr61/i$i1;

    invoke-static/range {v55 .. v55}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v60

    const/16 v67, 0xfdb

    const/16 v68, 0x0

    const/16 v55, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v66, 0x0

    invoke-direct/range {v54 .. v68}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v60, 0x1c

    move-object/from16 v59, v54

    const/high16 v54, 0x3f000000    # 0.5f

    const v55, 0x3eaa4a8c    # 0.3326f

    const/16 v57, 0x0

    invoke-direct/range {v53 .. v61}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v54, Lu61/e;

    new-instance v55, La71/a;

    const-string v56, "0.3629"

    invoke-static/range {v56 .. v56}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v58

    sget-object v56, Lr61/i$j1;->w:Lr61/i$j1;

    invoke-static/range {v56 .. v56}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v61

    const/16 v68, 0xfdb

    const/16 v69, 0x0

    const/16 v56, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v67, 0x0

    invoke-direct/range {v55 .. v69}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v61, 0x1c

    move-object/from16 v60, v55

    const v55, 0x3f028f5c    # 0.51f

    const v56, 0x3eb9ce07    # 0.3629f

    const/16 v58, 0x0

    invoke-direct/range {v54 .. v62}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v55, Lu61/e;

    new-instance v56, La71/a;

    const-string v57, "0.2689"

    invoke-static/range {v57 .. v57}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v59

    sget-object v57, Lr61/i$l1;->w:Lr61/i$l1;

    invoke-static/range {v57 .. v57}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v62

    const/16 v69, 0xfdb

    const/16 v70, 0x0

    const/16 v57, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v68, 0x0

    invoke-direct/range {v56 .. v70}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v62, 0x1c

    move-object/from16 v61, v56

    const v56, 0x3f051eb8    # 0.52f

    const v57, 0x3e89ad43    # 0.2689f

    const/16 v59, 0x0

    invoke-direct/range {v55 .. v63}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v56, Lu61/e;

    new-instance v57, La71/a;

    const-string v58, "0.3899"

    invoke-static/range {v58 .. v58}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v60

    sget-object v58, Lr61/i$m1;->w:Lr61/i$m1;

    invoke-static/range {v58 .. v58}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v63

    const/16 v70, 0xfdb

    const/16 v71, 0x0

    const/16 v58, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v69, 0x0

    invoke-direct/range {v57 .. v71}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v63, 0x1c

    move-object/from16 v62, v57

    const v57, 0x3f07ae14    # 0.53f

    const v58, 0x3ec7a0f9    # 0.3899f

    const/16 v60, 0x0

    invoke-direct/range {v56 .. v64}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v57, Lu61/e;

    new-instance v58, La71/a;

    const-string v59, "0.3651"

    invoke-static/range {v59 .. v59}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v61

    sget-object v59, Lr61/i$n1;->w:Lr61/i$n1;

    invoke-static/range {v59 .. v59}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v64

    const/16 v71, 0xfdb

    const/16 v72, 0x0

    const/16 v59, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v70, 0x0

    invoke-direct/range {v58 .. v72}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v64, 0x1c

    move-object/from16 v63, v58

    const v58, 0x3f0a3d71    # 0.54f

    const v59, 0x3ebaee63    # 0.3651f

    const/16 v61, 0x0

    invoke-direct/range {v57 .. v65}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v58, Lu61/e;

    new-instance v64, La71/a;

    const-string v59, "0.2781"

    invoke-static/range {v59 .. v59}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v62

    sget-object v59, Lr61/i$o1;->w:Lr61/i$o1;

    invoke-static/range {v59 .. v59}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v65

    const/16 v72, 0xfdb

    const/16 v73, 0x0

    const/16 v63, 0x0

    move-object/from16 v59, v64

    const/16 v64, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v71, 0x0

    invoke-direct/range {v59 .. v73}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v65, 0x1c

    move-object/from16 v64, v59

    const v59, 0x3f0ccccd    # 0.55f

    const v60, 0x3e8e6320    # 0.2781f

    const/16 v62, 0x0

    invoke-direct/range {v58 .. v66}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v59, Lu61/e;

    new-instance v65, La71/a;

    const-string v60, "0.3271"

    invoke-static/range {v60 .. v60}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v63

    sget-object v60, Lr61/i$p1;->w:Lr61/i$p1;

    invoke-static/range {v60 .. v60}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v66

    const/16 v73, 0xfdb

    const/16 v74, 0x0

    const/16 v64, 0x0

    move-object/from16 v60, v65

    const/16 v65, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v72, 0x0

    invoke-direct/range {v60 .. v74}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v66, 0x1c

    move-object/from16 v65, v60

    const v60, 0x3f0f5c29    # 0.56f

    const v61, 0x3ea779a7    # 0.3271f

    const/16 v63, 0x0

    invoke-direct/range {v59 .. v67}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v60, Lu61/e;

    new-instance v66, La71/a;

    const-string v61, "0.2269"

    invoke-static/range {v61 .. v61}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v64

    sget-object v61, Lr61/i$q1;->w:Lr61/i$q1;

    invoke-static/range {v61 .. v61}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v67

    const/16 v74, 0xfdb

    const/16 v75, 0x0

    const/16 v65, 0x0

    move-object/from16 v61, v66

    const/16 v66, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v73, 0x0

    invoke-direct/range {v61 .. v75}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v67, 0x1c

    move-object/from16 v66, v61

    const v61, 0x3f11eb85    # 0.57f

    const v62, 0x3e685879    # 0.2269f

    const/16 v64, 0x0

    invoke-direct/range {v60 .. v68}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v61, Lu61/e;

    new-instance v67, La71/a;

    const-string v62, "0.2367"

    invoke-static/range {v62 .. v62}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v65

    sget-object v62, Lr61/i$r1;->w:Lr61/i$r1;

    invoke-static/range {v62 .. v62}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v68

    const/16 v75, 0xfdb

    const/16 v76, 0x0

    const/16 v66, 0x0

    move-object/from16 v62, v67

    const/16 v67, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v74, 0x0

    invoke-direct/range {v62 .. v76}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v68, 0x1c

    move-object/from16 v67, v62

    const v62, 0x3f147ae1    # 0.58f

    const v63, 0x3e72617c    # 0.2367f

    const/16 v65, 0x0

    invoke-direct/range {v61 .. v69}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v62, Lu61/e;

    new-instance v68, La71/a;

    const-string v63, "0.2742"

    invoke-static/range {v63 .. v63}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v66

    sget-object v63, Lr61/i$s1;->w:Lr61/i$s1;

    invoke-static/range {v63 .. v63}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v69

    const/16 v76, 0xfdb

    const/16 v77, 0x0

    const/16 v67, 0x0

    move-object/from16 v63, v68

    const/16 v68, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v75, 0x0

    invoke-direct/range {v63 .. v77}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v69, 0x1c

    move-object/from16 v68, v63

    const v63, 0x3f170a3d    # 0.59f

    const v64, 0x3e8c63f1    # 0.2742f

    const/16 v66, 0x0

    invoke-direct/range {v62 .. v70}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v63, Lu61/e;

    new-instance v64, La71/a;

    const-string v65, "0.2443"

    invoke-static/range {v65 .. v65}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v67

    sget-object v65, Lr61/i$t1;->w:Lr61/i$t1;

    invoke-static/range {v65 .. v65}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v70

    const/16 v77, 0xfdb

    const/16 v78, 0x0

    const/16 v65, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v76, 0x0

    invoke-direct/range {v64 .. v78}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v70, 0x1c

    move-object/from16 v69, v64

    const v64, 0x3f19999a    # 0.6f

    const v65, 0x3e7a29c7    # 0.2443f

    const/16 v67, 0x0

    invoke-direct/range {v63 .. v71}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v64, Lu61/e;

    new-instance v65, La71/a;

    const-string v66, "0.2035"

    invoke-static/range {v66 .. v66}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v68

    sget-object v66, Lr61/i$u1;->w:Lr61/i$u1;

    invoke-static/range {v66 .. v66}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v71

    const/16 v78, 0xfdb

    const/16 v79, 0x0

    const/16 v66, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v77, 0x0

    invoke-direct/range {v65 .. v79}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v71, 0x1c

    move-object/from16 v70, v65

    const v65, 0x3f1c28f6    # 0.61f

    const v66, 0x3e50624e    # 0.2035f

    const/16 v68, 0x0

    invoke-direct/range {v64 .. v72}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v65, Lu61/e;

    new-instance v66, La71/a;

    const-string v67, "0.2210"

    invoke-static/range {v67 .. v67}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v69

    sget-object v67, Lr61/i$w1;->w:Lr61/i$w1;

    invoke-static/range {v67 .. v67}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v72

    const/16 v79, 0xfdb

    const/16 v80, 0x0

    const/16 v67, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v78, 0x0

    invoke-direct/range {v66 .. v80}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v72, 0x1c

    move-object/from16 v71, v66

    const v66, 0x3f1eb852    # 0.62f

    const v67, 0x3e624dd3    # 0.221f

    const/16 v69, 0x0

    invoke-direct/range {v65 .. v73}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v66, Lu61/e;

    new-instance v67, La71/a;

    const-string v68, "0.2136"

    invoke-static/range {v68 .. v68}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v70

    sget-object v68, Lr61/i$x1;->w:Lr61/i$x1;

    invoke-static/range {v68 .. v68}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v73

    const/16 v80, 0xfdb

    const/16 v81, 0x0

    const/16 v68, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v79, 0x0

    invoke-direct/range {v67 .. v81}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v73, 0x1c

    move-object/from16 v72, v67

    const v67, 0x3f2147ae    # 0.63f

    const v68, 0x3e5ab9f5    # 0.2136f

    const/16 v70, 0x0

    invoke-direct/range {v66 .. v74}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v67, Lu61/e;

    new-instance v68, La71/a;

    const-string v69, "0.2376"

    invoke-static/range {v69 .. v69}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v71

    sget-object v69, Lr61/i$y1;->w:Lr61/i$y1;

    invoke-static/range {v69 .. v69}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v74

    const/16 v81, 0xfdb

    const/16 v82, 0x0

    const/16 v69, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v80, 0x0

    invoke-direct/range {v68 .. v82}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v74, 0x1c

    move-object/from16 v73, v68

    const v68, 0x3f23d70a    # 0.64f

    const v69, 0x3e734d6a    # 0.2376f

    const/16 v71, 0x0

    invoke-direct/range {v67 .. v75}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v68, Lu61/e;

    new-instance v69, La71/a;

    const-string v70, "0.2089"

    invoke-static/range {v70 .. v70}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v72

    sget-object v70, Lr61/i$z1;->w:Lr61/i$z1;

    invoke-static/range {v70 .. v70}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v75

    const/16 v82, 0xfdb

    const/16 v83, 0x0

    const/16 v70, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v81, 0x0

    invoke-direct/range {v69 .. v83}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v75, 0x1c

    move-object/from16 v74, v69

    const v69, 0x3f266666    # 0.65f

    const v70, 0x3e55e9e2    # 0.2089f

    const/16 v72, 0x0

    invoke-direct/range {v68 .. v76}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v69, Lu61/e;

    new-instance v70, La71/a;

    const-string v71, "0.2132"

    invoke-static/range {v71 .. v71}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v73

    sget-object v71, Lr61/i$a2;->w:Lr61/i$a2;

    invoke-static/range {v71 .. v71}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v76

    const/16 v83, 0xfdb

    const/16 v84, 0x0

    const/16 v71, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v82, 0x0

    invoke-direct/range {v70 .. v84}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v76, 0x1c

    move-object/from16 v75, v70

    const v70, 0x3f28f5c3    # 0.66f

    const v71, 0x3e5a511a    # 0.2132f

    const/16 v73, 0x0

    invoke-direct/range {v69 .. v77}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v70, Lu61/e;

    new-instance v71, La71/a;

    const-string v72, "0.1976"

    invoke-static/range {v72 .. v72}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v74

    sget-object v72, Lr61/i$b2;->w:Lr61/i$b2;

    invoke-static/range {v72 .. v72}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v77

    const/16 v84, 0xfdb

    const/16 v85, 0x0

    const/16 v72, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v83, 0x0

    invoke-direct/range {v71 .. v85}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v77, 0x1c

    move-object/from16 v76, v71

    const v71, 0x3f2b851f    # 0.67f

    const v72, 0x3e4a57a8    # 0.1976f

    const/16 v74, 0x0

    invoke-direct/range {v70 .. v78}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v71, Lu61/e;

    new-instance v72, La71/a;

    const-string v73, "0.1723"

    invoke-static/range {v73 .. v73}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v75

    sget-object v73, Lr61/i$c2;->w:Lr61/i$c2;

    invoke-static/range {v73 .. v73}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v78

    const/16 v85, 0xfdb

    const/16 v86, 0x0

    const/16 v73, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v84, 0x0

    invoke-direct/range {v72 .. v86}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v78, 0x1c

    move-object/from16 v77, v72

    const v72, 0x3f2e147b    # 0.68f

    const v73, 0x3e306f69    # 0.1723f

    const/16 v75, 0x0

    invoke-direct/range {v71 .. v79}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v72, Lu61/e;

    new-instance v73, La71/a;

    const-string v74, "0.1451"

    invoke-static/range {v74 .. v74}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v76

    sget-object v74, Lr61/i$d2;->w:Lr61/i$d2;

    invoke-static/range {v74 .. v74}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v79

    const/16 v86, 0xfdb

    const/16 v87, 0x0

    const/16 v74, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v85, 0x0

    invoke-direct/range {v73 .. v87}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v79, 0x1c

    move-object/from16 v78, v73

    const v73, 0x3f30a3d7    # 0.69f

    const v74, 0x3e149518    # 0.1451f

    const/16 v76, 0x0

    invoke-direct/range {v72 .. v80}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v73, Lu61/e;

    new-instance v74, La71/a;

    const-string v75, "0.1709"

    invoke-static/range {v75 .. v75}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v77

    sget-object v75, Lr61/i$e2;->w:Lr61/i$e2;

    invoke-static/range {v75 .. v75}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v80

    const/16 v87, 0xfdb

    const/16 v88, 0x0

    const/16 v75, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v86, 0x0

    invoke-direct/range {v74 .. v88}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v80, 0x1c

    move-object/from16 v79, v74

    const v74, 0x3f333333    # 0.7f

    const v75, 0x3e2f0069    # 0.1709f

    const/16 v77, 0x0

    invoke-direct/range {v73 .. v81}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v74, Lu61/e;

    new-instance v80, La71/a;

    const-string v75, "0.1160"

    invoke-static/range {v75 .. v75}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v78

    sget-object v75, Lr61/i$f2;->w:Lr61/i$f2;

    invoke-static/range {v75 .. v75}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v81

    const/16 v88, 0xfdb

    const/16 v89, 0x0

    const/16 v79, 0x0

    move-object/from16 v75, v80

    const/16 v80, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v87, 0x0

    invoke-direct/range {v75 .. v89}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v81, 0x1c

    move-object/from16 v80, v75

    const v75, 0x3f35c28f    # 0.71f

    const v76, 0x3ded9168    # 0.116f

    const/16 v78, 0x0

    invoke-direct/range {v74 .. v82}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v75, Lu61/e;

    new-instance v81, La71/a;

    const-string v76, "0.1314"

    invoke-static/range {v76 .. v76}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v79

    sget-object v76, Lr61/i$h2;->w:Lr61/i$h2;

    invoke-static/range {v76 .. v76}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v82

    const/16 v89, 0xfdb

    const/16 v90, 0x0

    const/16 v80, 0x0

    move-object/from16 v76, v81

    const/16 v81, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v88, 0x0

    invoke-direct/range {v76 .. v90}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v82, 0x1c

    move-object/from16 v81, v76

    const v76, 0x3f3851ec    # 0.72f

    const v77, 0x3e068db9    # 0.1314f

    const/16 v79, 0x0

    invoke-direct/range {v75 .. v83}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v76, Lu61/e;

    new-instance v82, La71/a;

    const-string v77, "0.1360"

    invoke-static/range {v77 .. v77}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v80

    sget-object v77, Lr61/i$i2;->w:Lr61/i$i2;

    invoke-static/range {v77 .. v77}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v83

    const/16 v90, 0xfdb

    const/16 v91, 0x0

    const/16 v81, 0x0

    move-object/from16 v77, v82

    const/16 v82, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v89, 0x0

    invoke-direct/range {v77 .. v91}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v83, 0x1c

    move-object/from16 v82, v77

    const v77, 0x3f3ae148    # 0.73f

    const v78, 0x3e0b4396    # 0.136f

    const/16 v80, 0x0

    invoke-direct/range {v76 .. v84}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v77, Lu61/e;

    new-instance v83, La71/a;

    const-string v78, "0.1073"

    invoke-static/range {v78 .. v78}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v81

    sget-object v78, Lr61/i$j2;->w:Lr61/i$j2;

    invoke-static/range {v78 .. v78}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v84

    const/16 v91, 0xfdb

    const/16 v92, 0x0

    const/16 v82, 0x0

    move-object/from16 v78, v83

    const/16 v83, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v90, 0x0

    invoke-direct/range {v78 .. v92}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v84, 0x1c

    move-object/from16 v83, v78

    const v78, 0x3f3d70a4    # 0.74f

    const v79, 0x3ddbc01a    # 0.1073f

    const/16 v81, 0x0

    invoke-direct/range {v77 .. v85}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v78, Lu61/e;

    new-instance v84, La71/a;

    const-string v79, "0.1031"

    invoke-static/range {v79 .. v79}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v82

    sget-object v79, Lr61/i$k2;->w:Lr61/i$k2;

    invoke-static/range {v79 .. v79}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v85

    const/16 v92, 0xfdb

    const/16 v93, 0x0

    const/16 v83, 0x0

    move-object/from16 v79, v84

    const/16 v84, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v91, 0x0

    invoke-direct/range {v79 .. v93}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v85, 0x1c

    move-object/from16 v84, v79

    const/high16 v79, 0x3f400000    # 0.75f

    const v80, 0x3dd32618    # 0.1031f

    const/16 v82, 0x0

    invoke-direct/range {v78 .. v86}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v79, Lu61/e;

    new-instance v80, La71/a;

    const-string v81, "0.0890"

    invoke-static/range {v81 .. v81}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v83

    sget-object v81, Lr61/i$l2;->w:Lr61/i$l2;

    invoke-static/range {v81 .. v81}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v86

    const/16 v93, 0xfdb

    const/16 v94, 0x0

    const/16 v81, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v92, 0x0

    invoke-direct/range {v80 .. v94}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v86, 0x1c

    move-object/from16 v85, v80

    const v80, 0x3f428f5c    # 0.76f

    const v81, 0x3db645a2    # 0.089f

    const/16 v83, 0x0

    invoke-direct/range {v79 .. v87}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v80, Lu61/e;

    new-instance v81, La71/a;

    const-string v82, "0.0751"

    invoke-static/range {v82 .. v82}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v84

    sget-object v82, Lr61/i$m2;->w:Lr61/i$m2;

    invoke-static/range {v82 .. v82}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v87

    const/16 v94, 0xfdb

    const/16 v95, 0x0

    const/16 v82, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v93, 0x0

    invoke-direct/range {v81 .. v95}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v87, 0x1c

    move-object/from16 v86, v81

    const v81, 0x3f451eb8    # 0.77f

    const v82, 0x3d99ce07    # 0.0751f

    const/16 v84, 0x0

    invoke-direct/range {v80 .. v88}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v81, Lu61/e;

    new-instance v82, La71/a;

    const-string v83, "0.0662"

    invoke-static/range {v83 .. v83}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v85

    sget-object v83, Lr61/i$n2;->w:Lr61/i$n2;

    invoke-static/range {v83 .. v83}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v88

    const/16 v95, 0xfdb

    const/16 v96, 0x0

    const/16 v83, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v94, 0x0

    invoke-direct/range {v82 .. v96}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v88, 0x1c

    move-object/from16 v87, v82

    const v82, 0x3f47ae14    # 0.78f

    const v83, 0x3d8793de    # 0.0662f

    const/16 v85, 0x0

    invoke-direct/range {v81 .. v89}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v82, Lu61/e;

    new-instance v83, La71/a;

    const-string v84, "0.0620"

    invoke-static/range {v84 .. v84}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v86

    sget-object v84, Lr61/i$o2;->w:Lr61/i$o2;

    invoke-static/range {v84 .. v84}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v89

    const/16 v96, 0xfdb

    const/16 v97, 0x0

    const/16 v84, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v95, 0x0

    invoke-direct/range {v83 .. v97}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v89, 0x1c

    move-object/from16 v88, v83

    const v83, 0x3f4a3d71    # 0.79f

    const v84, 0x3d7df3b6    # 0.062f

    const/16 v86, 0x0

    invoke-direct/range {v82 .. v90}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v83, Lu61/e;

    new-instance v84, La71/a;

    const-string v85, "0.0438"

    invoke-static/range {v85 .. v85}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v87

    sget-object v85, Lr61/i$p2;->w:Lr61/i$p2;

    invoke-static/range {v85 .. v85}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v90

    const/16 v97, 0xfdb

    const/16 v98, 0x0

    const/16 v85, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v96, 0x0

    invoke-direct/range {v84 .. v98}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v90, 0x1c

    move-object/from16 v89, v84

    const v84, 0x3f4ccccd    # 0.8f

    const v85, 0x3d3367a1    # 0.0438f

    const/16 v87, 0x0

    invoke-direct/range {v83 .. v91}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v84, Lu61/e;

    new-instance v85, La71/a;

    const-string v86, "0.0380"

    invoke-static/range {v86 .. v86}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v88

    sget-object v86, Lr61/i$q2;->w:Lr61/i$q2;

    invoke-static/range {v86 .. v86}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v91

    const/16 v98, 0xfdb

    const/16 v99, 0x0

    const/16 v86, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v97, 0x0

    invoke-direct/range {v85 .. v99}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v91, 0x1c

    move-object/from16 v90, v85

    const v85, 0x3f4f5c29    # 0.81f

    const v86, 0x3d1ba5e3    # 0.038f

    const/16 v88, 0x0

    invoke-direct/range {v84 .. v92}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v85, Lu61/e;

    new-instance v86, La71/a;

    const-string v87, "0.0277"

    invoke-static/range {v87 .. v87}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v89

    sget-object v87, Lr61/i$s2;->w:Lr61/i$s2;

    invoke-static/range {v87 .. v87}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v92

    const/16 v99, 0xfdb

    const/16 v100, 0x0

    const/16 v87, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v98, 0x0

    invoke-direct/range {v86 .. v100}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v92, 0x1c

    move-object/from16 v91, v86

    const v86, 0x3f51eb85    # 0.82f

    const v87, 0x3ce2eb1c    # 0.0277f

    const/16 v89, 0x0

    invoke-direct/range {v85 .. v93}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v86, Lu61/e;

    new-instance v87, La71/a;

    const-string v88, "0.0200"

    invoke-static/range {v88 .. v88}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v90

    sget-object v88, Lr61/i$t2;->w:Lr61/i$t2;

    invoke-static/range {v88 .. v88}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v93

    const/16 v100, 0xfdb

    const/16 v101, 0x0

    const/16 v88, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v99, 0x0

    invoke-direct/range {v87 .. v101}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v93, 0x1c

    move-object/from16 v92, v87

    const v87, 0x3f547ae1    # 0.83f

    const v88, 0x3ca3d70a    # 0.02f

    const/16 v90, 0x0

    invoke-direct/range {v86 .. v94}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v87, Lu61/e;

    new-instance v88, La71/a;

    const-string v89, "0.0107"

    invoke-static/range {v89 .. v89}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v91

    sget-object v89, Lr61/i$u2;->w:Lr61/i$u2;

    invoke-static/range {v89 .. v89}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v94

    const/16 v101, 0xfdb

    const/16 v102, 0x0

    const/16 v89, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v100, 0x0

    invoke-direct/range {v88 .. v102}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v94, 0x1c

    move-object/from16 v93, v88

    const v88, 0x3f570a3d    # 0.84f

    const v89, 0x3c2f4f0e    # 0.0107f

    const/16 v91, 0x0

    invoke-direct/range {v87 .. v95}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v88, Lu61/e;

    new-instance v89, La71/a;

    const-string v104, "0.0000"

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v92

    sget-object v90, Lr61/i$v2;->w:Lr61/i$v2;

    invoke-static/range {v90 .. v90}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v95

    const/16 v102, 0xfdb

    const/16 v103, 0x0

    const/16 v90, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v101, 0x0

    invoke-direct/range {v89 .. v103}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v95, 0x1c

    move-object/from16 v94, v89

    const v89, 0x3f59999a    # 0.85f

    const/16 v90, 0x0

    const/16 v92, 0x0

    invoke-direct/range {v88 .. v96}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v89, Lu61/e;

    new-instance v105, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v90, Lr61/i$w2;->w:Lr61/i$w2;

    invoke-static/range {v90 .. v90}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    const/16 v118, 0xfdb

    const/16 v119, 0x0

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v109, 0x0

    const/16 v110, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const/16 v115, 0x0

    const/16 v116, 0x0

    const/16 v117, 0x0

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v96, 0x1c

    const/16 v97, 0x0

    const v90, 0x3f5c28f6    # 0.86f

    const/16 v91, 0x0

    const/16 v94, 0x0

    move-object/from16 v95, v105

    invoke-direct/range {v89 .. v97}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v90, Lu61/e;

    new-instance v96, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v91, Lr61/i$x2;->w:Lr61/i$x2;

    invoke-static/range {v91 .. v91}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    move-object/from16 v105, v96

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v97, 0x1c

    const v91, 0x3f5eb852    # 0.87f

    const/16 v92, 0x0

    const/16 v95, 0x0

    invoke-direct/range {v90 .. v98}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v91, Lu61/e;

    new-instance v97, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v92, Lr61/i$y2;->w:Lr61/i$y2;

    invoke-static/range {v92 .. v92}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    move-object/from16 v105, v97

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v98, 0x1c

    const v92, 0x3f6147ae    # 0.88f

    const/16 v93, 0x0

    const/16 v96, 0x0

    invoke-direct/range {v91 .. v99}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v92, Lu61/e;

    new-instance v98, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v93, Lr61/i$z2;->w:Lr61/i$z2;

    invoke-static/range {v93 .. v93}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    move-object/from16 v105, v98

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v99, 0x1c

    const v93, 0x3f63d70a    # 0.89f

    const/16 v94, 0x0

    const/16 v97, 0x0

    invoke-direct/range {v92 .. v100}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v93, Lu61/e;

    new-instance v99, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v94, Lr61/i$a3;->w:Lr61/i$a3;

    invoke-static/range {v94 .. v94}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    move-object/from16 v105, v99

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v100, 0x1c

    const v94, 0x3f666666    # 0.9f

    const/16 v95, 0x0

    const/16 v98, 0x0

    invoke-direct/range {v93 .. v101}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v94, Lu61/e;

    new-instance v100, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v95, Lr61/i$b3;->w:Lr61/i$b3;

    invoke-static/range {v95 .. v95}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    move-object/from16 v105, v100

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v101, 0x1c

    const/16 v102, 0x0

    const v95, 0x3f68f5c3    # 0.91f

    const/16 v96, 0x0

    const/16 v99, 0x0

    invoke-direct/range {v94 .. v102}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v95, Lu61/e;

    new-instance v101, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v96, Lr61/i$a;->w:Lr61/i$a;

    invoke-static/range {v96 .. v96}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    move-object/from16 v105, v101

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v102, 0x1c

    const v96, 0x3f6b851f    # 0.92f

    const/16 v97, 0x0

    const/16 v100, 0x0

    invoke-direct/range {v95 .. v103}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v96, Lu61/e;

    new-instance v105, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v97, Lr61/i$b;->w:Lr61/i$b;

    invoke-static/range {v97 .. v97}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v112, 0x1c

    const/16 v113, 0x0

    const v106, 0x3f6e147b    # 0.93f

    const/16 v107, 0x0

    const/16 v108, 0x0

    move-object/from16 v111, v105

    move-object/from16 v105, v96

    invoke-direct/range {v105 .. v113}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v97, Lu61/e;

    new-instance v105, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v98, Lr61/i$c;->w:Lr61/i$c;

    invoke-static/range {v98 .. v98}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v112, 0x1c

    const/16 v113, 0x0

    const v106, 0x3f70a3d7    # 0.94f

    const/16 v107, 0x0

    const/16 v108, 0x0

    move-object/from16 v111, v105

    move-object/from16 v105, v97

    invoke-direct/range {v105 .. v113}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v98, Lu61/e;

    new-instance v105, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v99, Lr61/i$d;->w:Lr61/i$d;

    invoke-static/range {v99 .. v99}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v112, 0x1c

    const/16 v113, 0x0

    const v106, 0x3f733333    # 0.95f

    const/16 v107, 0x0

    const/16 v108, 0x0

    move-object/from16 v111, v105

    move-object/from16 v105, v98

    invoke-direct/range {v105 .. v113}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v99, Lu61/e;

    new-instance v105, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v100, Lr61/i$e;->w:Lr61/i$e;

    invoke-static/range {v100 .. v100}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v112, 0x1c

    const/16 v113, 0x0

    const v106, 0x3f75c28f    # 0.96f

    const/16 v107, 0x0

    const/16 v108, 0x0

    move-object/from16 v111, v105

    move-object/from16 v105, v99

    invoke-direct/range {v105 .. v113}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v100, Lu61/e;

    new-instance v105, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v101, Lr61/i$f;->w:Lr61/i$f;

    invoke-static/range {v101 .. v101}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v112, 0x1c

    const/16 v113, 0x0

    const v106, 0x3f7851ec    # 0.97f

    const/16 v107, 0x0

    const/16 v108, 0x0

    move-object/from16 v111, v105

    move-object/from16 v105, v100

    invoke-direct/range {v105 .. v113}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v101, Lu61/e;

    new-instance v105, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v102, Lr61/i$g;->w:Lr61/i$g;

    invoke-static/range {v102 .. v102}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v112, 0x1c

    const/16 v113, 0x0

    const v106, 0x3f7ae148    # 0.98f

    const/16 v107, 0x0

    const/16 v108, 0x0

    move-object/from16 v111, v105

    move-object/from16 v105, v101

    invoke-direct/range {v105 .. v113}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v102, Lu61/e;

    new-instance v105, La71/a;

    invoke-static/range {v104 .. v104}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v108

    sget-object v103, Lr61/i$h;->w:Lr61/i$h;

    invoke-static/range {v103 .. v103}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v111

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    invoke-direct/range {v105 .. v119}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v112, 0x1c

    const/16 v113, 0x0

    const v106, 0x3f7d70a4    # 0.99f

    const/16 v107, 0x0

    const/16 v108, 0x0

    move-object/from16 v111, v105

    move-object/from16 v105, v102

    invoke-direct/range {v105 .. v113}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v3 .. v102}, [Lu61/e;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object v5, v2

    new-instance v2, Lu61/a;

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v3, Lj71/b$g;

    const/16 v10, 0x3c

    const/4 v11, 0x0

    const-string v5, "reddishline"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lj71/c;-><init>(Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final d()Lj71/c;
    .locals 12

    invoke-static {}, Lr61/i;->c()Lj71/c;

    move-result-object v0

    invoke-virtual {v0}, Lj71/c;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graph.state.GraphPlotState.Line"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Lj71/b$g;

    invoke-virtual {v3}, Lj71/b$g;->g()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lu61/a;

    invoke-virtual {v4}, Lu61/a;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lu61/e;

    invoke-virtual {v7}, Lu61/e;->a()F

    move-result v7

    const v8, 0x3dcccccd    # 0.1f

    cmpg-float v7, v7, v8

    if-gtz v7, :cond_0

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lu61/e;

    invoke-virtual {v7}, Lu61/e;->a()F

    move-result v7

    const v8, 0x3ecccccd    # 0.4f

    cmpl-float v7, v7, v8

    if-lez v7, :cond_2

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lu61/a;->b(Lu61/a;Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILjava/lang/Object;)Lu61/a;

    move-result-object v1

    move-object v5, v2

    invoke-static/range {v4 .. v10}, Lu61/a;->b(Lu61/a;Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILjava/lang/Object;)Lu61/a;

    move-result-object v2

    filled-new-array {v1, v2}, [Lu61/a;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/16 v10, 0x3c

    const/4 v11, 0x0

    const-string v5, "reddish line with gap"

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lj71/b$g;->f(Lj71/b$g;Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILjava/lang/Object;)Lj71/b$g;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lj71/c;->b(Lj71/c;Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILjava/lang/Object;)Lj71/c;

    move-result-object v0

    return-object v0
.end method

.method public static final e()Lj71/c;
    .locals 110

    new-instance v0, Lg61/b;

    new-instance v1, Lyy0/c;

    const-string v2, "0.0"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v3, Lr61/i$d3;->w:Lr61/i$d3;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v4

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lyy0/c;

    const-string v3, "1.0"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v4, Lr61/i$e3;->w:Lr61/i$e3;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/high16 v6, 0x3f000000    # 0.5f

    const v7, 0x3eaaaaab

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lyy0/c;

    const-string v4, "2.0"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v5, Lr61/i$f3;->w:Lr61/i$f3;

    invoke-static {v5}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    const/16 v10, 0x20

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const v8, 0x3f2aaaab

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lyy0/c;

    const-string v5, "3.0"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Lr61/i$g3;->w:Lr61/i$g3;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/high16 v8, 0x3f000000    # 0.5f

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v2, v3, v4}, [Lyy0/c;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    sget-object v4, Lg61/d;->STANDARD:Lg61/d;

    const-string v11, ""

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/16 v9, 0xc0

    const v1, 0x3dcccccd    # 0.1f

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lg61/b;

    sget-object v16, Lg61/d;->TIME_MARKER:Lg61/d;

    const-string v1, "11:00 AM"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v21, 0xc0

    const/16 v22, 0x0

    const v13, 0x3dcccccd    # 0.1f

    sget-object v7, Lm83/y;->w:Lm83/y;

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v12, v2

    move-object v14, v7

    invoke-direct/range {v12 .. v22}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lg61/b;

    new-instance v15, Lyy0/c;

    const-string v1, "9:00 AM"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    sget-object v1, Lr61/i$h3;->w:Lr61/i$h3;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v18

    const/16 v22, 0x20

    const/16 v23, 0x0

    const/16 v17, 0x0

    const v19, 0x3eaa7efa    # 0.333f

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v15 .. v23}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lyy0/c;

    const-string v1, "10:00 AM"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v1, Lr61/i$i3;->w:Lr61/i$i3;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v19

    const/16 v23, 0x20

    const/16 v24, 0x0

    const/16 v18, 0x0

    const v20, 0x3f2a7efa    # 0.666f

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v16 .. v24}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    filled-new-array {v15, v1}, [Lyy0/c;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/16 v12, 0xc0

    const/4 v13, 0x0

    move-object v7, v4

    const v4, 0x3e19999a    # 0.15f

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lj61/f;

    const/16 v12, 0x7e

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v13}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lj61/f;

    const/16 v23, 0x7e

    const v16, 0x3eaa7efa    # 0.333f

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v15 .. v24}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lj61/f;

    const/16 v24, 0x7e

    const/16 v25, 0x0

    const v17, 0x3f2a7efa    # 0.666f

    const/16 v23, 0x0

    invoke-direct/range {v16 .. v25}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    new-instance v16, Lj61/f;

    const/high16 v17, 0x3f800000    # 1.0f

    invoke-direct/range {v16 .. v25}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v16

    filled-new-array {v4, v15, v1, v5}, [Lj61/f;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v5, Lh2/c;

    const v1, 0x3d4ccccd    # 0.05f

    const v4, 0x3d23d70a    # 0.04f

    invoke-direct {v5, v1, v1, v1, v4}, Lh2/c;-><init>(FFFF)V

    new-instance v7, Lj61/g;

    const-string v1, "stressHrGraphState"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/16 v12, 0xe

    invoke-direct/range {v7 .. v13}, Lj61/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lj61/h;

    const/16 v15, 0x1e08

    move-object v1, v0

    move-object/from16 v0, v16

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const-wide/16 v12, 0x0

    move-object v8, v7

    move-object v7, v14

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v16}, Lj61/h;-><init>(Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lk61/c;

    new-instance v2, Lqt2/w;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lqt2/w;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    const/16 v9, 0x37

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lu61/e;

    const/16 v9, 0x3c

    const/4 v3, 0x0

    const v4, 0x3e332a1b

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lu61/e;

    const/16 v10, 0x3c

    const v4, 0x3c23d70a    # 0.01f

    const v5, 0x3e7191af

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lu61/e;

    const/16 v11, 0x3c

    const/4 v12, 0x0

    const v5, 0x3ca3d70a    # 0.02f

    const v6, 0x3e4bcf2d

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lu61/e;

    const/16 v12, 0x3c

    const/4 v13, 0x0

    const v6, 0x3cf5c28f    # 0.03f

    const v7, 0x3e63e95c

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lu61/e;

    const/16 v13, 0x3c

    const/4 v14, 0x0

    const v7, 0x3d23d70a    # 0.04f

    const v8, 0x3e3fe4f6

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lu61/e;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const v8, 0x3d4ccccd    # 0.05f

    const v9, 0x3e2050a4

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lu61/e;

    const/16 v15, 0x3c

    const v9, 0x3d75c28f    # 0.06f

    const v10, 0x3e27f02e

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lu61/e;

    const/16 v16, 0x3c

    const/16 v17, 0x0

    const v10, 0x3d8f5c29    # 0.07f

    const v11, 0x3e680e76

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lu61/e;

    const/16 v17, 0x3c

    const v11, 0x3da3d70a    # 0.08f

    const v12, 0x3e716941

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lu61/e;

    const/16 v18, 0x3c

    const v12, 0x3db851ec    # 0.09f

    const v13, 0x3e6cadb8

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lu61/e;

    const/16 v19, 0x3c

    const v13, 0x3dcccccd    # 0.1f

    const v14, 0x3e12b24b

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lu61/e;

    const/16 v20, 0x3c

    const v14, 0x3de147ae    # 0.11f

    const v15, 0x3e3cbdb9

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v21}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lu61/e;

    const/16 v21, 0x3c

    const v15, 0x3df5c28f    # 0.12f

    const v16, 0x3e8b06bb

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lu61/e;

    const/16 v22, 0x3c

    const v16, 0x3e051eb8    # 0.13f

    const v17, 0x3e75db72

    const/16 v21, 0x0

    invoke-direct/range {v15 .. v23}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lu61/e;

    const/16 v23, 0x3c

    const/16 v24, 0x0

    const v17, 0x3e0f5c29    # 0.14f

    const v18, 0x3e509689

    const/16 v22, 0x0

    invoke-direct/range {v16 .. v24}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v17, Lu61/e;

    const/16 v24, 0x3c

    const v18, 0x3e19999a    # 0.15f

    const v19, 0x3e8a9b48

    const/16 v23, 0x0

    invoke-direct/range {v17 .. v25}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lu61/e;

    const/16 v25, 0x3c

    const/16 v26, 0x0

    const v19, 0x3e23d70a    # 0.16f

    const v20, 0x3e454f1e

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v26}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v19, Lu61/e;

    const/16 v26, 0x3c

    const/16 v27, 0x0

    const v20, 0x3e2e147b    # 0.17f

    const v21, 0x3e16a975

    const/16 v25, 0x0

    invoke-direct/range {v19 .. v27}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v20, Lu61/e;

    const/16 v27, 0x3c

    const/16 v28, 0x0

    const v21, 0x3e3851ec    # 0.18f

    const v22, 0x3e47e5f7

    const/16 v26, 0x0

    invoke-direct/range {v20 .. v28}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v21, Lu61/e;

    const/16 v28, 0x3c

    const/16 v29, 0x0

    const v22, 0x3e428f5c    # 0.19f

    const v23, 0x3e8c28d3

    const/16 v27, 0x0

    invoke-direct/range {v21 .. v29}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v22, Lu61/e;

    const/16 v29, 0x3c

    const/16 v30, 0x0

    const v23, 0x3e4ccccd    # 0.2f

    const v24, 0x3e34ff24

    const/16 v28, 0x0

    invoke-direct/range {v22 .. v30}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v23, Lu61/e;

    const/16 v30, 0x3c

    const/16 v31, 0x0

    const v24, 0x3e570a3d    # 0.21f

    const v25, 0x3e838400

    const/16 v29, 0x0

    invoke-direct/range {v23 .. v31}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v24, Lu61/e;

    const/16 v31, 0x3c

    const/16 v32, 0x0

    const v25, 0x3e6147ae    # 0.22f

    const v26, 0x3e4b4ca7

    const/16 v30, 0x0

    invoke-direct/range {v24 .. v32}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v25, Lu61/e;

    const/16 v32, 0x3c

    const/16 v33, 0x0

    const v26, 0x3e6b851f    # 0.23f

    const v27, 0x3e2b4fb5

    const/16 v31, 0x0

    invoke-direct/range {v25 .. v33}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v26, Lu61/e;

    const/16 v33, 0x3c

    const/16 v34, 0x0

    const v27, 0x3e75c28f    # 0.24f

    const v28, 0x3e3f5cc2

    const/16 v32, 0x0

    invoke-direct/range {v26 .. v34}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lu61/e;

    const/16 v34, 0x3c

    const/16 v35, 0x0

    const/high16 v28, 0x3e800000    # 0.25f

    const v29, 0x3e6f612c

    const/16 v33, 0x0

    invoke-direct/range {v27 .. v35}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v28, Lu61/e;

    const/16 v35, 0x3c

    const/16 v36, 0x0

    const v29, 0x3e851eb8    # 0.26f

    const v30, 0x3e7d1f1d    # 0.247189f

    const/16 v34, 0x0

    invoke-direct/range {v28 .. v36}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v29, Lu61/e;

    const/16 v36, 0x3c

    const/16 v37, 0x0

    const v30, 0x3e8a3d71    # 0.27f

    const v31, 0x3e7a42bd

    const/16 v35, 0x0

    invoke-direct/range {v29 .. v37}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v30, Lu61/e;

    const/16 v37, 0x3c

    const/16 v38, 0x0

    const v31, 0x3e8f5c29    # 0.28f

    const v32, 0x3e968bf8

    const/16 v36, 0x0

    invoke-direct/range {v30 .. v38}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v31, Lu61/e;

    const/16 v38, 0x3c

    const/16 v39, 0x0

    const v32, 0x3e947ae1    # 0.29f

    const v33, 0x3e8a9c66

    const/16 v37, 0x0

    invoke-direct/range {v31 .. v39}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v32, Lu61/e;

    const/16 v39, 0x3c

    const/16 v40, 0x0

    const v33, 0x3e99999a    # 0.3f

    const v34, 0x3e875f1f

    const/16 v38, 0x0

    invoke-direct/range {v32 .. v40}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v33, Lu61/e;

    const/16 v40, 0x3c

    const/16 v41, 0x0

    const v34, 0x3e9eb852    # 0.31f

    const v35, 0x3e8129bd

    const/16 v39, 0x0

    invoke-direct/range {v33 .. v41}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lu61/e;

    const/16 v41, 0x3c

    const/16 v42, 0x0

    const v35, 0x3ea3d70a    # 0.32f

    const v36, 0x3e6f5cb0

    const/16 v40, 0x0

    invoke-direct/range {v34 .. v42}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v35, Lu61/e;

    const/16 v42, 0x3c

    const/16 v43, 0x0

    const v36, 0x3ea8f5c3    # 0.33f

    const v37, 0x3eb0a761    # 0.345027f

    const/16 v41, 0x0

    invoke-direct/range {v35 .. v43}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v36, Lu61/e;

    const/16 v43, 0x3c

    const/16 v44, 0x0

    const v37, 0x3eae147b    # 0.34f

    const v38, 0x3eb2258d

    const/16 v42, 0x0

    invoke-direct/range {v36 .. v44}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v37, Lu61/e;

    const/16 v44, 0x3c

    const/16 v45, 0x0

    const v38, 0x3eb33333    # 0.35f

    const v39, 0x3eac7136

    const/16 v43, 0x0

    invoke-direct/range {v37 .. v45}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v38, Lu61/e;

    const/16 v45, 0x3c

    const/16 v46, 0x0

    const v39, 0x3eb851ec    # 0.36f

    const v40, 0x3e961741

    const/16 v44, 0x0

    invoke-direct/range {v38 .. v46}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v39, Lu61/e;

    const/16 v46, 0x3c

    const/16 v47, 0x0

    const v40, 0x3ebd70a4    # 0.37f

    const v41, 0x3ebc7f08

    const/16 v45, 0x0

    invoke-direct/range {v39 .. v47}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v40, Lu61/e;

    const/16 v47, 0x3c

    const/16 v48, 0x0

    const v41, 0x3ec28f5c    # 0.38f

    const v42, 0x3eb5d802

    const/16 v46, 0x0

    invoke-direct/range {v40 .. v48}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v41, Lu61/e;

    const/16 v48, 0x3c

    const/16 v49, 0x0

    const v42, 0x3ec7ae14    # 0.39f

    const v43, 0x3efd68ed

    const/16 v47, 0x0

    invoke-direct/range {v41 .. v49}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v42, Lu61/e;

    const/16 v49, 0x3c

    const/16 v50, 0x0

    const v43, 0x3ecccccd    # 0.4f

    const v44, 0x3ee1910e

    const/16 v48, 0x0

    invoke-direct/range {v42 .. v50}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v43, Lu61/e;

    const/16 v50, 0x3c

    const/16 v51, 0x0

    const v44, 0x3ed1eb85    # 0.41f

    const v45, 0x3ed781e6

    const/16 v49, 0x0

    invoke-direct/range {v43 .. v51}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v44, Lu61/e;

    const/16 v51, 0x3c

    const/16 v52, 0x0

    const v45, 0x3ed70a3d    # 0.42f

    const v46, 0x3ecfcd8e

    const/16 v50, 0x0

    invoke-direct/range {v44 .. v52}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v45, Lu61/e;

    const/16 v52, 0x3c

    const/16 v53, 0x0

    const v46, 0x3edc28f6    # 0.43f

    const v47, 0x3f0d96f1

    const/16 v51, 0x0

    invoke-direct/range {v45 .. v53}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v46, Lu61/e;

    const/16 v53, 0x3c

    const/16 v54, 0x0

    const v47, 0x3ee147ae    # 0.44f

    const v48, 0x3ec5daca

    const/16 v52, 0x0

    invoke-direct/range {v46 .. v54}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v47, Lu61/e;

    const/16 v54, 0x3c

    const/16 v55, 0x0

    const v48, 0x3ee66666    # 0.45f

    const v49, 0x3ef9d949

    const/16 v53, 0x0

    invoke-direct/range {v47 .. v55}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v48, Lu61/e;

    const/16 v55, 0x3c

    const/16 v56, 0x0

    const v49, 0x3eeb851f    # 0.46f

    const v50, 0x3ef8843a

    const/16 v54, 0x0

    invoke-direct/range {v48 .. v56}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v49, Lu61/e;

    const/16 v56, 0x3c

    const/16 v57, 0x0

    const v50, 0x3ef0a3d7    # 0.47f

    const v51, 0x3f0ceac8

    const/16 v55, 0x0

    invoke-direct/range {v49 .. v57}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v50, Lu61/e;

    const/16 v57, 0x3c

    const/16 v58, 0x0

    const v51, 0x3ef5c28f    # 0.48f

    const v52, 0x3ed38eb4

    const/16 v56, 0x0

    invoke-direct/range {v50 .. v58}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v51, Lu61/e;

    const/16 v58, 0x3c

    const/16 v59, 0x0

    const v52, 0x3efae148    # 0.49f

    const v53, 0x3edc9457

    const/16 v57, 0x0

    invoke-direct/range {v51 .. v59}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v52, Lu61/e;

    const/16 v59, 0x3c

    const/16 v60, 0x0

    const/high16 v53, 0x3f000000    # 0.5f

    const v54, 0x3f1662ef

    const/16 v58, 0x0

    invoke-direct/range {v52 .. v60}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v53, Lu61/e;

    const/16 v60, 0x3c

    const/16 v61, 0x0

    const v54, 0x3f028f5c    # 0.51f

    const v55, 0x3ee75379

    const/16 v59, 0x0

    invoke-direct/range {v53 .. v61}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v54, Lu61/e;

    const/16 v61, 0x3c

    const/16 v62, 0x0

    const v55, 0x3f051eb8    # 0.52f

    const v56, 0x3ef7c7cc

    const/16 v60, 0x0

    invoke-direct/range {v54 .. v62}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v55, Lu61/e;

    const/16 v62, 0x3c

    const/16 v63, 0x0

    const v56, 0x3f07ae14    # 0.53f

    const v57, 0x3f01f692

    const/16 v61, 0x0

    invoke-direct/range {v55 .. v63}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v56, Lu61/e;

    const/16 v63, 0x3c

    const/16 v64, 0x0

    const v57, 0x3f0a3d71    # 0.54f

    const v58, 0x3f207487

    const/16 v62, 0x0

    invoke-direct/range {v56 .. v64}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v57, Lu61/e;

    const/16 v64, 0x3c

    const/16 v65, 0x0

    const v58, 0x3f0ccccd    # 0.55f

    const v59, 0x3ef673ab

    const/16 v63, 0x0

    invoke-direct/range {v57 .. v65}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v58, Lu61/e;

    const/16 v65, 0x3c

    const/16 v66, 0x0

    const v59, 0x3f0f5c29    # 0.56f

    const v60, 0x3ed4ac44

    const/16 v64, 0x0

    invoke-direct/range {v58 .. v66}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v59, Lu61/e;

    const/16 v66, 0x3c

    const/16 v67, 0x0

    const v60, 0x3f11eb85    # 0.57f

    const v61, 0x3f0371c1

    const/16 v65, 0x0

    invoke-direct/range {v59 .. v67}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v60, Lu61/e;

    const/16 v67, 0x3c

    const/16 v68, 0x0

    const v61, 0x3f147ae1    # 0.58f

    const v62, 0x3f12513c

    const/16 v66, 0x0

    invoke-direct/range {v60 .. v68}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v61, Lu61/e;

    const/16 v68, 0x3c

    const/16 v69, 0x0

    const v62, 0x3f170a3d    # 0.59f

    const v63, 0x3efbf08b

    const/16 v67, 0x0

    invoke-direct/range {v61 .. v69}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v62, Lu61/e;

    const/16 v69, 0x3c

    const/16 v70, 0x0

    const v63, 0x3f19999a    # 0.6f

    const v64, 0x3f062df4

    const/16 v68, 0x0

    invoke-direct/range {v62 .. v70}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v63, Lu61/e;

    const/16 v70, 0x3c

    const/16 v71, 0x0

    const v64, 0x3f1c28f6    # 0.61f

    const v65, 0x3f01eda9

    const/16 v69, 0x0

    invoke-direct/range {v63 .. v71}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v64, Lu61/e;

    const/16 v71, 0x3c

    const/16 v72, 0x0

    const v65, 0x3f1eb852    # 0.62f

    const v66, 0x3ed23eed

    const/16 v70, 0x0

    invoke-direct/range {v64 .. v72}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v65, Lu61/e;

    const/16 v72, 0x3c

    const/16 v73, 0x0

    const v66, 0x3f2147ae    # 0.63f

    const v67, 0x3eecbe21

    const/16 v71, 0x0

    invoke-direct/range {v65 .. v73}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v66, Lu61/e;

    const/16 v73, 0x3c

    const/16 v74, 0x0

    const v67, 0x3f23d70a    # 0.64f

    const v68, 0x3ec06a51

    const/16 v72, 0x0

    invoke-direct/range {v66 .. v74}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v67, Lu61/e;

    const/16 v74, 0x3c

    const/16 v75, 0x0

    const v68, 0x3f266666    # 0.65f

    const v69, 0x3eff3f70

    const/16 v73, 0x0

    invoke-direct/range {v67 .. v75}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v68, Lu61/e;

    const/16 v75, 0x3c

    const/16 v76, 0x0

    const v69, 0x3f28f5c3    # 0.66f

    const v70, 0x3f1868b0

    const/16 v74, 0x0

    invoke-direct/range {v68 .. v76}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v69, Lu61/e;

    const/16 v76, 0x3c

    const/16 v77, 0x0

    const v70, 0x3f2b851f    # 0.67f

    const v71, 0x3f0507cb

    const/16 v75, 0x0

    invoke-direct/range {v69 .. v77}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v70, Lu61/e;

    const/16 v77, 0x3c

    const/16 v78, 0x0

    const v71, 0x3f2e147b    # 0.68f

    const v72, 0x3f062bc7

    const/16 v76, 0x0

    invoke-direct/range {v70 .. v78}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v71, Lu61/e;

    const/16 v78, 0x3c

    const/16 v79, 0x0

    const v72, 0x3f30a3d7    # 0.69f

    const v73, 0x3f1ceada

    const/16 v77, 0x0

    invoke-direct/range {v71 .. v79}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v72, Lu61/e;

    const/16 v79, 0x3c

    const/16 v80, 0x0

    const v73, 0x3f333333    # 0.7f

    const v74, 0x3ee98b42

    const/16 v78, 0x0

    invoke-direct/range {v72 .. v80}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v73, Lu61/e;

    const/16 v80, 0x3c

    const/16 v81, 0x0

    const v74, 0x3f35c28f    # 0.71f

    const v75, 0x3f209e2b

    const/16 v79, 0x0

    invoke-direct/range {v73 .. v81}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v74, Lu61/e;

    const/16 v81, 0x3c

    const/16 v82, 0x0

    const v75, 0x3f3851ec    # 0.72f

    const v76, 0x3ef6500a

    const/16 v80, 0x0

    invoke-direct/range {v74 .. v82}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v75, Lu61/e;

    const/16 v82, 0x3c

    const/16 v83, 0x0

    const v76, 0x3f3ae148    # 0.73f

    const v77, 0x3f22c517

    const/16 v81, 0x0

    invoke-direct/range {v75 .. v83}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v76, Lu61/e;

    const/16 v83, 0x3c

    const/16 v84, 0x0

    const v77, 0x3f3d70a4    # 0.74f

    const v78, 0x3effae45

    const/16 v82, 0x0

    invoke-direct/range {v76 .. v84}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v77, Lu61/e;

    const/16 v84, 0x3c

    const/16 v85, 0x0

    const/high16 v78, 0x3f400000    # 0.75f

    const v79, 0x3efc42f6

    const/16 v83, 0x0

    invoke-direct/range {v77 .. v85}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v78, Lu61/e;

    const/16 v85, 0x3c

    const/16 v86, 0x0

    const v79, 0x3f428f5c    # 0.76f

    const v80, 0x3ee11467

    const/16 v84, 0x0

    invoke-direct/range {v78 .. v86}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v79, Lu61/e;

    const/16 v86, 0x3c

    const/16 v87, 0x0

    const v80, 0x3f451eb8    # 0.77f

    const v81, 0x3efef39d

    const/16 v85, 0x0

    invoke-direct/range {v79 .. v87}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v80, Lu61/e;

    const/16 v87, 0x3c

    const/16 v88, 0x0

    const v81, 0x3f47ae14    # 0.78f

    const v82, 0x3f11fd30

    const/16 v86, 0x0

    invoke-direct/range {v80 .. v88}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v81, Lu61/e;

    const/16 v88, 0x3c

    const/16 v89, 0x0

    const v82, 0x3f4a3d71    # 0.79f

    const v83, 0x3f0d73b0

    const/16 v87, 0x0

    invoke-direct/range {v81 .. v89}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v82, Lu61/e;

    const/16 v89, 0x3c

    const/16 v90, 0x0

    const v83, 0x3f4ccccd    # 0.8f

    const v84, 0x3f2cb8e4

    const/16 v88, 0x0

    invoke-direct/range {v82 .. v90}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v83, Lu61/e;

    const/16 v90, 0x3c

    const/16 v91, 0x0

    const v84, 0x3f4f5c29    # 0.81f

    const v85, 0x3f0d064f

    const/16 v89, 0x0

    invoke-direct/range {v83 .. v91}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v84, Lu61/e;

    const/16 v91, 0x3c

    const/16 v92, 0x0

    const v85, 0x3f51eb85    # 0.82f

    const v86, 0x3ef3e4b0

    const/16 v90, 0x0

    invoke-direct/range {v84 .. v92}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v85, Lu61/e;

    const/16 v92, 0x3c

    const/16 v93, 0x0

    const v86, 0x3f547ae1    # 0.83f

    const v87, 0x3edf63b0

    const/16 v91, 0x0

    invoke-direct/range {v85 .. v93}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v86, Lu61/e;

    const/16 v93, 0x3c

    const/16 v94, 0x0

    const v87, 0x3f570a3d    # 0.84f

    const v88, 0x3ec92e30

    const/16 v92, 0x0

    invoke-direct/range {v86 .. v94}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v87, Lu61/e;

    const/16 v94, 0x3c

    const/16 v95, 0x0

    const v88, 0x3f59999a    # 0.85f

    const v89, 0x3ed7beea

    const/16 v93, 0x0

    invoke-direct/range {v87 .. v95}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v88, Lu61/e;

    const/16 v95, 0x3c

    const/16 v96, 0x0

    const v89, 0x3f5c28f6    # 0.86f

    const v90, 0x3edd20a7

    const/16 v94, 0x0

    invoke-direct/range {v88 .. v96}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v89, Lu61/e;

    const/16 v96, 0x3c

    const/16 v97, 0x0

    const v90, 0x3f5eb852    # 0.87f

    const v91, 0x3eaa6ee3

    const/16 v95, 0x0

    invoke-direct/range {v89 .. v97}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v90, Lu61/e;

    const/16 v97, 0x3c

    const/16 v98, 0x0

    const v91, 0x3f6147ae    # 0.88f

    const v92, 0x3eb91734

    const/16 v96, 0x0

    invoke-direct/range {v90 .. v98}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v91, Lu61/e;

    const/16 v98, 0x3c

    const/16 v99, 0x0

    const v92, 0x3f63d70a    # 0.89f

    const v93, 0x3f086f5d

    const/16 v97, 0x0

    invoke-direct/range {v91 .. v99}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v92, Lu61/e;

    const/16 v99, 0x3c

    const/16 v100, 0x0

    const v93, 0x3f666666    # 0.9f

    const v94, 0x3ed8603c

    const/16 v98, 0x0

    invoke-direct/range {v92 .. v100}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v93, Lu61/e;

    const/16 v100, 0x3c

    const/16 v101, 0x0

    const v94, 0x3f68f5c3    # 0.91f

    const v95, 0x3f00288b

    const/16 v99, 0x0

    invoke-direct/range {v93 .. v101}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v94, Lu61/e;

    const/16 v101, 0x3c

    const/16 v102, 0x0

    const v95, 0x3f6b851f    # 0.92f

    const v96, 0x3ebf595b

    const/16 v100, 0x0

    invoke-direct/range {v94 .. v102}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v95, Lu61/e;

    const/16 v102, 0x3c

    const/16 v103, 0x0

    const v96, 0x3f6e147b    # 0.93f

    const v97, 0x3eec1ff9

    const/16 v101, 0x0

    invoke-direct/range {v95 .. v103}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v96, Lu61/e;

    const/16 v103, 0x3c

    const/16 v104, 0x0

    const v97, 0x3f70a3d7    # 0.94f

    const v98, 0x3edff34f

    const/16 v102, 0x0

    invoke-direct/range {v96 .. v104}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v97, Lu61/e;

    const/16 v104, 0x3c

    const/16 v105, 0x0

    const v98, 0x3f733333    # 0.95f

    const v99, 0x3efdf91d

    const/16 v103, 0x0

    invoke-direct/range {v97 .. v105}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v98, Lu61/e;

    const/16 v105, 0x3c

    const/16 v106, 0x0

    const v99, 0x3f75c28f    # 0.96f

    const v100, 0x3ee560a1

    const/16 v104, 0x0

    invoke-direct/range {v98 .. v106}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v99, Lu61/e;

    const/16 v106, 0x3c

    const/16 v107, 0x0

    const v100, 0x3f7851ec    # 0.97f

    const v101, 0x3f150c28

    const/16 v105, 0x0

    invoke-direct/range {v99 .. v107}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v100, Lu61/e;

    const/16 v107, 0x3c

    const/16 v108, 0x0

    const v101, 0x3f7ae148    # 0.98f

    const v102, 0x3eb56814

    const/16 v106, 0x0

    invoke-direct/range {v100 .. v108}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v101, Lu61/e;

    const/16 v108, 0x3c

    const/16 v109, 0x0

    const v102, 0x3f7d70a4    # 0.99f

    const v103, 0x3edc7fe4

    const/16 v107, 0x0

    invoke-direct/range {v101 .. v109}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v2 .. v101}, [Lu61/e;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lu61/e;

    new-instance v6, La71/a;

    invoke-virtual {v5}, Lu61/e;->h()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v7, 0x1

    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const-string v7, "%.4f"

    invoke-static {v7, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v4, Lr61/i$j3;->w:Lr61/i$j3;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v12

    const/16 v19, 0xfdb

    const/16 v20, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v6 .. v20}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x1f

    move-object v11, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v13}, Lu61/e;->c(Lu61/e;FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILjava/lang/Object;)Lu61/e;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Lu61/a;

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v4, v1

    move-object v1, v2

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v2, Lj71/b$g;

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const-string v4, "greenishline"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    new-instance v15, Lj71/c;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xc

    const/16 v21, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v15 .. v21}, Lj71/c;-><init>(Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v15
.end method

.method private static final f(Ly81/i;)Li2/t;
    .locals 5

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method public static final g()Lj71/c;
    .locals 110

    new-instance v0, Lg61/b;

    new-instance v1, Lyy0/c;

    const-string v2, "0.0"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v3, Lr61/i$k3;->w:Lr61/i$k3;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v4

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lyy0/c;

    const-string v3, "1.0"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v4, Lr61/i$l3;->w:Lr61/i$l3;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/high16 v6, 0x3f000000    # 0.5f

    const v7, 0x3eaaaaab

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lyy0/c;

    const-string v4, "2.0"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v5, Lr61/i$m3;->w:Lr61/i$m3;

    invoke-static {v5}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    const/16 v10, 0x20

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const v8, 0x3f2aaaab

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lyy0/c;

    const-string v5, "3.0"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Lr61/i$n3;->w:Lr61/i$n3;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/high16 v8, 0x3f000000    # 0.5f

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v2, v3, v4}, [Lyy0/c;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    sget-object v4, Lg61/d;->STANDARD:Lg61/d;

    const-string v11, ""

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/16 v9, 0xc0

    const v1, 0x3dcccccd    # 0.1f

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lg61/b;

    sget-object v16, Lg61/d;->TIME_MARKER_WITHOUT_BULB:Lg61/d;

    const-string v1, "11:00 AM"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v21, 0xc0

    const/16 v22, 0x0

    const v13, 0x3dcccccd    # 0.1f

    sget-object v7, Lm83/y;->w:Lm83/y;

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v12, v2

    move-object v14, v7

    invoke-direct/range {v12 .. v22}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lg61/b;

    new-instance v15, Lyy0/c;

    const-string v1, "9:00 AM"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    sget-object v1, Lr61/i$o3;->w:Lr61/i$o3;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v18

    const/16 v22, 0x20

    const/16 v23, 0x0

    const/16 v17, 0x0

    const v19, 0x3eaa7efa    # 0.333f

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v15 .. v23}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lyy0/c;

    const-string v1, "10:00 AM"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v1, Lr61/i$p3;->w:Lr61/i$p3;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v19

    const/16 v23, 0x20

    const/16 v24, 0x0

    const/16 v18, 0x0

    const v20, 0x3f2a7efa    # 0.666f

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v16 .. v24}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    filled-new-array {v15, v1}, [Lyy0/c;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/16 v12, 0xc0

    const/4 v13, 0x0

    move-object v7, v4

    const v4, 0x3e19999a    # 0.15f

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lj61/f;

    const/16 v12, 0x7e

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v13}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lj61/f;

    const/16 v23, 0x7e

    const v16, 0x3eaa7efa    # 0.333f

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v15 .. v24}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lj61/f;

    const/16 v24, 0x7e

    const/16 v25, 0x0

    const v17, 0x3f2a7efa    # 0.666f

    const/16 v23, 0x0

    invoke-direct/range {v16 .. v25}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    new-instance v16, Lj61/f;

    const/high16 v17, 0x3f800000    # 1.0f

    invoke-direct/range {v16 .. v25}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v16

    filled-new-array {v4, v15, v1, v5}, [Lj61/f;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v5, Lh2/c;

    const v1, 0x3d4ccccd    # 0.05f

    const v4, 0x3d23d70a    # 0.04f

    invoke-direct {v5, v1, v1, v1, v4}, Lh2/c;-><init>(FFFF)V

    new-instance v7, Lj61/g;

    const-string v1, "stressHrGraphState"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/16 v12, 0xe

    invoke-direct/range {v7 .. v13}, Lj61/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lj61/h;

    const/16 v15, 0x1e08

    move-object v1, v0

    move-object/from16 v0, v16

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const-wide/16 v12, 0x0

    move-object v8, v7

    move-object v7, v14

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v16}, Lj61/h;-><init>(Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lk61/c;

    new-instance v2, Lr61/h;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lr61/h;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    const/16 v9, 0x37

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lu61/e;

    const/16 v9, 0x3c

    const/4 v3, 0x0

    const v4, 0x3e332a1b

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lu61/e;

    const/16 v10, 0x3c

    const v4, 0x3c23d70a    # 0.01f

    const v5, 0x3e7191af

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lu61/e;

    const/16 v11, 0x3c

    const/4 v12, 0x0

    const v5, 0x3ca3d70a    # 0.02f

    const v6, 0x3e4bcf2d

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lu61/e;

    const/16 v12, 0x3c

    const/4 v13, 0x0

    const v6, 0x3cf5c28f    # 0.03f

    const v7, 0x3e63e95c

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lu61/e;

    const/16 v13, 0x3c

    const/4 v14, 0x0

    const v7, 0x3d23d70a    # 0.04f

    const v8, 0x3e3fe4f6

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lu61/e;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const v8, 0x3d4ccccd    # 0.05f

    const v9, 0x3e2050a4

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lu61/e;

    const/16 v15, 0x3c

    const v9, 0x3d75c28f    # 0.06f

    const v10, 0x3e27f02e

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lu61/e;

    const/16 v16, 0x3c

    const/16 v17, 0x0

    const v10, 0x3d8f5c29    # 0.07f

    const v11, 0x3e680e76

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lu61/e;

    const/16 v17, 0x3c

    const v11, 0x3da3d70a    # 0.08f

    const v12, 0x3e716941

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lu61/e;

    const/16 v18, 0x3c

    const v12, 0x3db851ec    # 0.09f

    const v13, 0x3e6cadb8

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lu61/e;

    const/16 v19, 0x3c

    const v13, 0x3dcccccd    # 0.1f

    const v14, 0x3e12b24b

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lu61/e;

    const/16 v20, 0x3c

    const v14, 0x3de147ae    # 0.11f

    const v15, 0x3e3cbdb9

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v21}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lu61/e;

    const/16 v21, 0x3c

    const v15, 0x3df5c28f    # 0.12f

    const v16, 0x3e8b06bb

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lu61/e;

    const/16 v22, 0x3c

    const v16, 0x3e051eb8    # 0.13f

    const v17, 0x3e75db72

    const/16 v21, 0x0

    invoke-direct/range {v15 .. v23}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lu61/e;

    const/16 v23, 0x3c

    const/16 v24, 0x0

    const v17, 0x3e0f5c29    # 0.14f

    const v18, 0x3e509689

    const/16 v22, 0x0

    invoke-direct/range {v16 .. v24}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v17, Lu61/e;

    const/16 v24, 0x3c

    const v18, 0x3e19999a    # 0.15f

    const v19, 0x3e8a9b48

    const/16 v23, 0x0

    invoke-direct/range {v17 .. v25}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lu61/e;

    const/16 v25, 0x3c

    const/16 v26, 0x0

    const v19, 0x3e23d70a    # 0.16f

    const v20, 0x3e454f1e

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v26}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v19, Lu61/e;

    const/16 v26, 0x3c

    const/16 v27, 0x0

    const v20, 0x3e2e147b    # 0.17f

    const v21, 0x3e16a975

    const/16 v25, 0x0

    invoke-direct/range {v19 .. v27}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v20, Lu61/e;

    const/16 v27, 0x3c

    const/16 v28, 0x0

    const v21, 0x3e3851ec    # 0.18f

    const v22, 0x3e47e5f7

    const/16 v26, 0x0

    invoke-direct/range {v20 .. v28}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v21, Lu61/e;

    const/16 v28, 0x3c

    const/16 v29, 0x0

    const v22, 0x3e428f5c    # 0.19f

    const v23, 0x3e8c28d3

    const/16 v27, 0x0

    invoke-direct/range {v21 .. v29}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v22, Lu61/e;

    const/16 v29, 0x3c

    const/16 v30, 0x0

    const v23, 0x3e4ccccd    # 0.2f

    const v24, 0x3e34ff24

    const/16 v28, 0x0

    invoke-direct/range {v22 .. v30}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v23, Lu61/e;

    const/16 v30, 0x3c

    const/16 v31, 0x0

    const v24, 0x3e570a3d    # 0.21f

    const v25, 0x3e838400

    const/16 v29, 0x0

    invoke-direct/range {v23 .. v31}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v24, Lu61/e;

    const/16 v31, 0x3c

    const/16 v32, 0x0

    const v25, 0x3e6147ae    # 0.22f

    const v26, 0x3e4b4ca7

    const/16 v30, 0x0

    invoke-direct/range {v24 .. v32}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v25, Lu61/e;

    const/16 v32, 0x3c

    const/16 v33, 0x0

    const v26, 0x3e6b851f    # 0.23f

    const v27, 0x3e2b4fb5

    const/16 v31, 0x0

    invoke-direct/range {v25 .. v33}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v26, Lu61/e;

    const/16 v33, 0x3c

    const/16 v34, 0x0

    const v27, 0x3e75c28f    # 0.24f

    const v28, 0x3e3f5cc2

    const/16 v32, 0x0

    invoke-direct/range {v26 .. v34}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lu61/e;

    const/16 v34, 0x3c

    const/16 v35, 0x0

    const/high16 v28, 0x3e800000    # 0.25f

    const v29, 0x3e6f612c

    const/16 v33, 0x0

    invoke-direct/range {v27 .. v35}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v28, Lu61/e;

    const/16 v35, 0x3c

    const/16 v36, 0x0

    const v29, 0x3e851eb8    # 0.26f

    const v30, 0x3e7d1f1d    # 0.247189f

    const/16 v34, 0x0

    invoke-direct/range {v28 .. v36}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v29, Lu61/e;

    const/16 v36, 0x3c

    const/16 v37, 0x0

    const v30, 0x3e8a3d71    # 0.27f

    const v31, 0x3e7a42bd

    const/16 v35, 0x0

    invoke-direct/range {v29 .. v37}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v30, Lu61/e;

    const/16 v37, 0x3c

    const/16 v38, 0x0

    const v31, 0x3e8f5c29    # 0.28f

    const v32, 0x3e968bf8

    const/16 v36, 0x0

    invoke-direct/range {v30 .. v38}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v31, Lu61/e;

    const/16 v38, 0x3c

    const/16 v39, 0x0

    const v32, 0x3e947ae1    # 0.29f

    const v33, 0x3e8a9c66

    const/16 v37, 0x0

    invoke-direct/range {v31 .. v39}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v32, Lu61/e;

    const/16 v39, 0x3c

    const/16 v40, 0x0

    const v33, 0x3e99999a    # 0.3f

    const v34, 0x3e875f1f

    const/16 v38, 0x0

    invoke-direct/range {v32 .. v40}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v33, Lu61/e;

    const/16 v40, 0x3c

    const/16 v41, 0x0

    const v34, 0x3e9eb852    # 0.31f

    const v35, 0x3e8129bd

    const/16 v39, 0x0

    invoke-direct/range {v33 .. v41}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lu61/e;

    const/16 v41, 0x3c

    const/16 v42, 0x0

    const v35, 0x3ea3d70a    # 0.32f

    const v36, 0x3e6f5cb0

    const/16 v40, 0x0

    invoke-direct/range {v34 .. v42}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v35, Lu61/e;

    const/16 v42, 0x3c

    const/16 v43, 0x0

    const v36, 0x3ea8f5c3    # 0.33f

    const v37, 0x3eb0a761    # 0.345027f

    const/16 v41, 0x0

    invoke-direct/range {v35 .. v43}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v36, Lu61/e;

    const/16 v43, 0x3c

    const/16 v44, 0x0

    const v37, 0x3eae147b    # 0.34f

    const v38, 0x3eb2258d

    const/16 v42, 0x0

    invoke-direct/range {v36 .. v44}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v37, Lu61/e;

    const/16 v44, 0x3c

    const/16 v45, 0x0

    const v38, 0x3eb33333    # 0.35f

    const v39, 0x3eac7136

    const/16 v43, 0x0

    invoke-direct/range {v37 .. v45}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v38, Lu61/e;

    const/16 v45, 0x3c

    const/16 v46, 0x0

    const v39, 0x3eb851ec    # 0.36f

    const v40, 0x3e961741

    const/16 v44, 0x0

    invoke-direct/range {v38 .. v46}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v39, Lu61/e;

    const/16 v46, 0x3c

    const/16 v47, 0x0

    const v40, 0x3ebd70a4    # 0.37f

    const v41, 0x3ebc7f08

    const/16 v45, 0x0

    invoke-direct/range {v39 .. v47}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v40, Lu61/e;

    const/16 v47, 0x3c

    const/16 v48, 0x0

    const v41, 0x3ec28f5c    # 0.38f

    const v42, 0x3eb5d802

    const/16 v46, 0x0

    invoke-direct/range {v40 .. v48}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v41, Lu61/e;

    const/16 v48, 0x3c

    const/16 v49, 0x0

    const v42, 0x3ec7ae14    # 0.39f

    const v43, 0x3efd68ed

    const/16 v47, 0x0

    invoke-direct/range {v41 .. v49}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v42, Lu61/e;

    const/16 v49, 0x3c

    const/16 v50, 0x0

    const v43, 0x3ecccccd    # 0.4f

    const v44, 0x3ee1910e

    const/16 v48, 0x0

    invoke-direct/range {v42 .. v50}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v43, Lu61/e;

    const/16 v50, 0x3c

    const/16 v51, 0x0

    const v44, 0x3ed1eb85    # 0.41f

    const v45, 0x3ed781e6

    const/16 v49, 0x0

    invoke-direct/range {v43 .. v51}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v44, Lu61/e;

    const/16 v51, 0x3c

    const/16 v52, 0x0

    const v45, 0x3ed70a3d    # 0.42f

    const v46, 0x3ecfcd8e

    const/16 v50, 0x0

    invoke-direct/range {v44 .. v52}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v45, Lu61/e;

    const/16 v52, 0x3c

    const/16 v53, 0x0

    const v46, 0x3edc28f6    # 0.43f

    const v47, 0x3f0d96f1

    const/16 v51, 0x0

    invoke-direct/range {v45 .. v53}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v46, Lu61/e;

    const/16 v53, 0x3c

    const/16 v54, 0x0

    const v47, 0x3ee147ae    # 0.44f

    const v48, 0x3ec5daca

    const/16 v52, 0x0

    invoke-direct/range {v46 .. v54}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v47, Lu61/e;

    const/16 v54, 0x3c

    const/16 v55, 0x0

    const v48, 0x3ee66666    # 0.45f

    const v49, 0x3ef9d949

    const/16 v53, 0x0

    invoke-direct/range {v47 .. v55}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v48, Lu61/e;

    const/16 v55, 0x3c

    const/16 v56, 0x0

    const v49, 0x3eeb851f    # 0.46f

    const v50, 0x3ef8843a

    const/16 v54, 0x0

    invoke-direct/range {v48 .. v56}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v49, Lu61/e;

    const/16 v56, 0x3c

    const/16 v57, 0x0

    const v50, 0x3ef0a3d7    # 0.47f

    const v51, 0x3f0ceac8

    const/16 v55, 0x0

    invoke-direct/range {v49 .. v57}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v50, Lu61/e;

    const/16 v57, 0x3c

    const/16 v58, 0x0

    const v51, 0x3ef5c28f    # 0.48f

    const v52, 0x3ed38eb4

    const/16 v56, 0x0

    invoke-direct/range {v50 .. v58}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v51, Lu61/e;

    const/16 v58, 0x3c

    const/16 v59, 0x0

    const v52, 0x3efae148    # 0.49f

    const v53, 0x3edc9457

    const/16 v57, 0x0

    invoke-direct/range {v51 .. v59}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v52, Lu61/e;

    const/16 v59, 0x3c

    const/16 v60, 0x0

    const/high16 v53, 0x3f000000    # 0.5f

    const v54, 0x3f1662ef

    const/16 v58, 0x0

    invoke-direct/range {v52 .. v60}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v53, Lu61/e;

    const/16 v60, 0x3c

    const/16 v61, 0x0

    const v54, 0x3f028f5c    # 0.51f

    const v55, 0x3ee75379

    const/16 v59, 0x0

    invoke-direct/range {v53 .. v61}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v54, Lu61/e;

    const/16 v61, 0x3c

    const/16 v62, 0x0

    const v55, 0x3f051eb8    # 0.52f

    const v56, 0x3ef7c7cc

    const/16 v60, 0x0

    invoke-direct/range {v54 .. v62}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v55, Lu61/e;

    const/16 v62, 0x3c

    const/16 v63, 0x0

    const v56, 0x3f07ae14    # 0.53f

    const v57, 0x3f01f692

    const/16 v61, 0x0

    invoke-direct/range {v55 .. v63}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v56, Lu61/e;

    const/16 v63, 0x3c

    const/16 v64, 0x0

    const v57, 0x3f0a3d71    # 0.54f

    const v58, 0x3f207487

    const/16 v62, 0x0

    invoke-direct/range {v56 .. v64}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v57, Lu61/e;

    const/16 v64, 0x3c

    const/16 v65, 0x0

    const v58, 0x3f0ccccd    # 0.55f

    const v59, 0x3ef673ab

    const/16 v63, 0x0

    invoke-direct/range {v57 .. v65}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v58, Lu61/e;

    const/16 v65, 0x3c

    const/16 v66, 0x0

    const v59, 0x3f0f5c29    # 0.56f

    const v60, 0x3ed4ac44

    const/16 v64, 0x0

    invoke-direct/range {v58 .. v66}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v59, Lu61/e;

    const/16 v66, 0x3c

    const/16 v67, 0x0

    const v60, 0x3f11eb85    # 0.57f

    const v61, 0x3f0371c1

    const/16 v65, 0x0

    invoke-direct/range {v59 .. v67}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v60, Lu61/e;

    const/16 v67, 0x3c

    const/16 v68, 0x0

    const v61, 0x3f147ae1    # 0.58f

    const v62, 0x3f12513c

    const/16 v66, 0x0

    invoke-direct/range {v60 .. v68}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v61, Lu61/e;

    const/16 v68, 0x3c

    const/16 v69, 0x0

    const v62, 0x3f170a3d    # 0.59f

    const v63, 0x3efbf08b

    const/16 v67, 0x0

    invoke-direct/range {v61 .. v69}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v62, Lu61/e;

    const/16 v69, 0x3c

    const/16 v70, 0x0

    const v63, 0x3f19999a    # 0.6f

    const v64, 0x3f062df4

    const/16 v68, 0x0

    invoke-direct/range {v62 .. v70}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v63, Lu61/e;

    const/16 v70, 0x3c

    const/16 v71, 0x0

    const v64, 0x3f1c28f6    # 0.61f

    const v65, 0x3f01eda9

    const/16 v69, 0x0

    invoke-direct/range {v63 .. v71}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v64, Lu61/e;

    const/16 v71, 0x3c

    const/16 v72, 0x0

    const v65, 0x3f1eb852    # 0.62f

    const v66, 0x3ed23eed

    const/16 v70, 0x0

    invoke-direct/range {v64 .. v72}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v65, Lu61/e;

    const/16 v72, 0x3c

    const/16 v73, 0x0

    const v66, 0x3f2147ae    # 0.63f

    const v67, 0x3eecbe21

    const/16 v71, 0x0

    invoke-direct/range {v65 .. v73}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v66, Lu61/e;

    const/16 v73, 0x3c

    const/16 v74, 0x0

    const v67, 0x3f23d70a    # 0.64f

    const v68, 0x3ec06a51

    const/16 v72, 0x0

    invoke-direct/range {v66 .. v74}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v67, Lu61/e;

    const/16 v74, 0x3c

    const/16 v75, 0x0

    const v68, 0x3f266666    # 0.65f

    const v69, 0x3eff3f70

    const/16 v73, 0x0

    invoke-direct/range {v67 .. v75}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v68, Lu61/e;

    const/16 v75, 0x3c

    const/16 v76, 0x0

    const v69, 0x3f28f5c3    # 0.66f

    const v70, 0x3f1868b0

    const/16 v74, 0x0

    invoke-direct/range {v68 .. v76}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v69, Lu61/e;

    const/16 v76, 0x3c

    const/16 v77, 0x0

    const v70, 0x3f2b851f    # 0.67f

    const v71, 0x3f0507cb

    const/16 v75, 0x0

    invoke-direct/range {v69 .. v77}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v70, Lu61/e;

    const/16 v77, 0x3c

    const/16 v78, 0x0

    const v71, 0x3f2e147b    # 0.68f

    const v72, 0x3f062bc7

    const/16 v76, 0x0

    invoke-direct/range {v70 .. v78}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v71, Lu61/e;

    const/16 v78, 0x3c

    const/16 v79, 0x0

    const v72, 0x3f30a3d7    # 0.69f

    const v73, 0x3f1ceada

    const/16 v77, 0x0

    invoke-direct/range {v71 .. v79}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v72, Lu61/e;

    const/16 v79, 0x3c

    const/16 v80, 0x0

    const v73, 0x3f333333    # 0.7f

    const v74, 0x3ee98b42

    const/16 v78, 0x0

    invoke-direct/range {v72 .. v80}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v73, Lu61/e;

    const/16 v80, 0x3c

    const/16 v81, 0x0

    const v74, 0x3f35c28f    # 0.71f

    const v75, 0x3f209e2b

    const/16 v79, 0x0

    invoke-direct/range {v73 .. v81}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v74, Lu61/e;

    const/16 v81, 0x3c

    const/16 v82, 0x0

    const v75, 0x3f3851ec    # 0.72f

    const v76, 0x3ef6500a

    const/16 v80, 0x0

    invoke-direct/range {v74 .. v82}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v75, Lu61/e;

    const/16 v82, 0x3c

    const/16 v83, 0x0

    const v76, 0x3f3ae148    # 0.73f

    const v77, 0x3f22c517

    const/16 v81, 0x0

    invoke-direct/range {v75 .. v83}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v76, Lu61/e;

    const/16 v83, 0x3c

    const/16 v84, 0x0

    const v77, 0x3f3d70a4    # 0.74f

    const v78, 0x3effae45

    const/16 v82, 0x0

    invoke-direct/range {v76 .. v84}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v77, Lu61/e;

    const/16 v84, 0x3c

    const/16 v85, 0x0

    const/high16 v78, 0x3f400000    # 0.75f

    const v79, 0x3efc42f6

    const/16 v83, 0x0

    invoke-direct/range {v77 .. v85}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v78, Lu61/e;

    const/16 v85, 0x3c

    const/16 v86, 0x0

    const v79, 0x3f428f5c    # 0.76f

    const v80, 0x3ee11467

    const/16 v84, 0x0

    invoke-direct/range {v78 .. v86}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v79, Lu61/e;

    const/16 v86, 0x3c

    const/16 v87, 0x0

    const v80, 0x3f451eb8    # 0.77f

    const v81, 0x3efef39d

    const/16 v85, 0x0

    invoke-direct/range {v79 .. v87}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v80, Lu61/e;

    const/16 v87, 0x3c

    const/16 v88, 0x0

    const v81, 0x3f47ae14    # 0.78f

    const v82, 0x3f11fd30

    const/16 v86, 0x0

    invoke-direct/range {v80 .. v88}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v81, Lu61/e;

    const/16 v88, 0x3c

    const/16 v89, 0x0

    const v82, 0x3f4a3d71    # 0.79f

    const v83, 0x3f0d73b0

    const/16 v87, 0x0

    invoke-direct/range {v81 .. v89}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v82, Lu61/e;

    const/16 v89, 0x3c

    const/16 v90, 0x0

    const v83, 0x3f4ccccd    # 0.8f

    const v84, 0x3f2cb8e4

    const/16 v88, 0x0

    invoke-direct/range {v82 .. v90}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v83, Lu61/e;

    const/16 v90, 0x3c

    const/16 v91, 0x0

    const v84, 0x3f4f5c29    # 0.81f

    const v85, 0x3f0d064f

    const/16 v89, 0x0

    invoke-direct/range {v83 .. v91}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v84, Lu61/e;

    const/16 v91, 0x3c

    const/16 v92, 0x0

    const v85, 0x3f51eb85    # 0.82f

    const v86, 0x3ef3e4b0

    const/16 v90, 0x0

    invoke-direct/range {v84 .. v92}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v85, Lu61/e;

    const/16 v92, 0x3c

    const/16 v93, 0x0

    const v86, 0x3f547ae1    # 0.83f

    const v87, 0x3edf63b0

    const/16 v91, 0x0

    invoke-direct/range {v85 .. v93}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v86, Lu61/e;

    const/16 v93, 0x3c

    const/16 v94, 0x0

    const v87, 0x3f570a3d    # 0.84f

    const v88, 0x3ec92e30

    const/16 v92, 0x0

    invoke-direct/range {v86 .. v94}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v87, Lu61/e;

    const/16 v94, 0x3c

    const/16 v95, 0x0

    const v88, 0x3f59999a    # 0.85f

    const v89, 0x3ed7beea

    const/16 v93, 0x0

    invoke-direct/range {v87 .. v95}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v88, Lu61/e;

    const/16 v95, 0x3c

    const/16 v96, 0x0

    const v89, 0x3f5c28f6    # 0.86f

    const v90, 0x3edd20a7

    const/16 v94, 0x0

    invoke-direct/range {v88 .. v96}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v89, Lu61/e;

    const/16 v96, 0x3c

    const/16 v97, 0x0

    const v90, 0x3f5eb852    # 0.87f

    const v91, 0x3eaa6ee3

    const/16 v95, 0x0

    invoke-direct/range {v89 .. v97}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v90, Lu61/e;

    const/16 v97, 0x3c

    const/16 v98, 0x0

    const v91, 0x3f6147ae    # 0.88f

    const v92, 0x3eb91734

    const/16 v96, 0x0

    invoke-direct/range {v90 .. v98}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v91, Lu61/e;

    const/16 v98, 0x3c

    const/16 v99, 0x0

    const v92, 0x3f63d70a    # 0.89f

    const v93, 0x3f086f5d

    const/16 v97, 0x0

    invoke-direct/range {v91 .. v99}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v92, Lu61/e;

    const/16 v99, 0x3c

    const/16 v100, 0x0

    const v93, 0x3f666666    # 0.9f

    const v94, 0x3ed8603c

    const/16 v98, 0x0

    invoke-direct/range {v92 .. v100}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v93, Lu61/e;

    const/16 v100, 0x3c

    const/16 v101, 0x0

    const v94, 0x3f68f5c3    # 0.91f

    const v95, 0x3f00288b

    const/16 v99, 0x0

    invoke-direct/range {v93 .. v101}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v94, Lu61/e;

    const/16 v101, 0x3c

    const/16 v102, 0x0

    const v95, 0x3f6b851f    # 0.92f

    const v96, 0x3ebf595b

    const/16 v100, 0x0

    invoke-direct/range {v94 .. v102}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v95, Lu61/e;

    const/16 v102, 0x3c

    const/16 v103, 0x0

    const v96, 0x3f6e147b    # 0.93f

    const v97, 0x3eec1ff9

    const/16 v101, 0x0

    invoke-direct/range {v95 .. v103}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v96, Lu61/e;

    const/16 v103, 0x3c

    const/16 v104, 0x0

    const v97, 0x3f70a3d7    # 0.94f

    const v98, 0x3edff34f

    const/16 v102, 0x0

    invoke-direct/range {v96 .. v104}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v97, Lu61/e;

    const/16 v104, 0x3c

    const/16 v105, 0x0

    const v98, 0x3f733333    # 0.95f

    const v99, 0x3efdf91d

    const/16 v103, 0x0

    invoke-direct/range {v97 .. v105}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v98, Lu61/e;

    const/16 v105, 0x3c

    const/16 v106, 0x0

    const v99, 0x3f75c28f    # 0.96f

    const v100, 0x3ee560a1

    const/16 v104, 0x0

    invoke-direct/range {v98 .. v106}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v99, Lu61/e;

    const/16 v106, 0x3c

    const/16 v107, 0x0

    const v100, 0x3f7851ec    # 0.97f

    const v101, 0x3f150c28

    const/16 v105, 0x0

    invoke-direct/range {v99 .. v107}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v100, Lu61/e;

    const/16 v107, 0x3c

    const/16 v108, 0x0

    const v101, 0x3f7ae148    # 0.98f

    const v102, 0x3eb56814

    const/16 v106, 0x0

    invoke-direct/range {v100 .. v108}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v101, Lu61/e;

    const/16 v108, 0x3c

    const/16 v109, 0x0

    const v102, 0x3f7d70a4    # 0.99f

    const v103, 0x3edc7fe4

    const/16 v107, 0x0

    invoke-direct/range {v101 .. v109}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v2 .. v101}, [Lu61/e;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lu61/e;

    new-instance v6, La71/a;

    invoke-virtual {v5}, Lu61/e;->h()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v7, 0x1

    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const-string v7, "%.4f"

    invoke-static {v7, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v4, Lr61/i$q3;->w:Lr61/i$q3;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v12

    const/16 v19, 0xfdb

    const/16 v20, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v6 .. v20}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x1f

    move-object v11, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v13}, Lu61/e;->c(Lu61/e;FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILjava/lang/Object;)Lu61/e;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Lu61/a;

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v4, v1

    move-object v1, v2

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v2, Lj71/b$g;

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const-string v4, "greenishline"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    new-instance v15, Lj71/c;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xc

    const/16 v21, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v15 .. v21}, Lj71/c;-><init>(Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v15
.end method

.method private static final h(Ly81/i;)Li2/t;
    .locals 5

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method
