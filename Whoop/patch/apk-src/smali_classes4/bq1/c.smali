.class public abstract Lbq1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lad3/c;",
        "json",
        "Lkotlin/Function0;",
        "Lmo1/d;",
        "trackedBehaviorReducer",
        "Ljb1/a;",
        "e",
        "(Lad3/c;Lc93/a;)Ljb1/a;",
        "hormonal-insights_release"
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
.method public static synthetic a(Lad3/c;Ljb1/a;Lc93/a;Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbq1/c;->i(Lad3/c;Ljb1/a;Lc93/a;Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lad3/c;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lbq1/c;->f(Lad3/c;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lad3/c;Ljb1/a;Lc93/a;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbq1/c;->h(Lad3/c;Ljb1/a;Lc93/a;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lad3/c;Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lbq1/c;->g(Lad3/c;Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lad3/c;Lc93/a;)Ljb1/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lad3/c;",
            "Lc93/a;",
            ")",
            "Ljb1/a;"
        }
    .end annotation

    const-string v0, "json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackedBehaviorReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbq1/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lbq1/a;-><init>(Lad3/c;I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    new-instance v1, Lbq1/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, p1, v2}, Lbq1/b;-><init>(Lad3/c;Ljb1/a;Lc93/a;I)V

    invoke-static {v1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lad3/c;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbq1/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lbq1/a;-><init>(Lad3/c;I)V

    invoke-virtual {p1, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lad3/c;Llb1/z0;)Ll83/a0;
    .locals 9

    const-string v0, "$this$addModelMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v2, p0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lto1/l;->y(Llb1/z0;Lad3/c;Loo1/h$a;ZLjb1/a;ZILjava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lad3/c;Ljb1/a;Lc93/a;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbq1/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p2, v1}, Lbq1/b;-><init>(Lad3/c;Ljb1/a;Lc93/a;I)V

    invoke-virtual {p3, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lad3/c;Ljb1/a;Lc93/a;Llb1/z0;)Ll83/a0;
    .locals 9

    const-string v0, "$this$addModelMapper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x1

    move-object v2, p0

    move-object v5, p1

    move-object v1, p3

    invoke-static/range {v1 .. v8}, Lto1/l;->y(Llb1/z0;Lad3/c;Loo1/h$a;ZLjb1/a;ZILjava/lang/Object;)V

    invoke-static {v1, p2}, Lmo1/c;->b(Llb1/z0;Lc93/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
