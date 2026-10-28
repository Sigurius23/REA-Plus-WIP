.class public abstract Llb1/d4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/d4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a\u0015\u0010\u001d\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\"\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "",
        "Lny0/c;",
        "r",
        "(Ljava/lang/String;)Lny0/c;",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "model",
        "Lny0/p0;",
        "p",
        "(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;",
        "Lny0/m0;",
        "Ly81/f;",
        "s",
        "(Lny0/m0;)Ly81/f;",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "backgroundStyle",
        "Lny0/h;",
        "k",
        "(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;)Lny0/h;",
        "Lcom/whoop/design/models/items/CardIconButtonModel;",
        "Lny0/l;",
        "m",
        "(Lcom/whoop/design/models/items/CardIconButtonModel;)Lny0/l;",
        "Li91/a;",
        "e",
        "(Ljava/lang/String;)Li91/a;",
        "o",
        "Lj91/b;",
        "f",
        "(Ljava/lang/String;)Lj91/b;",
        "q",
        "(Ljava/lang/String;)Ly81/f;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "n",
        "()Llb1/y0;",
        "buttonMapper",
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

    new-instance v0, Llb1/x3;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/d4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;
    .locals 0

    invoke-static {p0}, Llb1/d4;->h(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/CardIconButtonModel;)Lny0/l;
    .locals 0

    invoke-static {p0}, Llb1/d4;->j(Lcom/whoop/design/models/items/CardIconButtonModel;)Lny0/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/d4;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;
    .locals 0

    invoke-static {p0}, Llb1/d4;->i(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;)Li91/a;
    .locals 1

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "AI_COACH"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lgb1/b0;->C()Li2/t;

    move-result-object p0

    invoke-static {p0}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object p0

    return-object p0

    :sswitch_1
    const-string v0, "PEAK"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    invoke-static {p0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    return-object p0

    :sswitch_2
    const-string v0, "LIFE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lgb1/b0;->I0()Li2/t;

    move-result-object p0

    invoke-static {p0}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object p0

    return-object p0

    :sswitch_3
    const-string v0, "CITL"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :sswitch_4
    const-string v0, "PDP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :sswitch_5
    const-string v0, "ONE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :sswitch_6
    const-string v0, "CITL_NEW"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :sswitch_7
    const-string v0, "ADVANCED_LABS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-static {p0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x41d3517d -> :sswitch_7
        -0x26b7f0e1 -> :sswitch_6
        0x13246 -> :sswitch_5
        0x134dc -> :sswitch_4
        0x1f915e -> :sswitch_3
        0x23a6fc -> :sswitch_2
        0x2568df -> :sswitch_1
        0x1bc4b9a3 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final f(Ljava/lang/String;)Lj91/b;
    .locals 1

    const-string v0, "AI_COACH"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lgb1/b0;->C()Li2/t;

    move-result-object p0

    invoke-static {p0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/x3;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/d4$b;

    invoke-direct {v3, v0}, Llb1/d4$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/x3;

    const/16 v2, 0xd

    invoke-direct {v0, v2}, Llb1/x3;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/CardButtonModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/d4$c;

    invoke-direct {v3, v0}, Llb1/d4$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/x3;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Llb1/x3;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/CardIconButtonModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/d4$d;

    invoke-direct {v2, v0}, Llb1/d4$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/d4;->p(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/models/items/CardIconButtonModel;)Lny0/l;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/d4;->m(Lcom/whoop/design/models/items/CardIconButtonModel;)Lny0/l;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;)Lny0/h;
    .locals 29

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getId()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v3

    invoke-static/range {p1 .. p1}, Llb1/d4;->e(Ljava/lang/String;)Li91/a;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getCardName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getFeatureType()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v5, Lny0/p;->DEFAULT:Lny0/p;

    invoke-static {}, Lny0/p;->values()[Lny0/p;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x0

    move v11, v10

    :goto_0
    if-ge v11, v9, :cond_1

    aget-object v13, v8, v11

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_1
    const/4 v13, 0x0

    :goto_1
    if-nez v13, :cond_2

    move-object v8, v5

    goto :goto_2

    :cond_2
    move-object v8, v13

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v18, Lcom/whoop/navigation/e;

    const/16 v22, 0x7

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v18 .. v23}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v9, v18

    :goto_3
    move v0, v10

    goto :goto_4

    :cond_3
    move-object v9, v0

    goto :goto_3

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getSize()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_8

    sget-object v13, Lny0/g;->COMPACT:Lny0/g;

    invoke-static {}, Lny0/g;->values()[Lny0/g;

    move-result-object v14

    array-length v15, v14

    :goto_5
    if-ge v0, v15, :cond_5

    aget-object v18, v14, v0

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    goto :goto_6

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_5
    const/16 v18, 0x0

    :goto_6
    if-nez v18, :cond_6

    goto :goto_7

    :cond_6
    move-object/from16 v13, v18

    :goto_7
    if-nez v13, :cond_7

    goto :goto_9

    :cond_7
    :goto_8
    move-object v12, v13

    goto :goto_a

    :cond_8
    :goto_9
    sget-object v13, Lny0/g;->COMPACT:Lny0/g;

    goto :goto_8

    :goto_a
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getCornerRadius()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    sget-object v5, Lny0/b;->MEDIUM:Lny0/b;

    invoke-static {}, Lny0/b;->values()[Lny0/b;

    move-result-object v13

    array-length v14, v13

    const/4 v15, 0x0

    :goto_b
    if-ge v15, v14, :cond_a

    aget-object v16, v13, v15

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_c

    :cond_9
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v1, p0

    goto :goto_b

    :cond_a
    const/16 v16, 0x0

    :goto_c
    if-nez v16, :cond_b

    goto :goto_d

    :cond_b
    move-object/from16 v5, v16

    :goto_d
    invoke-static {v5}, Lny0/e;->l(Lny0/b;)F

    move-result v0

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    move-object v14, v1

    goto :goto_e

    :cond_c
    const/4 v14, 0x0

    :goto_e
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getIconConfiguration()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llb1/d4;->r(Ljava/lang/String;)Lny0/c;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v21

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getDismissEvent()Lcom/whoop/navigation/DismissEventModel;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-static {v0}, Lj02/u;->a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;

    move-result-object v0

    move-object/from16 v22, v0

    goto :goto_f

    :cond_d
    const/16 v22, 0x0

    :goto_f
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_10
    move/from16 v18, v0

    goto :goto_11

    :cond_e
    const/4 v0, 0x1

    goto :goto_10

    :goto_11
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v24

    invoke-static/range {p1 .. p1}, Llb1/d4;->f(Ljava/lang/String;)Lj91/b;

    move-result-object v25

    invoke-static/range {p1 .. p1}, Llb1/d4;->q(Ljava/lang/String;)Ly81/f;

    move-result-object v5

    invoke-static/range {p1 .. p1}, Llb1/d4;->o(Ljava/lang/String;)Li91/a;

    move-result-object v26

    new-instance v1, Lny0/h;

    const v27, 0x66800

    const/16 v28, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v1 .. v28}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CardButtonModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1}, Llb1/d4;->k(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;)Lny0/h;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/whoop/design/models/items/CardIconButtonModel;)Lny0/l;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lny0/l;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CardIconButtonModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CardIconButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lgz0/m0;->ADD:Lgz0/m0;

    :cond_0
    move-object v3, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CardIconButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v4, Lcom/whoop/navigation/e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    move-object v4, v0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/CardIconButtonModel;->isEnabled()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    :goto_1
    move v5, p0

    goto :goto_2

    :cond_2
    const/4 p0, 0x1

    goto :goto_1

    :goto_2
    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final n()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/d4;->a:Llb1/y0;

    return-object v0
