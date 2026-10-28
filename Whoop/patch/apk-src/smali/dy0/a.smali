.class public final Ldy0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u0007*\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J)\u0010 \u001a\u00020\u001f*\u00020\u001a2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u000e\u00a2\u0006\u0004\u0008#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010%\u001a\u0004\u0008&\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Ldy0/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lzx0/a$c;",
        "Lcy0/c;",
        "f",
        "(Lzx0/a$c;)Lcy0/c;",
        "Lzx0/a$a;",
        "Ltu1/a;",
        "e",
        "(Lzx0/a$a;)Ltu1/a;",
        "Lzx0/c;",
        "bottomSheet",
        "g",
        "(Lzx0/c;Ltu1/a;)Lcy0/c;",
        "Lcy0/c$b;",
        "d",
        "(Lzx0/c;)Lcy0/c$b;",
        "",
        "spacing",
        "Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;",
        "b",
        "(Ljava/lang/String;)Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;",
        "Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;",
        "",
        "sections",
        "",
        "index",
        "",
        "a",
        "(Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;Ljava/util/List;I)Z",
        "domainResult",
        "c",
        "(Lzx0/c;)Lcy0/c;",
        "Ljb1/a;",
        "getReducer$deep_dive_release",
        "()Ljb1/a;",
        "deep-dive_release"
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

    sput v0, Ldy0/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldy0/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Ldy0/c;->g()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ldy0/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;Ljava/util/List;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;",
            "Ljava/util/List<",
            "Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;",
            ">;I)Z"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;->getItems()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lcom/whoop/design/models/InfoCalloutTileModel;

    const/4 v0, 0x1

    add-int/2addr p3, v0

    invoke-static {p3, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;->getItems()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_2

    check-cast p2, Ljava/lang/Iterable;

    instance-of v1, p2, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v1, v1, Lcom/whoop/design/models/InfoCalloutTileModel;

    if-eqz v1, :cond_1

    move p2, v0

    goto :goto_1

    :cond_2
    :goto_0
    move p2, p3

    :goto_1
    if-nez p1, :cond_4

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    return p3

    :cond_4
    :goto_2
    return v0
.end method

.method private final b(Ljava/lang/String;)Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;
    .locals 2

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x76664f19    # -3.699977E-33f

    if-eq v0, v1, :cond_4

    const v1, 0x24a738

    if-eq v0, v1, :cond_2

    const v1, 0x6372c703

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "COMPACT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;->COMPACT:Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;

    return-object p1

    :cond_2
    const-string v0, "NONE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;->NONE:Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;

    return-object p1

    :cond_4
    const-string v0, "NORMAL"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;->NORMAL:Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;

    return-object p1

    :cond_5
    :goto_0
    sget-object p1, Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;->COMPACT:Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;

    return-object p1
.end method

.method private final d(Lzx0/c;)Lcy0/c$b;
    .locals 17

    sget-object v1, Lgz0/m0;->CARET_BACKWARD:Lgz0/m0;

    invoke-virtual/range {p1 .. p1}, Lzx0/c;->d()Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/deepdive/domain/models/DeepDiveModels;->getHeader()Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v3, Lwx0/a;->a:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v4, Lwx0/a;->b:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lzx0/c;->d()Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/whoop/deepdive/domain/models/DeepDiveModels;->getHeader()Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;->getEndIcon()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    sget-object v6, Lgz0/m0;->EDUCATION:Lgz0/m0;

    invoke-static {v5, v6}, Lgz0/n0;->c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lzx0/c;->d()Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/whoop/deepdive/domain/models/DeepDiveModels;->getHeader()Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;->getEndItem()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v6

    if-eqz v6, :cond_2

    move-object/from16 v9, p0

    iget-object v7, v9, Ldy0/a;->a:Ljb1/a;

    invoke-virtual {v7, v6}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    goto :goto_2

    :cond_2
    move-object/from16 v9, p0

    move-object v6, v2

    :goto_2
    sget-object v7, Lcy0/a$e;->a:Lcy0/a$e;

    new-instance v8, Lcy0/a$c;

    invoke-virtual/range {p1 .. p1}, Lzx0/c;->d()Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    move-result-object v10

    if-eqz v10, :cond_3

    invoke-virtual {v10}, Lcom/whoop/deepdive/domain/models/DeepDiveModels;->getHeader()Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;

    move-result-object v10

    if-eqz v10, :cond_3

    invoke-virtual {v10}, Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v10

    if-nez v10, :cond_4

    :cond_3
    new-instance v11, Lcom/whoop/navigation/e;

    const/4 v15, 0x7

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v11

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lzx0/c;->d()Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    move-result-object v11

    if-eqz v11, :cond_5

    invoke-virtual {v11}, Lcom/whoop/deepdive/domain/models/DeepDiveModels;->getHeader()Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;

    move-result-object v11

    if-eqz v11, :cond_5

    invoke-virtual {v11}, Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;->getDeepDiveScoreType()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_6

    :cond_5
    const-string v11, ""

    :cond_6
    invoke-direct {v8, v10, v11, v2}, Lcy0/a$c;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V

    move-object v2, v0

    new-instance v0, Lcy0/c$b;

    invoke-direct/range {v0 .. v8}, Lcy0/c$b;-><init>(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lm91/u;Lcy0/a;Lcy0/a;)V

    return-object v0
.end method

.method private final e(Lzx0/a$a;)Ltu1/a;
    .locals 1

    instance-of v0, p1, Lzx0/a$b;

    if-eqz v0, :cond_0

    check-cast p1, Lzx0/a$b;

    invoke-virtual {p1}, Lzx0/a$b;->a()Ltu1/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final f(Lzx0/a$c;)Lcy0/c;
    .locals 10

    instance-of v0, p1, Lzx0/a$d;

    if-eqz v0, :cond_0

    new-instance v1, Lcy0/c;

    new-instance v2, Lcy0/c$c;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcy0/c$c;-><init>(Lsz0/q0;Lcy0/a;Lcy0/a;Lcy0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lcy0/c;-><init>(Ltu1/a;Lcy0/c$c;Lcy0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lzx0/a$e;

    if-eqz v0, :cond_1

    new-instance v1, Lcy0/c;

    new-instance v2, Lcy0/c$c;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    new-instance v4, Lcy0/a$h;

    check-cast p1, Lzx0/a$e;

    invoke-virtual {p1}, Lzx0/a$e;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lzx0/a$e;->a()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcy0/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v6, Lcy0/a$e;->a:Lcy0/a$e;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lcy0/c$c;-><init>(Lsz0/q0;Lcy0/a;Lcy0/a;Lcy0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcy0/c;-><init>(Ltu1/a;Lcy0/c$c;Lcy0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lzx0/a$f;

    if-eqz v0, :cond_2

    new-instance v1, Lcy0/c;

    new-instance v2, Lcy0/c$c;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v3

    new-instance v4, Lcy0/a$h;

    check-cast p1, Lzx0/a$f;

    invoke-virtual {p1}, Lzx0/a$f;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lzx0/a$f;->a()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcy0/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v6, Lcy0/a$e;->a:Lcy0/a$e;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lcy0/c$c;-><init>(Lsz0/q0;Lcy0/a;Lcy0/a;Lcy0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcy0/c;-><init>(Ltu1/a;Lcy0/c$c;Lcy0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lzx0/c;Ltu1/a;)Lcy0/c;
    .locals 13

    invoke-virtual {p1}, Lzx0/c;->d()Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/deepdive/domain/models/DeepDiveModels;->getHeader()Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;->getDeepDiveScoreType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v2, v0

    goto :goto_2

    :cond_1
    :goto_1
    const-string v0, ""

    goto :goto_0

    :goto_2
    invoke-direct {p0, p1}, Ldy0/a;->d(Lzx0/c;)Lcy0/c$b;

    move-result-object v3

    invoke-virtual {p1}, Lzx0/c;->e()Z

    move-result v5

    invoke-virtual {p1}, Lzx0/c;->d()Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/whoop/deepdive/domain/models/DeepDiveModels;->getSections()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v6, 0x0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v6, 0x1

    if-ltz v6, :cond_5

    check-cast v7, Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;

    invoke-virtual {v7}, Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;->getSectionType()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-direct {p0, v9}, Ldy0/a;->b(Ljava/lang/String;)Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;

    move-result-object v9

    if-nez v9, :cond_3

    :cond_2
    sget-object v9, Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;->COMPACT:Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;

    :cond_3
    invoke-virtual {p1}, Lzx0/c;->d()Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/deepdive/domain/models/DeepDiveModels;->getSections()Ljava/util/List;

    move-result-object v10

    invoke-direct {p0, v7, v10, v6}, Ldy0/a;->a(Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;Ljava/util/List;I)Z

    move-result v6

    if-eqz v6, :cond_4

    sget-object v9, Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;->NONE:Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;

    :cond_4
    new-instance v10, Lcy0/c$a;

    iget-object v11, p0, Ldy0/a;->a:Ljb1/a;

    invoke-virtual {v7}, Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;->getItems()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v11, v7}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v10, v7, v9, v6}, Lcy0/c$a;-><init>(Ljava/util/List;Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;Z)V

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v6, v8

    goto :goto_3

    :cond_5
    invoke-static {}, Lwb3/f;->d0()V

    throw v1

    :cond_6
    sget-object v4, Lm83/y;->w:Lm83/y;

    :cond_7
    invoke-virtual {p1}, Lzx0/c;->d()Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/whoop/deepdive/domain/models/DeepDiveModels;->getMetadata()Lcom/whoop/deepdive/domain/models/MetaData;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/whoop/deepdive/domain/models/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-static {p1}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v1

    :cond_8
    move-object v6, v1

    new-instance v1, Lcy0/c$d;

    invoke-direct/range {v1 .. v6}, Lcy0/c$d;-><init>(Ljava/lang/String;Lcy0/c$b;Ljava/util/List;ZLep0/j;)V

    new-instance v7, Lcy0/c;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object v8, p2

    move-object v10, v1

    invoke-direct/range {v7 .. v12}, Lcy0/c;-><init>(Ltu1/a;Lcy0/c$c;Lcy0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method


# virtual methods
.method public final c(Lzx0/c;)Lcy0/c;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lzx0/c;->c()Lzx0/a;

    move-result-object v0

    instance-of v1, v0, Lzx0/a$c;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lzx0/c;->c()Lzx0/a;

    move-result-object p1

    check-cast p1, Lzx0/a$c;

    invoke-direct {p0, p1}, Ldy0/a;->f(Lzx0/a$c;)Lcy0/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lzx0/a$a;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lzx0/c;->c()Lzx0/a;

    move-result-object v0

    check-cast v0, Lzx0/a$a;

    invoke-direct {p0, v0}, Ldy0/a;->e(Lzx0/a$a;)Ltu1/a;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ldy0/a;->g(Lzx0/c;Ltu1/a;)Lcy0/c;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ldy0/a;->g(Lzx0/c;Ltu1/a;)Lcy0/c;

    move-result-object p1

    return-object p1
.end method
