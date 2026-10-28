.class public final Lvq1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n*\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lvq1/a;",
        "",
        "<init>",
        "()V",
        "Lrq1/b$c;",
        "Luq1/c;",
        "f",
        "(Lrq1/b$c;)Luq1/c;",
        "",
        "Lm91/u;",
        "",
        "b",
        "(Ljava/util/List;)Z",
        "e",
        "()Luq1/c;",
        "Lrq1/b;",
        "domainResult",
        "c",
        "(Lrq1/b;)Luq1/c;",
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

    sput v0, Lvq1/a;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lvo1/s;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lvo1/s;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Lvq1/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvq1/a;->d(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;)Z"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm91/u;

    instance-of v2, v0, Lt71/j;

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    check-cast v0, Lt71/j;

    invoke-virtual {v0}, Lt71/j;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li21/j;

    invoke-virtual {v2}, Li21/j;->b()Li21/l;

    move-result-object v2

    instance-of v4, v2, Li21/l$a;

    if-eqz v4, :cond_4

    check-cast v2, Li21/l$a;

    goto :goto_1

    :cond_4
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Li21/l$a;->a()Lhy0/h1;

    move-result-object v2

    goto :goto_2

    :cond_5
    move-object v2, v3

    :goto_2
    if-eqz v2, :cond_3

    goto :goto_5

    :cond_6
    instance-of v2, v0, Lt71/p;

    if-eqz v2, :cond_1

    check-cast v0, Lt71/p;

    invoke-virtual {v0}, Lt71/p;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_7

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_0

    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li21/j;

    invoke-virtual {v2}, Li21/j;->b()Li21/l;

    move-result-object v2

    instance-of v4, v2, Li21/l$a;

    if-eqz v4, :cond_9

    check-cast v2, Li21/l$a;

    goto :goto_3

    :cond_9
    move-object v2, v3

    :goto_3
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Li21/l$a;->a()Lhy0/h1;

    move-result-object v2

    goto :goto_4

    :cond_a
    move-object v2, v3

    :goto_4
    if-eqz v2, :cond_8

    :goto_5
    const/4 p1, 0x1

    return p1

    :cond_b
    return v1
.end method

.method private static final d(Ljb1/b;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ld11/i;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lvq1/a$c;

    invoke-direct {v2}, Lvq1/a$c;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v1, Lt71/j;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lvq1/a$d;

    invoke-direct {v2}, Lvq1/a$d;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v1, Lt71/p;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lvq1/a$e;

    invoke-direct {v1}, Lvq1/a$e;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final e()Luq1/c;
    .locals 1

    sget-object v0, Luq1/c$a;->a:Luq1/c$a;

    return-object v0
.end method

.method private final f(Lrq1/b$c;)Luq1/c;
    .locals 33

    move-object/from16 v0, p0

    iget-object v1, v0, Lvq1/a;->a:Ljb1/a;

    invoke-virtual/range {p1 .. p1}, Lrq1/b$c;->e()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    new-instance v1, Luq1/c$c;

    new-instance v3, Lwq1/d;

    invoke-virtual/range {p1 .. p1}, Lrq1/b$c;->d()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_0

    sget-object v7, Ly71/o;->p:Ly71/o$c;

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v2, Ljj0/a;->h:I

    const/4 v5, 0x2

    invoke-direct {v8, v2, v4, v5, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lvq1/a$f;->w:Lvq1/a$f;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    new-instance v11, Lcom/whoop/design/util/TextResource$b;

    sget v2, Ljj0/a;->g:I

    invoke-direct {v11, v2, v4, v5, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lvq1/a$g;->w:Lvq1/a$g;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v12

    new-instance v13, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->k()I

    move-result v2

    invoke-direct {v13, v2, v4, v5, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lvq1/a$h;->w:Lvq1/a$h;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v14

    const v31, 0x7fff84

    const/16 v32, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

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

    invoke-static/range {v7 .. v32}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    new-instance v5, Lxq1/c;

    invoke-virtual/range {p1 .. p1}, Lrq1/b$c;->c()Lrq1/d;

    move-result-object v7

    invoke-virtual {v7}, Lrq1/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lrq1/b$c;->c()Lrq1/d;

    move-result-object v8

    invoke-virtual {v8}, Lrq1/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lrq1/b$c;->c()Lrq1/d;

    move-result-object v9

    invoke-virtual {v9}, Lrq1/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-direct {v5, v7, v8, v9}, Lxq1/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual/range {p1 .. p1}, Lrq1/b$c;->b()Ljava/lang/Long;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lrq1/b$c;->a()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-static {v8}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v4

    :cond_1
    move-object v8, v4

    invoke-direct {v0, v6}, Lvq1/a;->b(Ljava/util/List;)Z

    move-result v9

    move-object v4, v2

    invoke-direct/range {v3 .. v9}, Lwq1/d;-><init>(Lm91/u;Lxq1/c;Ljava/util/List;Ljava/lang/Long;Lep0/j;Z)V

    invoke-direct {v1, v3}, Luq1/c$c;-><init>(Lwq1/d;)V

    return-object v1
.end method


# virtual methods
.method public final c(Lrq1/b;)Luq1/c;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lrq1/b$a;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lvq1/a;->e()Luq1/c;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lrq1/b$b;->a:Lrq1/b$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Luq1/c$b;->a:Luq1/c$b;

    return-object p1

    :cond_1
    instance-of v0, p1, Lrq1/b$c;

    if-eqz v0, :cond_2

    check-cast p1, Lrq1/b$c;

    invoke-direct {p0, p1}, Lvq1/a;->f(Lrq1/b$c;)Luq1/c;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
