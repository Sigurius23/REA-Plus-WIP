.class public final Luv2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Luv2/d;",
        "",
        "<init>",
        "()V",
        "Ltv2/a$a;",
        "fullScreenModal",
        "Luv2/c;",
        "d",
        "(Ltv2/a$a;)Luv2/c;",
        "Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;",
        "result",
        "e",
        "(Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;)Luv2/c;",
        "Ltv2/c;",
        "domainState",
        "b",
        "(Ltv2/c;)Luv2/c;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "getReducer",
        "()Ljb1/a;",
        "reducer",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Luv2/d;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Luk2/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Luk2/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Luv2/d;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Luv2/d;->c(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ls01/d;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Luv2/d$a;

    invoke-direct {v1}, Luv2/d$a;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final d(Ltv2/a$a;)Luv2/c;
    .locals 13

    sget-object v0, Ltv2/a$b;->a:Ltv2/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Luv2/c;

    new-instance v3, Luv2/c$a;

    sget-object v4, Lsz0/p0$c;->e:Lsz0/p0$c;

    const/16 v11, 0x7e

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Luv2/c$a;-><init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Luv2/a;Lcom/whoop/design/util/TextResource;Luv2/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Luv2/c;-><init>(Luv2/c$a;Luv2/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    sget-object v0, Ltv2/a$c;->a:Ltv2/a$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, Luv2/c;

    new-instance v3, Luv2/c$a;

    new-instance v4, Lsz0/p0$b;

    sget v0, Lcu2/h;->h1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lcu2/h;->N:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget-object v7, Luv2/a$a;->a:Luv2/a$a;

    const/16 v11, 0x72

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Luv2/c$a;-><init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Luv2/a;Lcom/whoop/design/util/TextResource;Luv2/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Luv2/c;-><init>(Luv2/c$a;Luv2/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_1
    sget-object v0, Ltv2/a$d;->a:Ltv2/a$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Luv2/c;

    new-instance v3, Luv2/c$a;

    new-instance v4, Lsz0/p0$b;

    sget v0, Lcu2/h;->s1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lcu2/h;->N:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget-object v7, Luv2/a$a;->a:Luv2/a$a;

    const/16 v11, 0x72

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Luv2/c$a;-><init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Luv2/a;Lcom/whoop/design/util/TextResource;Luv2/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Luv2/c;-><init>(Luv2/c$a;Luv2/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final e(Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;)Luv2/c;
    .locals 33

    move-object/from16 v0, p0

    if-nez p1, :cond_0

    sget-object v1, Ltv2/a$d;->a:Ltv2/a$d;

    invoke-direct {v0, v1}, Luv2/d;->d(Ltv2/a$a;)Luv2/c;

    move-result-object v1

    return-object v1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;->getScreenContent()Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->getBuilderCta()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v13, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    move v13, v1

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;->getScreenContent()Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->getHeadline()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;->getScreenContent()Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->getSubtext()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;->getScreenContent()Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->getMetadata()Lcom/whoop/weightlifting/data/dto/MetaData;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v1

    move-object v7, v1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;->getScreenContent()Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->getAiChatCallout()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v3, v0, Luv2/d;->a:Ljb1/a;

    invoke-virtual {v3, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    move-object v8, v1

    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    :goto_2
    if-eqz v13, :cond_5

    :cond_4
    const/4 v9, 0x0

    goto :goto_3

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;->getScreenContent()Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->getAddTile()Lcom/whoop/weightlifting/data/dto/AddTileModel;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v15, Lc41/a0;

    sget-object v17, Lc41/b0$c;->g:Lc41/b0$c;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/AddTileModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v18

    const/16 v23, 0x79

    const/16 v24, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v15 .. v24}, Lc41/a0;-><init>(Ljava/lang/Object;Lc41/b0;Lcom/whoop/design/util/TextResource;ZILy81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v15

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;->getScreenContent()Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->getBuilderCta()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v3, v0, Luv2/d;->a:Ljb1/a;

    invoke-virtual {v3, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    move-object v10, v1

    goto :goto_4

    :cond_6
    const/4 v10, 0x0

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;->getScreenContent()Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->getDivider()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v3, v0, Luv2/d;->a:Ljb1/a;

    invoke-virtual {v3, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    move-object v11, v1

    goto :goto_5

    :cond_7
    const/4 v11, 0x0

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;->getScreenContent()Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->getTemplates()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v12, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weightlifting/data/dto/MenuItemModel;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/dto/MenuItemModel;->getTemplateName()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v15, Luv2/a$f;

    move-object/from16 p1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/MenuItemModel;->getTemplateId()J

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/MenuItemModel;->getTemplateName()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-direct {v15, v2, v3, v14}, Luv2/a$f;-><init>(JLcom/whoop/design/util/TextResource;)V

    new-instance v18, Ly71/l$b;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/MenuItemModel;->getSubtext()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_8

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    :cond_8
    move-object/from16 v19, v2

    const/16 v31, 0xffe

    const/16 v32, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v18 .. v32}, Ly71/l$b;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v15

    new-instance v15, Ly71/o;

    const/16 v31, 0x7fdc

    move-object/from16 v21, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v15 .. v32}, Ly71/o;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v12, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_9
    new-instance v3, Luv2/c$b;

    invoke-direct/range {v3 .. v13}, Luv2/c$b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lep0/j;Lm91/u;Lc41/a0;Lm91/u;Lm91/u;Ljava/util/List;Z)V

    new-instance v1, Luv2/c;

    const/4 v2, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v4, v3, v2, v4}, Luv2/c;-><init>(Luv2/c$a;Luv2/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public final b(Ltv2/c;)Luv2/c;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ltv2/c;->b()Ltv2/a;

    move-result-object v0

    instance-of v0, v0, Ltv2/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ltv2/c;->b()Ltv2/a;

    move-result-object p1

    check-cast p1, Ltv2/a$a;

    invoke-direct {p0, p1}, Luv2/d;->d(Ltv2/a$a;)Luv2/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ltv2/c;->a()Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;

    move-result-object p1

    invoke-direct {p0, p1}, Luv2/d;->e(Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;)Luv2/c;

    move-result-object p1

    return-object p1
.end method
