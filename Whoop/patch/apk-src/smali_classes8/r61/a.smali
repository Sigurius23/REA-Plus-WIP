.class public abstract Lr61/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lj71/c;",
        "b",
        "()Lj71/c;",
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

    invoke-static {p0}, Lr61/a;->c(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final b()Lj71/c;
    .locals 114

    new-instance v0, Lj71/c;

    new-instance v1, Lg61/b;

    new-instance v2, Lyy0/c;

    const-string v3, "40"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v4, Lr61/a$a;->w:Lr61/a$a;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/high16 v6, 0x3f000000    # 0.5f

    const v7, 0x3e4ccccd    # 0.2f

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lyy0/c;

    const-string v4, "60"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v5, Lr61/a$b;->w:Lr61/a$b;

    invoke-static {v5}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    const/16 v10, 0x20

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const v8, 0x3ecccccd    # 0.4f

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lyy0/c;

    const-string v5, "80"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Lr61/a$c;->w:Lr61/a$c;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/high16 v8, 0x3f000000    # 0.5f

    const v9, 0x3f19999a    # 0.6f

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lyy0/c;

    const-string v6, "100"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v7, Lr61/a$d;->w:Lr61/a$d;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    const/16 v12, 0x20

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/high16 v9, 0x3f000000    # 0.5f

    const v10, 0x3f4ccccd    # 0.8f

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v2, v3, v4, v5}, [Lyy0/c;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    sget-object v5, Lg61/d;->TIME_MARKER:Lg61/d;

    const-string v2, "6:45am"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/16 v10, 0xc0

    const v2, 0x3dcccccd    # 0.1f

    const v4, 0x3da3d70a    # 0.08f

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lg61/b;

    const-string v2, "7:30 AM"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/16 v13, 0xc0

    const/4 v14, 0x0

    move-object v8, v5

    const v5, 0x3dcccccd    # 0.1f

    sget-object v17, Lm83/y;->w:Lm83/y;

    const v7, 0x3da3d70a    # 0.08f

    const/4 v10, 0x1

    const/4 v12, 0x0

    move-object v4, v3

    move-object/from16 v6, v17

    invoke-direct/range {v4 .. v14}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lg61/b;

    sget-object v19, Lg61/d;->STANDARD:Lg61/d;

    const-string v2, ""

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const/16 v24, 0xc0

    const/16 v25, 0x0

    const v16, 0x3e19999a    # 0.15f

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object v15, v4

    invoke-direct/range {v15 .. v25}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lj61/f;

    const/16 v13, 0x7e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v14}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lj61/f;

    const/16 v14, 0x7e

    const/4 v15, 0x0

    const v7, 0x3eaa7efa    # 0.333f

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v15}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lj61/f;

    const/16 v15, 0x7e

    const/16 v16, 0x0

    const v8, 0x3f2a7efa    # 0.666f

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lj61/f;

    const/16 v26, 0x7e

    const/16 v27, 0x0

    const/high16 v19, 0x3f800000    # 1.0f

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v27}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v19, Lj61/f;

    sget-object v23, Lg61/f;->Y_AXIS:Lg61/f;

    const/16 v27, 0x7a

    const/16 v28, 0x0

    const v20, 0x3e124925

    move-object/from16 v22, v23

    const/16 v23, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v19 .. v28}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v22

    new-instance v20, Lj61/f;

    const/16 v28, 0x7a

    const/16 v29, 0x0

    const v21, 0x3e924925

    const/16 v22, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v20 .. v29}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, v20

    new-instance v20, Lj61/f;

    const v21, 0x3edb6db7

    invoke-direct/range {v20 .. v29}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v11, v20

    new-instance v20, Lj61/f;

    const v21, 0x3f124925

    invoke-direct/range {v20 .. v29}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v12, v20

    new-instance v20, Lj61/f;

    const v21, 0x3f36db6e

    invoke-direct/range {v20 .. v29}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v13, v20

    new-instance v20, Lj61/f;

    const v21, 0x3f5b6db7

    invoke-direct/range {v20 .. v29}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, v18

    move-object/from16 v9, v19

    move-object/from16 v14, v20

    filled-new-array/range {v5 .. v14}, [Lj61/f;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v6, Lh2/c;

    const v2, 0x3d4ccccd    # 0.05f

    const/4 v5, 0x0

    invoke-direct {v6, v2, v2, v2, v5}, Lh2/c;-><init>(FFFF)V

    move-object v2, v1

    new-instance v1, Lj61/h;

    const/16 v16, 0x1f88

    move-object/from16 v8, v17

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v1 .. v17}, Lj61/h;-><init>(Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lk61/a;

    new-instance v2, Lqt2/w;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lqt2/w;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v5, 0x2

    invoke-direct {v4, v2, v3, v5, v3}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lk61/c;

    sget-object v2, Lr61/a$e;->w:Lr61/a$e;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v10

    const/16 v14, 0x37

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-object v6, v5

    invoke-direct/range {v6 .. v15}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lu61/e;

    const/16 v13, 0x3c

    const/4 v14, 0x0

    const v8, 0x3e332a1b

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lu61/e;

    const/16 v14, 0x3c

    const v8, 0x3c23d70a    # 0.01f

    const v9, 0x3e7191af

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lu61/e;

    const/16 v15, 0x3c

    const/16 v16, 0x0

    const v9, 0x3ca3d70a    # 0.02f

    const v10, 0x3e4bcf2d

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lu61/e;

    const/16 v16, 0x3c

    const v10, 0x3cf5c28f    # 0.03f

    const v11, 0x3e63e95c

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lu61/e;

    const/16 v17, 0x3c

    const/16 v18, 0x0

    const v11, 0x3d23d70a    # 0.04f

    const v12, 0x3e3fe4f6

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lu61/e;

    const/16 v18, 0x3c

    const/16 v19, 0x0

    const v12, 0x3d4ccccd    # 0.05f

    const v13, 0x3e2050a4

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lu61/e;

    const/16 v19, 0x3c

    const/16 v20, 0x0

    const v13, 0x3d75c28f    # 0.06f

    const v14, 0x3e27f02e

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lu61/e;

    const/16 v20, 0x3c

    const/16 v21, 0x0

    const v14, 0x3d8f5c29    # 0.07f

    const v15, 0x3e680e76

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v21}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lu61/e;

    const/16 v21, 0x3c

    const v15, 0x3da3d70a    # 0.08f

    const v16, 0x3e716941

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lu61/e;

    const/16 v22, 0x3c

    const/16 v23, 0x0

    const v16, 0x3db851ec    # 0.09f

    const v17, 0x3e6cadb8

    const/16 v21, 0x0

    invoke-direct/range {v15 .. v23}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lu61/e;

    const/16 v23, 0x3c

    const v17, 0x3dcccccd    # 0.1f

    const v18, 0x3e12b24b

    const/16 v22, 0x0

    invoke-direct/range {v16 .. v24}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v17, Lu61/e;

    const/16 v24, 0x3c

    const v18, 0x3de147ae    # 0.11f

    const v19, 0x3e3cbdb9

    const/16 v23, 0x0

    invoke-direct/range {v17 .. v25}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lu61/e;

    const/16 v25, 0x3c

    const v19, 0x3df5c28f    # 0.12f

    const v20, 0x3e8b06bb

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v26}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v19, Lu61/e;

    const/16 v26, 0x3c

    const v20, 0x3e051eb8    # 0.13f

    const v21, 0x3e75db72

    const/16 v25, 0x0

    invoke-direct/range {v19 .. v27}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v20, Lu61/e;

    const/16 v27, 0x3c

    const/16 v28, 0x0

    const v21, 0x3e0f5c29    # 0.14f

    const v22, 0x3e509689

    const/16 v26, 0x0

    invoke-direct/range {v20 .. v28}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v21, Lu61/e;

    const/16 v28, 0x3c

    const v22, 0x3e19999a    # 0.15f

    const v23, 0x3e8a9b48

    const/16 v27, 0x0

    invoke-direct/range {v21 .. v29}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v22, Lu61/e;

    const/16 v29, 0x3c

    const/16 v30, 0x0

    const v23, 0x3e23d70a    # 0.16f

    const v24, 0x3e454f1e

    const/16 v28, 0x0

    invoke-direct/range {v22 .. v30}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v23, Lu61/e;

    const/16 v30, 0x3c

    const/16 v31, 0x0

    const v24, 0x3e2e147b    # 0.17f

    const v25, 0x3e16a975

    const/16 v29, 0x0

    invoke-direct/range {v23 .. v31}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v24, Lu61/e;

    const/16 v31, 0x3c

    const/16 v32, 0x0

    const v25, 0x3e3851ec    # 0.18f

    const v26, 0x3e47e5f7

    const/16 v30, 0x0

    invoke-direct/range {v24 .. v32}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v25, Lu61/e;

    const/16 v32, 0x3c

    const/16 v33, 0x0

    const v26, 0x3e428f5c    # 0.19f

    const v27, 0x3e8c28d3

    const/16 v31, 0x0

    invoke-direct/range {v25 .. v33}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v26, Lu61/e;

    const/16 v33, 0x3c

    const/16 v34, 0x0

    const v27, 0x3e4ccccd    # 0.2f

    const v28, 0x3e34ff24

    const/16 v32, 0x0

    invoke-direct/range {v26 .. v34}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lu61/e;

    const/16 v34, 0x3c

    const/16 v35, 0x0

    const v28, 0x3e570a3d    # 0.21f

    const v29, 0x3e838400

    const/16 v33, 0x0

    invoke-direct/range {v27 .. v35}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v28, Lu61/e;

    const/16 v35, 0x3c

    const/16 v36, 0x0

    const v29, 0x3e6147ae    # 0.22f

    const v30, 0x3e4b4ca7

    const/16 v34, 0x0

    invoke-direct/range {v28 .. v36}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v29, Lu61/e;

    const/16 v36, 0x3c

    const/16 v37, 0x0

    const v30, 0x3e6b851f    # 0.23f

    const v31, 0x3e2b4fb5

    const/16 v35, 0x0

    invoke-direct/range {v29 .. v37}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v30, Lu61/e;

    const/16 v37, 0x3c

    const/16 v38, 0x0

    const v31, 0x3e75c28f    # 0.24f

    const v32, 0x3e3f5cc2

    const/16 v36, 0x0

    invoke-direct/range {v30 .. v38}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v31, Lu61/e;

    const/16 v38, 0x3c

    const/16 v39, 0x0

    const/high16 v32, 0x3e800000    # 0.25f

    const v33, 0x3e6f612c

    const/16 v37, 0x0

    invoke-direct/range {v31 .. v39}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v32, Lu61/e;

    const/16 v39, 0x3c

    const/16 v40, 0x0

    const v33, 0x3e851eb8    # 0.26f

    const v34, 0x3e7d1f1d    # 0.247189f

    const/16 v38, 0x0

    invoke-direct/range {v32 .. v40}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v33, Lu61/e;

    const/16 v40, 0x3c

    const/16 v41, 0x0

    const v34, 0x3e8a3d71    # 0.27f

    const v35, 0x3e7a42bd

    const/16 v39, 0x0

    invoke-direct/range {v33 .. v41}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lu61/e;

    const/16 v41, 0x3c

    const/16 v42, 0x0

    const v35, 0x3e8f5c29    # 0.28f

    const v36, 0x3e968bf8

    const/16 v40, 0x0

    invoke-direct/range {v34 .. v42}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v35, Lu61/e;

    const/16 v42, 0x3c

    const/16 v43, 0x0

    const v36, 0x3e947ae1    # 0.29f

    const v37, 0x3e8a9c66

    const/16 v41, 0x0

    invoke-direct/range {v35 .. v43}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v36, Lu61/e;

    const/16 v43, 0x3c

    const/16 v44, 0x0

    const v37, 0x3e99999a    # 0.3f

    const v38, 0x3e875f1f

    const/16 v42, 0x0

    invoke-direct/range {v36 .. v44}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v37, Lu61/e;

    const/16 v44, 0x3c

    const/16 v45, 0x0

    const v38, 0x3e9eb852    # 0.31f

    const v39, 0x3e8129bd

    const/16 v43, 0x0

    invoke-direct/range {v37 .. v45}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v38, Lu61/e;

    const/16 v45, 0x3c

    const/16 v46, 0x0

    const v39, 0x3ea3d70a    # 0.32f

    const v40, 0x3e6f5cb0

    const/16 v44, 0x0

    invoke-direct/range {v38 .. v46}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v39, Lu61/e;

    const/16 v46, 0x3c

    const/16 v47, 0x0

    const v40, 0x3ea8f5c3    # 0.33f

    const v41, 0x3eb0a761    # 0.345027f

    const/16 v45, 0x0

    invoke-direct/range {v39 .. v47}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v40, Lu61/e;

    const/16 v47, 0x3c

    const/16 v48, 0x0

    const v41, 0x3eae147b    # 0.34f

    const v42, 0x3eb2258d

    const/16 v46, 0x0

    invoke-direct/range {v40 .. v48}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v41, Lu61/e;

    const/16 v48, 0x3c

    const/16 v49, 0x0

    const v42, 0x3eb33333    # 0.35f

    const v43, 0x3eac7136

    const/16 v47, 0x0

    invoke-direct/range {v41 .. v49}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v42, Lu61/e;

    const/16 v49, 0x3c

    const/16 v50, 0x0

    const v43, 0x3eb851ec    # 0.36f

    const v44, 0x3e961741

    const/16 v48, 0x0

    invoke-direct/range {v42 .. v50}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v43, Lu61/e;

    const/16 v50, 0x3c

    const/16 v51, 0x0

    const v44, 0x3ebd70a4    # 0.37f

    const v45, 0x3ebc7f08

    const/16 v49, 0x0

    invoke-direct/range {v43 .. v51}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v44, Lu61/e;

    const/16 v51, 0x3c

    const/16 v52, 0x0

    const v45, 0x3ec28f5c    # 0.38f

    const v46, 0x3eb5d802

    const/16 v50, 0x0

    invoke-direct/range {v44 .. v52}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v45, Lu61/e;

    const/16 v52, 0x3c

    const/16 v53, 0x0

    const v46, 0x3ec7ae14    # 0.39f

    const v47, 0x3efd68ed

    const/16 v51, 0x0

    invoke-direct/range {v45 .. v53}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v46, Lu61/e;

    const/16 v53, 0x3c

    const/16 v54, 0x0

    const v47, 0x3ecccccd    # 0.4f

    const v48, 0x3ee1910e

    const/16 v52, 0x0

    invoke-direct/range {v46 .. v54}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v47, Lu61/e;

    const/16 v54, 0x3c

    const/16 v55, 0x0

    const v48, 0x3ed1eb85    # 0.41f

    const v49, 0x3ed781e6

    const/16 v53, 0x0

    invoke-direct/range {v47 .. v55}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v48, Lu61/e;

    const/16 v55, 0x3c

    const/16 v56, 0x0

    const v49, 0x3ed70a3d    # 0.42f

    const v50, 0x3ecfcd8e

    const/16 v54, 0x0

    invoke-direct/range {v48 .. v56}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v49, Lu61/e;

    const/16 v56, 0x3c

    const/16 v57, 0x0

    const v50, 0x3edc28f6    # 0.43f

    const v51, 0x3f0d96f1

    const/16 v55, 0x0

    invoke-direct/range {v49 .. v57}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v50, Lu61/e;

    const/16 v57, 0x3c

    const/16 v58, 0x0

    const v51, 0x3ee147ae    # 0.44f

    const v52, 0x3ec5daca

    const/16 v56, 0x0

    invoke-direct/range {v50 .. v58}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v51, Lu61/e;

    const/16 v58, 0x3c

    const/16 v59, 0x0

    const v52, 0x3ee66666    # 0.45f

    const v53, 0x3ef9d949

    const/16 v57, 0x0

    invoke-direct/range {v51 .. v59}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v52, Lu61/e;

    const/16 v59, 0x3c

    const/16 v60, 0x0

    const v53, 0x3eeb851f    # 0.46f

    const v54, 0x3ef8843a

    const/16 v58, 0x0

    invoke-direct/range {v52 .. v60}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v53, Lu61/e;

    const/16 v60, 0x3c

    const/16 v61, 0x0

    const v54, 0x3ef0a3d7    # 0.47f

    const v55, 0x3f0ceac8

    const/16 v59, 0x0

    invoke-direct/range {v53 .. v61}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v54, Lu61/e;

    const/16 v61, 0x3c

    const/16 v62, 0x0

    const v55, 0x3ef5c28f    # 0.48f

    const v56, 0x3ed38eb4

    const/16 v60, 0x0

    invoke-direct/range {v54 .. v62}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v55, Lu61/e;

    const/16 v62, 0x3c

    const/16 v63, 0x0

    const v56, 0x3efae148    # 0.49f

    const v57, 0x3edc9457

    const/16 v61, 0x0

    invoke-direct/range {v55 .. v63}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v56, Lu61/e;

    const/16 v63, 0x3c

    const/16 v64, 0x0

    const/high16 v57, 0x3f000000    # 0.5f

    const v58, 0x3f1662ef

    const/16 v62, 0x0

    invoke-direct/range {v56 .. v64}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v57, Lu61/e;

    const/16 v64, 0x3c

    const/16 v65, 0x0

    const v58, 0x3f028f5c    # 0.51f

    const v59, 0x3ee75379

    const/16 v63, 0x0

    invoke-direct/range {v57 .. v65}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v58, Lu61/e;

    const/16 v65, 0x3c

    const/16 v66, 0x0

    const v59, 0x3f051eb8    # 0.52f

    const v60, 0x3ef7c7cc

    const/16 v64, 0x0

    invoke-direct/range {v58 .. v66}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v59, Lu61/e;

    const/16 v66, 0x3c

    const/16 v67, 0x0

    const v60, 0x3f07ae14    # 0.53f

    const v61, 0x3f01f692

    const/16 v65, 0x0

    invoke-direct/range {v59 .. v67}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v60, Lu61/e;

    const/16 v67, 0x3c

    const/16 v68, 0x0

    const v61, 0x3f0a3d71    # 0.54f

    const v62, 0x3f207487

    const/16 v66, 0x0

    invoke-direct/range {v60 .. v68}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v61, Lu61/e;

    const/16 v68, 0x3c

    const/16 v69, 0x0

    const v62, 0x3f0ccccd    # 0.55f

    const v63, 0x3ef673ab

    const/16 v67, 0x0

    invoke-direct/range {v61 .. v69}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v62, Lu61/e;

    const/16 v69, 0x3c

    const/16 v70, 0x0

    const v63, 0x3f0f5c29    # 0.56f

    const v64, 0x3ed4ac44

    const/16 v68, 0x0

    invoke-direct/range {v62 .. v70}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v63, Lu61/e;

    const/16 v70, 0x3c

    const/16 v71, 0x0

    const v64, 0x3f11eb85    # 0.57f

    const v65, 0x3f0371c1

    const/16 v69, 0x0

    invoke-direct/range {v63 .. v71}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v64, Lu61/e;

    const/16 v71, 0x3c

    const/16 v72, 0x0

    const v65, 0x3f147ae1    # 0.58f

    const v66, 0x3f12513c

    const/16 v70, 0x0

    invoke-direct/range {v64 .. v72}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v65, Lu61/e;

    const/16 v72, 0x3c

    const/16 v73, 0x0

    const v66, 0x3f170a3d    # 0.59f

    const v67, 0x3efbf08b

    const/16 v71, 0x0

    invoke-direct/range {v65 .. v73}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v66, Lu61/e;

    const/16 v73, 0x3c

    const/16 v74, 0x0

    const v67, 0x3f19999a    # 0.6f

    const v68, 0x3f062df4

    const/16 v72, 0x0

    invoke-direct/range {v66 .. v74}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v67, Lu61/e;

    const/16 v74, 0x3c

    const/16 v75, 0x0

    const v68, 0x3f1c28f6    # 0.61f

    const v69, 0x3f01eda9

    const/16 v73, 0x0

    invoke-direct/range {v67 .. v75}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v68, Lu61/e;

    const/16 v75, 0x3c

    const/16 v76, 0x0

    const v69, 0x3f1eb852    # 0.62f

    const v70, 0x3ed23eed

    const/16 v74, 0x0

    invoke-direct/range {v68 .. v76}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v69, Lu61/e;

    const/16 v76, 0x3c

    const/16 v77, 0x0

    const v70, 0x3f2147ae    # 0.63f

    const v71, 0x3eecbe21

    const/16 v75, 0x0

    invoke-direct/range {v69 .. v77}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v70, Lu61/e;

    const/16 v77, 0x3c

    const/16 v78, 0x0

    const v71, 0x3f23d70a    # 0.64f

    const v72, 0x3ec06a51

    const/16 v76, 0x0

    invoke-direct/range {v70 .. v78}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v71, Lu61/e;

    const/16 v78, 0x3c

    const/16 v79, 0x0

    const v72, 0x3f266666    # 0.65f

    const v73, 0x3eff3f70

    const/16 v77, 0x0

    invoke-direct/range {v71 .. v79}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v72, Lu61/e;

    const/16 v79, 0x3c

    const/16 v80, 0x0

    const v73, 0x3f28f5c3    # 0.66f

    const v74, 0x3f1868b0

    const/16 v78, 0x0

    invoke-direct/range {v72 .. v80}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v73, Lu61/e;

    const/16 v80, 0x3c

    const/16 v81, 0x0

    const v74, 0x3f2b851f    # 0.67f

    const v75, 0x3f0507cb

    const/16 v79, 0x0

    invoke-direct/range {v73 .. v81}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v74, Lu61/e;

    const/16 v81, 0x3c

    const/16 v82, 0x0

    const v75, 0x3f2e147b    # 0.68f

    const v76, 0x3f062bc7

    const/16 v80, 0x0

    invoke-direct/range {v74 .. v82}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v75, Lu61/e;

    const/16 v82, 0x3c

    const/16 v83, 0x0

    const v76, 0x3f30a3d7    # 0.69f

    const v77, 0x3f1ceada

    const/16 v81, 0x0

    invoke-direct/range {v75 .. v83}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v76, Lu61/e;

    const/16 v83, 0x3c

    const/16 v84, 0x0

    const v77, 0x3f333333    # 0.7f

    const v78, 0x3ee98b42

    const/16 v82, 0x0

    invoke-direct/range {v76 .. v84}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v77, Lu61/e;

    const/16 v84, 0x3c

    const/16 v85, 0x0

    const v78, 0x3f35c28f    # 0.71f

    const v79, 0x3f209e2b

    const/16 v83, 0x0

    invoke-direct/range {v77 .. v85}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v78, Lu61/e;

    const/16 v85, 0x3c

    const/16 v86, 0x0

    const v79, 0x3f3851ec    # 0.72f

    const v80, 0x3ef6500a

    const/16 v84, 0x0

    invoke-direct/range {v78 .. v86}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v79, Lu61/e;

    const/16 v86, 0x3c

    const/16 v87, 0x0

    const v80, 0x3f3ae148    # 0.73f

    const v81, 0x3f22c517

    const/16 v85, 0x0

    invoke-direct/range {v79 .. v87}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v80, Lu61/e;

    const/16 v87, 0x3c

    const/16 v88, 0x0

    const v81, 0x3f3d70a4    # 0.74f

    const v82, 0x3effae45

    const/16 v86, 0x0

    invoke-direct/range {v80 .. v88}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v81, Lu61/e;

    const/16 v88, 0x3c

    const/16 v89, 0x0

    const/high16 v82, 0x3f400000    # 0.75f

    const v83, 0x3efc42f6

    const/16 v87, 0x0

    invoke-direct/range {v81 .. v89}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v82, Lu61/e;

    const/16 v89, 0x3c

    const/16 v90, 0x0

    const v83, 0x3f428f5c    # 0.76f

    const v84, 0x3ee11467

    const/16 v88, 0x0

    invoke-direct/range {v82 .. v90}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v83, Lu61/e;

    const/16 v90, 0x3c

    const/16 v91, 0x0

    const v84, 0x3f451eb8    # 0.77f

    const v85, 0x3efef39d

    const/16 v89, 0x0

    invoke-direct/range {v83 .. v91}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v84, Lu61/e;

    const/16 v91, 0x3c

    const/16 v92, 0x0

    const v85, 0x3f47ae14    # 0.78f

    const v86, 0x3f11fd30

    const/16 v90, 0x0

    invoke-direct/range {v84 .. v92}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v85, Lu61/e;

    const/16 v92, 0x3c

    const/16 v93, 0x0

    const v86, 0x3f4a3d71    # 0.79f

    const v87, 0x3f0d73b0

    const/16 v91, 0x0

    invoke-direct/range {v85 .. v93}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v86, Lu61/e;

    const/16 v93, 0x3c

    const/16 v94, 0x0

    const v87, 0x3f4ccccd    # 0.8f

    const v88, 0x3f2cb8e4

    const/16 v92, 0x0

    invoke-direct/range {v86 .. v94}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v87, Lu61/e;

    const/16 v94, 0x3c

    const/16 v95, 0x0

    const v88, 0x3f4f5c29    # 0.81f

    const v89, 0x3f0d064f

    const/16 v93, 0x0

    invoke-direct/range {v87 .. v95}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v88, Lu61/e;

    const/16 v95, 0x3c

    const/16 v96, 0x0

    const v89, 0x3f51eb85    # 0.82f

    const v90, 0x3ef3e4b0

    const/16 v94, 0x0

    invoke-direct/range {v88 .. v96}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v89, Lu61/e;

    const/16 v96, 0x3c

    const/16 v97, 0x0

    const v90, 0x3f547ae1    # 0.83f

    const v91, 0x3edf63b0

    const/16 v95, 0x0

    invoke-direct/range {v89 .. v97}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v90, Lu61/e;

    const/16 v97, 0x3c

    const/16 v98, 0x0

    const v91, 0x3f570a3d    # 0.84f

    const v92, 0x3ec92e30

    const/16 v96, 0x0

    invoke-direct/range {v90 .. v98}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v91, Lu61/e;

    const/16 v98, 0x3c

    const/16 v99, 0x0

    const v92, 0x3f59999a    # 0.85f

    const v93, 0x3ed7beea

    const/16 v97, 0x0

    invoke-direct/range {v91 .. v99}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v92, Lu61/e;

    const/16 v99, 0x3c

    const/16 v100, 0x0

    const v93, 0x3f5c28f6    # 0.86f

    const v94, 0x3edd20a7

    const/16 v98, 0x0

    invoke-direct/range {v92 .. v100}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v93, Lu61/e;

    const/16 v100, 0x3c

    const/16 v101, 0x0

    const v94, 0x3f5eb852    # 0.87f

    const v95, 0x3eaa6ee3

    const/16 v99, 0x0

    invoke-direct/range {v93 .. v101}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v94, Lu61/e;

    const/16 v101, 0x3c

    const/16 v102, 0x0

    const v95, 0x3f6147ae    # 0.88f

    const v96, 0x3eb91734

    const/16 v100, 0x0

    invoke-direct/range {v94 .. v102}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v95, Lu61/e;

    const/16 v102, 0x3c

    const/16 v103, 0x0

    const v96, 0x3f63d70a    # 0.89f

    const v97, 0x3f086f5d

    const/16 v101, 0x0

    invoke-direct/range {v95 .. v103}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v96, Lu61/e;

    const/16 v103, 0x3c

    const/16 v104, 0x0

    const v97, 0x3f666666    # 0.9f

    const v98, 0x3ed8603c

    const/16 v102, 0x0

    invoke-direct/range {v96 .. v104}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v97, Lu61/e;

    const/16 v104, 0x3c

    const/16 v105, 0x0

    const v98, 0x3f68f5c3    # 0.91f

    const v99, 0x3f00288b

    const/16 v103, 0x0

    invoke-direct/range {v97 .. v105}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v98, Lu61/e;

    const/16 v105, 0x3c

    const/16 v106, 0x0

    const v99, 0x3f6b851f    # 0.92f

    const v100, 0x3ebf595b

    const/16 v104, 0x0

    invoke-direct/range {v98 .. v106}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v99, Lu61/e;

    const/16 v106, 0x3c

    const/16 v107, 0x0

    const v100, 0x3f6e147b    # 0.93f

    const v101, 0x3eec1ff9

    const/16 v105, 0x0

    invoke-direct/range {v99 .. v107}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v100, Lu61/e;

    const/16 v107, 0x3c

    const/16 v108, 0x0

    const v101, 0x3f70a3d7    # 0.94f

    const v102, 0x3edff34f

    const/16 v106, 0x0

    invoke-direct/range {v100 .. v108}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v101, Lu61/e;

    const/16 v108, 0x3c

    const/16 v109, 0x0

    const v102, 0x3f733333    # 0.95f

    const v103, 0x3efdf91d

    const/16 v107, 0x0

    invoke-direct/range {v101 .. v109}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v102, Lu61/e;

    const/16 v109, 0x3c

    const/16 v110, 0x0

    const v103, 0x3f75c28f    # 0.96f

    const v104, 0x3ee560a1

    const/16 v108, 0x0

    invoke-direct/range {v102 .. v110}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v103, Lu61/e;

    const/16 v110, 0x3c

    const/16 v111, 0x0

    const v104, 0x3f7851ec    # 0.97f

    const v105, 0x3f150c28

    const/16 v109, 0x0

    invoke-direct/range {v103 .. v111}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v104, Lu61/e;

    const/16 v111, 0x3c

    const/16 v112, 0x0

    const v105, 0x3f7ae148    # 0.98f

    const v106, 0x3eb56814

    const/16 v110, 0x0

    invoke-direct/range {v104 .. v112}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v105, Lu61/e;

    const/16 v112, 0x3c

    const/16 v113, 0x0

    const v106, 0x3f7d70a4    # 0.99f

    const v107, 0x3edc7fe4

    const/16 v111, 0x0

    invoke-direct/range {v105 .. v113}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v6 .. v105}, [Lu61/e;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v2, Lu61/a;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v3, Lj71/b$g;

    const/16 v10, 0x3c

    const/4 v11, 0x0

    const-string v5, "id"

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

.method private static final c(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->k0()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method
