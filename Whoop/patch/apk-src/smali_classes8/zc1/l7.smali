.class public abstract Lzc1/l7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\",\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "Ll83/k;",
        "",
        "Lh41/c;",
        "a",
        "Ljava/util/List;",
        "getShoppingTileStates",
        "()Ljava/util/List;",
        "ShoppingTileStates",
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll83/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 27

    new-instance v0, Lh41/c;

    new-instance v1, Lkd1/o$c;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const-string v2, "https://cdn.shopify.com/s/files/1/0378/2560/9865/products/GEN-4-Shopify-Battery-View1_600x400_ecebc8da-d749-4e62-aae3-5ddda479f874.png"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v11, "Battery Pack 4.0"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v12, "$40"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/16 v9, 0x33

    const/4 v10, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Ll83/k;

    const-string v2, "No Tag - No WHOOP Pro"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Lh41/c;

    new-instance v16, Lkd1/o$c;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const-string v3, "https://cdn.shopify.com/s/files/1/0378/2560/9865/products/GEN-4-Shopify-Battery-View1_600x400_ecebc8da-d749-4e62-aae3-5ddda479f874.png"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, v16

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v0, Lh41/e$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v2}, Lh41/e$d;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const/16 v22, 0x23

    const/16 v23, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v0

    invoke-direct/range {v13 .. v23}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ll83/k;

    const-string v4, "New - No WHOOP Pro"

    invoke-direct {v0, v4, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Lh41/c;

    new-instance v17, Lkd1/o$c;

    const/16 v20, 0xe

    const/16 v21, 0x0

    const-string v16, "https://cdn.shopify.com/s/files/1/0378/2560/9865/products/GEN-4-Shopify-Battery-View1_600x400_ecebc8da-d749-4e62-aae3-5ddda479f874.png"

    move-object/from16 v15, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v5, Lh41/e$a;

    invoke-direct {v5, v2, v3, v2}, Lh41/e$a;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    const/16 v23, 0x23

    const/16 v24, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v5

    invoke-direct/range {v14 .. v24}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, Lh41/c;

    new-instance v16, Lkd1/o$c;

    const/16 v21, 0xe

    const/16 v22, 0x0

    const-string v17, "https://cdn.shopify.com/s/files/1/0378/2560/9865/products/GEN-4-Shopify-Battery-View1_600x400_ecebc8da-d749-4e62-aae3-5ddda479f874.png"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    new-instance v4, Lh41/e$f;

    invoke-direct {v4, v2, v3, v2}, Lh41/e$f;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    const-string v6, "$32"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    const/16 v24, 0x3

    const/16 v25, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v4

    invoke-direct/range {v15 .. v25}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Ll83/k;

    const-string v7, "Sale default - No WHOOP Pro"

    invoke-direct {v4, v7, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v16, Lh41/c;

    new-instance v17, Lkd1/o$c;

    const/16 v22, 0xe

    const/16 v23, 0x0

    const-string v18, "https://cdn.shopify.com/s/files/1/0378/2560/9865/products/GEN-4-Shopify-Battery-View1_600x400_ecebc8da-d749-4e62-aae3-5ddda479f874.png"

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v23}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    new-instance v7, Lh41/e$f;

    const-string v8, "Extra %5 off"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct {v7, v8}, Lh41/e$f;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    const/16 v25, 0x3

    const/16 v26, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v24, 0x1

    move-object/from16 v21, v7

    invoke-direct/range {v16 .. v26}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v5

    move-object/from16 v7, v16

    new-instance v5, Ll83/k;

    const-string v9, "Sale with text - WHOOP Pro"

    invoke-direct {v5, v9, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Lh41/c;

    new-instance v16, Lkd1/o$c;

    const/16 v19, 0xe

    const/16 v20, 0x0

    const-string v15, "https://cdn.shopify.com/s/files/1/0378/2560/9865/products/GEN-4-Shopify-Battery-View1_600x400_ecebc8da-d749-4e62-aae3-5ddda479f874.png"

    move-object/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v20}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v7, Lh41/e$c;

    invoke-direct {v7, v2, v3, v2}, Lh41/e$c;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const/16 v22, 0x23

    const/16 v23, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x1

    move-object/from16 v18, v7

    invoke-direct/range {v13 .. v23}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v6

    new-instance v6, Ll83/k;

    const-string v9, "Exclusive - WHOOP Pro"

    invoke-direct {v6, v9, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Lh41/c;

    new-instance v17, Lkd1/o$c;

    const/16 v20, 0xe

    const/16 v21, 0x0

    const-string v16, "https://cdn.shopify.com/s/files/1/0378/2560/9865/products/GEN-4-Shopify-Battery-View1_600x400_ecebc8da-d749-4e62-aae3-5ddda479f874.png"

    move-object/from16 v15, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v9, Lh41/e$b;

    invoke-direct {v9, v2, v3, v2}, Lh41/e$b;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    const/16 v23, 0x3

    const/16 v24, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v9

    invoke-direct/range {v14 .. v24}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v7

    new-instance v7, Ll83/k;

    const-string v10, "Cyber Sale - No WHOOP Pro"

    invoke-direct {v7, v10, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, Lh41/c;

    new-instance v16, Lkd1/o$c;

    const/16 v21, 0xe

    const/16 v22, 0x0

    const-string v17, "https://cdn.shopify.com/s/files/1/0378/2560/9865/products/GEN-4-Shopify-Battery-View1_600x400_ecebc8da-d749-4e62-aae3-5ddda479f874.png"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    new-instance v10, Lh41/e$b;

    invoke-direct {v10, v2, v3, v2}, Lh41/e$b;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    const/16 v24, 0x3

    const/16 v25, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v23, 0x1

    move-object/from16 v20, v10

    invoke-direct/range {v15 .. v25}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v8

    new-instance v8, Ll83/k;

    const-string v2, "Cyber Sale - WHOOP Pro"

    invoke-direct {v8, v2, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v16, Lh41/c;

    const/16 v25, 0xfd

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v26}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    new-instance v9, Ll83/k;

    const-string v10, "Discovery Tile"

    invoke-direct {v9, v10, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v0

    filled-new-array/range {v1 .. v9}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzc1/l7;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/l7;->e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/l7;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v4, p0

    check-cast v4, Lp1/q;

    const p0, -0x59c02b4a

    invoke-virtual {v4, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    const/4 v7, 0x1

    if-eqz p1, :cond_0

    move v0, v7

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->N:Lb2/k;

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/16 v3, 0x30

    invoke-static {v2, v1, v4, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v4, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v4, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v2, v4, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x4f189f9

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lzc1/l7;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/k;

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, v4, p0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v10, v2

    invoke-static {v1, v10, v8, v4}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lm91/u;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_4

    new-instance v1, Lzc1/h7;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v1, Lh41/c;->i:I

    or-int/lit16 v5, v1, 0xc00

    const/4 v6, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10, v10, v8, v4}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v4, p0}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance v0, Lzc1/g6;

    const/16 v1, 0x17

    invoke-direct {v0, p1, v1}, Lzc1/g6;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/l7;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
