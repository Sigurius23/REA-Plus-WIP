.class public abstract Lrc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;",
        "Ls31/e;",
        "f",
        "(Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;)Ls31/e;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "shopMediaCardMapper",
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

    new-instance v0, Lr61/h;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lrc1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrc1/a;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;)Ls31/e;
    .locals 0

    invoke-static {p0}, Lrc1/a;->e(Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;)Ls31/e;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Lrc1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr61/h;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lrc1/a$a;

    invoke-direct {v2, v0}, Lrc1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;)Ls31/e;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lrc1/a;->f(Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;)Ls31/e;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;)Ls31/e;
    .locals 29

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getSize()Ls31/d;

    move-result-object v0

    sget-object v1, Ls31/d;->HERO:Ls31/d;

    if-ne v0, v1, :cond_0

    sget-object v0, Lb91/c;->T4:Lb91/c;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lb91/c;->T3:Lb91/c;

    goto :goto_0

    :goto_1
    new-instance v4, Lkd1/o$c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getContentUrl()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getContentType()Lcom/whoop/design/models/ContentType;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/whoop/design/models/ContentType;->IMAGE:Lcom/whoop/design/models/ContentType;

    :cond_1
    sget-object v1, Lcom/whoop/design/models/ContentType;->IMAGE:Lcom/whoop/design/models/ContentType;

    const/4 v14, 0x0

    if-ne v0, v1, :cond_2

    move-object v0, v4

    goto :goto_2

    :cond_2
    move-object v0, v14

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Llb1/q4;->d(Lcom/whoop/design/models/items/TagModel;)Lhy0/h1;

    move-result-object v1

    move-object v15, v1

    goto :goto_3

    :cond_3
    move-object v15, v14

    :goto_3
    new-instance v1, Lsz0/c0;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/16 v12, 0x3f0

    const/4 v13, 0x0

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getDescription()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_4

    new-instance v16, Lsz0/c0;

    sget-object v18, Lb91/c;->B2:Lb91/c;

    sget-object v19, Ly81/f;->WHITE_70:Ly81/f;

    const/16 v27, 0x3f0

    const/16 v28, 0x0

    const/16 v20, 0x5

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v16 .. v28}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v9, v16

    goto :goto_4

    :cond_4
    move-object v9, v14

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_6

    :cond_5
    new-instance v14, Ls31/a$a;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getCtaIcon()Lgz0/m0;

    move-result-object v3

    if-nez v3, :cond_6

    sget-object v3, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    :cond_6
    invoke-direct {v14, v2, v3}, Ls31/a$a;-><init>(Ljava/lang/String;Lgz0/m0;)V

    :cond_7
    :goto_5
    move-object v10, v14

    goto :goto_7

    :cond_8
    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getCtaIcon()Lgz0/m0;

    move-result-object v2

    if-nez v2, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getCtaInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v2

    if-eqz v2, :cond_7

    :cond_9
    new-instance v14, Ls31/a$b;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getCtaIcon()Lgz0/m0;

    move-result-object v2

    if-nez v2, :cond_a

    sget-object v2, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    :cond_a
    invoke-direct {v14, v2}, Ls31/a$b;-><init>(Lgz0/m0;)V

    goto :goto_5

    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getSize()Ls31/d;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->getCtaInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v12

    new-instance v5, Ls31/e;

    move-object v6, v0

    move-object v8, v1

    move-object v7, v15

    invoke-direct/range {v5 .. v12}, Ls31/e;-><init>(Lkd1/o;Lhy0/h1;Lsz0/c0;Lsz0/c0;Ls31/a;Ls31/d;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v5
.end method
