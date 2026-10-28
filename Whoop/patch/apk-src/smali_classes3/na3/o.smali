.class public final Lna3/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/ArrayList;

.field public c:Ll83/k;


# direct methods
.method public constructor <init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lna3/o;->a:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lna3/o;->b:Ljava/util/ArrayList;

    new-instance p1, Ll83/k;

    const-string p2, "V"

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lna3/o;->c:Ll83/k;

    return-void
.end method


# virtual methods
.method public final varargs a(Ljava/lang/String;[Lna3/d;)V
    .locals 3

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    if-nez v0, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    :cond_0
    new-instance v0, Lm83/q;

    new-instance v1, Lm83/p;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    const/4 p2, 0x1

    invoke-direct {v0, v1, p2}, Lm83/q;-><init>(Ljava/lang/Object;I)V

    const/16 p2, 0xa

    invoke-static {v0, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, Lm83/g0;->W(I)I

    move-result p2

    const/16 v1, 0x10

    if-ge p2, v1, :cond_1

    move p2, v1

    :cond_1
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v0}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    move-object v0, p2

    check-cast v0, Lm83/d0;

    iget-object v2, v0, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm83/c0;

    iget v2, v0, Lm83/c0;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v0, v0, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v0, Lna3/d;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    new-instance p2, Lna3/q;

    invoke-direct {p2, v1}, Lna3/q;-><init>(Ljava/util/LinkedHashMap;)V

    :goto_1
    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lna3/o;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Ldb3/c;)V
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ldb3/c;->c()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getDesc(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/k;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lna3/o;->c:Ll83/k;

    return-void
.end method

.method public final varargs c(Ljava/lang/String;[Lna3/d;)V
    .locals 3

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm83/q;

    new-instance v1, Lm83/p;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    const/4 p2, 0x1

    invoke-direct {v0, v1, p2}, Lm83/q;-><init>(Ljava/lang/Object;I)V

    const/16 p2, 0xa

    invoke-static {v0, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, Lm83/g0;->W(I)I

    move-result p2

    const/16 v1, 0x10

    if-ge p2, v1, :cond_0

    move p2, v1

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v0}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    move-object v0, p2

    check-cast v0, Lm83/d0;

    iget-object v2, v0, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm83/c0;

    iget v2, v0, Lm83/c0;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v0, v0, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v0, Lna3/d;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p2, Lna3/q;

    invoke-direct {p2, v1}, Lna3/q;-><init>(Ljava/util/LinkedHashMap;)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lna3/o;->c:Ll83/k;

    return-void
.end method
