.class public abstract Llb1/n1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ExpandableContentModel;",
        "Lv51/c;",
        "i",
        "(Lcom/whoop/design/models/items/ExpandableContentModel;)Lv51/c;",
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "h",
        "()Ljb1/a;",
        "expandableContentNestedReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "g",
        "()Llb1/y0;",
        "expandableContentMapper",
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
.field private static final a:Ll83/h;

.field private static final b:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj02/w;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lj02/w;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Llb1/n1;->a:Ll83/h;

    new-instance v0, Llb1/e1;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/n1;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/n1;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/ExpandableContentModel;)Lv51/c;
    .locals 0

    invoke-static {p0}, Llb1/n1;->e(Lcom/whoop/design/models/items/ExpandableContentModel;)Lv51/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ljb1/a;
    .locals 1

    invoke-static {}, Llb1/n1;->f()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/e1;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ExpandableContentModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/n1$a;

    invoke-direct {v2, v0}, Llb1/n1$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/ExpandableContentModel;)Lv51/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/n1;->i(Lcom/whoop/design/models/items/ExpandableContentModel;)Lv51/c;

    move-result-object p0

    return-object p0
.end method

.method private static final f()Ljb1/a;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static final g()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/n1;->b:Llb1/y0;

    return-object v0
.end method

.method private static final h()Ljb1/a;
    .locals 1

    sget-object v0, Llb1/n1;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method private static final i(Lcom/whoop/design/models/items/ExpandableContentModel;)Lv51/c;
    .locals 16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ExpandableContentModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ExpandableContentModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ExpandableContentModel;->getTitleTypography()Lb91/c;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lb91/c;->SH4:Lb91/c;

    :cond_0
    move-object v3, v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ExpandableContentModel;->getTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Llb1/q4;->d(Lcom/whoop/design/models/items/TagModel;)Lhy0/h1;

    move-result-object v0

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ExpandableContentModel;->getInitiallyExpanded()Z

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ExpandableContentModel;->getItemLayout()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ExpandableContentModel;->getHeaderPosition()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    move-result-object v12

    invoke-static {}, Llb1/n1;->h()Ljb1/a;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ExpandableContentModel;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v13

    new-instance v0, Lv51/c;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v14, 0x338

    const/4 v15, 0x0

    invoke-direct/range {v0 .. v15}, Lv51/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Li2/x;Lp3/r;ZLhy0/h1;ZLi2/x;Ly3/f;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
