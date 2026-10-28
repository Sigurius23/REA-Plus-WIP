.class public final Lnq1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lnq1/b;",
        "",
        "<init>",
        "()V",
        "Lhq1/f;",
        "metadata",
        "Llq1/h$a;",
        "d",
        "(Lhq1/f;)Llq1/h$a;",
        "Lhq1/b$c;",
        "Llq1/h;",
        "f",
        "(Lhq1/b$c;)Llq1/h;",
        "Lhq1/h;",
        "Llq1/e;",
        "e",
        "(Lhq1/h;)Llq1/e;",
        "Lhq1/b;",
        "domainResult",
        "b",
        "(Lhq1/b;)Llq1/h;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "getReducer",
        "()Ljb1/a;",
        "reducer",
        "behavior-impact_release"
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

    sput v0, Lnq1/b;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lno1/g;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lno1/g;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Lnq1/b;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnq1/b;->c(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final d(Lhq1/f;)Llq1/h$a;
    .locals 1

    new-instance v0, Llq1/h$a;

    invoke-direct {v0, p1}, Llq1/h$a;-><init>(Lhq1/f;)V

    return-object v0
.end method

.method private final e(Lhq1/h;)Llq1/e;
    .locals 3

    invoke-virtual {p1}, Lhq1/h;->b()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/TileTagModel;

    invoke-static {v2}, Llb1/s2;->s(Lcom/whoop/design/models/items/TileTagModel;)Lhy0/h1;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lhq1/h;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_3

    const/4 p1, 0x0

    return-object p1

    :cond_3
    new-instance v0, Llq1/e;

    invoke-virtual {p1}, Lhq1/h;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Llq1/e;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private final f(Lhq1/b$c;)Llq1/h;
    .locals 22

    move-object/from16 v0, p0

    new-instance v2, Llq1/b;

    new-instance v3, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    new-instance v4, Lcom/whoop/design/util/TextResource$b;

    sget v1, Ljj0/a;->b:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-direct {v4, v1, v5, v6, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Ly71/g;

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7}, Lih0/d0;->C(Lx81/d;)I

    move-result v7

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Luv0/c;->E:I

    invoke-direct {v8, v9, v5, v6, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v7, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    const/16 v19, 0x7ff2

    const/16 v20, 0x0

    move-object v6, v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v21, v6

    move-object v6, v1

    move-object/from16 v1, v21

    invoke-direct/range {v3 .. v20}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lhq1/b$c;->d()Lhq1/e;

    move-result-object v4

    invoke-virtual {v4}, Lhq1/e;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Lkd1/o$c;

    invoke-virtual/range {p1 .. p1}, Lhq1/b$c;->d()Lhq1/e;

    move-result-object v6

    invoke-virtual {v6}, Lhq1/e;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lhq1/b$c;->d()Lhq1/e;

    move-result-object v6

    invoke-virtual {v6}, Lhq1/e;->c()Lhq1/h;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-direct {v0, v6}, Lnq1/b;->e(Lhq1/h;)Llq1/e;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object v6, v1

    :goto_0
    invoke-direct {v2, v3, v4, v5, v6}, Llq1/b;-><init>(Lcom/whoop/design/atomic/organism/toolbar/d$a;Lcom/whoop/design/util/TextResource;Lkd1/o;Llq1/e;)V

    invoke-virtual/range {p1 .. p1}, Lhq1/b$c;->f()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhq1/g;

    new-instance v6, Llq1/d;

    invoke-static {}, Lnq1/a;->i()Ljb1/a;

    move-result-object v7

    invoke-virtual {v5}, Lhq1/g;->a()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v5}, Lhq1/g;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v7, v5}, Llq1/d;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lhq1/b$c;->c()Lhq1/d;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v5, Llq1/a;

    invoke-virtual {v3}, Lhq1/d;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lhq1/d;->a()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lnq1/b;->a:Ljb1/a;

    invoke-virtual {v3}, Lhq1/d;->c()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v5, v6, v7, v3}, Llq1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_2

    :cond_2
    move-object v5, v1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lhq1/b$c;->e()Lhq1/f;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lhq1/b$c;->a()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-static {v6}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v1

    :cond_3
    move-object v6, v1

    new-instance v1, Llq1/c;

    move-object/from16 v21, v5

    move-object v5, v3

    move-object v3, v4

    move-object/from16 v4, v21

    invoke-direct/range {v1 .. v6}, Llq1/c;-><init>(Llq1/b;Ljava/util/List;Llq1/a;Lhq1/f;Lep0/j;)V

    new-instance v2, Llq1/h$c;

    invoke-direct {v2, v1}, Llq1/h$c;-><init>(Llq1/c;)V

    return-object v2
.end method


# virtual methods
.method public final b(Lhq1/b;)Llq1/h;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhq1/b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lhq1/b$a;

    invoke-virtual {p1}, Lhq1/b$a;->a()Lhq1/f;

    move-result-object p1

    invoke-direct {p0, p1}, Lnq1/b;->d(Lhq1/f;)Llq1/h$a;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lhq1/b$b;

    if-eqz v0, :cond_1

    sget-object p1, Llq1/h$b;->a:Llq1/h$b;

    return-object p1

    :cond_1
    instance-of v0, p1, Lhq1/b$c;

    if-eqz v0, :cond_2

    check-cast p1, Lhq1/b$c;

    invoke-direct {p0, p1}, Lnq1/b;->f(Lhq1/b$c;)Llq1/h;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