.end method

.method public static final o(Ljava/lang/String;)Li91/a;
    .locals 1

    const-string v0, "AI_COACH"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lgb1/b0;->C()Li2/t;

    move-result-object p0

    invoke-static {p0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object p0

    const v0, 0x3f666666    # 0.9f

    invoke-static {p0, v0}, Li91/c;->i(Lj91/b;F)Li91/a;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final p(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;
    .locals 25

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getAlignment()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lk81/a;->values()[Lk81/a;

    move-result-object v4

    array-length v5, v4

    move v6, v2

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    move-object v7, v3

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getText()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getAction()Lcom/whoop/navigation/e;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v4, Ly71/g;

    const/4 v5, 0x2

    invoke-direct {v4, v0, v3, v5, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v4

    goto :goto_2

    :cond_2
    move-object v12, v3

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getStyle()Lny0/m0;

    move-result-object v0

    invoke-static {v0}, Llb1/d4;->s(Lny0/m0;)Ly81/f;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getDismissEvent()Lcom/whoop/navigation/DismissEventModel;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lj02/u;->a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;

    move-result-object v3

    :cond_3
    move-object/from16 v18, v3

    if-nez v7, :cond_4

    sget-object v0, Lk81/a;->LEADING:Lk81/a;

    move-object/from16 v19, v0

    goto :goto_3

    :cond_4
    move-object/from16 v19, v7

    :goto_3
    sget-object v0, Lk81/a;->LEADING:Lk81/a;

    const/4 v3, 0x1

    if-ne v7, v0, :cond_5

    move/from16 v20, v3

    goto :goto_4

    :cond_5
    move/from16 v20, v2

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getStyle()Lny0/m0;

    move-result-object v21

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :cond_6
    move/from16 v22, v3

    new-instance v8, Lny0/p0;

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v23, 0x64

    const/16 v24, 0x0

    invoke-direct/range {v8 .. v24}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public static final q(Ljava/lang/String;)Ly81/f;
    .locals 1

    const-string v0, "AI_COACH"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final r(Ljava/lang/String;)Lny0/c;
    .locals 6

    if-nez p0, :cond_0

    sget-object p0, Lny0/c;->LEADING_ICON:Lny0/c;

    return-object p0

    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "TRAILING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :sswitch_1
    const-string v1, "TRAILING_ICON"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Lny0/c;->TRAILING_ICON:Lny0/c;

    return-object p0

    :sswitch_2
    const-string v1, "LEADING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :sswitch_3
    const-string v1, "LEADING_ICON"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_0
    sget-object v0, Lny0/c;->LEADING_ICON:Lny0/c;

    invoke-static {}, Lny0/c;->values()[Lny0/c;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_4

    return-object v0

    :cond_4
    return-object v4

    :cond_5
    sget-object p0, Lny0/c;->LEADING_ICON:Lny0/c;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        0xf155632 -> :sswitch_3
        0x2dcbf6e6 -> :sswitch_2
        0x71198ebc -> :sswitch_1
        0x7ab5101c -> :sswitch_0
    .end sparse-switch
.end method

.method public static final s(Lny0/m0;)Ly81/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/d4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0

    :cond_2
    sget-object p0, Ly81/f;->COACH_BLUE:Ly81/f;

    return-object p0
.end method
